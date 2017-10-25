<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=cp1251" language="java" %>
<%@ page session="false" %>
<html>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js" charset="utf-8"></script>
<!------------------------------------------------------------------>
<script>
    $(document).ready(function(){
        $("#form").validate();
    });

        $("#addAction").validate({

            rules:{

                typePet:{
                    required: true,
                    minlength: 2,
                    maxlength: 16,
                },

                namePet:{
                    required: true,
                    minlength: 2,
                    maxlength: 16,
                },
                ownerPet:{
                    required: true,
                    minlength: 1,
                    maxlength: 7,
                },
                genderPet:{
                    required: true,
                    minlength: 1,
                    maxlength: 3,
                },
            },

            messages:{

                typePet:{
                    required: "Это поле обязательно для заполнения",
                    minlength: "Тип живности должен состоять минимум зи 2-х символов",
                    maxlength: "Максимальное число символо - 16",
                },

                namePet:{
                    required: "Это поле обязательно для заполнения",
                    minlength: "Имя живности должно быть минимум 2 символа",
                    maxlength: "Имя должно быть максимум 16 символов",
                },

                genderPet:{
                    required: "Это поле обязательно для заполнения",
                    minlength: "Пол живности не должен превышать 2-х символов",
                    maxlength: "Не, ну вы че издеваетесь?",
                },
            }
        });

</script>
<!------------------------------------------------------------------>
<head>
    <title>Списочек животных</title>

    <style type="text/css">
        body {
            background: url(leo.jpg);
            background-size: cover;
        }
        h1 {
            margin-top: 1%;
            text-shadow: gray 1px 1px 0, gray -1px -1px 0,
            gray -1px 1px 0, gray 1px -1px 0;
        }
        h2 {
            margin-top: 1%;
            text-shadow: aqua 1px 1px 0, aqua -1px -1px 0,
            aqua -1px 1px 0, aqua 1px -1px 0;
        }
        div {
            margin-top: 5%;
            text-align: center;
            font-size: 200%;
        }
        .tg {
            align: center;
            border-collapse: collapse;
            border-spacing: 0;
            border-color: #ccc;
        }

        .tg td {
            align: center;
            font-family: Arial, sans-serif;
            font-size: 14px;
            padding: 10px 5px;
            border-style: solid;
            border-width: 1px;
            overflow: hidden;
            word-break: normal;
            border-color: #ccc;
            color: #333;
            background-color: #fff;
        }

        .tg th {
            align: center;
            font-family: Arial, sans-serif;
            font-size: 14px;
            font-weight: normal;
            padding: 10px 5px;
            border-style: solid;
            border-width: 1px;
            overflow: hidden;
            word-break: normal;
            border-color: #ccc;
            color: #333;
            background-color: #f0f0f0;
        }

        .tg .tg-4eph {
            align: center;
            background-color: #f9f9f9
        }
        table{
            align: center;
        }
    </style>

</head>
<body>

<a style="text-align: center; color: gray"  href="../../index.jsp">Вернуться на главную</a>

<br/>
<br/>

<h1>Список животных зоопарка</h1>

<c:if test="${!empty listPets}">
    <table class="tg">
        <tr>
            <th width="50">ID</th>
            <th width="80">Тип животного</th>
            <th width="80">Имя</th>
            <th width="100">Владелец</th>
            <th width="50">Пол</th>
            <th width="100">Примечание</th>
            <th width="60">Редакт.</th>
            <th width="60">Удалить</th>
        </tr>
        <c:forEach items="${listPets}" var="pet">
            <tr>
                <td>${pet.id}</td>
                <td><a href="/petdata/${pet.id}" target="_blank">${pet.typePet}</a></td>
                <td>${pet.namePet}</td>
                <td>${pet.ownerPet}</td>
                <td>${pet.genderPet}</td>
                <td>${pet.descriptionPet}</td>
                <td><a href="<c:url value='/edit/${pet.id}'/>">Edit</a></td>
                <td><a href="<c:url value='/remove/${pet.id}'/>">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>


<h1>Добавить животное</h1>

<c:url var="addAction" value="/pet/add"/>

<form:form action="${addAction}" commandName="pet">
    <table>
        <c:if test="${!empty pet.typePet}">
            <tr>
                <td>
                    <form:label path="id">
                        <spring:message text="ID"/>
                    </form:label>
                </td>
                <td>
                    <form:input path="id" readonly="true" size="8" disabled="true"/>
                    <form:hidden path="id"/>
                </td>
            </tr>
        </c:if>
        <tr>
            <td>
                <form:label path="typePet">
                    <spring:message text="Тип животного"/>
                </form:label>
            </td>
            <td>
                <form:input path="typePet"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="namePet">
                    <spring:message text="Имя животного"/>
                </form:label>
            </td>
            <td>
                <form:input path="namePet"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="ownerPet">
                    <spring:message text="Владелец"/>
                </form:label>
            </td>
            <td>
                <form:input path="ownerPet"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="genderPet">
                    <spring:message text="Пол животного"/>
                </form:label>
            </td>
            <td>
                <form:input path="genderPet"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="descriptionPet">
                    <spring:message text="Примечание"/>
                </form:label>
            </td>
            <td>
                <form:input path="descriptionPet"/>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <c:if test="${!empty pet.typePet}">
                    <input type="submit"
                           value="<spring:message text="Редактировать"/>"/>
                </c:if>
                <c:if test="${empty pet.typePet}">
                    <input type="submit"
                           value="<spring:message text="добавить"/>"/>
                </c:if>
            </td>
        </tr>
    </table>
</form:form>

</body>
</html>
