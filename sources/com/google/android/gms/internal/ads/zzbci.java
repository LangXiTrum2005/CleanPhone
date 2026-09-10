package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbci extends BroadcastReceiver {
    final /* synthetic */ zzbcm zza;

    public zzbci(zzbcm zzbcmVar) {
        Objects.requireNonNull(zzbcmVar);
        this.zza = zzbcmVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zza.zzg(3);
    }
}
