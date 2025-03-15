package Increment_Decrement_Task;

public class Task003_In_De_Op_2 {

        public static void main(String[] args) {
            int a = 20;
            System.out.println(--a + a++ + a--);

            // Line 7 --> A+B+C
            //A = ExpA --> --a -> 19
            //B = ExpB --> a++ -> 19
            //C = ExpC --> a-- -> 20
            // A+B+C = 19+19+20 = 58

        }
    }

