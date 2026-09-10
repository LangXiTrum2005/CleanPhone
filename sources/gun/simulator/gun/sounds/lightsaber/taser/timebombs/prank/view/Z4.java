package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes2.dex */
public final class Z4 extends AbstractC3052b5 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z4(int i, int i2, int i3, int i4) {
        super(i, i2, i3, 23);
        this.f = i4;
        switch (i4) {
            case 1:
                super(i, i2, i3, 26);
                break;
            case 2:
                super(i, i2, i3, 21);
                break;
            case 3:
                super(i, i2, i3, 24);
                break;
            case 4:
                super(i, i2, i3, 27);
                break;
            case 5:
                super(i, i2, i3, 22);
                break;
            case 6:
                super(i, i2, i3, 25);
                break;
            default:
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3052b5
    public final float n(C4049mU c4049mU) {
        int i = this.f;
        C4137nU c4137nU = c4049mU.f4695a;
        switch (i) {
            case 0:
                return c4137nU.n;
            case 1:
                return c4137nU.q;
            case 2:
                return c4137nU.l;
            case 3:
                return 1.0f / c4137nU.o;
            case 4:
                return c4137nU.r;
            case 5:
                return c4137nU.m;
            default:
                return c4137nU.p;
        }
    }
}
