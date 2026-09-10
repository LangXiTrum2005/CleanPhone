package com.android.billingclient.api;

import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: com.android.billingclient:billing-ktx@@7.0.0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/android/billingclient/api/CreateAlternativeBillingOnlyReportingDetailsResult;", "", "billingResult", "Lcom/android/billingclient/api/BillingResult;", "alternativeBillingOnlyReportingDetails", "Lcom/android/billingclient/api/AlternativeBillingOnlyReportingDetails;", "(Lcom/android/billingclient/api/BillingResult;Lcom/android/billingclient/api/AlternativeBillingOnlyReportingDetails;)V", "getAlternativeBillingOnlyReportingDetails", "()Lcom/android/billingclient/api/AlternativeBillingOnlyReportingDetails;", "getBillingResult", "()Lcom/android/billingclient/api/BillingResult;", "component1", "component2", "copy", "equals", "", C3414a2.d, "hashCode", "", "toString", "", "java.com.google.android.libraries.play.billing.public.ktbilling_granule"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CreateAlternativeBillingOnlyReportingDetailsResult {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from toString */
    public final BillingResult billingResult;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from toString */
    public final AlternativeBillingOnlyReportingDetails alternativeBillingOnlyReportingDetails;

    public CreateAlternativeBillingOnlyReportingDetailsResult(BillingResult billingResult, AlternativeBillingOnlyReportingDetails alternativeBillingOnlyReportingDetails) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        this.billingResult = billingResult;
        this.alternativeBillingOnlyReportingDetails = alternativeBillingOnlyReportingDetails;
    }

    public static /* synthetic */ CreateAlternativeBillingOnlyReportingDetailsResult copy$default(CreateAlternativeBillingOnlyReportingDetailsResult createAlternativeBillingOnlyReportingDetailsResult, BillingResult billingResult, AlternativeBillingOnlyReportingDetails alternativeBillingOnlyReportingDetails, int i, Object obj) {
        if ((i & 1) != 0) {
            billingResult = createAlternativeBillingOnlyReportingDetailsResult.billingResult;
        }
        if ((i & 2) != 0) {
            alternativeBillingOnlyReportingDetails = createAlternativeBillingOnlyReportingDetailsResult.alternativeBillingOnlyReportingDetails;
        }
        return createAlternativeBillingOnlyReportingDetailsResult.copy(billingResult, alternativeBillingOnlyReportingDetails);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BillingResult getBillingResult() {
        return this.billingResult;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AlternativeBillingOnlyReportingDetails getAlternativeBillingOnlyReportingDetails() {
        return this.alternativeBillingOnlyReportingDetails;
    }

    public final CreateAlternativeBillingOnlyReportingDetailsResult copy(BillingResult billingResult, AlternativeBillingOnlyReportingDetails alternativeBillingOnlyReportingDetails) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        return new CreateAlternativeBillingOnlyReportingDetailsResult(billingResult, alternativeBillingOnlyReportingDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateAlternativeBillingOnlyReportingDetailsResult)) {
            return false;
        }
        CreateAlternativeBillingOnlyReportingDetailsResult createAlternativeBillingOnlyReportingDetailsResult = (CreateAlternativeBillingOnlyReportingDetailsResult) other;
        return Intrinsics.wireman(this.billingResult, createAlternativeBillingOnlyReportingDetailsResult.billingResult) && Intrinsics.wireman(this.alternativeBillingOnlyReportingDetails, createAlternativeBillingOnlyReportingDetailsResult.alternativeBillingOnlyReportingDetails);
    }

    public final AlternativeBillingOnlyReportingDetails getAlternativeBillingOnlyReportingDetails() {
        return this.alternativeBillingOnlyReportingDetails;
    }

    public final BillingResult getBillingResult() {
        return this.billingResult;
    }

    public int hashCode() {
        int iHashCode = this.billingResult.hashCode() * 31;
        AlternativeBillingOnlyReportingDetails alternativeBillingOnlyReportingDetails = this.alternativeBillingOnlyReportingDetails;
        return iHashCode + (alternativeBillingOnlyReportingDetails == null ? 0 : alternativeBillingOnlyReportingDetails.hashCode());
    }

    public String toString() {
        return "CreateAlternativeBillingOnlyReportingDetailsResult(billingResult=" + this.billingResult + ", alternativeBillingOnlyReportingDetails=" + this.alternativeBillingOnlyReportingDetails + ")";
    }
}
