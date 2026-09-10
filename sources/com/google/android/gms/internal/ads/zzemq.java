package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.thinkup.core.common.n.mo;

/* JADX INFO: loaded from: classes4.dex */
final class zzemq {
    final String zza;
    final String zzb;
    int zzc;
    long zzd;
    final Integer zze;

    public zzemq(String str, String str2, int i2, long j, Integer num) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i2;
        this.zzd = j;
        this.zze = num;
    }

    public final String toString() {
        Integer num;
        String str = this.zza;
        int i2 = this.zzc;
        long j = this.zzd;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(i2).length() + 1 + String.valueOf(j).length());
        sb.append(str);
        sb.append(mo.ono);
        sb.append(i2);
        sb.append(mo.ono);
        sb.append(j);
        String string = sb.toString();
        String str2 = this.zzb;
        if (!TextUtils.isEmpty(str2)) {
            string = android.support.v4.media.a.s(new StringBuilder(string.length() + 1 + String.valueOf(str2).length()), string, mo.ono, str2);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcg)).booleanValue() || (num = this.zze) == null || TextUtils.isEmpty(str2)) {
            return string;
        }
        StringBuilder sb2 = new StringBuilder(string.length() + 1 + num.toString().length());
        sb2.append(string);
        sb2.append(mo.ono);
        sb2.append(num);
        return sb2.toString();
    }
}
