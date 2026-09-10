package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class v1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v1 f24964d = new v1(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z3 f24965a = new z3(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f24966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f24967c;

    public v1() {
    }

    public static int c(WireFormat.FieldType fieldType, int i10, Object obj) {
        int iComputeTagSize = CodedOutputStream.computeTagSize(i10);
        if (fieldType == WireFormat.FieldType.GROUP) {
            iComputeTagSize *= 2;
        }
        return d(fieldType, obj) + iComputeTagSize;
    }

    public static int d(WireFormat.FieldType fieldType, Object obj) {
        switch (u1.f24957b[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.computeDoubleSizeNoTag(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.computeFloatSizeNoTag(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.computeInt64SizeNoTag(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.computeUInt64SizeNoTag(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.computeInt32SizeNoTag(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.computeFixed64SizeNoTag(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.computeFixed32SizeNoTag(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.computeBoolSizeNoTag(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.computeGroupSizeNoTag((MessageLite) obj);
            case 10:
                return obj instanceof LazyField ? CodedOutputStream.computeLazyFieldSizeNoTag((LazyField) obj) : CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj);
            case 11:
                return obj instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) obj) : CodedOutputStream.computeStringSizeNoTag((String) obj);
            case 12:
                return obj instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) obj) : CodedOutputStream.computeByteArraySizeNoTag((byte[]) obj);
            case 13:
                return CodedOutputStream.computeUInt32SizeNoTag(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.computeSFixed32SizeNoTag(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.computeSFixed64SizeNoTag(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.computeSInt32SizeNoTag(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.computeSInt64SizeNoTag(((Long) obj).longValue());
            case 18:
                return obj instanceof Internal.EnumLite ? CodedOutputStream.computeEnumSizeNoTag(((Internal.EnumLite) obj).getNumber()) : CodedOutputStream.computeEnumSizeNoTag(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int e(FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite, Object obj) {
        WireFormat.FieldType liteType = fieldSet$FieldDescriptorLite.getLiteType();
        int number = fieldSet$FieldDescriptorLite.getNumber();
        if (!fieldSet$FieldDescriptorLite.isRepeated()) {
            return c(liteType, number, obj);
        }
        List list = (List) obj;
        int iC = 0;
        if (!fieldSet$FieldDescriptorLite.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iC += c(liteType, number, it.next());
            }
            return iC;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            iC += d(liteType, it2.next());
        }
        return CodedOutputStream.computeUInt32SizeNoTag(iC) + CodedOutputStream.computeTagSize(number) + iC;
    }

    public static int h(Map.Entry entry) {
        FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite = (FieldSet$FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (fieldSet$FieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE || fieldSet$FieldDescriptorLite.isRepeated() || fieldSet$FieldDescriptorLite.isPacked()) {
            return e(fieldSet$FieldDescriptorLite, value);
        }
        return value instanceof LazyField ? CodedOutputStream.computeLazyFieldMessageSetExtensionSize(((FieldSet$FieldDescriptorLite) entry.getKey()).getNumber(), (LazyField) value) : CodedOutputStream.computeMessageSetExtensionSize(((FieldSet$FieldDescriptorLite) entry.getKey()).getNumber(), (MessageLite) value);
    }

    public static boolean k(Map.Entry entry) {
        boolean zIsInitialized;
        FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite = (FieldSet$FieldDescriptorLite) entry.getKey();
        if (fieldSet$FieldDescriptorLite.getLiteJavaType() == WireFormat.JavaType.MESSAGE) {
            if (!fieldSet$FieldDescriptorLite.isRepeated()) {
                Object value = entry.getValue();
                if (value instanceof MessageLiteOrBuilder) {
                    return ((MessageLiteOrBuilder) value).isInitialized();
                }
                if (value instanceof LazyField) {
                    return true;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            for (Object obj : (List) entry.getValue()) {
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

    public static void q(FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite, Object obj) {
        WireFormat.FieldType liteType = fieldSet$FieldDescriptorLite.getLiteType();
        Internal.checkNotNull(obj);
        boolean z10 = true;
        switch (u1.f24956a[liteType.getJavaType().ordinal()]) {
            case 1:
                z10 = obj instanceof Integer;
                break;
            case 2:
                z10 = obj instanceof Long;
                break;
            case 3:
                z10 = obj instanceof Float;
                break;
            case 4:
                z10 = obj instanceof Double;
                break;
            case 5:
                z10 = obj instanceof Boolean;
                break;
            case 6:
                z10 = obj instanceof String;
                break;
            case 7:
                if (!(obj instanceof ByteString) && !(obj instanceof byte[])) {
                    z10 = false;
                }
                break;
            case 8:
                if (!(obj instanceof Integer) && !(obj instanceof Internal.EnumLite)) {
                    z10 = false;
                }
                break;
            case 9:
                if (!(obj instanceof MessageLite) && !(obj instanceof LazyField)) {
                    z10 = false;
                }
                break;
            default:
                z10 = false;
                break;
        }
        if (!z10) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(fieldSet$FieldDescriptorLite.getNumber()), fieldSet$FieldDescriptorLite.getLiteType().getJavaType(), obj.getClass().getName()));
        }
    }

    public static void r(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i10, Object obj) {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.writeGroup(i10, (MessageLite) obj);
        } else {
            codedOutputStream.writeTag(i10, fieldType.getWireType());
            s(codedOutputStream, fieldType, obj);
        }
    }

    public static void s(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) {
        switch (u1.f24957b[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.writeDoubleNoTag(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.writeFloatNoTag(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.writeInt64NoTag(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.writeUInt64NoTag(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.writeInt32NoTag(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.writeFixed64NoTag(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.writeFixed32NoTag(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.writeBoolNoTag(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.writeGroupNoTag((MessageLite) obj);
                break;
            case 10:
                codedOutputStream.writeMessageNoTag((MessageLite) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.writeStringNoTag((String) obj);
                } else {
                    codedOutputStream.writeBytesNoTag((ByteString) obj);
                }
                break;
            case 12:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.writeByteArrayNoTag((byte[]) obj);
                } else {
                    codedOutputStream.writeBytesNoTag((ByteString) obj);
                }
                break;
            case 13:
                codedOutputStream.writeUInt32NoTag(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.writeSFixed32NoTag(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.writeSFixed64NoTag(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.writeSInt32NoTag(((Integer) obj).intValue());
                break;
            case 17:
                codedOutputStream.writeSInt64NoTag(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof Internal.EnumLite)) {
                    codedOutputStream.writeEnumNoTag(((Integer) obj).intValue());
                } else {
                    codedOutputStream.writeEnumNoTag(((Internal.EnumLite) obj).getNumber());
                }
                break;
        }
    }

    public final void a(FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite, Object obj) {
        List arrayList;
        if (!fieldSet$FieldDescriptorLite.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        q(fieldSet$FieldDescriptorLite, obj);
        Object objF = f(fieldSet$FieldDescriptorLite);
        if (objF == null) {
            arrayList = new ArrayList();
            this.f24965a.put(fieldSet$FieldDescriptorLite, arrayList);
        } else {
            arrayList = (List) objF;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final v1 clone() {
        z3 z3Var;
        v1 v1Var = new v1();
        int i10 = 0;
        while (true) {
            z3Var = this.f24965a;
            if (i10 >= z3Var.f25060b.size()) {
                break;
            }
            Map.Entry entryC = z3Var.c(i10);
            v1Var.p((FieldSet$FieldDescriptorLite) entryC.getKey(), entryC.getValue());
            i10++;
        }
        for (Map.Entry entry : z3Var.d()) {
            v1Var.p((FieldSet$FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        v1Var.f24967c = this.f24967c;
        return v1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v1) {
            return this.f24965a.equals(((v1) obj).f24965a);
        }
        return false;
    }

    public final Object f(FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite) {
        Object obj = this.f24965a.get(fieldSet$FieldDescriptorLite);
        return obj instanceof LazyField ? ((LazyField) obj).getValue() : obj;
    }

    public final int g() {
        z3 z3Var;
        int i10 = 0;
        int iH = 0;
        while (true) {
            z3Var = this.f24965a;
            if (i10 >= z3Var.f25060b.size()) {
                break;
            }
            iH += h(z3Var.c(i10));
            i10++;
        }
        Iterator it = z3Var.d().iterator();
        while (it.hasNext()) {
            iH += h((Map.Entry) it.next());
        }
        return iH;
    }

    public final int hashCode() {
        return this.f24965a.hashCode();
    }

    public final int i() {
        z3 z3Var;
        int i10 = 0;
        int iE = 0;
        while (true) {
            z3Var = this.f24965a;
            if (i10 >= z3Var.f25060b.size()) {
                break;
            }
            Map.Entry entryC = z3Var.c(i10);
            iE += e((FieldSet$FieldDescriptorLite) entryC.getKey(), entryC.getValue());
            i10++;
        }
        for (Map.Entry entry : z3Var.d()) {
            iE += e((FieldSet$FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        return iE;
    }

    public final boolean j() {
        int i10 = 0;
        while (true) {
            z3 z3Var = this.f24965a;
            if (i10 >= z3Var.f25060b.size()) {
                Iterator it = z3Var.d().iterator();
                while (it.hasNext()) {
                    if (!k((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
            if (!k(z3Var.c(i10))) {
                return false;
            }
            i10++;
        }
    }

    public final Iterator l() {
        boolean z10 = this.f24967c;
        z3 z3Var = this.f24965a;
        return z10 ? new l2(((androidx.datastore.preferences.protobuf.i1) z3Var.entrySet()).iterator()) : ((androidx.datastore.preferences.protobuf.i1) z3Var.entrySet()).iterator();
    }

    public final void m() {
        z3 z3Var;
        if (this.f24966b) {
            return;
        }
        int i10 = 0;
        while (true) {
            z3Var = this.f24965a;
            if (i10 >= z3Var.f25060b.size()) {
                break;
            }
            Map.Entry entryC = z3Var.c(i10);
            if (entryC.getValue() instanceof GeneratedMessageLite) {
                ((GeneratedMessageLite) entryC.getValue()).makeImmutable();
            }
            i10++;
        }
        if (!z3Var.f25062d) {
            for (int i11 = 0; i11 < z3Var.f25060b.size(); i11++) {
                Map.Entry entryC2 = z3Var.c(i11);
                if (((FieldSet$FieldDescriptorLite) entryC2.getKey()).isRepeated()) {
                    entryC2.setValue(Collections.unmodifiableList((List) entryC2.getValue()));
                }
            }
            for (Map.Entry entry : z3Var.d()) {
                if (((FieldSet$FieldDescriptorLite) entry.getKey()).isRepeated()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!z3Var.f25062d) {
            z3Var.f25061c = z3Var.f25061c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(z3Var.f25061c);
            z3Var.f25064f = z3Var.f25064f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(z3Var.f25064f);
            z3Var.f25062d = true;
        }
        this.f24966b = true;
    }

    public final void n(v1 v1Var) {
        z3 z3Var;
        int i10 = 0;
        while (true) {
            z3Var = v1Var.f24965a;
            if (i10 >= z3Var.f25060b.size()) {
                break;
            }
            o(z3Var.c(i10));
            i10++;
        }
        Iterator it = z3Var.d().iterator();
        while (it.hasNext()) {
            o((Map.Entry) it.next());
        }
    }

    public final void o(Map.Entry entry) {
        FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite = (FieldSet$FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            value = ((LazyField) value).getValue();
        }
        boolean zIsRepeated = fieldSet$FieldDescriptorLite.isRepeated();
        z3 z3Var = this.f24965a;
        if (zIsRepeated) {
            Object objF = f(fieldSet$FieldDescriptorLite);
            if (objF == null) {
                objF = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) objF;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            z3Var.put(fieldSet$FieldDescriptorLite, objF);
            return;
        }
        if (fieldSet$FieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            z3Var.put(fieldSet$FieldDescriptorLite, value);
            return;
        }
        Object objF2 = f(fieldSet$FieldDescriptorLite);
        if (objF2 != null) {
            z3Var.put(fieldSet$FieldDescriptorLite, fieldSet$FieldDescriptorLite.internalMergeFrom(((MessageLite) objF2).toBuilder(), (MessageLite) value).build());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        z3Var.put(fieldSet$FieldDescriptorLite, value);
    }

    public final void p(FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite, Object obj) {
        if (!fieldSet$FieldDescriptorLite.isRepeated()) {
            q(fieldSet$FieldDescriptorLite, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                q(fieldSet$FieldDescriptorLite, it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof LazyField) {
            this.f24967c = true;
        }
        this.f24965a.put(fieldSet$FieldDescriptorLite, obj);
    }

    public v1(int i10) {
        m();
        m();
    }
}
