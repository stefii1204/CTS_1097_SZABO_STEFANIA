package chainOfResponsibility;

public abstract class Notificator {
    private Notificator succesor;

    public void setSuccesor(Notificator succesor) {
        this.succesor = succesor;
    }

    public Notificator getSuccesor() {
        return succesor;
    }

    public abstract void trimiteNotificari(Client client, String mesaj);
}
