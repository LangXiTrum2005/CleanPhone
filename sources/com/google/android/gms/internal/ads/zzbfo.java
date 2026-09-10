package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbfo {
    zzbcg zza;
    boolean zzb;
    private final ExecutorService zzc;

    public zzbfo() {
        this.zzc = com.google.android.gms.ads.internal.util.client.zzb.zzb;
    }

    public final /* synthetic */ ExecutorService zza() {
        return this.zzc;
    }

    public zzbfo(final Context context) {
        ExecutorService executorService = com.google.android.gms.ads.internal.util.client.zzb.zzb;
        this.zzc = executorService;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbfk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfY)).booleanValue();
                Context context2 = context;
                zzbfo zzbfoVar = this.zza;
                if (zBooleanValue) {
                    try {
                        zzbfoVar.zza = (zzbcg) com.google.android.gms.ads.internal.util.client.zzs.zza(context2, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", zzbfl.zza);
                        zzbfoVar.zza.zze(ObjectWrapper.wrap(context2), "GMA_SDK");
                        zzbfoVar.zzb = true;
                    } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException unused) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzd("Cannot dynamite load clearcut");
                    }
                }
            }
        });
    }
}
