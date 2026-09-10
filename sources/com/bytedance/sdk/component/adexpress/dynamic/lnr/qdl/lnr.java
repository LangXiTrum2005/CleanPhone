package com.bytedance.sdk.component.adexpress.dynamic.lnr.qdl;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class lnr implements View.OnTouchListener {
    private boolean jpc;
    private float lnr;
    private float mml;
    private com.bytedance.sdk.component.adexpress.dynamic.lnr.jpc mo;
    private boolean mzz;
    private float qdl;
    private boolean tvp;
    private float ud;
    private int wd;

    public lnr(com.bytedance.sdk.component.adexpress.dynamic.lnr.jpc jpcVar) {
        this(jpcVar, 5);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.lnr.jpc jpcVar;
        com.bytedance.sdk.component.adexpress.dynamic.lnr.jpc jpcVar2;
        com.bytedance.sdk.component.adexpress.dynamic.lnr.jpc jpcVar3;
        if (this.tvp) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.qdl = motionEvent.getX();
            this.ud = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                this.mml = motionEvent.getX();
                this.lnr = motionEvent.getY();
                if (Math.abs(this.mml - this.qdl) > 10.0f) {
                    this.mzz = true;
                }
                if (Math.abs(this.mml - this.qdl) > 8.0f || Math.abs(this.lnr - this.ud) > 8.0f) {
                    this.jpc = false;
                }
                int iUd = com.bytedance.sdk.component.adexpress.mml.wd.ud(com.bytedance.sdk.component.adexpress.mml.qdl(), Math.abs(this.mml - this.qdl));
                if (this.mml > this.qdl && iUd > this.wd && (jpcVar3 = this.mo) != null) {
                    jpcVar3.qdl();
                    this.tvp = true;
                }
            }
        } else {
            if (!this.mzz && !this.jpc) {
                return false;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int iUd2 = com.bytedance.sdk.component.adexpress.mml.wd.ud(com.bytedance.sdk.component.adexpress.mml.qdl(), Math.abs(this.mml - this.qdl));
            if (this.mml > this.qdl && iUd2 > this.wd && (jpcVar2 = this.mo) != null) {
                jpcVar2.qdl();
                this.tvp = true;
            }
            float fAbs = Math.abs(x - this.qdl);
            float fAbs2 = Math.abs(y - this.ud);
            if ((fAbs < 8.0f || fAbs2 < 8.0f) && (jpcVar = this.mo) != null) {
                jpcVar.ud();
                this.tvp = true;
            }
        }
        return true;
    }

    public lnr(com.bytedance.sdk.component.adexpress.dynamic.lnr.jpc jpcVar, int i2) {
        this.wd = 5;
        this.jpc = true;
        this.mo = jpcVar;
        if (i2 > 0) {
            this.wd = i2;
        }
    }
}
