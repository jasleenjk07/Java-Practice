public class StudentClass {
    public static class Student{
        String name;
        private int rno;
        double percentage;

        public int getRno(){
            return rno;
        }

        public void setRno(int roll){
            rno = roll;
        }
    }

    // public static void change(Student s1){
    //     s1.name = "Alice";
    // }
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "John";
        // s1.rno = 1;
        s1.percentage = 92.5;
        // System.out.println(s1.name);
        // change(s1);
        // System.out.println(s1.name);
        // System.out.println(s1.name + " " + s1.rno + " " + s1.percentage);
        System.out.println(s1.getRno());
        s1.setRno(76);
        System.out.println(s1.getRno());
    }
}
