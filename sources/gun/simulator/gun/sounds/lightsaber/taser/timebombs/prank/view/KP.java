package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;

/* JADX INFO: loaded from: classes4.dex */
public enum KP {
    UNDER_500(0, new C5175zD(Integer.MIN_VALUE, 500, 1)),
    FROM_500_TO_1000(1, new C5175zD(501, 1000, 1)),
    FROM_1000_TO_1500(2, new C5175zD(1001, 1500, 1)),
    FROM_1500_TO_2000(3, new C5175zD(1501, 2000, 1)),
    FROM_2000_TO_2500(4, new C5175zD(2001, 2500, 1)),
    FROM_2500_TO_3000(5, new C5175zD(2501, PathInterpolatorCompat.MAX_NUM_POINTS, 1)),
    FROM_3000_TO_3500(6, new C5175zD(3001, 3500, 1)),
    FROM_3500_TO_4000(7, new C5175zD(3501, 4000, 1)),
    FROM_4000_TO_4500(8, new C5175zD(4001, 4500, 1)),
    OVER_4500(9, new C5175zD(4501, Integer.MAX_VALUE, 1));

    public static final JP Companion = new JP(null);
    private final int id;
    private final C5175zD range;

    KP(int i, C5175zD c5175zD) {
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
