package androidx.media3.datasource.cache;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
final class SimpleCacheSpan extends CacheSpan {
    static {
        Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
        Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
        Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);
    }
}
