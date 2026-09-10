package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.pH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4300pH {
    private C4300pH() {
    }

    public /* synthetic */ C4300pH(AbstractC2471Hm abstractC2471Hm) {
        this();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    public final EnumC4388qH fromYears$vungle_ads_release(int i) {
        for (EnumC4388qH enumC4388qH : EnumC4388qH.values()) {
            C5175zD range = enumC4388qH.getRange();
            int i2 = range.f5212a;
            if (i <= range.b && i2 <= i) {
                if (enumC4388qH == null) {
                    return EnumC4388qH.LESS_THAN_ONE_YEAR;
                }
                return enumC4388qH;
            }
        }
        enumC4388qH = null;
        if (enumC4388qH == null) {
            return EnumC4388qH.LESS_THAN_ONE_YEAR;
        }
        return enumC4388qH;
    }
}
