public class AgeUserCheckServer implements IUserCheckService {

    //Method

    @Override
    public boolean CheckUser(User user) {
        public boolean checkUser (User user){

            if (user.getAge() >= 18) {
                return true;

            }
            return false;

        }
    }

}
