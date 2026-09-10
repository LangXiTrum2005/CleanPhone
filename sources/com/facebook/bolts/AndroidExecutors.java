package com.facebook.bolts;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/bolts/AndroidExecutors;", "", "Companion", "UIThreadExecutor", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class AndroidExecutors {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AndroidExecutors f16212b = new AndroidExecutors();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f16213c;
    public static final int d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f16214a = new UIThreadExecutor();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0004¨\u0006\r"}, d2 = {"Lcom/facebook/bolts/AndroidExecutors$Companion;", "", "", "CORE_POOL_SIZE", "I", "CPU_COUNT", "Lcom/facebook/bolts/AndroidExecutors;", "INSTANCE", "Lcom/facebook/bolts/AndroidExecutors;", "", "KEEP_ALIVE_TIME", "J", "MAX_POOL_SIZE", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/bolts/AndroidExecutors$UIThreadExecutor;", "Ljava/util/concurrent/Executor;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class UIThreadExecutor implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable command) {
            Intrinsics.f(command, "command");
            new Handler(Looper.getMainLooper()).post(command);
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f16213c = iAvailableProcessors + 1;
        d = (iAvailableProcessors * 2) + 1;
    }
}
