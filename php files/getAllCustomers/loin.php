<?php
$hostname_localhost="localhost";
$database_localhost="gama";
$username_localhost="root";
$password_localhost="";
$localhost=mysql_connect($hostname_localhost,$username_localhost,$password_localhost)
or
trigger_error(mysql_error(),E_USER_ERROR);
mysql_select_db($database_localhost,$localhost);
$username=$_POST['username'];
$password=$_POST['password'];
$query_search ="SELECT * FROM hasta WHERE username='".$username."' AND password='".$password."'";
$query_exec=mysql_query($query_search) or die(mysql_error());
$rows=mysql_num_rows($query_exec);
if($rows==1){
while($al=mysql_fetch_array($query_exec)){ 
echo $al['role'];
}
}
else {
echo "No user found";
}
?>