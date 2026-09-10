package com.smartdigimkt.w3;

import android.util.Log;
import com.smartdigimkt.j4.f0;

/* JADX INFO: loaded from: classes6.dex */
final class q {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f39347p = "MediaPeriodHolder";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.smartdigimkt.j4.r f39348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f39349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.smartdigimkt.j4.y[] f39350c;
    public final boolean[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f39351e;
    public boolean f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public r f39352h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public q f39353i;
    public f0 j;
    public com.smartdigimkt.m4.i k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final z[] f39354l;
    private final com.smartdigimkt.m4.h m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.smartdigimkt.j4.s f39355n;
    private com.smartdigimkt.m4.i o;

    public q(z[] zVarArr, long j, com.smartdigimkt.m4.h hVar, com.smartdigimkt.n4.b bVar, com.smartdigimkt.j4.s sVar, Object obj, r rVar) {
        this.f39354l = zVarArr;
        this.f39351e = j - rVar.f39357b;
        this.m = hVar;
        this.f39355n = sVar;
        this.f39349b = com.smartdigimkt.p4.a.a(obj);
        this.f39352h = rVar;
        this.f39350c = new com.smartdigimkt.j4.y[zVarArr.length];
        this.d = new boolean[zVarArr.length];
        com.smartdigimkt.j4.r rVarA = sVar.a(rVar.f39356a, bVar);
        long j2 = rVar.f39358c;
        this.f39348a = j2 != Long.MIN_VALUE ? new com.smartdigimkt.j4.d(rVarA, true, 0L, j2) : rVarA;
    }

    public long a() {
        return this.f39352h.f39359e;
    }

    public long b() {
        if (this.f) {
            return this.f39348a.b();
        }
        return 0L;
    }

    public long c(long j) {
        return j - c();
    }

    public long d(long j) {
        return j + c();
    }

    public void e() {
        c((com.smartdigimkt.m4.i) null);
        try {
            if (this.f39352h.f39358c != Long.MIN_VALUE) {
                this.f39355n.a(((com.smartdigimkt.j4.d) this.f39348a).X);
            } else {
                this.f39355n.a(this.f39348a);
            }
        } catch (RuntimeException e2) {
            Log.e(f39347p, "Period release failed.", e2);
        }
    }

    public long a(boolean z2) {
        if (!this.f) {
            return this.f39352h.f39357b;
        }
        long jC = this.f39348a.c();
        return (jC == Long.MIN_VALUE && z2) ? this.f39352h.f39359e : jC;
    }

    public void b(long j) {
        if (this.f) {
            this.f39348a.b(c(j));
        }
    }

    public long c() {
        return this.f39351e;
    }

    public boolean d() {
        if (this.f) {
            return !this.g || this.f39348a.c() == Long.MIN_VALUE;
        }
        return false;
    }

    private void c(com.smartdigimkt.m4.i iVar) {
        com.smartdigimkt.m4.i iVar2 = this.o;
        if (iVar2 != null) {
            a(iVar2);
        }
        this.o = iVar;
        if (iVar != null) {
            b(iVar);
        }
    }

    public boolean b(float f) throws g {
        com.smartdigimkt.m4.i iVarA = this.m.a(this.f39354l, this.j);
        if (iVarA.a(this.o)) {
            return false;
        }
        this.k = iVarA;
        for (com.smartdigimkt.m4.f fVar : iVarA.f36692c.a()) {
            if (fVar != null) {
                fVar.a(f);
            }
        }
        return true;
    }

    public void a(float f) throws g {
        this.f = true;
        this.j = this.f39348a.f();
        b(f);
        long jA = a(this.f39352h.f39357b, false);
        long j = this.f39351e;
        r rVar = this.f39352h;
        this.f39351e = (rVar.f39357b - jA) + j;
        this.f39352h = rVar.a(jA);
    }

    private void b(com.smartdigimkt.m4.i iVar) {
        for (int i2 = 0; i2 < iVar.f36690a; i2++) {
            boolean zA = iVar.a(i2);
            com.smartdigimkt.m4.f fVarA = iVar.f36692c.a(i2);
            if (zA && fVarA != null) {
                fVarA.d();
            }
        }
    }

    public void a(long j) {
        this.f39348a.a(c(j));
    }

    private void b(com.smartdigimkt.j4.y[] yVarArr) {
        int i2 = 0;
        while (true) {
            z[] zVarArr = this.f39354l;
            if (i2 >= zVarArr.length) {
                return;
            }
            if (zVarArr[i2].e() == 5) {
                yVarArr[i2] = null;
            }
            i2++;
        }
    }

    public long a(long j, boolean z2) {
        return a(j, z2, new boolean[this.f39354l.length]);
    }

    public long a(long j, boolean z2, boolean[] zArr) {
        int i2 = 0;
        while (true) {
            com.smartdigimkt.m4.i iVar = this.k;
            boolean z3 = true;
            if (i2 >= iVar.f36690a) {
                break;
            }
            boolean[] zArr2 = this.d;
            if (z2 || !iVar.a(this.o, i2)) {
                z3 = false;
            }
            zArr2[i2] = z3;
            i2++;
        }
        b(this.f39350c);
        c(this.k);
        com.smartdigimkt.m4.g gVar = this.k.f36692c;
        long jA = this.f39348a.a(gVar.a(), this.d, this.f39350c, zArr, j);
        a(this.f39350c);
        this.g = false;
        int i3 = 0;
        while (true) {
            com.smartdigimkt.j4.y[] yVarArr = this.f39350c;
            if (i3 >= yVarArr.length) {
                return jA;
            }
            if (yVarArr[i3] != null) {
                com.smartdigimkt.p4.a.b(this.k.a(i3));
                if (this.f39354l[i3].e() != 5) {
                    this.g = true;
                }
            } else {
                com.smartdigimkt.p4.a.b(gVar.a(i3) == null);
            }
            i3++;
        }
    }

    private void a(com.smartdigimkt.m4.i iVar) {
        for (int i2 = 0; i2 < iVar.f36690a; i2++) {
            boolean zA = iVar.a(i2);
            com.smartdigimkt.m4.f fVarA = iVar.f36692c.a(i2);
            if (zA && fVarA != null) {
                fVarA.c();
            }
        }
    }

    private void a(com.smartdigimkt.j4.y[] yVarArr) {
        int i2 = 0;
        while (true) {
            z[] zVarArr = this.f39354l;
            if (i2 >= zVarArr.length) {
                return;
            }
            if (zVarArr[i2].e() == 5 && this.k.a(i2)) {
                yVarArr[i2] = new com.smartdigimkt.j4.m();
            }
            i2++;
        }
    }
}
