package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.collections.IndexingIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationSettingsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifier;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.DefaultTypeAttributeTranslator;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionBase;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import kotlin.sequences.FilteringSequence;

/* JADX INFO: loaded from: classes7.dex */
public final class JavaTypeResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LazyJavaResolverContext f43904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypeParameterResolver f43905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RawProjectionComputer f43906c;
    public final TypeParameterUpperBoundEraser d;

    public JavaTypeResolver(LazyJavaResolverContext c2, TypeParameterResolver typeParameterResolver) {
        Intrinsics.f(c2, "c");
        Intrinsics.f(typeParameterResolver, "typeParameterResolver");
        this.f43904a = c2;
        this.f43905b = typeParameterResolver;
        RawProjectionComputer rawProjectionComputer = new RawProjectionComputer();
        this.f43906c = rawProjectionComputer;
        this.d = new TypeParameterUpperBoundEraser(rawProjectionComputer);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x020a  */
    /* JADX WARN: Code duplicated, block: B:102:0x021a  */
    /* JADX WARN: Code duplicated, block: B:105:0x022f A[LOOP:1: B:103:0x0229->B:105:0x022f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:107:0x025a  */
    /* JADX WARN: Code duplicated, block: B:110:0x027a  */
    /* JADX WARN: Code duplicated, block: B:112:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:114:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:115:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:123:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:145:0x0351  */
    /* JADX WARN: Code duplicated, block: B:158:0x0367 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x010e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0147 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x0148  */
    /* JADX WARN: Code duplicated, block: B:65:0x014a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0155  */
    /* JADX WARN: Code duplicated, block: B:71:0x015a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0179  */
    /* JADX WARN: Code duplicated, block: B:83:0x0183  */
    /* JADX WARN: Code duplicated, block: B:87:0x0196  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ce  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v9, types: [kotlin.reflect.jvm.internal.impl.types.TypeConstructor] */
    public final SimpleType a(JavaClassifierType javaClassifierType, final JavaTypeAttributes javaTypeAttributes, SimpleType simpleType) {
        JavaClassifierType javaClassifierType2;
        TypeAttributes typeAttributesA;
        boolean z2;
        SimpleType simpleType2;
        boolean z3;
        final TypeConstructor typeConstructor;
        TypeConstructor typeConstructorH;
        boolean z4;
        Object objH0;
        boolean z5;
        List parameters;
        TypeConstructor typeConstructor2;
        ArrayList arrayList;
        Iterator it;
        IndexingIterator indexingIterator;
        JavaType javaType;
        TypeParameterDescriptor parameter;
        JavaTypeAttributes javaTypeAttributesA;
        boolean z6;
        Variance variance;
        TypeProjectionBase typeProjectionImpl;
        JavaWildcardType javaWildcardType;
        ReflectJavaType reflectJavaTypeN;
        Variance variance2;
        boolean z7;
        Object obj;
        ArrayList arrayList2;
        List listI0;
        ArrayList arrayList3;
        JavaTypeResolver javaTypeResolver;
        TypeProjection typeProjectionA;
        ClassDescriptor classDescriptorB;
        Variance varianceJ;
        final JavaTypeResolver javaTypeResolver2 = this;
        JavaTypeAttributes javaTypeAttributes2 = javaTypeAttributes;
        LazyJavaResolverContext c2 = javaTypeResolver2.f43904a;
        if (simpleType == null || (typeAttributesA = simpleType.G0()) == null) {
            javaClassifierType2 = javaClassifierType;
            typeAttributesA = DefaultTypeAttributeTranslator.f44500a.a(new LazyJavaAnnotations(c2, javaClassifierType2, false));
        } else {
            javaClassifierType2 = javaClassifierType;
        }
        TypeAttributes typeAttributes = typeAttributesA;
        JavaClassifier classifier = javaClassifierType2.getClassifier();
        Variance variance3 = Variance.OUT_VARIANCE;
        TypeUsage typeUsage = TypeUsage.X;
        JavaTypeFlexibility javaTypeFlexibility = JavaTypeFlexibility.Z;
        if (classifier == null) {
            b(javaClassifierType);
            throw null;
        }
        boolean z8 = classifier instanceof JavaClass;
        TypeUsage typeUsage2 = javaTypeAttributes2.d;
        JavaTypeFlexibility javaTypeFlexibility2 = javaTypeAttributes2.f43900e;
        boolean z9 = false;
        boolean z10 = javaTypeAttributes2.g;
        if (!z8) {
            z2 = z10;
            simpleType2 = null;
            z3 = true;
            if (!(classifier instanceof JavaTypeParameter)) {
                throw new IllegalStateException("Unknown classifier kind: " + classifier);
            }
            TypeParameterDescriptor typeParameterDescriptorA = javaTypeResolver2.f43905b.a((JavaTypeParameter) classifier);
            if (typeParameterDescriptorA != null) {
                typeConstructorH = typeParameterDescriptorA.h();
            } else {
                typeConstructor = null;
            }
            if (typeConstructor == null) {
                return simpleType2;
            }
            if (javaTypeFlexibility2 != javaTypeFlexibility || z2 || typeUsage2 == typeUsage) {
                z4 = false;
            } else {
                z4 = z3;
            }
            if (simpleType != null) {
                objH0 = simpleType.H0();
            } else {
                objH0 = simpleType2;
            }
            if (!Intrinsics.a(objH0, typeConstructor) && !javaClassifierType2.o() && z4) {
                return simpleType.L0(z3);
            }
            if (javaClassifierType2.o()) {
                if (javaClassifierType2.s().isEmpty()) {
                    List parameters2 = typeConstructor.getParameters();
                    Intrinsics.e(parameters2, "constructor.parameters");
                    z5 = parameters2.isEmpty() ? false : true;
                }
            }
            parameters = typeConstructor.getParameters();
            Intrinsics.e(parameters, "constructor.parameters");
            if (z5) {
                typeConstructor2 = typeConstructor;
                if (parameters.size() != javaClassifierType.s().size()) {
                    IndexingIterable indexingIterableM0 = CollectionsKt.m0(javaClassifierType.s());
                    arrayList = new ArrayList(CollectionsKt.n(indexingIterableM0, 10));
                    it = indexingIterableM0.iterator();
                    while (true) {
                        indexingIterator = (IndexingIterator) it;
                        if (indexingIterator.X.hasNext()) {
                            listI0 = CollectionsKt.i0(arrayList);
                            break;
                        }
                        IndexedValue indexedValue = (IndexedValue) indexingIterator.next();
                        javaType = (JavaType) indexedValue.f43275b;
                        parameters.size();
                        parameter = (TypeParameterDescriptor) parameters.get(indexedValue.f43274a);
                        TypeUsage typeUsage3 = TypeUsage.f44554Y;
                        javaTypeAttributesA = JavaTypeAttributesKt.a(typeUsage3, z9, null, 7);
                        Intrinsics.e(parameter, "parameter");
                        z6 = javaType instanceof JavaWildcardType;
                        variance = Variance.INVARIANT;
                        if (z6) {
                            javaWildcardType = (JavaWildcardType) javaType;
                            reflectJavaTypeN = javaWildcardType.n();
                            if (javaWildcardType.D()) {
                                variance2 = variance3;
                            } else {
                                variance2 = Variance.IN_VARIANCE;
                            }
                            if (reflectJavaTypeN == null && (parameter.j() == variance || variance2 == parameter.j())) {
                                Intrinsics.f(c2, "c");
                                if (javaWildcardType.n() == null) {
                                    throw new IllegalArgumentException("Nullability annotations on unbounded wildcards aren't supported");
                                }
                                Iterator<AnnotationDescriptor> it2 = new LazyJavaAnnotations(c2, javaWildcardType, false).iterator();
                                while (true) {
                                    FilteringSequence.AnonymousClass1 anonymousClass1 = (FilteringSequence.AnonymousClass1) it2;
                                    if (!anonymousClass1.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    Object next = anonymousClass1.next();
                                    AnnotationDescriptor annotationDescriptor = (AnnotationDescriptor) next;
                                    FqName[] fqNameArr = JavaNullabilityAnnotationSettingsKt.f43750b;
                                    Iterator<AnnotationDescriptor> it3 = it2;
                                    int length = fqNameArr.length;
                                    obj = next;
                                    int i2 = 0;
                                    while (i2 < length) {
                                        int i3 = length;
                                        int i4 = i2;
                                        if (Intrinsics.a(annotationDescriptor.c(), fqNameArr[i2])) {
                                            break;
                                        }
                                        i2 = i4 + 1;
                                        length = i3;
                                    }
                                    it2 = it3;
                                }
                                AnnotationDescriptor annotationDescriptor2 = (AnnotationDescriptor) obj;
                                z7 = false;
                                KotlinType kotlinTypeD = javaTypeResolver2.d(reflectJavaTypeN, JavaTypeAttributesKt.a(typeUsage3, false, null, 7));
                                if (annotationDescriptor2 != null) {
                                    kotlinTypeD = TypeUtilsKt.k(kotlinTypeD, Annotations.Companion.a(CollectionsKt.N(kotlinTypeD.getAnnotations(), annotationDescriptor2)));
                                }
                                typeProjectionImpl = TypeUtilsKt.d(kotlinTypeD, variance2, parameter);
                            } else {
                                z7 = false;
                                typeProjectionImpl = TypeUtils.k(parameter, javaTypeAttributesA);
                            }
                            z9 = z7;
                        } else {
                            z9 = false;
                            typeProjectionImpl = new TypeProjectionImpl(javaTypeResolver2.d(javaType, javaTypeAttributesA), variance);
                        }
                        arrayList.add(typeProjectionImpl);
                        it = it;
                    }
                } else {
                    List<TypeParameterDescriptor> list = parameters;
                    arrayList2 = new ArrayList(CollectionsKt.n(list, 10));
                    for (TypeParameterDescriptor typeParameterDescriptor : list) {
                        ErrorTypeKind errorTypeKind = ErrorTypeKind.MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER;
                        String strB = typeParameterDescriptor.getName().b();
                        Intrinsics.e(strB, "p.name.asString()");
                        arrayList2.add(new TypeProjectionImpl(ErrorUtils.c(errorTypeKind, strB)));
                    }
                    listI0 = CollectionsKt.i0(arrayList2);
                }
            } else {
                List<TypeParameterDescriptor> list2 = parameters;
                arrayList3 = new ArrayList(CollectionsKt.n(list2, 10));
                for (final TypeParameterDescriptor typeParameterDescriptor2 : list2) {
                    if (TypeUtilsKt.h(typeParameterDescriptor2, simpleType2, javaTypeAttributes2.f43901h)) {
                        typeProjectionA = TypeUtils.k(typeParameterDescriptor2, javaTypeAttributes2);
                        javaTypeResolver = javaTypeResolver2;
                    } else {
                        final JavaClassifierType javaClassifierType3 = javaClassifierType2;
                        javaTypeResolver = javaTypeResolver2;
                        typeProjectionA = javaTypeResolver.f43906c.a(typeParameterDescriptor2, JavaTypeAttributes.e(javaTypeAttributes, null, javaClassifierType.o(), null, null, 59), javaTypeResolver.d, new LazyWrappedType(c2.f43840a.f43824a, new Function0<KotlinType>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver$computeRawTypeArguments$1$erasedUpperBound$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = this.X.d;
                                ClassifierDescriptor classifierDescriptorC = typeConstructor.c();
                                return typeParameterUpperBoundEraser.b(typeParameterDescriptor2, JavaTypeAttributes.e(JavaTypeAttributes.e(javaTypeAttributes, null, false, null, classifierDescriptorC != null ? classifierDescriptorC.o() : null, 31), null, javaClassifierType3.o(), null, null, 59));
                            }
                        }));
                    }
                    arrayList3.add(typeProjectionA);
                    javaTypeAttributes2 = javaTypeAttributes;
                    javaTypeResolver2 = javaTypeResolver;
                    typeConstructor = typeConstructor;
                    simpleType2 = null;
                    javaClassifierType2 = javaClassifierType;
                }
                typeConstructor2 = typeConstructor;
                listI0 = arrayList3;
            }
            return KotlinTypeFactory.d(typeAttributes, typeConstructor2, listI0, z4, null);
        }
        JavaClass javaClass = (JavaClass) classifier;
        FqName fqNameC = javaClass.c();
        simpleType2 = null;
        if (z10 && fqNameC.equals(JavaTypeResolverKt.f43908a)) {
            ReflectionTypes reflectionTypes = c2.f43840a.f43832p;
            reflectionTypes.getClass();
            KProperty property = ReflectionTypes.f43468e[0];
            z3 = true;
            reflectionTypes.f43471c.getClass();
            Intrinsics.f(property, "property");
            Name nameG = Name.g(CapitalizeDecapitalizeKt.a(property.getH0()));
            z2 = z10;
            ClassifierDescriptor classifierDescriptorF = ((MemberScope) reflectionTypes.f43470b.getX()).f(nameG, NoLookupLocation.f43721Y);
            ClassDescriptor classDescriptor = classifierDescriptorF instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorF : null;
            classDescriptorB = classDescriptor == null ? reflectionTypes.f43469a.a(new ClassId(StandardNames.f43476h, nameG), CollectionsKt.H(1)) : classDescriptor;
        } else {
            z2 = z10;
            z3 = true;
            classDescriptorB = JavaToKotlinClassMapper.b(fqNameC, c2.f43840a.o.e0);
            if (classDescriptorB == null) {
                classDescriptorB = null;
            } else {
                String str = JavaToKotlinClassMap.f43521a;
                if (JavaToKotlinClassMap.k.containsKey(DescriptorUtils.g(classDescriptorB))) {
                    if (javaTypeFlexibility2 == javaTypeFlexibility || typeUsage2 == typeUsage) {
                        classDescriptorB = JavaToKotlinClassMapper.a(classDescriptorB);
                    } else {
                        JavaType javaType2 = (JavaType) CollectionsKt.G(javaClassifierType2.s());
                        JavaWildcardType javaWildcardType2 = javaType2 instanceof JavaWildcardType ? (JavaWildcardType) javaType2 : null;
                        if (javaWildcardType2 != null && javaWildcardType2.n() != null && !javaWildcardType2.D()) {
                            List parameters3 = JavaToKotlinClassMapper.a(classDescriptorB).h().getParameters();
                            Intrinsics.e(parameters3, "JavaToKotlinClassMapper.…ypeConstructor.parameters");
                            TypeParameterDescriptor typeParameterDescriptor3 = (TypeParameterDescriptor) CollectionsKt.G(parameters3);
                            if (typeParameterDescriptor3 != null && (varianceJ = typeParameterDescriptor3.j()) != null && varianceJ != variance3) {
                                classDescriptorB = JavaToKotlinClassMapper.a(classDescriptorB);
                            }
                        }
                    }
                }
            }
        }
        if (classDescriptorB == null) {
            classDescriptorB = c2.f43840a.k.a(javaClass);
        }
        if (classDescriptorB == null || (typeConstructorH = classDescriptorB.h()) == null) {
            b(javaClassifierType);
            throw null;
        }
        typeConstructor = typeConstructorH;
        if (typeConstructor == null) {
            return simpleType2;
        }
        if (javaTypeFlexibility2 != javaTypeFlexibility) {
            z4 = false;
        } else {
            z4 = z3;
        }
        if (simpleType != null) {
            objH0 = simpleType.H0();
        } else {
            objH0 = simpleType2;
        }
        if (!Intrinsics.a(objH0, typeConstructor)) {
        }
        if (javaClassifierType2.o()) {
            if (javaClassifierType2.s().isEmpty()) {
                List parameters4 = typeConstructor.getParameters();
                Intrinsics.e(parameters4, "constructor.parameters");
                if (parameters4.isEmpty()) {
                }
            }
        }
        parameters = typeConstructor.getParameters();
        Intrinsics.e(parameters, "constructor.parameters");
        if (z5) {
            typeConstructor2 = typeConstructor;
            if (parameters.size() != javaClassifierType.s().size()) {
                IndexingIterable indexingIterableM1 = CollectionsKt.m0(javaClassifierType.s());
                arrayList = new ArrayList(CollectionsKt.n(indexingIterableM1, 10));
                it = indexingIterableM1.iterator();
                while (true) {
                    indexingIterator = (IndexingIterator) it;
                    if (indexingIterator.X.hasNext()) {
                        listI0 = CollectionsKt.i0(arrayList);
                        break;
                    }
                    IndexedValue indexedValue2 = (IndexedValue) indexingIterator.next();
                    javaType = (JavaType) indexedValue2.f43275b;
                    parameters.size();
                    parameter = (TypeParameterDescriptor) parameters.get(indexedValue2.f43274a);
                    TypeUsage typeUsage4 = TypeUsage.f44554Y;
                    javaTypeAttributesA = JavaTypeAttributesKt.a(typeUsage4, z9, null, 7);
                    Intrinsics.e(parameter, "parameter");
                    z6 = javaType instanceof JavaWildcardType;
                    variance = Variance.INVARIANT;
                    if (z6) {
                        javaWildcardType = (JavaWildcardType) javaType;
                        reflectJavaTypeN = javaWildcardType.n();
                        if (javaWildcardType.D()) {
                            variance2 = variance3;
                        } else {
                            variance2 = Variance.IN_VARIANCE;
                        }
                        if (reflectJavaTypeN == null) {
                            z7 = false;
                            typeProjectionImpl = TypeUtils.k(parameter, javaTypeAttributesA);
                        } else {
                            z7 = false;
                            typeProjectionImpl = TypeUtils.k(parameter, javaTypeAttributesA);
                        }
                        z9 = z7;
                    } else {
                        z9 = false;
                        typeProjectionImpl = new TypeProjectionImpl(javaTypeResolver2.d(javaType, javaTypeAttributesA), variance);
                    }
                    arrayList.add(typeProjectionImpl);
                    it = it;
                }
            } else {
                List<TypeParameterDescriptor> list3 = parameters;
                arrayList2 = new ArrayList(CollectionsKt.n(list3, 10));
                while (r1.hasNext()) {
                    ErrorTypeKind errorTypeKind2 = ErrorTypeKind.MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER;
                    String strB2 = typeParameterDescriptor.getName().b();
                    Intrinsics.e(strB2, "p.name.asString()");
                    arrayList2.add(new TypeProjectionImpl(ErrorUtils.c(errorTypeKind2, strB2)));
                }
                listI0 = CollectionsKt.i0(arrayList2);
            }
        } else {
            List<TypeParameterDescriptor> list4 = parameters;
            arrayList3 = new ArrayList(CollectionsKt.n(list4, 10));
            while (r11.hasNext()) {
                if (TypeUtilsKt.h(typeParameterDescriptor2, simpleType2, javaTypeAttributes2.f43901h)) {
                    typeProjectionA = TypeUtils.k(typeParameterDescriptor2, javaTypeAttributes2);
                    javaTypeResolver = javaTypeResolver2;
                } else {
                    final JavaClassifierType javaClassifierType4 = javaClassifierType2;
                    javaTypeResolver = javaTypeResolver2;
                    typeProjectionA = javaTypeResolver.f43906c.a(typeParameterDescriptor2, JavaTypeAttributes.e(javaTypeAttributes, null, javaClassifierType.o(), null, null, 59), javaTypeResolver.d, new LazyWrappedType(c2.f43840a.f43824a, new Function0<KotlinType>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver$computeRawTypeArguments$1$erasedUpperBound$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = this.X.d;
                            ClassifierDescriptor classifierDescriptorC = typeConstructor.c();
                            return typeParameterUpperBoundEraser.b(typeParameterDescriptor2, JavaTypeAttributes.e(JavaTypeAttributes.e(javaTypeAttributes, null, false, null, classifierDescriptorC != null ? classifierDescriptorC.o() : null, 31), null, javaClassifierType4.o(), null, null, 59));
                        }
                    }));
                }
                arrayList3.add(typeProjectionA);
                javaTypeAttributes2 = javaTypeAttributes;
                javaTypeResolver2 = javaTypeResolver;
                typeConstructor = typeConstructor;
                simpleType2 = null;
                javaClassifierType2 = javaClassifierType;
            }
            typeConstructor2 = typeConstructor;
            listI0 = arrayList3;
        }
        return KotlinTypeFactory.d(typeAttributes, typeConstructor2, listI0, z4, null);
    }

    public final TypeConstructor b(JavaClassifierType javaClassifierType) {
        javaClassifierType.A();
        throw null;
    }

    public final UnwrappedType c(JavaArrayType arrayType, JavaTypeAttributes javaTypeAttributes, boolean z2) {
        Intrinsics.f(arrayType, "arrayType");
        JavaType javaTypeU = arrayType.u();
        JavaPrimitiveType javaPrimitiveType = javaTypeU instanceof JavaPrimitiveType ? (JavaPrimitiveType) javaTypeU : null;
        PrimitiveType type = javaPrimitiveType != null ? javaPrimitiveType.getType() : null;
        LazyJavaResolverContext lazyJavaResolverContext = this.f43904a;
        LazyJavaAnnotations lazyJavaAnnotations = new LazyJavaAnnotations(lazyJavaResolverContext, arrayType, true);
        JavaResolverComponents javaResolverComponents = lazyJavaResolverContext.f43840a;
        boolean z3 = javaTypeAttributes.g;
        if (type != null) {
            SimpleType simpleTypeP = javaResolverComponents.o.e0.p(type);
            KotlinType kotlinTypeK = TypeUtilsKt.k(simpleTypeP, new CompositeAnnotations(simpleTypeP.getAnnotations(), lazyJavaAnnotations));
            Intrinsics.d(kotlinTypeK, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
            SimpleType simpleType = (SimpleType) kotlinTypeK;
            return z3 ? simpleType : KotlinTypeFactory.b(simpleType, simpleType.L0(true));
        }
        KotlinType kotlinTypeD = d(javaTypeU, JavaTypeAttributesKt.a(TypeUsage.f44554Y, z3, null, 6));
        Variance variance = Variance.INVARIANT;
        Variance variance2 = Variance.OUT_VARIANCE;
        if (!z3) {
            return KotlinTypeFactory.b(javaResolverComponents.o.e0.h(variance, kotlinTypeD, lazyJavaAnnotations), javaResolverComponents.o.e0.h(variance2, kotlinTypeD, lazyJavaAnnotations).L0(true));
        }
        if (z2) {
            variance = variance2;
        }
        return javaResolverComponents.o.e0.h(variance, kotlinTypeD, lazyJavaAnnotations);
    }

    public final KotlinType d(JavaType javaType, JavaTypeAttributes javaTypeAttributes) {
        boolean z2 = javaType instanceof JavaPrimitiveType;
        LazyJavaResolverContext lazyJavaResolverContext = this.f43904a;
        if (z2) {
            PrimitiveType type = ((JavaPrimitiveType) javaType).getType();
            SimpleType simpleTypeR = type != null ? lazyJavaResolverContext.f43840a.o.e0.r(type) : lazyJavaResolverContext.f43840a.o.e0.v();
            Intrinsics.e(simpleTypeR, "{\n                val pr…ns.unitType\n            }");
            return simpleTypeR;
        }
        boolean z3 = false;
        if (!(javaType instanceof JavaClassifierType)) {
            if (javaType instanceof JavaArrayType) {
                return c((JavaArrayType) javaType, javaTypeAttributes, false);
            }
            if (javaType instanceof JavaWildcardType) {
                ReflectJavaType reflectJavaTypeN = ((JavaWildcardType) javaType).n();
                return reflectJavaTypeN != null ? d(reflectJavaTypeN, javaTypeAttributes) : lazyJavaResolverContext.f43840a.o.e0.n();
            }
            if (javaType == null) {
                return lazyJavaResolverContext.f43840a.o.e0.n();
            }
            throw new UnsupportedOperationException("Unsupported type: " + javaType);
        }
        JavaClassifierType javaClassifierType = (JavaClassifierType) javaType;
        if (!javaTypeAttributes.g) {
            if (javaTypeAttributes.d != TypeUsage.X) {
                z3 = true;
            }
        }
        boolean zO = javaClassifierType.o();
        ErrorTypeKind errorTypeKind = ErrorTypeKind.UNRESOLVED_JAVA_CLASS;
        if (!zO && !z3) {
            SimpleType simpleTypeA = a(javaClassifierType, javaTypeAttributes, null);
            return simpleTypeA != null ? simpleTypeA : ErrorUtils.c(errorTypeKind, javaClassifierType.y());
        }
        SimpleType simpleTypeA2 = a(javaClassifierType, JavaTypeAttributes.e(javaTypeAttributes, JavaTypeFlexibility.Z, false, null, null, 61), null);
        if (simpleTypeA2 == null) {
            return ErrorUtils.c(errorTypeKind, javaClassifierType.y());
        }
        SimpleType simpleTypeA3 = a(javaClassifierType, JavaTypeAttributes.e(javaTypeAttributes, JavaTypeFlexibility.f43903Y, false, null, null, 61), simpleTypeA2);
        if (simpleTypeA3 == null) {
            return ErrorUtils.c(errorTypeKind, javaClassifierType.y());
        }
        return zO ? new RawTypeImpl(simpleTypeA2, simpleTypeA3) : KotlinTypeFactory.b(simpleTypeA2, simpleTypeA3);
    }
}
