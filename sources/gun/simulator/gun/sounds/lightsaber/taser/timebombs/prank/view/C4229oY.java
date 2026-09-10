package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.oY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4229oY extends KC {
    public final transient FC c;
    public final transient AC d;

    public C4229oY(FC fc, C4317pY c4317pY) {
        this.c = fc;
        this.d = c4317pY;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.KC, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4822vC
    public final AC a() {
        return this.d;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4822vC
    public final int b(int i, Object[] objArr) {
        return this.d.b(i, objArr);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4822vC, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.c.get(obj) != null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4822vC
    public final boolean f() {
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4822vC
    /* JADX INFO: renamed from: g */
    public final Yf0 iterator() {
        return this.d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((C4405qY) this.c).f;
    }
}
