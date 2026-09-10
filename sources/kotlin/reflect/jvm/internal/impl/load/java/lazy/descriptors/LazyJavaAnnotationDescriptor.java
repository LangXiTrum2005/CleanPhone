package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationAsAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassObjectAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaLiteralAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.NullValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.TypedArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* JADX INFO: loaded from: classes7.dex */
public final class LazyJavaAnnotationDescriptor implements AnnotationDescriptor, PossiblyExternalAnnotationDescriptor {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f43858i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LazyJavaResolverContext f43859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JavaAnnotation f43860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NullableLazyValue f43861c;
    public final NotNullLazyValue d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final JavaSourceElement f43862e;
    public final NotNullLazyValue f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f43863h;

    static {
        ReflectionFactory reflectionFactory = Reflection.f43333a;
        f43858i = new KProperty[]{reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(LazyJavaAnnotationDescriptor.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(LazyJavaAnnotationDescriptor.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(LazyJavaAnnotationDescriptor.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    public LazyJavaAnnotationDescriptor(LazyJavaResolverContext c2, JavaAnnotation javaAnnotation, boolean z2) {
        Intrinsics.f(c2, "c");
        Intrinsics.f(javaAnnotation, "javaAnnotation");
        this.f43859a = c2;
        this.f43860b = javaAnnotation;
        JavaResolverComponents javaResolverComponents = c2.f43840a;
        LockBasedStorageManager lockBasedStorageManager = javaResolverComponents.f43824a;
        this.f43861c = lockBasedStorageManager.b(new Function0<FqName>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor$fqName$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.X.f43860b.a().b();
            }
        });
        this.d = lockBasedStorageManager.a(new Function0<SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor$type$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor = this.X;
                FqName fqNameC = lazyJavaAnnotationDescriptor.c();
                JavaAnnotation javaAnnotation2 = lazyJavaAnnotationDescriptor.f43860b;
                if (fqNameC == null) {
                    return ErrorUtils.c(ErrorTypeKind.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, javaAnnotation2.toString());
                }
                LazyJavaResolverContext lazyJavaResolverContext = lazyJavaAnnotationDescriptor.f43859a;
                ClassDescriptor classDescriptorB = JavaToKotlinClassMapper.b(fqNameC, lazyJavaResolverContext.f43840a.o.e0);
                if (classDescriptorB == null) {
                    ReflectJavaClass reflectJavaClassQ = javaAnnotation2.q();
                    JavaResolverComponents javaResolverComponents2 = lazyJavaResolverContext.f43840a;
                    classDescriptorB = javaResolverComponents2.k.a(reflectJavaClassQ);
                    if (classDescriptorB == null) {
                        classDescriptorB = FindClassInModuleKt.c(javaResolverComponents2.o, ClassId.j(fqNameC), javaResolverComponents2.d.c().f44397l);
                    }
                }
                return classDescriptorB.o();
            }
        });
        this.f43862e = javaResolverComponents.j.a(javaAnnotation);
        this.f = lockBasedStorageManager.a(new Function0<Map<Name, ? extends ConstantValue<?>>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor$allValueArguments$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor = this.X;
                ArrayList<JavaAnnotationArgument> arguments = lazyJavaAnnotationDescriptor.f43860b.getArguments();
                ArrayList arrayList = new ArrayList();
                for (JavaAnnotationArgument javaAnnotationArgument : arguments) {
                    Name name = javaAnnotationArgument.getName();
                    if (name == null) {
                        name = JvmAnnotationNames.f43766b;
                    }
                    ConstantValue constantValueD = lazyJavaAnnotationDescriptor.d(javaAnnotationArgument);
                    Pair pair = constantValueD != null ? new Pair(name, constantValueD) : null;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                return MapsKt.p(arrayList);
            }
        });
        this.g = false;
        this.f43863h = z2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final Map a() {
        return (Map) StorageKt.a(this.f, f43858i[2]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor
    public final boolean b() {
        return this.g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final FqName c() {
        KProperty p2 = f43858i[0];
        NullableLazyValue nullableLazyValue = this.f43861c;
        Intrinsics.f(nullableLazyValue, "<this>");
        Intrinsics.f(p2, "p");
        return (FqName) nullableLazyValue.invoke();
    }

    public final ConstantValue d(JavaAnnotationArgument javaAnnotationArgument) {
        KotlinType kotlinTypeG;
        boolean z2 = javaAnnotationArgument instanceof JavaLiteralAnnotationArgument;
        ConstantValueFactory constantValueFactory = ConstantValueFactory.f44303a;
        if (z2) {
            return constantValueFactory.b(((JavaLiteralAnnotationArgument) javaAnnotationArgument).getValue(), null);
        }
        if (javaAnnotationArgument instanceof JavaEnumValueAnnotationArgument) {
            JavaEnumValueAnnotationArgument javaEnumValueAnnotationArgument = (JavaEnumValueAnnotationArgument) javaAnnotationArgument;
            return new EnumValue(javaEnumValueAnnotationArgument.d(), javaEnumValueAnnotationArgument.e());
        }
        boolean z3 = javaAnnotationArgument instanceof JavaArrayAnnotationArgument;
        LazyJavaResolverContext lazyJavaResolverContext = this.f43859a;
        if (z3) {
            JavaArrayAnnotationArgument javaArrayAnnotationArgument = (JavaArrayAnnotationArgument) javaAnnotationArgument;
            Name name = javaArrayAnnotationArgument.getName();
            if (name == null) {
                name = JvmAnnotationNames.f43766b;
            }
            Intrinsics.e(name, "argument.name ?: DEFAULT_ANNOTATION_MEMBER_NAME");
            ArrayList arrayListC = javaArrayAnnotationArgument.c();
            SimpleType type = (SimpleType) StorageKt.a(this.d, f43858i[1]);
            Intrinsics.e(type, "type");
            if (!KotlinTypeKt.a(type)) {
                ClassDescriptor classDescriptorD = DescriptorUtilsKt.d(this);
                Intrinsics.c(classDescriptorD);
                ValueParameterDescriptor valueParameterDescriptorB = DescriptorResolverUtils.b(name, classDescriptorD);
                if (valueParameterDescriptorB == null || (kotlinTypeG = valueParameterDescriptorB.getType()) == null) {
                    kotlinTypeG = lazyJavaResolverContext.f43840a.o.e0.g(ErrorUtils.c(ErrorTypeKind.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]));
                }
                ArrayList arrayList = new ArrayList(CollectionsKt.n(arrayListC, 10));
                Iterator it = arrayListC.iterator();
                while (it.hasNext()) {
                    ConstantValue constantValueD = d((JavaAnnotationArgument) it.next());
                    if (constantValueD == null) {
                        constantValueD = new NullValue(null);
                    }
                    arrayList.add(constantValueD);
                }
                return new TypedArrayValue(arrayList, kotlinTypeG);
            }
        } else {
            if (javaAnnotationArgument instanceof JavaAnnotationAsAnnotationArgument) {
                return new AnnotationValue((Object) new LazyJavaAnnotationDescriptor(lazyJavaResolverContext, ((JavaAnnotationAsAnnotationArgument) javaAnnotationArgument).a(), false));
            }
            if (javaAnnotationArgument instanceof JavaClassObjectAnnotationArgument) {
                KotlinType kotlinTypeD = lazyJavaResolverContext.f43843e.d(((JavaClassObjectAnnotationArgument) javaAnnotationArgument).b(), JavaTypeAttributesKt.a(TypeUsage.f44554Y, false, null, 7));
                if (!KotlinTypeKt.a(kotlinTypeD)) {
                    KotlinType type2 = kotlinTypeD;
                    int i2 = 0;
                    while (KotlinBuiltIns.x(type2)) {
                        type2 = ((TypeProjection) CollectionsKt.W(type2.F0())).getType();
                        Intrinsics.e(type2, "type.arguments.single().type");
                        i2++;
                    }
                    ClassifierDescriptor classifierDescriptorC = type2.H0().c();
                    if (classifierDescriptorC instanceof ClassDescriptor) {
                        ClassId classIdF = DescriptorUtilsKt.f(classifierDescriptorC);
                        return classIdF == null ? new KClassValue(new KClassValue.Value.LocalClass(kotlinTypeD)) : new KClassValue(classIdF, i2);
                    }
                    if (classifierDescriptorC instanceof TypeParameterDescriptor) {
                        return new KClassValue(ClassId.j(StandardNames.FqNames.f43494a.g()), 0);
                    }
                }
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final SourceElement f() {
        return this.f43862e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final KotlinType getType() {
        return (SimpleType) StorageKt.a(this.d, f43858i[1]);
    }

    public final String toString() {
        return DescriptorRenderer.f44237a.y(this, null);
    }
}
