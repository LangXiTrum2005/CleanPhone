package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.MappingUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.FakePureImplementationsProvider;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.InnerClassesScopeWrapper;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: loaded from: classes7.dex */
public final class LazyJavaClassDescriptor extends ClassDescriptorBase implements JavaClassDescriptor {
    public final LazyJavaResolverContext h0;
    public final JavaClass i0;
    public final ClassDescriptor j0;
    public final LazyJavaResolverContext k0;
    public final Lazy l0;
    public final ClassKind m0;
    public final Modality n0;
    public final Visibility o0;
    public final boolean p0;
    public final LazyJavaClassTypeConstructor q0;
    public final LazyJavaClassMemberScope r0;
    public final ScopesHolderForClass s0;
    public final InnerClassesScopeWrapper t0;
    public final LazyJavaStaticClassScope u0;
    public final LazyJavaAnnotations v0;
    public final NotNullLazyValue w0;

    public static final class Companion {
    }

    public final class LazyJavaClassTypeConstructor extends AbstractClassTypeConstructor {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final NotNullLazyValue f43864c;

        public LazyJavaClassTypeConstructor() {
            super(LazyJavaClassDescriptor.this.k0.f43840a.f43824a);
            this.f43864c = LazyJavaClassDescriptor.this.k0.f43840a.f43824a.a(new Function0<List<? extends TypeParameterDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$LazyJavaClassTypeConstructor$parameters$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TypeParameterUtilsKt.b(lazyJavaClassDescriptor);
                }
            });
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final ClassifierDescriptor c() {
            return LazyJavaClassDescriptor.this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final boolean e() {
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x007e  */
        /* JADX WARN: Code duplicated, block: B:4:0x0027  */
        /* JADX WARN: Code duplicated, block: B:55:0x0151  */
        /* JADX WARN: Code duplicated, block: B:57:0x0178  */
        /* JADX WARN: Code duplicated, block: B:60:0x0181  */
        /* JADX WARN: Code duplicated, block: B:61:0x0186  */
        /* JADX WARN: Code duplicated, block: B:70:0x019c  */
        /* JADX WARN: Code duplicated, block: B:71:0x01ae  */
        /* JADX WARN: Code duplicated, block: B:74:0x01bb  */
        /* JADX WARN: Code duplicated, block: B:77:0x01d0 A[LOOP:1: B:75:0x01ca->B:77:0x01d0, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:80:0x01eb  */
        /* JADX WARN: Code duplicated, block: B:82:0x01f1  */
        /* JADX WARN: Code duplicated, block: B:85:0x01f8  */
        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final Collection g() {
            String str;
            FqName fqName;
            FqName fqName2;
            ArrayList arrayList;
            SimpleType simpleTypeC;
            ClassDescriptor classDescriptor;
            KotlinType kotlinTypeI;
            List listH;
            ArrayList arrayList2;
            KotlinType kotlinTypeD;
            TypeConstructor typeConstructorH0;
            TypeConstructor typeConstructorH1;
            LazyJavaClassDescriptor lazyJavaClassDescriptor = LazyJavaClassDescriptor.this;
            Collection<JavaClassifierType> collectionD = lazyJavaClassDescriptor.i0.d();
            ArrayList arrayList3 = new ArrayList(collectionD.size());
            ArrayList<JavaType> arrayList4 = new ArrayList(0);
            FqName PURELY_IMPLEMENTS_ANNOTATION = JvmAnnotationNames.f43772n;
            Intrinsics.e(PURELY_IMPLEMENTS_ANNOTATION, "PURELY_IMPLEMENTS_ANNOTATION");
            AnnotationDescriptor annotationDescriptorB = lazyJavaClassDescriptor.v0.b(PURELY_IMPLEMENTS_ANNOTATION);
            if (annotationDescriptorB == null) {
                fqName = null;
            } else {
                Object objX = CollectionsKt.X(annotationDescriptorB.a().values());
                StringValue stringValue = objX instanceof StringValue ? (StringValue) objX : null;
                if (stringValue == null || (str = (String) stringValue.f44302a) == null || !FqNamesUtilKt.a(str)) {
                    fqName = null;
                } else {
                    fqName = new FqName(str);
                }
            }
            if (fqName == null || fqName.d() || !fqName.h(StandardNames.j)) {
                fqName = null;
            }
            Variance variance = Variance.INVARIANT;
            LazyJavaResolverContext lazyJavaResolverContext = lazyJavaClassDescriptor.k0;
            if (fqName == null) {
                LinkedHashMap linkedHashMap = FakePureImplementationsProvider.f43737a;
                fqName2 = (FqName) FakePureImplementationsProvider.f43738b.get(DescriptorUtilsKt.g(lazyJavaClassDescriptor));
                if (fqName2 == null) {
                    simpleTypeC = null;
                }
                for (JavaClassifierType javaClassifierType : collectionD) {
                    kotlinTypeD = lazyJavaResolverContext.f43840a.r.d(lazyJavaResolverContext.f43843e.d(javaClassifierType, JavaTypeAttributesKt.a(TypeUsage.X, false, null, 7)), lazyJavaResolverContext);
                    if (kotlinTypeD.H0().c() instanceof NotFoundClasses.MockClassDescriptor) {
                        arrayList4.add(javaClassifierType);
                    }
                    typeConstructorH0 = kotlinTypeD.H0();
                    if (simpleTypeC != null) {
                        typeConstructorH1 = simpleTypeC.H0();
                    } else {
                        typeConstructorH1 = null;
                    }
                    if (!Intrinsics.a(typeConstructorH0, typeConstructorH1) && !KotlinBuiltIns.w(kotlinTypeD)) {
                        arrayList3.add(kotlinTypeD);
                    }
                }
                classDescriptor = lazyJavaClassDescriptor.j0;
                if (classDescriptor != null) {
                    kotlinTypeI = new TypeSubstitutor(MappingUtilKt.a(classDescriptor, lazyJavaClassDescriptor)).i(classDescriptor.o(), variance);
                } else {
                    kotlinTypeI = null;
                }
                kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.a(arrayList3, kotlinTypeI);
                kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.a(arrayList3, simpleTypeC);
                if (!arrayList4.isEmpty()) {
                    if (arrayList3.isEmpty()) {
                        listH = CollectionsKt.H(lazyJavaResolverContext.f43840a.o.e0.e());
                    } else {
                        listH = CollectionsKt.i0(arrayList3);
                    }
                    return listH;
                }
                JavaResolverComponents javaResolverComponents = lazyJavaResolverContext.f43840a;
                arrayList2 = new ArrayList(CollectionsKt.n(arrayList4, 10));
                for (JavaType javaType : arrayList4) {
                    Intrinsics.d(javaType, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                    arrayList2.add(((JavaClassifierType) javaType).y());
                }
                javaResolverComponents.f.a(lazyJavaClassDescriptor, arrayList2);
                throw null;
            }
            fqName2 = fqName;
            JavaResolverComponents javaResolverComponents2 = lazyJavaResolverContext.f43840a;
            NoLookupLocation noLookupLocation = NoLookupLocation.i0;
            int i2 = DescriptorUtilsKt.f44314a;
            ModuleDescriptorImpl moduleDescriptorImpl = javaResolverComponents2.o;
            Intrinsics.f(moduleDescriptorImpl, "<this>");
            fqName2.d();
            FqName fqNameE = fqName2.e();
            Intrinsics.e(fqNameE, "topLevelClassFqName.parent()");
            MemberScope memberScopeN = moduleDescriptorImpl.e0(fqNameE).n();
            Name nameF = fqName2.f();
            Intrinsics.e(nameF, "topLevelClassFqName.shortName()");
            ClassifierDescriptor classifierDescriptorF = ((AbstractScopeAdapter) memberScopeN).f(nameF, noLookupLocation);
            ClassDescriptor classDescriptor2 = classifierDescriptorF instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorF : null;
            if (classDescriptor2 == null) {
                simpleTypeC = null;
            } else {
                int size = classDescriptor2.h().getParameters().size();
                List parameters = lazyJavaClassDescriptor.q0.getParameters();
                Intrinsics.e(parameters, "getTypeConstructor().parameters");
                int size2 = parameters.size();
                if (size2 == size) {
                    List list = parameters;
                    arrayList = new ArrayList(CollectionsKt.n(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new TypeProjectionImpl(((TypeParameterDescriptor) it.next()).o(), variance));
                    }
                } else if (size2 == 1 && size > 1 && fqName == null) {
                    TypeProjectionImpl typeProjectionImpl = new TypeProjectionImpl(((TypeParameterDescriptor) CollectionsKt.W(parameters)).o(), variance);
                    IntRange intRange = new IntRange(1, size, 1);
                    ArrayList arrayList5 = new ArrayList(CollectionsKt.n(intRange, 10));
                    Iterator<Integer> it2 = intRange.iterator();
                    while (((IntProgressionIterator) it2).Z) {
                        ((IntIterator) it2).a();
                        arrayList5.add(typeProjectionImpl);
                    }
                    arrayList = arrayList5;
                } else {
                    simpleTypeC = null;
                }
                TypeAttributes.f44529Y.getClass();
                simpleTypeC = KotlinTypeFactory.c(TypeAttributes.Z, classDescriptor2, arrayList);
            }
            while (r1.hasNext()) {
                kotlinTypeD = lazyJavaResolverContext.f43840a.r.d(lazyJavaResolverContext.f43843e.d(javaClassifierType, JavaTypeAttributesKt.a(TypeUsage.X, false, null, 7)), lazyJavaResolverContext);
                if (kotlinTypeD.H0().c() instanceof NotFoundClasses.MockClassDescriptor) {
                    arrayList4.add(javaClassifierType);
                }
                typeConstructorH0 = kotlinTypeD.H0();
                if (simpleTypeC != null) {
                    typeConstructorH1 = simpleTypeC.H0();
                } else {
                    typeConstructorH1 = null;
                }
                if (!Intrinsics.a(typeConstructorH0, typeConstructorH1)) {
                    arrayList3.add(kotlinTypeD);
                }
            }
            classDescriptor = lazyJavaClassDescriptor.j0;
            if (classDescriptor != null) {
                kotlinTypeI = new TypeSubstitutor(MappingUtilKt.a(classDescriptor, lazyJavaClassDescriptor)).i(classDescriptor.o(), variance);
            } else {
                kotlinTypeI = null;
            }
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.a(arrayList3, kotlinTypeI);
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.a(arrayList3, simpleTypeC);
            if (!arrayList4.isEmpty()) {
                if (arrayList3.isEmpty()) {
                    listH = CollectionsKt.i0(arrayList3);
                } else {
                    listH = CollectionsKt.H(lazyJavaResolverContext.f43840a.o.e0.e());
                }
                return listH;
            }
            JavaResolverComponents javaResolverComponents3 = lazyJavaResolverContext.f43840a;
            arrayList2 = new ArrayList(CollectionsKt.n(arrayList4, 10));
            while (r3.hasNext()) {
                Intrinsics.d(javaType, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                arrayList2.add(((JavaClassifierType) javaType).y());
            }
            javaResolverComponents3.f.a(lazyJavaClassDescriptor, arrayList2);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final List getParameters() {
            return (List) this.f43864c.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        public final SupertypeLoopChecker j() {
            return LazyJavaClassDescriptor.this.k0.f43840a.m;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor
        /* JADX INFO: renamed from: p */
        public final ClassDescriptor c() {
            return LazyJavaClassDescriptor.this;
        }

        public final String toString() {
            String strB = LazyJavaClassDescriptor.this.getName().b();
            Intrinsics.e(strB, "name.asString()");
            return strB;
        }
    }

    static {
        ArraysKt.O(new String[]{"equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LazyJavaClassDescriptor(LazyJavaResolverContext outerContext, DeclarationDescriptor containingDeclaration, JavaClass jClass, ClassDescriptor classDescriptor) {
        Intrinsics.f(outerContext, "outerContext");
        Intrinsics.f(containingDeclaration, "containingDeclaration");
        Intrinsics.f(jClass, "jClass");
        JavaResolverComponents javaResolverComponents = outerContext.f43840a;
        super(javaResolverComponents.f43824a, containingDeclaration, jClass.getName(), javaResolverComponents.j.a(jClass));
        this.h0 = outerContext;
        this.i0 = jClass;
        this.j0 = classDescriptor;
        LazyJavaResolverContext lazyJavaResolverContextA = ContextKt.a(outerContext, this, jClass, 4);
        this.k0 = lazyJavaResolverContextA;
        JavaResolverComponents javaResolverComponents2 = lazyJavaResolverContextA.f43840a;
        javaResolverComponents2.g.getClass();
        this.l0 = LazyKt.b(new Function0<List<? extends JavaAnnotation>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$moduleAnnotations$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                LazyJavaClassDescriptor lazyJavaClassDescriptor = this.X;
                if (DescriptorUtilsKt.f(lazyJavaClassDescriptor) != null) {
                    lazyJavaClassDescriptor.h0.f43840a.f43834w.getClass();
                }
                return null;
            }
        });
        this.m0 = jClass.k() ? ClassKind.f0 : jClass.C() ? ClassKind.f43559Y : jClass.p() ? ClassKind.Z : ClassKind.X;
        boolean zK = jClass.k();
        Modality modality = Modality.X;
        if (!zK && !jClass.p()) {
            boolean zR = jClass.r();
            boolean z2 = jClass.r() || jClass.isAbstract() || jClass.C();
            boolean zIsFinal = jClass.isFinal();
            if (zR) {
                modality = Modality.f43574Y;
            } else if (z2) {
                modality = Modality.e0;
            } else if (!zIsFinal) {
                modality = Modality.Z;
            }
        }
        this.n0 = modality;
        this.o0 = jClass.getVisibility();
        this.p0 = (jClass.l() == null || jClass.f()) ? false : true;
        this.q0 = new LazyJavaClassTypeConstructor();
        LazyJavaClassMemberScope lazyJavaClassMemberScope = new LazyJavaClassMemberScope(lazyJavaResolverContextA, this, jClass, classDescriptor != null, null);
        this.r0 = lazyJavaClassMemberScope;
        ScopesHolderForClass.Companion companion = ScopesHolderForClass.f43587e;
        LockBasedStorageManager storageManager = javaResolverComponents2.f43824a;
        javaResolverComponents2.f43833u.getClass();
        KotlinTypeRefiner.Default r7 = KotlinTypeRefiner.Default.f44564a;
        Function1<KotlinTypeRefiner, LazyJavaClassMemberScope> function1 = new Function1<KotlinTypeRefiner, LazyJavaClassMemberScope>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$scopeHolder$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                KotlinTypeRefiner it = (KotlinTypeRefiner) obj;
                Intrinsics.f(it, "it");
                LazyJavaClassDescriptor lazyJavaClassDescriptor = this.X;
                return new LazyJavaClassMemberScope(lazyJavaClassDescriptor.k0, lazyJavaClassDescriptor, lazyJavaClassDescriptor.i0, lazyJavaClassDescriptor.j0 != null, lazyJavaClassDescriptor.r0);
            }
        };
        companion.getClass();
        Intrinsics.f(storageManager, "storageManager");
        this.s0 = new ScopesHolderForClass(this, storageManager, function1, r7);
        this.t0 = new InnerClassesScopeWrapper(lazyJavaClassMemberScope);
        this.u0 = new LazyJavaStaticClassScope(lazyJavaResolverContextA, jClass, this);
        this.v0 = LazyJavaAnnotationsKt.a(lazyJavaResolverContextA, jClass);
        this.w0 = storageManager.a(new Function0<List<? extends TypeParameterDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$declaredParameters$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                LazyJavaClassDescriptor lazyJavaClassDescriptor = this.X;
                ArrayList<JavaTypeParameter> typeParameters = lazyJavaClassDescriptor.i0.getTypeParameters();
                ArrayList arrayList = new ArrayList(CollectionsKt.n(typeParameters, 10));
                for (JavaTypeParameter javaTypeParameter : typeParameters) {
                    TypeParameterDescriptor typeParameterDescriptorA = lazyJavaClassDescriptor.k0.f43841b.a(javaTypeParameter);
                    if (typeParameterDescriptorA == null) {
                        throw new AssertionError("Parameter " + javaTypeParameter + " surely belongs to class " + lazyJavaClassDescriptor.i0 + ", so it must be resolved");
                    }
                    arrayList.add(typeParameterDescriptorA);
                }
                return arrayList;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean D0() {
        return false;
    }

    public final LazyJavaClassMemberScope G0() {
        return (LazyJavaClassMemberScope) super.Q();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final MemberScope N() {
        return this.t0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final ValueClassRepresentation O() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final MemberScope Q() {
        return (LazyJavaClassMemberScope) super.Q();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean R() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean T() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean W() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean b0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public final MemberScope c0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.f(kotlinTypeRefiner, "kotlinTypeRefiner");
        return (LazyJavaClassMemberScope) this.s0.a(kotlinTypeRefiner);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean d0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final MemberScope f0() {
        return this.u0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final ClassDescriptor g0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public final Annotations getAnnotations() {
        return this.v0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final ClassKind getKind() {
        return this.m0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility = DescriptorVisibilities.f43561a;
        Visibility visibility = this.o0;
        if (!Intrinsics.a(visibility, descriptorVisibility) || this.i0.l() != null) {
            return UtilsKt.a(visibility);
        }
        DescriptorVisibility descriptorVisibility2 = JavaDescriptorVisibilities.f43746a;
        Intrinsics.e(descriptorVisibility2, "{\n            JavaDescri…KAGE_VISIBILITY\n        }");
        return descriptorVisibility2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public final TypeConstructor h() {
        return this.q0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final Collection i() {
        return (List) this.r0.q.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public final List p() {
        return (List) this.w0.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final Modality q() {
        return this.n0;
    }

    public final String toString() {
        return "Lazy Java class " + DescriptorUtilsKt.h(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final Collection u() {
        if (this.n0 != Modality.f43574Y) {
            return EmptyList.X;
        }
        JavaTypeAttributes javaTypeAttributesA = JavaTypeAttributesKt.a(TypeUsage.f44554Y, false, null, 7);
        Collection collectionW = this.i0.w();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionW.iterator();
        while (it.hasNext()) {
            ClassifierDescriptor classifierDescriptorC = this.k0.f43843e.d((JavaClassifierType) it.next(), javaTypeAttributesA).H0().c();
            ClassDescriptor classDescriptor = classifierDescriptorC instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorC : null;
            if (classDescriptor != null) {
                arrayList.add(classDescriptor);
            }
        }
        return CollectionsKt.c0(new LazyJavaClassDescriptor$getSealedSubclasses$$inlined$sortedBy$1(), arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public final boolean w() {
        return this.p0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public final ClassConstructorDescriptor z() {
        return null;
    }
}
