package com.bytedance.sdk.openadsdk.core.settings;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    public int ac;
    public int aw;
    public int ay;
    public int bgr;
    public int bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public int f18147co;
    public int di;
    public boolean dw;
    public int fi;
    public int fr;
    public int hcw;
    public int igq;
    public boolean ihz;
    public int ik;
    public int jbs;
    public int ka;
    public int lr;
    public int mj;
    public int nr;
    public JSONObject oh;
    public boolean ory;
    public int qt;
    public String ri;
    public int sf;
    public int slm;
    public int su;
    public int tan;
    public int uq;
    public int vr;
    public List<String> wjv;
    public int xha;
    public boolean zf;

    public lr(JSONObject jSONObject) {
        this.lr = 1;
        this.ik = 1;
        this.ka = 2;
        this.fi = 1;
        this.di = 100;
        this.xha = 0;
        this.mj = 2;
        this.jbs = 1;
        this.qt = 3;
        this.sf = 30;
        this.f18147co = 30;
        this.aw = 1;
        this.bgr = 1;
        this.vr = 2;
        this.slm = 1500;
        this.bu = 2;
        this.nr = 3500;
        this.tan = 0;
        this.ac = 5;
        this.ihz = false;
        this.uq = 0;
        this.ay = 2;
        this.fr = 0;
        this.su = 0;
        this.igq = 5;
        this.zf = true;
        this.dw = false;
        this.ory = false;
        this.hcw = -1;
        new JSONObject();
        this.oh = jSONObject;
        if (jSONObject == null) {
            return;
        }
        this.ri = jSONObject.optString("code_id");
        this.lr = jSONObject.optInt("auto_play", 1);
        this.hcw = jSONObject.optInt("endcard_close_time", -1);
        this.ik = jSONObject.optInt("voice_control", 1);
        this.ka = jSONObject.optInt("rv_preload", 2);
        this.fi = jSONObject.optInt("nv_preload", 1);
        this.di = Math.min(100, Math.max(0, jSONObject.optInt("proportion_watching", 100)));
        this.xha = jSONObject.optInt("skip_time_displayed", 0);
        this.mj = jSONObject.optInt("video_skip_result", 2);
        this.jbs = jSONObject.optInt("reg_creative_control", 1);
        this.qt = jSONObject.optInt("play_bar_show_time", 3);
        int iOptInt = jSONObject.optInt("rv_skip_time", 30);
        this.sf = iOptInt;
        if (iOptInt < 0) {
            this.sf = 30;
        }
        this.aw = jSONObject.optInt("voice_control", 2);
        this.bgr = jSONObject.optInt("if_show_win", 1);
        this.vr = jSONObject.optInt("sp_preload", 2);
        this.slm = jSONObject.optInt("stop_time", 1500);
        this.bu = jSONObject.optInt("native_playable_delay", 2);
        this.nr = jSONObject.optInt("time_out_control", -1);
        this.tan = jSONObject.optInt("playable_reward_type", 0);
        this.uq = jSONObject.optInt("reward_is_callback", 0);
        int iOptInt2 = jSONObject.optInt("iv_skip_time", 5);
        this.ac = iOptInt2;
        if (iOptInt2 < 0) {
            this.ac = 5;
        }
        ri(jSONObject.optJSONArray("parent_tpl_ids"));
        this.ay = jSONObject.optInt("slot_type", 2);
        this.ihz = jSONObject.optBoolean("close_on_click", false);
        this.fr = jSONObject.optInt("allow_system_back", 0);
        this.su = jSONObject.optInt("splash_skip_time", 0);
        this.igq = jSONObject.optInt("splash_image_count_down_time", 5);
        this.dw = jSONObject.optBoolean("splash_count_down_time_off", false);
        this.ory = jSONObject.optBoolean("splash_close_on_click", false);
        this.zf = jSONObject.optBoolean("allow_mediaview_click", true);
        if (!ri(this.ik)) {
            this.ik = 1;
        }
        if (!ri(this.aw)) {
            this.aw = 1;
        }
        this.f18147co = jSONObject.optInt("multi_rv_skip_time", 30);
    }

    private static boolean ri(int i) {
        return i == 1 || i == 2;
    }

    public void ri(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        this.wjv = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                this.wjv.add(jSONArray.get(i).toString());
            } catch (Exception unused) {
                return;
            }
        }
    }

    public lr(String str, int i) {
        this.lr = 1;
        this.ik = 1;
        this.ka = 2;
        this.fi = 1;
        this.di = 100;
        this.xha = 0;
        this.mj = 2;
        this.jbs = 1;
        this.qt = 3;
        this.sf = 30;
        this.f18147co = 30;
        this.aw = 1;
        this.bgr = 1;
        this.vr = 2;
        this.slm = 1500;
        this.bu = 2;
        this.nr = 3500;
        this.tan = 0;
        this.ac = 5;
        this.ihz = false;
        this.uq = 0;
        this.ay = 2;
        this.fr = 0;
        this.su = 0;
        this.igq = 5;
        this.zf = true;
        this.dw = false;
        this.ory = false;
        this.hcw = -1;
        this.oh = new JSONObject();
        this.ri = str;
        this.ik = i;
    }
}
