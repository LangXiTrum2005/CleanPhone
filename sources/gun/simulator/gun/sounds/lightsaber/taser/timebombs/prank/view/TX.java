package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes.dex */
public final class TX implements InterfaceC2727Rj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3775a = 1;
    public final String b;
    public final G4 c;
    public final boolean d;
    public final O4 e;
    public final Object f;

    public TX(String str, G4 g4, G4 g5, M4 m4, boolean z) {
        this.b = str;
        this.c = g4;
        this.e = g5;
        this.f = m4;
        this.d = z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2727Rj
    public final InterfaceC2546Kj a(C3160cK c3160cK, MJ mj, B9 b9) {
        switch (this.f3775a) {
            case 0:
                return new SX(c3160cK, b9, this);
            default:
                return new AY(c3160cK, b9, this);
        }
    }

    public final String toString() {
        switch (this.f3775a) {
            case 0:
                return "RectangleShape{position=" + this.e + ", size=" + ((O4) this.f) + '}';
            default:
                return super.toString();
        }
    }

    public TX(String str, O4 o4, F4 f4, G4 g4, boolean z) {
        this.b = str;
        this.e = o4;
        this.f = f4;
        this.c = g4;
        this.d = z;
    }
}
