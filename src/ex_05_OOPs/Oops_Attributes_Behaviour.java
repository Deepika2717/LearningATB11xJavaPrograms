package ex_05_OOPs;

public class Oops_Attributes_Behaviour {
    public static void main(String[] args) {

        person p1 = new person();
        p1.sleep();
        p1.Talk();
        p1.give("Jay");
        p1.Salary(30000);
    }
}

        class person {
            String Name;
            int age;
            Boolean IsFemale;
            float height;
            float weight;
            double salary;
            byte legs;
            byte hands;
            int eyes;
            short ears;


            // 1.Without Parameters and Without Return Type
// 2.Without Parameters but With Return Type
// 3.With Parameters and Without Return Type
// 4. With Parameters and With Return Type

            void sleep() {
                System.out.println("Sleeping");
            }


            String Talk()

            {
                System.out.println("Talking");
                return "Talking";
            }

            String give(String name1) {
                System.out.println("Hi"  +name1);
                return "Hi"  +name1;

            }
            int Salary(int tax) {
                System.out.println(tax);
                return tax;
            }
        }

