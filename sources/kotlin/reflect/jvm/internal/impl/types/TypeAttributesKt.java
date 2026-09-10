package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.util.ArrayMap;

/* JADX INFO: loaded from: classes7.dex */
public final class TypeAttributesKt {
    /* JADX WARN: Code duplicated, block: B:18:0x0050  */
    public static final TypeAttributes a(TypeAttributes typeAttributes, Annotations annotations) {
        TypeAttributes typeAttributesC;
        Intrinsics.f(typeAttributes, "<this>");
        if (AnnotationsTypeAttributeKt.a(typeAttributes) == annotations) {
            return typeAttributes;
        }
        AnnotationsTypeAttribute annotationsTypeAttribute = (AnnotationsTypeAttribute) AnnotationsTypeAttributeKt.f44496b.getValue(typeAttributes, AnnotationsTypeAttributeKt.f44495a[0]);
        if (annotationsTypeAttribute != null) {
            if (typeAttributes.isEmpty()) {
                typeAttributesC = typeAttributes;
            } else {
                ArrayMap arrayMap = typeAttributes.X;
                ArrayList arrayList = new ArrayList();
                for (Object obj : arrayMap) {
                    if (!Intrinsics.a((TypeAttribute) obj, annotationsTypeAttribute)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.size() == typeAttributes.X.a()) {
                    typeAttributesC = typeAttributes;
                } else {
                    TypeAttributes.f44529Y.getClass();
                    typeAttributesC = TypeAttributes.Companion.c(arrayList);
                }
            }
            if (typeAttributesC != null) {
                typeAttributes = typeAttributesC;
            }
        }
        if (annotations.iterator().hasNext() || !annotations.isEmpty()) {
            AnnotationsTypeAttribute annotationsTypeAttribute2 = new AnnotationsTypeAttribute(annotations);
            if (typeAttributes.X.get(TypeAttributes.f44529Y.b(annotationsTypeAttribute2.b())) == null) {
                return typeAttributes.isEmpty() ? new TypeAttributes(CollectionsKt.H(annotationsTypeAttribute2)) : TypeAttributes.Companion.c(CollectionsKt.P(annotationsTypeAttribute2, CollectionsKt.i0(typeAttributes)));
            }
        }
        return typeAttributes;
    }
}
