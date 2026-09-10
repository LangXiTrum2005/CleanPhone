package com.apm.insight.b;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.Npth;
import com.apm.insight.entity.Header;
import com.apm.insight.l.m;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.l;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.inmobi.commons.core.configs.CrashConfig;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.p004ironsource.d9;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.thinkup.core.common.om.n;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static volatile boolean f9981z = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f9984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f9985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f9986c;
    private JSONObject g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private JSONObject f9988h;
    private JSONArray m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private JSONObject f9991n;
    private JSONArray q;
    private JSONArray r;
    private JSONObject s;
    private boolean t;
    private volatile boolean v;
    private long d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private File f9987e = null;
    private boolean f = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f9989i = "unknown";
    private String j = "unknown";
    private String k = "unknown";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f9990l = "npth_inner_default";
    private int o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f9992p = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Object f9993u = new Object();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f9994w = -1;
    private long x = 0;
    private final Runnable y = new Runnable() { // from class: com.apm.insight.b.b.1
        @Override // java.lang.Runnable
        public final void run() {
            try {
                b.this.g();
            } catch (Throwable th) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
            }
        }
    };

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f9982A = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private List<Pattern> f9983B = null;
    private Pattern C = null;
    private File D = null;

    public b(Context context) {
        this.f9985b = context;
    }

    private static boolean h() {
        boolean zA = com.apm.insight.l.a.a();
        boolean z2 = !zA;
        if (zA || com.apm.insight.runtime.a.b.d().e() > 2000) {
            return z2;
        }
        return false;
    }

    private File i() {
        if (this.D == null) {
            this.D = new File(this.f9985b.getFilesDir(), "has_anr_signal_" + com.apm.insight.l.a.b().replaceAll(":", "_"));
        }
        return this.D;
    }

    public final void b() {
        if (this.f9986c) {
            this.f9986c = false;
            c cVar = this.f9984a;
            if (cVar != null) {
                cVar.b();
            }
            this.f9984a = null;
        }
    }

    public final void c() {
        c cVar = this.f9984a;
        if (cVar != null) {
            cVar.a();
        }
    }

    public final void d() {
        synchronized (this.f9993u) {
        }
        this.y.run();
    }

    public final void e() {
        if (NativeImpl.h()) {
            try {
                com.apm.insight.l.f.a(i(), String.valueOf(this.f9982A + 1), false);
            } catch (Throwable th) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
            }
        }
        this.f9994w = SystemClock.uptimeMillis();
        this.v = true;
    }

    public final void f() {
        File fileI = i();
        try {
            int iIntValue = Integer.decode(com.apm.insight.l.f.a(fileI.getAbsolutePath(), IOUtils.LINE_SEPARATOR_UNIX)).intValue();
            this.f9982A = iIntValue;
            if (iIntValue >= 2) {
                NativeImpl.a(false);
            } else {
                NativeImpl.a(true);
            }
        } catch (IOException unused) {
            NativeImpl.a(true);
        } catch (Throwable unused2) {
            com.apm.insight.l.f.a(fileI);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final boolean g() {
        int i2;
        String str;
        String str2;
        boolean z2;
        JSONArray jSONArrayB;
        boolean z3;
        JSONArray jSONArrayA;
        JSONObject jSONObject;
        JSONObject jSONObjectA;
        String str3;
        String str4;
        JSONArray jSONArray;
        final long j;
        JSONObject jSONObjectA2;
        boolean z4;
        JSONObject jSONObject2;
        String str5;
        boolean zB = com.apm.insight.runtime.i.a().b();
        long jUptimeMillis = SystemClock.uptimeMillis();
        a(jUptimeMillis);
        String strA = d.a(this.f9985b);
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str6 = "normal";
        TextUtils.isEmpty(strA);
        if (TextUtils.isEmpty(strA)) {
            i2 = 1;
            str = "unknown";
            str2 = "unknown";
            z2 = false;
            jSONArrayB = null;
            z3 = false;
            jSONArrayA = null;
            jSONObject = null;
            jSONObjectA = null;
            str3 = "normal";
            str4 = "unknown";
            jSONArray = null;
            j = jCurrentTimeMillis;
            jSONObjectA2 = null;
        } else {
            synchronized (this.f9993u) {
            }
            if (this.g == null || System.currentTimeMillis() - this.d > 20000) {
                if (this.v) {
                    this.v = false;
                    str6 = "trace_after";
                }
                b(jUptimeMillis);
            } else {
                str6 = "trace_last";
            }
            JSONObject jSONObject3 = this.g;
            String str7 = this.f9989i;
            String str8 = this.j;
            String str9 = this.k;
            JSONArray jSONArray2 = this.m;
            JSONArray jSONArray3 = this.r;
            JSONArray jSONArray4 = this.q;
            i2 = 1;
            JSONObject jSONObject4 = this.s;
            JSONObject jSONObject5 = this.f9988h;
            z2 = this.t;
            long j2 = this.f9992p;
            this.g = null;
            this.m = null;
            this.q = null;
            this.f9988h = null;
            this.r = null;
            this.f9989i = "unknown";
            this.j = "unknown";
            this.k = "unknown";
            this.o = 0;
            str2 = str9;
            str4 = str7;
            jSONArray = jSONArray2;
            jSONObjectA = jSONObject5;
            jSONArrayA = jSONArray4;
            jSONArrayB = jSONArray3;
            str = str8;
            str3 = str6;
            j = j2;
            jSONObjectA2 = jSONObject3;
            jSONObject = jSONObject4;
            z3 = true;
        }
        if (TextUtils.isEmpty(strA)) {
            if (this.g == null || System.currentTimeMillis() - this.d <= 20000) {
                if (this.g == null || System.currentTimeMillis() - this.d <= 2000 || !NativeImpl.h()) {
                    return false;
                }
                com.apm.insight.l.f.a(i());
                return false;
            }
            this.g = null;
            this.m = null;
            this.q = null;
            this.f9988h = null;
            this.r = null;
            this.f9989i = "unknown";
            this.j = "unknown";
            this.k = "unknown";
            this.o = 0;
            this.f9987e = null;
            return false;
        }
        if (jSONObjectA2 == null) {
            if (jSONArrayA == null) {
                try {
                    jSONArrayB = f.b().b();
                    jSONArrayA = j.a(jUptimeMillis);
                    z4 = z2;
                    try {
                        jSONObjectA = f.b().a(jUptimeMillis).a();
                        JSONObject jSONObject6 = new JSONObject();
                        try {
                            com.apm.insight.l.a.a(this.f9985b, jSONObject6);
                            jSONObject = jSONObject6;
                        } catch (Throwable unused) {
                            jSONObject = jSONObject6;
                        }
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable unused3) {
                    z4 = z2;
                }
            } else {
                z4 = z2;
            }
            jSONObjectA2 = d.a();
        } else {
            z4 = z2;
        }
        JSONObject jSONObject7 = jSONObject;
        JSONObject jSONObject8 = jSONObjectA;
        if (jSONObjectA2 == null || jSONObjectA2.length() <= 0) {
            return z3;
        }
        boolean z5 = z3;
        try {
            jSONObjectA2.put(com.smartdigimkt.o1.b.B0, Process.myPid());
            jSONObjectA2.put("package", this.f9985b.getPackageName());
            jSONObjectA2.put("is_remote_process", 0);
            jSONObjectA2.put("is_new_stack", 10);
            com.apm.insight.entity.a aVar = new com.apm.insight.entity.a(new JSONObject());
            JSONObject jSONObject9 = jSONObjectA2;
            aVar.a("data", (Object) jSONObject9.toString());
            aVar.a("is_anr", Integer.valueOf(i2));
            aVar.a("anrType", (Object) str3);
            if (com.apm.insight.e.x()) {
                aVar.a("history_message", (Object) jSONArrayB);
                aVar.a("current_message", jSONObject8);
                aVar.a("pending_messages", (Object) jSONArrayA);
            }
            aVar.a("anr_time", Long.valueOf(System.currentTimeMillis()));
            aVar.a("crash_time", Long.valueOf(j));
            com.apm.insight.c.a.b();
            aVar.c(jSONObject7);
            aVar.a("anr_info", (Object) strA);
            if (jSONArray != null) {
                aVar.a("dump_trace", (Object) jSONArray);
            }
            JSONObject jSONObject10 = this.f9991n;
            aVar.a("all_thread_stacks", (jSONObject10 == null || jSONObject10.length() == 0) ? m.b((String) null) : this.f9991n);
            com.apm.insight.runtime.a.f fVarA = com.apm.insight.runtime.a.f.a();
            CrashType crashType = CrashType.ANR;
            com.apm.insight.entity.a aVarA = fVarA.a(crashType, aVar);
            aVarA.a("is_background", Boolean.valueOf(z4));
            aVarA.a("logcat", (Object) com.apm.insight.runtime.h.a(com.apm.insight.e.f()));
            aVarA.a("has_dump", (Object) com.p004ironsource.mediationsdk.metadata.a.g);
            aVarA.a("crash_uuid", (Object) com.apm.insight.e.a(j, crashType, false, false));
            JSONObject jSONObjectOptJSONObject = aVarA.c().optJSONObject("filters");
            com.apm.insight.entity.d.b(aVarA.c());
            if (jSONObjectOptJSONObject == null) {
                try {
                    jSONObject2 = new JSONObject();
                    try {
                        aVarA.a("filters", jSONObject2);
                    } catch (Throwable unused4) {
                        jSONObjectOptJSONObject = jSONObject2;
                        jSONObject2 = jSONObjectOptJSONObject;
                    }
                } catch (Throwable unused5) {
                    jSONObject2 = jSONObjectOptJSONObject;
                }
            } else {
                jSONObject2 = jSONObjectOptJSONObject;
            }
            jSONObject2.put("anrType", str3);
            jSONObject2.put("max_utm_thread", str4);
            jSONObject2.put("max_stm_thread", str);
            jSONObject2.put("max_utm_stm_thread", str2);
            jSONObject2.put("max_utm_thread_version", this.f9990l);
            long j3 = j - com.apm.insight.e.j();
            if (j3 < CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
                str5 = "0 - 30s";
            } else if (j3 < ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) {
                str5 = "30s - 1min";
            } else if (j3 < UnityAdsConstants.Timeout.INIT_TIMEOUT_MS) {
                str5 = "1min - 2min";
            } else if (j3 < 300000) {
                str5 = "2min - 5min";
            } else if (j3 < TTAdConstant.AD_MAX_EVENT_TIME) {
                str5 = "5min - 10min";
            } else if (j3 < 1800000) {
                str5 = "10min - 30min";
            } else {
                str5 = j3 < n.m ? "30min - 1h" : "1h - ";
            }
            jSONObject2.put("crash_length", str5);
            jSONObject2.put("disable_looper_monitor", String.valueOf(com.apm.insight.runtime.a.c()));
            jSONObject2.put("npth_force_apm_crash", String.valueOf(com.apm.insight.c.a.b()));
            jSONObject2.put(com.smartdigimkt.b0.a.s1, "2008-20250701130429");
            jSONObject2.put("has_logcat", String.valueOf(aVarA.a()));
            jSONObject2.put("memory_leak", String.valueOf(com.apm.insight.entity.a.a(com.apm.insight.e.f())));
            jSONObject2.put("fd_leak", String.valueOf(com.apm.insight.entity.a.b(com.apm.insight.e.f())));
            jSONObject2.put("threads_leak", String.valueOf(com.apm.insight.entity.a.c(com.apm.insight.e.f())));
            jSONObject2.put("is_64_devices", String.valueOf(Header.a()));
            jSONObject2.put("is_64_runtime", String.valueOf(NativeImpl.f()));
            jSONObject2.put("is_x86_devices", String.valueOf(Header.b()));
            jSONObject2.put("has_meminfo_file", String.valueOf(com.apm.insight.l.j.d(com.apm.insight.e.f()).exists()));
            jSONObject2.put("is_root", com.apm.insight.nativecrash.a.k() ? com.p004ironsource.mediationsdk.metadata.a.g : "false");
            jSONObject2.put("anr_normal_trace", String.valueOf(!this.v));
            jSONObject2.put("anr_no_run", String.valueOf(zB));
            jSONObject2.put("crash_after_crash", Npth.hasCrash() ? com.p004ironsource.mediationsdk.metadata.a.g : "false");
            jSONObject2.put("from_file", String.valueOf(d.b()));
            jSONObject2.put("has_dump", com.p004ironsource.mediationsdk.metadata.a.g);
            jSONObject2.put("from_kill", "false");
            jSONObject2.put("last_resume_activity", com.apm.insight.runtime.a.b.d().h());
            int i3 = this.o;
            if (i3 > 0) {
                jSONObject2.put("may_have_stack_overflow", String.valueOf(i3));
            }
            try {
                a(strA, jSONObject2);
            } catch (Throwable th) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
            }
            com.apm.insight.a.a.a();
            CrashType crashType2 = CrashType.LAUNCH;
            com.apm.insight.e.e();
            try {
                if (com.apm.insight.a.e().length() > 1024) {
                    aVarA.a("has_system_traces", com.p004ironsource.mediationsdk.metadata.a.g);
                }
            } catch (Throwable unused6) {
            }
            try {
                JSONArray jSONArrayA2 = com.apm.insight.nativecrash.b.a(com.apm.insight.l.j.e(com.apm.insight.e.f()), com.apm.insight.l.j.f(com.apm.insight.e.f()));
                jSONObject2.put("leak_threads_count", String.valueOf(jSONArrayA2.length()));
                if (jSONArrayA2.length() > 0) {
                    com.apm.insight.l.f.a(com.apm.insight.l.j.g(com.apm.insight.e.f()), jSONArrayA2);
                }
            } catch (Throwable unused7) {
            }
            String strOptString = jSONObject9.optString("mainStackFromTrace");
            JSONArray jSONArrayA3 = com.apm.insight.entity.b.a(strOptString);
            com.apm.insight.entity.b.a(aVarA.c(), jSONArrayA3, new com.apm.insight.entity.b.a() { // from class: com.apm.insight.b.b.2
                @Override // com.apm.insight.entity.b.a
                public final void a(JSONObject jSONObject11) {
                    com.apm.insight.k.d.a().a(jSONObject11, j, b.this.f);
                }
            });
            b(strOptString, jSONArrayA3);
            return z5;
        } catch (Throwable th2) {
            com.apm.insight.c.a();
            com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
            return z5;
        }
    }

    public final void a() {
        if (this.f9986c) {
            return;
        }
        this.f9984a = new c(this);
        this.d = com.apm.insight.e.j();
        this.f9986c = true;
    }

    private JSONObject c(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArrayB = com.apm.insight.a.b(jSONArray);
        if (jSONArrayB.length() != jSONArray.length()) {
            this.o++;
        }
        try {
            jSONObject.put("thread_number", 1);
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < jSONArrayB.length(); i2++) {
                sb.append(jSONArrayB.getString(i2));
                sb.append('\n');
            }
            jSONObject.put("mainStackFromTrace", sb.toString());
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private boolean a(long j) {
        if (this.v) {
            this.v = false;
            b(j);
        }
        return false;
    }

    private void b(long j) {
        if (this.x != this.f9994w) {
            try {
                this.f9992p = System.currentTimeMillis();
                if (com.apm.insight.e.x()) {
                    this.r = f.b().b();
                    this.q = j.a(j);
                    this.f9988h = f.b().a(j).a();
                }
                JSONObject jSONObject = new JSONObject();
                this.s = jSONObject;
                com.apm.insight.l.a.a(this.f9985b, jSONObject);
                this.t = h();
                this.f = !Npth.hasCrash();
            } catch (Throwable unused) {
            }
            try {
                this.d = this.f9992p;
                String strB = com.apm.insight.l.j.b();
                File file = new File(new File(com.apm.insight.l.j.f(this.f9985b), strB), "trace_" + com.apm.insight.l.a.b().replace(AbstractJsonLexerKt.COLON, '_') + ".txt");
                file.getParentFile().mkdirs();
                com.apm.insight.l.f.a(file, com.apm.insight.l.b.a().format(new Date(System.currentTimeMillis())) + IOUtils.LINE_SEPARATOR_UNIX, false);
                com.apm.insight.runtime.n.a("anr_trace", strB);
                NativeImpl.i(file.getAbsolutePath());
                try {
                    JSONArray jSONArrayA = com.apm.insight.l.f.a(file.getAbsolutePath());
                    this.m = jSONArrayA;
                    a(jSONArrayA);
                } catch (IOException unused2) {
                } catch (Throwable th) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                }
                if (this.g == null) {
                    this.g = d.a();
                }
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
            }
            com.apm.insight.a.d();
        } else {
            try {
                this.d = this.f9992p;
                String strB2 = com.apm.insight.l.j.b();
                File file2 = new File(new File(com.apm.insight.l.j.f(this.f9985b), strB2), "trace" + com.apm.insight.l.a.b().replace(AbstractJsonLexerKt.COLON, '_') + ".txt");
                file2.getParentFile().mkdirs();
                com.apm.insight.l.f.a(file2, com.apm.insight.l.b.a().format(new Date(System.currentTimeMillis())) + IOUtils.LINE_SEPARATOR_UNIX, false);
                com.apm.insight.runtime.n.a("anr_trace", strB2);
                NativeImpl.i(file2.getAbsolutePath());
                try {
                    JSONArray jSONArrayA2 = com.apm.insight.l.f.a(file2.getAbsolutePath());
                    this.m = jSONArrayA2;
                    a(jSONArrayA2);
                } catch (IOException unused3) {
                } catch (Throwable th3) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.j.a(th3, "NPTH_CATCH");
                }
                if (this.g == null) {
                    this.g = d.a();
                }
            } catch (Throwable th4) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th4, "NPTH_CATCH");
            }
        }
        long j2 = this.f9994w;
        this.x = j2;
        this.f9994w = -1L;
        if (j2 == -1) {
            this.x = (-1) - 1;
        }
    }

    private void a(JSONArray jSONArray) {
        int[] iArrB;
        int[] iArrB2;
        if (jSONArray == null) {
            return;
        }
        this.g = null;
        this.f9991n = null;
        this.o = 0;
        JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray3 = new JSONArray();
        JSONArray jSONArray4 = new JSONArray();
        this.f9989i = "unknown";
        this.j = "unknown";
        this.k = "unknown";
        int[] iArr = new int[3];
        iArr[0] = 0;
        iArr[1] = 0;
        int i2 = 2;
        iArr[2] = 0;
        JSONArray jSONArray5 = jSONArray4;
        String string = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            String strOptString = jSONArray.optString(i3);
            int i4 = i2;
            if (TextUtils.isEmpty(strOptString)) {
                if (jSONArray5.length() > 0 && !TextUtils.isEmpty(string)) {
                    if (this.g == null && d9.h.Z.equals(string)) {
                        this.g = c(jSONArray5);
                    } else {
                        jSONArray2.put(a(string, jSONArray5));
                    }
                    try {
                        if (!d9.h.Z.equals(string)) {
                            string = string.substring(0, string.indexOf(40)).trim();
                        }
                    } catch (Throwable unused) {
                    }
                    String str = string;
                    if (!a(str)) {
                        try {
                            iArrB2 = b(jSONArray5);
                        } catch (IllegalArgumentException e2) {
                            com.apm.insight.c.a();
                            com.apm.insight.runtime.j.a(e2, "NPTH_CATCH");
                            iArrB2 = null;
                        } catch (Throwable unused2) {
                            iArrB2 = null;
                        }
                        if (iArrB2 != null) {
                            int i5 = iArrB2[0];
                            if (i5 > iArr[0]) {
                                iArr[0] = i5;
                                this.f9989i = str;
                            }
                            int i6 = iArrB2[1];
                            if (i6 > iArr[1]) {
                                iArr[1] = i6;
                                this.j = str;
                            }
                            int i7 = iArrB2[i4];
                            if (i7 > iArr[i4]) {
                                iArr[i4] = i7;
                                this.k = str;
                            }
                        }
                    }
                }
                if (jSONArray5.length() > 0) {
                    jSONArray5 = new JSONArray();
                }
                i2 = i4;
                string = null;
            } else if (!z2) {
                i2 = i4;
                if (strOptString.startsWith("DALVIK THREADS") || strOptString.startsWith("suspend") || strOptString.startsWith("\"")) {
                    z2 = true;
                }
                jSONArray3.put(strOptString);
            } else if (!z2) {
                i2 = i4;
            } else if (strOptString.contains(" prio=")) {
                if (jSONArray5.length() > 0 && !TextUtils.isEmpty(string)) {
                    if (this.g == null && d9.h.Z.equals(string)) {
                        this.g = c(jSONArray5);
                    } else {
                        jSONArray2.put(a(string, jSONArray5));
                    }
                    try {
                        if (!d9.h.Z.equals(string)) {
                            string = string.substring(0, string.indexOf(40)).trim();
                        }
                    } catch (Throwable unused3) {
                    }
                    String str2 = string;
                    if (!a(str2)) {
                        try {
                            iArrB = b(jSONArray5);
                        } catch (IllegalArgumentException e3) {
                            com.apm.insight.c.a();
                            com.apm.insight.runtime.j.a(e3, "NPTH_CATCH");
                            iArrB = null;
                        } catch (Throwable unused4) {
                            iArrB = null;
                        }
                        if (iArrB != null) {
                            int i8 = iArrB[0];
                            if (i8 > iArr[0]) {
                                iArr[0] = i8;
                                this.f9989i = str2;
                            }
                            int i9 = iArrB[1];
                            if (i9 > iArr[1]) {
                                iArr[1] = i9;
                                this.j = str2;
                            }
                            int i10 = iArrB[i4];
                            if (i10 > iArr[i4]) {
                                iArr[i4] = i10;
                                this.k = str2;
                            }
                        }
                    }
                }
                String strSubstring = strOptString.substring(1, strOptString.indexOf(34, 1));
                if (d9.h.Z.equals(strSubstring)) {
                    i2 = i4;
                    string = strSubstring;
                } else {
                    StringBuilder sbX = android.support.v4.media.a.x(strSubstring, "  (");
                    i2 = i4;
                    sbX.append(strOptString.substring(strOptString.indexOf(34, i2) + 1));
                    sbX.append(" )");
                    string = sbX.toString();
                }
                if (jSONArray5.length() > 0) {
                    jSONArray5 = new JSONArray();
                }
                jSONArray5.put(strOptString);
            } else {
                i2 = i4;
                if (TextUtils.isEmpty(string)) {
                    jSONArray3.put(strOptString);
                } else {
                    jSONArray5.put(strOptString);
                }
            }
        }
        if (jSONArray2.length() > 0) {
            this.m = jSONArray3;
            try {
                JSONObject jSONObject = new JSONObject();
                this.f9991n = jSONObject;
                jSONObject.put("thread_all_count", jSONArray2.length());
                this.f9991n.put("thread_stacks", jSONArray2);
            } catch (JSONException e4) {
                e4.printStackTrace();
            }
        }
    }

    private int[] b(JSONArray jSONArray) throws IllegalArgumentException {
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            String strOptString = jSONArray.optString(i2);
            int iIndexOf = (strOptString == null || strOptString.isEmpty()) ? -1 : strOptString.indexOf("utm=");
            if (iIndexOf > 0) {
                if (this.C == null) {
                    this.C = Pattern.compile("[^0-9]+");
                }
                String[] strArrSplit = this.C.split(strOptString.substring(iIndexOf));
                if (strArrSplit == null || strArrSplit.length < 2) {
                    return null;
                }
                try {
                    int iIntValue = Integer.decode(strArrSplit[1]).intValue();
                    int iIntValue2 = Integer.decode(strArrSplit[2]).intValue();
                    return new int[]{iIntValue, iIntValue2, iIntValue + iIntValue2};
                } catch (Throwable unused) {
                    throw new IllegalArgumentException("Err stack line: ".concat(strOptString));
                }
            }
        }
        return null;
    }

    private static String b(float f) {
        return a(f / 100.0f);
    }

    private static void b(String str, JSONArray jSONArray) {
        for (ICrashCallback iCrashCallback : l.a().e()) {
            try {
                if (iCrashCallback instanceof com.apm.insight.b) {
                    ((com.apm.insight.b) iCrashCallback).a(CrashType.ANR, str, (Thread) null, jSONArray);
                } else {
                    iCrashCallback.onCrash(CrashType.ANR, str, null);
                }
            } catch (Throwable th) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
            }
        }
    }

    private boolean a(String str) {
        if (this.f9983B == null) {
            JSONArray jSONArrayB = com.apm.insight.runtime.a.b();
            if (jSONArrayB != null) {
                this.f9983B = new LinkedList();
                this.f9990l = jSONArrayB.optString(0);
                for (int i2 = 1; i2 < jSONArrayB.length(); i2++) {
                    try {
                        this.f9983B.add(Pattern.compile(jSONArrayB.optString(i2)));
                    } catch (Throwable unused) {
                    }
                }
            }
            if (this.f9983B == null) {
                LinkedList linkedList = new LinkedList();
                this.f9983B = linkedList;
                linkedList.add(Pattern.compile("^main$"));
                this.f9983B.add(Pattern.compile("^default_npth_thread$"));
                this.f9983B.add(Pattern.compile("^RenderThread$"));
                this.f9983B.add(Pattern.compile("^Jit thread pool worker thread.*$"));
            }
        }
        Iterator<Pattern> it = this.f9983B.iterator();
        while (it.hasNext()) {
            if (it.next().matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    private JSONObject a(String str, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArrayB = com.apm.insight.a.b(jSONArray);
        if (jSONArrayB.length() != jSONArray.length()) {
            this.o++;
        }
        try {
            jSONObject.put("thread_name", str);
            jSONObject.put("thread_stack", jSONArrayB);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0248  */
    /* JADX WARN: Code duplicated, block: B:129:0x024b A[PHI: r28 r29
  0x024b: PHI (r28v3 java.lang.String[]) = (r28v2 java.lang.String[]), (r28v8 java.lang.String[]) binds: [B:127:0x0246, B:117:0x0217] A[DONT_GENERATE, DONT_INLINE]
  0x024b: PHI (r29v3 char) = (r29v2 char), (r29v10 char) binds: [B:127:0x0246, B:117:0x0217] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:131:0x0255  */
    /* JADX WARN: Code duplicated, block: B:132:0x0258 A[PHI: r28 r29
  0x0258: PHI (r28v4 java.lang.String[]) = (r28v3 java.lang.String[]), (r28v8 java.lang.String[]) binds: [B:130:0x0253, B:116:0x0214] A[DONT_GENERATE, DONT_INLINE]
  0x0258: PHI (r29v4 char) = (r29v3 char), (r29v11 char) binds: [B:130:0x0253, B:116:0x0214] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:134:0x0260  */
    /* JADX WARN: Code duplicated, block: B:135:0x0262 A[PHI: r28 r29
  0x0262: PHI (r28v7 java.lang.String[]) = (r28v4 java.lang.String[]), (r28v8 java.lang.String[]) binds: [B:133:0x025e, B:114:0x0210] A[DONT_GENERATE, DONT_INLINE]
  0x0262: PHI (r29v7 char) = (r29v4 char), (r29v12 char) binds: [B:133:0x025e, B:114:0x0210] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:137:0x026a  */
    /* JADX WARN: Code duplicated, block: B:140:0x0271  */
    /* JADX WARN: Code duplicated, block: B:145:0x0294  */
    /* JADX WARN: Code duplicated, block: B:146:0x0295 A[Catch: all -> 0x02a9, TryCatch #1 {all -> 0x02a9, blocks: (B:143:0x0283, B:147:0x029e, B:146:0x0295), top: B:226:0x0283 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:153:0x02c1 A[LOOP:2: B:101:0x01f8->B:153:0x02c1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:155:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:182:0x0368  */
    /* JADX WARN: Code duplicated, block: B:185:0x0378  */
    /* JADX WARN: Code duplicated, block: B:187:0x038a  */
    /* JADX WARN: Code duplicated, block: B:190:0x038f A[LOOP:4: B:188:0x038c->B:190:0x038f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:193:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:201:0x03db A[PHI: r5 r22 r23 r24 r25
  0x03db: PHI (r5v6 java.lang.String) = (r5v5 java.lang.String), (r5v7 java.lang.String), (r5v13 java.lang.String), (r5v28 java.lang.String) binds: [B:199:0x03cc, B:196:0x03ae, B:154:0x02c9, B:15:0x0064] A[DONT_GENERATE, DONT_INLINE]
  0x03db: PHI (r22v3 char) = (r22v1 char), (r22v4 char), (r22v7 char), (r22v8 char) binds: [B:199:0x03cc, B:196:0x03ae, B:154:0x02c9, B:15:0x0064] A[DONT_GENERATE, DONT_INLINE]
  0x03db: PHI (r23v6 int) = (r23v2 int), (r23v7 int), (r23v11 int), (r23v12 int) binds: [B:199:0x03cc, B:196:0x03ae, B:154:0x02c9, B:15:0x0064] A[DONT_GENERATE, DONT_INLINE]
  0x03db: PHI (r24v8 java.util.HashMap) = (r24v4 java.util.HashMap), (r24v9 java.util.HashMap), (r24v14 java.util.HashMap), (r24v24 java.util.HashMap) binds: [B:199:0x03cc, B:196:0x03ae, B:154:0x02c9, B:15:0x0064] A[DONT_GENERATE, DONT_INLINE]
  0x03db: PHI (r25v8 java.util.HashMap) = (r25v4 java.util.HashMap), (r25v9 java.util.HashMap), (r25v14 java.util.HashMap), (r25v22 java.util.HashMap) binds: [B:199:0x03cc, B:196:0x03ae, B:154:0x02c9, B:15:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:237:0x02c9 A[EDGE_INSN: B:237:0x02c9->B:154:0x02c9 BREAK  A[LOOP:2: B:101:0x01f8->B:153:0x02c1], SYNTHETIC] */
    private void a(String str, JSONObject jSONObject) throws JSONException {
        HashMap map;
        HashMap map2;
        float[] fArr;
        int i2;
        char c2;
        String str2;
        char c3;
        boolean z2;
        String str3;
        String str4;
        String strTrim;
        String[] strArrSplit;
        int i3;
        String string;
        HashMap map3;
        String str5;
        int i4;
        int i5;
        String[] strArr;
        String str6;
        float fFloatValue;
        SystemClock.uptimeMillis();
        String[] strArrSplit2 = str.split(IOUtils.LINE_SEPARATOR_UNIX);
        int i6 = 0;
        Float fValueOf = Float.valueOf(-1.0f);
        float[] fArr2 = {-1.0f, -1.0f, -1.0f};
        HashMap map4 = new HashMap();
        HashMap map5 = new HashMap();
        HashMap map6 = new HashMap();
        HashMap map7 = new HashMap();
        HashMap map8 = new HashMap();
        int length = strArrSplit2.length;
        char c4 = 0;
        boolean z3 = false;
        String strTrim2 = "unknown";
        String str7 = strTrim2;
        while (true) {
            if (i6 >= length) {
                map = map5;
                map2 = map7;
                break;
            }
            String strTrim3 = strArrSplit2[i6];
            if (!TextUtils.isEmpty(strTrim3)) {
                fArr = fArr2;
                if (c4 == 0) {
                    c2 = c4;
                    i2 = i6;
                    map = map5;
                    map2 = map7;
                    str2 = strTrim2;
                    String strTrim4 = strTrim3.trim();
                    if (strTrim4.startsWith("tag:")) {
                        strTrim2 = strTrim4.replace("tag:", "").trim();
                        c3 = 4;
                        c4 = 1;
                    } else {
                        strTrim2 = str2;
                        c4 = c2;
                        c3 = 4;
                    }
                } else if (c4 == 1) {
                    c2 = c4;
                    i2 = i6;
                    map = map5;
                    map2 = map7;
                    strTrim3 = strTrim3.trim();
                    String lowerCase = strTrim3.toLowerCase();
                    if (lowerCase.startsWith("shortmsg")) {
                        strTrim3.substring(strTrim3.indexOf(58));
                        z2 = false;
                    } else {
                        if (lowerCase.startsWith("reason:")) {
                            strTrim3.substring(strTrim3.indexOf(58));
                            z2 = true;
                        } else {
                            str2 = strTrim2;
                            if (lowerCase.contains("appfreeze")) {
                                str7 = "AppFreeze";
                                c4 = '\n';
                                strTrim2 = str2;
                            } else {
                                strTrim2 = str2;
                                c4 = c2;
                            }
                        }
                        c3 = 4;
                    }
                    if (lowerCase.contains("input dispatch")) {
                        str4 = "Input dispatching timed out";
                    } else {
                        if (lowerCase.contains("broadcast of intent")) {
                            str4 = "Broadcast of Intent";
                        } else if (lowerCase.contains("executing service")) {
                            str3 = strTrim2;
                            if (!AbstractJsonLexerKt.NULL.equalsIgnoreCase(str3)) {
                                str7 = "executing service";
                                strTrim2 = str3;
                            } else {
                                strTrim2 = strTrim3.substring(strTrim3.indexOf("service ") + 8).trim();
                                str7 = "executing service";
                            }
                        } else {
                            str3 = strTrim2;
                            if (lowerCase.contains("service.startforeground")) {
                                str7 = "not call Service.startForeground";
                                strTrim2 = str3;
                            } else {
                                strTrim2 = str3;
                                str7 = "unknown";
                            }
                        }
                        if (z2) {
                            c3 = 4;
                            c4 = 2;
                        }
                        strTrim = strTrim3.trim();
                        if (strTrim.startsWith("Load:")) {
                            strArrSplit = strTrim.replace("Load:", "").trim().split("/");
                            if (3 == strArrSplit.length) {
                                for (i3 = 0; i3 < strArrSplit.length; i3++) {
                                    fArr[i3] = Float.valueOf(strArrSplit[i3]).floatValue();
                                }
                            }
                            c4 = 3;
                        } else {
                            c4 = c2;
                        }
                        c3 = 4;
                    }
                    str7 = str4;
                    if (z2) {
                        c3 = 4;
                        c4 = 2;
                    }
                    strTrim = strTrim3.trim();
                    if (strTrim.startsWith("Load:")) {
                        strArrSplit = strTrim.replace("Load:", "").trim().split("/");
                        if (3 == strArrSplit.length) {
                            while (i3 < strArrSplit.length) {
                                fArr[i3] = Float.valueOf(strArrSplit[i3]).floatValue();
                            }
                        }
                        c4 = 3;
                    } else {
                        c4 = c2;
                    }
                    c3 = 4;
                } else if (c4 != 2) {
                    if (c4 != 3) {
                        c2 = c4;
                        i2 = i6;
                        map = map5;
                        map2 = map7;
                        str2 = strTrim2;
                    } else {
                        String[] strArrSplit3 = strTrim3.split("\\s");
                        c2 = c4;
                        i2 = i6;
                        if (strArrSplit3.length < 2) {
                            map = map5;
                            map2 = map7;
                        } else {
                            if ("CPU".equalsIgnoreCase(strArrSplit3[0]) && "usage".equalsIgnoreCase(strArrSplit3[1])) {
                                if (strTrim3.contains("ago")) {
                                    z3 = true;
                                }
                                if (map4.isEmpty() && map5.isEmpty() && map6.isEmpty() && map8.isEmpty() && map7.isEmpty()) {
                                    map = map5;
                                    map2 = map7;
                                    c4 = c2;
                                    c3 = 4;
                                }
                            } else if (map4.isEmpty() || map5.isEmpty() || map6.isEmpty() || map8.isEmpty() || map7.isEmpty()) {
                                if (map4.isEmpty() && strArrSplit3[1].equalsIgnoreCase("TOTAL:")) {
                                    string = "";
                                    map3 = map4;
                                } else if (strTrim3.contains(this.f9985b.getPackageName())) {
                                    int i7 = 0;
                                    string = "";
                                    while (i7 < strArrSplit3.length) {
                                        int i8 = i7;
                                        if (strArrSplit3[i7].contains(this.f9985b.getPackageName())) {
                                            StringBuilder sb = new StringBuilder();
                                            String str8 = strArrSplit3[i8];
                                            sb.append(str8.substring(str8.indexOf(47) + 1, strArrSplit3[i8].length() - 1));
                                            sb.append('_');
                                            string = sb.toString();
                                        }
                                        i7 = i8 + 1;
                                        this = this;
                                    }
                                    map3 = map6;
                                } else if (map5.isEmpty() && strTrim3.contains("system_server:")) {
                                    string = "";
                                    map3 = map5;
                                } else if (map8.isEmpty() && strTrim3.contains("kswapd")) {
                                    string = "";
                                    map3 = map8;
                                } else if (!map7.isEmpty() || !strTrim3.contains("dex2oat")) {
                                    string = "";
                                    map3 = null;
                                } else {
                                    string = "";
                                    map3 = map7;
                                }
                                if (map3 != null) {
                                    int i9 = 0;
                                    while (true) {
                                        String str9 = strArrSplit3[i9];
                                        int i10 = i9;
                                        str5 = "%";
                                        if (str9.contains("%")) {
                                            map = map5;
                                            i4 = i10;
                                            break;
                                        }
                                        i4 = i10 + 1;
                                        map = map5;
                                        if (i4 >= strArrSplit3.length) {
                                            break;
                                        }
                                        i9 = i4;
                                        map5 = map;
                                    }
                                    try {
                                        float fFloatValue2 = Float.valueOf(strArrSplit3[i4].replace("%", "")).floatValue();
                                        i5 = i4;
                                        try {
                                            String str10 = string + d9.h.f24727l;
                                            if (map3 != map4) {
                                                fFloatValue2 /= com.apm.insight.l.d.d();
                                            }
                                            map3.put(str10, Float.valueOf(fFloatValue2));
                                        } catch (Throwable unused) {
                                            map3.put(string + d9.h.f24727l, fValueOf);
                                        }
                                    } catch (Throwable unused2) {
                                        i5 = i4;
                                    }
                                    int i11 = i5 + 3;
                                    map2 = map7;
                                    char c5 = 0;
                                    while (i11 < strArrSplit3.length) {
                                        String str11 = "softirq";
                                        if (c5 == 0) {
                                            strArr = strArrSplit3;
                                            if ("user".equalsIgnoreCase(strArr[i11])) {
                                                str11 = "user";
                                                c5 = 1;
                                            }
                                            if (str11 != null) {
                                                fFloatValue = Float.valueOf(strArr[i11 - 1].replace(str5, "")).floatValue();
                                                str6 = str5;
                                                String str12 = string + str11;
                                                if (map3 != map4) {
                                                    fFloatValue /= com.apm.insight.l.d.d();
                                                }
                                                map3.put(str12, Float.valueOf(fFloatValue));
                                            } else {
                                                str6 = str5;
                                            }
                                            if (c5 >= 6) {
                                                break;
                                                break;
                                            } else {
                                                i11 += 3;
                                                str5 = str6;
                                                strArrSplit3 = strArr;
                                            }
                                        } else {
                                            strArr = strArrSplit3;
                                            if (c5 != 1) {
                                                if (c5 == 2) {
                                                    c5 = c5;
                                                    if ("iowait".equalsIgnoreCase(strArr[i11])) {
                                                        str11 = "iowait";
                                                        c5 = 3;
                                                    } else if ("irq".equalsIgnoreCase(strArr[i11])) {
                                                        str11 = "irq";
                                                        c5 = 4;
                                                    } else if ("softirq".equalsIgnoreCase(strArr[i11])) {
                                                        c5 = 5;
                                                    } else if ("softirq".equalsIgnoreCase(strArr[i11])) {
                                                        c5 = 6;
                                                    }
                                                    if (str11 != null) {
                                                        fFloatValue = Float.valueOf(strArr[i11 - 1].replace(str5, "")).floatValue();
                                                        str6 = str5;
                                                        String str13 = string + str11;
                                                        if (map3 != map4) {
                                                            fFloatValue /= com.apm.insight.l.d.d();
                                                        }
                                                        map3.put(str13, Float.valueOf(fFloatValue));
                                                    } else {
                                                        str6 = str5;
                                                    }
                                                    if (c5 >= 6) {
                                                        break;
                                                        break;
                                                    } else {
                                                        i11 += 3;
                                                        str5 = str6;
                                                        strArrSplit3 = strArr;
                                                    }
                                                } else if (c5 == 3) {
                                                    c5 = c5;
                                                    if ("irq".equalsIgnoreCase(strArr[i11])) {
                                                        str11 = "irq";
                                                        c5 = 4;
                                                    } else if ("softirq".equalsIgnoreCase(strArr[i11])) {
                                                        c5 = 5;
                                                    } else if ("softirq".equalsIgnoreCase(strArr[i11])) {
                                                        c5 = 6;
                                                    }
                                                    if (str11 != null) {
                                                        fFloatValue = Float.valueOf(strArr[i11 - 1].replace(str5, "")).floatValue();
                                                        str6 = str5;
                                                        String str14 = string + str11;
                                                        if (map3 != map4) {
                                                            fFloatValue /= com.apm.insight.l.d.d();
                                                        }
                                                        map3.put(str14, Float.valueOf(fFloatValue));
                                                    } else {
                                                        str6 = str5;
                                                    }
                                                    if (c5 >= 6) {
                                                        break;
                                                        break;
                                                    } else {
                                                        i11 += 3;
                                                        str5 = str6;
                                                        strArrSplit3 = strArr;
                                                    }
                                                } else if (c5 == 4) {
                                                    c5 = c5;
                                                    if ("softirq".equalsIgnoreCase(strArr[i11])) {
                                                        c5 = 5;
                                                    } else if ("softirq".equalsIgnoreCase(strArr[i11])) {
                                                        c5 = 6;
                                                    }
                                                    if (str11 != null) {
                                                        fFloatValue = Float.valueOf(strArr[i11 - 1].replace(str5, "")).floatValue();
                                                        str6 = str5;
                                                        String str15 = string + str11;
                                                        if (map3 != map4) {
                                                            fFloatValue /= com.apm.insight.l.d.d();
                                                        }
                                                        map3.put(str15, Float.valueOf(fFloatValue));
                                                    } else {
                                                        str6 = str5;
                                                    }
                                                    if (c5 >= 6) {
                                                        break;
                                                        break;
                                                    } else {
                                                        i11 += 3;
                                                        str5 = str6;
                                                        strArrSplit3 = strArr;
                                                    }
                                                } else {
                                                    c5 = c5;
                                                    if (c5 == 5) {
                                                        if ("softirq".equalsIgnoreCase(strArr[i11])) {
                                                            c5 = 6;
                                                        }
                                                    }
                                                    if (str11 != null) {
                                                        try {
                                                            fFloatValue = Float.valueOf(strArr[i11 - 1].replace(str5, "")).floatValue();
                                                            str6 = str5;
                                                            try {
                                                                String str16 = string + str11;
                                                                if (map3 != map4) {
                                                                    fFloatValue /= com.apm.insight.l.d.d();
                                                                }
                                                                map3.put(str16, Float.valueOf(fFloatValue));
                                                            } catch (Throwable unused3) {
                                                                map3.put(string + str11, fValueOf);
                                                            }
                                                        } catch (Throwable unused4) {
                                                            str6 = str5;
                                                        }
                                                    } else {
                                                        str6 = str5;
                                                    }
                                                    if (c5 >= 6) {
                                                        break;
                                                    }
                                                    i11 += 3;
                                                    str5 = str6;
                                                    strArrSplit3 = strArr;
                                                }
                                            }
                                            c5 = c5;
                                            str11 = null;
                                            if (str11 != null) {
                                                fFloatValue = Float.valueOf(strArr[i11 - 1].replace(str5, "")).floatValue();
                                                str6 = str5;
                                                String str17 = string + str11;
                                                if (map3 != map4) {
                                                    fFloatValue /= com.apm.insight.l.d.d();
                                                }
                                                map3.put(str17, Float.valueOf(fFloatValue));
                                            } else {
                                                str6 = str5;
                                            }
                                            if (c5 >= 6) {
                                                break;
                                                break;
                                            } else {
                                                i11 += 3;
                                                str5 = str6;
                                                strArrSplit3 = strArr;
                                            }
                                        }
                                        if ("kernel".equalsIgnoreCase(strArr[i11])) {
                                            str11 = "kernel";
                                            c5 = 2;
                                        } else if ("iowait".equalsIgnoreCase(strArr[i11])) {
                                            str11 = "iowait";
                                            c5 = 3;
                                        } else if ("irq".equalsIgnoreCase(strArr[i11])) {
                                            str11 = "irq";
                                            c5 = 4;
                                        } else if ("softirq".equalsIgnoreCase(strArr[i11])) {
                                            c5 = 5;
                                        } else if ("softirq".equalsIgnoreCase(strArr[i11])) {
                                            c5 = 6;
                                        } else {
                                            c5 = c5;
                                            str11 = null;
                                        }
                                        if (str11 != null) {
                                            fFloatValue = Float.valueOf(strArr[i11 - 1].replace(str5, "")).floatValue();
                                            str6 = str5;
                                            String str18 = string + str11;
                                            if (map3 != map4) {
                                                fFloatValue /= com.apm.insight.l.d.d();
                                            }
                                            map3.put(str18, Float.valueOf(fFloatValue));
                                        } else {
                                            str6 = str5;
                                        }
                                        if (c5 >= 6) {
                                            break;
                                            break;
                                        } else {
                                            i11 += 3;
                                            str5 = str6;
                                            strArrSplit3 = strArr;
                                        }
                                    }
                                } else {
                                    map = map5;
                                    map2 = map7;
                                }
                            }
                            map = map5;
                            map2 = map7;
                            c3 = 4;
                            c4 = 4;
                        }
                        str2 = strTrim2;
                    }
                    strTrim2 = str2;
                    c4 = c2;
                    c3 = 4;
                } else {
                    c2 = c4;
                    i2 = i6;
                    map = map5;
                    map2 = map7;
                    strTrim = strTrim3.trim();
                    if (strTrim.startsWith("Load:")) {
                        strArrSplit = strTrim.replace("Load:", "").trim().split("/");
                        if (3 == strArrSplit.length) {
                            while (i3 < strArrSplit.length) {
                                fArr[i3] = Float.valueOf(strArrSplit[i3]).floatValue();
                            }
                        }
                        c4 = 3;
                    } else {
                        c4 = c2;
                    }
                    c3 = 4;
                }
                if (c4 >= c3) {
                    break;
                }
            } else {
                fArr = fArr2;
                i2 = i6;
                map = map5;
                map2 = map7;
            }
            i6 = i2 + 1;
            strArrSplit2 = strArrSplit2;
            fArr2 = fArr;
            map7 = map2;
            map5 = map;
        }
        String str19 = str7;
        jSONObject.put("anr_tag", strTrim2);
        jSONObject.put("anr_has_ago", String.valueOf(z3));
        jSONObject.put("anr_reason", str19);
        a(map6, jSONObject, "app");
        a(map4, jSONObject, d9.h.f24727l);
        if (map.isEmpty()) {
            jSONObject.put("npth_anr_systemserver_total", "not found");
        } else {
            jSONObject.put("npth_anr_systemserver_total", b(com.apm.insight.l.c.AnonymousClass1.a(map).floatValue()));
        }
        if (map8.isEmpty()) {
            jSONObject.put("npth_anr_kswapd_total", "not found");
        } else {
            jSONObject.put("npth_anr_kswapd_total", b(com.apm.insight.l.c.AnonymousClass1.a(map8).floatValue()));
        }
        if (map2.isEmpty()) {
            jSONObject.put("npth_anr_dex2oat_total", "not found");
        } else {
            jSONObject.put("npth_anr_dex2oat_total", b(com.apm.insight.l.c.AnonymousClass1.a(map2).floatValue()));
        }
    }

    private static void a(HashMap<String, Float> map, JSONObject jSONObject, String str) throws JSONException {
        String strConcat = "npth_anr_".concat(String.valueOf(str));
        if (map.isEmpty()) {
            jSONObject.put(strConcat + "_total", "not found");
            return;
        }
        float fFloatValue = 0.0f;
        float fFloatValue2 = 0.0f;
        float fFloatValue3 = 0.0f;
        float fFloatValue4 = 0.0f;
        float fFloatValue5 = 0.0f;
        for (Map.Entry<String, Float> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key.endsWith("user")) {
                fFloatValue += entry.getValue().floatValue();
            } else if (key.endsWith("kernel")) {
                fFloatValue2 += entry.getValue().floatValue();
            } else if (key.endsWith("iowait")) {
                fFloatValue3 += entry.getValue().floatValue();
            } else if (key.endsWith("irq")) {
                fFloatValue4 += entry.getValue().floatValue();
            } else if (key.endsWith("softirq")) {
                fFloatValue5 = entry.getValue().floatValue() + fFloatValue5;
            }
        }
        float f = fFloatValue + fFloatValue2 + fFloatValue3 + fFloatValue4 + fFloatValue5;
        jSONObject.put(android.support.v4.media.a.m(strConcat, "_total"), b(f));
        jSONObject.put(strConcat + "_kernel_user_ratio", a(fFloatValue2, f));
        jSONObject.put(strConcat + "_iowait_user_ratio", a(fFloatValue3, f));
    }

    private static String a(float f, float f2) {
        if (f2 > 0.0f) {
            return a(f / f2);
        }
        return f > 0.0f ? "100%" : "0%";
    }

    private static String a(float f) {
        if (f <= 0.0f) {
            return "0%";
        }
        if (f <= 0.1f) {
            return "0% - 10%";
        }
        if (f <= 0.3f) {
            return "10% - 30%";
        }
        if (f <= 0.6f) {
            return "30% - 60%";
        }
        if (f <= 0.9f) {
            return "60% - 90%";
        }
        return "90% - 100%";
    }
}
