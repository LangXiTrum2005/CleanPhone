package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.Pair;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3832k extends Gc0 {
    public static final /* synthetic */ int h = 0;
    public final int e;
    public final D60 f;
    public final boolean g;

    public AbstractC3832k(boolean z, D60 d60) {
        this.g = z;
        this.f = d60;
        this.e = d60.b.length;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gc0
    public final int a(boolean z) {
        if (this.e == 0) {
            return -1;
        }
        int iX = 0;
        if (this.g) {
            z = false;
        }
        if (z) {
            int[] iArr = this.f.b;
            iX = iArr.length > 0 ? iArr[0] : -1;
        }
        while (z(iX).q()) {
            iX = x(iX, z);
            if (iX == -1) {
                return -1;
            }
        }
        return z(iX).a(z) + w(iX);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gc0
    public final int b(Object obj) {
        int iB;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iR = r(obj2);
        if (iR == -1 || (iB = z(iR).b(obj3)) == -1) {
            return -1;
        }
        return v(iR) + iB;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gc0
    public final int c(boolean z) {
        int iY;
        int i = this.e;
        if (i == 0) {
            return -1;
        }
        if (this.g) {
            z = false;
        }
        if (z) {
            int[] iArr = this.f.b;
            iY = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
        } else {
            iY = i - 1;
        }
        while (z(iY).q()) {
            iY = y(iY, z);
            if (iY == -1) {
                return -1;
            }
        }
        return z(iY).c(z) + w(iY);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gc0
    public final int e(int i, int i2, boolean z) {
        if (this.g) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int iT = t(i);
        int iW = w(iT);
        int iE = z(iT).e(i - iW, i2 != 2 ? i2 : 0, z);
        if (iE != -1) {
            return iW + iE;
        }
        int iX = x(iT, z);
        while (iX != -1 && z(iX).q()) {
            iX = x(iX, z);
        }
        if (iX != -1) {
            return z(iX).a(z) + w(iX);
        }
        if (i2 == 2) {
            return a(z);
        }
        return -1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gc0
    public final Ec0 g(int i, Ec0 ec0, boolean z) {
        int iS = s(i);
        int iW = w(iS);
        z(iS).g(i - v(iS), ec0, z);
        ec0.c += iW;
        if (z) {
            Object objU = u(iS);
            Object obj = ec0.b;
            obj.getClass();
            ec0.b = Pair.create(objU, obj);
        }
        return ec0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gc0
    public final Ec0 h(Object obj, Ec0 ec0) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iR = r(obj2);
        int iW = w(iR);
        z(iR).h(obj3, ec0);
        ec0.c += iW;
        ec0.b = obj;
        return ec0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gc0
    public final int l(int i, int i2, boolean z) {
        if (this.g) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int iT = t(i);
        int iW = w(iT);
        int iL = z(iT).l(i - iW, i2 != 2 ? i2 : 0, z);
        if (iL != -1) {
            return iW + iL;
        }
        int iY = y(iT, z);
        while (iY != -1 && z(iY).q()) {
            iY = y(iY, z);
        }
        if (iY != -1) {
            return z(iY).c(z) + w(iY);
        }
        if (i2 == 2) {
            return c(z);
        }
        return -1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gc0
    public final Object m(int i) {
        int iS = s(i);
        return Pair.create(u(iS), z(iS).m(i - v(iS)));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gc0
    public final Fc0 n(int i, Fc0 fc0, long j) {
        int iT = t(i);
        int iW = w(iT);
        int iV = v(iT);
        z(iT).n(i - iW, fc0, j);
        Object objU = u(iT);
        if (!Fc0.r.equals(fc0.f3074a)) {
            objU = Pair.create(objU, fc0.f3074a);
        }
        fc0.f3074a = objU;
        fc0.o += iV;
        fc0.p += iV;
        return fc0;
    }

    public abstract int r(Object obj);

    public abstract int s(int i);

    public abstract int t(int i);

    public abstract Object u(int i);

    public abstract int v(int i);

    public abstract int w(int i);

    public final int x(int i, boolean z) {
        if (!z) {
            if (i < this.e - 1) {
                return i + 1;
            }
            return -1;
        }
        D60 d60 = this.f;
        int i2 = d60.c[i] + 1;
        int[] iArr = d60.b;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    public final int y(int i, boolean z) {
        if (!z) {
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }
        D60 d60 = this.f;
        int i2 = d60.c[i] - 1;
        if (i2 >= 0) {
            return d60.b[i2];
        }
        return -1;
    }

    public abstract Gc0 z(int i);
}
