package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.n60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4110n60 implements InterfaceC2727Rj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4728a;
    public final G4 b;
    public final G4 c;
    public final G4 d;
    public final boolean e;

    public C4110n60(String str, int i, G4 g4, G4 g5, G4 g6, boolean z) {
        this.f4728a = i;
        this.b = g4;
        this.c = g5;
        this.d = g6;
        this.e = z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2727Rj
    public final InterfaceC2546Kj a(C3160cK c3160cK, MJ mj, B9 b9) {
        return new C3362ee0(b9, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.b + ", end: " + this.c + ", offset: " + this.d + "}";
    }
}
