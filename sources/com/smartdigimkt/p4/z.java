package com.smartdigimkt.p4;

/* JADX INFO: loaded from: classes6.dex */
public final class z implements n {
    private final c X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private boolean f37639Y;
    private long Z;
    private long e0;
    private com.smartdigimkt.w3.v f0 = com.smartdigimkt.w3.v.f39373e;

    public z(c cVar) {
        this.X = cVar;
    }

    public void a() {
        if (this.f37639Y) {
            return;
        }
        this.e0 = this.X.b();
        this.f37639Y = true;
    }

    @Override // com.smartdigimkt.p4.n
    public com.smartdigimkt.w3.v b() {
        return this.f0;
    }

    public void c() {
        if (this.f37639Y) {
            a(n());
            this.f37639Y = false;
        }
    }

    @Override // com.smartdigimkt.p4.n
    public long n() {
        long j = this.Z;
        if (!this.f37639Y) {
            return j;
        }
        long jB = this.X.b() - this.e0;
        com.smartdigimkt.w3.v vVar = this.f0;
        return (vVar.f39374a == 1.0f ? com.smartdigimkt.w3.b.a(jB) : vVar.a(jB)) + j;
    }

    public void a(long j) {
        this.Z = j;
        if (this.f37639Y) {
            this.e0 = this.X.b();
        }
    }

    @Override // com.smartdigimkt.p4.n
    public com.smartdigimkt.w3.v a(com.smartdigimkt.w3.v vVar) {
        if (this.f37639Y) {
            a(n());
        }
        this.f0 = vVar;
        return vVar;
    }
}
