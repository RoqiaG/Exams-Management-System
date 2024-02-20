
package patternproject;



abstract class Notification {

    protected String Message ;
    public Notification(String Msg) {
        this.Message= Msg;
    }
    abstract void send();
}
