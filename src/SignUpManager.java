public class SignUpManager {
    public void signUp(User user) {

        AgeUserCheckServer ageUserCheckServer = new AgeUserCheckServer();

        if(ageUserCheckServer.checkUser(user)){

            System.out.println("Kullanici kayit oldu : " + user.getName());
        }
        else {

            System.out.println("Kayit olamadi ");
        }




    }

}
