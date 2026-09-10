package p002kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class competently {
    public static final marial attabal(marial first, marial second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        if (first.isEmpty()) {
            return second;
        }
        return second.isEmpty() ? first : new CompositeAnnotations(first, second);
    }
}
