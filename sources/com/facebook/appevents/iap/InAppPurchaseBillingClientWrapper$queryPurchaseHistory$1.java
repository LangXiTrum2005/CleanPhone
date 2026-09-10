package com.facebook.appevents.iap;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
final class InAppPurchaseBillingClientWrapper$queryPurchaseHistory$1 implements Runnable {
    public final /* synthetic */ InAppPurchaseBillingClientWrapper X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Runnable f16110Y;

    public InAppPurchaseBillingClientWrapper$queryPurchaseHistory$1(InAppPurchaseBillingClientWrapper inAppPurchaseBillingClientWrapper) {
        InAppPurchaseAutoLogger$startIapLogging$1 inAppPurchaseAutoLogger$startIapLogging$1 = InAppPurchaseAutoLogger$startIapLogging$1.X;
        this.X = inAppPurchaseBillingClientWrapper;
        this.f16110Y = inAppPurchaseAutoLogger$startIapLogging$1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InAppPurchaseBillingClientWrapper inAppPurchaseBillingClientWrapper = this.X;
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = InAppPurchaseBillingClientWrapper.s;
            CopyOnWriteArraySet copyOnWriteArraySet = null;
            if (!CrashShieldHandler.b(InAppPurchaseBillingClientWrapper.class)) {
                try {
                    copyOnWriteArraySet = inAppPurchaseBillingClientWrapper.f16097a;
                } catch (Throwable th) {
                    CrashShieldHandler.a(InAppPurchaseBillingClientWrapper.class, th);
                }
            }
            ArrayList arrayList = new ArrayList(copyOnWriteArraySet);
            InAppPurchaseAutoLogger$startIapLogging$1 inAppPurchaseAutoLogger$startIapLogging$1 = InAppPurchaseAutoLogger$startIapLogging$1.X;
            if (CrashShieldHandler.b(InAppPurchaseBillingClientWrapper.class)) {
                return;
            }
            try {
                inAppPurchaseBillingClientWrapper.d(arrayList, inAppPurchaseAutoLogger$startIapLogging$1);
            } catch (Throwable th2) {
                CrashShieldHandler.a(InAppPurchaseBillingClientWrapper.class, th2);
            }
        } catch (Throwable th3) {
            CrashShieldHandler.a(this, th3);
        }
    }
}
