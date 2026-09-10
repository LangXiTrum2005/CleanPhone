package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class x1 implements zd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f41650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ce f41651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y1 f41652c;

    /* JADX WARN: Multi-variable type inference failed */
    public x1(y1 y1Var, zd zdVar) {
        this.f41652c = y1Var;
        this.f41651b = (ce) zdVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.startapp.sdk.internal.ce, com.startapp.sdk.internal.zd] */
    @Override // com.startapp.sdk.internal.zd
    public final synchronized void a(Object obj) {
        if (this.f41650a) {
            return;
        }
        this.f41650a = true;
        this.f41652c.f41699c.removeCallbacksAndMessages(null);
        this.f41651b.a(obj);
    }
}
