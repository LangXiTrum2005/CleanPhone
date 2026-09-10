package com.bytedance.sdk.openadsdk.core.jbs;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.qd;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class jbs extends com.bytedance.sdk.openadsdk.core.ik.lr {
    public jbs(Context context, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, String str, int i) {
        super(context, wjvVar, str, i);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003b  */
    @Override // com.bytedance.sdk.openadsdk.core.ik.lr
    public com.bytedance.sdk.openadsdk.core.model.co ri(float f, float f2, float f3, float f4, SparseArray<com.bytedance.sdk.openadsdk.core.ik.ik.ri> sparseArray, long j, long j2, View view, String str, float f5, int i, float f6, int i2, JSONObject jSONObject, JSONObject jSONObject2) {
        float fLr;
        float fLr2;
        long j3;
        long j4;
        int[] iArrRi = qd.ri(view);
        if (iArrRi == null || iArrRi.length != 2) {
            fLr = f3;
            fLr2 = f4;
        } else {
            int i3 = iArrRi[0];
            int i4 = iArrRi[1];
            if (this.tan == 0) {
                f = (qd.lr(((com.bytedance.sdk.openadsdk.core.ik.lr) this).ka, f) + i3) - 0.5f;
                f2 = (qd.lr(((com.bytedance.sdk.openadsdk.core.ik.lr) this).ka, f2) + i4) - 0.5f;
                fLr = (qd.lr(((com.bytedance.sdk.openadsdk.core.ik.lr) this).ka, f3) + i3) - 0.5f;
                fLr2 = (qd.lr(((com.bytedance.sdk.openadsdk.core.ik.lr) this).ka, f4) + i4) - 0.5f;
            } else {
                fLr = f3;
                fLr2 = f4;
            }
        }
        com.bytedance.sdk.openadsdk.core.model.slm slmVar = ((com.bytedance.sdk.openadsdk.core.ik.lr) this).fi;
        if (slmVar != null) {
            j3 = slmVar.fi;
            j4 = slmVar.di;
        } else {
            j3 = j;
            j4 = j2;
        }
        this.tan = 0;
        return new com.bytedance.sdk.openadsdk.core.model.co.ri().di(f).fi(f2).ka(fLr).ik(fLr2).lr(j3).ri(j4).ri(iArrRi).lr(qd.ik(view)).ka(this.su).fi(this.igq).di(this.zf).lr(com.bytedance.sdk.openadsdk.core.qt.lr().ri() ? 1 : 2).ri(sparseArray).ri(str).ri(i2).ri(jSONObject).lr(jSONObject2).ri();
    }

    public void ri(com.bytedance.sdk.openadsdk.core.model.slm slmVar) {
        ((com.bytedance.sdk.openadsdk.core.ik.lr) this).fi = slmVar;
    }
}
