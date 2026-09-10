package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.util.NullableArrayMapAccessor;

/* JADX INFO: loaded from: classes7.dex */
public final class AnnotationsTypeAttributeKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f44495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final NullableArrayMapAccessor f44496b;

    static {
        ReflectionFactory reflectionFactory = Reflection.f43333a;
        f44495a = new KProperty[]{reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.c(AnnotationsTypeAttributeKt.class, "descriptors"), "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;"))};
        TypeAttributes.Companion companion = TypeAttributes.f44529Y;
        KClass kClassB = reflectionFactory.b(AnnotationsTypeAttribute.class);
        companion.getClass();
        f44496b = new NullableArrayMapAccessor(kClassB, companion.b(kClassB));
    }

    public static final Annotations a(TypeAttributes typeAttributes) {
        Annotations annotations;
        Intrinsics.f(typeAttributes, "<this>");
        AnnotationsTypeAttribute annotationsTypeAttribute = (AnnotationsTypeAttribute) f44496b.getValue(typeAttributes, f44495a[0]);
        return (annotationsTypeAttribute == null || (annotations = annotationsTypeAttribute.f44494a) == null) ? Annotations.Companion.f43614a : annotations;
    }
}
