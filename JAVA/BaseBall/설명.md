## 배열

```java
int num[] = new int[3];
int ans[] = new int[3];
Random r = new Random();
```

<li>num : 컴퓨터가 사용할 배열</li>
<br>
<li>ans : 사용자가 사용할 배열</li>

<br><br><br>

## 난수

```java
while(true) {
    for(int i=0; i<num.length; i++) {
        num[i] = r.nextInt(9)+1;
    }
    if(!(num[0]==num[1]||num[1]==num[2]||num[0]==num[2])) {
        break;
    }
}
```

<li>배열에 길이 만큼에 난수를 생성하고 중복을 제거</li>
 
<br><br><br>
 
## nextInt 메소드

```java
do {
    System.out.print("1번째 :");
        ans[0] = sc.nextInt();
    System.out.print("2번째 :");
        ans[1] = sc.nextInt();
    System.out.print("3번째 :");
        ans[2] = sc.nextInt();

    if(ans[0]==0||ans[1]==0||ans[2]==0) {
        System.out.println("0보다 높은 숫자를 입력해주세요");
    }else if(ans[0]>9||ans[1]>9||ans[2]>9) {
        System.out.println("9이하에 숫자를 입력해주세요");
    }else if(ans[0]==ans[1]||ans[1]==ans[2]||ans[0]==ans[2]) {
        System.out.println("중복값은 입력할 수 없습니다.");
    }
}

while((ans[0]==0)||(ans[1]==0)||(ans[2]==0)||
    (ans[0]>9)||(ans[1]>9)||(ans[2]>9)||
    (ans[0]==ans[1])||(ans[1]==ans[2])||(ans[0]==ans[2]));
```

<li>값을 입력하고 입력한 값이 조건에 안 맞으면 다시 입력</li>

<br><br><br>

### strike

```java
for(int i=0; i<ans.length; i++) {
    if(num[i]==ans[i]) {
        strike++;
    }
}
```

 <li>num[ i ]번째와 ans[ i ]번째를 비교하여 strike 값을 구한다.</li>

<br><br><br>

 ## ball
 
```java
for(int i=0; i<ans.length; i++) {
    for(int j=0; j<ans.length; j++) {
        if(num[i]==ans[j] && !(i==j)) {
            ball++;
        } 
    }
}
```

<li>i의 값과 j의 값이 같이 않을 때 num[ i ]번째와 ans[ j ]번째를 비교하여  ball 값을 구한다.

<br><br><br>

### count
	
```java
if(strike==3) {

    if (cnt <= 2) {
        System.out.println("참 잘했어요!");
    } else if (cnt <= 5) {
        System.out.println("잘했어요!");
    } else if (cnt <= 9) {
        System.out.println("보통이네요!");
    } else {
        System.out.println("분발하세요!");
    }
    break;
}
```

<li>cnt 값에 따라 출력내용</li>
