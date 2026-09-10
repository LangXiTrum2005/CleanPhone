package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.android.billingclient:billing@@7.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class apical extends com.google.android.gms.internal.play_billing.zzm {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final AlternativeBillingOnlyAvailabilityListener f16436dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final int f16437marial;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final kowloon f16438wireman;

    public /* synthetic */ apical(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener, kowloon kowloonVar, int i, zzbn zzbnVar) {
        this.f16436dern = alternativeBillingOnlyAvailabilityListener;
        this.f16438wireman = kowloonVar;
        this.f16437marial = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzn
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            kowloon kowloonVar = this.f16438wireman;
            BillingResult billingResult = arytenoidectomy.f16447cutely;
            kowloonVar.wireman(zzcb.zza(67, 14, billingResult), this.f16437marial);
            this.f16436dern.onAlternativeBillingOnlyAvailabilityResponse(billingResult);
            return;
        }
        int iZzb = com.google.android.gms.internal.play_billing.zzb.zzb(bundle, "BillingClient");
        BillingResult billingResultAttabal = arytenoidectomy.attabal(iZzb, com.google.android.gms.internal.play_billing.zzb.zzg(bundle, "BillingClient"));
        if (iZzb != 0) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "isAlternativeBillingOnlyAvailableAsync() failed. Response code: " + iZzb);
            this.f16438wireman.wireman(zzcb.zza(23, 14, billingResultAttabal), this.f16437marial);
        }
        this.f16436dern.onAlternativeBillingOnlyAvailabilityResponse(billingResultAttabal);
    }
}
