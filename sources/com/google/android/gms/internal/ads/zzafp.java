package com.google.android.gms.internal.ads;

import com.applovin.impl.Z;
import com.p004ironsource.d9;

/* JADX INFO: loaded from: classes4.dex */
public final class zzafp {
    public final zzafs zza;
    public final zzafs zzb;

    public zzafp(zzafs zzafsVar, zzafs zzafsVar2) {
        this.zza = zzafsVar;
        this.zzb = zzafsVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafp.class == obj.getClass()) {
            zzafp zzafpVar = (zzafp) obj;
            if (this.zza.equals(zzafpVar.zza) && this.zzb.equals(zzafpVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() + (this.zza.hashCode() * 31);
    }

    public final String toString() {
        zzafs zzafsVar = this.zza;
        zzafs zzafsVar2 = this.zzb;
        String string = zzafsVar.toString();
        String strConcat = zzafsVar.equals(zzafsVar2) ? "" : ", ".concat(zzafsVar2.toString());
        return androidx.media3.extractor.text.ttml.a.q(new StringBuilder(Z.d(strConcat, string.length() + 1, 1)), d9.i.d, string, strConcat, d9.i.f24752e);
    }
}
