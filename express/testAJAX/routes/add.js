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

var user = {
    "user5" : {
      "id": 5,
      "name" : "suresh",
      "password" : "password5",
      "profession" : "librarian"
    }
  }

router.get('/', function(req, res) {
    var sql = "INSERT INTO test(id,name,password,profession)VALUES(?,?,?,?)";
    var info = [user.user5.id,user.user5.name,user.user5.password,user.user5.profession];
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


module.exports = router;