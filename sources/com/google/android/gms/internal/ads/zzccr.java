package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzccr implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzcdt zzb;

    public zzccr(zzccs zzccsVar, Context context, zzcdt zzcdtVar) {
        this.zza = context;
        this.zzb = zzcdtVar;
        Objects.requireNonNull(zzccsVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzc(AdvertisingIdClient.getAdvertisingIdInfo(this.zza));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e2) {
            this.zzb.zzd(e2);
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception while getting advertising Id info", e2);
        }
    }
}
