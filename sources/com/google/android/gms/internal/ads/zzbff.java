package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbff {
    private zzbeu zza;
    private boolean zzb;
    private final Context zzc;
    private final Object zzd = new Object();

    public zzbff(Context context) {
        this.zzc = context;
    }

    public final Future zza(zzbev zzbevVar) {
        zzbez zzbezVar = new zzbez(this);
        zzbfd zzbfdVar = new zzbfd(this, zzbevVar, zzbezVar);
        zzbfe zzbfeVar = new zzbfe(this, zzbezVar);
        synchronized (this.zzd) {
            zzbeu zzbeuVar = new zzbeu(this.zzc, com.google.android.gms.ads.internal.zzt.zzs().zza(), zzbfdVar, zzbfeVar);
            this.zza = zzbeuVar;
            zzbeuVar.checkAvailabilityAndConnect();
        }
        return zzbezVar;
    }

    public final /* synthetic */ void zzb() {
        synchronized (this.zzd) {
            try {
                zzbeu zzbeuVar = this.zza;
                if (zzbeuVar == null) {
                    return;
                }
                zzbeuVar.disconnect();
                this.zza = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ zzbeu zzc() {
        return this.zza;
    }

    public final /* synthetic */ boolean zzd() {
        return this.zzb;
    }

    public final /* synthetic */ void zze(boolean z2) {
        this.zzb = true;
    }

    public final /* synthetic */ Object zzf() {
        return this.zzd;
    }
}
