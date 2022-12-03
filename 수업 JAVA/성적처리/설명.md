```eclipse
private String name;
private int KorG;
private int EngG;
private int MathG;
private int SumG;
private double AvgG;
private int RankG;
```

&ensp; 성적을 받을 과목 생성합니다.
<br><br><br>

```eclipse
int getSum() {
	return this.getKor() + this.getEng() + this.getMath();
}
double getAvg() {
	return this.getSum()/3;
}
```

&ensp; getSum에 getKor, getEng, getMath 값을 넣습니다.
<br><br><br>

```eclipse
void printScore() {
	System.out.printf(" %3s %3d %3d %3d %3d %3.2f %3d \n", this.getName(), this.getKor(), this.getEng(), this.getMath(), this.getSum(), this.getAvg(), this.getRank());
	 }
```

&ensp; 모든 과목 점수를 출력합니다.
<br><br><br>

```eclipse
System.out.println("몇명의 성적처리를 하나요(숫자입력)? ");
	int num = input.nextInt();
```

&ensp; num에 성적처리 대상의 수를 넣습니다.
<br><br><br>

```eclipse
People stu[] = new People[num];
```

&ensp; stu 배열값에 People 배열 num번째 값을 넣어줍니다.
<br><br><br>

```eclipse
for(int i=0; i<stu.length; i++) {
	stu[i] = new People();
}
```

&ensp; i를 stu배열에 길이 만큼 반복실행하여 stu배열 i번째 값에 new People값을 넣어줍니다.
<br><br><br>

```eclipse
for(int i=0; i<stu.length; i++) {
	System.out.println("성명을 입력하세요: ");
	stu[i].setName(input.next());
	System.out.println("국어 점수를 입력하세요: ");
	stu[i].setKorG(input.nextInt());
	System.out.println("영어 점수를 입력하세요: ");
	stu[i].setEngG(input.nextInt());
	System.out.println("수학 점수를 입력하세요: ");
	stu[i].setMathG(input.nextInt());
}
```

&ensp; 과목에 점수를 stu 배열의 길이 만큼 받아줍니다.
<br><br><br>

```eclipse
for(int i=0; i<stu.length; i++) {
	int rank=1;
	for(int j=0; j<stu.length; j++) {
		if (stu[i].getSum() < stu[j].getSum()) rank++;
	}
stu[i].setRankG(rank);
}
```

&ensp; 순위 구하는 코드입니다.
<br><br><br>
