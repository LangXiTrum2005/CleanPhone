package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaLiteralAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes7.dex */
public final class ReflectJavaLiteralAnnotationArgument extends ReflectJavaAnnotationArgument implements JavaLiteralAnnotationArgument {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f43710b;

    public ReflectJavaLiteralAnnotationArgument(Object obj, Name name) {
        super(name);
        this.f43710b = obj;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaLiteralAnnotationArgument
    public final Object getValue() {
        return this.f43710b;
    }
}
