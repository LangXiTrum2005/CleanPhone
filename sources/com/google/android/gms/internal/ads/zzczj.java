package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class zzczj implements com.google.android.gms.ads.internal.overlay.zzr {
    private final zzfic zzc;
    private final zzfhr zzd;
    private final Clock zze;
    private final zzdxe zzf;
    private final ScheduledExecutorService zzg;
    private final Object zzb = new Object();
    final zzfoi zza = zzfoj.zza();
    private boolean zzh = false;
    private boolean zzi = false;

    public zzczj(zzfic zzficVar, zzfhr zzfhrVar, Clock clock, zzdxe zzdxeVar, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = zzficVar;
        this.zzd = zzfhrVar;
        this.zze = clock;
        this.zzf = zzdxeVar;
        this.zzg = scheduledExecutorService;
    }

    private final void zzn() {
        synchronized (this.zzb) {
            try {
                zzdxe zzdxeVar = this.zzf;
                String str = this.zzc.zzb.zzb.zzb;
                String strEncodeToString = Base64.encodeToString(((zzfoj) this.zza.zzbu()).zzaN(), 1);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzok)).booleanValue()) {
                    zzdxd zzdxdVarZza = zzdxeVar.zza();
                    zzdxdVarZza.zzc("action", "pclma");
                    zzdxdVarZza.zzc("pclmd", strEncodeToString);
                    zzdxdVarZza.zzc("gqi", str);
                    zzdxdVarZza.zzf();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void zzo(int i2) {
        synchronized (this.zzb) {
            try {
                if (!this.zzi && this.zzh) {
                    zzfoi zzfoiVar = this.zza;
                    zzfnc zzfncVarZza = zzfnd.zza();
                    zzfncVarZza.zzb(i2);
                    zzfncVarZza.zza(this.zze.currentTimeMillis());
                    zzfoiVar.zza((zzfnd) zzfncVarZza.zzbu());
                    if (i2 == 10) {
                        zzn();
                        this.zzi = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdS() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdT(int i2) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
        zzo(3);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        zzo(5);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
        zzo(4);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
        zzo(7);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
        zzo(8);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
        zzo(6);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
        zzo(9);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
        zzo(10);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
    }

    public final void zzl() {
        synchronized (this.zzb) {
            if (this.zzd.zzaE > 0 && !this.zzh) {
                this.zza.zzb(this.zze.currentTimeMillis());
                this.zzh = true;
                this.zzg.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzczi
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzm();
                    }
                }, this.zzd.zzaE, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final /* synthetic */ void zzm() {
        synchronized (this.zzb) {
            try {
                if (this.zzi) {
                    return;
                }
                this.zzi = true;
                zzn();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
