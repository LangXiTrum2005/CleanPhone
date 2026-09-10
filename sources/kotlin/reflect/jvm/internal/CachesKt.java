package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002*0\b\u0002\u0010\u0004\"\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/Pair;", "", "Lkotlin/reflect/KTypeProjection;", "", "Key", "kotlin-reflection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CachesKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CacheByClass f43364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final CacheByClass f43365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final CacheByClass f43366c;
    public static final CacheByClass d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final CacheByClass f43367e;

    static {
        CachesKt$K_CLASS_CACHE$1 cachesKt$K_CLASS_CACHE$1 = CachesKt$K_CLASS_CACHE$1.X;
        int i2 = CacheByClassKt.f43363a;
        f43364a = new ConcurrentHashMapCache(cachesKt$K_CLASS_CACHE$1);
        f43365b = new ConcurrentHashMapCache(CachesKt$K_PACKAGE_CACHE$1.X);
        f43366c = new ConcurrentHashMapCache(CachesKt$CACHE_FOR_BASE_CLASSIFIERS$1.X);
        d = new ConcurrentHashMapCache(CachesKt$CACHE_FOR_NULLABLE_BASE_CLASSIFIERS$1.X);
        f43367e = new ConcurrentHashMapCache(CachesKt$CACHE_FOR_GENERIC_CLASSIFIERS$1.X);
    }

    public static final KClassImpl a(Class jClass) {
        Intrinsics.f(jClass, "jClass");
        Object objA = f43364a.a(jClass);
        Intrinsics.d(objA, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>");
        return (KClassImpl) objA;
    }
}
