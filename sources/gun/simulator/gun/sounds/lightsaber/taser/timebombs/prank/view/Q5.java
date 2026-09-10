package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class Q5 extends AbstractC5180zI {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q5(D40 d40, int i) {
        super(d40);
        this.c = i;
        if (i == 1) {
            AbstractC2995aW.q(d40, "elementDesc");
            super(d40);
        } else if (i == 2) {
            AbstractC2995aW.q(d40, "elementDesc");
            super(d40);
        } else if (i != 3) {
            AbstractC2995aW.q(d40, "elementDesc");
        } else {
            AbstractC2995aW.q(d40, "elementDesc");
            super(d40);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D40
    public final String h() {
        switch (this.c) {
            case 0:
                return "kotlin.Array";
            case 1:
                return "kotlin.collections.ArrayList";
            case 2:
                return "kotlin.collections.HashSet";
            default:
                return "kotlin.collections.LinkedHashSet";
        }
    }
}
