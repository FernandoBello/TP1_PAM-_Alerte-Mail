package pam.tp1.format;

public class RemoveLineMessage implements IRemoveLineMessage{

    public int nb;

    @Override
    public String removeLineMessage(String msg){
        String mAux = new String(msg.replaceAll("\n+","!+!"));
        return mAux;
    }


}
