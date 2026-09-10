package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.types.TypeAttribute;

/* JADX INFO: loaded from: classes7.dex */
public abstract class TypeAttribute<T extends TypeAttribute<T>> {
    public abstract AnnotationsTypeAttribute a(TypeAttribute typeAttribute);

    public abstract KClass b();

    public abstract AnnotationsTypeAttribute c(TypeAttribute typeAttribute);
}
