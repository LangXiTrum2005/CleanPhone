package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class fj implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f40980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ek f40981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pe f40982c;
    public final /* synthetic */ ij d;

    public fj(ij ijVar, String str, ek ekVar, pe peVar) {
        this.d = ijVar;
        this.f40980a = str;
        this.f40981b = ekVar;
        this.f40982c = peVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ij ijVar = this.d;
        ijVar.a(ijVar.f41117b, this.f40980a, this.f40981b, this.f40982c);
    }
}
