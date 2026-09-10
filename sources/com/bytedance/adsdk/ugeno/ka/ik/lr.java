package com.bytedance.adsdk.ugeno.ka.ik;

import com.bytedance.adsdk.ugeno.ka.di;
import com.ironsource.X3;

/* JADX INFO: loaded from: classes2.dex */
public class lr extends com.bytedance.adsdk.ugeno.ka.lr.ri {
    public lr(com.bytedance.adsdk.ugeno.lr.ik ikVar, String str, di.ri riVar) {
        super(ikVar, str, riVar);
    }

    @Override // com.bytedance.adsdk.ugeno.ka.lr.ri
    public void ri() {
        if (this.ik == null) {
            return;
        }
        int iRi = com.bytedance.adsdk.ugeno.xha.ik.ri(this.di.get(X3.i.L), 0);
        com.bytedance.adsdk.ugeno.lr.ik ikVar = this.ik;
        com.bytedance.adsdk.ugeno.lr.ik ikVarLr = ikVar.lr(ikVar);
        if (ikVarLr == null) {
            return;
        }
        com.bytedance.adsdk.ugeno.lr.ik ikVarDi = ikVarLr.di("SwiperView");
        if (ikVarDi instanceof com.bytedance.adsdk.ugeno.lr) {
            ((com.bytedance.adsdk.ugeno.lr) ikVarDi).ri(iRi);
        }
    }
}
