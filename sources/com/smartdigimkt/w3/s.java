package com.smartdigimkt.w3;

import android.util.Pair;

/* JADX INFO: loaded from: classes6.dex */
final class s {
    private static final int m = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e0.b f39360a = new e0.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e0.c f39361b = new e0.c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f39362c;
    private e0 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f39363e;
    private boolean f;
    private q g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private q f39364h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private q f39365i;
    private int j;
    private Object k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f39366l;

    private boolean i() {
        q qVar;
        q qVarC = c();
        if (qVarC == null) {
            return true;
        }
        while (true) {
            int iA = this.d.a(qVarC.f39352h.f39356a.f36015a, this.f39360a, this.f39361b, this.f39363e, this.f);
            while (true) {
                qVar = qVarC.f39353i;
                if (qVar == null || qVarC.f39352h.f) {
                    break;
                }
                qVarC = qVar;
            }
            if (iA == -1 || qVar == null || qVar.f39352h.f39356a.f36015a != iA) {
                break;
            }
            qVarC = qVar;
        }
        boolean zA = a(qVarC);
        r rVar = qVarC.f39352h;
        qVarC.f39352h = a(rVar, rVar.f39356a);
        return (zA && g()) ? false : true;
    }

    public void a(e0 e0Var) {
        this.d = e0Var;
    }

    public boolean b(int i2) {
        this.f39363e = i2;
        return i();
    }

    public q c() {
        return g() ? this.g : this.f39365i;
    }

    public q d() {
        return this.f39365i;
    }

    public q e() {
        return this.g;
    }

    public q f() {
        return this.f39364h;
    }

    public boolean g() {
        return this.g != null;
    }

    public boolean h() {
        q qVar = this.f39365i;
        if (qVar != null) {
            return !qVar.f39352h.g && qVar.d() && this.f39365i.f39352h.f39359e != -9223372036854775807L && this.j < 100;
        }
        return true;
    }

    public boolean a(com.smartdigimkt.j4.r rVar) {
        q qVar = this.f39365i;
        return qVar != null && qVar.f39348a == rVar;
    }

    public void a(long j) {
        q qVar = this.f39365i;
        if (qVar != null) {
            qVar.b(j);
        }
    }

    public boolean b(boolean z2) {
        this.f = z2;
        return i();
    }

    public r a(long j, u uVar) {
        q qVar = this.f39365i;
        if (qVar == null) {
            return a(uVar);
        }
        return a(qVar, j);
    }

    public q b() {
        q qVar = this.f39364h;
        com.smartdigimkt.p4.a.b((qVar == null || qVar.f39353i == null) ? false : true);
        q qVar2 = this.f39364h.f39353i;
        this.f39364h = qVar2;
        return qVar2;
    }

    public boolean b(com.smartdigimkt.j4.s.a aVar, long j) {
        boolean zA;
        int i2 = aVar.f36015a;
        q qVar = null;
        int iA = i2;
        for (q qVarC = c(); qVarC != null; qVarC = qVarC.f39353i) {
            if (qVar == null) {
                qVarC.f39352h = a(qVarC.f39352h, iA);
            } else {
                if (iA != -1 && qVarC.f39349b.equals(this.d.a(iA, this.f39360a, true).f39264b)) {
                    r rVarA = a(qVar, j);
                    if (rVarA == null) {
                        zA = a(qVar);
                    } else {
                        qVarC.f39352h = a(qVarC.f39352h, iA);
                        if (!a(qVarC, rVarA)) {
                            zA = a(qVar);
                        }
                    }
                } else {
                    zA = a(qVar);
                }
                return true ^ zA;
            }
            if (qVarC.f39352h.f) {
                iA = this.d.a(iA, this.f39360a, this.f39361b, this.f39363e, this.f);
            }
            qVar = qVarC;
        }
        return true;
    }

    public com.smartdigimkt.j4.r a(z[] zVarArr, com.smartdigimkt.m4.h hVar, com.smartdigimkt.n4.b bVar, com.smartdigimkt.j4.s sVar, Object obj, r rVar) {
        r rVar2;
        long jC;
        q qVar = this.f39365i;
        if (qVar == null) {
            rVar2 = rVar;
            jC = rVar2.f39357b;
        } else {
            rVar2 = rVar;
            jC = qVar.c() + this.f39365i.f39352h.f39359e;
        }
        q qVar2 = new q(zVarArr, jC, hVar, bVar, sVar, obj, rVar2);
        if (this.f39365i != null) {
            com.smartdigimkt.p4.a.b(g());
            this.f39365i.f39353i = qVar2;
        }
        this.k = null;
        this.f39365i = qVar2;
        this.j++;
        return qVar2.f39348a;
    }

