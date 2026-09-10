package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: MessageSetSchema.java */
/* JADX INFO: loaded from: classes3.dex */
public final class stratoscope<T> implements seminary<T> {
    private final MessageLite defaultInstance;
    private final cutely<?> extensionSchema;
    private final boolean hasExtensions;
    private final starveling<?, ?> unknownFieldSchema;

    private stratoscope(starveling<?, ?> starvelingVar, cutely<?> cutelyVar, MessageLite messageLite) {
        this.unknownFieldSchema = starvelingVar;
        this.hasExtensions = cutelyVar.hasExtensions(messageLite);
        this.extensionSchema = cutelyVar;
        this.defaultInstance = messageLite;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(starveling<UT, UB> starvelingVar, T t) {
        return starvelingVar.getSerializedSizeAsMessageSet(starvelingVar.getFromMessage(t));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(starveling<UT, UB> starvelingVar, cutely<ET> cutelyVar, T t, polder polderVar, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
        starveling<UT, UB> starvelingVar2;
        UB builderFromMessage = starvelingVar.getBuilderFromMessage(t);
        Object mutableExtensions = cutelyVar.getMutableExtensions(t);
        while (polderVar.getFieldNumber() != Integer.MAX_VALUE) {
            try {
                starvelingVar2 = starvelingVar;
                cutely<ET> cutelyVar2 = cutelyVar;
                polder polderVar2 = polderVar;
                ExtensionRegistryLite extensionRegistryLite2 = extensionRegistryLite;
                try {
                    if (!parseMessageSetItemOrUnknownField(polderVar2, extensionRegistryLite2, cutelyVar2, mutableExtensions, starvelingVar2, builderFromMessage)) {
                        starvelingVar2.setBuilderToMessage(t, builderFromMessage);
                        return;
                    }
                    polderVar = polderVar2;
                    extensionRegistryLite = extensionRegistryLite2;
                    cutelyVar = cutelyVar2;
                    starvelingVar = starvelingVar2;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    starvelingVar2.setBuilderToMessage(t, builderFromMessage);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                starvelingVar2 = starvelingVar;
            }
        }
        starvelingVar.setBuilderToMessage(t, builderFromMessage);
    }

    public static <T> stratoscope<T> newSchema(starveling<?, ?> starvelingVar, cutely<?> cutelyVar, MessageLite messageLite) {
        return new stratoscope<>(starvelingVar, cutelyVar, messageLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends FieldSet.FieldDescriptorLite<ET>> boolean parseMessageSetItemOrUnknownField(polder polderVar, ExtensionRegistryLite extensionRegistryLite, cutely<ET> cutelyVar, FieldSet<ET> fieldSet, starveling<UT, UB> starvelingVar, UB ub) throws IOException {
        int tag = polderVar.getTag();
        int uInt32 = 0;
        if (tag != WireFormat.MESSAGE_SET_ITEM_TAG) {
            if (WireFormat.getTagWireType(tag) != 2) {
                return polderVar.skipField();
            }
            Object objFindExtensionByNumber = cutelyVar.findExtensionByNumber(extensionRegistryLite, this.defaultInstance, WireFormat.getTagFieldNumber(tag));
            if (objFindExtensionByNumber == null) {
                return starvelingVar.mergeOneFieldFrom(ub, polderVar, 0);
            }
            cutelyVar.parseLengthPrefixedMessageSetItem(polderVar, objFindExtensionByNumber, extensionRegistryLite, fieldSet);
            return true;
        }
        Object objFindExtensionByNumber2 = null;
        ByteString bytes = null;
        while (polderVar.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = polderVar.getTag();
            if (tag2 == WireFormat.MESSAGE_SET_TYPE_ID_TAG) {
                uInt32 = polderVar.readUInt32();
                objFindExtensionByNumber2 = cutelyVar.findExtensionByNumber(extensionRegistryLite, this.defaultInstance, uInt32);
            } else if (tag2 == WireFormat.MESSAGE_SET_MESSAGE_TAG) {
                if (objFindExtensionByNumber2 != null) {
                    cutelyVar.parseLengthPrefixedMessageSetItem(polderVar, objFindExtensionByNumber2, extensionRegistryLite, fieldSet);
                } else {
                    bytes = polderVar.readBytes();
                }
            } else if (!polderVar.skipField()) {
                break;
            }
        }
        if (polderVar.getTag() != WireFormat.MESSAGE_SET_ITEM_END_TAG) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        if (bytes != null) {
            if (objFindExtensionByNumber2 != null) {
                cutelyVar.parseMessageSetItem(bytes, objFindExtensionByNumber2, extensionRegistryLite, fieldSet);
            } else {
                starvelingVar.addLengthDelimited(ub, uInt32, bytes);
            }
        }
        return true;
    }

    private <UT, UB> void writeUnknownFieldsHelper(starveling<UT, UB> starvelingVar, T t, Writer writer) throws IOException {
        starvelingVar.writeAsMessageSetTo(starvelingVar.getFromMessage(t), writer);
    }

    @Override // com.google.protobuf.seminary
    public boolean equals(T t, T t2) {
        if (!this.unknownFieldSchema.getFromMessage(t).equals(this.unknownFieldSchema.getFromMessage(t2))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(t).equals(this.extensionSchema.getExtensions(t2));
        }
        return true;
    }

    @Override // com.google.protobuf.seminary
    public int getSerializedSize(T t) {
        int unknownFieldsSerializedSize = getUnknownFieldsSerializedSize(this.unknownFieldSchema, t);
        return this.hasExtensions ? unknownFieldsSerializedSize + this.extensionSchema.getExtensions(t).getMessageSetSerializedSize() : unknownFieldsSerializedSize;
    }

    @Override // com.google.protobuf.seminary
    public int hashCode(T t) {
        int iHashCode = this.unknownFieldSchema.getFromMessage(t).hashCode();
        return this.hasExtensions ? (iHashCode * 53) + this.extensionSchema.getExtensions(t).hashCode() : iHashCode;
    }

    @Override // com.google.protobuf.seminary
    public final boolean isInitialized(T t) {
        return this.extensionSchema.getExtensions(t).isInitialized();
    }

    @Override // com.google.protobuf.seminary
    public void makeImmutable(T t) {
        this.unknownFieldSchema.makeImmutable(t);
        this.extensionSchema.makeImmutable(t);
    }

    @Override // com.google.protobuf.seminary
    public void mergeFrom(T t, T t2) {
        saran.mergeUnknownFields(this.unknownFieldSchema, t, t2);
        if (this.hasExtensions) {
            saran.mergeExtensions(this.extensionSchema, t, t2);
        }
    }

    @Override // com.google.protobuf.seminary
    public T newInstance() {
        MessageLite messageLite = this.defaultInstance;
        return messageLite instanceof GeneratedMessageLite ? (T) ((GeneratedMessageLite) messageLite).newMutableInstance() : (T) messageLite.newBuilderForType().buildPartial();
    }

    @Override // com.google.protobuf.seminary
    public void writeTo(T t, Writer writer) throws IOException {
        for (T t2 : this.extensionSchema.getExtensions(t)) {
            FieldSet.FieldDescriptorLite fieldDescriptorLite = (FieldSet.FieldDescriptorLite) t2.getKey();
            if (fieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE || fieldDescriptorLite.isRepeated() || fieldDescriptorLite.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (t2 instanceof LazyField.saneness) {
                writer.writeMessageSetItem(fieldDescriptorLite.getNumber(), ((LazyField.saneness) t2).getField().toByteString());
            } else {
                writer.writeMessageSetItem(fieldDescriptorLite.getNumber(), t2.getValue());
            }
        }
        writeUnknownFieldsHelper(this.unknownFieldSchema, t, writer);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cf A[EDGE_INSN: B:62:0x00cf->B:34:0x00cf BREAK  A[LOOP:1: B:17:0x006f->B:65:0x006f], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.seminary
    public void mergeFrom(T t, byte[] bArr, int i, int i2, dern.saneness sanenessVar) throws IOException {
        int iDecodeVarint32;
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t;
        UnknownFieldSetLite unknownFieldSetLiteNewInstance = generatedMessageLite.unknownFields;
        if (unknownFieldSetLiteNewInstance == UnknownFieldSetLite.getDefaultInstance()) {
            unknownFieldSetLiteNewInstance = UnknownFieldSetLite.newInstance();
            generatedMessageLite.unknownFields = unknownFieldSetLiteNewInstance;
        }
        UnknownFieldSetLite unknownFieldSetLite = unknownFieldSetLiteNewInstance;
        FieldSet<GeneratedMessageLite.saneness> fieldSetEnsureExtensionsAreMutable = ((GeneratedMessageLite.ExtendableMessage) t).ensureExtensionsAreMutable();
        GeneratedMessageLite.GeneratedExtension generatedExtension = null;
        while (i < i2) {
            int iDecodeVarint33 = dern.decodeVarint32(bArr, i, sanenessVar);
            int i3 = sanenessVar.int1;
            if (i3 == WireFormat.MESSAGE_SET_ITEM_TAG) {
                int i4 = i2;
                dern.saneness sanenessVar2 = sanenessVar;
                int i5 = 0;
                ByteString byteString = null;
                while (true) {
                    if (iDecodeVarint33 >= i4) {
                        iDecodeVarint32 = iDecodeVarint33;
                        break;
                    }
                    iDecodeVarint32 = dern.decodeVarint32(bArr, iDecodeVarint33, sanenessVar2);
                    int i6 = sanenessVar2.int1;
                    int tagFieldNumber = WireFormat.getTagFieldNumber(i6);
                    int tagWireType = WireFormat.getTagWireType(i6);
                    if (tagFieldNumber != 2) {
                        if (tagFieldNumber == 3) {
                            if (generatedExtension != null) {
                                iDecodeVarint33 = dern.decodeMessageField(supplicat.getInstance().schemaFor((Class) generatedExtension.getMessageDefaultInstance().getClass()), bArr, iDecodeVarint32, i4, sanenessVar2);
                                fieldSetEnsureExtensionsAreMutable.setField(generatedExtension.descriptor, sanenessVar2.object1);
                            } else if (tagWireType == 2) {
                                iDecodeVarint33 = dern.decodeBytes(bArr, iDecodeVarint32, sanenessVar2);
                                byteString = (ByteString) sanenessVar2.object1;
                            }
                        }
                        if (i6 == WireFormat.MESSAGE_SET_ITEM_END_TAG) {
                            break;
                        } else {
                            iDecodeVarint33 = dern.skipField(i6, bArr, iDecodeVarint32, i4, sanenessVar2);
                        }
                    } else if (tagWireType == 0) {
                        iDecodeVarint33 = dern.decodeVarint32(bArr, iDecodeVarint32, sanenessVar2);
                        i5 = sanenessVar2.int1;
                        generatedExtension = (GeneratedMessageLite.GeneratedExtension) this.extensionSchema.findExtensionByNumber(sanenessVar2.extensionRegistry, this.defaultInstance, i5);
                    } else {
                        if (i6 == WireFormat.MESSAGE_SET_ITEM_END_TAG) {
                            break;
                            break;
                        }
                        iDecodeVarint33 = dern.skipField(i6, bArr, iDecodeVarint32, i4, sanenessVar2);
                    }
                }
                if (byteString != null) {
                    unknownFieldSetLite.storeField(WireFormat.makeTag(i5, 2), byteString);
                }
                i = iDecodeVarint32;
                i2 = i4;
                sanenessVar = sanenessVar2;
            } else if (WireFormat.getTagWireType(i3) == 2) {
                generatedExtension = (GeneratedMessageLite.GeneratedExtension) this.extensionSchema.findExtensionByNumber(sanenessVar.extensionRegistry, this.defaultInstance, WireFormat.getTagFieldNumber(i3));
                if (generatedExtension != null) {
                    i = dern.decodeMessageField(supplicat.getInstance().schemaFor((Class) generatedExtension.getMessageDefaultInstance().getClass()), bArr, iDecodeVarint33, i2, sanenessVar);
                    fieldSetEnsureExtensionsAreMutable.setField(generatedExtension.descriptor, sanenessVar.object1);
                } else {
                    i = dern.decodeUnknownField(i3, bArr, iDecodeVarint33, i2, unknownFieldSetLite, sanenessVar);
                }
            } else {
                i = dern.skipField(i3, bArr, iDecodeVarint33, i2, sanenessVar);
            }
        }
        if (i != i2) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    @Override // com.google.protobuf.seminary
    public void mergeFrom(T t, polder polderVar, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, t, polderVar, extensionRegistryLite);
    }
}
