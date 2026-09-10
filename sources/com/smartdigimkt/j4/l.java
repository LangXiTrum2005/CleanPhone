package com.smartdigimkt.j4;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class l implements r, r.a {
    public final s X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final s.a f35994Y;
    private final com.smartdigimkt.n4.b Z;
    private r e0;
    private r.a f0;
    private long g0;
    private a h0;
    private boolean i0;
    private long j0 = -9223372036854775807L;

    public interface a {
        void a(s.a aVar, IOException iOException);
    }

    public l(s sVar, s.a aVar, com.smartdigimkt.n4.b bVar) {
        this.f35994Y = aVar;
        this.Z = bVar;
        this.X = sVar;
    }

    @Override // com.smartdigimkt.j4.r, com.smartdigimkt.j4.z
    public long b() {
        return this.e0.b();
    }

    @Override // com.smartdigimkt.j4.r, com.smartdigimkt.j4.z
    public long c() {
        return this.e0.c();
    }

    public void d(long j) {
        if (this.g0 != 0 || j == 0) {
            return;
        }
        this.j0 = j;
        this.g0 = j;
    }

    @Override // com.smartdigimkt.j4.r
    public long e() {
        return this.e0.e();
    }

    @Override // com.smartdigimkt.j4.r
    public f0 f() {
        return this.e0.f();
    }

    @Override // com.smartdigimkt.j4.r
    public void g() throws IOException {
        try {
            r rVar = this.e0;
            if (rVar != null) {
                rVar.g();
            } else {
                this.X.b();
            }
        } catch (IOException e2) {
            a aVar = this.h0;
            if (aVar == null) {
                throw e2;
            }
            if (this.i0) {
                return;
            }
            this.i0 = true;
            aVar.a(this.f35994Y, e2);
        }
    }

    public void a(a aVar) {
        this.h0 = aVar;
    }

    @Override // com.smartdigimkt.j4.r, com.smartdigimkt.j4.z
    public void b(long j) {
        this.e0.b(j);
    }

    @Override // com.smartdigimkt.j4.r
    public long c(long j) {
        return this.e0.c(j);
    }

    public void a() {
        r rVarA = this.X.a(this.f35994Y, this.Z);
        this.e0 = rVarA;
        if (this.f0 != null) {
            rVarA.a(this, this.g0);
        }
    }

    @Override // com.smartdigimkt.j4.z.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(r rVar) {
        this.f0.a(this);
    }

    public void d() {
        r rVar = this.e0;
        if (rVar != null) {
            this.X.a(rVar);
        }
    }

    @Override // com.smartdigimkt.j4.r
    public void a(r.a aVar, long j) {
        this.f0 = aVar;
        this.g0 = j;
        r rVar = this.e0;
        if (rVar != null) {
            rVar.a(this, j);
        }
    }

    @Override // com.smartdigimkt.j4.r
    public long a(com.smartdigimkt.m4.f[] fVarArr, boolean[] zArr, y[] yVarArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.j0;
        if (j3 == -9223372036854775807L || j != 0) {
            j2 = j;
        } else {
            this.j0 = -9223372036854775807L;
            j2 = j3;
        }
        return this.e0.a(fVarArr, zArr, yVarArr, zArr2, j2);
    }

    @Override // com.smartdigimkt.j4.r
    public void a(long j, boolean z2) {
        this.e0.a(j, z2);
    }

    @Override // com.smartdigimkt.j4.r
    public long a(long j, com.smartdigimkt.w3.c0 c0Var) {
        return this.e0.a(j, c0Var);
    }

    @Override // com.smartdigimkt.j4.r, com.smartdigimkt.j4.z
    public boolean a(long j) {
        r rVar = this.e0;
        return rVar != null && rVar.a(j);
    }

    @Override // com.smartdigimkt.j4.r.a
    public void a(r rVar) {
        this.f0.a((r) this);
    }
}
