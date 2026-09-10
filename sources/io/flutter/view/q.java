package io.flutter.view;

import android.view.Choreographer;
import io.flutter.embedding.engine.FlutterJNI;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class q implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f43515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bo.l f43516b;

    public q(bo.l lVar, long j10) {
        this.f43516b = lVar;
        this.f43515a = j10;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        long jNanoTime = System.nanoTime() - j10;
        long j11 = jNanoTime < 0 ? 0L : jNanoTime;
        bo.l lVar = this.f43516b;
        ((FlutterJNI) lVar.f5819b).onVsync(j11, lVar.f5818a, this.f43515a);
        lVar.f5820c = this;
    }
}
