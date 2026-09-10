package com.bytedance.sdk.openadsdk.mml;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class wd {
    private long lnr;
    private long mml;
    private long mzz;
    private long qdl;
    private long ud;

    public void lnr(long j) {
        if (this.lnr <= 0) {
            this.lnr = j;
        }
    }

    public void mml(long j) {
        if (this.mml <= 0) {
            this.mml = j;
        }
    }

    public void mzz(long j) {
        if (this.mzz <= 0) {
            this.mzz = j;
        }
    }

    public void qdl(long j) {
        if (this.qdl <= 0) {
            this.qdl = j;
        }
    }

    public void ud(long j) {
        if (this.ud <= 0) {
            this.ud = j;
        }
    }

    public boolean qdl() {
        return this.qdl > 0;
    }

    public JSONObject ud() {
        return qdl((JSONObject) null);
    }

    public void qdl(long j, float f) {
        if (f > 0.0f) {
            qdl(j);
        }
        double d = f;
        if (d >= 0.25d) {
            qdl(j);
            ud(j);
        }
        if (d >= 0.5d) {
            qdl(j);
            ud(j);
            lnr(j);
        }
        if (d >= 0.75d) {
            qdl(j);
            ud(j);
            lnr(j);
            mml(j);
        }
        if (f >= 1.0f) {
            qdl(j);
            ud(j);
            lnr(j);
            mml(j);
            mzz(j);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026 A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:12:0x0031 A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x003c A[Catch: Exception -> 0x0041, TRY_LEAVE, TryCatch #0 {Exception -> 0x0041, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:6:0x0010 A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001b A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    public JSONObject qdl(JSONObject jSONObject) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
                j = this.qdl;
                if (j > 0) {
                    jSONObject.put("show_start", j);
                    j2 = this.ud;
                    if (j2 > 0) {
                        jSONObject.put("show_firstQuartile", j2);
                        j3 = this.lnr;
                        if (j3 > 0) {
                            jSONObject.put("show_mid", j3);
                            j4 = this.mml;
                            if (j4 > 0) {
                                jSONObject.put("show_thirdQuartile", j4);
                                j5 = this.mzz;
                                if (j5 > 0) {
                                    jSONObject.put("show_full", j5);
                                }
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } else {
            j = this.qdl;
            if (j > 0) {
                jSONObject.put("show_start", j);
                j2 = this.ud;
                if (j2 > 0) {
                    jSONObject.put("show_firstQuartile", j2);
                    j3 = this.lnr;
                    if (j3 > 0) {
                        jSONObject.put("show_mid", j3);
                        j4 = this.mml;
                        if (j4 > 0) {
                            jSONObject.put("show_thirdQuartile", j4);
                            j5 = this.mzz;
                            if (j5 > 0) {
                                jSONObject.put("show_full", j5);
                            }
                        }
                    }
                }
            }
        }
        return jSONObject;
    }
}
