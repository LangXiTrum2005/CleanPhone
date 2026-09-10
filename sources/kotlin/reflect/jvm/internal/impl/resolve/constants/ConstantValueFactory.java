package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes7.dex */
public final class ConstantValueFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConstantValueFactory f44303a = new ConstantValueFactory();

    public final ArrayValue a(List list, ModuleDescriptorImpl moduleDescriptorImpl, final PrimitiveType primitiveType) {
        List listI0 = CollectionsKt.i0(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listI0.iterator();
        while (it.hasNext()) {
            ConstantValue constantValueB = b(it.next(), null);
            if (constantValueB != null) {
                arrayList.add(constantValueB);
            }
        }
        return moduleDescriptorImpl != null ? new TypedArrayValue(arrayList, moduleDescriptorImpl.e0.p(primitiveType)) : new ArrayValue(arrayList, new Function1<ModuleDescriptor, KotlinType>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory$createArrayValue$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ModuleDescriptor it2 = (ModuleDescriptor) obj;
                Intrinsics.f(it2, "it");
                return it2.k().p(primitiveType);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory] */
    public final ConstantValue b(Object obj, ModuleDescriptorImpl moduleDescriptorImpl) {
        if (obj instanceof Byte) {
            return new ByteValue(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new ShortValue(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new IntValue(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new LongValue(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            Character ch = (Character) obj;
            ch.getClass();
            return new CharValue(ch);
        }
        if (obj instanceof Float) {
            return new FloatValue(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new DoubleValue(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            Boolean bool = (Boolean) obj;
            bool.getClass();
            return new BooleanValue(bool);
        }
        if (obj instanceof String) {
            String value = (String) obj;
            Intrinsics.f(value, "value");
            return new StringValue(value);
        }
        boolean z2 = obj instanceof byte[];
        ?? H = EmptyList.X;
        int i2 = 0;
        if (z2) {
            byte[] bArr = (byte[]) obj;
            Intrinsics.f(bArr, "<this>");
            int length = bArr.length;
            if (length != 0) {
                if (length != 1) {
                    H = new ArrayList(bArr.length);
                    int length2 = bArr.length;
                    while (i2 < length2) {
                        H.add(Byte.valueOf(bArr[i2]));
                        i2++;
                    }
                } else {
                    H = CollectionsKt.H(Byte.valueOf(bArr[0]));
                }
            }
            return a(H, moduleDescriptorImpl, PrimitiveType.BYTE);
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            Intrinsics.f(sArr, "<this>");
            int length3 = sArr.length;
            if (length3 != 0) {
                if (length3 != 1) {
                    H = new ArrayList(sArr.length);
                    int length4 = sArr.length;
                    while (i2 < length4) {
                        H.add(Short.valueOf(sArr[i2]));
                        i2++;
                    }
                } else {
                    H = CollectionsKt.H(Short.valueOf(sArr[0]));
                }
            }
            return a(H, moduleDescriptorImpl, PrimitiveType.SHORT);
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            Intrinsics.f(iArr, "<this>");
            int length5 = iArr.length;
            if (length5 != 0) {
                if (length5 != 1) {
                    H = new ArrayList(iArr.length);
                    int length6 = iArr.length;
                    while (i2 < length6) {
                        H.add(Integer.valueOf(iArr[i2]));
                        i2++;
                    }
                } else {
                    H = CollectionsKt.H(Integer.valueOf(iArr[0]));
                }
            }
            return a(H, moduleDescriptorImpl, PrimitiveType.INT);
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            Intrinsics.f(jArr, "<this>");
            int length7 = jArr.length;
            if (length7 != 0) {
                if (length7 != 1) {
                    H = new ArrayList(jArr.length);
                    int length8 = jArr.length;
                    while (i2 < length8) {
                        H.add(Long.valueOf(jArr[i2]));
                        i2++;
                    }
                } else {
                    H = CollectionsKt.H(Long.valueOf(jArr[0]));
                }
            }
            return a(H, moduleDescriptorImpl, PrimitiveType.LONG);
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            Intrinsics.f(cArr, "<this>");
            int length9 = cArr.length;
            if (length9 != 0) {
                if (length9 != 1) {
                    H = new ArrayList(cArr.length);
                    int length10 = cArr.length;
                    while (i2 < length10) {
                        H.add(Character.valueOf(cArr[i2]));
                        i2++;
                    }
                } else {
                    H = CollectionsKt.H(Character.valueOf(cArr[0]));
                }
            }
            return a(H, moduleDescriptorImpl, PrimitiveType.CHAR);
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            Intrinsics.f(fArr, "<this>");
            int length11 = fArr.length;
            if (length11 != 0) {
                if (length11 != 1) {
                    H = new ArrayList(fArr.length);
                    int length12 = fArr.length;
                    while (i2 < length12) {
                        H.add(Float.valueOf(fArr[i2]));
                        i2++;
                    }
                } else {
                    H = CollectionsKt.H(Float.valueOf(fArr[0]));
                }
            }
            return a(H, moduleDescriptorImpl, PrimitiveType.FLOAT);
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            Intrinsics.f(dArr, "<this>");
            int length13 = dArr.length;
            if (length13 != 0) {
                if (length13 != 1) {
                    H = new ArrayList(dArr.length);
                    int length14 = dArr.length;
                    while (i2 < length14) {
                        H.add(Double.valueOf(dArr[i2]));
                        i2++;
                    }
                } else {
                    H = CollectionsKt.H(Double.valueOf(dArr[0]));
                }
            }
            return a(H, moduleDescriptorImpl, PrimitiveType.DOUBLE);
        }
        if (!(obj instanceof boolean[])) {
            if (obj == null) {
                return new NullValue(null);
            }
            return null;
        }
        boolean[] zArr = (boolean[]) obj;
        Intrinsics.f(zArr, "<this>");
        int length15 = zArr.length;
        if (length15 != 0) {
            if (length15 != 1) {
                H = new ArrayList(zArr.length);
                int length16 = zArr.length;
                while (i2 < length16) {
                    H.add(Boolean.valueOf(zArr[i2]));
                    i2++;
                }
            } else {
                H = CollectionsKt.H(Boolean.valueOf(zArr[0]));
            }
        }
        return a(H, moduleDescriptorImpl, PrimitiveType.BOOLEAN);
    }
}
