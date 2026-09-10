package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.p004ironsource.mediationsdk.metadata.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionForAbsentTypeParameter;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeAliasExpander;
import kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansion;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionBase;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: classes7.dex */
public final class TypeDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeserializationContext f44438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypeDeserializer f44439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44440c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MemoizedFunctionToNullable f44441e;
    public final MemoizedFunctionToNullable f;
    public final Object g;

    public TypeDeserializer(DeserializationContext c2, TypeDeserializer typeDeserializer, List typeParameterProtos, String debugName, String str) {
        Map linkedHashMap;
        Intrinsics.f(c2, "c");
        Intrinsics.f(typeParameterProtos, "typeParameterProtos");
        Intrinsics.f(debugName, "debugName");
        this.f44438a = c2;
        this.f44439b = typeDeserializer;
        this.f44440c = debugName;
        this.d = str;
        DeserializationComponents deserializationComponents = c2.f44401a;
        this.f44441e = deserializationComponents.f44391a.h(new Function1<Integer, ClassifierDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$classifierDescriptors$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int iIntValue = ((Number) obj).intValue();
                DeserializationContext deserializationContext = this.X.f44438a;
                ClassId classIdA = NameResolverUtilKt.a(deserializationContext.f44402b, iIntValue);
                boolean z2 = classIdA.f44163c;
                DeserializationComponents deserializationComponents2 = deserializationContext.f44401a;
                return z2 ? deserializationComponents2.b(classIdA) : FindClassInModuleKt.b(deserializationComponents2.f44392b, classIdA);
            }
        });
        this.f = deserializationComponents.f44391a.h(new Function1<Integer, ClassifierDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$typeAliasDescriptors$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int iIntValue = ((Number) obj).intValue();
                DeserializationContext deserializationContext = this.X.f44438a;
                ClassId classIdA = NameResolverUtilKt.a(deserializationContext.f44402b, iIntValue);
                if (classIdA.f44163c) {
                    return null;
                }
                ModuleDescriptor moduleDescriptor = deserializationContext.f44401a.f44392b;
                Intrinsics.f(moduleDescriptor, "<this>");
                ClassifierDescriptor classifierDescriptorB = FindClassInModuleKt.b(moduleDescriptor, classIdA);
                if (classifierDescriptorB instanceof TypeAliasDescriptor) {
                    return (TypeAliasDescriptor) classifierDescriptorB;
                }
                return null;
            }
        });
        if (typeParameterProtos.isEmpty()) {
            linkedHashMap = EmptyMap.X;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = typeParameterProtos.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                ProtoBuf.TypeParameter typeParameter = (ProtoBuf.TypeParameter) it.next();
                linkedHashMap.put(Integer.valueOf(typeParameter.e0), new DeserializedTypeParameterDescriptor(this.f44438a, typeParameter, i2));
                i2++;
            }
        }
        this.g = linkedHashMap;
    }

    public static SimpleType a(SimpleType simpleType, KotlinType kotlinType) {
        KotlinBuiltIns kotlinBuiltInsF = TypeUtilsKt.f(simpleType);
        Annotations annotations = simpleType.getAnnotations();
        KotlinType kotlinTypeF = FunctionTypesKt.f(simpleType);
        List listD = FunctionTypesKt.d(simpleType);
        List listS = CollectionsKt.s(FunctionTypesKt.g(simpleType));
        ArrayList arrayList = new ArrayList(CollectionsKt.n(listS, 10));
        Iterator it = listS.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeProjection) it.next()).getType());
        }
        return FunctionTypesKt.b(kotlinBuiltInsF, annotations, kotlinTypeF, listD, arrayList, kotlinType, true).L0(simpleType.I0());
    }

    public static final ArrayList e(ProtoBuf.Type type, TypeDeserializer typeDeserializer) {
        List argumentList = type.e0;
        Intrinsics.e(argumentList, "argumentList");
        List list = argumentList;
        ProtoBuf.Type typeA = ProtoTypeTableUtilKt.a(type, typeDeserializer.f44438a.d);
        Iterable iterableE = typeA != null ? e(typeA, typeDeserializer) : null;
        if (iterableE == null) {
            iterableE = EmptyList.X;
        }
        return CollectionsKt.O(iterableE, list);
    }

    public static TypeAttributes f(List list, Annotations annotations, TypeConstructor typeConstructor, DeclarationDescriptor declarationDescriptor) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeAttributeTranslator) it.next()).a(annotations));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            CollectionsKt.g((Iterable) it2.next(), arrayList2);
        }
        TypeAttributes.f44529Y.getClass();
        return TypeAttributes.Companion.c(arrayList2);
    }

    public static final ClassDescriptor h(final TypeDeserializer typeDeserializer, ProtoBuf.Type type, int i2) {
        ClassId classIdA = NameResolverUtilKt.a(typeDeserializer.f44438a.f44402b, i2);
        ArrayList arrayListW = SequencesKt.w(SequencesKt.o(SequencesKt.l(new Function1<ProtoBuf.Type, ProtoBuf.Type>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ProtoBuf.Type it = (ProtoBuf.Type) obj;
                Intrinsics.f(it, "it");
                return ProtoTypeTableUtilKt.a(it, this.X.f44438a.d);
            }
        }, type), TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$2.X));
        int iD = SequencesKt.d(SequencesKt.l(TypeDeserializer$typeConstructor$notFoundClass$classNestingLevel$1.X, classIdA));
        while (arrayListW.size() < iD) {
            arrayListW.add(0);
        }
        return typeDeserializer.f44438a.f44401a.f44397l.a(classIdA, arrayListW);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final List b() {
        return CollectionsKt.i0(this.g.values());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final TypeParameterDescriptor c(int i2) {
        TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) this.g.get(Integer.valueOf(i2));
        if (typeParameterDescriptor != null) {
            return typeParameterDescriptor;
        }
        TypeDeserializer typeDeserializer = this.f44439b;
        if (typeDeserializer != null) {
            return typeDeserializer.c(i2);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x029d  */
    /* JADX WARN: Code duplicated, block: B:103:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:104:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:106:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:107:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:108:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:110:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:111:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:114:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:142:0x0357  */
    /* JADX WARN: Code duplicated, block: B:143:0x0364  */
    /* JADX WARN: Code duplicated, block: B:144:0x0367  */
    /* JADX WARN: Code duplicated, block: B:146:0x037c  */
    /* JADX WARN: Code duplicated, block: B:148:0x0383  */
    /* JADX WARN: Code duplicated, block: B:149:0x0385  */
    /* JADX WARN: Code duplicated, block: B:153:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:154:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:156:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:157:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:159:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:162:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:164:0x03da A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:165:0x0214 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0210 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x01a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x010c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0125  */
    /* JADX WARN: Code duplicated, block: B:49:0x0159  */
    /* JADX WARN: Code duplicated, block: B:51:0x0163  */
    /* JADX WARN: Code duplicated, block: B:53:0x017e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0180  */
    /* JADX WARN: Code duplicated, block: B:56:0x0190  */
    /* JADX WARN: Code duplicated, block: B:57:0x0197  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:76:0x01de  */
    /* JADX WARN: Code duplicated, block: B:77:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:80:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:97:0x027e  */
    /* JADX WARN: Code duplicated, block: B:99:0x028c  */
    /* JADX WARN: Instruction removed from duplicated block: B:149:0x0385, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:66:0x01b0, please report this as an issue */
    public final SimpleType d(final ProtoBuf.Type proto, boolean z2) {
        TypeConstructor typeConstructorD;
        ClassifierDescriptor classifierDescriptorH;
        Object next;
        DeserializationComponents deserializationComponents;
        TypeAttributes typeAttributesF;
        ArrayList arrayList;
        Iterator it;
        int i2;
        boolean zHasNext;
        TypeTable typeTable;
        List arguments;
        ProtoBuf.Type type;
        SimpleType simpleTypeD;
        DefinitelyNotNullType definitelyNotNullTypeA;
        boolean z3;
        int size;
        SimpleType simpleTypeD2;
        ClassifierDescriptor classifierDescriptorC;
        FunctionClassKind functionClassKindE;
        TypeProjection typeProjection;
        KotlinType type2;
        int size2;
        int i3;
        ProtoBuf.Type typeA;
        Object next2;
        int i4;
        ProtoBuf.Type.Argument argument;
        TypeParameterDescriptor typeParameterDescriptor;
        ProtoBuf.Type.Argument.Projection projection;
        int iOrdinal;
        Variance variance;
        int i5;
        ProtoBuf.Type typeA2;
        TypeProjectionBase typeProjectionImpl;
        int i6 = 1;
        Intrinsics.f(proto, "proto");
        boolean zP = proto.p();
        DeserializationContext deserializationContext = this.f44438a;
        if (zP) {
            if (NameResolverUtilKt.a(deserializationContext.f44402b, proto.j0).f44163c) {
                deserializationContext.f44401a.g.getClass();
            }
        } else if ((proto.Z & 128) == 128) {
            if (NameResolverUtilKt.a(deserializationContext.f44402b, proto.m0).f44163c) {
                deserializationContext.f44401a.g.getClass();
            }
        }
        if (proto.p()) {
            classifierDescriptorH = (ClassifierDescriptor) this.f44441e.invoke(Integer.valueOf(proto.j0));
            if (classifierDescriptorH == null) {
                classifierDescriptorH = h(this, proto, proto.j0);
            }
        } else {
            int i7 = proto.Z;
            if ((i7 & 32) == 32) {
                classifierDescriptorH = c(proto.k0);
                if (classifierDescriptorH == null) {
                    ErrorUtils errorUtils = ErrorUtils.f44590a;
                    typeConstructorD = ErrorUtils.d(ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, String.valueOf(proto.k0), this.d);
                }
            } else if ((i7 & 64) == 64) {
                String string = deserializationContext.f44402b.getString(proto.l0);
                Iterator it2 = b().iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!Intrinsics.a(((TypeParameterDescriptor) next).getName().b(), string));
                TypeParameterDescriptor typeParameterDescriptor2 = (TypeParameterDescriptor) next;
                if (typeParameterDescriptor2 == null) {
                    ErrorUtils errorUtils2 = ErrorUtils.f44590a;
                    typeConstructorD = ErrorUtils.d(ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, string, deserializationContext.f44403c.toString());
                } else {
                    classifierDescriptorH = typeParameterDescriptor2;
                }
            } else if ((i7 & 128) == 128) {
                classifierDescriptorH = (ClassifierDescriptor) this.f.invoke(Integer.valueOf(proto.m0));
                if (classifierDescriptorH == null) {
                    classifierDescriptorH = h(this, proto, proto.m0);
                }
            } else {
                ErrorUtils errorUtils3 = ErrorUtils.f44590a;
                typeConstructorD = ErrorUtils.d(ErrorTypeKind.UNKNOWN_TYPE, new String[0]);
            }
            if (ErrorUtils.f(typeConstructorD.c())) {
                ErrorUtils errorUtils4 = ErrorUtils.f44590a;
                return ErrorUtils.e(ErrorTypeKind.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, EmptyList.X, typeConstructorD, (String[]) Arrays.copyOf(new String[]{typeConstructorD.toString()}, 1));
            }
            DeserializedAnnotations deserializedAnnotations = new DeserializedAnnotations(deserializationContext.f44401a.f44391a, new Function0<List<? extends AnnotationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$simpleType$annotations$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    DeserializationContext deserializationContext2 = this.f44438a;
                    return deserializationContext2.f44401a.f44394e.b(proto, deserializationContext2.f44402b);
                }
            });
            deserializationComponents = deserializationContext.f44401a;
            List list = deserializationComponents.s;
            DeclarationDescriptor declarationDescriptor = deserializationContext.f44403c;
            typeAttributesF = f(list, deserializedAnnotations, typeConstructorD, declarationDescriptor);
            ArrayList arrayListE = e(proto, this);
            arrayList = new ArrayList(CollectionsKt.n(arrayListE, 10));
            it = arrayListE.iterator();
            i2 = 0;
            while (true) {
                zHasNext = it.hasNext();
                typeTable = deserializationContext.d;
                if (zHasNext) {
                    arguments = CollectionsKt.i0(arrayList);
                    ClassifierDescriptor classifierDescriptorC2 = typeConstructorD.c();
                    if (z2 || !(classifierDescriptorC2 instanceof TypeAliasDescriptor)) {
                        if (Flags.f44108a.e(proto.r0).booleanValue()) {
                            z3 = proto.f0;
                            size = typeConstructorD.getParameters().size() - arguments.size();
                            if (size == 0) {
                                simpleTypeD2 = KotlinTypeFactory.d(typeAttributesF, typeConstructorD, arguments, z3, null);
                                classifierDescriptorC = simpleTypeD2.H0().c();
                                if (classifierDescriptorC != null) {
                                    functionClassKindE = FunctionTypesKt.e(classifierDescriptorC);
                                } else {
                                    functionClassKindE = null;
                                }
                                if (functionClassKindE == FunctionClassKind.e0 || (typeProjection = (TypeProjection) CollectionsKt.G(FunctionTypesKt.g(simpleTypeD2))) == null || (type2 = typeProjection.getType()) == null) {
                                    simpleTypeD2 = null;
                                } else {
                                    ClassifierDescriptor classifierDescriptorC3 = type2.H0().c();
                                    FqName fqNameG = classifierDescriptorC3 != null ? DescriptorUtilsKt.g(classifierDescriptorC3) : null;
                                    if (type2.F0().size() == 1 && (Intrinsics.a(fqNameG, StandardNames.f) || Intrinsics.a(fqNameG, TypeDeserializerKt.f44443a))) {
                                        KotlinType type3 = ((TypeProjection) CollectionsKt.W(type2.F0())).getType();
                                        Intrinsics.e(type3, "continuationArgumentType.arguments.single().type");
                                        CallableDescriptor callableDescriptor = declarationDescriptor instanceof CallableDescriptor ? (CallableDescriptor) declarationDescriptor : null;
                                        simpleTypeD2 = Intrinsics.a(callableDescriptor != null ? DescriptorUtilsKt.c(callableDescriptor) : null, SuspendFunctionTypeUtilKt.f44437a) ? a(simpleTypeD2, type3) : a(simpleTypeD2, type3);
                                    }
                                }
                            } else if (size != 1) {
                                simpleTypeD2 = null;
                            } else {
                                size2 = arguments.size() - 1;
                                if (size2 >= 0) {
                                    TypeConstructor typeConstructorH = typeConstructorD.k().u(size2).h();
                                    Intrinsics.e(typeConstructorH, "functionTypeConstructor.…on(arity).typeConstructor");
                                    simpleTypeD2 = KotlinTypeFactory.d(typeAttributesF, typeConstructorH, arguments, z3, null);
                                } else {
                                    simpleTypeD2 = null;
                                }
                            }
                            if (simpleTypeD2 == null) {
                                ErrorUtils errorUtils5 = ErrorUtils.f44590a;
                                simpleTypeD = ErrorUtils.e(ErrorTypeKind.INCONSISTENT_SUSPEND_FUNCTION, arguments, typeConstructorD, new String[0]);
                            } else {
                                simpleTypeD = simpleTypeD2;
                            }
                        } else {
                            type = null;
                            simpleTypeD = KotlinTypeFactory.d(typeAttributesF, typeConstructorD, arguments, proto.f0, null);
                            if (Flags.f44109b.e(proto.r0).booleanValue()) {
                                definitelyNotNullTypeA = DefinitelyNotNullType.Companion.a(simpleTypeD, true);
                                if (definitelyNotNullTypeA == null) {
                                    throw new IllegalStateException(("null DefinitelyNotNullType for '" + simpleTypeD + '\'').toString());
                                }
                                simpleTypeD = definitelyNotNullTypeA;
                            }
                        }
                        i3 = proto.Z;
                        if ((i3 & 1024) == 1024) {
                            typeA = proto.p0;
                        } else if ((i3 & a.f25965n) == 2048) {
                            typeA = typeTable.a(proto.q0);
                        } else {
                            typeA = type;
                        }
                        if (typeA != null) {
                            simpleTypeD = SpecialTypesKt.c(simpleTypeD, d(typeA, false));
                        }
                        if (proto.p()) {
                            return deserializationComponents.r.a(NameResolverUtilKt.a(deserializationContext.f44402b, proto.j0), simpleTypeD);
                        }
                        return simpleTypeD;
                    }
                    TypeAliasDescriptor typeAliasDescriptor = (TypeAliasDescriptor) classifierDescriptorC2;
                    Intrinsics.f(typeAliasDescriptor, "<this>");
                    Intrinsics.f(arguments, "arguments");
                    TypeAliasExpander typeAliasExpander = new TypeAliasExpander();
                    TypeAliasExpansion typeAliasExpansionA = TypeAliasExpansion.Companion.a(null, typeAliasDescriptor, arguments);
                    TypeAttributes.f44529Y.getClass();
                    TypeAttributes attributes = TypeAttributes.Z;
                    Intrinsics.f(attributes, "attributes");
                    SimpleType simpleTypeC = typeAliasExpander.c(typeAliasExpansionA, attributes, false, 0, true);
                    simpleTypeD = simpleTypeC.L0(TypeUtils.e(simpleTypeC) || proto.f0).N0(f(deserializationComponents.s, Annotations.Companion.a(CollectionsKt.M(deserializedAnnotations, simpleTypeC.getAnnotations())), typeConstructorD, declarationDescriptor));
                    type = null;
                    i3 = proto.Z;
                    if ((i3 & 1024) == 1024) {
                        typeA = proto.p0;
                    } else if ((i3 & a.f25965n) == 2048) {
                        typeA = typeTable.a(proto.q0);
                    } else {
                        typeA = type;
                    }
                    if (typeA != null) {
                        simpleTypeD = SpecialTypesKt.c(simpleTypeD, d(typeA, false));
                    }
                    if (proto.p()) {
                        return deserializationComponents.r.a(NameResolverUtilKt.a(deserializationContext.f44402b, proto.j0), simpleTypeD);
                    }
                    return simpleTypeD;
                }
                next2 = it.next();
                i4 = i2 + 1;
                if (i2 >= 0) {
                    CollectionsKt.f0();
                    throw null;
                }
                argument = (ProtoBuf.Type.Argument) next2;
                List parameters = typeConstructorD.getParameters();
                Intrinsics.e(parameters, "constructor.parameters");
                typeParameterDescriptor = (TypeParameterDescriptor) CollectionsKt.B(i2, parameters);
                projection = argument.Z;
                if (projection == ProtoBuf.Type.Argument.Projection.STAR) {
                    Intrinsics.e(projection, "typeArgumentProto.projection");
                    iOrdinal = projection.ordinal();
                    if (iOrdinal != 0) {
                        variance = Variance.IN_VARIANCE;
                    } else if (iOrdinal != i6) {
                        variance = Variance.OUT_VARIANCE;
                    } else {
                        if (iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw new IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: " + projection);
                        }
                        variance = Variance.INVARIANT;
                    }
                    i5 = argument.f44075Y;
                    if ((i5 & 2) == 2) {
                        typeA2 = argument.e0;
                    } else if ((i5 & 4) == 4) {
                        typeA2 = typeTable.a(argument.f0);
                    } else {
                        typeA2 = null;
                    }
                    if (typeA2 == null) {
                        typeProjectionImpl = new TypeProjectionImpl(ErrorUtils.c(ErrorTypeKind.NO_RECORDED_TYPE, argument.toString()));
                    } else {
                        typeProjectionImpl = new TypeProjectionImpl(g(typeA2), variance);
                    }
                } else if (typeParameterDescriptor == null) {
                    typeProjectionImpl = new StarProjectionForAbsentTypeParameter(deserializationComponents.f44392b.k());
                } else {
                    typeProjectionImpl = new StarProjectionImpl(typeParameterDescriptor);
                }
                arrayList.add(typeProjectionImpl);
                i2 = i4;
                i6 = 1;
            }
        }
        typeConstructorD = classifierDescriptorH.h();
        Intrinsics.e(typeConstructorD, "classifier.typeConstructor");
        if (ErrorUtils.f(typeConstructorD.c())) {
            ErrorUtils errorUtils6 = ErrorUtils.f44590a;
            return ErrorUtils.e(ErrorTypeKind.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, EmptyList.X, typeConstructorD, (String[]) Arrays.copyOf(new String[]{typeConstructorD.toString()}, 1));
        }
        DeserializedAnnotations deserializedAnnotations2 = new DeserializedAnnotations(deserializationContext.f44401a.f44391a, new Function0<List<? extends AnnotationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$simpleType$annotations$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DeserializationContext deserializationContext2 = this.f44438a;
                return deserializationContext2.f44401a.f44394e.b(proto, deserializationContext2.f44402b);
            }
        });
        deserializationComponents = deserializationContext.f44401a;
        List list2 = deserializationComponents.s;
        DeclarationDescriptor declarationDescriptor2 = deserializationContext.f44403c;
        typeAttributesF = f(list2, deserializedAnnotations2, typeConstructorD, declarationDescriptor2);
        ArrayList arrayListE2 = e(proto, this);
        arrayList = new ArrayList(CollectionsKt.n(arrayListE2, 10));
        it = arrayListE2.iterator();
        i2 = 0;
        while (true) {
            zHasNext = it.hasNext();
            typeTable = deserializationContext.d;
            if (zHasNext) {
                arguments = CollectionsKt.i0(arrayList);
                ClassifierDescriptor classifierDescriptorC4 = typeConstructorD.c();
                if (z2) {
                    if (Flags.f44108a.e(proto.r0).booleanValue()) {
                        z3 = proto.f0;
                        size = typeConstructorD.getParameters().size() - arguments.size();
                        if (size == 0) {
                            simpleTypeD2 = KotlinTypeFactory.d(typeAttributesF, typeConstructorD, arguments, z3, null);
                            classifierDescriptorC = simpleTypeD2.H0().c();
                            if (classifierDescriptorC != null) {
                                functionClassKindE = FunctionTypesKt.e(classifierDescriptorC);
                            } else {
                                functionClassKindE = null;
                            }
                            if (functionClassKindE == FunctionClassKind.e0) {
                                simpleTypeD2 = null;
                            } else {
                                simpleTypeD2 = null;
                            }
                        } else if (size != 1) {
                            simpleTypeD2 = null;
                        } else {
                            size2 = arguments.size() - 1;
                            if (size2 >= 0) {
                                TypeConstructor typeConstructorH2 = typeConstructorD.k().u(size2).h();
                                Intrinsics.e(typeConstructorH2, "functionTypeConstructor.…on(arity).typeConstructor");
                                simpleTypeD2 = KotlinTypeFactory.d(typeAttributesF, typeConstructorH2, arguments, z3, null);
                            } else {
                                simpleTypeD2 = null;
                            }
                        }
                        if (simpleTypeD2 == null) {
                            ErrorUtils errorUtils7 = ErrorUtils.f44590a;
                            simpleTypeD = ErrorUtils.e(ErrorTypeKind.INCONSISTENT_SUSPEND_FUNCTION, arguments, typeConstructorD, new String[0]);
                        } else {
                            simpleTypeD = simpleTypeD2;
                        }
                        type = null;
                    } else {
                        type = null;
                        simpleTypeD = KotlinTypeFactory.d(typeAttributesF, typeConstructorD, arguments, proto.f0, null);
                        if (Flags.f44109b.e(proto.r0).booleanValue()) {
                            definitelyNotNullTypeA = DefinitelyNotNullType.Companion.a(simpleTypeD, true);
                            if (definitelyNotNullTypeA == null) {
                                throw new IllegalStateException(("null DefinitelyNotNullType for '" + simpleTypeD + '\'').toString());
                            }
                            simpleTypeD = definitelyNotNullTypeA;
                        }
                    }
                } else if (Flags.f44108a.e(proto.r0).booleanValue()) {
                    z3 = proto.f0;
                    size = typeConstructorD.getParameters().size() - arguments.size();
                    if (size == 0) {
                        simpleTypeD2 = KotlinTypeFactory.d(typeAttributesF, typeConstructorD, arguments, z3, null);
                        classifierDescriptorC = simpleTypeD2.H0().c();
                        if (classifierDescriptorC != null) {
                            functionClassKindE = FunctionTypesKt.e(classifierDescriptorC);
                        } else {
                            functionClassKindE = null;
                        }
                        if (functionClassKindE == FunctionClassKind.e0) {
                            simpleTypeD2 = null;
                        } else {
                            simpleTypeD2 = null;
                        }
                    } else if (size != 1) {
                        simpleTypeD2 = null;
                    } else {
                        size2 = arguments.size() - 1;
                        if (size2 >= 0) {
                            TypeConstructor typeConstructorH3 = typeConstructorD.k().u(size2).h();
                            Intrinsics.e(typeConstructorH3, "functionTypeConstructor.…on(arity).typeConstructor");
                            simpleTypeD2 = KotlinTypeFactory.d(typeAttributesF, typeConstructorH3, arguments, z3, null);
                        } else {
                            simpleTypeD2 = null;
                        }
                    }
                    if (simpleTypeD2 == null) {
                        ErrorUtils errorUtils8 = ErrorUtils.f44590a;
                        simpleTypeD = ErrorUtils.e(ErrorTypeKind.INCONSISTENT_SUSPEND_FUNCTION, arguments, typeConstructorD, new String[0]);
                    } else {
                        simpleTypeD = simpleTypeD2;
                    }
                    type = null;
                } else {
                    type = null;
                    simpleTypeD = KotlinTypeFactory.d(typeAttributesF, typeConstructorD, arguments, proto.f0, null);
                    if (Flags.f44109b.e(proto.r0).booleanValue()) {
                        definitelyNotNullTypeA = DefinitelyNotNullType.Companion.a(simpleTypeD, true);
                        if (definitelyNotNullTypeA == null) {
                            throw new IllegalStateException(("null DefinitelyNotNullType for '" + simpleTypeD + '\'').toString());
                        }
                        simpleTypeD = definitelyNotNullTypeA;
                    }
                }
                i3 = proto.Z;
                if ((i3 & 1024) == 1024) {
                    typeA = proto.p0;
                } else if ((i3 & a.f25965n) == 2048) {
                    typeA = typeTable.a(proto.q0);
                } else {
                    typeA = type;
                }
                if (typeA != null) {
                    simpleTypeD = SpecialTypesKt.c(simpleTypeD, d(typeA, false));
                }
                if (proto.p()) {
                    return deserializationComponents.r.a(NameResolverUtilKt.a(deserializationContext.f44402b, proto.j0), simpleTypeD);
                }
                return simpleTypeD;
            }
            next2 = it.next();
            i4 = i2 + 1;
            if (i2 >= 0) {
                CollectionsKt.f0();
                throw null;
            }
            argument = (ProtoBuf.Type.Argument) next2;
            List parameters2 = typeConstructorD.getParameters();
            Intrinsics.e(parameters2, "constructor.parameters");
            typeParameterDescriptor = (TypeParameterDescriptor) CollectionsKt.B(i2, parameters2);
            projection = argument.Z;
            if (projection == ProtoBuf.Type.Argument.Projection.STAR) {
                Intrinsics.e(projection, "typeArgumentProto.projection");
                iOrdinal = projection.ordinal();
                if (iOrdinal != 0) {
                    variance = Variance.IN_VARIANCE;
                } else if (iOrdinal != i6) {
                    variance = Variance.OUT_VARIANCE;
                } else {
                    if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: " + projection);
                    }
                    variance = Variance.INVARIANT;
                }
                i5 = argument.f44075Y;
                if ((i5 & 2) == 2) {
                    typeA2 = argument.e0;
                } else if ((i5 & 4) == 4) {
                    typeA2 = typeTable.a(argument.f0);
                } else {
                    typeA2 = null;
                }
                if (typeA2 == null) {
                    typeProjectionImpl = new TypeProjectionImpl(ErrorUtils.c(ErrorTypeKind.NO_RECORDED_TYPE, argument.toString()));
                } else {
                    typeProjectionImpl = new TypeProjectionImpl(g(typeA2), variance);
                }
            } else if (typeParameterDescriptor == null) {
                typeProjectionImpl = new StarProjectionForAbsentTypeParameter(deserializationComponents.f44392b.k());
            } else {
                typeProjectionImpl = new StarProjectionImpl(typeParameterDescriptor);
            }
            arrayList.add(typeProjectionImpl);
            i2 = i4;
            i6 = 1;
        }
    }

    public final KotlinType g(ProtoBuf.Type proto) {
        ProtoBuf.Type typeA;
        Intrinsics.f(proto, "proto");
        if (!((proto.Z & 2) == 2)) {
            return d(proto, true);
        }
        DeserializationContext deserializationContext = this.f44438a;
        String string = deserializationContext.f44402b.getString(proto.g0);
        SimpleType simpleTypeD = d(proto, true);
        TypeTable typeTable = deserializationContext.d;
        int i2 = proto.Z;
        if ((i2 & 4) == 4) {
            typeA = proto.h0;
        } else {
            typeA = (i2 & 8) == 8 ? typeTable.a(proto.i0) : null;
        }
        Intrinsics.c(typeA);
        return deserializationContext.f44401a.j.a(proto, string, simpleTypeD, d(typeA, true));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f44440c);
        TypeDeserializer typeDeserializer = this.f44439b;
        if (typeDeserializer == null) {
            str = "";
        } else {
            str = ". Child of " + typeDeserializer.f44440c;
        }
        sb.append(str);
        return sb.toString();
    }
}
