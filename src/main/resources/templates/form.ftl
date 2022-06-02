<#import "/spring.ftl" as spring />

<!-- This page is illustrative and contains ideas about HTML formatting -->
<!DOCTYPE HTML>
<!-- Signals to the Layout Dialect which layout should be used to decorate this View -->
<html>

<head>
    <script>
        console.log("test");
    </script>
    <title>Contact</title>
    <script>
        console.log("test");
    </script>
    <#--  <#include "css/test.css">  -->
    <style type="text/css">
    @import url(//db.onlinewebfonts.com/c/6a9c6944fe8451dd397fe9d0763a4c88?family=OCR+A+Std);

body{
    background-color:#C5C5C0;
    font-family: 'OCR A Std';
}


body{
    background-color: #2a2a2a;
    color: white;
}

h1 {
    color: white;
}
h2 {
    color: white;
}
h3 {
    color: white;
}
h4 {
    color: white;
}
h5 {
    color: white;
}
a{
    font-family: 'OCR A Std', monospace;
}

li{
    font-family: 'OCR A Std', monospace;
}

nav{
    font-family: 'OCR A Std', monospace;
    background-color: orange;
}

a{
    font-family: 'OCR A Std', monospace;
}

li{
    font-family: 'OCR A Std', monospace;
}



</style>
    <#--  <link rel="stylesheet" href="/css/style.css">  -->
    <script>
        console.log("test");
    </script>
<#--&lt;#&ndash;    <nav class="navbar navbar-expand-lg navbar-light bg-light" style="background-color: orange;" th:fragment="header">&ndash;&gt;-->
<#--        <a class="navbar-brand" href="/index">-->
<#--            <img src="src/main/resources/static/images/c4klogo.png" th:src="@{src/main/resources/static/images/c4klogo.png}" width="50" height="50" class="d-inline-block align-center" alt="">-->
<#--            Coding4Kidz-->
<#--        </a>-->
<#--        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">-->
<#--            <span class="navbar-toggler-icon"></span>-->
<#--        </button>-->
<#--        <!-- Bootstrap menus &ndash;&gt;-->
<#--        <div class="collapse navbar-collapse" id="navbarSupportedContent" style="text-align: right; color: orange;">-->
<#--            <ul >-->
<#--                <!--root menu &ndash;&gt;-->
<#--                <li class="nav-item active">-->
<#--                    <a class="nav-link" href="/calendar">Calendar <span class="sr-only">(current)</span></a>-->
<#--                </li>-->
<#--                <li class="nav-item active">-->
<#--                    <a class="nav-link" href="/login">Login<span class="sr-only">(current)</span></a>-->
<#--                </li>-->
<#--                <li class="nav-item active">-->
<#--                    <a class="nav-link" href="/videos">Videos<span class="sr-only">(current)</span></a>-->
<#--                </li>-->
<#--                <!-- <li class="nav-item active">-->
<#--                    <a class="nav-link" href="/contact">Contact <span class="sr-only">(current)</span></a>-->
<#--                </li> &ndash;&gt;-->
<#--                <li class="nav-item active">-->
<#--                    <a class="nav-link" href="/comment">Feedback Form <span class="sr-only">(current)</span></a>-->
<#--                <li class="nav-item active">-->
<#--                <li class="nav-item active">-->
<#--                    <a class="nav-link" href="https://arnavpalkhiwala.github.io/APCSATri3/" target="_blank">Documentation <span class="sr-only">(current)</span></a>-->
<#--                <li class="nav-item active">-->
<#--                <li class="nav-item active">-->
<#--                    <a class="nav-link" href="/form">Contact Form<span class="sr-only">(current)</span></a>-->
<#--                </li>-->
<#--                <li class="nav-item active">-->
<#--                    <a class="nav-link" href="/about">About<span class="sr-only">(current)</span></a>-->
<#--                </li>-->


<#--                -->
<#--            </ul>-->
<#-- -->
<#--            <script>-->
<#--               -->
<#--            </script>-->

<#--        </div>-->
<#--    </nav>-->
    <#--  <link rel="stylesheet" href="/css/nav.css">  -->
    <#--  <h2>test</h2>  -->

</head>

<!-- layout::fragment="content" is heart of ThymeLeaf layout -->
<body>

<div style="text-align:center" layout:fragment="content" th:remove="tag" >
    <!-- Start of body content specific to page -->
    <h2>Contact Form</h2>
    <h4>This form will send us an email at codingkids20@gmail.com.</h4>
    <br>

        <@spring.bind "user"/>
        <#if user?? && noErrors??>
            Your data has been sent<br>
            Name: ${user.name}<br>
            Email: ${user.email}<br>
            Message: ${user.message}<br>
        <#else>
            <form action="/form" method="post">
                Name:<br>
                <@spring.formInput "user.name"/>
                <@spring.showErrors "<br>"/>
                <br><br>
                Email:<br>
                <@spring.formInput "user.email"/>
                <@spring.showErrors "<br>"/>
                <br><br>
                Message:<br>
                <@spring.formTextarea "user.message"/>
                <@spring.showErrors "<br>"/>
                <br><br>
                <input type="submit" value="Submit">
            </form>
        </#if>

        <br>

        <a style="color: white;" href="index">Return Home!</a>
        <#--  <script src="/js/main.js"></script>  -->

    <!-- End of body content specific to page -->
</div></body>

</html>