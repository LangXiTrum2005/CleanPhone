package com.bytedance.sdk.component.adexpress.dynamic.lk.Lxb;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class JXs implements View.OnTouchListener {
    private int JXs;
    private float LD;
    private float Lxb;
    private com.bytedance.sdk.component.adexpress.dynamic.lk.OY ZU;
    private boolean lk;

    public JXs(com.bytedance.sdk.component.adexpress.dynamic.lk.OY oy, int i) {
        this.ZU = oy;
        this.JXs = i;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.lk.OY oy;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.Lxb = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float y = motionEvent.getY();
                this.LD = y;
                if (Math.abs(y - this.Lxb) > 10.0f) {
                    this.lk = true;
                }
            }
        } else {
            if (!this.lk) {
                return false;
            }
            int iLD = com.bytedance.sdk.component.adexpress.ZU.OY.LD(com.bytedance.sdk.component.adexpress.ZU.Lxb(), Math.abs(this.LD - this.Lxb));
            if (this.LD - this.Lxb < 0.0f && iLD > this.JXs && (oy = this.ZU) != null) {
                oy.Lxb();
                this.Lxb = 0.0f;
                this.LD = 0.0f;
                this.lk = false;
            }
        }
        return true;
    }
}
