public class Gryffindor extends Hogwarts {
    @Override
    public String toString() {
        return "я студент факультета Gryffindor: " + fullName + ", мои качества: " +
                "honor=" + honor +
                ", nobility=" + nobility +
                ", bravery=" + bravery +
                ", magic=" + magic +
                ", teleport=" + teleport;
    }

    private int honor;
    private int nobility;
    private int bravery;



    public Gryffindor(String fullName,int magic,int teleport, int honor, int nobility, int bravery) {
        if (honor < 0 || honor > 100) {
            System.out.println(" Неверное знаяение");
        }
        if (nobility < 0 || nobility > 100) {
            System.out.println(" Неверное знаяение");
        }
        if (bravery < 0 || bravery > 100) {
            System.out.println(" Неверное знаяение");
        }
        this.fullName = fullName;
        this.magic = magic;
        this.teleport = teleport;
        this.honor = honor;
        this.nobility = nobility;
        this.bravery = bravery;
    }


    public void compareStudents(Gryffindor studentSecond ){
        int powerOne = this.honor + this.nobility + this.bravery;
        int powerTwo = studentSecond.honor + studentSecond.nobility + studentSecond.bravery;
        if (powerOne > powerTwo) {
            System.out.println(this.fullName + " сильнее чем "+ studentSecond.fullName);
        }else if (powerTwo > powerOne){
            System.out.println(studentSecond.fullName + " сильнее чем "+ this.fullName);
        }else {
            System.out.println(this.fullName + " сильный, как и  "+ studentSecond.fullName);
        }
    }





    public void setHonor(int honor) {
        if (honor < 0 || honor > 100) {
            System.out.println(" Неверное знаяение");
        }
        this.honor = honor;
    }

    public void setNobility(int nobility) {
        if (nobility < 0 || nobility > 100) {
            System.out.println(" Неверное знаяение");
        }
        this.nobility = nobility;
    }

    public void setBravery(int bravery) {
        if (bravery < 0 || bravery > 100) {
            System.out.println(" Неверное знаяение");
        }
        this.bravery = bravery;
    }
}
