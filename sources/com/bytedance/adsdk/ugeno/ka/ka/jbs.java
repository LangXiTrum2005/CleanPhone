package com.bytedance.adsdk.ugeno.ka.ka;

import android.content.Context;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.ka.aw;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class jbs extends ik {
    private boolean aw;
    private aw bgr;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private float f18020co;
    private float sf;

    public jbs(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.ka.ka.ik
    public boolean ri(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        MotionEvent motionEvent = (MotionEvent) objArr[0];
        aw awVar = this.bgr;
        return awVar != null ? awVar.ri(this.lr, motionEvent, this.ri, this) : ri(this.lr, motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
    public boolean ri(com.bytedance.adsdk.ugeno.lr.ik ikVar, MotionEvent motionEvent) {
        float rawX;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.sf = motionEvent.getRawX();
            this.f18020co = motionEvent.getRawY();
        } else if (action == 1) {
            if (this.aw) {
                this.aw = false;
                this.sf = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                this.f18020co = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                return false;
            }
            rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            if (Math.abs(rawX - this.sf) >= 15.0f && Math.abs(rawY - this.f18020co) < 15.0f) {
                com.bytedance.adsdk.ugeno.ka.sf sfVar = this.ri;
                if (sfVar != null) {
                    sfVar.ri(ikVar, this.di, this.ik.lr());
                    this.sf = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    this.f18020co = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    return true;
                }
            } else {
                this.aw = false;
                return false;
            }
        } else if (action == 2) {
            float rawX2 = motionEvent.getRawX();
            float rawY2 = motionEvent.getRawY();
            if (Math.abs(rawX2 - this.sf) >= 15.0f || Math.abs(rawY2 - this.f18020co) >= 15.0f) {
                this.aw = true;
            }
        } else if (action == 3) {
            this.aw = false;
            if (this.aw) {
                this.aw = false;
                this.sf = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                this.f18020co = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                return false;
            }
            rawX = motionEvent.getRawX();
            float rawY3 = motionEvent.getRawY();
            if (Math.abs(rawX - this.sf) >= 15.0f) {
            }
            this.aw = false;
            return false;
        }
        return true;
    }

    public void ri(aw awVar) {
        this.bgr = awVar;
    }
}
