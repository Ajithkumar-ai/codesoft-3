package Subject_Entity;

public class Subject {
    public int subjectId;
    public String SubjectName;
    public int mark;

    public  Subject(int id,String name)
    {
        this.subjectId=id;
        this.SubjectName=name;
    }
    public  void SetMarks(int marks)
    {
        this.mark=marks;
    }
    
}
