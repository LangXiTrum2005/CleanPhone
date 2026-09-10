package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* JADX INFO: loaded from: classes7.dex */
public final class DefaultTypeAttributeTranslator implements TypeAttributeTranslator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DefaultTypeAttributeTranslator f44500a = new DefaultTypeAttributeTranslator();

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator
    public final TypeAttributes a(Annotations annotations) {
        Intrinsics.f(annotations, "annotations");
        if (annotations.isEmpty()) {
            TypeAttributes.f44529Y.getClass();
            return TypeAttributes.Z;
        }
        TypeAttributes.Companion companion = TypeAttributes.f44529Y;
        List listH = CollectionsKt.H(new AnnotationsTypeAttribute(annotations));
        companion.getClass();
        return TypeAttributes.Companion.c(listH);
    }
}
