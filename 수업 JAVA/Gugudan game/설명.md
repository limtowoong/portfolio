# 구구단

<br>

## 코드

![image](https://user-images.githubusercontent.com/104752202/187587003-866d467b-b47d-4c3c-97ae-e6a5fae25403.png)

<br>

## 코드 설명

```eclipse
int x, y;
```

&ensp; x : 사용자가 입력하는 인수
&ensp; y : 컴퓨터가 발생하는 난수
<br><br><br>

```eclipse
if(args.length==1){
```

&ensp; args 배열에 1개에 데이터가 있는 경우 true;
<br><br><br>

```javascript
x= Integer.valueOf(args[0]).intValue();
```

&ensp; 입력한 문자형 데이터를 <b>Integer</b>를 이용하여 정수형으로 변환하여 저장
<br><br><br>

```eclipse
else{
    x= Math.abs(r.nextInt() % 9) + 1;
}

y= Math.abs(r.nextInt() % 9) + 1;

int num= x*y;
```

&ensp; x, y 에 난수값을 넣고 num에 x, y를 곱한값을 넣음
<br><br><br>

```eclipse
System.out.print(x +" * "+ y +" = ");
```

&ensp; 계산 방식을 출력
<br><br><br>

```javascript
String user;
user= in.readLine();

BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
```

&ensp;한 줄을 읽어 String 타입으로 값을 가져올 때 사용합니다.
<br><br><br>

## 결과

![image](https://user-images.githubusercontent.com/104752202/187587719-a59030c7-57f2-4235-99c4-75fc78912264.png)

![image](https://user-images.githubusercontent.com/104752202/187587559-78616e5c-39ef-48f2-ba7b-eeca5728344f.png)
