package com.bytedance.sdk.component.adexpress.dynamic.ik.ri;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class ik implements View.OnTouchListener {
    private com.bytedance.sdk.component.adexpress.dynamic.ik.mj di;
    private boolean fi;
    private float ik;
    private boolean jbs;
    private float ka;
    private float lr;
    private boolean mj;
    private float ri;
    private int xha;

    public ik(com.bytedance.sdk.component.adexpress.dynamic.ik.mj mjVar) {
        this(mjVar, 5);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.ik.mj mjVar;
        com.bytedance.sdk.component.adexpress.dynamic.ik.mj mjVar2;
        com.bytedance.sdk.component.adexpress.dynamic.ik.mj mjVar3;
        if (this.jbs) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.ri = motionEvent.getX();
            this.lr = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                this.ka = motionEvent.getX();
                this.ik = motionEvent.getY();
                if (Math.abs(this.ka - this.ri) > 10.0f) {
                    this.fi = true;
                }
                if (Math.abs(this.ka - this.ri) > 8.0f || Math.abs(this.ik - this.lr) > 8.0f) {
                    this.mj = false;
                }
                int iLr = com.bytedance.sdk.component.adexpress.ka.xha.lr(com.bytedance.sdk.component.adexpress.ka.ri(), Math.abs(this.ka - this.ri));
                if (this.ka > this.ri && iLr > this.xha && (mjVar3 = this.di) != null) {
                    mjVar3.ri();
                    this.jbs = true;
                }
            }
        } else {
            if (!this.fi && !this.mj) {
                return false;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int iLr2 = com.bytedance.sdk.component.adexpress.ka.xha.lr(com.bytedance.sdk.component.adexpress.ka.ri(), Math.abs(this.ka - this.ri));
            if (this.ka > this.ri && iLr2 > this.xha && (mjVar2 = this.di) != null) {
                mjVar2.ri();
                this.jbs = true;
            }
            float fAbs = Math.abs(x - this.ri);
            float fAbs2 = Math.abs(y - this.lr);
            if ((fAbs < 8.0f || fAbs2 < 8.0f) && (mjVar = this.di) != null) {
                mjVar.lr();
                this.jbs = true;
            }
        }
        return true;
    }

    public ik(com.bytedance.sdk.component.adexpress.dynamic.ik.mj mjVar, int i) {
        this.xha = 5;
        this.mj = true;
        this.di = mjVar;
        if (i > 0) {
            this.xha = i;
        }
    }
}
