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
$query_search ="SELECT id FROM hasta WHERE username='".$username."'";
$query_exec=mysql_query($query_search) or die(mysql_error());
while($al=mysql_fetch_array($query_exec)){ 
$id = $al['id'];}
$rows=mysql_num_rows($query_exec);
if($rows==0){
echo "..";
}
else {
$query_searchh ="SELECT date,time,username FROM randevu WHERE doctor_id='".$id."' AND date='".$date."' ORDER BY time";
$query_execc=mysql_query($query_searchh) or die(mysql_error());
while($al=mysql_fetch_array($query_execc)){ 
echo $al['date'];
echo " ";
echo $al['time'];
echo " ";
echo $al['username'];
echo "\n";
}
}
?>