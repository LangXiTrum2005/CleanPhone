package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
final class zzgqc implements Serializable, zzgqb {
    private final List zza;

    public final boolean equals(Object obj) {
        if (obj instanceof zzgqc) {
            return this.zza.equals(((zzgqc) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z2 = true;
        for (Object obj : this.zza) {
            if (!z2) {
                sb.append(AbstractJsonLexerKt.COMMA);
            }
            sb.append(obj);
            z2 = false;
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgqb
    public final boolean zza(Object obj) {
        int i2 = 0;
        while (true) {
            List list = this.zza;
            if (i2 >= list.size()) {
                return true;
            }
            if (!((zzgqb) list.get(i2)).zza(obj)) {
                return false;
            }
            i2++;
        }
    }
}
