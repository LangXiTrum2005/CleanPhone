package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.mV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4050mV implements InterfaceC2727Rj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4696a;
    public final int b;
    public final G4 c;
    public final O4 d;
    public final G4 e;
    public final G4 f;
    public final G4 g;
    public final G4 h;
    public final G4 i;
    public final boolean j;
    public final boolean k;

    public C4050mV(String str, int i, G4 g4, O4 o4, G4 g5, G4 g6, G4 g7, G4 g8, G4 g9, boolean z, boolean z2) {
        this.f4696a = str;
        this.b = i;
        this.c = g4;
        this.d = o4;
        this.e = g5;
        this.f = g6;
        this.g = g7;
        this.h = g8;
        this.i = g9;
        this.j = z;
        this.k = z2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2727Rj
    public final InterfaceC2546Kj a(C3160cK c3160cK, MJ mj, B9 b9) {
        return new C3962lV(c3160cK, b9, this);
    }
}
