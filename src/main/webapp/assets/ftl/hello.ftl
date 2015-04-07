<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
        "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>hello</title>
</head>
<body>
My name is ${name}
And my English name is ${englishName} ...
<input type="button" value="返回" onclick="ret()">
<script type="text/javascript">
    var ret = function() {
        location.href="/mvc/pages/index";
        
    }
    
</script>
</body>
</html>