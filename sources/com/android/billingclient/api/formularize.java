package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.play_billing.zzo;

/* JADX INFO: compiled from: com.android.billingclient:billing@@7.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class formularize extends zzo {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final ExternalOfferAvailabilityListener f16510dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final int f16511marial;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final kowloon f16512wireman;

    public /* synthetic */ formularize(ExternalOfferAvailabilityListener externalOfferAvailabilityListener, kowloon kowloonVar, int i, zzbp zzbpVar) {
        this.f16510dern = externalOfferAvailabilityListener;
        this.f16512wireman = kowloonVar;
        this.f16511marial = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzp
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            kowloon kowloonVar = this.f16512wireman;
            BillingResult billingResult = arytenoidectomy.f16447cutely;
            kowloonVar.wireman(zzcb.zza(92, 23, billingResult), this.f16511marial);
            this.f16510dern.onExternalOfferAvailabilityResponse(billingResult);
            return;
        }
        int iZzb = com.google.android.gms.internal.play_billing.zzb.zzb(bundle, "BillingClient");
        BillingResult billingResultAttabal = arytenoidectomy.attabal(iZzb, com.google.android.gms.internal.play_billing.zzb.zzg(bundle, "BillingClient"));
        if (iZzb != 0) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "isExternalOfferAvailableAsync() failed. Response code: " + iZzb);
            this.f16512wireman.wireman(zzcb.zza(23, 23, billingResultAttabal), this.f16511marial);
        }
        this.f16510dern.onExternalOfferAvailabilityResponse(billingResultAttabal);
    }
}
