package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations$Companion$EMPTY$1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinSpecialProperties;
import kotlin.reflect.jvm.internal.impl.load.java.ClassicBuiltinSpecialProperties;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.load.java.JavaIncompatibilityRulesOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.PropertiesConventionUtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaForKotlinOverridePropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.UtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaTypeParameterResolver;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeCheckerImpl;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class LazyJavaClassMemberScope extends LazyJavaScope {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ClassDescriptor f43865n;
    public final JavaClass o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f43866p;
    public final NotNullLazyValue q;
    public final NotNullLazyValue r;
    public final NotNullLazyValue s;
    public final NotNullLazyValue t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final MemoizedFunctionToNullable f43867u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope(final LazyJavaResolverContext c2, ClassDescriptor ownerDescriptor, JavaClass jClass, boolean z2, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(c2, lazyJavaClassMemberScope);
        Intrinsics.f(c2, "c");
        Intrinsics.f(ownerDescriptor, "ownerDescriptor");
        Intrinsics.f(jClass, "jClass");
        this.f43865n = ownerDescriptor;
        this.o = jClass;
        this.f43866p = z2;
        LockBasedStorageManager lockBasedStorageManager = c2.f43840a.f43824a;
        this.q = lockBasedStorageManager.a(new Function0<List<? extends ClassConstructorDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$constructors$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v11, types: [kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope] */
            /* JADX WARN: Type inference failed for: r1v14 */
            /* JADX WARN: Type inference failed for: r1v15 */
            /* JADX WARN: Type inference failed for: r1v7, types: [kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope] */
            /* JADX WARN: Type inference failed for: r21v1 */
            /* JADX WARN: Type inference failed for: r21v2, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r21v3 */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r3v10, types: [kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor] */
            /* JADX WARN: Type inference failed for: r3v23 */
            /* JADX WARN: Type inference failed for: r3v3 */
            /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor] */
            /* JADX WARN: Type inference failed for: r3v9 */
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
                boolean z3;
                LazyJavaResolverContext lazyJavaResolverContext;
                ClassDescriptor classDescriptor;
                LazyJavaResolverContext lazyJavaResolverContext2;
                Object obj;
                LazyJavaResolverContext lazyJavaResolverContext3;
                List listJ;
                ?? r3;
                ?? arrayList;
                ?? r21;
                ?? r1;
                int i2;
                Pair pair;
                LazyJavaClassMemberScope lazyJavaClassMemberScope2 = this;
                Collection collectionI = lazyJavaClassMemberScope2.o.i();
                ArrayList arrayList2 = new ArrayList(collectionI.size());
                Iterator it = collectionI.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    z3 = false;
                    lazyJavaResolverContext = lazyJavaClassMemberScope2.f43881b;
                    classDescriptor = lazyJavaClassMemberScope2.f43865n;
                    if (!zHasNext) {
                        break;
                    }
                    JavaConstructor javaConstructor = (JavaConstructor) it.next();
                    LazyJavaAnnotations lazyJavaAnnotationsA = LazyJavaAnnotationsKt.a(lazyJavaResolverContext, javaConstructor);
                    JavaResolverComponents javaResolverComponents = lazyJavaResolverContext.f43840a;
                    JavaClassConstructorDescriptor javaClassConstructorDescriptorT0 = JavaClassConstructorDescriptor.T0(classDescriptor, lazyJavaAnnotationsA, false, javaResolverComponents.j.a(javaConstructor));
                    LazyJavaResolverContext lazyJavaResolverContext4 = new LazyJavaResolverContext(javaResolverComponents, new LazyJavaTypeParameterResolver(lazyJavaResolverContext, javaClassConstructorDescriptorT0, javaConstructor, classDescriptor.p().size()), lazyJavaResolverContext.f43842c);
                    LazyJavaScope.ResolvedValueParameters resolvedValueParametersU = LazyJavaScope.u(lazyJavaResolverContext4, javaClassConstructorDescriptorT0, javaConstructor.e());
                    List listP = classDescriptor.p();
                    Intrinsics.e(listP, "classDescriptor.declaredTypeParameters");
                    List list = listP;
                    ArrayList typeParameters = javaConstructor.getTypeParameters();
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.n(typeParameters, 10));
                    Iterator it2 = typeParameters.iterator();
                    while (it2.hasNext()) {
                        TypeParameterDescriptor typeParameterDescriptorA = lazyJavaResolverContext4.f43841b.a((JavaTypeParameter) it2.next());
                        Intrinsics.c(typeParameterDescriptorA);
                        arrayList3.add(typeParameterDescriptorA);
                    }
                    javaClassConstructorDescriptorT0.S0(resolvedValueParametersU.f43890a, UtilsKt.a(javaConstructor.getVisibility()), CollectionsKt.O(arrayList3, list));
                    javaClassConstructorDescriptorT0.M0(false);
                    javaClassConstructorDescriptorT0.N0(resolvedValueParametersU.f43891b);
                    javaClassConstructorDescriptorT0.O0(classDescriptor.o());
                    lazyJavaResolverContext4.f43840a.g.getClass();
                    arrayList2.add(javaClassConstructorDescriptorT0);
                }
                JavaClass javaClass = lazyJavaClassMemberScope2.o;
                boolean zM = javaClass.m();
                TypeUsage typeUsage = TypeUsage.f44554Y;
                Annotations$Companion$EMPTY$1 annotations$Companion$EMPTY$1 = Annotations.Companion.f43614a;
                String str = "PROTECTED_AND_PACKAGE";
                String str2 = "classDescriptor.visibility";
                LazyJavaResolverContext lazyJavaResolverContext5 = c2;
                if (zM) {
                    JavaClassConstructorDescriptor javaClassConstructorDescriptorT1 = JavaClassConstructorDescriptor.T0(classDescriptor, annotations$Companion$EMPTY$1, true, lazyJavaResolverContext.f43840a.j.a(javaClass));
                    ArrayList<JavaRecordComponent> arrayListG = javaClass.g();
                    ArrayList arrayList4 = new ArrayList(arrayListG.size());
                    JavaTypeAttributes javaTypeAttributesA = JavaTypeAttributesKt.a(typeUsage, false, null, 6);
                    LazyJavaResolverContext lazyJavaResolverContext6 = lazyJavaResolverContext5;
                    int i3 = 0;
                    for (JavaRecordComponent javaRecordComponent : arrayListG) {
                        KotlinType kotlinTypeD = lazyJavaResolverContext.f43843e.d(javaRecordComponent.getType(), javaTypeAttributesA);
                        JavaResolverComponents javaResolverComponents2 = lazyJavaResolverContext.f43840a;
                        LazyJavaResolverContext lazyJavaResolverContext7 = lazyJavaResolverContext6;
                        Name name = javaRecordComponent.getName();
                        RuntimeSourceElementFactory.RuntimeSourceElement runtimeSourceElementA = javaResolverComponents2.j.a(javaRecordComponent);
                        ArrayList arrayList5 = arrayList4;
                        JavaClassConstructorDescriptor javaClassConstructorDescriptor = javaClassConstructorDescriptorT1;
                        arrayList5.add(new ValueParameterDescriptorImpl(javaClassConstructorDescriptor, null, i3, annotations$Companion$EMPTY$1, name, kotlinTypeD, false, false, false, null, runtimeSourceElementA));
                        lazyJavaResolverContext6 = lazyJavaResolverContext7;
                        arrayList4 = arrayList5;
                        javaClassConstructorDescriptorT1 = javaClassConstructorDescriptor;
                        i3++;
                        z3 = false;
                    }
                    ArrayList arrayList6 = arrayList4;
                    ClassConstructorDescriptorImpl classConstructorDescriptorImpl = javaClassConstructorDescriptorT1;
                    lazyJavaResolverContext2 = lazyJavaResolverContext6;
                    obj = null;
                    classConstructorDescriptorImpl.N0(z3);
                    DescriptorVisibility PROTECTED_AND_PACKAGE = classDescriptor.getVisibility();
                    Intrinsics.e(PROTECTED_AND_PACKAGE, "classDescriptor.visibility");
                    if (PROTECTED_AND_PACKAGE.equals(JavaDescriptorVisibilities.f43747b)) {
                        PROTECTED_AND_PACKAGE = JavaDescriptorVisibilities.f43748c;
                        Intrinsics.e(PROTECTED_AND_PACKAGE, "PROTECTED_AND_PACKAGE");
                    }
                    classConstructorDescriptorImpl.R0(arrayList6, PROTECTED_AND_PACKAGE);
                    classConstructorDescriptorImpl.M0(false);
                    classConstructorDescriptorImpl.O0(classDescriptor.o());
                    String strA = MethodSignatureMappingKt.a(classConstructorDescriptorImpl, 2);
                    if (arrayList2.isEmpty()) {
                        arrayList2.add(classConstructorDescriptorImpl);
                        lazyJavaResolverContext2.f43840a.g.getClass();
                        break;
                    }
                    Iterator it3 = arrayList2.iterator();
                    do {
                        if (!it3.hasNext()) {
                            arrayList2.add(classConstructorDescriptorImpl);
                            lazyJavaResolverContext2.f43840a.g.getClass();
                            break;
                        }
                    } while (!MethodSignatureMappingKt.a((ClassConstructorDescriptor) it3.next(), 2).equals(strA));
                } else {
                    lazyJavaResolverContext2 = lazyJavaResolverContext5;
                    obj = null;
                }
                lazyJavaResolverContext2.f43840a.x.f(lazyJavaResolverContext2, classDescriptor, arrayList2);
                JavaResolverComponents javaResolverComponents3 = lazyJavaResolverContext2.f43840a;
                if (arrayList2.isEmpty()) {
                    boolean zK = javaClass.k();
                    javaClass.C();
                    if (zK) {
                        JavaClassConstructorDescriptor javaClassConstructorDescriptorT2 = JavaClassConstructorDescriptor.T0(classDescriptor, annotations$Companion$EMPTY$1, true, lazyJavaResolverContext.f43840a.j.a(javaClass));
                        if (zK) {
                            Collection collectionV = javaClass.v();
                            arrayList = new ArrayList(collectionV.size());
                            JavaTypeAttributes javaTypeAttributesA2 = JavaTypeAttributesKt.a(typeUsage, true, null, 6);
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList<JavaMethod> arrayList8 = new ArrayList();
                            for (Object obj2 : collectionV) {
                                if (Intrinsics.a(((JavaMethod) obj2).getName(), JvmAnnotationNames.f43766b)) {
                                    arrayList7.add(obj2);
                                } else {
                                    arrayList8.add(obj2);
                                }
                            }
                            arrayList7.size();
                            JavaMethod javaMethod = (JavaMethod) CollectionsKt.y(arrayList7);
                            JavaTypeResolver javaTypeResolver = lazyJavaResolverContext.f43843e;
                            if (javaMethod != null) {
                                JavaType javaTypeX = javaMethod.x();
                                if (javaTypeX instanceof JavaArrayType) {
                                    JavaArrayType javaArrayType = (JavaArrayType) javaTypeX;
                                    pair = new Pair(javaTypeResolver.c(javaArrayType, javaTypeAttributesA2, true), javaTypeResolver.d(javaArrayType.u(), javaTypeAttributesA2));
                                } else {
                                    pair = new Pair(javaTypeResolver.d(javaTypeX, javaTypeAttributesA2), null);
                                }
                                lazyJavaResolverContext3 = lazyJavaResolverContext2;
                                JavaClassConstructorDescriptor javaClassConstructorDescriptor2 = javaClassConstructorDescriptorT2;
                                ?? r2 = lazyJavaClassMemberScope2;
                                r2.x(arrayList, javaClassConstructorDescriptor2, 0, javaMethod, (KotlinType) pair.X, (KotlinType) pair.f43249Y);
                                r1 = r2;
                                r3 = javaClassConstructorDescriptor2;
                            } else {
                                lazyJavaResolverContext3 = lazyJavaResolverContext2;
                                r3 = javaClassConstructorDescriptorT2;
                            }
                            if (javaMethod != null) {
                                r1 = lazyJavaClassMemberScope2;
                                i2 = 1;
                            } else {
                                r1 = lazyJavaClassMemberScope2;
                                i2 = 0;
                            }
                            int i4 = 0;
                            for (JavaMethod javaMethod2 : arrayList8) {
                                r1.x(arrayList, r3, i4 + i2, javaMethod2, javaTypeResolver.d(javaMethod2.x(), javaTypeAttributesA2), null);
                                i4++;
                            }
                        } else {
                            lazyJavaResolverContext3 = lazyJavaResolverContext2;
                            str2 = "classDescriptor.visibility";
                            r3 = javaClassConstructorDescriptorT2;
                            str = "PROTECTED_AND_PACKAGE";
                            arrayList = Collections.EMPTY_LIST;
                        }
                        r3.N0(false);
                        DescriptorVisibility visibility = classDescriptor.getVisibility();
                        Intrinsics.e(visibility, str2);
                        if (visibility.equals(JavaDescriptorVisibilities.f43747b)) {
                            visibility = JavaDescriptorVisibilities.f43748c;
                            Intrinsics.e(visibility, str);
                        }
                        r3.R0(arrayList, visibility);
                        r3.M0(true);
                        r3.O0(classDescriptor.o());
                        lazyJavaResolverContext.f43840a.g.getClass();
                        r21 = r3;
                    } else {
                        lazyJavaResolverContext3 = lazyJavaResolverContext2;
                        r21 = obj;
                    }
                    listJ = CollectionsKt.J(r21);
                } else {
                    lazyJavaResolverContext3 = lazyJavaResolverContext2;
                    listJ = arrayList2;
                }
                return CollectionsKt.i0(javaResolverComponents3.r.c(lazyJavaResolverContext3, listJ));
            }
        });
        this.r = lockBasedStorageManager.a(new Function0<Set<? extends Name>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$nestedClassIndex$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CollectionsKt.l0(this.X.o.t());
            }
        });
        this.s = lockBasedStorageManager.a(new Function0<Set<? extends Name>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$generatedNestedClassNames$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                LazyJavaResolverContext lazyJavaResolverContext = c2;
                JavaResolverComponents javaResolverComponents = lazyJavaResolverContext.f43840a;
                return CollectionsKt.l0(javaResolverComponents.x.e(lazyJavaResolverContext, this.f43865n));
            }
        });
        this.t = lockBasedStorageManager.a(new Function0<Map<Name, ? extends JavaField>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$enumEntryIndex$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Collection fields = this.X.o.getFields();
                ArrayList arrayList = new ArrayList();
                for (Object obj : fields) {
                    if (((JavaField) obj).B()) {
                        arrayList.add(obj);
                    }
                }
                int iH = MapsKt.h(CollectionsKt.n(arrayList, 10));
                if (iH < 16) {
                    iH = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
                for (Object obj2 : arrayList) {
                    linkedHashMap.put(((JavaField) obj2).getName(), obj2);
                }
                return linkedHashMap;
            }
        });
        this.f43867u = lockBasedStorageManager.h(new Function1<Name, ClassDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$nestedClasses$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Name name = (Name) obj;
                Intrinsics.f(name, "name");
                final LazyJavaClassMemberScope lazyJavaClassMemberScope2 = this;
                boolean zContains = ((Set) lazyJavaClassMemberScope2.r.invoke()).contains(name);
                LazyJavaResolverContext lazyJavaResolverContext = c2;
                ClassDescriptor classDescriptor = lazyJavaClassMemberScope2.f43865n;
                if (zContains) {
                    JavaResolverComponents javaResolverComponents = lazyJavaResolverContext.f43840a;
                    ClassId classIdF = DescriptorUtilsKt.f(classDescriptor);
                    Intrinsics.c(classIdF);
                    ReflectJavaClass reflectJavaClassA = javaResolverComponents.f43825b.a(new JavaClassFinder.Request(classIdF.d(name), lazyJavaClassMemberScope2.o, 2));
                    if (reflectJavaClassA != null) {
                        LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(lazyJavaResolverContext, classDescriptor, reflectJavaClassA, null);
                        lazyJavaResolverContext.f43840a.s.getClass();
                        return lazyJavaClassDescriptor;
                    }
                } else if (((Set) lazyJavaClassMemberScope2.s.invoke()).contains(name)) {
                    ListBuilder listBuilderP = CollectionsKt.p();
                    lazyJavaResolverContext.f43840a.x.g(lazyJavaResolverContext, classDescriptor, name, listBuilderP);
                    ListBuilder listBuilderM = CollectionsKt.m(listBuilderP);
                    int f43279y = listBuilderM.getF43279Y();
                    if (f43279y != 0) {
                        if (f43279y == 1) {
                            return (ClassDescriptor) CollectionsKt.W(listBuilderM);
                        }
                        throw new IllegalStateException(("Multiple classes with same name are generated: " + listBuilderM).toString());
                    }
                } else {
                    JavaField javaField = (JavaField) ((Map) lazyJavaClassMemberScope2.t.invoke()).get(name);
                    if (javaField != null) {
                        NotNullLazyValue notNullLazyValueA = lazyJavaResolverContext.f43840a.f43824a.a(new Function0<Set<? extends Name>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$nestedClasses$1$enumMemberNames$1
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                LazyJavaClassMemberScope lazyJavaClassMemberScope3 = lazyJavaClassMemberScope2;
                                return SetsKt.f(lazyJavaClassMemberScope3.a(), lazyJavaClassMemberScope3.c());
                            }
                        });
                        JavaResolverComponents javaResolverComponents2 = lazyJavaResolverContext.f43840a;
                        return EnumEntrySyntheticClassDescriptor.G0(javaResolverComponents2.f43824a, lazyJavaClassMemberScope2.f43865n, name, notNullLazyValueA, LazyJavaAnnotationsKt.a(lazyJavaResolverContext, javaField), javaResolverComponents2.j.a(javaField));
                    }
                }
                return null;
            }
        });
    }

    public static SimpleFunctionDescriptor C(SimpleFunctionDescriptor simpleFunctionDescriptor, FunctionDescriptor functionDescriptor, AbstractCollection abstractCollection) {
        if (abstractCollection.isEmpty()) {
            return simpleFunctionDescriptor;
        }
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) it.next();
            if (!simpleFunctionDescriptor.equals(simpleFunctionDescriptor2) && simpleFunctionDescriptor2.l0() == null && F(simpleFunctionDescriptor2, functionDescriptor)) {
                FunctionDescriptor functionDescriptorBuild = simpleFunctionDescriptor.A0().h().build();
                Intrinsics.c(functionDescriptorBuild);
                return (SimpleFunctionDescriptor) functionDescriptorBuild;
            }
        }
        return simpleFunctionDescriptor;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    public static SimpleFunctionDescriptor D(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        FqName fqNameG;
        List valueParameters = simpleFunctionDescriptor.e();
        Intrinsics.e(valueParameters, "valueParameters");
        ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) CollectionsKt.G(valueParameters);
        if (valueParameterDescriptor != null) {
            ClassifierDescriptor classifierDescriptorC = valueParameterDescriptor.getType().H0().c();
            if (classifierDescriptorC != null) {
                FqNameUnsafe fqNameUnsafeH = DescriptorUtilsKt.h(classifierDescriptorC);
                if (!fqNameUnsafeH.d()) {
                    fqNameUnsafeH = null;
                }
                if (fqNameUnsafeH != null) {
                    fqNameG = fqNameUnsafeH.g();
                } else {
                    fqNameG = null;
                }
            } else {
                fqNameG = null;
            }
            if (!Intrinsics.a(fqNameG, StandardNames.f)) {
                valueParameterDescriptor = null;
            }
            if (valueParameterDescriptor != null) {
                FunctionDescriptor.CopyBuilder copyBuilderA0 = simpleFunctionDescriptor.A0();
                List valueParameters2 = simpleFunctionDescriptor.e();
                Intrinsics.e(valueParameters2, "valueParameters");
                SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) copyBuilderA0.a(CollectionsKt.s(valueParameters2)).n(((TypeProjection) valueParameterDescriptor.getType().F0().get(0)).getType()).build();
                SimpleFunctionDescriptorImpl simpleFunctionDescriptorImpl = (SimpleFunctionDescriptorImpl) simpleFunctionDescriptor2;
                if (simpleFunctionDescriptorImpl == null) {
                    return simpleFunctionDescriptor2;
                }
                simpleFunctionDescriptorImpl.w0 = true;
                return simpleFunctionDescriptor2;
            }
        }
        return null;
    }

    public static boolean F(FunctionDescriptor functionDescriptor, FunctionDescriptor functionDescriptor2) {
        OverridingUtil.OverrideCompatibilityInfo.Result resultC = OverridingUtil.f44284c.n(functionDescriptor2, functionDescriptor, true).c();
        Intrinsics.e(resultC, "DEFAULT.isOverridableByW…iptor, this, true).result");
        return resultC == OverridingUtil.OverrideCompatibilityInfo.Result.X && !JavaIncompatibilityRulesOverridabilityCondition.Companion.a(functionDescriptor2, functionDescriptor);
    }

    public static boolean G(SimpleFunctionDescriptor simpleFunctionDescriptor, SimpleFunctionDescriptor simpleFunctionDescriptor2) {
        int i2 = BuiltinMethodsWithDifferentJvmName.f43731l;
        Intrinsics.f(simpleFunctionDescriptor, "<this>");
        SimpleFunctionDescriptor simpleFunctionDescriptorY0 = simpleFunctionDescriptor2;
        if (Intrinsics.a(simpleFunctionDescriptor.getName().b(), "removeAt") && Intrinsics.a(MethodSignatureMappingKt.b(simpleFunctionDescriptor), SpecialGenericSignatures.g.f43796b)) {
            simpleFunctionDescriptorY0 = simpleFunctionDescriptor2;
            simpleFunctionDescriptorY0 = simpleFunctionDescriptor2.y0();
        }
        simpleFunctionDescriptorY0 = simpleFunctionDescriptor2;
        Intrinsics.e(simpleFunctionDescriptorY0, "if (superDescriptor.isRe…iginal else subDescriptor");
        return F(simpleFunctionDescriptorY0, simpleFunctionDescriptor);
    }

    public static SimpleFunctionDescriptor H(PropertyDescriptor propertyDescriptor, String str, Function1 function1) {
        SimpleFunctionDescriptor simpleFunctionDescriptor;
        Iterator it = ((Iterable) function1.invoke(Name.g(str))).iterator();
        do {
            simpleFunctionDescriptor = null;
            if (!it.hasNext()) {
                break;
            }
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) it.next();
            if (simpleFunctionDescriptor2.e().size() == 0) {
                NewKotlinTypeCheckerImpl newKotlinTypeCheckerImpl = KotlinTypeChecker.f44562a;
                KotlinType returnType = simpleFunctionDescriptor2.getReturnType();
                if (returnType == null ? false : newKotlinTypeCheckerImpl.d(returnType, propertyDescriptor.getType())) {
                    simpleFunctionDescriptor = simpleFunctionDescriptor2;
                }
            }
        } while (simpleFunctionDescriptor == null);
        return simpleFunctionDescriptor;
    }

    public static SimpleFunctionDescriptor J(PropertyDescriptor propertyDescriptor, Function1 function1) {
        SimpleFunctionDescriptor simpleFunctionDescriptor;
        KotlinType returnType;
        String strB = propertyDescriptor.getName().b();
        Intrinsics.e(strB, "name.asString()");
        Iterator it = ((Iterable) function1.invoke(Name.g(JvmAbi.b(strB)))).iterator();
        do {
            simpleFunctionDescriptor = null;
            if (!it.hasNext()) {
                break;
            }
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) it.next();
            if (simpleFunctionDescriptor2.e().size() == 1 && (returnType = simpleFunctionDescriptor2.getReturnType()) != null) {
                Name name = KotlinBuiltIns.f;
                if (KotlinBuiltIns.C(returnType, StandardNames.FqNames.d)) {
                    NewKotlinTypeCheckerImpl newKotlinTypeCheckerImpl = KotlinTypeChecker.f44562a;
                    List listE = simpleFunctionDescriptor2.e();
                    Intrinsics.e(listE, "descriptor.valueParameters");
                    if (newKotlinTypeCheckerImpl.c(((ValueParameterDescriptor) CollectionsKt.W(listE)).getType(), propertyDescriptor.getType())) {
                        simpleFunctionDescriptor = simpleFunctionDescriptor2;
                    }
                }
            }
        } while (simpleFunctionDescriptor == null);
        return simpleFunctionDescriptor;
    }

    public static boolean M(SimpleFunctionDescriptor simpleFunctionDescriptor, FunctionDescriptor functionDescriptor) {
        String strA = MethodSignatureMappingKt.a(simpleFunctionDescriptor, 2);
        FunctionDescriptor functionDescriptorY0 = functionDescriptor.y0();
        Intrinsics.e(functionDescriptorY0, "builtinWithErasedParameters.original");
        return strA.equals(MethodSignatureMappingKt.a(functionDescriptorY0, 2)) && !F(simpleFunctionDescriptor, functionDescriptor);
    }

    public static final ArrayList v(LazyJavaClassMemberScope lazyJavaClassMemberScope, Name name) {
        Collection collectionD = ((DeclaredMemberIndex) lazyJavaClassMemberScope.f43883e.invoke()).d(name);
        ArrayList arrayList = new ArrayList(CollectionsKt.n(collectionD, 10));
        Iterator it = collectionD.iterator();
        while (it.hasNext()) {
            arrayList.add(lazyJavaClassMemberScope.t((JavaMethod) it.next()));
        }
        return arrayList;
    }

    public static final ArrayList w(LazyJavaClassMemberScope lazyJavaClassMemberScope, Name name) {
        LinkedHashSet linkedHashSetK = lazyJavaClassMemberScope.K(name);
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSetK) {
            SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) obj;
            Intrinsics.f(simpleFunctionDescriptor, "<this>");
            if (SpecialBuiltinMembers.b(simpleFunctionDescriptor) == null && BuiltinMethodsWithSpecialGenericSignature.a(simpleFunctionDescriptor) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void A(Set set, AbstractCollection abstractCollection, SmartSet smartSet, Function1 function1) {
        SimpleFunctionDescriptor simpleFunctionDescriptorJ;
        PropertySetterDescriptorImpl propertySetterDescriptorImplK;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            PropertyDescriptor propertyDescriptor = (PropertyDescriptor) it.next();
            JavaForKotlinOverridePropertyDescriptor javaForKotlinOverridePropertyDescriptor = null;
            if (E(propertyDescriptor, function1)) {
                SimpleFunctionDescriptor simpleFunctionDescriptorI = I(propertyDescriptor, function1);
                Intrinsics.c(simpleFunctionDescriptorI);
                if (propertyDescriptor.I()) {
                    simpleFunctionDescriptorJ = J(propertyDescriptor, function1);
                    Intrinsics.c(simpleFunctionDescriptorJ);
                } else {
                    simpleFunctionDescriptorJ = null;
                }
                if (simpleFunctionDescriptorJ != null) {
                    simpleFunctionDescriptorJ.q();
                    simpleFunctionDescriptorI.q();
                }
                JavaForKotlinOverridePropertyDescriptor javaForKotlinOverridePropertyDescriptor2 = new JavaForKotlinOverridePropertyDescriptor(this.f43865n, simpleFunctionDescriptorI, simpleFunctionDescriptorJ, propertyDescriptor);
                KotlinType returnType = simpleFunctionDescriptorI.getReturnType();
                Intrinsics.c(returnType);
                EmptyList emptyList = EmptyList.X;
                javaForKotlinOverridePropertyDescriptor2.M0(returnType, emptyList, p(), null, emptyList);
                PropertyGetterDescriptorImpl propertyGetterDescriptorImplI = DescriptorFactory.i(javaForKotlinOverridePropertyDescriptor2, simpleFunctionDescriptorI.getAnnotations(), false, simpleFunctionDescriptorI.f());
                propertyGetterDescriptorImplI.m0 = simpleFunctionDescriptorI;
                propertyGetterDescriptorImplI.I0(javaForKotlinOverridePropertyDescriptor2.getType());
                if (simpleFunctionDescriptorJ != null) {
                    List listE = simpleFunctionDescriptorJ.e();
                    Intrinsics.e(listE, "setterMethod.valueParameters");
                    ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) CollectionsKt.y(listE);
                    if (valueParameterDescriptor == null) {
                        throw new AssertionError("No parameter found for " + simpleFunctionDescriptorJ);
                    }
                    propertySetterDescriptorImplK = DescriptorFactory.k(javaForKotlinOverridePropertyDescriptor2, simpleFunctionDescriptorJ.getAnnotations(), valueParameterDescriptor.getAnnotations(), false, simpleFunctionDescriptorJ.getVisibility(), simpleFunctionDescriptorJ.f());
                    propertySetterDescriptorImplK.m0 = simpleFunctionDescriptorJ;
                } else {
                    propertySetterDescriptorImplK = null;
                }
                javaForKotlinOverridePropertyDescriptor2.K0(propertyGetterDescriptorImplI, propertySetterDescriptorImplK, null, null);
                javaForKotlinOverridePropertyDescriptor = javaForKotlinOverridePropertyDescriptor2;
            }
            if (javaForKotlinOverridePropertyDescriptor != null) {
                abstractCollection.add(javaForKotlinOverridePropertyDescriptor);
                if (smartSet != null) {
                    smartSet.add(propertyDescriptor);
                    return;
                }
                return;
            }
        }
    }

    public final Collection B() {
        boolean z2 = this.f43866p;
        ClassDescriptor classDescriptor = this.f43865n;
        if (!z2) {
            this.f43881b.f43840a.f43833u.getClass();
            return KotlinTypeRefiner.Default.f44564a.e(classDescriptor);
        }
        Collection collectionD = classDescriptor.h().d();
        Intrinsics.e(collectionD, "ownerDescriptor.typeConstructor.supertypes");
        return collectionD;
    }

    public final boolean E(PropertyDescriptor propertyDescriptor, Function1 function1) {
        if (JavaDescriptorUtilKt.a(propertyDescriptor)) {
            return false;
        }
        SimpleFunctionDescriptor simpleFunctionDescriptorI = I(propertyDescriptor, function1);
        SimpleFunctionDescriptor simpleFunctionDescriptorJ = J(propertyDescriptor, function1);
        if (simpleFunctionDescriptorI == null) {
            return false;
        }
        if (propertyDescriptor.I()) {
            return simpleFunctionDescriptorJ != null && simpleFunctionDescriptorJ.q() == simpleFunctionDescriptorI.q();
        }
        return true;
    }

    public final SimpleFunctionDescriptor I(PropertyDescriptor propertyDescriptor, Function1 function1) {
        PropertyGetterDescriptorImpl getter = propertyDescriptor.getGetter();
        PropertyGetterDescriptor propertyGetterDescriptor = getter != null ? (PropertyGetterDescriptor) SpecialBuiltinMembers.b(getter) : null;
        String strA = propertyGetterDescriptor != null ? ClassicBuiltinSpecialProperties.a(propertyGetterDescriptor) : null;
        if (strA != null && !SpecialBuiltinMembers.d(this.f43865n, propertyGetterDescriptor)) {
            return H(propertyDescriptor, strA, function1);
        }
        String strB = propertyDescriptor.getName().b();
        Intrinsics.e(strB, "name.asString()");
        return H(propertyDescriptor, JvmAbi.a(strB), function1);
    }

    public final LinkedHashSet K(Name name) {
        Collection collectionB = B();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionB.iterator();
        while (it.hasNext()) {
            CollectionsKt.g(((KotlinType) it.next()).n().d(name, NoLookupLocation.f0), linkedHashSet);
        }
        return linkedHashSet;
    }

    public final Set L(Name name) {
        Collection collectionB = B();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionB.iterator();
        while (it.hasNext()) {
            Collection collectionB2 = ((KotlinType) it.next()).n().b(name, NoLookupLocation.f0);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.n(collectionB2, 10));
            Iterator it2 = collectionB2.iterator();
            while (it2.hasNext()) {
                arrayList2.add((PropertyDescriptor) it2.next());
            }
            CollectionsKt.g(arrayList2, arrayList);
        }
        return CollectionsKt.l0(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[LOOP:1: B:54:0x0128->B:100:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x01c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:? A[LOOP:3: B:72:0x0181->B:108:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x01c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x01b1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:50:0x0107  */
    /* JADX WARN: Code duplicated, block: B:53:0x0124  */
    /* JADX WARN: Code duplicated, block: B:56:0x012e  */
    /* JADX WARN: Code duplicated, block: B:59:0x013c  */
    /* JADX WARN: Code duplicated, block: B:62:0x014c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0166  */
    /* JADX WARN: Code duplicated, block: B:71:0x017d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0187  */
    /* JADX WARN: Code duplicated, block: B:77:0x0194  */
    /* JADX WARN: Code duplicated, block: B:80:0x019b  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ca A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:94:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x01c9 A[SYNTHETIC] */
    public final boolean N(final SimpleFunctionDescriptor simpleFunctionDescriptor) {
        Iterable iterableJ;
        Name name;
        Name name2;
        SimpleFunctionDescriptor simpleFunctionDescriptorD;
        LinkedHashSet<SimpleFunctionDescriptor> linkedHashSetK;
        ArrayList arrayList;
        Iterator it;
        Iterator it2;
        FunctionDescriptor functionDescriptorA;
        ArrayList arrayList2;
        SimpleFunctionDescriptor simpleFunctionDescriptor2;
        Iterator it3;
        SimpleFunctionDescriptor simpleFunctionDescriptor3;
        Name name3 = simpleFunctionDescriptor.getName();
        Intrinsics.e(name3, "function.name");
        String strB = name3.b();
        Intrinsics.e(strB, "name.asString()");
        FqName fqName = JvmAbi.f43763a;
        if (StringsKt.M(strB, "get", false) || StringsKt.M(strB, "is", false)) {
            Name nameA = PropertiesConventionUtilKt.a(name3, "get", null, 12);
            if (nameA == null) {
                nameA = PropertiesConventionUtilKt.a(name3, "is", null, 8);
            }
            iterableJ = CollectionsKt.J(nameA);
        } else if (StringsKt.M(strB, "set", false)) {
            iterableJ = ArraysKt.w(new Name[]{PropertiesConventionUtilKt.a(name3, "set", null, 4), PropertiesConventionUtilKt.a(name3, "set", "is", 4)});
        } else {
            iterableJ = (List) BuiltinSpecialProperties.f43734b.get(name3);
            if (iterableJ == null) {
                iterableJ = EmptyList.X;
            }
        }
        Iterable iterable = iterableJ;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            ArrayList arrayList3 = SpecialGenericSignatures.f43789a;
            Name name4 = simpleFunctionDescriptor.getName();
            Intrinsics.e(name4, "name");
            name = (Name) SpecialGenericSignatures.k.get(name4);
            if (name == null) {
                int i2 = BuiltinMethodsWithSpecialGenericSignature.f43732l;
                name2 = simpleFunctionDescriptor.getName();
                Intrinsics.e(name2, "name");
                if (!BuiltinMethodsWithSpecialGenericSignature.b(name2)) {
                    simpleFunctionDescriptorD = D(simpleFunctionDescriptor);
                    if (simpleFunctionDescriptorD == null) {
                        return true;
                    }
                    Name name5 = simpleFunctionDescriptor.getName();
                    Intrinsics.e(name5, "name");
                    linkedHashSetK = K(name5);
                    if (linkedHashSetK.isEmpty()) {
                        return true;
                    }
                    for (SimpleFunctionDescriptor simpleFunctionDescriptor4 : linkedHashSetK) {
                        if (simpleFunctionDescriptor4.isSuspend()) {
                        }
                    }
                    return true;
                }
                Name name6 = simpleFunctionDescriptor.getName();
                Intrinsics.e(name6, "name");
                LinkedHashSet linkedHashSetK2 = K(name6);
                arrayList = new ArrayList();
                it = linkedHashSetK2.iterator();
                while (it.hasNext()) {
                    functionDescriptorA = BuiltinMethodsWithSpecialGenericSignature.a((SimpleFunctionDescriptor) it.next());
                    if (functionDescriptorA != null) {
                        arrayList.add(functionDescriptorA);
                    }
                }
                if (arrayList.isEmpty()) {
                    simpleFunctionDescriptorD = D(simpleFunctionDescriptor);
                    if (simpleFunctionDescriptorD == null) {
                        return true;
                    }
                    Name name7 = simpleFunctionDescriptor.getName();
                    Intrinsics.e(name7, "name");
                    linkedHashSetK = K(name7);
                    if (linkedHashSetK.isEmpty()) {
                        return true;
                    }
                    while (r9.hasNext()) {
                        if (simpleFunctionDescriptor4.isSuspend()) {
                        }
                    }
                    return true;
                }
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (M(simpleFunctionDescriptor, (FunctionDescriptor) it2.next())) {
                    }
                }
                simpleFunctionDescriptorD = D(simpleFunctionDescriptor);
                if (simpleFunctionDescriptorD == null) {
                    return true;
                }
                Name name8 = simpleFunctionDescriptor.getName();
                Intrinsics.e(name8, "name");
                linkedHashSetK = K(name8);
                if (linkedHashSetK.isEmpty()) {
                    return true;
                }
                while (r9.hasNext()) {
                    if (simpleFunctionDescriptor4.isSuspend()) {
                    }
                }
                return true;
            }
            LinkedHashSet linkedHashSetK3 = K(name);
            arrayList2 = new ArrayList();
            for (Object obj : linkedHashSetK3) {
                simpleFunctionDescriptor3 = (SimpleFunctionDescriptor) obj;
                Intrinsics.f(simpleFunctionDescriptor3, "<this>");
                if (SpecialBuiltinMembers.b(simpleFunctionDescriptor3) != null) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.isEmpty()) {
                int i3 = BuiltinMethodsWithSpecialGenericSignature.f43732l;
                name2 = simpleFunctionDescriptor.getName();
                Intrinsics.e(name2, "name");
                if (!BuiltinMethodsWithSpecialGenericSignature.b(name2)) {
                    simpleFunctionDescriptorD = D(simpleFunctionDescriptor);
                    if (simpleFunctionDescriptorD == null) {
                        return true;
                    }
                    Name name9 = simpleFunctionDescriptor.getName();
                    Intrinsics.e(name9, "name");
                    linkedHashSetK = K(name9);
                    if (linkedHashSetK.isEmpty()) {
                        return true;
                    }
                    while (r9.hasNext()) {
                        if (simpleFunctionDescriptor4.isSuspend()) {
                        }
                    }
                    return true;
                }
                Name name10 = simpleFunctionDescriptor.getName();
                Intrinsics.e(name10, "name");
                LinkedHashSet linkedHashSetK4 = K(name10);
                arrayList = new ArrayList();
                it = linkedHashSetK4.iterator();
                while (it.hasNext()) {
                    functionDescriptorA = BuiltinMethodsWithSpecialGenericSignature.a((SimpleFunctionDescriptor) it.next());
                    if (functionDescriptorA != null) {
                        arrayList.add(functionDescriptorA);
                    }
                }
                if (arrayList.isEmpty()) {
                    simpleFunctionDescriptorD = D(simpleFunctionDescriptor);
                    if (simpleFunctionDescriptorD == null) {
                        return true;
                    }
                    Name name11 = simpleFunctionDescriptor.getName();
                    Intrinsics.e(name11, "name");
                    linkedHashSetK = K(name11);
                    if (linkedHashSetK.isEmpty()) {
                        return true;
                    }
                    while (r9.hasNext()) {
                        if (simpleFunctionDescriptor4.isSuspend()) {
                        }
                    }
                    return true;
                }
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (M(simpleFunctionDescriptor, (FunctionDescriptor) it2.next())) {
                    }
                }
                simpleFunctionDescriptorD = D(simpleFunctionDescriptor);
                if (simpleFunctionDescriptorD == null) {
                    return true;
                }
                Name name12 = simpleFunctionDescriptor.getName();
                Intrinsics.e(name12, "name");
                linkedHashSetK = K(name12);
                if (linkedHashSetK.isEmpty()) {
                    return true;
                }
                while (r9.hasNext()) {
                    if (simpleFunctionDescriptor4.isSuspend()) {
                    }
                }
                return true;
            }
            FunctionDescriptor.CopyBuilder copyBuilderA0 = simpleFunctionDescriptor.A0();
            copyBuilderA0.j(name);
            copyBuilderA0.r();
            copyBuilderA0.m();
            FunctionDescriptor functionDescriptorBuild = copyBuilderA0.build();
            Intrinsics.c(functionDescriptorBuild);
            simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) functionDescriptorBuild;
            if (arrayList2.isEmpty()) {
                int i4 = BuiltinMethodsWithSpecialGenericSignature.f43732l;
                name2 = simpleFunctionDescriptor.getName();
                Intrinsics.e(name2, "name");
                if (!BuiltinMethodsWithSpecialGenericSignature.b(name2)) {
                    simpleFunctionDescriptorD = D(simpleFunctionDescriptor);
                    if (simpleFunctionDescriptorD == null) {
                        return true;
                    }
                    Name name13 = simpleFunctionDescriptor.getName();
                    Intrinsics.e(name13, "name");
                    linkedHashSetK = K(name13);
                    if (linkedHashSetK.isEmpty()) {
                        return true;
                    }
                    while (r9.hasNext()) {
                        if (simpleFunctionDescriptor4.isSuspend()) {
                        }
                    }
                    return true;
                }
                Name name14 = simpleFunctionDescriptor.getName();
                Intrinsics.e(name14, "name");
                LinkedHashSet linkedHashSetK5 = K(name14);
                arrayList = new ArrayList();
                it = linkedHashSetK5.iterator();
                while (it.hasNext()) {
                    functionDescriptorA = BuiltinMethodsWithSpecialGenericSignature.a((SimpleFunctionDescriptor) it.next());
                    if (functionDescriptorA != null) {
                        arrayList.add(functionDescriptorA);
                    }
                }
                if (arrayList.isEmpty()) {
                    simpleFunctionDescriptorD = D(simpleFunctionDescriptor);
                    if (simpleFunctionDescriptorD == null) {
                        return true;
                    }
                    Name name15 = simpleFunctionDescriptor.getName();
                    Intrinsics.e(name15, "name");
                    linkedHashSetK = K(name15);
                    if (linkedHashSetK.isEmpty()) {
                        return true;
                    }
                    while (r9.hasNext()) {
                        if (simpleFunctionDescriptor4.isSuspend()) {
                        }
                    }
                    return true;
                }
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (M(simpleFunctionDescriptor, (FunctionDescriptor) it2.next())) {
                    }
                }
                simpleFunctionDescriptorD = D(simpleFunctionDescriptor);
                if (simpleFunctionDescriptorD == null) {
                    return true;
                }
                Name name16 = simpleFunctionDescriptor.getName();
                Intrinsics.e(name16, "name");
                linkedHashSetK = K(name16);
                if (linkedHashSetK.isEmpty()) {
                    return true;
                }
                while (r9.hasNext()) {
                    if (simpleFunctionDescriptor4.isSuspend()) {
                    }
                }
                return true;
            }
            it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                if (G((SimpleFunctionDescriptor) it3.next(), simpleFunctionDescriptor2)) {
                }
            }
            int i5 = BuiltinMethodsWithSpecialGenericSignature.f43732l;
            name2 = simpleFunctionDescriptor.getName();
            Intrinsics.e(name2, "name");
            if (!BuiltinMethodsWithSpecialGenericSignature.b(name2)) {
                simpleFunctionDescriptorD = D(simpleFunctionDescriptor);
                if (simpleFunctionDescriptorD == null) {
                    return true;
                }
                Name name17 = simpleFunctionDescriptor.getName();
                Intrinsics.e(name17, "name");
                linkedHashSetK = K(name17);
                if (linkedHashSetK.isEmpty()) {
                    return true;
                }
                while (r9.hasNext()) {
                    if (simpleFunctionDescriptor4.isSuspend()) {
                    }
                }
                return true;
            }
            Name name18 = simpleFunctionDescriptor.getName();
            Intrinsics.e(name18, "name");
            LinkedHashSet linkedHashSetK6 = K(name18);
            arrayList = new ArrayList();
            it = linkedHashSetK6.iterator();
            while (it.hasNext()) {
                functionDescriptorA = BuiltinMethodsWithSpecialGenericSignature.a((SimpleFunctionDescriptor) it.next());
                if (functionDescriptorA != null) {
                    arrayList.add(functionDescriptorA);
                }
            }
            if (arrayList.isEmpty()) {
                simpleFunctionDescriptorD = D(simpleFunctionDescriptor);
                if (simpleFunctionDescriptorD == null) {
                    return true;
                }
                Name name19 = simpleFunctionDescriptor.getName();
                Intrinsics.e(name19, "name");
                linkedHashSetK = K(name19);
                if (linkedHashSetK.isEmpty()) {
                    return true;
                }
                while (r9.hasNext()) {
                    if (simpleFunctionDescriptor4.isSuspend()) {
                    }
                }
                return true;
            }
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (M(simpleFunctionDescriptor, (FunctionDescriptor) it2.next())) {
                }
            }
            simpleFunctionDescriptorD = D(simpleFunctionDescriptor);
            if (simpleFunctionDescriptorD == null) {
                return true;
            }
            Name name110 = simpleFunctionDescriptor.getName();
            Intrinsics.e(name110, "name");
            linkedHashSetK = K(name110);
            if (linkedHashSetK.isEmpty()) {
                return true;
            }
            while (r9.hasNext()) {
                if (simpleFunctionDescriptor4.isSuspend()) {
                }
            }
            return true;
        }
        Iterator it4 = iterable.iterator();
        while (it4.hasNext()) {
            Set<PropertyDescriptor> setL = L((Name) it4.next());
            if (!setL.isEmpty()) {
                for (PropertyDescriptor propertyDescriptor : setL) {
                    if (E(propertyDescriptor, new Function1<Name, Collection<? extends SimpleFunctionDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$isVisibleAsFunctionInCurrentClass$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Name accessorName = (Name) obj2;
                            Intrinsics.f(accessorName, "accessorName");
                            SimpleFunctionDescriptor simpleFunctionDescriptor5 = simpleFunctionDescriptor;
                            if (Intrinsics.a(simpleFunctionDescriptor5.getName(), accessorName)) {
                                return CollectionsKt.H(simpleFunctionDescriptor5);
                            }
                            LazyJavaClassMemberScope lazyJavaClassMemberScope = this;
                            return CollectionsKt.O(LazyJavaClassMemberScope.w(lazyJavaClassMemberScope, accessorName), LazyJavaClassMemberScope.v(lazyJavaClassMemberScope, accessorName));
                        }
                    })) {
                        if (!propertyDescriptor.I()) {
                            String strB2 = simpleFunctionDescriptor.getName().b();
                            Intrinsics.e(strB2, "function.name.asString()");
                            if (!StringsKt.M(strB2, "set", false)) {
                            }
                        }
                    }
                }
            }
        }
        ArrayList arrayList4 = SpecialGenericSignatures.f43789a;
        Name name20 = simpleFunctionDescriptor.getName();
        Intrinsics.e(name20, "name");
        name = (Name) SpecialGenericSignatures.k.get(name20);
        if (name == null) {
            int i6 = BuiltinMethodsWithSpecialGenericSignature.f43732l;
            name2 = simpleFunctionDescriptor.getName();
            Intrinsics.e(name2, "name");
            if (!BuiltinMethodsWithSpecialGenericSignature.b(name2)) {
                simpleFunctionDescriptorD = D(simpleFunctionDescriptor);
                if (simpleFunctionDescriptorD == null) {
                    return true;
                }
                Name name111 = simpleFunctionDescriptor.getName();
                Intrinsics.e(name111, "name");
                linkedHashSetK = K(name111);
                if (linkedHashSetK.isEmpty()) {
                    return true;
                }
                while (r9.hasNext()) {
                    if (simpleFunctionDescriptor4.isSuspend() || !F(simpleFunctionDescriptorD, simpleFunctionDescriptor4)) {
                    }
                }
                return true;
            }
            Name name112 = simpleFunctionDescriptor.getName();
            Intrinsics.e(name112, "name");
            LinkedHashSet linkedHashSetK7 = K(name112);
            arrayList = new ArrayList();
            it = linkedHashSetK7.iterator();
            while (it.hasNext()) {
                functionDescriptorA = BuiltinMethodsWithSpecialGenericSignature.a((SimpleFunctionDescriptor) it.next());
                if (functionDescriptorA != null) {
                    arrayList.add(functionDescriptorA);
                }
            }
            if (arrayList.isEmpty()) {
                simpleFunctionDescriptorD = D(simpleFunctionDescriptor);
                if (simpleFunctionDescriptorD == null) {
                    return true;
                }
                Name name113 = simpleFunctionDescriptor.getName();
                Intrinsics.e(name113, "name");
                linkedHashSetK = K(name113);
                if (linkedHashSetK.isEmpty()) {
                    return true;
                }
                while (r9.hasNext()) {
                    if (simpleFunctionDescriptor4.isSuspend()) {
                    }
                }
                return true;
            }
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (M(simpleFunctionDescriptor, (FunctionDescriptor) it2.next())) {
                }
            }
            simpleFunctionDescriptorD = D(simpleFunctionDescriptor);
            if (simpleFunctionDescriptorD == null) {
                return true;
            }
            Name name114 = simpleFunctionDescriptor.getName();
            Intrinsics.e(name114, "name");
            linkedHashSetK = K(name114);
            if (linkedHashSetK.isEmpty()) {
                return true;
            }
            while (r9.hasNext()) {
                if (simpleFunctionDescriptor4.isSuspend()) {
                }
            }
            return true;
        }
        LinkedHashSet linkedHashSetK8 = K(name);
        arrayList2 = new ArrayList();
        while (r2.hasNext()) {
            simpleFunctionDescriptor3 = (SimpleFunctionDescriptor) obj;
            Intrinsics.f(simpleFunctionDescriptor3, "<this>");
            if (SpecialBuiltinMembers.b(simpleFunctionDescriptor3) != null) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            int i7 = BuiltinMethodsWithSpecialGenericSignature.f43732l;
            name2 = simpleFunctionDescriptor.getName();
            Intrinsics.e(name2, "name");
            if (!BuiltinMethodsWithSpecialGenericSignature.b(name2)) {
                simpleFunctionDescriptorD = D(simpleFunctionDescriptor);
                if (simpleFunctionDescriptorD == null) {
                    return true;
                }
                Name name115 = simpleFunctionDescriptor.getName();
                Intrinsics.e(name115, "name");
                linkedHashSetK = K(name115);
                if (linkedHashSetK.isEmpty()) {
                    return true;
                }
                while (r9.hasNext()) {
                    if (simpleFunctionDescriptor4.isSuspend()) {
                    }
                }
                return true;
            }
            Name name116 = simpleFunctionDescriptor.getName();
            Intrinsics.e(name116, "name");
            LinkedHashSet linkedHashSetK9 = K(name116);
            arrayList = new ArrayList();
            it = linkedHashSetK9.iterator();
            while (it.hasNext()) {
                functionDescriptorA = BuiltinMethodsWithSpecialGenericSignature.a((SimpleFunctionDescriptor) it.next());
                if (functionDescriptorA != null) {
                    arrayList.add(functionDescriptorA);
                }
            }
            if (arrayList.isEmpty()) {
                simpleFunctionDescriptorD = D(simpleFunctionDescriptor);
                if (simpleFunctionDescriptorD == null) {
                    return true;
                }
                Name name117 = simpleFunctionDescriptor.getName();
                Intrinsics.e(name117, "name");
                linkedHashSetK = K(name117);
                if (linkedHashSetK.isEmpty()) {
                    return true;
                }
                while (r9.hasNext()) {
                    if (simpleFunctionDescriptor4.isSuspend()) {
                    }
                }
                return true;
            }
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (M(simpleFunctionDescriptor, (FunctionDescriptor) it2.next())) {
                }
            }
            simpleFunctionDescriptorD = D(simpleFunctionDescriptor);
            if (simpleFunctionDescriptorD == null) {
                return true;
            }
            Name name118 = simpleFunctionDescriptor.getName();
            Intrinsics.e(name118, "name");
            linkedHashSetK = K(name118);
            if (linkedHashSetK.isEmpty()) {
                return true;
            }
            while (r9.hasNext()) {
                if (simpleFunctionDescriptor4.isSuspend()) {
                }
            }
            return true;
        }
        FunctionDescriptor.CopyBuilder copyBuilderA1 = simpleFunctionDescriptor.A0();
        copyBuilderA1.j(name);
        copyBuilderA1.r();
        copyBuilderA1.m();
        FunctionDescriptor functionDescriptorBuild2 = copyBuilderA1.build();
        Intrinsics.c(functionDescriptorBuild2);
        simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) functionDescriptorBuild2;
        if (arrayList2.isEmpty()) {
            int i8 = BuiltinMethodsWithSpecialGenericSignature.f43732l;
            name2 = simpleFunctionDescriptor.getName();
            Intrinsics.e(name2, "name");
            if (!BuiltinMethodsWithSpecialGenericSignature.b(name2)) {
                simpleFunctionDescriptorD = D(simpleFunctionDescriptor);
                if (simpleFunctionDescriptorD == null) {
                    return true;
                }
                Name name119 = simpleFunctionDescriptor.getName();
                Intrinsics.e(name119, "name");
                linkedHashSetK = K(name119);
                if (linkedHashSetK.isEmpty()) {
                    return true;
                }
                while (r9.hasNext()) {
                    if (simpleFunctionDescriptor4.isSuspend()) {
                    }
                }
                return true;
            }
            Name name1110 = simpleFunctionDescriptor.getName();
            Intrinsics.e(name1110, "name");
            LinkedHashSet linkedHashSetK10 = K(name1110);
            arrayList = new ArrayList();
            it = linkedHashSetK10.iterator();
            while (it.hasNext()) {
                functionDescriptorA = BuiltinMethodsWithSpecialGenericSignature.a((SimpleFunctionDescriptor) it.next());
                if (functionDescriptorA != null) {
                    arrayList.add(functionDescriptorA);
                }
            }
            if (arrayList.isEmpty()) {
                simpleFunctionDescriptorD = D(simpleFunctionDescriptor);
                if (simpleFunctionDescriptorD == null) {
                    return true;
                }
                Name name1111 = simpleFunctionDescriptor.getName();
                Intrinsics.e(name1111, "name");
                linkedHashSetK = K(name1111);
                if (linkedHashSetK.isEmpty()) {
                    return true;
                }
                while (r9.hasNext()) {
                    if (simpleFunctionDescriptor4.isSuspend()) {
                    }
                }
                return true;
            }
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (M(simpleFunctionDescriptor, (FunctionDescriptor) it2.next())) {
                }
            }
            simpleFunctionDescriptorD = D(simpleFunctionDescriptor);
            if (simpleFunctionDescriptorD == null) {
                return true;
            }
            Name name1112 = simpleFunctionDescriptor.getName();
            Intrinsics.e(name1112, "name");
            linkedHashSetK = K(name1112);
            if (linkedHashSetK.isEmpty()) {
                return true;
            }
            while (r9.hasNext()) {
                if (simpleFunctionDescriptor4.isSuspend()) {
                }
            }
            return true;
        }
        it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            if (G((SimpleFunctionDescriptor) it3.next(), simpleFunctionDescriptor2)) {
            }
        }
        int i9 = BuiltinMethodsWithSpecialGenericSignature.f43732l;
        name2 = simpleFunctionDescriptor.getName();
        Intrinsics.e(name2, "name");
        if (!BuiltinMethodsWithSpecialGenericSignature.b(name2)) {
            simpleFunctionDescriptorD = D(simpleFunctionDescriptor);
            if (simpleFunctionDescriptorD == null) {
                return true;
            }
            Name name1113 = simpleFunctionDescriptor.getName();
            Intrinsics.e(name1113, "name");
            linkedHashSetK = K(name1113);
            if (linkedHashSetK.isEmpty()) {
                return true;
            }
            while (r9.hasNext()) {
                if (simpleFunctionDescriptor4.isSuspend()) {
                }
            }
            return true;
        }
        Name name1114 = simpleFunctionDescriptor.getName();
        Intrinsics.e(name1114, "name");
        LinkedHashSet linkedHashSetK11 = K(name1114);
        arrayList = new ArrayList();
        it = linkedHashSetK11.iterator();
        while (it.hasNext()) {
            functionDescriptorA = BuiltinMethodsWithSpecialGenericSignature.a((SimpleFunctionDescriptor) it.next());
            if (functionDescriptorA != null) {
                arrayList.add(functionDescriptorA);
            }
        }
        if (arrayList.isEmpty()) {
            simpleFunctionDescriptorD = D(simpleFunctionDescriptor);
            if (simpleFunctionDescriptorD == null) {
                return true;
            }
            Name name1115 = simpleFunctionDescriptor.getName();
            Intrinsics.e(name1115, "name");
            linkedHashSetK = K(name1115);
            if (linkedHashSetK.isEmpty()) {
                return true;
            }
            while (r9.hasNext()) {
                if (simpleFunctionDescriptor4.isSuspend()) {
                }
            }
            return true;
        }
        it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (M(simpleFunctionDescriptor, (FunctionDescriptor) it2.next())) {
            }
        }
        simpleFunctionDescriptorD = D(simpleFunctionDescriptor);
        if (simpleFunctionDescriptorD == null) {
            return true;
        }
        Name name1116 = simpleFunctionDescriptor.getName();
        Intrinsics.e(name1116, "name");
        linkedHashSetK = K(name1116);
        if (linkedHashSetK.isEmpty()) {
            return true;
        }
        while (r9.hasNext()) {
            if (simpleFunctionDescriptor4.isSuspend()) {
            }
        }
        return true;
        return false;
    }

    public final void O(Name name, LookupLocation location) {
        Intrinsics.f(name, "name");
        Intrinsics.f(location, "location");
        JavaResolverComponents javaResolverComponents = this.f43881b.f43840a;
        kotlin.reflect.jvm.internal.impl.incremental.UtilsKt.a(javaResolverComponents.f43831n, location, this.f43865n, name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection b(Name name, NoLookupLocation noLookupLocation) {
        Intrinsics.f(name, "name");
        O(name, noLookupLocation);
        return super.b(name, noLookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection d(Name name, LookupLocation lookupLocation) {
        Intrinsics.f(name, "name");
        O(name, lookupLocation);
        return super.d(name, lookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final ClassifierDescriptor f(Name name, LookupLocation location) {
        MemoizedFunctionToNullable memoizedFunctionToNullable;
        ClassDescriptor classDescriptor;
        Intrinsics.f(name, "name");
        Intrinsics.f(location, "location");
        O(name, location);
        LazyJavaClassMemberScope lazyJavaClassMemberScope = this.f43882c;
        return (lazyJavaClassMemberScope == null || (memoizedFunctionToNullable = lazyJavaClassMemberScope.f43867u) == null || (classDescriptor = (ClassDescriptor) memoizedFunctionToNullable.invoke(name)) == null) ? (ClassifierDescriptor) this.f43867u.invoke(name) : classDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final Set h(DescriptorKindFilter kindFilter, Function1 function1) {
        Intrinsics.f(kindFilter, "kindFilter");
        return SetsKt.f((Set) this.r.invoke(), ((Map) this.t.invoke()).keySet());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final Set i(DescriptorKindFilter kindFilter, Function1 function1) {
        Intrinsics.f(kindFilter, "kindFilter");
        ClassDescriptor classDescriptor = this.f43865n;
        Collection collectionD = classDescriptor.h().d();
        Intrinsics.e(collectionD, "ownerDescriptor.typeConstructor.supertypes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionD.iterator();
        while (it.hasNext()) {
            CollectionsKt.g(((KotlinType) it.next()).n().a(), linkedHashSet);
        }
        NotNullLazyValue notNullLazyValue = this.f43883e;
        linkedHashSet.addAll(((DeclaredMemberIndex) notNullLazyValue.invoke()).a());
        linkedHashSet.addAll(((DeclaredMemberIndex) notNullLazyValue.invoke()).b());
        linkedHashSet.addAll(h(kindFilter, function1));
        LazyJavaResolverContext lazyJavaResolverContext = this.f43881b;
        linkedHashSet.addAll(lazyJavaResolverContext.f43840a.x.c(lazyJavaResolverContext, classDescriptor));
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final void j(ArrayList arrayList, Name name) {
        Intrinsics.f(name, "name");
        boolean zM = this.o.m();
        ClassDescriptor classDescriptor = this.f43865n;
        LazyJavaResolverContext lazyJavaResolverContext = this.f43881b;
        if (zM) {
            NotNullLazyValue notNullLazyValue = this.f43883e;
            if (((DeclaredMemberIndex) notNullLazyValue.invoke()).e(name) != null) {
                if (arrayList.isEmpty()) {
                    JavaRecordComponent javaRecordComponentE = ((DeclaredMemberIndex) notNullLazyValue.invoke()).e(name);
                    Intrinsics.c(javaRecordComponentE);
                    LazyJavaAnnotations lazyJavaAnnotationsA = LazyJavaAnnotationsKt.a(lazyJavaResolverContext, javaRecordComponentE);
                    Name name2 = javaRecordComponentE.getName();
                    JavaResolverComponents javaResolverComponents = lazyJavaResolverContext.f43840a;
                    JavaMethodDescriptor javaMethodDescriptorU0 = JavaMethodDescriptor.U0(classDescriptor, lazyJavaAnnotationsA, name2, javaResolverComponents.j.a(javaRecordComponentE), true);
                    JavaTypeAttributes javaTypeAttributesA = JavaTypeAttributesKt.a(TypeUsage.f44554Y, false, null, 6);
                    KotlinType kotlinTypeD = lazyJavaResolverContext.f43843e.d(javaRecordComponentE.getType(), javaTypeAttributesA);
                    ReceiverParameterDescriptor receiverParameterDescriptorP = p();
                    EmptyList emptyList = EmptyList.X;
                    javaMethodDescriptorU0.T0(null, receiverParameterDescriptorP, emptyList, emptyList, emptyList, kotlinTypeD, Modality.Z, DescriptorVisibilities.f43564e, null);
                    javaMethodDescriptorU0.V0(false, false);
                    javaResolverComponents.g.getClass();
                    arrayList.add(javaMethodDescriptorU0);
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((SimpleFunctionDescriptor) it.next()).e().isEmpty()) {
                        }
                    }
                    JavaRecordComponent javaRecordComponentE2 = ((DeclaredMemberIndex) notNullLazyValue.invoke()).e(name);
                    Intrinsics.c(javaRecordComponentE2);
                    LazyJavaAnnotations lazyJavaAnnotationsA2 = LazyJavaAnnotationsKt.a(lazyJavaResolverContext, javaRecordComponentE2);
                    Name name3 = javaRecordComponentE2.getName();
                    JavaResolverComponents javaResolverComponents2 = lazyJavaResolverContext.f43840a;
                    JavaMethodDescriptor javaMethodDescriptorU1 = JavaMethodDescriptor.U0(classDescriptor, lazyJavaAnnotationsA2, name3, javaResolverComponents2.j.a(javaRecordComponentE2), true);
                    JavaTypeAttributes javaTypeAttributesA2 = JavaTypeAttributesKt.a(TypeUsage.f44554Y, false, null, 6);
                    KotlinType kotlinTypeD2 = lazyJavaResolverContext.f43843e.d(javaRecordComponentE2.getType(), javaTypeAttributesA2);
                    ReceiverParameterDescriptor receiverParameterDescriptorP2 = p();
                    EmptyList emptyList2 = EmptyList.X;
                    javaMethodDescriptorU1.T0(null, receiverParameterDescriptorP2, emptyList2, emptyList2, emptyList2, kotlinTypeD2, Modality.Z, DescriptorVisibilities.f43564e, null);
                    javaMethodDescriptorU1.V0(false, false);
                    javaResolverComponents2.g.getClass();
                    arrayList.add(javaMethodDescriptorU1);
                }
            }
        }
        lazyJavaResolverContext.f43840a.x.a(lazyJavaResolverContext, classDescriptor, name, arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final DeclaredMemberIndex k() {
        return new ClassDeclaredMemberIndex(this.o, LazyJavaClassMemberScope$computeMemberIndex$1.X);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final void m(LinkedHashSet linkedHashSet, Name name) {
        Intrinsics.f(name, "name");
        LinkedHashSet linkedHashSetK = K(name);
        ArrayList arrayList = SpecialGenericSignatures.f43789a;
        if (!SpecialGenericSignatures.j.contains(name)) {
            int i2 = BuiltinMethodsWithSpecialGenericSignature.f43732l;
            if (!BuiltinMethodsWithSpecialGenericSignature.b(name)) {
                if (!linkedHashSetK.isEmpty()) {
                    Iterator it = linkedHashSetK.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((FunctionDescriptor) it.next()).isSuspend()) {
                            }
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : linkedHashSetK) {
                    if (N((SimpleFunctionDescriptor) obj)) {
                        arrayList2.add(obj);
                    }
                }
                y(linkedHashSet, name, arrayList2, false);
                return;
            }
        }
        SmartSet smartSet = new SmartSet();
        LinkedHashSet linkedHashSetD = DescriptorResolverUtils.d(name, linkedHashSetK, EmptyList.X, this.f43865n, ErrorReporter.f44408a, this.f43881b.f43840a.f43833u.d);
        z(name, linkedHashSet, linkedHashSetD, linkedHashSet, new LazyJavaClassMemberScope$computeNonDeclaredFunctions$3(1, this));
        z(name, linkedHashSet, linkedHashSetD, smartSet, new LazyJavaClassMemberScope$computeNonDeclaredFunctions$4(1, this));
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : linkedHashSetK) {
            if (N((SimpleFunctionDescriptor) obj2)) {
                arrayList3.add(obj2);
            }
        }
        y(linkedHashSet, name, CollectionsKt.O(smartSet, arrayList3), true);
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final void n(ArrayList arrayList, Name name) {
        Set setL0;
        JavaMethod javaMethod;
        Intrinsics.f(name, "name");
        boolean zK = this.o.k();
        LazyJavaResolverContext lazyJavaResolverContext = this.f43881b;
        if (zK && (javaMethod = (JavaMethod) CollectionsKt.X(((DeclaredMemberIndex) this.f43883e.invoke()).d(name))) != null) {
            JavaPropertyDescriptor javaPropertyDescriptorN0 = JavaPropertyDescriptor.N0(this.f43865n, LazyJavaAnnotationsKt.a(lazyJavaResolverContext, javaMethod), UtilsKt.a(javaMethod.getVisibility()), false, javaMethod.getName(), lazyJavaResolverContext.f43840a.j.a(javaMethod), false);
            PropertyGetterDescriptorImpl propertyGetterDescriptorImplC = DescriptorFactory.c(javaPropertyDescriptorN0, Annotations.Companion.f43614a);
            javaPropertyDescriptorN0.K0(propertyGetterDescriptorImplC, null, null, null);
            Intrinsics.f(lazyJavaResolverContext, "<this>");
            KotlinType kotlinTypeL = LazyJavaScope.l(javaMethod, new LazyJavaResolverContext(lazyJavaResolverContext.f43840a, new LazyJavaTypeParameterResolver(lazyJavaResolverContext, javaPropertyDescriptorN0, javaMethod, 0), lazyJavaResolverContext.f43842c));
            EmptyList emptyList = EmptyList.X;
            javaPropertyDescriptorN0.M0(kotlinTypeL, emptyList, p(), null, emptyList);
            propertyGetterDescriptorImplC.n0 = kotlinTypeL;
            arrayList.add(javaPropertyDescriptorN0);
        }
        Set setL = L(name);
        if (setL.isEmpty()) {
            return;
        }
        SmartSet smartSet = new SmartSet();
        SmartSet smartSet2 = new SmartSet();
        A(setL, arrayList, smartSet, new Function1<Name, Collection<? extends SimpleFunctionDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$computeNonDeclaredProperties$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Name it = (Name) obj;
                Intrinsics.f(it, "it");
                return LazyJavaClassMemberScope.v(this.X, it);
            }
        });
        if (smartSet.isEmpty()) {
            setL0 = CollectionsKt.l0(setL);
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object obj : setL) {
                if (!smartSet.contains(obj)) {
                    linkedHashSet.add(obj);
                }
            }
            setL0 = linkedHashSet;
        }
        A(setL0, smartSet2, null, new Function1<Name, Collection<? extends SimpleFunctionDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$computeNonDeclaredProperties$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Name it = (Name) obj2;
                Intrinsics.f(it, "it");
                return LazyJavaClassMemberScope.w(this.X, it);
            }
        });
        LinkedHashSet linkedHashSetF = SetsKt.f(setL, smartSet2);
        JavaResolverComponents javaResolverComponents = lazyJavaResolverContext.f43840a;
        arrayList.addAll(DescriptorResolverUtils.d(name, linkedHashSetF, arrayList, this.f43865n, javaResolverComponents.f, javaResolverComponents.f43833u.d));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final Set o(DescriptorKindFilter kindFilter) {
        Intrinsics.f(kindFilter, "kindFilter");
        if (this.o.k()) {
            return a();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((DeclaredMemberIndex) this.f43883e.invoke()).c());
        Collection collectionD = this.f43865n.h().d();
        Intrinsics.e(collectionD, "ownerDescriptor.typeConstructor.supertypes");
        Iterator it = collectionD.iterator();
        while (it.hasNext()) {
            CollectionsKt.g(((KotlinType) it.next()).n().c(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final ReceiverParameterDescriptor p() {
        ClassDescriptor classDescriptor = this.f43865n;
        if (classDescriptor != null) {
            int i2 = DescriptorUtils.f44280a;
            return classDescriptor.E0();
        }
        DescriptorUtils.a(0);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final DeclarationDescriptor q() {
        return this.f43865n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final boolean r(JavaMethodDescriptor javaMethodDescriptor) {
        if (this.o.k()) {
            return false;
        }
        return N(javaMethodDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final LazyJavaScope.MethodSignatureData s(JavaMethod method, ArrayList arrayList, KotlinType kotlinType, List list) {
        Intrinsics.f(method, "method");
        SignaturePropagator.PropagatedSignature propagatedSignatureA = this.f43881b.f43840a.f43827e.a(method, this.f43865n, kotlinType, list, arrayList);
        KotlinType kotlinType2 = propagatedSignatureA.f43818a;
        List list2 = propagatedSignatureA.f43819b;
        ArrayList arrayList2 = propagatedSignatureA.f43820c;
        List list3 = Collections.EMPTY_LIST;
        if (list3 != null) {
            return new LazyJavaScope.MethodSignatureData(kotlinType2, list2, arrayList2, list3);
        }
        SignaturePropagator.PropagatedSignature.a(7);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final String toString() {
        return "Lazy Java member scope for " + this.o.c();
    }

    public final void x(ArrayList arrayList, JavaClassConstructorDescriptor javaClassConstructorDescriptor, int i2, JavaMethod javaMethod, KotlinType kotlinType, KotlinType kotlinType2) {
        Annotations$Companion$EMPTY$1 annotations$Companion$EMPTY$1 = Annotations.Companion.f43614a;
        Name name = javaMethod.getName();
        if (kotlinType != null) {
            arrayList.add(new ValueParameterDescriptorImpl(javaClassConstructorDescriptor, null, i2, annotations$Companion$EMPTY$1, name, TypeUtils.g(kotlinType, false), javaMethod.E(), false, false, kotlinType2 != null ? TypeUtils.g(kotlinType2, false) : null, this.f43881b.f43840a.j.a(javaMethod)));
        } else {
            TypeUtils.a(2);
            throw null;
        }
    }

    public final void y(LinkedHashSet linkedHashSet, Name name, ArrayList arrayList, boolean z2) {
        JavaResolverComponents javaResolverComponents = this.f43881b.f43840a;
        LinkedHashSet<SimpleFunctionDescriptor> linkedHashSetD = DescriptorResolverUtils.d(name, arrayList, linkedHashSet, this.f43865n, javaResolverComponents.f, javaResolverComponents.f43833u.d);
        if (!z2) {
            linkedHashSet.addAll(linkedHashSetD);
            return;
        }
        ArrayList arrayListO = CollectionsKt.O(linkedHashSetD, linkedHashSet);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.n(linkedHashSetD, 10));
        for (SimpleFunctionDescriptor simpleFunctionDescriptorC : linkedHashSetD) {
            SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) SpecialBuiltinMembers.c(simpleFunctionDescriptorC);
            if (simpleFunctionDescriptor != null) {
                simpleFunctionDescriptorC = C(simpleFunctionDescriptorC, simpleFunctionDescriptor, arrayListO);
            }
            arrayList2.add(simpleFunctionDescriptorC);
        }
        linkedHashSet.addAll(arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0065  */
    public final void z(Name name, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, AbstractSet abstractSet, Function1 function1) {
        SimpleFunctionDescriptor simpleFunctionDescriptorC;
        Object next;
        SimpleFunctionDescriptor simpleFunctionDescriptor;
        SimpleFunctionDescriptor simpleFunctionDescriptorC2;
        Iterator it = linkedHashSet2.iterator();
        while (it.hasNext()) {
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) it.next();
            SimpleFunctionDescriptor simpleFunctionDescriptor3 = (SimpleFunctionDescriptor) SpecialBuiltinMembers.b(simpleFunctionDescriptor2);
            SimpleFunctionDescriptor simpleFunctionDescriptor4 = null;
            if (simpleFunctionDescriptor3 != null) {
                String strA = SpecialBuiltinMembers.a(simpleFunctionDescriptor3);
                Intrinsics.c(strA);
                Iterator it2 = ((Collection) function1.invoke(Name.g(strA))).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        simpleFunctionDescriptorC = null;
                        break;
                    }
                    FunctionDescriptor.CopyBuilder copyBuilderA0 = ((SimpleFunctionDescriptor) it2.next()).A0();
                    copyBuilderA0.j(name);
                    copyBuilderA0.r();
                    copyBuilderA0.m();
                    FunctionDescriptor functionDescriptorBuild = copyBuilderA0.build();
                    Intrinsics.c(functionDescriptorBuild);
                    SimpleFunctionDescriptor simpleFunctionDescriptor5 = (SimpleFunctionDescriptor) functionDescriptorBuild;
                    if (G(simpleFunctionDescriptor3, simpleFunctionDescriptor5)) {
                        simpleFunctionDescriptorC = C(simpleFunctionDescriptor5, simpleFunctionDescriptor3, linkedHashSet);
                        break;
                    }
                }
            } else {
                simpleFunctionDescriptorC = null;
                break;
            }
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.a(abstractSet, simpleFunctionDescriptorC);
            FunctionDescriptor functionDescriptorA = BuiltinMethodsWithSpecialGenericSignature.a(simpleFunctionDescriptor2);
            if (functionDescriptorA == null) {
                simpleFunctionDescriptorC2 = null;
            } else {
                Name name2 = functionDescriptorA.getName();
                Intrinsics.e(name2, "overridden.name");
                Iterator it3 = ((Iterable) function1.invoke(name2)).iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!M((SimpleFunctionDescriptor) next, functionDescriptorA));
                SimpleFunctionDescriptor simpleFunctionDescriptor6 = (SimpleFunctionDescriptor) next;
                if (simpleFunctionDescriptor6 != null) {
                    FunctionDescriptor.CopyBuilder copyBuilderA1 = simpleFunctionDescriptor6.A0();
                    List listE = functionDescriptorA.e();
                    Intrinsics.e(listE, "overridden.valueParameters");
                    List list = listE;
                    ArrayList arrayList = new ArrayList(CollectionsKt.n(list, 10));
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(((ValueParameterDescriptor) it4.next()).getType());
                    }
                    List listE2 = simpleFunctionDescriptor6.e();
                    Intrinsics.e(listE2, "override.valueParameters");
                    copyBuilderA1.a(UtilKt.a(arrayList, listE2, functionDescriptorA));
                    copyBuilderA1.r();
                    copyBuilderA1.m();
                    copyBuilderA1.o();
                    simpleFunctionDescriptor = (SimpleFunctionDescriptor) copyBuilderA1.build();
                } else {
                    simpleFunctionDescriptor = null;
                }
                if (simpleFunctionDescriptor == null) {
                    simpleFunctionDescriptorC2 = null;
                } else {
                    if (!N(simpleFunctionDescriptor)) {
                        simpleFunctionDescriptor = null;
                    }
                    if (simpleFunctionDescriptor != null) {
                        simpleFunctionDescriptorC2 = C(simpleFunctionDescriptor, functionDescriptorA, linkedHashSet);
                    } else {
                        simpleFunctionDescriptorC2 = null;
                    }
                }
            }
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.a(abstractSet, simpleFunctionDescriptorC2);
            if (simpleFunctionDescriptor2.isSuspend()) {
                Name name3 = simpleFunctionDescriptor2.getName();
                Intrinsics.e(name3, "descriptor.name");
                Iterator it5 = ((Iterable) function1.invoke(name3)).iterator();
                while (it5.hasNext()) {
                    SimpleFunctionDescriptor simpleFunctionDescriptorD = D((SimpleFunctionDescriptor) it5.next());
                    if (simpleFunctionDescriptorD == null || !F(simpleFunctionDescriptorD, simpleFunctionDescriptor2)) {
                        simpleFunctionDescriptorD = null;
                    }
                    if (simpleFunctionDescriptorD != null) {
                        simpleFunctionDescriptor4 = simpleFunctionDescriptorD;
                        break;
                    }
                }
            }
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.a(abstractSet, simpleFunctionDescriptor4);
        }
    }
}
