package com.google.android.gms.internal.measurement;

import androidx.media3.extractor.text.ttml.a;
import com.applovin.impl.Z;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
final class zzbu extends zzca {
    private final String zzc;
    private final int zzd;
    private final int zze;

    public /* synthetic */ zzbu(String str, boolean z2, int i2, zzbr zzbrVar, zzbs zzbsVar, int i3, byte[] bArr) {
        this.zzc = str;
        this.zzd = i2;
        this.zze = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzca) {
            zzca zzcaVar = (zzca) obj;
            if (this.zzc.equals(zzcaVar.zza())) {
                zzcaVar.zzb();
                int i2 = this.zzd;
                int iZze = zzcaVar.zze();
                if (i2 == 0) {
                    throw null;
                }
                if (i2 == iZze) {
                    zzcaVar.zzc();
                    zzcaVar.zzd();
                    int i3 = this.zze;
                    int iZzf = zzcaVar.zzf();
                    if (i3 == 0) {
                        throw null;
                    }
                    if (iZzf == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzc.hashCode() ^ 1000003;
        int i2 = this.zzd;
        if (i2 == 0) {
            throw null;
        }
        int i3 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i2;
        if (this.zze != 0) {
            return (i3 * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        String str;
        int i2 = this.zzd;
        String str2 = AbstractJsonLexerKt.NULL;
        if (i2 == 1) {
            str = "ALL_CHECKS";
        } else if (i2 == 2) {
            str = "SKIP_COMPLIANCE_CHECK";
        } else if (i2 != 3) {
            str = i2 != 4 ? AbstractJsonLexerKt.NULL : "NO_CHECKS";
        } else {
            str = "SKIP_SECURITY_CHECK";
        }
        if (this.zze == 1) {
            str2 = "READ_AND_WRITE";
        }
        String str3 = this.zzc;
        StringBuilder sb = new StringBuilder(str2.length() + Z.d(str, String.valueOf(str3).length() + 73, 91) + 1);
        a.C(sb, "FileComplianceOptions{fileOwner=", str3, ", hasDifferentDmaOwner=false, fileChecks=", str);
        return android.support.v4.media.a.s(sb, ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=", str2, "}");
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final String zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final zzbr zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final zzbs zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final int zze() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final int zzf() {
        return this.zze;
    }
}
