package com.apm.insight.runtime;

import com.inmobi.commons.core.configs.CrashConfig;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f10314a = -30000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static File f10315b;

    public static void a(long j) throws Throwable {
        if (j - f10314a < CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
            return;
        }
        f10314a = j;
        try {
            if (f10315b == null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                f10315b = new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/TrackInfo/" + ((jCurrentTimeMillis - (jCurrentTimeMillis % 86400000)) / 86400000) + "/" + com.apm.insight.e.f());
            }
            com.apm.insight.l.f.a(f10315b, String.valueOf(System.currentTimeMillis()), false);
        } catch (IOException unused) {
        }
    }

    public static String a(long j, String str) {
        try {
            return com.apm.insight.l.f.a(new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/TrackInfo/" + ((j - (j % 86400000)) / 86400000) + "/" + str), IOUtils.LINE_SEPARATOR_UNIX);
        } catch (Throwable th) {
            return th.getMessage();
        }
    }

    public static void a() {
        File file = new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/TrackInfo/");
        String[] list = file.list();
        if (list != null && list.length > 5) {
            Arrays.sort(list);
            for (int i2 = 0; i2 < list.length - 5; i2++) {
                com.apm.insight.l.f.a(new File(file, list[i2]));
            }
        }
    }
}
