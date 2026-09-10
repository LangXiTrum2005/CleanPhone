package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class zzber {
    private ScheduledFuture zza = null;
    private final Runnable zzb = new zzben(this);
    private final Object zzc = new Object();
    private zzbeu zzd;
    private Context zze;
    private zzbex zzf;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final void zzf() {
        synchronized (this.zzc) {
            try {
                if (this.zze != null && this.zzd == null) {
                    zzbeu zzbeuVarZze = zze(new zzbep(this), new zzbeq(this));
                    this.zzd = zzbeuVarZze;
                    zzbeuVarZze.checkAvailabilityAndConnect();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zza(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.zzc) {
            try {
                if (this.zze != null) {
                    return;
                }
                this.zze = context.getApplicationContext();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfd)).booleanValue()) {
                    zzf();
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfc)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzt.zzg().zzb(new zzbeo(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfe)).booleanValue()) {
            synchronized (this.zzc) {
                try {
                    zzf();
                    ScheduledFuture scheduledFuture = this.zza;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.zza = zzcdo.zzd.schedule(this.zzb, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzff)).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final zzbes zzc(zzbev zzbevVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return new zzbes();
            }
            try {
                if (this.zzd.zzp()) {
                    return this.zzf.zzf(zzbevVar);
                }
                return this.zzf.zze(zzbevVar);
            } catch (RemoteException e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to call into cache service.", e2);
                return new zzbes();
            }
        }
    }

    public final long zzd(zzbev zzbevVar) {
        synchronized (this.zzc) {
            try {
                if (this.zzf == null) {
                    return -2L;
                }
                if (this.zzd.zzp()) {
                    try {
                        return this.zzf.zzg(zzbevVar);
                    } catch (RemoteException e2) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to call into cache service.", e2);
                    }
                }
                return -2L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized zzbeu zze(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new zzbeu(this.zze, com.google.android.gms.ads.internal.zzt.zzs().zza(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }

    public final /* synthetic */ void zzg() {
        synchronized (this.zzc) {
            try {
                zzbeu zzbeuVar = this.zzd;
                if (zzbeuVar == null) {
                    return;
                }
                if (zzbeuVar.isConnected() || this.zzd.isConnecting()) {
                    this.zzd.disconnect();
                }
                this.zzd = null;
                this.zzf = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ Object zzh() {
        return this.zzc;
    }

    public final /* synthetic */ zzbeu zzi() {
        return this.zzd;
    }

    public final /* synthetic */ void zzj(zzbeu zzbeuVar) {
        this.zzd = null;
    }

    public final /* synthetic */ void zzk(zzbex zzbexVar) {
        this.zzf = zzbexVar;
    }
}
