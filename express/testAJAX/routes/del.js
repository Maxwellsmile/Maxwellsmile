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
    var del = 'delete from test where _id=' + id.toString();
    connection.query(del, function (err, result) {
        if (err) {
            console.log('err');
        }
        console.log("delete ok");
    });
    // connection.end();

})