import Command.ComandaInternare;
import Command.ComandaTratareImediata;
import Command.Command;
import Command.Medic;
import Command.OperatorTriaj;

void main() {
    Medic medic1 = new Medic("Mihai");
    Command comanda1 = new ComandaInternare("Maria", medic1);
    Command comanda2 = new ComandaTratareImediata("Ana", medic1);
    Command comanda3 = new ComandaTratareImediata("Cosmin", medic1);
    OperatorTriaj operatorTriaj = new OperatorTriaj();
    operatorTriaj.addComanda(comanda1);
    operatorTriaj.addComanda(comanda2);
    operatorTriaj.addComanda(comanda3);
    operatorTriaj.trimiteComanda();
    operatorTriaj.trimiteComanda();
    operatorTriaj.trimiteComanda();
    operatorTriaj.trimiteComanda();

    operatorTriaj.anuleazaComanda();
    operatorTriaj.anuleazaComanda();
    operatorTriaj.anuleazaComanda();
    operatorTriaj.anuleazaComanda();

    operatorTriaj.refacereComanda();
    operatorTriaj.refacereComanda();
    operatorTriaj.refacereComanda();
    operatorTriaj.refacereComanda();

}

