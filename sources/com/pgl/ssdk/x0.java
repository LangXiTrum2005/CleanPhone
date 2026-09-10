package com.pgl.ssdk;

import android.os.HandlerThread;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class x0 extends a1 implements y0 {
    private final HandlerThread b;

    public x0(HandlerThread handlerThread, a1.a aVar) {
        super(handlerThread.getLooper(), aVar);
        this.b = handlerThread;
    }

    public void a(a1.a aVar) {
        this.f2422a = new WeakReference<>(aVar);
    }

    public void a(String str) {
        HandlerThread handlerThread = this.b;
        if (handlerThread != null) {
            handlerThread.setName(str);
        }
    }
}
