package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhdj extends zzhbf {
    private final String zza;
    private final zzhdi zzb;

    private zzhdj(String str, zzhdi zzhdiVar) {
        this.zza = str;
        this.zzb = zzhdiVar;
    }

    public static zzhdj zzb(String str, zzhdi zzhdiVar) {
        return new zzhdj(str, zzhdiVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhdj)) {
            return false;
        }
        zzhdj zzhdjVar = (zzhdj) obj;
        return zzhdjVar.zza.equals(this.zza) && zzhdjVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(zzhdj.class, this.zza, this.zzb);
    }

    public final String toString() {
        String string = this.zzb.toString();
        String str = this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 45 + string.length() + 1);
        androidx.media3.extractor.text.ttml.a.C(sb, "LegacyKmsAead Parameters (keyUri: ", str, ", variant: ", string);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhan
    public final boolean zza() {
        return this.zzb != zzhdi.zzb;
    }

    public final String zzc() {
        return this.zza;
    }

    public final zzhdi zzd() {
        return this.zzb;
    }
}
