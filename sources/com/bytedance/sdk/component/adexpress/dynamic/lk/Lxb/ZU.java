package com.bytedance.sdk.component.adexpress.dynamic.lk.Lxb;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class ZU implements View.OnTouchListener {
    private boolean JVA;
    private boolean JXs = true;
    private float LD;
    private float Lxb;
    private boolean OY;
    private com.bytedance.sdk.component.adexpress.dynamic.lk.OY QAg;
    private float ZU;
    private float ebl;
    private float lc;
    private float lk;
    private int nBu;

    public ZU(com.bytedance.sdk.component.adexpress.dynamic.lk.OY oy, int i, boolean z) {
        this.QAg = oy;
        this.nBu = i;
        this.JVA = z;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.lk.OY oy;
        com.bytedance.sdk.component.adexpress.dynamic.lk.OY oy2;
        com.bytedance.sdk.component.adexpress.dynamic.lk.OY oy3;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.Lxb = motionEvent.getX();
            this.LD = motionEvent.getY();
            this.lc = motionEvent.getY();
            this.JXs = true;
        } else if (action != 1) {
            if (action == 2) {
                float y = motionEvent.getY();
                this.ebl = y;
                if (Math.abs(y - this.lc) > 10.0f) {
                    this.OY = true;
                }
                this.ZU = motionEvent.getX();
                this.lk = motionEvent.getY();
                if (Math.abs(this.ZU - this.Lxb) > 8.0f || Math.abs(this.lk - this.LD) > 8.0f) {
                    this.JXs = false;
                }
            }
        } else {
            if (!this.OY && !this.JXs) {
                return false;
            }
            if (this.JVA || (oy3 = this.QAg) == null) {
                int iLD = com.bytedance.sdk.component.adexpress.ZU.OY.LD(com.bytedance.sdk.component.adexpress.ZU.Lxb(), Math.abs(this.ebl - this.lc));
                if (this.ebl - this.lc < 0.0f && iLD > this.nBu && (oy2 = this.QAg) != null) {
                    oy2.Lxb();
                } else if (this.JXs && (oy = this.QAg) != null) {
                    oy.Lxb();
                }
            } else {
                oy3.Lxb();
            }
        }
        return true;
    }
}
