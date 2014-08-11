<?php

$con = mysql_connect("localhost","root","");


mysql_select_db("gama",$con);

$result = mysql_query("SELECT * FROM hasta");

while($row = mysql_fetch_assoc($result)){
$output[]=$row;
}

printf(json_encode($output));

mysql_close($con);

?>