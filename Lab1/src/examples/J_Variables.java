package examples;

/**
 * Variables Scope
 */
public class J_Variables {
    public int test;



    public J_Variables(){
        test = 3;
        System.out.println(test);
    }

    {
        test = 2;
        System.out.println(test);
    }

    public static void main(String args[]){
        J_Variables j = new J_Variables();
    }

    public void eatIfHungry(boolean hungry) {
        if (hungry) {
            int bitesOfCheese = 1;
        } // bitesOfCheese goes out of scope here
//        System.out.println(bitesOfCheese);// DOES NOT COMPILE
    }

    public void eatIfHungry2(boolean hungry) {
        if (hungry) {
            int bitesOfCheese = 1;
            //System.out.println(nrMeals);
            {
                boolean teenyBit = true;
                System.out.println(bitesOfCheese);
            }
        }
        int nrMeals;
        //System.out.println(teenyBit); // DOES NOT COMPILE
    }
}
