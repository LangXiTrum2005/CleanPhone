package p1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f47926b = new b(new HashMap());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f47927a;

    public b(HashMap map) {
        this.f47927a = Collections.unmodifiableMap(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f47927a.equals(((b) obj).f47927a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f47927a.hashCode();
    }
}
