package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.DefaultTypeAttributeTranslator;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class FunctionTypesKt {
    public static final int a(KotlinType kotlinType) {
        Intrinsics.f(kotlinType, "<this>");
        AnnotationDescriptor annotationDescriptorB = kotlinType.getAnnotations().b(StandardNames.FqNames.q);
        if (annotationDescriptorB == null) {
            return 0;
        }
        ConstantValue constantValue = (ConstantValue) MapsKt.f(annotationDescriptorB.a(), StandardNames.d);
        Intrinsics.d(constantValue, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((Number) ((IntValue) constantValue).f44302a).intValue();
    }

    public static final SimpleType b(KotlinBuiltIns kotlinBuiltIns, Annotations annotations, KotlinType kotlinType, List list, ArrayList arrayList, KotlinType kotlinType2, boolean z2) {
        ClassDescriptor classDescriptorJ;
        ArrayList arrayList2 = new ArrayList(list.size() + arrayList.size() + (kotlinType != null ? 1 : 0) + 1);
        List list2 = list;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList3.add(TypeUtilsKt.a((KotlinType) it.next()));
        }
        arrayList2.addAll(arrayList3);
        kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.a(arrayList2, kotlinType != null ? TypeUtilsKt.a(kotlinType) : null);
        int i2 = 0;
        for (Object obj : arrayList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.f0();
                throw null;
            }
            arrayList2.add(TypeUtilsKt.a((KotlinType) obj));
            i2 = i3;
        }
        arrayList2.add(TypeUtilsKt.a(kotlinType2));
        int size = list.size() + arrayList.size() + (kotlinType == null ? 0 : 1);
        if (z2) {
            classDescriptorJ = kotlinBuiltIns.u(size);
        } else {
            Name name = StandardNames.f43472a;
            classDescriptorJ = kotlinBuiltIns.j("Function" + size);
        }
        Intrinsics.e(classDescriptorJ, "if (isSuspendFunction) b…tFunction(parameterCount)");
        if (kotlinType != null) {
            FqName fqName = StandardNames.FqNames.f43504p;
            if (!annotations.E0(fqName)) {
                annotations = Annotations.Companion.a(CollectionsKt.N(annotations, new BuiltInAnnotationDescriptor(kotlinBuiltIns, fqName, EmptyMap.X)));
            }
        }
        if (!list.isEmpty()) {
            int size2 = list.size();
            FqName fqName2 = StandardNames.FqNames.q;
            if (!annotations.E0(fqName2)) {
                annotations = Annotations.Companion.a(CollectionsKt.N(annotations, new BuiltInAnnotationDescriptor(kotlinBuiltIns, fqName2, MapsKt.i(new Pair(StandardNames.d, new IntValue(size2))))));
            }
        }
        return KotlinTypeFactory.c(DefaultTypeAttributeTranslator.f44500a.a(annotations), classDescriptorJ, arrayList2);
    }

    public static final Name c(KotlinType kotlinType) {
        String str;
        AnnotationDescriptor annotationDescriptorB = kotlinType.getAnnotations().b(StandardNames.FqNames.r);
        if (annotationDescriptorB != null) {
            Object objX = CollectionsKt.X(annotationDescriptorB.a().values());
            StringValue stringValue = objX instanceof StringValue ? (StringValue) objX : null;
            if (stringValue != null && (str = (String) stringValue.f44302a) != null) {
                if (!Name.h(str)) {
                    str = null;
                }
                if (str != null) {
                    return Name.g(str);
                }
            }
        }
        return null;
    }

    public static final List d(KotlinType kotlinType) {
        Intrinsics.f(kotlinType, "<this>");
        h(kotlinType);
        int iA = a(kotlinType);
        if (iA == 0) {
            return EmptyList.X;
        }
        List listSubList = kotlinType.F0().subList(0, iA);
        ArrayList arrayList = new ArrayList(CollectionsKt.n(listSubList, 10));
        Iterator it = listSubList.iterator();
        while (it.hasNext()) {
            KotlinType type = ((TypeProjection) it.next()).getType();
            Intrinsics.e(type, "it.type");
            arrayList.add(type);
        }
        return arrayList;
    }

    public static final FunctionClassKind e(ClassifierDescriptor classifierDescriptor) {
        if (!(classifierDescriptor instanceof ClassDescriptor) || !KotlinBuiltIns.I(classifierDescriptor)) {
            return null;
        }
        FqNameUnsafe fqNameUnsafeH = DescriptorUtilsKt.h(classifierDescriptor);
        if (!fqNameUnsafeH.d() || fqNameUnsafeH.f44168a.isEmpty()) {
            return null;
        }
        FunctionClassKind.Companion companion = FunctionClassKind.Z;
        String strB = fqNameUnsafeH.f().b();
        Intrinsics.e(strB, "shortName().asString()");
        FqName fqNameE = fqNameUnsafeH.g().e();
        Intrinsics.e(fqNameE, "toSafe().parent()");
        companion.getClass();
        FunctionClassKind.Companion.KindWithArity kindWithArityA = FunctionClassKind.Companion.a(strB, fqNameE);
        if (kindWithArityA != null) {
            return kindWithArityA.f43518a;
        }
        return null;
    }

    public static final KotlinType f(KotlinType kotlinType) {
        Intrinsics.f(kotlinType, "<this>");
        h(kotlinType);
        if (kotlinType.getAnnotations().b(StandardNames.FqNames.f43504p) == null) {
            return null;
        }
        return ((TypeProjection) kotlinType.F0().get(a(kotlinType))).getType();
    }

    public static final List g(KotlinType kotlinType) {
        Intrinsics.f(kotlinType, "<this>");
        h(kotlinType);
        List listF0 = kotlinType.F0();
        return listF0.subList(((!h(kotlinType) || kotlinType.getAnnotations().b(StandardNames.FqNames.f43504p) == null) ? 0 : 1) + a(kotlinType), listF0.size() - 1);
    }

    public static final boolean h(KotlinType kotlinType) {
        Intrinsics.f(kotlinType, "<this>");
        ClassifierDescriptor classifierDescriptorC = kotlinType.H0().c();
        if (classifierDescriptorC == null) {
            return false;
        }
        FunctionClassKind functionClassKindE = e(classifierDescriptorC);
        return functionClassKindE == FunctionClassKind.e0 || functionClassKindE == FunctionClassKind.f0;
    }

    public static final boolean i(KotlinType kotlinType) {
        Intrinsics.f(kotlinType, "<this>");
        ClassifierDescriptor classifierDescriptorC = kotlinType.H0().c();
        return (classifierDescriptorC != null ? e(classifierDescriptorC) : null) == FunctionClassKind.f0;
    }
}
