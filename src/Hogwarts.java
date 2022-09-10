public abstract class Hogwarts {
    @Override
    public String toString() {
        return "я студент:" + fullName + ", мои качества: " +
                ", magic=" + magic +
                ", teleport=" + teleport;
    }

      String fullName;
      int magic;
      int teleport;

    public static void compareStudents(Hogwarts studentFirst,Hogwarts studentSecond ){
        int powerOne = studentFirst.magic + studentFirst.teleport;
        int powerTwo = studentSecond.magic + studentSecond.teleport;
        if (powerOne > powerTwo) {
            System.out.println(studentFirst.fullName + " сильнее чем "+ studentSecond.fullName);
        }else if (powerTwo > powerOne){
            System.out.println(studentSecond.fullName + " сильнее чем "+ studentFirst.fullName);
        }else {
            System.out.println(studentSecond.fullName + " сильный, как и  "+ studentFirst.fullName);
        }
    }



    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        if (magic < 0 || magic > 100) {
            throw new RuntimeException("неверное значение колдовства");
        }
        this.magic = magic;
    }

    public int getTeleport() {
        return teleport;
    }

    public void setTeleport(int teleport) {
        if (teleport < 0 || teleport > 100) {
            throw new RuntimeException("неверное значение телепортации");
        }
        this.teleport = teleport;
    }

}
