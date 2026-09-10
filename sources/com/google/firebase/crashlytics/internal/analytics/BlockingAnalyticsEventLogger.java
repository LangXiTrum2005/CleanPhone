package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import com.google.firebase.crashlytics.internal.Logger;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class BlockingAnalyticsEventLogger implements AnalyticsEventReceiver, AnalyticsEventLogger {
    public final CrashlyticsOriginAnalyticsEventLogger X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Object f20292Y;
    public CountDownLatch Z;

    public BlockingAnalyticsEventLogger(CrashlyticsOriginAnalyticsEventLogger crashlyticsOriginAnalyticsEventLogger) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f20292Y = new Object();
        this.X = crashlyticsOriginAnalyticsEventLogger;
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public final void d(Bundle bundle) {
        synchronized (this.f20292Y) {
            try {
                Logger logger = Logger.f20289a;
                logger.e("Logging event _ae to Firebase Analytics with params " + bundle);
                this.Z = new CountDownLatch(1);
                this.X.d(bundle);
                logger.e("Awaiting app exception callback from Analytics...");
                try {
                    if (this.Z.await(500, TimeUnit.MILLISECONDS)) {
                        logger.e("App exception callback received from Analytics listener.");
                    } else {
                        logger.f(null, "Timeout exceeded while awaiting app exception callback from Analytics listener.");
                    }
                } catch (InterruptedException unused) {
                    Logger.f20289a.c(null, "Interrupted while awaiting app exception callback from Analytics listener.");
                }
                this.Z = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver
    public final void onEvent(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.Z;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
