package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhdt extends zzhbf {
    private final zzhds zza;
    private final String zzb;
    private final zzhdr zzc;
    private final zzhbf zzd;

    public /* synthetic */ zzhdt(zzhds zzhdsVar, String str, zzhdr zzhdrVar, zzhbf zzhbfVar, byte[] bArr) {
        this.zza = zzhdsVar;
        this.zzb = str;
        this.zzc = zzhdrVar;
        this.zzd = zzhbfVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhdt)) {
            return false;
        }
        zzhdt zzhdtVar = (zzhdt) obj;
        return zzhdtVar.zzc.equals(this.zzc) && zzhdtVar.zzd.equals(this.zzd) && zzhdtVar.zzb.equals(this.zzb) && zzhdtVar.zza.equals(this.zza);
    }

    public final int hashCode() {
        return Objects.hash(zzhdt.class, this.zzb, this.zzc, this.zzd, this.zza);
    }

    public final String toString() {
        zzhds zzhdsVar = this.zza;
        zzhbf zzhbfVar = this.zzd;
        String strValueOf = String.valueOf(this.zzc);
        String strValueOf2 = String.valueOf(zzhbfVar);
        String strValueOf3 = String.valueOf(zzhdsVar);
        String str = this.zzb;
        int length = String.valueOf(str).length();
        int length2 = strValueOf.length();
        StringBuilder sb = new StringBuilder(length + 64 + length2 + 27 + strValueOf2.length() + 11 + strValueOf3.length() + 1);
        androidx.media3.extractor.text.ttml.a.C(sb, "LegacyKmsEnvelopeAead Parameters (kekUri: ", str, ", dekParsingStrategy: ", strValueOf);
        androidx.media3.extractor.text.ttml.a.C(sb, ", dekParametersForNewKeys: ", strValueOf2, ", variant: ", strValueOf3);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhan
    public final boolean zza() {
        return this.zza != zzhds.zzb;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final zzhds zzc() {
        return this.zza;
    }

    public final zzhbf zzd() {
        return this.zzd;
    }
}
