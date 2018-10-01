function Person(firstName, lastName){
    //function constructor
    this.lastName=lastName;
    this.firstName=firstName;
    this.print=function(){
        console.log("New object called: "+this.firstName+" "+this.lastName);
    }
}
//you have to use the new keyword
//to return an object into var
var john =new Person("Moe","Rak");
john.print();
//tried it without new:
//cannot read property print() of undefined

Person.prototype.inheritedFunc=function(){
    console.log("This is inherited");
}
//any created object from function constructor
//will inherit the prototype of the constructor's prototype
//ex: john's prototype will point to the Person's prototype
//thus inhereting the method inheritedFunc()
//the JS engine will search the prototype chain looking for that method
john.inheritedFunc();
hamada=new Person("hamada","halabala");
hamada.print();
hamada.inheritedFunc();

//you can look at the prototype 
console.log(john.__proto__);
console.log(hamada.__proto__);
console.log(john.__proto__ === hamada.__proto__);