package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/internal/ClassValueCtorCache;", "Lkotlinx/coroutines/internal/CtorCache;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ClassValueCtorCache extends CtorCache {
    static {
        new ClassValue<Function1<? super Throwable, ? extends Throwable>>() { // from class: kotlinx.coroutines.internal.ClassValueCtorCache$cache$1
            @Override // java.lang.ClassValue
            public final Function1<? super Throwable, ? extends Throwable> computeValue(Class cls) {
                Intrinsics.d(cls, "null cannot be cast to non-null type java.lang.Class<out kotlin.Throwable>");
                return ExceptionsConstructorKt.a(cls);
            }
        };
    }
}
