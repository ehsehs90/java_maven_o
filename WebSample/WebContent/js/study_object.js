/**
 * 객체 공부
 */

var log = console.log;

/*Date*/
var now = new Date(); //현재 날짜 객체
var date = new Date(2019, 5, 29); //2019.05.29
var diff = now - date; //밀리초 단위
//log(diff);

/*String*/
var s = 'this is a test';
s.bold(); //<b>this is a test</b>
s.sub(); //<sub>this is a test</sub>
s.fontcolor("green");
//log(s);

/*DOM*/
var x = document.getElementById('main');