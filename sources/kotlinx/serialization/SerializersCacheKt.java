package kotlinx.serialization;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.CachingKt;
import kotlinx.serialization.internal.ParametrizedSerializerCache;
import kotlinx.serialization.internal.PlatformKt;
import kotlinx.serialization.internal.SerializerCache;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\u001aA\u0010\u0014\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u000f0\u00152\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0012\u001a\u00020\u0013H\u0000¢\u0006\u0002\u0010\u0019\u001a\u001b\u0010\u001a\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u001b*\u0006\u0012\u0002\b\u00030\u0011H\u0080\b\"$\u0010\u0000\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0004\"\u001e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\n8\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0004\"\u001e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n8\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0004¨\u0006\u001c"}, d2 = {"SERIALIZERS_CACHE", "Lkotlinx/serialization/internal/SerializerCache;", "", "getSERIALIZERS_CACHE$annotations", "()V", "getSERIALIZERS_CACHE", "()Lkotlinx/serialization/internal/SerializerCache;", "SERIALIZERS_CACHE_NULLABLE", "getSERIALIZERS_CACHE_NULLABLE$annotations", "PARAMETRIZED_SERIALIZERS_CACHE", "Lkotlinx/serialization/internal/ParametrizedSerializerCache;", "getPARAMETRIZED_SERIALIZERS_CACHE$annotations", "PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE", "getPARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$annotations", "findCachedSerializer", "Lkotlinx/serialization/KSerializer;", "clazz", "Lkotlin/reflect/KClass;", "isNullable", "", "findParametrizedCachedSerializer", "Lkotlin/Result;", "types", "", "Lkotlin/reflect/KType;", "(Lkotlin/reflect/KClass;Ljava/util/List;Z)Ljava/lang/Object;", "polymorphicIfInterface", "Lkotlinx/serialization/PolymorphicSerializer;", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SerializersCacheKt {
    private static final ParametrizedSerializerCache<? extends Object> PARAMETRIZED_SERIALIZERS_CACHE;
    private static final ParametrizedSerializerCache<Object> PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE;
    private static final SerializerCache<? extends Object> SERIALIZERS_CACHE;
    private static final SerializerCache<Object> SERIALIZERS_CACHE_NULLABLE;

    static {
        final int i2 = 0;
        SERIALIZERS_CACHE = CachingKt.createCache(new Function1() { // from class: kotlinx.serialization.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                KClass kClass = (KClass) obj;
                switch (i2) {
                    case 0:
                        return SerializersCacheKt.SERIALIZERS_CACHE$lambda$0(kClass);
                    default:
                        return SerializersCacheKt.SERIALIZERS_CACHE_NULLABLE$lambda$1(kClass);
                }
            }
        });
        final int i3 = 1;
        SERIALIZERS_CACHE_NULLABLE = CachingKt.createCache(new Function1() { // from class: kotlinx.serialization.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                KClass kClass = (KClass) obj;
                switch (i3) {
                    case 0:
                        return SerializersCacheKt.SERIALIZERS_CACHE$lambda$0(kClass);
                    default:
                        return SerializersCacheKt.SERIALIZERS_CACHE_NULLABLE$lambda$1(kClass);
                }
            }
        });
        final int i4 = 0;
        PARAMETRIZED_SERIALIZERS_CACHE = CachingKt.createParametrizedCache(new Function2() { // from class: kotlinx.serialization.d
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                KClass kClass = (KClass) obj;
                List list = (List) obj2;
                switch (i4) {
                    case 0:
                        return SerializersCacheKt.PARAMETRIZED_SERIALIZERS_CACHE$lambda$3(kClass, list);
                    default:
                        return SerializersCacheKt.PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5(kClass, list);
                }
            }
        });
        final int i5 = 1;
        PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE = CachingKt.createParametrizedCache(new Function2() { // from class: kotlinx.serialization.d
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                KClass kClass = (KClass) obj;
                List list = (List) obj2;
                switch (i5) {
                    case 0:
                        return SerializersCacheKt.PARAMETRIZED_SERIALIZERS_CACHE$lambda$3(kClass, list);
                    default:
                        return SerializersCacheKt.PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5(kClass, list);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer PARAMETRIZED_SERIALIZERS_CACHE$lambda$3(KClass clazz, List types) {
        Intrinsics.f(clazz, "clazz");
        Intrinsics.f(types, "types");
        List<KSerializer<Object>> listSerializersForParameters = SerializersKt.serializersForParameters(SerializersModuleBuildersKt.EmptySerializersModule(), types, true);
        Intrinsics.c(listSerializersForParameters);
        return SerializersKt.parametrizedSerializerOrNull(clazz, listSerializersForParameters, new e(types, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KClassifier PARAMETRIZED_SERIALIZERS_CACHE$lambda$3$lambda$2(List list) {
        return ((KType) list.get(0)).getX();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5(KClass clazz, List types) {
        KSerializer nullable;
        Intrinsics.f(clazz, "clazz");
        Intrinsics.f(types, "types");
        List<KSerializer<Object>> listSerializersForParameters = SerializersKt.serializersForParameters(SerializersModuleBuildersKt.EmptySerializersModule(), types, true);
        Intrinsics.c(listSerializersForParameters);
        KSerializer<? extends Object> kSerializerParametrizedSerializerOrNull = SerializersKt.parametrizedSerializerOrNull(clazz, listSerializersForParameters, new e(types, 1));
        if (kSerializerParametrizedSerializerOrNull == null || (nullable = BuiltinSerializersKt.getNullable(kSerializerParametrizedSerializerOrNull)) == null) {
            return null;
        }
        return nullable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KClassifier PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5$lambda$4(List list) {
        return ((KType) list.get(0)).getX();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer SERIALIZERS_CACHE$lambda$0(KClass it) {
        Intrinsics.f(it, "it");
        KSerializer kSerializerSerializerOrNull = SerializersKt.serializerOrNull(it);
        if (kSerializerSerializerOrNull != null) {
            return kSerializerSerializerOrNull;
        }
        if (PlatformKt.isInterface(it)) {
            return new PolymorphicSerializer(it);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer SERIALIZERS_CACHE_NULLABLE$lambda$1(KClass it) {
        KSerializer nullable;
        Intrinsics.f(it, "it");
        KSerializer kSerializerSerializerOrNull = SerializersKt.serializerOrNull(it);
        if (kSerializerSerializerOrNull == null) {
            kSerializerSerializerOrNull = PlatformKt.isInterface(it) ? new PolymorphicSerializer(it) : null;
        }
        if (kSerializerSerializerOrNull == null || (nullable = BuiltinSerializersKt.getNullable(kSerializerSerializerOrNull)) == null) {
            return null;
        }
        return nullable;
    }

    public static final KSerializer<Object> findCachedSerializer(KClass<Object> clazz, boolean z2) {
        Intrinsics.f(clazz, "clazz");
        if (z2) {
            return SERIALIZERS_CACHE_NULLABLE.get(clazz);
        }
        KSerializer<? extends Object> kSerializer = SERIALIZERS_CACHE.get(clazz);
        if (kSerializer != null) {
            return kSerializer;
        }
        return null;
    }

    public static final Object findParametrizedCachedSerializer(KClass<Object> clazz, List<? extends KType> types, boolean z2) {
        Intrinsics.f(clazz, "clazz");
        Intrinsics.f(types, "types");
        return !z2 ? PARAMETRIZED_SERIALIZERS_CACHE.mo3341getgIAlus(clazz, types) : PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE.mo3341getgIAlus(clazz, types);
    }

    private static /* synthetic */ void getPARAMETRIZED_SERIALIZERS_CACHE$annotations() {
    }

    private static /* synthetic */ void getPARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$annotations() {
    }

    public static final SerializerCache<? extends Object> getSERIALIZERS_CACHE() {
        return SERIALIZERS_CACHE;
    }

    public static /* synthetic */ void getSERIALIZERS_CACHE$annotations() {
    }

    private static /* synthetic */ void getSERIALIZERS_CACHE_NULLABLE$annotations() {
    }

    public static final PolymorphicSerializer<? extends Object> polymorphicIfInterface(KClass<?> kClass) {
        Intrinsics.f(kClass, "<this>");
        if (PlatformKt.isInterface(kClass)) {
            return new PolymorphicSerializer<>(kClass);
        }
        return null;
    }
}
