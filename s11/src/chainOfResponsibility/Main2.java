import chainOfResponsibility.*;

void main() {
    Client client1 = new Client("Client 1", null, "mail@ase.ro");
    Client client2 = new Client("Client 2", "123", null);
    Client client3 = new Client("Client 3", null, null);

    Notificator notificatorSMS = new NotificatorSMS();
    Notificator notificatorEmail = new NotificatorEmail();
    Notificator notificatorManager = new NotificatorManager();

    notificatorSMS.setSuccesor(notificatorEmail);
    notificatorEmail.setSuccesor(notificatorManager);

    List<Client> clienti = Arrays.asList(client1, client2, client3);
    clienti.forEach(client -> notificatorSMS.trimiteNotificari(client, "Ai primit o notificare"));
}
