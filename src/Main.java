public class Main {

        public static void main(String[] args){
            Gryffindor harryPotter = new Gryffindor("Harry Potter", 10,40, 60, 70, 90);
            Gryffindor germiona = new Gryffindor("Germiona", 25, 85, 46, 71, 19);
            Puffendui sydricDiggori = new Puffendui("Sygric Diggori", 21, 36, 87, 34, 12);
            Puffendui djastinFinch = new Puffendui("Djastin Finch", 22, 34, 97, 24, 62);
            Kogtevran padmaPatil = new Kogtevran("Padma Patil", 12, 87, 25, 14, 36, 8);
            Kogtevran makrusBelby = new Kogtevran("Makrus Belby", 23, 89, 85, 24, 66, 1);
            Slizerin drakoMalfoi = new Slizerin("Drako Malfoi", 82, 66, 46, 37, 28, 19, 25);
            Slizerin grigoriyGoil = new Slizerin("Grigoriy Goil", 92, 16, 46, 27, 28, 9, 45);
            System.out.println(harryPotter);
            System.out.println(germiona);
            harryPotter.compareStudents(germiona);
            System.out.println();
            System.out.println(sydricDiggori);
            System.out.println(djastinFinch);
            sydricDiggori.compareStudents(djastinFinch);
            System.out.println();
            System.out.println(padmaPatil);
            System.out.println(makrusBelby);
            padmaPatil.compareStudents(makrusBelby);
            System.out.println();
            System.out.println(drakoMalfoi);
            System.out.println(grigoriyGoil);
            drakoMalfoi.compareStudents(grigoriyGoil);
            System.out.println();
        }
        }
