package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.BooleanValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ByteValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.CharValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.DoubleValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.FloatValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.LongValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ShortValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.TypedArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UByteValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UIntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ULongValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UShortValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* JADX INFO: loaded from: classes7.dex */
public final class AnnotationDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ModuleDescriptor f44379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NotFoundClasses f44380b;

    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44381a;

        static {
            int[] iArr = new int[ProtoBuf.Annotation.Argument.Value.Type.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[10] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[11] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[12] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f44381a = iArr;
        }
    }

    public AnnotationDeserializer(ModuleDescriptor module, NotFoundClasses notFoundClasses) {
        Intrinsics.f(module, "module");
        Intrinsics.f(notFoundClasses, "notFoundClasses");
        this.f44379a = module;
        this.f44380b = notFoundClasses;
    }

    public final AnnotationDescriptorImpl a(ProtoBuf.Annotation proto, NameResolver nameResolver) {
        Intrinsics.f(proto, "proto");
        Intrinsics.f(nameResolver, "nameResolver");
        ClassDescriptor classDescriptorC = FindClassInModuleKt.c(this.f44379a, NameResolverUtilKt.a(nameResolver, proto.Z), this.f44380b);
        Map mapP = EmptyMap.X;
        if (proto.e0.size() != 0 && !ErrorUtils.f(classDescriptorC) && DescriptorUtils.n(classDescriptorC, ClassKind.f0)) {
            Collection collectionI = classDescriptorC.i();
            Intrinsics.e(collectionI, "annotationClass.constructors");
            ClassConstructorDescriptor classConstructorDescriptor = (ClassConstructorDescriptor) CollectionsKt.X(collectionI);
            if (classConstructorDescriptor != null) {
                List listE = classConstructorDescriptor.e();
                Intrinsics.e(listE, "constructor.valueParameters");
                List list = listE;
                int iH = MapsKt.h(CollectionsKt.n(list, 10));
                if (iH < 16) {
                    iH = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
                for (Object obj : list) {
                    linkedHashMap.put(((ValueParameterDescriptor) obj).getName(), obj);
                }
                List<ProtoBuf.Annotation.Argument> list2 = proto.e0;
                Intrinsics.e(list2, "proto.argumentList");
                ArrayList arrayList = new ArrayList();
                for (ProtoBuf.Annotation.Argument it : list2) {
                    Intrinsics.e(it, "it");
                    ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) linkedHashMap.get(NameResolverUtilKt.b(nameResolver, it.Z));
                    Object pair = null;
                    if (valueParameterDescriptor != null) {
                        Name nameB = NameResolverUtilKt.b(nameResolver, it.Z);
                        KotlinType type = valueParameterDescriptor.getType();
                        Intrinsics.e(type, "parameter.type");
                        ProtoBuf.Annotation.Argument.Value value = it.e0;
                        Intrinsics.e(value, "proto.value");
                        ConstantValue constantValueC = c(type, value, nameResolver);
                        pair = b(constantValueC, type, value) ? constantValueC : null;
                        if (pair == null) {
                            String message = "Unexpected argument value: actual type " + value.Z + " != expected type " + type;
                            Intrinsics.f(message, "message");
                            pair = new ErrorValue.ErrorValueWithMessage(message);
                        }
                        pair = new Pair(nameB, pair);
                    }
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                mapP = MapsKt.p(arrayList);
            }
        }
        return new AnnotationDescriptorImpl(classDescriptorC.o(), mapP, SourceElement.f43591a);
    }

    public final boolean b(ConstantValue constantValue, KotlinType kotlinType, ProtoBuf.Annotation.Argument.Value value) {
        ProtoBuf.Annotation.Argument.Value.Type type = value.Z;
        int i2 = type == null ? -1 : WhenMappings.f44381a[type.ordinal()];
        if (i2 == 10) {
            ClassifierDescriptor classifierDescriptorC = kotlinType.H0().c();
            ClassDescriptor classDescriptor = classifierDescriptorC instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorC : null;
            if (classDescriptor == null) {
                return true;
            }
            Name name = KotlinBuiltIns.f;
            return KotlinBuiltIns.b(classDescriptor, StandardNames.FqNames.f43488P);
        }
        ModuleDescriptor moduleDescriptor = this.f44379a;
        if (i2 != 13) {
            return Intrinsics.a(constantValue.a(moduleDescriptor), kotlinType);
        }
        if (constantValue instanceof ArrayValue) {
            ArrayValue arrayValue = (ArrayValue) constantValue;
            if (((List) arrayValue.f44302a).size() == value.l0.size()) {
                KotlinType kotlinTypeF = moduleDescriptor.k().f(kotlinType);
                Iterable iterableZ = CollectionsKt.z((Collection) arrayValue.f44302a);
                if ((iterableZ instanceof Collection) && ((Collection) iterableZ).isEmpty()) {
                    return true;
                }
                Iterator<Integer> it = iterableZ.iterator();
                while (((IntProgressionIterator) it).Z) {
                    int iA = ((IntIterator) it).a();
                    ConstantValue constantValue2 = (ConstantValue) ((List) arrayValue.f44302a).get(iA);
                    ProtoBuf.Annotation.Argument.Value value2 = (ProtoBuf.Annotation.Argument.Value) value.l0.get(iA);
                    Intrinsics.e(value2, "value.getArrayElement(i)");
                    if (!b(constantValue2, kotlinTypeF, value2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + constantValue).toString());
    }

    public final ConstantValue c(KotlinType kotlinType, ProtoBuf.Annotation.Argument.Value value, NameResolver nameResolver) {
        Intrinsics.f(value, "value");
        Intrinsics.f(nameResolver, "nameResolver");
        boolean zBooleanValue = Flags.M.e(value.n0).booleanValue();
        ProtoBuf.Annotation.Argument.Value.Type type = value.Z;
        switch (type == null ? -1 : WhenMappings.f44381a[type.ordinal()]) {
            case 1:
                byte b2 = (byte) value.e0;
                return zBooleanValue ? new UByteValue(b2) : new ByteValue(b2);
            case 2:
                return new CharValue(Character.valueOf((char) value.e0));
            case 3:
                short s = (short) value.e0;
                return zBooleanValue ? new UShortValue(s) : new ShortValue(s);
            case 4:
                int i2 = (int) value.e0;
                return zBooleanValue ? new UIntValue(i2) : new IntValue(i2);
            case 5:
                long j = value.e0;
                return zBooleanValue ? new ULongValue(j) : new LongValue(j);
            case 6:
                return new FloatValue(value.f0);
            case 7:
                return new DoubleValue(value.g0);
            case 8:
                return new BooleanValue(Boolean.valueOf(value.e0 != 0));
            case 9:
                return new StringValue(nameResolver.getString(value.h0));
            case 10:
                return new KClassValue(NameResolverUtilKt.a(nameResolver, value.i0), value.m0);
            case 11:
                return new EnumValue(NameResolverUtilKt.a(nameResolver, value.i0), NameResolverUtilKt.b(nameResolver, value.j0));
            case 12:
                ProtoBuf.Annotation annotation = value.k0;
                Intrinsics.e(annotation, "value.annotation");
                return new AnnotationValue((Object) a(annotation, nameResolver));
            case 13:
                List list = value.l0;
                Intrinsics.e(list, "value.arrayElementList");
                List<ProtoBuf.Annotation.Argument.Value> list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.n(list2, 10));
                for (ProtoBuf.Annotation.Argument.Value it : list2) {
                    SimpleType simpleTypeE = this.f44379a.k().e();
                    Intrinsics.e(simpleTypeE, "builtIns.anyType");
                    Intrinsics.e(it, "it");
                    arrayList.add(c(simpleTypeE, it, nameResolver));
                }
                return new TypedArrayValue(arrayList, kotlinType);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + value.Z + " (expected " + kotlinType + ')').toString());
        }
    }
}
