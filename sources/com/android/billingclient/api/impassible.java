package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: com.android.billingclient:billing@@7.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class impassible extends com.google.android.gms.internal.play_billing.zzt {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final WeakReference f16516dern;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final ResultReceiver f16517wireman;

    public /* synthetic */ impassible(WeakReference weakReference, ResultReceiver resultReceiver, zzbr zzbrVar) {
        this.f16516dern = weakReference;
        this.f16517wireman = resultReceiver;
    }

    @Override // com.google.android.gms.internal.play_billing.zzu
    public final void zza(Bundle bundle) throws RemoteException {
        ResultReceiver resultReceiver = this.f16517wireman;
        if (resultReceiver == null) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Unable to send result for in-app messaging");
            return;
        }
        if (bundle == null) {
            resultReceiver.send(0, null);
            return;
        }
        Activity activity = (Activity) this.f16516dern.get();
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("KEY_LAUNCH_INTENT");
        if (activity == null || pendingIntent == null) {
            this.f16517wireman.send(0, null);
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Unable to launch intent for in-app messaging");
            return;
        }
        try {
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
            intent.putExtra("in_app_message_result_receiver", this.f16517wireman);
            intent.putExtra("IN_APP_MESSAGE_INTENT", pendingIntent);
            activity.startActivity(intent);
        } catch (CancellationException e) {
            this.f16517wireman.send(0, null);
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Exception caught while launching intent for in-app messaging.", e);
        }
    }
}
