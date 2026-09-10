package com.unity3d.services.store.gpbl.listeners;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/unity3d/services/store/gpbl/listeners/BillingClientStateListener;", "", "Lcom/unity3d/services/store/gpbl/bridges/BillingResultBridge;", "billingResult", "Lwj/r;", InAppPurchaseConstants.METHOD_ON_BILLING_SETUP_FINISHED, "(Lcom/unity3d/services/store/gpbl/bridges/BillingResultBridge;)V", InAppPurchaseConstants.METHOD_ON_BILLING_SERVICE_DISCONNECTED, "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public interface BillingClientStateListener {
    void onBillingServiceDisconnected();

    void onBillingSetupFinished(BillingResultBridge billingResult);
}
