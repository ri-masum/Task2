/****************************************************
 * Student Name      :Masum Ahmed                   *
 * Student ID        :2012020116                    *
 * Section           :C                             *
 * Batch             :53                            *
 * Date              :05-08-21                      *
 * email             :cse_2012020116@lus.ac.bd      *
 *                                                  *
 ****************************************************
 */


package masum;

public class Student {
    //instance variables
    String name;
    int id ;
    //class variable
    String universityName="Leading University";

   Student()
   {
       System.out.println("default constructor");
   }

   Student(int id)
   {
       id=id;
       System.out.println("Student ID :"+id);
   }


   //constructor overloading
   Student(int id, String name)
    {
        //using this keyword to avoid variable hiding
        this.id =id;
        this.name=name;
        System.out.println("Student name amd  id is : "+name+ " "+ id);
    }

    void display()
    {

        System.out.println("University:  "+universityName);

    }


}
