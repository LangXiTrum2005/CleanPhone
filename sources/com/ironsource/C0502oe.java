package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.oe, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0502oe implements I8, I8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C0484ne f29940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f29941b;

    @Override // com.ironsource.I8
    public Va a() {
        C0484ne c0484ne = this.f29940a;
        if (c0484ne != null) {
            return new Va(c0484ne);
        }
        return null;
    }

    @Override // com.ironsource.I8
    public M9 b() {
        C0484ne c0484ne = this.f29940a;
        if (c0484ne != null) {
            return new M9(c0484ne);
        }
        return null;
    }

    @Override // com.ironsource.I8
    public boolean c() {
        return this.f29941b;
    }

    @Override // com.ironsource.I8.a
    public void d() {
        this.f29941b = true;
    }

    @Override // com.ironsource.I8.a
    public void a(C0484ne sdkConfig) {
        kotlin.jvm.internal.n.f(sdkConfig, "sdkConfig");
        this.f29940a = sdkConfig;
    }
}
