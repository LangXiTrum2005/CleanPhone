package com.smartdigimkt.j4;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class d implements r, r.a {
    public final r X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private r.a f35951Y;
    private a[] Z = new a[0];
    private long e0;
    long f0;
    long g0;

    public final class a implements y {
        public final y X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        private boolean f35952Y;

        public a(y yVar) {
            this.X = yVar;
        }

        @Override // com.smartdigimkt.j4.y
        public void a() throws IOException {
            this.X.a();
        }

        public void b() {
            this.f35952Y = false;
        }

        @Override // com.smartdigimkt.j4.y
        public int d(long j) {
            if (d.this.a()) {
                return -3;
            }
            return this.X.d(j);
        }

        @Override // com.smartdigimkt.j4.y
        public boolean isReady() {
            return !d.this.a() && this.X.isReady();
        }

        @Override // com.smartdigimkt.j4.y
        public int a(com.smartdigimkt.w3.n nVar, com.smartdigimkt.z3.e eVar, boolean z2) {
            if (d.this.a()) {
                return -3;
            }
            if (this.f35952Y) {
                eVar.d(4);
                return -4;
            }
            int iA = this.X.a(nVar, eVar, z2);
            if (iA == -5) {
                com.smartdigimkt.w3.m mVar = nVar.f39343a;
                int i2 = mVar.v;
                if (i2 != 0 || mVar.f39341w != 0) {
                    d dVar = d.this;
                    if (dVar.f0 != 0) {
                        i2 = 0;
                    }
                    nVar.f39343a = mVar.a(i2, dVar.g0 == Long.MIN_VALUE ? mVar.f39341w : 0);
                }
                return -5;
            }
            d dVar2 = d.this;
            long j = dVar2.g0;
            if (j == Long.MIN_VALUE || ((iA != -4 || eVar.d < j) && !(iA == -3 && dVar2.c() == Long.MIN_VALUE))) {
                return iA;
            }
            eVar.a();
            eVar.d(4);
            this.f35952Y = true;
            return -4;
        }
    }

    public d(r rVar, boolean z2, long j, long j2) {
        this.X = rVar;
        this.e0 = z2 ? j : -9223372036854775807L;
        this.f0 = j;
        this.g0 = j2;
    }

    @Override // com.smartdigimkt.j4.r, com.smartdigimkt.j4.z
    public void b(long j) {
        this.X.b(j);
    }

    @Override // com.smartdigimkt.j4.r, com.smartdigimkt.j4.z
    public long c() {
        long jC = this.X.c();
        if (jC != Long.MIN_VALUE) {
            long j = this.g0;
            if (j == Long.MIN_VALUE || jC < j) {
                return jC;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.smartdigimkt.j4.r
    public long e() {
        if (a()) {
            long j = this.e0;
            this.e0 = -9223372036854775807L;
            long jE = e();
            return jE != -9223372036854775807L ? jE : j;
        }
        long jE2 = this.X.e();
        if (jE2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        com.smartdigimkt.p4.a.b(jE2 >= this.f0);
        long j2 = this.g0;
        com.smartdigimkt.p4.a.b(j2 == Long.MIN_VALUE || jE2 <= j2);
        return jE2;
    }

    @Override // com.smartdigimkt.j4.r
    public f0 f() {
        return this.X.f();
    }

    @Override // com.smartdigimkt.j4.r
    public void g() throws IOException {
        this.X.g();
    }

    public void a(long j, long j2) {
        this.f0 = j;
        this.g0 = j2;
    }

    @Override // com.smartdigimkt.j4.r, com.smartdigimkt.j4.z
    public long b() {
        long jB = this.X.b();
        if (jB != Long.MIN_VALUE) {
            long j = this.g0;
            if (j == Long.MIN_VALUE || jB < j) {
                return jB;
            }
        }
        return Long.MIN_VALUE;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    @Override // com.smartdigimkt.j4.r
    public long c(long j) {
        this.e0 = -9223372036854775807L;
        boolean z2 = false;
        for (a aVar : this.Z) {
            if (aVar != null) {
                aVar.b();
            }
        }
        long jC = this.X.c(j);
        if (jC == j) {
            z2 = true;
        } else if (jC >= this.f0) {
            long j2 = this.g0;
            if (j2 == Long.MIN_VALUE || jC <= j2) {
                z2 = true;
            }
        }
        com.smartdigimkt.p4.a.b(z2);
        return jC;
    }

    @Override // com.smartdigimkt.j4.r
    public void a(r.a aVar, long j) {
        this.f35951Y = aVar;
        this.X.a(this, j);
    }

    @Override // com.smartdigimkt.j4.z.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(r rVar) {
        this.f35951Y.a(this);
    }

    private com.smartdigimkt.w3.c0 b(long j, com.smartdigimkt.w3.c0 c0Var) {
        long jB = com.smartdigimkt.p4.f0.b(c0Var.f39232a, 0L, j - this.f0);
        long j2 = c0Var.f39233b;
        long j3 = this.g0;
        long jB2 = com.smartdigimkt.p4.f0.b(j2, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        return (jB == c0Var.f39232a && jB2 == c0Var.f39233b) ? c0Var : new com.smartdigimkt.w3.c0(jB, jB2);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    @Override // com.smartdigimkt.j4.r
    public long a(com.smartdigimkt.m4.f[] fVarArr, boolean[] zArr, y[] yVarArr, boolean[] zArr2, long j) {
        long j2;
        boolean z2;
        this.Z = new a[yVarArr.length];
        y[] yVarArr2 = new y[yVarArr.length];
        int i2 = 0;
        while (true) {
            y yVar = null;
            if (i2 >= yVarArr.length) {
                break;
            }
            a[] aVarArr = this.Z;
            a aVar = (a) yVarArr[i2];
            aVarArr[i2] = aVar;
            if (aVar != null) {
                yVar = aVar.X;
            }
            yVarArr2[i2] = yVar;
            i2++;
        }
        long jA = this.X.a(fVarArr, zArr, yVarArr2, zArr2, j);
        if (a()) {
            long j3 = this.f0;
            if (j == j3 && a(j3, fVarArr)) {
                j2 = jA;
            } else {
                j2 = -9223372036854775807L;
            }
        } else {
            j2 = -9223372036854775807L;
        }
        this.e0 = j2;
        if (jA != j) {
            if (jA >= this.f0) {
                long j4 = this.g0;
                z2 = j4 == Long.MIN_VALUE || jA <= j4;
            }
        }
        com.smartdigimkt.p4.a.b(z2);
        for (int i3 = 0; i3 < yVarArr.length; i3++) {
            y yVar2 = yVarArr2[i3];
            if (yVar2 == null) {
                this.Z[i3] = null;
            } else if (yVarArr[i3] == null || this.Z[i3].X != yVar2) {
                this.Z[i3] = new a(yVar2);
            }
            yVarArr[i3] = this.Z[i3];
        }
        return jA;
    }

    @Override // com.smartdigimkt.j4.r
    public void a(long j, boolean z2) {
        this.X.a(j, z2);
    }

    @Override // com.smartdigimkt.j4.r
    public long a(long j, com.smartdigimkt.w3.c0 c0Var) {
        long j2 = this.f0;
        if (j == j2) {
            return j2;
        }
        return this.X.a(j, b(j, c0Var));
    }

    @Override // com.smartdigimkt.j4.r, com.smartdigimkt.j4.z
    public boolean a(long j) {
        return this.X.a(j);
    }

    @Override // com.smartdigimkt.j4.r.a
    public void a(r rVar) {
        this.f35951Y.a((r) this);
    }

    public boolean a() {
        return this.e0 != -9223372036854775807L;
    }

    private static boolean a(long j, com.smartdigimkt.m4.f[] fVarArr) {
        if (j != 0) {
            for (com.smartdigimkt.m4.f fVar : fVarArr) {
                if (fVar != null && !com.smartdigimkt.p4.o.k(fVar.g().f)) {
                    return true;
                }
            }
        }
        return false;
    }
}
