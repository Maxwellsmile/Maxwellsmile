var express = require('express');
var router = express.Router();
var crypto = require('crypto');
var mysql = require('mysql');

var connection = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: 'zhouyong',
    port: '3306',
    database: 'testuser'
});

// exports.doLogin = function (req, res) {
//     console.log(req.body.phone);
//     console.log(req.body.pwd);
//     db.connect("select * from user where password=?", [req.body.user, req.body.password], function (err, data) {
//         console.log(data.length);
//         if (data.length > 0) {

//             res.cookie("user", { "user": req.body.user, "password": req.body.password }, { maxAge: 1000 * 60 * 60 });
//             req.session.user = req.body.user;
//             res.render("perCenter", { user: req.session.user });
//         }
//     })
// };

//加密
function hashPW(user, password) {
    var hash = crypto.createHash('md5');
    hash.update(user + password);
    return hash.digest('hex');
}

function authenticate(req,user,hash) {
    var user=req.body.user;
    var pwd=req.body.password;
    // console.log(user);
    var sql = 'SELECT * FROM user';
    var rrr;
    connection.query(sql, function (err, result) {
        if (err) {
            console.log('[SELECT ERROR] - ', err.message);
            return;
        }
        // console.log(result[0].user);
        for (var i = 0; i < result.length; i++) {
            if (result[i].user == user && result[i].password == pwd) {
                // res.setHeader('content-type', 'text/html;charset=utf8'); //设置返回页面字符集
                rrr=0;
                console.log(rrr);
                break;
            }
            else {
                // res.setHeader('content-type', 'text/html;charset=utf8'); //设置返回页面字符集
                rrr=1;
                
            }
        }
        return rrr;
        // res.end();
    });
    
    return rrr;
};
// function authenticate(user, hash) {
//     //用户名和密码是否存在。
//     for (var i = 0; i < user.length; ++i) {
//         var user = user[i];
//         if (user === user.user) {
//             if (hash === user.hash) {
//                 return 0;
//             } else {
//                 return 1;
//             }
//         }
//     }

//     return 2;
// }
//判断是否登陆过
function isLogined(req) {
    if (req.cookies["account"] != null) {
        var account = req.cookies["account"];
        var user = account.account;
        var hash = account.hash;
        if (authenticate(user, hash) == 0) {
            console.log(req.cookies.account.account + " had logined.");
            return true;
        }
    }
    return false;
};
//选择登陆方式:登陆过  -----Cookie未记录
router.requireAuthentication = function (req, res, next) {
    //用户选择login
    if (req.path == "/login") {//????
        next();
        return;
    }

    //其他操作，登录过
    if (req.cookies["account"] != null) {
        var account = req.cookies["account"];
        var user = account.account;
        var hash = account.hash;
        if (authenticate(user, hash) == 0) {
            console.log(req.cookies.account.account + " had logined.");
            next();
            return;
        }
    }

    //其他操作，没有登录过，重定向到login
    console.log("not login, redirect to /login");
    res.redirect('/login?' + Date.now());
};

router.post('/login', function (req, res, next) {
    var user = req.body.user;
    var password=req.body.password;
    // console.log(req.body)
    // 将输入框加密
    var hash = hashPW(user,password);
    console.log("user - " + user + " password - " + password);
    // var value=authenticate(req, user, hash)
    // console.log(value);
    switch (authenticate(req, user, hash)) {
        case 0: //success
            
            // console.log("login ok, last - " + lastTime);
            // res.cookie("account", { account: user,  last: lastTime }, { maxAge: 60000 });
            res.redirect('/profile?' + Date.now());
            // console.log("after redirect");
            break;
        case 1: //password error
            console.log("password error");
            res.render('login', { msg: "密码错误/用户名不存在" });
            break;
    //     case 2: //user not found
    //         console.log("user not found");
    //         res.render('login', { msg: "用户名不存在" });
    //         break;
     }
});

router.get('/login', function (req, res, next) {
    console.log("cookies:");
    console.log(req.cookies);
    if (isLogined(req)) {
        res.redirect('/profile?' + Date.now());
    } else {
        res.render('login');
    }
});

router.get('/logout', function (req, res, next) {
    res.clearCookie("account");
    res.redirect('/login?' + Date.now());
});

router.get('/profile', function (req, res, next) {
    res.render('profile', {
        msg: "您登录为：" + req.cookies["account"].account,
        title: "登录成功",
        lastTime: "上次登录：" + req.cookies["account"].last
    });
});

module.exports = router;