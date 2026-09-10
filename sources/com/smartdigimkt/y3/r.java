package com.smartdigimkt.y3;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.smartdigimkt.p4.d0;
import com.smartdigimkt.p4.f0;
import com.smartdigimkt.w3.v;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class r extends com.smartdigimkt.w3.a implements com.smartdigimkt.p4.n {
    private static final int I0 = 0;
    private static final int J0 = 1;
    private static final int K0 = 2;
    private boolean A0;
    private boolean B0;
    private long C0;
    private boolean D0;
    private boolean E0;
    private boolean F0;
    private boolean G0;
    private boolean H0;
    private final com.smartdigimkt.a4.g<com.smartdigimkt.a4.i> k0;
    private final boolean l0;
    private final g.a m0;
    private final h n0;
    private final com.smartdigimkt.w3.n o0;
    private final com.smartdigimkt.z3.e p0;
    private com.smartdigimkt.z3.d q0;
    private com.smartdigimkt.w3.m r0;
    private int s0;
    private int t0;
    private com.smartdigimkt.z3.g<com.smartdigimkt.z3.e, ? extends com.smartdigimkt.z3.h, ? extends e> u0;
    private com.smartdigimkt.z3.e v0;
    private com.smartdigimkt.z3.h w0;
    private com.smartdigimkt.a4.f<com.smartdigimkt.a4.i> x0;
    private com.smartdigimkt.a4.f<com.smartdigimkt.a4.i> y0;
    private int z0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public r() {
        this((Handler) null, (g) null, new f[0]);
    }

    private void B() throws com.smartdigimkt.w3.g {
        this.G0 = true;
        try {
            this.n0.d();
        } catch (h.d e2) {
            throw com.smartdigimkt.w3.g.a(e2, p());
        }
    }

    private void C() {
        com.smartdigimkt.z3.g<com.smartdigimkt.z3.e, ? extends com.smartdigimkt.z3.h, ? extends e> gVar = this.u0;
        if (gVar == null) {
            return;
        }
        this.v0 = null;
        this.w0 = null;
        gVar.release();
        this.u0 = null;
        this.q0.f40346b++;
        this.z0 = 0;
        this.A0 = false;
    }

    private void D() {
        long jA = this.n0.a(a());
        if (jA != Long.MIN_VALUE) {
            if (!this.E0) {
                jA = Math.max(this.C0, jA);
            }
            this.C0 = jA;
            this.E0 = false;
        }
    }

    private boolean v() throws com.smartdigimkt.w3.g, h.b, h.a, e, h.d {
        if (this.w0 == null) {
            com.smartdigimkt.z3.h hVar = (com.smartdigimkt.z3.h) this.u0.b();
            this.w0 = hVar;
            if (hVar == null) {
                return false;
            }
            this.q0.f += hVar.f40356c;
        }
        if (this.w0.c()) {
            if (this.z0 == 2) {
                C();
                z();
                this.B0 = true;
            } else {
                this.w0.e();
                this.w0 = null;
                B();
            }
            return false;
        }
        if (this.B0) {
            com.smartdigimkt.w3.m mVarY = y();
            this.n0.a(mVarY.f39340u, mVarY.s, mVarY.t, 0, null, this.s0, this.t0);
            this.B0 = false;
        }
        h hVar2 = this.n0;
        com.smartdigimkt.z3.h hVar3 = this.w0;
        if (!hVar2.a(hVar3.f40364e, hVar3.f40355b)) {
            return false;
        }
        this.q0.f40348e++;
        this.w0.e();
        this.w0 = null;
        return true;
    }

    private boolean w() throws Exception {
        com.smartdigimkt.z3.g<com.smartdigimkt.z3.e, ? extends com.smartdigimkt.z3.h, ? extends e> gVar = this.u0;
        if (gVar == null || this.z0 == 2 || this.F0) {
            return false;
        }
        if (this.v0 == null) {
            com.smartdigimkt.z3.e eVarC = gVar.c();
            this.v0 = eVarC;
            if (eVarC == null) {
                return false;
            }
        }
        if (this.z0 == 1) {
            this.v0.d(4);
            this.u0.a(this.v0);
            this.v0 = null;
            this.z0 = 2;
            return false;
        }
        int iA = this.H0 ? -4 : a(this.o0, this.v0, false);
        if (iA == -3) {
            return false;
        }
        if (iA == -5) {
            b(this.o0.f39343a);
            return true;
        }
        if (this.v0.c()) {
            this.F0 = true;
            this.u0.a(this.v0);
            this.v0 = null;
            return false;
        }
        boolean zB = b(this.v0.f());
        this.H0 = zB;
        if (zB) {
            return false;
        }
        this.v0.e();
        a(this.v0);
        this.u0.a(this.v0);
        this.A0 = true;
        this.q0.f40347c++;
        this.v0 = null;
        return true;
    }

    private void x() throws com.smartdigimkt.w3.g {
        this.H0 = false;
        if (this.z0 != 0) {
            C();
            z();
            return;
        }
        this.v0 = null;
        com.smartdigimkt.z3.h hVar = this.w0;
        if (hVar != null) {
            hVar.e();
            this.w0 = null;
        }
        this.u0.flush();
        this.A0 = false;
    }

    private void z() throws com.smartdigimkt.w3.g {
        com.smartdigimkt.a4.i iVarF;
        if (this.u0 != null) {
            return;
        }
        com.smartdigimkt.a4.f<com.smartdigimkt.a4.i> fVar = this.y0;
        this.x0 = fVar;
        if (fVar != null) {
            iVarF = fVar.f();
            if (iVarF == null && this.x0.h() == null) {
                return;
            }
        } else {
            iVarF = null;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            d0.a("createAudioDecoder");
            this.u0 = a(this.r0, iVarF);
            d0.a();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            this.m0.a(this.u0.a(), jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
            this.q0.f40345a++;
        } catch (e e2) {
            throw com.smartdigimkt.w3.g.a(e2, p());
        }
    }

    public void A() {
    }

    public abstract int a(com.smartdigimkt.a4.g<com.smartdigimkt.a4.i> gVar, com.smartdigimkt.w3.m mVar);

    public abstract com.smartdigimkt.z3.g<com.smartdigimkt.z3.e, ? extends com.smartdigimkt.z3.h, ? extends e> a(com.smartdigimkt.w3.m mVar, com.smartdigimkt.a4.i iVar) throws e;

    public void a(int i2, long j, long j2) {
    }

    public void b(int i2) {
    }

    public final boolean c(int i2) {
        return this.n0.b(i2);
    }

    @Override // com.smartdigimkt.w3.y
    public boolean isReady() {
        if (this.n0.e()) {
            return true;
        }
        if (this.r0 == null || this.H0) {
            return false;
        }
        return r() || this.w0 != null;
    }

    @Override // com.smartdigimkt.w3.a, com.smartdigimkt.w3.y
    public com.smartdigimkt.p4.n l() {
        return this;
    }

    @Override // com.smartdigimkt.p4.n
    public long n() {
        if (d() == 2) {
            D();
        }
        return this.C0;
    }

    @Override // com.smartdigimkt.w3.a
    public void s() {
        this.r0 = null;
        this.B0 = true;
        this.H0 = false;
        try {
            C();
            this.n0.release();
            try {
                com.smartdigimkt.a4.f<com.smartdigimkt.a4.i> fVar = this.x0;
                if (fVar != null) {
                    this.k0.a(fVar);
                }
                try {
                    com.smartdigimkt.a4.f<com.smartdigimkt.a4.i> fVar2 = this.y0;
                    if (fVar2 != null && fVar2 != this.x0) {
                        this.k0.a(fVar2);
                    }
                } finally {
                    this.x0 = null;
                    this.y0 = null;
                    this.q0.a();
                    this.m0.a(this.q0);
                }
            } catch (Throwable th) {
                try {
                    com.smartdigimkt.a4.f<com.smartdigimkt.a4.i> fVar3 = this.y0;
                    if (fVar3 != null && fVar3 != this.x0) {
                        this.k0.a(fVar3);
                    }
                    throw th;
                } finally {
                    this.x0 = null;
                    this.y0 = null;
                    this.q0.a();
                    this.m0.a(this.q0);
                }
            }
        } catch (Throwable th2) {
            try {
                com.smartdigimkt.a4.f<com.smartdigimkt.a4.i> fVar4 = this.x0;
                if (fVar4 != null) {
                    this.k0.a(fVar4);
                }
                try {
                    com.smartdigimkt.a4.f<com.smartdigimkt.a4.i> fVar5 = this.y0;
                    if (fVar5 != null && fVar5 != this.x0) {
                        this.k0.a(fVar5);
                    }
                    throw th2;
                } finally {
                    this.x0 = null;
                    this.y0 = null;
                    this.q0.a();
                    this.m0.a(this.q0);
                }
            } catch (Throwable th3) {
                try {
                    com.smartdigimkt.a4.f<com.smartdigimkt.a4.i> fVar6 = this.y0;
                    if (fVar6 != null && fVar6 != this.x0) {
                        this.k0.a(fVar6);
                    }
                    throw th3;
                } finally {
                    this.x0 = null;
                    this.y0 = null;
                    this.q0.a();
                    this.m0.a(this.q0);
                }
            }
        }
    }

    @Override // com.smartdigimkt.w3.a
    public void t() {
        this.n0.f();
    }

    @Override // com.smartdigimkt.w3.a
    public void u() {
        D();
        this.n0.pause();
    }

    public com.smartdigimkt.w3.m y() {
        com.smartdigimkt.w3.m mVar = this.r0;
        return com.smartdigimkt.w3.m.a((String) null, "audio/raw", (String) null, -1, -1, mVar.s, mVar.t, 2, (List<byte[]>) null, (com.smartdigimkt.a4.e) null, 0, (String) null);
    }

    public final class b implements h.c {
        private b() {
        }

        @Override // com.smartdigimkt.y3.h.c
        public void a(int i2) {
            r.this.m0.a(i2);
            r.this.b(i2);
        }

        @Override // com.smartdigimkt.y3.h.c
        public void a() {
            r.this.A();
            r.this.E0 = true;
        }

        @Override // com.smartdigimkt.y3.h.c
        public void a(int i2, long j, long j2) {
            r.this.m0.a(i2, j, j2);
            r.this.a(i2, j, j2);
        }
    }

    public r(Handler handler, g gVar, f... fVarArr) {
        this(handler, gVar, null, null, false, fVarArr);
    }

    private boolean b(boolean z2) throws com.smartdigimkt.w3.g {
        com.smartdigimkt.a4.f<com.smartdigimkt.a4.i> fVar = this.x0;
        if (fVar == null || (!z2 && this.l0)) {
            return false;
        }
        int iD = fVar.d();
        if (iD != 1) {
            return iD != 4;
        }
        throw com.smartdigimkt.w3.g.a(this.x0.h(), p());
    }

    public r(Handler handler, g gVar, com.smartdigimkt.y3.c cVar) {
        this(handler, gVar, cVar, null, false, new f[0]);
    }

    public r(Handler handler, g gVar, com.smartdigimkt.y3.c cVar, com.smartdigimkt.a4.g<com.smartdigimkt.a4.i> gVar2, boolean z2, f... fVarArr) {
        this(handler, gVar, gVar2, z2, new l(cVar, fVarArr));
    }

    @Override // com.smartdigimkt.w3.z
    public final int a(com.smartdigimkt.w3.m mVar) {
        int iA = a(this.k0, mVar);
        if (iA <= 2) {
            return iA;
        }
        return iA | (f0.f37540a >= 21 ? 32 : 0) | 8;
    }

    public r(Handler handler, g gVar, com.smartdigimkt.a4.g<com.smartdigimkt.a4.i> gVar2, boolean z2, h hVar) {
        super(1);
        this.k0 = gVar2;
        this.l0 = z2;
        this.m0 = new g.a(handler, gVar);
        this.n0 = hVar;
        hVar.a(new b());
        this.o0 = new com.smartdigimkt.w3.n();
        this.p0 = com.smartdigimkt.z3.e.h();
        this.z0 = 0;
        this.B0 = true;
    }

    @Override // com.smartdigimkt.p4.n
    public v b() {
        return this.n0.b();
    }

    private void b(com.smartdigimkt.w3.m mVar) throws com.smartdigimkt.w3.g {
        com.smartdigimkt.w3.m mVar2 = this.r0;
        this.r0 = mVar;
        if (!f0.a(mVar.f39336i, mVar2 == null ? null : mVar2.f39336i)) {
            if (this.r0.f39336i != null) {
                com.smartdigimkt.a4.g<com.smartdigimkt.a4.i> gVar = this.k0;
                if (gVar != null) {
                    com.smartdigimkt.a4.f<com.smartdigimkt.a4.i> fVarA = gVar.a(Looper.myLooper(), this.r0.f39336i);
                    this.y0 = fVarA;
                    if (fVarA == this.x0) {
                        this.k0.a(fVarA);
                    }
                } else {
                    throw com.smartdigimkt.w3.g.a(new IllegalStateException("Media requires a DrmSessionManager"), p());
                }
            } else {
                this.y0 = null;
            }
        }
        if (this.A0) {
            this.z0 = 1;
        } else {
            C();
            z();
            this.B0 = true;
        }
        this.s0 = mVar.v;
        this.t0 = mVar.f39341w;
        this.m0.a(mVar);
    }

    @Override // com.smartdigimkt.w3.y
    public void a(long j, long j2) throws com.smartdigimkt.w3.g {
        if (this.G0) {
            try {
                this.n0.d();
                return;
            } catch (h.d e2) {
                throw com.smartdigimkt.w3.g.a(e2, p());
            }
        }
        if (this.r0 == null) {
            this.p0.a();
            int iA = a(this.o0, this.p0, true);
            if (iA != -5) {
                if (iA == -4) {
                    com.smartdigimkt.p4.a.b(this.p0.c());
                    this.F0 = true;
                    B();
                    return;
                }
                return;
            }
            b(this.o0.f39343a);
        }
        z();
        if (this.u0 != null) {
            try {
                d0.a("drainAndFeed");
                while (v()) {
                }
                while (w()) {
                }
                d0.a();
                this.q0.a();
            } catch (e | h.a | h.b | h.d e3) {
                throw com.smartdigimkt.w3.g.a(e3, p());
            }
        }
    }

    @Override // com.smartdigimkt.w3.y
    public boolean a() {
        return this.G0 && this.n0.a();
    }

    @Override // com.smartdigimkt.p4.n
    public v a(v vVar) {
        return this.n0.a(vVar);
    }

    @Override // com.smartdigimkt.w3.a
    public void a(boolean z2) throws com.smartdigimkt.w3.g {
        com.smartdigimkt.z3.d dVar = new com.smartdigimkt.z3.d();
        this.q0 = dVar;
        this.m0.b(dVar);
        int i2 = o().f39201a;
        if (i2 != 0) {
            this.n0.c(i2);
        } else {
            this.n0.g();
        }
    }

    @Override // com.smartdigimkt.w3.a
    public void a(long j, boolean z2) throws com.smartdigimkt.w3.g {
        this.n0.c();
        this.C0 = j;
        this.D0 = true;
        this.E0 = true;
        this.F0 = false;
        this.G0 = false;
        if (this.u0 != null) {
            x();
        }
    }

    @Override // com.smartdigimkt.w3.a, com.smartdigimkt.w3.x.b
    public void a(int i2, Object obj) throws com.smartdigimkt.w3.g {
        if (i2 == 2) {
            this.n0.a(((Float) obj).floatValue());
        } else if (i2 != 3) {
            super.a(i2, obj);
        } else {
            this.n0.a((com.smartdigimkt.y3.b) obj);
        }
    }

    private void a(com.smartdigimkt.z3.e eVar) {
        if (!this.D0 || eVar.b()) {
            return;
        }
        if (Math.abs(eVar.d - this.C0) > 500000) {
            this.C0 = eVar.d;
        }
        this.D0 = false;
    }
}
