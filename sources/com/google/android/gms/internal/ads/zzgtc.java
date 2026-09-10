package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzgtc extends zzgtd {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzgtd zzc;

    public zzgtc(zzgtd zzgtdVar, int i2, int i3) {
        Objects.requireNonNull(zzgtdVar);
        this.zzc = zzgtdVar;
        this.zza = i2;
        this.zzb = i3;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        zzgqa.zzm(i2, this.zzb, "index");
        return this.zzc.get(i2 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgsz
    public final Object[] zzb() {
        return this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgsz
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgsz
    public final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgsz
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgtd, java.util.List
    /* JADX INFO: renamed from: zzh */
    public final zzgtd subList(int i2, int i3) {
        zzgqa.zzo(i2, i3, this.zzb);
        int i4 = this.zza;
        return this.zzc.subList(i2 + i4, i3 + i4);
    }
}
