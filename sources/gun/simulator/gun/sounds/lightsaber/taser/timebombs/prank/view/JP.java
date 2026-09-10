package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class JP {
    private JP() {
    }

    public /* synthetic */ JP(AbstractC2471Hm abstractC2471Hm) {
        this();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    public final KP fromCost$vungle_ads_release(int i) {
        for (KP kp : KP.values()) {
            C5175zD range = kp.getRange();
            int i2 = range.f5212a;
            if (i <= range.b && i2 <= i) {
                if (kp == null) {
                    return KP.UNDER_500;
                }
                return kp;
            }
        }
        kp = null;
        if (kp == null) {
            return KP.UNDER_500;
        }
        return kp;
    }
}
