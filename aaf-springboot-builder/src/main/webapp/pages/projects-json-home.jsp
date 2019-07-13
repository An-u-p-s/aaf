<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css"/>
<link rel="stylesheet" href="${PROJECT_URL}styles/api/core-skeleton.css"/>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${PROJECT_URL}js/api/core-skeleton.js"></script>
<script type="text/javascript" src="${PROJECT_URL}js/api/bootstrap-advanced.js"></script>
<jsp:include page="templates/api_params.jsp" /> 
<script type="text/javascript">
$(document).ready(function(){
  projectBuilder_navbar_sel('projectBuilder-navbar-jsonprojects');
});
</script>
</head>
<body>
<jsp:include page="templates/api_header.jsp" /> 

<div class="container-fluid">

<div class="row">
<div class="col-sm-4">

<div class="form-group">
<label>Create New Project</label>
<div class="input-group">
<input type="text" class="form-control" placeholder="Enter project Name"/>
<span class="input-group-addon"><b>Create</b></b></span>
</div><!--/.input-group  -->
</div><!--/.form-group  -->

</div><!--/.col-sm-4 -->
</div><!--/.row -->

<div class="row">

<div class="col-sm-3">

<div class="list-group">
<div class="list-group-item bg-grey">
<b>List of Projects</b>
</div><!--/.list-group-item -->
<div class="list-group-item">

</div><!--/.list-group-item -->

</div><!--/.list-group -->

</div><!--/.col-sm-3 -->

<div class="col-sm-9">


<div class="form-group">
<label>Create New Json File</label>
<div class="input-group">
<input type="text" class="form-control" placeholder="Enter Json FileName"/>
<div class="input-group-btn">
<button class="btn btn-default"><b>.json</b></button>
<button class="btn btn-default bg-grey"><b>Create</b></button>
</div><!--/.input-group-btn  -->
</div><!--/.input-group  -->
</div><!--/.form-group  -->


</div><!--/.col-sm-9 -->

</div><!--/.row -->

</div><!--/.container-fluid -->





</body>
</html>