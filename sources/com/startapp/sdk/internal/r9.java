package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class r9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g9 f41432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f41433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f41434c;
    public final /* synthetic */ w9 d;

    public r9(w9 w9Var, g9 g9Var, int i2, long j) {
        this.d = w9Var;
        this.f41432a = g9Var;
        this.f41433b = i2;
        this.f41434c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.d.a(this.f41432a, this.f41433b, this.f41434c);
        } catch (Throwable unused) {
        }
    }
}
