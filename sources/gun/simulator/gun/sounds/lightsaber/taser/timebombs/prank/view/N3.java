package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class N3 {
    private N3() {
    }

    public /* synthetic */ N3(AbstractC2471Hm abstractC2471Hm) {
        this();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    public final O3 fromAge$vungle_ads_release(int i) {
        for (O3 o3 : O3.values()) {
            C5175zD range = o3.getRange();
            int i2 = range.f5212a;
            if (i <= range.b && i2 <= i) {
                if (o3 == null) {
                    return O3.OTHERS;
                }
                return o3;
            }
        }
        o3 = null;
        if (o3 == null) {
            return O3.OTHERS;
        }
        return o3;
    }
}
