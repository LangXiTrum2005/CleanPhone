package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.sequences.SequencesKt;
import kotlin.sequences.TakeWhileSequence;

/* JADX INFO: loaded from: classes7.dex */
public final class TypeParameterUtilsKt {
    public static final PossiblyInnerType a(SimpleType simpleType, ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, int i2) {
        if (classifierDescriptorWithTypeParameters == null || ErrorUtils.f(classifierDescriptorWithTypeParameters)) {
            return null;
        }
        int size = classifierDescriptorWithTypeParameters.p().size() + i2;
        if (classifierDescriptorWithTypeParameters.w()) {
            List listSubList = simpleType.F0().subList(i2, size);
            DeclarationDescriptor declarationDescriptorD = classifierDescriptorWithTypeParameters.d();
            return new PossiblyInnerType(classifierDescriptorWithTypeParameters, listSubList, a(simpleType, declarationDescriptorD instanceof ClassifierDescriptorWithTypeParameters ? (ClassifierDescriptorWithTypeParameters) declarationDescriptorD : null, size));
        }
        if (size != simpleType.F0().size()) {
            DescriptorUtils.o(classifierDescriptorWithTypeParameters);
        }
        return new PossiblyInnerType(classifierDescriptorWithTypeParameters, simpleType.F0().subList(i2, simpleType.F0().size()), null);
    }

    public static final List b(ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters) {
        List parameters;
        Object next;
        TypeConstructor typeConstructorH;
        Intrinsics.f(classifierDescriptorWithTypeParameters, "<this>");
        List declaredTypeParameters = classifierDescriptorWithTypeParameters.p();
        Intrinsics.e(declaredTypeParameters, "declaredTypeParameters");
        if (!classifierDescriptorWithTypeParameters.w() && !(classifierDescriptorWithTypeParameters.d() instanceof CallableDescriptor)) {
            return declaredTypeParameters;
        }
        List listV = SequencesKt.v(SequencesKt.i(SequencesKt.g(new TakeWhileSequence(DescriptorUtilsKt.k(classifierDescriptorWithTypeParameters), TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$1.X), TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$2.X), TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$3.X));
        Iterator f44671a = DescriptorUtilsKt.k(classifierDescriptorWithTypeParameters).getF44671a();
        do {
            parameters = null;
            if (!f44671a.hasNext()) {
                next = null;
                break;
            }
            next = f44671a.next();
        } while (!(next instanceof ClassDescriptor));
        ClassDescriptor classDescriptor = (ClassDescriptor) next;
        if (classDescriptor != null && (typeConstructorH = classDescriptor.h()) != null) {
            parameters = typeConstructorH.getParameters();
        }
        if (parameters == null) {
            parameters = EmptyList.X;
        }
        if (listV.isEmpty() && parameters.isEmpty()) {
            List declaredTypeParameters2 = classifierDescriptorWithTypeParameters.p();
            Intrinsics.e(declaredTypeParameters2, "declaredTypeParameters");
            return declaredTypeParameters2;
        }
        ArrayList<TypeParameterDescriptor> arrayListO = CollectionsKt.O(parameters, listV);
        ArrayList arrayList = new ArrayList(CollectionsKt.n(arrayListO, 10));
        for (TypeParameterDescriptor it : arrayListO) {
            Intrinsics.e(it, "it");
            arrayList.add(new CapturedTypeParameterDescriptor(it, classifierDescriptorWithTypeParameters, declaredTypeParameters.size()));
        }
        return CollectionsKt.O(arrayList, declaredTypeParameters);
    }
}
