package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.j3;
import com.google.android.gms.internal.play_billing.m3;
import com.google.android.gms.internal.play_billing.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AlternativeBillingOnlyInformationDialogListener f7248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f7249b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, Handler handler, AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {
        super(handler);
        this.f7248a = alternativeBillingOnlyInformationDialogListener;
        this.f7249b = aVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(i10);
        AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener = this.f7248a;
        if (i10 != 0) {
            a aVar = this.f7249b;
            if (bundle == null) {
                aVar.k(alternativeBillingOnlyInformationDialogListener, k.f7274h, j3.NULL_BUNDLE_IN_ALTERNATIVE_BILLING_ONLY_INFORMATION_DIALOG_RECEIVER, null);
                return;
            }
            builderNewBuilder.setDebugMessage(u.f(bundle, "BillingClient"));
            int i11 = bundle.getInt("INTERNAL_LOG_ERROR_REASON");
            j3 j3VarA = i11 != 0 ? j3.a(i11) : j3.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
            BillingResult billingResultBuild = builderNewBuilder.build();
            String string = bundle.getString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS");
            int i12 = zzcg.zza;
            aVar.m(zzcg.zzb(j3VarA, 16, billingResultBuild, string, m3.BROADCAST_ACTION_UNSPECIFIED));
        }
        alternativeBillingOnlyInformationDialogListener.onAlternativeBillingOnlyInformationDialogResponse(builderNewBuilder.build());
    }
}
