package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzann implements Comparable {
    public final int zza;
    public final zzani zzb;

    public zzann(int i2, zzani zzaniVar) {
        this.zza = i2;
        this.zzb = zzaniVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.zza, ((zzann) obj).zza);
    }
}
