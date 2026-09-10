package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: loaded from: classes7.dex */
public class JavaAnnotationDescriptor implements AnnotationDescriptor, PossiblyExternalAnnotationDescriptor {
    public static final /* synthetic */ KProperty[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FqName f43802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SourceElement f43803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NotNullLazyValue f43804c;
    public final JavaAnnotationArgument d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f43805e;

    static {
        ReflectionFactory reflectionFactory = Reflection.f43333a;
        f = new KProperty[]{reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(JavaAnnotationDescriptor.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};
    }

    public JavaAnnotationDescriptor(final LazyJavaResolverContext c2, JavaAnnotation javaAnnotation, FqName fqName) {
        Intrinsics.f(c2, "c");
        Intrinsics.f(fqName, "fqName");
        this.f43802a = fqName;
        JavaResolverComponents javaResolverComponents = c2.f43840a;
        this.f43803b = javaAnnotation != null ? javaResolverComponents.j.a(javaAnnotation) : SourceElement.f43591a;
        this.f43804c = javaResolverComponents.f43824a.a(new Function0<SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor$type$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SimpleType simpleTypeO = c2.f43840a.o.e0.i(this.f43802a).o();
                Intrinsics.e(simpleTypeO, "c.module.builtIns.getBui…qName(fqName).defaultType");
                return simpleTypeO;
            }
        });
        this.d = javaAnnotation != null ? (JavaAnnotationArgument) CollectionsKt.x(javaAnnotation.getArguments()) : null;
        this.f43805e = false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public Map a() {
        return EmptyMap.X;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor
    public final boolean b() {
        return this.f43805e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final FqName c() {
        return this.f43802a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final SourceElement f() {
        return this.f43803b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final KotlinType getType() {
        return (SimpleType) StorageKt.a(this.f43804c, f[0]);
    }
}
