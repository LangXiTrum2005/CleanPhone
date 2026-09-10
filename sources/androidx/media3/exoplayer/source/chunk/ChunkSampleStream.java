package androidx.media3.exoplayer.source.chunk;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.source.SequenceableLoader;
import androidx.media3.exoplayer.source.chunk.ChunkSource;
import androidx.media3.exoplayer.upstream.Loader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class ChunkSampleStream<T extends ChunkSource> implements SampleStream, SequenceableLoader, Loader.Callback<Chunk>, Loader.ReleaseCallback {

    public final class EmbeddedSampleStream implements SampleStream {
        @Override // androidx.media3.exoplayer.source.SampleStream
        public final int e(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final boolean isReady() {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final void maybeThrowError() {
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final int skipData(long j) {
            throw null;
        }
    }

    public interface ReleaseCallback<T extends ChunkSource> {
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean a(LoadingInfo loadingInfo) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public final Loader.LoadErrorAction b(Loader.Loadable loadable, long j, long j2, IOException iOException, int i2) {
        ((Chunk) loadable).getClass();
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public final int e(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public final void g(Loader.Loadable loadable, long j, long j2) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long getBufferedPositionUs() {
        if (i()) {
            throw null;
        }
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long getNextLoadPositionUs() {
        if (i()) {
            throw null;
        }
        throw null;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public final void h(Loader.Loadable loadable, long j, long j2, boolean z2) {
        ((Chunk) loadable).getClass();
        throw null;
    }

    public final boolean i() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean isLoading() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public final boolean isReady() {
        if (i()) {
            return false;
        }
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public final void maybeThrowError() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.ReleaseCallback
    public final void onLoaderReleased() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final void reevaluateBuffer(long j) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public final int skipData(long j) {
        if (i()) {
            return 0;
        }
        throw null;
    }
}
