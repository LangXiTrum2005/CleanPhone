package com.bytedance.adsdk.ugeno.mml.mml;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.mml.exu;

/* JADX INFO: loaded from: classes.dex */
public class tvp extends lnr {
    private boolean exu;
    private float fs;
    private exu rdp;
    private float rq;

    public tvp(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.mml.mml.lnr
    public boolean qdl(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        MotionEvent motionEvent = (MotionEvent) objArr[0];
        exu exuVar = this.rdp;
        return exuVar != null ? exuVar.qdl(this.ud, motionEvent, this.qdl, this) : qdl(this.ud, motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:21:0x004b  */
    public boolean qdl(com.bytedance.adsdk.ugeno.ud.lnr lnrVar, MotionEvent motionEvent) {
        float rawX;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.rq = motionEvent.getRawX();
            this.fs = motionEvent.getRawY();
        } else if (action == 1) {
            if (this.exu) {
                this.exu = false;
                this.rq = 0.0f;
                this.fs = 0.0f;
                Log.d("GesThrough_UGTapEvent", "Non-tap event");
                return false;
            }
            rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            if (Math.abs(rawX - this.rq) >= 15.0f && Math.abs(rawY - this.fs) < 15.0f) {
                Log.d("GesThrough_UGTapEvent", "Tap event, direct handling");
                com.bytedance.adsdk.ugeno.mml.rq rqVar = this.qdl;
                if (rqVar != null) {
                    rqVar.qdl(lnrVar, this.mo, this.lnr.ud());
                    this.rq = 0.0f;
                    this.fs = 0.0f;
                    return true;
                }
            } else {
                this.exu = false;
                Log.d("GesThrough_UGTapEvent", "Non-tap event");
                return false;
            }
        } else if (action == 2) {
            float rawX2 = motionEvent.getRawX();
            float rawY2 = motionEvent.getRawY();
            if (Math.abs(rawX2 - this.rq) >= 15.0f || Math.abs(rawY2 - this.fs) >= 15.0f) {
                this.exu = true;
            }
        } else if (action == 3) {
            this.exu = false;
            if (this.exu) {
                this.exu = false;
                this.rq = 0.0f;
                this.fs = 0.0f;
                Log.d("GesThrough_UGTapEvent", "Non-tap event");
                return false;
            }
            rawX = motionEvent.getRawX();
            float rawY3 = motionEvent.getRawY();
            if (Math.abs(rawX - this.rq) >= 15.0f) {
            }
            this.exu = false;
            Log.d("GesThrough_UGTapEvent", "Non-tap event");
            return false;
        }
        return true;
    }

    public void qdl(exu exuVar) {
        this.rdp = exuVar;
    }
}
