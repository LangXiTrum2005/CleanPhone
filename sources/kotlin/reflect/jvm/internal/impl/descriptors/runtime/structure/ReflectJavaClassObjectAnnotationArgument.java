package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassObjectAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes7.dex */
public final class ReflectJavaClassObjectAnnotationArgument extends ReflectJavaAnnotationArgument implements JavaClassObjectAnnotationArgument {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f43704b;

    public ReflectJavaClassObjectAnnotationArgument(Name name, Class cls) {
        super(name);
        this.f43704b = cls;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassObjectAnnotationArgument
    public final ReflectJavaType b() {
        return ReflectJavaType.Factory.a(this.f43704b);
    }
}
