package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements MediaCodec.OnFrameRenderedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediaCodecAdapter.OnFrameRenderedListener f6318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MediaCodecAdapter f6319c;

    public /* synthetic */ a(MediaCodecAdapter mediaCodecAdapter, MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, int i2) {
        this.f6317a = i2;
        this.f6319c = mediaCodecAdapter;
        this.f6318b = onFrameRenderedListener;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        switch (this.f6317a) {
            case 0:
                ((AsynchronousMediaCodecAdapter) this.f6319c).getClass();
                this.f6318b.a(j);
                break;
            default:
                ((SynchronousMediaCodecAdapter) this.f6319c).getClass();
                this.f6318b.a(j);
                break;
        }
    }
}
