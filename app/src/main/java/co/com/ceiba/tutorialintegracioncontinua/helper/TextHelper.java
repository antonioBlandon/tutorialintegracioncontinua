package co.com.ceiba.tutorialintegracioncontinua.helper;

public class TextHelper {

    private static TextHelper helper =null;

    public static TextHelper getInstance(){
        if(helper == null){
            helper = new TextHelper();
        }
        return helper;
    }

    public String getText(int progress){
        if( ( progress >= 0 ) && ( progress < 50 ) ){
            return "low";
        }else{
            return "high";
        }
    }

}
