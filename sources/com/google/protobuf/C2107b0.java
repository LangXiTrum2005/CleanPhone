package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2107b0 implements FieldSet$FieldDescriptorLite {
    final Internal.EnumLiteMap<?> enumTypeMap;
    final boolean isPacked;
    final boolean isRepeated;
    final int number;
    final WireFormat.FieldType type;

    public C2107b0(Internal.EnumLiteMap<?> enumLiteMap, int i, WireFormat.FieldType fieldType, boolean z, boolean z2) {
        this.enumTypeMap = enumLiteMap;
        this.number = i;
        this.type = fieldType;
        this.isRepeated = z;
        this.isPacked = z2;
    }

    @Override // com.google.protobuf.FieldSet$FieldDescriptorLite
    public Internal.EnumLiteMap<?> getEnumType() {
        return this.enumTypeMap;
    }

    @Override // com.google.protobuf.FieldSet$FieldDescriptorLite
    public WireFormat.JavaType getLiteJavaType() {
        return this.type.getJavaType();
    }

    @Override // com.google.protobuf.FieldSet$FieldDescriptorLite
    public WireFormat.FieldType getLiteType() {
        return this.type;
    }

    @Override // com.google.protobuf.FieldSet$FieldDescriptorLite
    public int getNumber() {
        return this.number;
    }

    @Override // com.google.protobuf.FieldSet$FieldDescriptorLite
    public MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite) {
        return ((GeneratedMessageLite.Builder) builder).mergeFrom((GeneratedMessageLite) messageLite);
    }

    @Override // com.google.protobuf.FieldSet$FieldDescriptorLite
    public boolean isPacked() {
        return this.isPacked;
    }

    @Override // com.google.protobuf.FieldSet$FieldDescriptorLite
    public boolean isRepeated() {
        return this.isRepeated;
    }

    @Override // java.lang.Comparable
    public int compareTo(C2107b0 c2107b0) {
        return this.number - c2107b0.number;
    }
}
