package saneness;

import ads_mobile_sdk.jk0;
import ads_mobile_sdk.zk;
import com.ironsource.X3;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class backswept {
    public static void attabal(ThreadPoolExecutor threadPool, int i, jk0 flags) {
        Intrinsics.checkNotNullParameter(threadPool, "threadPool");
        Intrinsics.checkNotNullParameter(flags, "flags");
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        threadPool.setKeepAliveTime(p002kotlin.time.saneness.adultoid(((p002kotlin.time.saneness) flags.a("gad:thread_keep_alive_time", juju.attabal(10, DurationUnit.SECONDS, "gad:thread_keep_alive_time", X3.i.W), zk.j)).getRawValue()), TimeUnit.MILLISECONDS);
        if (i > threadPool.getMaximumPoolSize()) {
            threadPool.setMaximumPoolSize(i);
            threadPool.setCorePoolSize(i);
        } else {
            threadPool.setCorePoolSize(i);
            threadPool.setMaximumPoolSize(i);
        }
    }
}
