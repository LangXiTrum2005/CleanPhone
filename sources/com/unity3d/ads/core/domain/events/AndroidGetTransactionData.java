package com.unity3d.ads.core.domain.events;

import com.facebook.appevents.internal.Constants;
import com.unity3d.ads.core.domain.GetByteStringId;
import com.unity3d.ads.core.extensions.TimestampExtensionsKt;
import com.unity3d.ads.core.extensions.TransactionStateExtensionsKt;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.TransactionDataKt;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/core/domain/events/AndroidGetTransactionData;", "Lcom/unity3d/ads/core/domain/events/GetTransactionData;", "getByteStringId", "Lcom/unity3d/ads/core/domain/GetByteStringId;", "(Lcom/unity3d/ads/core/domain/GetByteStringId;)V", "invoke", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionData;", "purchaseDetail", "Lcom/unity3d/services/store/gpbl/bridges/PurchaseBridge;", "productDetailJson", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidGetTransactionData implements GetTransactionData {
    private final GetByteStringId getByteStringId;

    public AndroidGetTransactionData(GetByteStringId getByteStringId) {
        n.f(getByteStringId, "getByteStringId");
        this.getByteStringId = getByteStringId;
    }

    @Override // com.unity3d.ads.core.domain.events.GetTransactionData
    public TransactionEventRequestOuterClass.TransactionData invoke(PurchaseBridge purchaseDetail, String productDetailJson) throws JSONException {
        n.f(purchaseDetail, "purchaseDetail");
        n.f(productDetailJson, "productDetailJson");
        TransactionDataKt.Dsl.Companion companion = TransactionDataKt.Dsl.INSTANCE;
        TransactionEventRequestOuterClass.TransactionData.Builder builderNewBuilder = TransactionEventRequestOuterClass.TransactionData.newBuilder();
        n.e(builderNewBuilder, "newBuilder()");
        TransactionDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setProductId(purchaseDetail.getOriginalJson().get("productId").toString());
        dsl_create.setEventId(this.getByteStringId.invoke());
        Object obj = purchaseDetail.getOriginalJson().get(Constants.GP_IAP_PURCHASE_TIME);
        n.d(obj, "null cannot be cast to non-null type kotlin.Long");
        dsl_create.setTimestamp(TimestampExtensionsKt.fromMillis(((Long) obj).longValue()));
        dsl_create.setTransactionId(purchaseDetail.getOriginalJson().get("orderId").toString());
        dsl_create.setProduct(productDetailJson);
        String string = purchaseDetail.getOriginalJson().toString();
        n.e(string, "purchaseDetail.originalJson.toString()");
        dsl_create.setTransaction(string);
        String signature = purchaseDetail.getSignature();
        n.e(signature, "purchaseDetail.signature");
        dsl_create.setSignature(signature);
        Object obj2 = purchaseDetail.getOriginalJson().get("purchaseState");
        n.d(obj2, "null cannot be cast to non-null type kotlin.Int");
        dsl_create.setTransactionState(TransactionStateExtensionsKt.fromPurchaseState(((Integer) obj2).intValue()));
        return dsl_create._build();
    }
}
