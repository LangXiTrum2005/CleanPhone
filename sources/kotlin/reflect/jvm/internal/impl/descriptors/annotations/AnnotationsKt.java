package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class AnnotationsKt {
    public static final Annotations a(Annotations first, Annotations second) {
        Intrinsics.f(first, "first");
        Intrinsics.f(second, "second");
        if (first.isEmpty()) {
            return second;
        }
        return second.isEmpty() ? first : new CompositeAnnotations(first, second);
    }
}
