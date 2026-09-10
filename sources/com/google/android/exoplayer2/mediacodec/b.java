package com.google.android.exoplayer2.mediacodec;

import android.os.HandlerThread;
import com.google.common.base.Supplier;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Supplier {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ int f18194Y;

    public /* synthetic */ b(int i2, int i3) {
        this.X = i3;
        this.f18194Y = i2;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.X) {
            case 0:
                return new HandlerThread(AsynchronousMediaCodecAdapter.n(this.f18194Y, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(AsynchronousMediaCodecAdapter.n(this.f18194Y, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
