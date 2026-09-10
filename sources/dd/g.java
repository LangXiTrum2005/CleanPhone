package dd;

import cc.a2;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static g f38813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f38814b;

    static {
        f fVar = new f();
        fVar.put(461L, "FIREPERF_AUTOPUSH");
        fVar.put(462L, "FIREPERF");
        fVar.put(675L, "FIREPERF_INTERNAL_LOW");
        fVar.put(676L, "FIREPERF_INTERNAL_HIGH");
        f38814b = Collections.unmodifiableMap(fVar);
    }

    @Override // cc.a2
    public final String r() {
        return "com.google.firebase.perf.LogSourceName";
    }
}
