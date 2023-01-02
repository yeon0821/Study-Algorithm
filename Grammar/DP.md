# DP

동적계획법(Dynamic Programming)

------

- 동적 계획법 - Dynamic Programming
- Top - down VS Bottom - up
- 메모제이션 ***\*Memoization\****
- 동적 계획법 VS 분할 정복(***\*Divide and Conquer)\****

# 동적 계획법 (Dynamic Programming)

------

동적 계획법은 프로그래밍 대회 문제에 가장 자주 출현하는 디자인 패러다임 중 하나로, 이름만 가지고는 무엇을 의미하는지 영 알 수 없기 때문에 가장 많은 오해를 불러 일으키는 주제이기도 하다.

### ***\*Dynamic? 동적? 기억하기?\****

자료구조의 동적할당(Dynamic Allocation)에서 '동적'은 '프로그램이 실행되는 도중에 실행에 필요한 메모리를 할당하는 기법'을 의미한다. 그러나, 알고리즘의 동적 계획법(Dynamic Programming)에서 '동적'은 별 뜻 없다 그냥 '기억하기'라고 생각하면 편하다. '프로그래밍'은 컴퓨터 프로그래밍이 아니라 테이블을 만든다는 뜻이다.

### ***\*중복되는 부분 문제\****

피보나치 수열을 코딩하려고 한다. 점화식이 F(n) = F(n-1) + F(n-2)이기 때문에 단순 재귀 함수로 구현.

단순 재귀 코드

```java
public class Simple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dp  = new int[n+1];
		System.out.println(fibo(n));
	}
	
	// 단순 재귀
	static int fibo(int x) {
		if( x ==1 || x==2) return 1;
		return fibo(x-1) + fibo(x-2);
	}
}
```

위와 같이 메모이제이션을 사용하지 않으면 같은 함수를 계속해서 중복 호출을 하기 때문에 재귀함수로 구현을 하면 **시간복잡도 O(2^n)**을 갖게 된다. 다음 그림과 같이 중복되는 호출로 인해 굉장히 좋지 않은 효율을 갖는 것을 볼 수 있다.

