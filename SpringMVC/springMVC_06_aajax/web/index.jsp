<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.js">
    </script>
    <script>
      function a() {
        $.post({
            url:"${pageContext.request.contextPath}/a1",
            data:{"name":$("#username").val()},
            success:function (data){
              alert(data);
            },error:function () {
            
          }
        })
      }
    </script>
  </head>
  <body>

  <input type="text" id="username" onblur="a()">

  </body>
</html>
