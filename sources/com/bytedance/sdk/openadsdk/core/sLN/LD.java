package com.bytedance.sdk.openadsdk.core.sLN;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class LD extends lk {
    private long JVA;
    private long nBu;

    public LD(int i, int i2, long j, long j2, com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.EnumC0111Lxb enumC0111Lxb, com.bytedance.sdk.openadsdk.core.sLN.lk.Lxb.LD ld, String str, List<com.bytedance.sdk.openadsdk.core.sLN.LD.lk> list, List<com.bytedance.sdk.openadsdk.core.sLN.LD.lk> list2, String str2) {
        super(i, i2, enumC0111Lxb, ld, str, list, list2, str2);
        this.nBu = j;
        this.JVA = j2;
        this.QAg = "icon_click";
    }

    @Override // com.bytedance.sdk.openadsdk.core.sLN.lk
    public JSONObject Lxb() throws JSONException {
        JSONObject jSONObjectLxb = super.Lxb();
        if (jSONObjectLxb != null) {
            jSONObjectLxb.put(TypedValues.CycleType.S_WAVE_OFFSET, this.nBu);
            jSONObjectLxb.put("duration", this.JVA);
        }
        return jSONObjectLxb;
    }

    public static LD Lxb(JSONObject jSONObject) {
        lk lkVarLD = lk.LD(jSONObject);
        if (lkVarLD == null) {
            return null;
        }
        return new LD(lkVarLD.Lxb, lkVarLD.LD, jSONObject.optLong(TypedValues.CycleType.S_WAVE_OFFSET, -1L), jSONObject.optLong("duration", -1L), lkVarLD.lk, lkVarLD.ZU, lkVarLD.JXs, lkVarLD.lc, lkVarLD.ebl, lkVarLD.OY);
    }
}
