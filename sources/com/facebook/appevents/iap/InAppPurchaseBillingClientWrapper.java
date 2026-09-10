package com.facebook.appevents.iap;

import com.ironsource.X3;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\f\u001a\u00020\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapper;", "", "Lcom/facebook/appevents/iap/InAppPurchaseUtils$IAPProductType;", X3.i.f27802m, "Ljava/lang/Runnable;", "completionHandler", "Lwj/r;", InAppPurchaseConstants.METHOD_QUERY_PURCHASES, "(Lcom/facebook/appevents/iap/InAppPurchaseUtils$IAPProductType;Ljava/lang/Runnable;)V", "queryPurchaseHistory", "getBillingClient", "()Ljava/lang/Object;", "billingClient", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public interface InAppPurchaseBillingClientWrapper {
    Object getBillingClient();

    void queryPurchaseHistory(InAppPurchaseUtils.IAPProductType productType, Runnable completionHandler);

    void queryPurchases(InAppPurchaseUtils.IAPProductType productType, Runnable completionHandler);
}
