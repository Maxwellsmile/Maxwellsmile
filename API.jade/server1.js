
express = require('express');
var app = express();
var fs = require("fs");
var url = require("url");

var http = require('http');
app.set('view engine', 'jade');
app.set('views', __dirname);
// app.get('/', function(req, res) {
//    res.render('user');
// });

app.get('/listUsers', function (req, res) {
   fs.readFile( __dirname + "/" + "users.json", 'utf8', function (err, data) {
        var id = url.parse(req.url,true).query.id;
        data = JSON.parse(data);
        if(id==undefined){
          //console.log(data);
          // res.end(data);
        }
        else{
          var data = data["user" + id];
          // console.log(user);

          //res.end( JSON.stringify(user));
        }
        res.render('user',{table:data});
   });
});


//添加的新用户数据
var user = {
  "user2" : {
     "name" : "suresh",
     "password" : "password4",
     "profession" : "librarian",
     "id": 2
  }
}

app.get('/addUser', function (req, res) {
  // 读取已存在的数据
  fs.readFile( __dirname + "/" + "users.json", 'utf8', function (err, data) {
      data = JSON.parse( data );
      data["user2"] = user["user2"];
      res.render('user',{table:data});
      //console.log( data );
      res.end( JSON.stringify(data));
      fs.writeFile(__dirname + "/" + "users.json",JSON.stringify(data), function (err, data){
        if(err){
          console.log(err);
        }
        else{
          console.log ("ok");
        }

      })
  });
})


/*app.get('/:id', function (req, res) {
  // 首先我们读取已存在的用户
  fs.readFile( __dirname + "/" + "users.json", 'utf8', function (err, data) {
      data = JSON.parse( data );
      var user = data["user" + req.params.id]
      console.log( user );
      res.end( JSON.stringify(user));
  });
})*/

var id = 2;

app.get('/deleteUser', function (req, res) {

   // First read existing users.
   fs.readFile( __dirname + "/" + "users.json", 'utf8', function (err, data) {
       data = JSON.parse( data );
       delete data["user" + 2];
       res.render('user',{table:data});
       //console.log( data );
       res.end( JSON.stringify(data));
       fs.writeFile(__dirname + "/" + "users.json",JSON.stringify(data), function (err, data){
         if(err){
           console.log(err);
         }
         else{
           console.log('ok');
         }
       })
   });
})


var server = app.listen(3000, function () {

  var host = server.address().address
  var port = server.address().port

  console.log("应用实例，访问地址为http://127.0.0.1:3000/", host, port)

})
