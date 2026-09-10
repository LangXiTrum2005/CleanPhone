package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class TypeAliasExpander {

    public static final class Companion {
    }

    public static TypeAttributes b(UnwrappedType unwrappedType, TypeAttributes typeAttributes) {
        AnnotationsTypeAttribute annotationsTypeAttributeA;
        if (KotlinTypeKt.a(unwrappedType)) {
            return unwrappedType.G0();
        }
        TypeAttributes other = unwrappedType.G0();
        typeAttributes.getClass();
        Intrinsics.f(other, "other");
        if (typeAttributes.isEmpty() && other.isEmpty()) {
            return typeAttributes;
        }
        ArrayList arrayList = new ArrayList();
        Collection collectionValues = TypeAttributes.f44529Y.f44635a.values();
        Intrinsics.e(collectionValues, "idPerType.values");
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            TypeAttribute typeAttribute = (TypeAttribute) typeAttributes.X.get(iIntValue);
            TypeAttribute typeAttribute2 = (TypeAttribute) other.X.get(iIntValue);
            if (typeAttribute == null) {
                annotationsTypeAttributeA = typeAttribute2 != null ? typeAttribute2.a(typeAttribute) : null;
            } else {
                annotationsTypeAttributeA = typeAttribute.a(typeAttribute2);
            }
            CollectionsKt.a(arrayList, annotationsTypeAttributeA);
        }
        return TypeAttributes.Companion.c(arrayList);
    }

    public final void a(Annotations annotations, Annotations annotations2) {
        HashSet hashSet = new HashSet();
        Iterator<AnnotationDescriptor> it = annotations.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().c());
        }
        Iterator<AnnotationDescriptor> it2 = annotations2.iterator();
        while (it2.hasNext()) {
            hashSet.contains(it2.next().c());
        }
    }

    public final SimpleType c(TypeAliasExpansion typeAliasExpansion, TypeAttributes typeAttributes, boolean z2, int i2, boolean z3) {
        Variance variance = Variance.INVARIANT;
        TypeAliasDescriptor typeAliasDescriptor = typeAliasExpansion.f44526b;
        TypeProjection typeProjectionD = d(new TypeProjectionImpl(typeAliasDescriptor.m0(), variance), typeAliasExpansion, null, i2);
        KotlinType type = typeProjectionD.getType();
        Intrinsics.e(type, "expandedProjection.type");
        SimpleType simpleTypeA = TypeSubstitutionKt.a(type);
        if (KotlinTypeKt.a(simpleTypeA)) {
            return simpleTypeA;
        }
        typeProjectionD.b();
        a(simpleTypeA.getAnnotations(), AnnotationsTypeAttributeKt.a(typeAttributes));
        if (!KotlinTypeKt.a(simpleTypeA)) {
            simpleTypeA = TypeSubstitutionKt.d(simpleTypeA, null, b(simpleTypeA, typeAttributes), 1);
        }
        SimpleType simpleTypeI = TypeUtils.i(simpleTypeA, z2);
        if (!z3) {
            return simpleTypeI;
        }
        TypeConstructor typeConstructorH = typeAliasDescriptor.h();
        Intrinsics.e(typeConstructorH, "descriptor.typeConstructor");
        return SpecialTypesKt.c(simpleTypeI, KotlinTypeFactory.e(typeAliasExpansion.f44527c, MemberScope.Empty.f44351b, typeAttributes, typeConstructorH, z2));
    }

    public final TypeProjection d(TypeProjection typeProjection, TypeAliasExpansion typeAliasExpansion, TypeParameterDescriptor typeParameterDescriptor, int i2) {
        Variance varianceJ;
        SimpleType simpleTypeI;
        KotlinType kotlinTypeD;
        TypeAliasDescriptor typeAliasDescriptor = typeAliasExpansion.f44526b;
        if (i2 > 100) {
            throw new AssertionError("Too deep recursion while expanding type alias " + typeAliasDescriptor.getName());
        }
        if (typeProjection.a()) {
            Intrinsics.c(typeParameterDescriptor);
            return TypeUtils.j(typeParameterDescriptor);
        }
        KotlinType type = typeProjection.getType();
        Intrinsics.e(type, "underlyingProjection.type");
        TypeConstructor constructor = type.H0();
        Intrinsics.f(constructor, "constructor");
        ClassifierDescriptor classifierDescriptorC = constructor.c();
        TypeProjection typeProjection2 = classifierDescriptorC instanceof TypeParameterDescriptor ? (TypeProjection) typeAliasExpansion.d.get(classifierDescriptorC) : null;
        TypeAliasExpansionReportStrategy.DO_NOTHING do_nothing = TypeAliasExpansionReportStrategy.DO_NOTHING.f44528a;
        Variance variance = Variance.INVARIANT;
        if (typeProjection2 != null) {
            if (typeProjection2.a()) {
                Intrinsics.c(typeParameterDescriptor);
                return TypeUtils.j(typeParameterDescriptor);
            }
            UnwrappedType unwrappedTypeK0 = typeProjection2.getType().K0();
            Variance varianceB = typeProjection2.b();
            Intrinsics.e(varianceB, "argument.projectionKind");
            Variance varianceB2 = typeProjection.b();
            Intrinsics.e(varianceB2, "underlyingProjection.projectionKind");
            if (varianceB2 != varianceB && varianceB2 != variance) {
                if (varianceB == variance) {
                    varianceB = varianceB2;
                } else {
                    do_nothing.a(typeAliasDescriptor, unwrappedTypeK0);
                }
            }
            if (typeParameterDescriptor == null || (varianceJ = typeParameterDescriptor.j()) == null) {
                varianceJ = variance;
            }
            if (varianceJ == varianceB || varianceJ == variance) {
                variance = varianceB;
            } else if (varianceB != variance) {
                do_nothing.a(typeAliasDescriptor, unwrappedTypeK0);
                variance = varianceB;
            }
            a(type.getAnnotations(), unwrappedTypeK0.getAnnotations());
            if (unwrappedTypeK0 instanceof DynamicType) {
                DynamicType dynamicType = (DynamicType) unwrappedTypeK0;
                TypeAttributes newAttributes = b(dynamicType, type.G0());
                Intrinsics.f(newAttributes, "newAttributes");
                kotlinTypeD = new DynamicType(TypeUtilsKt.f(dynamicType.Z), newAttributes);
            } else {
                simpleTypeI = TypeUtils.i(TypeSubstitutionKt.a(unwrappedTypeK0), type.I0());
                TypeAttributes typeAttributesG0 = type.G0();
                if (!KotlinTypeKt.a(simpleTypeI)) {
                    kotlinTypeD = simpleTypeI;
                    kotlinTypeD = TypeSubstitutionKt.d(simpleTypeI, null, b(simpleTypeI, typeAttributesG0), 1);
                }
            }
            kotlinTypeD = simpleTypeI;
            return new TypeProjectionImpl(kotlinTypeD, variance);
        }
        UnwrappedType unwrappedTypeK1 = typeProjection.getType().K0();
        if (!DynamicTypesKt.a(unwrappedTypeK1)) {
            SimpleType simpleTypeA = TypeSubstitutionKt.a(unwrappedTypeK1);
            if (!KotlinTypeKt.a(simpleTypeA) && TypeUtilsKt.m(simpleTypeA)) {
                TypeConstructor typeConstructorH0 = simpleTypeA.H0();
                ClassifierDescriptor classifierDescriptorC2 = typeConstructorH0.c();
                typeConstructorH0.getParameters().size();
                simpleTypeA.F0().size();
                if (!(classifierDescriptorC2 instanceof TypeParameterDescriptor)) {
                    int i3 = 0;
                    if (!(classifierDescriptorC2 instanceof TypeAliasDescriptor)) {
                        SimpleType simpleTypeE = e(simpleTypeA, typeAliasExpansion, i2);
                        TypeSubstitutor.d(simpleTypeE);
                        for (Object obj : simpleTypeE.F0()) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                kotlin.collections.CollectionsKt.f0();
                                throw null;
                            }
                            TypeProjection typeProjection3 = (TypeProjection) obj;
                            if (!typeProjection3.a()) {
                                KotlinType type2 = typeProjection3.getType();
                                Intrinsics.e(type2, "substitutedArgument.type");
                                if (!TypeUtilsKt.c(type2)) {
                                }
                            }
                            i3 = i4;
                        }
                        return new TypeProjectionImpl(simpleTypeE, typeProjection.b());
                    }
                    TypeAliasDescriptor typeAliasDescriptor2 = (TypeAliasDescriptor) classifierDescriptorC2;
                    if (typeAliasExpansion.a(typeAliasDescriptor2)) {
                        ErrorTypeKind errorTypeKind = ErrorTypeKind.RECURSIVE_TYPE_ALIAS;
                        String str = typeAliasDescriptor2.getName().X;
                        Intrinsics.e(str, "typeDescriptor.name.toString()");
                        return new TypeProjectionImpl(ErrorUtils.c(errorTypeKind, str), variance);
                    }
                    List listF0 = simpleTypeA.F0();
                    ArrayList arrayList = new ArrayList(kotlin.collections.CollectionsKt.n(listF0, 10));
                    for (Object obj2 : listF0) {
                        int i5 = i3 + 1;
                        if (i3 < 0) {
                            kotlin.collections.CollectionsKt.f0();
                            throw null;
                        }
                        arrayList.add(d((TypeProjection) obj2, typeAliasExpansion, (TypeParameterDescriptor) typeConstructorH0.getParameters().get(i3), i2 + 1));
                        i3 = i5;
                    }
                    SimpleType simpleTypeC = c(TypeAliasExpansion.Companion.a(typeAliasExpansion, typeAliasDescriptor2, arrayList), simpleTypeA.G0(), simpleTypeA.I0(), i2 + 1, false);
                    SimpleType simpleTypeE2 = e(simpleTypeA, typeAliasExpansion, i2);
                    if (!DynamicTypesKt.a(simpleTypeC)) {
                        simpleTypeC = SpecialTypesKt.c(simpleTypeC, simpleTypeE2);
                    }
                    return new TypeProjectionImpl(simpleTypeC, typeProjection.b());
                }
            }
        }
        return typeProjection;
    }

    public final SimpleType e(SimpleType simpleType, TypeAliasExpansion typeAliasExpansion, int i2) {
        TypeConstructor typeConstructorH0 = simpleType.H0();
        List listF0 = simpleType.F0();
        ArrayList arrayList = new ArrayList(kotlin.collections.CollectionsKt.n(listF0, 10));
        int i3 = 0;
        for (Object obj : listF0) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                kotlin.collections.CollectionsKt.f0();
                throw null;
            }
            TypeProjection typeProjection = (TypeProjection) obj;
            TypeProjection typeProjectionD = d(typeProjection, typeAliasExpansion, (TypeParameterDescriptor) typeConstructorH0.getParameters().get(i3), i2 + 1);
            if (!typeProjectionD.a()) {
                typeProjectionD = new TypeProjectionImpl(TypeUtils.h(typeProjectionD.getType(), typeProjection.getType().I0()), typeProjectionD.b());
            }
            arrayList.add(typeProjectionD);
            i3 = i4;
        }
        return TypeSubstitutionKt.d(simpleType, arrayList, null, 2);
    }
}
