package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzgry extends zzgux implements Serializable {
    final zzgpr zza;
    final zzgux zzb;

    public zzgry(zzgpr zzgprVar, zzgux zzguxVar) {
        this.zza = zzgprVar;
        this.zzb = zzguxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgux, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        zzgpr zzgprVar = this.zza;
        return this.zzb.compare(zzgprVar.apply(obj), zzgprVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgry) {
            zzgry zzgryVar = (zzgry) obj;
            if (this.zza.equals(zzgryVar.zza) && this.zzb.equals(zzgryVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        String string = this.zzb.toString();
        int length = string.length();
        String string2 = this.zza.toString();
        return androidx.media3.extractor.text.ttml.a.q(new StringBuilder(length + 12 + string2.length() + 1), string, ".onResultOf(", string2, ")");
    }
}
