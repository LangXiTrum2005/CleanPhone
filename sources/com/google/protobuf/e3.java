package com.google.protobuf;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class e3 implements x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessageLite f24821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q4 f24822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f24823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i1 f24824d;

    public e3(q4 q4Var, i1 i1Var, MessageLite messageLite) {
        this.f24822b = q4Var;
        ((k1) i1Var).getClass();
        this.f24823c = messageLite instanceof GeneratedMessageLite.ExtendableMessage;
        this.f24824d = i1Var;
        this.f24821a = messageLite;
    }

    @Override // com.google.protobuf.x3
    public final void a(Object obj, Object obj2) {
        y3.l(this.f24822b, obj, obj2);
        if (this.f24823c) {
            ((k1) this.f24824d).getClass();
            v1 v1Var = ((GeneratedMessageLite.ExtendableMessage) obj2).extensions;
            if (v1Var.f24965a.isEmpty()) {
                return;
            }
            ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable().n(v1Var);
        }
    }

    @Override // com.google.protobuf.x3
    public final void b(Object obj) {
        ((r4) this.f24822b).getClass();
        ((GeneratedMessageLite) obj).unknownFields.makeImmutable();
        ((k1) this.f24824d).getClass();
        ((GeneratedMessageLite.ExtendableMessage) obj).extensions.m();
    }

    @Override // com.google.protobuf.x3
    public final boolean c(Object obj) {
        ((k1) this.f24824d).getClass();
        return ((GeneratedMessageLite.ExtendableMessage) obj).extensions.j();
    }

    @Override // com.google.protobuf.x3
    public final Object d() {
        MessageLite messageLite = this.f24821a;
        return messageLite instanceof GeneratedMessageLite ? ((GeneratedMessageLite) messageLite).newMutableInstance() : messageLite.newBuilderForType().buildPartial();
    }

    @Override // com.google.protobuf.x3
    public final void e(MessageLite messageLite, l5 l5Var) throws IOException {
        ((k1) this.f24824d).getClass();
        Iterator itL = ((GeneratedMessageLite.ExtendableMessage) messageLite).extensions.l();
        while (itL.hasNext()) {
            Map.Entry entry = (Map.Entry) itL.next();
            FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite = (FieldSet$FieldDescriptorLite) entry.getKey();
            if (fieldSet$FieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE || fieldSet$FieldDescriptorLite.isRepeated() || fieldSet$FieldDescriptorLite.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof k2) {
                ((l0) l5Var).h(fieldSet$FieldDescriptorLite.getNumber(), ((LazyField) ((k2) entry).f24886a.getValue()).toByteString());
            } else {
                ((l0) l5Var).h(fieldSet$FieldDescriptorLite.getNumber(), entry.getValue());
            }
        }
        ((r4) this.f24822b).getClass();
        ((GeneratedMessageLite) messageLite).unknownFields.writeAsMessageSetTo(l5Var);
    }

    @Override // com.google.protobuf.x3
    public final int f(AbstractMessageLite abstractMessageLite) {
        ((r4) this.f24822b).getClass();
        int serializedSizeAsMessageSet = ((GeneratedMessageLite) abstractMessageLite).unknownFields.getSerializedSizeAsMessageSet();
        if (!this.f24823c) {
            return serializedSizeAsMessageSet;
        }
        ((k1) this.f24824d).getClass();
        return ((GeneratedMessageLite.ExtendableMessage) abstractMessageLite).extensions.g() + serializedSizeAsMessageSet;
    }

    @Override // com.google.protobuf.x3
    public final void g(Object obj, b0 b0Var, ExtensionRegistryLite extensionRegistryLite) {
        q4 q4Var = this.f24822b;
        UnknownFieldSetLite unknownFieldSetLiteA = q4Var.a(obj);
        i1 i1Var = this.f24824d;
        ((k1) i1Var).getClass();
        v1 v1VarEnsureExtensionsAreMutable = ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable();
        while (b0Var.a() != Integer.MAX_VALUE) {
            try {
                e3 e3Var = this;
                b0 b0Var2 = b0Var;
                ExtensionRegistryLite extensionRegistryLite2 = extensionRegistryLite;
                if (!e3Var.k(b0Var2, extensionRegistryLite2, i1Var, v1VarEnsureExtensionsAreMutable, q4Var, unknownFieldSetLiteA)) {
                    break;
                }
                this = e3Var;
                b0Var = b0Var2;
                extensionRegistryLite = extensionRegistryLite2;
            } finally {
                ((GeneratedMessageLite) obj).unknownFields = unknownFieldSetLiteA;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d5 A[EDGE_INSN: B:48:0x00d5->B:36:0x00d5 BREAK  A[LOOP:1: B:18:0x0076->B:26:0x00a7], SYNTHETIC] */
    @Override // com.google.protobuf.x3
    public final void h(Object obj, byte[] bArr, int i10, int i11, g gVar) throws InvalidProtocolBufferException {
        e3 e3Var = this;
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLiteNewInstance = generatedMessageLite.unknownFields;
        if (unknownFieldSetLiteNewInstance == UnknownFieldSetLite.getDefaultInstance()) {
            unknownFieldSetLiteNewInstance = UnknownFieldSetLite.newInstance();
            generatedMessageLite.unknownFields = unknownFieldSetLiteNewInstance;
        }
        UnknownFieldSetLite unknownFieldSetLite = unknownFieldSetLiteNewInstance;
        v1 v1VarEnsureExtensionsAreMutable = ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable();
        int iW = i10;
        GeneratedMessageLite.GeneratedExtension generatedExtension = null;
        while (iW < i11) {
            GeneratedMessageLite.GeneratedExtension generatedExtensionFindLiteExtensionByNumber = generatedExtension;
            int iR = h.r(bArr, iW, gVar);
            int i12 = gVar.f24836a;
            ExtensionRegistryLite extensionRegistryLite = gVar.f24839d;
            int i13 = WireFormat.MESSAGE_SET_ITEM_TAG;
            MessageLite messageLite = e3Var.f24821a;
            i1 i1Var = e3Var.f24824d;
            int i14 = 2;
            if (i12 == i13) {
                int i15 = 0;
                ByteString byteString = null;
                while (iR < i11) {
                    iR = h.r(bArr, iR, gVar);
                    int i16 = gVar.f24836a;
                    int tagFieldNumber = WireFormat.getTagFieldNumber(i16);
                    int tagWireType = WireFormat.getTagWireType(i16);
                    if (tagFieldNumber != i14) {
                        if (tagFieldNumber == 3) {
                            if (generatedExtensionFindLiteExtensionByNumber != null) {
                                iR = h.e(p3.f24916c.a(generatedExtensionFindLiteExtensionByNumber.getMessageDefaultInstance().getClass()), bArr, iR, i11, gVar);
                                v1VarEnsureExtensionsAreMutable.p(generatedExtensionFindLiteExtensionByNumber.descriptor, gVar.f24838c);
                            } else if (tagWireType == 2) {
                                iR = h.a(bArr, iR, gVar);
                                byteString = (ByteString) gVar.f24838c;
                            } else if (i16 == WireFormat.MESSAGE_SET_ITEM_END_TAG) {
                                break;
                            } else {
                                iR = h.w(i16, bArr, iR, i11, gVar);
                            }
                        } else {
                            if (i16 == WireFormat.MESSAGE_SET_ITEM_END_TAG) {
                                break;
                                break;
                            }
                            iR = h.w(i16, bArr, iR, i11, gVar);
                        }
                    } else if (tagWireType == 0) {
                        iR = h.r(bArr, iR, gVar);
                        i15 = gVar.f24836a;
                        ((k1) i1Var).getClass();
                        generatedExtensionFindLiteExtensionByNumber = extensionRegistryLite.findLiteExtensionByNumber(messageLite, i15);
                    } else {
                        if (i16 == WireFormat.MESSAGE_SET_ITEM_END_TAG) {
                            break;
                            break;
                        }
                        iR = h.w(i16, bArr, iR, i11, gVar);
                    }
                    i14 = 2;
                }
                if (byteString != null) {
                    unknownFieldSetLite.storeField(WireFormat.makeTag(i15, 2), byteString);
                }
                e3Var = this;
                iW = iR;
            } else if (WireFormat.getTagWireType(i12) == 2) {
                int tagFieldNumber2 = WireFormat.getTagFieldNumber(i12);
                ((k1) i1Var).getClass();
                generatedExtensionFindLiteExtensionByNumber = extensionRegistryLite.findLiteExtensionByNumber(messageLite, tagFieldNumber2);
                if (generatedExtensionFindLiteExtensionByNumber != null) {
                    iW = h.e(p3.f24916c.a(generatedExtensionFindLiteExtensionByNumber.getMessageDefaultInstance().getClass()), bArr, iR, i11, gVar);
                    v1VarEnsureExtensionsAreMutable.p(generatedExtensionFindLiteExtensionByNumber.descriptor, gVar.f24838c);
                } else {
                    iW = h.p(i12, bArr, iR, i11, unknownFieldSetLite, gVar);
                }
            } else {
                iW = h.w(i12, bArr, iR, i11, gVar);
            }
            generatedExtension = generatedExtensionFindLiteExtensionByNumber;
        }
        if (iW != i11) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    @Override // com.google.protobuf.x3
    public final int i(GeneratedMessageLite generatedMessageLite) {
        ((r4) this.f24822b).getClass();
        int iHashCode = generatedMessageLite.unknownFields.hashCode();
        if (!this.f24823c) {
            return iHashCode;
        }
        ((k1) this.f24824d).getClass();
        return ((GeneratedMessageLite.ExtendableMessage) generatedMessageLite).extensions.f24965a.hashCode() + (iHashCode * 53);
    }

    @Override // com.google.protobuf.x3
    public final boolean j(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        r4 r4Var = (r4) this.f24822b;
        r4Var.getClass();
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        r4Var.getClass();
        if (!unknownFieldSetLite.equals(generatedMessageLite2.unknownFields)) {
            return false;
        }
        if (!this.f24823c) {
            return true;
        }
        k1 k1Var = (k1) this.f24824d;
        k1Var.getClass();
        v1 v1Var = ((GeneratedMessageLite.ExtendableMessage) generatedMessageLite).extensions;
        k1Var.getClass();
        return v1Var.equals(((GeneratedMessageLite.ExtendableMessage) generatedMessageLite2).extensions);
    }

    public final boolean k(b0 b0Var, ExtensionRegistryLite extensionRegistryLite, i1 i1Var, v1 v1Var, q4 q4Var, UnknownFieldSetLite unknownFieldSetLite) throws IOException {
        int i10 = b0Var.f24772b;
        int i11 = WireFormat.MESSAGE_SET_ITEM_TAG;
        MessageLite messageLite = this.f24821a;
        if (i10 != i11) {
            if (WireFormat.getTagWireType(i10) != 2) {
                return b0Var.y();
            }
            int tagFieldNumber = WireFormat.getTagFieldNumber(i10);
            k1 k1Var = (k1) i1Var;
            k1Var.getClass();
            GeneratedMessageLite.GeneratedExtension generatedExtensionFindLiteExtensionByNumber = extensionRegistryLite.findLiteExtensionByNumber(messageLite, tagFieldNumber);
            if (generatedExtensionFindLiteExtensionByNumber == null) {
                return q4Var.b(unknownFieldSetLite, b0Var, 0);
            }
            k1Var.getClass();
            v1Var.p(generatedExtensionFindLiteExtensionByNumber.descriptor, b0Var.o(generatedExtensionFindLiteExtensionByNumber.getMessageDefaultInstance().getClass(), extensionRegistryLite));
            return true;
        }
        GeneratedMessageLite.GeneratedExtension generatedExtensionFindLiteExtensionByNumber2 = null;
        ByteString byteStringE = null;
        int uInt32 = 0;
        while (b0Var.a() != Integer.MAX_VALUE) {
            int i12 = b0Var.f24772b;
            if (i12 == WireFormat.MESSAGE_SET_TYPE_ID_TAG) {
                b0Var.x(0);
                uInt32 = b0Var.f24771a.readUInt32();
                ((k1) i1Var).getClass();
                generatedExtensionFindLiteExtensionByNumber2 = extensionRegistryLite.findLiteExtensionByNumber(messageLite, uInt32);
            } else if (i12 == WireFormat.MESSAGE_SET_MESSAGE_TAG) {
                if (generatedExtensionFindLiteExtensionByNumber2 != null) {
                    ((k1) i1Var).getClass();
                    v1Var.p(generatedExtensionFindLiteExtensionByNumber2.descriptor, b0Var.o(generatedExtensionFindLiteExtensionByNumber2.getMessageDefaultInstance().getClass(), extensionRegistryLite));
                } else {
                    byteStringE = b0Var.e();
                }
            } else if (!b0Var.y()) {
                break;
            }
        }
        if (b0Var.f24772b != WireFormat.MESSAGE_SET_ITEM_END_TAG) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        if (byteStringE != null) {
            if (generatedExtensionFindLiteExtensionByNumber2 != null) {
                ((k1) i1Var).getClass();
                MessageLite.Builder builderNewBuilderForType = generatedExtensionFindLiteExtensionByNumber2.getMessageDefaultInstance().newBuilderForType();
                CodedInputStream codedInputStreamNewCodedInput = byteStringE.newCodedInput();
                builderNewBuilderForType.mergeFrom(codedInputStreamNewCodedInput, extensionRegistryLite);
                v1Var.p(generatedExtensionFindLiteExtensionByNumber2.descriptor, builderNewBuilderForType.buildPartial());
                codedInputStreamNewCodedInput.checkLastTagWas(0);
                return true;
            }
            ((r4) q4Var).getClass();
            unknownFieldSetLite.storeField(WireFormat.makeTag(uInt32, 2), byteStringE);
        }
        return true;
    }
}
