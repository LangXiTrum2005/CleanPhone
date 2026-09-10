package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzgbn implements Comparable {
    final Runnable zza;
    final long zzb;

    public zzgbn(Runnable runnable, long j) {
        this.zza = runnable;
        this.zzb = j;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.zzb, ((zzgbn) obj).zzb);
    }
}
