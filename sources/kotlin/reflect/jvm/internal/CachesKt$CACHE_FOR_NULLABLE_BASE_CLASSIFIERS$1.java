package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KType;
import kotlin.reflect.full.KClassifiers;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/reflect/KType;", "it", "Ljava/lang/Class;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class CachesKt$CACHE_FOR_NULLABLE_BASE_CLASSIFIERS$1 extends Lambda implements Function1<Class<?>, KType> {
    public static final CachesKt$CACHE_FOR_NULLABLE_BASE_CLASSIFIERS$1 X = new CachesKt$CACHE_FOR_NULLABLE_BASE_CLASSIFIERS$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Class it = (Class) obj;
        Intrinsics.f(it, "it");
        KClassImpl kClassImplA = CachesKt.a(it);
        EmptyList emptyList = EmptyList.X;
        return KClassifiers.a(kClassImplA, emptyList, true, emptyList);
    }
}
