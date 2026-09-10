package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class fr {
    private int aw;
    private int bgr;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private JSONObject f18137co;
    private int di;
    private int fi;
    private int ik;
    private String jbs;
    private int ka;
    private oh nr;
    private int ri;
    private boolean sf;
    private lr tan;
    private JSONObject xha;
    private int lr = 10;
    private int mj = 1;
    private ri qt = new ri();
    private int vr = 1;
    private String slm = "Next Ad";
    private String bu = "Next ad in %1$ds";

    public static fr ri(String str) {
        fr frVar = new fr();
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                frVar.ri = jSONObject.optInt("auto_switch");
                frVar.lr = jSONObject.optInt("playable_preload_count");
                frVar.ik = jSONObject.optInt("disable_on_interaction");
                frVar.ka = jSONObject.optInt("ceiling_type");
                frVar.fi = jSONObject.optInt("can_loop");
                frVar.di = jSONObject.optInt("multi_skip_time", -1);
                frVar.mj = jSONObject.optInt("load_more_strategy");
                frVar.vr = jSONObject.optInt("report_show_by_percent", 1);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("gesture_tpl_info");
                frVar.xha = jSONObjectOptJSONObject;
                if (jSONObjectOptJSONObject != null) {
                    oh ohVarRi = oh.ri(jSONObjectOptJSONObject);
                    frVar.nr = ohVarRi;
                    if (ohVarRi != null && !TextUtils.isEmpty(ohVarRi.ik())) {
                        com.bytedance.sdk.openadsdk.core.co.ri.lr.ri().ri(new com.bytedance.sdk.openadsdk.core.co.mj.ri().ri(frVar.nr.ri()).lr(frVar.nr.lr()).ik(frVar.nr.ik()).ka(frVar.nr.ka()), "guide");
                    }
                    int iOptInt = frVar.xha.optInt("delay_show_time", 5);
                    frVar.aw = iOptInt;
                    if (iOptInt < 0) {
                        frVar.aw = 5;
                    }
                    int iOptInt2 = frVar.xha.optInt("dismiss_after_idle_time", 3);
                    frVar.bgr = iOptInt2;
                    if (iOptInt2 <= 0) {
                        frVar.bgr = 3;
                    }
                }
                frVar.jbs = jSONObject.optString("agg_endcard_url");
                frVar.sf = jSONObject.optBoolean("has_more");
                frVar.f18137co = jSONObject.optJSONObject("session_params");
                frVar.qt = ri.ri(jSONObject.optJSONObject("layout_config"));
                frVar.tan = lr.ri(jSONObject.optJSONObject("progress_config"));
            } catch (JSONException unused) {
            }
        }
        return frVar;
    }

    public boolean aw() {
        return this.sf;
    }

    public boolean bgr() {
        return this.ik == 1;
    }

    public lr bu() {
        return this.tan;
    }

    public JSONObject co() {
        return this.f18137co;
    }

    public ri di() {
        return this.qt;
    }

    public int fi() {
        return this.bgr;
    }

    public JSONObject ik() {
        oh ohVar = this.nr;
        if (ohVar == null) {
            return null;
        }
        return ohVar.fi();
    }

    public int jbs() {
        return this.di;
    }

    public int ka() {
        return this.aw;
    }

    public JSONObject lr() {
        oh ohVar = this.nr;
        if (ohVar == null) {
            return null;
        }
        try {
            String strKa = ohVar.ka();
            if (!TextUtils.isEmpty(strKa)) {
                return new JSONObject(strKa);
            }
            String strRi = com.bytedance.sdk.openadsdk.core.co.ri.lr.ri().ri("guide", this.nr.ri(), this.nr.lr());
            if (TextUtils.isEmpty(strRi)) {
                return null;
            }
            return new JSONObject(strRi);
        } catch (JSONException unused) {
            return null;
        }
    }

    public int mj() {
        return this.mj;
    }

    public boolean qt() {
        return this.fi == 1;
    }

    public boolean sf() {
        return this.ka == 1;
    }

    public int slm() {
        return this.lr;
    }

    public boolean vr() {
        return this.ri == 1;
    }

    public String xha() {
        return this.jbs;
    }

    public static class lr {
        private float fi;
        private String ik;
        private float ka;
        private String lr;
        private int ri;

        public static lr ri(JSONObject jSONObject) {
            lr lrVar = new lr();
            if (jSONObject == null) {
                return lrVar;
            }
            lrVar.ri = jSONObject.optInt("progress_type", 0);
            lrVar.lr = jSONObject.optString("progress_color");
            lrVar.ik = jSONObject.optString("progress_background_color");
            lrVar.ka = jSONObject.optInt("progress_size", 0);
            lrVar.fi = jSONObject.optInt("bar_radius", 0);
            return lrVar;
        }

        public float fi() {
            return this.fi;
        }

        public String ik() {
            return this.ik;
        }

        public float ka() {
            return this.ka;
        }

        public String lr() {
            return this.lr;
        }

        public int ri() {
            return this.ri;
        }
    }

    public static class ri {
        private int fi;
        private int ik;
        private int ka;
        private int lr;
        private int ri;

        public static ri ri(JSONObject jSONObject) {
            ri riVar = new ri();
            if (jSONObject == null) {
                return riVar;
            }
            riVar.ri = Math.max(0, jSONObject.optInt("padding_left", 0));
            riVar.lr = Math.max(0, jSONObject.optInt("padding_right", 0));
            riVar.ik = Math.max(0, jSONObject.optInt("padding_top", 0));
            riVar.ka = Math.max(0, jSONObject.optInt("padding_bottom", 0));
            riVar.fi = Math.max(0, jSONObject.optInt("card_spacing", 0));
            return riVar;
        }

        public int fi() {
            return this.fi;
        }

        public int ik() {
            return this.ri;
        }

        public int ka() {
            return this.lr;
        }

        public int lr() {
            return this.ik;
        }

        public int ri() {
            return this.ka;
        }
    }

    public boolean ri() {
        return this.vr == 1;
    }
}
