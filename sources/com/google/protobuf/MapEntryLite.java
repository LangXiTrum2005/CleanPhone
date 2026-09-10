package com.google.protobuf;

import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class MapEntryLite<K, V> {
    private static final int KEY_FIELD_NUMBER = 1;
    private static final int VALUE_FIELD_NUMBER = 2;
    private final K key;
    private final w2 metadata;
    private final V value;

    private MapEntryLite(WireFormat.FieldType fieldType, K k8, WireFormat.FieldType fieldType2, V v4) {
        this.metadata = new w2(fieldType, k8, fieldType2, v4);
        this.key = k8;
        this.value = v4;
    }

    public static <K, V> int computeSerializedSize(w2 w2Var, K k8, V v4) {
        return v1.c(w2Var.f24990c, 2, v4) + v1.c(w2Var.f24988a, 1, k8);
    }

    public static <K, V> MapEntryLite<K, V> newDefaultInstance(WireFormat.FieldType fieldType, K k8, WireFormat.FieldType fieldType2, V v4) {
        return new MapEntryLite<>(fieldType, k8, fieldType2, v4);
    }

    public static <T> T parseField(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, WireFormat.FieldType fieldType, T t10) throws IOException {
        int i10 = v2.f24968a[fieldType.ordinal()];
        if (i10 == 1) {
            MessageLite.Builder builder = ((MessageLite) t10).toBuilder();
            codedInputStream.readMessage(builder, extensionRegistryLite);
            return (T) builder.buildPartial();
        }
        if (i10 == 2) {
            return (T) Integer.valueOf(codedInputStream.readEnum());
        }
        if (i10 == 3) {
            throw new RuntimeException("Groups are not allowed in maps.");
        }
        v1 v1Var = v1.f24964d;
        return (T) WireFormat.readPrimitiveField(codedInputStream, fieldType, k5.f24888b);
    }

    public static <K, V> void writeTo(CodedOutputStream codedOutputStream, w2 w2Var, K k8, V v4) throws IOException {
        v1.r(codedOutputStream, w2Var.f24988a, 1, k8);
        v1.r(codedOutputStream, w2Var.f24990c, 2, v4);
    }

    public int computeMessageSize(int i10, K k8, V v4) {
        return CodedOutputStream.computeLengthDelimitedFieldSize(computeSerializedSize(this.metadata, k8, v4)) + CodedOutputStream.computeTagSize(i10);
    }

    public K getKey() {
        return this.key;
    }

    public w2 getMetadata() {
        return this.metadata;
    }

    public V getValue() {
        return this.value;
    }

    public Map.Entry<K, V> parseEntry(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return parseEntry(byteString.newCodedInput(), this.metadata, extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void parseInto(MapFieldLite<K, V> mapFieldLite, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
        w2 w2Var = this.metadata;
        Object field = w2Var.f24989b;
        Object field2 = w2Var.f24991d;
        while (true) {
            int tag = codedInputStream.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == WireFormat.makeTag(1, this.metadata.f24988a.getWireType())) {
                field = parseField(codedInputStream, extensionRegistryLite, this.metadata.f24988a, field);
            } else if (tag == WireFormat.makeTag(2, this.metadata.f24990c.getWireType())) {
                field2 = parseField(codedInputStream, extensionRegistryLite, this.metadata.f24990c, field2);
            } else if (!codedInputStream.skipField(tag)) {
                break;
            }
        }
        codedInputStream.checkLastTagWas(0);
        codedInputStream.popLimit(iPushLimit);
        mapFieldLite.put(field, field2);
    }

    public void serializeTo(CodedOutputStream codedOutputStream, int i10, K k8, V v4) throws IOException {
        codedOutputStream.writeTag(i10, 2);
        codedOutputStream.writeUInt32NoTag(computeSerializedSize(this.metadata, k8, v4));
        writeTo(codedOutputStream, this.metadata, k8, v4);
    }

    public static <K, V> Map.Entry<K, V> parseEntry(CodedInputStream codedInputStream, w2 w2Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        Object field = w2Var.f24989b;
        WireFormat.FieldType fieldType = w2Var.f24990c;
        WireFormat.FieldType fieldType2 = w2Var.f24988a;
        Object field2 = w2Var.f24991d;
        while (true) {
            int tag = codedInputStream.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == WireFormat.makeTag(1, fieldType2.getWireType())) {
                field = parseField(codedInputStream, extensionRegistryLite, fieldType2, field);
            } else if (tag == WireFormat.makeTag(2, fieldType.getWireType())) {
                field2 = parseField(codedInputStream, extensionRegistryLite, fieldType, field2);
            } else if (!codedInputStream.skipField(tag)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(field, field2);
    }

    private MapEntryLite(w2 w2Var, K k8, V v4) {
        this.metadata = w2Var;
        this.key = k8;
        this.value = v4;
    }
}
