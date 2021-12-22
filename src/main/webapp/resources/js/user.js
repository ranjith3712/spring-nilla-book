
$(function() {
	alert("admin");
	getBookDetails()

});

function getBookDetails() {

	$.ajax({
		url: "/user/getbookdetails",
		type: "GET",
		success: function(res) {
			console.log(res);
		},
		error: function(xhr, status, error)  {
			alert("error");
		},
	});
}