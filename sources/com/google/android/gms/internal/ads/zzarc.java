package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.p004ironsource.d9;

/* JADX INFO: loaded from: classes4.dex */
public final class zzarc {
    private final String zza;
    private final String zzb;

    public zzarc(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzarc.class == obj.getClass()) {
            zzarc zzarcVar = (zzarc) obj;
            if (TextUtils.equals(this.zza, zzarcVar.zza) && TextUtils.equals(this.zzb, zzarcVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() + (this.zza.hashCode() * 31);
    }

    public final String toString() {
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(str2).length() + 1);
        androidx.media3.extractor.text.ttml.a.C(sb, "Header[name=", str, ",value=", str2);
        sb.append(d9.i.f24752e);
        return sb.toString();
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
