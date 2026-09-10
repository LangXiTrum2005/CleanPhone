package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: com.android.billingclient:billing@@7.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class cutely extends com.google.android.gms.internal.play_billing.zzk {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final WeakReference f16505dern;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final ResultReceiver f16506wireman;

    public /* synthetic */ cutely(WeakReference weakReference, ResultReceiver resultReceiver, zzbl zzblVar) {
        this.f16505dern = weakReference;
        this.f16506wireman = resultReceiver;
    }

    @Override // com.google.android.gms.internal.play_billing.zzl
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            this.f16506wireman.send(6, null);
            return;
        }
        if (!bundle.containsKey("RESPONSE_CODE")) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Response bundle doesn't contain a response code");
            this.f16506wireman.send(6, bundle);
            return;
        }
        int iZzb = com.google.android.gms.internal.play_billing.zzb.zzb(bundle, "BillingClient");
        if (iZzb != 0) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Unable to launch intent for external offer dialog" + iZzb);
            this.f16506wireman.send(iZzb, bundle);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("EXTERNAL_PAYMENT_DIALOG_INTENT");
        if (pendingIntent == null) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "The PendingIntent for the external offer dialog is null");
            Bundle bundle2 = new Bundle();
            bundle2.putInt("RESPONSE_CODE", 6);
            bundle2.putString("DEBUG_MESSAGE", "An internal error occurred.");
            this.f16506wireman.send(6, bundle2);
            return;
        }
        try {
            Activity activity = (Activity) this.f16505dern.get();
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivityV2.class);
            intent.putExtra("external_payment_dialog_result_receiver", this.f16506wireman);
            intent.putExtra("external_payment_dialog_pending_intent", pendingIntent);
            activity.startActivity(intent);
        } catch (RuntimeException e) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Runtime error while launching intent for the external offer dialog.", e);
            Bundle bundle3 = new Bundle();
            bundle3.putInt("RESPONSE_CODE", 6);
            bundle3.putString("DEBUG_MESSAGE", "An internal error occurred.");
            bundle3.putInt("INTERNAL_LOG_ERROR_REASON", 98);
            bundle3.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", String.format("%s: %s", e.getClass().getName(), com.google.android.gms.internal.play_billing.zzab.zzb(e.getMessage())));
            this.f16506wireman.send(6, bundle3);
        }
    }
}
