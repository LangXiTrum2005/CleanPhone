package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import org.json.JSONException;

/* JADX INFO: compiled from: com.android.billingclient:billing@@7.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class taiyuan extends com.google.android.gms.internal.play_billing.zzi {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final BillingConfigResponseListener f16541dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final int f16542marial;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final kowloon f16543wireman;

    public /* synthetic */ taiyuan(BillingConfigResponseListener billingConfigResponseListener, kowloon kowloonVar, int i, zzbj zzbjVar) {
        this.f16541dern = billingConfigResponseListener;
        this.f16543wireman = kowloonVar;
        this.f16542marial = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzj
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            kowloon kowloonVar = this.f16543wireman;
            BillingResult billingResult = arytenoidectomy.f16447cutely;
            kowloonVar.wireman(zzcb.zza(63, 13, billingResult), this.f16542marial);
            this.f16541dern.onBillingConfigResponse(billingResult, null);
            return;
        }
        int iZzb = com.google.android.gms.internal.play_billing.zzb.zzb(bundle, "BillingClient");
        String strZzg = com.google.android.gms.internal.play_billing.zzb.zzg(bundle, "BillingClient");
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(iZzb);
        builderNewBuilder.setDebugMessage(strZzg);
        if (iZzb != 0) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "getBillingConfig() failed. Response code: " + iZzb);
            BillingResult billingResultBuild = builderNewBuilder.build();
            this.f16543wireman.wireman(zzcb.zza(23, 13, billingResultBuild), this.f16542marial);
            this.f16541dern.onBillingConfigResponse(billingResultBuild, null);
            return;
        }
        if (!bundle.containsKey("BILLING_CONFIG")) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "getBillingConfig() returned a bundle with neither an error nor a billing config response");
            builderNewBuilder.setResponseCode(6);
            BillingResult billingResultBuild2 = builderNewBuilder.build();
            this.f16543wireman.wireman(zzcb.zza(64, 13, billingResultBuild2), this.f16542marial);
            this.f16541dern.onBillingConfigResponse(billingResultBuild2, null);
            return;
        }
        try {
            this.f16541dern.onBillingConfigResponse(builderNewBuilder.build(), new BillingConfig(bundle.getString("BILLING_CONFIG")));
        } catch (JSONException e) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Got a JSON exception trying to decode BillingConfig. \n Exception: ", e);
            kowloon kowloonVar2 = this.f16543wireman;
            BillingResult billingResult2 = arytenoidectomy.f16447cutely;
            kowloonVar2.wireman(zzcb.zza(65, 13, billingResult2), this.f16542marial);
            this.f16541dern.onBillingConfigResponse(billingResult2, null);
        }
    }
}
