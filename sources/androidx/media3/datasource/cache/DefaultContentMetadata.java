package androidx.media3.datasource.cache;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultContentMetadata implements ContentMetadata {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f5792b;

    static {
        new DefaultContentMetadata(Collections.EMPTY_MAP);
    }

    public DefaultContentMetadata(Map map) {
        this.f5792b = Collections.unmodifiableMap(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DefaultContentMetadata.class != obj.getClass()) {
            return false;
        }
        Map map = ((DefaultContentMetadata) obj).f5792b;
        Map map2 = this.f5792b;
        if (map2.size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : map2.entrySet()) {
            if (!Arrays.equals((byte[]) entry.getValue(), (byte[]) map.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (this.f5791a == 0) {
            int iHashCode = 0;
            for (Map.Entry entry : this.f5792b.entrySet()) {
                iHashCode += Arrays.hashCode((byte[]) entry.getValue()) ^ ((String) entry.getKey()).hashCode();
            }
            this.f5791a = iHashCode;
        }
        return this.f5791a;
    }
}
