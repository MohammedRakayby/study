//IIFE stands for Immediatly Invoked Function Expression
(function(){
    console.log("IIFE");
}());
//this is one way of telling compiler that this is a functional expression
//not just a function, by wrapping the function in ().
//then calling the () inside it to invoke the expression.

//it can be used as any function, for example:
(function(name){
    console.log(name);
}('hamada'));