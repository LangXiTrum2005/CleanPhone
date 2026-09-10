package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Path;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.py, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4358py implements InterfaceC2727Rj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4859a;
    public final Path.FillType b;
    public final F4 c;
    public final F4 d;
    public final F4 e;
    public final F4 f;
    public final String g;
    public final boolean h;

    public C4358py(String str, int i, Path.FillType fillType, F4 f4, F4 f5, F4 f6, F4 f7, boolean z) {
        this.f4859a = i;
        this.b = fillType;
        this.c = f4;
        this.d = f5;
        this.e = f6;
        this.f = f7;
        this.g = str;
        this.h = z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2727Rj
    public final InterfaceC2546Kj a(C3160cK c3160cK, MJ mj, B9 b9) {
        return new C4446qy(c3160cK, mj, b9, this);
    }
}
