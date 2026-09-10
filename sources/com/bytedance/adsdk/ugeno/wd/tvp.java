package com.bytedance.adsdk.ugeno.wd;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class tvp extends Handler {
    private final WeakReference<qdl> qdl;

    public interface qdl {
        void qdl(Message message);
    }

    public tvp(Looper looper, qdl qdlVar) {
        super(looper);
        this.qdl = new WeakReference<>(qdlVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        qdl qdlVar = this.qdl.get();
        if (qdlVar == null || message == null) {
            return;
        }
        qdlVar.qdl(message);
    }
}
