package com.bytedance.adsdk.ugeno.ka.ka;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class ka extends ik implements com.bytedance.adsdk.ugeno.ka.ri.ka {
    private com.bytedance.adsdk.ugeno.ka.ri.ik sf;

    public ka(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.ka.ka.ik
    public boolean ri(Object... objArr) {
        com.bytedance.adsdk.ugeno.ka.ri.ri riVarJc = this.lr.jc();
        if (riVarJc == null) {
            return false;
        }
        com.bytedance.adsdk.ugeno.ka.ri.ik ikVarRi = riVarJc.ri(this.di);
        this.sf = ikVarRi;
        if (ikVarRi != null) {
            ikVarRi.ri(this);
            return false;
        }
        riVarJc.ri(this.di, new com.bytedance.adsdk.ugeno.ka.ri.lr());
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.ka.ri.ka
    public void ri(String str) {
        this.ri.ri(this.lr, this.di, this.ik.lr());
    }
}
