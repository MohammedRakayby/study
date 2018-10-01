var person={
    firstname:"Moe",
    lastname:"Rakayby",
    greet:function(){
        console.log("helloooo "+this.firstname+" "+this.lastname);
    }
    //just name value pairs
};
person.greet();

console.log(person['firstname']);