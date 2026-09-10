package kotlin.reflect.jvm.internal;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectJavaClassFinderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "Companion", "Data", "MemberBelonginess", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class KDeclarationContainerImpl implements ClassBasedDeclarationContainer {
    public static final Regex X = new Regex("<v#(\\d+)>");

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R$\u0010\u0004\u001a\u0012\u0012\u0002\b\u0003 \u0003*\b\u0012\u0002\b\u0003\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Companion;", "", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "DEFAULT_CONSTRUCTOR_MARKER", "Ljava/lang/Class;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b¦\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public abstract class Data {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ KProperty[] f43401b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ReflectProperties.LazySoftVal f43402a;

        static {
            ReflectionFactory reflectionFactory = Reflection.f43333a;
            f43401b = new KProperty[]{reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(Data.class), "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"))};
        }

        public Data(final KDeclarationContainerImpl kDeclarationContainerImpl) {
            this.f43402a = ReflectProperties.a(null, new Function0<RuntimeModuleData>() { // from class: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$Data$moduleData$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ModuleByClassLoaderKt.a(kDeclarationContainerImpl.getX());
                }
            });
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0084\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", "", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class MemberBelonginess {
        public static final MemberBelonginess X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final MemberBelonginess f43403Y;
        public static final /* synthetic */ MemberBelonginess[] Z;

        static {
            MemberBelonginess memberBelonginess = new MemberBelonginess("DECLARED", 0);
            X = memberBelonginess;
            MemberBelonginess memberBelonginess2 = new MemberBelonginess("INHERITED", 1);
            f43403Y = memberBelonginess2;
            Z = new MemberBelonginess[]{memberBelonginess, memberBelonginess2};
        }

        public static MemberBelonginess valueOf(String str) {
            return (MemberBelonginess) Enum.valueOf(MemberBelonginess.class, str);
        }

        public static MemberBelonginess[] values() {
            return (MemberBelonginess[]) Z.clone();
        }
    }

    public static Method t(Class cls, String str, Class[] clsArr, Class cls2, boolean z2) {
        Class clsA;
        Method methodT;
        if (z2) {
            clsArr[0] = cls;
        }
        Method methodW = w(cls, str, clsArr, cls2);
        if (methodW != null) {
            return methodW;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (methodT = t(superclass, str, clsArr, cls2, z2)) != null) {
            return methodT;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        Intrinsics.e(interfaces, "interfaces");
        for (Class<?> superInterface : interfaces) {
            Intrinsics.e(superInterface, "superInterface");
            Method methodT2 = t(superInterface, str, clsArr, cls2, z2);
            if (methodT2 != null) {
                return methodT2;
            }
            if (z2 && (clsA = ReflectJavaClassFinderKt.a(ReflectClassUtilKt.d(superInterface), superInterface.getName().concat("$DefaultImpls"))) != null) {
                clsArr[0] = superInterface;
                Method methodW2 = w(clsA, str, clsArr, cls2);
                if (methodW2 != null) {
                    return methodW2;
                }
            }
        }
        return null;
    }

    public static Constructor v(Class cls, ArrayList arrayList) {
        try {
            Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static Method w(Class cls, String str, Class[] clsArr, Class cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (Intrinsics.a(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            Intrinsics.e(declaredMethods, "declaredMethods");
            for (Method method : declaredMethods) {
                if (Intrinsics.a(method.getName(), str) && Intrinsics.a(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final void b(ArrayList arrayList, String str, boolean z2) {
        ArrayList arrayListS = s(str);
        arrayList.addAll(arrayListS);
        int size = (arrayListS.size() + 31) / 32;
        for (int i2 = 0; i2 < size; i2++) {
            Class TYPE = Integer.TYPE;
            Intrinsics.e(TYPE, "TYPE");
            arrayList.add(TYPE);
        }
        if (!z2) {
            arrayList.add(Object.class);
        } else {
            arrayList.remove(DefaultConstructorMarker.class);
            arrayList.add(DefaultConstructorMarker.class);
        }
    }

    public final Method c(String name, String desc) throws ClassNotFoundException {
        Method methodT;
        Intrinsics.f(name, "name");
        Intrinsics.f(desc, "desc");
        if (name.equals("<init>")) {
            return null;
        }
        Class[] clsArr = (Class[]) s(desc).toArray(new Class[0]);
        Class clsU = u(StringsKt.u(desc, ')', 0, 6) + 1, desc.length(), desc);
        Method methodT2 = t(q(), name, clsArr, clsU, false);
        if (methodT2 != null) {
            return methodT2;
        }
        if (!q().isInterface() || (methodT = t(Object.class, name, clsArr, clsU, false)) == null) {
            return null;
        }
        return methodT;
    }

    public abstract Collection f();

    public abstract Collection n(Name name);

    public abstract PropertyDescriptor o(int i2);

    /* JADX WARN: Code duplicated, block: B:18:0x005a  */
    public final Collection p(MemberScope scope, MemberBelonginess memberBelonginess) {
        KCallableImpl kCallableImpl;
        Intrinsics.f(scope, "scope");
        KDeclarationContainerImpl$getMembers$visitor$1 kDeclarationContainerImpl$getMembers$visitor$1 = new KDeclarationContainerImpl$getMembers$visitor$1(this);
        Collection<DeclarationDescriptor> collectionA = ResolutionScope.DefaultImpls.a(scope, null, 3);
        ArrayList arrayList = new ArrayList();
        for (DeclarationDescriptor declarationDescriptor : collectionA) {
            if (declarationDescriptor instanceof CallableMemberDescriptor) {
                CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) declarationDescriptor;
                if (Intrinsics.a(callableMemberDescriptor.getVisibility(), DescriptorVisibilities.f43565h)) {
                    kCallableImpl = null;
                } else {
                    CallableMemberDescriptor.Kind kind = callableMemberDescriptor.getKind();
                    kind.getClass();
                    if ((kind != CallableMemberDescriptor.Kind.f43557Y) == (memberBelonginess == MemberBelonginess.X)) {
                        kCallableImpl = (KCallableImpl) declarationDescriptor.v(kDeclarationContainerImpl$getMembers$visitor$1, Unit.f43263a);
                    } else {
                        kCallableImpl = null;
                    }
                }
            } else {
                kCallableImpl = null;
            }
            if (kCallableImpl != null) {
                arrayList.add(kCallableImpl);
            }
        }
        return CollectionsKt.i0(arrayList);
    }

    public Class q() {
        Class x = getX();
        List list = ReflectClassUtilKt.f43693a;
        Intrinsics.f(x, "<this>");
        Class cls = (Class) ReflectClassUtilKt.f43695c.get(x);
        return cls == null ? getX() : cls;
    }

    public abstract Collection r(Name name);

    public final ArrayList s(String str) {
        int iU;
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        while (str.charAt(i2) != ')') {
            int i3 = i2;
            while (str.charAt(i3) == '[') {
                i3++;
            }
            char cCharAt = str.charAt(i3);
            if (StringsKt.m("VZCBSIFJD", cCharAt)) {
                iU = i3 + 1;
            } else {
                if (cCharAt != 'L') {
                    throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: ".concat(str));
                }
                iU = StringsKt.u(str, ';', i2, 4) + 1;
            }
            arrayList.add(u(i2, iU, str));
            i2 = iU;
        }
        return arrayList;
    }

    public final Class u(int i2, int i3, String str) throws ClassNotFoundException {
        char cCharAt = str.charAt(i2);
        if (cCharAt == 'L') {
            ClassLoader classLoaderD = ReflectClassUtilKt.d(getX());
            String strSubstring = str.substring(i2 + 1, i3 - 1);
            Intrinsics.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            Class<?> clsLoadClass = classLoaderD.loadClass(StringsKt.H(strSubstring, IOUtils.DIR_SEPARATOR_UNIX, '.'));
            Intrinsics.e(clsLoadClass, "jClass.safeClassLoader.l…d - 1).replace('/', '.'))");
            return clsLoadClass;
        }
        if (cCharAt == '[') {
            Class clsU = u(i2 + 1, i3, str);
            FqName fqName = UtilKt.f43420a;
            Intrinsics.f(clsU, "<this>");
            return Array.newInstance((Class<?>) clsU, 0).getClass();
        }
        if (cCharAt == 'V') {
            Class TYPE = Void.TYPE;
            Intrinsics.e(TYPE, "TYPE");
            return TYPE;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == 'C') {
            return Character.TYPE;
        }
        if (cCharAt == 'B') {
            return Byte.TYPE;
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'D') {
            return Double.TYPE;
        }
        throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: ".concat(str));
    }
}
