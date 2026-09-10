package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Objects;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.pY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4317pY extends AC {
    public final transient Object[] c;
    public final transient int d;
    public final transient int e;

    public C4317pY(Object[] objArr, int i, int i2) {
        this.c = objArr;
        this.d = i;
        this.e = i2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4822vC
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        FW.j(i, this.e);
        Object obj = this.c[(i * 2) + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
