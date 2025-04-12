package lambda.ex1;

import lambda.Procedure;

import java.util.Arrays;

public class M4MeasureTime {

    // 공통 : 실행 시간 측정 메서드
    public static void measure(Procedure p){
        long startNs = System.nanoTime();
        p.run();
        long endNs = System.nanoTime();
        System.out.println("실행 시간: " + (endNs - startNs) + "ns");
    }

    public static void main(String[] args) {
        // 1. 람다로 1부터 n까지 합 구하기
        measure(() -> {
                int N = 100;
                long sum = 0;
                for(int i = 0; i < N; i++){
                    sum += 1;
                }
                System.out.println("[1부터 " + N + " 까지의 합]: " + sum);
            });

        // 람다로 배열 정렬
        measure(() -> {
                int[] arr = {4, 3, 2, 1};
                System.out.println("원본 배열: " + Arrays.toString(arr));
                Arrays.sort(arr);
                System.out.println("배열 정렬: " + Arrays.toString(arr));
        });
    }
}
