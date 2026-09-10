package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import com.bykv.vk.openvk.ri.ri.ri.ik.attabal;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class dw {
    private int aw;
    private int bgr;
    private String bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private int f18136co;
    private String di;
    private String fi;
    private boolean ik;
    private int jbs;
    private int ka;
    private int lr;
    private int mj;
    private String nr;
    private boolean qt;
    private int ri;
    private int sf;
    private String slm;
    private int vr;
    private int xha;

    public dw(JSONObject jSONObject) {
        this.f18136co = 5;
        this.aw = 5;
        this.bgr = 10;
        this.vr = 20;
        this.slm = "Next Ad";
        this.bu = "Next ad in %1$ds";
        this.nr = "Play Now";
        if (jSONObject == null) {
            return;
        }
        this.ik = jSONObject.optBoolean("is_playable");
        this.ka = jSONObject.optInt("playable_type", 0);
        this.fi = jSONObject.optString("playable_style");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("playable");
        if (jSONObjectOptJSONObject != null) {
            this.di = jSONObjectOptJSONObject.optString("playable_url", "");
            this.xha = jSONObjectOptJSONObject.optInt("playable_orientation", 0);
            this.lr = jSONObjectOptJSONObject.optInt("new_style", 0);
            this.ri = jSONObjectOptJSONObject.optInt("close_2_app", 0);
            int iRi = ri(this.ka);
            this.mj = jSONObjectOptJSONObject.optInt("playable_webview_timeout", iRi);
            this.jbs = jSONObjectOptJSONObject.optInt("playable_js_timeout", iRi);
            this.qt = jSONObjectOptJSONObject.optInt("playable_backup_enable", 0) == 1;
            this.f18136co = jSONObjectOptJSONObject.optInt("wait_tips_time", 5);
            this.aw = jSONObjectOptJSONObject.optInt("auto_to_next_time", 5);
            this.bgr = jSONObjectOptJSONObject.optInt("next_ad_tips_show_time", 10);
            this.vr = jSONObjectOptJSONObject.optInt("max_show_time", 20);
            this.bu = jSONObjectOptJSONObject.optString("next_ad_in_xs");
            this.slm = jSONObjectOptJSONObject.optString("next_ad_text");
            this.nr = jSONObjectOptJSONObject.optString("play_now_text");
            int iOptInt = jSONObjectOptJSONObject.optInt("countdown_show_type", 0);
            this.sf = iOptInt;
            if (iOptInt == 0 || iOptInt == 1 || iOptInt == 2) {
                return;
            }
            this.sf = 0;
        }
    }

    public static boolean ac(wjv wjvVar) {
        dw dwVarZf = zf(wjvVar);
        return dwVarZf != null && dwVarZf.qt();
    }

    public static boolean aw(wjv wjvVar) {
        return true;
    }

    public static String ay(wjv wjvVar) {
        dw dwVarZf = zf(wjvVar);
        if (dwVarZf == null) {
            return null;
        }
        return dwVarZf.di();
    }

    public static boolean bgr(wjv wjvVar) {
        attabal attabalVarEu = wjvVar.eu();
        return attabalVarEu != null && attabalVarEu.attabal() == 1;
    }

    public static long bu(wjv wjvVar) {
        return Math.max(nr(wjvVar), tan(wjvVar));
    }

    public static String co(wjv wjvVar) {
        if (wjvVar == null) {
            return null;
        }
        dw dwVarTw = wjvVar.tw();
        if (dwVarTw != null && dwVarTw.ik) {
            String str = dwVarTw.di;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        if (wjvVar.nd() == 20) {
            return wjvVar.smj();
        }
        if (wjvVar.eu() != null) {
            return wjvVar.eu().marial();
        }
        return null;
    }

    private static int dw(wjv wjvVar) {
        dw dwVarZf = zf(wjvVar);
        if (dwVarZf == null) {
            return 0;
        }
        return dwVarZf.ka;
    }

    public static int fr(wjv wjvVar) {
        dw dwVarZf = zf(wjvVar);
        if (dwVarZf == null) {
            return 0;
        }
        return dwVarZf.lr();
    }

    public static int igq(wjv wjvVar) {
        dw dwVarZf = zf(wjvVar);
        if (dwVarZf == null) {
            return 0;
        }
        return dwVarZf.ka();
    }

    public static int ihz(wjv wjvVar) {
        dw dwVarZf = zf(wjvVar);
        if (dwVarZf == null) {
            return 0;
        }
        return dwVarZf.ri();
    }

    public static int jbs(wjv wjvVar) {
        dw dwVarZf = zf(wjvVar);
        if (dwVarZf == null) {
            return 0;
        }
        return dwVarZf.sf;
    }

    public static boolean mj(wjv wjvVar) {
        dw dwVarTw = wjvVar.tw();
        return dwVarTw != null && wjvVar.tp() && dwVarTw.ik && dwVarTw.lr == 1;
    }

    public static long nr(wjv wjvVar) {
        dw dwVarZf = zf(wjvVar);
        if (dwVarZf == null) {
            return 5L;
        }
        return dwVarZf.mj();
    }

    public static String qt(wjv wjvVar) {
        dw dwVarZf = zf(wjvVar);
        if (dwVarZf == null) {
            return null;
        }
        return dwVarZf.fi;
    }

    private static int ri(int i) {
        return i == 1 ? 10 : 5;
    }

    public static String sf(wjv wjvVar) {
        dw dwVarZf = zf(wjvVar);
        if (dwVarZf == null) {
            return null;
        }
        return dwVarZf.di;
    }

    public static boolean slm(wjv wjvVar) {
        return false;
    }

    public static int su(wjv wjvVar) {
        dw dwVarZf = zf(wjvVar);
        if (dwVarZf == null) {
            return 0;
        }
        return dwVarZf.ik();
    }

    public static long tan(wjv wjvVar) {
        dw dwVarZf = zf(wjvVar);
        if (dwVarZf == null) {
            return 5L;
        }
        return dwVarZf.jbs();
    }

    public static String uq(wjv wjvVar) {
        dw dwVarZf = zf(wjvVar);
        if (dwVarZf == null) {
            return null;
        }
        return dwVarZf.fi();
    }

    public static int vr(wjv wjvVar) {
        dw dwVarZf = zf(wjvVar);
        if (dwVarZf == null) {
            return 0;
        }
        return dwVarZf.xha;
    }

    public static String wjv(wjv wjvVar) {
        dw dwVarZf = zf(wjvVar);
        if (dwVarZf == null) {
            return null;
        }
        return dwVarZf.xha();
    }

    private static dw zf(wjv wjvVar) {
        if (wjvVar == null) {
            return null;
        }
        return wjvVar.tw();
    }

    public String di() {
        return this.bu;
    }

    public String fi() {
        return this.slm;
    }

    public int ik() {
        return this.bgr;
    }

    public int ka() {
        return this.vr;
    }

    public int lr() {
        return this.aw;
    }

    public String xha() {
        return this.nr;
    }

    public static boolean di(wjv wjvVar) {
        return fi(wjvVar) && dw(wjvVar) == 1;
    }

    public static boolean fi(wjv wjvVar) {
        dw dwVarZf = zf(wjvVar);
        return dwVarZf != null && wjvVar.tp() && dwVarZf.ik && !TextUtils.isEmpty(co(wjvVar));
    }

    public static boolean ik(wjv wjvVar) {
        return lr(wjvVar) && dw(wjvVar) == 1;
    }

    public static boolean ka(wjv wjvVar) {
        return ik(wjvVar) && !xha(wjvVar);
    }

    public static boolean lr(wjv wjvVar) {
        dw dwVarZf = zf(wjvVar);
        return (dwVarZf == null || !dwVarZf.ik || TextUtils.isEmpty(co(wjvVar))) ? false : true;
    }

    public static boolean xha(wjv wjvVar) {
        dw dwVarTw = wjvVar.tw();
        return dwVarTw != null && dwVarTw.ik && dwVarTw.lr == 1;
    }

    public int ri() {
        return this.f18136co;
    }

    public static int ri(wjv wjvVar) {
        int i;
        dw dwVarTw = wjvVar.tw();
        if (dwVarTw != null && (i = dwVarTw.ri) >= 0 && i <= 100) {
            return i;
        }
        return 0;
    }

    public int jbs() {
        return this.jbs;
    }

    public boolean qt() {
        return this.qt;
    }

    public int mj() {
        return this.mj;
    }
}
