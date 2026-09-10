package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ug0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4771ug0 implements Ka0, BI {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5093a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ C4771ug0(int i, KU ku, KU ku2) {
        this.b = i;
        this.c = ku;
        this.d = ku2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ka0
    public final Object execute() {
        C5123yg0 c5123yg0 = (C5123yg0) this.c;
        ((FE) c5123yg0.d).a((Sd0) this.d, this.b + 1, false);
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BI
    public final void invoke(Object obj) {
        int i = this.f5093a;
        Object obj2 = this.d;
        switch (i) {
            case 1:
                JU ju = (JU) obj;
                int i2 = C2736Rs.k0;
                ju.getClass();
                ju.y(this.b, (KU) this.c, (KU) obj2);
                break;
            default:
                ((InterfaceC3579h4) obj).b((C3693iO) obj2);
                break;
        }
    }

    public /* synthetic */ C4771ug0(C3403f4 c3403f4, Object obj, int i) {
        this.c = c3403f4;
        this.d = obj;
        this.b = i;
    }
}
