package com.google.android.exoplayer2.source;

import android.media.MediaParser;
import android.net.Uri;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.upstream.DataSource;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class MediaParserExtractorAdapter implements ProgressiveMediaExtractor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f18346a;

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public final void a() {
        if ("android.media.mediaparser.Mp3Parser".equals(this.f18346a)) {
            throw null;
        }
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public final long b() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public final int c(PositionHolder positionHolder) throws IOException {
        ((MediaParser) null).advance(null);
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public final void d(DataSource dataSource, Uri uri, Map map, long j, long j2, ExtractorOutput extractorOutput) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public final void release() {
        ((MediaParser) null).release();
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public final void seek(long j, long j2) {
        throw null;
    }
}
