package com.apm.insight.f;

import android.text.TextUtils;
import com.apm.insight.CrashType;
import com.apm.insight.entity.c;
import com.apm.insight.k.g;
import com.apm.insight.runtime.a.f;
import com.apm.insight.runtime.m;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f10096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f10097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f10098c;
    private boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f10099e;
    private String f;
    private String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<String> f10100h;

    public final JSONObject b() {
        return this.f10097b;
    }

    public final String c() {
        return this.f10098c;
    }

    public final String d() {
        return this.f10099e;
    }

    public final String e() {
        return this.f;
    }

    public final String f() {
        return this.g;
    }

    public final List<String> g() {
        return this.f10100h;
    }

    public static void a(final Throwable th, final String str, final String str2) {
        try {
            m.a().a(new Runnable() { // from class: com.apm.insight.f.b.1

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private /* synthetic */ boolean f10103c = true;
                private /* synthetic */ Map d = null;

                @Override // java.lang.Runnable
                public final void run() {
                    b.a(null, th, str, this.f10103c, null, "EnsureNotReachHere", str2);
                }
            });
        } catch (Throwable unused) {
        }
    }

    public final void b(String str) {
        this.f10098c = str;
    }

    public final void c(String str) {
        this.f10099e = str;
    }

    public final void d(String str) {
        this.f = str;
    }

    public final void e(String str) {
        this.g = str;
    }

    public static void a(final Object obj, final Throwable th, final String str, final String str2, final String str3) {
        try {
            m.a().a(new Runnable() { // from class: com.apm.insight.f.b.2
                private /* synthetic */ boolean d = true;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private /* synthetic */ Map f10108e = null;

                @Override // java.lang.Runnable
                public final void run() {
                    b.a(obj, th, str, this.d, null, str2, str3);
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(Object obj, Throwable th, String str, boolean z2, Map<String, String> map, String str2, String str3) {
        if (th == null) {
            return;
        }
        try {
            StackTraceElement[] stackTrace = th.getStackTrace();
            StackTraceElement stackTraceElement = stackTrace[0];
            if (stackTraceElement == null) {
                return;
            }
            String strA = com.apm.insight.l.m.a(th);
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            c cVarA = c.a(stackTraceElement, strA, str, Thread.currentThread().getName(), z2, str2, str3);
            if (obj != null) {
                cVarA.a("exception_line_num", (Object) com.apm.insight.entity.b.a(obj, th, stackTrace));
            }
            a(null, cVarA);
            f.a().a(CrashType.ENSURE, cVarA);
            g.a(obj, cVarA);
            com.apm.insight.a.b((Object) "[reportException] ".concat(String.valueOf(str)));
        } catch (Throwable th2) {
            com.apm.insight.a.b(th2);
        }
    }

    public static void a(final StackTraceElement[] stackTraceElementArr, final String str, final String str2) {
        try {
            m.a().a(new Runnable() { // from class: com.apm.insight.f.b.3

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private /* synthetic */ int f10110b = 5;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private /* synthetic */ Map f10112e = null;

                @Override // java.lang.Runnable
                public final void run() {
                    b.a(stackTraceElementArr, this.f10110b, str, str2, "core_exception_monitor", (Map) null);
                }
            });
        } catch (Throwable unused) {
        }
    }

    private static void a(Map<String, String> map, c cVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (map != null) {
                for (String str : map.keySet()) {
                    jSONObject.put(str, map.get(str));
                }
                cVar.a("custom", jSONObject);
            }
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ void a(StackTraceElement[] stackTraceElementArr, int i2, String str, String str2, String str3, Map map) {
        StackTraceElement stackTraceElement;
        String string;
        if (stackTraceElementArr != null) {
            try {
                if (stackTraceElementArr.length > i2 + 1 && (stackTraceElement = stackTraceElementArr[i2]) != null) {
                    if (stackTraceElementArr.length <= 0) {
                        string = null;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        while (i2 < stackTraceElementArr.length) {
                            com.apm.insight.l.m.a(stackTraceElementArr[i2], sb);
                            i2++;
                        }
                        string = sb.toString();
                    }
                    if (TextUtils.isEmpty(string)) {
                        return;
                    }
                    c cVarA = c.a(stackTraceElement, string, str, Thread.currentThread().getName(), true, str2, str3);
                    a(null, cVarA);
                    f.a().a(CrashType.ENSURE, cVarA);
                    g.a(cVarA);
                    com.apm.insight.a.b((Object) "[report] ".concat(String.valueOf(str)));
                }
            } catch (Throwable th) {
                com.apm.insight.a.b(th);
            }
        }
    }

    public final String a() {
        return this.f10096a;
    }

    public final void a(String str) {
        this.f10096a = str;
    }

    public final void a(JSONObject jSONObject) {
        this.f10097b = jSONObject;
    }

    public final void a(boolean z2) {
        this.d = z2;
    }

    public final void a(List<String> list) {
        this.f10100h = list;
    }
}
