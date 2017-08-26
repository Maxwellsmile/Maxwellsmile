var express = require('express');
var router = express.Router();
var url = require('url');
var mysql = require('mysql');

var connection = mysql.createConnection({
  host: 'localhost',
  user: 'root',
  password: 'zhouyong',
  port: '3306',
  database: 'testuser'
});


router.get('/', function (req, res) {
  var user = url.parse(req.url, true).query.user;
//   console.log(user);
  var password = url.parse(req.url, true).query.password;
  var sql = 'SELECT * FROM user';
  connection.query(sql, function (err, result) {
    if (err) {
      console.log('[SELECT ERROR] - ', err.message);
      return;
    }

    for (var i = 0; i < result.length; i++) {
      if (result[i].user == user && result[i].password == password) {
        // res.setHeader('content-type', 'text/html;charset=utf8'); //设置返回页面字符集
        res.end('登陆成功');
        // console.log(result);

      }
      else {
        // res.setHeader('content-type', 'text/html;charset=utf8'); //设置返回页面字符集
        res.end('用户名或密码错误');
      }
    }
  });
});


module.exports = router;
