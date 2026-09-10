package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import org.json.JSONException;

/* JADX INFO: compiled from: com.android.billingclient:billing@@7.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class beachfront extends com.google.android.gms.internal.play_billing.zzc {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final AlternativeBillingOnlyReportingDetailsListener f16499dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final int f16500marial;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final kowloon f16501wireman;

    public /* synthetic */ beachfront(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener, kowloon kowloonVar, int i, zzbd zzbdVar) {
        this.f16499dern = alternativeBillingOnlyReportingDetailsListener;
        this.f16501wireman = kowloonVar;
        this.f16500marial = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzd
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            kowloon kowloonVar = this.f16501wireman;
            BillingResult billingResult = arytenoidectomy.f16447cutely;
            kowloonVar.wireman(zzcb.zza(71, 15, billingResult), this.f16500marial);
            this.f16499dern.onAlternativeBillingOnlyTokenResponse(billingResult, null);
            return;
        }
        int iZzb = com.google.android.gms.internal.play_billing.zzb.zzb(bundle, "BillingClient");
        BillingResult billingResultAttabal = arytenoidectomy.attabal(iZzb, com.google.android.gms.internal.play_billing.zzb.zzg(bundle, "BillingClient"));
        if (iZzb != 0) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "createAlternativeBillingOnlyReportingDetailsAsync() failed. Response code: " + iZzb);
            this.f16501wireman.wireman(zzcb.zza(23, 15, billingResultAttabal), this.f16500marial);
            this.f16499dern.onAlternativeBillingOnlyTokenResponse(billingResultAttabal, null);
            return;
        }
        try {
            this.f16499dern.onAlternativeBillingOnlyTokenResponse(billingResultAttabal, new AlternativeBillingOnlyReportingDetails(bundle.getString("CREATE_ALTERNATIVE_BILLING_ONLY_REPORTING_DETAILS")));
        } catch (JSONException e) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Error when parsing invalid alternative billing only reporting details. \n Exception: ", e);
            kowloon kowloonVar2 = this.f16501wireman;
            BillingResult billingResult2 = arytenoidectomy.f16447cutely;
            kowloonVar2.wireman(zzcb.zza(72, 15, billingResult2), this.f16500marial);
            this.f16499dern.onAlternativeBillingOnlyTokenResponse(billingResult2, null);
        }
    }
}
