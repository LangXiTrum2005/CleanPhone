package com.bytedance.sdk.openadsdk.core.aw;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lr extends ik {
    private long qt;
    private long sf;

    public lr(int i, int i2, long j, long j2, com.bytedance.sdk.openadsdk.core.aw.ik.ri.EnumC0228ri enumC0228ri, com.bytedance.sdk.openadsdk.core.aw.ik.ri.lr lrVar, String str, List<com.bytedance.sdk.openadsdk.core.aw.lr.ik> list, List<com.bytedance.sdk.openadsdk.core.aw.lr.ik> list2, String str2) {
        super(i, i2, enumC0228ri, lrVar, str, list, list2, str2);
        this.qt = j;
        this.sf = j2;
        this.jbs = "icon_click";
    }

    public static lr ri(JSONObject jSONObject) {
        ik ikVarLr = ik.lr(jSONObject);
        if (ikVarLr == null) {
            return null;
        }
        return new lr(ikVarLr.ri, ikVarLr.lr, jSONObject.optLong("offset", -1L), jSONObject.optLong(IronSourceConstants.EVENTS_DURATION, -1L), ikVarLr.ik, ikVarLr.ka, ikVarLr.fi, ikVarLr.di, ikVarLr.xha, ikVarLr.mj);
    }
}
