package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeds extends zzedq {
    private final Context zzg;
    private final Executor zzh;

    public zzeds(Context context, Executor executor) {
        this.zzg = context;
        this.zzh = executor;
        this.zzf = new zzbyc(context, com.google.android.gms.ads.internal.zzt.zzs().zza(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            try {
                if (!this.zzd) {
                    this.zzd = true;
                    try {
                        this.zzf.zzp().zzf(this.zze, ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzop)).booleanValue() ? new zzedp(this.zza, this.zze) : new zzedo(this));
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.zza.zzd(new zzeef(1));
                    } catch (Throwable th) {
                        com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "RemoteSignalsClientTask.onConnected");
                        this.zza.zzd(new zzeef(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final ListenableFuture zza(zzbza zzbzaVar) {
        synchronized (this.zzb) {
            try {
                if (this.zzc) {
                    return this.zza;
                }
                this.zzc = true;
                this.zze = zzbzaVar;
                this.zzf.checkAvailabilityAndConnect();
                zzcdt zzcdtVar = this.zza;
                zzcdtVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedr
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzb();
                    }
                }, zzcdo.zzg);
                zzedq.zzc(this.zzg, zzcdtVar, this.zzh);
                return zzcdtVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
