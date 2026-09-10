package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class TO {
    private TO() {
    }

    public /* synthetic */ TO(AbstractC2471Hm abstractC2471Hm) {
        this();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    public final UO fromPrice$vungle_ads_release(int i) {
        for (UO uo : UO.values()) {
            C5175zD range = uo.getRange();
            int i2 = range.f5212a;
            if (i <= range.b && i2 <= i) {
                if (uo == null) {
                    return UO.UNDER_100K;
                }
                return uo;
            }
        }
        uo = null;
        if (uo == null) {
            return UO.UNDER_100K;
        }
        return uo;
    }
}
