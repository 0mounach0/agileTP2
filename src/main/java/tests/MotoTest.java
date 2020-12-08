package tests;

import models.Moto;
import models.Rider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MotoTest {

    private Moto motoRenamed;
    private Moto moto2;
    private Moto moto3;
    private Moto moto4;
    private Rider rider1;
    private Rider rider2;

    @BeforeEach
    void setUp() {
        motoRenamed = new Moto("YAMAHA", "MT-07");
        moto2 = new Moto("YAMAHA", "YZF R125");
        moto3 = new Moto("KAWAZAKI", "Z1000");
        moto4 = new Moto("SUZUKI", "GSX R1000");
        rider1 = new Rider("RYM GASSI");
        rider2 = new Rider("Mouad MOUNACH");
        motoRenamed.setMyRider(rider1);
        rider1.addMoto(motoRenamed);
        moto3.setMyRider(rider1);
        rider1.addMoto(moto3);
        moto2.setMyRider(rider2);
        rider2.addMoto(moto2);
        moto4.setMyRider(rider2);
        rider2.addMoto(moto4);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testMethode() {

        System.out.print("moto1 rider : ");
        System.out.println(motoRenamed.toString_w_rider());
        System.out.print("moto3 rider : ");
        System.out.println(moto3.toString_w_rider());
        System.out.print("rider1 motos : ");
        System.out.println(rider1.toString_myMoto());
        System.out.println();
        System.out.print("moto2 rider : ");
        System.out.println(moto2.toString_w_rider());
        System.out.print("moto4 rider : ");
        System.out.println(moto4.toString_w_rider());
        System.out.print("rider2 motos : ");
        System.out.println(rider2.toString_myMoto());
    }
}