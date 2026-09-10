package kotlin.reflect.jvm.internal.impl.resolve.deprecation;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class DeprecationInfo implements Comparable<DeprecationInfo> {
    @Override // java.lang.Comparable
    public final int compareTo(DeprecationInfo deprecationInfo) {
        DeprecationInfo other = deprecationInfo;
        Intrinsics.f(other, "other");
        DeprecationLevelValue deprecationLevelValue = DeprecationLevelValue.X;
        return deprecationLevelValue.compareTo(deprecationLevelValue);
    }
}
