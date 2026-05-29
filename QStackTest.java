import java.util.Scanner;
import java.util.Random;

public class QStackTest {
    public static void main(String[] args){

        //Push 1, 2, 3, 4, 5 to empty stack, pop 3 times, print top element.
        System.out.println("Test 1: ");
        QStack testMeFirst = new QStack();
        testMeFirst.push(1);
        testMeFirst.push(2);
        testMeFirst.push(3);
        testMeFirst.push(4);
        testMeFirst.push(5);
        testMeFirst.pop();
        testMeFirst.pop();
        testMeFirst.pop();
        System.out.println(testMeFirst.pop());

        //Push 2, 4, 8 to empty stack, pop once, print top element, print if empty or not.
        System.out.println("Test 2:");
        QStack testMeSecond = new QStack();
        testMeSecond.push(2);
        testMeSecond.push(4);
        testMeSecond.push(8);
        testMeSecond.pop();
        testMeSecond.pop();
        if(testMeSecond.isEmpty()){
            System.out.println("Empty");
        }else{
            System.out.println("Not Empty");
        }

        //Push 3, 6, 9 to empty stack, pop once, print top element, print if empty or not.
        System.out.println("Test 3: ");
        QStack testMeThird = new QStack();
        testMeThird.push(3);
        testMeThird.push(6);
        testMeThird.push(9);
        testMeThird.pop();
        testMeThird.pop();
        if(testMeThird.isEmpty()){
            System.out.println("Empty");
        }else{
            System.out.println("Not Empty");
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.println("input integer between 0 and 100");
        int m = Integer.parseInt(sc.nextLine().trim());
        Random r = new Random(9999);
        QStack testMeFourth = new QStack();
        int pushThis = 0;
        for(int i = 0; i<m; i++){
            pushThis = r.nextInt(9999)+1;
            testMeFourth.push(pushThis);
            System.out.println(pushThis);
        }

        System.out.println("My method tests: ");
        System.out.println("Push another random number: ");
        pushThis = r.nextInt(9999)+1;
        testMeFourth.push(pushThis);
        System.out.println(pushThis);
        System.out.println("Now pop twice:");
        System.out.println(testMeFourth.pop());
        System.out.println(testMeFourth.pop());
        System.out.println("Stack size: " + testMeFourth.size());
        System.out.println("Next element without removing: " + testMeFourth.top());
        System.out.println("Check if empty: ");
        System.out.println(testMeFourth.isEmpty());
        System.out.println("Remove all elements and check again: ");
        for(int i = 0; i < testMeFourth.size(); i++){
            testMeFourth.pop();
        }
        System.out.println(testMeFourth.isEmpty());

    }
    
}
