package com.smartdigimkt.w3;

/* JADX INFO: loaded from: classes6.dex */
final class e implements com.smartdigimkt.p4.n {
    private final com.smartdigimkt.p4.z X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private final a f39261Y;
    private y Z;
    private com.smartdigimkt.p4.n e0;

    public interface a {
        void onPlaybackParametersChanged(v vVar);
    }

    public e(a aVar, com.smartdigimkt.p4.c cVar) {
        this.f39261Y = aVar;
        this.X = new com.smartdigimkt.p4.z(cVar);
    }

    private boolean c() {
        y yVar = this.Z;
        if (yVar == null || yVar.a()) {
            return false;
        }
        return this.Z.isReady() || !this.Z.f();
    }

    public void a(long j) {
        this.X.a(j);
    }

    public void b(y yVar) throws g {
        com.smartdigimkt.p4.n nVar;
        com.smartdigimkt.p4.n nVarL = yVar.l();
        if (nVarL == null || nVarL == (nVar = this.e0)) {
            return;
        }
        if (nVar != null) {
            throw g.a(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
        this.e0 = nVarL;
        this.Z = yVar;
        nVarL.a(this.X.b());
        a();
    }

    public void d() {
        this.X.a();
    }

    public void e() {
        this.X.c();
    }

    public long f() {
        if (!c()) {
            return this.X.n();
        }
        a();
        return this.e0.n();
    }

    @Override // com.smartdigimkt.p4.n
    public long n() {
        return c() ? this.e0.n() : this.X.n();
    }

    public void a(y yVar) {
        if (yVar == this.Z) {
            this.e0 = null;
            this.Z = null;
        }
    }

    @Override // com.smartdigimkt.p4.n
    public v a(v vVar) {
        com.smartdigimkt.p4.n nVar = this.e0;
        if (nVar != null) {
            vVar = nVar.a(vVar);
        }
        this.X.a(vVar);
        this.f39261Y.onPlaybackParametersChanged(vVar);
        return vVar;
    }

    @Override // com.smartdigimkt.p4.n
    public v b() {
        com.smartdigimkt.p4.n nVar = this.e0;
        return nVar != null ? nVar.b() : this.X.b();
    }

    private void a() {
        this.X.a(this.e0.n());
        v vVarB = this.e0.b();
        if (vVarB.equals(this.X.b())) {
            return;
        }
        this.X.a(vVarB);
        this.f39261Y.onPlaybackParametersChanged(vVarB);
    }
}
