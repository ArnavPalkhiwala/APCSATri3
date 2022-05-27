<#import "/spring.ftl" as spring />

<!-- This page is illustrative and contains ideas about HTML formatting -->
<!DOCTYPE HTML>
<!-- Signals to the Layout Dialect which layout should be used to decorate this View -->
<html xmlns:layout="http://www.w3.org/1999/xhtml" xmlns:th="http://www.w3.org/1999/xhtml"
      layout:decorate="~{layout}" lang="en">

<head><div layout:fragment="metadata" th:remove="tag">
    <script>
        console.log("test");
    </script>
    <title>Contact</title>
    <script>
        console.log("test");
    </script>
    <#--  <#include "css/test.css">  -->
    <style type="text/css">
body{background-color:#C5C5C0;}
*{font-family:Tahoma, Verdana, Helvetica, sans-serif;}

body{
    background-color: red;
}

a{
    font-family: 'OCR A Std', monospace;
}

li{
    font-family: 'OCR A Std', monospace;
}

nav{
    font-family: 'OCR A Std', monospace;
    background-color: pink;
}
</style>
    <#--  <link rel="stylesheet" href="/css/style.css">  -->
    <script>
        console.log("test");
    </script>
    <nav class="navbar navbar-expand-lg navbar-light bg-light" style="background-color: pink;" th:fragment="header">
        <a class="navbar-brand" href="/index">
            <img src="/static/images/c4klogo.png" th:src="@{/images/c4klogo.png}" width="50" height="50" class="d-inline-block align-center" alt="">
            Coding4Kidz
        </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <!-- Bootstrap menus -->
        <div class="collapse navbar-collapse" id="navbarSupportedContent" style="text-align: right; color: pink;">
            <ul class="navbar-nav mr-auto">
                <!--root menu -->
                <li class="nav-item active">
                    <a class="nav-link" href="/calendar">Calendar <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="/login">Login<span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="/videos">Videos<span class="sr-only">(current)</span></a>
                </li>
                <!-- <li class="nav-item active">
                    <a class="nav-link" href="/contact">Contact <span class="sr-only">(current)</span></a>
                </li> -->
                <li class="nav-item active">
                    <a class="nav-link" href="/comment">Feedback Form <span class="sr-only">(current)</span></a>
                <li class="nav-item active">
                <li class="nav-item active">
                    <a class="nav-link" href="https://arnavpalkhiwala.github.io/APCSATri3/" target="_blank">Documentation <span class="sr-only">(current)</span></a>
                <li class="nav-item active">
                <li class="nav-item active">
                    <a class="nav-link" href="/form">Contact Form<span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="/about">About<span class="sr-only">(current)</span></a>
                </li>


                
            </ul>
 
            <script>
               
            </script>

        </div>
    </nav>
    <#--  <link rel="stylesheet" href="/css/nav.css">  -->
    <#--  <h2>test</h2>  -->

</div></head>

<!-- layout::fragment="content" is heart of ThymeLeaf layout -->
<body>

<div style="text-align:center" layout:fragment="content" th:remove="tag" >
    <!-- Start of body content specific to page -->
    <h2>Contact Form</h2>
    <h4>This form will send us an email at codingkids20@gmail.com</h4>

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

        <#--  <script src="/js/main.js"></script>  -->

    <!-- End of body content specific to page -->
</div></body>

</html>