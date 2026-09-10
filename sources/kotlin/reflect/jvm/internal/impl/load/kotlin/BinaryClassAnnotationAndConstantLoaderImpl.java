package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ByteValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.LongValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ShortValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UByteValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UIntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ULongValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UShortValue;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationDeserializer;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* JADX INFO: loaded from: classes7.dex */
public final class BinaryClassAnnotationAndConstantLoaderImpl extends AbstractBinaryClassAnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ModuleDescriptorImpl f43974c;
    public final NotFoundClasses d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AnnotationDeserializer f43975e;
    public JvmMetadataVersion f;

    public abstract class AbstractAnnotationArgumentVisitor implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {
        public AbstractAnnotationArgumentVisitor() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final KotlinJvmBinaryClass.AnnotationArgumentVisitor b(ClassId classId, final Name name) {
            final ArrayList arrayList = new ArrayList();
            final BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1 binaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1R = BinaryClassAnnotationAndConstantLoaderImpl.this.r(classId, SourceElement.f43591a, arrayList);
            return new KotlinJvmBinaryClass.AnnotationArgumentVisitor(this, name, arrayList) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitAnnotation$1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1 f43977a;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor f43979c;
                public final /* synthetic */ Name d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ ArrayList f43980e;

                {
                    this.f43979c = this;
                    this.d = name;
                    this.f43980e = arrayList;
                    this.f43977a = this.f43978b;
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public final void a() throws InvocationTargetException {
                    this.f43978b.a();
                    AnnotationValue annotationValue = new AnnotationValue((AnnotationDescriptor) CollectionsKt.W(this.f43980e));
                    this.f43979c.h(this.d, annotationValue);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public final KotlinJvmBinaryClass.AnnotationArgumentVisitor b(ClassId classId2, Name name2) {
                    return this.f43977a.b(classId2, name2);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public final void c(Name name2, ClassId classId2, Name name3) {
                    this.f43977a.h(name2, new EnumValue(classId2, name3));
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public final void d(Name name2, ClassLiteralValue classLiteralValue) {
                    this.f43977a.d(name2, classLiteralValue);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public final void e(Object obj, Name name2) {
                    this.f43977a.e(obj, name2);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public final KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor f(Name name2) {
                    return this.f43977a.f(name2);
                }
            };
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final void c(Name name, ClassId classId, Name name2) {
            h(name, new EnumValue(classId, name2));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final void d(Name name, ClassLiteralValue classLiteralValue) {
            h(name, new KClassValue(new KClassValue.Value.NormalClass(classLiteralValue)));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final void e(Object obj, Name name) {
            ConstantValue constantValueB = ConstantValueFactory.f44303a.b(obj, BinaryClassAnnotationAndConstantLoaderImpl.this.f43974c);
            if (constantValueB == null) {
                String message = "Unsupported annotation argument: " + name;
                Intrinsics.f(message, "message");
                constantValueB = new ErrorValue.ErrorValueWithMessage(message);
            }
            h(name, constantValueB);
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor f(Name name) {
            return new BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitArray$1(BinaryClassAnnotationAndConstantLoaderImpl.this, name, this);
        }

        public abstract void g(ArrayList arrayList, Name name);

        public abstract void h(Name name, ConstantValue constantValue);
    }

    public BinaryClassAnnotationAndConstantLoaderImpl(ModuleDescriptorImpl moduleDescriptorImpl, NotFoundClasses notFoundClasses, LockBasedStorageManager lockBasedStorageManager, ReflectKotlinClassFinder reflectKotlinClassFinder) {
        super(lockBasedStorageManager, reflectKotlinClassFinder);
        this.f43974c = moduleDescriptorImpl;
        this.d = notFoundClasses;
        this.f43975e = new AnnotationDeserializer(moduleDescriptorImpl, notFoundClasses);
        this.f = JvmMetadataVersion.g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    public final JvmMetadataVersion o() {
        return this.f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    public final BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1 r(ClassId classId, SourceElement sourceElement, List result) {
        Intrinsics.f(result, "result");
        return new BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1(this, FindClassInModuleKt.c(this.f43974c, classId, this.d), classId, result, sourceElement);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    public final AnnotationDescriptorImpl u(ProtoBuf.Annotation annotation, NameResolver nameResolver) {
        Intrinsics.f(nameResolver, "nameResolver");
        return this.f43975e.a(annotation, nameResolver);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader
    public final ConstantValue w(Object obj) {
        ConstantValue constantValue = (ConstantValue) obj;
        if (constantValue instanceof ByteValue) {
            return new UByteValue(((Number) ((ByteValue) constantValue).f44302a).byteValue());
        }
        if (constantValue instanceof ShortValue) {
            return new UShortValue(((Number) ((ShortValue) constantValue).f44302a).shortValue());
        }
        if (constantValue instanceof IntValue) {
            return new UIntValue(((Number) ((IntValue) constantValue).f44302a).intValue());
        }
        return constantValue instanceof LongValue ? new ULongValue(((Number) ((LongValue) constantValue).f44302a).longValue()) : constantValue;
    }
}
