package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.download.Command;
import com.p004ironsource.x4;
import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzash {
    public static zzaqt zza(zzarg zzargVar) {
        long j;
        boolean z2;
        long j2;
        long j3;
        long j4;
        long j5;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = zzargVar.zzc;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jZzb = str != null ? zzb(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i2 = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z2 = false;
            j2 = 0;
            j3 = 0;
            while (i2 < strArrSplit.length) {
                String strTrim = strArrSplit[i2].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j3 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j2 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z2 = true;
                }
                i2++;
            }
            j = 0;
            i2 = 1;
        } else {
            j = 0;
            z2 = false;
            j2 = 0;
            j3 = 0;
        }
        String str3 = (String) map.get("Expires");
        long jZzb2 = str3 != null ? zzb(str3) : j;
        String str4 = (String) map.get("Last-Modified");
        long jZzb3 = str4 != null ? zzb(str4) : j;
        String str5 = (String) map.get(Command.HTTP_HEADER_ETAG);
        if (i2 != 0) {
            long j6 = (j3 * 1000) + jCurrentTimeMillis;
            j5 = z2 ? j6 : (j2 * 1000) + j6;
            j4 = j6;
        } else {
            j4 = (jZzb <= j || jZzb2 < jZzb) ? j : (jZzb2 - jZzb) + jCurrentTimeMillis;
            j5 = j4;
        }
        zzaqt zzaqtVar = new zzaqt();
        zzaqtVar.zza = zzargVar.zzb;
        zzaqtVar.zzb = str5;
        zzaqtVar.zzf = j4;
        zzaqtVar.zze = j5;
        zzaqtVar.zzc = jZzb;
        zzaqtVar.zzd = jZzb3;
        zzaqtVar.zzg = map;
        zzaqtVar.zzh = zzargVar.zzd;
        return zzaqtVar;
    }

    public static long zzb(String str) {
        try {
            return zzd("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e2) {
            if ("0".equals(str) || x4.DISABLED_AUCTION_FALLBACK_ID.equals(str)) {
                zzarw.zza("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            zzarw.zzd(e2, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static String zzc(long j) {
        return zzd("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j));
    }

    private static SimpleDateFormat zzd(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
