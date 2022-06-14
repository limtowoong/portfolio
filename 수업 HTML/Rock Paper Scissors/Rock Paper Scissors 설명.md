# 가위 바위 보 게임 (Rock Paper Scissors Game)

	switch(game) {
		case "가위":gameNum = 1;
		break;
		case "바위":gameNum = 2;
    break;
		case "보":gameNum = 3;
		break;
		default : alert("잘못 작성하셨습니다.");
		location.reload();
	}
  
사용자가 "가위", "바위", "보" 중 한 가지를 입력하면 gameNum에 값을 넣습니다.

		var com = Math.ceil(Math.random() * 3);
   1

		document.write("<img src=\"images/math_img_" + com + ".jpg\">" + "<br>");


		if(gameNum == com) {
			document.write("<img src=\"images/game_1.jpg\">");
		} else {
			document.write("<img src=\"images/game_2.jpg\">");
		}
