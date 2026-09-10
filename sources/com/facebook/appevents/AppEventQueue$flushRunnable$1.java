package com.facebook.appevents;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
public final class AppEventQueue$flushRunnable$1 implements Runnable {
    public static final AppEventQueue$flushRunnable$1 X = new AppEventQueue$flushRunnable$1();

    @Override // java.lang.Runnable
    public final void run() {
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            AppEventCollection appEventCollection = AppEventQueue.f16003a;
            if (!CrashShieldHandler.b(AppEventQueue.class)) {
                try {
                    AppEventQueue.f16005c = null;
                } catch (Throwable th) {
                    CrashShieldHandler.a(AppEventQueue.class, th);
                }
            }
            if (AppEventsLoggerImpl.Companion.b() != AppEventsLogger.FlushBehavior.f16012Y) {
                AppEventQueue.e(FlushReason.f16023Y);
            }
        } catch (Throwable th2) {
            CrashShieldHandler.a(this, th2);
        }
    }
}
