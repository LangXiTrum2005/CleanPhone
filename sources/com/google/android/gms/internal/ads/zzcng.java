package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcng {
    private zzcli zza;
    private zzcod zzb;
    private zzfmy zzc;
    private zzcoq zzd;
    private zzfjn zze;

    private zzcng() {
        throw null;
    }

    public final zzcng zza(zzcli zzcliVar) {
        this.zza = zzcliVar;
        return this;
    }

    public final zzcng zzb(zzcod zzcodVar) {
        this.zzb = zzcodVar;
        return this;
    }

    public final zzclg zzc() {
        zzijo.zzc(this.zza, zzcli.class);
        zzijo.zzc(this.zzb, zzcod.class);
        if (this.zzc == null) {
            this.zzc = new zzfmy();
        }
        if (this.zzd == null) {
            this.zzd = new zzcoq();
        }
        if (this.zze == null) {
            this.zze = new zzfjn();
        }
        return new zzcmv(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public /* synthetic */ zzcng(byte[] bArr) {
    }
}
