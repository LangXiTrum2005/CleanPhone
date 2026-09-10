package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class TypeEnhancementUtilsKt {
    public static final Object a(Set set, Enum r2, Enum r3, Enum r4, boolean z2) {
        Enum r1;
        if (!z2) {
            if (r4 != null) {
                set = CollectionsKt.l0(SetsKt.g(set, r4));
            }
            return CollectionsKt.X(set);
        }
        if (set.contains(r2)) {
            r1 = r2;
        } else {
            r1 = set.contains(r3) ? r3 : null;
        }
        if (Intrinsics.a(r1, r2) && Intrinsics.a(r4, r3)) {
            return null;
        }
        return r4 == null ? r1 : r4;
    }
}
