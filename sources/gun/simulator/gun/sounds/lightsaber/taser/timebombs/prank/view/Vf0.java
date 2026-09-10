package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;

/* JADX INFO: loaded from: classes4.dex */
public class Vf0 extends P40 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vf0(String str, int i) {
        super(str);
        if (i != 1) {
        } else {
            AbstractC2995aW.q(str, PglCryptUtils.KEY_MESSAGE);
            super(str);
        }
    }

    public Vf0(int i) {
        this(AbstractC3950lJ.p("An unknown field for index ", i), 0);
    }
}
