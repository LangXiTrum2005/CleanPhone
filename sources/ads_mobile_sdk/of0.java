package ads_mobile_sdk;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class of0 {
    public final AbstractExecutorService a;
    public final a03 b;

    public of0(ThreadPoolExecutor executorService, a03 threadFactory) {
        Intrinsics.checkNotNullParameter(executorService, "executorService");
        Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
        this.a = executorService;
        this.b = threadFactory;
    }

    public final AbstractExecutorService a() {
        return this.a;
    }
}
