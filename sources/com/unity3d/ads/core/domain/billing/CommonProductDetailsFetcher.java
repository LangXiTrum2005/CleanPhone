package com.unity3d.ads.core.domain.billing;

import ak.f;
import cn.l;
import com.google.android.gms.internal.play_billing.q1;
import com.ironsource.X3;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter;
import com.unity3d.services.store.gpbl.listeners.ProductDetailsListener;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/domain/billing/CommonProductDetailsFetcher;", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcher;", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapter;", "billingClientAdapter", "", X3.i.f27802m, "<init>", "(Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapter;Ljava/lang/String;)V", "productId", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsResult;", "fetchProductDetails", "(Ljava/lang/String;Lak/f;)Ljava/lang/Object;", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapter;", "Ljava/lang/String;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class CommonProductDetailsFetcher implements ProductDetailsFetcher {
    private final BillingClientAdapter billingClientAdapter;
    private final String productType;

    public CommonProductDetailsFetcher(BillingClientAdapter billingClientAdapter, String productType) {
        n.f(productType, "productType");
        this.billingClientAdapter = billingClientAdapter;
        this.productType = productType;
    }

    @Override // com.unity3d.ads.core.domain.billing.ProductDetailsFetcher
    public Object fetchProductDetails(String str, f fVar) {
        final l lVar = new l(1, q1.t(fVar));
        lVar.t();
        ProductDetailsListener productDetailsListener = new ProductDetailsListener() { // from class: com.unity3d.ads.core.domain.billing.CommonProductDetailsFetcher$fetchProductDetails$2$listener$1
            @Override // com.unity3d.services.store.gpbl.listeners.ProductDetailsListener
            public final void onProductDetailsResponse(BillingResultBridge billingResult, String str2) {
                n.f(billingResult, "billingResult");
                if (str2 != null && billingResult.getResponseCode() == BillingResultResponseCode.OK) {
                    lVar.resumeWith(new ProductDetailsResult.Success(str2));
                } else if (billingResult.getResponseCode() == BillingResultResponseCode.OK) {
                    lVar.resumeWith(ProductDetailsResult.NotFound.INSTANCE);
                } else {
                    lVar.resumeWith(new ProductDetailsResult.Failure(billingResult));
                }
            }
        };
        BillingClientAdapter billingClientAdapter = this.billingClientAdapter;
        if (billingClientAdapter != null) {
            billingClientAdapter.queryProductDetailsAsync(str, this.productType, productDetailsListener);
        }
        return lVar.s();
    }
}
