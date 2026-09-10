package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.datasource.DataSpec;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class LoadEventInfo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicLong f6371b = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f6372a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoadEventInfo(long j, DataSpec dataSpec) {
        this(Collections.EMPTY_MAP, j);
        Uri uri = dataSpec.f5736a;
    }

    public LoadEventInfo(Map map, long j) {
        this.f6372a = map;
    }
}
