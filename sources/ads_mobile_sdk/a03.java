package ads_mobile_sdk;

import ads_mobile_sdk.a03;
import android.os.Process;
import com.google.common.base.triweekly;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a03 implements ThreadFactory {
    public final String a;
    public Integer b;
    public final AtomicInteger c;

    public a03(Integer num, String poolName) {
        Intrinsics.checkNotNullParameter(poolName, "poolName");
        this.a = poolName;
        this.b = num;
        this.c = new AtomicInteger(1);
    }

    public static final void a(Integer num, Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "$runnable");
        triweekly triweeklyVar = kn0.a;
        kn0.a(new zz2(num));
        Process.setThreadPriority(num.intValue());
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(final Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        String str = "GMA(" + this.a + ") " + this.c.getAndIncrement();
        final Integer num = this.b;
        if (num != null) {
            return new Thread(new Runnable() { // from class: saneness.saneness
                @Override // java.lang.Runnable
                public final void run() {
                    a03.a(num, runnable);
                }
            }, str);
        }
        triweekly triweeklyVar = kn0.a;
        kn0.a(yz2.a);
        return new Thread(runnable, str);
    }
}
