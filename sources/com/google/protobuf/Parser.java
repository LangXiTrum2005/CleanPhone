package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface Parser<MessageType> {
    MessageType parseDelimitedFrom(InputStream inputStream) throws InvalidProtocolBufferException;

    MessageType parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;

    MessageType parseFrom(ByteString byteString) throws InvalidProtocolBufferException;

    MessageType parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;

    MessageType parseFrom(CodedInputStream codedInputStream) throws InvalidProtocolBufferException;

    MessageType parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;

    MessageType parseFrom(InputStream inputStream) throws InvalidProtocolBufferException;

    MessageType parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;

    MessageType parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException;

    MessageType parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;

    MessageType parseFrom(byte[] bArr) throws InvalidProtocolBufferException;

    MessageType parseFrom(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException;

    MessageType parseFrom(byte[] bArr, int i10, int i11, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;

    MessageType parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;

    MessageType parsePartialDelimitedFrom(InputStream inputStream) throws InvalidProtocolBufferException;

    MessageType parsePartialDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;

    MessageType parsePartialFrom(ByteString byteString) throws InvalidProtocolBufferException;

    MessageType parsePartialFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;

    MessageType parsePartialFrom(CodedInputStream codedInputStream) throws InvalidProtocolBufferException;

    MessageType parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;

    MessageType parsePartialFrom(InputStream inputStream) throws InvalidProtocolBufferException;

    MessageType parsePartialFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;

    MessageType parsePartialFrom(byte[] bArr) throws InvalidProtocolBufferException;

    MessageType parsePartialFrom(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException;

    MessageType parsePartialFrom(byte[] bArr, int i10, int i11, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;

    MessageType parsePartialFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;
}
