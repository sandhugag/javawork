public class Computer
{
    public static void main(String arg[])
    {
        int price;
        String model;
        String color;
        String company;




       Computer comp = new Computer();
        comp.configuration();
        comp.inputrate();

    }

    public static void configuration()
    {
        System.out.println("this laptop have 3 gb ram");
    }
    public static void inputrate()
    {
        System.out.println("labtop has higher input rate");
    }
}
