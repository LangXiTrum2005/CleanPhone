package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbfd implements BaseGmsClient.BaseConnectionCallbacks {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzbev zza;
    final /* synthetic */ zzcdt zzb;
    final /* synthetic */ zzbff zzc;

    public zzbfd(zzbff zzbffVar, zzbev zzbevVar, zzcdt zzcdtVar) {
        this.zza = zzbevVar;
        this.zzb = zzcdtVar;
        Objects.requireNonNull(zzbffVar);
        this.zzc = zzbffVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzbff zzbffVar = this.zzc;
        synchronized (zzbffVar.zzf()) {
            try {
                if (zzbffVar.zzd()) {
                    return;
                }
                zzbffVar.zze(true);
                final zzbeu zzbeuVarZzc = zzbffVar.zzc();
                if (zzbeuVarZzc == null) {
                    return;
                }
                zzgyw zzgywVar = zzcdo.zza;
                final zzbev zzbevVar = this.zza;
                final zzcdt zzcdtVar = this.zzb;
                final ListenableFuture listenableFutureSubmit = zzgywVar.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbfc
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzcdt zzcdtVar2 = zzcdtVar;
                        zzbeu zzbeuVar = zzbeuVarZzc;
                        zzbfd zzbfdVar = this.zza;
                        try {
                            zzbex zzbexVarZzq = zzbeuVar.zzq();
                            boolean zZzp = zzbeuVar.zzp();
                            zzbev zzbevVar2 = zzbevVar;
                            zzbes zzbesVarZzf = zZzp ? zzbexVarZzq.zzf(zzbevVar2) : zzbexVarZzq.zze(zzbevVar2);
                            if (!zzbesVarZzf.zza()) {
                                zzcdtVar2.zzd(new RuntimeException("No entry contents."));
                                zzbfdVar.zzc.zzb();
                                return;
                            }
                            zzbfa zzbfaVar = new zzbfa(zzbfdVar, zzbesVarZzf.zzb(), 1);
                            int i2 = zzbfaVar.read();
                            if (i2 == -1) {
                                throw new IOException("Unable to read from cache.");
                            }
                            zzbfaVar.unread(i2);
                            zzcdtVar2.zzc(zzbfh.zza(zzbfaVar, zzbesVarZzf.zzd(), zzbesVarZzf.zzg(), zzbesVarZzf.zzf(), zzbesVarZzf.zze()));
                        } catch (RemoteException e2) {
                            e = e2;
                            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to obtain a cache service instance.", e);
                            zzcdtVar2.zzd(e);
                            zzbfdVar.zzc.zzb();
                        } catch (IOException e3) {
                            e = e3;
                            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to obtain a cache service instance.", e);
                            zzcdtVar2.zzd(e);
                            zzbfdVar.zzc.zzb();
                        }
                    }
                });
                zzcdtVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbfb
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        if (zzcdtVar.isCancelled()) {
                            listenableFutureSubmit.cancel(true);
                        }
                    }
                }, zzcdo.zzg);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i2) {
    }
}
