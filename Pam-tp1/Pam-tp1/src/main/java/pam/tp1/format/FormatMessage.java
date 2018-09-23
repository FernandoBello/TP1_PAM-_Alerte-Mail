package pam.tp1.format;

public class FormatMessage implements IFormatMessage {
    public String formatMessage(String msg){
        return msg.replaceAll("\\s+"," ");
    }
}
