<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.vidvaan.bus.model.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Bus Travels</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
.btn {
	min-width: 180px;
}
</style>
<script>
$(function(){
    var dtToday = new Date();
    
    var month = dtToday.getMonth() + 1;
    var day = dtToday.getDate();
    var year = dtToday.getFullYear();
    if(month < 10)
        month = '0' + month.toString();
    if(day < 10)
        day = '0' + day.toString();
    
    var minDate= year + '-' + month + '-' + day;
    
    $('#todate').attr('min', minDate);
    $('#fromdate').attr('min', minDate);
    
});
/*  function showhide()
{
	var cb = document.getElementById("todate");
	var hi = document.getElementByClassName("hidden");
	for(var i=0;i!=hiddeninputs.length;i++)
		{
		if(ch.checked)
		{
			hi[i].style.display="inline";
		}
		else
			{
			hi[i].style.display="none";
			}
		}
	} */
</script> 
</head>
<body>
<h3>Update Employee</h3>
	<hr>
	<%Bus bus = (Bus)request.getAttribute("bus"); %>
	<div class="container">
	<h2>Add Bus Details</h2>
	<form class="form-horizontal" action="./BusUpdateController" method ="post">
	<div class="form-group">
		<label class="control-label col-sm-2" for="bid">Bus Id :</label>
		<div class="col-sm-4">
			<input type="text" class="form-control" id="bid" name="bid"
			value="<%=bus.getBid()%>" readonly="readonly"/>
		</div>
	</div>
		
	<div class="form-group">
		<label class="control-label col-sm-2" for="bname">Bus Name :</label>
		<div class="col-sm-4">
			<input type="text" class="form-control" id="bname"  name="bname"
			value="<%=bus.getBname()%>"/>
		</div>
	</div>
			
	<div class="form-group">
    <label class="control-label col-sm-2" for="btype">Bus Type :</label>
    <div class="col-sm-4">
    <select class="form-control form-control-lg"  name = "btype" id="btype" value="<%=bus.getBtype()%>"/>
      <option>	-- select -- </option>
      <option>AC</option>
      <option>Non/AC</option>
      <option>Luxury</option>
      <option>Deluxe</option>
    </select>
  	</div>
  	</div>
  
	<div class="form-group">
    <label class="control-label col-sm-2" for="btype">Bus Route :</label>
    <div class="col-sm-4">
    	<select class="form-control form-control-lg" id ="broute" name = "broute" value="<%=bus.getRoute()%>"/>
	      <option>	-- select -- </option>
	      <option>Hyderabad - chennai</option>
	      <option>Hyderabad - vijayavada</option>
	      <option>Hyderabad - Tirupathi</option>
	      <option>Hyderabad - Bangolor</option>
    	</select>
  	</div>
  	</div>
			
		<div class="form-group">
			<label class="control-label col-sm-2" for="todate">TO Date :</label>
			<div class="col-sm-4">
				<input type="date" class="form-control" id="todate" name="todate" value="<%=bus.getTodate()%>" onchange="showhide()"/>
			</div>
		</div>
			
		<div class="form-group">
			<label class="control-label col-sm-2" for="fromdate">FROM Date :</label>
			<div class="col-sm-4">
				<input type="date" class="form-control" id="fromdate" name="fromdate" value="<%=bus.getFromdate()%>" onchange="showhide()" />
			</div>
		</div>
			
		<div class="form-group">
			<label class="control-label col-sm-2" for="bcapacity">Bus Capacity :</label>
			<div class="col-sm-4">
				<input type="number" class="form-control" id="bcapacity"  name="bcapacity" value="<%=bus.getBcapacity()%>"/>
			</div>
		</div>
			
		<br>
		<div class="form-group">
		<div class="col-sm-offset-2 col-sm-8">
			<button type="submit" class="btn btn-success">Submit</button>
			<button type="Reset" class="btn btn-success">Reset</button>
		</div>
		</div>
		</form>
	</div>

</body>
</html>