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
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\u0007\u001a\u00020\bH\u0014J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/ProductBuilderBridge;", "Lcom/unity3d/services/core/reflection/GenericBridge;", "builderInstance", "", "(Ljava/lang/Object;)V", "build", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/ProductBridge;", "getClassName", "", "setProductId", "productId", "setProductType", X3.i.f27802m, "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class ProductBuilderBridge extends GenericBridge {
    private static final String BUILD_METHOD = "build";
    private static final String SET_PRODUCT_ID_METHOD = "setProductId";
    private static final String SET_PRODUCT_TYPE_METHOD = "setProductType";
    private Object builderInstance;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductBuilderBridge(Object builderInstance) {
        super(b0.Q(new f("setProductId", new Class[]{String.class}), new f("setProductType", new Class[]{String.class}), new f("build", new Class[0])));
        n.f(builderInstance, "builderInstance");
        this.builderInstance = builderInstance;
    }

    public final ProductBridge build() {
        return new ProductBridge(callNonVoidMethod("build", this.builderInstance, new Object[0]));
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return InAppPurchaseConstants.CLASSNAME_QUERY_PRODUCT_DETAILS_PARAMS_PRODUCT_BUILDER;
    }

    public final ProductBuilderBridge setProductId(String productId) {
        n.f(productId, "productId");
        Object objCallNonVoidMethod = callNonVoidMethod("setProductId", this.builderInstance, productId);
        n.e(objCallNonVoidMethod, "callNonVoidMethod(SET_PR…ilderInstance, productId)");
        this.builderInstance = objCallNonVoidMethod;
        return this;
    }

    public final ProductBuilderBridge setProductType(String productType) {
        n.f(productType, "productType");
        Object objCallNonVoidMethod = callNonVoidMethod("setProductType", this.builderInstance, productType);
        n.e(objCallNonVoidMethod, "callNonVoidMethod(SET_PR…derInstance, productType)");
        this.builderInstance = objCallNonVoidMethod;
        return this;
    }
}
