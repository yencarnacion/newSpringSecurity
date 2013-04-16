<!doctype html>
<html>
<head>
    <meta name="layout" content="main">
    <sec:ifNotGranted roles="ROLE_USER">
        <sec:ifAllGranted roles="ROLE_ADMIN">
            <title><g:message code="com.myApp.adminWelcome" default="Admin Welcome"/></title>
        </sec:ifAllGranted>
    </sec:ifNotGranted>
    <sec:ifAllGranted roles="ROLE_USER">
        <title><g:message code="com.myApp.userWelcome" default="User Welcome"/></title>
    </sec:ifAllGranted>
</head>
<body>
<ul>
<sec:ifNotGranted roles="ROLE_USER">
    <sec:ifAllGranted roles="ROLE_ADMIN">
Bienvenido Admin!
    </sec:ifAllGranted>
</sec:ifNotGranted>
<sec:ifNotGranted roles="ROLE_ADMIN">
    <sec:ifAllGranted roles="ROLE_USER">
Bienvenido User!
    </sec:ifAllGranted>
</sec:ifNotGranted>
</ul>
</body>
</html>