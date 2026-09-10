package com.bytedance.sdk.component.fi.lr.lr;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.fi.tan;

/* JADX INFO: loaded from: classes2.dex */
public class ri<T> implements di {
    @Override // com.bytedance.sdk.component.fi.lr.lr.di
    public boolean ri(com.bytedance.sdk.component.fi.lr.ik.ik ikVar, tan tanVar, com.bytedance.sdk.component.fi.lr.ik.ri riVar) {
        Bitmap bitmapRi;
        String strMj = ikVar.mj();
        ikVar.ri();
        com.bytedance.sdk.component.fi.lr lrVarBu = ikVar.bu();
        com.bytedance.sdk.component.fi.lr.ik.di diVarSlm = ikVar.slm();
        if (lrVarBu == null || diVarSlm == null || !lrVarBu.fi() || !ri(ikVar) || (bitmapRi = diVarSlm.ri(lrVarBu).ri(strMj)) == null) {
            return true;
        }
        ikVar.ri();
        riVar.ri(new com.bytedance.sdk.component.fi.lr.ik.ka().ri(ikVar, bitmapRi, null, false));
        return false;
    }

    private boolean ri(com.bytedance.sdk.component.fi.lr.ik.ik ikVar) {
        int iSf = ikVar.sf();
        return iSf == 1 || iSf == 2;
    }

    @Override // com.bytedance.sdk.component.fi.lr.lr.di
    public String ri() {
        return "bitmap_cache";
    }
}
