package A;

import com.inmobi.media.GestureDetectorOnGestureListenerC3005ec;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class Y implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3005ec f3163Y;

    public /* synthetic */ Y(GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec, int i2) {
        this.X = i2;
        this.f3163Y = gestureDetectorOnGestureListenerC3005ec;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                GestureDetectorOnGestureListenerC3005ec.b(this.f3163Y);
                break;
            case 1:
                GestureDetectorOnGestureListenerC3005ec.c(this.f3163Y);
                break;
            default:
                GestureDetectorOnGestureListenerC3005ec.a(this.f3163Y);
                break;
        }
    }
}
