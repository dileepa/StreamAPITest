import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Dileepa on 10/17/2015.
 */
public class ObjectTest
{

    public static void main(String[] args)
    {
        List<Person> persons = getPersonList();

        persons.forEach(Person:: getAge );

    }


    public static List<Person> getPersonList()
    {
        List<Person> persons = new ArrayList<>();

        Person p1 = new Person();
        p1.setName("Dileepa");
        p1.setAge(25);

        Person p2 = new Person();
        p1.setName("Shamitha");
        p1.setAge(25);

        Person p3 = new Person();
        p1.setName("Madawa");
        p1.setAge(25);

        persons.add(p1);
        persons.add(p2);
        persons.add(p3);

        return persons;
    }



}
