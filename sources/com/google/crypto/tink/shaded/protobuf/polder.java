package com.google.crypto.tink.shaded.protobuf;

import java.util.Map;

/* JADX INFO: compiled from: MapFieldSchemaLite.java */
/* JADX INFO: loaded from: classes3.dex */
public final class polder implements merc {
    public static <K, V> int attabal(int i, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        restrictive restrictiveVar = (restrictive) obj2;
        int iAttabal = 0;
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : mapFieldLite.entrySet()) {
            iAttabal += restrictiveVar.attabal(i, entry.getKey(), entry.getValue());
        }
        return iAttabal;
    }

    public static <K, V> MapFieldLite<K, V> saneness(Object obj, Object obj2) {
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

    @Override // com.google.crypto.tink.shaded.protobuf.merc
    public Map<?, ?> forMapData(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.merc
    public restrictive.attabal<?, ?> forMapMetadata(Object obj) {
        ((restrictive) obj).dern();
        return null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.merc
    public Map<?, ?> forMutableMapData(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.merc
    public int getSerializedSize(int i, Object obj, Object obj2) {
        return attabal(i, obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.merc
    public boolean isImmutable(Object obj) {
        return !((MapFieldLite) obj).isMutable();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.merc
    public Object mergeFrom(Object obj, Object obj2) {
        return saneness(obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.merc
    public Object newMapField(Object obj) {
        return MapFieldLite.emptyMapField().mutableCopy();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.merc
    public Object toImmutable(Object obj) {
        ((MapFieldLite) obj).makeImmutable();
        return obj;
    }
}
