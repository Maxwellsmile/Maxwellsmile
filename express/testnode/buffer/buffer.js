'use strict'

var buf = new Buffer(256);
var len = buf.write('www.runoob.com');

console.log('写入的字节数:'+len);
