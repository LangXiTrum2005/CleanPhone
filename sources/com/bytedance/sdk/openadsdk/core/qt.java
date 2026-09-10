package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class qt {
    public static final Set<String> lr = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.qt.1
        {
            add("8025677");
            add("5001121");
        }
    };
    public static bgr ri = null;
    private static boolean sf = false;
    private boolean aw;
    private String bgr;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private String f18146co;
    private String di;
    private String fi;
    private boolean ik;
    private int jbs;
    private String ka;
    private String mj;
    private int qt;
    private volatile ConcurrentHashMap<String, com.bytedance.sdk.openadsdk.core.ka.xha.ri> slm;
    private com.bytedance.sdk.openadsdk.core.bgr.ik.ik vr;
    private int xha;

    public static class ri {
        private static final qt ri = new qt();
    }

    public static boolean ac() {
        return sf;
    }

    public static int di() {
        try {
            String strRi = ri("config_fail_times", Long.MAX_VALUE);
            if (TextUtils.isEmpty(strRi)) {
                return 0;
            }
            return Integer.valueOf(strRi).intValue();
        } catch (Throwable th) {
            th.getMessage();
            return 0;
        }
    }

    public static int fi() {
        try {
            String strRi = ri("domain_index", Long.MAX_VALUE);
            if (TextUtils.isEmpty(strRi)) {
                return 0;
            }
            return Integer.valueOf(strRi).intValue();
        } catch (Throwable th) {
            th.getMessage();
            return 0;
        }
    }

    public static void ihz() {
        if (Build.VERSION.SDK_INT == 26 && "MI 6".equals(Build.MODEL)) {
            sf = true;
        }
    }

    public static qt lr() {
        return ri.ri;
    }

    public com.bytedance.sdk.openadsdk.core.bgr.ik.ik aw() {
        if (this.vr == null) {
            this.vr = new com.bytedance.sdk.openadsdk.core.bgr.ik.ik(10, 8);
        }
        return this.vr;
    }

    public boolean bgr() {
        return true;
    }

    public boolean bu() {
        return "com.union_test.internationad".equals(com.bytedance.sdk.openadsdk.utils.ig.di());
    }

    public String co() {
        return this.mj;
    }

    public boolean ik() {
        return com.bytedance.sdk.openadsdk.tan.ka.ri.ri("sp_global_file", "sdk_activate_init", true);
    }

    public int jbs() {
        return this.xha;
    }

    public String ka() {
        if (TextUtils.isEmpty(this.ka)) {
            String strRi = ri("app_id", Long.MAX_VALUE);
            if (!TextUtils.isEmpty(strRi)) {
                this.ka = strRi;
            }
        }
        return this.ka;
    }

    public String mj() {
        if (TextUtils.isEmpty(this.di)) {
            this.di = ri(nr.ri());
        }
        return this.di;
    }

    public String nr() {
        if (!TextUtils.isEmpty(this.bgr)) {
            return this.bgr;
        }
        String strRi = com.bytedance.sdk.openadsdk.utils.co.ri();
        this.bgr = strRi;
        if (!TextUtils.isEmpty(strRi)) {
            return this.bgr;
        }
        String strValueOf = String.valueOf(System.currentTimeMillis());
        com.bytedance.sdk.openadsdk.utils.co.ri(strValueOf);
        this.bgr = strValueOf;
        return strValueOf;
    }

    public int qt() {
        return this.qt;
    }

    public boolean sf() {
        int i = this.qt;
        return i < -1 || i > 1;
    }

    public boolean slm() {
        return "5001121".contains(this.ka);
    }

    public void tan() {
        try {
            if (this.slm == null || this.slm.size() != 0) {
                return;
            }
            this.slm = null;
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public String uq() {
        return this.f18146co;
    }

    public boolean vr() {
        return lr.contains(this.ka);
    }

    public String xha() {
        String str = this.fi;
        if (str != null) {
            return str;
        }
        String strRi = ri("mediation_info", Long.MAX_VALUE);
        this.fi = strRi;
        if (strRi == null) {
            this.fi = "";
        }
        return this.fi;
    }

    private qt() {
        this.ik = false;
        this.jbs = 0;
        this.qt = -1;
        this.slm = null;
    }

    private static JSONObject co(String str) {
        String strLr = com.bytedance.sdk.openadsdk.tan.ka.ri.lr("sp_global_file", str, (String) null);
        if (TextUtils.isEmpty(strLr)) {
            return null;
        }
        try {
            return new JSONObject(strLr);
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.ac.ik("TTAD.GlobalInfo", e.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jbs(String str) {
        if (TextUtils.isEmpty(this.mj)) {
            this.mj = str;
            return;
        }
        try {
            HashMap map = new HashMap();
            JSONArray jSONArray = new JSONArray(this.mj);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("name");
                    if (!TextUtils.isEmpty(strOptString)) {
                        map.put(strOptString, jSONObjectOptJSONObject);
                    }
                }
            }
            JSONArray jSONArray2 = new JSONArray(str);
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArray2.optJSONObject(i2);
                if (jSONObjectOptJSONObject2 != null) {
                    String strOptString2 = jSONObjectOptJSONObject2.optString("name");
                    String strOptString3 = jSONObjectOptJSONObject2.optString("value");
                    if (!TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString3)) {
                        map.put(strOptString2, jSONObjectOptJSONObject2);
                    }
                }
            }
            Collection collectionValues = map.values();
            JSONArray jSONArray3 = new JSONArray();
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                jSONArray3.put((JSONObject) it.next());
            }
            this.mj = jSONArray3.toString();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private static void qt(String str) {
        bgr bgrVar;
        if (TextUtils.isEmpty(str) && (bgrVar = ri) != null) {
            bgrVar.ri(4000, "appid cannot be empty");
        }
        com.bytedance.sdk.component.utils.ac.ik("TTAD.GlobalInfo", "appid cannot be empty");
    }

    public static void ri(bgr bgrVar) {
        ri = bgrVar;
    }

    private static void sf(String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 1000) {
            return;
        }
        bgr bgrVar = ri;
        if (bgrVar != null) {
            bgrVar.ri(4000, "Data is very long, the longest is 1000");
        }
        com.bytedance.sdk.component.utils.ac.ik("TTAD.GlobalInfo", "Data is very long, the longest is 1000");
    }

    public void ik(int i) {
        this.xha = i;
    }

    public void lr(boolean z) {
        com.bytedance.sdk.openadsdk.tan.ka.ri.ri("sp_global_file", "sdk_activate_init", Boolean.valueOf(z));
    }

    public static void lr(int i) {
        if (i >= 0) {
            ri("config_fail_times", String.valueOf(i));
        }
    }

    public void ik(final String str) {
        sf(str);
        if (com.bytedance.sdk.openadsdk.utils.dzy.di()) {
            vr.lr().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.qt.2
                @Override // java.lang.Runnable
                public void run() {
                    qt.this.jbs(str);
                }
            });
        } else {
            jbs(str);
        }
    }

    public boolean ri() {
        return this.aw;
    }

    public void lr(String str) {
        this.fi = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ri("mediation_info", str);
    }

    public void mj(String str) {
        this.f18146co = str;
    }

    public void ri(boolean z) {
        this.aw = z;
    }

    public static void ri(int i) {
        if (i >= 0) {
            ri("domain_index", String.valueOf(i));
        }
    }

    public static boolean xha(String str) {
        return (TextUtils.isEmpty(str) || str.contains("sp_full_screen_video") || str.contains("sp_reward_video") || str.contains("tt_openad") || str.contains("pag_sp_bad_par")) ? false : true;
    }

    public void di(String str) {
        try {
            if (TextUtils.isEmpty(str) || this.slm == null) {
                return;
            }
            this.slm.remove(str);
        } catch (Throwable unused) {
        }
    }

    public void fi(int i) {
        this.jbs = i;
    }

    public com.bytedance.sdk.openadsdk.core.ka.xha.ri fi(String str) {
        try {
            if (this.slm == null || str == null) {
                return null;
            }
            return this.slm.get(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public void ka(int i) {
        this.qt = i;
    }

    public void ri(String str) {
        qt(str);
        this.ka = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ri("app_id", str);
    }

    public static Pair<String, Long> ka(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObjectCo = co(str);
            if (jSONObjectCo == null) {
                return null;
            }
            return new Pair<>(jSONObjectCo.getString("value"), Long.valueOf(jSONObjectCo.getLong("time")));
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.ac.ik("TTAD.GlobalInfo", e.getMessage());
            return null;
        }
    }

    public void ik(boolean z) {
        this.ik = z;
    }

    private String ri(Context context) {
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            return (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 128));
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void ri(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", str2);
            jSONObject.put("time", System.currentTimeMillis());
            com.bytedance.sdk.openadsdk.tan.ka.ri.ri("sp_global_file", str, jSONObject.toString());
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.ac.ik("TTAD.GlobalInfo", e.getMessage());
        }
    }

    public static String ri(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObjectCo = co(str);
            if (jSONObjectCo == null) {
                return null;
            }
            if (System.currentTimeMillis() - jSONObjectCo.getLong("time") <= j) {
                return jSONObjectCo.getString("value");
            }
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.ac.ik("TTAD.GlobalInfo", e.getMessage());
        }
        return null;
    }

    public void ri(String str, com.bytedance.sdk.openadsdk.core.ka.xha.ri riVar) {
        try {
            if (TextUtils.isEmpty(str) || riVar == null) {
                return;
            }
            if (this.slm == null) {
                synchronized (qt.class) {
                    try {
                        if (this.slm == null) {
                            this.slm = new ConcurrentHashMap<>();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (this.slm != null) {
                this.slm.put(str, riVar);
            }
        } catch (Throwable unused) {
        }
    }
}
