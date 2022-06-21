# main code

    <!DOCTYPE html>
    <html lang="en">
    <head>
      <meta charset="UTF-8">
      <meta name="viewport" 
      content="width=device-width, initial-scale=1.0">
      <title>디지털 시계 만들기</title>
      <link href="style.css" rel="stylesheet">
    </head>
    <body>
      <div class="container">
        <div class="clock">
          <h1 id="time"></h1>
        </div>
        <button id="stop">STOP</button>
        <button id="go">GO</button>
      </div>
      <script src="script.js"></script>
    </body>
    </html>
    
## 설명 (main code)

    <div class="clock">
      <h1 id="time"></h1>
    </div>
    
&nbsp; 시계 역할을 합니다.

    <button id="stop">STOP</button>

&nbsp; STOP을 누르면 멈추게 했습니다.

    <button id="go">GO</button>
    
&nbsp; GO를 누르면 시작하게 했습니다.

# css code

    @charset "UTF-8";

    @font-face {
      font-family: 'LAB디지털';
      src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_20-07@1.0/LAB디지털.woff') format('woff');
      font-weight: normal;
      font-style: normal;
    }
    *{ font-family: 'LAB디지털'; }
    html, body{ margin: 0; }
    .container{ text-align: center; }
    .clock{
      color:red; background-color: black; 
      width: 200px; margin: 5px auto;
      border: 2px solid black;
      border-radius: 10px;
    }
    
## 설명 (css code)

    @font-face {
      font-family: 'LAB디지털';
      src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_20-07@1.0/LAB디지털.woff') format('woff');
      font-weight: normal;
      font-style: normal;
    }
    
&nbsp; 모든 폰트를 LAB디지털 폰트로 설정했습니다.

    .clock{
      color:red; background-color: black; 
      width: 200px; margin: 5px auto;
      border: 2px solid black;
      border-radius: 10px;
    }
    
&nbsp; 폭을 200px로 조절하고 auto로 양쪽 여백을 동일하게 주었습니다.

# js code

    let handleId = 0; 
    const h1 = document.getElementById("time")
    const go = document.getElementById("go")
    const stop = document.getElementById("stop")

    function getTime(){
      const date = new Date()
      const hour = date.getHours();
      const minutes = date.getMinutes();
      const seconds = date.getSeconds();
      const time = `${hour<10?'0'+hour:hour}:${minutes<10?'0'+minutes:minutes}:${seconds<10?'0'+seconds:seconds}`
      h1.textContent = time;
    }

    go.onclick = function(){
      if(handleId == 0){
        handleId = setInterval(getTime, 1000)
      }
    }

    stop.onclick = function(){
      clearInterval(handleId)
      handleId = 0;
    }

    getTime()

## 설명 (js code)

    function getTime(){
      const date = new Date()
      const hour = date.getHours();
      const minutes = date.getMinutes();
      const seconds = date.getSeconds();
      const time = `${hour<10?'0'+hour:hour}:${minutes<10?'0'+minutes:minutes}:${seconds<10?'0'+seconds:seconds}`
      h1.textContent = time;
    }

&nbsp; 호출된 시간을 시, 분, 초로 바꿔줍니다.

    go.onclick = function(){
      if(handleId == 0){
        handleId = setInterval(getTime, 1000)
      }
    }

&nbsp; GO버튼을 누르면 1초마다 getTime을 호출합니다.

    getTime()
    
&nbsp; 시간을 표시하기 위해 getTime을 호출해줍니다.

# 실행  
    
![ezgif com-gif-maker (1)](https://user-images.githubusercontent.com/104752202/174733558-e8bf60fc-0a66-4508-9b3c-c7182cc1959c.gif)


    
