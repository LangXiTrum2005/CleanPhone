package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c2 implements FieldSet$FieldDescriptorLite {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Internal.EnumLiteMap f24783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WireFormat.FieldType f24785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f24786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f24787e;

    public c2(Internal.EnumLiteMap enumLiteMap, int i10, WireFormat.FieldType fieldType, boolean z10, boolean z11) {
        this.f24783a = enumLiteMap;
        this.f24784b = i10;
        this.f24785c = fieldType;
        this.f24786d = z10;
        this.f24787e = z11;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f24784b - ((c2) obj).f24784b;
    }

    @Override // com.google.protobuf.FieldSet$FieldDescriptorLite
    public final Internal.EnumLiteMap getEnumType() {
        return this.f24783a;
    }

    @Override // com.google.protobuf.FieldSet$FieldDescriptorLite
    public final WireFormat.JavaType getLiteJavaType() {
        return this.f24785c.getJavaType();
    }

    @Override // com.google.protobuf.FieldSet$FieldDescriptorLite
    public final WireFormat.FieldType getLiteType() {
        return this.f24785c;
    }

    @Override // com.google.protobuf.FieldSet$FieldDescriptorLite
    public final int getNumber() {
        return this.f24784b;
    }

    @Override // com.google.protobuf.FieldSet$FieldDescriptorLite
    public final MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite) {
        return ((GeneratedMessageLite.Builder) builder).mergeFrom((GeneratedMessageLite) messageLite);
    }

    @Override // com.google.protobuf.FieldSet$FieldDescriptorLite
    public final boolean isPacked() {
        return this.f24787e;
    }

    @Override // com.google.protobuf.FieldSet$FieldDescriptorLite
    public final boolean isRepeated() {
        return this.f24786d;
    }
}
