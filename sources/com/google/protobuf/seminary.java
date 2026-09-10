package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: Schema.java */
/* JADX INFO: loaded from: classes3.dex */
public interface seminary<T> {
    boolean equals(T t, T t2);

    int getSerializedSize(T t);

    int hashCode(T t);

    boolean isInitialized(T t);

    void makeImmutable(T t);

    void mergeFrom(T t, polder polderVar, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    void mergeFrom(T t, T t2);

    void mergeFrom(T t, byte[] bArr, int i, int i2, dern.saneness sanenessVar) throws IOException;

    T newInstance();

    void writeTo(T t, Writer writer) throws IOException;
}
