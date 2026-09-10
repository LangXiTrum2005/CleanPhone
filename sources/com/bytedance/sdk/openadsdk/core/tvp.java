package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
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

/* JADX INFO: loaded from: classes3.dex */
public class tvp {
    private static boolean exu = false;
    public static exu qdl;
    public static final Set<String> ud = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.tvp.1
        {
            add("8025677");
            add("5001121");
        }
    };
    private boolean bjy;
    private int fs;
    private volatile ConcurrentHashMap<String, com.bytedance.sdk.openadsdk.core.mml.wd.qdl> jl;
    private String jpc;
    private String jtx;
    private boolean lnr;
    private String mml;
    private String mo;
    private String mzz;
    private String rdp;
    private Integer rq;
    private Bitmap to;
    private int tvp;
    private int wd;
    private com.bytedance.sdk.openadsdk.core.exu.lnr.lnr yt;

    public static class qdl {
        private static final tvp qdl = new tvp();
    }

    public static void ljh() {
        if (Build.VERSION.SDK_INT == 26 && "MI 6".equals(Build.MODEL)) {
            exu = true;
        }
    }

    public static int mo() {
        try {
            String strQdl = qdl("config_fail_times", Long.MAX_VALUE);
            if (TextUtils.isEmpty(strQdl)) {
                return 0;
            }
            return Integer.valueOf(strQdl).intValue();
        } catch (Throwable th) {
            th.getMessage();
            return 0;
        }
    }

    public static int mzz() {
        try {
            String strQdl = qdl("domain_index", Long.MAX_VALUE);
            if (TextUtils.isEmpty(strQdl)) {
                return 0;
            }
            return Integer.valueOf(strQdl).intValue();
        } catch (Throwable th) {
            th.getMessage();
            return 0;
        }
    }

    public static boolean oth() {
        return exu;
    }

    public static tvp ud() {
        return qdl.qdl;
    }

    public String aaj() {
        if (!TextUtils.isEmpty(this.jtx)) {
            return this.jtx;
        }
        String strQdl = com.bytedance.sdk.openadsdk.utils.fs.qdl();
        this.jtx = strQdl;
        if (!TextUtils.isEmpty(strQdl)) {
            return this.jtx;
        }
        String strValueOf = String.valueOf(System.currentTimeMillis());
        com.bytedance.sdk.openadsdk.utils.fs.qdl(strValueOf);
        this.jtx = strValueOf;
        return strValueOf;
    }

    public String bch() {
        return com.bytedance.sdk.openadsdk.multipro.ud.lnr() ? com.bytedance.sdk.openadsdk.multipro.mml.mml.ud("sp_global_file", "adx_id", "") : this.rdp;
    }

    public boolean bjy() {
        return true;
    }

    public boolean exc() {
        return "com.union_test.internationad".equals(com.bytedance.sdk.openadsdk.utils.gy.mo());
    }

    public String exu() {
        return com.bytedance.sdk.openadsdk.multipro.ud.lnr() ? com.bytedance.sdk.openadsdk.multipro.mml.mml.ud("sp_global_file", "extra_data", null) : this.jpc;
    }

    public boolean fs() {
        int i2 = this.fs;
        return i2 < -1 || i2 > 1;
    }

    public boolean jl() {
        return "5001121".contains(this.mml);
    }

    public String jpc() {
        if (TextUtils.isEmpty(this.mo)) {
            this.mo = qdl(yt.qdl());
        }
        return this.mo;
    }

    public Bitmap jtx() {
        return com.bytedance.sdk.openadsdk.multipro.ud.lnr() ? com.bytedance.sdk.component.utils.mml.qdl(com.bytedance.sdk.openadsdk.multipro.mml.mml.ud("sp_global_file", "pause_icon", null)) : this.to;
    }

    public void jyq() {
        try {
            if (this.jl == null || this.jl.size() != 0) {
                return;
            }
            this.jl = null;
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public boolean lnr() {
        return com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl("sp_global_file", "sdk_activate_init", true);
    }

    public String mml() {
        if (TextUtils.isEmpty(this.mml)) {
            String strQdl = qdl("app_id", Long.MAX_VALUE);
            if (!TextUtils.isEmpty(strQdl)) {
                this.mml = strQdl;
            }
        }
        return this.mml;
    }

    public com.bytedance.sdk.openadsdk.core.exu.lnr.lnr rdp() {
        if (this.yt == null) {
            this.yt = new com.bytedance.sdk.openadsdk.core.exu.lnr.lnr(10, 8);
        }
        return this.yt;
    }

    public int rq() {
        return this.fs;
    }

    public int to() {
        Integer num = this.rq;
        return num != null ? num.intValue() : com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl("sp_global_privacy", "tt_gdpr", -1);
    }

    public int tvp() {
        return com.bytedance.sdk.openadsdk.multipro.ud.lnr() ? com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl("sp_global_icon_id", "icon_id", 0) : this.wd;
    }

    public String wd() {
        String str = this.mzz;
        if (str != null) {
            return str;
        }
        String strQdl = qdl("mediation_info", Long.MAX_VALUE);
        this.mzz = strQdl;
        if (strQdl == null) {
            this.mzz = "";
        }
        return this.mzz;
    }

    public boolean yt() {
        return ud.contains(this.mml);
    }

    private tvp() {
        this.lnr = false;
        this.tvp = 0;
        this.to = null;
        this.rq = null;
        this.fs = -1;
        this.jl = null;
    }

    private static JSONObject fs(String str) {
        String strUd = com.bytedance.sdk.openadsdk.multipro.mml.mml.ud("sp_global_file", str, null);
        if (TextUtils.isEmpty(strUd)) {
            return null;
        }
        try {
            return new JSONObject(strUd);
        } catch (JSONException e2) {
            com.bytedance.sdk.component.utils.aaj.lnr("TTAD.GlobalInfo", e2.getMessage());
            return null;
        }
    }

    private static void rq(String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 1000) {
            return;
        }
        exu exuVar = qdl;
        if (exuVar != null) {
            exuVar.fail(4000, "Data is very long, the longest is 1000");
        }
        com.bytedance.sdk.component.utils.aaj.lnr("TTAD.GlobalInfo", "Data is very long, the longest is 1000");
    }

    public void lnr(int i2) {
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl("sp_global_icon_id", "icon_id", Integer.valueOf(i2));
        }
        this.wd = i2;
    }

    public void ud(boolean z2) {
        com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl("sp_global_file", "sdk_activate_init", Boolean.valueOf(z2));
    }

    public static void qdl(exu exuVar) {
        qdl = exuVar;
    }

    public static void ud(int i2) {
        if (i2 >= 0) {
            qdl("config_fail_times", String.valueOf(i2));
        }
    }

    private static void to(String str) {
        exu exuVar;
        if (TextUtils.isEmpty(str) && (exuVar = qdl) != null) {
            exuVar.fail(4000, "appid cannot be empty");
        }
        com.bytedance.sdk.component.utils.aaj.lnr("TTAD.GlobalInfo", "appid cannot be empty");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tvp(String str) {
        if (!TextUtils.isEmpty(this.jpc)) {
            try {
                HashMap map = new HashMap();
                JSONArray jSONArray = new JSONArray(this.jpc);
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                    if (jSONObjectOptJSONObject != null) {
                        String strOptString = jSONObjectOptJSONObject.optString("name");
                        if (!TextUtils.isEmpty(strOptString)) {
                            map.put(strOptString, jSONObjectOptJSONObject);
                        }
                    }
                }
                JSONArray jSONArray2 = new JSONArray(str);
                for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArray2.optJSONObject(i3);
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
                this.jpc = jSONArray3.toString();
            } catch (Throwable th) {
                th.getMessage();
            }
        } else {
            this.jpc = str;
        }
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl("sp_global_file", "extra_data", this.jpc);
        }
    }

    public void jpc(String str) {
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl("sp_global_file", "adx_id", str);
        }
        this.rdp = str;
    }

    public boolean qdl() {
        return this.bjy;
    }

    public void ud(String str) {
        this.mzz = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        qdl("mediation_info", str);
    }

    public static boolean wd(String str) {
        return (TextUtils.isEmpty(str) || !com.bytedance.sdk.openadsdk.utils.xmv.qdl || str.contains("sp_full_screen_video") || str.contains("sp_reward_video") || str.contains("tt_openad") || str.contains("pag_sp_bad_par")) ? false : true;
    }

    public void lnr(final String str) {
        rq(str);
        if (com.bytedance.sdk.openadsdk.utils.fco.mo()) {
            rdp.ud().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.tvp.3
                @Override // java.lang.Runnable
                public void run() {
                    tvp.this.tvp(str);
                }
            });
        } else {
            tvp(str);
        }
    }

    public void mo(int i2) {
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl("sp_global_file", "title_bar_theme", Integer.valueOf(i2));
        }
        this.tvp = i2;
    }

    public void mzz(int i2) {
        this.fs = i2;
    }

    public void qdl(boolean z2) {
        this.bjy = z2;
    }

    public static void qdl(int i2) {
        if (i2 >= 0) {
            qdl("domain_index", String.valueOf(i2));
        }
    }

    public void mml(final int i2) {
        if (i2 == 1) {
            i2 = 0;
        } else if (i2 == 0) {
            i2 = 1;
        }
        if (i2 == 0 || i2 == 1 || i2 == -1) {
            final Integer num = this.rq;
            if (num == null || num.intValue() != i2) {
                this.rq = Integer.valueOf(i2);
                if (!com.bytedance.sdk.openadsdk.utils.fco.mo()) {
                    qdl(num, i2);
                } else {
                    rdp.ud().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.tvp.2
                        @Override // java.lang.Runnable
                        public void run() {
                            tvp.this.qdl(num, i2);
                        }
                    });
                }
            }
        }
    }

    public com.bytedance.sdk.openadsdk.core.mml.wd.qdl mzz(String str) {
        try {
            if (this.jl == null || str == null) {
                return null;
            }
            return this.jl.get(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public void qdl(String str) {
        to(str);
        this.mml = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        qdl("app_id", str);
        com.bytedance.sdk.openadsdk.core.settings.rq.lnr().mml(7);
    }

    public void mo(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                com.bytedance.sdk.openadsdk.lnr.to.qdl(6, str);
            } else if (this.jl != null) {
                this.jl.remove(str);
            }
        } catch (Throwable unused) {
        }
    }

    public void lnr(boolean z2) {
        this.lnr = z2;
    }

    public static Pair<String, Long> mml(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObjectFs = fs(str);
            if (jSONObjectFs == null) {
                return null;
            }
            return new Pair<>(jSONObjectFs.getString("value"), Long.valueOf(jSONObjectFs.getLong("time")));
        } catch (JSONException e2) {
            com.bytedance.sdk.component.utils.aaj.lnr("TTAD.GlobalInfo", e2.getMessage());
            return null;
        }
    }

    private String qdl(Context context) {
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            return (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 128));
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(Integer num, int i2) {
        if (num != null) {
            com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl("sp_global_privacy", "tt_gdpr", Integer.valueOf(i2));
            com.bytedance.sdk.openadsdk.core.settings.rq.lnr().qdl(4, true);
        } else if (com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl("sp_global_privacy", "tt_gdpr", -1) != i2) {
            com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl("sp_global_privacy", "tt_gdpr", Integer.valueOf(i2));
            com.bytedance.sdk.openadsdk.core.settings.rq.lnr().qdl(4, true);
        }
    }

    public static void qdl(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", str2);
            jSONObject.put("time", System.currentTimeMillis());
            com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl("sp_global_file", str, jSONObject.toString());
        } catch (JSONException e2) {
            com.bytedance.sdk.component.utils.aaj.lnr("TTAD.GlobalInfo", e2.getMessage());
        }
    }

    public static String qdl(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObjectFs = fs(str);
            if (jSONObjectFs == null) {
                return null;
            }
            if (System.currentTimeMillis() - jSONObjectFs.getLong("time") <= j) {
                return jSONObjectFs.getString("value");
            }
        } catch (JSONException e2) {
            com.bytedance.sdk.component.utils.aaj.lnr("TTAD.GlobalInfo", e2.getMessage());
        }
        return null;
    }

    public void qdl(String str, com.bytedance.sdk.openadsdk.core.mml.wd.qdl qdlVar) {
        try {
            if (TextUtils.isEmpty(str) || qdlVar == null) {
                return;
            }
            if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                com.bytedance.sdk.openadsdk.lnr.to.qdl(6, str, qdlVar);
                return;
            }
            if (this.jl == null) {
                synchronized (tvp.class) {
                    try {
                        if (this.jl == null) {
                            this.jl = new ConcurrentHashMap<>();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (this.jl != null) {
                this.jl.put(str, qdlVar);
            }
        } catch (Throwable unused) {
        }
    }
}
