package com.smartdigimkt.w3;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a implements y, z {
    private final int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private a0 f39199Y;
    private int Z;
    private int e0;
    private com.smartdigimkt.j4.y f0;
    private m[] g0;
    private long h0;
    private boolean i0 = true;
    private boolean j0;

    public a(int i2) {
        this.X = i2;
    }

    @Override // com.smartdigimkt.w3.x.b
    public void a(int i2, Object obj) throws g {
    }

    public int b(long j) {
        return this.f0.d(j - this.h0);
    }

    @Override // com.smartdigimkt.w3.y
    public final void c() {
        com.smartdigimkt.p4.a.b(this.e0 == 1);
        this.e0 = 0;
        this.f0 = null;
        this.g0 = null;
        this.j0 = false;
        s();
    }

    @Override // com.smartdigimkt.w3.y
    public final int d() {
        return this.e0;
    }

    @Override // com.smartdigimkt.w3.y, com.smartdigimkt.w3.z
    public final int e() {
        return this.X;
    }

    @Override // com.smartdigimkt.w3.y
    public final boolean f() {
        return this.i0;
    }

    public int g() throws g {
        return 0;
    }

    @Override // com.smartdigimkt.w3.y
    public final com.smartdigimkt.j4.y h() {
        return this.f0;
    }

    @Override // com.smartdigimkt.w3.y
    public final void i() {
        this.j0 = true;
    }

    @Override // com.smartdigimkt.w3.y
    public final void j() throws IOException {
        this.f0.a();
    }

    @Override // com.smartdigimkt.w3.y
    public final boolean k() {
        return this.j0;
    }

    @Override // com.smartdigimkt.w3.y
    public com.smartdigimkt.p4.n l() {
        return null;
    }

    @Override // com.smartdigimkt.w3.y
    public final z m() {
        return this;
    }

    public final a0 o() {
        return this.f39199Y;
    }

    public final int p() {
        return this.Z;
    }

    public final m[] q() {
        return this.g0;
    }

    public final boolean r() {
        return this.i0 ? this.j0 : this.f0.isReady();
    }

    public void s() {
    }

    @Override // com.smartdigimkt.w3.y
    public final void start() throws g {
        com.smartdigimkt.p4.a.b(this.e0 == 1);
        this.e0 = 2;
        t();
    }

    @Override // com.smartdigimkt.w3.y
    public final void stop() throws g {
        com.smartdigimkt.p4.a.b(this.e0 == 2);
        this.e0 = 1;
        u();
    }

    public void t() throws g {
    }

    public void u() throws g {
    }

    public void a(long j, boolean z2) throws g {
    }

    public void a(boolean z2) throws g {
    }

    public void a(m[] mVarArr, long j) throws g {
    }

    @Override // com.smartdigimkt.w3.y
    public final void a(int i2) {
        this.Z = i2;
    }

    @Override // com.smartdigimkt.w3.y
    public final void a(a0 a0Var, m[] mVarArr, com.smartdigimkt.j4.y yVar, long j, boolean z2, long j2) throws g {
        com.smartdigimkt.p4.a.b(this.e0 == 0);
        this.f39199Y = a0Var;
        this.e0 = 1;
        a(z2);
        a(mVarArr, yVar, j2);
        a(j, z2);
    }

    @Override // com.smartdigimkt.w3.y
    public final void a(m[] mVarArr, com.smartdigimkt.j4.y yVar, long j) throws g {
        com.smartdigimkt.p4.a.b(!this.j0);
        this.f0 = yVar;
        this.i0 = false;
        this.g0 = mVarArr;
        this.h0 = j;
        a(mVarArr, j);
    }

    @Override // com.smartdigimkt.w3.y
    public final void a(long j) throws g {
        this.j0 = false;
        this.i0 = false;
        a(j, false);
    }

    public final int a(n nVar, com.smartdigimkt.z3.e eVar, boolean z2) {
        int iA = this.f0.a(nVar, eVar, z2);
        if (iA == -4) {
            if (eVar.c()) {
                this.i0 = true;
                return this.j0 ? -4 : -3;
            }
            eVar.d += this.h0;
            return iA;
        }
        if (iA == -5) {
            m mVar = nVar.f39343a;
            long j = mVar.j;
            if (j != Long.MAX_VALUE) {
                nVar.f39343a = mVar.a(j + this.h0);
            }
        }
        return iA;
    }

    public static boolean a(com.smartdigimkt.a4.g<?> gVar, com.smartdigimkt.a4.e eVar) {
        if (eVar == null) {
            return true;
        }
        if (gVar == null) {
            return false;
        }
        return gVar.a(eVar);
    }
}
