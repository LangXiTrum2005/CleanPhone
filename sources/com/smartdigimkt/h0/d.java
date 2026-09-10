package com.smartdigimkt.h0;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public class d implements com.smartdigimkt.h0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f35567a = "d";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f35568b;

    public class a implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Handler f35569a;

        public a(Handler handler) {
            this.f35569a = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f35569a.post(runnable);
        }
    }

    public class b implements Runnable {
        final /* synthetic */ j X;

        public b(j jVar) {
            this.X = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.X.c();
        }
    }

    public class c implements Runnable {
        final /* synthetic */ j X;

        public c(j jVar) {
            this.X = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.X.b();
        }
    }

    /* JADX INFO: renamed from: com.smartdigimkt.h0.d$d, reason: collision with other inner class name */
    public class RunnableC0497d implements Runnable {
        final /* synthetic */ j X;

        public RunnableC0497d(j jVar) {
            this.X = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.X.e();
        }
    }

    public class e implements Runnable {
        final /* synthetic */ j X;

        public e(j jVar) {
            this.X = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.X.d();
        }
    }

    public class f implements Runnable {
        final /* synthetic */ j X;

        public f(j jVar) {
            this.X = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.X.f();
        }
    }

    public class g implements Runnable {
        final /* synthetic */ j X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ long f35576Y;
        final /* synthetic */ long Z;

        public g(j jVar, long j, long j2) {
            this.X = jVar;
            this.f35576Y = j;
            this.Z = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.X.a(this.f35576Y, this.Z);
        }
    }

    public class h implements Runnable {
        private final j X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        private final l f35577Y;

        public h(j jVar, l lVar) {
            this.X = jVar;
            this.f35577Y = lVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.X.p()) {
                this.X.a("canceled-at-delivery");
                this.X.b();
                return;
            }
            if (this.f35577Y.a()) {
                this.X.a(this.f35577Y);
            } else {
                this.X.a(this.f35577Y.f35607b);
            }
            this.X.a("done");
            this.X.c();
        }
    }

    public d(Handler handler) {
        this.f35568b = new a(handler);
    }

    @Override // com.smartdigimkt.h0.c
    public void a(j<?> jVar, l<?> lVar) {
        Executor executor = this.f35568b;
        if (executor != null) {
            executor.execute(new h(jVar, lVar));
        }
    }

    @Override // com.smartdigimkt.h0.c
    public void b(j<?> jVar) {
        Executor executor = this.f35568b;
        if (executor != null) {
            executor.execute(new c(jVar));
        }
    }

    @Override // com.smartdigimkt.h0.c
    public void c(j<?> jVar) {
        Executor executor = this.f35568b;
        if (executor != null) {
            executor.execute(new RunnableC0497d(jVar));
        }
    }

    @Override // com.smartdigimkt.h0.c
    public void d(j<?> jVar) {
        Executor executor = this.f35568b;
        if (executor != null) {
            executor.execute(new e(jVar));
        }
    }

    @Override // com.smartdigimkt.h0.c
    public void e(j<?> jVar) {
        Executor executor = this.f35568b;
        if (executor != null) {
            executor.execute(new f(jVar));
        }
    }

    @Override // com.smartdigimkt.h0.c
    public void a(j<?> jVar, com.smartdigimkt.i0.a aVar) {
        if (this.f35568b != null) {
            this.f35568b.execute(new h(jVar, l.a(aVar)));
        }
    }

    @Override // com.smartdigimkt.h0.c
    public void a(j<?> jVar) {
        Executor executor = this.f35568b;
        if (executor != null) {
            executor.execute(new b(jVar));
        }
    }

    @Override // com.smartdigimkt.h0.c
    public void a(j<?> jVar, long j, long j2) {
        Executor executor = this.f35568b;
        if (executor != null) {
            executor.execute(new g(jVar, j, j2));
        }
    }
}
