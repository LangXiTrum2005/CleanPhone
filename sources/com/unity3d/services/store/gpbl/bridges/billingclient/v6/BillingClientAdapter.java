package com.unity3d.services.store.gpbl.bridges.billingclient.v6;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.ironsource.X3;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsBridge;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon;
import com.unity3d.services.store.gpbl.listeners.BillingClientStateListener;
import com.unity3d.services.store.gpbl.listeners.BillingInitializationListener;
import com.unity3d.services.store.gpbl.listeners.ProductDetailsListener;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import com.unity3d.services.store.gpbl.listeners.SkuDetailsResponseListener;
import com.unity3d.services.store.gpbl.proxies.BillingClientStateListenerProxy;
import com.unity3d.services.store.gpbl.proxies.PurchaseUpdatedListenerProxy;
import com.unity3d.services.store.gpbl.proxies.PurchasesResponseListenerProxy;
import com.unity3d.services.store.gpbl.proxies.SkuDetailsResponseListenerProxy;
import fn.a1;
import fn.n0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import j1.f;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001b\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010!\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0011H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v6/BillingClientAdapter;", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapter;", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v6/BillingClientBuilderBridge;", "billingClientBuilderBridge", "", "detectedVersion", "<init>", "(Lcom/unity3d/services/store/gpbl/bridges/billingclient/v6/BillingClientBuilderBridge;I)V", "Lcom/unity3d/services/store/gpbl/listeners/BillingInitializationListener;", "billingInitializationListener", "Lwj/r;", MobileAdsBridgeBase.initializeMethodName, "(Lcom/unity3d/services/store/gpbl/listeners/BillingInitializationListener;)V", "Lcom/unity3d/services/store/gpbl/listeners/BillingClientStateListener;", "billingClientStateListener", InAppPurchaseConstants.METHOD_START_CONNECTION, "(Lcom/unity3d/services/store/gpbl/listeners/BillingClientStateListener;)V", "", "purchaseType", "Lcom/unity3d/services/store/gpbl/BillingResultResponseCode;", "isFeatureSupported", "(Ljava/lang/String;)Lcom/unity3d/services/store/gpbl/BillingResultResponseCode;", "", "isReady", "()Z", "Lcom/unity3d/services/store/gpbl/listeners/PurchasesResponseListener;", "purchasesResponseListener", "queryPurchasesAsync", "(Ljava/lang/String;Lcom/unity3d/services/store/gpbl/listeners/PurchasesResponseListener;)V", "productId", X3.i.f27802m, "Lcom/unity3d/services/store/gpbl/listeners/ProductDetailsListener;", "listener", "queryProductDetailsAsync", "(Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/services/store/gpbl/listeners/ProductDetailsListener;)V", "getAdapterVersion", "()Ljava/lang/String;", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v6/BillingClientBuilderBridge;", "I", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v6/BillingClientBridge;", "billingClient", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v6/BillingClientBridge;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class BillingClientAdapter extends com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter {
    private BillingClientBridge billingClient;
    private final BillingClientBuilderBridge billingClientBuilderBridge;
    private final int detectedVersion;

    public /* synthetic */ BillingClientAdapter(BillingClientBuilderBridge billingClientBuilderBridge, int i10, int i11, g gVar) {
        this(billingClientBuilderBridge, (i11 & 2) != 0 ? 6 : i10);
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public String getAdapterVersion() {
        return String.valueOf(this.detectedVersion);
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public void initialize(BillingInitializationListener billingInitializationListener) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        n.f(billingInitializationListener, "billingInitializationListener");
        if (isInitialized()) {
            billingInitializationListener.onIsAlreadyInitialized();
            return;
        }
        this.billingClientBuilderBridge.setListener(new PurchaseUpdatedListenerProxy(billingInitializationListener));
        this.billingClientBuilderBridge.enablePendingPurchases();
        BillingClientBridgeCommon billingClientBridgeCommonBuild = this.billingClientBuilderBridge.build();
        n.d(billingClientBridgeCommonBuild, "null cannot be cast to non-null type com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBridge");
        this.billingClient = (BillingClientBridge) billingClientBridgeCommonBuild;
        startConnection(billingInitializationListener);
        n0 n0Var = get_isInitialized();
        Boolean bool = Boolean.TRUE;
        a1 a1Var = (a1) n0Var;
        a1Var.getClass();
        a1Var.e0(null, bool);
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public BillingResultResponseCode isFeatureSupported(String purchaseType) {
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge != null) {
            return billingClientBridge.isFeatureSupported(purchaseType);
        }
        n.l("billingClient");
        throw null;
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public boolean isReady() {
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge != null) {
            return billingClientBridge.isReady();
        }
        n.l("billingClient");
        throw null;
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public void queryProductDetailsAsync(String productId, String productType, final ProductDetailsListener listener) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        n.f(productId, "productId");
        n.f(productType, "productType");
        n.f(listener, "listener");
        SkuDetailsParamsBridge skuDetailsParamsBridgeBuild = SkuDetailsParamsBridge.newBuilder().setSkuList(f.C(productId)).setType(productType).build();
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge != null) {
            billingClientBridge.querySkuDetailsAsync(skuDetailsParamsBridgeBuild, new SkuDetailsResponseListenerProxy(new SkuDetailsResponseListener() { // from class: com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientAdapter.queryProductDetailsAsync.1
                @Override // com.unity3d.services.store.gpbl.listeners.SkuDetailsResponseListener
                public void onSkuDetailsUpdated(BillingResultBridge billingResult, List<? extends SkuDetailsBridge> skuDetailsList) {
                    n.f(billingResult, "billingResult");
                    List<? extends SkuDetailsBridge> list = skuDetailsList;
                    if (list == null || list.isEmpty()) {
                        listener.onProductDetailsResponse(billingResult, null);
                        return;
                    }
                    ProductDetailsListener productDetailsListener = listener;
                    JSONObject originalJson = skuDetailsList.get(0).getOriginalJson();
                    productDetailsListener.onProductDetailsResponse(billingResult, originalJson != null ? originalJson.toString() : null);
                }
            }));
        } else {
            n.l("billingClient");
            throw null;
        }
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public void queryPurchasesAsync(String purchaseType, PurchasesResponseListener purchasesResponseListener) throws ClassNotFoundException {
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge != null) {
            billingClientBridge.queryPurchasesAsync(purchaseType, new PurchasesResponseListenerProxy(purchasesResponseListener));
        } else {
            n.l("billingClient");
            throw null;
        }
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public void startConnection(BillingClientStateListener billingClientStateListener) throws ClassNotFoundException {
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge != null) {
            billingClientBridge.startConnection(new BillingClientStateListenerProxy(billingClientStateListener));
        } else {
            n.l("billingClient");
            throw null;
        }
    }

    public BillingClientAdapter(BillingClientBuilderBridge billingClientBuilderBridge, int i10) {
        n.f(billingClientBuilderBridge, "billingClientBuilderBridge");
        this.billingClientBuilderBridge = billingClientBuilderBridge;
        this.detectedVersion = i10;
    }
}
