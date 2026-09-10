package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;

/* JADX INFO: loaded from: classes3.dex */
public final class MediaParserChunkExtractor implements ChunkExtractor {

    public class TrackOutputProviderAdapter implements ExtractorOutput {
        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        public final void endTracks() {
            throw null;
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        public final void g(SeekMap seekMap) {
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        public final TrackOutput track(int i2, int i3) {
            throw null;
        }
    }
}
