package com.bytedance.sdk.openadsdk.component.reward.Lxb;

import android.util.SparseArray;
import android.view.View;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ZU {
    private final com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb JXs;
    private final com.bytedance.sdk.openadsdk.core.model.tD LD;
    com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lc Lxb;
    private boolean ZU;
    private final String lk;

    public interface Lxb {
        void Lxb(View view, float f, float f2, float f3, float f4, SparseArray<com.bytedance.sdk.openadsdk.core.LD.lk.Lxb> sparseArray, int i, int i2, int i3);

        void Lxb(String str, JSONObject jSONObject);
    }

    public ZU(com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb) {
        this.JXs = lxb;
        this.LD = lxb.LD;
        this.lk = lxb.JXs;
    }

    private void ZU() {
        if (!com.bytedance.sdk.openadsdk.multipro.LD.lk() && this.LD.sRq() == 4) {
            this.Lxb = com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.ebl.Lxb(this.JXs.NDz, this.LD, this.lk);
        }
        if (this.Lxb == null) {
            this.Lxb = com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.ebl.Lxb(this.JXs.Pw, this.LD, this.lk);
        }
    }

    public void LD() {
        com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lc lcVar = this.Lxb;
        if (lcVar != null) {
            lcVar.ZU();
        }
    }

    public void Lxb() {
        if (this.ZU) {
            return;
        }
        this.ZU = true;
        ZU();
    }

    public com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lc lk() {
        return this.Lxb;
    }

    public void Lxb(View view, float f, float f2, float f3, float f4, SparseArray<com.bytedance.sdk.openadsdk.core.LD.lk.Lxb> sparseArray, int i, int i2, int i3, Lxb lxb) {
        if (this.Lxb != null) {
            int id = view.getId();
            if (id == com.bytedance.sdk.openadsdk.utils.STP.JXs) {
                lxb.Lxb("click_play_star_level", null);
                return;
            }
            if (id == com.bytedance.sdk.openadsdk.utils.STP.ZU) {
                lxb.Lxb("click_play_star_nums", null);
                return;
            } else if (id == com.bytedance.sdk.openadsdk.utils.STP.lk) {
                lxb.Lxb("click_play_source", null);
                return;
            } else {
                if (id == com.bytedance.sdk.openadsdk.utils.STP.LD) {
                    lxb.Lxb("click_play_logo", null);
                    return;
                }
                return;
            }
        }
        lxb.Lxb(view, f, f2, f3, f4, sparseArray, i, i2, i3);
    }
}
