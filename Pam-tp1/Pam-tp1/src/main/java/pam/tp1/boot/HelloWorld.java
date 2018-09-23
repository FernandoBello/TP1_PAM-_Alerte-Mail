package pam.tp1.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pam.tp1.advancedTools.IAdvancedToolsMessage;
import pam.tp1.format.IRemoveLineMessage;

@Configuration
public class HelloWorld {
    
    public static void main(String[] args) throws Exception {
    		ApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:spring/application-config.xml");
	
    		SpringApplication.run(HelloWorld.class, args);

    		/*IFormatMessage formater = (IFormatMessage) context.getBean("message_id");
            String m = new String("H     e    l   l    o");
            System.out.println(formater.formatMessage(m));


            ISendMessage sender = (ISendMessage) context.getBean("mail_id");
            sender.sendMessage("Alert Message Text");*/

            IRemoveLineMessage remover = (IRemoveLineMessage) context.getBean("remove_id");
            String m2 = new String("This \n is \n an\n exemple.\n");
            System.out.println("Message 2 IN: "+m2);
            System.out.println("Message 2 OUT: "+remover.removeLineMessage(m2));

            IAdvancedToolsMessage advanceFormatter = (IAdvancedToolsMessage) context.getBean("advanced_id");
            String m3 = new String("H     e    l   l    o     :    This     is       an                 exemple.");
            advanceFormatter.advancedToolMessage(m3);
    }
}

