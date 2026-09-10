package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4492rY extends KC {
    public static final Object[] h = null;
    public static final C4492rY i;
    public final transient Object[] c;
    public final transient int d;
    public final transient Object[] e;
    public final transient int f;
    public final transient int g;

    static {
        Object[] objArr = new Object[0];
        i = new C4492rY(objArr, 0, objArr, 0, 0);
    }

    public C4492rY(Object[] objArr, int i2, Object[] objArr2, int i3, int i4) {
        this.c = objArr;
        this.d = i2;
        this.e = objArr2;
        this.f = i3;
        this.g = i4;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4822vC
    public final int b(int i2, Object[] objArr) {
        Object[] objArr2 = this.c;
        int i3 = this.g;
        System.arraycopy(objArr2, 0, objArr, i2, i3);
        return i2 + i3;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4822vC
    public final Object[] c() {
        return this.c;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4822vC, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.e;
            if (objArr.length != 0) {
                int iC0 = FW.c0(obj);
                while (true) {
                    int i2 = iC0 & this.f;
                    Object obj2 = objArr[i2];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iC0 = i2 + 1;
                }
            }
        }
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4822vC
    public final int d() {
        return this.g;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4822vC
    public final int e() {
        return 0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4822vC
    public final boolean f() {
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4822vC
    /* JADX INFO: renamed from: g */
    public final Yf0 iterator() {
        return a().listIterator(0);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.KC, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.KC
    public final AC k() {
        return AC.h(this.g, this.c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.g;
    }
}
