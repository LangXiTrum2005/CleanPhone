package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.media3.extractor.text.ttml.a;
import com.p004ironsource.x4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.collections.IndexingIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaTypeParameterResolver;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeCheckerImpl;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

/* JADX INFO: loaded from: classes7.dex */
public abstract class LazyJavaScope extends MemberScopeImpl {
    public static final /* synthetic */ KProperty[] m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LazyJavaResolverContext f43881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LazyJavaClassMemberScope f43882c;
    public final NotNullLazyValue d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final NotNullLazyValue f43883e;
    public final MemoizedFunctionToNotNull f;
    public final MemoizedFunctionToNullable g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final MemoizedFunctionToNotNull f43884h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final NotNullLazyValue f43885i;
    public final NotNullLazyValue j;
    public final NotNullLazyValue k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final MemoizedFunctionToNotNull f43886l;

    public static final class MethodSignatureData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final KotlinType f43887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f43888b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f43889c;
        public final List d;

        public MethodSignatureData(KotlinType kotlinType, List list, ArrayList arrayList, List errors) {
            Intrinsics.f(errors, "errors");
            this.f43887a = kotlinType;
            this.f43888b = list;
            this.f43889c = arrayList;
            this.d = errors;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MethodSignatureData)) {
                return false;
            }
            MethodSignatureData methodSignatureData = (MethodSignatureData) obj;
            return this.f43887a.equals(methodSignatureData.f43887a) && this.f43888b.equals(methodSignatureData.f43888b) && this.f43889c.equals(methodSignatureData.f43889c) && Intrinsics.a(this.d, methodSignatureData.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.f43889c.hashCode() + a.c(this.f43887a.hashCode() * 961, 31, this.f43888b)) * 961);
        }

        public final String toString() {
            return "MethodSignatureData(returnType=" + this.f43887a + ", receiverType=null, valueParameters=" + this.f43888b + ", typeParameters=" + this.f43889c + ", hasStableParameterNames=false, errors=" + this.d + ')';
        }
    }

    public static final class ResolvedValueParameters {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f43890a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f43891b;

        public ResolvedValueParameters(List list, boolean z2) {
            this.f43890a = list;
            this.f43891b = z2;
        }
    }

    static {
        ReflectionFactory reflectionFactory = Reflection.f43333a;
        m = new KProperty[]{reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(LazyJavaScope.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(LazyJavaScope.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(LazyJavaScope.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};
    }

    public LazyJavaScope(LazyJavaResolverContext c2, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        Intrinsics.f(c2, "c");
        this.f43881b = c2;
        this.f43882c = lazyJavaClassMemberScope;
        LockBasedStorageManager lockBasedStorageManager = c2.f43840a.f43824a;
        this.d = lockBasedStorageManager.i(new Function0<Collection<? extends DeclarationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$allDescriptors$1
            {
                super(0);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DescriptorKindFilter kindFilter = DescriptorKindFilter.m;
                MemberScope.f44348a.getClass();
                Function1 function1A = MemberScope.Companion.a();
                LazyJavaScope lazyJavaScope = this.X;
                lazyJavaScope.getClass();
                Intrinsics.f(kindFilter, "kindFilter");
                NoLookupLocation noLookupLocation = NoLookupLocation.e0;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                if (kindFilter.a(DescriptorKindFilter.f44335l)) {
                    for (Name name : lazyJavaScope.h(kindFilter, function1A)) {
                        function1A.invoke(name);
                        CollectionsKt.a(linkedHashSet, lazyJavaScope.f(name, noLookupLocation));
                    }
                }
                boolean zA = kindFilter.a(DescriptorKindFilter.f44334i);
                List list = kindFilter.f44338a;
                if (zA && !list.contains(DescriptorKindExclude.NonExtensions.f44328a)) {
                    for (Name name2 : lazyJavaScope.i(kindFilter, function1A)) {
                        function1A.invoke(name2);
                        linkedHashSet.addAll(lazyJavaScope.d(name2, noLookupLocation));
                    }
                }
                if (kindFilter.a(DescriptorKindFilter.j) && !list.contains(DescriptorKindExclude.NonExtensions.f44328a)) {
                    for (Name name3 : lazyJavaScope.o(kindFilter)) {
                        function1A.invoke(name3);
                        linkedHashSet.addAll(lazyJavaScope.b(name3, noLookupLocation));
                    }
                }
                return kotlin.collections.CollectionsKt.i0(linkedHashSet);
            }
        });
        this.f43883e = lockBasedStorageManager.a(new Function0<DeclaredMemberIndex>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$declaredMemberIndex$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.X.k();
            }
        });
        this.f = lockBasedStorageManager.g(new Function1<Name, Collection<? extends SimpleFunctionDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$declaredFunctions$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Name name = (Name) obj;
                Intrinsics.f(name, "name");
                LazyJavaScope lazyJavaScope = this.X;
                LazyJavaClassMemberScope lazyJavaClassMemberScope2 = lazyJavaScope.f43882c;
                if (lazyJavaClassMemberScope2 != null) {
                    return (Collection) lazyJavaClassMemberScope2.f.invoke(name);
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = ((DeclaredMemberIndex) lazyJavaScope.f43883e.invoke()).d(name).iterator();
                while (it.hasNext()) {
                    JavaMethodDescriptor javaMethodDescriptorT = lazyJavaScope.t((JavaMethod) it.next());
                    if (lazyJavaScope.r(javaMethodDescriptorT)) {
                        lazyJavaScope.f43881b.f43840a.g.getClass();
                        arrayList.add(javaMethodDescriptorT);
                    }
                }
                lazyJavaScope.j(arrayList, name);
                return arrayList;
            }
        });
        this.g = lockBasedStorageManager.h(new Function1<Name, PropertyDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$declaredField$1
            {
                super(1);
            }

            /* JADX WARN: Code duplicated, block: B:43:0x00ee  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Name name = (Name) obj;
                Intrinsics.f(name, "name");
                final LazyJavaScope lazyJavaScope = this.X;
                LazyJavaClassMemberScope lazyJavaClassMemberScope2 = lazyJavaScope.f43882c;
                if (lazyJavaClassMemberScope2 != null) {
                    return (PropertyDescriptor) lazyJavaClassMemberScope2.g.invoke(name);
                }
                final JavaField javaFieldF = ((DeclaredMemberIndex) lazyJavaScope.f43883e.invoke()).f(name);
                if (javaFieldF == null || javaFieldF.B()) {
                    return null;
                }
                boolean z2 = !javaFieldF.isFinal();
                LazyJavaResolverContext lazyJavaResolverContext = lazyJavaScope.f43881b;
                LazyJavaAnnotations lazyJavaAnnotationsA = LazyJavaAnnotationsKt.a(lazyJavaResolverContext, javaFieldF);
                DeclarationDescriptor declarationDescriptorQ = lazyJavaScope.q();
                DescriptorVisibility descriptorVisibilityA = UtilsKt.a(javaFieldF.getVisibility());
                Name name2 = javaFieldF.getName();
                JavaResolverComponents javaResolverComponents = lazyJavaResolverContext.f43840a;
                final JavaPropertyDescriptor javaPropertyDescriptorN0 = JavaPropertyDescriptor.N0(declarationDescriptorQ, lazyJavaAnnotationsA, descriptorVisibilityA, z2, name2, javaResolverComponents.j.a(javaFieldF), javaFieldF.isFinal() && javaFieldF.f());
                javaPropertyDescriptorN0.K0(null, null, null, null);
                KotlinType kotlinTypeD = lazyJavaResolverContext.f43843e.d(javaFieldF.getType(), JavaTypeAttributesKt.a(TypeUsage.f44554Y, false, null, 7));
                if ((KotlinBuiltIns.F(kotlinTypeD) || KotlinBuiltIns.G(kotlinTypeD)) && javaFieldF.isFinal()) {
                    javaFieldF.f();
                }
                EmptyList emptyList = EmptyList.X;
                javaPropertyDescriptorN0.M0(kotlinTypeD, emptyList, lazyJavaScope.p(), null, emptyList);
                KotlinType type = javaPropertyDescriptorN0.getType();
                if (type == null) {
                    DescriptorUtils.a(67);
                    throw null;
                }
                int i2 = DescriptorUtils.f44280a;
                if (!javaPropertyDescriptorN0.g0 && !KotlinTypeKt.a(type)) {
                    if (TypeUtils.b(type)) {
                        javaPropertyDescriptorN0.G0(null, new Function0<NullableLazyValue<? extends ConstantValue<?>>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$resolveProperty$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                LazyJavaScope lazyJavaScope2 = lazyJavaScope;
                                return lazyJavaScope2.f43881b.f43840a.f43824a.b(new Function0<ConstantValue<?>>(javaFieldF, javaPropertyDescriptorN0) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$resolveProperty$1.1

                                    /* JADX INFO: renamed from: Y, reason: collision with root package name */
                                    public final /* synthetic */ JavaField f43893Y;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        this.X.f43881b.f43840a.f43828h.getClass();
                                        return null;
                                    }
                                });
                            }
                        });
                    } else {
                        KotlinBuiltIns kotlinBuiltInsE = DescriptorUtilsKt.e(javaPropertyDescriptorN0);
                        if (KotlinBuiltIns.F(type)) {
                            javaPropertyDescriptorN0.G0(null, new Function0<NullableLazyValue<? extends ConstantValue<?>>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$resolveProperty$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    LazyJavaScope lazyJavaScope2 = lazyJavaScope;
                                    return lazyJavaScope2.f43881b.f43840a.f43824a.b(new Function0<ConstantValue<?>>(javaFieldF, javaPropertyDescriptorN0) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$resolveProperty$1.1

                                        /* JADX INFO: renamed from: Y, reason: collision with root package name */
                                        public final /* synthetic */ JavaField f43893Y;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            this.X.f43881b.f43840a.f43828h.getClass();
                                            return null;
                                        }
                                    });
                                }
                            });
                        } else {
                            NewKotlinTypeCheckerImpl newKotlinTypeCheckerImpl = KotlinTypeChecker.f44562a;
                            if (newKotlinTypeCheckerImpl.c(kotlinBuiltInsE.t(), type) || newKotlinTypeCheckerImpl.c(kotlinBuiltInsE.j("Number").o(), type) || newKotlinTypeCheckerImpl.c(kotlinBuiltInsE.e(), type) || UnsignedTypes.a(type)) {
                                javaPropertyDescriptorN0.G0(null, new Function0<NullableLazyValue<? extends ConstantValue<?>>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$resolveProperty$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        LazyJavaScope lazyJavaScope2 = lazyJavaScope;
                                        return lazyJavaScope2.f43881b.f43840a.f43824a.b(new Function0<ConstantValue<?>>(javaFieldF, javaPropertyDescriptorN0) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$resolveProperty$1.1

                                            /* JADX INFO: renamed from: Y, reason: collision with root package name */
                                            public final /* synthetic */ JavaField f43893Y;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                this.X.f43881b.f43840a.f43828h.getClass();
                                                return null;
                                            }
                                        });
                                    }
                                });
                            }
                        }
                    }
                }
                javaResolverComponents.g.getClass();
                return javaPropertyDescriptorN0;
            }
        });
        this.f43884h = lockBasedStorageManager.g(new Function1<Name, Collection<? extends SimpleFunctionDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$functions$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Name name = (Name) obj;
                Intrinsics.f(name, "name");
                LazyJavaScope lazyJavaScope = this.X;
                LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) lazyJavaScope.f.invoke(name));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : linkedHashSet) {
                    String strA = MethodSignatureMappingKt.a((SimpleFunctionDescriptor) obj2, 2);
                    Object arrayList = linkedHashMap.get(strA);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(strA, arrayList);
                    }
                    ((List) arrayList).add(obj2);
                }
                for (List list : linkedHashMap.values()) {
                    if (list.size() != 1) {
                        List list2 = list;
                        Collection collectionA = OverridingUtilsKt.a(list2, LazyJavaScope$retainMostSpecificMethods$mostSpecificMethods$1.X);
                        linkedHashSet.removeAll(list2);
                        linkedHashSet.addAll(collectionA);
                    }
                }
                lazyJavaScope.m(linkedHashSet, name);
                LazyJavaResolverContext lazyJavaResolverContext = lazyJavaScope.f43881b;
                return kotlin.collections.CollectionsKt.i0(lazyJavaResolverContext.f43840a.r.c(lazyJavaResolverContext, linkedHashSet));
            }
        });
        this.f43885i = lockBasedStorageManager.a(new Function0<Set<? extends Name>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$functionNamesLazy$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.X.i(DescriptorKindFilter.f44337p, null);
            }
        });
        this.j = lockBasedStorageManager.a(new Function0<Set<? extends Name>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$propertyNamesLazy$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.X.o(DescriptorKindFilter.q);
            }
        });
        this.k = lockBasedStorageManager.a(new Function0<Set<? extends Name>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$classNamesLazy$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.X.h(DescriptorKindFilter.o, null);
            }
        });
        this.f43886l = lockBasedStorageManager.g(new Function1<Name, List<? extends PropertyDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$properties$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Name name = (Name) obj;
                Intrinsics.f(name, "name");
                ArrayList arrayList = new ArrayList();
                LazyJavaScope lazyJavaScope = this.X;
                CollectionsKt.a(arrayList, lazyJavaScope.g.invoke(name));
                lazyJavaScope.n(arrayList, name);
                if (DescriptorUtils.n(lazyJavaScope.q(), ClassKind.f0)) {
                    return kotlin.collections.CollectionsKt.i0(arrayList);
                }
                LazyJavaResolverContext lazyJavaResolverContext = lazyJavaScope.f43881b;
                return kotlin.collections.CollectionsKt.i0(lazyJavaResolverContext.f43840a.r.c(lazyJavaResolverContext, arrayList));
            }
        });
    }

    public static KotlinType l(JavaMethod method, LazyJavaResolverContext lazyJavaResolverContext) {
        Intrinsics.f(method, "method");
        JavaTypeAttributes javaTypeAttributesA = JavaTypeAttributesKt.a(TypeUsage.f44554Y, method.j().f43703a.isAnnotation(), null, 6);
        return lazyJavaResolverContext.f43843e.d(method.x(), javaTypeAttributesA);
    }

    public static ResolvedValueParameters u(LazyJavaResolverContext lazyJavaResolverContext, FunctionDescriptorImpl functionDescriptorImpl, List jValueParameters) {
        Pair pair;
        Name name;
        Intrinsics.f(jValueParameters, "jValueParameters");
        IndexingIterable indexingIterableM0 = kotlin.collections.CollectionsKt.m0(jValueParameters);
        ArrayList arrayList = new ArrayList(kotlin.collections.CollectionsKt.n(indexingIterableM0, 10));
        Iterator it = indexingIterableM0.iterator();
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            IndexingIterator indexingIterator = (IndexingIterator) it;
            if (!indexingIterator.X.hasNext()) {
                return new ResolvedValueParameters(kotlin.collections.CollectionsKt.i0(arrayList), z3);
            }
            IndexedValue indexedValue = (IndexedValue) indexingIterator.next();
            int i2 = indexedValue.f43274a;
            JavaValueParameter javaValueParameter = (JavaValueParameter) indexedValue.f43275b;
            LazyJavaAnnotations lazyJavaAnnotationsA = LazyJavaAnnotationsKt.a(lazyJavaResolverContext, javaValueParameter);
            JavaTypeAttributes javaTypeAttributesA = JavaTypeAttributesKt.a(TypeUsage.f44554Y, z2, null, 7);
            boolean zH = javaValueParameter.h();
            JavaResolverComponents javaResolverComponents = lazyJavaResolverContext.f43840a;
            JavaTypeResolver javaTypeResolver = lazyJavaResolverContext.f43843e;
            ModuleDescriptorImpl moduleDescriptorImpl = javaResolverComponents.o;
            if (zH) {
                JavaType type = javaValueParameter.getType();
                JavaArrayType javaArrayType = type instanceof JavaArrayType ? (JavaArrayType) type : null;
                if (javaArrayType == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + javaValueParameter);
                }
                UnwrappedType unwrappedTypeC = javaTypeResolver.c(javaArrayType, javaTypeAttributesA, true);
                pair = new Pair(unwrappedTypeC, moduleDescriptorImpl.e0.f(unwrappedTypeC));
            } else {
                pair = new Pair(javaTypeResolver.d(javaValueParameter.getType(), javaTypeAttributesA), null);
            }
            KotlinType kotlinType = (KotlinType) pair.X;
            KotlinType kotlinType2 = (KotlinType) pair.f43249Y;
            if (Intrinsics.a(functionDescriptorImpl.getName().b(), "equals") && jValueParameters.size() == 1 && moduleDescriptorImpl.e0.n().equals(kotlinType)) {
                name = Name.g(x4.DEFAULT_AUCTION_FALLBACK_VALUE);
            } else {
                name = javaValueParameter.getName();
                if (name == null) {
                    z3 = true;
                }
                if (name == null) {
                    name = Name.g("p" + i2);
                }
            }
            arrayList.add(new ValueParameterDescriptorImpl(functionDescriptorImpl, null, i2, lazyJavaAnnotationsA, name, kotlinType, false, false, false, kotlinType2, javaResolverComponents.j.a(javaValueParameter)));
            z2 = false;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set a() {
        return (Set) StorageKt.a(this.f43885i, m[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection b(Name name, NoLookupLocation noLookupLocation) {
        Intrinsics.f(name, "name");
        return !c().contains(name) ? EmptyList.X : (Collection) this.f43886l.invoke(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set c() {
        return (Set) StorageKt.a(this.j, m[1]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection d(Name name, LookupLocation location) {
        Intrinsics.f(name, "name");
        Intrinsics.f(location, "location");
        return !a().contains(name) ? EmptyList.X : (Collection) this.f43884h.invoke(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set e() {
        return (Set) StorageKt.a(this.k, m[2]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection g(DescriptorKindFilter kindFilter, Function1 function1) {
        Intrinsics.f(kindFilter, "kindFilter");
        return (Collection) this.d.invoke();
    }

    public abstract Set h(DescriptorKindFilter descriptorKindFilter, Function1 function1);

    public abstract Set i(DescriptorKindFilter descriptorKindFilter, Function1 function1);

    public void j(ArrayList arrayList, Name name) {
        Intrinsics.f(name, "name");
    }

    public abstract DeclaredMemberIndex k();

    public abstract void m(LinkedHashSet linkedHashSet, Name name);

    public abstract void n(ArrayList arrayList, Name name);

    public abstract Set o(DescriptorKindFilter descriptorKindFilter);

    public abstract ReceiverParameterDescriptor p();

    public abstract DeclarationDescriptor q();

    public boolean r(JavaMethodDescriptor javaMethodDescriptor) {
        return true;
    }

    public abstract MethodSignatureData s(JavaMethod javaMethod, ArrayList arrayList, KotlinType kotlinType, List list);

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    public final JavaMethodDescriptor t(JavaMethod method) {
        Modality modality;
        Intrinsics.f(method, "method");
        LazyJavaResolverContext lazyJavaResolverContext = this.f43881b;
        JavaMethodDescriptor javaMethodDescriptorU0 = JavaMethodDescriptor.U0(q(), LazyJavaAnnotationsKt.a(lazyJavaResolverContext, method), method.getName(), lazyJavaResolverContext.f43840a.j.a(method), ((DeclaredMemberIndex) this.f43883e.invoke()).e(method.getName()) != null && ((ArrayList) method.e()).isEmpty());
        Intrinsics.f(lazyJavaResolverContext, "<this>");
        LazyJavaResolverContext lazyJavaResolverContext2 = new LazyJavaResolverContext(lazyJavaResolverContext.f43840a, new LazyJavaTypeParameterResolver(lazyJavaResolverContext, javaMethodDescriptorU0, method, 0), lazyJavaResolverContext.f43842c);
        ArrayList typeParameters = method.getTypeParameters();
        ArrayList arrayList = new ArrayList(kotlin.collections.CollectionsKt.n(typeParameters, 10));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            TypeParameterDescriptor typeParameterDescriptorA = lazyJavaResolverContext2.f43841b.a((JavaTypeParameter) it.next());
            Intrinsics.c(typeParameterDescriptorA);
            arrayList.add(typeParameterDescriptorA);
        }
        ResolvedValueParameters resolvedValueParametersU = u(lazyJavaResolverContext2, javaMethodDescriptorU0, method.e());
        MethodSignatureData methodSignatureDataS = s(method, arrayList, l(method, lazyJavaResolverContext2), resolvedValueParametersU.f43890a);
        ReceiverParameterDescriptor receiverParameterDescriptorP = p();
        EmptyList emptyList = EmptyList.X;
        boolean zIsAbstract = method.isAbstract();
        boolean zIsFinal = method.isFinal();
        if (zIsAbstract) {
            modality = Modality.e0;
        } else {
            modality = !zIsFinal ? Modality.Z : Modality.X;
        }
        javaMethodDescriptorU0.T0(null, receiverParameterDescriptorP, emptyList, methodSignatureDataS.f43889c, methodSignatureDataS.f43888b, methodSignatureDataS.f43887a, modality, UtilsKt.a(method.getVisibility()), EmptyMap.X);
        javaMethodDescriptorU0.V0(false, resolvedValueParametersU.f43891b);
        List list = methodSignatureDataS.d;
        if (list.isEmpty()) {
            return javaMethodDescriptorU0;
        }
        lazyJavaResolverContext2.f43840a.f43827e.b(javaMethodDescriptorU0, list);
        throw null;
    }

    public String toString() {
        return "Lazy scope for " + q();
    }
}
