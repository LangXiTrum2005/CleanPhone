package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgwv implements Serializable {
    private static final zzgwv zza = new zzgwv(new int[0], 0, 0);
    private final int[] zzb;
    private final int zzc;

    private zzgwv(int[] iArr, int i2, int i3) {
        this.zzb = iArr;
        this.zzc = i3;
    }

    public static zzgwv zza() {
        return zza;
    }

    public static zzgwv zzb(int[] iArr) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        return new zzgwv(iArrCopyOf, 0, iArrCopyOf.length);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgwv)) {
            return false;
        }
        zzgwv zzgwvVar = (zzgwv) obj;
        int i2 = this.zzc;
        if (i2 != zzgwvVar.zzc) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (zzd(i3) != zzgwvVar.zzd(i3)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            iHashCode = (iHashCode * 31) + Integer.hashCode(this.zzb[i2]);
        }
        return iHashCode;
    }

    public final String toString() {
        int i2 = this.zzc;
        if (i2 == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i2 * 5);
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        int[] iArr = this.zzb;
        sb.append(iArr[0]);
        for (int i3 = 1; i3 < i2; i3++) {
            sb.append(", ");
            sb.append(iArr[i3]);
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    public final int zzc() {
        return this.zzc;
    }

    public final int zzd(int i2) {
        zzgqa.zzm(i2, this.zzc, "index");
        return this.zzb[i2];
    }
}
