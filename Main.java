import javax.mail.MessagingException;

public class Main {

    public static void main(String[] args){

        JTM jtm = new JTM();
        try {
            jtm.sendJTM("New Mail Library","The Body of the email"
                    ,"youremail@gmail.com","yourpassword","receiveremail");
        } catch (MessagingException e) {
            e.printStackTrace();
        }

    }
}
