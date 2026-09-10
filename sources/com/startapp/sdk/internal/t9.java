package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class t9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g9 f41510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j9 f41511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w9 f41512c;

    public t9(w9 w9Var, g9 g9Var, j9 j9Var) {
        this.f41512c = w9Var;
        this.f41510a = g9Var;
        this.f41511b = j9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w9 w9Var = this.f41512c;
        Runnable runnable = (Runnable) w9Var.f.a(this.f41510a, this.f41511b, null);
        if (runnable != null) {
            w9Var.f41624c.execute(runnable);
        }
    }
}
