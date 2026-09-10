package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.p004ironsource.d9;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.SuspendFunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.MutableClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.ExpandedTypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.checker.SimpleClassicTypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;
import kotlin.text.StringsKt;
import p005e.a;

/* JADX INFO: loaded from: classes7.dex */
public final class DescriptorBasedTypeSignatureMappingKt {
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    public static final String a(ClassDescriptor klass, TypeMappingConfiguration typeMappingConfiguration) {
        Intrinsics.f(klass, "klass");
        Intrinsics.f(typeMappingConfiguration, "typeMappingConfiguration");
        typeMappingConfiguration.a(klass);
        DeclarationDescriptor declarationDescriptorD = klass.d();
        Intrinsics.e(declarationDescriptorD, "klass.containingDeclaration");
        Name name = klass.getName();
        if (name != null) {
            Name name2 = SpecialNames.f44173a;
            if (name.f44171Y) {
                name = SpecialNames.f44175c;
            }
        } else {
            name = SpecialNames.f44175c;
        }
        String strD = name.d();
        if (declarationDescriptorD instanceof PackageFragmentDescriptor) {
            FqName fqNameC = ((PackageFragmentDescriptor) declarationDescriptorD).c();
            if (fqNameC.d()) {
                return strD;
            }
            return StringsKt.H(fqNameC.b(), '.', IOUtils.DIR_SEPARATOR_UNIX) + IOUtils.DIR_SEPARATOR_UNIX + strD;
        }
        ClassDescriptor classDescriptor = declarationDescriptorD instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptorD : null;
        if (classDescriptor == null) {
            throw new IllegalArgumentException("Unexpected container: " + declarationDescriptorD + " for " + klass);
        }
        typeMappingConfiguration.b(classDescriptor);
        return a(classDescriptor, typeMappingConfiguration) + '$' + strD;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0110  */
    /* JADX WARN: Code duplicated, block: B:77:0x01dc A[EDGE_INSN: B:77:0x01dc->B:80:0x020d BREAK  A[LOOP:1: B:72:0x01c7->B:178:?]] */
    public static final Object b(KotlinType kotlinType, TypeMappingMode typeMappingMode, Function3 function3) {
        KotlinType kotlinType2;
        TypeMappingMode typeMappingMode2;
        Object objB;
        int iOrdinal;
        JvmPrimitiveType jvmPrimitiveType;
        JvmType.Primitive possiblyPrimitiveType;
        boolean z2;
        JvmPrimitiveType jvmPrimitiveType2;
        JvmTypeFactoryImpl jvmTypeFactoryImpl = JvmTypeFactoryImpl.f44008a;
        TypeMappingConfigurationImpl typeMappingConfigurationImpl = TypeMappingConfigurationImpl.f44014a;
        Intrinsics.f(kotlinType, "kotlinType");
        JvmType jvmTypeB = null;
        if (FunctionTypesKt.i(kotlinType)) {
            MutableClassDescriptor mutableClassDescriptor = SuspendFunctionTypesKt.f43508a;
            FunctionTypesKt.i(kotlinType);
            KotlinBuiltIns kotlinBuiltInsF = TypeUtilsKt.f(kotlinType);
            Annotations annotations = kotlinType.getAnnotations();
            KotlinType kotlinTypeF = FunctionTypesKt.f(kotlinType);
            List listD = FunctionTypesKt.d(kotlinType);
            List listG = FunctionTypesKt.g(kotlinType);
            ArrayList arrayList = new ArrayList(CollectionsKt.n(listG, 10));
            Iterator it = listG.iterator();
            while (it.hasNext()) {
                arrayList.add(((TypeProjection) it.next()).getType());
            }
            TypeAttributes.f44529Y.getClass();
            TypeAttributes typeAttributes = TypeAttributes.Z;
            TypeConstructor typeConstructorH = SuspendFunctionTypesKt.f43508a.h();
            FunctionTypesKt.h(kotlinType);
            KotlinType type = ((TypeProjection) CollectionsKt.F(kotlinType.F0())).getType();
            Intrinsics.e(type, "arguments.last().type");
            return b(FunctionTypesKt.b(kotlinBuiltInsF, annotations, kotlinTypeF, listD, CollectionsKt.P(KotlinTypeFactory.d(typeAttributes, typeConstructorH, CollectionsKt.H(TypeUtilsKt.a(type)), false, null), arrayList), TypeUtilsKt.f(kotlinType).n(), false).L0(kotlinType.I0()), typeMappingMode, function3);
        }
        TypeConstructor receiver = SimpleClassicTypeSystemContext.f44576a.O(kotlinType);
        if (ClassicTypeSystemContext.DefaultImpls.A(receiver)) {
            Intrinsics.f(receiver, "$receiver");
            if (!(receiver instanceof TypeConstructor)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(receiver);
                sb.append(", ");
                throw new IllegalArgumentException(a.b(Reflection.f43333a, receiver.getClass(), sb).toString());
            }
            ClassifierDescriptor classifierDescriptorC = receiver.c();
            Intrinsics.d(classifierDescriptorC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            PrimitiveType primitiveTypeS = KotlinBuiltIns.s((ClassDescriptor) classifierDescriptorC);
            if (primitiveTypeS != null) {
                switch (primitiveTypeS) {
                    case BOOLEAN:
                        possiblyPrimitiveType = JvmType.f44000a;
                        break;
                    case CHAR:
                        possiblyPrimitiveType = JvmType.f44001b;
                        break;
                    case BYTE:
                        possiblyPrimitiveType = JvmType.f44002c;
                        break;
                    case SHORT:
                        possiblyPrimitiveType = JvmType.d;
                        break;
                    case INT:
                        possiblyPrimitiveType = JvmType.f44003e;
                        break;
                    case FLOAT:
                        possiblyPrimitiveType = JvmType.f;
                        break;
                    case LONG:
                        possiblyPrimitiveType = JvmType.g;
                        break;
                    case DOUBLE:
                        possiblyPrimitiveType = JvmType.f44004h;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                if (ClassicTypeSystemContext.DefaultImpls.J(kotlinType)) {
                    z2 = true;
                } else {
                    FqName ENHANCED_NULLABILITY_ANNOTATION = JvmAnnotationNames.f43773p;
                    Intrinsics.e(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
                    if (ClassicTypeSystemContext.DefaultImpls.w(kotlinType, ENHANCED_NULLABILITY_ANNOTATION)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                Intrinsics.f(possiblyPrimitiveType, "possiblyPrimitiveType");
                if (!z2 || (jvmPrimitiveType2 = possiblyPrimitiveType.f44007i) == null) {
                    jvmTypeB = possiblyPrimitiveType;
                } else {
                    String strE = JvmClassName.c(jvmPrimitiveType2.h()).e();
                    Intrinsics.e(strE, "byFqNameWithoutInnerClas…apperFqName).internalName");
                    jvmTypeB = new JvmType.Object(strE);
                }
            } else {
                Intrinsics.f(receiver, "$receiver");
                if (!(receiver instanceof TypeConstructor)) {
                    StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                    sb2.append(receiver);
                    sb2.append(", ");
                    throw new IllegalArgumentException(a.b(Reflection.f43333a, receiver.getClass(), sb2).toString());
                }
                ClassifierDescriptor classifierDescriptorC2 = receiver.c();
                Intrinsics.d(classifierDescriptorC2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                PrimitiveType primitiveTypeQ = KotlinBuiltIns.q((ClassDescriptor) classifierDescriptorC2);
                if (primitiveTypeQ != null) {
                    StringBuilder sb3 = new StringBuilder(d9.i.d);
                    JvmPrimitiveType jvmPrimitiveType3 = (JvmPrimitiveType) JvmPrimitiveType.p0.get(primitiveTypeQ);
                    if (jvmPrimitiveType3 == null) {
                        JvmPrimitiveType.a(4);
                        throw null;
                    }
                    sb3.append(jvmPrimitiveType3.d());
                    jvmTypeB = JvmTypeFactoryImpl.a(sb3.toString());
                } else {
                    Intrinsics.f(receiver, "$receiver");
                    if (!(receiver instanceof TypeConstructor)) {
                        StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                        sb4.append(receiver);
                        sb4.append(", ");
                        throw new IllegalArgumentException(a.b(Reflection.f43333a, receiver.getClass(), sb4).toString());
                    }
                    ClassifierDescriptor classifierDescriptorC3 = receiver.c();
                    if (classifierDescriptorC3 != null && KotlinBuiltIns.I(classifierDescriptorC3)) {
                        Intrinsics.f(receiver, "$receiver");
                        if (!(receiver instanceof TypeConstructor)) {
                            StringBuilder sb5 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                            sb5.append(receiver);
                            sb5.append(", ");
                            throw new IllegalArgumentException(a.b(Reflection.f43333a, receiver.getClass(), sb5).toString());
                        }
                        ClassifierDescriptor classifierDescriptorC4 = receiver.c();
                        Intrinsics.d(classifierDescriptorC4, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        FqNameUnsafe fqNameUnsafeH = DescriptorUtilsKt.h((ClassDescriptor) classifierDescriptorC4);
                        String str = JavaToKotlinClassMap.f43521a;
                        ClassId classIdF = JavaToKotlinClassMap.f(fqNameUnsafeH);
                        if (classIdF != null) {
                            if (!typeMappingMode.g) {
                                List list = JavaToKotlinClassMap.f43528n;
                                if (!(list instanceof Collection) || !list.isEmpty()) {
                                    Iterator it2 = list.iterator();
                                    do {
                                        if (!it2.hasNext()) {
                                            String strE2 = JvmClassName.b(classIdF).e();
                                            Intrinsics.e(strE2, "byClassId(classId).internalName");
                                            jvmTypeB = jvmTypeFactoryImpl.b(strE2);
                                            break;
                                        }
                                    } while (!((JavaToKotlinClassMap.PlatformMutabilityMapping) it2.next()).f43529a.equals(classIdF));
                                } else {
                                    String strE3 = JvmClassName.b(classIdF).e();
                                    Intrinsics.e(strE3, "byClassId(classId).internalName");
                                    jvmTypeB = jvmTypeFactoryImpl.b(strE3);
                                    break;
                                }
                            } else {
                                String strE4 = JvmClassName.b(classIdF).e();
                                Intrinsics.e(strE4, "byClassId(classId).internalName");
                                jvmTypeB = jvmTypeFactoryImpl.b(strE4);
                                break;
                            }
                        }
                    }
                }
            }
        }
        if (jvmTypeB != null) {
            if (!typeMappingMode.f44015a || !(jvmTypeB instanceof JvmType.Primitive) || (jvmPrimitiveType = ((JvmType.Primitive) jvmTypeB).f44007i) == null) {
                return jvmTypeB;
            }
            String strE5 = JvmClassName.c(jvmPrimitiveType.h()).e();
            Intrinsics.e(strE5, "byFqNameWithoutInnerClas…apperFqName).internalName");
            return new JvmType.Object(strE5);
        }
        TypeConstructor typeConstructorH0 = kotlinType.H0();
        if (typeConstructorH0 instanceof IntersectionTypeConstructor) {
            IntersectionTypeConstructor intersectionTypeConstructor = (IntersectionTypeConstructor) typeConstructorH0;
            KotlinType kotlinType3 = intersectionTypeConstructor.f44512a;
            if (kotlinType3 != null) {
                return b(TypeUtilsKt.l(kotlinType3), typeMappingMode, function3);
            }
            LinkedHashSet types = intersectionTypeConstructor.f44513b;
            Intrinsics.f(types, "types");
            throw new AssertionError("There should be no intersection type in existing descriptors, but found: " + CollectionsKt.D(types, null, null, null, null, 63));
        }
        ClassifierDescriptor classifierDescriptorC5 = typeConstructorH0.c();
        if (classifierDescriptorC5 == null) {
            throw new UnsupportedOperationException("no descriptor for type constructor of " + kotlinType);
        }
        if (ErrorUtils.f(classifierDescriptorC5)) {
            return jvmTypeFactoryImpl.b("error/NonExistentClass");
        }
        boolean z3 = classifierDescriptorC5 instanceof ClassDescriptor;
        boolean z4 = typeMappingMode.f44017c;
        if (z3 && KotlinBuiltIns.x(kotlinType)) {
            if (kotlinType.F0().size() != 1) {
                throw new UnsupportedOperationException("arrays must have one type argument");
            }
            TypeProjection typeProjection = (TypeProjection) kotlinType.F0().get(0);
            KotlinType type2 = typeProjection.getType();
            Intrinsics.e(type2, "memberProjection.type");
            if (typeProjection.b() == Variance.IN_VARIANCE) {
                objB = jvmTypeFactoryImpl.b("java/lang/Object");
            } else {
                Variance varianceB = typeProjection.b();
                Intrinsics.e(varianceB, "memberProjection.projectionKind");
                if (z4 || ((iOrdinal = varianceB.ordinal()) == 0 ? (typeMappingMode2 = typeMappingMode.f44020i) == null : !(iOrdinal == 1 ? (typeMappingMode2 = typeMappingMode.f44019h) != null : (typeMappingMode2 = typeMappingMode.f) != null))) {
                    typeMappingMode2 = typeMappingMode;
                }
                objB = b(type2, typeMappingMode2, function3);
            }
            return JvmTypeFactoryImpl.a(d9.i.d + JvmTypeFactoryImpl.c((JvmType) objB));
        }
        if (!z3) {
            if (classifierDescriptorC5 instanceof TypeParameterDescriptor) {
                KotlinType kotlinTypeG = TypeUtilsKt.g((TypeParameterDescriptor) classifierDescriptorC5);
                if (kotlinType.I0()) {
                    kotlinTypeG = TypeUtilsKt.j(kotlinTypeG);
                }
                return b(kotlinTypeG, typeMappingMode, FunctionsKt.b());
            }
            if ((classifierDescriptorC5 instanceof TypeAliasDescriptor) && typeMappingMode.j) {
                return b(((TypeAliasDescriptor) classifierDescriptorC5).C(), typeMappingMode, function3);
            }
            throw new UnsupportedOperationException("Unknown type " + kotlinType);
        }
        if (InlineClassesUtilsKt.b(classifierDescriptorC5) && !typeMappingMode.f44016b && (kotlinType2 = (KotlinType) ExpandedTypeUtilsKt.a(kotlinType, new HashSet())) != null) {
            return b(kotlinType2, new TypeMappingMode(typeMappingMode.f44015a, true, typeMappingMode.f44017c, typeMappingMode.d, typeMappingMode.f44018e, typeMappingMode.f, typeMappingMode.g, typeMappingMode.f44019h, typeMappingMode.f44020i, 512), function3);
        }
        if (z4 && KotlinBuiltIns.b((ClassDescriptor) classifierDescriptorC5, StandardNames.FqNames.f43488P)) {
            return new JvmType.Object("java/lang/Class");
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) classifierDescriptorC5;
        Intrinsics.e(classDescriptor.y0(), "descriptor.original");
        if (classDescriptor.getKind() == ClassKind.e0) {
            DeclarationDescriptor declarationDescriptorD = classDescriptor.d();
            Intrinsics.d(declarationDescriptorD, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            classDescriptor = (ClassDescriptor) declarationDescriptorD;
        }
        ClassDescriptor classDescriptorY0 = classDescriptor.y0();
        Intrinsics.e(classDescriptorY0, "enumClassIfEnumEntry.original");
        return jvmTypeFactoryImpl.b(a(classDescriptorY0, typeMappingConfigurationImpl));
    }
}
