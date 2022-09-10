public class Slizerin extends Hogwarts {
    @Override
    public String toString() {
        return "я студент: факультета Slizerin " + fullName + ", мои качества: " +
                "trick=" + trick +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", authoritativeness=" + authoritativeness +
                ", magic=" + magic +
                ", teleport=" + teleport ;
    }

    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int authoritativeness;


    public Slizerin(String fullName, int magic, int teleport, int trick, int determination, int ambition, int resourcefulness, int authoritativeness) {

        if (trick < 0 || trick > 100) {
            System.out.println(" Неверное знаяение");
        }
        if (determination < 0 || determination > 100) {
            System.out.println(" Неверное знаяение");
        }
        if (ambition < 0 || ambition > 100) {
            System.out.println(" Неверное знаяение");
        }
        if (resourcefulness < 0 || resourcefulness > 100) {
            System.out.println(" Неверное знаяение");
        }
        if (authoritativeness < 0 || authoritativeness > 100) {
            System.out.println(" Неверное знаяение");
        }
        this.fullName = fullName;
        this.magic = magic;
        this.teleport = teleport;
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.authoritativeness = authoritativeness;
    }

    public void compareStudents(Slizerin studentSecond ){
        int powerOne = this.trick + this.determination + this.ambition + this.resourcefulness + this.authoritativeness;
        int powerTwo = studentSecond.trick + studentSecond.determination + studentSecond.ambition
                + studentSecond.resourcefulness + studentSecond.authoritativeness;
        if (powerOne > powerTwo) {
            System.out.println(this.fullName + " сильнее чем "+ studentSecond.fullName);
        }else if (powerTwo > powerOne){
            System.out.println(studentSecond.fullName + " сильнее чем "+ this.fullName);
        }else {
            System.out.println(this.fullName + " сильный, как и  "+ studentSecond.fullName);
        }
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        if (trick < 0 || trick > 100) {
            System.out.println(" Неверное знаяение");
        }
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        if (determination < 0 || determination > 100) {
            System.out.println(" Неверное знаяение");
        }
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        if (ambition < 0 || ambition > 100) {
            System.out.println(" Неверное знаяение");
        }
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        if (resourcefulness < 0 || resourcefulness > 100) {
            System.out.println(" Неверное знаяение");
        }
        this.resourcefulness = resourcefulness;
    }

    public int getAuthoritativeness() {
        return authoritativeness;
    }

    public void setAuthoritativeness(int authoritativeness) {
        if (authoritativeness < 0 || authoritativeness > 100) {
            System.out.println(" Неверное знаяение");
        }
        this.authoritativeness = authoritativeness;
    }
}
