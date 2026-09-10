package com.google.protobuf;

import java.util.Map;

/* JADX INFO: compiled from: MapFieldSchemaLite.java */
/* JADX INFO: loaded from: classes3.dex */
public class dovishness implements adultoid {
    private static <K, V> int getSerializedSizeLite(int i, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        MapEntryLite mapEntryLite = (MapEntryLite) obj2;
        int iComputeMessageSize = 0;
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : mapFieldLite.entrySet()) {
            iComputeMessageSize += mapEntryLite.computeMessageSize(i, entry.getKey(), entry.getValue());
        }
        return iComputeMessageSize;
    }

    private static <K, V> MapFieldLite<K, V> mergeFromLite(Object obj, Object obj2) {
        MapFieldLite<K, V> mapFieldLiteMutableCopy = (MapFieldLite) obj;
        MapFieldLite<K, V> mapFieldLite = (MapFieldLite) obj2;
        if (!mapFieldLite.isEmpty()) {
            if (!mapFieldLiteMutableCopy.isMutable()) {
                mapFieldLiteMutableCopy = mapFieldLiteMutableCopy.mutableCopy();
            }
            mapFieldLiteMutableCopy.mergeFrom(mapFieldLite);
        }
        return mapFieldLiteMutableCopy;
    }

    @Override // com.google.protobuf.adultoid
    public Map<?, ?> forMapData(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // com.google.protobuf.adultoid
    public MapEntryLite.saneness<?, ?> forMapMetadata(Object obj) {
        return ((MapEntryLite) obj).getMetadata();
    }

    @Override // com.google.protobuf.adultoid
    public Map<?, ?> forMutableMapData(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // com.google.protobuf.adultoid
    public int getSerializedSize(int i, Object obj, Object obj2) {
        return getSerializedSizeLite(i, obj, obj2);
    }

    @Override // com.google.protobuf.adultoid
    public boolean isImmutable(Object obj) {
        return !((MapFieldLite) obj).isMutable();
    }

    @Override // com.google.protobuf.adultoid
    public Object mergeFrom(Object obj, Object obj2) {
        return mergeFromLite(obj, obj2);
    }

    @Override // com.google.protobuf.adultoid
    public Object newMapField(Object obj) {
        return MapFieldLite.emptyMapField().mutableCopy();
    }

    @Override // com.google.protobuf.adultoid
    public Object toImmutable(Object obj) {
        ((MapFieldLite) obj).makeImmutable();
        return obj;
    }
}
