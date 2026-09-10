package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.qH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC4388qH {
    LESS_THAN_ONE_YEAR(0, new C5175zD(Integer.MIN_VALUE, 0, 1)),
    ONE_TO_FIVE_YEARS(1, new C5175zD(1, 5, 1)),
    SIX_TO_TEN_YEARS(2, new C5175zD(6, 10, 1)),
    ELEVEN_TO_TWENTY_YEARS(3, new C5175zD(11, 20, 1)),
    TWENTY_ONE_TO_THIRTY_YEARS(4, new C5175zD(21, 30, 1)),
    THIRTY_ONE_TO_FORTY_YEARS(5, new C5175zD(31, 40, 1)),
    FORTY_ONE_TO_FIFTY_YEARS(6, new C5175zD(41, 50, 1)),
    FIFTY_ONE_TO_SIXTY_YEARS(7, new C5175zD(51, 60, 1)),
    SIXTY_ONE_TO_SEVENTY_YEARS(8, new C5175zD(61, 70, 1)),
    OVER_SEVENTY_ONE_YEARS(9, new C5175zD(71, Integer.MAX_VALUE, 1));

    public static final C4300pH Companion = new C4300pH(null);
    private final int id;
    private final C5175zD range;

    EnumC4388qH(int i, C5175zD c5175zD) {
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
