package androidx.media3.exoplayer.drm;

import android.net.Uri;
import androidx.media3.datasource.DataSpec;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class MediaDrmCallbackException extends IOException {
    public final Map X;

    public MediaDrmCallbackException(DataSpec dataSpec, Uri uri, Map map, long j, Exception exc) {
        super(exc);
        this.X = map;
    }
}