![img](https://blog.kakaocdn.net/dn/0YRl3/btrhKLlr9QX/eKlwtKaAqMogyl0zI0LOZk/img.png)

```
                                                    좀 더 효율적으로 코딩할 방법이 없을까?
```

## ***\*DP 문제가 성립할 조건\****

이럴 때 DP를 사용하면 된다. 단순 재귀코드보다 높은 효율을 갖는 코드를 설계할 수 있다.

1. **최적 부분 구조(Optimal Substructure)**
   - 상위 문제를 하위 문제로 나눌 수 있으며 하위 문제의 답을 모아서 상위 문제를 해결할 수 있다.
2. **중복되는 부분 문제(Overlapping Subproblem)**
   - 동일한 작은 문제를 반복적으로 해결해야 한다.

→ 그러므로, 피보나치 수열은 DP 사용조건에 만족한다

## **DP 알고리즘 기법은 무엇인가?**

DP 알고리즘 기법은 이미 계산된 결과(하위 문제)는 별도의 메모리 영역에 저장하여 다시 계산하지 않도록 설계함으로써 메모리를 적절히 사용하여 수행 시간 효율성을 비약적으로 향상시키는 방법이다.

DP 구현 방법은 일반적으로 두 가지 방식, **Top-down(하향식)**과 **Bottom-up(상향식)**으로 구성된다.

# Top-down VS Bottom-up

------

## Top-down(하향식)

상위 문제를 해결하기 위해서 하위 문제를 재귀적으로 호출하여  하위 문제를 해결함으로써 상위 문제를 해결하는 방식이다. 이 때 해결해놓은 하위 문제를 저장해 놓기 위해 Memoization이 사용된다.

피보나치 함수를 만들 때 Top-down은 재귀 호출을 사용하여 구현한다

```java
public class Topdown {
	static int[] dp;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dp  = new int[n+1];
		System.out.println(fibo(n));
		
	}
	
    // Top-down
	static int fibo(int x) {
		if( x ==1 || x==2) return 1;
		if(dp[x] != 0) return dp[x];
		dp[x] = fibo(x-1) + fibo(x-2);
		return dp[x];
	}
}
```

## Bottom-up(상향식)

하위에서부터 문제를 해결해나가면서 먼저 계산했던 문제들의 값을 활용해서 상위 문제를 해결해나가는 방식으로 DP의 전형적인 형태는 Bottom-up이다. 여기서 사용되는 문제 결과 값 저장용 리스트는 DP 테이블이라고 부른다.

Bottom-up 방식은 반복문을 사용해서 구현한다.

```java
public class Bottomup {

	static int[] dp;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dp  = new int[n+1];
		
		System.out.println(fibo(n));
	}
	
    // Bottom-up
	static int fibo(int x) {
		dp[1] =1;
		dp[2] =1;
		for(int i=3; i<x+1; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		return dp[x];
	}
}
```

# 메모제이션 Memoization

------

메모이제이션은 DP구현 방법 중 하나로, 한 번 계산한 결과를 메모리 공간에 메모하는 기법이다. 이를 사용하면 모든 부분 문제가 한 번씩만 계산된다고 보장할 수 있기 때문에 함수 호출 횟수가 엄청나게 감소함을 예상할 수 있다.

위의 단순 재귀코드와 Top-down의 코드를 비교해보면 직관적으로 이해하기 쉽다.

```java
// 일반 재귀 함수
// 중복된 계산을 반복해서 하게 된다. 시간복잡도 O(2^n)으로 x의 수가 커질수록 복잡도가 엄청나게 커짐
static int fibo(int x) {
   if( x ==1 || x==2) return 1;
   return fibo(x-1) + fibo(x-2);
}

// Memoization 
// 하위 문제의 결과 값을 dp[]배열에 저장해놓고 필요할 때마다 계산된 값을 호출
static int fibo(int x) {
   if( x ==1 || x==2) return 1;
   if(dp[x] != 0) return dp[x];
   dp[x] = fibo(x-1) + fibo(x-2);
   return dp[x];
}
```

### **메모제이션 특징**

- 같은 문제를 다시 호출 하면 메모했던 결과를 그대로 가져온다
- 값을 기록해 놓는다는 점에서 캐싱(Cachig)이라고 한다
- DP에만 국한된 개념이 아니다. 한 번 계산된 결과를 담아 놓기만 하고, DP가 아닌 다른 방식으로도 사용될 수 있다. (캐싱,메모이제이션)

피보나치 함수를 예로 들었을 때, 이미 계산된 결과를 저장하면 아래의 색칠된 노드만 계산이 처리되어 프로그램의 작업 처리속도를 크게 향상시킬 수 있다

![img](https://blog.kakaocdn.net/dn/bzzIgA/btrhX03is7C/3bokWk1Bhv9RQKmPXarugK/img.png)

# ***\*동적계획법 (DP) VS 분할정복 (Divide and Conquer)\****

------

최적 부분 구조는 분할 정복(Divide and conquer) 방식으로 풀 수 있다. DP와 분할 정복은 해당 문제가 최적 부분 구조의 조건을 가질 때 사용할 수 있다. 상위 문제를 작게 하위 문제로 나누어 해결하는 방식으로 처리하면 된다.

### ***\*그러나! 차이점은 하위 문제의 중복이다.\****

하위 문제가 독립적이지 않고 중복이 되는 경우에는 DP의 방식이 분할정복보다는 더 나은 시간복잡도를 가진다. 왜냐하면 분할정복에서는 동일한 하위 문제는 각각 독립적으로 구성되어 있기 때문에 반복적으로 계산이 되지 않기 때문이다.

![img](https://blog.kakaocdn.net/dn/bPMnE0/btrhVtyolJi/EdU4PSE8KnLs0m8BDuHfq0/img.png)

```
                                                                   D&C, DP 트리
```