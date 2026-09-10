package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.cV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3171cV extends AbstractC3832k {
    public final int i;
    public final int j;
    public final int[] k;
    public final int[] l;
    public final Gc0[] m;
    public final Object[] n;
    public final HashMap o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3171cV(List list, D60 d60) {
        super(false, d60);
        int iP = 0;
        int size = list.size();
        this.k = new int[size];
        this.l = new int[size];
        this.m = new Gc0[size];
        this.n = new Object[size];
        this.o = new HashMap();
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            FO fo = (FO) it.next();
            this.m[i2] = fo.a();
            this.l[i2] = iP;
            this.k[i2] = i;
            iP += this.m[i2].p();
            i += this.m[i2].i();
            this.n[i2] = fo.getUid();
            this.o.put(this.n[i2], Integer.valueOf(i2));
            i2++;
        }
        this.i = iP;
        this.j = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gc0
    public final int i() {
        return this.j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gc0
    public final int p() {
        return this.i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3832k
    public final int r(Object obj) {
        Integer num = (Integer) this.o.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3832k
    public final int s(int i) {
        return Ug0.e(this.k, i + 1, false, false);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3832k
    public final int t(int i) {
        return Ug0.e(this.l, i + 1, false, false);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3832k
    public final Object u(int i) {
        return this.n[i];
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3832k
    public final int v(int i) {
        return this.k[i];
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3832k
    public final int w(int i) {
        return this.l[i];
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3832k
    public final Gc0 z(int i) {
        return this.m[i];
    }
}
