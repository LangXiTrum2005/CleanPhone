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
public final class impromptu extends com.google.android.gms.internal.play_billing.zzg {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final WeakReference f16518dern;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final ResultReceiver f16519wireman;

    public /* synthetic */ impromptu(WeakReference weakReference, ResultReceiver resultReceiver, zzbh zzbhVar) {
        this.f16518dern = weakReference;
        this.f16519wireman = resultReceiver;
    }

    @Override // com.google.android.gms.internal.play_billing.zzh
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            this.f16519wireman.send(6, null);
            return;
        }
        if (!bundle.containsKey("RESPONSE_CODE")) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Response bundle doesn't contain a response code");
            this.f16519wireman.send(6, bundle);
            return;
        }
        int iZzb = com.google.android.gms.internal.play_billing.zzb.zzb(bundle, "BillingClient");
        if (iZzb != 0) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Unable to launch intent for alternative billing only dialog" + iZzb);
            this.f16519wireman.send(iZzb, bundle);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
        if (pendingIntent == null) {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "User has acknowledged the alternative billing only dialog before.");
            this.f16519wireman.send(0, bundle);
            return;
        }
        try {
            Activity activity = (Activity) this.f16518dern.get();
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivityV2.class);
            intent.putExtra("alternative_billing_only_dialog_result_receiver", this.f16519wireman);
            intent.putExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT", pendingIntent);
            activity.startActivity(intent);
        } catch (RuntimeException e) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Runtime error while launching intent for alternative billing only dialog.", e);
            Bundle bundle2 = new Bundle();
            bundle2.putInt("RESPONSE_CODE", 6);
            bundle2.putString("DEBUG_MESSAGE", "An internal error occurred.");
            bundle2.putInt("INTERNAL_LOG_ERROR_REASON", 75);
            bundle2.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", String.format("%s: %s", e.getClass().getName(), com.google.android.gms.internal.play_billing.zzab.zzb(e.getMessage())));
            this.f16519wireman.send(6, bundle2);
        }
    }
}
