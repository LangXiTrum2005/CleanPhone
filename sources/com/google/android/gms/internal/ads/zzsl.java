package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzsl {
    private final Context zza;
    private final zzpp zzb;
    private boolean zzc;
    private zzsk zzd;
    private zzqj zze;
    private zzsn zzf;
    private zzsi zzg;

    @Deprecated
    public zzsl() {
        this.zza = null;
        this.zzb = zzpp.zza;
    }

    public final zzss zza() {
        zzgqa.zzi(!this.zzc);
        this.zzc = true;
        if (this.zzf == null) {
            this.zzf = new zzsn(new zzco[0]);
        }
        if (this.zze == null) {
            if (this.zzg == null) {
                this.zzg = new zzsi(this.zza);
            }
            if (this.zzd == null) {
                this.zzd = zzsk.zza;
            }
            Context context = this.zza;
            zzsc zzscVar = new zzsc(context);
            zzscVar.zzb(context != null ? null : this.zzb);
            zzscVar.zzf(this.zzg);
            zzscVar.zza(this.zzd);
            this.zze = zzscVar.zzc();
        } else {
            zzgqa.zzi(this.zzg == null);
            zzgqa.zzi(this.zzd == null);
        }
        return new zzss(this, null);
    }

    public final /* synthetic */ Context zzb() {
        return this.zza;
    }

    public final /* synthetic */ zzqj zzc() {
        return this.zze;
    }

    public final /* synthetic */ zzsn zzd() {
        return this.zzf;
    }

    public zzsl(Context context) {
        this.zza = context;
        this.zzb = zzpp.zza;
    }
}
