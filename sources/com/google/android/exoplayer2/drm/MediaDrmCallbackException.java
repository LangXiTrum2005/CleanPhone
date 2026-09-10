package com.google.android.exoplayer2.drm;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class MediaDrmCallbackException extends IOException {
    public final Map X;

    public MediaDrmCallbackException(DataSpec dataSpec, Uri uri, Map map, long j, Exception exc) {
        super(exc);
        this.X = map;
    }
}
