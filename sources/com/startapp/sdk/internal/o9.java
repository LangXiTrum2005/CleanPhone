package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class o9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w9 f41306a;

    public o9(w9 w9Var) {
        this.f41306a = w9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f41306a.b();
        } catch (Throwable unused) {
        }
    }
}
