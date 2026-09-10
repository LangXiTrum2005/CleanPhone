package com.android.billingclient.api;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@zzo
public final class QueryProductDetailsResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f7203b;

    public QueryProductDetailsResult(List list, List list2) {
        this.f7202a = list;
        this.f7203b = list2;
    }

    @NonNull
    public static QueryProductDetailsResult create(@NonNull List<ProductDetails> list, @NonNull List<UnfetchedProduct> list2) {
        return new QueryProductDetailsResult(list, list2);
    }

    @NonNull
    @zzo
    public List<ProductDetails> getProductDetailsList() {
        return this.f7202a;
    }

    @NonNull
    @zzo
    public List<UnfetchedProduct> getUnfetchedProductList() {
        return this.f7203b;
    }
}
