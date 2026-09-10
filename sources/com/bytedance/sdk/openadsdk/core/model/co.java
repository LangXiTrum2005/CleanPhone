package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class co {
    private final SparseArray<com.bytedance.sdk.openadsdk.core.ik.ik.ri> aw;
    private final int bgr;
    private final JSONObject bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private final int f18134co;
    private final float di;
    private final float fi;
    private final float ik;
    private final int jbs;
    private final float ka;
    private final int[] lr;
    private final long mj;
    private final int qt;
    private final int[] ri;
    private final int sf;
    private final String slm;
    private final JSONObject vr;
    private final long xha;

    public static class ri {
        private JSONObject ac;
        private int aw;
        private int bgr;
        private String bu;

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        private int f18135co;
        private float di;
        private long fi;
        float ik;
        private float jbs;
        private long ka;
        int lr;
        private float mj;
        private int nr;
        private int[] qt;
        float ri;
        private int[] sf;
        private int slm;
        private JSONObject tan;
        private SparseArray<com.bytedance.sdk.openadsdk.core.ik.ik.ri> vr;
        private float xha;

        public ri di(float f) {
            this.jbs = f;
            return this;
        }

        public ri fi(float f) {
            this.mj = f;
            return this;
        }

        public ri ik(int i) {
            this.lr = i;
            return this;
        }

        public ri ka(float f) {
            this.xha = f;
            return this;
        }

        public ri lr(JSONObject jSONObject) {
            this.ac = jSONObject;
            return this;
        }

        public ri ri(int i) {
            this.nr = i;
            return this;
        }

        public ri di(int i) {
            this.bgr = i;
            return this;
        }

        public ri fi(int i) {
            this.aw = i;
            return this;
        }

        public ri ik(float f) {
            this.di = f;
            return this;
        }

        public ri ka(int i) {
            this.f18135co = i;
            return this;
        }

        public ri lr(int i) {
            this.slm = i;
            return this;
        }

        public ri ri(JSONObject jSONObject) {
            this.tan = jSONObject;
            return this;
        }

        public ri lr(float f) {
            this.ik = f;
            return this;
        }

        public ri ri(SparseArray<com.bytedance.sdk.openadsdk.core.ik.ik.ri> sparseArray) {
            this.vr = sparseArray;
            return this;
        }

        public ri lr(long j) {
            this.fi = j;
            return this;
        }

        public ri ri(float f) {
            this.ri = f;
            return this;
        }

        public ri lr(int[] iArr) {
            this.sf = iArr;
            return this;
        }

        public ri ri(long j) {
            this.ka = j;
            return this;
        }

        public ri ri(int[] iArr) {
            this.qt = iArr;
            return this;
        }

        public ri ri(String str) {
            this.bu = str;
            return this;
        }

        public co ri() {
            return new co(this);
        }
    }

    public JSONObject ri() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = this.bu;
            if (jSONObject2 != null) {
                try {
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject.putOpt(next, this.bu.opt(next));
                    }
                } catch (Exception unused) {
                }
            }
            int[] iArr = this.ri;
            if (iArr != null && iArr.length == 2) {
                jSONObject.putOpt("ad_x", Integer.valueOf(iArr[0])).putOpt("ad_y", Integer.valueOf(this.ri[1]));
            }
            int[] iArr2 = this.lr;
            if (iArr2 != null && iArr2.length == 2) {
                jSONObject.putOpt("width", Integer.valueOf(iArr2[0])).putOpt("height", Integer.valueOf(this.lr[1]));
            }
            jSONObject.putOpt("down_x", Float.toString(this.ik)).putOpt("down_y", Float.toString(this.ka)).putOpt("up_x", Float.toString(this.fi)).putOpt("up_y", Float.toString(this.di)).putOpt("down_time", Long.valueOf(this.xha)).putOpt("up_time", Long.valueOf(this.mj)).putOpt("toolType", Integer.valueOf(this.jbs)).putOpt("deviceId", Integer.valueOf(this.qt)).putOpt("source", Integer.valueOf(this.sf)).putOpt("ft", ri(this.aw, this.f18134co)).putOpt("click_area_type", this.slm);
            int i = this.bgr;
            if (i > 0) {
                jSONObject.putOpt("areaType", Integer.valueOf(i));
            }
            JSONObject jSONObject3 = this.vr;
            if (jSONObject3 != null) {
                jSONObject.putOpt("rectInfo", jSONObject3);
            }
        } catch (Exception unused2) {
        }
        return jSONObject;
    }

    private co(ri riVar) {
        this.ri = riVar.qt;
        this.lr = riVar.sf;
        this.ik = riVar.jbs;
        this.ka = riVar.mj;
        this.fi = riVar.xha;
        this.di = riVar.di;
        this.xha = riVar.fi;
        this.mj = riVar.ka;
        this.jbs = riVar.f18135co;
        this.qt = riVar.aw;
        this.sf = riVar.bgr;
        this.f18134co = riVar.slm;
        this.aw = riVar.vr;
        this.slm = riVar.bu;
        this.bgr = riVar.nr;
        this.vr = riVar.tan;
        this.bu = riVar.ac;
    }

    public static JSONObject ri(SparseArray<com.bytedance.sdk.openadsdk.core.ik.ik.ri> sparseArray, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (sparseArray != null) {
                for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                    com.bytedance.sdk.openadsdk.core.ik.ik.ri riVarValueAt = sparseArray.valueAt(i2);
                    if (riVarValueAt != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.putOpt("force", Double.valueOf(riVarValueAt.ik)).putOpt("mr", Double.valueOf(riVarValueAt.lr)).putOpt("phase", Integer.valueOf(riVarValueAt.ri)).putOpt("ts", Long.valueOf(riVarValueAt.ka));
                        jSONArray.put(jSONObject2);
                        jSONObject.putOpt("ftc", Integer.valueOf(i)).putOpt("info", jSONArray);
                    }
                }
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
