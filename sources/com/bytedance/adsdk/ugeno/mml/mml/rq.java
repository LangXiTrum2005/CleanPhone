package com.bytedance.adsdk.ugeno.mml.mml;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public class rq extends lnr implements com.bytedance.adsdk.ugeno.wd.tvp.qdl {
    private Handler exu;
    private boolean fs;
    private int rq;

    public rq(Context context) {
        super(context);
        this.rq = 500;
        this.exu = new com.bytedance.adsdk.ugeno.wd.tvp(Looper.getMainLooper(), this);
    }

    @Override // com.bytedance.adsdk.ugeno.mml.mml.lnr
    public boolean qdl(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        MotionEvent motionEvent = (MotionEvent) objArr[0];
        this.rq = com.bytedance.adsdk.ugeno.wd.lnr.qdl(this.mzz.get("delay"), 500);
        return qdl(this.ud, motionEvent);
    }

    private boolean qdl(com.bytedance.adsdk.ugeno.ud.lnr lnrVar, MotionEvent motionEvent) {
        com.bytedance.adsdk.ugeno.mml.rq rqVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.exu.sendEmptyMessageDelayed(1102, this.rq);
        } else {
            if (action == 1) {
                if (this.fs && (rqVar = this.qdl) != null) {
                    rqVar.qdl(this.ud, this.mo, this.lnr.ud());
                    this.fs = false;
                    Handler handler = this.exu;
                    if (handler != null) {
                        handler.removeMessages(1102);
                    }
                    return true;
                }
                Handler handler2 = this.exu;
                if (handler2 != null) {
                    handler2.removeMessages(1102);
                }
                this.fs = false;
                return false;
            }
            if (action == 3) {
                Handler handler3 = this.exu;
                if (handler3 != null) {
                    handler3.removeMessages(1102);
                }
                this.fs = false;
            }
        }
        return true;
    }

    @Override // com.bytedance.adsdk.ugeno.wd.tvp.qdl
    public void qdl(Message message) {
        if (message.what != 1102) {
            return;
        }
        this.fs = true;
        Handler handler = this.exu;
        if (handler != null) {
            handler.removeMessages(1102);
        }
    }
}
