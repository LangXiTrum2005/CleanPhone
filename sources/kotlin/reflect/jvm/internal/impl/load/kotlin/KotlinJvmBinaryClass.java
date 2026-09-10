package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectAnnotationSource;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;

/* JADX INFO: loaded from: classes7.dex */
public interface KotlinJvmBinaryClass {

    public interface AnnotationArgumentVisitor {
        void a();

        AnnotationArgumentVisitor b(ClassId classId, Name name);

        void c(Name name, ClassId classId, Name name2);

        void d(Name name, ClassLiteralValue classLiteralValue);

        void e(Object obj, Name name);

        AnnotationArrayArgumentVisitor f(Name name);
    }

    public interface AnnotationArrayArgumentVisitor {
        void a();

        AnnotationArgumentVisitor b(ClassId classId);

        void c(Object obj);

        void d(ClassId classId, Name name);

        void e(ClassLiteralValue classLiteralValue);
    }

    public interface AnnotationVisitor {
        void a();

        AnnotationArgumentVisitor b(ClassId classId, ReflectAnnotationSource reflectAnnotationSource);
    }

    public interface MemberVisitor {
    }

    public interface MethodAnnotationVisitor extends AnnotationVisitor {
    }

    ClassId a();

    void b(AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1 abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1);

    void c(AnnotationVisitor annotationVisitor);

    KotlinClassHeader d();

    String getLocation();
}
