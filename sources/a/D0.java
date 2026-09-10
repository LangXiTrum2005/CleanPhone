package A;

import com.inmobi.media.C3270v6;
import com.inmobi.media.GestureDetectorOnGestureListenerC3005ec;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class D0 implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3005ec f3133Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ C3270v6 e0;
    public final /* synthetic */ String f0;

    public /* synthetic */ D0(GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec, boolean z2, C3270v6 c3270v6, String str, int i2) {
        this.X = i2;
        this.f3133Y = gestureDetectorOnGestureListenerC3005ec;
        this.Z = z2;
        this.e0 = c3270v6;
        this.f0 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                C3270v6.b(this.f3133Y, this.Z, this.e0, this.f0);
                break;
            default:
                C3270v6.a(this.f3133Y, this.Z, this.e0, this.f0);
                break;
        }
    }
}
