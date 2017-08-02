/**
 * Created by govinds on 7/19/2017.
 */
public class MainClass {

    public static void main(String arg[]) {

    Person p = new Person();
    p.setName("sree");
    p.setAge(10);

    System.out.println("Print person details : \n Age: " +p.getAge() +"\n Name: "+p.getName());

        Employee e= new Employee();
        e.setName("srikanth");
        e.setSerialNo(12345);
        System.out.println("Print Employee details : \n Name: " +e.getName() +"\n SerialNo: "+e.getSerialNo());
}
}
