package com.inmobi.media;

import A.RunnableC0883c;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Oe {
    public static final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f23050e;
    public static final Ne f;
    public static final LinkedBlockingQueue g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static ThreadPoolExecutor f23051h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CountDownLatch f23052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N9 f23053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f23054c;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        d = Math.max(2, Math.min(iAvailableProcessors - 1, 4));
        f23050e = (iAvailableProcessors * 2) + 1;
        f = new Ne();
        g = new LinkedBlockingQueue(128);
    }

    public Oe(Me vastMediaFile, int i2, CountDownLatch countDownLatch) {
        Intrinsics.f(vastMediaFile, "vastMediaFile");
        N9 n9 = new N9(vastMediaFile.f22988a, null);
        this.f23053b = n9;
        n9.t = false;
        n9.f23014u = false;
        n9.x = false;
        n9.f23013p = i2;
        n9.s = true;
        this.f23054c = new WeakReference(vastMediaFile);
        this.f23052a = countDownLatch;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(d, f23050e, 30L, TimeUnit.SECONDS, g, f);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f23051h = threadPoolExecutor;
    }

    public final void a() {
        ThreadPoolExecutor threadPoolExecutor = f23051h;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.execute(new RunnableC0883c(this, 8));
        }
    }

    public static final void a(Oe this$0) {
        Intrinsics.f(this$0, "this$0");
        try {
            P9 p9B = this$0.f23053b.b();
            if (!p9B.b()) {
                this$0.a(p9B);
                return;
            }
            CountDownLatch countDownLatch = this$0.f23052a;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        } catch (Exception unused) {
            EnumC3157o4 errorCode = EnumC3157o4.f23855e;
            Intrinsics.f(errorCode, "errorCode");
            CountDownLatch countDownLatch2 = this$0.f23052a;
            if (countDownLatch2 != null) {
                countDownLatch2.countDown();
            }
        }
    }

    public final void a(P9 p9) {
        CountDownLatch countDownLatch;
        try {
            try {
                Me me2 = (Me) this.f23054c.get();
                if (me2 != null) {
                    me2.f22990c = (((double) p9.f23073e) * 1.0d) / ((double) 1048576);
                }
                countDownLatch = this.f23052a;
                if (countDownLatch == null) {
                    return;
                }
            } catch (Exception e2) {
                S5 s5 = S5.f23167a;
                S5.d.a(new C3011f2(e2));
                countDownLatch = this.f23052a;
                if (countDownLatch == null) {
                    return;
                }
            }
            countDownLatch.countDown();
        } catch (Throwable th) {
            CountDownLatch countDownLatch2 = this.f23052a;
            if (countDownLatch2 != null) {
                countDownLatch2.countDown();
            }
            throw th;
        }
    }
}
