package lambda.ex2;

import lambda.ex2.MyReducer;

import java.util.List;

public class ReduceExample {

    // 함수를 인자로 받아, 리스트 요소를 하나로 축약(reduce)하는 고차 함수
    public static int reduce(List<Integer> list, int initial, MyReducer
            reducer) {

        int result = initial;
        for(Integer val : list){
            reducer.reduce(result, val); // 0, 1 -> 1(result)..반복
        }
        return result;
    }
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4);
        System.out.println("리스트: " + numbers);

        // 1. 합 구하기 (초깃값 0, 덧셈 로직)
        int sum = reduce(numbers, 0, (a, b) -> a + b);
        System.out.println("합(누적+): " + sum);

        // 2. 곱 구하기 (초깃값 1, 곱셈 로직)
        int product = reduce(numbers, 1, (a, b) -> a * b);
        System.out.println("곱(누적*): " + product);
    }
}
