package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class AnnotationsTypeAttribute extends TypeAttribute<AnnotationsTypeAttribute> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Annotations f44494a;

    public AnnotationsTypeAttribute(Annotations annotations) {
        Intrinsics.f(annotations, "annotations");
        this.f44494a = annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeAttribute
    public final AnnotationsTypeAttribute a(TypeAttribute typeAttribute) {
        AnnotationsTypeAttribute annotationsTypeAttribute = (AnnotationsTypeAttribute) typeAttribute;
        return annotationsTypeAttribute == null ? this : new AnnotationsTypeAttribute(AnnotationsKt.a(this.f44494a, annotationsTypeAttribute.f44494a));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeAttribute
    public final KClass b() {
        return Reflection.f43333a.b(AnnotationsTypeAttribute.class);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeAttribute
    public final AnnotationsTypeAttribute c(TypeAttribute typeAttribute) {
        if (Intrinsics.a((AnnotationsTypeAttribute) typeAttribute, this)) {
            return this;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AnnotationsTypeAttribute) {
            return Intrinsics.a(((AnnotationsTypeAttribute) obj).f44494a, this.f44494a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f44494a.hashCode();
    }
}
