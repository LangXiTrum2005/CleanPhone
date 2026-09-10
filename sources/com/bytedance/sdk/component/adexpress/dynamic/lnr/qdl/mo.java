package com.bytedance.sdk.component.adexpress.dynamic.lnr.qdl;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class mo implements View.OnTouchListener {
    private static int lnr = 10;
    private boolean mml;
    private com.bytedance.sdk.component.adexpress.dynamic.lnr.jpc mzz;
    private float qdl;
    private float ud;

    public mo(com.bytedance.sdk.component.adexpress.dynamic.lnr.jpc jpcVar) {
        this.mzz = jpcVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.qdl = motionEvent.getX();
            this.ud = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.qdl) >= lnr || Math.abs(y - this.ud) >= lnr) {
                    this.mml = true;
                }
            } else if (action == 3) {
                this.mml = false;
            }
        } else {
            if (this.mml) {
                this.mml = false;
                return false;
            }
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (Math.abs(x2 - this.qdl) >= lnr || Math.abs(y2 - this.ud) >= lnr) {
                this.mml = false;
            } else {
                com.bytedance.sdk.component.adexpress.dynamic.lnr.jpc jpcVar = this.mzz;
                if (jpcVar != null) {
                    jpcVar.qdl();
                }
            }
        }
        return true;
    }
}
