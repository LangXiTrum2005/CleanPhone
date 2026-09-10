package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.upstream.DataSource;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface ProgressiveMediaExtractor {

    public interface Factory {
    }

    void a();

    long b();

    int c(PositionHolder positionHolder);

    void d(DataSource dataSource, Uri uri, Map map, long j, long j2, ExtractorOutput extractorOutput);

    void release();

    void seek(long j, long j2);
}
