import javax.mail.MessagingException;

public class Main {

    public static void main(String[] args){

        JTM jtm = new JTM();
        try {
            jtm.sendJTM("New Mail Library","The Body of the email"
                    ,"tawfekyassertawfek@gmail.com","02k0181381t","20180075@stud.fci-cu.edu.eg");
        } catch (MessagingException e) {
            e.printStackTrace();
        }

    }
}
