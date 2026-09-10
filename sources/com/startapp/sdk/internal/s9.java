package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class s9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g9 f41477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j9 f41478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w9 f41479c;

    public s9(w9 w9Var, g9 g9Var, j9 j9Var) {
        this.f41479c = w9Var;
        this.f41477a = g9Var;
        this.f41478b = j9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w9 w9Var = this.f41479c;
        g9 g9Var = this.f41477a;
        j9 j9Var = this.f41478b;
        w9Var.getClass();
        try {
            w9Var.f41622a.a(g9Var, j9Var);
        } catch (Throwable unused) {
        }
    }
}
