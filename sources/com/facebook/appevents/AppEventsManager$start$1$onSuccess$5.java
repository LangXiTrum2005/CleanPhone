package com.facebook.appevents;

import com.facebook.appevents.iap.InAppPurchaseManager;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "enabled", "", "onCompleted"}, k = 3, mv = {1, 5, 1})
final class AppEventsManager$start$1$onSuccess$5 implements FeatureManager.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AppEventsManager$start$1$onSuccess$5 f16022a = new AppEventsManager$start$1$onSuccess$5();

    @Override // com.facebook.internal.FeatureManager.Callback
    public final void a(boolean z2) {
        if (z2) {
            AtomicBoolean atomicBoolean = InAppPurchaseManager.f16118a;
            if (CrashShieldHandler.b(InAppPurchaseManager.class)) {
                return;
            }
            try {
                InAppPurchaseManager.f16118a.set(true);
                InAppPurchaseManager.a();
            } catch (Throwable th) {
                CrashShieldHandler.a(InAppPurchaseManager.class, th);
            }
        }
    }
}
