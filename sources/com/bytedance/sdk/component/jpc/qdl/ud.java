package com.bytedance.sdk.component.jpc.qdl;

import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.koa;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class ud extends koa implements lnr {
    private final HandlerThread ud;

    public ud(HandlerThread handlerThread, koa.qdl qdlVar) {
        super(handlerThread.getLooper(), qdlVar);
        this.ud = handlerThread;
    }

    @Override // com.bytedance.sdk.component.jpc.qdl.lnr
    public void qdl() {
        removeCallbacksAndMessages(null);
        WeakReference<koa.qdl> weakReference = this.qdl;
        if (weakReference != null) {
            weakReference.clear();
            this.qdl = null;
        }
    }

    public void ud() {
        HandlerThread handlerThread = this.ud;
        if (handlerThread != null) {
            handlerThread.quit();
        }
    }

    public void qdl(koa.qdl qdlVar) {
        this.qdl = new WeakReference<>(qdlVar);
    }
}
