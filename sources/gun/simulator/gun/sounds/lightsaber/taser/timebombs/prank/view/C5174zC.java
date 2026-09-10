package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.zC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5174zC extends AC {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ AC e;

    public C5174zC(AC ac, int i, int i2) {
        this.e = ac;
        this.c = i;
        this.d = i2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4822vC
    public final Object[] c() {
        return this.e.c();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4822vC
    public final int d() {
        return this.e.e() + this.c + this.d;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4822vC
    public final int e() {
        return this.e.e() + this.c;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4822vC
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        FW.j(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AC, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4822vC, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AC, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AC, java.util.List
    /* JADX INFO: renamed from: s */
    public final AC subList(int i, int i2) {
        FW.r(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AC, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
