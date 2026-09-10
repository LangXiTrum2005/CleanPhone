package com.mbridge.msdk.foundation.same.report.crashreport;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.tools.q0;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class e implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile e f33919d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33920a = "CrashHandlerUtil";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f33921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakReference<Context> f33922c;

    private e(Context context) {
        this.f33922c = new WeakReference<>(context);
    }

    public static e a(Context context) {
        if (f33919d == null) {
            synchronized (e.class) {
                try {
                    if (f33919d == null) {
                        f33919d = new e(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f33919d;
    }

    private void b(Thread thread, Throwable th2) {
        try {
            List<String> listA = b.a();
            StackTraceElement[] stackTrace = th2.getStackTrace();
            StringBuilder sb2 = new StringBuilder();
            String str = th2.getClass() + ": " + th2.getMessage();
            sb2.append(str);
            sb2.append("\n");
            boolean zA = a(listA, str);
            int i10 = 0;
            for (int i11 = 0; i11 < stackTrace.length; i11++) {
                String string = stackTrace[i11].toString();
                if (a(listA, string)) {
                    zA = true;
                    if (i11 == 0) {
                        i10 = 1;
                    }
                }
                sb2.append(string);
                sb2.append("\n");
            }
            if (zA && sb2.length() >= 1) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(X3.i.W, "2000052");
                jSONObject.put("crash_first_index_from_mtg", i10);
                JSONObject jSONObjectA = a(String.valueOf(System.currentTimeMillis()));
                jSONObjectA.put("crashinfo", sb2.toString());
                jSONObject.put("exception", jSONObjectA);
                if (jSONObject.length() > 0) {
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
                }
                try {
                    Thread.sleep(500L);
                    return;
                } catch (InterruptedException e10) {
                    q0.b("CrashHandlerUtil", e10.getMessage());
                    return;
                }
            }
            a(thread, th2);
        } catch (Throwable th3) {
            a(thread, th2);
            q0.b("CrashHandlerUtil", th3.getMessage());
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        if (th2 != null) {
            try {
                b(thread, th2);
            } catch (Throwable th3) {
                q0.b("CrashHandlerUtil", th3.getMessage());
            }
        }
        a(thread, th2);
    }

    public void a() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        this.f33921b = defaultUncaughtExceptionHandler;
        if (defaultUncaughtExceptionHandler instanceof e) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public JSONObject a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f33922c.get() == null) {
                return jSONObject;
            }
            float fMaxMemory = (float) ((Runtime.getRuntime().maxMemory() * 1.0d) / 1048576.0d);
            float f10 = (float) ((Runtime.getRuntime().totalMemory() * 1.0d) / 1048576.0d);
            float fFreeMemory = (float) ((Runtime.getRuntime().freeMemory() * 1.0d) / 1048576.0d);
            jSONObject.put("max_memory", String.valueOf(fMaxMemory));
            jSONObject.put("memoryby_app", String.valueOf(f10));
            jSONObject.put("remaining_memory", fFreeMemory);
            jSONObject.put("crashtime", str);
            return jSONObject;
        } catch (Throwable th2) {
            q0.b("CrashHandlerUtil", th2.getMessage());
            return jSONObject;
        }
    }

    private boolean a(List<String> list, String str) {
        if (list == null || list.isEmpty() || TextUtils.isEmpty(str)) {
            return false;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    private void a(Thread thread, Throwable th2) {
        try {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f33921b;
            if (uncaughtExceptionHandler != null) {
                if (uncaughtExceptionHandler instanceof e) {
                    return;
                }
                uncaughtExceptionHandler.uncaughtException(thread, th2);
            } else {
                Process.killProcess(Process.myPid());
                System.exit(1);
            }
        } catch (Throwable th3) {
            q0.b("CrashHandlerUtil", th3.getMessage());
        }
    }
}
