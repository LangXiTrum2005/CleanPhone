package A;

import android.app.Activity;
import android.view.KeyEvent;
import com.inmobi.media.C3153o0;
import com.inmobi.media.GestureDetectorOnGestureListenerC3005ec;
import com.inmobi.media.Jb;

/* JADX INFO: renamed from: A.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC0900k0 implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ C3153o0 f3181Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ boolean e0;
    public final /* synthetic */ Jb f0;
    public final /* synthetic */ KeyEvent.Callback g0;

    public /* synthetic */ RunnableC0900k0(C3153o0 c3153o0, KeyEvent.Callback callback, long j, boolean z2, Jb jb, int i2) {
        this.X = i2;
        this.f3181Y = c3153o0;
        this.g0 = callback;
        this.Z = j;
        this.e0 = z2;
        this.f0 = jb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                C3153o0.a(this.f3181Y, (GestureDetectorOnGestureListenerC3005ec) this.g0, this.Z, this.e0, this.f0);
                break;
            default:
                C3153o0.a(this.f3181Y, (Activity) this.g0, this.Z, this.e0, this.f0);
                break;
        }
    }
}
