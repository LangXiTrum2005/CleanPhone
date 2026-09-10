package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes6.dex */
public abstract class z9 implements Runnable, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g9 f41764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9 f41765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q9 f41766c;

    public z9(g9 g9Var, j9 j9Var, q9 q9Var) {
        this.f41764a = g9Var;
        this.f41765b = j9Var;
        this.f41766c = q9Var;
    }

    public abstract int a();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((z9) obj).f41765b.f41138c - this.f41765b.f41138c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int iA = a();
            q9 q9Var = this.f41766c;
            if (q9Var != null) {
                q9Var.a(this.f41764a, iA);
            }
        } catch (OutOfMemoryError unused) {
            if (this.f41766c != null) {
                this.f41766c.a(this.f41764a, 0);
            }
        } catch (Throwable th) {
            try {
                if (this.f41764a.f40999a != h9.f) {
                    g9.a(th);
                }
            } finally {
                q9 q9Var2 = this.f41766c;
                if (q9Var2 != null) {
                    q9Var2.a(this.f41764a, 0);
                }
            }
        }
    }
}
