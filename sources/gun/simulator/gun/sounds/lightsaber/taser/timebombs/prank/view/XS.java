package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public final class XS extends AbstractC4887w implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3971lc[] f3969a;
    public final int[] b;

    public XS(C3971lc[] c3971lcArr, int[] iArr) {
        this.f3969a = c3971lcArr;
        this.b = iArr;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3658i
    public final int a() {
        return this.f3969a.length;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3658i, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C3971lc) {
            return super.contains((C3971lc) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f3969a[i];
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4887w, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C3971lc) {
            return super.indexOf((C3971lc) obj);
        }
        return -1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4887w, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C3971lc) {
            return super.lastIndexOf((C3971lc) obj);
        }
        return -1;
    }
}
