package com.smartdigimkt.h0;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public class k {
    private static final String g = "k";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f35599a;
    private com.smartdigimkt.m0.a f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set<j> f35601c = new HashSet();
    private ExecutorService d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AtomicInteger f35602e = new AtomicInteger();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.smartdigimkt.h0.c f35600b = new d(new Handler(Looper.getMainLooper()));

    public class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f35603a;

        public a(Object obj) {
            this.f35603a = obj;
        }

        @Override // com.smartdigimkt.h0.k.c
        public boolean a(j<?> jVar) {
            return jVar.m() == this.f35603a;
        }
    }

    public class b implements Runnable {
        final /* synthetic */ j X;

        public b(j jVar) {
            this.X = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (k.this.f == null) {
                new i(k.this.f35599a, null, k.this.f35600b).b(this.X);
            } else {
                new i(k.this.f35599a, null, k.this.f35600b, k.this.f).b(this.X);
            }
        }
    }

    public interface c {
        boolean a(j<?> jVar);
    }

    public k(Context context) {
        this.f35599a = context.getApplicationContext();
    }

    public int a() {
        return this.f35602e.incrementAndGet();
    }

    public void b(j jVar) {
        synchronized (this) {
            this.f35601c.remove(jVar);
        }
    }

    public void a(c cVar) {
        synchronized (this) {
            try {
                for (j jVar : this.f35601c) {
                    if (cVar.a(jVar)) {
                        jVar.a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public k(Context context, com.smartdigimkt.m0.a aVar) {
        this.f = aVar;
        this.f35599a = context.getApplicationContext();
    }

    public void a(Object obj) {
        if (obj != null) {
            a((c) new a(obj));
            return;
        }
        throw new IllegalArgumentException("Cannot cancelAll with a null tag");
    }

    public void a(j jVar) {
        jVar.a(this);
        synchronized (this) {
            this.f35601c.add(jVar);
        }
        jVar.a(a());
        this.d.execute(new b(jVar));
    }
}
