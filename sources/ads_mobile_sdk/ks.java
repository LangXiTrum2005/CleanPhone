package ads_mobile_sdk;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ks {
    public static final ks a = new ks();

    public final of0 a(int i, long j, String poolName) {
        Intrinsics.checkNotNullParameter(poolName, "poolName");
        a03 threadFactory = new a03(null, poolName);
        int i2 = ns.f3288attabal;
        Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
        return new of0(new ThreadPoolExecutor(i, i, p002kotlin.time.saneness.gintrap(j), TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory), threadFactory);
    }
}
