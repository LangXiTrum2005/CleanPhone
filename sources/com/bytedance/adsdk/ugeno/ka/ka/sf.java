package com.bytedance.adsdk.ugeno.ka.ka;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes2.dex */
public class sf extends ik implements com.bytedance.adsdk.ugeno.xha.jbs.ri {
    private Handler aw;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private boolean f18023co;
    private int sf;

    public sf(Context context) {
        super(context);
        this.sf = 500;
        this.aw = new com.bytedance.adsdk.ugeno.xha.jbs(Looper.getMainLooper(), this);
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
        com.bytedance.adsdk.ugeno.ka.sf sfVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.aw.sendEmptyMessageDelayed(1102, this.sf);
        } else {
            if (action == 1) {
                if (this.f18023co && (sfVar = this.ri) != null) {
                    sfVar.ri(this.lr, this.di, this.ik.lr());
                    this.f18023co = false;
                    Handler handler = this.aw;
                    if (handler != null) {
                        handler.removeMessages(1102);
                    }
                    return true;
                }
                Handler handler2 = this.aw;
                if (handler2 != null) {
                    handler2.removeMessages(1102);
                }
                this.f18023co = false;
                return false;
            }
            if (action == 3) {
                Handler handler3 = this.aw;
                if (handler3 != null) {
                    handler3.removeMessages(1102);
                }
                this.f18023co = false;
            }
        }
        return true;
    }

    @Override // com.bytedance.adsdk.ugeno.xha.jbs.ri
    public void ri(Message message) {
        if (message.what != 1102) {
            return;
        }
        this.f18023co = true;
        Handler handler = this.aw;
        if (handler != null) {
            handler.removeMessages(1102);
        }
    }
}
