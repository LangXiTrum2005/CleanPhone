package com.google.android.gms.internal.ads;

import com.applovin.impl.Z;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class zzakz implements zzafv {
    public final int zza;
    public final zzgwv zzb;

    public zzakz(int i2, int[] iArr) {
        this.zza = i2;
        this.zzb = iArr != null ? zzgwv.zzb(iArr) : zzgwv.zza();
    }

    public final String toString() {
        zzgwv zzgwvVar = this.zzb;
        ArrayList arrayList = new ArrayList(zzgwvVar.zzc());
        for (int i2 = 0; i2 < zzgwvVar.zzc(); i2++) {
            arrayList.add(zzfj.zzx(zzgwvVar.zzd(i2)));
        }
        String strZzx = zzfj.zzx(this.zza);
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder(Z.d(string, strZzx.length() + 37, 1));
        sb.append("UnsupportedBrands{major=");
        sb.append(strZzx);
        sb.append(", compatible=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
