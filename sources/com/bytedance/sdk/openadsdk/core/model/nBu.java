package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class nBu {
    private final SparseArray<com.bytedance.sdk.openadsdk.core.LD.lk.Lxb> IeN;
    private final int JVA;
    private final float JXs;
    private final int[] LD;
    private final int[] Lxb;
    private final int NXR;
    private final float OY;
    private final long QAg;
    private final int STP;
    private final int VVE;
    private final int[] ZU;
    private final String brP;
    private final float ebl;
    private final JSONObject kqm;
    private final float lc;
    private final int[] lk;
    private final long nBu;
    private final int sLN;
    private final JSONObject tD;

    public static class Lxb {
        private int DY;
        private JSONObject HD;
        private int IeN;
        private int[] JVA;
        private long JXs;
        int LD;
        float Lxb;
        private int[] NXR;
        private float OY;
        private float QAg;
        private int STP;
        private JSONObject Sfi;
        private int VVE;
        private long ZU;
        private int brP;
        private float ebl;
        private SparseArray<com.bytedance.sdk.openadsdk.core.LD.lk.Lxb> kqm;
        private float lc;
        float lk;
        private int[] nBu;
        private int[] sLN;
        private String tD;

        public Lxb JXs(float f) {
            this.OY = f;
            return this;
        }

        public Lxb LD(JSONObject jSONObject) {
            this.HD = jSONObject;
            return this;
        }

        public Lxb Lxb(int i) {
            this.DY = i;
            return this;
        }

        public Lxb ZU(float f) {
            this.ebl = f;
            return this;
        }

        public Lxb lc(float f) {
            this.QAg = f;
            return this;
        }

        public Lxb lk(int i) {
            this.LD = i;
            return this;
        }

        public Lxb JXs(int i) {
            this.IeN = i;
            return this;
        }

        public Lxb LD(int i) {
            this.brP = i;
            return this;
        }

        public Lxb Lxb(JSONObject jSONObject) {
            this.Sfi = jSONObject;
            return this;
        }

        public Lxb ZU(int[] iArr) {
            this.NXR = iArr;
            return this;
        }

        public Lxb lc(int i) {
            this.VVE = i;
            return this;
        }

        public Lxb lk(float f) {
            this.lc = f;
            return this;
        }

        public Lxb LD(float f) {
            this.lk = f;
            return this;
        }

        public Lxb Lxb(SparseArray<com.bytedance.sdk.openadsdk.core.LD.lk.Lxb> sparseArray) {
            this.kqm = sparseArray;
            return this;
        }

        public Lxb ZU(int i) {
            this.STP = i;
            return this;
        }

        public Lxb lk(int[] iArr) {
            this.sLN = iArr;
            return this;
        }

        public Lxb LD(long j) {
            this.JXs = j;
            return this;
        }

        public Lxb Lxb(float f) {
            this.Lxb = f;
            return this;
        }

        public Lxb LD(int[] iArr) {
            this.JVA = iArr;
            return this;
        }

        public Lxb Lxb(long j) {
            this.ZU = j;
            return this;
        }

        public Lxb Lxb(int[] iArr) {
            this.nBu = iArr;
            return this;
        }

        public Lxb Lxb(String str) {
            this.tD = str;
            return this;
        }

        public nBu Lxb() {
            return new nBu(this);
        }
    }

    public JSONObject Lxb() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = this.tD;
            if (jSONObject2 != null) {
                try {
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject.putOpt(next, this.tD.opt(next));
                    }
                } catch (Exception unused) {
                }
            }
            int[] iArr = this.Lxb;
            if (iArr != null && iArr.length == 2) {
                jSONObject.putOpt("ad_x", Integer.valueOf(iArr[0])).putOpt("ad_y", Integer.valueOf(this.Lxb[1]));
            }
            int[] iArr2 = this.LD;
            if (iArr2 != null && iArr2.length == 2) {
                jSONObject.putOpt("width", Integer.valueOf(iArr2[0])).putOpt("height", Integer.valueOf(this.LD[1]));
            }
            int[] iArr3 = this.lk;
            if (iArr3 != null && iArr3.length == 2) {
                jSONObject.putOpt("button_x", Integer.valueOf(iArr3[0])).putOpt("button_y", Integer.valueOf(this.lk[1]));
            }
            int[] iArr4 = this.ZU;
            if (iArr4 != null && iArr4.length == 2) {
                jSONObject.putOpt("button_width", Integer.valueOf(iArr4[0])).putOpt("button_height", Integer.valueOf(this.ZU[1]));
            }
            jSONObject.putOpt("down_x", Float.toString(this.JXs)).putOpt("down_y", Float.toString(this.lc)).putOpt("up_x", Float.toString(this.ebl)).putOpt("up_y", Float.toString(this.OY)).putOpt("down_time", Long.valueOf(this.QAg)).putOpt("up_time", Long.valueOf(this.nBu)).putOpt("toolType", Integer.valueOf(this.JVA)).putOpt("deviceId", Integer.valueOf(this.sLN)).putOpt("source", Integer.valueOf(this.NXR)).putOpt("ft", Lxb(this.IeN, this.STP)).putOpt("click_area_type", this.brP);
            int i = this.VVE;
            if (i > 0) {
                jSONObject.putOpt("areaType", Integer.valueOf(i));
            }
            JSONObject jSONObject3 = this.kqm;
            if (jSONObject3 != null) {
                jSONObject.putOpt("rectInfo", jSONObject3);
            }
        } catch (Exception unused2) {
        }
        return jSONObject;
    }

    private nBu(@NonNull Lxb lxb) {
        this.Lxb = lxb.JVA;
        this.LD = lxb.sLN;
        this.ZU = lxb.NXR;
        this.lk = lxb.nBu;
        this.JXs = lxb.QAg;
        this.lc = lxb.OY;
        this.ebl = lxb.ebl;
        this.OY = lxb.lc;
        this.QAg = lxb.JXs;
        this.nBu = lxb.ZU;
        this.JVA = lxb.STP;
        this.sLN = lxb.IeN;
        this.NXR = lxb.VVE;
        this.STP = lxb.brP;
        this.IeN = lxb.kqm;
        this.brP = lxb.tD;
        this.VVE = lxb.DY;
        this.kqm = lxb.Sfi;
        this.tD = lxb.HD;
    }

    public static JSONObject Lxb(SparseArray<com.bytedance.sdk.openadsdk.core.LD.lk.Lxb> sparseArray, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (sparseArray != null) {
                for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                    com.bytedance.sdk.openadsdk.core.LD.lk.Lxb lxbValueAt = sparseArray.valueAt(i2);
                    if (lxbValueAt != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.putOpt("force", Double.valueOf(lxbValueAt.lk)).putOpt("mr", Double.valueOf(lxbValueAt.LD)).putOpt(TypedValues.CycleType.S_WAVE_PHASE, Integer.valueOf(lxbValueAt.Lxb)).putOpt("ts", Long.valueOf(lxbValueAt.ZU));
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
