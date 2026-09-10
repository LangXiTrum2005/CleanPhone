package com.facebook.appevents.iap;

import android.content.Context;
import androidx.fragment.app.d;
import com.facebook.appevents.integrity.ProtectedModeManager;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.n;
import q7.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseAutoLogger;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;", "billingClientVersion", "Lwj/r;", "startIapLogging", "(Landroid/content/Context;Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;)V", "", "packageName", "logPurchase", "(Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;Ljava/lang/String;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "failedToCreateWrapper", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getFailedToCreateWrapper", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class InAppPurchaseAutoLogger {
    public static final InAppPurchaseAutoLogger INSTANCE = new InAppPurchaseAutoLogger();
    private static final AtomicBoolean failedToCreateWrapper = new AtomicBoolean(false);

    private InAppPurchaseAutoLogger() {
    }

    private final void logPurchase(InAppPurchaseUtils.BillingClientVersion billingClientVersion, String packageName) {
        if (v7.a.b(this)) {
            return;
        }
        try {
            boolean isFirstAppLaunchWithNewIAP = InAppPurchaseLoggerManager.getIsFirstAppLaunchWithNewIAP();
            if (isFirstAppLaunchWithNewIAP) {
                InAppPurchaseLoggerManager.migrateOldCacheHistory();
            }
            if (billingClientVersion == InAppPurchaseUtils.BillingClientVersion.V2_V4) {
                InAppPurchaseBillingClientWrapperV2V4.Companion companion = InAppPurchaseBillingClientWrapperV2V4.INSTANCE;
                InAppPurchaseLoggerManager.filterPurchaseLogging(companion.getIapPurchaseDetailsMap(), companion.getSkuDetailsMap(), false, packageName, billingClientVersion, isFirstAppLaunchWithNewIAP);
                InAppPurchaseLoggerManager.filterPurchaseLogging(companion.getSubsPurchaseDetailsMap(), companion.getSkuDetailsMap(), true, packageName, billingClientVersion, isFirstAppLaunchWithNewIAP);
                companion.getIapPurchaseDetailsMap().clear();
                companion.getSubsPurchaseDetailsMap().clear();
            } else {
                InAppPurchaseBillingClientWrapperV5V7.Companion companion2 = InAppPurchaseBillingClientWrapperV5V7.INSTANCE;
                InAppPurchaseLoggerManager.filterPurchaseLogging(companion2.getIapPurchaseDetailsMap(), companion2.getProductDetailsMap(), false, packageName, billingClientVersion, isFirstAppLaunchWithNewIAP);
                InAppPurchaseLoggerManager.filterPurchaseLogging(companion2.getSubsPurchaseDetailsMap(), companion2.getProductDetailsMap(), true, packageName, billingClientVersion, isFirstAppLaunchWithNewIAP);
                companion2.getIapPurchaseDetailsMap().clear();
                companion2.getSubsPurchaseDetailsMap().clear();
            }
            if (isFirstAppLaunchWithNewIAP) {
                InAppPurchaseLoggerManager.setAppHasBeenLaunchedWithNewIAP();
            }
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }

    public static final synchronized void startIapLogging(Context context, InAppPurchaseUtils.BillingClientVersion billingClientVersion) {
        if (v7.a.b(InAppPurchaseAutoLogger.class)) {
            return;
        }
        try {
            n.f(context, "context");
            n.f(billingClientVersion, "billingClientVersion");
            AtomicBoolean atomicBoolean = failedToCreateWrapper;
            if (atomicBoolean.get()) {
                return;
            }
            c0 c0Var = new c0();
            InAppPurchaseUtils.BillingClientVersion billingClientVersion2 = InAppPurchaseUtils.BillingClientVersion.V2_V4;
            if (billingClientVersion == billingClientVersion2) {
                c0Var.f44760a = InAppPurchaseBillingClientWrapperV2V4.INSTANCE.getOrCreateInstance(context);
            } else if (billingClientVersion == InAppPurchaseUtils.BillingClientVersion.V5_V7) {
                c0Var.f44760a = InAppPurchaseBillingClientWrapperV5V7.INSTANCE.getOrCreateInstance(context);
            }
            if (c0Var.f44760a == null) {
                atomicBoolean.set(true);
                return;
            }
            if (!p.b(q7.n.AndroidIAPSubscriptionAutoLogging) || (ProtectedModeManager.isEnabled() && billingClientVersion != billingClientVersion2)) {
                ((InAppPurchaseBillingClientWrapper) c0Var.f44760a).queryPurchaseHistory(InAppPurchaseUtils.IAPProductType.INAPP, new a(billingClientVersion, context, 1));
            } else {
                ((InAppPurchaseBillingClientWrapper) c0Var.f44760a).queryPurchaseHistory(InAppPurchaseUtils.IAPProductType.INAPP, new d(c0Var, billingClientVersion, context, 28));
            }
        } catch (Throwable th2) {
            v7.a.a(InAppPurchaseAutoLogger.class, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startIapLogging$lambda$1(c0 billingClientWrapper, InAppPurchaseUtils.BillingClientVersion billingClientVersion, Context context) {
        if (v7.a.b(InAppPurchaseAutoLogger.class)) {
            return;
        }
        try {
            n.f(billingClientWrapper, "$billingClientWrapper");
            n.f(billingClientVersion, "$billingClientVersion");
            n.f(context, "$context");
            ((InAppPurchaseBillingClientWrapper) billingClientWrapper.f44760a).queryPurchaseHistory(InAppPurchaseUtils.IAPProductType.SUBS, new a(billingClientVersion, context, 0));
        } catch (Throwable th2) {
            v7.a.a(InAppPurchaseAutoLogger.class, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startIapLogging$lambda$1$lambda$0(InAppPurchaseUtils.BillingClientVersion billingClientVersion, Context context) {
        if (v7.a.b(InAppPurchaseAutoLogger.class)) {
            return;
        }
        try {
            n.f(billingClientVersion, "$billingClientVersion");
            n.f(context, "$context");
            InAppPurchaseAutoLogger inAppPurchaseAutoLogger = INSTANCE;
            String packageName = context.getPackageName();
            n.e(packageName, "context.packageName");
            inAppPurchaseAutoLogger.logPurchase(billingClientVersion, packageName);
        } catch (Throwable th2) {
            v7.a.a(InAppPurchaseAutoLogger.class, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startIapLogging$lambda$2(InAppPurchaseUtils.BillingClientVersion billingClientVersion, Context context) {
        if (v7.a.b(InAppPurchaseAutoLogger.class)) {
            return;
        }
        try {
            n.f(billingClientVersion, "$billingClientVersion");
            n.f(context, "$context");
            InAppPurchaseAutoLogger inAppPurchaseAutoLogger = INSTANCE;
            String packageName = context.getPackageName();
            n.e(packageName, "context.packageName");
            inAppPurchaseAutoLogger.logPurchase(billingClientVersion, packageName);
        } catch (Throwable th2) {
            v7.a.a(InAppPurchaseAutoLogger.class, th2);
        }
    }

    public final AtomicBoolean getFailedToCreateWrapper() {
        if (v7.a.b(this)) {
            return null;
        }
        try {
            return failedToCreateWrapper;
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return null;
        }
    }
}
