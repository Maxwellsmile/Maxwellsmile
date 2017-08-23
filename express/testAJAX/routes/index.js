var express = require('express');
var router = express.Router();
var mysql=require('mysql');
/* GET home page. */

var connection = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: 'zhouyong',
    port: '3306',
    database: 'testuser'
  });

router.get('/', function(req, res) {
  var sql = 'select * from test';
      connection.query(sql, function (err, result) {
          if (err) {
              console.log(err);
              return;
          }
          result=JSON.stringify(data_to_JSON(result));
          
          res.setHeader('content-type', 'text/html;charset=utf8'); //设置返回页面字符集
          res.end(result);
      });
});
function data_to_JSON(data) {
  var array = {};
  for (var i = 0; i < data.length; i++) {
      var key = "user"+(i+1);
      array[key] = {
          'id': data[i].id,
          'name': data[i].name,
          'password': data[i].password,
          'profession': data[i].profession
      };
  }
  return array;
}

module.exports = router;
