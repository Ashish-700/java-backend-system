<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<html>
   <head>
      <title>Detecting Locale</title>
   </head>
   <link rel="stylesheet" href="languagedetector.css">

   <body >
      <center><h1>Detecting Locale</h1></center>
      
      <div class="locale-box" style="display:flex;flex-direction:column;align-items:center;border:2px solid white;margin:100px;padding:100px;">
         <p>Language Code : ${languageCode}</p>
    <p>Language Name : ${languageName}</p>
    <p>Country Code  : ${countryCode}</p>
    <p>Country Name  : ${countryName}</p>
      </div>
   </body>
</html>
