package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzaix implements Comparable {
    private final long zza;
    private final long zzb;
    private final long zzc;

    public /* synthetic */ zzaix(long j, long j2, long j3, byte[] bArr) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = j3;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.zza, ((zzaix) obj).zza);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaix)) {
            return false;
        }
        zzaix zzaixVar = (zzaix) obj;
        return this.zza == zzaixVar.zza && this.zzb == zzaixVar.zzb && this.zzc == zzaixVar.zzc;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.zza), Long.valueOf(this.zzb), Long.valueOf(this.zzc));
    }

    public final /* synthetic */ long zza() {
        return this.zza;
    }

    public final /* synthetic */ long zzb() {
        return this.zzb;
    }

    public final /* synthetic */ long zzc() {
        return this.zzc;
    }
}
