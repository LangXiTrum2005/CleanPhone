package com.facebook.bolts;

import com.applovin.impl.Z;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/bolts/BoltsExecutors;", "", "Companion", "ImmediateExecutor", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class BoltsExecutors {
    public static final BoltsExecutors d = new BoltsExecutors();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f16215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f16216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f16217c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/bolts/BoltsExecutors$Companion;", "", "Lcom/facebook/bolts/BoltsExecutors;", "INSTANCE", "Lcom/facebook/bolts/BoltsExecutors;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/bolts/BoltsExecutors$ImmediateExecutor;", "Ljava/util/concurrent/Executor;", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class ImmediateExecutor implements Executor {
        public final ThreadLocal X = new ThreadLocal();

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/bolts/BoltsExecutors$ImmediateExecutor$Companion;", "", "", "MAX_DEPTH", "I", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
        }

        public final void a() {
            ThreadLocal threadLocal = this.X;
            Integer num = (Integer) threadLocal.get();
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() - 1;
            if (iIntValue == 0) {
                threadLocal.remove();
            } else {
                threadLocal.set(Integer.valueOf(iIntValue));
            }
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable command) {
            Intrinsics.f(command, "command");
            ThreadLocal threadLocal = this.X;
            Integer num = (Integer) threadLocal.get();
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() + 1;
            threadLocal.set(Integer.valueOf(iIntValue));
            try {
                if (iIntValue <= 15) {
                    command.run();
                } else {
                    BoltsExecutors.d.f16215a.execute(command);
                }
                a();
            } catch (Throwable th) {
                a();
                throw th;
            }
        }
    }

    public BoltsExecutors() {
        ExecutorService executorServiceNewCachedThreadPool;
        String property = System.getProperty("java.runtime.name");
        boolean zL = false;
        if (property != null) {
            Locale locale = Locale.US;
            zL = StringsKt.l(Z.p(locale, "Locale.US", property, locale, "(this as java.lang.String).toLowerCase(locale)"), "android", false);
        }
        if (zL) {
            AndroidExecutors androidExecutors = AndroidExecutors.f16212b;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(AndroidExecutors.f16213c, AndroidExecutors.d, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            executorServiceNewCachedThreadPool = threadPoolExecutor;
        } else {
            executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
            Intrinsics.e(executorServiceNewCachedThreadPool, "Executors.newCachedThreadPool()");
        }
        this.f16215a = executorServiceNewCachedThreadPool;
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Intrinsics.e(scheduledExecutorServiceNewSingleThreadScheduledExecutor, "Executors.newSingleThreadScheduledExecutor()");
        this.f16216b = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.f16217c = new ImmediateExecutor();
    }
}
