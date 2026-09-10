package com.unity3d.services.store.gpbl.bridges.billingclient.v6;

import android.content.Context;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon;
import com.unity3d.services.store.gpbl.proxies.PurchasesResponseListenerProxy;
import com.unity3d.services.store.gpbl.proxies.SkuDetailsResponseListenerProxy;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class BillingClientBridge extends BillingClientBridgeCommon {
    private static final String queryPurchasesAsyncMethodName = "queryPurchasesAsync";
    private static final String querySkuDetailsAsyncMethodName = "querySkuDetailsAsync";

    public BillingClientBridge(Object obj) throws ClassNotFoundException {
        super(obj, new HashMap<String, Class<?>[]>() { // from class: com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBridge.1
            {
                put("querySkuDetailsAsync", new Class[]{SkuDetailsParamsBridge.getClassForBridge(), SkuDetailsResponseListenerProxy.getProxyListenerClass()});
                put("queryPurchasesAsync", new Class[]{String.class, PurchasesResponseListenerProxy.getProxyListenerClass()});
            }
        });
    }

    public static BillingClientBuilderBridge newBuilder(Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return new BillingClientBuilderBridge(BillingClientBridgeCommon.callNonVoidStaticMethod("newBuilder", context));
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient
    public void queryPurchasesAsync(String str, PurchasesResponseListenerProxy purchasesResponseListenerProxy) throws ClassNotFoundException {
        callVoidMethod("queryPurchasesAsync", this._billingClientInternalInstance, str, purchasesResponseListenerProxy.getProxyInstance());
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient
    public void querySkuDetailsAsync(SkuDetailsParamsBridge skuDetailsParamsBridge, SkuDetailsResponseListenerProxy skuDetailsResponseListenerProxy) throws ClassNotFoundException {
        callVoidMethod("querySkuDetailsAsync", this._billingClientInternalInstance, skuDetailsParamsBridge.getInternalInstance(), skuDetailsResponseListenerProxy.getProxyInstance());
    }
}
