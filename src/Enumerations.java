public class Enumerations {

    enum Role {
        USER(NameE.OANH),
        ADMIN(NameE.TUAN);
        private NameE nameE;
        Role(NameE nameE){
            this.nameE  = nameE;
        }
    }
    public static void main(String[] args) {
        Enumerations enumerations = new Enumerations();
        System.out.println(Role.ADMIN.nameE);
        System.out.println("USER: "+ Role.USER.nameE);
    }
}
