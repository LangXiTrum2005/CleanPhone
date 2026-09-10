package androidx.media3.exoplayer.source;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;

/* JADX INFO: loaded from: classes.dex */
public final class EmptySampleStream implements SampleStream {
    @Override // androidx.media3.exoplayer.source.SampleStream
    public final int e(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
        decoderInputBuffer.X = 4;
        return -4;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public final boolean isReady() {
        return true;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public final void maybeThrowError() {
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public final int skipData(long j) {
        return 0;
    }
}
