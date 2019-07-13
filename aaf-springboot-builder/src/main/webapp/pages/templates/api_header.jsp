<script type="text/javascript">
function projectBuilder_navbar_sel(sel_Id){
	bootstrap_tabPillsNav_trigger( { "projectBuilder-navbar-androidprojects":{ "contents":[],"functions":function(){ } },
		"projectBuilder-navbar-jsonprojects":{ "contents":[],"functions":function(){ } } }, 'navbar',sel_Id,-1); 	
}
// bootstrap_tabPillsNav_trigger(tabPillsNavbarContentMapper,mode, sel_Id,stepAllow)
</script>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#"><b>Projects Builder</b></a>
    </div>
    <ul class="nav navbar-nav">
      <li id="projectBuilder-navbar-androidprojects"><a href="${PROJECT_URL}"><b>Android Projects</b></a></li>
      <li id="projectBuilder-navbar-jsonprojects"><a href="${PROJECT_URL}projects/json/home"><b>JSON Projects</b></a></li>
    </ul>
  </div>
</nav>