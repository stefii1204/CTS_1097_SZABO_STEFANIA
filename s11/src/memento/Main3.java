import memento.Autobuz;
import memento.AutobuzMemento;

void main() {
Autobuz a1=new Autobuz("mercedes",2000,40,"Vasi",234.9);
        System.out.println(a1);


AutobuzMemento autobuzMemento= a1.salvareMemento();
        a1.setNumeSofer("Dan");
        a1.setConsumMediu(250.1);
        System.out.println(a1);

        a1.restaurareMemento(autobuzMemento);
        System.out.println(a1);


}