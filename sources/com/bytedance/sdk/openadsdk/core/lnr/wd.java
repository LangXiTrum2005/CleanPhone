package com.bytedance.sdk.openadsdk.core.lnr;

import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.jtx;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wd extends lnr {
    private lnr lnr;
    private final String qdl;
    private final com.bytedance.sdk.openadsdk.core.fs.qdl ud;

    public wd(String str, com.bytedance.sdk.openadsdk.core.fs.qdl qdlVar) {
        this(str, qdlVar, null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.lnr.lnr, android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return super.onTouch(view, motionEvent);
    }

    public void qdl(lnr lnrVar) {
        this.lnr = lnrVar;
    }

    public wd(String str, com.bytedance.sdk.openadsdk.core.fs.qdl qdlVar, lnr lnrVar) {
        this.qdl = str;
        this.ud = qdlVar;
        this.lnr = lnrVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.lnr.lnr
    public void qdl(View view, float f, float f2, float f3, float f4, SparseArray<lnr.qdl> sparseArray, boolean z2) {
        com.bytedance.sdk.openadsdk.core.fs.qdl qdlVar = this.ud;
        if (qdlVar != null) {
            qdlVar.mzz(this.qdl);
        }
        if (view != null) {
            if (view.getId() == jtx.lnr) {
                view.setTag(570425345, "VAST_TITLE");
            } else if (view.getId() == jtx.wd) {
                view.setTag(570425345, "VAST_DESCRIPTION");
            } else {
                view.setTag(570425345, this.qdl);
            }
        }
        lnr lnrVar = this.lnr;
        if (lnrVar != null) {
            lnrVar.bch = this.bch;
            lnrVar.uw = this.uw;
            lnrVar.xmv = this.xmv;
            int i2 = this.xmv;
            lnrVar.bqt = i2;
            lnrVar.koa = i2;
            lnrVar.qdl(view, f, f2, f3, f4, sparseArray, z2);
        }
    }
}
