package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.f60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3408f60 implements InterfaceC2727Rj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4351a;
    public final List b;
    public final boolean c;

    public C3408f60(String str, List list, boolean z) {
        this.f4351a = str;
        this.b = list;
        this.c = z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2727Rj
    public final InterfaceC2546Kj a(C3160cK c3160cK, MJ mj, B9 b9) {
        return new C2623Nj(c3160cK, b9, this, mj);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f4351a + "' Shapes: " + Arrays.toString(this.b.toArray()) + '}';
    }
}
