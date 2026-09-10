package com.pgl.ssdk;

import android.os.HandlerThread;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
public class a1 extends a4 implements a2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HandlerThread f33384b;

    public a1(HandlerThread handlerThread, a4.a aVar) {
        super(handlerThread.getLooper(), aVar);
        this.f33384b = handlerThread;
    }

    public void a(a4.a aVar) {
        this.f33387a = new WeakReference<>(aVar);
    }

    public void a(String str) {
        HandlerThread handlerThread = this.f33384b;
        if (handlerThread != null) {
            handlerThread.setName(str);
        }
    }
}
