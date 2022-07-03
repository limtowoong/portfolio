$(".main-menu > li").mouseover(function(){
    $(this).children(".sub").stop().slideDown();
//    $(".sub").stop().slideDown();
});
$(".main-menu > li").mouseleave(function(){
     $(this).children(".sub").stop().slideUp();
//    $(".sub").stop().slideUp();
});

start();
var imgs=6;
var now =0;

function start(){
$(".imgs>img").eq(0).siblings().css({"margin-left":"-2000px"});
setInterval(function(){slide();}, 2000);
}

function slide(){
    now = now == imgs?0:now+=1;
$(".imgs>img").eq(now).css({"margin-left":"0px","opacity":"1"});
$(".imgs>img").eq(now-1).css({"margin-left":"2000px","opacity":"0"});
$(".imgs>img").eq(now-2).css({"margin-left":"-2000px"});
}

function winOpen1(){
var win1 = window.open('item.html','child1','toolbar = no, location= no , status = no, menubar = no, resizable = no , scrollbars = no, width = 738, height = 738')
}
function winOpen2(){
var win2 = window.open('champion.html','child2','toolbar = no, location= no , status = no, menubar = no, resizable = no , scrollbars = no, width = 1125, height = 1000')
}
function winOpen3(){
    var win3 = window.open('synergy.html','child2','toolbar = no, location= no , status = no, menubar = no, resizable = no , scrollbars = no, width = 1280, height = 789')
}

var num = 1;
function gallery(direct) {

    num = direct;
    
    var imgTag = document.getElementById("photo");
    imgTag.setAttribute("src","images/" + num + ".png");
}