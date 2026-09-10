package com.bytedance.sdk.openadsdk.core.tvp;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.ax;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class tvp extends com.bytedance.sdk.openadsdk.core.lnr.ud {
    public tvp(Context context, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, String str, int i2) {
        super(context, ljhVar, str, i2);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003b  */
    @Override // com.bytedance.sdk.openadsdk.core.lnr.ud
    public com.bytedance.sdk.openadsdk.core.model.fs qdl(float f, float f2, float f3, float f4, SparseArray<com.bytedance.sdk.openadsdk.core.lnr.lnr.qdl> sparseArray, long j, long j2, View view, String str, float f5, int i2, float f6, int i3, JSONObject jSONObject, JSONObject jSONObject2) {
        float fUd;
        float fUd2;
        long j3;
        long j4;
        int[] iArrQdl = ax.qdl(view);
        if (iArrQdl == null || iArrQdl.length != 2) {
            fUd = f3;
            fUd2 = f4;
        } else {
            int i4 = iArrQdl[0];
            int i5 = iArrQdl[1];
            if (this.exc == 0) {
                f = (ax.ud(this.mml, f) + i4) - 0.5f;
                f2 = (ax.ud(this.mml, f2) + i5) - 0.5f;
                fUd = (ax.ud(this.mml, f3) + i4) - 0.5f;
                fUd2 = (ax.ud(this.mml, f4) + i5) - 0.5f;
            } else {
                fUd = f3;
                fUd2 = f4;
            }
        }
        com.bytedance.sdk.openadsdk.core.model.jtx jtxVar = this.mzz;
        if (jtxVar != null) {
            j3 = jtxVar.mzz;
            j4 = jtxVar.mo;
        } else {
            j3 = j;
            j4 = j2;
        }
        this.exc = 0;
        return new com.bytedance.sdk.openadsdk.core.model.fs.qdl().mo(f).mzz(f2).mml(fUd).lnr(fUd2).ud(j3).qdl(j4).qdl(iArrQdl).ud(ax.lnr(view)).mml(this.xmv).mzz(this.bqt).mo(this.koa).ud(com.bytedance.sdk.openadsdk.core.tvp.ud().qdl() ? 1 : 2).qdl(sparseArray).qdl(str).qdl(i3).qdl(jSONObject).ud(jSONObject2).qdl();
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.model.jtx jtxVar) {
        this.mzz = jtxVar;
    }
}
