package kotlin.reflect.jvm.internal;

import com.p004ironsource.d9;
import com.thinkup.core.common.n.mo;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference;
import kotlin.jvm.internal.RepeatableContainer;
import kotlin.reflect.KCallable;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectAnnotationSource;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectJavaClassFinderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotation;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.NullValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.TypedArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001an\u0010\u0011\u001a\u00028\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u001d\u0010\u0010\u001a\u0019\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r¢\u0006\u0002\b\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0016\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\"\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u0018*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001c"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/protobuf/MessageLite;", "M", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;", "D", "Ljava/lang/Class;", "moduleAnchor", "proto", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/NameResolver;", "nameResolver", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/TypeTable;", "typeTable", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/BinaryVersion;", "metadataVersion", "Lkotlin/Function2;", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/MemberDeserializer;", "Lkotlin/ExtensionFunctionType;", "createDescriptor", "deserializeToDescriptor", "(Ljava/lang/Class;Lorg/jetbrains/kotlin/protobuf/MessageLite;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;Lorg/jetbrains/kotlin/metadata/deserialization/BinaryVersion;Lkotlin/jvm/functions/Function2;)Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;", "R", "Lkotlin/Function0;", "block", "reflectionCall", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/impl/descriptors/ReceiverParameterDescriptor;", "getInstanceReceiverParameter", "(Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;)Lorg/jetbrains/kotlin/descriptors/ReceiverParameterDescriptor;", "instanceReceiverParameter", "kotlin-reflection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class UtilKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FqName f43420a = new FqName("kotlin.jvm.JvmStatic");

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43421a;

        static {
            int[] iArr = new int[PrimitiveType.values().length];
            try {
                iArr[PrimitiveType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrimitiveType.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PrimitiveType.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PrimitiveType.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PrimitiveType.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PrimitiveType.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PrimitiveType.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PrimitiveType.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f43421a = iArr;
        }
    }

    public static final KCallableImpl a(KCallable kCallable) {
        KCallableImpl kCallableImpl = kCallable instanceof KCallableImpl ? (KCallableImpl) kCallable : null;
        if (kCallableImpl != null) {
            return kCallableImpl;
        }
        KFunctionImpl kFunctionImplB = b(kCallable);
        return kFunctionImplB != null ? kFunctionImplB : c(kCallable);
    }

    public static final KFunctionImpl b(Object obj) {
        KFunctionImpl kFunctionImpl = obj instanceof KFunctionImpl ? (KFunctionImpl) obj : null;
        if (kFunctionImpl != null) {
            return kFunctionImpl;
        }
        FunctionReference functionReference = obj instanceof FunctionReference ? (FunctionReference) obj : null;
        KCallable kCallableCompute = functionReference != null ? functionReference.compute() : null;
        if (kCallableCompute instanceof KFunctionImpl) {
            return (KFunctionImpl) kCallableCompute;
        }
        return null;
    }

    public static final KPropertyImpl c(Object obj) {
        KPropertyImpl kPropertyImpl = obj instanceof KPropertyImpl ? (KPropertyImpl) obj : null;
        if (kPropertyImpl != null) {
            return kPropertyImpl;
        }
        PropertyReference propertyReference = obj instanceof PropertyReference ? (PropertyReference) obj : null;
        KCallable kCallableCompute = propertyReference != null ? propertyReference.compute() : null;
        if (kCallableCompute instanceof KPropertyImpl) {
            return (KPropertyImpl) kCallableCompute;
        }
        return null;
    }

    public static final ArrayList d(Annotated annotated) throws IllegalAccessException, InvocationTargetException {
        List listH;
        Annotation annotationI;
        Intrinsics.f(annotated, "<this>");
        Annotations annotations = annotated.getAnnotations();
        ArrayList<Annotation> arrayList = new ArrayList();
        for (AnnotationDescriptor annotationDescriptor : annotations) {
            SourceElement sourceElementF = annotationDescriptor.f();
            if (sourceElementF instanceof ReflectAnnotationSource) {
                annotationI = ((ReflectAnnotationSource) sourceElementF).f43671b;
            } else if (sourceElementF instanceof RuntimeSourceElementFactory.RuntimeSourceElement) {
                ReflectJavaElement reflectJavaElement = ((RuntimeSourceElementFactory.RuntimeSourceElement) sourceElementF).f43681b;
                ReflectJavaAnnotation reflectJavaAnnotation = reflectJavaElement instanceof ReflectJavaAnnotation ? (ReflectJavaAnnotation) reflectJavaElement : null;
                annotationI = reflectJavaAnnotation != null ? reflectJavaAnnotation.f43696a : null;
            } else {
                annotationI = i(annotationDescriptor);
            }
            if (annotationI != null) {
                arrayList.add(annotationI);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (JvmClassMappingKt.b(JvmClassMappingKt.a((Annotation) it.next())).getSimpleName().equals("Container")) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Annotation annotation : arrayList) {
                        Class clsB = JvmClassMappingKt.b(JvmClassMappingKt.a(annotation));
                        if (!clsB.getSimpleName().equals("Container") || clsB.getAnnotation(RepeatableContainer.class) == null) {
                            listH = CollectionsKt.H(annotation);
                        } else {
                            Object objInvoke = clsB.getDeclaredMethod("value", new Class[0]).invoke(annotation, new Object[0]);
                            Intrinsics.d(objInvoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                            listH = ArraysKt.e((Annotation[]) objInvoke);
                        }
                        CollectionsKt.g(listH, arrayList2);
                    }
                    return arrayList2;
                }
            }
        }
        return arrayList;
    }

    public static final Object e(Type type) {
        Intrinsics.f(type, "type");
        if (!(type instanceof Class) || !((Class) type).isPrimitive()) {
            return null;
        }
        if (type.equals(Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (type.equals(Character.TYPE)) {
            return (char) 0;
        }
        if (type.equals(Byte.TYPE)) {
            return (byte) 0;
        }
        if (type.equals(Short.TYPE)) {
            return (short) 0;
        }
        if (type.equals(Integer.TYPE)) {
            return 0;
        }
        if (type.equals(Float.TYPE)) {
            return Float.valueOf(0.0f);
        }
        if (type.equals(Long.TYPE)) {
            return 0L;
        }
        if (type.equals(Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (type.equals(Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException("Unknown primitive: " + type);
    }

    public static final CallableDescriptor f(Class moduleAnchor, GeneratedMessageLite.ExtendableMessage proto, NameResolver nameResolver, TypeTable typeTable, BinaryVersion metadataVersion, Function2 function2) {
        List list;
        Intrinsics.f(moduleAnchor, "moduleAnchor");
        Intrinsics.f(proto, "proto");
        Intrinsics.f(nameResolver, "nameResolver");
        Intrinsics.f(metadataVersion, "metadataVersion");
        RuntimeModuleData runtimeModuleDataA = ModuleByClassLoaderKt.a(moduleAnchor);
        if (proto instanceof ProtoBuf.Function) {
            list = ((ProtoBuf.Function) proto).j0;
        } else {
            if (!(proto instanceof ProtoBuf.Property)) {
                throw new IllegalStateException(("Unsupported message: " + proto).toString());
            }
            list = ((ProtoBuf.Property) proto).j0;
        }
        List typeParameters = list;
        DeserializationComponents deserializationComponents = runtimeModuleDataA.f43678a;
        ModuleDescriptor moduleDescriptor = deserializationComponents.f44392b;
        VersionRequirementTable versionRequirementTable = VersionRequirementTable.f44126b;
        Intrinsics.e(typeParameters, "typeParameters");
        return (CallableDescriptor) function2.invoke(new MemberDeserializer(new DeserializationContext(deserializationComponents, nameResolver, moduleDescriptor, typeTable, versionRequirementTable, metadataVersion, null, null, typeParameters)), proto);
    }

    public static final ReceiverParameterDescriptor g(CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.f(callableMemberDescriptor, "<this>");
        if (callableMemberDescriptor.G() == null) {
            return null;
        }
        DeclarationDescriptor declarationDescriptorD = callableMemberDescriptor.d();
        Intrinsics.d(declarationDescriptorD, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        return ((ClassDescriptor) declarationDescriptorD).E0();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class h(ClassLoader classLoader, ClassId classId, int i2) {
        String str = JavaToKotlinClassMap.f43521a;
        FqNameUnsafe fqNameUnsafeI = classId.b().i();
        Intrinsics.e(fqNameUnsafeI, "kotlinClassId.asSingleFqName().toUnsafe()");
        ClassId classIdF = JavaToKotlinClassMap.f(fqNameUnsafeI);
        if (classIdF != null) {
            classId = classIdF;
        }
        String strB = classId.g().b();
        String strB2 = classId.h().b();
        if (strB.equals("kotlin")) {
            switch (strB2.hashCode()) {
                case -901856463:
                    if (strB2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (strB2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (strB2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (strB2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (strB2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (strB2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (strB2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (strB2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (strB2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (i2 > 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                sb.append(d9.i.d);
            }
            sb.append("L");
        }
        if (strB.length() > 0) {
            sb.append(strB.concat(mo.ono));
        }
        sb.append(StringsKt.H(strB2, '.', '$'));
        if (i2 > 0) {
            sb.append(";");
        }
        String string = sb.toString();
        Intrinsics.e(string, "StringBuilder().apply(builderAction).toString()");
        return ReflectJavaClassFinderKt.a(classLoader, string);
    }

    public static final Annotation i(AnnotationDescriptor annotationDescriptor) {
        ClassDescriptor classDescriptorD = DescriptorUtilsKt.d(annotationDescriptor);
        Class clsJ = classDescriptorD != null ? j(classDescriptorD) : null;
        if (clsJ == null) {
            clsJ = null;
        }
        if (clsJ == null) {
            return null;
        }
        Set<Map.Entry> setEntrySet = annotationDescriptor.a().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setEntrySet) {
            Name name = (Name) entry.getKey();
            ConstantValue constantValue = (ConstantValue) entry.getValue();
            ClassLoader classLoader = clsJ.getClassLoader();
            Intrinsics.e(classLoader, "annotationClass.classLoader");
            Object objK = k(constantValue, classLoader);
            Pair pair = objK != null ? new Pair(name.b(), objK) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        Map mapP = MapsKt.p(arrayList);
        Set setKeySet = mapP.keySet();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.n(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList2.add(clsJ.getDeclaredMethod((String) it.next(), new Class[0]));
        }
        return (Annotation) AnnotationConstructorCallerKt.a(clsJ, mapP, arrayList2);
    }

    public static final Class j(ClassDescriptor classDescriptor) {
        Intrinsics.f(classDescriptor, "<this>");
        SourceElement source = classDescriptor.f();
        Intrinsics.e(source, "source");
        if (source instanceof KotlinJvmBinarySourceElement) {
            return ((ReflectKotlinClass) ((KotlinJvmBinarySourceElement) source).f44011b).f43673a;
        }
        if (source instanceof RuntimeSourceElementFactory.RuntimeSourceElement) {
            ReflectJavaElement reflectJavaElement = ((RuntimeSourceElementFactory.RuntimeSourceElement) source).f43681b;
            Intrinsics.d(reflectJavaElement, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((ReflectJavaClass) reflectJavaElement).f43703a;
        }
        ClassId classIdF = DescriptorUtilsKt.f(classDescriptor);
        if (classIdF == null) {
            return null;
        }
        return h(ReflectClassUtilKt.d(classDescriptor.getClass()), classIdF, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object k(ConstantValue constantValue, ClassLoader classLoader) {
        KotlinType kotlinType;
        Class clsH;
        if (constantValue instanceof AnnotationValue) {
            return i((AnnotationDescriptor) ((AnnotationValue) constantValue).f44302a);
        }
        int i2 = 0;
        if (constantValue instanceof ArrayValue) {
            ArrayValue arrayValue = (ArrayValue) constantValue;
            TypedArrayValue typedArrayValue = arrayValue instanceof TypedArrayValue ? (TypedArrayValue) arrayValue : null;
            if (typedArrayValue != null && (kotlinType = typedArrayValue.f44311c) != null) {
                Iterable iterable = (Iterable) arrayValue.f44302a;
                ArrayList arrayList = new ArrayList(CollectionsKt.n(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(k((ConstantValue) it.next(), classLoader));
                }
                Name name = KotlinBuiltIns.f;
                ClassifierDescriptor classifierDescriptorC = kotlinType.H0().c();
                PrimitiveType primitiveTypeQ = classifierDescriptorC == null ? null : KotlinBuiltIns.q(classifierDescriptorC);
                int i3 = primitiveTypeQ == null ? -1 : WhenMappings.f43421a[primitiveTypeQ.ordinal()];
                Object obj = arrayValue.f44302a;
                switch (i3) {
                    case -1:
                        if (!KotlinBuiltIns.x(kotlinType)) {
                            throw new IllegalStateException(("Not an array type: " + kotlinType).toString());
                        }
                        KotlinType type = ((TypeProjection) CollectionsKt.W(kotlinType.F0())).getType();
                        Intrinsics.e(type, "type.arguments.single().type");
                        ClassifierDescriptor classifierDescriptorC2 = type.H0().c();
                        ClassDescriptor classDescriptor = classifierDescriptorC2 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorC2 : null;
                        if (classDescriptor == null) {
                            throw new IllegalStateException(("Not a class type: " + type).toString());
                        }
                        if (KotlinBuiltIns.G(type)) {
                            int size = ((List) obj).size();
                            String[] strArr = new String[size];
                            while (i2 < size) {
                                Object obj2 = arrayList.get(i2);
                                Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.String");
                                strArr[i2] = obj2;
                                i2++;
                            }
                            return strArr;
                        }
                        if (KotlinBuiltIns.b(classDescriptor, StandardNames.FqNames.f43488P)) {
                            int size2 = ((List) obj).size();
                            Class[] clsArr = new Class[size2];
                            while (i2 < size2) {
                                Object obj3 = arrayList.get(i2);
                                Intrinsics.d(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                                clsArr[i2] = obj3;
                                i2++;
                            }
                            return clsArr;
                        }
                        ClassId classIdF = DescriptorUtilsKt.f(classDescriptor);
                        if (classIdF != null && (clsH = h(classLoader, classIdF, 0)) != null) {
                            Object objNewInstance = Array.newInstance((Class<?>) clsH, ((List) obj).size());
                            Intrinsics.d(objNewInstance, "null cannot be cast to non-null type kotlin.Array<in kotlin.Any?>");
                            Object[] objArr = (Object[]) objNewInstance;
                            int size3 = arrayList.size();
                            while (i2 < size3) {
                                objArr[i2] = arrayList.get(i2);
                                i2++;
                            }
                            return objArr;
                        }
                        break;
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        int size4 = ((List) obj).size();
                        boolean[] zArr = new boolean[size4];
                        while (i2 < size4) {
                            Object obj4 = arrayList.get(i2);
                            Intrinsics.d(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            zArr[i2] = ((Boolean) obj4).booleanValue();
                            i2++;
                        }
                        return zArr;
                    case 2:
                        int size5 = ((List) obj).size();
                        char[] cArr = new char[size5];
                        while (i2 < size5) {
                            Object obj5 = arrayList.get(i2);
                            Intrinsics.d(obj5, "null cannot be cast to non-null type kotlin.Char");
                            cArr[i2] = ((Character) obj5).charValue();
                            i2++;
                        }
                        return cArr;
                    case 3:
                        int size6 = ((List) obj).size();
                        byte[] bArr = new byte[size6];
                        while (i2 < size6) {
                            Object obj6 = arrayList.get(i2);
                            Intrinsics.d(obj6, "null cannot be cast to non-null type kotlin.Byte");
                            bArr[i2] = ((Byte) obj6).byteValue();
                            i2++;
                        }
                        return bArr;
                    case 4:
                        int size7 = ((List) obj).size();
                        short[] sArr = new short[size7];
                        while (i2 < size7) {
                            Object obj7 = arrayList.get(i2);
                            Intrinsics.d(obj7, "null cannot be cast to non-null type kotlin.Short");
                            sArr[i2] = ((Short) obj7).shortValue();
                            i2++;
                        }
                        return sArr;
                    case 5:
                        int size8 = ((List) obj).size();
                        int[] iArr = new int[size8];
                        while (i2 < size8) {
                            Object obj8 = arrayList.get(i2);
                            Intrinsics.d(obj8, "null cannot be cast to non-null type kotlin.Int");
                            iArr[i2] = ((Integer) obj8).intValue();
                            i2++;
                        }
                        return iArr;
                    case 6:
                        int size9 = ((List) obj).size();
                        float[] fArr = new float[size9];
                        while (i2 < size9) {
                            Object obj9 = arrayList.get(i2);
                            Intrinsics.d(obj9, "null cannot be cast to non-null type kotlin.Float");
                            fArr[i2] = ((Float) obj9).floatValue();
                            i2++;
                        }
                        return fArr;
                    case 7:
                        int size10 = ((List) obj).size();
                        long[] jArr = new long[size10];
                        while (i2 < size10) {
                            Object obj10 = arrayList.get(i2);
                            Intrinsics.d(obj10, "null cannot be cast to non-null type kotlin.Long");
                            jArr[i2] = ((Long) obj10).longValue();
                            i2++;
                        }
                        return jArr;
                    case 8:
                        int size11 = ((List) obj).size();
                        double[] dArr = new double[size11];
                        while (i2 < size11) {
                            Object obj11 = arrayList.get(i2);
                            Intrinsics.d(obj11, "null cannot be cast to non-null type kotlin.Double");
                            dArr[i2] = ((Double) obj11).doubleValue();
                            i2++;
                        }
                        return dArr;
                }
            }
        } else if (constantValue instanceof EnumValue) {
            Pair pair = (Pair) ((EnumValue) constantValue).f44302a;
            ClassId classId = (ClassId) pair.X;
            Name name2 = (Name) pair.f43249Y;
            Class clsH2 = h(classLoader, classId, 0);
            if (clsH2 != null) {
                return Enum.valueOf(clsH2, name2.b());
            }
        } else if (constantValue instanceof KClassValue) {
            KClassValue.Value value = (KClassValue.Value) ((KClassValue) constantValue).f44302a;
            if (value instanceof KClassValue.Value.NormalClass) {
                ClassLiteralValue classLiteralValue = ((KClassValue.Value.NormalClass) value).f44310a;
                return h(classLoader, classLiteralValue.f44300a, classLiteralValue.f44301b);
            }
            if (!(value instanceof KClassValue.Value.LocalClass)) {
                throw new NoWhenBranchMatchedException();
            }
            ClassifierDescriptor classifierDescriptorC3 = ((KClassValue.Value.LocalClass) value).f44309a.H0().c();
            ClassDescriptor classDescriptor2 = classifierDescriptorC3 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorC3 : null;
            if (classDescriptor2 != null) {
                return j(classDescriptor2);
            }
        } else {
            if (!(constantValue instanceof ErrorValue ? true : constantValue instanceof NullValue)) {
                return constantValue.b();
            }
        }
        return null;
    }
}
