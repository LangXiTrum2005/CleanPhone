package y1;

import android.os.HandlerThread;
import com.google.android.gms.internal.ads.e22;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements na.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f54104b;

    public /* synthetic */ b(int i10, int i11) {
        this.f54103a = i11;
        this.f54104b = i10;
    }

    @Override // na.r
    public final Object get() {
        switch (this.f54103a) {
            case 0:
                return new HandlerThread(e22.E(this.f54104b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(e22.E(this.f54104b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
