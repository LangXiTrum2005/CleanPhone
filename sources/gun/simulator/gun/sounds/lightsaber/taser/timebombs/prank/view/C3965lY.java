package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Objects;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.lY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3965lY extends AC {
    public static final C3965lY e = new C3965lY(new Object[0], 0);
    public final transient Object[] c;
    public final transient int d;

    public C3965lY(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AC, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4822vC
    public final int b(int i, Object[] objArr) {
        Object[] objArr2 = this.c;
        int i2 = this.d;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4822vC
    public final Object[] c() {
        return this.c;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4822vC
    public final int d() {
        return this.d;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4822vC
    public final int e() {
        return 0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4822vC
    public final boolean f() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        FW.j(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
