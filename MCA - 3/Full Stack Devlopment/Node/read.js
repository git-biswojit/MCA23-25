// var fs = require("fs");
   
// Using fs.exists() method
// fs.exists('input.txt', (exists) => {
//     console.log(exists ? 'Found' : 'Not found!');
// });

// ************ Asynchronous File Read ************ 
// fs.readFile('input.txt', function (err, data) {
//     if(err){
//         return console.error("some error in the file",err);
//     }else{
//         console.log("Asynchronous read: "+ data.toString());
//     }
// });
// console.log("end of the program::::");


//************ Synchronous File Read ************ 

var fs = require('fs');
// var data = fs.readFileSync("input.txt");
// console.log("Synchronous read : ", data.toString());
// console.log("end of the program::::");


//************ File Open ************ 

// console.log("opening file !....");
// fs.open("input.txt", 'r+', function(err, filedata) {
//     if(err) return console.error(err);
//     else console.log("File open successfully::::",filedata);
// })


//************ Buffer file data ************ 

// var buf = new Buffer.alloc(1024);
// console.log("opening an existing file");
// fs.open('input.txt', 'r+', function (err, fd) {
//     if (err) {
//         return console.error(err);
//     }
//     console.log("File opened successfully!");
//     console.log("reading the file");
//     fs.read(fd, buf, 0, buf.length, 0, function (err, bytes) {
//         if (err) {
//             console.log(err);
//         }
//         console.log(bytes + " bytes read");
//         // Print only read bytes to avoid junk.
//         if (bytes > 0) {
//             console.log(buf.slice(0, bytes).toString());
//         }
//     });
// });

//-----------------------------------------------------

// var http = require('http');
// var fs = require('fs');
// http.createServer(function (req, res) {
//   fs.readFile('demo.html', function(err, data) {
//     res.writeHead(200, {'Content-Type': 'text/html'});
//     res.write(data);
//     return res.end();
//   });
// }).listen(8080);

//----------------------------------------------------------

// var fs = require('fs');

// fs.appendFile('input.txt', 'Hello content!', function (err) {
//   if (err) throw err;
//   console.log('Saved!');
// });

//------------------------------------------------------

// var fs = require('fs');

// fs.appendFile('input.txt', ' This is my text.', function (err,data) {
//   if (err) throw err;
//   console.log('Updated!.........');
// });

//-------------------------------------------------

// fs.writeFile('myrenamedfile.txt', 'This is my text', function (err ,data) {
//   if (err) throw err;
//   console.log('Replaced!......',data);
// });

//-------------------------------------------------

// var fs = require('fs');

// fs.rename('input.txt', 'file2.txt', function (err) {
//   if (err) throw err;
//   console.log('File Renamed!');
// });

//----------------------------------------------------

var fs = require('fs');
fs.unlink('myrenamedfile.txt', function (err) {
  if (err) throw err;
  console.log('File deleted!');
});