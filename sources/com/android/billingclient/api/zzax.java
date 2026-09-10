package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.zzgj;

/* JADX INFO: compiled from: com.android.billingclient:billing@@7.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzax extends ResultReceiver {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final /* synthetic */ attabal f16550arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final /* synthetic */ AlternativeBillingOnlyInformationDialogListener f16551kowloon;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzax(attabal attabalVar, Handler handler, AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {
        super(handler);
        this.f16551kowloon = alternativeBillingOnlyInformationDialogListener;
        this.f16550arytenoidectomy = attabalVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(i);
        if (i != 0) {
            if (bundle == null) {
                attabal attabalVar = this.f16550arytenoidectomy;
                BillingResult billingResult = arytenoidectomy.f16447cutely;
                attabalVar.walach(zzcb.zza(73, 16, billingResult));
                this.f16551kowloon.onAlternativeBillingOnlyInformationDialogResponse(billingResult);
                return;
            }
            builderNewBuilder.setDebugMessage(com.google.android.gms.internal.play_billing.zzb.zzg(bundle, "BillingClient"));
            int i2 = bundle.getInt("INTERNAL_LOG_ERROR_REASON");
            this.f16550arytenoidectomy.walach(zzcb.zzb(i2 != 0 ? zzgj.zza(i2) : 23, 16, builderNewBuilder.build(), bundle.getString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS")));
        }
        this.f16551kowloon.onAlternativeBillingOnlyInformationDialogResponse(builderNewBuilder.build());
    }
}
