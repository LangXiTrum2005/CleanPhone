package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
final class MapFieldSchemaLite implements MapFieldSchema {
    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final MapFieldLite a() {
        return MapFieldLite.f4880Y.i();
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final MapFieldLite forMapData(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final MapEntryLite.Metadata forMapMetadata(Object obj) {
        return ((MapEntryLite) obj).f4875a;
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final MapFieldLite forMutableMapData(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final int getSerializedSize(int i2, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        MapEntryLite mapEntryLite = (MapEntryLite) obj2;
        int iP = 0;
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : mapFieldLite.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            mapEntryLite.getClass();
            int iO = CodedOutputStream.o(i2);
            int iA = MapEntryLite.a(mapEntryLite.f4875a, key, value);
            iP += CodedOutputStream.p(iA) + iA + iO;
        }
        return iP;
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final boolean isImmutable(Object obj) {
        return !((MapFieldLite) obj).X;
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final MapFieldLite mergeFrom(Object obj, Object obj2) {
        MapFieldLite mapFieldLiteI = (MapFieldLite) obj;
        MapFieldLite mapFieldLite = (MapFieldLite) obj2;
        if (!mapFieldLite.isEmpty()) {
            if (!mapFieldLiteI.X) {
                mapFieldLiteI = mapFieldLiteI.i();
            }
            mapFieldLiteI.g();
            if (!mapFieldLite.isEmpty()) {
                mapFieldLiteI.putAll(mapFieldLite);
            }
        }
        return mapFieldLiteI;
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final Object toImmutable(Object obj) {
        ((MapFieldLite) obj).X = false;
        return obj;
    }
}
