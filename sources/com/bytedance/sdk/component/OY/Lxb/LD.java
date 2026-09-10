package com.bytedance.sdk.component.OY.Lxb;

import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.aH;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class LD extends aH implements lk {
    private final HandlerThread LD;

    public LD(HandlerThread handlerThread, aH.Lxb lxb) {
        super(handlerThread.getLooper(), lxb);
        this.LD = handlerThread;
    }

    public void LD() {
        HandlerThread handlerThread = this.LD;
        if (handlerThread != null) {
            handlerThread.quit();
        }
    }

    @Override // com.bytedance.sdk.component.OY.Lxb.lk
    public void Lxb() {
        removeCallbacksAndMessages(null);
        WeakReference<aH.Lxb> weakReference = this.Lxb;
        if (weakReference != null) {
            weakReference.clear();
            this.Lxb = null;
        }
    }

    public void Lxb(aH.Lxb lxb) {
        this.Lxb = new WeakReference<>(lxb);
    }
}
