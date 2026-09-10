package com.bytedance.sdk.component.fi.lr.lr;

import android.text.TextUtils;
import com.bytedance.sdk.component.fi.tan;
import com.bytedance.sdk.component.utils.slm;

/* JADX INFO: loaded from: classes2.dex */
public class lr implements di {
    @Override // com.bytedance.sdk.component.fi.lr.lr.di
    public boolean ri(com.bytedance.sdk.component.fi.lr.ik.ik ikVar, tan tanVar, com.bytedance.sdk.component.fi.lr.ik.ri riVar) {
        if (TextUtils.isEmpty(ikVar.mj())) {
            String strRi = ri(ikVar);
            ikVar.lr(strRi);
            ikVar.ri(strRi);
        }
        ikVar.ri();
        return true;
    }

    @Override // com.bytedance.sdk.component.fi.lr.lr.di
    public String ri() {
        return "generate_key";
    }

    private String ri(com.bytedance.sdk.component.fi.lr.ik.ik ikVar) {
        return slm.ri(ikVar.ri());
    }
}
