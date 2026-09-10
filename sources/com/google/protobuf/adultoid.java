package com.google.protobuf;

import java.util.Map;

/* JADX INFO: compiled from: MapFieldSchema.java */
/* JADX INFO: loaded from: classes3.dex */
public interface adultoid {
    Map<?, ?> forMapData(Object obj);

    MapEntryLite.saneness<?, ?> forMapMetadata(Object obj);

    Map<?, ?> forMutableMapData(Object obj);

    int getSerializedSize(int i, Object obj, Object obj2);

    boolean isImmutable(Object obj);

    Object mergeFrom(Object obj, Object obj2);

    Object newMapField(Object obj);

    Object toImmutable(Object obj);
}
