package com.bytedance.sdk.component.adexpress.dynamic.ik.ri;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class mj implements View.OnTouchListener {
    private float di;
    private float fi;
    private final int ik = 10;
    private float ka;
    private final boolean lr;
    private final com.bytedance.sdk.component.adexpress.dynamic.ik.mj ri;
    private float xha;

    public mj(com.bytedance.sdk.component.adexpress.dynamic.ik.mj mjVar, boolean z) {
        this.ri = mjVar;
        this.lr = z;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.ik.mj mjVar;
        com.bytedance.sdk.component.adexpress.dynamic.ik.mj mjVar2;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.ka = motionEvent.getX();
            this.fi = motionEvent.getY();
            new StringBuilder(", mStartY: ").append(this.fi);
        } else if (action == 1) {
            this.di = motionEvent.getX();
            this.xha = motionEvent.getY();
            new StringBuilder(", mEndY: ").append(this.xha);
            if (this.lr || (mjVar2 = this.ri) == null) {
                float f = this.di - this.ka;
                float f2 = this.xha - this.fi;
                if (com.bytedance.sdk.component.adexpress.ka.xha.lr(com.bytedance.sdk.component.adexpress.ka.ri(), Math.abs((float) Math.sqrt((f * f) + (f2 * f2)))) > 10.0f && (mjVar = this.ri) != null) {
                    mjVar.ri();
                }
            } else {
                mjVar2.ri();
            }
        }
        return true;
    }
}
