package chainOfResponsibility;

public class NotificatorManager extends Notificator{
    @Override
    public void trimiteNotificari(Client client, String mesaj) {
        System.out.println(client.getNume() + " nu are nici numar de telefon si nici email. A fost trimisa o notificare managerului.");
    }
}
