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
  
사용자가 "가위", "바위", "보" 중 한 가지를 선택합니다.

	var com = Math.ceil(Math.random() * 3);
		
컴퓨터가 난수를 발생 시킵니다.

	document.write("<img src=\"images/math_img_" + com + ".jpg\">" + "<br>");

난수 번째에 이미지를 보여줍니다.

	if(gameNum == com) {
		document.write("<img src=\"images/game_1.jpg\">");
	} else {
		document.write("<img src=\"images/game_2.jpg\">");
	}

사용자가 선택한 값과 난수 값이 같으면 game_1.jpg 아니면 game_2.jpg를 보여줍니다.
