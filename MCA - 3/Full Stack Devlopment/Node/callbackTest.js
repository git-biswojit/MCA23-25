// function fetchData(callback) {
//     setTimeout(() => {
//         const data = "This is the fetched data!";
//         callback(data);
//     }, 2000);
// }
// function processData(data) {
//     console.log("Processing data:", data);
// }
// fetchData(processData);



//---------------------------------------------------

function asyncOperation1(callback1) {
    setTimeout(() => {
        console.log("Async operation 1 completed");
        callback1();
    }, 1000);
}
function asyncOperation2(callback2) {
    setTimeout(() => {
        console.log("Async operation 2 completed");
        callback2();
    }, 1500);
}
function asyncOperation3(
) {
    setTimeout(() => {console.log("Async operation 3 completed");},500);
} 

asyncOperation1(
    function() {
        asyncOperation2(
            function() {
                asyncOperation3();
            });
    });