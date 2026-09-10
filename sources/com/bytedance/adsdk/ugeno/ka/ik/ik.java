package com.bytedance.adsdk.ugeno.ka.ik;

import com.bytedance.adsdk.ugeno.ka.di;

/* JADX INFO: loaded from: classes2.dex */
public class ik extends com.bytedance.adsdk.ugeno.ka.lr.ri {
    public ik(com.bytedance.adsdk.ugeno.lr.ik ikVar, String str, di.ri riVar) {
        super(ikVar, str, riVar);
    }

    @Override // com.bytedance.adsdk.ugeno.ka.lr.ri
    public void ri() {
        com.bytedance.adsdk.ugeno.lr.ik ikVarLr;
        com.bytedance.adsdk.ugeno.lr.ik ikVar = this.ik;
        if (ikVar == null || (ikVarLr = ikVar.lr(ikVar)) == null) {
            return;
        }
        com.bytedance.adsdk.ugeno.lr.ik ikVarDi = ikVarLr.di("SwiperView");
        if (ikVarDi instanceof com.bytedance.adsdk.ugeno.lr) {
            ((com.bytedance.adsdk.ugeno.lr) ikVarDi).ka();
        }
    }
}
