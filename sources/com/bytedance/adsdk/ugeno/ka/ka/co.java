package com.bytedance.adsdk.ugeno.ka.ka;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes2.dex */
public class co extends ik implements com.bytedance.adsdk.ugeno.xha.jbs.ri {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private Handler f18018co;
    private int sf;

    public co(Context context) {
        super(context);
        this.sf = 500;
        this.f18018co = new com.bytedance.adsdk.ugeno.xha.jbs(Looper.getMainLooper(), this);
    }

    @Override // com.bytedance.adsdk.ugeno.ka.ka.ik
    public boolean ri(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        MotionEvent motionEvent = (MotionEvent) objArr[0];
        this.sf = com.bytedance.adsdk.ugeno.xha.ik.ri(this.fi.get("delay"), 500);
        return ri(this.lr, motionEvent);
    }

    private boolean ri(com.bytedance.adsdk.ugeno.lr.ik ikVar, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f18018co.sendEmptyMessageDelayed(1101, this.sf);
            return false;
        }
        if (action != 1 && action != 3) {
            return false;
        }
        this.f18018co.removeMessages(1101);
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.xha.jbs.ri
    public void ri(Message message) {
        if (message.what != 1101) {
            return;
        }
        com.bytedance.adsdk.ugeno.ka.sf sfVar = this.ri;
        if (sfVar != null) {
            sfVar.ri(this.lr, this.di, this.ik.lr());
        }
        Handler handler = this.f18018co;
        if (handler != null) {
            handler.removeMessages(1101);
        }
    }
}
