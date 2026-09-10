package A;

import com.inmobi.media.GestureDetectorOnGestureListenerC3005ec;
import com.inmobi.media.S0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ S0 f3130Y;
    public final /* synthetic */ GestureDetectorOnGestureListenerC3005ec Z;

    public /* synthetic */ C(S0 s0, GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec, int i2) {
        this.X = i2;
        this.f3130Y = s0;
        this.Z = gestureDetectorOnGestureListenerC3005ec;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                S0.c(this.f3130Y, this.Z);
                break;
            default:
                S0.b(this.f3130Y, this.Z);
                break;
        }
    }
}
