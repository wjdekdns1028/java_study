package lambda.lambda1;

import lambda.MyFunction;

public class LambdaSimple1 {
    public static void main(String[] args) {
        MyFunction funtion1 = (int a, int b) -> {
            return a + b;
        };
        System.out.println("funtion1: " + funtion1.apply(1, 2));

        // 단일 표현식인 경우 중괄호와 리턴 생략 가능
        MyFunction function2 = (int a, int b) -> a + b;
        System.out.println("funtion2: " + function2.apply(1, 2));

        // 단일 표현식이 아닐 경우 중괄호와 리턴 모두 필수
        MyFunction function3 = (int a, int b) -> {
            System.out.println("람다 실행");
            return a + b;
        };
        System.out.println("funtion3: " + function3.apply(1, 2));
    }
}
