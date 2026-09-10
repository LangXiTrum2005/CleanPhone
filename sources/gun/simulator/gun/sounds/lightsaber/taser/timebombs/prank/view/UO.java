package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;

/* JADX INFO: loaded from: classes4.dex */
public enum UO {
    UNDER_100K(0, new C5175zD(Integer.MIN_VALUE, DefaultOggSeeker.MATCH_BYTE_RANGE, 1)),
    FROM_100K_TO_300K(1, new C5175zD(100001, 300000, 1)),
    FROM_300K_TO_500K(2, new C5175zD(300001, 500000, 1)),
    FROM_500K_TO_700K(3, new C5175zD(500001, 700000, 1)),
    FROM_700K_TO_900K(4, new C5175zD(700001, 900000, 1)),
    FROM_900K_TO_1M1(5, new C5175zD(900001, 1100000, 1)),
    FROM_1M1_TO_1M3(6, new C5175zD(1100001, 1300000, 1)),
    FROM_1M3_TO_1M5(7, new C5175zD(1300001, 1500000, 1)),
    FROM_1M5_TO_1M7(8, new C5175zD(1500001, 1700000, 1)),
    OVER_1M7(9, new C5175zD(1700001, Integer.MAX_VALUE, 1));

    public static final TO Companion = new TO(null);
    private final int id;
    private final C5175zD range;

    UO(int i, C5175zD c5175zD) {
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
