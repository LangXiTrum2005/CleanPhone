package kotlin.jvm.internal;

import androidx.media3.extractor.text.ttml.a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.serialization.internal.CollectionDescriptorsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/jvm/internal/ClassReference;", "Lkotlin/reflect/KClass;", "", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ClassReference implements KClass<Object>, ClassBasedDeclarationContainer {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final Map f43327Y;
    public static final HashMap Z;
    public static final LinkedHashMap e0;
    public final Class X;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R,\u0010\u0006\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R0\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR0\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR0\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR(\u0010\u0010\u001a\u0016\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\t0\t\u0012\u0004\u0012\u00020\t0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007¨\u0006\u0011"}, d2 = {"Lkotlin/jvm/internal/ClassReference$Companion;", "", "", "Ljava/lang/Class;", "Lkotlin/Function;", "", "FUNCTION_CLASSES", "Ljava/util/Map;", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "primitiveFqNames", "Ljava/util/HashMap;", "primitiveWrapperFqNames", "classFqNames", "kotlin.jvm.PlatformType", "simpleNames", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        List listI = CollectionsKt.I(Function0.class, Function1.class, Function2.class, Function3.class, Function4.class, Function5.class, Function6.class, Function7.class, Function8.class, Function9.class, Function10.class, Function11.class, Function12.class, Function13.class, Function14.class, Function15.class, Function16.class, Function17.class, Function18.class, Function19.class, Function20.class, Function21.class, Function22.class);
        ArrayList arrayList = new ArrayList(CollectionsKt.n(listI, 10));
        int i2 = 0;
        for (Object obj : listI) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.f0();
                throw null;
            }
            arrayList.add(new Pair((Class) obj, Integer.valueOf(i2)));
            i2 = i3;
        }
        f43327Y = MapsKt.p(arrayList);
        HashMap mapT = a.t("boolean", "kotlin.Boolean", "char", "kotlin.Char");
        mapT.put("byte", "kotlin.Byte");
        mapT.put("short", "kotlin.Short");
        mapT.put("int", "kotlin.Int");
        mapT.put("float", "kotlin.Float");
        mapT.put("long", "kotlin.Long");
        mapT.put("double", "kotlin.Double");
        HashMap map = new HashMap();
        map.put("java.lang.Boolean", "kotlin.Boolean");
        map.put("java.lang.Character", "kotlin.Char");
        map.put("java.lang.Byte", "kotlin.Byte");
        map.put("java.lang.Short", "kotlin.Short");
        map.put("java.lang.Integer", "kotlin.Int");
        map.put("java.lang.Float", "kotlin.Float");
        map.put("java.lang.Long", "kotlin.Long");
        map.put("java.lang.Double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Object", "kotlin.Any");
        map2.put("java.lang.String", "kotlin.String");
        map2.put("java.lang.CharSequence", "kotlin.CharSequence");
        map2.put("java.lang.Throwable", "kotlin.Throwable");
        map2.put("java.lang.Cloneable", "kotlin.Cloneable");
        map2.put("java.lang.Number", "kotlin.Number");
        map2.put("java.lang.Comparable", "kotlin.Comparable");
        map2.put("java.lang.Enum", "kotlin.Enum");
        map2.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map2.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map2.put("java.util.Iterator", "kotlin.collections.Iterator");
        map2.put("java.util.Collection", "kotlin.collections.Collection");
        map2.put("java.util.List", "kotlin.collections.List");
        map2.put("java.util.Set", "kotlin.collections.Set");
        map2.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map2.put("java.util.Map", "kotlin.collections.Map");
        map2.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map2.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map2.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map2.putAll(mapT);
        map2.putAll(map);
        Collection<String> collectionValues = mapT.values();
        Intrinsics.e(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            Intrinsics.c(str);
            sb.append(StringsKt.Q('.', str, str));
            sb.append("CompanionObject");
            map2.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f43327Y.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map2.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        Z = map2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.h(map2.size()));
        for (Map.Entry entry2 : map2.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            Intrinsics.c(str2);
            linkedHashMap.put(key, StringsKt.Q('.', str2, str2));
        }
        e0 = linkedHashMap;
    }

    public ClassReference(Class jClass) {
        Intrinsics.f(jClass, "jClass");
        this.X = jClass;
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Class getF43390Y() {
        return this.X;
    }

    @Override // kotlin.reflect.KClass
    public final List d() {
        throw new KotlinReflectionNotSupportedError();
    }

    @Override // kotlin.reflect.KClass
    public final boolean e(Object obj) {
        Class jClass = this.X;
        Intrinsics.f(jClass, "jClass");
        Map map = f43327Y;
        Intrinsics.d(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(jClass);
        if (num != null) {
            return TypeIntrinsics.e(num.intValue(), obj);
        }
        if (jClass.isPrimitive()) {
            jClass = JvmClassMappingKt.c(JvmClassMappingKt.e(jClass));
        }
        return jClass.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ClassReference) && JvmClassMappingKt.c(this).equals(JvmClassMappingKt.c((KClass) obj));
    }

    @Override // kotlin.reflect.KClass
    public final int hashCode() {
        return JvmClassMappingKt.c(this).hashCode();
    }

    @Override // kotlin.reflect.KClass
    public final String k() {
        String str;
        Class jClass = this.X;
        Intrinsics.f(jClass, "jClass");
        String strConcat = null;
        if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
            return null;
        }
        boolean zIsArray = jClass.isArray();
        HashMap map = Z;
        if (!zIsArray) {
            String str2 = (String) map.get(jClass.getName());
            return str2 == null ? jClass.getCanonicalName() : str2;
        }
        Class<?> componentType = jClass.getComponentType();
        if (componentType.isPrimitive() && (str = (String) map.get(componentType.getName())) != null) {
            strConcat = str.concat("Array");
        }
        return strConcat == null ? CollectionDescriptorsKt.ARRAY_NAME : strConcat;
    }

    @Override // kotlin.reflect.KClass
    public final String l() {
        String str;
        Class jClass = this.X;
        Intrinsics.f(jClass, "jClass");
        String strConcat = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (!jClass.isLocalClass()) {
            boolean zIsArray = jClass.isArray();
            LinkedHashMap linkedHashMap = e0;
            if (!zIsArray) {
                String str2 = (String) linkedHashMap.get(jClass.getName());
                return str2 == null ? jClass.getSimpleName() : str2;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                strConcat = str.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = jClass.getSimpleName();
        Method enclosingMethod = jClass.getEnclosingMethod();
        if (enclosingMethod != null) {
            return StringsKt.P(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return StringsKt.O('$', simpleName, simpleName);
        }
        return StringsKt.P(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    public final String toString() {
        return this.X + " (Kotlin reflection is not available)";
    }
}
