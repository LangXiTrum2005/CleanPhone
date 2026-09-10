package com.bytedance.sdk.component.adexpress.dynamic.ik.ri;

import android.view.MotionEvent;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class ka implements View.OnTouchListener {
    private float di;
    private boolean fi = true;
    private float ik;
    private com.bytedance.sdk.component.adexpress.dynamic.ik.mj jbs;
    private float ka;
    private float lr;
    private boolean mj;
    private int qt;
    private float ri;
    private boolean sf;
    private float xha;

    public ka(com.bytedance.sdk.component.adexpress.dynamic.ik.mj mjVar, int i, boolean z) {
        this.jbs = mjVar;
        this.qt = i;
        this.sf = z;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.ik.mj mjVar;
        com.bytedance.sdk.component.adexpress.dynamic.ik.mj mjVar2;
        com.bytedance.sdk.component.adexpress.dynamic.ik.mj mjVar3;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.ri = motionEvent.getX();
            this.lr = motionEvent.getY();
            this.di = motionEvent.getY();
            this.fi = true;
        } else if (action != 1) {
            if (action == 2) {
                float y = motionEvent.getY();
                this.xha = y;
                if (Math.abs(y - this.di) > 10.0f) {
                    this.mj = true;
                }
                this.ka = motionEvent.getX();
                this.ik = motionEvent.getY();
                if (Math.abs(this.ka - this.ri) > 8.0f || Math.abs(this.ik - this.lr) > 8.0f) {
                    this.fi = false;
                }
            }
        } else {
            if (!this.mj && !this.fi) {
                return false;
            }
            if (this.sf || (mjVar3 = this.jbs) == null) {
                int iLr = com.bytedance.sdk.component.adexpress.ka.xha.lr(com.bytedance.sdk.component.adexpress.ka.ri(), Math.abs(this.xha - this.di));
                if (this.xha - this.di < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && iLr > this.qt && (mjVar2 = this.jbs) != null) {
                    mjVar2.ri();
                } else if (this.fi && (mjVar = this.jbs) != null) {
                    mjVar.ri();
                }
            } else {
                mjVar3.ri();
            }
        }
        return true;
    }
}
