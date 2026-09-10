package com.bytedance.sdk.openadsdk.ka;

import com.unity3d.services.UnityAdsConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class xha {
    private long fi;
    private long ik;
    private long ka;
    private long lr;
    private long ri;

    public void fi(long j) {
        if (this.fi <= 0) {
            this.fi = j;
        }
    }

    public void ik(long j) {
        if (this.ik <= 0) {
            this.ik = j;
        }
    }

    public void ka(long j) {
        if (this.ka <= 0) {
            this.ka = j;
        }
    }

    public void lr(long j) {
        if (this.lr <= 0) {
            this.lr = j;
        }
    }

    public void ri(long j) {
        if (this.ri <= 0) {
            this.ri = j;
        }
    }

    public JSONObject lr() {
        return ri((JSONObject) null);
    }

    public boolean ri() {
        return this.ri > 0;
    }

    public void ri(long j, float f) {
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            ri(j);
        }
        double d = f;
        if (d >= 0.25d) {
            ri(j);
            lr(j);
        }
        if (d >= 0.5d) {
            ri(j);
            lr(j);
            ik(j);
        }
        if (d >= 0.75d) {
            ri(j);
            lr(j);
            ik(j);
            ka(j);
        }
        if (f >= 1.0f) {
            ri(j);
            lr(j);
            ik(j);
            ka(j);
            fi(j);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026 A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:12:0x0031 A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x003c A[Catch: Exception -> 0x0041, TRY_LEAVE, TryCatch #0 {Exception -> 0x0041, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:6:0x0010 A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001b A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    public JSONObject ri(JSONObject jSONObject) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
                j = this.ri;
                if (j > 0) {
                    jSONObject.put("show_start", j);
                    j2 = this.lr;
                    if (j2 > 0) {
                        jSONObject.put("show_firstQuartile", j2);
                        j3 = this.ik;
                        if (j3 > 0) {
                            jSONObject.put("show_mid", j3);
                            j4 = this.ka;
                            if (j4 > 0) {
                                jSONObject.put("show_thirdQuartile", j4);
                                j5 = this.fi;
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
            j = this.ri;
            if (j > 0) {
                jSONObject.put("show_start", j);
                j2 = this.lr;
                if (j2 > 0) {
                    jSONObject.put("show_firstQuartile", j2);
                    j3 = this.ik;
                    if (j3 > 0) {
                        jSONObject.put("show_mid", j3);
                        j4 = this.ka;
                        if (j4 > 0) {
                            jSONObject.put("show_thirdQuartile", j4);
                            j5 = this.fi;
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
