package com.apm.insight.runtime;

import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static File f10353a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f10354a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f10355b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f10356c;

        public a(String str) {
            String[] strArrSplit = str.split("\\s+");
            if (strArrSplit.length != 3) {
                com.apm.insight.c.a();
                j.a(new RuntimeException("err ProcessTrack line:".concat(str)), "NPTH_CATCH");
                return;
            }
            this.f10355b = strArrSplit[0];
            this.f10354a = strArrSplit[1];
            try {
                this.f10356c = Long.parseLong(strArrSplit[2]);
            } catch (Throwable th) {
                com.apm.insight.c.a();
                j.a(new RuntimeException("err ProcessTrack line:".concat(str), th), "NPTH_CATCH");
            }
        }
    }

    public static File a(long j) {
        return new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/ProcessTrack/" + ((j - (j % 86400000)) / 86400000));
    }

    public static HashMap<String, a> a(long j, String str) throws Throwable {
        File file = new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/ProcessTrack/" + ((j - (j % 86400000)) / 86400000));
        String[] list = file.list();
        HashMap<String, a> map = new HashMap<>();
        if (list != null) {
            for (String str2 : list) {
                File file2 = new File(file, str2);
                long length = file2.length();
                try {
                    JSONArray jSONArrayA = com.apm.insight.l.f.a(file2, length > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED ? length - PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED : 0L);
                    for (int length2 = jSONArrayA.length() - 1; length2 >= 0; length2--) {
                        String strOptString = jSONArrayA.optString(length2);
                        if (!TextUtils.isEmpty(strOptString) && strOptString.startsWith(str)) {
                            map.put(str2.replace('_', AbstractJsonLexerKt.COLON).replace(".txt", ""), new a(strOptString));
                            break;
                        }
                    }
                } catch (IOException unused) {
                }
            }
        }
        return map;
    }

    public static void a(String str, String str2) {
        File file;
        try {
            if (f10353a == null) {
                com.apm.insight.e.g();
                String strB = com.apm.insight.l.a.b();
                if (strB == null) {
                    file = null;
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    f10353a = new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/ProcessTrack/" + ((jCurrentTimeMillis - (jCurrentTimeMillis % 86400000)) / 86400000) + IOUtils.DIR_SEPARATOR_UNIX + strB.replace(AbstractJsonLexerKt.COLON, '_') + ".txt");
                    file = f10353a;
                }
            } else {
                file = f10353a;
            }
            if (file != null) {
                com.apm.insight.l.f.a(file, str + ' ' + str2 + ' ' + System.currentTimeMillis() + '\n', true);
            }
        } catch (Throwable unused) {
        }
    }
}
