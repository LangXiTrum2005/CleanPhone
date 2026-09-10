package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4621sy implements InterfaceC2727Rj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5006a;
    public final int b;
    public final F4 c;
    public final F4 d;
    public final F4 e;
    public final F4 f;
    public final G4 g;
    public final int h;
    public final int i;
    public final float j;
    public final List k;
    public final G4 l;
    public final boolean m;

    public C4621sy(String str, int i, F4 f4, F4 f5, F4 f6, F4 f7, G4 g4, int i2, int i3, float f, ArrayList arrayList, G4 g5, boolean z) {
        this.f5006a = str;
        this.b = i;
        this.c = f4;
        this.d = f5;
        this.e = f6;
        this.f = f7;
        this.g = g4;
        this.h = i2;
        this.i = i3;
        this.j = f;
        this.k = arrayList;
        this.l = g5;
        this.m = z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2727Rj
    public final InterfaceC2546Kj a(C3160cK c3160cK, MJ mj, B9 b9) {
        return new C4709ty(c3160cK, b9, this);
    }
}
