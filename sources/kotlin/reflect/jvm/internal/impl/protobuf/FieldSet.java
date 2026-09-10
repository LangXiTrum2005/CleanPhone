package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite;

/* JADX INFO: loaded from: classes7.dex */
final class FieldSet<FieldDescriptorType extends FieldDescriptorLite<FieldDescriptorType>> {
    public static final FieldSet d = new FieldSet(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SmallSortedMap.AnonymousClass1 f44202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f44203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f44204c;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.FieldSet$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f44206b;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f44206b = iArr;
            try {
                iArr[WireFormat.FieldType.Z.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44206b[WireFormat.FieldType.e0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44206b[WireFormat.FieldType.f0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44206b[WireFormat.FieldType.g0.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44206b[WireFormat.FieldType.h0.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44206b[WireFormat.FieldType.i0.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f44206b[WireFormat.FieldType.j0.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f44206b[WireFormat.FieldType.k0.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f44206b[WireFormat.FieldType.l0.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f44206b[WireFormat.FieldType.o0.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f44206b[WireFormat.FieldType.p0.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f44206b[WireFormat.FieldType.r0.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f44206b[WireFormat.FieldType.s0.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f44206b[WireFormat.FieldType.t0.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f44206b[WireFormat.FieldType.u0.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f44206b[WireFormat.FieldType.m0.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f44206b[WireFormat.FieldType.n0.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f44206b[WireFormat.FieldType.q0.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            f44205a = iArr2;
            try {
                WireFormat.JavaType javaType = WireFormat.JavaType.INT;
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                int[] iArr3 = f44205a;
                WireFormat.JavaType javaType2 = WireFormat.JavaType.INT;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                int[] iArr4 = f44205a;
                WireFormat.JavaType javaType3 = WireFormat.JavaType.INT;
                iArr4[2] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                int[] iArr5 = f44205a;
                WireFormat.JavaType javaType4 = WireFormat.JavaType.INT;
                iArr5[3] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                int[] iArr6 = f44205a;
                WireFormat.JavaType javaType5 = WireFormat.JavaType.INT;
                iArr6[4] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                int[] iArr7 = f44205a;
                WireFormat.JavaType javaType6 = WireFormat.JavaType.INT;
                iArr7[5] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                int[] iArr8 = f44205a;
                WireFormat.JavaType javaType7 = WireFormat.JavaType.INT;
                iArr8[6] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                int[] iArr9 = f44205a;
                WireFormat.JavaType javaType8 = WireFormat.JavaType.INT;
                iArr9[7] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                int[] iArr10 = f44205a;
                WireFormat.JavaType javaType9 = WireFormat.JavaType.INT;
                iArr10[8] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public interface FieldDescriptorLite<T extends FieldDescriptorLite<T>> extends Comparable<T> {
        GeneratedMessageLite.Builder e(MessageLite.Builder builder, MessageLite messageLite);

        WireFormat.JavaType getLiteJavaType();

        WireFormat.FieldType getLiteType();

        int getNumber();

        boolean isPacked();

        boolean isRepeated();
    }

    public FieldSet() {
        this.f44204c = false;
        this.f44202a = new SmallSortedMap.AnonymousClass1(16);
    }

    public static int c(WireFormat.FieldType fieldType, Object obj) {
        int serializedSize;
        int iF;
        switch (fieldType.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                return 8;
            case 1:
                ((Float) obj).getClass();
                return 4;
            case 2:
                return CodedOutputStream.g(((Long) obj).longValue());
            case 3:
                return CodedOutputStream.g(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.c(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                return 8;
            case 6:
                ((Integer) obj).getClass();
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                return 1;
            case 8:
                try {
                    byte[] bytes = ((String) obj).getBytes("UTF-8");
                    return CodedOutputStream.f(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e2) {
                    throw new RuntimeException("UTF-8 not supported.", e2);
                }
            case 9:
                return ((MessageLite) obj).getSerializedSize();
            case 10:
                if (!(obj instanceof LazyField)) {
                    return CodedOutputStream.e((MessageLite) obj);
                }
                LazyField lazyField = (LazyField) obj;
                lazyField.getClass();
                serializedSize = lazyField.f44217a.getSerializedSize();
                iF = CodedOutputStream.f(serializedSize);
                break;
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    byte[] bArr = (byte[]) obj;
                    return CodedOutputStream.f(bArr.length) + bArr.length;
                }
                ByteString byteString = (ByteString) obj;
                serializedSize = CodedOutputStream.f(byteString.size());
                iF = byteString.size();
                break;
                break;
            case 12:
                return CodedOutputStream.f(((Integer) obj).intValue());
            case 13:
                return obj instanceof Internal.EnumLite ? CodedOutputStream.c(((Internal.EnumLite) obj).getNumber()) : CodedOutputStream.c(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                return 4;
            case 15:
                ((Long) obj).getClass();
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return CodedOutputStream.f((iIntValue >> 31) ^ (iIntValue << 1));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return CodedOutputStream.g((jLongValue >> 63) ^ (jLongValue << 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iF + serializedSize;
    }

    public static int d(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        WireFormat.FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (!fieldDescriptorLite.isRepeated()) {
            int iH = CodedOutputStream.h(number);
            if (liteType == WireFormat.FieldType.m0) {
                iH *= 2;
            }
            return iH + c(liteType, obj);
        }
        int iC = 0;
        if (fieldDescriptorLite.isPacked()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iC += c(liteType, it.next());
            }
            return CodedOutputStream.f(iC) + CodedOutputStream.h(number) + iC;
        }
        for (Object obj2 : (List) obj) {
            int iH2 = CodedOutputStream.h(number);
            if (liteType == WireFormat.FieldType.m0) {
                iH2 *= 2;
            }
            iC += iH2 + c(liteType, obj2);
        }
        return iC;
    }

    public static boolean f(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        if (fieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        if (fieldDescriptorLite.isRepeated()) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                if (!((MessageLite) it.next()).isInitialized()) {
                    return false;
                }
            }
            return true;
        }
        Object value = entry.getValue();
        if (value instanceof MessageLite) {
            return ((MessageLite) value).isInitialized();
        }
        if (value instanceof LazyField) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public static Object h(CodedInputStream codedInputStream, WireFormat.FieldType fieldType) {
        switch (fieldType.ordinal()) {
            case 0:
                return Double.valueOf(Double.longBitsToDouble(codedInputStream.j()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(codedInputStream.i()));
            case 2:
                return Long.valueOf(codedInputStream.l());
            case 3:
                return Long.valueOf(codedInputStream.l());
            case 4:
                return Integer.valueOf(codedInputStream.k());
            case 5:
                return Long.valueOf(codedInputStream.j());
            case 6:
                return Integer.valueOf(codedInputStream.i());
            case 7:
                return Boolean.valueOf(codedInputStream.l() != 0);
            case 8:
                int iK = codedInputStream.k();
                int i2 = codedInputStream.f44190b;
                int i3 = codedInputStream.d;
                if (iK > i2 - i3 || iK <= 0) {
                    return iK == 0 ? "" : new String(codedInputStream.h(iK), "UTF-8");
                }
                String str = new String(codedInputStream.f44189a, i3, iK, "UTF-8");
                codedInputStream.d += iK;
                return str;
            case 9:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return codedInputStream.e();
            case 12:
                return Integer.valueOf(codedInputStream.k());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return Integer.valueOf(codedInputStream.i());
            case 15:
                return Long.valueOf(codedInputStream.j());
            case 16:
                int iK2 = codedInputStream.k();
                return Integer.valueOf((-(iK2 & 1)) ^ (iK2 >>> 1));
            case 17:
                long jL = codedInputStream.l();
                return Long.valueOf((-(jL & 1)) ^ (jL >>> 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018  */
    public static void j(WireFormat.FieldType fieldType, Object obj) {
        obj.getClass();
        boolean z2 = true;
        boolean z3 = false;
        switch (fieldType.X) {
            case INT:
                z3 = obj instanceof Integer;
                break;
            case LONG:
                z3 = obj instanceof Long;
                break;
            case FLOAT:
                z3 = obj instanceof Float;
                break;
            case DOUBLE:
                z3 = obj instanceof Double;
                break;
            case BOOLEAN:
                z3 = obj instanceof Boolean;
                break;
            case STRING:
                z3 = obj instanceof String;
                break;
            case BYTE_STRING:
                if (!(obj instanceof ByteString) && !(obj instanceof byte[])) {
                    z2 = false;
                }
                z3 = z2;
                break;
            case ENUM:
                if (!(obj instanceof Integer) && !(obj instanceof Internal.EnumLite)) {
                    z2 = false;
                }
                z3 = z2;
                break;
            case MESSAGE:
                if (!(obj instanceof MessageLite) && !(obj instanceof LazyField)) {
                    z2 = false;
                }
                z3 = z2;
                break;
        }
        if (!z3) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public static void k(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i2, Object obj) throws IOException {
        if (fieldType == WireFormat.FieldType.m0) {
            codedOutputStream.x(i2, 3);
            ((MessageLite) obj).b(codedOutputStream);
            codedOutputStream.x(i2, 4);
        }
        codedOutputStream.x(i2, fieldType.f44231Y);
        switch (fieldType.ordinal()) {
            case 0:
                double dDoubleValue = ((Double) obj).doubleValue();
                codedOutputStream.getClass();
                codedOutputStream.u(Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 1:
                float fFloatValue = ((Float) obj).floatValue();
                codedOutputStream.getClass();
                codedOutputStream.t(Float.floatToRawIntBits(fFloatValue));
                break;
            case 2:
                codedOutputStream.w(((Long) obj).longValue());
                break;
            case 3:
                codedOutputStream.w(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.n(((Integer) obj).intValue());
                break;
            case 5:
                codedOutputStream.u(((Long) obj).longValue());
                break;
            case 6:
                codedOutputStream.t(((Integer) obj).intValue());
                break;
            case 7:
                codedOutputStream.q(((Boolean) obj).booleanValue() ? 1 : 0);
                break;
            case 8:
                codedOutputStream.getClass();
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                codedOutputStream.v(bytes.length);
                codedOutputStream.s(bytes);
                break;
            case 9:
                codedOutputStream.getClass();
                ((MessageLite) obj).b(codedOutputStream);
                break;
            case 10:
                codedOutputStream.p((MessageLite) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    byte[] bArr = (byte[]) obj;
                    codedOutputStream.getClass();
                    codedOutputStream.v(bArr.length);
                    codedOutputStream.s(bArr);
                } else {
                    ByteString byteString = (ByteString) obj;
                    codedOutputStream.getClass();
                    codedOutputStream.v(byteString.size());
                    codedOutputStream.r(byteString);
                }
                break;
            case 12:
                codedOutputStream.v(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof Internal.EnumLite)) {
                    codedOutputStream.n(((Integer) obj).intValue());
                } else {
                    codedOutputStream.n(((Internal.EnumLite) obj).getNumber());
                }
                break;
            case 14:
                codedOutputStream.t(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.u(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                codedOutputStream.v((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                codedOutputStream.w((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        List arrayList;
        if (!((GeneratedMessageLite.ExtensionDescriptor) fieldDescriptorLite).Z) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        j(((GeneratedMessageLite.ExtensionDescriptor) fieldDescriptorLite).f44211Y, obj);
        Object objE = e(fieldDescriptorLite);
        if (objE == null) {
            arrayList = new ArrayList();
            this.f44202a.put(fieldDescriptorLite, arrayList);
        } else {
            arrayList = (List) objE;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final FieldSet clone() {
        SmallSortedMap.AnonymousClass1 anonymousClass1;
        FieldSet fieldSet = new FieldSet();
        int i2 = 0;
        while (true) {
            anonymousClass1 = this.f44202a;
            if (i2 >= anonymousClass1.f44226Y.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) anonymousClass1.f44226Y.get(i2);
            fieldSet.i((FieldDescriptorLite) entry.getKey(), entry.getValue());
            i2++;
        }
        for (Map.Entry entry2 : anonymousClass1.c()) {
            fieldSet.i((FieldDescriptorLite) entry2.getKey(), entry2.getValue());
        }
        fieldSet.f44204c = this.f44204c;
        return fieldSet;
    }

    public final Object e(FieldDescriptorLite fieldDescriptorLite) {
        Object obj = this.f44202a.get(fieldDescriptorLite);
        return obj instanceof LazyField ? ((LazyField) obj).a() : obj;
    }

    public final void g(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            value = ((LazyField) value).a();
        }
        boolean zIsRepeated = fieldDescriptorLite.isRepeated();
        SmallSortedMap.AnonymousClass1 anonymousClass1 = this.f44202a;
        if (zIsRepeated) {
            Object objE = e(fieldDescriptorLite);
            if (objE == null) {
                objE = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) objE;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            anonymousClass1.put(fieldDescriptorLite, objE);
            return;
        }
        if (fieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            anonymousClass1.put(fieldDescriptorLite, value);
            return;
        }
        Object objE2 = e(fieldDescriptorLite);
        if (objE2 != null) {
            anonymousClass1.put(fieldDescriptorLite, fieldDescriptorLite.e(((MessageLite) objE2).toBuilder(), (MessageLite) value).build());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        anonymousClass1.put(fieldDescriptorLite, value);
    }

    public final void i(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        if (!fieldDescriptorLite.isRepeated()) {
            j(fieldDescriptorLite.getLiteType(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j(fieldDescriptorLite.getLiteType(), it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof LazyField) {
            this.f44204c = true;
        }
        this.f44202a.put(fieldDescriptorLite, obj);
    }

    public FieldSet(int i2) {
        this.f44204c = false;
        SmallSortedMap.AnonymousClass1 anonymousClass1 = new SmallSortedMap.AnonymousClass1(0);
        this.f44202a = anonymousClass1;
        if (this.f44203b) {
            return;
        }
        anonymousClass1.e();
        this.f44203b = true;
    }
}