    public q a() {
        q qVar = this.g;
        if (qVar != null) {
            if (qVar == this.f39364h) {
                this.f39364h = qVar.f39353i;
            }
            qVar.e();
            int i2 = this.j - 1;
            this.j = i2;
            if (i2 == 0) {
                this.f39365i = null;
                q qVar2 = this.g;
                this.k = qVar2.f39349b;
                this.f39366l = qVar2.f39352h.f39356a.d;
            }
            this.g = this.g.f39353i;
        } else {
            q qVar3 = this.f39365i;
            this.g = qVar3;
            this.f39364h = qVar3;
        }
        return this.g;
    }

    private com.smartdigimkt.j4.s.a b(int i2, long j, long j2) {
        this.d.a(i2, this.f39360a);
        int iB = this.f39360a.b(j);
        if (iB == -1) {
            return new com.smartdigimkt.j4.s.a(i2, j2);
        }
        return new com.smartdigimkt.j4.s.a(i2, iB, this.f39360a.c(iB), j2);
    }

    public boolean a(q qVar) {
        boolean z2 = false;
        com.smartdigimkt.p4.a.b(qVar != null);
        this.f39365i = qVar;
        while (true) {
            qVar = qVar.f39353i;
            if (qVar != null) {
                if (qVar == this.f39364h) {
                    this.f39364h = this.g;
                    z2 = true;
                }
                qVar.e();
                this.j--;
            } else {
                this.f39365i.f39353i = null;
                return z2;
            }
        }
    }

    public void a(boolean z2) {
        q qVarC = c();
        if (qVarC != null) {
            this.k = z2 ? qVarC.f39349b : null;
            this.f39366l = qVarC.f39352h.f39356a.d;
            qVarC.e();
            a(qVarC);
        } else if (!z2) {
            this.k = null;
        }
        this.g = null;
        this.f39365i = null;
        this.f39364h = null;
        this.j = 0;
    }

    public r a(r rVar, int i2) {
        return a(rVar, rVar.f39356a.a(i2));
    }

    public com.smartdigimkt.j4.s.a a(int i2, long j) {
        return b(i2, j, a(i2));
    }

    private long a(int i2) {
        int iA;
        Object obj = this.d.a(i2, this.f39360a, true).f39264b;
        int i3 = this.f39360a.f39265c;
        Object obj2 = this.k;
        if (obj2 != null && (iA = this.d.a(obj2)) != -1 && this.d.a(iA, this.f39360a).f39265c == i3) {
            return this.f39366l;
        }
        for (q qVarC = c(); qVarC != null; qVarC = qVarC.f39353i) {
            if (qVarC.f39349b.equals(obj)) {
                return qVarC.f39352h.f39356a.d;
            }
        }
        for (q qVarC2 = c(); qVarC2 != null; qVarC2 = qVarC2.f39353i) {
            int iA2 = this.d.a(qVarC2.f39349b);
            if (iA2 != -1 && this.d.a(iA2, this.f39360a).f39265c == i3) {
                return qVarC2.f39352h.f39356a.d;
            }
        }
        long j = this.f39362c;
        this.f39362c = 1 + j;
        return j;
    }

    private boolean a(q qVar, r rVar) {
        r rVar2 = qVar.f39352h;
        return rVar2.f39357b == rVar.f39357b && rVar2.f39358c == rVar.f39358c && rVar2.f39356a.equals(rVar.f39356a);
    }

    private r a(u uVar) {
        return a(uVar.f39369c, uVar.f39370e, uVar.d);
    }

    private r a(q qVar, long j) {
        r rVar = qVar.f39352h;
        if (rVar.f) {
            int iA = this.d.a(rVar.f39356a.f36015a, this.f39360a, this.f39361b, this.f39363e, this.f);
            if (iA == -1) {
                return null;
            }
            int i2 = this.d.a(iA, this.f39360a, true).f39265c;
            Object obj = this.f39360a.f39264b;
            long j2 = rVar.f39356a.d;
            long jLongValue = 0;
            if (this.d.a(i2, this.f39361b).f == iA) {
                Pair<Integer, Long> pairA = this.d.a(this.f39361b, this.f39360a, i2, -9223372036854775807L, Math.max(0L, (qVar.c() + rVar.f39359e) - j));
                if (pairA == null) {
                    return null;
                }
                iA = ((Integer) pairA.first).intValue();
                jLongValue = ((Long) pairA.second).longValue();
                q qVar2 = qVar.f39353i;
                if (qVar2 != null && qVar2.f39349b.equals(obj)) {
                    j2 = qVar.f39353i.f39352h.f39356a.d;
                } else {
                    j2 = this.f39362c;
                    this.f39362c = 1 + j2;
                }
            }
            long j3 = jLongValue;
            return a(b(iA, j3, j2), j3, j3);
        }
        com.smartdigimkt.j4.s.a aVar = rVar.f39356a;
        this.d.a(aVar.f36015a, this.f39360a);
        if (aVar.a()) {
            int i3 = aVar.f36016b;
            int iA2 = this.f39360a.a(i3);
            if (iA2 == -1) {
                return null;
            }
            int iB = this.f39360a.b(i3, aVar.f36017c);
            if (iB < iA2) {
                if (this.f39360a.c(i3, iB)) {
                    return a(aVar.f36015a, i3, iB, rVar.d, aVar.d);
                }
                return null;
            }
            return a(aVar.f36015a, rVar.d, aVar.d);
        }
        long j4 = rVar.f39358c;
        if (j4 != Long.MIN_VALUE) {
            int iB2 = this.f39360a.b(j4);
            if (iB2 == -1) {
                return a(aVar.f36015a, rVar.f39358c, aVar.d);
            }
            int iC = this.f39360a.c(iB2);
            if (this.f39360a.c(iB2, iC)) {
                return a(aVar.f36015a, iB2, iC, rVar.f39358c, aVar.d);
            }
            return null;
        }
        int iA3 = this.f39360a.a();
        if (iA3 == 0) {
            return null;
        }
        int i4 = iA3 - 1;
        if (this.f39360a.b(i4) != Long.MIN_VALUE || this.f39360a.d(i4)) {
            return null;
        }
        int iC2 = this.f39360a.c(i4);
        if (!this.f39360a.c(i4, iC2)) {
            return null;
        }
        return a(aVar.f36015a, i4, iC2, this.f39360a.d(), aVar.d);
    }

