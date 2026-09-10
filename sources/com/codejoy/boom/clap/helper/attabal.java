package com.codejoy.boom.clap.helper;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.sdk.controller.f;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlinx.coroutines.premeiotic;
import kotlinx.coroutines.preterite;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AppExecutors.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/codejoy/boom/clap/helper/attabal;", "", "<init>", "()V", "Ljava/util/concurrent/Executor;", "attabal", "()Ljava/util/concurrent/Executor;", "saneness", "Ljava/util/concurrent/Executor;", "diskIO", "dern", "networkIO", "wireman", "mainThread", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final attabal f18250attabal = new attabal();

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public static final Executor networkIO;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final int f18252marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final Executor diskIO;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public static final Executor mainThread;

    /* JADX INFO: renamed from: com.codejoy.boom.clap.helper.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AppExecutors.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/codejoy/boom/clap/helper/attabal$attabal;", "Ljava/util/concurrent/Executor;", "<init>", "()V", "Ljava/lang/Runnable;", f.b.g, "", "execute", "(Ljava/lang/Runnable;)V", "Landroid/os/Handler;", "kowloon", "Landroid/os/Handler;", "mainThreadHandler", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ExecutorC0282attabal implements Executor {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public final Handler mainThreadHandler = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable command) {
            Intrinsics.checkNotNullParameter(command, "command");
            this.mainThreadHandler.post(command);
        }
    }

    static {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        diskIO = executorServiceNewSingleThreadExecutor;
        networkIO = preterite.attabal(premeiotic.saneness());
        mainThread = new ExecutorC0282attabal();
        f18252marial = 8;
    }

    public final Executor attabal() {
        return diskIO;
    }
}
