package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.unity3d.services.core.reflection.GenericBridge;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wj.f;
import xj.b0;
import xj.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u00020\u000bH\u0014J\u0014\u0010\f\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0011"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/QueryProductDetailsParamsBuilderBridge;", "Lcom/unity3d/services/core/reflection/GenericBridge;", "builderInstance", "", "(Ljava/lang/Object;)V", "getBuilderInstance", "()Ljava/lang/Object;", "setBuilderInstance", "build", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/QueryProductDetailsParamsBridge;", "getClassName", "", "setProductList", "productList", "", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/ProductBridge;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class QueryProductDetailsParamsBuilderBridge extends GenericBridge {
    private static final String BUILD_METHOD = "build";
    private static final String SET_PRODUCT_LIST_METHOD = "setProductList";
    private Object builderInstance;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryProductDetailsParamsBuilderBridge(Object builderInstance) {
        super(b0.Q(new f("setProductList", new Class[]{List.class}), new f("build", new Class[0])));
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
        return InAppPurchaseConstants.CLASSNAME_QUERY_PRODUCT_DETAILS_PARAMS_BUILDER;
    }

    public final void setBuilderInstance(Object obj) {
        n.f(obj, "<set-?>");
        this.builderInstance = obj;
    }

    public final QueryProductDetailsParamsBuilderBridge setProductList(List<ProductBridge> productList) {
        n.f(productList, "productList");
        List<ProductBridge> list = productList;
        ArrayList arrayList = new ArrayList(p.W(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ProductBridge) it.next()).getProductInternalInstance());
        }
        Object objCallNonVoidMethod = callNonVoidMethod("setProductList", this.builderInstance, arrayList);
        n.e(objCallNonVoidMethod, "callNonVoidMethod(SET_PR…nce, productListInternal)");
        this.builderInstance = objCallNonVoidMethod;
        return this;
    }
}
