package com.apm.insight.k;

import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.apm.insight.runtime.m;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static File f10210a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f10211b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f10212c = false;
    private static Map<String, String> d;

    public static boolean a() {
        return f10211b;
    }

    public static boolean b() {
        return f10212c;
    }

    public static void c() {
        if (f10211b) {
            return;
        }
        f10212c = true;
        File file = new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/configCrash/configFile");
        if (file.exists()) {
            try {
                com.apm.insight.runtime.a.a(new JSONArray(com.apm.insight.l.f.a(file, IOUtils.LINE_SEPARATOR_UNIX)), false);
                f10211b = true;
            } catch (Throwable unused) {
                com.apm.insight.runtime.a.a((JSONArray) null, false);
            }
        }
    }

    public static void d() {
        c();
        if (g()) {
            a.a();
        }
    }

    public static void e() {
        m.a().a(new Runnable() { // from class: com.apm.insight.k.j.1
            @Override // java.lang.Runnable
            public final void run() {
                if (j.g()) {
                    a.a();
                }
            }
        });
    }

    public static void f() {
        Map<String, String> map = d;
        if (map != null) {
            map.clear();
        }
    }

    public static boolean g() {
        File fileH = h();
        try {
            Map<String, String> mapC = d;
            if (mapC == null) {
                mapC = com.apm.insight.l.f.c(fileH);
            }
            d = mapC;
            if (mapC == null) {
                d = new HashMap();
                return true;
            }
            if (mapC.size() < com.apm.insight.entity.b.c()) {
                return true;
            }
            Iterator<String> it = com.apm.insight.entity.b.d().iterator();
            while (it.hasNext()) {
                if (!d.containsKey(it.next())) {
                    return true;
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean z2 = false;
            for (Map.Entry<String, String> entry : d.entrySet()) {
                try {
                    if (jCurrentTimeMillis - Long.decode(entry.getValue()).longValue() > com.apm.insight.runtime.d.d(entry.getKey())) {
                        z2 = true;
                    }
                } catch (Throwable th) {
                    com.apm.insight.a.a(th);
                }
            }
            if (z2) {
                com.apm.insight.a.a((Object) "config should be updated");
            } else {
                com.apm.insight.a.a((Object) "config should not be updated");
            }
            return z2;
        } catch (Throwable th2) {
            Log.e("npth", NotificationCompat.CATEGORY_ERROR, th2);
            return true;
        }
    }

    private static File h() {
        if (f10210a == null) {
            f10210a = new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/configCrash/configInvalid");
        }
        return f10210a;
    }

    public static void a(JSONArray jSONArray) {
        try {
            com.apm.insight.l.f.a(new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/configCrash/configFile"), jSONArray);
        } catch (IOException unused) {
        }
        try {
            com.apm.insight.l.f.a(h(), d);
        } catch (Throwable unused2) {
        }
    }

    public static void a(String str) {
        if (d == null) {
            d = new HashMap();
        }
        d.put(str, String.valueOf(System.currentTimeMillis()));
    }
}
