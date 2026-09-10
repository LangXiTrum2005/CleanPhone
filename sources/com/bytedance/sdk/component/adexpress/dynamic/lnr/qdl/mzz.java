package com.bytedance.sdk.component.adexpress.dynamic.lnr.qdl;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class mzz implements View.OnTouchListener {
    private boolean lnr;
    private com.bytedance.sdk.component.adexpress.dynamic.lnr.jpc mml;
    private int mzz;
    private float qdl;
    private float ud;

    public mzz(com.bytedance.sdk.component.adexpress.dynamic.lnr.jpc jpcVar, int i2) {
        this.mml = jpcVar;
        this.mzz = i2;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.lnr.jpc jpcVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.qdl = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float y = motionEvent.getY();
                this.ud = y;
                if (Math.abs(y - this.qdl) > 10.0f) {
                    this.lnr = true;
                }
            }
        } else {
            if (!this.lnr) {
                return false;
            }
            int iUd = com.bytedance.sdk.component.adexpress.mml.wd.ud(com.bytedance.sdk.component.adexpress.mml.qdl(), Math.abs(this.ud - this.qdl));
            if (this.ud - this.qdl < 0.0f && iUd > this.mzz && (jpcVar = this.mml) != null) {
                jpcVar.qdl();
                this.qdl = 0.0f;
                this.ud = 0.0f;
                this.lnr = false;
            }
        }
        return true;
    }
}
