public class ComplexUserCheckServer implements IUserCheckService {


    @Override
    public boolean CheckUser(User user) {
        public boolean checkUser(User user){

            if(user.getAge() >=18 && user.getName().startsWith("Mu")) {
                return true;

            }
            return false;
        }
    }
}
