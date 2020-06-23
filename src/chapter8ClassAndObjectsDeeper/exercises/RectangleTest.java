package chapter8ClassAndObjectsDeeper.exercises;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println("\ndefaults:\n" + rectangle);

        rectangle.setLength(4f);
        rectangle.setWidth(6f);
        System.out.println("\nafter change length and width\n" + rectangle);
        System.out.println("area = " + rectangle.area());
        System.out.println("perimeter = " + rectangle.perimeter());

        try{
            rectangle.setLength(44f);
        }
        catch (IllegalArgumentException e){
            System.out.printf("%nException while set length: %s",
                    e.getMessage());
        }
        try{
            rectangle.setWidth(44f);
        }
        catch (IllegalArgumentException e){
            System.out.printf("%nException while set width: %s%n",
                    e.getMessage());
        }
        int czas = 3 * 3600 + 43 * 60 + 23;
        System.out.println("3:43:23 to " + czas);
        System.out.println("hour" + czas/3600);
        int minut = (czas - ((czas/3600)*3600))/60;
        System.out.println("minut" + minut );
        int secoud = czas-(((czas/3600)*3600)+(((czas - ((czas/3600)*3600))/60)*60));
        System.out.println(secoud);

    }
}
