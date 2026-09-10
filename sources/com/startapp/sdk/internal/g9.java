package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class g9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h9 f40999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f41000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f41001c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f41002e;
    public Object f;
    public String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Long f41003h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f41004i;
    public boolean j;
    public String k;

    public g9(h9 h9Var) {
        if (h9Var != h9.f) {
            this.f40999a = h9Var;
        } else {
            this.f40999a = h9.f41040e;
        }
        h9 h9Var2 = this.f40999a;
        if (h9Var2 == h9.f41040e || h9Var2 == h9.d) {
            this.f41004i = vi.a(vi.a(0));
        }
        this.f41000b = 0L;
    }

    public static void a(Throwable th) {
        try {
            new g9(th).a();
        } catch (Throwable unused) {
        }
    }

    public final void a() {
        try {
            com.startapp.sdk.components.a aVar = com.startapp.sdk.components.a.f40723U.f41603a;
            if (aVar != null) {
                ((w9) aVar.q.a()).a(this);
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(Throwable th, h9 h9Var) {
        try {
            new g9(th, h9Var).a();
        } catch (Throwable unused) {
        }
    }

    public g9(Throwable th) {
        this.f40999a = h9.f;
        this.f41002e = vi.b(th);
        this.d = vi.a(vi.a(th));
        this.f41004i = vi.a(vi.a(1));
        this.f41000b = 0L;
    }

    public g9(Throwable th, h9 h9Var) {
        boolean z2 = h9Var == h9.g;
        this.f40999a = h9Var;
        this.f41002e = vi.b(th);
        this.d = vi.a(vi.a(th));
        this.f41004i = z2 ? th.getClass().getName() : vi.a(vi.a(1));
        this.f41000b = 0L;
    }

    public g9(h9 h9Var, long j) {
        this.f40999a = h9Var;
        this.f41000b = j;
    }
}
