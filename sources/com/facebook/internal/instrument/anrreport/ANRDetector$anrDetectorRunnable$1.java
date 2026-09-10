package com.facebook.internal.instrument.anrreport;

import android.app.ActivityManager;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
public final class ANRDetector$anrDetectorRunnable$1 implements Runnable {
    public static final ANRDetector$anrDetectorRunnable$1 X = new ANRDetector$anrDetectorRunnable$1();

    @Override // java.lang.Runnable
    public final void run() {
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            Object systemService = FacebookSdk.b().getSystemService("activity");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
            }
            ANRDetector.a((ActivityManager) systemService);
        } catch (Exception unused) {
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
        }
    }
}
