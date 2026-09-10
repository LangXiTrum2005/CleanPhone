package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationAsAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes7.dex */
public final class ReflectJavaAnnotationAsAnnotationArgument extends ReflectJavaAnnotationArgument implements JavaAnnotationAsAnnotationArgument {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Annotation f43698b;

    public ReflectJavaAnnotationAsAnnotationArgument(Name name, Annotation annotation) {
        super(name);
        this.f43698b = annotation;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationAsAnnotationArgument
    public final ReflectJavaAnnotation a() {
        return new ReflectJavaAnnotation(this.f43698b);
    }
}
