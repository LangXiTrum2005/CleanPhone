package com.smartdigimkt.h7;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f35692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f35693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Runnable f35694c;
    boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f35695e;
    private final com.smartdigimkt.h7.a f;
    b g;

    public class a implements b {
        public a() {
        }

        @Override // com.smartdigimkt.h7.b
        public boolean a() {
            return false;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar = c.this;
            cVar.d = false;
            cVar.f35693b = -1L;
            if (cVar.f35695e) {
                com.smartdigimkt.l7.b.a().e(c.this.f35694c);
            } else {
                com.smartdigimkt.l7.b.a().g(c.this.f35694c);
            }
        }
    }

    public c(long j, Runnable runnable) {
        this.d = false;
        this.f35695e = true;
        this.f = e.c();
        this.g = new a();
        this.f35693b = j;
        this.f35694c = runnable;
    }

    public synchronized void a() {
        if (this.d) {
            this.d = false;
            this.f35693b -= SystemClock.elapsedRealtime() - this.f35692a;
            this.f.a(this.g);
        }
    }

    public synchronized void b() {
        if (this.f35693b >= 0 && !this.d) {
            this.d = true;
            this.f35692a = SystemClock.elapsedRealtime();
            this.f.a(this.g, this.f35693b);
        }
    }

    public synchronized void c() {
        this.d = false;
        this.f.a(this.g);
        this.f35693b = -1L;
    }

    public c(long j, Runnable runnable, boolean z2) {
        this(j, runnable);
        this.f35695e = z2;
    }
}
