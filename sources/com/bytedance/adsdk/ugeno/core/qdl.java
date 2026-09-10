package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class qdl {
    private List<C0061qdl> lnr;
    private long mml;
    private String mo;
    private long mzz;
    private String qdl;
    private float ud;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.core.qdl$qdl, reason: collision with other inner class name */
    public static class C0061qdl {
        private float[] jpc;
        private String lnr;
        private long mml;
        private float mo;
        private String mzz;
        private long qdl;
        private String to;
        private String tvp;
        private float ud;
        private float wd;

        public float[] jpc() {
            return this.jpc;
        }

        public String lnr() {
            return this.lnr;
        }

        public long mml() {
            return this.mml;
        }

        public float mo() {
            return this.mo;
        }

        public String mzz() {
            return this.mzz;
        }

        public long qdl() {
            return this.qdl;
        }

        public String to() {
            return this.to;
        }

        public String tvp() {
            return this.tvp;
        }

        public float ud() {
            return this.ud;
        }

        public float wd() {
            return this.wd;
        }

        public void lnr(float f) {
            this.wd = f;
        }

        public void mml(String str) {
            this.tvp = str;
        }

        public void qdl(long j) {
            this.qdl = j;
        }

        public void ud(long j) {
            this.mml = j;
        }

        public void lnr(String str) {
            this.to = str;
        }

        public void qdl(float f) {
            this.ud = f;
        }

        public void ud(String str) {
            this.mzz = str;
        }

        public void qdl(String str) {
            this.lnr = str;
        }

        public void ud(float f) {
            this.mo = f;
        }

        public void qdl(float[] fArr) {
            this.jpc = fArr;
        }

        public static C0061qdl qdl(JSONObject jSONObject, com.bytedance.adsdk.ugeno.ud.lnr lnrVar) {
            if (jSONObject == null) {
                return null;
            }
            C0061qdl c0061qdl = new C0061qdl();
            c0061qdl.qdl(jSONObject.optLong("duration"));
            String strOptString = jSONObject.optString("loop");
            if (TextUtils.equals("infinite", strOptString)) {
                c0061qdl.qdl(-1.0f);
            } else {
                try {
                    c0061qdl.qdl(Float.parseFloat(strOptString));
                } catch (NumberFormatException unused) {
                    c0061qdl.qdl(0.0f);
                }
            }
            c0061qdl.qdl(jSONObject.optString("loopMode"));
            c0061qdl.ud(jSONObject.optString("type"));
            if (TextUtils.equals(c0061qdl.mzz(), "ripple")) {
                c0061qdl.lnr(jSONObject.optString("rippleColor"));
            }
            View viewRq = lnrVar.rq();
            Context context = viewRq != null ? viewRq.getContext() : null;
            if (TextUtils.equals(c0061qdl.mzz(), TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
                String strQdl = com.bytedance.adsdk.ugeno.lnr.ud.qdl(jSONObject.optString("valueTo"), lnrVar.fs());
                int iQdl = com.bytedance.adsdk.ugeno.wd.qdl.qdl(jSONObject.optString("valueFrom"));
                int iQdl2 = com.bytedance.adsdk.ugeno.wd.qdl.qdl(strQdl);
                c0061qdl.ud(iQdl);
                c0061qdl.lnr(iQdl2);
            } else if ((TextUtils.equals(c0061qdl.mzz(), "translateX") || TextUtils.equals(c0061qdl.mzz(), "translateY")) && context != null) {
                try {
                    float fQdl = com.bytedance.adsdk.ugeno.wd.jpc.qdl(context, (float) jSONObject.optDouble("valueFrom"));
                    float fQdl2 = com.bytedance.adsdk.ugeno.wd.jpc.qdl(context, (float) jSONObject.optDouble("valueTo"));
                    c0061qdl.ud(fQdl);
                    c0061qdl.lnr(fQdl2);
                } catch (Exception unused2) {
                    Log.e("animation", "animation ");
                }
            } else {
                c0061qdl.ud((float) jSONObject.optDouble("valueFrom"));
                c0061qdl.lnr((float) jSONObject.optDouble("valueTo"));
            }
            c0061qdl.mml(jSONObject.optString("interpolator"));
            String strQdl2 = com.bytedance.adsdk.ugeno.lnr.ud.qdl(jSONObject.optString("startDelay"), lnrVar.fs());
            Log.d("TAG", "createAnimationModel: ");
            c0061qdl.ud(com.bytedance.adsdk.ugeno.wd.lnr.qdl(strQdl2, 0L));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("values");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                float[] fArr = new float[jSONArrayOptJSONArray.length()];
                int i2 = 0;
                if ((TextUtils.equals(c0061qdl.mzz(), "translateX") || TextUtils.equals(c0061qdl.mzz(), "translateY")) && context != null) {
                    while (i2 < jSONArrayOptJSONArray.length()) {
                        fArr[i2] = com.bytedance.adsdk.ugeno.wd.jpc.qdl(context, (float) qdl.qdl(jSONArrayOptJSONArray.optString(i2), lnrVar.fs()));
                        i2++;
                    }
                } else {
                    while (i2 < jSONArrayOptJSONArray.length()) {
                        fArr[i2] = (float) qdl.qdl(jSONArrayOptJSONArray.optString(i2), lnrVar.fs());
                        i2++;
                    }
                }
                c0061qdl.qdl(fArr);
            }
            return c0061qdl;
        }
    }

    public List<C0061qdl> lnr() {
        return this.lnr;
    }

    public long mml() {
        return this.mml;
    }

    public String mo() {
        return this.mo;
    }

    public long mzz() {
        return this.mzz;
    }

    public String qdl() {
        return this.qdl;
    }

    public float ud() {
        return this.ud;
    }

    public void qdl(String str) {
        this.qdl = str;
    }

    public void ud(long j) {
        this.mzz = j;
    }

    public void qdl(float f) {
        this.ud = f;
    }

    public void ud(String str) {
        this.mo = str;
    }

    public void qdl(List<C0061qdl> list) {
        this.lnr = list;
    }

    public void qdl(long j) {
        this.mml = j;
    }

    public static qdl qdl(String str, com.bytedance.adsdk.ugeno.ud.lnr lnrVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return qdl(new JSONObject(str), lnrVar);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static qdl qdl(JSONObject jSONObject, com.bytedance.adsdk.ugeno.ud.lnr lnrVar) {
        return qdl(jSONObject, null, lnrVar);
    }

    public static qdl qdl(JSONObject jSONObject, JSONObject jSONObject2, com.bytedance.adsdk.ugeno.ud.lnr lnrVar) {
        if (jSONObject == null) {
            return null;
        }
        qdl qdlVar = new qdl();
        qdlVar.qdl(jSONObject.optString("ordering"));
        String strOptString = jSONObject.optString("loop");
        if (TextUtils.equals("infinite", strOptString)) {
            qdlVar.qdl(-1.0f);
        } else {
            try {
                qdlVar.qdl(Float.parseFloat(strOptString));
            } catch (NumberFormatException unused) {
                qdlVar.qdl(0.0f);
            }
        }
        qdlVar.qdl(jSONObject.optLong("duration", 0L));
        qdlVar.ud(com.bytedance.adsdk.ugeno.wd.lnr.qdl(com.bytedance.adsdk.ugeno.lnr.ud.qdl(jSONObject.optString("startDelay"), lnrVar.fs()), 0L));
        qdlVar.ud(jSONObject.optString("loopMode"));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("animators");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                if (jSONObject2 != null) {
                    com.bytedance.adsdk.ugeno.wd.ud.qdl(jSONObject2, jSONObjectOptJSONObject);
                }
                arrayList.add(C0061qdl.qdl(jSONObjectOptJSONObject, lnrVar));
            }
            qdlVar.qdl(arrayList);
        }
        return qdlVar;
    }

    public static double qdl(Object obj, JSONObject jSONObject) {
        if (obj instanceof String) {
            return com.bytedance.adsdk.ugeno.wd.lnr.qdl(com.bytedance.adsdk.ugeno.lnr.ud.qdl((String) obj, jSONObject), 0.0d);
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
