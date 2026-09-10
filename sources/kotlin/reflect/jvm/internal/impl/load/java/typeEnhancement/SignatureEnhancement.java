package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.DeprecationCausedByFunctionNInfo;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers;
import kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationSettingsKt;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt;
import kotlin.reflect.jvm.internal.impl.load.java.ReportLevel;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JavaDescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureBuildingUtilsKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.deprecation.DescriptorBasedDeprecationInfoKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.checker.SimpleClassicTypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;

/* JADX INFO: loaded from: classes7.dex */
public final class SignatureEnhancement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JavaTypeEnhancement f43944a;

    public SignatureEnhancement(JavaTypeEnhancement javaTypeEnhancement) {
        this.f43944a = javaTypeEnhancement;
    }

    public final KotlinType a(JavaCallableMemberDescriptor javaCallableMemberDescriptor, CallableDescriptor callableDescriptor, boolean z2, LazyJavaResolverContext lazyJavaResolverContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, TypeEnhancementInfo typeEnhancementInfo, boolean z3, Function1 function1) {
        SignatureParts signatureParts = new SignatureParts(callableDescriptor, z2, lazyJavaResolverContext, annotationQualifierApplicabilityType, false);
        KotlinType kotlinType = (KotlinType) function1.invoke(javaCallableMemberDescriptor);
        Collection overriddenDescriptors = javaCallableMemberDescriptor.l();
        Intrinsics.e(overriddenDescriptors, "overriddenDescriptors");
        Collection<CallableMemberDescriptor> collection = overriddenDescriptors;
        ArrayList arrayList = new ArrayList(CollectionsKt.n(collection, 10));
        for (CallableMemberDescriptor it : collection) {
            Intrinsics.e(it, "it");
            arrayList.add((KotlinType) function1.invoke(it));
        }
        return b(signatureParts, kotlinType, arrayList, typeEnhancementInfo, z3);
    }

    /* JADX WARN: Code duplicated, block: B:154:0x0232  */
    /* JADX WARN: Code duplicated, block: B:168:0x0258  */
    /* JADX WARN: Code duplicated, block: B:198:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:204:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:211:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:215:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:217:0x0300  */
    /* JADX WARN: Code duplicated, block: B:218:0x0303  */
    /* JADX WARN: Code duplicated, block: B:223:0x0315  */
    /* JADX WARN: Code duplicated, block: B:224:0x0318  */
    /* JADX WARN: Code duplicated, block: B:226:0x031b  */
    /* JADX WARN: Code duplicated, block: B:227:0x031d  */
    /* JADX WARN: Code duplicated, block: B:229:0x0325  */
    /* JADX WARN: Code duplicated, block: B:232:0x0334  */
    /* JADX WARN: Code duplicated, block: B:238:0x0349  */
    /* JADX WARN: Code duplicated, block: B:239:0x0350  */
    /* JADX WARN: Code duplicated, block: B:243:0x0360  */
    /* JADX WARN: Code duplicated, block: B:253:0x0387  */
    /* JADX WARN: Code duplicated, block: B:255:0x038b  */
    /* JADX WARN: Code duplicated, block: B:257:0x038f  */
    /* JADX WARN: Code duplicated, block: B:260:0x0396  */
    /* JADX WARN: Code duplicated, block: B:263:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:266:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:270:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:281:0x02cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:284:0x0252 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:287:0x0307 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:289:0x02f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x033e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:294:0x032e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:0x036a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x035a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:0x03ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x03aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:? A[LOOP:7: B:261:0x039a->B:303:?, LOOP_END, SYNTHETIC] */
    public final KotlinType b(final SignatureParts signatureParts, KotlinType kotlinType, List list, TypeEnhancementInfo typeEnhancementInfo, boolean z2) {
        int size;
        ArrayList arrayList;
        JavaTypeQualifiers[] javaTypeQualifiersArr;
        Iterable annotations;
        LazyJavaResolverContext lazyJavaResolverContext;
        Iterable iterable;
        MutabilityQualifier mutabilityQualifier;
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusD;
        JavaTypeQualifiers javaTypeQualifiers;
        AnnotationTypeQualifierResolver annotationTypeQualifierResolver;
        MutabilityQualifier mutabilityQualifier2;
        TypeConstructor typeConstructorO;
        ArrayList<JavaTypeQualifiers> arrayList2;
        Iterator it;
        boolean z3;
        boolean z4;
        ArrayList arrayList3;
        Set setL0;
        boolean z5;
        NullabilityQualifier nullabilityQualifier;
        NullabilityQualifier nullabilityQualifier2;
        NullabilityQualifier nullabilityQualifier3;
        ArrayList arrayList4;
        Iterator it2;
        NullabilityQualifier nullabilityQualifier4;
        boolean z6;
        boolean z7;
        Iterator it3;
        MutabilityQualifier mutabilityQualifier3;
        ArrayList arrayList5;
        Iterator it4;
        Set setL1;
        NullabilityQualifier nullabilityQualifier5;
        NullabilityQualifier nullabilityQualifier6;
        AbstractSignatureParts.TypeAndDefaultQualifiers typeAndDefaultQualifiers;
        JavaTypeQualifiers javaTypeQualifiers2;
        KotlinTypeMarker kotlinTypeMarker;
        NullabilityQualifier nullabilityQualifierG;
        List list2 = list;
        Intrinsics.f(kotlinType, "<this>");
        ArrayList arrayListJ = signatureParts.j(kotlinType);
        ArrayList arrayList6 = new ArrayList(CollectionsKt.n(list2, 10));
        Iterator it5 = list2.iterator();
        while (it5.hasNext()) {
            arrayList6.add(signatureParts.j((KotlinTypeMarker) it5.next()));
        }
        LazyJavaResolverContext lazyJavaResolverContext2 = signatureParts.f43953c;
        boolean z8 = signatureParts.f43952b;
        if (!z8 || ((list2 instanceof Collection) && list2.isEmpty())) {
            size = arrayListJ.size();
            break;
        }
        Iterator it6 = list2.iterator();
        while (true) {
            if (!it6.hasNext()) {
                size = arrayListJ.size();
                break;
            }
            KotlinTypeMarker other = (KotlinTypeMarker) it6.next();
            Intrinsics.f(other, "other");
            if (!lazyJavaResolverContext2.f43840a.f43833u.c(kotlinType, (KotlinType) other)) {
                size = 1;
                break;
            }
        }
        JavaTypeQualifiers[] javaTypeQualifiersArr2 = new JavaTypeQualifiers[size];
        int i2 = 0;
        while (i2 < size) {
            final AbstractSignatureParts.TypeAndDefaultQualifiers typeAndDefaultQualifiers2 = (AbstractSignatureParts.TypeAndDefaultQualifiers) arrayListJ.get(i2);
            KotlinTypeMarker kotlinTypeMarker2 = typeAndDefaultQualifiers2.f43912a;
            NullabilityQualifier nullabilityQualifier7 = NullabilityQualifier.f43930Y;
            NullabilityQualifier nullabilityQualifier8 = NullabilityQualifier.Z;
            MutabilityQualifier mutabilityQualifier4 = MutabilityQualifier.f43928Y;
            MutabilityQualifier mutabilityQualifier5 = MutabilityQualifier.X;
            SimpleClassicTypeSystemContext simpleClassicTypeSystemContext = SimpleClassicTypeSystemContext.f44576a;
            NullabilityQualifier nullabilityQualifier9 = NullabilityQualifier.X;
            int i3 = size;
            DeclarationDescriptorNonRoot declarationDescriptorNonRoot = signatureParts.f43951a;
            ArrayList arrayList7 = arrayListJ;
            TypeParameterMarker typeParameterMarker = typeAndDefaultQualifiers2.f43914c;
            if (kotlinTypeMarker2 == null) {
                arrayList = arrayList6;
                if ((typeParameterMarker != null ? ClassicTypeSystemContext.DefaultImpls.v(typeParameterMarker) : null) == TypeVariance.IN) {
                    javaTypeQualifiers = JavaTypeQualifiers.f43924e;
                    mutabilityQualifier = mutabilityQualifier5;
                    lazyJavaResolverContext = lazyJavaResolverContext2;
                    z8 = z8;
                    javaTypeQualifiersArr = javaTypeQualifiersArr2;
                }
                arrayList2 = new ArrayList();
                it = arrayList.iterator();
                while (it.hasNext()) {
                    typeAndDefaultQualifiers = (AbstractSignatureParts.TypeAndDefaultQualifiers) CollectionsKt.B(i2, (List) it.next());
                    if (typeAndDefaultQualifiers != null || (kotlinTypeMarker = typeAndDefaultQualifiers.f43912a) == null) {
                        javaTypeQualifiers2 = null;
                    } else {
                        NullabilityQualifier nullabilityQualifierG2 = signatureParts.g(kotlinTypeMarker);
                        if (nullabilityQualifierG2 == null) {
                            KotlinType kotlinTypeF = signatureParts.f(kotlinTypeMarker);
                            nullabilityQualifierG = kotlinTypeF != null ? signatureParts.g(kotlinTypeF) : null;
                        } else {
                            nullabilityQualifierG = nullabilityQualifierG2;
                        }
                        String str = JavaToKotlinClassMap.f43521a;
                        javaTypeQualifiers2 = new JavaTypeQualifiers(nullabilityQualifierG, JavaToKotlinClassMap.k.containsKey(signatureParts.l(simpleClassicTypeSystemContext.i0(kotlinTypeMarker))) ? mutabilityQualifier : JavaToKotlinClassMap.j.containsKey(signatureParts.l(simpleClassicTypeSystemContext.n(kotlinTypeMarker))) ? mutabilityQualifier4 : null, simpleClassicTypeSystemContext.T(kotlinTypeMarker) || (((KotlinType) kotlinTypeMarker).K0() instanceof NotNullTypeParameterImpl), nullabilityQualifierG != nullabilityQualifierG2);
                    }
                    if (javaTypeQualifiers2 != null) {
                        arrayList2.add(javaTypeQualifiers2);
                    }
                }
                if (i2 == 0 || !z8) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (i2 == 0 || !(declarationDescriptorNonRoot instanceof ValueParameterDescriptor) || ((ValueParameterDescriptor) declarationDescriptorNonRoot).o0() == null) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                arrayList3 = new ArrayList();
                for (JavaTypeQualifiers javaTypeQualifiers3 : arrayList2) {
                    if (javaTypeQualifiers3.d) {
                        nullabilityQualifier6 = null;
                    } else {
                        nullabilityQualifier6 = javaTypeQualifiers3.f43925a;
                    }
                    if (nullabilityQualifier6 != null) {
                        arrayList3.add(nullabilityQualifier6);
                    }
                }
                setL0 = CollectionsKt.l0(arrayList3);
                z5 = javaTypeQualifiers.d;
                nullabilityQualifier = javaTypeQualifiers.f43925a;
                if (z5) {
                    nullabilityQualifier2 = null;
                } else {
                    nullabilityQualifier2 = nullabilityQualifier;
                }
                if (nullabilityQualifier2 == nullabilityQualifier9) {
                    nullabilityQualifier3 = nullabilityQualifier9;
                } else {
                    nullabilityQualifier3 = (NullabilityQualifier) TypeEnhancementUtilsKt.a(setL0, nullabilityQualifier8, nullabilityQualifier7, nullabilityQualifier2, z3);
                }
                if (nullabilityQualifier3 == null) {
                    arrayList5 = new ArrayList();
                    it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        nullabilityQualifier5 = ((JavaTypeQualifiers) it4.next()).f43925a;
                        if (nullabilityQualifier5 != null) {
                            arrayList5.add(nullabilityQualifier5);
                        }
                    }
                    setL1 = CollectionsKt.l0(arrayList5);
                    if (nullabilityQualifier != nullabilityQualifier9) {
                        nullabilityQualifier9 = (NullabilityQualifier) TypeEnhancementUtilsKt.a(setL1, nullabilityQualifier8, nullabilityQualifier7, nullabilityQualifier, z3);
                    }
                } else {
                    nullabilityQualifier9 = nullabilityQualifier3;
                }
                arrayList4 = new ArrayList();
                it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    mutabilityQualifier3 = ((JavaTypeQualifiers) it2.next()).f43926b;
                    if (mutabilityQualifier3 != null) {
                        arrayList4.add(mutabilityQualifier3);
                    }
                }
                MutabilityQualifier mutabilityQualifier6 = (MutabilityQualifier) TypeEnhancementUtilsKt.a(CollectionsKt.l0(arrayList4), mutabilityQualifier4, mutabilityQualifier, javaTypeQualifiers.f43926b, z3);
                if (nullabilityQualifier9 != null || z2 || (z4 && nullabilityQualifier9 == nullabilityQualifier7)) {
                    nullabilityQualifier4 = null;
                } else {
                    nullabilityQualifier4 = nullabilityQualifier9;
                }
                if (nullabilityQualifier4 != nullabilityQualifier8) {
                    z6 = false;
                } else {
                    if (!javaTypeQualifiers.f43927c) {
                        if (!arrayList2.isEmpty()) {
                            it3 = arrayList2.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (((JavaTypeQualifiers) it3.next()).f43927c) {
                                    }
                                }
                            }
                        }
                        z6 = false;
                    }
                    z6 = true;
                }
                if (nullabilityQualifier4 != null || nullabilityQualifier3 == nullabilityQualifier9) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                javaTypeQualifiersArr[i2] = new JavaTypeQualifiers(nullabilityQualifier4, mutabilityQualifier6, z6, z7);
                i2++;
                size = i3;
                arrayListJ = arrayList7;
                arrayList6 = arrayList;
                z8 = z8;
                javaTypeQualifiersArr2 = javaTypeQualifiersArr;
                lazyJavaResolverContext2 = lazyJavaResolverContext;
            } else {
                arrayList = arrayList6;
            }
            boolean z9 = typeParameterMarker == null;
            EmptyList emptyList = EmptyList.X;
            boolean z10 = z9;
            KotlinTypeMarker kotlinTypeMarker3 = typeAndDefaultQualifiers2.f43912a;
            Iterable iterableC = kotlinTypeMarker3 != null ? signatureParts.c(kotlinTypeMarker3) : emptyList;
            TypeParameterDescriptor typeParameterDescriptorT = (kotlinTypeMarker3 == null || (typeConstructorO = simpleClassicTypeSystemContext.O(kotlinTypeMarker3)) == null) ? null : ClassicTypeSystemContext.DefaultImpls.t(typeConstructorO);
            AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS;
            javaTypeQualifiersArr = javaTypeQualifiersArr2;
            AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType2 = signatureParts.d;
            boolean z11 = annotationQualifierApplicabilityType2 == annotationQualifierApplicabilityType;
            if (z10) {
                if (!z11) {
                    lazyJavaResolverContext2.f43840a.t.getClass();
                }
                if (declarationDescriptorNonRoot == null || (annotations = declarationDescriptorNonRoot.getAnnotations()) == null) {
                    annotations = emptyList;
                }
                iterableC = CollectionsKt.M(annotations, iterableC);
            }
            AnnotationTypeQualifierResolver annotationTypeQualifierResolverK = signatureParts.b();
            annotationTypeQualifierResolverK.getClass();
            Iterator it7 = iterableC.iterator();
            lazyJavaResolverContext = lazyJavaResolverContext2;
            MutabilityQualifier mutabilityQualifier7 = null;
            while (true) {
                if (!it7.hasNext()) {
                    iterable = iterableC;
                    break;
                }
                iterable = iterableC;
                FqName fqNameE = annotationTypeQualifierResolverK.e(it7.next());
                AnnotationTypeQualifierResolver annotationTypeQualifierResolver2 = annotationTypeQualifierResolverK;
                if (JvmAnnotationNamesKt.o.contains(fqNameE)) {
                    mutabilityQualifier2 = mutabilityQualifier5;
                } else {
                    if (JvmAnnotationNamesKt.f43782p.contains(fqNameE)) {
                        mutabilityQualifier2 = mutabilityQualifier4;
                    } else {
                        continue;
                    }
                    iterableC = iterable;
                    annotationTypeQualifierResolverK = annotationTypeQualifierResolver2;
                }
                if (mutabilityQualifier7 != null && mutabilityQualifier7 != mutabilityQualifier2) {
                    mutabilityQualifier7 = null;
                    break;
                }
                mutabilityQualifier7 = mutabilityQualifier2;
                iterableC = iterable;
                annotationTypeQualifierResolverK = annotationTypeQualifierResolver2;
            }
            AnnotationTypeQualifierResolver annotationTypeQualifierResolverK2 = signatureParts.b();
            Function1<Object, Boolean> function1 = new Function1<Object, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$extractQualifiersFromAnnotations$annotationsNullability$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Code duplicated, block: B:12:0x0036  */
                /* JADX WARN: Code duplicated, block: B:28:0x007e  */
                /* JADX WARN: Code duplicated, block: B:31:0x0089  */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object extractNullability) {
                    KotlinTypeMarker kotlinTypeMarker4;
                    boolean z12;
                    boolean z13 = true;
                    Intrinsics.f(extractNullability, "$this$extractNullability");
                    AbstractSignatureParts.TypeAndDefaultQualifiers typeAndDefaultQualifiers3 = typeAndDefaultQualifiers2;
                    SignatureParts signatureParts2 = (SignatureParts) signatureParts;
                    AnnotationDescriptor annotation = (AnnotationDescriptor) extractNullability;
                    if (!(annotation instanceof PossiblyExternalAnnotationDescriptor) || !((PossiblyExternalAnnotationDescriptor) annotation).b()) {
                        boolean z14 = annotation instanceof LazyJavaAnnotationDescriptor;
                        LazyJavaResolverContext lazyJavaResolverContext3 = signatureParts2.f43953c;
                        if (z14) {
                            lazyJavaResolverContext3.f43840a.t.getClass();
                            if (!((LazyJavaAnnotationDescriptor) annotation).f43863h) {
                                if (signatureParts2.d != AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS) {
                                    kotlinTypeMarker4 = typeAndDefaultQualifiers3.f43912a;
                                    if (kotlinTypeMarker4 == null && KotlinBuiltIns.E((KotlinType) kotlinTypeMarker4)) {
                                        AnnotationTypeQualifierResolver annotationTypeQualifierResolverB = signatureParts2.b();
                                        annotationTypeQualifierResolverB.getClass();
                                        Intrinsics.f(annotation, "annotation");
                                        Object objD = annotationTypeQualifierResolverB.d(annotation, StandardNames.FqNames.t);
                                        if (objD != null) {
                                            ArrayList arrayListA = annotationTypeQualifierResolverB.a(objD, false);
                                            if (!arrayListA.isEmpty()) {
                                                Iterator it8 = arrayListA.iterator();
                                                while (true) {
                                                    if (!it8.hasNext()) {
                                                        z12 = false;
                                                        break;
                                                    }
                                                    String str2 = (String) it8.next();
                                                    HashMap map = KotlinTarget.f43620Y;
                                                    if (Intrinsics.a(str2, "TYPE")) {
                                                        z12 = true;
                                                        break;
                                                    }
                                                }
                                            } else {
                                                z12 = false;
                                                break;
                                            }
                                        } else {
                                            z12 = false;
                                            break;
                                        }
                                        if (z12) {
                                            lazyJavaResolverContext3.f43840a.t.getClass();
                                        } else {
                                            z13 = false;
                                        }
                                    } else {
                                        z13 = false;
                                    }
                                }
                            }
                        } else {
                            kotlinTypeMarker4 = typeAndDefaultQualifiers3.f43912a;
                            if (kotlinTypeMarker4 == null) {
                                z13 = false;
                            } else {
                                z13 = false;
                            }
                        }
                    }
                    return Boolean.valueOf(z13);
                }
            };
            annotationTypeQualifierResolverK2.getClass();
            Iterator it8 = iterable.iterator();
            boolean z12 = z11;
            NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus = null;
            while (true) {
                if (!it8.hasNext()) {
                    mutabilityQualifier = mutabilityQualifier5;
                    break;
                }
                mutabilityQualifier = mutabilityQualifier5;
                NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusC = annotationTypeQualifierResolverK2.c(function1, it8.next());
                if (nullabilityQualifierWithMigrationStatus == null) {
                    annotationTypeQualifierResolver = annotationTypeQualifierResolverK2;
                } else {
                    if (nullabilityQualifierWithMigrationStatusC == null || nullabilityQualifierWithMigrationStatusC.equals(nullabilityQualifierWithMigrationStatus)) {
                        annotationTypeQualifierResolver = annotationTypeQualifierResolverK2;
                    } else {
                        annotationTypeQualifierResolver = annotationTypeQualifierResolverK2;
                        boolean z13 = nullabilityQualifierWithMigrationStatus.f43932b;
                        boolean z14 = nullabilityQualifierWithMigrationStatusC.f43932b;
                        if (!z14 || z13) {
                            if (z14 || !z13) {
                                nullabilityQualifierWithMigrationStatus = null;
                                break;
                            }
                        }
                    }
                    mutabilityQualifier5 = mutabilityQualifier;
                    annotationTypeQualifierResolverK2 = annotationTypeQualifierResolver;
                }
                nullabilityQualifierWithMigrationStatus = nullabilityQualifierWithMigrationStatusC;
                mutabilityQualifier5 = mutabilityQualifier;
                annotationTypeQualifierResolverK2 = annotationTypeQualifierResolver;
            }
            if (nullabilityQualifierWithMigrationStatus != null) {
                NullabilityQualifier nullabilityQualifier10 = nullabilityQualifierWithMigrationStatus.f43931a;
                javaTypeQualifiers = new JavaTypeQualifiers(nullabilityQualifier10, mutabilityQualifier7, nullabilityQualifier10 == nullabilityQualifier8 && typeParameterDescriptorT != null, nullabilityQualifierWithMigrationStatus.f43932b);
            } else {
                AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType3 = (z10 || z12) ? annotationQualifierApplicabilityType2 : AnnotationQualifierApplicabilityType.TYPE_USE;
                JavaTypeQualifiersByElementType javaTypeQualifiersByElementType = typeAndDefaultQualifiers2.f43913b;
                JavaDefaultQualifiers javaDefaultQualifiers = javaTypeQualifiersByElementType != null ? (JavaDefaultQualifiers) javaTypeQualifiersByElementType.f43758a.get(annotationQualifierApplicabilityType3) : null;
                NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusD2 = typeParameterDescriptorT != null ? signatureParts.d(typeParameterDescriptorT) : null;
                NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusA = nullabilityQualifierWithMigrationStatusD2 != null ? NullabilityQualifierWithMigrationStatus.a(nullabilityQualifierWithMigrationStatusD2, nullabilityQualifier8, false, 2) : javaDefaultQualifiers != null ? javaDefaultQualifiers.f43743a : null;
                boolean z15 = (nullabilityQualifierWithMigrationStatusD2 != null ? nullabilityQualifierWithMigrationStatusD2.f43931a : null) == nullabilityQualifier8 || !(typeParameterDescriptorT == null || javaDefaultQualifiers == null || !javaDefaultQualifiers.f43745c);
                if (typeParameterMarker == null || (nullabilityQualifierWithMigrationStatusD = signatureParts.d(typeParameterMarker)) == null) {
                    nullabilityQualifierWithMigrationStatusD = null;
                } else if (nullabilityQualifierWithMigrationStatusD.f43931a == nullabilityQualifier7) {
                    nullabilityQualifierWithMigrationStatusD = NullabilityQualifierWithMigrationStatus.a(nullabilityQualifierWithMigrationStatusD, nullabilityQualifier9, false, 2);
                }
                if (nullabilityQualifierWithMigrationStatusD != null) {
                    if (nullabilityQualifierWithMigrationStatusA == null) {
                        nullabilityQualifierWithMigrationStatusA = nullabilityQualifierWithMigrationStatusD;
                    } else {
                        boolean z16 = nullabilityQualifierWithMigrationStatusA.f43932b;
                        boolean z17 = nullabilityQualifierWithMigrationStatusD.f43932b;
                        if (!z17 || z16) {
                            if (z17 || !z16) {
                                NullabilityQualifier nullabilityQualifier11 = nullabilityQualifierWithMigrationStatusD.f43931a;
                                NullabilityQualifier nullabilityQualifier12 = nullabilityQualifierWithMigrationStatusA.f43931a;
                                if (nullabilityQualifier11.compareTo(nullabilityQualifier12) >= 0 && nullabilityQualifier11.compareTo(nullabilityQualifier12) > 0) {
                                    nullabilityQualifierWithMigrationStatusA = nullabilityQualifierWithMigrationStatusD;
                                }
                            } else {
                                nullabilityQualifierWithMigrationStatusA = nullabilityQualifierWithMigrationStatusD;
                            }
                        }
                    }
                }
                javaTypeQualifiers = new JavaTypeQualifiers(nullabilityQualifierWithMigrationStatusA != null ? nullabilityQualifierWithMigrationStatusA.f43931a : null, mutabilityQualifier7, z15, nullabilityQualifierWithMigrationStatusA != null && nullabilityQualifierWithMigrationStatusA.f43932b);
            }
            arrayList2 = new ArrayList();
            it = arrayList.iterator();
            while (it.hasNext()) {
                typeAndDefaultQualifiers = (AbstractSignatureParts.TypeAndDefaultQualifiers) CollectionsKt.B(i2, (List) it.next());
                if (typeAndDefaultQualifiers != null) {
                    javaTypeQualifiers2 = null;
                } else {
                    javaTypeQualifiers2 = null;
                }
                if (javaTypeQualifiers2 != null) {
                    arrayList2.add(javaTypeQualifiers2);
                }
            }
            if (i2 == 0) {
                z3 = false;
            } else {
                z3 = false;
            }
            if (i2 == 0) {
                z4 = false;
            } else {
                z4 = false;
            }
            arrayList3 = new ArrayList();
            while (r6.hasNext()) {
                if (javaTypeQualifiers3.d) {
                    nullabilityQualifier6 = null;
                } else {
                    nullabilityQualifier6 = javaTypeQualifiers3.f43925a;
                }
                if (nullabilityQualifier6 != null) {
                    arrayList3.add(nullabilityQualifier6);
                }
            }
            setL0 = CollectionsKt.l0(arrayList3);
            z5 = javaTypeQualifiers.d;
            nullabilityQualifier = javaTypeQualifiers.f43925a;
            if (z5) {
                nullabilityQualifier2 = null;
            } else {
                nullabilityQualifier2 = nullabilityQualifier;
            }
            if (nullabilityQualifier2 == nullabilityQualifier9) {
                nullabilityQualifier3 = nullabilityQualifier9;
            } else {
                nullabilityQualifier3 = (NullabilityQualifier) TypeEnhancementUtilsKt.a(setL0, nullabilityQualifier8, nullabilityQualifier7, nullabilityQualifier2, z3);
            }
            if (nullabilityQualifier3 == null) {
                arrayList5 = new ArrayList();
                it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    nullabilityQualifier5 = ((JavaTypeQualifiers) it4.next()).f43925a;
                    if (nullabilityQualifier5 != null) {
                        arrayList5.add(nullabilityQualifier5);
                    }
                }
                setL1 = CollectionsKt.l0(arrayList5);
                if (nullabilityQualifier != nullabilityQualifier9) {
                    nullabilityQualifier9 = (NullabilityQualifier) TypeEnhancementUtilsKt.a(setL1, nullabilityQualifier8, nullabilityQualifier7, nullabilityQualifier, z3);
                }
            } else {
                nullabilityQualifier9 = nullabilityQualifier3;
            }
            arrayList4 = new ArrayList();
            it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                mutabilityQualifier3 = ((JavaTypeQualifiers) it2.next()).f43926b;
                if (mutabilityQualifier3 != null) {
                    arrayList4.add(mutabilityQualifier3);
                }
            }
            MutabilityQualifier mutabilityQualifier8 = (MutabilityQualifier) TypeEnhancementUtilsKt.a(CollectionsKt.l0(arrayList4), mutabilityQualifier4, mutabilityQualifier, javaTypeQualifiers.f43926b, z3);
            if (nullabilityQualifier9 != null) {
                nullabilityQualifier4 = null;
            } else {
                nullabilityQualifier4 = null;
            }
            if (nullabilityQualifier4 != nullabilityQualifier8) {
                z6 = false;
            } else {
                if (!javaTypeQualifiers.f43927c) {
                    if (!arrayList2.isEmpty()) {
                        it3 = arrayList2.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (((JavaTypeQualifiers) it3.next()).f43927c) {
                                }
                            }
                        }
                    }
                    z6 = false;
                }
                z6 = true;
            }
            if (nullabilityQualifier4 != null) {
                z7 = false;
            } else {
                z7 = false;
            }
            javaTypeQualifiersArr[i2] = new JavaTypeQualifiers(nullabilityQualifier4, mutabilityQualifier8, z6, z7);
            i2++;
            size = i3;
            arrayListJ = arrayList7;
            arrayList6 = arrayList;
            z8 = z8;
            javaTypeQualifiersArr2 = javaTypeQualifiersArr;
            lazyJavaResolverContext2 = lazyJavaResolverContext;
        }
        return this.f43944a.b(kotlinType.K0(), new AbstractSignatureParts$computeIndexedQualifiers$1(typeEnhancementInfo, javaTypeQualifiersArr2), 0, signatureParts.f43954e).f43919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:101:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:104:0x020c  */
    /* JADX WARN: Code duplicated, block: B:109:0x021d  */
    /* JADX WARN: Code duplicated, block: B:111:0x0221  */
    /* JADX WARN: Code duplicated, block: B:116:0x023c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0246  */
    /* JADX WARN: Code duplicated, block: B:124:0x0260  */
    /* JADX WARN: Code duplicated, block: B:125:0x0263  */
    /* JADX WARN: Code duplicated, block: B:127:0x0266  */
    /* JADX WARN: Code duplicated, block: B:128:0x0273  */
    /* JADX WARN: Code duplicated, block: B:146:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:147:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:149:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:150:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:154:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:156:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:158:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:163:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:168:0x02e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x02ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x02e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x0239 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x025c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:? A[LOOP:4: B:117:0x0240->B:185:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x012a  */
    /* JADX WARN: Code duplicated, block: B:7:0x002a  */
    /* JADX WARN: Code duplicated, block: B:80:0x018c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0194  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:86:0x01af  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e3  */
    public final ArrayList c(LazyJavaResolverContext c2, Collection collection) {
        Annotations annotations;
        KotlinType type;
        PredefinedFunctionEnhancementInfo predefinedFunctionEnhancementInfo;
        boolean z2;
        ArrayList arrayList;
        PropertyDescriptor propertyDescriptor;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType;
        TypeEnhancementInfo typeEnhancementInfo;
        JavaCallableMemberDescriptor javaCallableMemberDescriptor;
        KotlinType kotlinTypeA;
        KotlinType returnType;
        SignatureEnhancement$containsFunctionN$1 signatureEnhancement$containsFunctionN$1;
        boolean z3;
        Pair pair;
        ArrayList arrayList2;
        int i2;
        Iterator it;
        int i3;
        Object next;
        KotlinType type2;
        ReceiverParameterDescriptor receiverParameterDescriptorJ;
        ReceiverParameterDescriptor receiverParameterDescriptorJ2;
        boolean zC;
        List list;
        Iterator it2;
        KotlinType type3;
        boolean z4;
        KotlinType type4;
        TypeEnhancementInfo typeEnhancementInfo2;
        LazyJavaResolverContext lazyJavaResolverContextB;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl;
        Intrinsics.f(c2, "c");
        Collection<CallableDescriptor> collection2 = collection;
        int i4 = 10;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.n(collection2, 10));
        for (CallableDescriptor callableDescriptorP0 : collection2) {
            if (callableDescriptorP0 instanceof JavaCallableMemberDescriptor) {
                JavaCallableMemberDescriptor javaCallableMemberDescriptor2 = (JavaCallableMemberDescriptor) callableDescriptorP0;
                boolean z5 = true;
                if (javaCallableMemberDescriptor2.getKind() == CallableMemberDescriptor.Kind.f43557Y && javaCallableMemberDescriptor2.y0().l().size() == 1) {
                    i2 = i4;
                } else {
                    ClassifierDescriptor classifierDescriptorA = DescriptorUtilKt.a(callableDescriptorP0);
                    if (classifierDescriptorA == null) {
                        annotations = callableDescriptorP0.getAnnotations();
                    } else {
                        LazyJavaClassDescriptor lazyJavaClassDescriptor = classifierDescriptorA instanceof LazyJavaClassDescriptor ? (LazyJavaClassDescriptor) classifierDescriptorA : null;
                        List list2 = lazyJavaClassDescriptor != null ? (List) lazyJavaClassDescriptor.l0.getX() : null;
                        List list3 = list2;
                        if (list3 == null || list3.isEmpty()) {
                            annotations = callableDescriptorP0.getAnnotations();
                        } else {
                            List list4 = list2;
                            ArrayList arrayList4 = new ArrayList(CollectionsKt.n(list4, i4));
                            Iterator it3 = list4.iterator();
                            while (it3.hasNext()) {
                                arrayList4.add(new LazyJavaAnnotationDescriptor(c2, (JavaAnnotation) it3.next(), true));
                            }
                            annotations = Annotations.Companion.a(CollectionsKt.M(callableDescriptorP0.getAnnotations(), arrayList4));
                        }
                    }
                    LazyJavaResolverContext lazyJavaResolverContextB2 = ContextKt.b(c2, annotations);
                    CallableDescriptor callableDescriptor = (!(callableDescriptorP0 instanceof JavaPropertyDescriptor) || (propertyGetterDescriptorImpl = ((JavaPropertyDescriptor) callableDescriptorP0).x0) == null || propertyGetterDescriptorImpl.f0) ? callableDescriptorP0 : propertyGetterDescriptorImpl;
                    ReceiverParameterDescriptor receiverParameterDescriptorJ3 = javaCallableMemberDescriptor2.J();
                    AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType2 = AnnotationQualifierApplicabilityType.VALUE_PARAMETER;
                    if (receiverParameterDescriptorJ3 != null) {
                        FunctionDescriptor functionDescriptor = callableDescriptor instanceof FunctionDescriptor ? (FunctionDescriptor) callableDescriptor : null;
                        CallableDescriptor callableDescriptor2 = functionDescriptor != null ? (ValueParameterDescriptor) functionDescriptor.n0(JavaMethodDescriptor.H0) : null;
                        type = a((JavaCallableMemberDescriptor) callableDescriptorP0, callableDescriptor2, false, callableDescriptor2 != null ? ContextKt.b(lazyJavaResolverContextB2, callableDescriptor2.getAnnotations()) : lazyJavaResolverContextB2, annotationQualifierApplicabilityType2, null, false, SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1.X);
                    } else {
                        type = null;
                    }
                    JavaMethodDescriptor javaMethodDescriptor = callableDescriptorP0 instanceof JavaMethodDescriptor ? (JavaMethodDescriptor) callableDescriptorP0 : null;
                    if (javaMethodDescriptor != null) {
                        DeclarationDescriptor declarationDescriptorD = javaMethodDescriptor.d();
                        Intrinsics.d(declarationDescriptorD, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        String strA = MethodSignatureBuildingUtilsKt.a((ClassDescriptor) declarationDescriptorD, MethodSignatureMappingKt.a(javaMethodDescriptor, 3));
                        if (strA != null) {
                            predefinedFunctionEnhancementInfo = (PredefinedFunctionEnhancementInfo) PredefinedEnhancementInfoKt.d.get(strA);
                        } else {
                            predefinedFunctionEnhancementInfo = null;
                        }
                    } else {
                        predefinedFunctionEnhancementInfo = null;
                    }
                    if (predefinedFunctionEnhancementInfo != null) {
                        predefinedFunctionEnhancementInfo.f43943b.size();
                        javaCallableMemberDescriptor2.e().size();
                    }
                    JavaTypeEnhancementState javaTypeEnhancementState = c2.f43840a.v;
                    Intrinsics.f(javaTypeEnhancementState, "javaTypeEnhancementState");
                    int i5 = 0;
                    if (javaTypeEnhancementState.f43756b.invoke(JavaNullabilityAnnotationSettingsKt.f43749a) == ReportLevel.STRICT) {
                        if ((callableDescriptorP0 instanceof FunctionDescriptor) && Intrinsics.a(callableDescriptorP0.n0(JavaMethodDescriptor.I0), Boolean.TRUE)) {
                            z2 = true;
                        }
                        List listE = callableDescriptor.e();
                        Intrinsics.e(listE, "annotationOwnerForMember.valueParameters");
                        List<ValueParameterDescriptor> list5 = listE;
                        arrayList = new ArrayList(CollectionsKt.n(list5, i4));
                        for (final ValueParameterDescriptor valueParameterDescriptor : list5) {
                            if (predefinedFunctionEnhancementInfo != null) {
                                typeEnhancementInfo2 = (TypeEnhancementInfo) CollectionsKt.B(valueParameterDescriptor.g(), predefinedFunctionEnhancementInfo.f43943b);
                            } else {
                                typeEnhancementInfo2 = null;
                            }
                            Function1 function1 = new Function1<CallableMemberDescriptor, KotlinType>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$valueParameterEnhancements$1$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    CallableMemberDescriptor it4 = (CallableMemberDescriptor) obj;
                                    Intrinsics.f(it4, "it");
                                    KotlinType type5 = ((ValueParameterDescriptor) it4.e().get(valueParameterDescriptor.g())).getType();
                                    Intrinsics.e(type5, "it.valueParameters[p.index].type");
                                    return type5;
                                }
                            };
                            JavaCallableMemberDescriptor javaCallableMemberDescriptor3 = (JavaCallableMemberDescriptor) callableDescriptorP0;
                            if (valueParameterDescriptor != null) {
                                lazyJavaResolverContextB = ContextKt.b(lazyJavaResolverContextB2, valueParameterDescriptor.getAnnotations());
                            } else {
                                lazyJavaResolverContextB = lazyJavaResolverContextB2;
                            }
                            arrayList.add(a(javaCallableMemberDescriptor3, valueParameterDescriptor, false, lazyJavaResolverContextB, annotationQualifierApplicabilityType2, typeEnhancementInfo2, z2, function1));
                        }
                        if (callableDescriptorP0 instanceof PropertyDescriptor) {
                            propertyDescriptor = (PropertyDescriptor) callableDescriptorP0;
                        } else {
                            propertyDescriptor = null;
                        }
                        if (propertyDescriptor == null && JavaDescriptorUtilKt.a(propertyDescriptor)) {
                            annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.FIELD;
                        } else {
                            annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE;
                        }
                        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType3 = annotationQualifierApplicabilityType;
                        if (predefinedFunctionEnhancementInfo != null) {
                            typeEnhancementInfo = predefinedFunctionEnhancementInfo.f43942a;
                        } else {
                            typeEnhancementInfo = null;
                        }
                        javaCallableMemberDescriptor = (JavaCallableMemberDescriptor) callableDescriptorP0;
                        kotlinTypeA = a(javaCallableMemberDescriptor, callableDescriptor, true, lazyJavaResolverContextB2, annotationQualifierApplicabilityType3, typeEnhancementInfo, false, SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1.X);
                        returnType = javaCallableMemberDescriptor2.getReturnType();
                        Intrinsics.c(returnType);
                        signatureEnhancement$containsFunctionN$1 = SignatureEnhancement$containsFunctionN$1.X;
                        if (TypeUtils.c(returnType, signatureEnhancement$containsFunctionN$1, null)) {
                            z3 = true;
                        } else {
                            receiverParameterDescriptorJ2 = javaCallableMemberDescriptor2.J();
                            if (receiverParameterDescriptorJ2 != null || (type4 = receiverParameterDescriptorJ2.getType()) == null) {
                                zC = false;
                            } else {
                                zC = TypeUtils.c(type4, signatureEnhancement$containsFunctionN$1, null);
                            }
                            if (zC) {
                                z3 = true;
                            } else {
                                List valueParameters = javaCallableMemberDescriptor2.e();
                                Intrinsics.e(valueParameters, "valueParameters");
                                list = valueParameters;
                                if (!(list instanceof Collection) && list.isEmpty()) {
                                    z4 = false;
                                    break;
                                }
                                it2 = list.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        z4 = false;
                                        break;
                                    }
                                    type3 = ((ValueParameterDescriptor) it2.next()).getType();
                                    Intrinsics.e(type3, "it.type");
                                    if (TypeUtils.c(type3, signatureEnhancement$containsFunctionN$1, null)) {
                                        z4 = true;
                                        break;
                                    }
                                }
                                if (z4) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                            }
                        }
                        if (z3) {
                            pair = new Pair(DescriptorBasedDeprecationInfoKt.f44313a, new DeprecationCausedByFunctionNInfo(javaCallableMemberDescriptor));
                        } else {
                            pair = null;
                        }
                        if (type == null && kotlinTypeA == null) {
                            if (arrayList.isEmpty()) {
                                z5 = false;
                                break;
                            }
                            Iterator it4 = arrayList.iterator();
                            do {
                                if (!it4.hasNext()) {
                                    z5 = false;
                                    break;
                                }
                            } while (!(((KotlinType) it4.next()) != null));
                            if (z5 || pair != null) {
                                if (type == null) {
                                    receiverParameterDescriptorJ = javaCallableMemberDescriptor2.J();
                                    if (receiverParameterDescriptorJ != null) {
                                        type = receiverParameterDescriptorJ.getType();
                                    } else {
                                        type = null;
                                    }
                                }
                                i2 = 10;
                                arrayList2 = new ArrayList(CollectionsKt.n(arrayList, 10));
                                it = arrayList.iterator();
                                while (true) {
                                    i3 = i5;
                                    if (it.hasNext()) {
                                        if (kotlinTypeA == null) {
                                            kotlinTypeA = javaCallableMemberDescriptor2.getReturnType();
                                            Intrinsics.c(kotlinTypeA);
                                        }
                                        callableDescriptorP0 = javaCallableMemberDescriptor2.p0(type, arrayList2, kotlinTypeA, pair);
                                        break;
                                        break;
                                    }
                                    next = it.next();
                                    i5 = i3 + 1;
                                    if (i3 >= 0) {
                                        CollectionsKt.f0();
                                        throw null;
                                    }
                                    type2 = (KotlinType) next;
                                    if (type2 == null) {
                                        type2 = ((ValueParameterDescriptor) javaCallableMemberDescriptor2.e().get(i3)).getType();
                                        Intrinsics.e(type2, "valueParameters[index].type");
                                    }
                                    arrayList2.add(type2);
                                }
                            } else {
                                i2 = 10;
                            }
                        } else {
                            if (type == null) {
                                receiverParameterDescriptorJ = javaCallableMemberDescriptor2.J();
                                if (receiverParameterDescriptorJ != null) {
                                    type = receiverParameterDescriptorJ.getType();
                                } else {
                                    type = null;
                                }
                            }
                            i2 = 10;
                            arrayList2 = new ArrayList(CollectionsKt.n(arrayList, 10));
                            it = arrayList.iterator();
                            while (true) {
                                i3 = i5;
                                if (it.hasNext()) {
                                    if (kotlinTypeA == null) {
                                        kotlinTypeA = javaCallableMemberDescriptor2.getReturnType();
                                        Intrinsics.c(kotlinTypeA);
                                    }
                                    callableDescriptorP0 = javaCallableMemberDescriptor2.p0(type, arrayList2, kotlinTypeA, pair);
                                    break;
                                }
                                next = it.next();
                                i5 = i3 + 1;
                                if (i3 >= 0) {
                                    CollectionsKt.f0();
                                    throw null;
                                }
                                type2 = (KotlinType) next;
                                if (type2 == null) {
                                    type2 = ((ValueParameterDescriptor) javaCallableMemberDescriptor2.e().get(i3)).getType();
                                    Intrinsics.e(type2, "valueParameters[index].type");
                                }
                                arrayList2.add(type2);
                            }
                        }
                    } else {
                        lazyJavaResolverContextB2.f43840a.t.getClass();
                    }
                    z2 = false;
                    List listE2 = callableDescriptor.e();
                    Intrinsics.e(listE2, "annotationOwnerForMember.valueParameters");
                    List<ValueParameterDescriptor> list6 = listE2;
                    arrayList = new ArrayList(CollectionsKt.n(list6, i4));
                    while (r10.hasNext()) {
                        if (predefinedFunctionEnhancementInfo != null) {
                            typeEnhancementInfo2 = (TypeEnhancementInfo) CollectionsKt.B(valueParameterDescriptor.g(), predefinedFunctionEnhancementInfo.f43943b);
                        } else {
                            typeEnhancementInfo2 = null;
                        }
                        Function1 function2 = new Function1<CallableMemberDescriptor, KotlinType>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$valueParameterEnhancements$1$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                CallableMemberDescriptor it5 = (CallableMemberDescriptor) obj;
                                Intrinsics.f(it5, "it");
                                KotlinType type5 = ((ValueParameterDescriptor) it5.e().get(valueParameterDescriptor.g())).getType();
                                Intrinsics.e(type5, "it.valueParameters[p.index].type");
                                return type5;
                            }
                        };
                        JavaCallableMemberDescriptor javaCallableMemberDescriptor4 = (JavaCallableMemberDescriptor) callableDescriptorP0;
                        if (valueParameterDescriptor != null) {
                            lazyJavaResolverContextB = ContextKt.b(lazyJavaResolverContextB2, valueParameterDescriptor.getAnnotations());
                        } else {
                            lazyJavaResolverContextB = lazyJavaResolverContextB2;
                        }
                        arrayList.add(a(javaCallableMemberDescriptor4, valueParameterDescriptor, false, lazyJavaResolverContextB, annotationQualifierApplicabilityType2, typeEnhancementInfo2, z2, function2));
                    }
                    if (callableDescriptorP0 instanceof PropertyDescriptor) {
                        propertyDescriptor = (PropertyDescriptor) callableDescriptorP0;
                    } else {
                        propertyDescriptor = null;
                    }
                    if (propertyDescriptor == null) {
                        annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE;
                    } else {
                        annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE;
                    }
                    AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType4 = annotationQualifierApplicabilityType;
                    if (predefinedFunctionEnhancementInfo != null) {
                        typeEnhancementInfo = predefinedFunctionEnhancementInfo.f43942a;
                    } else {
                        typeEnhancementInfo = null;
                    }
                    javaCallableMemberDescriptor = (JavaCallableMemberDescriptor) callableDescriptorP0;
                    kotlinTypeA = a(javaCallableMemberDescriptor, callableDescriptor, true, lazyJavaResolverContextB2, annotationQualifierApplicabilityType4, typeEnhancementInfo, false, SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1.X);
                    returnType = javaCallableMemberDescriptor2.getReturnType();
                    Intrinsics.c(returnType);
                    signatureEnhancement$containsFunctionN$1 = SignatureEnhancement$containsFunctionN$1.X;
                    if (TypeUtils.c(returnType, signatureEnhancement$containsFunctionN$1, null)) {
                        z3 = true;
                    } else {
                        receiverParameterDescriptorJ2 = javaCallableMemberDescriptor2.J();
                        if (receiverParameterDescriptorJ2 != null) {
                            zC = false;
                        } else {
                            zC = false;
                        }
                        if (zC) {
                            List valueParameters2 = javaCallableMemberDescriptor2.e();
                            Intrinsics.e(valueParameters2, "valueParameters");
                            list = valueParameters2;
                            if (!(list instanceof Collection)) {
                                it2 = list.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        z4 = false;
                                        break;
                                    }
                                    type3 = ((ValueParameterDescriptor) it2.next()).getType();
                                    Intrinsics.e(type3, "it.type");
                                    if (TypeUtils.c(type3, signatureEnhancement$containsFunctionN$1, null)) {
                                        z4 = true;
                                        break;
                                    }
                                }
                            } else {
                                it2 = list.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        z4 = false;
                                        break;
                                    }
                                    type3 = ((ValueParameterDescriptor) it2.next()).getType();
                                    Intrinsics.e(type3, "it.type");
                                    if (TypeUtils.c(type3, signatureEnhancement$containsFunctionN$1, null)) {
                                        z4 = true;
                                        break;
                                    }
                                }
                            }
                            if (z4) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        } else {
                            z3 = true;
                        }
                    }
                    if (z3) {
                        pair = new Pair(DescriptorBasedDeprecationInfoKt.f44313a, new DeprecationCausedByFunctionNInfo(javaCallableMemberDescriptor));
                    } else {
                        pair = null;
                    }
                    if (type == null) {
                        if (type == null) {
                            receiverParameterDescriptorJ = javaCallableMemberDescriptor2.J();
                            if (receiverParameterDescriptorJ != null) {
                                type = receiverParameterDescriptorJ.getType();
                            } else {
                                type = null;
                            }
                        }
                        i2 = 10;
                        arrayList2 = new ArrayList(CollectionsKt.n(arrayList, 10));
                        it = arrayList.iterator();
                        while (true) {
                            i3 = i5;
                            if (it.hasNext()) {
                                if (kotlinTypeA == null) {
                                    kotlinTypeA = javaCallableMemberDescriptor2.getReturnType();
                                    Intrinsics.c(kotlinTypeA);
                                }
                                callableDescriptorP0 = javaCallableMemberDescriptor2.p0(type, arrayList2, kotlinTypeA, pair);
                                break;
                                break;
                            }
                            next = it.next();
                            i5 = i3 + 1;
                            if (i3 >= 0) {
                                CollectionsKt.f0();
                                throw null;
                            }
                            type2 = (KotlinType) next;
                            if (type2 == null) {
                                type2 = ((ValueParameterDescriptor) javaCallableMemberDescriptor2.e().get(i3)).getType();
                                Intrinsics.e(type2, "valueParameters[index].type");
                            }
                            arrayList2.add(type2);
                        }
                    } else {
                        if (type == null) {
                            receiverParameterDescriptorJ = javaCallableMemberDescriptor2.J();
                            if (receiverParameterDescriptorJ != null) {
                                type = receiverParameterDescriptorJ.getType();
                            } else {
                                type = null;
                            }
                        }
                        i2 = 10;
                        arrayList2 = new ArrayList(CollectionsKt.n(arrayList, 10));
                        it = arrayList.iterator();
                        while (true) {
                            i3 = i5;
                            if (it.hasNext()) {
                                if (kotlinTypeA == null) {
                                    kotlinTypeA = javaCallableMemberDescriptor2.getReturnType();
                                    Intrinsics.c(kotlinTypeA);
                                }
                                callableDescriptorP0 = javaCallableMemberDescriptor2.p0(type, arrayList2, kotlinTypeA, pair);
                                break;
                                break;
                            }
                            next = it.next();
                            i5 = i3 + 1;
                            if (i3 >= 0) {
                                CollectionsKt.f0();
                                throw null;
                            }
                            type2 = (KotlinType) next;
                            if (type2 == null) {
                                type2 = ((ValueParameterDescriptor) javaCallableMemberDescriptor2.e().get(i3)).getType();
                                Intrinsics.e(type2, "valueParameters[index].type");
                            }
                            arrayList2.add(type2);
                        }
                    }
                }
            } else {
                i2 = i4;
            }
            arrayList3.add(callableDescriptorP0);
            i4 = i2;
        }
        return arrayList3;
    }

    public final KotlinType d(KotlinType kotlinType, LazyJavaResolverContext context) {
        Intrinsics.f(context, "context");
        KotlinType kotlinTypeB = b(new SignatureParts(null, false, context, AnnotationQualifierApplicabilityType.TYPE_USE, true), kotlinType, EmptyList.X, null, false);
        return kotlinTypeB == null ? kotlinType : kotlinTypeB;
    }

    public final ArrayList e(LazyJavaTypeParameterDescriptor lazyJavaTypeParameterDescriptor, List list, LazyJavaResolverContext context) {
        LazyJavaResolverContext lazyJavaResolverContext;
        Intrinsics.f(context, "context");
        List<KotlinType> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.n(list2, 10));
        for (KotlinType kotlinType : list2) {
            SignatureEnhancement$enhanceTypeParameterBounds$1$1 signatureEnhancement$enhanceTypeParameterBounds$1$1 = SignatureEnhancement$enhanceTypeParameterBounds$1$1.X;
            Intrinsics.f(kotlinType, "<this>");
            if (TypeUtils.c(kotlinType, signatureEnhancement$enhanceTypeParameterBounds$1$1, null)) {
                lazyJavaResolverContext = context;
            } else {
                lazyJavaResolverContext = context;
                KotlinType kotlinTypeB = b(new SignatureParts(lazyJavaTypeParameterDescriptor, false, lazyJavaResolverContext, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, false), kotlinType, EmptyList.X, null, false);
                if (kotlinTypeB != null) {
                    kotlinType = kotlinTypeB;
                }
            }
            arrayList.add(kotlinType);
            context = lazyJavaResolverContext;
        }
        return arrayList;
    }
}
