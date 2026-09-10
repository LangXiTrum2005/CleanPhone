package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import androidx.datastore.preferences.protobuf.a;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class ReflectClassUtilKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f43693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f43694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f43695c;
    public static final Map d;

    static {
        int i2 = 0;
        ReflectionFactory reflectionFactory = Reflection.f43333a;
        List listI = CollectionsKt.I(reflectionFactory.b(Boolean.TYPE), reflectionFactory.b(Byte.TYPE), reflectionFactory.b(Character.TYPE), reflectionFactory.b(Double.TYPE), reflectionFactory.b(Float.TYPE), reflectionFactory.b(Integer.TYPE), reflectionFactory.b(Long.TYPE), reflectionFactory.b(Short.TYPE));
        f43693a = listI;
        List<KClass> list = listI;
        ArrayList arrayList = new ArrayList(CollectionsKt.n(list, 10));
        for (KClass kClass : list) {
            arrayList.add(new Pair(JvmClassMappingKt.c(kClass), JvmClassMappingKt.d(kClass)));
        }
        f43694b = MapsKt.p(arrayList);
        List<KClass> list2 = f43693a;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.n(list2, 10));
        for (KClass kClass2 : list2) {
            arrayList2.add(new Pair(JvmClassMappingKt.d(kClass2), JvmClassMappingKt.c(kClass2)));
        }
        f43695c = MapsKt.p(arrayList2);
        List listI2 = CollectionsKt.I(Function0.class, Function1.class, Function2.class, Function3.class, Function4.class, Function5.class, Function6.class, Function7.class, Function8.class, Function9.class, Function10.class, Function11.class, Function12.class, Function13.class, Function14.class, Function15.class, Function16.class, Function17.class, Function18.class, Function19.class, Function20.class, Function21.class, Function22.class);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.n(listI2, 10));
        for (Object obj : listI2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.f0();
                throw null;
            }
            arrayList3.add(new Pair((Class) obj, Integer.valueOf(i2)));
            i2 = i3;
        }
        d = MapsKt.p(arrayList3);
    }

    public static final ClassId a(Class cls) {
        ClassId classIdA;
        Intrinsics.f(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException(a.j(cls, "Can't compute ClassId for primitive type: "));
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException(a.j(cls, "Can't compute ClassId for array type: "));
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null && cls.getSimpleName().length() != 0) {
            Class<?> declaringClass = cls.getDeclaringClass();
            return (declaringClass == null || (classIdA = a(declaringClass)) == null) ? ClassId.j(new FqName(cls.getName())) : classIdA.d(Name.g(cls.getSimpleName()));
        }
        FqName fqName = new FqName(cls.getName());
        return new ClassId(fqName.e(), FqName.j(fqName.f()), true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String b(Class cls) {
        Intrinsics.f(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                return StringsKt.H(cls.getName(), '.', IOUtils.DIR_SEPARATOR_UNIX);
            }
            return "L" + StringsKt.H(cls.getName(), '.', IOUtils.DIR_SEPARATOR_UNIX) + ';';
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return "S";
                }
                break;
        }
        throw new IllegalArgumentException(a.j(cls, "Unsupported primitive type: "));
    }

    public static final List c(Type type) {
        Intrinsics.f(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return EmptyList.X;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return SequencesKt.v(SequencesKt.i(SequencesKt.l(ReflectClassUtilKt$parameterizedTypeArguments$1.X, type), ReflectClassUtilKt$parameterizedTypeArguments$2.X));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Intrinsics.e(actualTypeArguments, "actualTypeArguments");
        return ArraysKt.M(actualTypeArguments);
    }

    public static final ClassLoader d(Class cls) {
        Intrinsics.f(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        Intrinsics.e(systemClassLoader, "getSystemClassLoader()");
        return systemClassLoader;
    }
}
