package com.bytedance.sdk.component.adexpress.dynamic.ik.ri;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.ik.jbs;

/* JADX INFO: loaded from: classes2.dex */
public class lr implements View.OnTouchListener {
    private com.bytedance.sdk.component.adexpress.dynamic.ik.mj di;
    private jbs fi;
    private long ik;
    private boolean ka;
    private float lr;
    private float ri;

    public lr(jbs jbsVar, com.bytedance.sdk.component.adexpress.dynamic.ik.mj mjVar) {
        this.fi = jbsVar;
        this.di = mjVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.ik = System.currentTimeMillis();
            this.ri = motionEvent.getX();
            this.lr = motionEvent.getY();
            this.fi.fi();
        } else if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.ri) >= com.bytedance.sdk.component.adexpress.ka.xha.ri(com.bytedance.sdk.component.adexpress.ka.ri(), 10.0f) || Math.abs(y - this.lr) >= com.bytedance.sdk.component.adexpress.ka.xha.ri(com.bytedance.sdk.component.adexpress.ka.ri(), 10.0f)) {
                    this.ka = true;
                    this.fi.di();
                }
            }
        } else {
            if (this.ka) {
                return false;
            }
            if (System.currentTimeMillis() - this.ik >= 1500) {
                com.bytedance.sdk.component.adexpress.dynamic.ik.mj mjVar = this.di;
                if (mjVar != null) {
                    mjVar.ri();
                }
            } else {
                this.fi.di();
            }
        }
        return true;
    }
}
