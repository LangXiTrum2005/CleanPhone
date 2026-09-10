package com.bytedance.sdk.component.adexpress.dynamic.lk.Lxb;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class lc implements View.OnTouchListener {
    private static int lk = 10;
    private com.bytedance.sdk.component.adexpress.dynamic.lk.OY JXs;
    private float LD;
    private float Lxb;
    private boolean ZU;

    public lc(com.bytedance.sdk.component.adexpress.dynamic.lk.OY oy) {
        this.JXs = oy;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.Lxb = motionEvent.getX();
            this.LD = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.Lxb) >= lk || Math.abs(y - this.LD) >= lk) {
                    this.ZU = true;
                }
            } else if (action == 3) {
                this.ZU = false;
            }
        } else {
            if (this.ZU) {
                this.ZU = false;
                return false;
            }
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (Math.abs(x2 - this.Lxb) >= lk || Math.abs(y2 - this.LD) >= lk) {
                this.ZU = false;
            } else {
                com.bytedance.sdk.component.adexpress.dynamic.lk.OY oy = this.JXs;
                if (oy != null) {
                    oy.Lxb();
                }
            }
        }
        return true;
    }
}
