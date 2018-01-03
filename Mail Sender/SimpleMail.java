import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import java.math.BigInteger;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SimpleMail {
   public static void main(String[] args) {
      // Recipient's email ID needs to be mentioned.
      String to = "pavandinu007@gmail.com";

      // Sender's email ID needs to be mentioned
      String from = "pavandinu007@gmail.com";
      final String username = "pavandinu007";//change accordingly
      final String password = "**********";//change accordingly

      // Assuming you are sending email through relay.jangosmtp.net
      String host = "smtp.gmail.com";

      Properties props = new Properties();
      props.put("mail.smtp.auth", "true");
      props.put("mail.smtp.starttls.enable", "true");
      props.put("mail.smtp.host", host);
      props.put("mail.smtp.port", "587");

      // Get the Session object.
      Session session = Session.getInstance(props,
         new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
               return new PasswordAuthentication(username, password);
	   }
         });

      try {
	   // Create a default MimeMessage object.
	   Message message = new MimeMessage(session);
	
	   // Set From: header field of the header.
	   message.setFrom(new InternetAddress(from));
	
	   // Set To: header field of the header.
	   message.setRecipients(Message.RecipientType.TO,
               InternetAddress.parse(to));
	
	   // Set Subject: header field
	   message.setSubject("Testing......");
	
	   // Now set the actual message
	   String str="namasthe";
	   message.setText("namasthe");
		BigInteger b= new BigInteger("12657632653672576523671253712897896778967868868767987677876878678868767878371256376123561251878786876876876876787678686776772589823902809872389197382378");
	   // Send message
	   for(int i=0;i<3;i++){
		    b=b.nextProbablePrime();
			String s=b.toString();
			message.setContent("<html><head><style>div.cities {    background-color: black;    color: white;    margin: 20px 0 20px 0;    padding: 20px;}</style></head><body><div class='cities'><h2>London</h2><p>London is the capital of England. It is the most populous city in the United Kingdom, with a metropolitan area of over 13 million inhabitants.</p><p>Standing on the River Thames, London has been a major settlement for two millennia, its history going back to its founding by the Romans, who named it Londinium.</p></div> <div class='cities'><h2>Paris</h2><p>Paris is the capital and most populous city of France.</p><p>Situated on the Seine River, it is at the heart of the Île-de-France region, also known as the région parisienne.</p><p>Within its metropolitan area is one of the largest population centers in Europe, with over 12 million inhabitants.</p></div><div class='cities'><h2>Tokyo</h2><p>Tokyo is the capital of Japan, the center of the Greater Tokyo Area, and the most populous metropolitan area in the world.</p><p>It is the seat of the Japanese government and the Imperial Palace, and the home of the Japanese Imperial Family.</p><p>The Tokyo prefecture is part of the world's most populous metropolitan area with 38 million people and the world's largest urban economy.</p></div></body></html>","text/html");
			Transport.send(message);
	   }
	   System.out.println("Sent message successfully....");

      } catch (MessagingException e) {
         throw new RuntimeException(e);
      }
   }
}