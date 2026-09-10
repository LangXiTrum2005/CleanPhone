package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class igq extends Handler {
    protected WeakReference<ri> ri;

    public interface ri {
        void ri(Message message);
    }

    public igq(ri riVar) {
        if (riVar != null) {
            this.ri = new WeakReference<>(riVar);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        ri riVar;
        WeakReference<ri> weakReference = this.ri;
        if (weakReference == null || (riVar = weakReference.get()) == null || message == null) {
            return;
        }
        riVar.ri(message);
    }

    public igq(Looper looper, ri riVar) {
        super(looper);
        if (riVar != null) {
            this.ri = new WeakReference<>(riVar);
        }
    }
}
