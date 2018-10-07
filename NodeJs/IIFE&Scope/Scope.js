var firstname='hamada';
var lastName='3ezzo';
(function(){
    var firstname='hamada Inside scope ';
    console.log(firstname+lastName);
}());
console.log('out of scope '+firstname);
//javascript scope is using the variables inside the function,
//even if there is a variable with the same name outside this scope.