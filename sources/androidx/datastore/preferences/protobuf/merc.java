package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: compiled from: MapFieldSchemaLite.java */
/* JADX INFO: loaded from: classes.dex */
public final class merc implements restrictive {
    public static <K, V> int attabal(int i, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        supplicat supplicatVar = (supplicat) obj2;
        int iAttabal = 0;
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : mapFieldLite.entrySet()) {
            iAttabal += supplicatVar.attabal(i, entry.getKey(), entry.getValue());
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

    @Override // androidx.datastore.preferences.protobuf.restrictive
    public Map<?, ?> forMapData(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.restrictive
    public supplicat.attabal<?, ?> forMapMetadata(Object obj) {
        return ((supplicat) obj).dern();
    }

    @Override // androidx.datastore.preferences.protobuf.restrictive
    public Map<?, ?> forMutableMapData(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.restrictive
    public int getSerializedSize(int i, Object obj, Object obj2) {
        return attabal(i, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.restrictive
    public boolean isImmutable(Object obj) {
        return !((MapFieldLite) obj).isMutable();
    }

    @Override // androidx.datastore.preferences.protobuf.restrictive
    public Object mergeFrom(Object obj, Object obj2) {
        return saneness(obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.restrictive
    public Object newMapField(Object obj) {
        return MapFieldLite.emptyMapField().mutableCopy();
    }

    @Override // androidx.datastore.preferences.protobuf.restrictive
    public Object toImmutable(Object obj) {
        ((MapFieldLite) obj).makeImmutable();
        return obj;
    }
}
