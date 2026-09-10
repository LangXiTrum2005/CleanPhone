package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ve, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2826Ve implements InterfaceC2727Rj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3881a;
    public final O4 b;
    public final F4 c;
    public final boolean d;
    public final boolean e;

    public C2826Ve(String str, O4 o4, F4 f4, boolean z, boolean z2) {
        this.f3881a = str;
        this.b = o4;
        this.c = f4;
        this.d = z;
        this.e = z2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2727Rj
    public final InterfaceC2546Kj a(C3160cK c3160cK, MJ mj, B9 b9) {
        return new C2682Pq(c3160cK, b9, this);
    }
}
