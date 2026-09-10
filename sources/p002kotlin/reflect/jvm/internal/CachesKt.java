package p002kotlin.reflect.jvm.internal;

import com.google.android.gms.ads.RequestConfiguration;
import dehydration.attabal;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kurbash.arytenoidectomy;
import kurbash.beachfront;
import kurbash.competently;
import p002kotlin.Metadata;
import p002kotlin.Pair;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.KTypeProjection;
import patroclinal.formularize;

/* JADX INFO: compiled from: caches.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\b\u0010\t\u001a=\u0010\u0010\u001a\u00020\u000f\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a=\u0010\u0012\u001a\u00020\u000f\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011\"*\u0010\u0016\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0014*\u0004\u0018\u00010\u00000\u00000\u00040\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015\"\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015\"\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015\"\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015\"<\u0010\u001f\u001a*\u0012&\u0012$\u0012\u001a\u0012\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\r0\u001cj\u0002`\u001d\u0012\u0004\u0012\u00020\u000f0\u001b0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0015*0\b\u0002\u0010 \"\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\r0\u001c2\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\r0\u001c¨\u0006!"}, d2 = {"", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/lang/Class;", "jClass", "Lkotlin/reflect/jvm/internal/KClassImpl;", "dern", "(Ljava/lang/Class;)Lkotlin/reflect/jvm/internal/KClassImpl;", "Lkurbash/competently;", "wireman", "(Ljava/lang/Class;)Lkurbash/competently;", "", "Lkotlin/reflect/KTypeProjection;", "arguments", "", "isMarkedNullable", "Lkurbash/arytenoidectomy;", "attabal", "(Ljava/lang/Class;Ljava/util/List;Z)Lkurbash/arytenoidectomy;", "saneness", "Lkotlin/reflect/jvm/internal/attabal;", "kotlin.jvm.PlatformType", "Lkotlin/reflect/jvm/internal/attabal;", "K_CLASS_CACHE", "Lkotlin/reflect/jvm/internal/KPackageImpl;", "K_PACKAGE_CACHE", "CACHE_FOR_BASE_CLASSIFIERS", "CACHE_FOR_NULLABLE_BASE_CLASSIFIERS", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlin/Pair;", "Lkotlin/reflect/jvm/internal/Key;", "marial", "CACHE_FOR_GENERIC_CLASSIFIERS", "Key", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CachesKt {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final attabal<KClassImpl<? extends Object>> f29437attabal = saneness.attabal(new Function1<Class<?>, KClassImpl<? extends Object>>() { // from class: kotlin.reflect.jvm.internal.CachesKt$K_CLASS_CACHE$1
        @Override // p002kotlin.jvm.functions.Function1
        public final KClassImpl<? extends Object> invoke(Class<?> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new KClassImpl<>(it);
        }
    });

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final attabal<KPackageImpl> f29440saneness = saneness.attabal(new Function1<Class<?>, KPackageImpl>() { // from class: kotlin.reflect.jvm.internal.CachesKt$K_PACKAGE_CACHE$1
        @Override // p002kotlin.jvm.functions.Function1
        public final KPackageImpl invoke(Class<?> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new KPackageImpl(it);
        }
    });

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final attabal<arytenoidectomy> f29438dern = saneness.attabal(new Function1<Class<?>, arytenoidectomy>() { // from class: kotlin.reflect.jvm.internal.CachesKt$CACHE_FOR_BASE_CLASSIFIERS$1
        @Override // p002kotlin.jvm.functions.Function1
        public final arytenoidectomy invoke(Class<?> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return attabal.saneness(CachesKt.dern(it), adultoid.formularize(), false, adultoid.formularize());
        }
    });

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final attabal<arytenoidectomy> f29441wireman = saneness.attabal(new Function1<Class<?>, arytenoidectomy>() { // from class: kotlin.reflect.jvm.internal.CachesKt$CACHE_FOR_NULLABLE_BASE_CLASSIFIERS$1
        @Override // p002kotlin.jvm.functions.Function1
        public final arytenoidectomy invoke(Class<?> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return attabal.saneness(CachesKt.dern(it), adultoid.formularize(), true, adultoid.formularize());
        }
    });

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final attabal<ConcurrentHashMap<Pair<List<KTypeProjection>, Boolean>, arytenoidectomy>> f29439marial = saneness.attabal(new Function1<Class<?>, ConcurrentHashMap<Pair<? extends List<? extends KTypeProjection>, ? extends Boolean>, arytenoidectomy>>() { // from class: kotlin.reflect.jvm.internal.CachesKt$CACHE_FOR_GENERIC_CLASSIFIERS$1
        @Override // p002kotlin.jvm.functions.Function1
        public final ConcurrentHashMap<Pair<List<KTypeProjection>, Boolean>, arytenoidectomy> invoke(Class<?> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new ConcurrentHashMap<>();
        }
    });

    public static final <T> arytenoidectomy attabal(Class<T> jClass, List<KTypeProjection> arguments, boolean z) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        if (arguments.isEmpty()) {
            return z ? f29441wireman.attabal(jClass) : f29438dern.attabal(jClass);
        }
        return saneness(jClass, arguments, z);
    }

    public static final <T> KClassImpl<T> dern(Class<T> jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        beachfront beachfrontVarAttabal = f29437attabal.attabal(jClass);
        Intrinsics.competently(beachfrontVarAttabal, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>");
        return (KClassImpl) beachfrontVarAttabal;
    }

    public static final <T> arytenoidectomy saneness(Class<T> cls, List<KTypeProjection> list, boolean z) {
        ConcurrentHashMap<Pair<List<KTypeProjection>, Boolean>, arytenoidectomy> concurrentHashMapAttabal = f29439marial.attabal(cls);
        Pair<List<KTypeProjection>, Boolean> pairAttabal = formularize.attabal(list, Boolean.valueOf(z));
        arytenoidectomy arytenoidectomyVar = concurrentHashMapAttabal.get(pairAttabal);
        if (arytenoidectomyVar == null) {
            arytenoidectomy arytenoidectomyVarSaneness = attabal.saneness(dern(cls), list, z, adultoid.formularize());
            arytenoidectomy arytenoidectomyVarPutIfAbsent = concurrentHashMapAttabal.putIfAbsent(pairAttabal, arytenoidectomyVarSaneness);
            arytenoidectomyVar = arytenoidectomyVarPutIfAbsent == null ? arytenoidectomyVarSaneness : arytenoidectomyVarPutIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(arytenoidectomyVar, "getOrPut(...)");
        return arytenoidectomyVar;
    }

    public static final <T> competently wireman(Class<T> jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        return f29440saneness.attabal(jClass);
    }
}
