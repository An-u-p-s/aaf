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

</body>
</html>