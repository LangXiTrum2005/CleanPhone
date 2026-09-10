package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
final class SchemaUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f4914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final UnknownFieldSchema f4915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final UnknownFieldSetLiteSchema f4916c;

    static {
        Class<?> cls;
        Class<?> cls2;
        Protobuf protobuf = Protobuf.f4904c;
        UnknownFieldSchema unknownFieldSchema = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f4914a = cls;
        try {
            Protobuf protobuf2 = Protobuf.f4904c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                unknownFieldSchema = (UnknownFieldSchema) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            }
        } catch (Throwable unused3) {
        }
        f4915b = unknownFieldSchema;
        f4916c = new UnknownFieldSetLiteSchema();
    }

    public static int a(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int iQ = 0;
            while (i2 < size) {
                iQ += CodedOutputStream.q(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return iQ;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int iQ2 = 0;
        while (i2 < size) {
            iQ2 += CodedOutputStream.q(intArrayList.getInt(i2));
            i2++;
        }
        return iQ2;
    }

    public static int b(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.o(i2) + 4) * size;
    }

    public static int c(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.o(i2) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int iQ = 0;
            while (i2 < size) {
                iQ += CodedOutputStream.q(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return iQ;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int iQ2 = 0;
        while (i2 < size) {
            iQ2 += CodedOutputStream.q(intArrayList.getInt(i2));
            i2++;
        }
        return iQ2;
    }

    public static int e(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof LongArrayList)) {
            int iQ = 0;
            while (i2 < size) {
                iQ += CodedOutputStream.q(((Long) list.get(i2)).longValue());
                i2++;
            }
            return iQ;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int iQ2 = 0;
        while (i2 < size) {
            iQ2 += CodedOutputStream.q(longArrayList.getLong(i2));
            i2++;
        }
        return iQ2;
    }

    public static int f(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int iL = 0;
            while (i2 < size) {
                iL += CodedOutputStream.l(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return iL;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int iL2 = 0;
        while (i2 < size) {
            iL2 += CodedOutputStream.l(intArrayList.getInt(i2));
            i2++;
        }
        return iL2;
    }

    public static int g(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof LongArrayList)) {
            int iM = 0;
            while (i2 < size) {
                iM += CodedOutputStream.m(((Long) list.get(i2)).longValue());
                i2++;
            }
            return iM;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int iM2 = 0;
        while (i2 < size) {
            iM2 += CodedOutputStream.m(longArrayList.getLong(i2));
            i2++;
        }
        return iM2;
    }

    public static int h(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int iP = 0;
            while (i2 < size) {
                iP += CodedOutputStream.p(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return iP;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int iP2 = 0;
        while (i2 < size) {
            iP2 += CodedOutputStream.p(intArrayList.getInt(i2));
            i2++;
        }
        return iP2;
    }

    public static int i(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof LongArrayList)) {
            int iQ = 0;
            while (i2 < size) {
                iQ += CodedOutputStream.q(((Long) list.get(i2)).longValue());
                i2++;
            }
            return iQ;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int iQ2 = 0;
        while (i2 < size) {
            iQ2 += CodedOutputStream.q(longArrayList.getLong(i2));
            i2++;
        }
        return iQ2;
    }

    public static Object j(Object obj, int i2, List list, Internal.EnumVerifier enumVerifier, Object obj2, UnknownFieldSchema unknownFieldSchema) {
        if (enumVerifier == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!enumVerifier.isInRange(iIntValue)) {
                    obj2 = m(obj, i2, iIntValue, obj2, unknownFieldSchema);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Integer num = (Integer) list.get(i4);
            int iIntValue2 = num.intValue();
            if (enumVerifier.isInRange(iIntValue2)) {
                if (i4 != i3) {
                    list.set(i3, num);
                }
                i3++;
            } else {
                obj2 = m(obj, i2, iIntValue2, obj2, unknownFieldSchema);
            }
        }
        if (i3 != size) {
            list.subList(i3, size).clear();
        }
        return obj2;
    }

    public static void k(ExtensionSchema extensionSchema, Object obj, Object obj2) {
        FieldSet fieldSetC = extensionSchema.c(obj2);
        if (fieldSetC.f4837a.isEmpty()) {
            return;
        }
        FieldSet fieldSetD = extensionSchema.d(obj);
        fieldSetD.getClass();
        SmallSortedMap.AnonymousClass1 anonymousClass1 = fieldSetC.f4837a;
        int size = anonymousClass1.X.size();
        for (int i2 = 0; i2 < size; i2++) {
            fieldSetD.k(anonymousClass1.c(i2));
        }
        Iterator it = anonymousClass1.d().iterator();
        while (it.hasNext()) {
            fieldSetD.k((Map.Entry) it.next());
        }
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static Object m(Object obj, int i2, int i3, Object obj2, UnknownFieldSchema unknownFieldSchema) {
        if (obj2 == null) {
            obj2 = unknownFieldSchema.f(obj);
        }
        unknownFieldSchema.e(obj2, i2, i3);
        return obj2;
    }

    public static void n(int i2, List list, Writer writer, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeBoolList(i2, list, z2);
    }

    public static void o(int i2, List list, Writer writer, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeDoubleList(i2, list, z2);
    }

    public static void p(int i2, List list, Writer writer, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeFixed32List(i2, list, z2);
    }

    public static void q(int i2, List list, Writer writer, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeFixed64List(i2, list, z2);
    }

    public static void r(int i2, List list, Writer writer, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeFloatList(i2, list, z2);
    }

    public static void s(int i2, List list, Writer writer, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeInt32List(i2, list, z2);
    }

    public static void t(int i2, List list, Writer writer, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeInt64List(i2, list, z2);
    }

    public static void u(int i2, List list, Writer writer, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSFixed32List(i2, list, z2);
    }

    public static void v(int i2, List list, Writer writer, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSFixed64List(i2, list, z2);
    }

    public static void w(int i2, List list, Writer writer, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSInt32List(i2, list, z2);
    }

    public static void x(int i2, List list, Writer writer, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSInt64List(i2, list, z2);
    }

    public static void y(int i2, List list, Writer writer, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeUInt32List(i2, list, z2);
    }

    public static void z(int i2, List list, Writer writer, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeUInt64List(i2, list, z2);
    }
}
