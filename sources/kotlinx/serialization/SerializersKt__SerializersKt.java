package kotlinx.serialization;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Triple;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.PlatformKt;
import kotlinx.serialization.internal.Platform_commonKt;
import kotlinx.serialization.internal.PrimitivesKt;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001H\u0086\b\u001a\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\u0086\b\u001a\u0016\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u0006\u001a6\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0010\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007\u001a\u0018\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u001a\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006\u001a:\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001*\u00020\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0010\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007\u001a\u001c\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006\u001a+\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0002\b\u0010\u001aG\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0001*\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002¢\u0006\u0002\b\u0013\u001a2\u0010\u0014\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001\u0018\u00010\n*\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u000f\u001a\u00020\fH\u0000\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00020\bH\u0007\u001a$\u0010\r\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00020\bH\u0007\u001aB\u0010\u0016\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00040\b2\u0014\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00010\n2\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019H\u0000\u001a7\u0010\u001b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00040\b2\u0014\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00010\nH\u0002¢\u0006\u0002\b\u001c\u001aG\u0010\u001d\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00040\b2\u0014\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00010\n2\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019H\u0002¢\u0006\u0002\b\u001e\u001a1\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010 \u001a\u00020\fH\u0002¢\u0006\u0002\b!\u001a\u0014\u0010\"\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010#\u001a\u00020$H\u0001\u001a \u0010\"\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010%\u001a\u00020\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0001\u001a7\u0010\"\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010%\u001a\u00020\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0010\u0010&\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010'H\u0001¢\u0006\u0002\u0010(\u001a \u0010)\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010%\u001a\u00020\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0001\u001a7\u0010)\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010%\u001a\u00020\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0010\u0010&\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010'H\u0001¢\u0006\u0002\u0010(¨\u0006*"}, d2 = {"serializer", "Lkotlinx/serialization/KSerializer;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/serialization/modules/SerializersModule;", "", "type", "Lkotlin/reflect/KType;", "kClass", "Lkotlin/reflect/KClass;", "typeArgumentsSerializers", "", "isNullable", "", "serializerOrNull", "serializerByKTypeImpl", "failOnMissingTypeArgSerializer", "serializerByKTypeImpl$SerializersKt__SerializersKt", "serializerByKClassImpl", "rootClass", "serializerByKClassImpl$SerializersKt__SerializersKt", "serializersForParameters", "typeArguments", "parametrizedSerializerOrNull", "serializers", "elementClassifierIfArray", "Lkotlin/Function0;", "Lkotlin/reflect/KClassifier;", "compiledParametrizedSerializer", "compiledParametrizedSerializer$SerializersKt__SerializersKt", "builtinParametrizedSerializer", "builtinParametrizedSerializer$SerializersKt__SerializersKt", "nullable", "shouldBeNullable", "nullable$SerializersKt__SerializersKt", "noCompiledSerializer", "forClass", "", "module", "argSerializers", "", "(Lkotlinx/serialization/modules/SerializersModule;Lkotlin/reflect/KClass;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "moduleThenPolymorphic", "kotlinx-serialization-core"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "kotlinx/serialization/SerializersKt")
final /* synthetic */ class SerializersKt__SerializersKt {
    private static final KSerializer<? extends Object> builtinParametrizedSerializer$SerializersKt__SerializersKt(KClass<Object> kClass, List<? extends KSerializer<Object>> list, Function0<? extends KClassifier> function0) {
        ReflectionFactory reflectionFactory = Reflection.f43333a;
        if (Intrinsics.a(kClass, reflectionFactory.b(Collection.class)) || Intrinsics.a(kClass, reflectionFactory.b(List.class)) || Intrinsics.a(kClass, reflectionFactory.b(List.class)) || Intrinsics.a(kClass, reflectionFactory.b(ArrayList.class))) {
            return new ArrayListSerializer(list.get(0));
        }
        if (Intrinsics.a(kClass, reflectionFactory.b(HashSet.class))) {
            return new HashSetSerializer(list.get(0));
        }
        if (Intrinsics.a(kClass, reflectionFactory.b(Set.class)) || Intrinsics.a(kClass, reflectionFactory.b(Set.class)) || Intrinsics.a(kClass, reflectionFactory.b(LinkedHashSet.class))) {
            return new LinkedHashSetSerializer(list.get(0));
        }
        if (Intrinsics.a(kClass, reflectionFactory.b(HashMap.class))) {
            return new HashMapSerializer(list.get(0), list.get(1));
        }
        if (Intrinsics.a(kClass, reflectionFactory.b(Map.class)) || Intrinsics.a(kClass, reflectionFactory.b(Map.class)) || Intrinsics.a(kClass, reflectionFactory.b(LinkedHashMap.class))) {
            return new LinkedHashMapSerializer(list.get(0), list.get(1));
        }
        if (Intrinsics.a(kClass, reflectionFactory.b(Map.Entry.class))) {
            return BuiltinSerializersKt.MapEntrySerializer(list.get(0), list.get(1));
        }
        if (Intrinsics.a(kClass, reflectionFactory.b(Pair.class))) {
            return BuiltinSerializersKt.PairSerializer(list.get(0), list.get(1));
        }
        if (Intrinsics.a(kClass, reflectionFactory.b(Triple.class))) {
            return BuiltinSerializersKt.TripleSerializer(list.get(0), list.get(1), list.get(2));
        }
        if (!PlatformKt.isReferenceArray(kClass)) {
            return null;
        }
        Object objInvoke = function0.invoke();
        Intrinsics.d(objInvoke, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        return BuiltinSerializersKt.ArraySerializer((KClass) objInvoke, list.get(0));
    }

    private static final KSerializer<? extends Object> compiledParametrizedSerializer$SerializersKt__SerializersKt(KClass<Object> kClass, List<? extends KSerializer<Object>> list) {
        KSerializer[] kSerializerArr = (KSerializer[]) list.toArray(new KSerializer[0]);
        return PlatformKt.constructSerializerForGivenTypeArgs(kClass, (KSerializer<Object>[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
    }

    public static final KSerializer<?> moduleThenPolymorphic(SerializersModule module, KClass<?> kClass) {
        Intrinsics.f(module, "module");
        Intrinsics.f(kClass, "kClass");
        KSerializer<?> contextual$default = SerializersModule.getContextual$default(module, kClass, null, 2, null);
        return contextual$default == null ? new PolymorphicSerializer(kClass) : contextual$default;
    }

    public static final KSerializer<?> noCompiledSerializer(String forClass) {
        Intrinsics.f(forClass, "forClass");
        throw new SerializationException(Platform_commonKt.notRegisteredMessage(forClass));
    }

    private static final <T> KSerializer<T> nullable$SerializersKt__SerializersKt(KSerializer<T> kSerializer, boolean z2) {
        if (z2) {
            return BuiltinSerializersKt.getNullable(kSerializer);
        }
        Intrinsics.d(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.SerializersKt__SerializersKt.nullable?>");
        return kSerializer;
    }

    public static final KSerializer<? extends Object> parametrizedSerializerOrNull(KClass<Object> kClass, List<? extends KSerializer<Object>> serializers, Function0<? extends KClassifier> elementClassifierIfArray) {
        Intrinsics.f(kClass, "<this>");
        Intrinsics.f(serializers, "serializers");
        Intrinsics.f(elementClassifierIfArray, "elementClassifierIfArray");
        KSerializer<? extends Object> kSerializerBuiltinParametrizedSerializer$SerializersKt__SerializersKt = builtinParametrizedSerializer$SerializersKt__SerializersKt(kClass, serializers, elementClassifierIfArray);
        return kSerializerBuiltinParametrizedSerializer$SerializersKt__SerializersKt == null ? compiledParametrizedSerializer$SerializersKt__SerializersKt(kClass, serializers) : kSerializerBuiltinParametrizedSerializer$SerializersKt__SerializersKt;
    }

    public static final KSerializer<Object> serializer(KType type) {
        Intrinsics.f(type, "type");
        return SerializersKt.serializer(SerializersModuleBuildersKt.EmptySerializersModule(), type);
    }

    private static final KSerializer<Object> serializerByKClassImpl$SerializersKt__SerializersKt(SerializersModule serializersModule, KClass<Object> kClass, List<? extends KSerializer<Object>> list, boolean z2) {
        KSerializer<? extends Object> contextual;
        if (list.isEmpty()) {
            contextual = SerializersKt.serializerOrNull(kClass);
            if (contextual == null) {
                contextual = SerializersModule.getContextual$default(serializersModule, kClass, null, 2, null);
            }
        } else {
            try {
                KSerializer<? extends Object> kSerializerParametrizedSerializerOrNull = SerializersKt.parametrizedSerializerOrNull(kClass, list, new f());
                contextual = kSerializerParametrizedSerializerOrNull == null ? serializersModule.getContextual(kClass, list) : kSerializerParametrizedSerializerOrNull;
            } catch (IndexOutOfBoundsException e2) {
                throw new SerializationException("Unable to retrieve a serializer, the number of passed type serializers differs from the actual number of generic parameters", e2);
            }
        }
        if (contextual != null) {
            return nullable$SerializersKt__SerializersKt(contextual, z2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KClassifier serializerByKClassImpl$lambda$1$SerializersKt__SerializersKt() {
        throw new SerializationException("It is not possible to retrieve an array serializer using KClass alone, use KType instead or ArraySerializer factory");
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:33:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:0x00aa  */
    private static final KSerializer<Object> serializerByKTypeImpl$SerializersKt__SerializersKt(SerializersModule serializersModule, KType kType, boolean z2) {
        KSerializer<Object> kSerializerFindCachedSerializer;
        KSerializer<? extends Object> contextual;
        PolymorphicSerializer polymorphicSerializer;
        KClass<Object> kclass = Platform_commonKt.kclass(kType);
        boolean zIsMarkedNullable = kType.isMarkedNullable();
        List arguments = kType.getArguments();
        ArrayList arrayList = new ArrayList(CollectionsKt.n(arguments, 10));
        Iterator it = arguments.iterator();
        while (it.hasNext()) {
            arrayList.add(Platform_commonKt.typeOrThrow((KTypeProjection) it.next()));
        }
        if (arrayList.isEmpty()) {
            if (!PlatformKt.isInterface(kclass) || SerializersModule.getContextual$default(serializersModule, kclass, null, 2, null) == null) {
                kSerializerFindCachedSerializer = SerializersCacheKt.findCachedSerializer(kclass, zIsMarkedNullable);
            } else {
                kSerializerFindCachedSerializer = null;
            }
        } else if (serializersModule.getHasInterfaceContextualSerializers$kotlinx_serialization_core()) {
            kSerializerFindCachedSerializer = null;
        } else {
            Object objFindParametrizedCachedSerializer = SerializersCacheKt.findParametrizedCachedSerializer(kclass, arrayList, zIsMarkedNullable);
            if (objFindParametrizedCachedSerializer instanceof Result.Failure) {
                objFindParametrizedCachedSerializer = null;
            }
            kSerializerFindCachedSerializer = (KSerializer) objFindParametrizedCachedSerializer;
        }
        if (kSerializerFindCachedSerializer != null) {
            return kSerializerFindCachedSerializer;
        }
        if (arrayList.isEmpty()) {
            contextual = SerializersKt.serializerOrNull(kclass);
            if (contextual == null && (contextual = SerializersModule.getContextual$default(serializersModule, kclass, null, 2, null)) == null) {
                if (PlatformKt.isInterface(kclass)) {
                    polymorphicSerializer = new PolymorphicSerializer(kclass);
                    contextual = polymorphicSerializer;
                } else {
                    contextual = null;
                }
            }
            if (contextual != null) {
                return nullable$SerializersKt__SerializersKt(contextual, zIsMarkedNullable);
            }
        } else {
            List<KSerializer<Object>> listSerializersForParameters = SerializersKt.serializersForParameters(serializersModule, arrayList, z2);
            if (listSerializersForParameters != null) {
                KSerializer<? extends Object> kSerializerParametrizedSerializerOrNull = SerializersKt.parametrizedSerializerOrNull(kclass, listSerializersForParameters, new g(arrayList, 0));
                if (kSerializerParametrizedSerializerOrNull == null) {
                    contextual = serializersModule.getContextual(kclass, listSerializersForParameters);
                    if (contextual == null) {
                        if (PlatformKt.isInterface(kclass)) {
                            polymorphicSerializer = new PolymorphicSerializer(kclass);
                            contextual = polymorphicSerializer;
                        } else {
                            contextual = null;
                        }
                    }
                } else {
                    contextual = kSerializerParametrizedSerializerOrNull;
                }
                if (contextual != null) {
                    return nullable$SerializersKt__SerializersKt(contextual, zIsMarkedNullable);
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KClassifier serializerByKTypeImpl$lambda$0$SerializersKt__SerializersKt(List list) {
        return ((KType) list.get(0)).getClassifier();
    }

    public static final KSerializer<Object> serializerOrNull(KType type) {
        Intrinsics.f(type, "type");
        return SerializersKt.serializerOrNull(SerializersModuleBuildersKt.EmptySerializersModule(), type);
    }

    public static final List<KSerializer<Object>> serializersForParameters(SerializersModule serializersModule, List<? extends KType> typeArguments, boolean z2) {
        Intrinsics.f(serializersModule, "<this>");
        Intrinsics.f(typeArguments, "typeArguments");
        if (z2) {
            List<? extends KType> list = typeArguments;
            ArrayList arrayList = new ArrayList(CollectionsKt.n(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(SerializersKt.serializer(serializersModule, (KType) it.next()));
            }
            return arrayList;
        }
        List<? extends KType> list2 = typeArguments;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.n(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            KSerializer<Object> kSerializerSerializerOrNull = SerializersKt.serializerOrNull(serializersModule, (KType) it2.next());
            if (kSerializerSerializerOrNull == null) {
                return null;
            }
            arrayList2.add(kSerializerSerializerOrNull);
        }
        return arrayList2;
    }

    public static final KSerializer<?> moduleThenPolymorphic(SerializersModule module, KClass<?> kClass, KSerializer<?>[] argSerializers) {
        Intrinsics.f(module, "module");
        Intrinsics.f(kClass, "kClass");
        Intrinsics.f(argSerializers, "argSerializers");
        KSerializer<?> contextual = module.getContextual(kClass, ArraysKt.e(argSerializers));
        return contextual == null ? new PolymorphicSerializer(kClass) : contextual;
    }

    public static final KSerializer<?> noCompiledSerializer(SerializersModule module, KClass<?> kClass) {
        Intrinsics.f(module, "module");
        Intrinsics.f(kClass, "kClass");
        KSerializer<?> contextual$default = SerializersModule.getContextual$default(module, kClass, null, 2, null);
        if (contextual$default != null) {
            return contextual$default;
        }
        Platform_commonKt.serializerNotRegistered(kClass);
        throw new KotlinNothingValueException();
    }

    @ExperimentalSerializationApi
    public static final KSerializer<Object> serializer(KClass<?> kClass, List<? extends KSerializer<?>> typeArgumentsSerializers, boolean z2) {
        Intrinsics.f(kClass, "kClass");
        Intrinsics.f(typeArgumentsSerializers, "typeArgumentsSerializers");
        return SerializersKt.serializer(SerializersModuleBuildersKt.EmptySerializersModule(), kClass, typeArgumentsSerializers, z2);
    }

    public static final KSerializer<Object> serializerOrNull(SerializersModule serializersModule, KType type) {
        Intrinsics.f(serializersModule, "<this>");
        Intrinsics.f(type, "type");
        return serializerByKTypeImpl$SerializersKt__SerializersKt(serializersModule, type, false);
    }

    public static final KSerializer<Object> serializer(SerializersModule serializersModule, KType type) {
        Intrinsics.f(serializersModule, "<this>");
        Intrinsics.f(type, "type");
        KSerializer<Object> kSerializerSerializerByKTypeImpl$SerializersKt__SerializersKt = serializerByKTypeImpl$SerializersKt__SerializersKt(serializersModule, type, true);
        if (kSerializerSerializerByKTypeImpl$SerializersKt__SerializersKt != null) {
            return kSerializerSerializerByKTypeImpl$SerializersKt__SerializersKt;
        }
        PlatformKt.platformSpecificSerializerNotRegistered(Platform_commonKt.kclass(type));
        throw new KotlinNothingValueException();
    }

    @InternalSerializationApi
    public static final <T> KSerializer<T> serializerOrNull(KClass<T> kClass) {
        Intrinsics.f(kClass, "<this>");
        KSerializer<T> kSerializerCompiledSerializerImpl = PlatformKt.compiledSerializerImpl(kClass);
        return kSerializerCompiledSerializerImpl == null ? PrimitivesKt.builtinSerializerOrNull(kClass) : kSerializerCompiledSerializerImpl;
    }

    public static final KSerializer<?> noCompiledSerializer(SerializersModule module, KClass<?> kClass, KSerializer<?>[] argSerializers) {
        Intrinsics.f(module, "module");
        Intrinsics.f(kClass, "kClass");
        Intrinsics.f(argSerializers, "argSerializers");
        KSerializer<?> contextual = module.getContextual(kClass, ArraysKt.e(argSerializers));
        if (contextual != null) {
            return contextual;
        }
        Platform_commonKt.serializerNotRegistered(kClass);
        throw new KotlinNothingValueException();
    }

    @ExperimentalSerializationApi
    public static final KSerializer<Object> serializer(SerializersModule serializersModule, KClass<?> kClass, List<? extends KSerializer<?>> typeArgumentsSerializers, boolean z2) {
        Intrinsics.f(serializersModule, "<this>");
        Intrinsics.f(kClass, "kClass");
        Intrinsics.f(typeArgumentsSerializers, "typeArgumentsSerializers");
        KSerializer<Object> kSerializerSerializerByKClassImpl$SerializersKt__SerializersKt = serializerByKClassImpl$SerializersKt__SerializersKt(serializersModule, kClass, typeArgumentsSerializers, z2);
        if (kSerializerSerializerByKClassImpl$SerializersKt__SerializersKt != null) {
            return kSerializerSerializerByKClassImpl$SerializersKt__SerializersKt;
        }
        PlatformKt.platformSpecificSerializerNotRegistered(kClass);
        throw new KotlinNothingValueException();
    }

    public static final <T> KSerializer<T> serializer() {
        Intrinsics.l();
        throw null;
    }

    public static final <T> KSerializer<T> serializer(SerializersModule serializersModule) {
        Intrinsics.f(serializersModule, "<this>");
        Intrinsics.l();
        throw null;
    }

    @InternalSerializationApi
    public static final <T> KSerializer<T> serializer(KClass<T> kClass) {
        Intrinsics.f(kClass, "<this>");
        KSerializer<T> kSerializerSerializerOrNull = SerializersKt.serializerOrNull(kClass);
        if (kSerializerSerializerOrNull != null) {
            return kSerializerSerializerOrNull;
        }
        Platform_commonKt.serializerNotRegistered(kClass);
        throw new KotlinNothingValueException();
    }
}
