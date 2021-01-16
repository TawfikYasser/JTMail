# JTMail

###### About the library

This java library to send a simple java mail.

###### How to use it

Just add the JAR file to your project and call the class `JTM` and make an object, Then use it’s public function `sendJTM`

- Using -> IntelliJ IDEA IDE

###### Step 1

Go to `File` -> `Project Structure` -> `Libraries` -> and add the JAR file and click `OK`

![Img](https://github.com/TawfikYasser/JTMail/blob/main/Img1.png)   

###### Step 2

Function `sendJTM` parameters (Subject-Body-yourGmail-yourGmailPassword-recipientEmail)

```Java
        JTM jtm = new JTM();
        try {
            jtm.sendJTM("JTM Subject","JTM Body"
                    ,"yourEmail@gmail.com","yourGmailPassword","Recipient");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
```

###### Finally

I hope you enjoy with this simple library, I will improve it, This is the first version (1.0v) and I will develope more soon.

Thanks.
