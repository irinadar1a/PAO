package examples;

public class D_Object {

    public static void main(String[] args){

        Object object = new Object();
        //verify all object methods on an instance of object
        object.equals(new Object());

        Shape shape1 = new Shape("Irina");

        //verify Object methods
        System.out.println(shape1.getClass());
        int i = shape1.hashCode();
        System.out.println(i);
        String string = shape1.toString();
        System.out.println(string);

        Shape shape2 = new Shape("Irina");
        System.out.println(shape1.equals(shape2));
        System.out.println(shape2.hashCode());

        Shape shape3 = shape2;
        System.out.println(shape3.equals(shape2));

        Shape[] shapeList = new Shape[]{
                shape1, shape2, shape3
        };

        //verify object methods
        shapeList.toString();
    }

}

class Shape {
    private String name;

    public Shape(String name){
        this.name = name;
    }

    //Add methods after verifying Object methods
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}