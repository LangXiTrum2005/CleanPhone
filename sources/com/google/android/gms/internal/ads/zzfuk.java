package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzfuk extends zzfuh {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private final long zze;

    public /* synthetic */ zzfuk(String str, boolean z2, boolean z3, boolean z4, long j, boolean z5, long j2, byte[] bArr) {
        this.zza = str;
        this.zzb = z2;
        this.zzc = z3;
        this.zzd = j;
        this.zze = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfuh) {
            zzfuh zzfuhVar = (zzfuh) obj;
            if (this.zza.equals(zzfuhVar.zza()) && this.zzb == zzfuhVar.zzb() && this.zzc == zzfuhVar.zzc()) {
                zzfuhVar.zzd();
                if (this.zzd == zzfuhVar.zze()) {
                    zzfuhVar.zzf();
                    if (this.zze == zzfuhVar.zzg()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.zzb ? 1237 : 1231)) * 1000003) ^ (true != this.zzc ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.zzd)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.zze);
    }

    public final String toString() {
        boolean z2 = this.zzb;
        int length = String.valueOf(z2).length();
        boolean z3 = this.zzc;
        int length2 = String.valueOf(z3).length();
        long j = this.zzd;
        int length3 = String.valueOf(j).length();
        long j2 = this.zze;
        int length4 = String.valueOf(j2).length();
        String str = this.zza;
        StringBuilder sb = new StringBuilder(str.length() + 56 + length + 32 + length2 + 57 + length3 + 61 + length4 + 1);
        sb.append("AdShield2Options{clientVersion=");
        sb.append(str);
        sb.append(", shouldGetAdvertisingId=");
        sb.append(z2);
        sb.append(", isGooglePlayServicesAvailable=");
        sb.append(z3);
        sb.append(", enableQuerySignalsTimeout=false, querySignalsTimeoutMs=");
        sb.append(j);
        sb.append(", enableQuerySignalsCache=false, querySignalsCacheTtlSeconds=");
        sb.append(j2);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfuh
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfuh
    public final boolean zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfuh
    public final boolean zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfuh
    public final boolean zzd() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfuh
    public final long zze() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfuh
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfuh
    public final long zzg() {
        return this.zze;
    }
}
