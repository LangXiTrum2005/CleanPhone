package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaElement;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement;

/* JADX INFO: loaded from: classes7.dex */
public final class RuntimeSourceElementFactory implements JavaSourceElementFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RuntimeSourceElementFactory f43680a = new RuntimeSourceElementFactory();

    public static final class RuntimeSourceElement implements JavaSourceElement {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ReflectJavaElement f43681b;

        public RuntimeSourceElement(ReflectJavaElement javaElement) {
            Intrinsics.f(javaElement, "javaElement");
            this.f43681b = javaElement;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement
        public final ReflectJavaElement a() {
            return this.f43681b;
        }

        public final String toString() {
            return RuntimeSourceElement.class.getName() + ": " + this.f43681b;
        }
    }

    public final RuntimeSourceElement a(JavaElement javaElement) {
        Intrinsics.f(javaElement, "javaElement");
        return new RuntimeSourceElement((ReflectJavaElement) javaElement);
    }
}
