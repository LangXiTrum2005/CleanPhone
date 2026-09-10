package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class koa extends Handler {
    protected WeakReference<qdl> qdl;

    public interface qdl {
        void qdl(Message message);
    }

    public koa(qdl qdlVar) {
        if (qdlVar != null) {
            this.qdl = new WeakReference<>(qdlVar);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        qdl qdlVar;
        WeakReference<qdl> weakReference = this.qdl;
        if (weakReference == null || (qdlVar = weakReference.get()) == null || message == null) {
            return;
        }
        qdlVar.qdl(message);
    }

    public koa(Looper looper, qdl qdlVar) {
        super(looper);
        if (qdlVar != null) {
            this.qdl = new WeakReference<>(qdlVar);
        }
    }
}
