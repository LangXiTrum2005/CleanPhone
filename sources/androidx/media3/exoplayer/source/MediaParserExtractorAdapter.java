package androidx.media3.exoplayer.source;

import android.media.MediaParser;
import android.net.Uri;
import androidx.media3.datasource.DataSource;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class MediaParserExtractorAdapter implements ProgressiveMediaExtractor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f6382a;

    public static final class Factory implements ProgressiveMediaExtractor.Factory {
        static {
            new HashMap();
        }
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public final void a() {
        if ("android.media.mediaparser.Mp3Parser".equals(this.f6382a)) {
            throw null;
        }
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public final long b() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public final int c(PositionHolder positionHolder) throws IOException {
        ((MediaParser) null).advance(null);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public final void d(DataSource dataSource, Uri uri, Map map, long j, long j2, ExtractorOutput extractorOutput) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public final void release() {
        ((MediaParser) null).release();
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public final void seek(long j, long j2) {
        throw null;
    }
}
