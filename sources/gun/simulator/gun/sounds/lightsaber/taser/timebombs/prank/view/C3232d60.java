package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Path;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.d60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3232d60 implements InterfaceC2727Rj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4258a;
    public final Path.FillType b;
    public final String c;
    public final F4 d;
    public final F4 e;
    public final boolean f;

    public C3232d60(String str, boolean z, Path.FillType fillType, F4 f4, F4 f5, boolean z2) {
        this.c = str;
        this.f4258a = z;
        this.b = fillType;
        this.d = f4;
        this.e = f5;
        this.f = z2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2727Rj
    public final InterfaceC2546Kj a(C3160cK c3160cK, MJ mj, B9 b9) {
        return new C3476fu(c3160cK, b9, this);
    }

    public final String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f4258a + '}';
    }
}
