package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements MediaCodec.OnFrameRenderedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediaCodecAdapter.OnFrameRenderedListener f18192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MediaCodecAdapter f18193c;

    public /* synthetic */ a(MediaCodecAdapter mediaCodecAdapter, MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, int i2) {
        this.f18191a = i2;
        this.f18193c = mediaCodecAdapter;
        this.f18192b = onFrameRenderedListener;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        switch (this.f18191a) {
            case 0:
                ((AsynchronousMediaCodecAdapter) this.f18193c).getClass();
                this.f18192b.a(j);
                break;
            default:
                ((SynchronousMediaCodecAdapter) this.f18193c).getClass();
                this.f18192b.a(j);
                break;
        }
    }
}
