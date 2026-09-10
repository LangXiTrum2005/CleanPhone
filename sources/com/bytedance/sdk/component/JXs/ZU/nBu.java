package com.bytedance.sdk.component.JXs.ZU;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.JXs.brP;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class nBu extends Lxb {
    private Bitmap LD(com.bytedance.sdk.component.JXs.lk.lk lkVar) {
        Collection<brP> collectionLxb = lkVar.tD().Lxb();
        Bitmap bitmapLxb = null;
        if (collectionLxb == null) {
            return null;
        }
        Iterator<brP> it = collectionLxb.iterator();
        while (it.hasNext() && (bitmapLxb = it.next().Lxb(lkVar.JXs())) == null) {
        }
        return bitmapLxb;
    }

    private Bitmap lk(com.bytedance.sdk.component.JXs.lk.lk lkVar) {
        return lkVar.tD().Lxb(lkVar.DY()).Lxb(lkVar.JXs());
    }

    @Override // com.bytedance.sdk.component.JXs.ZU.QAg
    public void Lxb(com.bytedance.sdk.component.JXs.lk.lk lkVar) {
        Bitmap bitmapLD;
        int iSLN = lkVar.sLN();
        if (iSLN == 2 || iSLN == 1) {
            bitmapLD = (lkVar.Sfi() || lkVar.DY().lc()) ? LD(lkVar) : lk(lkVar);
        } else {
            bitmapLD = null;
        }
        if (bitmapLD == null) {
            lkVar.Lxb(new sLN());
        } else {
            lkVar.Lxb(new NXR(bitmapLD, null, false));
        }
    }

    @Override // com.bytedance.sdk.component.JXs.ZU.QAg
    public String Lxb() {
        return "memory_cache";
    }
}
