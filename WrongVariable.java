public class WrongVariable
{
    public static void main(String[] args)
    {
        String &name = "Nuba";
        System.out.println(&name);
        String name;
        System.out.println(name);
    }
}