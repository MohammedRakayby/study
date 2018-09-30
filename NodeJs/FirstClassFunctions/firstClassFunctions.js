//function statment
function greet(){
    console.log("Hello");
}

greet();

//first class functions
function logGreeting(fn){
//passing functiona as a parameter and invoking it
    fn();
}
logGreeting(greet);

//function expression
var greetMe=function(){
    console.log("Function expression");
}
greetMe();

//since it's still first class function
logGreeting(greetMe);

//function expression on the fly
logGreeting(function(){
    console.log("on the fly");
})