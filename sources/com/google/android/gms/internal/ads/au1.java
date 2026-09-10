package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class au1 extends cs1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f12521h = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cs1 f12523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final cs1 f12524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f12525f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f12526g;

    public au1(cs1 cs1Var, cs1 cs1Var2) {
        this.f12523d = cs1Var;
        this.f12524e = cs1Var2;
        int iQ = cs1Var.q();
        this.f12525f = iQ;
        this.f12522c = cs1Var2.q() + iQ;
        this.f12526g = Math.max(cs1Var.A(), cs1Var2.A()) + 1;
    }

    public static int G(int i10) {
        if (i10 >= 47) {
            return Integer.MAX_VALUE;
        }
        return f12521h[i10];
    }

    @Override // com.google.android.gms.internal.ads.cs1
    public final int A() {
        return this.f12526g;
    }

    @Override // com.google.android.gms.internal.ads.cs1
    public final boolean B() {
        return this.f12522c >= G(this.f12526g);
    }

    @Override // com.google.android.gms.internal.ads.cs1
    /* JADX INFO: renamed from: C */
    public final mb1 iterator() {
        return new yt1(this);
    }

    @Override // com.google.android.gms.internal.ads.cs1, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new yt1(this);
    }

    @Override // com.google.android.gms.internal.ads.cs1
    public final byte p(int i10) {
        int i11 = this.f12525f;
        return i10 < i11 ? this.f12523d.p(i10) : this.f12524e.p(i10 - i11);
    }

    @Override // com.google.android.gms.internal.ads.cs1
    public final int q() {
        return this.f12522c;
    }

    @Override // com.google.android.gms.internal.ads.cs1
    public final cs1 r(int i10, int i11) {
        return s(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.cs1
    public final cs1 s(int i10, int i11) {
        int i12 = this.f12522c;
        int iM = cs1.m(i10, i11, i12);
        if (iM == 0) {
            return cs1.f13248b;
        }
        if (iM == i12) {
            return this;
        }
        cs1 cs1Var = this.f12523d;
        int i13 = this.f12525f;
        if (i11 <= i13) {
            return cs1Var.r(i10, i11);
        }
        int i14 = i11 - i13;
        cs1 cs1Var2 = this.f12524e;
        return i10 >= i13 ? cs1Var2.r(i10 - i13, i14) : new au1(cs1Var.r(i10, cs1Var.q()), cs1Var2.r(0, i14));
    }

    @Override // com.google.android.gms.internal.ads.cs1
    public final void t(int i10, int i11, int i12, byte[] bArr) {
        int i13 = i10 + i12;
        cs1 cs1Var = this.f12523d;
        int i14 = this.f12525f;
        if (i13 <= i14) {
            cs1Var.t(i10, i11, i12, bArr);
            return;
        }
        cs1 cs1Var2 = this.f12524e;
        if (i10 >= i14) {
            cs1Var2.t(i10 - i14, i11, i12, bArr);
            return;
        }
        int i15 = i14 - i10;
        cs1Var.t(i10, i11, i15, bArr);
        cs1Var2.t(0, i11 + i15, i12 - i15, bArr);
    }

    @Override // com.google.android.gms.internal.ads.cs1
    public final void v(is1 is1Var) {
        this.f12523d.v(is1Var);
        this.f12524e.v(is1Var);
    }

    @Override // com.google.android.gms.internal.ads.cs1
    public final boolean w(cs1 cs1Var) {
        zr1 zr1VarA;
        zt1 zt1Var = new zt1(this);
        zr1 zr1VarA2 = zt1Var.next();
        zt1 zt1Var2 = new zt1(cs1Var);
        zr1 zr1VarA3 = zt1Var2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int iQ = zr1VarA2.q() - i10;
            int iQ2 = zr1VarA3.q() - i11;
            int iMin = Math.min(iQ, iQ2);
            if (!(i10 == 0 ? zr1VarA2.G(zr1VarA3, i11, iMin) : zr1VarA3.G(zr1VarA2, i10, iMin))) {
                return false;
            }
            i12 += iMin;
            int i13 = this.f12522c;
            if (i12 >= i13) {
                if (i12 == i13) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iQ) {
                zr1VarA = zt1Var.next();
                i10 = 0;
            } else {
                i10 += iMin;
            }
            if (iMin == iQ2) {
                zr1VarA2 = zr1VarA2;
                zr1VarA2 = zr1VarA;
                zr1VarA3 = zt1Var2.next();
                i11 = 0;
            } else {
                zr1VarA2 = zr1VarA2;
                zr1VarA2 = zr1VarA;
                i11 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.cs1
    public final int y(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        cs1 cs1Var = this.f12523d;
        int i14 = this.f12525f;
        if (i13 <= i14) {
            return cs1Var.y(i10, i11, i12);
        }
        cs1 cs1Var2 = this.f12524e;
        if (i11 >= i14) {
            return cs1Var2.y(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return cs1Var2.y(cs1Var.y(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.android.gms.internal.ads.cs1
    public final fs1 z() {
        zr1 zr1Var;
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque(this.f12526g);
        arrayDeque.push(this);
        cs1 cs1Var = this.f12523d;
        while (cs1Var instanceof au1) {
            au1 au1Var = (au1) cs1Var;
            arrayDeque.push(au1Var);
            cs1Var = au1Var.f12523d;
        }
        zr1 zr1Var2 = (zr1) cs1Var;
        while (true) {
            if (!(zr1Var2 != null)) {
                ft1 ft1Var = new ft1();
                ft1Var.f14534b = arrayList.iterator();
                ft1Var.f14536d = 0;
                for (ByteBuffer byteBuffer : arrayList) {
                    ft1Var.f14536d++;
                }
                ft1Var.f14537e = -1;
                if (!ft1Var.k()) {
                    ft1Var.f14535c = bt1.f12889b;
                    ft1Var.f14538f = 0;
                    ft1Var.f14542j = 0L;
                }
                return new es1(ft1Var);
            }
            if (zr1Var2 == null) {
                throw new NoSuchElementException();
            }
            do {
                if (arrayDeque.isEmpty()) {
                    zr1Var = null;
                    break;
                }
                cs1 cs1Var2 = ((au1) arrayDeque.pop()).f12524e;
                while (cs1Var2 instanceof au1) {
                    au1 au1Var2 = (au1) cs1Var2;
                    arrayDeque.push(au1Var2);
                    cs1Var2 = au1Var2.f12523d;
                }
                zr1Var = (zr1) cs1Var2;
            } while (zr1Var.q() == 0);
            arrayList.add(zr1Var2.u());
            zr1Var2 = zr1Var;
        }
    }
}
