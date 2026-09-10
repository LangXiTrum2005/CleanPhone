package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class fs {
    private final JSONObject bjy;
    private final SparseArray<com.bytedance.sdk.openadsdk.core.lnr.lnr.qdl> exu;
    private final int fs;
    private final long jpc;
    private final String jtx;
    private final float lnr;
    private final float mml;
    private final float mo;
    private final float mzz;
    private final int[] qdl;
    private final int rdp;
    private final int rq;
    private final int to;
    private final int tvp;
    private final int[] ud;
    private final long wd;
    private final JSONObject yt;

    public static class qdl {
        private JSONObject aaj;
        private SparseArray<com.bytedance.sdk.openadsdk.core.lnr.lnr.qdl> bjy;
        private JSONObject exc;
        private int exu;
        private int fs;
        private int jl;
        private float jpc;
        private int jtx;
        float lnr;
        private long mml;
        private float mo;
        private long mzz;
        float qdl;
        private int rdp;
        private int[] rq;
        private int[] to;
        private float tvp;
        int ud;
        private float wd;
        private String yt;

        public qdl lnr(int i2) {
            this.ud = i2;
            return this;
        }

        public qdl mml(float f) {
            this.wd = f;
            return this;
        }

        public qdl mo(float f) {
            this.tvp = f;
            return this;
        }

        public qdl mzz(float f) {
            this.jpc = f;
            return this;
        }

        public qdl qdl(int i2) {
            this.jl = i2;
            return this;
        }

        public qdl ud(JSONObject jSONObject) {
            this.aaj = jSONObject;
            return this;
        }

        public qdl lnr(float f) {
            this.mo = f;
            return this;
        }

        public qdl mml(int i2) {
            this.fs = i2;
            return this;
        }

        public qdl mo(int i2) {
            this.rdp = i2;
            return this;
        }

        public qdl mzz(int i2) {
            this.exu = i2;
            return this;
        }

        public qdl qdl(JSONObject jSONObject) {
            this.exc = jSONObject;
            return this;
        }

        public qdl ud(int i2) {
            this.jtx = i2;
            return this;
        }

        public qdl qdl(SparseArray<com.bytedance.sdk.openadsdk.core.lnr.lnr.qdl> sparseArray) {
            this.bjy = sparseArray;
            return this;
        }

        public qdl ud(float f) {
            this.lnr = f;
            return this;
        }

        public qdl qdl(float f) {
            this.qdl = f;
            return this;
        }

        public qdl ud(long j) {
            this.mzz = j;
            return this;
        }

        public qdl qdl(long j) {
            this.mml = j;
            return this;
        }

        public qdl ud(int[] iArr) {
            this.rq = iArr;
            return this;
        }

        public qdl qdl(int[] iArr) {
            this.to = iArr;
            return this;
        }

        public qdl qdl(String str) {
            this.yt = str;
            return this;
        }

        public fs qdl() {
            return new fs(this);
        }
    }

    public JSONObject qdl() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = this.yt;
            if (jSONObject2 != null) {
                try {
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject.putOpt(next, this.yt.opt(next));
                    }
                } catch (Exception unused) {
                }
            }
            int[] iArr = this.qdl;
            if (iArr != null && iArr.length == 2) {
                jSONObject.putOpt("ad_x", Integer.valueOf(iArr[0])).putOpt("ad_y", Integer.valueOf(this.qdl[1]));
            }
            int[] iArr2 = this.ud;
            if (iArr2 != null && iArr2.length == 2) {
                jSONObject.putOpt("width", Integer.valueOf(iArr2[0])).putOpt("height", Integer.valueOf(this.ud[1]));
            }
            jSONObject.putOpt("down_x", Float.toString(this.lnr)).putOpt("down_y", Float.toString(this.mml)).putOpt("up_x", Float.toString(this.mzz)).putOpt("up_y", Float.toString(this.mo)).putOpt("down_time", Long.valueOf(this.wd)).putOpt("up_time", Long.valueOf(this.jpc)).putOpt("toolType", Integer.valueOf(this.tvp)).putOpt("deviceId", Integer.valueOf(this.to)).putOpt("source", Integer.valueOf(this.rq)).putOpt("ft", qdl(this.exu, this.fs)).putOpt("click_area_type", this.jtx);
            int i2 = this.rdp;
            if (i2 > 0) {
                jSONObject.putOpt("areaType", Integer.valueOf(i2));
            }
            JSONObject jSONObject3 = this.bjy;
            if (jSONObject3 != null) {
                jSONObject.putOpt("rectInfo", jSONObject3);
            }
        } catch (Exception unused2) {
        }
        return jSONObject;
    }

    private fs(qdl qdlVar) {
        this.qdl = qdlVar.to;
        this.ud = qdlVar.rq;
        this.lnr = qdlVar.tvp;
        this.mml = qdlVar.jpc;
        this.mzz = qdlVar.wd;
        this.mo = qdlVar.mo;
        this.wd = qdlVar.mzz;
        this.jpc = qdlVar.mml;
        this.tvp = qdlVar.fs;
        this.to = qdlVar.exu;
        this.rq = qdlVar.rdp;
        this.fs = qdlVar.jtx;
        this.exu = qdlVar.bjy;
        this.jtx = qdlVar.yt;
        this.rdp = qdlVar.jl;
        this.bjy = qdlVar.exc;
        this.yt = qdlVar.aaj;
    }

    public static JSONObject qdl(SparseArray<com.bytedance.sdk.openadsdk.core.lnr.lnr.qdl> sparseArray, int i2) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (sparseArray != null) {
                for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                    com.bytedance.sdk.openadsdk.core.lnr.lnr.qdl qdlVarValueAt = sparseArray.valueAt(i3);
                    if (qdlVarValueAt != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.putOpt("force", Double.valueOf(qdlVarValueAt.lnr)).putOpt("mr", Double.valueOf(qdlVarValueAt.ud)).putOpt("phase", Integer.valueOf(qdlVarValueAt.qdl)).putOpt("ts", Long.valueOf(qdlVarValueAt.mml));
                        jSONArray.put(jSONObject2);
                        jSONObject.putOpt("ftc", Integer.valueOf(i2)).putOpt("info", jSONArray);
                    }
                }
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
