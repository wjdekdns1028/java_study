package lambda.ex2;

public class BuildGreaterExample {

    // 고차 함수, greeting 문자열을 받아, "새로운 함수를" 반환
    public static lambda.ex3.StringFunction buildGreeter(String greeting) {
        // 람다로 함수 반환
        return name -> greeting + ", " + name;
    }
    
    public static void main(String[] args) {
        lambda.ex3.StringFunction helloGreater = buildGreeter("Hello");
        StringFunction hiGreater = buildGreeter("Hi");

        // 함수가 반환되었으므로, apply()를 호출해 실제로 사용
        System.out.println(helloGreater.apply("Java"));
        System.out.println(hiGreater.apply("Lambda"));
    }
}
