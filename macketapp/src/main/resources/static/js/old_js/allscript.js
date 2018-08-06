// JavaScript Document
var urlstr = location.href;
//alert((urlstr + '/').indexOf($(this).attr('href')));
var urlstatus = false;
$("footer a").each(function () {
	if ((urlstr + '/').indexOf($(this).attr('href')) > -1 && $(this).attr('href') != '') {
		$(this).addClass('now-col');
		$(this).find('.sty-k').hide();
		$(this).find('.sty-s').show();
		urlstatus = true;
	} else {
		$(this).removeClass('now-col');
		$(this).find('.sty-s').hide();
		$(this).find('.sty-k').show();
	}
});
if (!urlstatus) {
	$("footer a").eq(0).addClass('now-col');
}

//菜单切换  
$(".pop-up-m").click(function () {
	if ($(this).find('.pop-up').css("display") == "none") {
		$(".b-b-j").show();
		$(".pop-up").fadeOut(300);
		$(this).find('.pop-up').fadeIn(500);

	} else {
		$(this).find('.pop-up').fadeOut(300);
		$(".b-b-j").hide();
	}
});

$(".b-b-j").on('click touchmove', function () {
	$(".pop-up").fadeOut(300);
	$(".b-b-j").hide();
});

//滑动渐变
$(function () {
	var $body = $('body'),
		flag = true;
	var theUA = window.navigator.userAgent.toLowerCase();
	if ((theUA.match(/msie\s\d+/) && theUA.match(/msie\s\d+/)[0]) || (theUA.match(/trident\s?\d+/) && theUA.match(/trident\s?\d+/)[0])) {
		var ieVersion = theUA.match(/msie\s\d+/)[0].match(/\d+/)[0] || theUA.match(/trident\s?\d+/)[0];
		if (ieVersion < 9) {
			flag = false;
			alert('这是IE： ' + ieVersion);
		};
	}

	function getScrollTop() {　　
		var scrollTop = 0,
			bodyScrollTop = 0,
			documentScrollTop = 0;　　
		if (document.body) {　　　　
			bodyScrollTop = document.body.scrollTop;　　
		}　　
		if (document.documentElement) {　　　　
			documentScrollTop = document.documentElement.scrollTop;　　
		}　　
		scrollTop = (bodyScrollTop - documentScrollTop > 0) ? bodyScrollTop : documentScrollTop;　　
		return scrollTop;
	}
	//var setCoverOpacity = function () {
	//	flag ?
	//		$body.find('.search-box-cover')[0].style.opacity = (((getScrollTop() / 50) > 1) ? 1 : (getScrollTop() / 50)) :
	//		$body.find('.search-box-cover')[0].style.filter = 'Alpha(opacity=' + (((getScrollTop() / 50) > 1) ? 1 : (getScrollTop() / 50)) * 50 + ')';
	//}
	//setCoverOpacity();
	//$(window).scroll(function () {
	//	setCoverOpacity();
	//});

});
