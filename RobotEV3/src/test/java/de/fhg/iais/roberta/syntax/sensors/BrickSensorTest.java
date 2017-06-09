package de.fhg.iais.roberta.syntax.sensors;

import org.junit.Test;

import de.fhg.iais.roberta.util.test.ev3.Helper;

public class BrickSensorTest {
    Helper h = new Helper();

    @Test
    public void isPressed() throws Exception {
        String a = "\nhal.isPressed(BrickKey.ENTER)}";

        this.h.assertCodeIsOk(a, "/syntax/sensors/sensor_brick1.xml");
    }
}
