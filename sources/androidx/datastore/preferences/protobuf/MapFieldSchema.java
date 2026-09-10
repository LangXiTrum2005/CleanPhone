package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
interface MapFieldSchema {
    MapFieldLite a();

    MapFieldLite forMapData(Object obj);

    MapEntryLite.Metadata forMapMetadata(Object obj);

    MapFieldLite forMutableMapData(Object obj);

    int getSerializedSize(int i2, Object obj, Object obj2);

    boolean isImmutable(Object obj);

    MapFieldLite mergeFrom(Object obj, Object obj2);

    Object toImmutable(Object obj);
}
