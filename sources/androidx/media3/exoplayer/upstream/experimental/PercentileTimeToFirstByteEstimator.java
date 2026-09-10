package androidx.media3.exoplayer.upstream.experimental;

import androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class PercentileTimeToFirstByteEstimator implements TimeToFirstByteEstimator {

    public static class FixedSizeLinkedHashMap<K, V> extends LinkedHashMap<K, V> {
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry entry) {
            return size() > 0;
        }
    }
}
