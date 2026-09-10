package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class P extends AbstractList implements List {
    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        S5 s5 = (S5) this;
        C2443Gk.b(i, s5.c);
        if (i == AbstractC2340Cl.y(s5)) {
            return s5.removeLast();
        }
        if (i == 0) {
            return s5.removeFirst();
        }
        int iD = s5.d(s5.f3699a + i);
        Object[] objArr = s5.b;
        Object obj = objArr[iD];
        if (i < (s5.c >> 1)) {
            int i2 = s5.f3699a;
            if (iD >= i2) {
                U5.k0(objArr, i2 + 1, objArr, i2, iD);
            } else {
                U5.k0(objArr, 1, objArr, 0, iD);
                Object[] objArr2 = s5.b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i3 = s5.f3699a;
                U5.k0(objArr2, i3 + 1, objArr2, i3, objArr2.length - 1);
            }
            Object[] objArr3 = s5.b;
            int i4 = s5.f3699a;
            objArr3[i4] = null;
            s5.f3699a = s5.c(i4);
        } else {
            int iD2 = s5.d(AbstractC2340Cl.y(s5) + s5.f3699a);
            if (iD <= iD2) {
                Object[] objArr4 = s5.b;
                U5.k0(objArr4, iD, objArr4, iD + 1, iD2 + 1);
            } else {
                Object[] objArr5 = s5.b;
                U5.k0(objArr5, iD, objArr5, iD + 1, objArr5.length);
                Object[] objArr6 = s5.b;
                objArr6[objArr6.length - 1] = objArr6[0];
                U5.k0(objArr6, 0, objArr6, 1, iD2 + 1);
            }
            s5.b[iD2] = null;
        }
        s5.c--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return ((S5) this).c;
    }
}
