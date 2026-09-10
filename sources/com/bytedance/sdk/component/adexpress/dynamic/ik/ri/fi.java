package com.bytedance.sdk.component.adexpress.dynamic.ik.ri;

import android.view.MotionEvent;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class fi implements View.OnTouchListener {
    private int fi;
    private boolean ik;
    private com.bytedance.sdk.component.adexpress.dynamic.ik.mj ka;
    private float lr;
    private float ri;

    public fi(com.bytedance.sdk.component.adexpress.dynamic.ik.mj mjVar, int i) {
        this.ka = mjVar;
        this.fi = i;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.ik.mj mjVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.ri = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float y = motionEvent.getY();
                this.lr = y;
                if (Math.abs(y - this.ri) > 10.0f) {
                    this.ik = true;
                }
            }
        } else {
            if (!this.ik) {
                return false;
            }
            int iLr = com.bytedance.sdk.component.adexpress.ka.xha.lr(com.bytedance.sdk.component.adexpress.ka.ri(), Math.abs(this.lr - this.ri));
            if (this.lr - this.ri < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && iLr > this.fi && (mjVar = this.ka) != null) {
                mjVar.ri();
                this.ri = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                this.lr = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                this.ik = false;
            }
        }
        return true;
    }
}
