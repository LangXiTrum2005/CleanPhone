package com.bytedance.sdk.component.adexpress.dynamic.lk.Lxb;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class lk implements View.OnTouchListener {
    private boolean JXs;
    private float LD;
    private float Lxb;
    private boolean OY;
    private boolean QAg;
    private float ZU;
    private int ebl;
    private com.bytedance.sdk.component.adexpress.dynamic.lk.OY lc;
    private float lk;

    public lk(com.bytedance.sdk.component.adexpress.dynamic.lk.OY oy) {
        this(oy, 5);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.lk.OY oy;
        com.bytedance.sdk.component.adexpress.dynamic.lk.OY oy2;
        com.bytedance.sdk.component.adexpress.dynamic.lk.OY oy3;
        if (this.QAg) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.Lxb = motionEvent.getX();
            this.LD = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                this.ZU = motionEvent.getX();
                this.lk = motionEvent.getY();
                if (Math.abs(this.ZU - this.Lxb) > 10.0f) {
                    this.JXs = true;
                }
                if (Math.abs(this.ZU - this.Lxb) > 8.0f || Math.abs(this.lk - this.LD) > 8.0f) {
                    this.OY = false;
                }
                int iLD = com.bytedance.sdk.component.adexpress.ZU.OY.LD(com.bytedance.sdk.component.adexpress.ZU.Lxb(), Math.abs(this.ZU - this.Lxb));
                if (this.ZU > this.Lxb && iLD > this.ebl && (oy3 = this.lc) != null) {
                    oy3.Lxb();
                    this.QAg = true;
                }
            }
        } else {
            if (!this.JXs && !this.OY) {
                return false;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int iLD2 = com.bytedance.sdk.component.adexpress.ZU.OY.LD(com.bytedance.sdk.component.adexpress.ZU.Lxb(), Math.abs(this.ZU - this.Lxb));
            if (this.ZU > this.Lxb && iLD2 > this.ebl && (oy2 = this.lc) != null) {
                oy2.Lxb();
                this.QAg = true;
            }
            float fAbs = Math.abs(x - this.Lxb);
            float fAbs2 = Math.abs(y - this.LD);
            if ((fAbs < 8.0f || fAbs2 < 8.0f) && (oy = this.lc) != null) {
                oy.LD();
                this.QAg = true;
            }
        }
        return true;
    }

    public lk(com.bytedance.sdk.component.adexpress.dynamic.lk.OY oy, int i) {
        this.ebl = 5;
        this.OY = true;
        this.lc = oy;
        if (i > 0) {
            this.ebl = i;
        }
    }
}
