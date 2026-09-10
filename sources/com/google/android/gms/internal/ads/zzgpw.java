package com.google.android.gms.internal.ads;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgpw {
    private final String zza;
    private final zzgpv zzb;
    private zzgpv zzc;

    public /* synthetic */ zzgpw(String str, byte[] bArr) {
        zzgpv zzgpvVar = new zzgpv();
        this.zzb = zzgpvVar;
        this.zzc = zzgpvVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.zza);
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        zzgpv zzgpvVar = this.zzb.zzb;
        String str = "";
        while (zzgpvVar != null) {
            Object obj = zzgpvVar.zza;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            zzgpvVar = zzgpvVar.zzb;
            str = ", ";
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public final zzgpw zza(Object obj) {
        zzgpv zzgpvVar = new zzgpv();
        this.zzc.zzb = zzgpvVar;
        this.zzc = zzgpvVar;
        zzgpvVar.zza = obj;
        return this;
    }
}
