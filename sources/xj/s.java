package xj;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class s extends r {
    public static void Y(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void Z(Comparator comparator, List list) {
        kotlin.jvm.internal.n.f(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
