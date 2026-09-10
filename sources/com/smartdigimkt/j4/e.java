package com.smartdigimkt.j4;

import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class e extends f<Void> {
    private final s j0;
    private final long k0;
    private final long l0;
    private final boolean m0;
    private final boolean n0;
    private final boolean o0;
    private final ArrayList<d> p0;
    private final com.smartdigimkt.w3.e0.c q0;
    private Object r0;
    private a s0;
    private b t0;
    private long u0;
    private long v0;

    public static final class b extends IOException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f35961b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f35962c = 1;
        public static final int d = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f35963a;

        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public b(int i2) {
            super("Illegal clipping: " + a(i2));
            this.f35963a = i2;
        }

        private static String a(int i2) {
            if (i2 == 0) {
                return "invalid period count";
            }
            if (i2 != 1) {
                return i2 != 2 ? "unknown" : "start exceeds end";
            }
            return "not seekable to start";
        }
    }

    public e(s sVar, long j, long j2) {
        this(sVar, j, j2, true, false, false);
    }

    @Override // com.smartdigimkt.j4.f, com.smartdigimkt.j4.s
    public void b() throws IOException {
        b bVar = this.t0;
        if (bVar != null) {
            throw bVar;
        }
        super.b();
    }

    @Override // com.smartdigimkt.j4.f, com.smartdigimkt.j4.c
    public void g() {
        super.g();
        this.t0 = null;
        this.s0 = null;
    }

    @Deprecated
    public e(s sVar, long j, long j2, boolean z2) {
        this(sVar, j, j2, z2, false, false);
    }

    public e(s sVar, long j) {
        this(sVar, 0L, j, true, false, true);
    }

    @Override // com.smartdigimkt.j4.f, com.smartdigimkt.j4.c
    public void a(com.smartdigimkt.w3.h hVar, boolean z2) {
        super.a(hVar, z2);
        a((Object) null, this.j0);
    }

    public e(s sVar, long j, long j2, boolean z2, boolean z3, boolean z4) {
        com.smartdigimkt.p4.a.a(j >= 0);
        this.j0 = (s) com.smartdigimkt.p4.a.a(sVar);
        this.k0 = j;
        this.l0 = j2;
        this.m0 = z2;
        this.n0 = z3;
        this.o0 = z4;
        this.p0 = new ArrayList<>();
        this.q0 = new com.smartdigimkt.w3.e0.c();
    }

    @Override // com.smartdigimkt.j4.s
    public r a(s.a aVar, com.smartdigimkt.n4.b bVar) {
        d dVar = new d(this.j0.a(aVar, bVar), this.m0, this.u0, this.v0);
        this.p0.add(dVar);
        return dVar;
    }

    @Override // com.smartdigimkt.j4.s
    public void a(r rVar) {
        com.smartdigimkt.p4.a.b(this.p0.remove(rVar));
        this.j0.a(((d) rVar).X);
        if (!this.p0.isEmpty() || this.n0) {
            return;
        }
        a(this.s0.f36012b);
    }

    @Override // com.smartdigimkt.j4.f
    public void a(Void r1, s sVar, com.smartdigimkt.w3.e0 e0Var, Object obj) {
        if (this.t0 != null) {
            return;
        }
        this.r0 = obj;
        a(e0Var);
    }

    public static final class a extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f35959c;
        private final long d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f35960e;
        private final boolean f;

        public a(com.smartdigimkt.w3.e0 e0Var, long j, long j2) throws b {
            super(e0Var);
            boolean z2 = false;
            if (e0Var.a() != 1) {
                throw new b(0);
            }
            com.smartdigimkt.w3.e0.c cVarA = e0Var.a(0, new com.smartdigimkt.w3.e0.c(), false);
            long jMax = Math.max(0L, j);
            long jMax2 = j2 == Long.MIN_VALUE ? cVarA.f39272i : Math.max(0L, j2);
            long j3 = cVarA.f39272i;
            if (j3 != -9223372036854775807L) {
                jMax2 = jMax2 > j3 ? j3 : jMax2;
                if (jMax != 0 && !cVarA.d) {
                    throw new b(1);
                }
                if (jMax > jMax2) {
                    throw new b(2);
                }
            }
            this.f35959c = jMax;
            this.d = jMax2;
            this.f35960e = jMax2 != -9223372036854775807L ? jMax2 - jMax : -9223372036854775807L;
            if (cVarA.f39270e && (jMax2 == -9223372036854775807L || (j3 != -9223372036854775807L && jMax2 == j3))) {
                z2 = true;
            }
            this.f = z2;
        }

        @Override // com.smartdigimkt.j4.p, com.smartdigimkt.w3.e0
        public com.smartdigimkt.w3.e0.c a(int i2, com.smartdigimkt.w3.e0.c cVar, boolean z2, long j) {
            this.f36012b.a(0, cVar, z2, 0L);
            long j2 = cVar.j;
            long j3 = this.f35959c;
            cVar.j = j2 + j3;
            cVar.f39272i = this.f35960e;
            cVar.f39270e = this.f;
            long j4 = cVar.f39271h;
            if (j4 != -9223372036854775807L) {
                long jMax = Math.max(j4, j3);
                cVar.f39271h = jMax;
                long j5 = this.d;
                if (j5 != -9223372036854775807L) {
                    jMax = Math.min(jMax, j5);
                }
                cVar.f39271h = jMax - this.f35959c;
            }
            long jB = com.smartdigimkt.w3.b.b(this.f35959c);
            long j6 = cVar.f39268b;
            if (j6 != -9223372036854775807L) {
                cVar.f39268b = j6 + jB;
            }
            long j7 = cVar.f39269c;
            if (j7 != -9223372036854775807L) {
                cVar.f39269c = j7 + jB;
            }
            return cVar;
        }

        @Override // com.smartdigimkt.j4.p, com.smartdigimkt.w3.e0
        public com.smartdigimkt.w3.e0.b a(int i2, com.smartdigimkt.w3.e0.b bVar, boolean z2) {
            this.f36012b.a(0, bVar, z2);
            long jF = bVar.f() - this.f35959c;
            long j = this.f35960e;
            return bVar.a(bVar.f39263a, bVar.f39264b, 0, j != -9223372036854775807L ? j - jF : -9223372036854775807L, jF);
        }
    }

    private void a(com.smartdigimkt.w3.e0 e0Var) {
        long j;
        long j2;
        e0Var.a(0, this.q0);
        long jF = this.q0.f();
        if (this.s0 != null && !this.p0.isEmpty() && !this.n0) {
            long j3 = this.u0 - jF;
            j2 = this.l0 != Long.MIN_VALUE ? this.v0 - jF : Long.MIN_VALUE;
            j = j3;
        } else {
            long j4 = this.k0;
            long j5 = this.l0;
            if (this.o0) {
                long jB = this.q0.b();
                j4 += jB;
                j5 += jB;
            }
            this.u0 = jF + j4;
            this.v0 = this.l0 != Long.MIN_VALUE ? jF + j5 : Long.MIN_VALUE;
            int size = this.p0.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.p0.get(i2).a(this.u0, this.v0);
            }
            j = j4;
            j2 = j5;
        }
        try {
            a aVar = new a(e0Var, j, j2);
            this.s0 = aVar;
            a(aVar, this.r0);
        } catch (b e2) {
            this.t0 = e2;
        }
    }

    @Override // com.smartdigimkt.j4.f
    public long a(Void r7, long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long jB = com.smartdigimkt.w3.b.b(this.k0);
        long jMax = Math.max(0L, j - jB);
        long j2 = this.l0;
        return j2 != Long.MIN_VALUE ? Math.min(com.smartdigimkt.w3.b.b(j2) - jB, jMax) : jMax;
    }
}
