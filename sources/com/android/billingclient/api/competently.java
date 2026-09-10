package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import org.json.JSONException;

/* JADX INFO: compiled from: com.android.billingclient:billing@@7.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class competently extends com.google.android.gms.internal.play_billing.zze {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final ExternalOfferReportingDetailsListener f16502dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final int f16503marial;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final kowloon f16504wireman;

    public /* synthetic */ competently(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener, kowloon kowloonVar, int i, zzbf zzbfVar) {
        this.f16502dern = externalOfferReportingDetailsListener;
        this.f16504wireman = kowloonVar;
        this.f16503marial = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzf
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            kowloon kowloonVar = this.f16504wireman;
            BillingResult billingResult = arytenoidectomy.f16447cutely;
            kowloonVar.wireman(zzcb.zza(95, 24, billingResult), this.f16503marial);
            this.f16502dern.onExternalOfferReportingDetailsResponse(billingResult, null);
            return;
        }
        int iZzb = com.google.android.gms.internal.play_billing.zzb.zzb(bundle, "BillingClient");
        BillingResult billingResultAttabal = arytenoidectomy.attabal(iZzb, com.google.android.gms.internal.play_billing.zzb.zzg(bundle, "BillingClient"));
        if (iZzb != 0) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "createExternalOfferReportingDetailsAsync() failed. Response code: " + iZzb);
            this.f16504wireman.wireman(zzcb.zza(23, 24, billingResultAttabal), this.f16503marial);
            this.f16502dern.onExternalOfferReportingDetailsResponse(billingResultAttabal, null);
            return;
        }
        try {
            this.f16502dern.onExternalOfferReportingDetailsResponse(billingResultAttabal, new ExternalOfferReportingDetails(bundle.getString("CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS")));
        } catch (JSONException e) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Error when parsing invalid external offer reporting details. \n Exception: ", e);
            kowloon kowloonVar2 = this.f16504wireman;
            BillingResult billingResult2 = arytenoidectomy.f16447cutely;
            kowloonVar2.wireman(zzcb.zza(104, 24, billingResult2), this.f16503marial);
            this.f16502dern.onExternalOfferReportingDetailsResponse(billingResult2, null);
        }
    }
}
