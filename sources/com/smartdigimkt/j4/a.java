package com.smartdigimkt.j4;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
abstract class a extends com.smartdigimkt.w3.e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f35934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a0 f35935c;
    private final boolean d;

    public a(boolean z2, a0 a0Var) {
        this.d = z2;
        this.f35935c = a0Var;
        this.f35934b = a0Var.a();
    }

    public abstract int a(int i2);

    @Override // com.smartdigimkt.w3.e0
    public int a(int i2, int i3, boolean z2) {
        if (this.d) {
            if (i3 == 1) {
                i3 = 2;
            }
            z2 = false;
        }
        int iB = b(i2);
        int iE = e(iB);
        int iA = f(iB).a(i2 - iE, i3 != 2 ? i3 : 0, z2);
        if (iA != -1) {
            return iE + iA;
        }
        int iA2 = a(iB, z2);
        while (iA2 != -1 && f(iA2).c()) {
            iA2 = a(iA2, z2);
        }
        if (iA2 != -1) {
            return f(iA2).a(z2) + e(iA2);
        }
        if (i3 == 2) {
            return a(z2);
        }
        return -1;
    }

    public abstract int b(int i2);

    @Override // com.smartdigimkt.w3.e0
    public int b(int i2, int i3, boolean z2) {
        if (this.d) {
            if (i3 == 1) {
                i3 = 2;
            }
            z2 = false;
        }
        int iB = b(i2);
        int iE = e(iB);
        int iB2 = f(iB).b(i2 - iE, i3 != 2 ? i3 : 0, z2);
        if (iB2 != -1) {
            return iE + iB2;
        }
        int iB3 = b(iB, z2);
        while (iB3 != -1 && f(iB3).c()) {
            iB3 = b(iB3, z2);
        }
        if (iB3 != -1) {
            return f(iB3).b(z2) + e(iB3);
        }
        if (i3 == 2) {
            return b(z2);
        }
        return -1;
    }

    public abstract int b(Object obj);

    public abstract Object c(int i2);

    public abstract int d(int i2);

    public abstract int e(int i2);

    public abstract com.smartdigimkt.w3.e0 f(int i2);

    @Override // com.smartdigimkt.w3.e0
    public int a(boolean z2) {
        if (this.f35934b == 0) {
            return -1;
        }
        if (this.d) {
            z2 = false;
        }
        int iB = z2 ? this.f35935c.b() : 0;
        while (f(iB).c()) {
            iB = a(iB, z2);
            if (iB == -1) {
                return -1;
            }
        }
        return f(iB).a(z2) + e(iB);
    }

    @Override // com.smartdigimkt.w3.e0
    public int b(boolean z2) {
        int i2 = this.f35934b;
        if (i2 == 0) {
            return -1;
        }
        if (this.d) {
            z2 = false;
        }
        int iC = z2 ? this.f35935c.c() : i2 - 1;
        while (f(iC).c()) {
            iC = b(iC, z2);
            if (iC == -1) {
                return -1;
            }
        }
        return f(iC).b(z2) + e(iC);
    }

    private int b(int i2, boolean z2) {
        if (z2) {
            return this.f35935c.c(i2);
        }
        if (i2 > 0) {
            return i2 - 1;
        }
        return -1;
    }

    @Override // com.smartdigimkt.w3.e0
    public final com.smartdigimkt.w3.e0.c a(int i2, com.smartdigimkt.w3.e0.c cVar, boolean z2, long j) {
        int iB = b(i2);
        int iE = e(iB);
        int iD = d(iB);
        f(iB).a(i2 - iE, cVar, z2, j);
        cVar.f += iD;
        cVar.g += iD;
        return cVar;
    }

    @Override // com.smartdigimkt.w3.e0
    public final com.smartdigimkt.w3.e0.b a(int i2, com.smartdigimkt.w3.e0.b bVar, boolean z2) {
        int iA = a(i2);
        int iE = e(iA);
        f(iA).a(i2 - d(iA), bVar, z2);
        bVar.f39265c += iE;
        if (z2) {
            bVar.f39264b = Pair.create(c(iA), bVar.f39264b);
        }
        return bVar;
    }

    @Override // com.smartdigimkt.w3.e0
    public final int a(Object obj) {
        int iA;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iB = b(obj2);
        if (iB == -1 || (iA = f(iB).a(obj3)) == -1) {
            return -1;
        }
        return d(iB) + iA;
    }

    private int a(int i2, boolean z2) {
        if (z2) {
            return this.f35935c.a(i2);
        }
        if (i2 < this.f35934b - 1) {
            return i2 + 1;
        }
        return -1;
    }
}
