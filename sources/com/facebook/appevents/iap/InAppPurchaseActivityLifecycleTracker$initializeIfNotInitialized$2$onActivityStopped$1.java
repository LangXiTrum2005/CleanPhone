package com.facebook.appevents.iap;

import android.content.Context;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
final class InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$2$onActivityStopped$1 implements Runnable {
    public static final InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$2$onActivityStopped$1 X = new InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$2$onActivityStopped$1();

    @Override // java.lang.Runnable
    public final void run() {
        InAppPurchaseEventManager inAppPurchaseEventManager;
        Class clsB;
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            Context context = FacebookSdk.b();
            ArrayList arrayListF = InAppPurchaseEventManager.f(context, InAppPurchaseActivityLifecycleTracker.g);
            if (arrayListF.isEmpty()) {
                Object obj = InAppPurchaseActivityLifecycleTracker.g;
                if (CrashShieldHandler.b(InAppPurchaseEventManager.class)) {
                    arrayListF = null;
                } else {
                    try {
                        Intrinsics.f(context, "context");
                        arrayListF = (obj == null || (clsB = (inAppPurchaseEventManager = InAppPurchaseEventManager.f).b(context, "com.android.vending.billing.IInAppBillingService")) == null || inAppPurchaseEventManager.c(clsB, "getPurchaseHistory") == null) ? new ArrayList() : inAppPurchaseEventManager.a(inAppPurchaseEventManager.d(context, obj));
                    } catch (Throwable th) {
                        CrashShieldHandler.a(InAppPurchaseEventManager.class, th);
                        arrayListF = null;
                    }
                }
            }
            InAppPurchaseActivityLifecycleTracker.a(context, arrayListF, false);
        } catch (Throwable th2) {
            CrashShieldHandler.a(this, th2);
        }
    }
}
