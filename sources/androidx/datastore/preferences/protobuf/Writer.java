package androidx.datastore.preferences.protobuf;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
interface Writer {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class FieldOrder {
        public static final FieldOrder X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final FieldOrder f4947Y;
        public static final /* synthetic */ FieldOrder[] Z;

        static {
            FieldOrder fieldOrder = new FieldOrder("ASCENDING", 0);
            X = fieldOrder;
            FieldOrder fieldOrder2 = new FieldOrder("DESCENDING", 1);
            f4947Y = fieldOrder2;
            Z = new FieldOrder[]{fieldOrder, fieldOrder2};
        }

        public static FieldOrder valueOf(String str) {
            return (FieldOrder) java.lang.Enum.valueOf(FieldOrder.class, str);
        }

        public static FieldOrder[] values() {
            return (FieldOrder[]) Z.clone();
        }
    }

    void a(int i2, List list, Schema schema);

    void b(int i2, ByteString byteString);

    void c(int i2, Object obj, Schema schema);

    void d(int i2, MapEntryLite.Metadata metadata, Map map);

    void e(int i2, Object obj, Schema schema);

    void f(int i2, List list, Schema schema);

    FieldOrder fieldOrder();

    void writeBool(int i2, boolean z2);

    void writeBoolList(int i2, List list, boolean z2);

    void writeBytesList(int i2, List list);

    void writeDouble(int i2, double d);

    void writeDoubleList(int i2, List list, boolean z2);

    void writeEndGroup(int i2);

    void writeEnum(int i2, int i3);

    void writeEnumList(int i2, List list, boolean z2);

    void writeFixed32(int i2, int i3);

    void writeFixed32List(int i2, List list, boolean z2);

    void writeFixed64(int i2, long j);

    void writeFixed64List(int i2, List list, boolean z2);

    void writeFloat(int i2, float f);

    void writeFloatList(int i2, List list, boolean z2);

    void writeInt32(int i2, int i3);

    void writeInt32List(int i2, List list, boolean z2);

    void writeInt64(int i2, long j);

    void writeInt64List(int i2, List list, boolean z2);

    void writeMessage(int i2, Object obj);

    void writeMessageSetItem(int i2, Object obj);

    void writeSFixed32(int i2, int i3);

    void writeSFixed32List(int i2, List list, boolean z2);

    void writeSFixed64(int i2, long j);

    void writeSFixed64List(int i2, List list, boolean z2);

    void writeSInt32(int i2, int i3);

    void writeSInt32List(int i2, List list, boolean z2);

    void writeSInt64(int i2, long j);

    void writeSInt64List(int i2, List list, boolean z2);

    void writeStartGroup(int i2);

    void writeString(int i2, String str);

    void writeStringList(int i2, List list);

    void writeUInt32(int i2, int i3);

    void writeUInt32List(int i2, List list, boolean z2);

    void writeUInt64(int i2, long j);

    void writeUInt64List(int i2, List list, boolean z2);
}
