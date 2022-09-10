public class Kogtevran extends Hogwarts {

    private  int mind;
    private int wisdom;
    private  int creativity;
    private  int wit;

    @Override
    public String toString() {
        return "я студент: факультета Kogtevran " + fullName + ", мои качества: " +
                "mind=" + mind +
                ", wisdom=" + wisdom +
                ", creativity=" + creativity +
                ", wit=" + wit +
                ", magic=" + magic +
                ", teleport=" + teleport;
    }

    public Kogtevran(String fullName, int magic, int teleport, int mind, int wisdom, int creativity, int wit) {

        if (mind < 0 || mind > 100) {
            System.out.println(" Неверное знаяение");
        }
        if (wisdom < 0 || wisdom > 100) {
            System.out.println(" Неверное знаяение");
        }
        if (creativity < 0 || creativity > 100) {
            System.out.println(" Неверное знаяение");
        }
        if (wit< 0 || wit > 100) {
            System.out.println(" Неверное знаяение");
        }
        this.fullName = fullName;
        this.magic = magic;
        this.teleport = teleport;
        this.mind = mind;
        this.wisdom = wisdom;
        this.creativity = creativity;
        this.wit = wit;
    }



    public void compareStudents(Kogtevran studentSecond ){
        int powerOne = this.mind + this.wisdom + this.creativity+ this.wit;
        int powerTwo = studentSecond.mind + studentSecond.wisdom + studentSecond.creativity + studentSecond.wit;
        if (powerOne > powerTwo) {
            System.out.println(this.fullName + " сильнее чем "+ studentSecond.fullName);
        }else if (powerTwo > powerOne){
            System.out.println(studentSecond.fullName + " сильнее чем "+ this.fullName);
        }else {
            System.out.println(this.fullName + " сильный, как и  "+ studentSecond.fullName);
        }
    }



    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        if (mind < 0 || mind > 100) {
            System.out.println(" Неверное знаяение");
        }
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        if (wisdom < 0 || wisdom > 100) {
            System.out.println(" Неверное знаяение");
        }
        this.wisdom = wisdom;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        if (creativity < 0 || creativity > 100) {
            System.out.println(" Неверное знаяение");
        }
        this.creativity = creativity;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        if (wit< 0 || wit > 100) {
            System.out.println(" Неверное знаяение");
        }
        this.wit = wit;
    }
}
