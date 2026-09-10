package com.efs.sdk.launch;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.efs.sdk.base.Constants;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.integrationtesting.IntegrationTestingUtil;
import com.efs.sdk.base.protocol.record.EfsJSONLog;
import com.umeng.umcrash.UMCrash;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f440a;
    private static long b;
    private static long c;
    private static long d;
    private static long e;
    private static boolean f;
    private static boolean g;
    private static boolean h;
    private static long i;
    private static long j;
    private static int k;
    private static List<EfsJSONLog> l = new ArrayList();
    private static Map<String, Long[]> m = new HashMap();

    public static void a(Activity activity, String str, boolean z) {
        long jCurrentTimeMillis;
        Context applicationContext;
        String name;
        long jCurrentTimeMillis2;
        Map<String, Long[]> map;
        int i2;
        if (TextUtils.equals(str, LaunchManager.PAGE_ON_CREATE)) {
            if (z) {
                d = System.currentTimeMillis();
                return;
            }
            return;
        }
        if (TextUtils.equals(str, LaunchManager.PAGE_ON_RE_START)) {
            if (z && k == 0) {
                e = System.currentTimeMillis();
                g = true;
                return;
            }
            return;
        }
        if (TextUtils.equals(str, LaunchManager.PAGE_ON_START)) {
            if (z) {
                k++;
                h = true;
                return;
            }
            return;
        }
        if (!TextUtils.equals(str, LaunchManager.PAGE_ON_RESUME)) {
            if (TextUtils.equals(str, LaunchManager.PAGE_ON_STOP) && z) {
                k--;
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        if (f) {
            f = false;
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            long j2 = jCurrentTimeMillis3 - c;
            if (LaunchManager.isDebug) {
                "loadTime is ".concat(String.valueOf(j2));
            }
            long j3 = jCurrentTimeMillis3 - f440a;
            if (LaunchManager.isDebug) {
                "======>>>>>> coldTime is ".concat(String.valueOf(j3));
            }
            int i3 = !c.d(activity.getApplicationContext()) ? 1 : 0;
            if (LaunchManager.isDebug) {
                "type is ".concat(String.valueOf(i3));
            }
            a(activity.getApplicationContext(), i3, activity.getClass().getName(), j3, f440a, b, i, c, j, jCurrentTimeMillis3, j2, 0L, 0L, m);
        } else if (k == 1) {
            if (g) {
                g = false;
                jCurrentTimeMillis2 = System.currentTimeMillis() - e;
                if (LaunchManager.isDebug) {
                    "======>>>>>> hotTime is ".concat(String.valueOf(jCurrentTimeMillis2));
                }
                applicationContext = activity.getApplicationContext();
                name = activity.getClass().getName();
                jCurrentTimeMillis = 0;
                map = m;
                i2 = 2;
            } else if (h) {
                jCurrentTimeMillis = System.currentTimeMillis() - d;
                if (LaunchManager.isDebug) {
                    "======>>>>>> warmTime is ".concat(String.valueOf(jCurrentTimeMillis));
                }
                applicationContext = activity.getApplicationContext();
                name = activity.getClass().getName();
                jCurrentTimeMillis2 = 0;
                map = m;
                i2 = 3;
            }
            a(applicationContext, i2, name, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, jCurrentTimeMillis2, jCurrentTimeMillis, map);
        }
        h = false;
    }

    public static void b(String str, long j2) {
        Map<String, Long[]> map = m;
        if (map == null || !map.containsKey(str)) {
            return;
        }
        Long[] lArr = m.get(str);
        lArr[1] = Long.valueOf(j2);
        m.put(str, lArr);
    }

    private static void a(Context context, int i2, String str, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, Map<String, Long[]> map) {
        int i3;
        List<EfsJSONLog> list;
        Object objValueOf;
        if (LaunchManager.isInit()) {
            LaunchConfigManager launchConfigManager = LaunchManager.getLaunchConfigManager();
            if ((launchConfigManager == null || !launchConfigManager.enableTracer()) && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                return;
            }
            EfsJSONLog efsJSONLog = new EfsJSONLog(Constants.LOG_TYPE_STARTPERF);
            efsJSONLog.put("w_type", Integer.valueOf(i2));
            efsJSONLog.put("w_url", str);
            efsJSONLog.put("l_version", "0.0.8.umeng");
            if (i2 == 0 || i2 == 1) {
                efsJSONLog.put("wl_avgv", Long.valueOf(j2));
                efsJSONLog.put("wd_init", Long.valueOf(j3));
                efsJSONLog.put("wd_inittm", Long.valueOf(j4));
                efsJSONLog.put("wl_init", Long.valueOf(j5));
                efsJSONLog.put("wd_build", Long.valueOf(j4));
                efsJSONLog.put("wd_buildtm", Long.valueOf(j6));
                efsJSONLog.put("wl_build", Long.valueOf(j7));
                efsJSONLog.put("wd_page", Long.valueOf(j6));
                efsJSONLog.put("wd_pagetm", Long.valueOf(j8));
                efsJSONLog.put("wl_page", Long.valueOf(j9));
                if (map != null && !map.isEmpty()) {
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry<String, Long[]> entry : map.entrySet()) {
                        String key = entry.getKey();
                        Long[] value = entry.getValue();
                        if (key != null && value != null) {
                            try {
                                JSONArray jSONArray = new JSONArray();
                                jSONArray.put(value[0]);
                                jSONArray.put(value[1]);
                                jSONObject.put(key, jSONArray);
                            } catch (Throwable unused) {
                            }
                        }
                    }
                    efsJSONLog.put("userExtra", jSONObject);
                }
            } else {
                if (i2 == 2) {
                    objValueOf = Long.valueOf(j10);
                } else if (i2 == 3) {
                    objValueOf = Long.valueOf(j11);
                }
                efsJSONLog.put("wl_avgv", objValueOf);
            }
            String strA = c.a(context);
            if (LaunchManager.isDebug) {
                "umid is ".concat(String.valueOf(strA));
            }
            if (strA != null && !TextUtils.isEmpty(strA)) {
                if (LaunchManager.isDebug) {
                    efsJSONLog.generateString();
                }
                EfsReporter reporter = LaunchManager.getReporter();
                if (reporter != null) {
                    reporter.send(efsJSONLog);
                    return;
                }
                return;
            }
            List<EfsJSONLog> list2 = l;
            if (list2 == null || list2.size() >= 3) {
                return;
            }
            l.add(efsJSONLog);
            if (LaunchManager.isDebug) {
                efsJSONLog.generateString();
                return;
            }
            return;
        }
        if (i2 == 0) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("w_type", i2);
                jSONObject2.put("w_url", str);
                jSONObject2.put("l_version", "0.0.8.umeng");
                jSONObject2.put("wl_avgv", j2);
                jSONObject2.put("wd_init", j3);
                jSONObject2.put("wd_inittm", j4);
                jSONObject2.put("wl_init", j5);
                jSONObject2.put("wd_build", j4);
                jSONObject2.put("wd_buildtm", j6);
                jSONObject2.put("wl_build", j7);
                jSONObject2.put("wd_page", j6);
                jSONObject2.put("wd_pagetm", j8);
                jSONObject2.put("wl_page", j9);
                if (map != null && !map.isEmpty()) {
                    JSONObject jSONObject3 = new JSONObject();
                    for (Map.Entry<String, Long[]> entry2 : map.entrySet()) {
                        String key2 = entry2.getKey();
                        Long[] value2 = entry2.getValue();
                        if (key2 != null && value2 != null) {
                            JSONArray jSONArray2 = new JSONArray();
                            jSONArray2.put(value2[0]);
                            jSONArray2.put(value2[1]);
                            jSONObject3.put(key2, jSONArray2);
                        }
                    }
                    jSONObject2.put("userExtra", jSONObject3);
                }
                c.a(context, jSONObject2.toString());
                if (LaunchManager.isDebug) {
                    jSONObject2.toString();
                    return;
                }
                return;
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        if (LaunchManager.isDebug) {
            "no init, cache launch, type is ".concat(String.valueOf(i2));
        }
        EfsJSONLog efsJSONLog2 = new EfsJSONLog(Constants.LOG_TYPE_STARTPERF);
        efsJSONLog2.put("w_type", Integer.valueOf(i2));
        efsJSONLog2.put("w_url", str);
        efsJSONLog2.put("l_version", "0.0.8.umeng");
        if (i2 != 1) {
            if (i2 == 2) {
                efsJSONLog2.put("wl_avgv", Long.valueOf(j10));
            } else {
                i3 = 3;
                if (i2 == 3) {
                    efsJSONLog2.put("wl_avgv", Long.valueOf(j11));
                }
            }
            list = l;
            if (list != null || list.size() >= i3) {
            }
            l.add(efsJSONLog2);
            if (LaunchManager.isDebug) {
                efsJSONLog2.generateString();
                return;
            }
            return;
        }
        efsJSONLog2.put("wl_avgv", Long.valueOf(j2));
        efsJSONLog2.put("wd_init", Long.valueOf(j3));
        efsJSONLog2.put("wd_inittm", Long.valueOf(j4));
        efsJSONLog2.put("wl_init", Long.valueOf(j5));
        efsJSONLog2.put("wd_build", Long.valueOf(j4));
        efsJSONLog2.put("wd_buildtm", Long.valueOf(j6));
        efsJSONLog2.put("wl_build", Long.valueOf(j7));
        efsJSONLog2.put("wd_page", Long.valueOf(j6));
        efsJSONLog2.put("wd_pagetm", Long.valueOf(j8));
        efsJSONLog2.put("wl_page", Long.valueOf(j9));
        if (map != null && !map.isEmpty()) {
            JSONObject jSONObject4 = new JSONObject();
            for (Map.Entry<String, Long[]> entry3 : map.entrySet()) {
                String key3 = entry3.getKey();
                Long[] value3 = entry3.getValue();
                if (key3 != null && value3 != null) {
                    try {
                        JSONArray jSONArray3 = new JSONArray();
                        try {
                            jSONArray3.put(value3[0]);
                            try {
                                jSONArray3.put(value3[1]);
                                jSONObject4.put(key3, jSONArray3);
                            } catch (Throwable unused2) {
                            }
                        } catch (Throwable unused3) {
                        }
                    } catch (Throwable unused4) {
                    }
                }
            }
            efsJSONLog2.put("userExtra", jSONObject4);
        }
        i3 = 3;
        list = l;
        if (list != null) {
        }
    }

    public static void a(Context context, String str) {
        if (str == null || TextUtils.isEmpty(str)) {
            str = c.a(context);
        }
        if (str == null || TextUtils.isEmpty(str)) {
            return;
        }
        HashMap map = new HashMap(1);
        map.put(UMCrash.KEY_HEADER_UMID, str);
        if (LaunchManager.getReporter() != null) {
            LaunchManager.getReporter().addPublicParams(map);
        }
        String strB = c.b(context);
        if (strB != null && !TextUtils.isEmpty(strB)) {
            try {
                JSONObject jSONObject = new JSONObject(strB);
                jSONObject.put(UMCrash.KEY_HEADER_UMID, str);
                if (a(jSONObject)) {
                    c.c(context);
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        List<EfsJSONLog> list = l;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (EfsJSONLog efsJSONLog : l) {
            if (efsJSONLog != null) {
                if (LaunchManager.isDebug) {
                    efsJSONLog.generateString();
                }
                EfsReporter reporter = LaunchManager.getReporter();
                if (reporter != null) {
                    reporter.send(efsJSONLog);
                }
            }
        }
        l.clear();
        l = null;
    }

    public static void a(String str, long j2) {
        Map<String, Long[]> map = m;
        if (map == null || map.containsKey(str) || m.size() >= 10) {
            return;
        }
        Long[] lArr = new Long[2];
        lArr[0] = Long.valueOf(j2);
        m.put(str, lArr);
    }

    public static void a(String str, boolean z) {
        if (TextUtils.equals(str, LaunchManager.APP_CONSTRUCT)) {
            return;
        }
        if (!TextUtils.equals(str, LaunchManager.APP_ATTACH_BASE_CONTEXT)) {
            if (!TextUtils.equals(str, LaunchManager.APP_ON_CREATE) || z) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            c = jCurrentTimeMillis;
            j = jCurrentTimeMillis - b;
            return;
        }
        if (z) {
            f440a = System.currentTimeMillis();
            f = true;
        } else {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            b = jCurrentTimeMillis2;
            i = jCurrentTimeMillis2 - f440a;
        }
    }

    private static boolean a(JSONObject jSONObject) {
        try {
            EfsJSONLog efsJSONLog = new EfsJSONLog(Constants.LOG_TYPE_STARTPERF);
            efsJSONLog.put("w_type", jSONObject.opt("w_type"));
            efsJSONLog.put("w_url", jSONObject.opt("w_url"));
            efsJSONLog.put("l_version", jSONObject.opt("l_version"));
            efsJSONLog.put("wl_avgv", jSONObject.opt("wl_avgv"));
            efsJSONLog.put("wd_init", jSONObject.opt("wd_init"));
            efsJSONLog.put("wd_inittm", jSONObject.opt("wd_inittm"));
            efsJSONLog.put("wl_init", jSONObject.opt("wl_init"));
            efsJSONLog.put("wd_build", jSONObject.opt("wd_build"));
            efsJSONLog.put("wd_buildtm", jSONObject.opt("wd_buildtm"));
            efsJSONLog.put("wl_build", jSONObject.opt("wl_build"));
            efsJSONLog.put("wd_page", jSONObject.opt("wd_page"));
            efsJSONLog.put("wd_pagetm", jSONObject.opt("wd_pagetm"));
            efsJSONLog.put("wl_page", jSONObject.opt("wl_page"));
            efsJSONLog.put("userExtra", jSONObject.opt("userExtra"));
            if (LaunchManager.isDebug) {
                efsJSONLog.generateString();
            }
            EfsReporter reporter = LaunchManager.getReporter();
            if (reporter == null) {
                return false;
            }
            reporter.send(efsJSONLog);
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }
}
