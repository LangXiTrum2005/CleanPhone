package com.bytedance.sdk.openadsdk.ZU;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ebl {
    private long JXs;
    private long LD;
    private long Lxb;
    private long ZU;
    private long lk;

    public void JXs(long j) {
        if (this.JXs <= 0) {
            this.JXs = j;
        }
    }

    public void LD(long j) {
        if (this.LD <= 0) {
            this.LD = j;
        }
    }

    public void Lxb(long j) {
        if (this.Lxb <= 0) {
            this.Lxb = j;
        }
    }

    public void ZU(long j) {
        if (this.ZU <= 0) {
            this.ZU = j;
        }
    }

    public void lk(long j) {
        if (this.lk <= 0) {
            this.lk = j;
        }
    }

    public JSONObject LD() {
        return Lxb((JSONObject) null);
    }

    public boolean Lxb() {
        return this.Lxb > 0;
    }

    public void Lxb(long j, float f) {
        if (f > 0.0f) {
            Lxb(j);
        }
        double d = f;
        if (d >= 0.25d) {
            Lxb(j);
            LD(j);
        }
        if (d >= 0.5d) {
            Lxb(j);
            LD(j);
            lk(j);
        }
        if (d >= 0.75d) {
            Lxb(j);
            LD(j);
            lk(j);
            ZU(j);
        }
        if (f >= 1.0f) {
            Lxb(j);
            LD(j);
            lk(j);
            ZU(j);
            JXs(j);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026 A[Catch: Exception -> 0x0042, TryCatch #0 {Exception -> 0x0042, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:12:0x0031 A[Catch: Exception -> 0x0042, TryCatch #0 {Exception -> 0x0042, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x003c A[Catch: Exception -> 0x0042, TRY_LEAVE, TryCatch #0 {Exception -> 0x0042, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:6:0x0010 A[Catch: Exception -> 0x0042, TryCatch #0 {Exception -> 0x0042, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001b A[Catch: Exception -> 0x0042, TryCatch #0 {Exception -> 0x0042, blocks: (B:3:0x0002, B:4:0x0008, B:6:0x0010, B:8:0x001b, B:10:0x0026, B:12:0x0031, B:14:0x003c), top: B:17:0x0002 }] */
    public JSONObject Lxb(JSONObject jSONObject) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
                j = this.Lxb;
                if (j > 0) {
                    jSONObject.put("show_start", j);
                    j2 = this.LD;
                    if (j2 > 0) {
                        jSONObject.put("show_firstQuartile", j2);
                        j3 = this.lk;
                        if (j3 > 0) {
                            jSONObject.put("show_mid", j3);
                            j4 = this.ZU;
                            if (j4 > 0) {
                                jSONObject.put("show_thirdQuartile", j4);
                                j5 = this.JXs;
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
            j = this.Lxb;
            if (j > 0) {
                jSONObject.put("show_start", j);
                j2 = this.LD;
                if (j2 > 0) {
                    jSONObject.put("show_firstQuartile", j2);
                    j3 = this.lk;
                    if (j3 > 0) {
                        jSONObject.put("show_mid", j3);
                        j4 = this.ZU;
                        if (j4 > 0) {
                            jSONObject.put("show_thirdQuartile", j4);
                            j5 = this.JXs;
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
