package kotlin.reflect.jvm.internal.impl.types;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.util.ArrayMap;
import kotlin.reflect.jvm.internal.impl.util.ArrayMapImpl;
import kotlin.reflect.jvm.internal.impl.util.AttributeArrayOwner;
import kotlin.reflect.jvm.internal.impl.util.EmptyArrayMap;
import kotlin.reflect.jvm.internal.impl.util.OneElementArrayMap;
import kotlin.reflect.jvm.internal.impl.util.TypeRegistry;

/* JADX INFO: loaded from: classes7.dex */
public final class TypeAttributes extends AttributeArrayOwner<TypeAttribute<?>, TypeAttribute<?>> implements Iterable<TypeAttribute<?>>, KMappedMarker {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final Companion f44529Y = new Companion();
    public static final TypeAttributes Z = new TypeAttributes(EmptyList.X);

    public static final class Companion extends TypeRegistry<TypeAttribute<?>, TypeAttribute<?>> {
        public static TypeAttributes c(List list) {
            return list.isEmpty() ? TypeAttributes.Z : new TypeAttributes(list);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.TypeRegistry
        public final int a(ConcurrentHashMap concurrentHashMap, String str, Function1 function1) {
            int iIntValue;
            Intrinsics.f(concurrentHashMap, "<this>");
            Integer num = (Integer) concurrentHashMap.get(str);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                try {
                    Integer num2 = (Integer) concurrentHashMap.get(str);
                    if (num2 == null) {
                        Object objInvoke = function1.invoke(str);
                        concurrentHashMap.putIfAbsent(str, Integer.valueOf(((Number) objInvoke).intValue()));
                        num2 = (Integer) objInvoke;
                    }
                    iIntValue = num2.intValue();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return iIntValue;
        }
    }

    public TypeAttributes(List list) {
        this.X = EmptyArrayMap.X;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TypeAttribute typeAttribute = (TypeAttribute) it.next();
            KClass tClass = typeAttribute.b();
            Intrinsics.f(tClass, "tClass");
            int iB = f44529Y.b(tClass);
            int iA = this.X.a();
            if (iA != 0) {
                if (iA == 1) {
                    ArrayMap arrayMap = this.X;
                    Intrinsics.d(arrayMap, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
                    OneElementArrayMap oneElementArrayMap = (OneElementArrayMap) arrayMap;
                    int i2 = oneElementArrayMap.f44618Y;
                    if (i2 == iB) {
                        this.X = new OneElementArrayMap(iB, typeAttribute);
                    } else {
                        ArrayMapImpl arrayMapImpl = new ArrayMapImpl();
                        arrayMapImpl.X = new Object[20];
                        arrayMapImpl.f44604Y = 0;
                        this.X = arrayMapImpl;
                        arrayMapImpl.c(i2, oneElementArrayMap.X);
                    }
                }
                this.X.c(iB, typeAttribute);
            } else {
                this.X = new OneElementArrayMap(iB, typeAttribute);
            }
        }
    }
}
