package com.unity3d.services.store;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.unity3d.ads.core.extensions.JsonSerializableExtensionsKt;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseHistoryRecordBridge;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsBridge;
import com.unity3d.services.store.gpbl.listeners.StoreEventListener;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\fJ'\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u0019J'\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001f\u0010\u0019J'\u0010 \u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0015H\u0016¢\u0006\u0004\b \u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%¨\u0006&"}, d2 = {"Lcom/unity3d/services/store/WebViewStoreEventListener;", "Lcom/unity3d/services/store/gpbl/listeners/StoreEventListener;", "", "operationId", "Lcom/unity3d/services/store/StoreWebViewEventSender;", "storeWebViewEventSender", "", "isLifecycleListener", "<init>", "(ILcom/unity3d/services/store/StoreWebViewEventSender;Z)V", "Lwj/r;", "onIsAlreadyInitialized", "()V", "featureSupported", "onFeatureSupported", "(I)V", "Lcom/unity3d/services/store/gpbl/bridges/BillingResultBridge;", "billingResult", InAppPurchaseConstants.METHOD_ON_BILLING_SETUP_FINISHED, "(Lcom/unity3d/services/store/gpbl/bridges/BillingResultBridge;)V", InAppPurchaseConstants.METHOD_ON_BILLING_SERVICE_DISCONNECTED, "", "Lcom/unity3d/services/store/gpbl/bridges/PurchaseHistoryRecordBridge;", "purchaseHistoryRecordList", "onPurchaseHistoryUpdated", "(Lcom/unity3d/services/store/gpbl/bridges/BillingResultBridge;Ljava/util/List;)V", "Lcom/unity3d/services/store/gpbl/bridges/SkuDetailsBridge;", "skuDetailsList", "onSkuDetailsUpdated", "Lcom/unity3d/services/store/gpbl/bridges/PurchaseBridge;", "purchases", "onPurchaseResponse", "onPurchaseUpdated", "I", "getOperationId", "()I", "Lcom/unity3d/services/store/StoreWebViewEventSender;", "Z", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class WebViewStoreEventListener implements StoreEventListener {
    private final boolean isLifecycleListener;
    private final int operationId;
    private final StoreWebViewEventSender storeWebViewEventSender;

    public WebViewStoreEventListener(int i10, StoreWebViewEventSender storeWebViewEventSender, boolean z10) {
        n.f(storeWebViewEventSender, "storeWebViewEventSender");
        this.operationId = i10;
        this.storeWebViewEventSender = storeWebViewEventSender;
        this.isLifecycleListener = z10;
    }

    @Override // com.unity3d.services.store.gpbl.listeners.StoreEventListener
    public int getOperationId() {
        return this.operationId;
    }

    @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
    public void onBillingServiceDisconnected() {
        this.storeWebViewEventSender.send(StoreEvent.DISCONNECTED_RESULT, new Object[0]);
    }

    @Override // com.unity3d.services.store.gpbl.listeners.BillingClientStateListener
    public void onBillingSetupFinished(BillingResultBridge billingResult) {
        n.f(billingResult, "billingResult");
        if (billingResult.getResponseCode() == BillingResultResponseCode.OK) {
            StoreWebViewEventSender storeWebViewEventSender = this.storeWebViewEventSender;
            StoreEvent storeEvent = StoreEvent.INITIALIZATION_REQUEST_RESULT;
            BillingResultResponseCode responseCode = billingResult.getResponseCode();
            n.e(responseCode, "billingResult.responseCode");
            storeWebViewEventSender.send(storeEvent, responseCode);
            return;
        }
        StoreWebViewEventSender storeWebViewEventSender2 = this.storeWebViewEventSender;
        StoreEvent storeEvent2 = StoreEvent.INITIALIZATION_REQUEST_FAILED;
        BillingResultResponseCode responseCode2 = billingResult.getResponseCode();
        n.e(responseCode2, "billingResult.responseCode");
        storeWebViewEventSender2.send(storeEvent2, responseCode2);
    }

    @Override // com.unity3d.services.store.gpbl.listeners.FeatureSupportedListener
    public void onFeatureSupported(int featureSupported) {
        this.storeWebViewEventSender.send(StoreEvent.IS_FEATURE_SUPPORTED_REQUEST_RESULT, Integer.valueOf(getOperationId()), Integer.valueOf(featureSupported));
    }

    @Override // com.unity3d.services.store.gpbl.listeners.BillingInitializationListener
    public void onIsAlreadyInitialized() {
        this.storeWebViewEventSender.send(StoreEvent.INITIALIZATION_REQUEST_RESULT, Integer.valueOf(BillingResultResponseCode.OK.getResponseCode()));
    }

    @Override // com.unity3d.services.store.gpbl.listeners.PurchaseHistoryResponseListener
    public void onPurchaseHistoryUpdated(BillingResultBridge billingResult, List<? extends PurchaseHistoryRecordBridge> purchaseHistoryRecordList) {
        JSONArray jSONArray;
        n.f(billingResult, "billingResult");
        StoreWebViewEventSender storeWebViewEventSender = this.storeWebViewEventSender;
        StoreEvent storeEvent = StoreEvent.PURCHASE_HISTORY_LIST_REQUEST_RESULT;
        Integer numValueOf = Integer.valueOf(getOperationId());
        BillingResultResponseCode responseCode = billingResult.getResponseCode();
        n.e(responseCode, "billingResult.responseCode");
        if (purchaseHistoryRecordList == null || (jSONArray = JsonSerializableExtensionsKt.toJsonArray(purchaseHistoryRecordList)) == null) {
            jSONArray = new JSONArray();
        }
        storeWebViewEventSender.send(storeEvent, numValueOf, responseCode, jSONArray);
    }

    @Override // com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener
    public void onPurchaseResponse(BillingResultBridge billingResult, List<? extends PurchaseBridge> purchases) {
        JSONArray jSONArray;
        n.f(billingResult, "billingResult");
        ArrayList arrayList = new ArrayList();
        if (getOperationId() != -1) {
            arrayList.add(Integer.valueOf(getOperationId()));
        }
        if (billingResult.getResponseCode() != BillingResultResponseCode.OK) {
            arrayList.add(billingResult.getResponseCode());
            StoreWebViewEventSender storeWebViewEventSender = this.storeWebViewEventSender;
            StoreEvent storeEvent = this.isLifecycleListener ? StoreEvent.PURCHASES_ON_RESUME_ERROR : StoreEvent.PURCHASES_REQUEST_ERROR;
            Object[] array = arrayList.toArray(new Object[0]);
            storeWebViewEventSender.send(storeEvent, Arrays.copyOf(array, array.length));
            return;
        }
        if (purchases == null || (jSONArray = JsonSerializableExtensionsKt.toJsonArray(purchases)) == null) {
            jSONArray = new JSONArray();
        }
        arrayList.add(jSONArray);
        StoreWebViewEventSender storeWebViewEventSender2 = this.storeWebViewEventSender;
        StoreEvent storeEvent2 = this.isLifecycleListener ? StoreEvent.PURCHASES_ON_RESUME_RESULT : StoreEvent.PURCHASES_REQUEST_RESULT;
        Object[] array2 = arrayList.toArray(new Object[0]);
        storeWebViewEventSender2.send(storeEvent2, Arrays.copyOf(array2, array2.length));
    }

    @Override // com.unity3d.services.store.gpbl.listeners.PurchaseUpdatedResponseListener
    public void onPurchaseUpdated(BillingResultBridge billingResult, List<? extends PurchaseBridge> purchases) {
        JSONArray jSONArray;
        n.f(billingResult, "billingResult");
        if (billingResult.getResponseCode() != BillingResultResponseCode.OK) {
            StoreWebViewEventSender storeWebViewEventSender = this.storeWebViewEventSender;
            StoreEvent storeEvent = StoreEvent.PURCHASES_UPDATED_ERROR;
            BillingResultResponseCode responseCode = billingResult.getResponseCode();
            n.e(responseCode, "billingResult.responseCode");
            storeWebViewEventSender.send(storeEvent, responseCode);
            return;
        }
        StoreWebViewEventSender storeWebViewEventSender2 = this.storeWebViewEventSender;
        StoreEvent storeEvent2 = StoreEvent.PURCHASES_UPDATED_RESULT;
        if (purchases == null || (jSONArray = JsonSerializableExtensionsKt.toJsonArray(purchases)) == null) {
            jSONArray = new JSONArray();
        }
        storeWebViewEventSender2.send(storeEvent2, jSONArray);
    }

    @Override // com.unity3d.services.store.gpbl.listeners.SkuDetailsResponseListener
    public void onSkuDetailsUpdated(BillingResultBridge billingResult, List<? extends SkuDetailsBridge> skuDetailsList) {
        JSONArray jSONArray;
        n.f(billingResult, "billingResult");
        StoreWebViewEventSender storeWebViewEventSender = this.storeWebViewEventSender;
        StoreEvent storeEvent = StoreEvent.SKU_DETAILS_LIST_REQUEST_RESULT;
        Integer numValueOf = Integer.valueOf(getOperationId());
        if (skuDetailsList == null || (jSONArray = JsonSerializableExtensionsKt.toJsonArray(skuDetailsList)) == null) {
            jSONArray = new JSONArray();
        }
        storeWebViewEventSender.send(storeEvent, numValueOf, jSONArray);
    }

    public /* synthetic */ WebViewStoreEventListener(int i10, StoreWebViewEventSender storeWebViewEventSender, boolean z10, int i11, g gVar) {
        this(i10, storeWebViewEventSender, (i11 & 4) != 0 ? false : z10);
    }
}
