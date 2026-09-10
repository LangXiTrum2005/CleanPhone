package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.k20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3838k20 extends WG implements InterfaceC2766Sw {
    public final /* synthetic */ int f;
    public final /* synthetic */ C4629t20 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3838k20(C4629t20 c4629t20, int i) {
        super(1);
        this.f = i;
        this.g = c4629t20;
    }

    public final void b(int i) {
        int i2 = this.f;
        C4629t20 c4629t20 = this.g;
        switch (i2) {
            case 0:
                c4629t20.g = i;
                break;
            case 1:
                c4629t20.j = i;
                break;
            case 2:
                c4629t20.i = i;
                break;
            case 3:
                c4629t20.o = i;
                break;
            case 4:
                c4629t20.m = i;
                break;
            case 5:
                c4629t20.n = i;
                break;
            case 6:
                c4629t20.k = i;
                break;
            case 7:
                c4629t20.l = i;
                break;
            default:
                c4629t20.h = i;
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        switch (this.f) {
            case 0:
                b(((Number) obj).intValue());
                break;
            case 1:
                b(((Number) obj).intValue());
                break;
            case 2:
                b(((Number) obj).intValue());
                break;
            case 3:
                b(((Number) obj).intValue());
                break;
            case 4:
                b(((Number) obj).intValue());
                break;
            case 5:
                b(((Number) obj).intValue());
                break;
            case 6:
                b(((Number) obj).intValue());
                break;
            case 7:
                b(((Number) obj).intValue());
                break;
            default:
                b(((Number) obj).intValue());
                break;
        }
        return c5033xf0;
    }
}
