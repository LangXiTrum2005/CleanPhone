package com.google.android.gms.internal.ads;

import com.applovin.impl.Z;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
final class zzfwi extends zzfwo {
    private final String zzb;
    private final int zzc;
    private final int zzd;

    public /* synthetic */ zzfwi(String str, boolean z2, int i2, zzfwg zzfwgVar, int i3, byte[] bArr) {
        this.zzb = str;
        this.zzc = i2;
        this.zzd = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfwo) {
            zzfwo zzfwoVar = (zzfwo) obj;
            if (this.zzb.equals(zzfwoVar.zza())) {
                zzfwoVar.zzb();
                int i2 = this.zzc;
                int iZzd = zzfwoVar.zzd();
                if (i2 == 0) {
                    throw null;
                }
                if (i2 == iZzd) {
                    zzfwoVar.zzc();
                    int i3 = this.zzd;
                    int iZze = zzfwoVar.zze();
                    if (i3 == 0) {
                        throw null;
                    }
                    if (iZze == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzb.hashCode() ^ 1000003;
        int i2 = this.zzc;
        if (i2 == 0) {
            throw null;
        }
        int i3 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i2;
        if (this.zzd != 0) {
            return (i3 * (-721379959)) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        String str;
        int i2 = this.zzc;
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
        if (this.zzd == 1) {
            str2 = "READ_AND_WRITE";
        }
        String str3 = this.zzb;
        StringBuilder sb = new StringBuilder(str2.length() + Z.d(str, String.valueOf(str3).length() + 73, 52) + 1);
        androidx.media3.extractor.text.ttml.a.C(sb, "FileComplianceOptions{fileOwner=", str3, ", hasDifferentDmaOwner=false, fileChecks=", str);
        return android.support.v4.media.a.s(sb, ", multipleProductIdGroupsResolver=null, filePurpose=", str2, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzfwo
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfwo
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfwo
    public final zzfwg zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfwo
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfwo
    public final int zze() {
        return this.zzd;
    }
}
