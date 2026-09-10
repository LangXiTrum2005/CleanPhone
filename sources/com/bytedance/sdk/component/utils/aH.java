package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class aH extends Handler {
    protected WeakReference<Lxb> Lxb;

    public interface Lxb {
        void Lxb(Message message);
    }

    public aH(Lxb lxb) {
        if (lxb != null) {
            this.Lxb = new WeakReference<>(lxb);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Lxb lxb;
        WeakReference<Lxb> weakReference = this.Lxb;
        if (weakReference == null || (lxb = weakReference.get()) == null || message == null) {
            return;
        }
        lxb.Lxb(message);
    }

    public aH(Looper looper, Lxb lxb) {
        super(looper);
        if (lxb != null) {
            this.Lxb = new WeakReference<>(lxb);
        }
    }
}
