package io.github.Emanuel.ArquiteturaSpring.Montadora;

import java.awt.*;

public class BYDKing extends Carro {
    public BYDKing(Motor motor) {
        super(motor);

        setModelo("BYDKing");
        setCor(Color.BLUE);
        setMontadora(Montadora.BYD);


    }
}
