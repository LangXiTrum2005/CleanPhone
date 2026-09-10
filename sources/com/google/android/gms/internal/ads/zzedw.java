package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class zzedw extends zzedq {
    private String zzg;
    private int zzh = 1;

    public zzedw(Context context) {
        this.zzf = new zzbyc(context, com.google.android.gms.ads.internal.zzt.zzs().zza(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            try {
                if (!this.zzd) {
                    this.zzd = true;
                    try {
                        int i2 = this.zzh;
                        if (i2 == 2) {
                            this.zzf.zzp().zzg(this.zze, ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzop)).booleanValue() ? new zzedp(this.zza, this.zze) : new zzedo(this));
                        } else if (i2 == 3) {
                            this.zzf.zzp().zzh(this.zzg, ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzop)).booleanValue() ? new zzedp(this.zza, this.zze) : new zzedo(this));
                        } else {
                            this.zza.zzd(new zzeef(1));
                        }
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.zza.zzd(new zzeef(1));
                    } catch (Throwable th) {
                        com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                        this.zza.zzd(new zzeef(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzedq, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Cannot connect to remote service, fallback to local instance.");
        this.zza.zzd(new zzeef(1));
    }

    public final ListenableFuture zza(zzbza zzbzaVar) {
        synchronized (this.zzb) {
            try {
                int i2 = this.zzh;
                if (i2 != 1 && i2 != 2) {
                    return zzgym.zzc(new zzeef(2));
                }
                if (this.zzc) {
                    return this.zza;
                }
                this.zzh = 2;
                this.zzc = true;
                this.zze = zzbzaVar;
                this.zzf.checkAvailabilityAndConnect();
                zzcdt zzcdtVar = this.zza;
                zzcdtVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedv
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzb();
                    }
                }, zzcdo.zzg);
                return zzcdtVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ListenableFuture zzd(String str) {
        synchronized (this.zzb) {
            try {
                int i2 = this.zzh;
                if (i2 != 1 && i2 != 3) {
                    return zzgym.zzc(new zzeef(2));
                }
                if (this.zzc) {
                    return this.zza;
                }
                this.zzh = 3;
                this.zzc = true;
                this.zzg = str;
                this.zzf.checkAvailabilityAndConnect();
                zzcdt zzcdtVar = this.zza;
                zzcdtVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedu
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzb();
                    }
                }, zzcdo.zzg);
                return zzcdtVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
