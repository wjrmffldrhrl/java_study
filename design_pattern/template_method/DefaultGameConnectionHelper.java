public class DefaultGameConnectionHelper extends AbstGameConnectionHelper {

    @Override
    protected String doSecurity(String string) {

        System.out.println("Strong decode");
        // TODO Auto-generated method stub
        return string;
    }

    @Override
    protected boolean authentication(String id, String password) {
        // TODO Auto-generated method stub
        System.out.println("check id/password");
        return true;
    }

    @Override
    protected int authorization(String userName) {
        // TODO Auto-generated method stub
        System.out.println("cehck authentication");
        return 0;
    }

    @Override
    protected String connection(String info) { 
        // TODO Auto-generated method stub

        System.out.println("last connection step");
        return info;
    }
    
}
