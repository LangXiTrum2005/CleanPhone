package com.bytedance.sdk.openadsdk.component.mo;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes3.dex */
public class ud implements Handler.Callback {
    private boolean fs;
    private qdl lnr;
    private long rq;
    private long to;
    private final com.bytedance.sdk.openadsdk.component.jpc.qdl ud;
    private boolean wd;
    private Handler qdl = new Handler(Looper.myLooper(), this);
    private int mml = 0;
    private int mzz = 5;
    private int mo = 0;
    private final int jpc = 1000;
    private int tvp = 1000;

    public ud(com.bytedance.sdk.openadsdk.component.jpc.qdl qdlVar) {
        this.ud = qdlVar;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 100 && this.qdl != null) {
            int i2 = message.arg1;
            qdl(i2);
            if (i2 > 0) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 100;
                messageObtain.arg1 = i2 - 1;
                this.qdl.sendMessageDelayed(messageObtain, this.tvp);
            }
        }
        return true;
    }

    public void lnr() {
        if (this.qdl != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 100;
            messageObtain.arg1 = this.mml;
            this.qdl.sendMessage(messageObtain);
        }
    }

    public void mml() {
        Handler handler = this.qdl;
        if (handler != null) {
            handler.removeMessages(100);
        }
    }

    public void mzz() {
        this.qdl.removeCallbacksAndMessages(null);
        this.qdl = null;
    }

    public void qdl(int i2) {
        this.mml = i2;
        int i3 = this.mzz - i2;
        this.ud.ud(i3);
        boolean z2 = true;
        if (i2 <= 0) {
            qdl qdlVar = this.lnr;
            if (qdlVar != null && !this.wd) {
                qdlVar.ud();
                this.wd = true;
            }
            i2 = 0;
        }
        qdl qdlVar2 = this.lnr;
        if (qdlVar2 != null) {
            int i4 = this.mo;
            int i5 = i4 - i3;
            if (i2 != 0 && i3 < i4) {
                z2 = false;
            }
            qdlVar2.qdl(i5, z2);
        }
    }

    public void ud(int i2) {
        this.mo = Math.min(i2, this.mzz);
    }

    public void ud() {
        Handler handler = this.qdl;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(100, this.mzz, 0));
        }
    }

    public void qdl(float f) {
        int i2 = (int) f;
        this.mzz = i2;
        if (i2 <= 0) {
            this.mzz = 5;
        }
    }

    public void qdl(qdl qdlVar) {
        this.lnr = qdlVar;
    }

    public int qdl() {
        return this.mo;
    }

    public void qdl(int i2, float f, boolean z2) {
        com.bytedance.sdk.openadsdk.component.jpc.qdl qdlVar;
        if ((i2 == 1 || i2 == 2) && this.fs != z2) {
            this.fs = z2;
            if (i2 == 1 && (qdlVar = this.ud) != null) {
                qdlVar.qdl(z2);
            }
            if (z2) {
                try {
                    this.tvp = (int) (1000.0f / f);
                    this.rq = System.currentTimeMillis();
                    return;
                } catch (Throwable unused) {
                }
            } else {
                long jCurrentTimeMillis = (System.currentTimeMillis() - this.rq) + this.to;
                this.to = jCurrentTimeMillis;
                com.bytedance.sdk.openadsdk.component.jpc.qdl qdlVar2 = this.ud;
                if (qdlVar2 != null) {
                    qdlVar2.qdl(jCurrentTimeMillis);
                }
            }
            this.tvp = 1000;
        }
    }
}
