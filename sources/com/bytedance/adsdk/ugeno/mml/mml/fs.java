package com.bytedance.adsdk.ugeno.mml.mml;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public class fs extends lnr implements com.bytedance.adsdk.ugeno.wd.tvp.qdl {
    private Handler fs;
    private int rq;

    public fs(Context context) {
        super(context);
        this.rq = 500;
        this.fs = new com.bytedance.adsdk.ugeno.wd.tvp(Looper.getMainLooper(), this);
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
        int action = motionEvent.getAction();
        if (action == 0) {
            this.fs.sendEmptyMessageDelayed(1101, this.rq);
            return false;
        }
        if (action != 1 && action != 3) {
            return false;
        }
        this.fs.removeMessages(1101);
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.wd.tvp.qdl
    public void qdl(Message message) {
        if (message.what != 1101) {
            return;
        }
        com.bytedance.adsdk.ugeno.mml.rq rqVar = this.qdl;
        if (rqVar != null) {
            rqVar.qdl(this.ud, this.mo, this.lnr.ud());
        }
        Handler handler = this.fs;
        if (handler != null) {
            handler.removeMessages(1101);
        }
    }
}
