# [Silver V] 피카츄 - 14405 

[문제 링크](https://www.acmicpc.net/problem/14405) 

### 성능 요약

메모리: 14304 KB, 시간: 100 ms

### 분류

문자열

### 제출 일자

2024년 10월 20일 16:10:10

### 문제 설명

<p>피카츄는 "pi", "ka", "chu"를 발음할 수 있다. 따라서, 피카츄는 이 세 음절을 합친 단어만 발음할 수 있다. 예를 들면, "pikapi"와 "pikachu"가 있다.</p>

<p>문자열 S가 주어졌을 때, 피카츄가 발음할 수 있는 문자열인지 아닌지 구하는 프로그램을 작성하시오.</p>

### 입력 

 <p>첫째 줄에 문자열 S가 주어진다. 문자열은 알파벳 소문자로 이루어진 문자열이며, 길이는 5000을 넘지 않는다.</p>

### 출력 

 <p>문자열 S가 "pi", "ka", "chu"를 이어 붙여서 만들 수 있으면 "YES"를 아니면 "NO"를 출력한다.</p>

### 풀이 방법
- 입력값 중 "pi", "ka", "chu"를 "" 공백으로 대체해서 결과 값 저장
- 대체 결과물에 문자가 담겨있으면 (isEmpty값이 true이면) "YES" 출력 / 다른 문자가 담겨있을 때(isEmpty값이 false일 때) "NO"출력
