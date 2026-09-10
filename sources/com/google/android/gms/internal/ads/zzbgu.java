package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
final class zzbgu extends zzbgv {
    private static final String zzb(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i3 < str.length() && str.charAt(i3) == ',') {
            i3++;
        }
        while (length > 0) {
            int i4 = length - 1;
            if (str.charAt(i4) != ',') {
                break;
            }
            length = i4;
        }
        if (length < i3) {
            return null;
        }
        if (i3 != 0) {
            i2 = i3;
        } else if (length == str.length()) {
            return str;
        }
        return str.substring(i2, length);
    }

    @Override // com.google.android.gms.internal.ads.zzbgv
    public final String zza(String str, String str2) {
        String strZzb = zzb(str);
        String strZzb2 = zzb(str2);
        if (TextUtils.isEmpty(strZzb)) {
            return strZzb2;
        }
        if (TextUtils.isEmpty(strZzb2)) {
            return strZzb;
        }
        return android.support.v4.media.a.s(new StringBuilder(String.valueOf(strZzb).length() + 1 + String.valueOf(strZzb2).length()), strZzb, ",", strZzb2);
    }
}
