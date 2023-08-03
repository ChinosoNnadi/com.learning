public class E5elseIf {
    public static void main(String[] args) {

        String fruit="Apple";
        if(fruit.equals("Mango")){
            System.out.println("The price is $5");
        }else if(fruit.equals("Orange")){
            System.out.println("Price is $7");
        }else if(fruit.equals("Apple")){
            System.out.println("Price is $40");
        }else if(fruit.equals("Kiwi")){
            System.out.println("Price is $23");
        }else {
            System.out.println("This fruit is not available");
        }

    }
}
