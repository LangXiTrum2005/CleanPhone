package com.bytedance.sdk.component.mj.ri;

import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.igq;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class lr extends igq implements ik {
    private final HandlerThread lr;

    public lr(HandlerThread handlerThread, igq.ri riVar) {
        super(handlerThread.getLooper(), riVar);
        this.lr = handlerThread;
    }

    public void lr() {
        HandlerThread handlerThread = this.lr;
        if (handlerThread != null) {
            handlerThread.quit();
        }
    }

    @Override // com.bytedance.sdk.component.mj.ri.ik
    public void ri() {
        removeCallbacksAndMessages(null);
        WeakReference<igq.ri> weakReference = this.ri;
        if (weakReference != null) {
            weakReference.clear();
            this.ri = null;
        }
    }

    public void ri(igq.ri riVar) {
        this.ri = new WeakReference<>(riVar);
    }
}
