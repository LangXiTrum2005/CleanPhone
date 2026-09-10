package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* JADX INFO: loaded from: classes4.dex */
public final class zzabu {
    private final Context zza;
    private boolean zzb;
    private zzus zzc = zzus.zzb;
    private final zzue zzd;
    private Handler zze;
    private zzadg zzf;

    public zzabu(Context context) {
        this.zza = context;
        this.zzd = new zzty(context, null, null);
    }

    public final zzabu zza(zzus zzusVar) {
        this.zzc = zzusVar;
        return this;
    }

    public final zzabu zzb(Handler handler) {
        this.zze = handler;
        return this;
    }

    public final zzabu zzc(zzadg zzadgVar) {
        this.zzf = zzadgVar;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0010  */
    public final zzabw zzd() {
        boolean z2;
        zzgqa.zzi(!this.zzb);
        Handler handler = this.zze;
        if (handler == null && this.zzf == null) {
            z2 = true;
        } else {
            z2 = false;
            if (handler != null && this.zzf != null) {
                z2 = true;
            }
        }
        zzgqa.zzi(z2);
        this.zzb = true;
        return new zzabw(this);
    }

    public final /* synthetic */ Context zze() {
        return this.zza;
    }

    public final /* synthetic */ zzus zzf() {
        return this.zzc;
    }

    public final /* synthetic */ zzue zzg() {
        return this.zzd;
    }

    public final /* synthetic */ Handler zzh() {
        return this.zze;
    }

    public final /* synthetic */ zzadg zzi() {
        return this.zzf;
    }
}
