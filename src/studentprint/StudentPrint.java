/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package studentprint;

/**
 *
 * @author Sivagama
 */
public class StudentPrint {

    /** 3 student details
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Student[] list = new Student[3];//array of object declaration
        Student s1 = new Student(); // student 1 peter , age
       s1.setName("peter");
       s1.setAge(20);
        Student s2 = new Student();
        s2.setName("john");
        s2.setAge(19);
         Student s3 = new Student();
         s3.setName("simran");
         s3.setAge(17);
         list[0]=s1; //stored objects in array
         list[1]=s2;
         list[2]=s3;
         for(int i=0;i<=list.length-1;i++){
           System.out.println(list[i].getName()+" " +list[i].getAge());   
            System.out.println(list[i]+" " +list[i]);
         }
        
    }

}
