package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1.MemberAnnotationVisitor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.BitEncoding;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class ReflectKotlinClass implements KotlinJvmBinaryClass {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f43673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KotlinClassHeader f43674b;

    public static final class Factory {
        /* JADX WARN: Code duplicated, block: B:26:0x0073  */
        public static ReflectKotlinClass a(Class klass) throws InvocationTargetException {
            KotlinClassHeader kotlinClassHeader;
            Intrinsics.f(klass, "klass");
            ReadKotlinClassHeaderAnnotationVisitor readKotlinClassHeaderAnnotationVisitor = new ReadKotlinClassHeaderAnnotationVisitor();
            readKotlinClassHeaderAnnotationVisitor.f44027a = null;
            readKotlinClassHeaderAnnotationVisitor.f44028b = null;
            readKotlinClassHeaderAnnotationVisitor.f44029c = 0;
            readKotlinClassHeaderAnnotationVisitor.d = null;
            readKotlinClassHeaderAnnotationVisitor.f44030e = null;
            readKotlinClassHeaderAnnotationVisitor.f = null;
            readKotlinClassHeaderAnnotationVisitor.g = null;
            readKotlinClassHeaderAnnotationVisitor.f44031h = null;
            ReflectClassStructure.b(klass, readKotlinClassHeaderAnnotationVisitor);
            JvmMetadataVersion jvmMetadataVersion = JvmMetadataVersion.g;
            if (readKotlinClassHeaderAnnotationVisitor.g == null || readKotlinClassHeaderAnnotationVisitor.f44027a == null) {
                kotlinClassHeader = null;
            } else {
                JvmMetadataVersion jvmMetadataVersion2 = new JvmMetadataVersion(readKotlinClassHeaderAnnotationVisitor.f44027a, (readKotlinClassHeaderAnnotationVisitor.f44029c & 8) != 0);
                if (jvmMetadataVersion2.b(jvmMetadataVersion)) {
                    KotlinClassHeader.Kind kind = readKotlinClassHeaderAnnotationVisitor.g;
                    if ((kind == KotlinClassHeader.Kind.CLASS || kind == KotlinClassHeader.Kind.FILE_FACADE || kind == KotlinClassHeader.Kind.MULTIFILE_CLASS_PART) && readKotlinClassHeaderAnnotationVisitor.d == null) {
                        kotlinClassHeader = null;
                    }
                } else {
                    readKotlinClassHeaderAnnotationVisitor.f = readKotlinClassHeaderAnnotationVisitor.d;
                    readKotlinClassHeaderAnnotationVisitor.d = null;
                }
                String[] strArr = readKotlinClassHeaderAnnotationVisitor.f44031h;
                if (strArr != null) {
                    BitEncoding.a(strArr);
                }
                kotlinClassHeader = new KotlinClassHeader(readKotlinClassHeaderAnnotationVisitor.g, jvmMetadataVersion2, readKotlinClassHeaderAnnotationVisitor.d, readKotlinClassHeaderAnnotationVisitor.f, readKotlinClassHeaderAnnotationVisitor.f44030e, readKotlinClassHeaderAnnotationVisitor.f44028b, readKotlinClassHeaderAnnotationVisitor.f44029c);
            }
            if (kotlinClassHeader == null) {
                return null;
            }
            return new ReflectKotlinClass(klass, kotlinClassHeader);
        }
    }

    public ReflectKotlinClass(Class cls, KotlinClassHeader kotlinClassHeader) {
        this.f43673a = cls;
        this.f43674b = kotlinClassHeader;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public final ClassId a() {
        return ReflectClassUtilKt.a(this.f43673a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public final void b(AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1 abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1) throws InvocationTargetException {
        Class klass = this.f43673a;
        Intrinsics.f(klass, "klass");
        Method[] declaredMethods = klass.getDeclaredMethods();
        Intrinsics.e(declaredMethods, "klass.declaredMethods");
        int length = declaredMethods.length;
        int i2 = 0;
        while (i2 < length) {
            Method method = declaredMethods[i2];
            Name nameG = Name.g(method.getName());
            StringBuilder sb = new StringBuilder("(");
            Class<?>[] parameterTypes = method.getParameterTypes();
            Intrinsics.e(parameterTypes, "method.parameterTypes");
            for (Class<?> parameterType : parameterTypes) {
                Intrinsics.e(parameterType, "parameterType");
                sb.append(ReflectClassUtilKt.b(parameterType));
            }
            sb.append(")");
            Class<?> returnType = method.getReturnType();
            Intrinsics.e(returnType, "method.returnType");
            sb.append(ReflectClassUtilKt.b(returnType));
            String string = sb.toString();
            Intrinsics.e(string, "sb.toString()");
            AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1.AnnotationVisitorForMethod annotationVisitorForMethodA = abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1.a(nameG, string);
            Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
            Intrinsics.e(declaredAnnotations, "method.declaredAnnotations");
            for (Annotation annotation : declaredAnnotations) {
                Intrinsics.e(annotation, "annotation");
                ReflectClassStructure.c(annotationVisitorForMethodA, annotation);
            }
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            Intrinsics.e(parameterAnnotations, "method.parameterAnnotations");
            Annotation[][] annotationArr = parameterAnnotations;
            int length2 = annotationArr.length;
            for (int i3 = 0; i3 < length2; i3++) {
                Annotation[] annotations = annotationArr[i3];
                Intrinsics.e(annotations, "annotations");
                int length3 = annotations.length;
                int i4 = 0;
                while (i4 < length3) {
                    Annotation annotation2 = annotations[i4];
                    Class clsB = JvmClassMappingKt.b(JvmClassMappingKt.a(annotation2));
                    Class cls = klass;
                    KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorC = annotationVisitorForMethodA.c(i3, ReflectClassUtilKt.a(clsB), new ReflectAnnotationSource(annotation2));
                    if (annotationArgumentVisitorC != null) {
                        ReflectClassStructure.d(annotationArgumentVisitorC, annotation2, clsB);
                    }
                    i4++;
                    klass = cls;
                }
            }
            annotationVisitorForMethodA.a();
            i2++;
            klass = klass;
        }
        Class cls2 = klass;
        Constructor<?>[] declaredConstructors = cls2.getDeclaredConstructors();
        Intrinsics.e(declaredConstructors, "klass.declaredConstructors");
        int length4 = declaredConstructors.length;
        int i5 = 0;
        while (i5 < length4) {
            Constructor<?> constructor = declaredConstructors[i5];
            Name name = SpecialNames.f44176e;
            Intrinsics.e(constructor, "constructor");
            StringBuilder sb2 = new StringBuilder("(");
            Class<?>[] parameterTypes2 = constructor.getParameterTypes();
            Intrinsics.e(parameterTypes2, "constructor.parameterTypes");
            for (Class<?> parameterType2 : parameterTypes2) {
                Intrinsics.e(parameterType2, "parameterType");
                sb2.append(ReflectClassUtilKt.b(parameterType2));
            }
            sb2.append(")V");
            String string2 = sb2.toString();
            Intrinsics.e(string2, "sb.toString()");
            AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1.AnnotationVisitorForMethod annotationVisitorForMethodA2 = abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1.a(name, string2);
            Annotation[] declaredAnnotations2 = constructor.getDeclaredAnnotations();
            Intrinsics.e(declaredAnnotations2, "constructor.declaredAnnotations");
            for (Annotation annotation3 : declaredAnnotations2) {
                Intrinsics.e(annotation3, "annotation");
                ReflectClassStructure.c(annotationVisitorForMethodA2, annotation3);
            }
            Annotation[][] parameterAnnotations2 = constructor.getParameterAnnotations();
            Intrinsics.e(parameterAnnotations2, "parameterAnnotations");
            if (parameterAnnotations2.length != 0) {
                int length5 = constructor.getParameterTypes().length - parameterAnnotations2.length;
                int length6 = parameterAnnotations2.length;
                int i6 = 0;
                while (i6 < length6) {
                    Annotation[] annotations2 = parameterAnnotations2[i6];
                    Intrinsics.e(annotations2, "annotations");
                    int length7 = annotations2.length;
                    Constructor<?>[] constructorArr = declaredConstructors;
                    int i7 = 0;
                    while (i7 < length7) {
                        int i8 = i7;
                        Annotation annotation4 = annotations2[i8];
                        int i9 = length4;
                        Class clsB2 = JvmClassMappingKt.b(JvmClassMappingKt.a(annotation4));
                        int i10 = i5;
                        int i11 = length5;
                        Annotation[][] annotationArr2 = parameterAnnotations2;
                        KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorC2 = annotationVisitorForMethodA2.c(i6 + length5, ReflectClassUtilKt.a(clsB2), new ReflectAnnotationSource(annotation4));
                        if (annotationArgumentVisitorC2 != null) {
                            ReflectClassStructure.d(annotationArgumentVisitorC2, annotation4, clsB2);
                        }
                        i7 = i8 + 1;
                        i5 = i10;
                        length4 = i9;
                        length5 = i11;
                        parameterAnnotations2 = annotationArr2;
                    }
                    i6++;
                    declaredConstructors = constructorArr;
                }
            }
            Constructor<?>[] constructorArr2 = declaredConstructors;
            int i12 = length4;
            int i13 = i5;
            annotationVisitorForMethodA2.a();
            i5 = i13 + 1;
            declaredConstructors = constructorArr2;
            length4 = i12;
        }
        Field[] declaredFields = cls2.getDeclaredFields();
        Intrinsics.e(declaredFields, "klass.declaredFields");
        for (Field field : declaredFields) {
            Name nameG2 = Name.g(field.getName());
            Class<?> type = field.getType();
            Intrinsics.e(type, "field.type");
            String desc = ReflectClassUtilKt.b(type);
            Intrinsics.f(desc, "desc");
            String strB = nameG2.b();
            Intrinsics.e(strB, "name.asString()");
            AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1.MemberAnnotationVisitor memberAnnotationVisitor = abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1.new MemberAnnotationVisitor(MemberSignature.Companion.a(strB, desc));
            Annotation[] declaredAnnotations3 = field.getDeclaredAnnotations();
            Intrinsics.e(declaredAnnotations3, "field.declaredAnnotations");
            for (Annotation annotation5 : declaredAnnotations3) {
                Intrinsics.e(annotation5, "annotation");
                ReflectClassStructure.c(memberAnnotationVisitor, annotation5);
            }
            memberAnnotationVisitor.a();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public final void c(KotlinJvmBinaryClass.AnnotationVisitor annotationVisitor) throws InvocationTargetException {
        ReflectClassStructure.b(this.f43673a, annotationVisitor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public final KotlinClassHeader d() {
        return this.f43674b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ReflectKotlinClass) {
            return Intrinsics.a(this.f43673a, ((ReflectKotlinClass) obj).f43673a);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public final String getLocation() {
        return StringsKt.H(this.f43673a.getName(), '.', IOUtils.DIR_SEPARATOR_UNIX).concat(".class");
    }

    public final int hashCode() {
        return this.f43673a.hashCode();
    }

    public final String toString() {
        return ReflectKotlinClass.class.getName() + ": " + this.f43673a;
    }
}
