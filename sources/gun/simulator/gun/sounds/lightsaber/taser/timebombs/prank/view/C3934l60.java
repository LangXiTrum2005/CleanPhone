package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.l60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3934l60 implements InterfaceC2727Rj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4631a;
    public final G4 b;
    public final List c;
    public final F4 d;
    public final F4 e;
    public final G4 f;
    public final int g;
    public final int h;
    public final float i;
    public final boolean j;

    public C3934l60(String str, G4 g4, ArrayList arrayList, F4 f4, F4 f5, G4 g5, int i, int i2, float f, boolean z) {
        this.f4631a = str;
        this.b = g4;
        this.c = arrayList;
        this.d = f4;
        this.e = f5;
        this.f = g5;
        this.g = i;
        this.h = i2;
        this.i = f;
        this.j = z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2727Rj
    public final InterfaceC2546Kj a(C3160cK c3160cK, MJ mj, B9 b9) {
        return new C3266da0(c3160cK, b9, this);
    }
}
