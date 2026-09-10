package com.bytedance.sdk.openadsdk.component.di;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes2.dex */
public class lr implements Handler.Callback {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private boolean f18090co;
    private ri ik;
    private final com.bytedance.sdk.openadsdk.component.mj.ri lr;
    private long qt;
    private long sf;
    private boolean xha;
    private Handler ri = new Handler(Looper.myLooper(), this);
    private int ka = 0;
    private int fi = 5;
    private int di = 0;
    private final int mj = 1000;
    private int jbs = 1000;

    public lr(com.bytedance.sdk.openadsdk.component.mj.ri riVar) {
        this.lr = riVar;
    }

    public void fi() {
        this.ri.removeCallbacksAndMessages(null);
        this.ri = null;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 100 && this.ri != null) {
            int i = message.arg1;
            ri(i);
            if (i > 0) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 100;
                messageObtain.arg1 = i - 1;
                this.ri.sendMessageDelayed(messageObtain, this.jbs);
            }
        }
        return true;
    }

    public void ik() {
        if (this.ri != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 100;
            messageObtain.arg1 = this.ka;
            this.ri.sendMessage(messageObtain);
        }
    }

    public void ka() {
        Handler handler = this.ri;
        if (handler != null) {
            handler.removeMessages(100);
        }
    }

    public void lr(int i) {
        this.di = Math.min(i, this.fi);
    }

    public void ri(int i) {
        this.ka = i;
        int i2 = this.fi - i;
        this.lr.lr(((long) i2) * 1000);
        boolean z = true;
        if (i <= 0) {
            ri riVar = this.ik;
            if (riVar != null && !this.xha) {
                riVar.lr();
                this.xha = true;
            }
            i = 0;
        }
        ri riVar2 = this.ik;
        if (riVar2 != null) {
            int iMax = Math.max(this.di - i2, 0);
            if (i != 0 && i2 < this.di) {
                z = false;
            }
            riVar2.ri(iMax, z);
        }
    }

    public void lr() {
        Handler handler = this.ri;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(100, this.fi, 0));
        }
    }

    public void ri(float f) {
        int i = (int) f;
        this.fi = i;
        if (i <= 0) {
            this.fi = 5;
        }
    }

    public void ri(ri riVar) {
        this.ik = riVar;
    }

    public int ri() {
        return this.di;
    }

    public void ri(int i, float f, boolean z) {
        com.bytedance.sdk.openadsdk.component.mj.ri riVar;
        if ((i == 1 || i == 2) && this.f18090co != z) {
            this.f18090co = z;
            if (i == 1 && (riVar = this.lr) != null) {
                riVar.ri(z);
            }
            if (z) {
                try {
                    this.jbs = (int) (1000.0f / f);
                    this.sf = System.currentTimeMillis();
                    return;
                } catch (Throwable unused) {
                }
            } else {
                long jCurrentTimeMillis = this.qt + (System.currentTimeMillis() - this.sf);
                this.qt = jCurrentTimeMillis;
                com.bytedance.sdk.openadsdk.component.mj.ri riVar2 = this.lr;
                if (riVar2 != null) {
                    riVar2.ri(jCurrentTimeMillis);
                }
            }
            this.jbs = 1000;
        }
    }
}
