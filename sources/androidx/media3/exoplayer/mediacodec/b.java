package androidx.media3.exoplayer.mediacodec;

import android.os.HandlerThread;
import com.google.common.base.Supplier;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Supplier {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ int f6320Y;

    public /* synthetic */ b(int i2, int i3) {
        this.X = i3;
        this.f6320Y = i2;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.X) {
            case 0:
                return new HandlerThread(AsynchronousMediaCodecAdapter.o(this.f6320Y, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(AsynchronousMediaCodecAdapter.o(this.f6320Y, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
