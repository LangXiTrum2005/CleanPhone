package exaltedly;

import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue;

/* JADX INFO: compiled from: DeprecationInfo.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class attabal implements Comparable<attabal> {
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
    public int compareTo(attabal other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iCompareTo = dern().compareTo(other.dern());
        if (iCompareTo == 0 && !wireman() && other.wireman()) {
            return 1;
        }
        return iCompareTo;
    }

    public abstract DeprecationLevelValue dern();

    public abstract boolean wireman();
}
