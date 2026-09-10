package kotlin.comparisons;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"kotlin/comparisons/ComparisonsKt__ComparisonsKt", "kotlin/comparisons/ComparisonsKt___ComparisonsJvmKt", "kotlin/comparisons/ComparisonsKt___ComparisonsKt"}, k = 4, mv = {2, 1, 0}, xi = 49)
public final class ComparisonsKt extends ComparisonsKt___ComparisonsKt {
    public static int a(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static int b(int i2, int... iArr) {
        for (int i3 : iArr) {
            i2 = Math.max(i2, i3);
        }
        return i2;
    }
}
