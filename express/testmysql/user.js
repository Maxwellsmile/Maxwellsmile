// var TEST_DATABASE = "testuser";
// var TEST_TALE = "test";

//连接数据库
var mysql = require("mysql");
var connection = mysql.createConnection({
    host:"127.0.0.1",
    user:"root",
    password:"zhouyong",
    port:"3306",
    database:"testuser",
});
connection.connect();
var fs = require("fs");
//同步读文件
var text = fs.readFileSync("user.txt","utf8",function(err,data){
    if(err){
        return console.error(err);
    }
    console.log(data);
});
var i=0;
//将文件按行拆成数组
//数组循环遍历之foreach
text.split(/\r?\n/).forEach(function(line){
    i++;
    var userAddSql_params =line.split(/\t/);

    console.log(userAddSql_params);
   // var userAddSql = "INSERT INTO test(id,name,password,profession,)VALUES(?)";
    var userAddSql = "INSERT INTO test(id,name,password,profession)VALUES(?,?,?,?)";
    connection.query(userAddSql,userAddSql_params,function(err,result){
        if(err){
            console.log('[INSERT ERR] - ',err.message);
            return;
        }
        console.log("----INSERT----");
    });
});