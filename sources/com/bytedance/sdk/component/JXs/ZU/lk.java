package com.bytedance.sdk.component.JXs.ZU;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class lk extends Lxb {
    @Override // com.bytedance.sdk.component.JXs.ZU.QAg
    public void Lxb(com.bytedance.sdk.component.JXs.lk.lk lkVar) {
        if (TextUtils.isEmpty(lkVar.JXs())) {
            com.bytedance.sdk.component.JXs.sLN slnJXs = lkVar.tD().JXs();
            lkVar.LD(slnJXs.Lxb(lkVar));
            lkVar.Lxb(slnJXs.LD(lkVar));
        }
        lkVar.Lxb(new ebl());
    }

    @Override // com.bytedance.sdk.component.JXs.ZU.QAg
    public String Lxb() {
        return "generate_key";
    }
}
