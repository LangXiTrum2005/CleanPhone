package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Lxb {
    private long JXs;
    private float LD;
    private String Lxb;
    private long ZU;
    private String lc;
    private List<C0037Lxb> lk;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.core.Lxb$Lxb, reason: collision with other inner class name */
    public static class C0037Lxb {
        private String JXs;
        private float LD;
        private long Lxb;
        private float[] OY;
        private String QAg;
        private long ZU;
        private float ebl;
        private float lc;
        private String lk;
        private String nBu;

        public String JXs() {
            return this.JXs;
        }

        public float LD() {
            return this.LD;
        }

        public long Lxb() {
            return this.Lxb;
        }

        public float[] OY() {
            return this.OY;
        }

        public String QAg() {
            return this.QAg;
        }

        public long ZU() {
            return this.ZU;
        }

        public float ebl() {
            return this.ebl;
        }

        public float lc() {
            return this.lc;
        }

        public String lk() {
            return this.lk;
        }

        public String nBu() {
            return this.nBu;
        }

        public void LD(long j) {
            this.ZU = j;
        }

        public void Lxb(long j) {
            this.Lxb = j;
        }

        public void ZU(String str) {
            this.QAg = str;
        }

        public void lk(float f) {
            this.ebl = f;
        }

        public void LD(String str) {
            this.JXs = str;
        }

        public void Lxb(float f) {
            this.LD = f;
        }

        public void lk(String str) {
            this.nBu = str;
        }

        public void LD(float f) {
            this.lc = f;
        }

        public void Lxb(String str) {
            this.lk = str;
        }

        public void Lxb(float[] fArr) {
            this.OY = fArr;
        }

        public static C0037Lxb Lxb(JSONObject jSONObject, com.bytedance.adsdk.ugeno.LD.lk lkVar) {
            if (jSONObject == null) {
                return null;
            }
            C0037Lxb c0037Lxb = new C0037Lxb();
            c0037Lxb.Lxb(jSONObject.optLong("duration"));
            String strOptString = jSONObject.optString("loop");
            if (TextUtils.equals("infinite", strOptString)) {
                c0037Lxb.Lxb(-1.0f);
            } else {
                try {
                    c0037Lxb.Lxb(Float.parseFloat(strOptString));
                } catch (NumberFormatException unused) {
                    c0037Lxb.Lxb(0.0f);
                }
            }
            c0037Lxb.Lxb(jSONObject.optString("loopMode"));
            c0037Lxb.LD(jSONObject.optString("type"));
            if (TextUtils.equals(c0037Lxb.JXs(), "ripple")) {
                c0037Lxb.lk(jSONObject.optString("rippleColor"));
            }
            View viewQAg = lkVar.QAg();
            Context context = viewQAg != null ? viewQAg.getContext() : null;
            if (TextUtils.equals(c0037Lxb.JXs(), TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
                String strLxb = com.bytedance.adsdk.ugeno.lk.LD.Lxb(jSONObject.optString("valueTo"), lkVar.nBu());
                int iLxb = com.bytedance.adsdk.ugeno.ebl.Lxb.Lxb(jSONObject.optString("valueFrom"));
                int iLxb2 = com.bytedance.adsdk.ugeno.ebl.Lxb.Lxb(strLxb);
                c0037Lxb.LD(iLxb);
                c0037Lxb.lk(iLxb2);
            } else if ((TextUtils.equals(c0037Lxb.JXs(), "translateX") || TextUtils.equals(c0037Lxb.JXs(), "translateY")) && context != null) {
                try {
                    float fLxb = com.bytedance.adsdk.ugeno.ebl.OY.Lxb(context, (float) jSONObject.optDouble("valueFrom"));
                    float fLxb2 = com.bytedance.adsdk.ugeno.ebl.OY.Lxb(context, (float) jSONObject.optDouble("valueTo"));
                    c0037Lxb.LD(fLxb);
                    c0037Lxb.lk(fLxb2);
                } catch (Exception unused2) {
                }
            } else {
                c0037Lxb.LD((float) jSONObject.optDouble("valueFrom"));
                c0037Lxb.lk((float) jSONObject.optDouble("valueTo"));
            }
            c0037Lxb.ZU(jSONObject.optString("interpolator"));
            c0037Lxb.LD(com.bytedance.adsdk.ugeno.ebl.lk.Lxb(com.bytedance.adsdk.ugeno.lk.LD.Lxb(jSONObject.optString("startDelay"), lkVar.nBu()), 0L));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("values");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                float[] fArr = new float[jSONArrayOptJSONArray.length()];
                int i = 0;
                if ((TextUtils.equals(c0037Lxb.JXs(), "translateX") || TextUtils.equals(c0037Lxb.JXs(), "translateY")) && context != null) {
                    while (i < jSONArrayOptJSONArray.length()) {
                        fArr[i] = com.bytedance.adsdk.ugeno.ebl.OY.Lxb(context, (float) Lxb.Lxb(jSONArrayOptJSONArray.optString(i), lkVar.nBu()));
                        i++;
                    }
                } else {
                    while (i < jSONArrayOptJSONArray.length()) {
                        fArr[i] = (float) Lxb.Lxb(jSONArrayOptJSONArray.optString(i), lkVar.nBu());
                        i++;
                    }
                }
                c0037Lxb.Lxb(fArr);
            }
            return c0037Lxb;
        }
    }

    public long JXs() {
        return this.JXs;
    }

    public float LD() {
        return this.LD;
    }

    public String Lxb() {
        return this.Lxb;
    }

    public long ZU() {
        return this.ZU;
    }

    public String lc() {
        return this.lc;
    }

    public List<C0037Lxb> lk() {
        return this.lk;
    }

    public void LD(long j) {
        this.JXs = j;
    }

    public void Lxb(String str) {
        this.Lxb = str;
    }

    public void LD(String str) {
        this.lc = str;
    }

    public void Lxb(float f) {
        this.LD = f;
    }

    public void Lxb(List<C0037Lxb> list) {
        this.lk = list;
    }

    public void Lxb(long j) {
        this.ZU = j;
    }

    public static Lxb Lxb(String str, com.bytedance.adsdk.ugeno.LD.lk lkVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Lxb(new JSONObject(str), lkVar);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static Lxb Lxb(JSONObject jSONObject, com.bytedance.adsdk.ugeno.LD.lk lkVar) {
        return Lxb(jSONObject, null, lkVar);
    }

    public static Lxb Lxb(JSONObject jSONObject, JSONObject jSONObject2, com.bytedance.adsdk.ugeno.LD.lk lkVar) {
        if (jSONObject == null) {
            return null;
        }
        Lxb lxb = new Lxb();
        lxb.Lxb(jSONObject.optString("ordering"));
        String strOptString = jSONObject.optString("loop");
        if (TextUtils.equals("infinite", strOptString)) {
            lxb.Lxb(-1.0f);
        } else {
            try {
                lxb.Lxb(Float.parseFloat(strOptString));
            } catch (NumberFormatException unused) {
                lxb.Lxb(0.0f);
            }
        }
        lxb.Lxb(jSONObject.optLong("duration", 0L));
        lxb.LD(com.bytedance.adsdk.ugeno.ebl.lk.Lxb(com.bytedance.adsdk.ugeno.lk.LD.Lxb(jSONObject.optString("startDelay"), lkVar.nBu()), 0L));
        lxb.LD(jSONObject.optString("loopMode"));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("animators");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObject2 != null) {
                    com.bytedance.adsdk.ugeno.ebl.LD.Lxb(jSONObject2, jSONObjectOptJSONObject);
                }
                arrayList.add(C0037Lxb.Lxb(jSONObjectOptJSONObject, lkVar));
            }
            lxb.Lxb(arrayList);
        }
        return lxb;
    }

    public static double Lxb(Object obj, JSONObject jSONObject) {
        if (obj instanceof String) {
            return com.bytedance.adsdk.ugeno.ebl.lk.Lxb(com.bytedance.adsdk.ugeno.lk.LD.Lxb((String) obj, jSONObject), 0.0d);
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof Long) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof Integer) {
            return ((Double) obj).doubleValue();
        }
        return 0.0d;
    }
}
