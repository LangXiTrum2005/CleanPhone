package A;

import com.inmobi.media.C3101kc;
import com.inmobi.media.C3117lc;
import com.inmobi.media.Cc;
import com.inmobi.media.GestureDetectorOnGestureListenerC3005ec;
import com.inmobi.media.tf;

/* JADX INFO: renamed from: A.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC0884c0 implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ tf f3169Y;
    public final /* synthetic */ Cc Z;
    public final /* synthetic */ C3117lc e0;
    public final /* synthetic */ GestureDetectorOnGestureListenerC3005ec f0;

    public /* synthetic */ RunnableC0884c0(tf tfVar, Cc cc, C3117lc c3117lc, GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec, int i2) {
        this.X = i2;
        this.f3169Y = tfVar;
        this.Z = cc;
        this.e0 = c3117lc;
        this.f0 = gestureDetectorOnGestureListenerC3005ec;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                C3101kc.a(this.f3169Y, this.Z, this.e0, this.f0);
                break;
            default:
                C3101kc.b(this.f3169Y, this.Z, this.e0, this.f0);
                break;
        }
    }
}
