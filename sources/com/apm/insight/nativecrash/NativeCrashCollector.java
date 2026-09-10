package com.apm.insight.nativecrash;

import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.Npth;
import com.apm.insight.e;
import com.apm.insight.l.m;
import com.apm.insight.runtime.a.f;
import com.apm.insight.runtime.j;
import com.apm.insight.runtime.l;
import com.p004ironsource.d9;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class NativeCrashCollector {
    public static int a() {
        return 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (d9.h.Z.equalsIgnoreCase(str)) {
            return m.a(Looper.getMainLooper().getThread().getStackTrace());
        }
        ThreadGroup threadGroup = Looper.getMainLooper().getThread().getThreadGroup();
        int iActiveCount = threadGroup.activeCount();
        Thread[] threadArr = new Thread[(iActiveCount / 2) + iActiveCount];
        int iEnumerate = threadGroup.enumerate(threadArr);
        for (int i2 = 0; i2 < iEnumerate; i2++) {
            String name = threadArr[i2].getName();
            if (!TextUtils.isEmpty(name) && (name.equals(str) || name.startsWith(str) || name.endsWith(str))) {
                return m.a(threadArr[i2].getStackTrace());
            }
        }
        try {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                String name2 = entry.getKey().getName();
                if (!name2.equals(str) && !name2.startsWith(str) && !name2.endsWith(str)) {
                }
                return m.a(entry.getValue());
            }
        } catch (Throwable th) {
            com.apm.insight.c.a();
            j.a(th, "NPTH_CATCH");
        }
        return "";
    }

    public static void onNativeCrash(final String str) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        com.apm.insight.a.a((Object) "[onNativeCrash] enter");
        try {
            com.apm.insight.k.b.a().b();
            final File fileE = com.apm.insight.l.j.e(new File(com.apm.insight.l.j.a(), e.f()));
            com.apm.insight.entity.a aVarA = f.a().a(CrashType.NATIVE, new com.apm.insight.runtime.a.c.a() { // from class: com.apm.insight.nativecrash.NativeCrashCollector.1
                @Override // com.apm.insight.runtime.a.c.a
                public final com.apm.insight.entity.a a(int i2, com.apm.insight.entity.a aVar) {
                    String str2 = com.p004ironsource.mediationsdk.metadata.a.g;
                    if (i2 == 1) {
                        String str3 = str;
                        if (str3 != null && str3.length() != 0) {
                            aVar.a("java_data", (Object) NativeCrashCollector.b(str));
                        }
                        if (!Npth.hasCrashWhenNativeCrash()) {
                            str2 = "false";
                        }
                        aVar.a("crash_after_crash", str2);
                        return aVar;
                    }
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 4) {
                                com.apm.insight.l.a.a(e.g(), aVar.c());
                                return aVar;
                            }
                        } else if (com.apm.insight.runtime.a.d()) {
                            aVar.a("all_thread_stacks", m.b(str));
                            aVar.a("has_all_thread_stack", com.p004ironsource.mediationsdk.metadata.a.g);
                        }
                        return aVar;
                    }
                    if (e.x()) {
                        JSONArray jSONArrayB = com.apm.insight.b.f.b().b();
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        JSONObject jSONObjectA = com.apm.insight.b.f.b().a(jUptimeMillis).a();
                        JSONArray jSONArrayA = com.apm.insight.b.j.a(jUptimeMillis);
                        aVar.a("history_message", (Object) jSONArrayB);
                        aVar.a("current_message", jSONObjectA);
                        aVar.a("pending_messages", (Object) jSONArrayA);
                    }
                    aVar.a("disable_looper_monitor", String.valueOf(com.apm.insight.runtime.a.c()));
                    aVar.a("npth_force_apm_crash", String.valueOf(com.apm.insight.c.a.a()));
                    return aVar;
                }

                @Override // com.apm.insight.runtime.a.c.a
                public final com.apm.insight.entity.a b(int i2, com.apm.insight.entity.a aVar) {
                    try {
                        JSONObject jSONObjectC = aVar.c();
                        if (jSONObjectC.length() > 0) {
                            com.apm.insight.l.f.a(new File(fileE.getAbsolutePath() + '.' + i2), jSONObjectC);
                        }
                    } catch (IOException e2) {
                        com.apm.insight.c.a();
                        j.a(e2, "NPTH_CATCH");
                    }
                    if (i2 == 0) {
                        com.apm.insight.a.a.a();
                        com.apm.insight.a.a.a();
                        CrashType crashType = CrashType.LAUNCH;
                        e.f();
                    }
                    return aVar;
                }
            });
            JSONObject jSONObjectC = aVarA.c();
            if (jSONObjectC != null && jSONObjectC.length() != 0) {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                long j = jCurrentTimeMillis2 - jCurrentTimeMillis;
                try {
                    jSONObjectC.put("java_end", jCurrentTimeMillis2);
                    aVarA.b("crash_cost", String.valueOf(j));
                    aVarA.a("crash_cost", String.valueOf(j / 1000));
                } catch (Throwable unused) {
                }
                File file = new File(fileE.getAbsolutePath() + ".tmp");
                com.apm.insight.l.f.a(file, jSONObjectC);
                file.renameTo(fileE);
            }
            try {
                if (l.a().d().isEmpty()) {
                    return;
                }
                File file2 = new File(com.apm.insight.l.j.a(), e.f());
                c cVar = new c(file2);
                cVar.b(file2);
                a(cVar.c(), cVar.a(), str);
            } catch (Throwable unused2) {
                a("", null, str);
            }
        } catch (Throwable th) {
            try {
                com.apm.insight.c.a();
                j.a(th, "NPTH_CATCH");
            } finally {
                try {
                    if (!l.a().d().isEmpty()) {
                        File file3 = new File(com.apm.insight.l.j.a(), e.f());
                        c cVar2 = new c(file3);
                        cVar2.b(file3);
                        a(cVar2.c(), cVar2.a(), str);
                    }
                } catch (Throwable unused3) {
                    a("", null, str);
                }
            }
        }
    }

    private static void a(String str, String str2, String str3) {
        for (ICrashCallback iCrashCallback : l.a().d()) {
            try {
                if (iCrashCallback instanceof com.apm.insight.b) {
                    ((com.apm.insight.b) iCrashCallback).a(CrashType.NATIVE, str, str3, str2);
                } else {
                    iCrashCallback.onCrash(CrashType.NATIVE, str, null);
                }
            } catch (Throwable th) {
                com.apm.insight.c.a();
                j.a(th, "NPTH_CATCH");
            }
        }
    }
}
