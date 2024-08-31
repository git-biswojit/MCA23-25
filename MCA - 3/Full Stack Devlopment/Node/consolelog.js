console.info("Information of the code ::::::")
var counter = 124;
console.log("log of the code ::::::", counter)
console.time("Getting data time :::::");
var x = 10;
var y = 20;
 function add(a, b){
   let addValue = a + b 
   console.log("function call :::::::", addValue);
 }
 add(x, y);
 console.timeEnd("Getting data time :::::");