package androidx.media3.exoplayer.source.chunk;

import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;

/* JADX INFO: loaded from: classes.dex */
public final class MediaParserChunkExtractor implements ChunkExtractor {

    public class TrackOutputProviderAdapter implements ExtractorOutput {
        @Override // androidx.media3.extractor.ExtractorOutput
        public final void e(SeekMap seekMap) {
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public final void endTracks() {
            throw null;
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public final TrackOutput track(int i2, int i3) {
            throw null;
        }
    }
}
