package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.SequenceableLoader;
import com.google.android.exoplayer2.source.chunk.ChunkSource;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class ChunkSampleStream<T extends ChunkSource> implements SampleStream, SequenceableLoader, Loader.Callback<Chunk>, Loader.ReleaseCallback {

    public final class EmbeddedSampleStream implements SampleStream {
        @Override // com.google.android.exoplayer2.source.SampleStream
        public final int g(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final boolean isReady() {
            throw null;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final void maybeThrowError() {
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final int skipData(long j) {
            throw null;
        }
    }

    public interface ReleaseCallback<T extends ChunkSource> {
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public final void a(Loader.Loadable loadable, long j, long j2, boolean z2) {
        ((Chunk) loadable).getClass();
        throw null;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public final void b(Loader.Loadable loadable, long j, long j2) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public final boolean continueLoading(long j) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public final Loader.LoadErrorAction f(Loader.Loadable loadable, long j, long j2, IOException iOException, int i2) {
        ((Chunk) loadable).getClass();
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public final int g(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public final long getBufferedPositionUs() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public final long getNextLoadPositionUs() {
        if (h()) {
            throw null;
        }
        throw null;
    }

    public final boolean h() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public final boolean isLoading() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public final boolean isReady() {
        if (h()) {
            return false;
        }
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public final void maybeThrowError() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.ReleaseCallback
    public final void onLoaderReleased() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public final void reevaluateBuffer(long j) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public final int skipData(long j) {
        if (h()) {
            return 0;
        }
        throw null;
    }
}
