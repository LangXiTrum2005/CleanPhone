package com.bytedance.sdk.component.mzz.mml.ud;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.mzz.exc;

/* JADX INFO: loaded from: classes.dex */
public class qdl<T> implements mo {
    @Override // com.bytedance.sdk.component.mzz.mml.ud.mo
    public boolean qdl(com.bytedance.sdk.component.mzz.mml.lnr.lnr lnrVar, exc excVar, com.bytedance.sdk.component.mzz.mml.lnr.qdl qdlVar) {
        Bitmap bitmapQdl;
        String str = lnrVar.to();
        lnrVar.qdl();
        com.bytedance.sdk.component.mzz.ud udVarJl = lnrVar.jl();
        com.bytedance.sdk.component.mzz.mml.lnr.mo moVarYt = lnrVar.yt();
        if (udVarJl == null || moVarYt == null || !udVarJl.mzz() || !qdl(lnrVar) || (bitmapQdl = moVarYt.qdl(udVarJl).qdl(str)) == null) {
            return true;
        }
        lnrVar.qdl();
        qdlVar.qdl(new com.bytedance.sdk.component.mzz.mml.lnr.mml().qdl(lnrVar, bitmapQdl, null, false));
        return false;
    }

    private boolean qdl(com.bytedance.sdk.component.mzz.mml.lnr.lnr lnrVar) {
        int iFs = lnrVar.fs();
        return iFs == 1 || iFs == 2;
    }

    @Override // com.bytedance.sdk.component.mzz.mml.ud.mo
    public String qdl() {
        return "bitmap_cache";
    }
}
