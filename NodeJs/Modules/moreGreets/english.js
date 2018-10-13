var greetingStrings=require("./greetingStrings/englishGreetings.json");
//here, js can convert .json files to objects, debug and see

var greet=function(){
    console.log(greetingStrings.hi);
};

module.exports=greet;