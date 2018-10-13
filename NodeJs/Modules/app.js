var greetModule=require("./greet");
greetModule();

var moreGreets=require("./moreGreets");
//here, since I didn't add extention to moreGreets(ex: moreGreets.js)
//node will look first for a file called moreGreets.js, if it didn't find it
//it will look for a folder called moreGreets and will use a file inside it called index.js
//this way I can export and require multiple modules and use them.

moreGreets.englishModule();
moreGreets.arabicModule();