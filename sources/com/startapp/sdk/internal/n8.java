package com.startapp.sdk.internal;

import android.os.HandlerThread;

/* JADX INFO: loaded from: classes6.dex */
public final class n8 extends HandlerThread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f41267a;

    public n8(String str) {
        super(str);
        this.f41267a = new Object();
    }

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        synchronized (this.f41267a) {
            this.f41267a.notifyAll();
        }
    }

    @Override // java.lang.Thread
    public final void start() {
        synchronized (this.f41267a) {
            try {
                super.start();
                try {
                    this.f41267a.wait();
                } catch (InterruptedException e2) {
                    throw new RuntimeException(e2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
