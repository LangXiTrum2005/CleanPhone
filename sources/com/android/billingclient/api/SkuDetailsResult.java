package com.android.billingclient.api;

import com.ironsource.C3414a2;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: com.android.billingclient:billing-ktx@@7.0.0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/android/billingclient/api/SkuDetailsResult;", "", "billingResult", "Lcom/android/billingclient/api/BillingResult;", "skuDetailsList", "", "Lcom/android/billingclient/api/SkuDetails;", "(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V", "getBillingResult", "()Lcom/android/billingclient/api/BillingResult;", "getSkuDetailsList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", C3414a2.d, "hashCode", "", "toString", "", "java.com.google.android.libraries.play.billing.public.ktbilling_granule"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SkuDetailsResult {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from toString */
    public final BillingResult billingResult;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from toString */
    public final List skuDetailsList;

    public SkuDetailsResult(BillingResult billingResult, List<? extends SkuDetails> list) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        this.billingResult = billingResult;
        this.skuDetailsList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SkuDetailsResult copy$default(SkuDetailsResult skuDetailsResult, BillingResult billingResult, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            billingResult = skuDetailsResult.billingResult;
        }
        if ((i & 2) != 0) {
            list = skuDetailsResult.skuDetailsList;
        }
        return skuDetailsResult.copy(billingResult, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BillingResult getBillingResult() {
        return this.billingResult;
    }

    public final List<SkuDetails> component2() {
        return this.skuDetailsList;
    }

    public final SkuDetailsResult copy(BillingResult billingResult, List<? extends SkuDetails> skuDetailsList) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        return new SkuDetailsResult(billingResult, skuDetailsList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SkuDetailsResult)) {
            return false;
        }
        SkuDetailsResult skuDetailsResult = (SkuDetailsResult) other;
        return Intrinsics.wireman(this.billingResult, skuDetailsResult.billingResult) && Intrinsics.wireman(this.skuDetailsList, skuDetailsResult.skuDetailsList);
    }

    public final BillingResult getBillingResult() {
        return this.billingResult;
    }

    public final List<SkuDetails> getSkuDetailsList() {
        return this.skuDetailsList;
    }

    public int hashCode() {
        int iHashCode = this.billingResult.hashCode() * 31;
        List list = this.skuDetailsList;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "SkuDetailsResult(billingResult=" + this.billingResult + ", skuDetailsList=" + this.skuDetailsList + ")";
    }
}
