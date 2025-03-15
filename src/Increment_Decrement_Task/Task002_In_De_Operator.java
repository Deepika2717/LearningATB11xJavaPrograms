package Increment_Decrement_Task;



    public class Task002_In_De_Operator {
        public static void main(String[] args) {
            int a = 10;
            System.out.println(++a + a++ + a++);
            System.out.println(a);

            // Line 8 -- A+B+C
            // A --> ExpA -++a -> 11
            // B --> ExpB -> a++ -> 11
            //C --> ExpC -> a++ -> 12
            // A+B+C --> ExpA+ExpB+ExpC --> 11+11+12 = 34
            // Line 9 - 13
        }
    }

