package com.smartdigimkt.n8;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Process;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
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

/* JADX INFO: loaded from: classes4.dex */
public class i implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile i f37200h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f37201i = "0";
    private static final String j = "1";
    private static final int k = 4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static volatile boolean f37202l = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f37203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f37204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f37205c = "crash_type";
    private final String d = "crash_msg";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f37206e = "psid";
    private final String f = "crash_sdk_type";
    String g = "com.sdm";

    private i(Context context) {
        this.f37204b = context;
    }

    public static i a(Context context) {
        if (f37200h == null) {
            synchronized (i.class) {
                try {
                    if (f37200h == null) {
                        f37200h = new i(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f37200h;
    }

    private boolean c(String str) {
        com.smartdigimkt.l8.a aVarB = com.smartdigimkt.k8.a.e().b();
        if (aVarB != null) {
            if (aVarB.B() == 0) {
                return false;
            }
            String strA = aVarB.A();
            try {
                if (TextUtils.isEmpty(strA)) {
                    return true;
                }
                JSONArray jSONArray = new JSONArray(strA);
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    if (str.contains(jSONArray.optString(i2))) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        } else if (str.contains(this.g)) {
            return true;
        }
        return false;
    }

    public void b() {
        com.smartdigimkt.l8.a aVarB = com.smartdigimkt.k8.a.e().b();
        if (aVarB == null || aVarB.B() != 0) {
            try {
                c();
                if (!(Thread.getDefaultUncaughtExceptionHandler() instanceof i)) {
                    this.f37203a = Thread.getDefaultUncaughtExceptionHandler();
                }
                Thread.setDefaultUncaughtExceptionHandler(this);
            } catch (Exception unused) {
            }
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        if (th != null) {
            try {
                if (f37202l) {
                    return;
                }
                f37202l = true;
                b(th);
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f37203a;
                if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == this || (uncaughtExceptionHandler instanceof i)) {
                    return;
                }
                uncaughtExceptionHandler.uncaughtException(thread, th);
            } catch (Exception unused) {
            }
        }
    }

    private String a() {
        try {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            HashMap map = new HashMap(4);
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it = allStackTraces.entrySet().iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Thread key = it.next().getKey();
                if (key.getName().startsWith("sdm")) {
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
                jSONObject.put("sdm_thread_count", i2);
                try {
                    ActivityManager activityManager = (ActivityManager) this.f37204b.getSystemService("activity");
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

    private void b(Throwable th) {
        try {
            String strA = a(th);
            if (c(strA)) {
                String strA2 = a(strA);
                String strB = b(strA);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("crash_type", URLEncoder.encode(strA2));
                jSONObject.put("crash_msg", URLEncoder.encode(a() + IOUtils.LINE_SEPARATOR_UNIX + strA));
                jSONObject.put("psid", com.smartdigimkt.m6.b.p().q());
                jSONObject.put("crash_sdk_type", strB);
                p.c(this.f37204b, com.smartdigimkt.g8.b.C0495b.d, System.currentTimeMillis() + "_crash", jSONObject.toString());
            }
        } catch (Throwable unused) {
        }
    }

    private void c() {
        Map<String, ?> mapB = p.b(this.f37204b, com.smartdigimkt.g8.b.C0495b.d);
        Iterator<?> it = mapB.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String string = next != null ? next.toString() : "";
            if (!TextUtils.isEmpty(string)) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    com.smartdigimkt.i7.d.b(jSONObject.optString("crash_type"), jSONObject.optString("crash_msg"), jSONObject.optString("psid"), jSONObject.optString("crash_sdk_type"));
                } catch (Exception unused) {
                }
            }
        }
        if (mapB.size() > 0) {
            p.a(this.f37204b, com.smartdigimkt.g8.b.C0495b.d);
        }
    }

    private String b(String str) {
        String str2 = this.g;
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
    private static String a(Throwable th) throws Throwable {
        PrintWriter printWriter;
        StringWriter stringWriter = null;
        if (th == null) {
            return "";
        }
        try {
            for (Throwable th2 = new Throwable(f.a(), th); th2 != null; th2 = th2.getCause()) {
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

    private static String a(String str) {
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
