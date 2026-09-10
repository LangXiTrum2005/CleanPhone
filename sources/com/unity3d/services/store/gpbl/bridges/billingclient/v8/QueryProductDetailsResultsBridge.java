package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

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
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/QueryProductDetailsResultsBridge;", "Lcom/unity3d/services/core/reflection/GenericBridge;", "productDetailsResult", "", "(Ljava/lang/Object;)V", "getClassName", "", QueryProductDetailsResultsBridge.GET_PRODUCT_DETAILS_LIST_METHOD, "", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/ProductDetailsBridge;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class QueryProductDetailsResultsBridge extends GenericBridge {
    private static final String GET_PRODUCT_DETAILS_LIST_METHOD = "getProductDetailsList";
    private final Object productDetailsResult;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryProductDetailsResultsBridge(Object productDetailsResult) {
        super(b0.P(new f(GET_PRODUCT_DETAILS_LIST_METHOD, new Class[0])));
        n.f(productDetailsResult, "productDetailsResult");
        this.productDetailsResult = productDetailsResult;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return "com.android.billingclient.api.QueryProductDetailsResult";
    }

    public final List<ProductDetailsBridge> getProductDetailsList() {
        List list = (List) callNonVoidMethod(GET_PRODUCT_DETAILS_LIST_METHOD, this.productDetailsResult, new Object[0]);
        if (list == null) {
            return v.f53866a;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(p.W(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new ProductDetailsBridge(it.next()));
        }
        return arrayList;
    }
}
