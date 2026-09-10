package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2424Fr extends WG implements InterfaceC2714Qw {
    public final /* synthetic */ int f;
    public final /* synthetic */ String g;
    public final /* synthetic */ C2450Gr h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2424Fr(int i, String str, C2450Gr c2450Gr) {
        super(0);
        this.f = i;
        this.g = str;
        this.h = c2450Gr;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
    public final Object invoke() {
        int i = this.f;
        D40[] d40Arr = new D40[i];
        for (int i2 = 0; i2 < i; i2++) {
            d40Arr[i2] = AbstractC3375el.i(this.g + '.' + this.h.e[i2], C3442fa0.d, new D40[0], I40.f);
        }
        return d40Arr;
    }
}
