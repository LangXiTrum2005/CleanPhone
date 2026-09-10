package com.smartdigimkt.n4;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends s.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f37048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a0<? super h> f37049c;
    private final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f37050e;
    private final boolean f;

    public q(String str) {
        this(str, null);
    }

    @Override // com.smartdigimkt.n4.s.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p a(s.g gVar) {
        return new p(this.f37048b, null, this.f37049c, this.d, this.f37050e, this.f, gVar);
    }

    public q(String str, a0<? super h> a0Var) {
        this(str, a0Var, 8000, 8000, false);
    }

    public q(String str, a0<? super h> a0Var, int i2, int i3, boolean z2) {
        this.f37048b = str;
        this.f37049c = a0Var;
        this.d = i2;
        this.f37050e = i3;
        this.f = z2;
    }
}
