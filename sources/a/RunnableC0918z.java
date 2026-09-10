package A;

import com.inmobi.media.P0;
import com.inmobi.media.S0;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: A.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC0918z implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ S0 f3203Y;
    public final /* synthetic */ WeakReference Z;

    public /* synthetic */ RunnableC0918z(S0 s0, WeakReference weakReference, int i2) {
        this.X = i2;
        this.f3203Y = s0;
        this.Z = weakReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                P0.a(this.f3203Y, this.Z);
                break;
            default:
                P0.b(this.f3203Y, this.Z);
                break;
        }
    }
}
