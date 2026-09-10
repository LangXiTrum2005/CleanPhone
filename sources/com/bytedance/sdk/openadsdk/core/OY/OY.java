package com.bytedance.sdk.openadsdk.core.OY;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.utils.le;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class OY extends com.bytedance.sdk.openadsdk.core.LD.Lxb {
    public OY(@NonNull Context context, @NonNull com.bytedance.sdk.openadsdk.core.model.tD tDVar, @NonNull String str, int i) {
        super(context, tDVar, str, i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.LD.LD
    public com.bytedance.sdk.openadsdk.core.model.nBu Lxb(float f, float f2, float f3, float f4, SparseArray<com.bytedance.sdk.openadsdk.core.LD.lk.Lxb> sparseArray, long j, long j2, View view, View view2, String str, float f5, int i, float f6, int i2, JSONObject jSONObject, JSONObject jSONObject2) {
        float f7;
        float f8;
        float f9;
        float fLk;
        int i3;
        int i4;
        long j3;
        long j4;
        char c;
        char c2;
        int iLk;
        int iLk2;
        int[] iArrLxb = le.Lxb(view);
        int i5 = 0;
        if (iArrLxb == null || iArrLxb.length != 2) {
            f7 = f;
            f8 = f2;
            f9 = f3;
            fLk = f4;
            i3 = 0;
            i4 = 0;
        } else {
            i3 = iArrLxb[0];
            i4 = iArrLxb[1];
            if (this.DY == 0) {
                float fLk2 = (le.lk(this.ZU, f) + i3) - 0.5f;
                float fLk3 = (le.lk(this.ZU, f2) + i4) - 0.5f;
                float fLk4 = (le.lk(this.ZU, f3) + i3) - 0.5f;
                fLk = (le.lk(this.ZU, f4) + i4) - 0.5f;
                f9 = fLk4;
                f7 = fLk2;
                f8 = fLk3;
            } else {
                f7 = f;
                f8 = f2;
                f9 = f3;
                fLk = f4;
            }
        }
        int[] iArrLxb2 = new int[2];
        int[] iArrLk = new int[2];
        com.bytedance.sdk.openadsdk.core.model.STP stp = this.JXs;
        if (stp != null) {
            j3 = stp.JXs;
            j4 = stp.lc;
            if (this.DY == 0) {
                iArrLxb2[0] = le.lk(this.ZU, stp.ebl) + i3;
                iArrLxb2[1] = le.lk(this.ZU, this.JXs.OY) + i4;
                iLk = le.lk(this.ZU, this.JXs.QAg);
                iLk2 = le.lk(this.ZU, this.JXs.nBu);
                c = 0;
                c2 = 1;
            } else {
                c = 0;
                iArrLxb2[0] = stp.ebl;
                c2 = 1;
                iArrLxb2[1] = stp.OY;
                iLk = stp.QAg;
                iLk2 = stp.nBu;
            }
            iArrLk[c] = iLk;
            iArrLk[c2] = iLk2;
            if (iLk == 0 && iLk2 == 0 && view2 != null) {
                iArrLxb2 = le.Lxb(view2);
                iArrLk = le.lk(view2);
            }
            i5 = 0;
        } else {
            j3 = j;
            j4 = j2;
        }
        this.DY = i5;
        return new com.bytedance.sdk.openadsdk.core.model.nBu.Lxb().lc(f7).JXs(f8).ZU(f9).lk(fLk).LD(j3).Lxb(j4).LD(iArrLxb).Lxb(iArrLxb2).lk(le.lk(view)).ZU(iArrLk).ZU(this.foI).JXs(this.KPU).lc(this.Ivz).LD(com.bytedance.sdk.openadsdk.core.QAg.LD().Lxb() ? 1 : 2).Lxb(sparseArray).Lxb(str).Lxb(f5).lk(i).LD(f6).Lxb(i2).Lxb(jSONObject).LD(jSONObject2).Lxb();
    }

    public void Lxb(com.bytedance.sdk.openadsdk.core.model.STP stp) {
        this.JXs = stp;
    }
}
