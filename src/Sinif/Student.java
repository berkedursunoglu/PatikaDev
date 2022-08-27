package Sinif;

public class Student {

    String name,classes;
    int stuNo;
    Course mat;
    Course fizik;
    Course kimya;
    double avarange;
    boolean isPass;


    Student(String name,int stuNo,String classes,Course mat,Course fizik,Course kimya){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
    }

    void isPass(){
        this.avarange = (((this.fizik.note*0.8)+(this.fizik.verbalGrade*0.2)) + ((this.mat.note*0.8)+(this.mat.verbalGrade*0.2))+((this.kimya.note*0.8)+(this.kimya.verbalGrade*0.2))) /3;
    }

    void  calcAvarange(){
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarange);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }

    }

    public boolean isCheckPass() {
        calcAvarange();
        return this.avarange > 55;
    }

    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }

    void printNote(){
        System.out.println("Öğrenci:"+this.name);
        System.out.println("zNotunu: "+this.mat.note);
        System.out.println("zNotunu: "+this.fizik.note);
        System.out.println("zNotunu: "+this.kimya.note);
    }

}
