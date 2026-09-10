package kotlin.reflect.jvm.internal;

import androidx.datastore.preferences.protobuf.a;
import com.google.android.gms.ads.RequestConfiguration;
import com.thinkup.core.common.n.mo;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u00052\u00020\u0006:\u0001\u0015R\u0014\u0010\n\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lkotlin/reflect/jvm/internal/KClassImpl;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/reflect/KClass;", "Lkotlin/reflect/jvm/internal/KClassifierImpl;", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "classId", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getMemberScope$kotlin_reflection", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "memberScope", "getStaticScope$kotlin_reflection", "staticScope", "Data", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class KClassImpl<T> extends KDeclarationContainerImpl implements KClass<T>, KClassifierImpl, KTypeParameterOwnerImpl {
    public static final /* synthetic */ int e0 = 0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Class f43390Y;
    public final ReflectProperties.LazyVal Z;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class Data extends KDeclarationContainerImpl.Data {
        public static final /* synthetic */ KProperty[] m;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ReflectProperties.LazySoftVal f43391c;
        public final ReflectProperties.LazySoftVal d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ReflectProperties.LazySoftVal f43392e;
        public final ReflectProperties.LazySoftVal f;
        public final ReflectProperties.LazySoftVal g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ReflectProperties.LazySoftVal f43393h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final ReflectProperties.LazySoftVal f43394i;
        public final ReflectProperties.LazySoftVal j;
        public final ReflectProperties.LazySoftVal k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final ReflectProperties.LazySoftVal f43395l;

        static {
            ReflectionFactory reflectionFactory = Reflection.f43333a;
            m = new KProperty[]{reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(Data.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(Data.class), "annotations", "getAnnotations()Ljava/util/List;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(Data.class), "simpleName", "getSimpleName()Ljava/lang/String;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(Data.class), "qualifiedName", "getQualifiedName()Ljava/lang/String;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(Data.class), "constructors", "getConstructors()Ljava/util/Collection;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(Data.class), "nestedClasses", "getNestedClasses()Ljava/util/Collection;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(Data.class), "objectInstance", "getObjectInstance()Ljava/lang/Object;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(Data.class), "typeParameters", "getTypeParameters()Ljava/util/List;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(Data.class), "supertypes", "getSupertypes()Ljava/util/List;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(Data.class), "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(Data.class), "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(Data.class), "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(Data.class), "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(Data.class), "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(Data.class), "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(Data.class), "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(Data.class), "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;")), reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(Data.class), "allMembers", "getAllMembers()Ljava/util/Collection;"))};
        }

        public Data(final KClassImpl kClassImpl) {
            super(kClassImpl);
            this.f43391c = ReflectProperties.a(null, new Function0<ClassDescriptor>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$descriptor$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() throws InvocationTargetException {
                    int i2 = KClassImpl.e0;
                    KClassImpl kClassImpl2 = kClassImpl;
                    ClassId classIdX = kClassImpl2.x();
                    KClassImpl.Data data = (KClassImpl.Data) kClassImpl2.Z.invoke();
                    data.getClass();
                    KProperty kProperty = KDeclarationContainerImpl.Data.f43401b[0];
                    Object objInvoke = data.f43402a.invoke();
                    Intrinsics.e(objInvoke, "<get-moduleData>(...)");
                    boolean z2 = classIdX.f44163c;
                    DeserializationComponents deserializationComponents = ((RuntimeModuleData) objInvoke).f43678a;
                    ClassDescriptor classDescriptorB = z2 ? deserializationComponents.b(classIdX) : FindClassInModuleKt.a(deserializationComponents.f44392b, classIdX);
                    if (classDescriptorB != null) {
                        return classDescriptorB;
                    }
                    Class cls = kClassImpl2.f43390Y;
                    ReflectKotlinClass reflectKotlinClassA = ReflectKotlinClass.Factory.a(cls);
                    KotlinClassHeader.Kind kind = reflectKotlinClassA != null ? reflectKotlinClassA.f43674b.f44021a : null;
                    switch (kind == null ? -1 : KClassImpl.WhenMappings.f43400a[kind.ordinal()]) {
                        case -1:
                        case 6:
                            throw new KotlinReflectionInternalError(a.j(cls, "Unresolved class: "));
                        case 0:
                        default:
                            throw new NoWhenBranchMatchedException();
                        case 1:
                        case 2:
                        case 3:
                            throw new UnsupportedOperationException(a.j(cls, "Packages and file facades are not yet supported in Kotlin reflection. Meanwhile please use Java reflection to inspect this class: "));
                        case 4:
                            throw new UnsupportedOperationException(a.j(cls, "This class is an internal synthetic class generated by the Kotlin compiler, such as an anonymous class for a lambda, a SAM wrapper, a callable reference, etc. It's not a Kotlin class or interface, so the reflection library has no idea what declarations it has. Please use Java reflection to inspect this class: "));
                        case 5:
                            throw new KotlinReflectionInternalError("Unknown class: " + cls + " (kind = " + kind + ')');
                    }
                }
            });
            ReflectProperties.a(null, new Function0<List<? extends Annotation>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$annotations$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UtilKt.d(this.X.a());
                }
            });
            this.d = ReflectProperties.a(null, new Function0<String>(this) { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$simpleName$2

                /* JADX INFO: renamed from: Y, reason: collision with root package name */
                public final /* synthetic */ KClassImpl.Data f43396Y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.f43396Y = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    KClassImpl kClassImpl2 = kClassImpl;
                    if (kClassImpl2.f43390Y.isAnonymousClass()) {
                        return null;
                    }
                    ClassId classIdX = kClassImpl2.x();
                    if (!classIdX.f44163c) {
                        String strB = classIdX.i().b();
                        Intrinsics.e(strB, "classId.shortClassName.asString()");
                        return strB;
                    }
                    KProperty[] kPropertyArr = KClassImpl.Data.m;
                    this.f43396Y.getClass();
                    Class cls = kClassImpl2.f43390Y;
                    String simpleName = cls.getSimpleName();
                    Method enclosingMethod = cls.getEnclosingMethod();
                    if (enclosingMethod != null) {
                        return StringsKt.P(simpleName, enclosingMethod.getName() + '$', simpleName);
                    }
                    Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                    if (enclosingConstructor == null) {
                        return StringsKt.O('$', simpleName, simpleName);
                    }
                    return StringsKt.P(simpleName, enclosingConstructor.getName() + '$', simpleName);
                }
            });
            this.f43392e = ReflectProperties.a(null, new Function0<String>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$qualifiedName$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    KClassImpl kClassImpl2 = kClassImpl;
                    if (kClassImpl2.f43390Y.isAnonymousClass()) {
                        return null;
                    }
                    ClassId classIdX = kClassImpl2.x();
                    if (classIdX.f44163c) {
                        return null;
                    }
                    return classIdX.b().b();
                }
            });
            ReflectProperties.a(null, new Function0<List<? extends KFunction<Object>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$constructors$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    KClassImpl kClassImpl2 = kClassImpl;
                    Collection collectionF = kClassImpl2.f();
                    ArrayList arrayList = new ArrayList(CollectionsKt.n(collectionF, 10));
                    Iterator it = collectionF.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new KFunctionImpl(kClassImpl2, (ConstructorDescriptor) it.next()));
                    }
                    return arrayList;
                }
            });
            ReflectProperties.a(null, new Function0<List<? extends KClassImpl<? extends Object>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$nestedClasses$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    MemberScope memberScopeN = this.X.a().N();
                    Intrinsics.e(memberScopeN, "descriptor.unsubstitutedInnerClassesScope");
                    Collection collectionA = ResolutionScope.DefaultImpls.a(memberScopeN, null, 3);
                    ArrayList<DeclarationDescriptor> arrayList = new ArrayList();
                    for (Object obj : collectionA) {
                        if (!DescriptorUtils.m((DeclarationDescriptor) obj)) {
                            arrayList.add(obj);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (DeclarationDescriptor declarationDescriptor : arrayList) {
                        ClassDescriptor classDescriptor = declarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptor : null;
                        Class clsJ = classDescriptor != null ? UtilKt.j(classDescriptor) : null;
                        KClassImpl kClassImpl2 = clsJ != null ? new KClassImpl(clsJ) : null;
                        if (kClassImpl2 != null) {
                            arrayList2.add(kClassImpl2);
                        }
                    }
                    return arrayList2;
                }
            });
            ReflectProperties.a(null, new Function0<List<? extends KTypeParameterImpl>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$typeParameters$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    List listP = this.X.a().p();
                    Intrinsics.e(listP, "descriptor.declaredTypeParameters");
                    List<TypeParameterDescriptor> list = listP;
                    ArrayList arrayList = new ArrayList(CollectionsKt.n(list, 10));
                    for (TypeParameterDescriptor descriptor : list) {
                        Intrinsics.e(descriptor, "descriptor");
                        arrayList.add(new KTypeParameterImpl(kClassImpl, descriptor));
                    }
                    return arrayList;
                }
            });
            this.f = ReflectProperties.a(null, new Function0<List<? extends KTypeImpl>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$supertypes$2

                /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.KClassImpl$Data$supertypes$2$3, reason: invalid class name */
                @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/lang/reflect/Type;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
                final class AnonymousClass3 extends Lambda implements Function0<Type> {
                    public static final AnonymousClass3 X = new AnonymousClass3(0);

                    @Override // kotlin.jvm.functions.Function0
                    public final /* bridge */ /* synthetic */ Object invoke() {
                        return Object.class;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    final KClassImpl.Data data = this.X;
                    Collection<KotlinType> collectionD = data.a().h().d();
                    Intrinsics.e(collectionD, "descriptor.typeConstructor.supertypes");
                    ArrayList arrayList = new ArrayList(collectionD.size());
                    for (final KotlinType kotlinType : collectionD) {
                        Intrinsics.e(kotlinType, "kotlinType");
                        final KClassImpl kClassImpl2 = kClassImpl;
                        arrayList.add(new KTypeImpl(kotlinType, new Function0<Type>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$supertypes$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                ClassifierDescriptor classifierDescriptorC = kotlinType.H0().c();
                                if (!(classifierDescriptorC instanceof ClassDescriptor)) {
                                    throw new KotlinReflectionInternalError("Supertype not a class: " + classifierDescriptorC);
                                }
                                Class clsJ = UtilKt.j((ClassDescriptor) classifierDescriptorC);
                                KClassImpl.Data data2 = data;
                                if (clsJ == null) {
                                    throw new KotlinReflectionInternalError("Unsupported superclass of " + data2 + ": " + classifierDescriptorC);
                                }
                                KClassImpl kClassImpl3 = kClassImpl2;
                                boolean zA = Intrinsics.a(kClassImpl3.f43390Y.getSuperclass(), clsJ);
                                Class cls = kClassImpl3.f43390Y;
                                if (zA) {
                                    Type genericSuperclass = cls.getGenericSuperclass();
                                    Intrinsics.e(genericSuperclass, "{\n                      …ass\n                    }");
                                    return genericSuperclass;
                                }
                                Class<?>[] interfaces = cls.getInterfaces();
                                Intrinsics.e(interfaces, "jClass.interfaces");
                                int iE = ArraysKt.E(interfaces, clsJ);
                                if (iE >= 0) {
                                    Type type = cls.getGenericInterfaces()[iE];
                                    Intrinsics.e(type, "{\n                      …ex]\n                    }");
                                    return type;
                                }
                                throw new KotlinReflectionInternalError("No superclass of " + data2 + " in Java reflection for " + classifierDescriptorC);
                            }
                        }));
                    }
                    ClassDescriptor classDescriptorA = data.a();
                    Name name = KotlinBuiltIns.f;
                    if (!KotlinBuiltIns.b(classDescriptorA, StandardNames.FqNames.f43494a) && !KotlinBuiltIns.b(classDescriptorA, StandardNames.FqNames.f43495b)) {
                        if (arrayList.isEmpty()) {
                            SimpleType simpleTypeE = DescriptorUtilsKt.e(data.a()).e();
                            Intrinsics.e(simpleTypeE, "descriptor.builtIns.anyType");
                            arrayList.add(new KTypeImpl(simpleTypeE, AnonymousClass3.X));
                        } else {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ClassKind kind = DescriptorUtils.c(((KTypeImpl) it.next()).X).getKind();
                                Intrinsics.e(kind, "getClassDescriptorForType(it.type).kind");
                                if (kind == ClassKind.f43559Y || kind == ClassKind.f0) {
                                }
                            }
                            SimpleType simpleTypeE2 = DescriptorUtilsKt.e(data.a()).e();
                            Intrinsics.e(simpleTypeE2, "descriptor.builtIns.anyType");
                            arrayList.add(new KTypeImpl(simpleTypeE2, AnonymousClass3.X));
                        }
                    }
                    return kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.b(arrayList);
                }
            });
            ReflectProperties.a(null, new Function0<List<? extends KClassImpl<Object>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$sealedSubclasses$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Collection<ClassDescriptor> collectionU = this.X.a().u();
                    Intrinsics.e(collectionU, "descriptor.sealedSubclasses");
                    ArrayList arrayList = new ArrayList();
                    for (ClassDescriptor classDescriptor : collectionU) {
                        Intrinsics.d(classDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        Class clsJ = UtilKt.j(classDescriptor);
                        KClassImpl kClassImpl2 = clsJ != null ? new KClassImpl(clsJ) : null;
                        if (kClassImpl2 != null) {
                            arrayList.add(kClassImpl2);
                        }
                    }
                    return arrayList;
                }
            });
            this.g = ReflectProperties.a(null, new Function0<Collection<? extends KCallableImpl<?>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$declaredNonStaticMembers$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    KClassImpl kClassImpl2 = kClassImpl;
                    return kClassImpl2.p(kClassImpl2.getDescriptor().o().n(), KDeclarationContainerImpl.MemberBelonginess.X);
                }
            });
            this.f43393h = ReflectProperties.a(null, new Function0<Collection<? extends KCallableImpl<?>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$declaredStaticMembers$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    KClassImpl kClassImpl2 = kClassImpl;
                    MemberScope memberScopeF0 = kClassImpl2.getDescriptor().f0();
                    Intrinsics.e(memberScopeF0, "descriptor.staticScope");
                    return kClassImpl2.p(memberScopeF0, KDeclarationContainerImpl.MemberBelonginess.X);
                }
            });
            this.f43394i = ReflectProperties.a(null, new Function0<Collection<? extends KCallableImpl<?>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$inheritedNonStaticMembers$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    KClassImpl kClassImpl2 = kClassImpl;
                    return kClassImpl2.p(kClassImpl2.getDescriptor().o().n(), KDeclarationContainerImpl.MemberBelonginess.f43403Y);
                }
            });
            this.j = ReflectProperties.a(null, new Function0<Collection<? extends KCallableImpl<?>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$inheritedStaticMembers$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    KClassImpl kClassImpl2 = kClassImpl;
                    MemberScope memberScopeF0 = kClassImpl2.getDescriptor().f0();
                    Intrinsics.e(memberScopeF0, "descriptor.staticScope");
                    return kClassImpl2.p(memberScopeF0, KDeclarationContainerImpl.MemberBelonginess.f43403Y);
                }
            });
            this.k = ReflectProperties.a(null, new Function0<List<? extends KCallableImpl<?>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$allNonStaticMembers$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    KClassImpl.Data data = this.X;
                    data.getClass();
                    KProperty[] kPropertyArr = KClassImpl.Data.m;
                    KProperty kProperty = kPropertyArr[10];
                    Object objInvoke = data.g.invoke();
                    Intrinsics.e(objInvoke, "<get-declaredNonStaticMembers>(...)");
                    KProperty kProperty2 = kPropertyArr[12];
                    Object objInvoke2 = data.f43394i.invoke();
                    Intrinsics.e(objInvoke2, "<get-inheritedNonStaticMembers>(...)");
                    return CollectionsKt.O((Collection) objInvoke2, (Collection) objInvoke);
                }
            });
            this.f43395l = ReflectProperties.a(null, new Function0<List<? extends KCallableImpl<?>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$allStaticMembers$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    KProperty[] kPropertyArr = KClassImpl.Data.m;
                    KClassImpl.Data data = this.X;
                    data.getClass();
                    KProperty[] kPropertyArr2 = KClassImpl.Data.m;
                    KProperty kProperty = kPropertyArr2[11];
                    Object objInvoke = data.f43393h.invoke();
                    Intrinsics.e(objInvoke, "<get-declaredStaticMembers>(...)");
                    KProperty kProperty2 = kPropertyArr2[13];
                    Object objInvoke2 = data.j.invoke();
                    Intrinsics.e(objInvoke2, "<get-inheritedStaticMembers>(...)");
                    return CollectionsKt.O((Collection) objInvoke2, (Collection) objInvoke);
                }
            });
            ReflectProperties.a(null, new Function0<List<? extends KCallableImpl<?>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$declaredMembers$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    KClassImpl.Data data = this.X;
                    data.getClass();
                    KProperty[] kPropertyArr = KClassImpl.Data.m;
                    KProperty kProperty = kPropertyArr[10];
                    Object objInvoke = data.g.invoke();
                    Intrinsics.e(objInvoke, "<get-declaredNonStaticMembers>(...)");
                    KProperty kProperty2 = kPropertyArr[11];
                    Object objInvoke2 = data.f43393h.invoke();
                    Intrinsics.e(objInvoke2, "<get-declaredStaticMembers>(...)");
                    return CollectionsKt.O((Collection) objInvoke2, (Collection) objInvoke);
                }
            });
            ReflectProperties.a(null, new Function0<List<? extends KCallableImpl<?>>>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$Data$allMembers$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    KClassImpl.Data data = this.X;
                    data.getClass();
                    KProperty[] kPropertyArr = KClassImpl.Data.m;
                    KProperty kProperty = kPropertyArr[14];
                    Object objInvoke = data.k.invoke();
                    Intrinsics.e(objInvoke, "<get-allNonStaticMembers>(...)");
                    KProperty kProperty2 = kPropertyArr[15];
                    Object objInvoke2 = data.f43395l.invoke();
                    Intrinsics.e(objInvoke2, "<get-allStaticMembers>(...)");
                    return CollectionsKt.O((Collection) objInvoke2, (Collection) objInvoke);
                }
            });
        }

        public final ClassDescriptor a() {
            KProperty kProperty = m[0];
            Object objInvoke = this.f43391c.invoke();
            Intrinsics.e(objInvoke, "<get-descriptor>(...)");
            return (ClassDescriptor) objInvoke;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43400a;

        static {
            int[] iArr = new int[KotlinClassHeader.Kind.values().length];
            try {
                LinkedHashMap linkedHashMap = KotlinClassHeader.Kind.f44025Y;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LinkedHashMap linkedHashMap2 = KotlinClassHeader.Kind.f44025Y;
                iArr[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                LinkedHashMap linkedHashMap3 = KotlinClassHeader.Kind.f44025Y;
                iArr[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                LinkedHashMap linkedHashMap4 = KotlinClassHeader.Kind.f44025Y;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                LinkedHashMap linkedHashMap5 = KotlinClassHeader.Kind.f44025Y;
                iArr[0] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                LinkedHashMap linkedHashMap6 = KotlinClassHeader.Kind.f44025Y;
                iArr[1] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f43400a = iArr;
        }
    }

    public KClassImpl(Class jClass) {
        Intrinsics.f(jClass, "jClass");
        this.f43390Y = jClass;
        this.Z = new ReflectProperties.LazyVal(new Function0<KClassImpl<Object>.Data>() { // from class: kotlin.reflect.jvm.internal.KClassImpl$data$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new KClassImpl.Data(this.X);
            }
        });
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Class getF43390Y() {
        return this.f43390Y;
    }

    @Override // kotlin.reflect.KClass
    public final List d() {
        Data data = (Data) this.Z.invoke();
        data.getClass();
        KProperty kProperty = Data.m[8];
        Object objInvoke = data.f.invoke();
        Intrinsics.e(objInvoke, "<get-supertypes>(...)");
        return (List) objInvoke;
    }

    @Override // kotlin.reflect.KClass
    public final boolean e(Object obj) {
        List list = ReflectClassUtilKt.f43693a;
        Class cls = this.f43390Y;
        Intrinsics.f(cls, "<this>");
        Integer num = (Integer) ReflectClassUtilKt.d.get(cls);
        if (num != null) {
            return TypeIntrinsics.e(num.intValue(), obj);
        }
        Class cls2 = (Class) ReflectClassUtilKt.f43695c.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return cls.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof KClassImpl) && JvmClassMappingKt.c(this).equals(JvmClassMappingKt.c((KClass) obj));
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public final Collection f() {
        ClassDescriptor descriptor = getDescriptor();
        if (descriptor.getKind() == ClassKind.f43559Y || descriptor.getKind() == ClassKind.g0) {
            return EmptyList.X;
        }
        Collection collectionI = descriptor.i();
        Intrinsics.e(collectionI, "descriptor.constructors");
        return collectionI;
    }

    @Override // kotlin.reflect.KClass
    public final int hashCode() {
        return JvmClassMappingKt.c(this).hashCode();
    }

    @Override // kotlin.reflect.KClass
    public final String k() {
        Data data = (Data) this.Z.invoke();
        data.getClass();
        KProperty kProperty = Data.m[3];
        return (String) data.f43392e.invoke();
    }

    @Override // kotlin.reflect.KClass
    public final String l() {
        Data data = (Data) this.Z.invoke();
        data.getClass();
        KProperty kProperty = Data.m[2];
        return (String) data.d.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public final Collection n(Name name) {
        MemberScope memberScopeN = getDescriptor().o().n();
        NoLookupLocation noLookupLocation = NoLookupLocation.f43721Y;
        Collection collectionD = memberScopeN.d(name, noLookupLocation);
        MemberScope memberScopeF0 = getDescriptor().f0();
        Intrinsics.e(memberScopeF0, "descriptor.staticScope");
        return CollectionsKt.O(memberScopeF0.d(name, noLookupLocation), collectionD);
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public final PropertyDescriptor o(int i2) {
        Class<?> declaringClass;
        Class cls = this.f43390Y;
        if (cls.getSimpleName().equals("DefaultImpls") && (declaringClass = cls.getDeclaringClass()) != null && declaringClass.isInterface()) {
            return ((KClassImpl) JvmClassMappingKt.e(declaringClass)).o(i2);
        }
        ClassDescriptor descriptor = getDescriptor();
        DeserializedClassDescriptor deserializedClassDescriptor = descriptor instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) descriptor : null;
        if (deserializedClassDescriptor != null) {
            GeneratedMessageLite.GeneratedExtension classLocalVariable = JvmProtoBuf.j;
            Intrinsics.e(classLocalVariable, "classLocalVariable");
            ProtoBuf.Class r4 = deserializedClassDescriptor.f0;
            Intrinsics.f(r4, "<this>");
            ProtoBuf.Property property = (ProtoBuf.Property) (i2 < r4.k(classLocalVariable) ? r4.j(classLocalVariable, i2) : null);
            if (property != null) {
                DeserializationContext deserializationContext = deserializedClassDescriptor.m0;
                return (PropertyDescriptor) UtilKt.f(this.f43390Y, property, deserializationContext.f44402b, deserializationContext.d, deserializedClassDescriptor.g0, KClassImpl$getLocalProperty$2$1$1.X);
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public final Collection r(Name name) {
        MemberScope memberScopeN = getDescriptor().o().n();
        NoLookupLocation noLookupLocation = NoLookupLocation.f43721Y;
        Collection collectionB = memberScopeN.b(name, noLookupLocation);
        MemberScope memberScopeF0 = getDescriptor().f0();
        Intrinsics.e(memberScopeF0, "descriptor.staticScope");
        return CollectionsKt.O(memberScopeF0.b(name, noLookupLocation), collectionB);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("class ");
        ClassId classIdX = x();
        FqName fqNameG = classIdX.g();
        Intrinsics.e(fqNameG, "classId.packageFqName");
        String strConcat = fqNameG.d() ? "" : fqNameG.b().concat(mo.ono);
        sb.append(strConcat + StringsKt.H(classIdX.h().b(), '.', '$'));
        return sb.toString();
    }

    public final ClassId x() {
        PrimitiveType primitiveTypeG;
        ClassId classId = RuntimeTypeMapper.f43419a;
        Class klass = this.f43390Y;
        Intrinsics.f(klass, "klass");
        if (klass.isArray()) {
            Class<?> componentType = klass.getComponentType();
            Intrinsics.e(componentType, "klass.componentType");
            primitiveTypeG = componentType.isPrimitive() ? JvmPrimitiveType.b(componentType.getSimpleName()).g() : null;
            return primitiveTypeG != null ? new ClassId(StandardNames.k, primitiveTypeG.f43467Y) : ClassId.j(StandardNames.FqNames.g.g());
        }
        if (klass.equals(Void.TYPE)) {
            return RuntimeTypeMapper.f43419a;
        }
        primitiveTypeG = klass.isPrimitive() ? JvmPrimitiveType.b(klass.getSimpleName()).g() : null;
        if (primitiveTypeG != null) {
            return new ClassId(StandardNames.k, primitiveTypeG.X);
        }
        ClassId classIdA = ReflectClassUtilKt.a(klass);
        if (!classIdA.f44163c) {
            String str = JavaToKotlinClassMap.f43521a;
            ClassId classId2 = (ClassId) JavaToKotlinClassMap.f43525h.get(classIdA.b().i());
            if (classId2 != null) {
                return classId2;
            }
        }
        return classIdA;
    }

    @Override // kotlin.reflect.jvm.internal.KClassifierImpl
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final ClassDescriptor getDescriptor() {
        return ((Data) this.Z.invoke()).a();
    }
}
