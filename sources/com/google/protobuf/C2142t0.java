package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3913kt;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3334eH;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4754uW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3578h30;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3642hm0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.R5;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2142t0 implements InterfaceC3578h30 {
    private final MessageLite defaultInstance;
    private final AbstractC3913kt extensionSchema;
    private final boolean hasExtensions;
    private final O0 unknownFieldSchema;

    private C2142t0(O0 o0, AbstractC3913kt abstractC3913kt, MessageLite messageLite) {
        this.unknownFieldSchema = o0;
        this.hasExtensions = abstractC3913kt.hasExtensions(messageLite);
        this.extensionSchema = abstractC3913kt;
        this.defaultInstance = messageLite;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(O0 o0, Object obj) {
        return o0.getSerializedSizeAsMessageSet(o0.getFromMessage(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends FieldSet$FieldDescriptorLite<ET>> void mergeFromHelper(O0 o0, AbstractC3913kt abstractC3913kt, Object obj, AX ax, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        C2139s c2139s;
        Object builderFromMessage = o0.getBuilderFromMessage(obj);
        W mutableExtensions = abstractC3913kt.getMutableExtensions(obj);
        do {
            try {
                c2139s = (C2139s) ax;
                if (c2139s.getFieldNumber() == Integer.MAX_VALUE) {
                    return;
                }
            } finally {
                o0.setBuilderToMessage(obj, builderFromMessage);
            }
        } while (parseMessageSetItemOrUnknownField(c2139s, extensionRegistryLite, abstractC3913kt, mutableExtensions, o0, builderFromMessage));
    }

    public static <T> C2142t0 newSchema(O0 o0, AbstractC3913kt abstractC3913kt, MessageLite messageLite) {
        return new C2142t0(o0, abstractC3913kt, messageLite);
    }

    private <UT, UB, ET extends FieldSet$FieldDescriptorLite<ET>> boolean parseMessageSetItemOrUnknownField(AX ax, ExtensionRegistryLite extensionRegistryLite, AbstractC3913kt abstractC3913kt, W w, O0 o0, UB ub) throws IOException {
        C2139s c2139s = (C2139s) ax;
        int tag = c2139s.getTag();
        if (tag != WireFormat.MESSAGE_SET_ITEM_TAG) {
            if (WireFormat.getTagWireType(tag) != 2) {
                return c2139s.skipField();
            }
            Object objFindExtensionByNumber = abstractC3913kt.findExtensionByNumber(extensionRegistryLite, this.defaultInstance, WireFormat.getTagFieldNumber(tag));
            if (objFindExtensionByNumber == null) {
                return o0.mergeOneFieldFrom(ub, c2139s);
            }
            abstractC3913kt.parseLengthPrefixedMessageSetItem(c2139s, objFindExtensionByNumber, extensionRegistryLite, w);
            return true;
        }
        Object objFindExtensionByNumber2 = null;
        ByteString bytes = null;
        int uInt32 = 0;
        while (c2139s.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = c2139s.getTag();
            if (tag2 == WireFormat.MESSAGE_SET_TYPE_ID_TAG) {
                uInt32 = c2139s.readUInt32();
                objFindExtensionByNumber2 = abstractC3913kt.findExtensionByNumber(extensionRegistryLite, this.defaultInstance, uInt32);
            } else if (tag2 == WireFormat.MESSAGE_SET_MESSAGE_TAG) {
                if (objFindExtensionByNumber2 != null) {
                    abstractC3913kt.parseLengthPrefixedMessageSetItem(c2139s, objFindExtensionByNumber2, extensionRegistryLite, w);
                } else {
                    bytes = c2139s.readBytes();
                }
            } else if (!c2139s.skipField()) {
                break;
            }
        }
        if (c2139s.getTag() != WireFormat.MESSAGE_SET_ITEM_END_TAG) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        if (bytes != null) {
            if (objFindExtensionByNumber2 != null) {
                abstractC3913kt.parseMessageSetItem(bytes, objFindExtensionByNumber2, extensionRegistryLite, w);
            } else {
                o0.addLengthDelimited(ub, uInt32, bytes);
            }
        }
        return true;
    }

    private <UT, UB> void writeUnknownFieldsHelper(O0 o0, Object obj, InterfaceC3642hm0 interfaceC3642hm0) throws IOException {
        o0.writeAsMessageSetTo(o0.getFromMessage(obj), interfaceC3642hm0);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3578h30
    public boolean equals(Object obj, Object obj2) {
        if (!this.unknownFieldSchema.getFromMessage(obj).equals(this.unknownFieldSchema.getFromMessage(obj2))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(obj).equals(this.extensionSchema.getExtensions(obj2));
        }
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3578h30
    public int getSerializedSize(Object obj) {
        int unknownFieldsSerializedSize = getUnknownFieldsSerializedSize(this.unknownFieldSchema, obj);
        return this.hasExtensions ? unknownFieldsSerializedSize + this.extensionSchema.getExtensions(obj).getMessageSetSerializedSize() : unknownFieldsSerializedSize;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3578h30
    public int hashCode(Object obj) {
        int iHashCode = this.unknownFieldSchema.getFromMessage(obj).hashCode();
        return this.hasExtensions ? (iHashCode * 53) + this.extensionSchema.getExtensions(obj).hashCode() : iHashCode;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3578h30
    public final boolean isInitialized(Object obj) {
        return this.extensionSchema.getExtensions(obj).isInitialized();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3578h30
    public void makeImmutable(Object obj) {
        this.unknownFieldSchema.makeImmutable(obj);
        this.extensionSchema.makeImmutable(obj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3578h30
    public void mergeFrom(Object obj, Object obj2) {
        D0.mergeUnknownFields(this.unknownFieldSchema, obj, obj2);
        if (this.hasExtensions) {
            D0.mergeExtensions(this.extensionSchema, obj, obj2);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3578h30
    public Object newInstance() {
        MessageLite messageLite = this.defaultInstance;
        return messageLite instanceof GeneratedMessageLite ? ((GeneratedMessageLite) messageLite).newMutableInstance() : messageLite.newBuilderForType().buildPartial();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3578h30
    public void writeTo(Object obj, InterfaceC3642hm0 interfaceC3642hm0) throws IOException {
        for (Map.Entry<FieldSet$FieldDescriptorLite<Object>, Object> entry : this.extensionSchema.getExtensions(obj)) {
            FieldSet$FieldDescriptorLite<Object> key = entry.getKey();
            if (key.getLiteJavaType() != WireFormat.JavaType.MESSAGE || key.isRepeated() || key.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof C3334eH) {
                ((A) interfaceC3642hm0).writeMessageSetItem(key.getNumber(), ((C3334eH) entry).getField().toByteString());
            } else {
                ((A) interfaceC3642hm0).writeMessageSetItem(key.getNumber(), entry.getValue());
            }
        }
        writeUnknownFieldsHelper(this.unknownFieldSchema, obj, interfaceC3642hm0);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cb A[EDGE_INSN: B:58:0x00cb->B:34:0x00cb BREAK  A[LOOP:1: B:18:0x006d->B:61:0x006d], SYNTHETIC] */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3578h30
    public void mergeFrom(Object obj, byte[] bArr, int i, int i2, R5 r5) throws IOException {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLiteNewInstance = generatedMessageLite.unknownFields;
        if (unknownFieldSetLiteNewInstance == UnknownFieldSetLite.getDefaultInstance()) {
            unknownFieldSetLiteNewInstance = UnknownFieldSetLite.newInstance();
            generatedMessageLite.unknownFields = unknownFieldSetLiteNewInstance;
        }
        W wEnsureExtensionsAreMutable = ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable();
        GeneratedMessageLite.GeneratedExtension generatedExtension = null;
        while (i < i2) {
            int iDecodeVarint32 = C2114f.decodeVarint32(bArr, i, r5);
            int i3 = r5.int1;
            if (i3 == WireFormat.MESSAGE_SET_ITEM_TAG) {
                int i4 = 0;
                ByteString byteString = null;
                while (iDecodeVarint32 < i2) {
                    iDecodeVarint32 = C2114f.decodeVarint32(bArr, iDecodeVarint32, r5);
                    int i5 = r5.int1;
                    int tagFieldNumber = WireFormat.getTagFieldNumber(i5);
                    int tagWireType = WireFormat.getTagWireType(i5);
                    if (tagFieldNumber != 2) {
                        if (tagFieldNumber == 3) {
                            if (generatedExtension != null) {
                                iDecodeVarint32 = C2114f.decodeMessageField(C4754uW.getInstance().schemaFor((Class) generatedExtension.getMessageDefaultInstance().getClass()), bArr, iDecodeVarint32, i2, r5);
                                wEnsureExtensionsAreMutable.setField(generatedExtension.descriptor, r5.object1);
                            } else if (tagWireType == 2) {
                                iDecodeVarint32 = C2114f.decodeBytes(bArr, iDecodeVarint32, r5);
                                byteString = (ByteString) r5.object1;
                            }
                        }
                        if (i5 == WireFormat.MESSAGE_SET_ITEM_END_TAG) {
                            break;
                        } else {
                            iDecodeVarint32 = C2114f.skipField(i5, bArr, iDecodeVarint32, i2, r5);
                        }
                    } else if (tagWireType == 0) {
                        iDecodeVarint32 = C2114f.decodeVarint32(bArr, iDecodeVarint32, r5);
                        i4 = r5.int1;
                        generatedExtension = (GeneratedMessageLite.GeneratedExtension) this.extensionSchema.findExtensionByNumber(r5.extensionRegistry, this.defaultInstance, i4);
                    } else {
                        if (i5 == WireFormat.MESSAGE_SET_ITEM_END_TAG) {
                            break;
                            break;
                        }
                        iDecodeVarint32 = C2114f.skipField(i5, bArr, iDecodeVarint32, i2, r5);
                    }
                }
                if (byteString != null) {
                    unknownFieldSetLiteNewInstance.storeField(WireFormat.makeTag(i4, 2), byteString);
                }
                i = iDecodeVarint32;
            } else if (WireFormat.getTagWireType(i3) == 2) {
                GeneratedMessageLite.GeneratedExtension generatedExtension2 = (GeneratedMessageLite.GeneratedExtension) this.extensionSchema.findExtensionByNumber(r5.extensionRegistry, this.defaultInstance, WireFormat.getTagFieldNumber(i3));
                if (generatedExtension2 != null) {
                    i = C2114f.decodeMessageField(C4754uW.getInstance().schemaFor((Class) generatedExtension2.getMessageDefaultInstance().getClass()), bArr, iDecodeVarint32, i2, r5);
                    wEnsureExtensionsAreMutable.setField(generatedExtension2.descriptor, r5.object1);
                } else {
                    i = C2114f.decodeUnknownField(i3, bArr, iDecodeVarint32, i2, unknownFieldSetLiteNewInstance, r5);
                }
                generatedExtension = generatedExtension2;
            } else {
                i = C2114f.skipField(i3, bArr, iDecodeVarint32, i2, r5);
            }
        }
        if (i != i2) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3578h30
    public void mergeFrom(Object obj, AX ax, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, obj, ax, extensionRegistryLite);
    }
}
