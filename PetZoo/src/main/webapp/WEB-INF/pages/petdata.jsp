<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=cp1251" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>

<html>
<head>
  <title>ZooList</title>

  <style type="text/css">
    body {
      background: url(leo.jpg) center no-repeat fixed;
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
      border-collapse: collapse;
      border-spacing: 0;
      border-color: #ccc;
    }

    .tg td {
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
      background-color: #f9f9f9
    }
    table{
      align: center;
    }
  </style>

</head>
<body>
<h1>Список животных зоопарка</h1>

<table class="tg">
  <tr>
    <th width="50">ID</th>
    <th width="80">Тип животного</th>
    <th width="80">Имя</th>
    <th width="100">Владелец</th>
    <th width="50">Пол</th>
    <th width="100">Примечание</th>
  </tr>
  <tr>
    <td>${pet.id}</td>
    <td>${pet.typePet}</td>
    <td>${pet.namePet}</td>
    <td>${pet.ownerPet}</td>
    <td>${pet.genderPet}</td>
    <td>${pet.descriptionPet}</td>
  </tr>
</table>
</body>
</html>