    private r a(r rVar, com.smartdigimkt.j4.s.a aVar) {
        long j;
        long jD;
        long j2 = rVar.f39357b;
        long j3 = rVar.f39358c;
        boolean zA = a(aVar, j3);
        boolean zA2 = a(aVar, zA);
        this.d.a(aVar.f36015a, this.f39360a);
        if (aVar.a()) {
            jD = this.f39360a.a(aVar.f36016b, aVar.f36017c);
        } else {
            if (j3 == Long.MIN_VALUE) {
                jD = this.f39360a.d();
            } else {
                j = j3;
            }
            return new r(aVar, j2, j3, rVar.d, j, zA, zA2);
        }
        j = jD;
        return new r(aVar, j2, j3, rVar.d, j, zA, zA2);
    }

    private r a(com.smartdigimkt.j4.s.a aVar, long j, long j2) {
        this.d.a(aVar.f36015a, this.f39360a);
        if (aVar.a()) {
            if (this.f39360a.c(aVar.f36016b, aVar.f36017c)) {
                return a(aVar.f36015a, aVar.f36016b, aVar.f36017c, j, aVar.d);
            }
            return null;
        }
        return a(aVar.f36015a, j2, aVar.d);
    }

    private r a(int i2, int i3, int i4, long j, long j2) {
        com.smartdigimkt.j4.s.a aVar = new com.smartdigimkt.j4.s.a(i2, i3, i4, j2);
        boolean zA = a(aVar, Long.MIN_VALUE);
        boolean zA2 = a(aVar, zA);
        return new r(aVar, i4 == this.f39360a.c(i3) ? this.f39360a.b() : 0L, Long.MIN_VALUE, j, this.d.a(aVar.f36015a, this.f39360a).a(aVar.f36016b, aVar.f36017c), zA, zA2);
    }

    private r a(int i2, long j, long j2) {
        com.smartdigimkt.j4.s.a aVar = new com.smartdigimkt.j4.s.a(i2, j2);
        this.d.a(aVar.f36015a, this.f39360a);
        int iA = this.f39360a.a(j);
        long jB = iA == -1 ? Long.MIN_VALUE : this.f39360a.b(iA);
        boolean zA = a(aVar, jB);
        return new r(aVar, j, jB, -9223372036854775807L, jB == Long.MIN_VALUE ? this.f39360a.d() : jB, zA, a(aVar, zA));
    }

    private boolean a(com.smartdigimkt.j4.s.a aVar, long j) {
        int iA = this.d.a(aVar.f36015a, this.f39360a).a();
        if (iA == 0) {
            return true;
        }
        int i2 = iA - 1;
        boolean zA = aVar.a();
        if (this.f39360a.b(i2) != Long.MIN_VALUE) {
            return !zA && j == Long.MIN_VALUE;
        }
        int iA2 = this.f39360a.a(i2);
        if (iA2 == -1) {
            return false;
        }
        return (zA && aVar.f36016b == i2 && aVar.f36017c == iA2 + (-1)) || (!zA && this.f39360a.c(i2) == iA2);
    }

    private boolean a(com.smartdigimkt.j4.s.a aVar, boolean z2) {
        return !this.d.a(this.d.a(aVar.f36015a, this.f39360a).f39265c, this.f39361b).f39270e && this.d.b(aVar.f36015a, this.f39360a, this.f39361b, this.f39363e, this.f) && z2;
    }
}
