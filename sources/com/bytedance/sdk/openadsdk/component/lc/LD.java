package com.bytedance.sdk.openadsdk.component.lc;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class LD implements Handler.Callback {
    private final com.bytedance.sdk.openadsdk.component.OY.Lxb LD;
    private boolean ebl;
    private Lxb lk;
    private Handler Lxb = new Handler(Looper.myLooper(), this);
    private int ZU = 0;
    private int JXs = 5;
    private int lc = 0;

    public LD(com.bytedance.sdk.openadsdk.component.OY.Lxb lxb) {
        this.LD = lxb;
    }

    public void JXs() {
        this.Lxb.removeCallbacksAndMessages(null);
        this.Lxb = null;
    }

    public void LD(int i) {
        this.lc = i;
    }

    public void Lxb(int i) {
        this.ZU = i;
        int i2 = this.JXs - i;
        this.LD.Lxb(i2);
        if (i <= 0) {
            Lxb lxb = this.lk;
            if (lxb != null && !this.ebl) {
                lxb.LD();
                this.ebl = true;
            }
            i = 0;
        }
        boolean z = i2 >= this.lc;
        Lxb lxb2 = this.lk;
        if (lxb2 != null) {
            lxb2.Lxb(i, i2, z);
        }
    }

    public void ZU() {
        Handler handler = this.Lxb;
        if (handler != null) {
            handler.removeMessages(100);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        if (message.what == 100 && this.Lxb != null) {
            int i = message.arg1;
            Lxb(i);
            if (i > 0) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 100;
                messageObtain.arg1 = i - 1;
                this.Lxb.sendMessageDelayed(messageObtain, 1000L);
            }
        }
        return true;
    }

    public void lk() {
        if (this.Lxb != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 100;
            messageObtain.arg1 = this.ZU;
            this.Lxb.sendMessage(messageObtain);
        }
    }

    public void LD() {
        Handler handler = this.Lxb;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(100, this.JXs, 0));
        }
    }

    public void Lxb(float f) {
        int i = (int) f;
        this.JXs = i;
        if (i <= 0) {
            this.JXs = 5;
        }
    }

    public void Lxb(Lxb lxb) {
        this.lk = lxb;
    }

    public int Lxb() {
        return this.lc;
    }
}
