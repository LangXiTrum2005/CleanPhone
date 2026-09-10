package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class AnnotationTypeQualifierResolver extends AbstractAnnotationTypeQualifierResolver<AnnotationDescriptor> {
    public static List l(ConstantValue constantValue) {
        if (!(constantValue instanceof ArrayValue)) {
            return constantValue instanceof EnumValue ? CollectionsKt.H(((EnumValue) constantValue).f44305c.d()) : EmptyList.X;
        }
        Iterable iterable = (Iterable) ((ArrayValue) constantValue).f44302a;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            CollectionsKt.g(l((ConstantValue) it.next()), arrayList);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    public final ArrayList a(Object obj, boolean z2) {
        AnnotationDescriptor annotationDescriptor = (AnnotationDescriptor) obj;
        Intrinsics.f(annotationDescriptor, "<this>");
        Map mapA = annotationDescriptor.a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mapA.entrySet()) {
            CollectionsKt.g((!z2 || Intrinsics.a((Name) entry.getKey(), JvmAnnotationNames.f43766b)) ? l((ConstantValue) entry.getValue()) : EmptyList.X, arrayList);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    public final FqName e(Object obj) {
        AnnotationDescriptor annotationDescriptor = (AnnotationDescriptor) obj;
        Intrinsics.f(annotationDescriptor, "<this>");
        return annotationDescriptor.c();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    public final ClassDescriptor f(Object obj) {
        AnnotationDescriptor annotationDescriptor = (AnnotationDescriptor) obj;
        Intrinsics.f(annotationDescriptor, "<this>");
        ClassDescriptor classDescriptorD = DescriptorUtilsKt.d(annotationDescriptor);
        Intrinsics.c(classDescriptorD);
        return classDescriptorD;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver
    public final Iterable g(Object obj) {
        Annotations annotations;
        AnnotationDescriptor annotationDescriptor = (AnnotationDescriptor) obj;
        Intrinsics.f(annotationDescriptor, "<this>");
        ClassDescriptor classDescriptorD = DescriptorUtilsKt.d(annotationDescriptor);
        return (classDescriptorD == null || (annotations = classDescriptorD.getAnnotations()) == null) ? EmptyList.X : annotations;
    }
}
