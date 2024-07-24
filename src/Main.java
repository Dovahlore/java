

public class Main {     //Main类
    public static void main(String[] args) {    //构造函数
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        class Solution {
            private String name;

            public Solution(String name) {
                this.name = name;
            }

            public void run() {
                System.out.println(this.name);
            }
        }
        Dog dog = new Dog("Rufus", 3);

        dog.bark();
        Solution solution = new Solution("Hello World");
        solution.run();

        long A = 1;
        long B = 1;
        for (int i = 1; i <= 10; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            if (B >= A) {
                A += B;
                System.out.println("a = " + A);
            } else {

                B += A;
                System.out.println("B = " + B);
            }


        }
    }
}