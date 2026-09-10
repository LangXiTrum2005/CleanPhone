package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2135p0 {
    public final Object defaultKey;
    public final Object defaultValue;
    public final WireFormat.FieldType keyType;
    public final WireFormat.FieldType valueType;

    public C2135p0(WireFormat.FieldType fieldType, Object obj, WireFormat.FieldType fieldType2, Object obj2) {
        this.keyType = fieldType;
        this.defaultKey = obj;
        this.valueType = fieldType2;
        this.defaultValue = obj2;
    }
}
