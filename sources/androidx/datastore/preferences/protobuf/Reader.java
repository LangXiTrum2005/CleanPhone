package androidx.datastore.preferences.protobuf;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
interface Reader {
    void a(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite);

    void b(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite);

    Object c(Class cls, ExtensionRegistryLite extensionRegistryLite);

    Object d(Class cls, ExtensionRegistryLite extensionRegistryLite);

    void e(Map map, MapEntryLite.Metadata metadata, ExtensionRegistryLite extensionRegistryLite);

    void f(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite);

    void g(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite);

    int getFieldNumber();

    int getTag();

    boolean readBool();

    void readBoolList(List list);

    ByteString readBytes();

    void readBytesList(List list);

    double readDouble();

    void readDoubleList(List list);

    int readEnum();

    void readEnumList(List list);

    int readFixed32();

    void readFixed32List(List list);

    long readFixed64();

    void readFixed64List(List list);

    float readFloat();

    void readFloatList(List list);

    int readInt32();

    void readInt32List(List list);

    long readInt64();

    void readInt64List(List list);

    int readSFixed32();

    void readSFixed32List(List list);

    long readSFixed64();

    void readSFixed64List(List list);

    int readSInt32();

    void readSInt32List(List list);

    long readSInt64();

    void readSInt64List(List list);

    String readString();

    void readStringList(List list);

    void readStringListRequireUtf8(List list);

    String readStringRequireUtf8();

    int readUInt32();

    void readUInt32List(List list);

    long readUInt64();

    void readUInt64List(List list);

    boolean skipField();
}
