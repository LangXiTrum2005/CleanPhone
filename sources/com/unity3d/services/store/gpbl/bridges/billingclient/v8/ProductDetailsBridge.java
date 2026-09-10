package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import an.h;
import an.p;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.unity3d.services.core.reflection.GenericBridge;
import com.unity3d.services.store.gpbl.BillingOriginalJsonResponse;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import org.json.JSONException;
import org.json.JSONObject;
import wj.f;
import xj.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u00012\u00020\u0002:\u0001\rB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0014J\b\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\b\u0010\f\u001a\u00020\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/ProductDetailsBridge;", "Lcom/unity3d/services/store/gpbl/BillingOriginalJsonResponse;", "Lcom/unity3d/services/core/reflection/GenericBridge;", "internalRef", "", "(Ljava/lang/Object;)V", "getClassName", "", InAppPurchaseConstants.METHOD_GET_ORIGINAL_JSON, "Lorg/json/JSONObject;", "parseOriginalJson", "productDetailsString", "toString", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class ProductDetailsBridge extends GenericBridge implements BillingOriginalJsonResponse {
    private static final String TO_STRING_METHOD = "toString";
    private final Object internalRef;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDetailsBridge(Object internalRef) {
        super(b0.N(new f("toString", new Class[0])));
        n.f(internalRef, "internalRef");
        this.internalRef = internalRef;
    }

    private final String parseOriginalJson(String productDetailsString) {
        try {
            int iW0 = h.w0(productDetailsString, "jsonString='", 0, false, 6) + 12;
            int iW1 = h.w0(productDetailsString, "', parsedJson=", 0, false, 6);
            if (1 > iW0 || iW0 >= iW1) {
                return null;
            }
            String strSubstring = productDetailsString.substring(iW0, iW1);
            n.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return p.n0(strSubstring, "\\/", "/");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return InAppPurchaseConstants.CLASSNAME_PRODUCT_DETAILS;
    }

    @Override // com.unity3d.services.store.gpbl.BillingOriginalJsonResponse
    public JSONObject getOriginalJson() {
        try {
            String originalJson = parseOriginalJson(toString());
            return originalJson != null ? new JSONObject(originalJson) : new JSONObject();
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    public String toString() {
        Object objCallNonVoidMethod = callNonVoidMethod("toString", this.internalRef, new Object[0]);
        n.d(objCallNonVoidMethod, "null cannot be cast to non-null type kotlin.String");
        return (String) objCallNonVoidMethod;
    }
}
