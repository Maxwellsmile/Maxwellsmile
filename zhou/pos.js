'use strict'
var inputs=[
	'ITEM000001',
        'ITEM000001',
        'ITEM000001',
        'ITEM000001',
        'ITEM000001',
        'ITEM000003-2',
        'ITEM000005',
        'ITEM000005',
        'ITEM000005'
];

window.onload=function(){
var standardList=toStandardList(inputs);
var temp =printList(standardList);
console.log(temp);
function printInventory() {
    var dateDigitToString = function (num) {
    	return num < 10 ? '0' + num : num;
   	};
    var currentDate = new Date(),
            year = dateDigitToString(currentDate.getFullYear()),
            month = dateDigitToString(currentDate.getMonth() + 1),
            date = dateDigitToString(currentDate.getDate()),
            hour = dateDigitToString(currentDate.getHours()),
            minute = dateDigitToString(currentDate.getMinutes()),
            second = dateDigitToString(currentDate.getSeconds()),
            formattedDateString = year + '年' + month + '月' + date + '日 ' + hour + ':' + minute + ':' + second;
     var temp="***<没钱赚商店>购物清单***\n"+'打印时间:' + formattedDateString + '\n' +
            '----------------------\n' ;
    return temp;
}
function toStandardList(inputs){
    var fun=loadAllItems();
    var futlist=[];
    var fut=0;
    var str=[];

    for(var i=0,length=loadPromotions().length;i<length;++i){
       if(loadPromotions()[i].type=='BUY_TWO_GET_ONE_FREE'){
	 futlist=loadPromotions()[i].barcodes;
       }
    }

    for(i=0;i<fun.length;i++){
    	fun[i].count=0;
        for(var j=0;j<inputs.length;j++){
            if(inputs[j].indexOf("-")!=-1){
	        str=inputs[j].split('-');
                if(str[0]==fun[i].barcode){
                	fun[i].count=parseInt(str[1]);
                }
            }
            else if (fun[i].barcode==inputs[j]){
            	fun[i].count++;
            }
        }
    }
    for(i=0;i<fun.length;i++){
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

