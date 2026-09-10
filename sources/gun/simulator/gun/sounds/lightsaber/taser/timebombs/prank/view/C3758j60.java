package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.j60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3758j60 implements InterfaceC2727Rj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4536a;
    public final int b;
    public final F4 c;
    public final boolean d;

    public C3758j60(String str, int i, F4 f4, boolean z) {
        this.f4536a = str;
        this.b = i;
        this.c = f4;
        this.d = z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2727Rj
    public final InterfaceC2546Kj a(C3160cK c3160cK, MJ mj, B9 b9) {
        return new C2966a60(c3160cK, b9, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapePath{name=");
        sb.append(this.f4536a);
        sb.append(", index=");
        return DM.k(sb, this.b, '}');
    }
}
