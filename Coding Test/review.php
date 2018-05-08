<?php

//Sample JSON format
// {
// 	"id":1,
// 	"order_id":1,
// 	"product_id":1,
// 	"user_id":1,
// 	"rating":5,
// 	"review":"this is a review"
// }

//---------------
//Connect DB here
//---------------

//get RAW JSON
$content = file_get_contents("php://input");
//decode to PHP array
$decoded = json_decode($content, true);

//GET REQUEST
if ($_SERVER['REQUEST_METHOD'] === 'GET') {

	$q = "SELECT * FROM user_review";
	$result = mysqli_query($conn,$q);
	$rows = array();
	while ($data = mysqli_fetch_assoc($result)){
		$rows[] = $data;
	}

	$myJSON = json_encode($rows);
	header('Content-type: application/json');
	echo $myJSON;
}

//POST REQUEST
if ($_SERVER['REQUEST_METHOD'] === 'POST') {

	$order_id = $decoded['order_id'];
	$product_id = $decoded['product_id'];
	$user_id = $decoded['user_id'];
	$rating = $decoded['rating'];
	$review = $decoded['review'];

	$q = "INSERT INTO user_review(order_id,product_id,user_id,rating,review,created_at,updated_at) VALUES('$order_id','$product_id','$user_id','$rating','$review',NOW(),NOW())";

	if(mysqli_query($conn,$q)){

	}else{
		echo mysqli_error($conn);
	}
}

//PUT REQUEST
if ($_SERVER['REQUEST_METHOD'] === 'PUT') {

	$id = $decoded['id'];
	$rating = $decoded['rating'];
	$review = $decoded['review'];

	$q = "UPDATE user_review SET rating='$rating', review='$review', updated_at=NOW() WHERE id='$id'";

	if(mysqli_query($conn,$q)){

	}else{
		echo mysqli_error($conn);
	}
}

//DELETE REQUEST
if ($_SERVER['REQUEST_METHOD'] === 'DELETE') {

	$id = $decoded['id'];

	$q = "DELETE FROM user_review WHERE id='$id'";

	if(mysqli_query($conn,$q)){

	}else{
		echo mysqli_error($conn);
	}
}

?>