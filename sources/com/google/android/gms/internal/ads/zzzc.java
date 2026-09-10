package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzzc extends zzzm implements Comparable {
    private final int zze;
    private final int zzf;

    public zzzc(int i2, zzbg zzbgVar, int i3, zzzf zzzfVar, int i4) {
        super(i2, zzbgVar, i3);
        this.zze = zzmk.zzaa(i4, zzzfVar.zzV) ? 1 : 0;
        this.zzf = this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzzm
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzzc zzzcVar) {
        return Integer.compare(this.zzf, zzzcVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzzm
    public final /* bridge */ /* synthetic */ boolean zzc(zzzm zzzmVar) {
        return false;
    }
}
