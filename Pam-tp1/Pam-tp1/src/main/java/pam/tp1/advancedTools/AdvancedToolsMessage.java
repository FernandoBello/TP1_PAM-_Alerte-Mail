package pam.tp1.advancedTools;

import org.springframework.beans.factory.annotation.Autowired;
import pam.tp1.alert.SendMessage;
import pam.tp1.format.FormatMessage;

public class AdvancedToolsMessage implements IAdvancedToolsMessage{
    @Autowired
    public FormatMessage formatMessage;

    @Autowired
    public SendMessage sendMessage;

    @Override
    public void advancedToolMessage(String msg) {
        String mAux = new String(formatMessage.formatMessage(msg));
        sendMessage.sendMessage(mAux);
    }
}
