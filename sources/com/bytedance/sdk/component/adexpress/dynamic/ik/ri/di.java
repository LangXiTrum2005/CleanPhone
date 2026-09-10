package com.bytedance.sdk.component.adexpress.dynamic.ik.ri;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class di implements View.OnTouchListener {
    private static int ik = 10;
    private com.bytedance.sdk.component.adexpress.dynamic.ik.mj fi;
    private boolean ka;
    private float lr;
    private float ri;

    public di(com.bytedance.sdk.component.adexpress.dynamic.ik.mj mjVar) {
        this.fi = mjVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.ri = motionEvent.getX();
            this.lr = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.ri) >= ik || Math.abs(y - this.lr) >= ik) {
                    this.ka = true;
                }
            } else if (action == 3) {
                this.ka = false;
            }
        } else {
            if (this.ka) {
                this.ka = false;
                return false;
            }
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (Math.abs(x2 - this.ri) >= ik || Math.abs(y2 - this.lr) >= ik) {
                this.ka = false;
            } else {
                com.bytedance.sdk.component.adexpress.dynamic.ik.mj mjVar = this.fi;
                if (mjVar != null) {
                    mjVar.ri();
                }
            }
        }
        return true;
    }
}
