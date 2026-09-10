package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.ironsource.X3;
import com.unity3d.services.core.reflection.GenericBridge;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wj.f;
import xj.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u00020\u000bH\u0014J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u000f"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/QueryPurchasesParamsBuilderBridge;", "Lcom/unity3d/services/core/reflection/GenericBridge;", "builderInstance", "", "(Ljava/lang/Object;)V", "getBuilderInstance", "()Ljava/lang/Object;", "setBuilderInstance", "build", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/QueryProductDetailsParamsBridge;", "getClassName", "", "setProductType", X3.i.f27802m, "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class QueryPurchasesParamsBuilderBridge extends GenericBridge {
    private static final String BUILD_METHOD = "build";
    private static final String SET_PRODUCT_TYPE_METHOD = "setProductType";
    private Object builderInstance;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryPurchasesParamsBuilderBridge(Object builderInstance) {
        super(b0.Q(new f("setProductType", new Class[]{String.class}), new f("build", new Class[0])));
        n.f(builderInstance, "builderInstance");
        this.builderInstance = builderInstance;
    }

    public final QueryProductDetailsParamsBridge build() {
        return new QueryProductDetailsParamsBridge(callNonVoidMethod("build", this.builderInstance, new Object[0]));
    }

    public final Object getBuilderInstance() {
        return this.builderInstance;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return InAppPurchaseConstants.CLASSNAME_QUERY_PURCHASES_PARAMS_BUILDER;
    }

    public final void setBuilderInstance(Object obj) {
        n.f(obj, "<set-?>");
        this.builderInstance = obj;
    }

    public final QueryPurchasesParamsBuilderBridge setProductType(String productType) {
        n.f(productType, "productType");
        Object objCallNonVoidMethod = callNonVoidMethod("setProductType", this.builderInstance, productType);
        n.e(objCallNonVoidMethod, "callNonVoidMethod(SET_PR…derInstance, productType)");
        this.builderInstance = objCallNonVoidMethod;
        return this;
    }
}
