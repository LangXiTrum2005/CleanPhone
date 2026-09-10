package com.applovin.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u4 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Executor f9831i = new da(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Executor f9832j = new da(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9834b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile Object f9839g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile Object f9840h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f9833a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f9835c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f9836d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f9837e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f9838f = false;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface a {
        void a(Object obj);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface b {
        void a(boolean z10, Object obj, Object obj2);
    }

    public u4(String str) {
        this.f9834b = str;
    }

    public boolean e() {
        return this.f9836d && !this.f9837e;
    }

    public String toString() {
        String str;
        if (!this.f9836d) {
            str = "Waiting";
        } else if (this.f9837e) {
            str = "Success -> " + this.f9839g;
        } else {
            str = "Failed -> " + this.f9840h;
        }
        return "Promise(" + c() + ": " + str + ")";
    }

    public static u4 a(String str, Object obj) {
        return new u4(str).b(obj);
    }

    public u4 b(Object obj) {
        a(true, obj, (Object) null, false);
        return this;
    }

    public u4 c(Object obj) {
        a(false, (Object) null, obj, true);
        return this;
    }

    public boolean d() {
        return this.f9836d;
    }

    public u4 a(Object obj) {
        a(false, (Object) null, obj, false);
        return this;
    }

    public Object b() {
        m1.a(e());
        return this.f9840h;
    }

    public String c() {
        String str = this.f9834b;
        return str != null ? str : super.toString();
    }

    private Runnable c(Executor executor, b bVar) {
        return new androidx.fragment.app.d(this, executor, bVar, 25);
    }

    public void a(Executor executor, Runnable runnable) {
        a(executor, new t8(runnable, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Runnable runnable, boolean z10, Object obj, Object obj2) {
        if (z10) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Executor executor, b bVar) {
        try {
            executor.execute(new x8(18, this, bVar));
        } catch (Throwable th2) {
            a(th2);
        }
    }

    public void a(Executor executor, a aVar) {
        a(executor, new t8(aVar, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(a aVar, boolean z10, Object obj, Object obj2) {
        if (z10) {
            return;
        }
        aVar.a(obj2);
    }

    public void a(Executor executor, b bVar) {
        Runnable runnableC = c(executor, bVar);
        synchronized (this.f9833a) {
            try {
                if (!this.f9836d) {
                    this.f9835c.add(runnableC);
                } else {
                    runnableC.run();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean a() {
        return this.f9836d && this.f9838f;
    }

    private void a(boolean z10, Object obj, Object obj2, boolean z11) {
        synchronized (this.f9833a) {
            try {
                if (this.f9836d) {
                    return;
                }
                this.f9839g = obj;
                this.f9840h = obj2;
                this.f9837e = z10;
                this.f9838f = z11;
                this.f9836d = true;
                Iterator it = this.f9835c.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                this.f9835c.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        try {
            bVar.a(this.f9837e, this.f9839g, this.f9840h);
        } catch (Throwable th2) {
            a(th2);
        }
    }

    private void a(Throwable th2) {
        m1.a(th2);
        com.applovin.impl.sdk.l lVar = com.applovin.impl.sdk.l.E0;
        if (lVar != null) {
            lVar.E().a("Promise", "PromiseCallback: " + c(), th2);
        }
    }
}
