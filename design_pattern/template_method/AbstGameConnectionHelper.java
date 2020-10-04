public abstract class AbstGameConnectionHelper {

    protected abstract String doSecurity(String string);
    protected abstract boolean authentication(String id, String password);
    protected abstract int authorization(String userName);
    protected abstract String connection(String info);

    public String requestConnection(String encodedInfo) {
        
        // 보안 작업 -> 암호화 된 문자열을 복호화한다.
        String decodedInfo = doSecurity(encodedInfo);

        String id = "add";
        String password = "bbb";

        // 반환된 것을 가지고 아이디, 암호를 할당한다.
        if(!authentication(id, password)) {
            throw new Error("password invalid");
        }
        
        
        String userName = "";
        int i = authorization(userName);

        switch(i) {
            case 0:
                System.out.println("game manager");
                break;
            case 1:
                System.out.println("payed user");
                break;
            case 2:
                System.out.println("free user");
                break;
            case 3:
                System.out.println("no authentication");
                break;
            default:
                System.out.println("defualt");

        }

        return connection(decodedInfo);
    }
}