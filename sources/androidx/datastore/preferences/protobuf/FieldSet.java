package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
final class FieldSet<T extends FieldDescriptorLite<T>> {
    public static final FieldSet d = new FieldSet(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SmallSortedMap.AnonymousClass1 f4837a = SmallSortedMap.g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4839c;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.FieldSet$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4840a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f4841b;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f4841b = iArr;
            try {
                iArr[WireFormat.FieldType.Z.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4841b[WireFormat.FieldType.e0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4841b[WireFormat.FieldType.f0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4841b[WireFormat.FieldType.g0.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4841b[WireFormat.FieldType.h0.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4841b[WireFormat.FieldType.i0.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4841b[WireFormat.FieldType.j0.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4841b[WireFormat.FieldType.k0.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4841b[WireFormat.FieldType.m0.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4841b[WireFormat.FieldType.n0.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4841b[WireFormat.FieldType.l0.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4841b[WireFormat.FieldType.o0.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f4841b[WireFormat.FieldType.p0.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f4841b[WireFormat.FieldType.r0.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f4841b[WireFormat.FieldType.s0.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f4841b[WireFormat.FieldType.t0.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f4841b[WireFormat.FieldType.u0.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f4841b[WireFormat.FieldType.q0.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            f4840a = iArr2;
            try {
                WireFormat.JavaType javaType = WireFormat.JavaType.INT;
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                int[] iArr3 = f4840a;
                WireFormat.JavaType javaType2 = WireFormat.JavaType.INT;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                int[] iArr4 = f4840a;
                WireFormat.JavaType javaType3 = WireFormat.JavaType.INT;
                iArr4[2] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                int[] iArr5 = f4840a;
                WireFormat.JavaType javaType4 = WireFormat.JavaType.INT;
                iArr5[3] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                int[] iArr6 = f4840a;
                WireFormat.JavaType javaType5 = WireFormat.JavaType.INT;
                iArr6[4] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                int[] iArr7 = f4840a;
                WireFormat.JavaType javaType6 = WireFormat.JavaType.INT;
                iArr7[5] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f4840a[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f4840a[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f4840a[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public static final class Builder<T extends FieldDescriptorLite<T>> {
    }

    public interface FieldDescriptorLite<T extends FieldDescriptorLite<T>> extends Comparable<T> {
        GeneratedMessageLite.Builder c(MessageLite.Builder builder, MessageLite messageLite);

        WireFormat.JavaType getLiteJavaType();

        WireFormat.FieldType getLiteType();

        int getNumber();

        boolean isPacked();

        boolean isRepeated();
    }

    public FieldSet() {
    }

    public static int b(WireFormat.FieldType fieldType, int i2, Object obj) {
        int iO = CodedOutputStream.o(i2);
        if (fieldType == WireFormat.FieldType.m0) {
            iO *= 2;
        }
        return iO + c(fieldType, obj);
    }

    public static int c(WireFormat.FieldType fieldType, Object obj) {
        int serializedSize;
        int iP;
        switch (fieldType.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                Logger logger = CodedOutputStream.f4775b;
                return 8;
            case 1:
                ((Float) obj).getClass();
                Logger logger2 = CodedOutputStream.f4775b;
                return 4;
            case 2:
                return CodedOutputStream.q(((Long) obj).longValue());
            case 3:
                return CodedOutputStream.q(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.q(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                Logger logger3 = CodedOutputStream.f4775b;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                Logger logger4 = CodedOutputStream.f4775b;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                Logger logger5 = CodedOutputStream.f4775b;
                return 1;
            case 8:
                return obj instanceof ByteString ? CodedOutputStream.j((ByteString) obj) : CodedOutputStream.n((String) obj);
            case 9:
                Logger logger6 = CodedOutputStream.f4775b;
                return ((MessageLite) obj).getSerializedSize();
            case 10:
                if (obj instanceof LazyField) {
                    return CodedOutputStream.k((LazyField) obj);
                }
                Logger logger7 = CodedOutputStream.f4775b;
                serializedSize = ((MessageLite) obj).getSerializedSize();
                iP = CodedOutputStream.p(serializedSize);
                break;
            case 11:
                if (obj instanceof ByteString) {
                    return CodedOutputStream.j((ByteString) obj);
                }
                Logger logger8 = CodedOutputStream.f4775b;
                serializedSize = ((byte[]) obj).length;
                iP = CodedOutputStream.p(serializedSize);
                break;
            case 12:
                return CodedOutputStream.p(((Integer) obj).intValue());
            case 13:
                return obj instanceof Internal.EnumLite ? CodedOutputStream.q(((Internal.EnumLite) obj).getNumber()) : CodedOutputStream.q(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                Logger logger9 = CodedOutputStream.f4775b;
                return 4;
            case 15:
                ((Long) obj).getClass();
                Logger logger10 = CodedOutputStream.f4775b;
                return 8;
            case 16:
                return CodedOutputStream.l(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.m(((Long) obj).longValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iP + serializedSize;
    }

    public static int d(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        WireFormat.FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (!fieldDescriptorLite.isRepeated()) {
            return b(liteType, number, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i2 = 0;
        if (!fieldDescriptorLite.isPacked()) {
            int iB = 0;
            while (i2 < size) {
                iB += b(liteType, number, list.get(i2));
                i2++;
            }
            return iB;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iC = 0;
        while (i2 < size) {
            iC += c(liteType, list.get(i2));
            i2++;
        }
        return CodedOutputStream.p(iC) + CodedOutputStream.o(number) + iC;
    }

    public static int f(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (fieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE || fieldDescriptorLite.isRepeated() || fieldDescriptorLite.isPacked()) {
            return d(fieldDescriptorLite, value);
        }
        if (value instanceof LazyField) {
            int number = ((FieldDescriptorLite) entry.getKey()).getNumber();
            return CodedOutputStream.k((LazyField) value) + CodedOutputStream.o(3) + CodedOutputStream.p(number) + CodedOutputStream.o(2) + (CodedOutputStream.o(1) * 2);
        }
        int number2 = ((FieldDescriptorLite) entry.getKey()).getNumber();
        int iP = CodedOutputStream.p(number2) + CodedOutputStream.o(2) + (CodedOutputStream.o(1) * 2);
        int iO = CodedOutputStream.o(3);
        int serializedSize = ((MessageLite) value).getSerializedSize();
        return CodedOutputStream.p(serializedSize) + serializedSize + iO + iP;
    }

    public static boolean h(Map.Entry entry) {
        boolean zIsInitialized;
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        if (fieldDescriptorLite.getLiteJavaType() == WireFormat.JavaType.MESSAGE) {
            if (!fieldDescriptorLite.isRepeated()) {
                Object value = entry.getValue();
                if (value instanceof MessageLiteOrBuilder) {
                    return ((MessageLiteOrBuilder) value).isInitialized();
                }
                if (value instanceof LazyField) {
                    return true;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) entry.getValue();
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = list.get(i2);
                if (obj instanceof MessageLiteOrBuilder) {
                    zIsInitialized = ((MessageLiteOrBuilder) obj).isInitialized();
                } else {
                    if (!(obj instanceof LazyField)) {
                        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                    }
                    zIsInitialized = true;
                }
                if (!zIsInitialized) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void m(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        fieldDescriptorLite.getLiteType();
        Charset charset = Internal.f4857a;
        obj.getClass();
        boolean z2 = true;
        switch (r0.X) {
            case INT:
                z2 = obj instanceof Integer;
                break;
            case LONG:
                z2 = obj instanceof Long;
                break;
            case FLOAT:
                z2 = obj instanceof Float;
                break;
            case DOUBLE:
                z2 = obj instanceof Double;
                break;
            case BOOLEAN:
                z2 = obj instanceof Boolean;
                break;
            case STRING:
                z2 = obj instanceof String;
                break;
            case BYTE_STRING:
                if (!(obj instanceof ByteString) && !(obj instanceof byte[])) {
                    z2 = false;
                }
                break;
            case ENUM:
                if (!(obj instanceof Integer) && !(obj instanceof Internal.EnumLite)) {
                    z2 = false;
                }
                break;
            case MESSAGE:
                if (!(obj instanceof MessageLite) && !(obj instanceof LazyField)) {
                    z2 = false;
                }
                break;
            default:
                z2 = false;
                break;
        }
        if (!z2) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(fieldDescriptorLite.getNumber()), fieldDescriptorLite.getLiteType().X, obj.getClass().getName()));
        }
    }

    public static void n(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i2, Object obj) {
        if (fieldType == WireFormat.FieldType.m0) {
            codedOutputStream.G(i2, 3);
            ((MessageLite) obj).c(codedOutputStream);
            codedOutputStream.G(i2, 4);
        }
        codedOutputStream.G(i2, fieldType.f4945Y);
        switch (fieldType.ordinal()) {
            case 0:
                codedOutputStream.y(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                codedOutputStream.x(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                codedOutputStream.I(((Long) obj).longValue());
                break;
            case 3:
                codedOutputStream.I(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.z(((Integer) obj).intValue());
                break;
            case 5:
                codedOutputStream.y(((Long) obj).longValue());
                break;
            case 6:
                codedOutputStream.x(((Integer) obj).intValue());
                break;
            case 7:
                codedOutputStream.u(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.F((String) obj);
                } else {
                    codedOutputStream.w((ByteString) obj);
                }
                break;
            case 9:
                ((MessageLite) obj).c(codedOutputStream);
                break;
            case 10:
                codedOutputStream.C((MessageLite) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    byte[] bArr = (byte[]) obj;
                    codedOutputStream.v(bArr.length, bArr);
                } else {
                    codedOutputStream.w((ByteString) obj);
                }
                break;
            case 12:
                codedOutputStream.H(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof Internal.EnumLite)) {
                    codedOutputStream.z(((Integer) obj).intValue());
                } else {
                    codedOutputStream.z(((Internal.EnumLite) obj).getNumber());
                }
                break;
            case 14:
                codedOutputStream.x(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.y(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.H(CodedOutputStream.r(((Integer) obj).intValue()));
                break;
            case 17:
                codedOutputStream.I(CodedOutputStream.s(((Long) obj).longValue()));
                break;
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final FieldSet clone() {
        FieldSet fieldSet = new FieldSet();
        SmallSortedMap.AnonymousClass1 anonymousClass1 = this.f4837a;
        int size = anonymousClass1.X.size();
        for (int i2 = 0; i2 < size; i2++) {
            Map.Entry entryC = anonymousClass1.c(i2);
            fieldSet.l((FieldDescriptorLite) entryC.getKey(), entryC.getValue());
        }
        for (Map.Entry entry : anonymousClass1.d()) {
            fieldSet.l((FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        fieldSet.f4839c = this.f4839c;
        return fieldSet;
    }

    public final Object e(FieldDescriptorLite fieldDescriptorLite) {
        Object obj = this.f4837a.get(fieldDescriptorLite);
        return obj instanceof LazyField ? ((LazyField) obj).a(null) : obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FieldSet) {
            return this.f4837a.equals(((FieldSet) obj).f4837a);
        }
        return false;
    }

    public final boolean g() {
        SmallSortedMap.AnonymousClass1 anonymousClass1 = this.f4837a;
        int size = anonymousClass1.X.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!h(anonymousClass1.c(i2))) {
                return false;
            }
        }
        Iterator it = anonymousClass1.d().iterator();
        while (it.hasNext()) {
            if (!h((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f4837a.hashCode();
    }

    public final Iterator i() {
        SmallSortedMap.AnonymousClass1 anonymousClass1 = this.f4837a;
        if (anonymousClass1.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.f4839c ? new LazyField.LazyIterator(((SmallSortedMap.EntrySet) anonymousClass1.entrySet()).iterator()) : ((SmallSortedMap.EntrySet) anonymousClass1.entrySet()).iterator();
    }

    public final void j() {
        if (this.f4838b) {
            return;
        }
        SmallSortedMap.AnonymousClass1 anonymousClass1 = this.f4837a;
        int size = anonymousClass1.X.size();
        for (int i2 = 0; i2 < size; i2++) {
            Map.Entry entryC = anonymousClass1.c(i2);
            if (entryC.getValue() instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) entryC.getValue();
                generatedMessageLite.getClass();
                Protobuf protobuf = Protobuf.f4904c;
                protobuf.getClass();
                protobuf.a(generatedMessageLite.getClass()).makeImmutable(generatedMessageLite);
                generatedMessageLite.n();
            }
        }
        anonymousClass1.f();
        this.f4838b = true;
    }

    public final void k(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        boolean z2 = value instanceof LazyField;
        boolean zIsRepeated = fieldDescriptorLite.isRepeated();
        SmallSortedMap.AnonymousClass1 anonymousClass1 = this.f4837a;
        if (zIsRepeated) {
            if (z2) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
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
            if (z2) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
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
            if (z2) {
                value = ((LazyField) value).a(null);
            }
            anonymousClass1.put(fieldDescriptorLite, fieldDescriptorLite.c(((MessageLite) objE2).toBuilder(), (MessageLite) value).f());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        anonymousClass1.put(fieldDescriptorLite, value);
        if (z2) {
            this.f4839c = true;
        }
    }

    public final void l(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        if (!fieldDescriptorLite.isRepeated()) {
            m(fieldDescriptorLite, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m(fieldDescriptorLite, it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof LazyField) {
            this.f4839c = true;
        }
        this.f4837a.put(fieldDescriptorLite, obj);
    }

    public FieldSet(int i2) {
        j();
        j();
    }
}
