package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.dA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3239dA implements W20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4262a;
    public final C3591hA b;
    public int c = -1;

    public C3239dA(C3591hA c3591hA, int i) {
        this.b = c3591hA;
        this.f4262a = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W20
    public final int a(C3692iN c3692iN, C2677Pl c2677Pl, int i) {
        C4619sw c4619sw;
        int iA = -3;
        if (this.c == -3) {
            c2677Pl.a(4);
            return -4;
        }
        if (c()) {
            int i2 = this.c;
            C3591hA c3591hA = this.b;
            if (!c3591hA.o()) {
                ArrayList arrayList = c3591hA.n;
                int i3 = 0;
                if (!arrayList.isEmpty()) {
                    int i4 = 0;
                    loop0: while (i4 < arrayList.size() - 1) {
                        int i5 = ((C2536Jz) arrayList.get(i4)).k;
                        int length = c3591hA.v.length;
                        for (int i6 = 0; i6 < length; i6++) {
                            if (c3591hA.N[i6] && c3591hA.v[i6].z() == i5) {
                                break loop0;
                            }
                        }
                        i4++;
                    }
                    Ug0.Q(arrayList, 0, i4);
                    C2536Jz c2536Jz = (C2536Jz) arrayList.get(0);
                    C4619sw c4619sw2 = c2536Jz.d;
                    if (!c4619sw2.equals(c3591hA.G)) {
                        c3591hA.k.b(c3591hA.b, c4619sw2, c2536Jz.e, c2536Jz.f, c2536Jz.g);
                    }
                    c3591hA.G = c4619sw2;
                }
                if ((arrayList.isEmpty() || ((C2536Jz) arrayList.get(0)).K) && (iA = c3591hA.v[i2].A(c3692iN, c2677Pl, i, c3591hA.T)) == -5) {
                    C4619sw c4619swE = (C4619sw) c3692iN.c;
                    c4619swE.getClass();
                    if (i2 == c3591hA.B) {
                        int iZ = c3591hA.v[i2].z();
                        while (i3 < arrayList.size() && ((C2536Jz) arrayList.get(i3)).k != iZ) {
                            i3++;
                        }
                        if (i3 < arrayList.size()) {
                            c4619sw = ((C2536Jz) arrayList.get(i3)).d;
                        } else {
                            c4619sw = c3591hA.F;
                            c4619sw.getClass();
                        }
                        c4619swE = c4619swE.e(c4619sw);
                    }
                    c3692iN.c = c4619swE;
                }
            }
        }
        return iA;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    public final void b() {
        FW.h(this.c == -1);
        C3591hA c3591hA = this.b;
        c3591hA.g();
        c3591hA.K.getClass();
        int[] iArr = c3591hA.K;
        int i = this.f4262a;
        int i2 = iArr[i];
        if (i2 != -1) {
            boolean[] zArr = c3591hA.N;
            if (zArr[i2]) {
                i2 = -2;
            } else {
                zArr[i2] = true;
            }
        } else if (c3591hA.J.contains(c3591hA.I.a(i))) {
            i2 = -3;
        } else {
            i2 = -2;
        }
        this.c = i2;
    }

    public final boolean c() {
        int i = this.c;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W20
    public final boolean isReady() {
        if (this.c != -3) {
            if (c()) {
                int i = this.c;
                C3591hA c3591hA = this.b;
                if (c3591hA.o() || !c3591hA.v[i].v(c3591hA.T)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W20
    public final void maybeThrowError() throws IOException {
        int i = this.c;
        C3591hA c3591hA = this.b;
        if (i == -2) {
            c3591hA.g();
            throw new C3124bu(DM.B("Unable to bind a sample queue to TrackGroup with mime type ", c3591hA.I.a(this.f4262a).d[0].l, "."));
        }
        if (i == -1) {
            c3591hA.s();
        } else if (i != -3) {
            c3591hA.s();
            c3591hA.v[i].x();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W20
    public final int skipData(long j) {
        if (!c()) {
            return 0;
        }
        int i = this.c;
        C3591hA c3591hA = this.b;
        if (c3591hA.o()) {
            return 0;
        }
        C3503gA c3503gA = c3591hA.v[i];
        int iS = c3503gA.s(j, c3591hA.T);
        ArrayList arrayList = c3591hA.n;
        Object next = null;
        if (!(arrayList instanceof Collection)) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                do {
                    next = it.next();
                } while (it.hasNext());
            }
        } else if (!arrayList.isEmpty()) {
            next = DM.e(arrayList, 1);
        }
        C2536Jz c2536Jz = (C2536Jz) next;
        if (c2536Jz != null && !c2536Jz.K) {
            iS = Math.min(iS, c2536Jz.e(i) - c3503gA.q());
        }
        c3503gA.G(iS);
        return iS;
    }
}
