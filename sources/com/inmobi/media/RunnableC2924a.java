package com.inmobi.media;

import android.os.Debug;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC2924a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2941b f23420a;

    public RunnableC2924a(C2941b c2941b) {
        this.f23420a = c2941b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f23420a.d.get()) {
            if (this.f23420a.f.hasMessages(2023)) {
                this.f23420a.f.removeMessages(2023);
                this.f23420a.getClass();
                if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger() && this.f23420a.f23455e.get()) {
                    StackTraceElement[] stackTraceElementArrA = C2941b.a(this.f23420a);
                    H3 h3 = this.f23420a.f22836a;
                    Intrinsics.c(stackTraceElementArrA);
                    h3.a(new mf(stackTraceElementArrA));
                }
            }
            this.f23420a.f23455e.getAndSet(true);
            this.f23420a.f.sendEmptyMessage(2023);
        }
    }
}
