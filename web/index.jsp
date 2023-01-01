<%--
  Created by IntelliJ IDEA.
  User: ZERO_BASE_6기_
  Date: 2022-12-09
  Time: 오전 12:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>와이파이 정보 구하기</title>
    <style>
        body {
            margin : 0;
        }
        * {
            box-sizing : border-box;
        }
        table, td, th {
            border-collapse: collapse;
            border: 1px solid white;
            color: white;
            background: green;
        }

        table {
            width: 100%;
        }
        button {
            width: 100%;
        }
        .button1 {
            width : 10%;
        }

        .button2 {
            width : 10%;
        }
    </style>

</head>
<body>
<h2>와이파이 정보 구현하기</h2>
<a href="http://localhost:8080">홈</a>
<a href="load-wifi.jsp">위치 히스토리 목록</a>
<a href="http://openapi.seoul.go.kr:8088/4b4e574f6a726d73383374724e6276/json/TbPublicWifiInfo/1/5/">Open API 와이파이 정보 가져오기</a><br>
LAT : <input type="text" name="" value="0.0"> ,LNT : <input type="text" name="" value="0.0">
<button class="button button1">내 위치 가져오기</button>
<button class="button button2">근처 WIPI 정보 보기</button>
<table>
    <tr>
        <th>거리(Km)</th>
        <th>관리번호</th>
        <th>자치구</th>
        <th>와이파이명</th>
        <th>도로명 주소</th>
        <th>상세 주소</th>
        <th>설치 위치(층)</th>
        <th>설치유형</th>
        <th>설치기관</th>
        <th>서비스구분</th>
        <th>망종류</th>
        <th>설치년도</th>
        <th>실내외구분</th>
        <th>WIFI 접속환경</th>
        <th>X 좌표</th>
        <th>Y 좌표</th>
        <th>작업 일자</th>
    </tr>
</table>
<button class="button button" onclick=alert('HI')>위치 정보를 입력한 후에 조회해 주세요.</button>
<span>위도 : </span><input type="text" id="lat" name="lat" readonly/><br/>
<span>경도 : </span><input type="text" id="long" name="long" readonly/>
<script>
    var latitude = "", longitude = "";

    window.onload = function() {
        if (navigator.geolocation) {
            navigator.geolocation.getCurrentPosition(onSuccess, onError);
        } else {
            latitude = "", longitude = "";
        }
    }

    function onSuccess(position) {
        latitude = position.coords.latitude;
        longitude = position.coords.longitude;
        document.getElementById("result").innerHTML = "<p>성공</p>";
    }

    function onError() {
        latitude ="N/A";
        longitude = "N/A";
        document.getElementById("result").innerHTML = "<p>실패</p>";
    }

    document.getElementById("lat").value = latitude;
    document.getElementById("long").value = longitude;


</script>
</body>
</html>
