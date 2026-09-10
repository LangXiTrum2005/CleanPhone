package com.unity3d.services.store.gpbl.bridges.billingclient.common;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.unity3d.services.core.reflection.GenericBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge;
import com.unity3d.services.store.gpbl.proxies.PurchaseUpdatedListenerProxy;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class BillingClientBuilderBridgeCommon extends GenericBridge implements IBillingClientBuilderBridge {
    protected static final String buildMethodName = "build";
    private static final String setListenerMethodName = "setListener";
    protected Object _billingClientBuilderInternalInstance;

    public BillingClientBuilderBridgeCommon(Object obj, Map<String, Class<?>[]> map) throws ClassNotFoundException {
        super(appendFunctionAnParameters(map));
        this._billingClientBuilderInternalInstance = obj;
    }

    private static Map<String, Class<?>[]> appendFunctionAnParameters(Map<String, Class<?>[]> map) throws ClassNotFoundException {
        map.putAll(new HashMap<String, Class<?>[]>() { // from class: com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBuilderBridgeCommon.1
            {
                put("setListener", new Class[]{PurchaseUpdatedListenerProxy.getProxyListenerClass()});
                put("build", new Class[0]);
            }
        });
        return map;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return InAppPurchaseConstants.CLASSNAME_BILLING_CLIENT_BUILDER;
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge
    public IBillingClientBuilderBridge setListener(PurchaseUpdatedListenerProxy purchaseUpdatedListenerProxy) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        this._billingClientBuilderInternalInstance = callNonVoidMethod("setListener", this._billingClientBuilderInternalInstance, purchaseUpdatedListenerProxy.getProxyInstance());
        return this;
    }
}
