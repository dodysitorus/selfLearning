public class Variables {
    String name;  //instance variable
    String address;
    static String city;  //class variable
    static int i;

    static {
        city = "Bangalore";
        i = 0;
    }

    public Variables(String name, String address) {
        this.name = name;
        this.address = address;
        i++;
        System.out.println(i);
    }

    public void getData(){
        System.out.println(name +" " + city);
    }

    //class method
    public static void getCity(){
        System.out.println(city);
    }

    public static void main(String[] args) {
        Variables obj = new Variables("Dody", "Sibulele");
        Variables obj1 = new Variables("Dody", "Sibulele");
        Variables obj2 = new Variables("Dody", "Sibulele");
        obj.getData();
        getCity();
    }
}
