package com.google.firebase.crashlytics.internal.concurrency;

import com.google.firebase.crashlytics.internal.Logger;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/firebase/crashlytics/internal/concurrency/CrashlyticsWorkers;", "", "Companion", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CrashlyticsWorkers {
    public static final Companion d = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CrashlyticsWorker f20376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CrashlyticsWorker f20377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CrashlyticsWorker f20378c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/crashlytics/internal/concurrency/CrashlyticsWorkers$Companion;", "", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static String a() {
            return Thread.currentThread().getName();
        }
    }

    public CrashlyticsWorkers(ExecutorService backgroundExecutorService, ExecutorService blockingExecutorService) {
        Intrinsics.f(backgroundExecutorService, "backgroundExecutorService");
        Intrinsics.f(blockingExecutorService, "blockingExecutorService");
        this.f20376a = new CrashlyticsWorker(backgroundExecutorService);
        this.f20377b = new CrashlyticsWorker(backgroundExecutorService);
        new CrashlyticsWorker(backgroundExecutorService);
        this.f20378c = new CrashlyticsWorker(blockingExecutorService);
    }

    public static final void a() {
        if (((Boolean) new CrashlyticsWorkers$Companion$checkBackgroundThread$1(0, d, Companion.class, "isBackgroundThread", "isBackgroundThread()Z", 0).invoke()).booleanValue()) {
            return;
        }
        Logger.f20289a.b("Must be called on a background thread, was called on " + Companion.a() + '.', null);
    }

    public static final void b() {
        if (((Boolean) new CrashlyticsWorkers$Companion$checkBlockingThread$1(0, d, Companion.class, "isBlockingThread", "isBlockingThread()Z", 0).invoke()).booleanValue()) {
            return;
        }
        Logger.f20289a.b("Must be called on a blocking thread, was called on " + Companion.a() + '.', null);
    }

    public static final void c() {
        if (((Boolean) new CrashlyticsWorkers$Companion$checkNotMainThread$1(0, d, Companion.class, "isNotMainThread", "isNotMainThread()Z", 0).invoke()).booleanValue()) {
            return;
        }
        Logger.f20289a.b("Must not be called on a main thread, was called on " + Companion.a() + '.', null);
    }
}
