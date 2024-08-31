// Creating a Directory


// const fs = require ( 'fs');
// fs.mkdir('new-directory', (err) => {
// if(err) {
//     console.error(err);
// return; 
// }
// console.log('Directory created successfully.');
// });


// Listing Files in a Directory

const fs =require('fs');
fs.readdir('.', (err, files) => {
if(err) {
console.error(err);
return; 
}
console.log('Files in the current directory:'); 
files.forEach(
(file) =>
{ console.log(file); }
);
});