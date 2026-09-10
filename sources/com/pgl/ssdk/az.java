package com.pgl.ssdk;

import java.util.Calendar;

/* JADX INFO: loaded from: classes5.dex */
public class az {
    public static void a(long j) {
        try {
            Thread.currentThread();
            Thread.sleep(j);
        } catch (Throwable unused) {
        }
    }

    public static boolean a(long j, long j2) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar2.setTimeInMillis(j2);
        return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(6) == calendar2.get(6);
    }
}
