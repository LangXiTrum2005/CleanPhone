package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class zzcqz implements zzegr {
    protected final zzfca zza;
    protected final zzfbo zzb;
    private final zzcws zzc;
    private final zzcxf zzd;

    @Nullable
    private final zzezc zze;
    private final zzcvm zzf;
    private final zzdac zzg;
    private final zzcxj zzh;
    private final zzddh zzi;

    public zzcqz(zzcqy zzcqyVar) {
        this.zza = zzcqyVar.zza;
        this.zzb = zzcqyVar.zzb;
        this.zzc = zzcqyVar.zzc;
        this.zzd = zzcqyVar.zzd;
        this.zze = zzcqyVar.zze;
        this.zzf = zzcqyVar.zzf;
        this.zzg = zzcqyVar.zzg;
        this.zzh = zzcqyVar.zzh;
        this.zzi = zzcqyVar.zzi;
    }

    public void zzb() {
        this.zzc.zza(null);
    }

    public void zzk() {
        this.zzd.zzs();
        this.zzh.zza(this);
    }

    public final zzcvm zzm() {
        return this.zzf;
    }

    public final zzcws zzn() {
        return this.zzc;
    }

    public final zzczz zzo() {
        return this.zzg.zzi();
    }

    @Nullable
    public final zzezc zzp() {
        return this.zze;
    }

    public final zzfca zzq() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzegr
    public final void zzr() {
        this.zzi.zzt();
    }

    public final boolean zzs() {
        return this.zzb.zzaq;
    }
}
