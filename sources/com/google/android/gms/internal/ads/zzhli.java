package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhli extends zzhll {
    private final int zza;
    private final int zzb;
    private final zzhlh zzc;
    private final zzhlg zzd;

    public /* synthetic */ zzhli(int i2, int i3, zzhlh zzhlhVar, zzhlg zzhlgVar, byte[] bArr) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = zzhlhVar;
        this.zzd = zzhlgVar;
    }

    public static zzhlf zzb() {
        return new zzhlf(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhli)) {
            return false;
        }
        zzhli zzhliVar = (zzhli) obj;
        return zzhliVar.zza == this.zza && zzhliVar.zze() == zze() && zzhliVar.zzc == this.zzc && zzhliVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzhli.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final String toString() {
        zzhlg zzhlgVar = this.zzd;
        String strValueOf = String.valueOf(this.zzc);
        String strValueOf2 = String.valueOf(zzhlgVar);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int i2 = this.zzb;
        int length3 = String.valueOf(i2).length();
        int i3 = this.zza;
        StringBuilder sb = new StringBuilder(length + 38 + length2 + 2 + length3 + 16 + String.valueOf(i3).length() + 10);
        androidx.media3.extractor.text.ttml.a.C(sb, "HMAC Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2);
        androidx.datastore.preferences.protobuf.a.z(sb, ", ", i2, "-byte tags, and ", i3);
        sb.append("-byte key)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhan
    public final boolean zza() {
        return this.zzc != zzhlh.zzd;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        zzhlh zzhlhVar = this.zzc;
        if (zzhlhVar == zzhlh.zzd) {
            return this.zzb;
        }
        if (zzhlhVar == zzhlh.zza || zzhlhVar == zzhlh.zzb || zzhlhVar == zzhlh.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzhlh zzf() {
        return this.zzc;
    }

    public final zzhlg zzg() {
        return this.zzd;
    }
}
