package com.bytedance.sdk.openadsdk.core.settings;

import com.smartdigimkt.f3.b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ud {
    public int aaj;
    public int bch;
    public int bjy;
    public int bqt;
    public JSONObject ekw;
    public int exc;
    public int exu;
    public int fs;
    public int jl;
    public int jpc;
    public int jtx;
    public boolean jyq;
    public int kdv;
    public boolean koa;
    public List<String> ljh;
    public int lnr;
    public int mml;
    public int mo;
    public int mzz;
    public int oth;
    public String qdl;
    public boolean rc;
    public int rdp;
    public int rq;
    public int to;
    public int tvp;
    public int ud;
    public int uw;
    public boolean vu;
    public int wd;
    public int xmv;
    public int yt;

    public ud(JSONObject jSONObject) {
        this.ud = 1;
        this.lnr = 1;
        this.mml = 2;
        this.mzz = 1;
        this.mo = 100;
        this.wd = 0;
        this.jpc = 2;
        this.tvp = 1;
        this.to = 3;
        this.rq = 30;
        this.fs = 30;
        this.exu = 1;
        this.rdp = 1;
        this.bjy = 2;
        this.jtx = 1500;
        this.yt = 2;
        this.jl = 3500;
        this.exc = 0;
        this.aaj = 5;
        this.jyq = false;
        this.oth = 0;
        this.bch = 2;
        this.uw = 0;
        this.xmv = 0;
        this.bqt = 5;
        this.koa = true;
        this.vu = false;
        this.rc = false;
        this.kdv = -1;
        new JSONObject();
        this.ekw = jSONObject;
        if (jSONObject == null) {
            return;
        }
        this.qdl = jSONObject.optString("code_id");
        this.ud = jSONObject.optInt("auto_play", 1);
        this.kdv = jSONObject.optInt("endcard_close_time", -1);
        this.lnr = jSONObject.optInt("voice_control", 1);
        this.mml = jSONObject.optInt("rv_preload", 2);
        this.mzz = jSONObject.optInt("nv_preload", 1);
        this.mo = Math.min(100, Math.max(0, jSONObject.optInt("proportion_watching", 100)));
        this.wd = jSONObject.optInt("skip_time_displayed", 0);
        this.jpc = jSONObject.optInt(b.f35026Q, 2);
        this.tvp = jSONObject.optInt("reg_creative_control", 1);
        this.to = jSONObject.optInt("play_bar_show_time", 3);
        int iOptInt = jSONObject.optInt("rv_skip_time", 30);
        this.rq = iOptInt;
        if (iOptInt < 0) {
            this.rq = 30;
        }
        this.exu = jSONObject.optInt("voice_control", 2);
        this.rdp = jSONObject.optInt("if_show_win", 1);
        this.bjy = jSONObject.optInt("sp_preload", 2);
        this.jtx = jSONObject.optInt("stop_time", 1500);
        this.yt = jSONObject.optInt("native_playable_delay", 2);
        this.jl = jSONObject.optInt("time_out_control", -1);
        this.exc = jSONObject.optInt("playable_reward_type", 0);
        this.oth = jSONObject.optInt("reward_is_callback", 0);
        int iOptInt2 = jSONObject.optInt("iv_skip_time", 5);
        this.aaj = iOptInt2;
        if (iOptInt2 < 0) {
            this.aaj = 5;
        }
        qdl(jSONObject.optJSONArray("parent_tpl_ids"));
        this.bch = jSONObject.optInt("slot_type", 2);
        this.jyq = jSONObject.optBoolean("close_on_click", false);
        this.uw = jSONObject.optInt("allow_system_back", 0);
        this.xmv = jSONObject.optInt("splash_skip_time", 0);
        this.bqt = jSONObject.optInt("splash_image_count_down_time", 5);
        this.vu = jSONObject.optBoolean("splash_count_down_time_off", false);
        this.rc = jSONObject.optBoolean("splash_close_on_click", false);
        this.koa = jSONObject.optBoolean("allow_mediaview_click", true);
        if (!qdl(this.lnr)) {
            this.lnr = 1;
        }
        if (!qdl(this.exu)) {
            this.exu = 1;
        }
        this.fs = jSONObject.optInt("multi_rv_skip_time", 30);
    }

    private static boolean qdl(int i2) {
        return i2 == 1 || i2 == 2;
    }

    public void qdl(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        this.ljh = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                this.ljh.add(jSONArray.get(i2).toString());
            } catch (Exception unused) {
                return;
            }
        }
    }

    public ud(String str, int i2) {
        this.ud = 1;
        this.lnr = 1;
        this.mml = 2;
        this.mzz = 1;
        this.mo = 100;
        this.wd = 0;
        this.jpc = 2;
        this.tvp = 1;
        this.to = 3;
        this.rq = 30;
        this.fs = 30;
        this.exu = 1;
        this.rdp = 1;
        this.bjy = 2;
        this.jtx = 1500;
        this.yt = 2;
        this.jl = 3500;
        this.exc = 0;
        this.aaj = 5;
        this.jyq = false;
        this.oth = 0;
        this.bch = 2;
        this.uw = 0;
        this.xmv = 0;
        this.bqt = 5;
        this.koa = true;
        this.vu = false;
        this.rc = false;
        this.kdv = -1;
        this.ekw = new JSONObject();
        this.qdl = str;
        this.lnr = i2;
    }
}
