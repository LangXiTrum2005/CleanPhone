package com.bytedance.sdk.component.adexpress.dynamic.lk.Lxb;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.lk.QAg;

/* JADX INFO: loaded from: classes2.dex */
public class LD implements View.OnTouchListener {
    private QAg JXs;
    private float LD;
    private float Lxb;
    private boolean ZU;
    private com.bytedance.sdk.component.adexpress.dynamic.lk.OY lc;
    private long lk;

    public LD(QAg qAg, com.bytedance.sdk.component.adexpress.dynamic.lk.OY oy) {
        this.JXs = qAg;
        this.lc = oy;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.lk = System.currentTimeMillis();
            this.Lxb = motionEvent.getX();
            this.LD = motionEvent.getY();
            this.JXs.JXs();
        } else if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.Lxb) >= com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(com.bytedance.sdk.component.adexpress.ZU.Lxb(), 10.0f) || Math.abs(y - this.LD) >= com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(com.bytedance.sdk.component.adexpress.ZU.Lxb(), 10.0f)) {
                    this.ZU = true;
                    this.JXs.lc();
                }
            }
        } else {
            if (this.ZU) {
                return false;
            }
            if (System.currentTimeMillis() - this.lk >= 1500) {
                com.bytedance.sdk.component.adexpress.dynamic.lk.OY oy = this.lc;
                if (oy != null) {
                    oy.Lxb();
                }
            } else {
                this.JXs.lc();
            }
        }
        return true;
    }
}
