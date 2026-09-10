package com.tiktok.appevents;

import com.tiktok.TikTokBusinessSdk;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes6.dex */
public class TTThreadFactory implements ThreadFactory {
    public static final String X = TTInAppPurchaseManager.class.getCanonicalName();

    /* JADX INFO: renamed from: com.tiktok.appevents.TTThreadFactory$1, reason: invalid class name */
    class AnonymousClass1 implements Thread.UncaughtExceptionHandler {
        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            TTCrashHandler.a(TTThreadFactory.X, th);
            String str = TikTokBusinessSdk.f42660a;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setUncaughtExceptionHandler(new AnonymousClass1());
        return thread;
    }
}
