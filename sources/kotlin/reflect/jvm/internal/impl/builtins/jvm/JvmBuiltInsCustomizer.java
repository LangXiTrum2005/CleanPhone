package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import androidx.media3.extractor.text.ttml.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilterKt;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureBuildingUtilsKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

/* JADX INFO: loaded from: classes7.dex */
public final class JvmBuiltInsCustomizer implements AdditionalClassPartsProvider, PlatformDependentDeclarationFilter {
    public static final /* synthetic */ KProperty[] g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ModuleDescriptorImpl f43542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NotNullLazyValue f43543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SimpleType f43544c;
    public final NotNullLazyValue d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CacheWithNotNullValues f43545e;
    public final NotNullLazyValue f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class JDKMemberStatus {
        public static final JDKMemberStatus X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final JDKMemberStatus f43548Y;
        public static final JDKMemberStatus Z;
        public static final JDKMemberStatus e0;
        public static final /* synthetic */ JDKMemberStatus[] f0;

        static {
            JDKMemberStatus jDKMemberStatus = new JDKMemberStatus("HIDDEN", 0);
            X = jDKMemberStatus;
            JDKMemberStatus jDKMemberStatus2 = new JDKMemberStatus("VISIBLE", 1);
            f43548Y = jDKMemberStatus2;
            JDKMemberStatus jDKMemberStatus3 = new JDKMemberStatus("NOT_CONSIDERED", 2);
            Z = jDKMemberStatus3;
            JDKMemberStatus jDKMemberStatus4 = new JDKMemberStatus("DROP", 3);
            e0 = jDKMemberStatus4;
            f0 = new JDKMemberStatus[]{jDKMemberStatus, jDKMemberStatus2, jDKMemberStatus3, jDKMemberStatus4};
        }

        public static JDKMemberStatus valueOf(String str) {
            return (JDKMemberStatus) Enum.valueOf(JDKMemberStatus.class, str);
        }

        public static JDKMemberStatus[] values() {
            return (JDKMemberStatus[]) f0.clone();
        }
    }

    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[JDKMemberStatus.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        ReflectionFactory reflectionFactory = Reflection.f43333a;
        g = new KProperty[]{reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(JvmBuiltInsCustomizer.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(JvmBuiltInsCustomizer.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(JvmBuiltInsCustomizer.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};
    }

    public JvmBuiltInsCustomizer(ModuleDescriptorImpl moduleDescriptorImpl, final LockBasedStorageManager lockBasedStorageManager, Function0 function0) {
        this.f43542a = moduleDescriptorImpl;
        this.f43543b = lockBasedStorageManager.a(function0);
        ClassDescriptorImpl classDescriptorImpl = new ClassDescriptorImpl(new JvmBuiltInsCustomizer$createMockJavaIoSerializableType$mockJavaIoPackageFragment$1(moduleDescriptorImpl, new FqName("java.io")), Name.g("Serializable"), Modality.e0, ClassKind.f43559Y, CollectionsKt.H(new LazyWrappedType(lockBasedStorageManager, new Function0<KotlinType>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$createMockJavaIoSerializableType$superTypes$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SimpleType simpleTypeE = this.X.f43542a.e0.e();
                Intrinsics.e(simpleTypeE, "moduleDescriptor.builtIns.anyType");
                return simpleTypeE;
            }
        })), lockBasedStorageManager);
        classDescriptorImpl.G0(MemberScope.Empty.f44351b, EmptySet.X, null);
        SimpleType simpleTypeO = classDescriptorImpl.o();
        Intrinsics.e(simpleTypeO, "mockSerializableClass.defaultType");
        this.f43544c = simpleTypeO;
        this.d = lockBasedStorageManager.a(new Function0<SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$cloneableType$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KProperty[] kPropertyArr = JvmBuiltInsCustomizer.g;
                JvmBuiltInsCustomizer jvmBuiltInsCustomizer = this.X;
                ModuleDescriptorImpl moduleDescriptorImpl2 = jvmBuiltInsCustomizer.g().f43540a;
                JvmBuiltInClassDescriptorFactory.d.getClass();
                return FindClassInModuleKt.c(moduleDescriptorImpl2, JvmBuiltInClassDescriptorFactory.f43533h, new NotFoundClasses(lockBasedStorageManager, jvmBuiltInsCustomizer.g().f43540a)).o();
            }
        });
        this.f43545e = lockBasedStorageManager.e();
        this.f = lockBasedStorageManager.a(new Function0<Annotations>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$notConsideredDeprecation$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Annotations.Companion.a(CollectionsKt.H(AnnotationUtilKt.a(this.X.f43542a.e0)));
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0127  */
    /* JADX WARN: Code duplicated, block: B:59:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:80:0x0226  */
    /* JADX WARN: Code duplicated, block: B:81:0x0228  */
    /* JADX WARN: Code duplicated, block: B:83:0x0244  */
    /* JADX WARN: Code duplicated, block: B:96:0x02cc  */
    /* JADX WARN: Instruction removed from duplicated block: B:59:0x01b6, please report this as an issue */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    public final Collection a(final Name name, ClassDescriptor classDescriptor) {
        SimpleFunctionDescriptor simpleFunctionDescriptor;
        List listH;
        Object objH;
        DeclarationDescriptor declarationDescriptorD;
        boolean zBooleanValue;
        boolean z2;
        Intrinsics.f(name, "name");
        Intrinsics.f(classDescriptor, "classDescriptor");
        boolean zEquals = name.equals(CloneableClassScope.f43520e);
        List<SimpleFunctionDescriptor> list = EmptyList.X;
        KProperty[] kPropertyArr = g;
        if (zEquals && (classDescriptor instanceof DeserializedClassDescriptor)) {
            Name name2 = KotlinBuiltIns.f;
            if (KotlinBuiltIns.b(classDescriptor, StandardNames.FqNames.g) || KotlinBuiltIns.q(classDescriptor) != null) {
                DeserializedClassDescriptor deserializedClassDescriptor = (DeserializedClassDescriptor) classDescriptor;
                List list2 = deserializedClassDescriptor.f0.r0;
                Intrinsics.e(list2, "classDescriptor.classProto.functionList");
                List list3 = list2;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        if (NameResolverUtilKt.b(deserializedClassDescriptor.m0.f44402b, ((ProtoBuf.Function) it.next()).g0).equals(CloneableClassScope.f43520e)) {
                            return list;
                        }
                    }
                }
                FunctionDescriptor.CopyBuilder copyBuilderA0 = ((SimpleFunctionDescriptor) CollectionsKt.V(((SimpleType) StorageKt.a(this.d, kPropertyArr[1])).n().d(name, NoLookupLocation.X))).A0();
                copyBuilderA0.i(deserializedClassDescriptor);
                copyBuilderA0.f(DescriptorVisibilities.f43564e);
                copyBuilderA0.n(deserializedClassDescriptor.o());
                copyBuilderA0.b(deserializedClassDescriptor.E0());
                FunctionDescriptor functionDescriptorBuild = copyBuilderA0.build();
                Intrinsics.c(functionDescriptorBuild);
                return CollectionsKt.H((SimpleFunctionDescriptor) functionDescriptorBuild);
            }
        }
        g().getClass();
        Function1<MemberScope, Collection<? extends SimpleFunctionDescriptor>> function1 = new Function1<MemberScope, Collection<? extends SimpleFunctionDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$getFunctions$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                MemberScope it2 = (MemberScope) obj;
                Intrinsics.f(it2, "it");
                return it2.d(name, NoLookupLocation.X);
            }
        };
        final LazyJavaClassDescriptor lazyJavaClassDescriptorF = f(classDescriptor);
        if (lazyJavaClassDescriptorF != null) {
            FqName fqNameG = DescriptorUtilsKt.g(lazyJavaClassDescriptorF);
            KotlinBuiltIns builtIns = FallbackBuiltIns.g;
            Intrinsics.f(builtIns, "builtIns");
            ClassDescriptor classDescriptorB = JavaToKotlinClassMapper.b(fqNameG, builtIns);
            if (classDescriptorB == null) {
                listH = EmptySet.X;
            } else {
                String str = JavaToKotlinClassMap.f43521a;
                FqName fqName = (FqName) JavaToKotlinClassMap.k.get(DescriptorUtilsKt.h(classDescriptorB));
                listH = fqName == null ? SetsKt.h(classDescriptorB) : CollectionsKt.I(classDescriptorB, builtIns.i(fqName));
            }
            Iterable iterable = listH;
            if (iterable instanceof List) {
                List list4 = (List) iterable;
                if (list4.isEmpty()) {
                    objH = null;
                } else {
                    objH = a.h(1, list4);
                }
            } else {
                Iterator it2 = iterable.iterator();
                if (it2.hasNext()) {
                    Object next = it2.next();
                    while (it2.hasNext()) {
                        next = it2.next();
                    }
                    objH = next;
                } else {
                    objH = null;
                }
            }
            final ClassDescriptor classDescriptor2 = (ClassDescriptor) objH;
            if (classDescriptor2 != null) {
                int i2 = SmartSet.Z;
                ArrayList arrayList = new ArrayList(CollectionsKt.n(iterable, 10));
                Iterator it3 = iterable.iterator();
                while (it3.hasNext()) {
                    arrayList.add(DescriptorUtilsKt.g((ClassDescriptor) it3.next()));
                }
                SmartSet smartSet = new SmartSet();
                smartSet.addAll(arrayList);
                String str2 = JavaToKotlinClassMap.f43521a;
                boolean zContainsKey = JavaToKotlinClassMap.j.containsKey(DescriptorUtils.g(classDescriptor));
                MemberScope memberScopeQ = ((ClassDescriptor) this.f43545e.a(DescriptorUtilsKt.g(lazyJavaClassDescriptorF), new Function0<ClassDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$getAdditionalFunctions$fakeJavaClassDescriptor$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        LazyJavaClassDescriptor lazyJavaClassDescriptor = lazyJavaClassDescriptorF;
                        LazyJavaResolverContext lazyJavaResolverContext = lazyJavaClassDescriptor.k0;
                        JavaResolverComponents javaResolverComponents = lazyJavaResolverContext.f43840a;
                        LazyJavaResolverContext lazyJavaResolverContext2 = new LazyJavaResolverContext(new JavaResolverComponents(javaResolverComponents.f43824a, javaResolverComponents.f43825b, javaResolverComponents.f43826c, javaResolverComponents.d, javaResolverComponents.f43827e, javaResolverComponents.f, javaResolverComponents.f43828h, javaResolverComponents.f43829i, javaResolverComponents.j, javaResolverComponents.k, javaResolverComponents.f43830l, javaResolverComponents.m, javaResolverComponents.f43831n, javaResolverComponents.o, javaResolverComponents.f43832p, javaResolverComponents.q, javaResolverComponents.r, javaResolverComponents.s, javaResolverComponents.t, javaResolverComponents.f43833u, javaResolverComponents.v, javaResolverComponents.f43834w), lazyJavaResolverContext.f43841b, lazyJavaResolverContext.f43842c);
                        DeclarationDescriptor containingDeclaration = lazyJavaClassDescriptor.d();
                        Intrinsics.e(containingDeclaration, "containingDeclaration");
                        return new LazyJavaClassDescriptor(lazyJavaResolverContext2, containingDeclaration, lazyJavaClassDescriptor.i0, classDescriptor2);
                    }
                })).Q();
                Intrinsics.e(memberScopeQ, "fakeJavaClassDescriptor.unsubstitutedMemberScope");
                Iterable iterable2 = (Iterable) function1.invoke(memberScopeQ);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : iterable2) {
                    SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) obj;
                    if (simpleFunctionDescriptor2.getKind() == CallableMemberDescriptor.Kind.X && simpleFunctionDescriptor2.getVisibility().a().f43605b && !KotlinBuiltIns.B(simpleFunctionDescriptor2)) {
                        Collection collectionL = simpleFunctionDescriptor2.l();
                        Intrinsics.e(collectionL, "analogueMember.overriddenDescriptors");
                        Collection collection = collectionL;
                        if ((collection instanceof Collection) && collection.isEmpty()) {
                            declarationDescriptorD = simpleFunctionDescriptor2.d();
                            Intrinsics.d(declarationDescriptorD, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                            if (JvmBuiltInsSignatures.d.contains(MethodSignatureBuildingUtilsKt.a((ClassDescriptor) declarationDescriptorD, MethodSignatureMappingKt.a(simpleFunctionDescriptor2, 3))) ^ zContainsKey) {
                                zBooleanValue = true;
                            } else {
                                Boolean boolC = DFS.c(CollectionsKt.H(simpleFunctionDescriptor2), JvmBuiltInsCustomizer$$Lambda$0.f43546a, new Function1<CallableMemberDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$isMutabilityViolation$2
                                    {
                                        super(1);
                                    }

                                    /* JADX WARN: Code duplicated, block: B:7:0x002c  */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        boolean z3;
                                        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) obj2;
                                        if (callableMemberDescriptor.getKind() == CallableMemberDescriptor.Kind.X) {
                                            KProperty[] kPropertyArr2 = JvmBuiltInsCustomizer.g;
                                            this.X.getClass();
                                            DeclarationDescriptor declarationDescriptorD2 = callableMemberDescriptor.d();
                                            Intrinsics.d(declarationDescriptorD2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                                            String str3 = JavaToKotlinClassMap.f43521a;
                                            if (JavaToKotlinClassMap.j.containsKey(DescriptorUtils.g((ClassDescriptor) declarationDescriptorD2))) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                        } else {
                                            z3 = false;
                                        }
                                        return Boolean.valueOf(z3);
                                    }
                                });
                                Intrinsics.e(boolC, "private fun SimpleFuncti…scriptor)\n        }\n    }");
                                zBooleanValue = boolC.booleanValue();
                            }
                            if (zBooleanValue) {
                            }
                        } else {
                            Iterator it4 = collection.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    DeclarationDescriptor declarationDescriptorD2 = ((FunctionDescriptor) it4.next()).d();
                                    Intrinsics.e(declarationDescriptorD2, "it.containingDeclaration");
                                    if (smartSet.contains(DescriptorUtilsKt.g(declarationDescriptorD2))) {
                                    }
                                } else {
                                    declarationDescriptorD = simpleFunctionDescriptor2.d();
                                    Intrinsics.d(declarationDescriptorD, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                                    if (JvmBuiltInsSignatures.d.contains(MethodSignatureBuildingUtilsKt.a((ClassDescriptor) declarationDescriptorD, MethodSignatureMappingKt.a(simpleFunctionDescriptor2, 3))) ^ zContainsKey) {
                                        zBooleanValue = true;
                                    } else {
                                        Boolean boolC2 = DFS.c(CollectionsKt.H(simpleFunctionDescriptor2), JvmBuiltInsCustomizer$$Lambda$0.f43546a, new Function1<CallableMemberDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$isMutabilityViolation$2
                                            {
                                                super(1);
                                            }

                                            /* JADX WARN: Code duplicated, block: B:7:0x002c  */
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                boolean z3;
                                                CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) obj2;
                                                if (callableMemberDescriptor.getKind() == CallableMemberDescriptor.Kind.X) {
                                                    KProperty[] kPropertyArr2 = JvmBuiltInsCustomizer.g;
                                                    this.X.getClass();
                                                    DeclarationDescriptor declarationDescriptorD3 = callableMemberDescriptor.d();
                                                    Intrinsics.d(declarationDescriptorD3, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                                                    String str3 = JavaToKotlinClassMap.f43521a;
                                                    if (JavaToKotlinClassMap.j.containsKey(DescriptorUtils.g((ClassDescriptor) declarationDescriptorD3))) {
                                                        z3 = true;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                } else {
                                                    z3 = false;
                                                }
                                                return Boolean.valueOf(z3);
                                            }
                                        });
                                        Intrinsics.e(boolC2, "private fun SimpleFuncti…scriptor)\n        }\n    }");
                                        zBooleanValue = boolC2.booleanValue();
                                    }
                                    z2 = zBooleanValue ? false : true;
                                }
                            }
                        }
                    }
                    if (z2) {
                        arrayList2.add(obj);
                    }
                }
                list = arrayList2;
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (SimpleFunctionDescriptor simpleFunctionDescriptor3 : list) {
            DeclarationDescriptor declarationDescriptorD3 = simpleFunctionDescriptor3.d();
            Intrinsics.d(declarationDescriptorD3, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            FunctionDescriptor functionDescriptorB = simpleFunctionDescriptor3.b(new TypeSubstitutor(MappingUtilKt.a((ClassDescriptor) declarationDescriptorD3, classDescriptor)));
            Intrinsics.d(functionDescriptorB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor");
            FunctionDescriptor.CopyBuilder copyBuilderA1 = ((SimpleFunctionDescriptor) functionDescriptorB).A0();
            copyBuilderA1.i(classDescriptor);
            copyBuilderA1.b(classDescriptor.E0());
            copyBuilderA1.m();
            DeclarationDescriptor declarationDescriptorD4 = simpleFunctionDescriptor3.d();
            Intrinsics.d(declarationDescriptorD4, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            final String strA = MethodSignatureMappingKt.a(simpleFunctionDescriptor3, 3);
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Object objA = DFS.a(CollectionsKt.H((ClassDescriptor) declarationDescriptorD4), new DFS.Neighbors(this) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$$Lambda$1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final JvmBuiltInsCustomizer f43547a;

                {
                    this.f43547a = this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
                public final Iterable a(Object obj2) {
                    KProperty[] kPropertyArr2 = JvmBuiltInsCustomizer.g;
                    JvmBuiltInsCustomizer this$0 = this.f43547a;
                    Intrinsics.f(this$0, "this$0");
                    Collection collectionD = ((ClassDescriptor) obj2).h().d();
                    Intrinsics.e(collectionD, "it.typeConstructor.supertypes");
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it5 = collectionD.iterator();
                    while (it5.hasNext()) {
                        ClassifierDescriptor classifierDescriptorC = ((KotlinType) it5.next()).H0().c();
                        ClassifierDescriptor classifierDescriptorY0 = classifierDescriptorC != null ? classifierDescriptorC.y0() : null;
                        ClassDescriptor classDescriptor3 = classifierDescriptorY0 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorY0 : null;
                        LazyJavaClassDescriptor lazyJavaClassDescriptorF2 = classDescriptor3 != null ? this$0.f(classDescriptor3) : null;
                        if (lazyJavaClassDescriptorF2 != null) {
                            arrayList4.add(lazyJavaClassDescriptorF2);
                        }
                    }
                    return arrayList4;
                }
            }, new DFS.AbstractNodeHandler<ClassDescriptor, JDKMemberStatus>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$getJdkMethodStatus$2
                @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
                public final Object a() {
                    JvmBuiltInsCustomizer.JDKMemberStatus jDKMemberStatus = (JvmBuiltInsCustomizer.JDKMemberStatus) objectRef.X;
                    return jDKMemberStatus == null ? JvmBuiltInsCustomizer.JDKMemberStatus.Z : jDKMemberStatus;
                }

                @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
                public final boolean c(Object obj2) {
                    ClassDescriptor javaClassDescriptor = (ClassDescriptor) obj2;
                    Intrinsics.f(javaClassDescriptor, "javaClassDescriptor");
                    String strA2 = MethodSignatureBuildingUtilsKt.a(javaClassDescriptor, strA);
                    boolean zContains = JvmBuiltInsSignatures.f43554b.contains(strA2);
                    Ref.ObjectRef objectRef2 = objectRef;
                    if (zContains) {
                        objectRef2.X = JvmBuiltInsCustomizer.JDKMemberStatus.X;
                    } else if (JvmBuiltInsSignatures.f43555c.contains(strA2)) {
                        objectRef2.X = JvmBuiltInsCustomizer.JDKMemberStatus.f43548Y;
                    } else if (JvmBuiltInsSignatures.f43553a.contains(strA2)) {
                        objectRef2.X = JvmBuiltInsCustomizer.JDKMemberStatus.e0;
                    }
                    return objectRef2.X == null;
                }
            });
            Intrinsics.e(objA, "jvmDescriptor = computeJ…CONSIDERED\n            })");
            int iOrdinal = ((JDKMemberStatus) objA).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 2) {
                    copyBuilderA1.q((Annotations) StorageKt.a(this.f, kPropertyArr[2]));
                } else if (iOrdinal == 3) {
                    simpleFunctionDescriptor = null;
                }
                FunctionDescriptor functionDescriptorBuild2 = copyBuilderA1.build();
                Intrinsics.c(functionDescriptorBuild2);
                simpleFunctionDescriptor = (SimpleFunctionDescriptor) functionDescriptorBuild2;
            } else if (classDescriptor.q() == Modality.X && classDescriptor.getKind() != ClassKind.Z) {
                simpleFunctionDescriptor = null;
            } else {
                copyBuilderA1.c();
                FunctionDescriptor functionDescriptorBuild3 = copyBuilderA1.build();
                Intrinsics.c(functionDescriptorBuild3);
                simpleFunctionDescriptor = (SimpleFunctionDescriptor) functionDescriptorBuild3;
            }
            if (simpleFunctionDescriptor != null) {
                arrayList3.add(simpleFunctionDescriptor);
            }
        }
        return arrayList3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter
    public final boolean b(ClassDescriptor classDescriptor, DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor) {
        Intrinsics.f(classDescriptor, "classDescriptor");
        LazyJavaClassDescriptor lazyJavaClassDescriptorF = f(classDescriptor);
        if (lazyJavaClassDescriptorF == null || !deserializedSimpleFunctionDescriptor.getAnnotations().E0(PlatformDependentDeclarationFilterKt.f43624a)) {
            return true;
        }
        g().getClass();
        String strA = MethodSignatureMappingKt.a(deserializedSimpleFunctionDescriptor, 3);
        LazyJavaClassMemberScope lazyJavaClassMemberScopeG0 = lazyJavaClassDescriptorF.G0();
        Name name = deserializedSimpleFunctionDescriptor.getName();
        Intrinsics.e(name, "functionDescriptor.name");
        Collection collectionD = lazyJavaClassMemberScopeG0.d(name, NoLookupLocation.X);
        if ((collectionD instanceof Collection) && collectionD.isEmpty()) {
            return false;
        }
        Iterator it = collectionD.iterator();
        while (it.hasNext()) {
            if (MethodSignatureMappingKt.a((SimpleFunctionDescriptor) it.next(), 3).equals(strA)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    public final Collection c(ClassDescriptor classDescriptor) {
        ClassDescriptor classDescriptorB;
        Intrinsics.f(classDescriptor, "classDescriptor");
        ClassKind kind = classDescriptor.getKind();
        ClassKind classKind = ClassKind.X;
        EmptyList emptyList = EmptyList.X;
        if (kind == classKind) {
            g().getClass();
            LazyJavaClassDescriptor lazyJavaClassDescriptorF = f(classDescriptor);
            if (lazyJavaClassDescriptorF != null && (classDescriptorB = JavaToKotlinClassMapper.b(DescriptorUtilsKt.g(lazyJavaClassDescriptorF), FallbackBuiltIns.g)) != null) {
                TypeSubstitutor typeSubstitutor = new TypeSubstitutor(MappingUtilKt.a(classDescriptorB, lazyJavaClassDescriptorF));
                List list = (List) lazyJavaClassDescriptorF.r0.q.invoke();
                ArrayList<ClassConstructorDescriptor> arrayList = new ArrayList();
                for (Object obj : list) {
                    ClassConstructorDescriptor classConstructorDescriptor = (ClassConstructorDescriptor) obj;
                    if (classConstructorDescriptor.getVisibility().a().f43605b) {
                        Collection collectionI = classDescriptorB.i();
                        Intrinsics.e(collectionI, "defaultKotlinVersion.constructors");
                        Collection collection = collectionI;
                        if (!(collection instanceof Collection) || !collection.isEmpty()) {
                            Iterator it = collection.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    ClassConstructorDescriptor it2 = (ClassConstructorDescriptor) it.next();
                                    Intrinsics.e(it2, "it");
                                    if (OverridingUtil.j(it2, classConstructorDescriptor.b(typeSubstitutor)) == OverridingUtil.OverrideCompatibilityInfo.Result.X) {
                                    }
                                }
                            }
                        }
                        if (classConstructorDescriptor.e().size() == 1) {
                            List valueParameters = classConstructorDescriptor.e();
                            Intrinsics.e(valueParameters, "valueParameters");
                            ClassifierDescriptor classifierDescriptorC = ((ValueParameterDescriptor) CollectionsKt.W(valueParameters)).getType().H0().c();
                            if (Intrinsics.a(classifierDescriptorC != null ? DescriptorUtilsKt.h(classifierDescriptorC) : null, DescriptorUtilsKt.h(classDescriptor))) {
                            }
                        }
                        if (!KotlinBuiltIns.B(classConstructorDescriptor) && !JvmBuiltInsSignatures.f43556e.contains(MethodSignatureBuildingUtilsKt.a(lazyJavaClassDescriptorF, MethodSignatureMappingKt.a(classConstructorDescriptor, 3)))) {
                            arrayList.add(obj);
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.n(arrayList, 10));
                for (ClassConstructorDescriptor classConstructorDescriptor2 : arrayList) {
                    FunctionDescriptor.CopyBuilder copyBuilderA0 = classConstructorDescriptor2.A0();
                    copyBuilderA0.i(classDescriptor);
                    copyBuilderA0.n(classDescriptor.o());
                    copyBuilderA0.m();
                    copyBuilderA0.e(typeSubstitutor.f());
                    if (!JvmBuiltInsSignatures.f.contains(MethodSignatureBuildingUtilsKt.a(lazyJavaClassDescriptorF, MethodSignatureMappingKt.a(classConstructorDescriptor2, 3)))) {
                        copyBuilderA0.q((Annotations) StorageKt.a(this.f, g[2]));
                    }
                    FunctionDescriptor functionDescriptorBuild = copyBuilderA0.build();
                    Intrinsics.d(functionDescriptorBuild, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
                    arrayList2.add((ClassConstructorDescriptor) functionDescriptorBuild);
                }
                return arrayList2;
            }
        }
        return emptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    public final Collection d(ClassDescriptor classDescriptor) {
        boolean zIsAssignableFrom = true;
        Intrinsics.f(classDescriptor, "classDescriptor");
        FqNameUnsafe fqNameUnsafeH = DescriptorUtilsKt.h(classDescriptor);
        LinkedHashSet linkedHashSet = JvmBuiltInsSignatures.f43553a;
        FqNameUnsafe fqNameUnsafe = StandardNames.FqNames.g;
        boolean z2 = fqNameUnsafeH.equals(fqNameUnsafe) || StandardNames.FqNames.f43498c0.get(fqNameUnsafeH) != null;
        SimpleType simpleType = this.f43544c;
        if (z2) {
            SimpleType cloneableType = (SimpleType) StorageKt.a(this.d, g[1]);
            Intrinsics.e(cloneableType, "cloneableType");
            return CollectionsKt.I(cloneableType, simpleType);
        }
        if (!fqNameUnsafeH.equals(fqNameUnsafe) && StandardNames.FqNames.f43498c0.get(fqNameUnsafeH) == null) {
            String str = JavaToKotlinClassMap.f43521a;
            ClassId classIdF = JavaToKotlinClassMap.f(fqNameUnsafeH);
            if (classIdF == null) {
                zIsAssignableFrom = false;
            } else {
                try {
                    zIsAssignableFrom = Serializable.class.isAssignableFrom(Class.forName(classIdF.b().b()));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
            }
        }
        return zIsAssignableFrom ? CollectionsKt.H(simpleType) : EmptyList.X;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    public final Collection e(ClassDescriptor classDescriptor) {
        Set setA;
        Intrinsics.f(classDescriptor, "classDescriptor");
        g().getClass();
        EmptySet emptySet = EmptySet.X;
        LazyJavaClassDescriptor lazyJavaClassDescriptorF = f(classDescriptor);
        return (lazyJavaClassDescriptorF == null || (setA = lazyJavaClassDescriptorF.G0().a()) == null) ? emptySet : setA;
    }

    public final LazyJavaClassDescriptor f(ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            KotlinBuiltIns.a(108);
            throw null;
        }
        Name name = KotlinBuiltIns.f;
        if (!KotlinBuiltIns.b(classDescriptor, StandardNames.FqNames.f43494a) && KotlinBuiltIns.I(classDescriptor)) {
            FqNameUnsafe fqNameUnsafeH = DescriptorUtilsKt.h(classDescriptor);
            if (fqNameUnsafeH.d()) {
                String str = JavaToKotlinClassMap.f43521a;
                ClassId classIdF = JavaToKotlinClassMap.f(fqNameUnsafeH);
                if (classIdF != null) {
                    ClassDescriptor classDescriptorB = DescriptorUtilKt.b(g().f43540a, classIdF.b());
                    if (classDescriptorB instanceof LazyJavaClassDescriptor) {
                        return (LazyJavaClassDescriptor) classDescriptorB;
                    }
                }
            }
        }
        return null;
    }

    public final JvmBuiltIns.Settings g() {
        return (JvmBuiltIns.Settings) StorageKt.a(this.f43543b, g[0]);
    }
}
