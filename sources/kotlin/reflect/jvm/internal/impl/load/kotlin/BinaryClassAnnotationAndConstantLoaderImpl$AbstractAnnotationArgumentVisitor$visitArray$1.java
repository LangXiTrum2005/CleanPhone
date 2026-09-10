package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;

/* JADX INFO: loaded from: classes7.dex */
public final class BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitArray$1 implements KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f43981a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl f43982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Name f43983c;
    public final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor d;

    public BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitArray$1(BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl, Name name, BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor abstractAnnotationArgumentVisitor) {
        this.f43982b = binaryClassAnnotationAndConstantLoaderImpl;
        this.f43983c = name;
        this.d = abstractAnnotationArgumentVisitor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public final void a() {
        this.d.g(this.f43981a, this.f43983c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public final KotlinJvmBinaryClass.AnnotationArgumentVisitor b(ClassId classId) {
        final ArrayList arrayList = new ArrayList();
        final BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1 binaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1R = this.f43982b.r(classId, SourceElement.f43591a, arrayList);
        return new KotlinJvmBinaryClass.AnnotationArgumentVisitor(this, arrayList) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitArray$1$visitAnnotation$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1 f43984a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitArray$1 f43986c;
            public final /* synthetic */ ArrayList d;

            {
                this.f43986c = this;
                this.d = arrayList;
                this.f43984a = this.f43985b;
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public final void a() throws InvocationTargetException {
                this.f43985b.a();
                this.f43986c.f43981a.add(new AnnotationValue((AnnotationDescriptor) CollectionsKt.W(this.d)));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public final KotlinJvmBinaryClass.AnnotationArgumentVisitor b(ClassId classId2, Name name) {
                return this.f43984a.b(classId2, name);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public final void c(Name name, ClassId classId2, Name name2) {
                this.f43984a.h(name, new EnumValue(classId2, name2));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public final void d(Name name, ClassLiteralValue classLiteralValue) {
                this.f43984a.d(name, classLiteralValue);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public final void e(Object obj, Name name) {
                this.f43984a.e(obj, name);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public final KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor f(Name name) {
                return this.f43984a.f(name);
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public final void c(Object obj) {
        ArrayList arrayList = this.f43981a;
        Name name = this.f43983c;
        ConstantValue constantValueB = ConstantValueFactory.f44303a.b(obj, this.f43982b.f43974c);
        if (constantValueB == null) {
            String message = "Unsupported annotation argument: " + name;
            Intrinsics.f(message, "message");
            constantValueB = new ErrorValue.ErrorValueWithMessage(message);
        }
        arrayList.add(constantValueB);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public final void d(ClassId classId, Name name) {
        this.f43981a.add(new EnumValue(classId, name));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
    public final void e(ClassLiteralValue classLiteralValue) {
        this.f43981a.add(new KClassValue(new KClassValue.Value.NormalClass(classLiteralValue)));
    }
}
