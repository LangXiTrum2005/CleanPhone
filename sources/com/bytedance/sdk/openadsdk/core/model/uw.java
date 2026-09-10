package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class uw {
    private ud exc;
    private int exu;
    private JSONObject fs;
    private ekw jl;
    private int lnr;
    private int mml;
    private int mo;
    private int mzz;
    private int qdl;
    private int rdp;
    private boolean rq;
    private String tvp;
    private JSONObject wd;
    private int ud = 10;
    private int jpc = 1;
    private qdl to = new qdl();
    private int bjy = 1;
    private String jtx = "Next Ad";
    private String yt = "Next ad in %1$ds";

    public static uw qdl(String str) {
        uw uwVar = new uw();
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                uwVar.qdl = jSONObject.optInt("auto_switch");
                uwVar.ud = jSONObject.optInt("playable_preload_count");
                uwVar.lnr = jSONObject.optInt("disable_on_interaction");
                uwVar.mml = jSONObject.optInt("ceiling_type");
                uwVar.mzz = jSONObject.optInt("can_loop");
                uwVar.mo = jSONObject.optInt("multi_skip_time", -1);
                uwVar.jpc = jSONObject.optInt("load_more_strategy");
                uwVar.bjy = jSONObject.optInt("report_show_by_percent", 1);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("gesture_tpl_info");
                uwVar.wd = jSONObjectOptJSONObject;
                if (jSONObjectOptJSONObject != null) {
                    ekw ekwVarQdl = ekw.qdl(jSONObjectOptJSONObject);
                    uwVar.jl = ekwVarQdl;
                    if (ekwVarQdl != null && !TextUtils.isEmpty(ekwVarQdl.lnr())) {
                        com.bytedance.sdk.openadsdk.core.rq.qdl.ud.qdl().qdl(new com.bytedance.sdk.openadsdk.core.rq.jpc.qdl().qdl(uwVar.jl.qdl()).ud(uwVar.jl.ud()).lnr(uwVar.jl.lnr()).mml(uwVar.jl.mml()), "guide");
                    }
                    int iOptInt = uwVar.wd.optInt("delay_show_time", 5);
                    uwVar.exu = iOptInt;
                    if (iOptInt < 0) {
                        uwVar.exu = 5;
                    }
                    int iOptInt2 = uwVar.wd.optInt("dismiss_after_idle_time", 3);
                    uwVar.rdp = iOptInt2;
                    if (iOptInt2 <= 0) {
                        uwVar.rdp = 3;
                    }
                }
                uwVar.tvp = jSONObject.optString("agg_endcard_url");
                uwVar.rq = jSONObject.optBoolean("has_more");
                uwVar.fs = jSONObject.optJSONObject("session_params");
                uwVar.to = qdl.qdl(jSONObject.optJSONObject("layout_config"));
                uwVar.exc = ud.qdl(jSONObject.optJSONObject("progress_config"));
            } catch (JSONException unused) {
            }
        }
        return uwVar;
    }

    public boolean bjy() {
        return this.qdl == 1;
    }

    public boolean exu() {
        return this.rq;
    }

    public JSONObject fs() {
        return this.fs;
    }

    public JSONObject jl() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("auto_switch", this.qdl);
            jSONObject.put("playable_preload_count", this.ud);
            jSONObject.put("disable_on_interaction", this.lnr);
            jSONObject.put("ceiling_type", this.mml);
            jSONObject.put("can_loop", this.mzz);
            jSONObject.put("multi_skip_time", this.mo);
            jSONObject.put("load_more_strategy", this.jpc);
            jSONObject.put("report_show_by_percent", this.bjy);
            jSONObject.put("gesture_tpl_info", this.wd);
            jSONObject.put("agg_endcard_url", this.tvp);
            jSONObject.put("layoutConfig", this.to.mo());
            jSONObject.put("has_more", this.rq);
            jSONObject.put("session_params", this.fs);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public int jpc() {
        return this.jpc;
    }

    public int jtx() {
        return this.ud;
    }

    public JSONObject lnr() {
        ekw ekwVar = this.jl;
        if (ekwVar == null) {
            return null;
        }
        return ekwVar.mzz();
    }

    public int mml() {
        return this.exu;
    }

    public qdl mo() {
        return this.to;
    }

    public int mzz() {
        return this.rdp;
    }

    public boolean rdp() {
        return this.lnr == 1;
    }

    public boolean rq() {
        return this.mml == 1;
    }

    public boolean to() {
        return this.mzz == 1;
    }

    public int tvp() {
        return this.mo;
    }

    public JSONObject ud() {
        ekw ekwVar = this.jl;
        if (ekwVar == null) {
            return null;
        }
        try {
            String strMml = ekwVar.mml();
            if (!TextUtils.isEmpty(strMml)) {
                return new JSONObject(strMml);
            }
            String strQdl = com.bytedance.sdk.openadsdk.core.rq.qdl.ud.qdl().qdl("guide", this.jl.qdl(), this.jl.ud());
            if (TextUtils.isEmpty(strQdl)) {
                return null;
            }
            return new JSONObject(strQdl);
        } catch (JSONException unused) {
            return null;
        }
    }

    public String wd() {
        return this.tvp;
    }

    public ud yt() {
        return this.exc;
    }

    public static class qdl {
        private int lnr;
        private int mml;
        private int mzz;
        private int qdl;
        private int ud;

        public static qdl qdl(JSONObject jSONObject) {
            qdl qdlVar = new qdl();
            if (jSONObject == null) {
                return qdlVar;
            }
            qdlVar.qdl = Math.max(0, jSONObject.optInt("padding_left", 0));
            qdlVar.ud = Math.max(0, jSONObject.optInt("padding_right", 0));
            qdlVar.lnr = Math.max(0, jSONObject.optInt("padding_top", 0));
            qdlVar.mml = Math.max(0, jSONObject.optInt("padding_bottom", 0));
            qdlVar.mzz = Math.max(0, jSONObject.optInt("card_spacing", 0));
            return qdlVar;
        }

        public int lnr() {
            return this.qdl;
        }

        public int mml() {
            return this.ud;
        }

        public JSONObject mo() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("padding_left", this.qdl);
                jSONObject.put("padding_right", this.ud);
                jSONObject.put("padding_top", this.lnr);
                jSONObject.put("padding_bottom", this.mml);
                jSONObject.put("card_spacing", this.mzz);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }

        public int mzz() {
            return this.mzz;
        }

        public int ud() {
            return this.lnr;
        }

        public int qdl() {
            return this.mml;
        }
    }

    public static class ud {
        private String lnr;
        private float mml;
        private float mzz;
        private int qdl;
        private String ud;

        public static ud qdl(JSONObject jSONObject) {
            ud udVar = new ud();
            if (jSONObject == null) {
                return udVar;
            }
            udVar.qdl = jSONObject.optInt("progress_type", 0);
            udVar.ud = jSONObject.optString("progress_color");
            udVar.lnr = jSONObject.optString("progress_background_color");
            udVar.mml = jSONObject.optInt("progress_size", 0);
            udVar.mzz = jSONObject.optInt("bar_radius", 0);
            return udVar;
        }

        public String lnr() {
            return this.lnr;
        }

        public float mml() {
            return this.mml;
        }

        public float mzz() {
            return this.mzz;
        }

        public String ud() {
            return this.ud;
        }

        public int qdl() {
            return this.qdl;
        }
    }

    public boolean qdl() {
        return this.bjy == 1;
    }
}
