package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.nY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4141nY extends KC {
    public final transient FC c;
    public final transient Object[] d;
    public final transient int e = 0;
    public final transient int f;

    public C4141nY(FC fc, Object[] objArr, int i) {
        this.c = fc;
        this.d = objArr;
        this.f = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4822vC
    public final int b(int i, Object[] objArr) {
        return a().b(i, objArr);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4822vC, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.c.get(key));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4822vC
    public final boolean f() {
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4822vC
    /* JADX INFO: renamed from: g */
    public final Yf0 iterator() {
        return a().listIterator(0);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.KC
    public final AC k() {
        return new C4053mY(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f;
    }
}
