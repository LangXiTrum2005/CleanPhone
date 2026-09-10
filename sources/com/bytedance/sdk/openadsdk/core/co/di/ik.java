package com.bytedance.sdk.openadsdk.core.co.di;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.ka.aw;
import com.bytedance.adsdk.ugeno.ka.sf;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class ik implements aw {
    private boolean ri = false;

    @Override // com.bytedance.adsdk.ugeno.ka.aw
    public boolean ri(com.bytedance.adsdk.ugeno.lr.ik ikVar, MotionEvent motionEvent, sf sfVar, com.bytedance.adsdk.ugeno.ka.ka.ik ikVar2) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.ri = true;
        } else if ((action == 1 || action == 3) && this.ri) {
            this.ri = false;
            if (ri(ikVar.sf(), motionEvent.getX(), motionEvent.getY()) && sfVar != null) {
                sfVar.ri(ikVar, ikVar2.ka(), ikVar2.xha().lr());
            }
        }
        return true;
    }

    private boolean ri(View view, float f, float f2) {
        return f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f < ((float) view.getWidth()) && f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 < ((float) view.getHeight());
    }
}
