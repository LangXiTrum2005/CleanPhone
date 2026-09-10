package com.bytedance.sdk.component.adexpress.dynamic.lnr.qdl;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.lnr.tvp;

/* JADX INFO: loaded from: classes.dex */
public class ud implements View.OnTouchListener {
    private long lnr;
    private boolean mml;
    private com.bytedance.sdk.component.adexpress.dynamic.lnr.jpc mo;
    private tvp mzz;
    private float qdl;
    private float ud;

    public ud(tvp tvpVar, com.bytedance.sdk.component.adexpress.dynamic.lnr.jpc jpcVar) {
        this.mzz = tvpVar;
        this.mo = jpcVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.lnr = System.currentTimeMillis();
            this.qdl = motionEvent.getX();
            this.ud = motionEvent.getY();
            this.mzz.mzz();
        } else if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.qdl) >= com.bytedance.sdk.component.adexpress.mml.wd.qdl(com.bytedance.sdk.component.adexpress.mml.qdl(), 10.0f) || Math.abs(y - this.ud) >= com.bytedance.sdk.component.adexpress.mml.wd.qdl(com.bytedance.sdk.component.adexpress.mml.qdl(), 10.0f)) {
                    this.mml = true;
                    this.mzz.mo();
                }
            }
        } else {
            if (this.mml) {
                return false;
            }
            if (System.currentTimeMillis() - this.lnr >= 1500) {
                com.bytedance.sdk.component.adexpress.dynamic.lnr.jpc jpcVar = this.mo;
                if (jpcVar != null) {
                    jpcVar.qdl();
                }
            } else {
                this.mzz.mo();
            }
        }
        return true;
    }
}
