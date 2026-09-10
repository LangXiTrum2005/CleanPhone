package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    private String di;
    private long fi;
    private List<C0187ri> ik;
    private long ka;
    private float lr;
    private String ri;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.core.ri$ri, reason: collision with other inner class name */
    public static class C0187ri {
        private float di;
        private String fi;
        private String ik;
        private String jbs;
        private long ka;
        private float lr;
        private float[] mj;
        private String qt;
        private long ri;
        private float xha;

        public float di() {
            return this.di;
        }

        public String fi() {
            return this.fi;
        }

        public String ik() {
            return this.ik;
        }

        public String jbs() {
            return this.jbs;
        }

        public long ka() {
            return this.ka;
        }

        public float lr() {
            return this.lr;
        }

        public float[] mj() {
            return this.mj;
        }

        public String qt() {
            return this.qt;
        }

        public long ri() {
            return this.ri;
        }

        public float xha() {
            return this.xha;
        }

        public void ik(float f) {
            this.xha = f;
        }

        public void ka(String str) {
            this.jbs = str;
        }

        public void lr(long j) {
            this.ka = j;
        }

        public void ri(long j) {
            this.ri = j;
        }

        public void ik(String str) {
            this.qt = str;
        }

        public void lr(String str) {
            this.fi = str;
        }

        public void ri(float f) {
            this.lr = f;
        }

        public void lr(float f) {
            this.di = f;
        }

        public void ri(String str) {
            this.ik = str;
        }

        public void ri(float[] fArr) {
            this.mj = fArr;
        }

        public static C0187ri ri(JSONObject jSONObject, com.bytedance.adsdk.ugeno.lr.ik ikVar) {
            if (jSONObject == null) {
                return null;
            }
            C0187ri c0187ri = new C0187ri();
            c0187ri.ri(jSONObject.optLong(IronSourceConstants.EVENTS_DURATION));
            String strOptString = jSONObject.optString("loop");
            if (TextUtils.equals("infinite", strOptString)) {
                c0187ri.ri(-1.0f);
            } else {
                try {
                    c0187ri.ri(Float.parseFloat(strOptString));
                } catch (NumberFormatException unused) {
                    c0187ri.ri(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
            }
            c0187ri.ri(jSONObject.optString("loopMode"));
            c0187ri.lr(jSONObject.optString("type"));
            if (TextUtils.equals(c0187ri.fi(), "ripple")) {
                c0187ri.ik(jSONObject.optString("rippleColor"));
            }
            View viewSf = ikVar.sf();
            Context context = viewSf != null ? viewSf.getContext() : null;
            if (TextUtils.equals(c0187ri.fi(), TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
                String strRi = com.bytedance.adsdk.ugeno.ik.lr.ri(jSONObject.optString("valueTo"), ikVar.co());
                int iRi = com.bytedance.adsdk.ugeno.xha.ri.ri(jSONObject.optString("valueFrom"));
                int iRi2 = com.bytedance.adsdk.ugeno.xha.ri.ri(strRi);
                c0187ri.lr(iRi);
                c0187ri.ik(iRi2);
            } else if ((TextUtils.equals(c0187ri.fi(), "translateX") || TextUtils.equals(c0187ri.fi(), "translateY")) && context != null) {
                try {
                    float fRi = com.bytedance.adsdk.ugeno.xha.mj.ri(context, (float) jSONObject.optDouble("valueFrom"));
                    float fRi2 = com.bytedance.adsdk.ugeno.xha.mj.ri(context, (float) jSONObject.optDouble("valueTo"));
                    c0187ri.lr(fRi);
                    c0187ri.ik(fRi2);
                } catch (Exception unused2) {
                }
            } else {
                c0187ri.lr((float) jSONObject.optDouble("valueFrom"));
                c0187ri.ik((float) jSONObject.optDouble("valueTo"));
            }
            c0187ri.ka(jSONObject.optString("interpolator"));
            c0187ri.lr(com.bytedance.adsdk.ugeno.xha.ik.ri(com.bytedance.adsdk.ugeno.ik.lr.ri(jSONObject.optString("startDelay"), ikVar.co()), 0L));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("values");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                float[] fArr = new float[jSONArrayOptJSONArray.length()];
                int i = 0;
                if ((TextUtils.equals(c0187ri.fi(), "translateX") || TextUtils.equals(c0187ri.fi(), "translateY")) && context != null) {
                    while (i < jSONArrayOptJSONArray.length()) {
                        fArr[i] = com.bytedance.adsdk.ugeno.xha.mj.ri(context, (float) ri.ri(jSONArrayOptJSONArray.optString(i), ikVar.co()));
                        i++;
                    }
                } else {
                    while (i < jSONArrayOptJSONArray.length()) {
                        fArr[i] = (float) ri.ri(jSONArrayOptJSONArray.optString(i), ikVar.co());
                        i++;
                    }
                }
                c0187ri.ri(fArr);
            }
            return c0187ri;
        }
    }

    public String di() {
        return this.di;
    }

    public long fi() {
        return this.fi;
    }

    public List<C0187ri> ik() {
        return this.ik;
    }

    public long ka() {
        return this.ka;
    }

    public float lr() {
        return this.lr;
    }

    public String ri() {
        return this.ri;
    }

    public void lr(long j) {
        this.fi = j;
    }

    public void ri(String str) {
        this.ri = str;
    }

    public void lr(String str) {
        this.di = str;
    }

    public void ri(float f) {
        this.lr = f;
    }

    public void ri(List<C0187ri> list) {
        this.ik = list;
    }

    public void ri(long j) {
        this.ka = j;
    }

    public static ri ri(String str, com.bytedance.adsdk.ugeno.lr.ik ikVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return ri(new JSONObject(str), ikVar);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static ri ri(JSONObject jSONObject, com.bytedance.adsdk.ugeno.lr.ik ikVar) {
        return ri(jSONObject, null, ikVar);
    }

    public static ri ri(JSONObject jSONObject, JSONObject jSONObject2, com.bytedance.adsdk.ugeno.lr.ik ikVar) {
        if (jSONObject == null) {
            return null;
        }
        ri riVar = new ri();
        riVar.ri(jSONObject.optString("ordering"));
        String strOptString = jSONObject.optString("loop");
        if (TextUtils.equals("infinite", strOptString)) {
            riVar.ri(-1.0f);
        } else {
            try {
                riVar.ri(Float.parseFloat(strOptString));
            } catch (NumberFormatException unused) {
                riVar.ri(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }
        riVar.ri(jSONObject.optLong(IronSourceConstants.EVENTS_DURATION, 0L));
        riVar.lr(com.bytedance.adsdk.ugeno.xha.ik.ri(com.bytedance.adsdk.ugeno.ik.lr.ri(jSONObject.optString("startDelay"), ikVar.co()), 0L));
        riVar.lr(jSONObject.optString("loopMode"));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("animators");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObject2 != null) {
                    com.bytedance.adsdk.ugeno.xha.lr.ri(jSONObject2, jSONObjectOptJSONObject);
                }
                arrayList.add(C0187ri.ri(jSONObjectOptJSONObject, ikVar));
            }
            riVar.ri(arrayList);
        }
        return riVar;
    }

    public static double ri(Object obj, JSONObject jSONObject) {
        if (obj instanceof String) {
            return com.bytedance.adsdk.ugeno.xha.ik.ri(com.bytedance.adsdk.ugeno.ik.lr.ri((String) obj, jSONObject), 0.0d);
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
