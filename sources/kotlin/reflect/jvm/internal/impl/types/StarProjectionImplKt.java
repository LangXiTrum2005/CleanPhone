package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class StarProjectionImplKt {
    public static final KotlinType a(final ArrayList arrayList, List list, KotlinBuiltIns kotlinBuiltIns) {
        KotlinType kotlinTypeI = new TypeSubstitutor(new TypeConstructorSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.StarProjectionImplKt$buildStarProjectionTypeByTypeParameters$1
            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution
            public final TypeProjection g(TypeConstructor key) {
                Intrinsics.f(key, "key");
                if (!arrayList.contains(key)) {
                    return null;
                }
                ClassifierDescriptor classifierDescriptorC = key.c();
                Intrinsics.d(classifierDescriptorC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
                return TypeUtils.j((TypeParameterDescriptor) classifierDescriptorC);
            }
        }).i((KotlinType) CollectionsKt.w(list), Variance.OUT_VARIANCE);
        return kotlinTypeI == null ? kotlinBuiltIns.n() : kotlinTypeI;
    }

    public static final KotlinType b(TypeParameterDescriptor typeParameterDescriptor) {
        Intrinsics.f(typeParameterDescriptor, "<this>");
        DeclarationDescriptor declarationDescriptorD = typeParameterDescriptor.d();
        Intrinsics.e(declarationDescriptorD, "this.containingDeclaration");
        if (declarationDescriptorD instanceof ClassifierDescriptorWithTypeParameters) {
            List parameters = ((ClassifierDescriptorWithTypeParameters) declarationDescriptorD).h().getParameters();
            Intrinsics.e(parameters, "descriptor.typeConstructor.parameters");
            List list = parameters;
            ArrayList arrayList = new ArrayList(CollectionsKt.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TypeConstructor typeConstructorH = ((TypeParameterDescriptor) it.next()).h();
                Intrinsics.e(typeConstructorH, "it.typeConstructor");
                arrayList.add(typeConstructorH);
            }
            List upperBounds = typeParameterDescriptor.getUpperBounds();
            Intrinsics.e(upperBounds, "upperBounds");
            return a(arrayList, upperBounds, DescriptorUtilsKt.e(typeParameterDescriptor));
        }
        if (!(declarationDescriptorD instanceof FunctionDescriptor)) {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
        List typeParameters = ((FunctionDescriptor) declarationDescriptorD).getTypeParameters();
        Intrinsics.e(typeParameters, "descriptor.typeParameters");
        List list2 = typeParameters;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.n(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            TypeConstructor typeConstructorH2 = ((TypeParameterDescriptor) it2.next()).h();
            Intrinsics.e(typeConstructorH2, "it.typeConstructor");
            arrayList2.add(typeConstructorH2);
        }
        List upperBounds2 = typeParameterDescriptor.getUpperBounds();
        Intrinsics.e(upperBounds2, "upperBounds");
        return a(arrayList2, upperBounds2, DescriptorUtilsKt.e(typeParameterDescriptor));
    }
}
