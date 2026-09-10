package com.facebook.appevents.iap;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/facebook/appevents/iap/InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$1", "Landroid/content/ServiceConnection;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$1 implements ServiceConnection {
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName name, IBinder service) {
        Intrinsics.f(name, "name");
        Intrinsics.f(service, "service");
        AtomicBoolean atomicBoolean = InAppPurchaseActivityLifecycleTracker.f16090a;
        Context context = FacebookSdk.b();
        HashMap map = InAppPurchaseEventManager.f16111a;
        Object objH = null;
        if (!CrashShieldHandler.b(InAppPurchaseEventManager.class)) {
            try {
                Intrinsics.f(context, "context");
                objH = InAppPurchaseEventManager.f.h(context, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{service});
            } catch (Throwable th) {
                CrashShieldHandler.a(InAppPurchaseEventManager.class, th);
            }
        }
        InAppPurchaseActivityLifecycleTracker.g = objH;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        Intrinsics.f(name, "name");
    }
}
