package com.bytedance.sdk.openadsdk.core.fs;

import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ud extends lnr {
    private long rq;
    private long to;

    public ud(int i2, int i3, long j, long j2, com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.EnumC0113qdl enumC0113qdl, com.bytedance.sdk.openadsdk.core.fs.lnr.qdl.ud udVar, String str, List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> list, List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> list2, String str2) {
        super(i2, i3, enumC0113qdl, udVar, str, list, list2, str2);
        this.to = j;
        this.rq = j2;
        this.tvp = "icon_click";
    }

    @Override // com.bytedance.sdk.openadsdk.core.fs.lnr
    public JSONObject qdl() throws JSONException {
        JSONObject jSONObjectQdl = super.qdl();
        if (jSONObjectQdl != null) {
            jSONObjectQdl.put("offset", this.to);
            jSONObjectQdl.put("duration", this.rq);
        }
        return jSONObjectQdl;
    }

    public static ud qdl(JSONObject jSONObject) {
        lnr lnrVarUd = lnr.ud(jSONObject);
        if (lnrVarUd == null) {
            return null;
        }
        return new ud(lnrVarUd.qdl, lnrVarUd.ud, jSONObject.optLong("offset", -1L), jSONObject.optLong("duration", -1L), lnrVarUd.lnr, lnrVarUd.mml, lnrVarUd.mzz, lnrVarUd.mo, lnrVarUd.wd, lnrVarUd.jpc);
    }
}
