package com.kochava.core.util.internal;

import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public final class TimeUtil {
    public static String a(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(date);
    }

    public static long b(double d) {
        return Math.round(d * 1000.0d);
    }

    public static double c(long j) {
        return Math.round(((System.currentTimeMillis() - j) / 1000.0d) * 10000.0d) / 10000.0d;
    }
}
