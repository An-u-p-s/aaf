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
<style>
.srcpckge-header { padding:10px;background-color:#eee; }
</style>
<script type="text/javascript">
$(document).ready(function(){
 projectBuilder_navbar_sel('projectBuilder-navbar-androidprojects');
});
function form_androidClassBuilder(){
 var projectPackageName = document.getElementById("androidClassBuilder_form_projectPackageName").value; 
 var projectDrivePath = document.getElementById("androidClassBuilder_form_projectDrivePath").value; 
 js_ajax('POST',PROJECT_URL+'service/androidClassesBuilder',
 {projectPackageName:projectPackageName,projectDrivePath:projectDrivePath}, function(response){
   console.log(response);
   if(response.startsWith("W")){ 


   } else if(response.startsWith("W")){ 

   } else { /* "Invalid Status Response"; */ }
 });
}
</script>
</head>
<body>
<jsp:include page="templates/api_header.jsp" />  
  
<div class="container-fluid">
  <div class="row">
    <div class="col-sm-4">
      <!--  form-group -->
      <div class="form-group">
        <h5><b>Android Basic Classes Builder</b></h5><hr/>
      </div>
    
      <div class="form-group">
        <label>Project Drive Path</label>
        <input type="text" id="androidClassBuilder_form_projectDrivePath" class="form-control" placeholder="C:/Workspace/ProjectName"/>
      </div>
      
      <div class="form-group">
        <label>Project Package Name</label>
        <input type="text" id="androidClassBuilder_form_projectPackageName" class="form-control" placeholder="com.example"/>
      </div>
      
      <div class="form-group">
       <button class="btn btn-primary form-control" onclick="javascript:form_androidClassBuilder();"><b>Generate code</b></button>
      </div>
      
      <!--  form-group -->
    </div>
    <div class="col-sm-8">
     
      <!--  -->
      <div class="list-group">
        <div class="list-group-item"><b>Source Folder</b></div>
        <div class="list-group-item">
          <!--  -->
          <div class="mtop15p">
      		<div class="srcpckge-header"><b>com.example.app:</b> consists of Activities</div>
      		<div class="pad10p">
	      		<div><b>AndroidInitializerScreen.java:</b> This is the Activity Class that opens when the Application gets started.</div>
	      		<div><b>AndroidWebScreen.java:</b> This is the Activity Class that loads your HTML Pages in the Webview.</div>
      		</div>
      	  </div>
      	  <!--  -->
      	  <div class="mtop15p">
      		<div class="srcpckge-header"><b>com.example.ads:</b> It contains AdMob code to display Ads</div>
      		<div class="pad10p">
      		  <div><b>AdmobInterstitial.java:</b> This provides an Interstitial Ads that triggers for every 5 minutes</div>
      		</div>
      	  </div>
      	  <!--  -->
      	  <div class="mtop15p">
      		<div class="srcpckge-header"><b>com.example.media:</b> It contains media related Activities</div>
      		<div class="pad10p">
      		  <div><b>AdmobInterstitial.java:</b> This provides an Interstitial Ads that triggers for every 5 minutes</div>
      		</div>
      	  </div>
          <!--  -->
          <div class="mtop15p">
      		<div class="srcpckge-header"><b>com.example.util:</b> It contains utility related classes</div>
      		<div class="pad10p">
      		  <div><b>AndroidLogger.java:</b> It contains log4j Initilaization code</div>
      		  <div><b>ContactsAPI.java:</b> It contains the code related Contacts</div>
      		  <div><b>GPSTrackerAPI.java:</b> It contains the code related to Mobile GPS</div>
      		  <div><b>RestDataAPI.java:</b> It contains the code related to reading HTTP URL Data (GET/POST)</div>
      		  <div><b>UserInterfaceAPI.java:</b> It contains the code related to User Interface</div>
      		</div>
      	  </div>
        </div>
      </div>
      
      <!--  -->
    </div>
    
  </div>
</div>

</body>
</html>