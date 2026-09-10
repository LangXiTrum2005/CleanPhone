package com.bytedance.sdk.openadsdk.core.ik;

import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.slm;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xha extends ik {
    private ik ik;
    private final com.bytedance.sdk.openadsdk.core.aw.ri lr;
    private final String ri;

    public xha(String str, com.bytedance.sdk.openadsdk.core.aw.ri riVar) {
        this(str, riVar, null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ik.ik, android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return super.onTouch(view, motionEvent);
    }

    public void ri(ik ikVar) {
        this.ik = ikVar;
    }

    public xha(String str, com.bytedance.sdk.openadsdk.core.aw.ri riVar, ik ikVar) {
        this.ri = str;
        this.lr = riVar;
        this.ik = ikVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ik.ik
    public void ri(View view, float f, float f2, float f3, float f4, SparseArray<ik.ri> sparseArray, boolean z) {
        com.bytedance.sdk.openadsdk.core.aw.ri riVar = this.lr;
        if (riVar != null) {
            riVar.fi(this.ri);
        }
        if (view != null) {
            if (view.getId() == slm.fi) {
                view.setTag(570425345, "VAST_TITLE");
            } else if (view.getId() == slm.jbs) {
                view.setTag(570425345, "VAST_DESCRIPTION");
            } else {
                view.setTag(570425345, this.ri);
            }
        }
        ik ikVar = this.ik;
        if (ikVar != null) {
            ikVar.ay = this.ay;
            ikVar.fr = this.fr;
            ikVar.su = this.su;
            int i = this.su;
            ikVar.igq = i;
            ikVar.zf = i;
            ikVar.ri(view, f, f2, f3, f4, sparseArray, z);
        }
    }
}
