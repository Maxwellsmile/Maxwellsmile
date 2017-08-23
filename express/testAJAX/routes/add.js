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
    var sql = 'insert into test(_order,_name,_password,_profession,_id)values(?,?,?,?)';
    var info = ["4", "mohit", "password4", "teacher"];
    // connection.connect();
    connection.query(sql, info, function (err, result) {
        if (err) {
            console.log('[INSERT ERROR] - ', err.message);
            return;
        }
        else {
            console.log('ok');;
        }
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