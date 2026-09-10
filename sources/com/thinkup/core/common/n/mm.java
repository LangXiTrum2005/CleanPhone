package com.thinkup.core.common.n;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Process;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.model.a;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import com.thinkup.core.common.ooo.onm;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class mm implements Thread.UncaughtExceptionHandler {
    private static final String mm = "1";
    private static final int mn = 4;
    private static final String mo = "0";
    private static volatile boolean n0 = false;
    private static volatile mm o0;
    private Thread.UncaughtExceptionHandler m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Context f41888n;
    private final String oo = "crash_type";
    private final String om = "crash_msg";
    private final String on = "psid";
    private final String m0 = "crash_sdk_type";
    String o = "com.thinkup";

    private mm(Context context) {
        this.f41888n = context;
    }

    private String m() {
        try {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            HashMap map = new HashMap(4);
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it = allStackTraces.entrySet().iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Thread key = it.next().getKey();
                if (key.getName().startsWith(mo.o0m)) {
                    String str = key.getName() + TokenBuilder.TOKEN_DELIMITER + key.getState();
                    if (map.containsKey(str)) {
                        map.put(str, Integer.valueOf(((Integer) map.get(str)).intValue() + 1));
                    } else {
                        map.put(str, 1);
                    }
                    i2++;
                }
            }
            try {
                JSONObject jSONObject = new JSONObject(map);
                jSONObject.put("thinkup_thread_count", i2);
                try {
                    ActivityManager activityManager = (ActivityManager) this.f41888n.getSystemService("activity");
                    Debug.MemoryInfo[] processMemoryInfo = activityManager.getProcessMemoryInfo(new int[]{Process.myPid()});
                    if (processMemoryInfo.length > 0) {
                        jSONObject.put("app_memory", (processMemoryInfo[0].getTotalPss() / 1024) + "MB");
                    }
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    activityManager.getMemoryInfo(memoryInfo);
                    jSONObject.put("sys_total_memory", (memoryInfo.totalMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) + "MB");
                    jSONObject.put("sys_avail_memory", (memoryInfo.availMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) + "MB");
                } catch (Throwable unused) {
                }
                return jSONObject.toString();
            } catch (Throwable th) {
                return th.getMessage();
            }
        } catch (Throwable th2) {
            return th2.getMessage();
        }
    }

    private void n() {
        Map<String, ?> mapM = onm.m(this.f41888n, oo0.m.oo);
        Iterator<?> it = mapM.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String string = next != null ? next.toString() : "";
            if (!TextUtils.isEmpty(string)) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    com.thinkup.core.common.oo0.oo.m(jSONObject.optString("crash_type"), jSONObject.optString("crash_msg"), jSONObject.optString("psid"), jSONObject.optString("crash_sdk_type"));
                } catch (Exception unused) {
                }
            }
        }
        if (mapM.size() > 0) {
            onm.o(this.f41888n, oo0.m.oo);
        }
    }

    public static mm o(Context context) {
        if (o0 == null) {
            synchronized (mm.class) {
                try {
                    if (o0 == null) {
                        o0 = new mm(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return o0;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        if (th != null) {
            try {
                if (n0) {
                    return;
                }
                n0 = true;
                try {
                    String strM = m(th);
                    if (o(strM)) {
                        String strM2 = m(strM);
                        String strN = n(strM);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("crash_type", URLEncoder.encode(strM2));
                        jSONObject.put("crash_msg", URLEncoder.encode(m() + IOUtils.LINE_SEPARATOR_UNIX + strM));
                        jSONObject.put("psid", o0n.m().o0m());
                        jSONObject.put("crash_sdk_type", strN);
                        onm.o(this.f41888n, oo0.m.oo, System.currentTimeMillis() + "_crash", jSONObject.toString());
                    }
                } catch (Throwable unused) {
                }
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.m;
                if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == this || (uncaughtExceptionHandler instanceof mm)) {
                    return;
                }
                uncaughtExceptionHandler.uncaughtException(thread, th);
            } catch (Exception unused2) {
            }
        }
    }

    public final void o() {
        com.thinkup.core.oo.m mVarH = a.h(com.thinkup.core.oo.o0.o(this.f41888n));
        if (mVarH == null || mVarH.ono() != 0) {
            try {
                Map<String, ?> mapM = onm.m(this.f41888n, oo0.m.oo);
                Iterator<?> it = mapM.values().iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    String string = next != null ? next.toString() : "";
                    if (!TextUtils.isEmpty(string)) {
                        try {
                            JSONObject jSONObject = new JSONObject(string);
                            com.thinkup.core.common.oo0.oo.m(jSONObject.optString("crash_type"), jSONObject.optString("crash_msg"), jSONObject.optString("psid"), jSONObject.optString("crash_sdk_type"));
                        } catch (Exception unused) {
                        }
                    }
                }
                if (mapM.size() > 0) {
                    onm.o(this.f41888n, oo0.m.oo);
                }
                if (!(Thread.getDefaultUncaughtExceptionHandler() instanceof mm)) {
                    this.m = Thread.getDefaultUncaughtExceptionHandler();
                }
                Thread.setDefaultUncaughtExceptionHandler(this);
            } catch (Exception unused2) {
            }
        }
    }

    private String n(String str) {
        String str2 = this.o;
        if (!TextUtils.isEmpty(str) && str.contains(str2)) {
            try {
                for (String str3 : str.split("Caused by:")) {
                    if (str3.contains(str2)) {
                        String[] strArrSplit = str3.split("\\n");
                        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                            if (strArrSplit[i2].contains(str2) && i2 <= 4) {
                                return "1";
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return "0";
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0050 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:26:0x004b, B:28:0x0050), top: B:40:0x004b }] */
    /* JADX WARN: Code duplicated, block: B:34:0x005c A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #7 {all -> 0x005f, blocks: (B:32:0x0057, B:34:0x005c), top: B:44:0x0057 }] */
    private static String m(Throwable th) throws Throwable {
        PrintWriter printWriter;
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = null;
        try {
            for (Throwable th2 = new Throwable(com.thinkup.core.common.ooo.nn.o(), th); th2 != null; th2 = th2.getCause()) {
                if (th2 instanceof UnknownHostException) {
                    return "";
                }
            }
            StringWriter stringWriter2 = new StringWriter();
            try {
                printWriter = new PrintWriter(stringWriter2);
                try {
                    th.printStackTrace(printWriter);
                    printWriter.flush();
                    printWriter.close();
                    stringWriter2.close();
                    String string = stringWriter2.toString();
                    try {
                        stringWriter2.close();
                        stringWriter2.close();
                    } catch (Throwable unused) {
                    }
                    return string;
                } catch (Exception unused2) {
                    stringWriter = stringWriter2;
                    if (stringWriter != null) {
                        try {
                            stringWriter.close();
                            if (printWriter != null) {
                                stringWriter.close();
                            }
                        } catch (Throwable unused3) {
                            return "";
                        }
                    } else if (printWriter != null) {
                        stringWriter.close();
                    }
                    return "";
                } catch (Throwable th3) {
                    th = th3;
                    stringWriter = stringWriter2;
                    if (stringWriter != null) {
                        try {
                            stringWriter.close();
                            if (printWriter != null) {
                                stringWriter.close();
                            }
                        } catch (Throwable unused4) {
                            throw th;
                        }
                    } else if (printWriter != null) {
                        stringWriter.close();
                    }
                    throw th;
                }
            } catch (Exception unused5) {
                printWriter = null;
            } catch (Throwable th4) {
                th = th4;
                printWriter = null;
            }
        } catch (Exception unused6) {
            printWriter = null;
        } catch (Throwable th5) {
            th = th5;
            printWriter = null;
        }
    }

    private void o(Throwable th) {
        try {
            String strM = m(th);
            if (o(strM)) {
                String strM2 = m(strM);
                String strN = n(strM);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("crash_type", URLEncoder.encode(strM2));
                jSONObject.put("crash_msg", URLEncoder.encode(m() + IOUtils.LINE_SEPARATOR_UNIX + strM));
                jSONObject.put("psid", o0n.m().o0m());
                jSONObject.put("crash_sdk_type", strN);
                onm.o(this.f41888n, oo0.m.oo, System.currentTimeMillis() + "_crash", jSONObject.toString());
            }
        } catch (Throwable unused) {
        }
    }

    private boolean o(String str) {
        com.thinkup.core.oo.m mVarH = a.h(com.thinkup.core.oo.o0.o(this.f41888n));
        if (mVarH != null) {
            if (mVarH.ono() == 0) {
                return false;
            }
            String strOnn = mVarH.onn();
            try {
                if (TextUtils.isEmpty(strOnn)) {
                    return true;
                }
                JSONArray jSONArray = new JSONArray(strOnn);
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    if (str.contains(jSONArray.optString(i2))) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        } else if (str.contains(this.o)) {
            return true;
        }
        return false;
    }

    private static String m(String str) {
        String strGroup;
        try {
            Matcher matcher = Pattern.compile(".*?(Exception|Error|Death)", 2).matcher(str);
            if (!matcher.find()) {
                strGroup = "";
            } else {
                strGroup = matcher.group(0);
            }
            try {
                return !TextUtils.isEmpty(strGroup) ? strGroup.replaceAll("Caused by:", "").replaceAll(" ", "") : strGroup;
            } catch (Exception unused) {
                return strGroup;
            }
        } catch (Exception unused2) {
            return "";
        }
    }
}
