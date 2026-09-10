package v1;

import b2.z;
import f2.c1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import l1.y;
import m0.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f52381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f52382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f52383c = -1;

    public n(r rVar, int i10) {
        this.f52382b = rVar;
        this.f52381a = i10;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    public final void a() {
        go.k.i(this.f52383c == -1);
        r rVar = this.f52382b;
        rVar.i();
        rVar.K.getClass();
        int[] iArr = rVar.K;
        int i10 = this.f52381a;
        int i11 = iArr[i10];
        if (i11 != -1) {
            boolean[] zArr = rVar.N;
            if (zArr[i11]) {
                i11 = -2;
            } else {
                zArr[i11] = true;
            }
        } else if (rVar.J.contains(rVar.I.a(i10))) {
            i11 = -3;
        } else {
            i11 = -2;
        }
        this.f52383c = i11;
    }

    public final boolean b() {
        int i10 = this.f52383c;
        return (i10 == -1 || i10 == -3 || i10 == -2) ? false : true;
    }

    @Override // f2.c1
    public final int h(s1 s1Var, o1.d dVar, int i10) {
        i1.p pVar;
        if (this.f52383c == -3) {
            dVar.a(4);
            return -4;
        }
        if (b()) {
            int i11 = this.f52383c;
            r rVar = this.f52382b;
            ArrayList arrayList = rVar.f52405n;
            if (!rVar.s()) {
                int i12 = 0;
                if (!arrayList.isEmpty()) {
                    int i13 = 0;
                    loop0: while (i13 < arrayList.size() - 1) {
                        int i14 = ((k) arrayList.get(i13)).f52333k;
                        int length = rVar.f52413v.length;
                        for (int i15 = 0; i15 < length; i15++) {
                            if (rVar.N[i15] && rVar.f52413v[i15].B() == i14) {
                                break loop0;
                            }
                        }
                        i13++;
                    }
                    y.R(arrayList, 0, i13);
                    k kVar = (k) arrayList.get(0);
                    i1.p pVar2 = kVar.f41369d;
                    if (!pVar2.equals(rVar.G)) {
                        rVar.f52403k.b(rVar.f52394b, pVar2, kVar.f41370e, kVar.f41371f, kVar.f41372g);
                    }
                    rVar.G = pVar2;
                }
                if (arrayList.isEmpty() || ((k) arrayList.get(0)).f()) {
                    int iC = rVar.f52413v[i11].C(s1Var, dVar, i10, rVar.T);
                    if (iC == -5) {
                        i1.p pVarD = (i1.p) s1Var.f45752c;
                        pVarD.getClass();
                        if (i11 == rVar.B) {
                            int iC2 = com.bumptech.glide.c.c(rVar.f52413v[i11].B());
                            while (i12 < arrayList.size() && ((k) arrayList.get(i12)).f52333k != iC2) {
                                i12++;
                            }
                            if (i12 < arrayList.size()) {
                                pVar = ((k) arrayList.get(i12)).f41369d;
                            } else {
                                pVar = rVar.F;
                                pVar.getClass();
                            }
                            pVarD = pVarD.d(pVar);
                        }
                        s1Var.f45752c = pVarD;
                    }
                    return iC;
                }
            }
        }
        return -3;
    }

    @Override // f2.c1
    public final boolean isReady() {
        if (this.f52383c == -3) {
            return true;
        }
        if (!b()) {
            return false;
        }
        int i10 = this.f52383c;
        r rVar = this.f52382b;
        return !rVar.s() && rVar.f52413v[i10].x(rVar.T);
    }

    @Override // f2.c1
    public final void maybeThrowError() throws IOException {
        int i10 = this.f52383c;
        r rVar = this.f52382b;
        if (i10 == -2) {
            rVar.i();
            throw new z(defpackage.e.o("Unable to bind a sample queue to TrackGroup with MIME type ", rVar.I.a(this.f52381a).f42662d[0].f42643n, "."));
        }
        if (i10 == -1) {
            rVar.v();
        } else if (i10 != -3) {
            rVar.v();
            rVar.f52413v[i10].z();
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0042  */
    @Override // f2.c1
    public final int skipData(long j10) {
        Object next;
        Object objD;
        if (!b()) {
            return 0;
        }
        int i10 = this.f52383c;
        r rVar = this.f52382b;
        if (rVar.s()) {
            return 0;
        }
        q qVar = rVar.f52413v[i10];
        int iV = qVar.v(j10, rVar.T);
        ArrayList arrayList = rVar.f52405n;
        if (arrayList == null) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                do {
                    next = it.next();
                } while (it.hasNext());
                objD = next;
            } else {
                objD = null;
            }
        } else if (arrayList.isEmpty()) {
            objD = null;
        } else {
            objD = l1.d.d(arrayList, 1);
        }
        k kVar = (k) objD;
        if (kVar != null && !kVar.f()) {
            iV = Math.min(iV, kVar.e(i10) - qVar.t());
        }
        qVar.H(iV);
        return iV;
    }
}
