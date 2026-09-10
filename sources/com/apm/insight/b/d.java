package com.apm.insight.b;

import android.app.ActivityManager;
import android.content.Context;
import android.os.FileObserver;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.apm.insight.l.m;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f10002a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f10003b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f10004c = false;
    private static FileObserver d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static ActivityManager.ProcessErrorStateInfo f10005e;

    public static boolean b() {
        return f10004c;
    }

    public static void c() {
        f10005e = null;
    }

    public static void a(final String str, final h.a aVar) {
        FileObserver fileObserver = d;
        if (fileObserver != null) {
            fileObserver.stopWatching();
        }
        FileObserver fileObserver2 = new FileObserver(str) { // from class: com.apm.insight.b.d.1
            @Override // android.os.FileObserver
            public final void onEvent(int i2, String str2) {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                try {
                    String unused = d.f10002a = aVar.a();
                } catch (Throwable th) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                }
            }
        };
        d = fileObserver2;
        fileObserver2.startWatching();
    }

    public static JSONObject a() throws JSONException {
        try {
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("thread_number", 1);
            jSONObject.put("mainStackFromTrace", m.a(stackTrace));
            return jSONObject;
        } catch (Throwable th) {
            com.apm.insight.c.a();
            com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
            return null;
        }
    }

    public static String a(Context context) {
        if (SystemClock.uptimeMillis() - f10003b < 5000) {
            return null;
        }
        try {
            ActivityManager.ProcessErrorStateInfo processErrorStateInfoA = com.apm.insight.l.a.a(context);
            if (processErrorStateInfoA != null && Process.myPid() == processErrorStateInfoA.pid) {
                ActivityManager.ProcessErrorStateInfo processErrorStateInfo = f10005e;
                if (processErrorStateInfo != null && String.valueOf(processErrorStateInfo.condition).equals(String.valueOf(processErrorStateInfoA.condition)) && String.valueOf(processErrorStateInfo.processName).equals(String.valueOf(processErrorStateInfoA.processName)) && String.valueOf(processErrorStateInfo.pid).equals(String.valueOf(processErrorStateInfoA.pid)) && String.valueOf(processErrorStateInfo.uid).equals(String.valueOf(processErrorStateInfoA.uid)) && String.valueOf(processErrorStateInfo.tag).equals(String.valueOf(processErrorStateInfoA.tag)) && String.valueOf(processErrorStateInfo.shortMsg).equals(String.valueOf(processErrorStateInfoA.shortMsg)) && String.valueOf(processErrorStateInfo.longMsg).equals(String.valueOf(processErrorStateInfoA.longMsg))) {
                    return null;
                }
                f10005e = processErrorStateInfoA;
                f10002a = null;
                f10003b = SystemClock.uptimeMillis();
                f10004c = false;
                if (!com.apm.insight.e.t()) {
                    return "|------------- processErrorStateInfo--------------|\ndisable anr info\n\"-----------------------end----------------------------\"";
                }
                StringBuilder sb = new StringBuilder("|------------- processErrorStateInfo--------------|\n");
                sb.append("condition: " + processErrorStateInfoA.condition + IOUtils.LINE_SEPARATOR_UNIX);
                sb.append("processName: " + processErrorStateInfoA.processName + IOUtils.LINE_SEPARATOR_UNIX);
                sb.append("pid: " + processErrorStateInfoA.pid + IOUtils.LINE_SEPARATOR_UNIX);
                sb.append("uid: " + processErrorStateInfoA.uid + IOUtils.LINE_SEPARATOR_UNIX);
                sb.append("tag: " + processErrorStateInfoA.tag + IOUtils.LINE_SEPARATOR_UNIX);
                sb.append("shortMsg : " + processErrorStateInfoA.shortMsg + IOUtils.LINE_SEPARATOR_UNIX);
                sb.append("longMsg : " + processErrorStateInfoA.longMsg + IOUtils.LINE_SEPARATOR_UNIX);
                sb.append("-----------------------end----------------------------");
                return sb.toString();
            }
        } catch (Throwable unused) {
        }
        String str = f10002a;
        if (str == null) {
            return null;
        }
        f10004c = true;
        f10002a = null;
        f10003b = SystemClock.uptimeMillis();
        return str;
    }
}
