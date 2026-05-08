package chainOfResponsibility;

public class NotificatorEmail extends Notificator{
    @Override
    public void trimiteNotificari(Client client, String mesaj) {
        if(client.getEmail() != null && !client.getEmail().isEmpty()) {
            System.out.println(client.getNume() + "a primit notificarea " + mesaj + "prin email." );
        } else if (super.getSuccesor() != null) {
            super.getSuccesor().trimiteNotificari(client, mesaj);
        } else {
            System.out.println("Clientul nu are email si nu exista succesor");
        }
    }
}
