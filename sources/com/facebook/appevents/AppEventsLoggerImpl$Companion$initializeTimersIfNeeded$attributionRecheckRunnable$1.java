package com.facebook.appevents;

import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
final class AppEventsLoggerImpl$Companion$initializeTimersIfNeeded$attributionRecheckRunnable$1 implements Runnable {
    public static final AppEventsLoggerImpl$Companion$initializeTimersIfNeeded$attributionRecheckRunnable$1 X = new AppEventsLoggerImpl$Companion$initializeTimersIfNeeded$attributionRecheckRunnable$1();

    @Override // java.lang.Runnable
    public final void run() {
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            HashSet hashSet = new HashSet();
            AppEventCollection appEventCollection = AppEventQueue.f16003a;
            Set setE = null;
            if (!CrashShieldHandler.b(AppEventQueue.class)) {
                try {
                    setE = AppEventQueue.f16003a.e();
                } catch (Throwable th) {
                    CrashShieldHandler.a(AppEventQueue.class, th);
                }
            }
            Iterator it = setE.iterator();
            while (it.hasNext()) {
                hashSet.add(((AccessTokenAppIdPair) it.next()).f15995Y);
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                FetchedAppSettingsManager.f((String) it2.next(), true);
            }
        } catch (Throwable th2) {
            CrashShieldHandler.a(this, th2);
        }
    }
}
