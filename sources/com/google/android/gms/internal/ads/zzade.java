package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzade implements zzadm {
    private final zzdp zza;
    private final zzdp zzb;
    private long zzc;

    public zzade(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        zzcw.zzd(length == length2);
        if (length2 <= 0 || jArr2[0] <= 0) {
            this.zza = new zzdp(length2);
            this.zzb = new zzdp(length2);
        } else {
            int i = length2 + 1;
            zzdp zzdpVar = new zzdp(i);
            this.zza = zzdpVar;
            zzdp zzdpVar2 = new zzdp(i);
            this.zzb = zzdpVar2;
            zzdpVar.zzc(0L);
            zzdpVar2.zzc(0L);
        }
        this.zza.zzd(jArr);
        this.zzb.zzd(jArr2);
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final zzadk zzg(long j) {
        zzdp zzdpVar = this.zzb;
        if (zzdpVar.zza() == 0) {
            zzadn zzadnVar = zzadn.zza;
            return new zzadk(zzadnVar, zzadnVar);
        }
        int iZzb = zzei.zzb(zzdpVar, j, true, true);
        zzadn zzadnVar2 = new zzadn(this.zzb.zzb(iZzb), this.zza.zzb(iZzb));
        if (zzadnVar2.zzb != j) {
            zzdp zzdpVar2 = this.zzb;
            if (iZzb != zzdpVar2.zza() - 1) {
                int i = iZzb + 1;
                return new zzadk(zzadnVar2, new zzadn(zzdpVar2.zzb(i), this.zza.zzb(i)));
            }
        }
        return new zzadk(zzadnVar2, zzadnVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final boolean zzh() {
        return this.zzb.zza() > 0;
    }
}
