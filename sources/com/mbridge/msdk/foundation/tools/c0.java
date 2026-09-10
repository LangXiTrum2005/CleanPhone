package com.mbridge.msdk.foundation.tools;

import com.mbridge.msdk.MBridgeConstans;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static volatile Executor f34077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static FastKV.c f34078b = new a();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "mb-sp-handler");
        }
    }

    private c0() {
    }

    public static Executor a() {
        if (f34077a == null) {
            synchronized (c0.class) {
                try {
                    if (f34077a == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4, 4, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new b(), new ThreadPoolExecutor.DiscardPolicy());
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                        f34077a = threadPoolExecutor;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f34077a;
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements FastKV.c {
        @Override // com.mbridge.msdk.foundation.tools.FastKV.c
        public void a(String str, String str2) {
            if (MBridgeConstans.DEBUG) {
                q0.c("FastKVConfig", str + " " + str2);
            }
        }

        @Override // com.mbridge.msdk.foundation.tools.FastKV.c
        public void b(String str, Exception exc) {
            if (MBridgeConstans.DEBUG) {
                q0.b("FastKVConfig", str, exc);
            }
        }

        @Override // com.mbridge.msdk.foundation.tools.FastKV.c
        public void a(String str, Exception exc) {
            if (MBridgeConstans.DEBUG) {
                q0.c("FastKVConfig", str, exc);
            }
        }
    }
}
