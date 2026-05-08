package chainOfResponsibility;

public class NotificatorSMS extends Notificator {
    @Override
    public void trimiteNotificari(Client client, String mesaj) {
        if(client.getEmail() != null && client.getTelefon().isEmpty()) {
            System.out.println(client.getNume() + "a primit notificarea " + mesaj + "prin sms." );
        } else if (super.getSuccesor() != null) {
            super.getSuccesor().trimiteNotificari(client, mesaj);
        } else {
            System.out.println("Clientul nu are numar de telefon si nu exista succesor");
        }
    }
}
