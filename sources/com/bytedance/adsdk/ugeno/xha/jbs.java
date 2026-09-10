package com.bytedance.adsdk.ugeno.xha;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class jbs extends Handler {
    private final WeakReference<ri> ri;

    public interface ri {
        void ri(Message message);
    }

    public jbs(Looper looper, ri riVar) {
        super(looper);
        this.ri = new WeakReference<>(riVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        ri riVar = this.ri.get();
        if (riVar == null || message == null) {
            return;
        }
        riVar.ri(message);
    }
}
