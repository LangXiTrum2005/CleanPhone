package com.android.billingclient.api;

import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: com.android.billingclient:billing-ktx@@7.0.0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/android/billingclient/api/CreateExternalOfferReportingDetailsResult;", "", "billingResult", "Lcom/android/billingclient/api/BillingResult;", "externalOfferReportingDetails", "Lcom/android/billingclient/api/ExternalOfferReportingDetails;", "(Lcom/android/billingclient/api/BillingResult;Lcom/android/billingclient/api/ExternalOfferReportingDetails;)V", "getBillingResult", "()Lcom/android/billingclient/api/BillingResult;", "getExternalOfferReportingDetails", "()Lcom/android/billingclient/api/ExternalOfferReportingDetails;", "component1", "component2", "copy", "equals", "", C3414a2.d, "hashCode", "", "toString", "", "java.com.google.android.libraries.play.billing.public.ktbilling_granule"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CreateExternalOfferReportingDetailsResult {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from toString */
    public final BillingResult billingResult;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from toString */
    public final ExternalOfferReportingDetails externalOfferReportingDetails;

    public CreateExternalOfferReportingDetailsResult(BillingResult billingResult, ExternalOfferReportingDetails externalOfferReportingDetails) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        this.billingResult = billingResult;
        this.externalOfferReportingDetails = externalOfferReportingDetails;
    }

    public static /* synthetic */ CreateExternalOfferReportingDetailsResult copy$default(CreateExternalOfferReportingDetailsResult createExternalOfferReportingDetailsResult, BillingResult billingResult, ExternalOfferReportingDetails externalOfferReportingDetails, int i, Object obj) {
        if ((i & 1) != 0) {
            billingResult = createExternalOfferReportingDetailsResult.billingResult;
        }
        if ((i & 2) != 0) {
            externalOfferReportingDetails = createExternalOfferReportingDetailsResult.externalOfferReportingDetails;
        }
        return createExternalOfferReportingDetailsResult.copy(billingResult, externalOfferReportingDetails);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BillingResult getBillingResult() {
        return this.billingResult;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ExternalOfferReportingDetails getExternalOfferReportingDetails() {
        return this.externalOfferReportingDetails;
    }

    public final CreateExternalOfferReportingDetailsResult copy(BillingResult billingResult, ExternalOfferReportingDetails externalOfferReportingDetails) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        return new CreateExternalOfferReportingDetailsResult(billingResult, externalOfferReportingDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateExternalOfferReportingDetailsResult)) {
            return false;
        }
        CreateExternalOfferReportingDetailsResult createExternalOfferReportingDetailsResult = (CreateExternalOfferReportingDetailsResult) other;
        return Intrinsics.wireman(this.billingResult, createExternalOfferReportingDetailsResult.billingResult) && Intrinsics.wireman(this.externalOfferReportingDetails, createExternalOfferReportingDetailsResult.externalOfferReportingDetails);
    }

    public final BillingResult getBillingResult() {
        return this.billingResult;
    }

    public final ExternalOfferReportingDetails getExternalOfferReportingDetails() {
        return this.externalOfferReportingDetails;
    }

    public int hashCode() {
        int iHashCode = this.billingResult.hashCode() * 31;
        ExternalOfferReportingDetails externalOfferReportingDetails = this.externalOfferReportingDetails;
        return iHashCode + (externalOfferReportingDetails == null ? 0 : externalOfferReportingDetails.hashCode());
    }

    public String toString() {
        return "CreateExternalOfferReportingDetailsResult(billingResult=" + this.billingResult + ", externalOfferReportingDetails=" + this.externalOfferReportingDetails + ")";
    }
}
