package com.inmobi.media;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.inmobi.media.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3056i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f23675c;
    public String d;
    public long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f23677h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23673a = new Random().nextInt() & Integer.MAX_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f23676e = System.currentTimeMillis();
    public final long f = System.currentTimeMillis();

    public final C3056i a(String url, String locationOnDisk, P9 response, int i2, long j) {
        long j2;
        int i3;
        long j3;
        int i4;
        long j4;
        long j5;
        long j6;
        int i5;
        Intrinsics.f(url, "url");
        Intrinsics.f(locationOnDisk, "locationOnDisk");
        Intrinsics.f(response, "response");
        Map map = response.f;
        long jCurrentTimeMillis = System.currentTimeMillis();
        List list = map != null ? (List) map.get("Date") : null;
        int i6 = 0;
        long jA = (list == null || list.isEmpty()) ? 0L : a((String) list.get(0));
        List list2 = map != null ? (List) map.get("Cache-Control") : null;
        if (list2 == null || list2.isEmpty()) {
            j2 = jCurrentTimeMillis;
            i3 = 0;
            j3 = 0;
            i4 = 0;
            j4 = 0;
        } else {
            String[] strArr = (String[]) StringsKt.J((String) list2.get(0), 0, 6, new String[]{","}).toArray(new String[0]);
            int length = strArr.length;
            int i7 = 0;
            i4 = 0;
            j3 = 0;
            j4 = 0;
            while (true) {
                i3 = 1;
                if (i7 >= length) {
                    break;
                }
                String str = strArr[i7];
                int length2 = str.length() - 1;
                int i8 = i6;
                while (true) {
                    if (i6 > length2) {
                        jCurrentTimeMillis = jCurrentTimeMillis;
                        i5 = i3;
                        break;
                    }
                    jCurrentTimeMillis = jCurrentTimeMillis;
                    boolean z2 = Intrinsics.h(str.charAt(i8 == 0 ? i6 : length2), 32) <= 0;
                    if (i8 == 0) {
                        if (z2) {
                            i6++;
                        } else {
                            i3 = 1;
                            i8 = 1;
                        }
                    } else {
                        if (!z2) {
                            i5 = 1;
                            break;
                        }
                        length2--;
                    }
                    i3 = 1;
                }
                String strA = I7.a(length2, i5, str, i6);
                if (!"no-cache".equals(strA) && !"no-store".equals(strA)) {
                    if (StringsKt.M(strA, "max-age=", false)) {
                        try {
                            String strSubstring = strA.substring(8);
                            Intrinsics.e(strSubstring, "this as java.lang.String).substring(startIndex)");
                            j3 = Long.parseLong(strSubstring);
                        } catch (Exception unused) {
                        }
                    } else if (StringsKt.M(strA, "stale-while-revalidate=", false)) {
                        String strSubstring2 = strA.substring(23);
                        Intrinsics.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
                        j4 = Long.parseLong(strSubstring2);
                    } else if ("must-revalidate".equals(strA) || "proxy-revalidate".equals(strA)) {
                        i4 = i5;
                    }
                }
                i7++;
                jCurrentTimeMillis = jCurrentTimeMillis;
                i6 = 0;
            }
            j2 = jCurrentTimeMillis;
        }
        List list3 = map != null ? (List) map.get("Expires") : null;
        long jA2 = (list3 == null || list3.isEmpty()) ? 0L : a((String) list3.get(0));
        if (i3 != 0) {
            long j7 = 1000;
            j6 = (j3 * j7) + j2;
            if (i4 != 0) {
                j5 = j6;
            } else {
                j6 = (j4 * j7) + j6;
                j5 = j6;
            }
        } else if (1 > jA || jA > jA2) {
            j5 = 0;
            j6 = 0;
        } else {
            j6 = (jA2 - jA) + j2;
            j5 = j6;
        }
        this.f23675c = url;
        this.d = locationOnDisk;
        this.f23674b = i2;
        long j8 = (((long) 1000) * j) + j2;
        this.g = j8;
        this.f23677h = j5;
        this.g = Math.min(j8, j6);
        return this;
    }

    public static long a(String str) {
        try {
            Date date = new SimpleDateFormat("EEE,dd MMM yyyy HH:mm:ss z", Locale.ENGLISH).parse(str);
            if (date != null) {
                return date.getTime();
            }
            return 0L;
        } catch (ParseException e2) {
            S5 s5 = S5.f23167a;
            S5.d.a(new C3011f2(e2));
            return 0L;
        }
    }
}
