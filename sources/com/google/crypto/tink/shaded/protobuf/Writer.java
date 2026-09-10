package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface Writer {

    public enum FieldOrder {
        ASCENDING,
        DESCENDING
    }

    <K, V> void attabal(int i, restrictive.attabal<K, V> attabalVar, Map<K, V> map) throws IOException;

    @Deprecated
    void beachfront(int i, List<?> list, premeiotic premeioticVar) throws IOException;

    void dern(int i, List<?> list, premeiotic premeioticVar) throws IOException;

    FieldOrder fieldOrder();

    void marial(int i, Object obj, premeiotic premeioticVar) throws IOException;

    @Deprecated
    void saneness(int i, Object obj, premeiotic premeioticVar) throws IOException;

    void wireman(int i, ByteString byteString) throws IOException;

    void writeBool(int i, boolean z) throws IOException;

    void writeBoolList(int i, List<Boolean> list, boolean z) throws IOException;

    void writeBytesList(int i, List<ByteString> list) throws IOException;

    void writeDouble(int i, double d) throws IOException;

    void writeDoubleList(int i, List<Double> list, boolean z) throws IOException;

    @Deprecated
    void writeEndGroup(int i) throws IOException;

    void writeEnum(int i, int i2) throws IOException;

    void writeEnumList(int i, List<Integer> list, boolean z) throws IOException;

    void writeFixed32(int i, int i2) throws IOException;

    void writeFixed32List(int i, List<Integer> list, boolean z) throws IOException;

    void writeFixed64(int i, long j) throws IOException;

    void writeFixed64List(int i, List<Long> list, boolean z) throws IOException;

    void writeFloat(int i, float f) throws IOException;

    void writeFloatList(int i, List<Float> list, boolean z) throws IOException;

    void writeInt32(int i, int i2) throws IOException;

    void writeInt32List(int i, List<Integer> list, boolean z) throws IOException;

    void writeInt64(int i, long j) throws IOException;

    void writeInt64List(int i, List<Long> list, boolean z) throws IOException;

    void writeMessageSetItem(int i, Object obj) throws IOException;

    void writeSFixed32(int i, int i2) throws IOException;

    void writeSFixed32List(int i, List<Integer> list, boolean z) throws IOException;

    void writeSFixed64(int i, long j) throws IOException;

    void writeSFixed64List(int i, List<Long> list, boolean z) throws IOException;

    void writeSInt32(int i, int i2) throws IOException;

    void writeSInt32List(int i, List<Integer> list, boolean z) throws IOException;

    void writeSInt64(int i, long j) throws IOException;

    void writeSInt64List(int i, List<Long> list, boolean z) throws IOException;

    @Deprecated
    void writeStartGroup(int i) throws IOException;

    void writeString(int i, String str) throws IOException;

    void writeStringList(int i, List<String> list) throws IOException;

    void writeUInt32(int i, int i2) throws IOException;

    void writeUInt32List(int i, List<Integer> list, boolean z) throws IOException;

    void writeUInt64(int i, long j) throws IOException;

    void writeUInt64List(int i, List<Long> list, boolean z) throws IOException;
}
