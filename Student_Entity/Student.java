package Student_Entity;

import Subject_Entity.Subject;
import java.util.ArrayList;

public class Student {
        public static int stud;
      public int RollNumber;
        public String StudentName;
        public int TotalMark;
        public char Grade;
        public double Averages;
        public ArrayList<Subject> subjects;

        public Student(int rollNumber,String name,ArrayList<Subject> subjects)
        {
                this.RollNumber=rollNumber;
                this.StudentName=name;
                this.subjects = new ArrayList<>();
                this.subjects = subjects;
        }

        public int CalculateTotalMarks(Student stud )
        {   int total=0;
           
            for(int i=0;i<stud.subjects.size();i++)
              {
                 Subject subject = stud.subjects.get(i);
                 total=total+subject.mark;
              }
              stud.TotalMark=total;
             
         return  total;
      }

        public int  CalculateAverage(Student stud)
        {
                int Average=0;
                for(int i=0;i<stud.subjects.size();i++)
                {
                   Subject subject = stud.subjects.get(i);
                   Average=TotalMark/stud.subjects.size();
                }
                stud.Averages=Average;
                return  Average;
           
               
        }

        public void CalculateGrade(Student stud)
        {
         char Grade = ' ';
        
            while (true) { 
    
             if(TotalMark==500)
             {
               Grade='O';
                System.out.println("O");
               break; 
             }
             if(TotalMark>=450)
             {
                Grade='A';
                System.out.println("A");
                break;
             }
             if(TotalMark>=400)
             {
               Grade='B';
                System.out.println("B");
                break;
             }
             if(TotalMark>=350)
             {
               Grade='C';
                System.out.println("C");
                break;
             }
             if(TotalMark>=300)
             {
               Grade='D';
                System.out.println("D");
                break;
             }
             if(TotalMark>=250)
             {
               Grade='E';
                System.out.println("E");
                break;
             }
             else{
               Grade='F';
                System.out.println("F");
                break;
             }
            } 
            stud.Grade = Grade;

             }

        public void DisplayStudentDetails(Student stud) {
            System.out.println("The entered Student Details are:");
            System.out.println("\n");
            System.out.println("Student_RollNumber :"+ " "+stud.RollNumber);
            System.out.println("Student_name :"+" "+stud.StudentName);
            for (int i=0;i<stud.subjects.size();i++) {
               Subject subject = stud.subjects.get(i);
               System.out.println(subject.SubjectName+"="+subject.mark);
                }
             System.out.println("Total mark in all the subjects :"+" "+stud.TotalMark);
             System.out.println("Averageof all the subjects :" +" "+stud.Averages);
             System.out.println("Grade for total mark :" +" "+stud.Grade);
             System.out.println("\n");
        }

}
