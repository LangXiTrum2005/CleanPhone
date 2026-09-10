package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HandlerThread f10366a;
    private volatile Handler d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Queue<c> f10367b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Queue<Message> f10368c = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f10369e = new Object();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            while (!p.this.f10368c.isEmpty()) {
                if (p.this.d != null) {
                    try {
                        p.this.d.sendMessageAtFrontOfQueue((Message) p.this.f10368c.poll());
                    } catch (Throwable unused) {
                    }
                }
            }
            while (!p.this.f10367b.isEmpty()) {
                c cVar = (c) p.this.f10367b.poll();
                if (p.this.d != null) {
                    try {
                        p.this.d.sendMessageAtTime(cVar.f10374a, cVar.f10375b);
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
    }

    public class b extends HandlerThread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile int f10371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile boolean f10372b;

        public b(String str) {
            super(str);
            this.f10371a = 0;
            this.f10372b = false;
        }

        /* JADX INFO: Infinite loop detected, blocks: 19, insns: 0 */
        @Override // android.os.HandlerThread
        public final void onLooperPrepared() {
            super.onLooperPrepared();
            synchronized (p.this.f10369e) {
                try {
                    p.this.d = new Handler();
                } catch (Throwable th) {
                    throw th;
                }
            }
            p.this.d.post(p.this.new a());
            while (true) {
                try {
                    Looper.loop();
                } catch (Throwable th2) {
                    try {
                        com.apm.insight.b.f.a(com.apm.insight.e.g()).a().c();
                        if (this.f10371a < 5) {
                            com.apm.insight.c.a();
                            j.a(th2, "NPTH_CATCH");
                        } else if (!this.f10372b) {
                            this.f10372b = true;
                            com.apm.insight.c.a();
                            j.a(new RuntimeException(), "NPTH_ERR_MAX");
                        }
                        this.f10371a++;
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Message f10374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f10375b;

        public c(Message message, long j) {
            this.f10374a = message;
            this.f10375b = j;
        }
    }

    static {
        new Object() { // from class: com.apm.insight.runtime.p.1
        };
        new Object() { // from class: com.apm.insight.runtime.p.2
        };
    }

    public p(String str) {
        this.f10366a = new b(str);
    }

    public final void b() {
        this.f10366a.start();
    }

    public final HandlerThread c() {
        return this.f10366a;
    }

    private Message b(Runnable runnable) {
        return Message.obtain(this.d, runnable);
    }

    public final Handler a() {
        return this.d;
    }

    private boolean b(Message message, long j) {
        if (this.d == null) {
            synchronized (this.f10369e) {
                try {
                    if (this.d == null) {
                        this.f10367b.add(new c(message, j));
                        return true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        try {
            return this.d.sendMessageAtTime(message, j);
        } catch (Throwable unused) {
            return true;
        }
    }

    public final boolean a(Runnable runnable) {
        return a(b(runnable), 0L);
    }

    public final boolean a(Runnable runnable, long j) {
        return a(b(runnable), j);
    }

    private boolean a(Message message, long j) {
        if (j < 0) {
            j = 0;
        }
        return b(message, SystemClock.uptimeMillis() + j);
    }
}
