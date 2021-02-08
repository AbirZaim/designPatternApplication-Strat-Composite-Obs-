package dp.exam.demo.security;

import org.springframework.stereotype.Component;

@Component
public class SecContext {
    private static String username="";
    private static String password="";
    private static String[] roles= {};

    public static void authenticate(String urs, String pass, String[] r){
        if(urs.equals("root")&&pass.equals("1234")){
            username = urs;
            password = pass;
            roles = r;
        }
        else{
            throw  new RuntimeException("FORBIDEN 403 : Access denied !");
        }
    }

    public static boolean hasRRole(String r){
        for (String role: roles){
            if(role.equals(r)) return true;

        }
        return false;
    }

}
