package enumertation;

public class Enumerations {

    enum Role {
        USER(NameE.OANH),
        ADMIN(NameE.TUAN),
        CON(NameE.HAI);
        private NameE nameE;
        Role(NameE nameE){
            this.nameE  = nameE;
        }
    }

    enum DayOfGerman {
        MONSTAG(Day.MONDAY),

        DIENSTAG(Day.TUESDAY);
        private Day day;

        DayOfGerman(Day day){this.day = day;}
    }
    public static void main(String[] args) {
        Enumerations enumerations = new Enumerations();
        System.out.println(Role.ADMIN.nameE);
        System.out.println("USER: "+ Role.USER.nameE);

        System.out.println("CON "+Role.CON.nameE);

        System.out.println("Monstag is "+ DayOfGerman.MONSTAG.day);

        System.out.println("Dienstag is "+ DayOfGerman.DIENSTAG.day);
    }
}
