'use strict'
var inputs=getInput('input.txt');//把函数getInpt的结果array赋值给inputs;
var standardList=toStandardList(inputs);//函数的结果fun给standardList;
var temp =printList(standardList);//函数结果给temp;
output(temp,'list.txt');//调用output函数,把temp输出的结果写到list.txt;
function getInput(intfile){//同步读文件
    var fs=require('fs');
    var array=fs.readFileSync(intfile,'utf-8');
    array=array.split(',');//将字符串转成数组(split函数);
    return array;
}
function output(temp,outfile){//写文件
    var fs=require('fs');
    fs.writeFile(outfile,temp,function(err){
        if(err){
            console.log(err)
        }
        else{
	    console.log('ok')
        }
    });
}


function printInventory() {
    var dateDigitToString = function (num) {
    	return num < 10 ? '0' + num : num;//如果小于10就加个0,否则直接输出num;
    };
    var currentDate = new Date(),
            year = dateDigitToString(currentDate.getFullYear()),//获取年份
            month = dateDigitToString(currentDate.getMonth() + 1),//获取月份,从零开始算,所以加1;
            date = dateDigitToString(currentDate.getDate()),//获取日;
            hour = dateDigitToString(currentDate.getHours()),//获取小时;
            minute = dateDigitToString(currentDate.getMinutes()),//获取分钟;
            second = dateDigitToString(currentDate.getSeconds()),//获取秒;
            formattedDateString = year + '年' + month + '月' + date + '日 ' + hour + ':' + minute + ':' + second;
    var temp="***<没钱赚商店>购物清单***\n"+'打印时间:' + formattedDateString + '\n' +
            '----------------------\n' ;
    return temp;
}

function toStandardList(inputs){
    var fun=loadAllItems();//所有商品的清单
    var futlist=[];//优惠的清单
    var fut=0;
    var str=[];

    for(var i=0,length=loadPromotions().length;i<length;++i){//得到优惠的列表
       if(loadPromotions()[i].type=='BUY_TWO_GET_ONE_FREE'){
	 futlist=loadPromotions()[i].barcodes;
       }
    }

    for(i=0;i<fun.length;i++){//给所有商品增加count属性
    	fun[i].count=0;
        for(var j=0;j<inputs.length;j++){
            if(inputs[j].indexOf("-")!=-1){//检索带有"-"的对象,有的话分为两个,没有则返回-1;
	        str=inputs[j].split('-');
                if(str[0]==fun[i].barcode){
                	fun[i].count+=parseInt(str[1]);
                }
            }
            else if (fun[i].barcode==inputs[j]){
            	fun[i].count++;
            }
        }
    }
    for(i=0;i<fun.length;i++){//得到优惠商品的数量
    	fun[i].fut=0;
        for(j=0;j<futlist.length;j++){
            if(fun[i].barcode==futlist[j]){
            	fut=Math.floor(fun[i].count/3);
                if(fut>=1){
                	fun[i].fut=fut;
                }
            }
        }
     }
	return fun;
  }
function printList(array){
	var temp=printInventory();
        var xiaoji=0;
        var zongji=0;
	for(var i=0;i<array.length;i++){
            if(array[i].count!=0){
            temp=temp+"名称:"+array[i].name+","+"数量:"+array[i].count+array[i].unit+","+"单价:"+array[i].price.toFixed(2)+"(元),小计:"+(array[i].price*(array[i].count-array[i].fut)).toFixed(2)+"(元)"+"\n";
        	zongji+=array[i].price*array[i].count;
            }
        }  
        temp=temp+"----------------------"+"\n"+"挥泪赠送商品:"+"\n";
        for(i=0;i<array.length;i++){
            if(array[i].fut!=0){
                temp=temp+"名称:"+array[i].name+",数量:"+array[i].fut+array[i].unit+"\n";
                xiaoji+=array[i].price*array[i].fut;
            }  
        }
        zongji=zongji-xiaoji;
   	temp=temp+"----------------------"+"\n";
        temp=temp+"总计:"+zongji.toFixed(2)+"(元)"+"\n";
        temp=temp+"节省:"+xiaoji.toFixed(2)+"(元)"+"\n";
        temp=temp+"**********************";
        return temp;
    
}

function loadAllItems() {
    return [
        {
            barcode: 'ITEM000000',
            name: '可口可乐',
            unit: '瓶',
            price: 3.00
        },
        {
            barcode: 'ITEM000001',
            name: '雪碧',
            unit: '瓶',
            price: 3.00
        },
        {
            barcode: 'ITEM000002',
            name: '苹果',
            unit: '斤',
            price: 5.50
        },
        {
            barcode: 'ITEM000003',
            name: '荔枝',
            unit: '斤',
            price: 15.00
        },
        {
            barcode: 'ITEM000004',
            name: '电池',
            unit: '个',
            price: 2.00
        },
        {
            barcode: 'ITEM000005',
            name: '方便面',
            unit: '袋',
            price: 4.50
        }
    ];
}

function loadPromotions() {
    return [
        {
            type: 'BUY_TWO_GET_ONE_FREE',
            barcodes: [
                'ITEM000000',
                'ITEM000001',
                'ITEM000005'
            ]
        }
    ];
}

