package com.facebook.appevents.iap;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
final class InAppPurchaseAutoLogger$startIapLogging$2 implements Runnable {
    public static final InAppPurchaseAutoLogger$startIapLogging$2 X = new InAppPurchaseAutoLogger$startIapLogging$2();

    @Override // java.lang.Runnable
    public final void run() {
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            InAppPurchaseAutoLogger.a();
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
        }
    }
}
