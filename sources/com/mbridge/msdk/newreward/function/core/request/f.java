package com.mbridge.msdk.newreward.function.core.request;

import com.mbridge.msdk.tracker.network.toolbox.l;
import com.mbridge.msdk.tracker.network.toolbox.m;
import com.mbridge.msdk.tracker.network.toolbox.o;
import com.mbridge.msdk.tracker.network.u;
import com.mbridge.msdk.tracker.network.v;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class f {
    private static volatile f b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private v f1681a;

    public class a implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("campaign_response_thread");
            return thread;
        }
    }

    private f() {
    }

    public static f b() {
        if (b == null) {
            synchronized (f.class) {
                try {
                    if (b == null) {
                        b = new f();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    private static ThreadPoolExecutor c() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 100L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new a(), new ThreadPoolExecutor.DiscardPolicy());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public void a(com.mbridge.msdk.newreward.function.core.request.a aVar) {
        a().a(aVar);
    }

    public void a(u<JSONObject> uVar) {
        a().a(uVar);
    }

    public v a() {
        if (this.f1681a == null) {
            v vVarA = o.a(new com.mbridge.msdk.tracker.network.toolbox.b(new m()), new com.mbridge.msdk.tracker.network.g(c()), 5, new l());
            this.f1681a = vVarA;
            vVarA.b();
        }
        return this.f1681a;
    }
}
