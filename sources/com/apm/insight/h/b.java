package com.apm.insight.h;

import android.text.TextUtils;
import android.util.Log;
import com.apm.insight.e;
import com.apm.insight.l.f;
import com.apm.insight.l.j;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.m;
import com.apm.insight.runtime.n;
import com.p004ironsource.d9;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HashMap<String, String> f10134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f10135b;

    public b(File file) {
        String strA;
        File fileC = j.c(file);
        if (!fileC.exists() || fileC.length() == 0 || (strA = NativeImpl.a(fileC.getAbsolutePath())) == null) {
            return;
        }
        String[] strArrSplit = strA.split(IOUtils.LINE_SEPARATOR_UNIX);
        this.f10135b = new HashMap();
        for (String str : strArrSplit) {
            String[] strArrSplit2 = str.split(d9.i.f24747b);
            if (strArrSplit2.length == 2) {
                this.f10135b.put(strArrSplit2[0], strArrSplit2[1]);
            }
        }
    }

    public static String a(String str) {
        return e.g().getFilesDir() + "/apminsight/selflib/lib" + str + ".so";
    }

    public static void b(final String str) {
        m.a().a(new Runnable() { // from class: com.apm.insight.h.b.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f10136a = false;

            @Override // java.lang.Runnable
            public final void run() {
                String strA;
                b.b();
                if (b.c(str)) {
                    return;
                }
                n.a("updateSo", str);
                File file = new File(b.a(str));
                file.getParentFile().mkdirs();
                if (file.exists()) {
                    file.delete();
                }
                String str2 = "doUnpackLibrary: " + str;
                if (e.i().isDebugMode()) {
                    Log.w("npth", str2);
                }
                try {
                    strA = c.a(e.g(), str, file);
                } catch (Throwable th) {
                    n.a("updateSoError", str);
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                    strA = null;
                }
                if (strA != null) {
                    if (this.f10136a) {
                        n.a("updateSoFailed", str);
                        return;
                    }
                    this.f10136a = true;
                    n.a("updateSoPostRetry", str);
                    m.a().a(this, com.smartdigimkt.u2.m.D0);
                    return;
                }
                b.f10134a.put(file.getName(), "2008-20250701130429");
                try {
                    f.a(new File(e.g().getFilesDir() + "/apminsight/selflib/" + str + ".ver"), "2008-20250701130429", false);
                } catch (Throwable unused) {
                }
                n.a("updateSoSuccess", str);
            }
        });
    }

    public final boolean d() {
        Map<String, String> map = this.f10135b;
        return (map == null || map.isEmpty() || TextUtils.isEmpty(this.f10135b.get("process_name")) || TextUtils.isEmpty(this.f10135b.get("crash_thread_name")) || TextUtils.isEmpty(this.f10135b.get(com.smartdigimkt.o1.b.B0)) || TextUtils.isEmpty(this.f10135b.get(ScarConstants.TOKEN_ID_KEY)) || TextUtils.isEmpty(this.f10135b.get("start_time")) || TextUtils.isEmpty(this.f10135b.get("crash_time")) || TextUtils.isEmpty(this.f10135b.get("signal_line"))) ? false : true;
    }

    public final String e() {
        return this.f10135b.get("signal_line");
    }

    public final Map<String, String> f() {
        return this.f10135b;
    }

    public static String a() {
        return e.g().getFilesDir() + "/apminsight/selflib/";
    }

    public static /* synthetic */ void b() {
        if (f10134a == null) {
            f10134a = new HashMap<>();
            File file = new File(e.g().getFilesDir(), "/apminsight/selflib/");
            String[] list = file.list();
            if (list != null) {
                for (String str : list) {
                    if (str.endsWith(".ver")) {
                        try {
                            f10134a.put(android.support.v4.media.a.f(4, 0, str), f.a(file.getAbsolutePath() + "/" + str, IOUtils.LINE_SEPARATOR_UNIX));
                        } catch (Throwable th) {
                            com.apm.insight.c.a();
                            com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                        }
                    } else if (!str.endsWith(".so")) {
                        f.a(new File(file, str));
                    }
                }
            }
        }
    }

    public static /* synthetic */ boolean c(String str) {
        return "2008-20250701130429".equals(f10134a.get(str)) && new File(a(str)).exists();
    }
}
