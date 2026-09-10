package com.mbridge.msdk.setting;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import b2.o;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.foundation.tools.g0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.y0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f35672a = "i";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile i f35673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile g f35674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile String f35675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static HashMap<String, m> f35676e = new HashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static AtomicBoolean f35677f = new AtomicBoolean(false);

    private i() {
    }

    public static i b() {
        if (f35673b == null) {
            synchronized (i.class) {
                try {
                    if (f35673b == null) {
                        f35673b = new i();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f35673b;
    }

    public g c() {
        return f35674c != null ? f35674c : a();
    }

    public g d(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return a();
            }
            g gVarF = f(str);
            return gVarF == null ? a() : gVarF;
        } catch (Exception unused) {
            return a();
        }
    }

    public String e(String str) {
        return com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("ivreward_" + str);
    }

    public g f(String str) {
        if (f35674c == null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    b(str);
                }
            } catch (Exception e10) {
                q0.b(f35672a, e10.getMessage());
            }
        }
        return f35674c;
    }

    public boolean g(String str, String str2) {
        g gVarF = f(str2);
        if (i(str2) && a(str2, 1, str)) {
            new k().b(com.mbridge.msdk.foundation.controller.c.n().d(), str2, com.mbridge.msdk.foundation.controller.c.n().c());
        }
        m mVarE = e(str2, str);
        if (gVarF != null && mVarE != null) {
            long jW0 = gVarF.w0() * 1000;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jO = mVarE.o() + jW0;
            if (jO > jCurrentTimeMillis) {
                String str3 = f35672a;
                StringBuilder sbL = wi.d.l(jO, "unit setting  nexttime is not ready  [settingNextRequestTime= ", " currentTime = ");
                sbL.append(jCurrentTimeMillis);
                sbL.append(X3.j.f27836e);
                q0.c(str3, sbL.toString());
                return false;
            }
        }
        q0.c(f35672a, "unit setting timeout or not exists");
        return true;
    }

    public String h(String str) {
        g gVarF = f(str);
        if (gVarF == null) {
            return "0";
        }
        int iF0 = gVarF.f0();
        String strE0 = gVarF.e0();
        return (iF0 <= 0 || !(!TextUtils.isEmpty(strE0) && !strE0.equalsIgnoreCase("null"))) ? "0" : "1";
    }

    public boolean i(String str) {
        g gVarF = f(str);
        if (gVarF != null) {
            long jC = gVarF.C() * 1000;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jX = gVarF.x() + jC;
            if (jX > jCurrentTimeMillis) {
                String str2 = f35672a;
                StringBuilder sbL = wi.d.l(jX, "app setting nexttime is not ready  [settingNextRequestTime= ", " currentTime = ");
                sbL.append(jCurrentTimeMillis);
                sbL.append(X3.j.f27836e);
                q0.c(str2, sbL.toString());
                return false;
            }
        }
        q0.c(f35672a, "app setting timeout or not exists");
        return true;
    }

    public void j(String str, String str2) {
        try {
            String strA = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(str + "_" + str2);
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strA);
            jSONObject.put("current_time", System.currentTimeMillis());
            a(str, str2, jSONObject.toString());
        } catch (Throwable th2) {
            q0.b(f35672a, th2.getMessage());
        }
    }

    public void k(String str) {
        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().c("ivreward_" + str);
    }

    public void l(String str) {
        try {
            String strG = g(str);
            if (TextUtils.isEmpty(strG)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strG);
            jSONObject.put("current_time", System.currentTimeMillis());
            h(str, jSONObject.toString());
        } catch (Throwable th2) {
            q0.b(f35672a, th2.getMessage());
        }
    }

    public static void a(Context context, String str) {
        FastKV fastKVBuild;
        Map<String, Object> all = null;
        if (com.mbridge.msdk.foundation.controller.d.a().e()) {
            try {
                fastKVBuild = new FastKV.Builder(com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_CONFIG), "mbridge").build();
            } catch (Exception unused) {
                fastKVBuild = null;
            }
        } else {
            fastKVBuild = null;
        }
        if (fastKVBuild == null) {
            try {
                Map<String, ?> all2 = context.getSharedPreferences("mbridge", 0).getAll();
                for (String str2 : all2.keySet()) {
                    if (str2.startsWith(str + "_")) {
                        f35676e.put(str2, m.l((String) all2.get(str2)));
                    }
                }
                return;
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
        try {
            all = fastKVBuild.getAll();
        } catch (Exception unused2) {
        }
        if (all != null) {
            try {
                for (String str3 : all.keySet()) {
                    if (str3.startsWith(str + "_")) {
                        f35676e.put(str3, m.l((String) all.get(str3)));
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public m e(String str, String str2) {
        m mVarB = b(str, str2);
        if (mVarB != null && mVarB.L() == 0) {
            mVarB.d(1);
        }
        return mVarB;
    }

    public m c(String str, String str2) {
        m mVarA = a(str, str2);
        return mVarA == null ? m.N() : mVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void j(String str) {
        try {
            String strA = com.mbridge.msdk.config.component.common.util.c.a(str);
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strA);
            if (jSONObject.has(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B)) {
                jSONObject.remove(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
            }
            if (jSONObject.has("c")) {
                jSONObject.remove("c");
            }
            h.a(jSONObject);
            f35675d = jSONObject.toString();
            f35674c = g.F(f35675d);
            if (f35674c != null) {
                f35674c.Q0();
            }
        } catch (Throwable th2) {
            q0.b(f35672a, th2.getMessage());
        }
    }

    public m d(String str, String str2) {
        m mVarE = e(str, str2);
        return mVarE == null ? m.N() : mVarE;
    }

    public String f(String str, String str2) {
        return com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(wi.d.i(str, "_", str2));
    }

    public void h(String str, String str2) {
        String strA = h.a(str2);
        f35675d = strA;
        f35674c = g.F(strA);
        if (f35674c != null) {
            f35674c.Q0();
        }
        com.mbridge.msdk.config.manager.a.c().a(str, strA);
        j.a(f35674c);
        g0.a().a(f35674c.S());
    }

    private m b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = com.mbridge.msdk.foundation.controller.c.n().b();
        }
        String strI = wi.d.i(str, "_", str2);
        if (f35676e.containsKey(strI)) {
            return f35676e.get(strI);
        }
        m mVarL = null;
        try {
            mVarL = m.l(com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(strI));
            f35676e.put(strI, mVarL);
            return mVarL;
        } catch (Exception e10) {
            e10.printStackTrace();
            return mVarL;
        }
    }

    public void i(String str, String str2) {
        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("ivreward_" + str, str2);
    }

    public String g(String str) {
        if (str == null) {
            return "";
        }
        try {
            return TextUtils.isEmpty(f35675d) ? "" : f35675d;
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
            return "";
        }
    }

    public void a(String str) {
        j.a(str, this);
    }

    public g a() {
        return j.a();
    }

    public m a(String str, String str2) {
        return b(str, str2);
    }

    public boolean a(String str, int i10, String str2) {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            String str3 = str + "_" + i10 + "_" + str2;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j10 = 0;
            long jLongValue = ((Long) y0.a(contextD, str3, 0L)).longValue();
            g gVarF = f(str);
            if (gVarF == null) {
                gVarF = b().a();
            } else {
                j10 = jLongValue;
            }
            if ((gVarF.r0() * 1000) + j10 > jCurrentTimeMillis) {
                return false;
            }
            y0.b(contextD, str3, Long.valueOf(jCurrentTimeMillis));
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public void b(String str) {
        if (f35677f.get()) {
            return;
        }
        try {
            f35677f.compareAndSet(false, true);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new o(25, this, str));
            } else {
                j(str);
            }
        } catch (Throwable th2) {
            q0.b(f35672a, th2.getMessage());
        }
    }

    public JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return jSONObject2;
        }
        if (jSONObject2 != null && jSONObject2.length() != 0) {
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    if ("unitSetting".equals(next) && jSONObject.has("unitSetting")) {
                        JSONArray jSONArray = jSONObject.getJSONArray("unitSetting");
                        jSONArray.put(0, a((JSONObject) jSONArray.get(0), (JSONObject) jSONObject2.getJSONArray("unitSetting").get(0)));
                        jSONObject.put(next, jSONArray);
                    } else {
                        jSONObject.put(next, jSONObject2.opt(next));
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
        return jSONObject;
    }

    public void a(String str, String str2, String str3) {
        String strI = wi.d.i(str, "_", str2);
        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(strI, str3);
        f35676e.put(strI, m.l(str3));
    }
}
