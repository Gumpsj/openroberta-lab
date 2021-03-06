package de.fhg.iais.roberta.ast.syntax.actors;

import org.junit.Test;

import de.fhg.iais.roberta.util.test.nxt.HelperNxtForXmlTest;

public class SetMotorSpeedActionTest {
    private final HelperNxtForXmlTest h = new HelperNxtForXmlTest();

    @Test
    public void setMotorSpeed() throws Exception {
        final String a = "OnFwdRegEx(OUT_B,SpeedTest(30),OUT_REGMODE_SPEED,RESET_NONE);";

        this.h.assertCodeIsOk(a, "/ast/actions/action_MotorSetPower.xml");
    }
}