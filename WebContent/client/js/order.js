var receiverAddressObj;
var receiverNameObj;


window.onload = function() {	// 页面加载之后, 获取页面中的对象
	receiverAddressObj = document.getElementById("receiverAddress");
	receiverNameObj = document.getElementById("receiverName");

};

function checkOnSubmit() {			// 验证整个表单
	var receiverAddress = checkReceiverAddress();
	var receiverName = checkReceiverName();
	var receiverPhone = checkReceiverPhone();
	if(receiverAddress && receiverName && receiverPhone){
		document.getElementById("orderForm").submit();
	}else{
	   return "";
	}
}

function checkReceiverAddress() {			// 验证收获地址
	var value =receiverAddressObj.value;
	var msg = "";
	if (!value)
		msg = "收获地址必须填写";	
	receiverAddressMsg.innerHTML = msg;
	receiverAddressObj.parentNode.parentNode.style.color = msg == "" ? "black" : "red";
	return msg == "";
}

function checkReceiverName() {		// 验证收货人
	var value =receiverNameObj.value;
	var msg = "";
	if (!value)
		msg = "收获人必须填写";	
	receiverNameMsg.innerHTML = msg;
	receiverNameObj.parentNode.parentNode.style.color = msg == "" ? "black" : "red";
	return msg == "";
}


