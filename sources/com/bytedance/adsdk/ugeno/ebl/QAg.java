package com.bytedance.adsdk.ugeno.ebl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class QAg extends Handler {
    private final WeakReference<Lxb> Lxb;

    public interface Lxb {
        void Lxb(Message message);
    }

    public QAg(Looper looper, Lxb lxb) {
        super(looper);
        this.Lxb = new WeakReference<>(lxb);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Lxb lxb = this.Lxb.get();
        if (lxb == null || message == null) {
            return;
        }
        lxb.Lxb(message);
    }
}
