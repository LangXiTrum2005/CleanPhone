package com.google.protobuf;

import java.io.IOException;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f25041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q4 f25042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r4 f25043c;

    static {
        Class<?> cls;
        Class<?> cls2;
        q4 q4Var = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f25041a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                q4Var = (q4) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        f25042b = q4Var;
        f25043c = new r4();
    }

    public static void A(int i10, List list, l5 l5Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((l0) l5Var).f24893a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.writeSFixed64(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        codedOutputStream.writeTag(i10, 2);
        int iComputeSFixed64SizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeSFixed64SizeNoTag += CodedOutputStream.computeSFixed64SizeNoTag(((Long) list.get(i12)).longValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeSFixed64SizeNoTag);
        while (i11 < list.size()) {
            codedOutputStream.writeSFixed64NoTag(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void B(int i10, List list, l5 l5Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((l0) l5Var).f24893a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.writeSInt32(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        codedOutputStream.writeTag(i10, 2);
        int iComputeSInt32SizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeSInt32SizeNoTag += CodedOutputStream.computeSInt32SizeNoTag(((Integer) list.get(i12)).intValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeSInt32SizeNoTag);
        while (i11 < list.size()) {
            codedOutputStream.writeSInt32NoTag(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void C(int i10, List list, l5 l5Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((l0) l5Var).f24893a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.writeSInt64(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        codedOutputStream.writeTag(i10, 2);
        int iComputeSInt64SizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeSInt64SizeNoTag += CodedOutputStream.computeSInt64SizeNoTag(((Long) list.get(i12)).longValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeSInt64SizeNoTag);
        while (i11 < list.size()) {
            codedOutputStream.writeSInt64NoTag(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void D(int i10, List list, l5 l5Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((l0) l5Var).f24893a;
        int i11 = 0;
        if (!(list instanceof LazyStringList)) {
            while (i11 < list.size()) {
                codedOutputStream.writeString(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        LazyStringList lazyStringList = (LazyStringList) list;
        while (i11 < list.size()) {
            Object raw = lazyStringList.getRaw(i11);
            if (raw instanceof String) {
                codedOutputStream.writeString(i10, (String) raw);
            } else {
                codedOutputStream.writeBytes(i10, (ByteString) raw);
            }
            i11++;
        }
    }

    public static void E(int i10, List list, l5 l5Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((l0) l5Var).f24893a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.writeUInt32(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        codedOutputStream.writeTag(i10, 2);
        int iComputeUInt32SizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeUInt32SizeNoTag += CodedOutputStream.computeUInt32SizeNoTag(((Integer) list.get(i12)).intValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeUInt32SizeNoTag);
        while (i11 < list.size()) {
            codedOutputStream.writeUInt32NoTag(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void F(int i10, List list, l5 l5Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((l0) l5Var).f24893a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.writeUInt64(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        codedOutputStream.writeTag(i10, 2);
        int iComputeUInt64SizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeUInt64SizeNoTag += CodedOutputStream.computeUInt64SizeNoTag(((Long) list.get(i12)).longValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeUInt64SizeNoTag);
        while (i11 < list.size()) {
            codedOutputStream.writeUInt64NoTag(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static int a(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof f2)) {
            int iComputeEnumSizeNoTag = 0;
            while (i10 < size) {
                iComputeEnumSizeNoTag += CodedOutputStream.computeEnumSizeNoTag(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iComputeEnumSizeNoTag;
        }
        f2 f2Var = (f2) list;
        int iComputeEnumSizeNoTag2 = 0;
        while (i10 < size) {
            iComputeEnumSizeNoTag2 += CodedOutputStream.computeEnumSizeNoTag(f2Var.getInt(i10));
            i10++;
        }
        return iComputeEnumSizeNoTag2;
    }

    public static int b(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.computeFixed32Size(i10, 0) * size;
    }

    public static int c(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.computeFixed64Size(i10, 0L) * size;
    }

    public static int d(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof f2)) {
            int iComputeInt32SizeNoTag = 0;
            while (i10 < size) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iComputeInt32SizeNoTag;
        }
        f2 f2Var = (f2) list;
        int iComputeInt32SizeNoTag2 = 0;
        while (i10 < size) {
            iComputeInt32SizeNoTag2 += CodedOutputStream.computeInt32SizeNoTag(f2Var.getInt(i10));
            i10++;
        }
        return iComputeInt32SizeNoTag2;
    }

    public static int e(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof r2)) {
            int iComputeInt64SizeNoTag = 0;
            while (i10 < size) {
                iComputeInt64SizeNoTag += CodedOutputStream.computeInt64SizeNoTag(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iComputeInt64SizeNoTag;
        }
        r2 r2Var = (r2) list;
        int iComputeInt64SizeNoTag2 = 0;
        while (i10 < size) {
            iComputeInt64SizeNoTag2 += CodedOutputStream.computeInt64SizeNoTag(r2Var.getLong(i10));
            i10++;
        }
        return iComputeInt64SizeNoTag2;
    }

    public static int f(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof f2)) {
            int iComputeSInt32SizeNoTag = 0;
            while (i10 < size) {
                iComputeSInt32SizeNoTag += CodedOutputStream.computeSInt32SizeNoTag(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iComputeSInt32SizeNoTag;
        }
        f2 f2Var = (f2) list;
        int iComputeSInt32SizeNoTag2 = 0;
        while (i10 < size) {
            iComputeSInt32SizeNoTag2 += CodedOutputStream.computeSInt32SizeNoTag(f2Var.getInt(i10));
            i10++;
        }
        return iComputeSInt32SizeNoTag2;
    }

    public static int g(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof r2)) {
            int iComputeSInt64SizeNoTag = 0;
            while (i10 < size) {
                iComputeSInt64SizeNoTag += CodedOutputStream.computeSInt64SizeNoTag(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iComputeSInt64SizeNoTag;
        }
        r2 r2Var = (r2) list;
        int iComputeSInt64SizeNoTag2 = 0;
        while (i10 < size) {
            iComputeSInt64SizeNoTag2 += CodedOutputStream.computeSInt64SizeNoTag(r2Var.getLong(i10));
            i10++;
        }
        return iComputeSInt64SizeNoTag2;
    }

    public static int h(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof f2)) {
            int iComputeUInt32SizeNoTag = 0;
            while (i10 < size) {
                iComputeUInt32SizeNoTag += CodedOutputStream.computeUInt32SizeNoTag(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iComputeUInt32SizeNoTag;
        }
        f2 f2Var = (f2) list;
        int iComputeUInt32SizeNoTag2 = 0;
        while (i10 < size) {
            iComputeUInt32SizeNoTag2 += CodedOutputStream.computeUInt32SizeNoTag(f2Var.getInt(i10));
            i10++;
        }
        return iComputeUInt32SizeNoTag2;
    }

    public static int i(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof r2)) {
            int iComputeUInt64SizeNoTag = 0;
            while (i10 < size) {
                iComputeUInt64SizeNoTag += CodedOutputStream.computeUInt64SizeNoTag(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iComputeUInt64SizeNoTag;
        }
        r2 r2Var = (r2) list;
        int iComputeUInt64SizeNoTag2 = 0;
        while (i10 < size) {
            iComputeUInt64SizeNoTag2 += CodedOutputStream.computeUInt64SizeNoTag(r2Var.getLong(i10));
            i10++;
        }
        return iComputeUInt64SizeNoTag2;
    }

    public static Object j(Object obj, int i10, AbstractList abstractList, Internal.EnumLiteMap enumLiteMap, Object obj2, q4 q4Var) {
        if (enumLiteMap == null) {
            return obj2;
        }
        int size = abstractList.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = (Integer) abstractList.get(i12);
            int iIntValue = num.intValue();
            if (enumLiteMap.findValueByNumber(iIntValue) != null) {
                if (i12 != i11) {
                    abstractList.set(i11, num);
                }
                i11++;
            } else {
                obj2 = n(obj, i10, iIntValue, obj2, q4Var);
            }
        }
        if (i11 != size) {
            abstractList.subList(i11, size).clear();
        }
        return obj2;
    }

    public static Object k(Object obj, int i10, List list, Internal.EnumVerifier enumVerifier, Object obj2, q4 q4Var) {
        if (enumVerifier == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!enumVerifier.isInRange(iIntValue)) {
                    obj2 = n(obj, i10, iIntValue, obj2, q4Var);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = (Integer) list.get(i12);
            int iIntValue2 = num.intValue();
            if (enumVerifier.isInRange(iIntValue2)) {
                if (i12 != i11) {
                    list.set(i11, num);
                }
                i11++;
            } else {
                obj2 = n(obj, i10, iIntValue2, obj2, q4Var);
            }
        }
        if (i11 != size) {
            list.subList(i11, size).clear();
        }
        return obj2;
    }

    public static void l(q4 q4Var, Object obj, Object obj2) {
        ((r4) q4Var).getClass();
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLiteMutableCopyOf = generatedMessageLite.unknownFields;
        UnknownFieldSetLite unknownFieldSetLite = ((GeneratedMessageLite) obj2).unknownFields;
        if (!UnknownFieldSetLite.getDefaultInstance().equals(unknownFieldSetLite)) {
            unknownFieldSetLiteMutableCopyOf = UnknownFieldSetLite.getDefaultInstance().equals(unknownFieldSetLiteMutableCopyOf) ? UnknownFieldSetLite.mutableCopyOf(unknownFieldSetLiteMutableCopyOf, unknownFieldSetLite) : unknownFieldSetLiteMutableCopyOf.mergeFrom(unknownFieldSetLite);
        }
        generatedMessageLite.unknownFields = unknownFieldSetLiteMutableCopyOf;
    }

    public static boolean m(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static Object n(Object obj, int i10, int i11, Object obj2, q4 q4Var) {
        if (obj2 == null) {
            obj2 = q4Var.a(obj);
        }
        ((r4) q4Var).getClass();
        ((UnknownFieldSetLite) obj2).storeField(WireFormat.makeTag(i10, 0), Long.valueOf(i11));
        return obj2;
    }

    public static void o(int i10, List list, l5 l5Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((l0) l5Var).f24893a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.writeBool(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        codedOutputStream.writeTag(i10, 2);
        int iComputeBoolSizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeBoolSizeNoTag += CodedOutputStream.computeBoolSizeNoTag(((Boolean) list.get(i12)).booleanValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeBoolSizeNoTag);
        while (i11 < list.size()) {
            codedOutputStream.writeBoolNoTag(((Boolean) list.get(i11)).booleanValue());
            i11++;
        }
    }

    public static void p(int i10, List list, l5 l5Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0 l0Var = (l0) l5Var;
        l0Var.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            l0Var.f24893a.writeBytes(i10, (ByteString) list.get(i11));
        }
    }

    public static void q(int i10, List list, l5 l5Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((l0) l5Var).f24893a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.writeDouble(i10, ((Double) list.get(i11)).doubleValue());
                i11++;
            }
            return;
        }
        codedOutputStream.writeTag(i10, 2);
        int iComputeDoubleSizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeDoubleSizeNoTag += CodedOutputStream.computeDoubleSizeNoTag(((Double) list.get(i12)).doubleValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeDoubleSizeNoTag);
        while (i11 < list.size()) {
            codedOutputStream.writeDoubleNoTag(((Double) list.get(i11)).doubleValue());
            i11++;
        }
    }

    public static void r(int i10, List list, l5 l5Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((l0) l5Var).f24893a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.writeEnum(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        codedOutputStream.writeTag(i10, 2);
        int iComputeEnumSizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeEnumSizeNoTag += CodedOutputStream.computeEnumSizeNoTag(((Integer) list.get(i12)).intValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeEnumSizeNoTag);
        while (i11 < list.size()) {
            codedOutputStream.writeEnumNoTag(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void s(int i10, List list, l5 l5Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((l0) l5Var).f24893a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.writeFixed32(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        codedOutputStream.writeTag(i10, 2);
        int iComputeFixed32SizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeFixed32SizeNoTag += CodedOutputStream.computeFixed32SizeNoTag(((Integer) list.get(i12)).intValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeFixed32SizeNoTag);
        while (i11 < list.size()) {
            codedOutputStream.writeFixed32NoTag(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void t(int i10, List list, l5 l5Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((l0) l5Var).f24893a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.writeFixed64(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        codedOutputStream.writeTag(i10, 2);
        int iComputeFixed64SizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeFixed64SizeNoTag += CodedOutputStream.computeFixed64SizeNoTag(((Long) list.get(i12)).longValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeFixed64SizeNoTag);
        while (i11 < list.size()) {
            codedOutputStream.writeFixed64NoTag(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void u(int i10, List list, l5 l5Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((l0) l5Var).f24893a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.writeFloat(i10, ((Float) list.get(i11)).floatValue());
                i11++;
            }
            return;
        }
        codedOutputStream.writeTag(i10, 2);
        int iComputeFloatSizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeFloatSizeNoTag += CodedOutputStream.computeFloatSizeNoTag(((Float) list.get(i12)).floatValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeFloatSizeNoTag);
        while (i11 < list.size()) {
            codedOutputStream.writeFloatNoTag(((Float) list.get(i11)).floatValue());
            i11++;
        }
    }

    public static void v(int i10, List list, l5 l5Var, x3 x3Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0 l0Var = (l0) l5Var;
        l0Var.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            l0Var.d(i10, list.get(i11), x3Var);
        }
    }

    public static void w(int i10, List list, l5 l5Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((l0) l5Var).f24893a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.writeInt32(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        codedOutputStream.writeTag(i10, 2);
        int iComputeInt32SizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(((Integer) list.get(i12)).intValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeInt32SizeNoTag);
        while (i11 < list.size()) {
            codedOutputStream.writeInt32NoTag(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void x(int i10, List list, l5 l5Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((l0) l5Var).f24893a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.writeInt64(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        codedOutputStream.writeTag(i10, 2);
        int iComputeInt64SizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeInt64SizeNoTag += CodedOutputStream.computeInt64SizeNoTag(((Long) list.get(i12)).longValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeInt64SizeNoTag);
        while (i11 < list.size()) {
            codedOutputStream.writeInt64NoTag(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void y(int i10, List list, l5 l5Var, x3 x3Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0 l0Var = (l0) l5Var;
        l0Var.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            l0Var.g(i10, list.get(i11), x3Var);
        }
    }

    public static void z(int i10, List list, l5 l5Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((l0) l5Var).f24893a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                codedOutputStream.writeSFixed32(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        codedOutputStream.writeTag(i10, 2);
        int iComputeSFixed32SizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeSFixed32SizeNoTag += CodedOutputStream.computeSFixed32SizeNoTag(((Integer) list.get(i12)).intValue());
        }
        codedOutputStream.writeUInt32NoTag(iComputeSFixed32SizeNoTag);
        while (i11 < list.size()) {
            codedOutputStream.writeSFixed32NoTag(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }
}
