package com.bytedance.adsdk.ugeno.ka.lr;

import com.bytedance.adsdk.ugeno.core.vr;
import com.bytedance.adsdk.ugeno.ka.di;

/* JADX INFO: loaded from: classes2.dex */
public class ik extends ri {
    private vr jbs;

    public ik(com.bytedance.adsdk.ugeno.lr.ik ikVar, String str, di.ri riVar) {
        super(ikVar, str, riVar);
    }

    @Override // com.bytedance.adsdk.ugeno.ka.lr.ri
    public void ri() {
        vr vrVarAy = this.ik.ay();
        this.jbs = vrVarAy;
        if (vrVarAy != null) {
            vrVarAy.ri(this.ik, this.xha, this.lr);
        }
    }
}
