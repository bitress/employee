public class Employee {

    String name;
    int year_hired;
    String address;

    public static void main(String[] args){

        Employee One = new Employee();
        Employee Two = new Employee();
        Employee Three = new Employee();
        
        One.name = "Ramboo Tan";
        One.year_hired = 21;
        One.address = "Baguio City";

        Two.name = "Kim Chee";
        Two.year_hired = 31;
        Two.address = "Dagupan City";

        Three.name = "Juan Chu";
        Three.year_hired = 35;
        Three.address = "Quezon City";


        System.out.println("Name               Year Hired               Address");
        System.out.println(One.name + "             "+ One.year_hired + "               "+ One.address);
        System.out.println(Two.name + "               "+ Two.year_hired + "               "+ Two.address);
        System.out.println(Three.name + "               "+ Three.year_hired + "               "+ Three.address);

    }
}
