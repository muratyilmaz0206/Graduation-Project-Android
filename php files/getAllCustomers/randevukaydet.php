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
$date=$_POST['date'];
$time=$_POST['time'];
$query_search ="SELECT username FROM randevu WHERE username = '".$username."' AND date='".$date."' AND time='".$time."'";
$query_exec=mysql_query($query_search) or die(mysql_error());
$rows=mysql_num_rows($query_exec);
if($rows==1){
echo "DOLU";
}
else {
$query_search ="SELECT * FROM hasta WHERE username='".$username."'";
$query_exec=mysql_query($query_search) or die(mysql_error());
$rows=mysql_num_rows($query_exec);
if($rows==1){
while($al=mysql_fetch_array($query_exec)){ 
$id = $al['doctor_id'];
$sql="INSERT INTO randevu (username, doctor_id,date,time)
VALUES ('$username', '$id', '$date', '$time ')";
$result=mysql_query($sql);
echo "KAYIT ALINDI";
}
}
else {
echo "No user found";
}
}
?>