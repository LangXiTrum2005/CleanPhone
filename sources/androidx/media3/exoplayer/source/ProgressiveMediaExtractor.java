package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.datasource.DataSource;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
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
