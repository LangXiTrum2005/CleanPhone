package com.google.android.gms.internal.ads;

import com.applovin.impl.Z;
import com.thinkup.core.common.n.mo;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfr {
    public final String zza;

    private zzfr(int i2, int i3, String str) {
        this.zza = str;
    }

    public static zzfr zza(zzer zzerVar) {
        String str;
        zzerVar.zzk(2);
        int iZzs = zzerVar.zzs();
        int i2 = iZzs >> 1;
        int i3 = iZzs & 1;
        int iZzs2 = zzerVar.zzs() >> 3;
        if (i2 == 4 || i2 == 5 || i2 == 7 || i2 == 8) {
            str = "dvhe";
        } else if (i2 == 9) {
            str = "dvav";
        } else {
            if (i2 != 10) {
                return null;
            }
            str = "dav1";
        }
        int i4 = iZzs2 | (i3 << 5);
        String str2 = mo.ono;
        String str3 = i2 < 10 ? ".0" : mo.ono;
        int length = str3.length() + 4;
        int length2 = String.valueOf(i2).length();
        int length3 = String.valueOf(i4).length();
        if (i4 < 10) {
            str2 = ".0";
        }
        StringBuilder sb = new StringBuilder(Z.d(str2, length + length2, length3));
        sb.append(str);
        sb.append(str3);
        sb.append(i2);
        sb.append(str2);
        sb.append(i4);
        return new zzfr(i2, i4, sb.toString());
    }
}
