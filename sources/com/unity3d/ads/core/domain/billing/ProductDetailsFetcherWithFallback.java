package com.unity3d.ads.core.domain.billing;

import aa.b;
import ak.f;
import bk.a;
import ck.c;
import ck.e;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcherWithFallback;", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcher;", "primaryFetcher", "secondaryFetcher", "<init>", "(Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcher;Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcher;)V", "", "productId", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsResult;", "fetchProductDetails", "(Ljava/lang/String;Lak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcher;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class ProductDetailsFetcherWithFallback implements ProductDetailsFetcher {
    private final ProductDetailsFetcher primaryFetcher;
    private final ProductDetailsFetcher secondaryFetcher;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback$fetchProductDetails$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback", f = "ProductDetailsFetcherWithFallback.kt", l = {16, 20, 24}, m = "fetchProductDetails")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ProductDetailsFetcherWithFallback.this.fetchProductDetails(null, this);
        }
    }

    public ProductDetailsFetcherWithFallback(ProductDetailsFetcher primaryFetcher, ProductDetailsFetcher secondaryFetcher) {
        n.f(primaryFetcher, "primaryFetcher");
        n.f(secondaryFetcher, "secondaryFetcher");
        this.primaryFetcher = primaryFetcher;
        this.secondaryFetcher = secondaryFetcher;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0094 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0095 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.billing.ProductDetailsFetcher
    public Object fetchProductDetails(String str, f fVar) {
        AnonymousClass1 anonymousClass1;
        ProductDetailsResult productDetailsResult;
        ProductDetailsResult productDetailsResult2;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(fVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(fVar);
        }
        Object objFetchProductDetails = anonymousClass1.result;
        int i11 = anonymousClass1.label;
        a aVar = a.f5708a;
        if (i11 == 0) {
            t9.e.z(objFetchProductDetails);
            ProductDetailsFetcher productDetailsFetcher = this.primaryFetcher;
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = str;
            anonymousClass1.label = 1;
            objFetchProductDetails = productDetailsFetcher.fetchProductDetails(str, anonymousClass1);
            if (objFetchProductDetails != aVar) {
            }
            return aVar;
        }
        if (i11 == 1) {
            str = (String) anonymousClass1.L$1;
            this = (ProductDetailsFetcherWithFallback) anonymousClass1.L$0;
            t9.e.z(objFetchProductDetails);
        } else {
            if (i11 == 2) {
                t9.e.z(objFetchProductDetails);
                return objFetchProductDetails;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            productDetailsResult = (ProductDetailsResult) anonymousClass1.L$0;
            t9.e.z(objFetchProductDetails);
        }
        productDetailsResult2 = (ProductDetailsResult) objFetchProductDetails;
        if (productDetailsResult2 instanceof ProductDetailsResult.Success) {
            return productDetailsResult2;
        }
        return productDetailsResult;
        ProductDetailsResult productDetailsResult3 = (ProductDetailsResult) objFetchProductDetails;
        if (productDetailsResult3 instanceof ProductDetailsResult.Success) {
            return productDetailsResult3;
        }
        if (productDetailsResult3 instanceof ProductDetailsResult.NotFound) {
            ProductDetailsFetcher productDetailsFetcher2 = this.secondaryFetcher;
            anonymousClass1.L$0 = null;
            anonymousClass1.L$1 = null;
            anonymousClass1.label = 2;
            Object objFetchProductDetails2 = productDetailsFetcher2.fetchProductDetails(str, anonymousClass1);
            if (objFetchProductDetails2 != aVar) {
                return objFetchProductDetails2;
            }
        } else {
            if (!(productDetailsResult3 instanceof ProductDetailsResult.Failure)) {
                throw new b((byte) 0, 20);
            }
            ProductDetailsFetcher productDetailsFetcher3 = this.secondaryFetcher;
            anonymousClass1.L$0 = productDetailsResult3;
            anonymousClass1.L$1 = null;
            anonymousClass1.label = 3;
            Object objFetchProductDetails3 = productDetailsFetcher3.fetchProductDetails(str, anonymousClass1);
            if (objFetchProductDetails3 != aVar) {
                objFetchProductDetails = objFetchProductDetails3;
                productDetailsResult = productDetailsResult3;
                productDetailsResult2 = (ProductDetailsResult) objFetchProductDetails;
                if (productDetailsResult2 instanceof ProductDetailsResult.Success) {
                    return productDetailsResult2;
                }
                return productDetailsResult;
            }
        }
        return aVar;
    }
}
