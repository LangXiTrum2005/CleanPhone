package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzakk {
    public static String zza(List list) {
        Iterator it = list.iterator();
        String str = null;
        boolean z2 = false;
        while (it.hasNext()) {
            String str2 = ((zzaky) it.next()).zza.zzg.zzo;
            if (zzas.zzb(str2)) {
                return "video/mp4";
            }
            if (zzas.zza(str2)) {
                z2 = true;
            } else if (zzas.zzc(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        if (z2) {
            return "audio/mp4";
        }
        return str != null ? str : "application/mp4";
    }
}
