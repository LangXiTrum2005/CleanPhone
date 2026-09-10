package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class vu {
    private int bjy;
    private int exu;
    private int fs;
    private String jl;
    private int jpc;
    private String jtx;
    private boolean lnr;
    private int mml;
    private String mo;
    private String mzz;
    private int qdl;
    private int rdp;
    private int rq;
    private boolean to;
    private int tvp;
    private int ud;
    private int wd;
    private String yt;

    public vu(JSONObject jSONObject) {
        this.fs = 5;
        this.exu = 5;
        this.rdp = 10;
        this.bjy = 20;
        this.jtx = "Next Ad";
        this.yt = "Next ad in %1$ds";
        this.jl = "Play Now";
        if (jSONObject == null) {
            return;
        }
        this.lnr = jSONObject.optBoolean("is_playable");
        this.mml = jSONObject.optInt("playable_type", 0);
        this.mzz = jSONObject.optString("playable_style");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("playable");
        if (jSONObjectOptJSONObject != null) {
            this.mo = jSONObjectOptJSONObject.optString("playable_url", "");
            this.wd = jSONObjectOptJSONObject.optInt("playable_orientation", 0);
            this.ud = jSONObjectOptJSONObject.optInt("new_style", 0);
            this.qdl = jSONObjectOptJSONObject.optInt("close_2_app", 0);
            int iQdl = qdl(this.mml);
            this.jpc = jSONObjectOptJSONObject.optInt("playable_webview_timeout", iQdl);
            this.tvp = jSONObjectOptJSONObject.optInt("playable_js_timeout", iQdl);
            this.to = jSONObjectOptJSONObject.optInt("playable_backup_enable", 0) == 1;
            this.fs = jSONObjectOptJSONObject.optInt("wait_tips_time", 5);
            this.exu = jSONObjectOptJSONObject.optInt("auto_to_next_time", 5);
            this.rdp = jSONObjectOptJSONObject.optInt("next_ad_tips_show_time", 10);
            this.bjy = jSONObjectOptJSONObject.optInt("max_show_time", 20);
            this.yt = jSONObjectOptJSONObject.optString("next_ad_in_xs");
            this.jtx = jSONObjectOptJSONObject.optString("next_ad_text");
            this.jl = jSONObjectOptJSONObject.optString("play_now_text");
            int iOptInt = jSONObjectOptJSONObject.optInt("countdown_show_type", 0);
            this.rq = iOptInt;
            if (iOptInt == 0 || iOptInt == 1 || iOptInt == 2) {
                return;
            }
            this.rq = 0;
        }
    }

    public static boolean aaj(ljh ljhVar) {
        vu vuVarKoa = koa(ljhVar);
        return vuVarKoa != null && vuVarKoa.to();
    }

    public static String bch(ljh ljhVar) {
        vu vuVarKoa = koa(ljhVar);
        if (vuVarKoa == null) {
            return null;
        }
        return vuVarKoa.mo();
    }

    public static int bjy(ljh ljhVar) {
        vu vuVarKoa = koa(ljhVar);
        if (vuVarKoa == null) {
            return 0;
        }
        return vuVarKoa.wd;
    }

    public static int bqt(ljh ljhVar) {
        vu vuVarKoa = koa(ljhVar);
        if (vuVarKoa == null) {
            return 0;
        }
        return vuVarKoa.mml();
    }

    public static long exc(ljh ljhVar) {
        vu vuVarKoa = koa(ljhVar);
        if (vuVarKoa == null) {
            return 5L;
        }
        return vuVarKoa.tvp();
    }

    public static boolean exu(ljh ljhVar) {
        return true;
    }

    public static String fs(ljh ljhVar) {
        if (ljhVar == null) {
            return null;
        }
        vu vuVarZlt = ljhVar.zlt();
        if (vuVarZlt != null && vuVarZlt.lnr) {
            String str = vuVarZlt.mo;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        if (ljhVar.taz() == 20) {
            return ljhVar.od();
        }
        if (ljhVar.tdy() != null) {
            return ljhVar.tdy().fs();
        }
        return null;
    }

    public static long jl(ljh ljhVar) {
        vu vuVarKoa = koa(ljhVar);
        if (vuVarKoa == null) {
            return 5L;
        }
        return vuVarKoa.jpc();
    }

    public static boolean jpc(ljh ljhVar) {
        vu vuVarZlt = ljhVar.zlt();
        return vuVarZlt != null && ljhVar.ip() && vuVarZlt.lnr && vuVarZlt.ud == 1;
    }

    public static boolean jtx(ljh ljhVar) {
        return false;
    }

    public static int jyq(ljh ljhVar) {
        vu vuVarKoa = koa(ljhVar);
        if (vuVarKoa == null) {
            return 0;
        }
        return vuVarKoa.qdl();
    }

    private static vu koa(ljh ljhVar) {
        if (ljhVar == null) {
            return null;
        }
        return ljhVar.zlt();
    }

    public static String ljh(ljh ljhVar) {
        vu vuVarKoa = koa(ljhVar);
        if (vuVarKoa == null) {
            return null;
        }
        return vuVarKoa.wd();
    }

    public static String oth(ljh ljhVar) {
        vu vuVarKoa = koa(ljhVar);
        if (vuVarKoa == null) {
            return null;
        }
        return vuVarKoa.mzz();
    }

    private static int qdl(int i2) {
        return i2 == 1 ? 10 : 5;
    }

    public static boolean rdp(ljh ljhVar) {
        com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud udVarTdy = ljhVar.tdy();
        return udVarTdy != null && udVarTdy.aaj() == 1;
    }

    public static String rq(ljh ljhVar) {
        vu vuVarKoa = koa(ljhVar);
        if (vuVarKoa == null) {
            return null;
        }
        return vuVarKoa.mo;
    }

    public static String to(ljh ljhVar) {
        vu vuVarKoa = koa(ljhVar);
        if (vuVarKoa == null) {
            return null;
        }
        return vuVarKoa.mzz;
    }

    public static int tvp(ljh ljhVar) {
        vu vuVarKoa = koa(ljhVar);
        if (vuVarKoa == null) {
            return 0;
        }
        return vuVarKoa.rq;
    }

    public static int uw(ljh ljhVar) {
        vu vuVarKoa = koa(ljhVar);
        if (vuVarKoa == null) {
            return 0;
        }
        return vuVarKoa.ud();
    }

    private static int vu(ljh ljhVar) {
        vu vuVarKoa = koa(ljhVar);
        if (vuVarKoa == null) {
            return 0;
        }
        return vuVarKoa.mml;
    }

    public static int xmv(ljh ljhVar) {
        vu vuVarKoa = koa(ljhVar);
        if (vuVarKoa == null) {
            return 0;
        }
        return vuVarKoa.lnr();
    }

    public static long yt(ljh ljhVar) {
        return Math.max(jl(ljhVar), exc(ljhVar));
    }

    public int lnr() {
        return this.rdp;
    }

    public int mml() {
        return this.bjy;
    }

    public String mo() {
        return this.yt;
    }

    public String mzz() {
        return this.jtx;
    }

    public int ud() {
        return this.exu;
    }

    public String wd() {
        return this.jl;
    }

    public static boolean lnr(ljh ljhVar) {
        return ud(ljhVar) && vu(ljhVar) == 1;
    }

    public static boolean mml(ljh ljhVar) {
        return lnr(ljhVar) && !wd(ljhVar);
    }

    public static boolean mo(ljh ljhVar) {
        return mzz(ljhVar) && vu(ljhVar) == 1;
    }

    public static boolean mzz(ljh ljhVar) {
        vu vuVarKoa = koa(ljhVar);
        return vuVarKoa != null && ljhVar.ip() && vuVarKoa.lnr && !TextUtils.isEmpty(fs(ljhVar));
    }

    public static boolean ud(ljh ljhVar) {
        vu vuVarKoa = koa(ljhVar);
        return (vuVarKoa == null || !vuVarKoa.lnr || TextUtils.isEmpty(fs(ljhVar))) ? false : true;
    }

    public static boolean wd(ljh ljhVar) {
        vu vuVarZlt = ljhVar.zlt();
        return vuVarZlt != null && vuVarZlt.lnr && vuVarZlt.ud == 1;
    }

    public int qdl() {
        return this.fs;
    }

    public static int qdl(ljh ljhVar) {
        int i2;
        vu vuVarZlt = ljhVar.zlt();
        if (vuVarZlt != null && (i2 = vuVarZlt.qdl) >= 0 && i2 <= 100) {
            return i2;
        }
        return 0;
    }

    public boolean to() {
        return this.to;
    }

    public int tvp() {
        return this.tvp;
    }

    public int jpc() {
        return this.jpc;
    }

    public void qdl(JSONObject jSONObject) {
        try {
            jSONObject.put("is_playable", this.lnr);
        } catch (JSONException e2) {
            com.bytedance.sdk.component.utils.aaj.lnr("PlayableModel", e2.getMessage());
        }
        if (!TextUtils.isEmpty(this.mo)) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("playable_url", this.mo);
                jSONObject2.put("playable_orientation", this.wd);
                jSONObject2.put("new_style", this.ud);
                jSONObject2.put("close_2_app", this.qdl);
                jSONObject2.put("playable_webview_timeout", this.jpc);
                jSONObject2.put("playable_js_timeout", this.tvp);
                jSONObject2.put("playable_backup_enable", this.to ? 1 : 0);
                jSONObject2.put("wait_tips_time", this.fs);
                jSONObject2.put("auto_to_next_time", this.exu);
                jSONObject2.put("next_ad_tips_show_time", this.rdp);
                jSONObject2.put("max_show_time", this.bjy);
                jSONObject2.put("next_ad_in_xs", this.yt);
                jSONObject2.put("play_now_text", this.jl);
                jSONObject2.put("next_ad_text", this.jtx);
                jSONObject2.put("countdown_show_type", this.rq);
                jSONObject.put("playable", jSONObject2);
            } catch (Exception e3) {
                com.bytedance.sdk.component.utils.aaj.lnr("PlayableModel", e3.getMessage());
            }
        }
        try {
            jSONObject.put("playable_type", this.mml);
        } catch (JSONException e4) {
            com.bytedance.sdk.component.utils.aaj.lnr("PlayableModel", e4.getMessage());
        }
        try {
            jSONObject.put("playable_style", this.mzz);
        } catch (JSONException e5) {
            com.bytedance.sdk.component.utils.aaj.lnr("PlayableModel", e5.getMessage());
        }
    }
}
