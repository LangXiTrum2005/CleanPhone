package com.bytedance.sdk.component.adexpress.dynamic.lk.Lxb;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class OY implements View.OnTouchListener {
    private float JXs;
    private final boolean LD;
    private final com.bytedance.sdk.component.adexpress.dynamic.lk.OY Lxb;
    private float ZU;
    private float ebl;
    private float lc;
    private final int lk = 10;

    public OY(com.bytedance.sdk.component.adexpress.dynamic.lk.OY oy, boolean z) {
        this.Lxb = oy;
        this.LD = z;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.lk.OY oy;
        com.bytedance.sdk.component.adexpress.dynamic.lk.OY oy2;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.ZU = motionEvent.getX();
            this.JXs = motionEvent.getY();
            new StringBuilder(", mStartY: ").append(this.JXs);
        } else if (action == 1) {
            this.lc = motionEvent.getX();
            this.ebl = motionEvent.getY();
            new StringBuilder(", mEndY: ").append(this.ebl);
            if (this.LD || (oy2 = this.Lxb) == null) {
                float f = this.lc - this.ZU;
                float f2 = this.ebl - this.JXs;
                if (com.bytedance.sdk.component.adexpress.ZU.OY.LD(com.bytedance.sdk.component.adexpress.ZU.Lxb(), Math.abs((float) Math.sqrt((f2 * f2) + (f * f)))) > 10.0f && (oy = this.Lxb) != null) {
                    oy.Lxb();
                }
            } else {
                oy2.Lxb();
            }
        }
        return true;
    }
}
