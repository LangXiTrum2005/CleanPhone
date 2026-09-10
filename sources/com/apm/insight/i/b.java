package com.apm.insight.i;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.apm.insight.CrashType;
import com.apm.insight.Npth;
import com.apm.insight.e;
import com.apm.insight.g.c;
import com.apm.insight.l.f;
import com.apm.insight.l.j;
import com.apm.insight.l.m;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.h;
import com.thinkup.core.common.n.mo;
import com.thinkup.core.common.oo.o;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.io.File;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f10140a;

    public b(Context context) {
        this.f10140a = context;
    }

    private synchronized void b(final long j, final Thread thread, final Throwable th, final String str, final String str2, final boolean z2) {
        final File file = new File(j.a(this.f10140a), str);
        com.apm.insight.g.a.a().a(file.getName());
        file.mkdirs();
        f.d(file);
        final boolean zC = m.c(th);
        com.apm.insight.entity.a aVarA = com.apm.insight.runtime.a.f.a().a(CrashType.LAUNCH, new com.apm.insight.runtime.a.c.a() { // from class: com.apm.insight.i.b.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f10141a = 0;

            @Override // com.apm.insight.runtime.a.c.a
            public final com.apm.insight.entity.a a(int i2, com.apm.insight.entity.a aVar) {
                this.f10141a = SystemClock.uptimeMillis();
                if (i2 == 0) {
                    aVar.a("stack", (Object) m.a(th));
                    aVar.a(o.C0684o.m, "start_crash");
                    aVar.a("isOOM", Boolean.valueOf(zC));
                    aVar.a("crash_time", Long.valueOf(j));
                    aVar.a("launch_mode", Integer.valueOf(com.apm.insight.runtime.a.b.b()));
                    aVar.a("launch_time", Long.valueOf(com.apm.insight.runtime.a.b.c()));
                    String str3 = str2;
                    if (str3 != null) {
                        aVar.a("crash_md5", (Object) str3);
                        aVar.a("crash_md5", str2);
                        boolean z3 = z2;
                        if (z3) {
                            aVar.a("has_ignore", String.valueOf(z3));
                        }
                    }
                } else {
                    if (i2 == 1) {
                        aVar.a("timestamp", Long.valueOf(j));
                        aVar.a("main_process", Boolean.valueOf(com.apm.insight.l.a.b(b.this.f10140a)));
                        aVar.a("crash_type", CrashType.JAVA);
                        Thread thread2 = thread;
                        aVar.a("crash_thread_name", (Object) (thread2 != null ? thread2.getName() : ""));
                        aVar.a(ScarConstants.TOKEN_ID_KEY, Integer.valueOf(Process.myTid()));
                        aVar.a("crash_after_crash", Npth.hasCrashWhenJavaCrash() ? com.p004ironsource.mediationsdk.metadata.a.g : "false");
                        aVar.a("crash_after_native", NativeImpl.e() ? com.p004ironsource.mediationsdk.metadata.a.g : "false");
                        com.apm.insight.g.a.a().a(thread, th, true, aVar);
                        return aVar;
                    }
                    if (i2 == 2) {
                        if (zC) {
                            com.apm.insight.l.a.a(b.this.f10140a, aVar.c());
                        }
                        aVar.a("launch_did", (Object) a.a(b.this.f10140a));
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
                    if (i2 == 3) {
                        JSONObject jSONObjectB = m.b(Thread.currentThread().getName());
                        if (jSONObjectB != null) {
                            aVar.a("all_thread_stacks", jSONObjectB);
                        }
                        aVar.a("logcat", (Object) h.a(e.f()));
                        return aVar;
                    }
                    if (i2 != 4) {
                        if (i2 == 5) {
                            aVar.a("crash_uuid", (Object) str);
                            return aVar;
                        }
                    } else if (!zC) {
                        com.apm.insight.l.a.a(b.this.f10140a, aVar.c());
                        return aVar;
                    }
                }
                return aVar;
            }

            @Override // com.apm.insight.runtime.a.c.a
            public final com.apm.insight.entity.a b(int i2, com.apm.insight.entity.a aVar) {
                try {
                    f.a(new File(file, file.getName() + mo.ono + i2), aVar.c());
                    return aVar;
                } catch (IOException e2) {
                    e2.printStackTrace();
                    return aVar;
                }
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        try {
            aVarA.a("crash_type", "normal");
            aVarA.b("crash_cost", String.valueOf(jCurrentTimeMillis));
            aVarA.a("crash_cost", String.valueOf(jCurrentTimeMillis / 1000));
        } catch (Throwable th2) {
            com.apm.insight.c.a();
            com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
        }
        if (Npth.isStopUpload()) {
        }
    }

    @Override // com.apm.insight.g.c
    public final void a(long j, Thread thread, Throwable th, String str, String str2, boolean z2) {
        b(j, thread, th, str, str2, z2);
    }
}
