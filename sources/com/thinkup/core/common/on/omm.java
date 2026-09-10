package com.thinkup.core.common.on;

import com.thinkup.core.mg.api.MgComparedResult;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class omm {
    private int m;
    private long m0;
    private String mm;
    private int mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f42243n;
    private int o;
    private double o0;
    private String om;
    private int on;
    private double oo;

    private omm() {
    }

    public static omm o(oo0m oo0mVar) {
        omm ommVar = new omm();
        ommVar.o = 1;
        ommVar.m = oo0mVar.om0();
        ommVar.f42243n = oo0mVar.omn();
        ommVar.o0 = oo0mVar.o00();
        ommVar.mm = oo0mVar.on();
        o(ommVar, oo0mVar.ono());
        return ommVar;
    }

    public static omm o(mnn mnnVar) {
        omm ommVar = new omm();
        ommVar.o = 2;
        ommVar.m = mnnVar.oon();
        ommVar.f42243n = mnnVar.o0m();
        ommVar.o0 = mnnVar.om0();
        ommVar.om = mnnVar.omo();
        ommVar.on = mnnVar.onn();
        ommVar.oo = mnnVar.m0n();
        o(ommVar, mnnVar.m00());
        return ommVar;
    }

    public final JSONObject o() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", this.o);
            jSONObject.put("post_t", this.m);
            jSONObject.put("price", String.valueOf(this.o0));
            long j = this.m0;
            if (j > 0) {
                jSONObject.put("real_wait_price_t", j);
            }
            int i2 = this.mo;
            if (i2 > 0) {
                jSONObject.put("bp_from", i2);
            }
            if (this.o == 2) {
                jSONObject.put("reason", this.om);
                jSONObject.put("winner_firm_id", this.on);
                double d = this.oo;
                if (d > 0.0d) {
                    jSONObject.put("custom_f_price", String.valueOf(d));
                }
            }
            if (this.o == 1) {
                jSONObject.put("h_code", this.mm);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private static void o(omm ommVar, MgComparedResult mgComparedResult) {
        ommVar.m0 = mgComparedResult != null ? mgComparedResult.getCpCostTime() : 0L;
        int i2 = 0;
        if (mgComparedResult != null && mgComparedResult.isCompared()) {
            i2 = mgComparedResult.isMgWin() ? 2 : 1;
        }
        ommVar.mo = i2;
    }
}
