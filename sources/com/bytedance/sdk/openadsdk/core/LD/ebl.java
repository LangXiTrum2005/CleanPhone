package com.bytedance.sdk.openadsdk.core.LD;

import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.STP;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ebl extends lk {
    private final com.bytedance.sdk.openadsdk.core.sLN.Lxb LD;
    private final String Lxb;
    private lk lk;

    public ebl(String str, com.bytedance.sdk.openadsdk.core.sLN.Lxb lxb) {
        this(str, lxb, null);
    }

    public void Lxb(lk lkVar) {
        this.lk = lkVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.LD.lk, android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return super.onTouch(view, motionEvent);
    }

    public ebl(String str, com.bytedance.sdk.openadsdk.core.sLN.Lxb lxb, lk lkVar) {
        this.Lxb = str;
        this.LD = lxb;
        this.lk = lkVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.LD.lk
    public void Lxb(View view, float f, float f2, float f3, float f4, SparseArray<lk.Lxb> sparseArray, boolean z) {
        com.bytedance.sdk.openadsdk.core.sLN.Lxb lxb = this.LD;
        if (lxb != null) {
            lxb.JXs(this.Lxb);
        }
        if (view != null) {
            if (view.getId() == STP.lk) {
                view.setTag(570425345, "VAST_TITLE");
            } else if (view.getId() == STP.ebl) {
                view.setTag(570425345, "VAST_DESCRIPTION");
            } else {
                view.setTag(570425345, this.Lxb);
            }
        }
        lk lkVar = this.lk;
        if (lkVar != null) {
            lkVar.CSn = this.CSn;
            lkVar.id = this.id;
            lkVar.foI = this.foI;
            int i = this.foI;
            lkVar.KPU = i;
            lkVar.Ivz = i;
            lkVar.Lxb(view, f, f2, f3, f4, sparseArray, z);
        }
    }
}
