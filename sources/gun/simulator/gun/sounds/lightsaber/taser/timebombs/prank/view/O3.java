package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public enum O3 {
    AGE_18_20(1, new C5175zD(18, 20, 1)),
    AGE_21_30(2, new C5175zD(21, 30, 1)),
    AGE_31_40(3, new C5175zD(31, 40, 1)),
    AGE_41_50(4, new C5175zD(41, 50, 1)),
    AGE_51_60(5, new C5175zD(51, 60, 1)),
    AGE_61_70(6, new C5175zD(61, 70, 1)),
    AGE_71_75(7, new C5175zD(71, 75, 1)),
    OTHERS(0, new C5175zD(Integer.MIN_VALUE, Integer.MAX_VALUE, 1));

    public static final N3 Companion = new N3(null);
    private final int id;
    private final C5175zD range;

    O3(int i, C5175zD c5175zD) {
        this.id = i;
        this.range = c5175zD;
    }

    public final int getId() {
        return this.id;
    }

    public final C5175zD getRange() {
        return this.range;
    }
}
