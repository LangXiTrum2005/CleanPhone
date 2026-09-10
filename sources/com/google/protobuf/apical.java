package com.google.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ExtensionSchemaLite.java */
/* JADX INFO: loaded from: classes3.dex */
public final class apical extends cutely<GeneratedMessageLite.saneness> {

    /* JADX INFO: compiled from: ExtensionSchemaLite.java */
    public static /* synthetic */ class attabal {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // com.google.protobuf.cutely
    public int extensionNumber(Map.Entry<?, ?> entry) {
        return ((GeneratedMessageLite.saneness) entry.getKey()).getNumber();
    }

    @Override // com.google.protobuf.cutely
    public Object findExtensionByNumber(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i) {
        return extensionRegistryLite.findLiteExtensionByNumber(messageLite, i);
    }

    @Override // com.google.protobuf.cutely
    public FieldSet<GeneratedMessageLite.saneness> getExtensions(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).extensions;
    }

    @Override // com.google.protobuf.cutely
    public FieldSet<GeneratedMessageLite.saneness> getMutableExtensions(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable();
    }

    @Override // com.google.protobuf.cutely
    public boolean hasExtensions(MessageLite messageLite) {
        return messageLite instanceof GeneratedMessageLite.ExtendableMessage;
    }

    @Override // com.google.protobuf.cutely
    public void makeImmutable(Object obj) {
        getExtensions(obj).makeImmutable();
    }

    @Override // com.google.protobuf.cutely
    public <UT, UB> UB parseExtension(Object obj, polder polderVar, Object obj2, ExtensionRegistryLite extensionRegistryLite, FieldSet<GeneratedMessageLite.saneness> fieldSet, UB ub, starveling<UT, UB> starvelingVar) throws IOException {
        Object objValueOf;
        Object field;
        ArrayList arrayList;
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj2;
        int number = generatedExtension.getNumber();
        if (generatedExtension.descriptor.isRepeated() && generatedExtension.descriptor.isPacked()) {
            switch (attabal.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    polderVar.readDoubleList(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    polderVar.readFloatList(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    polderVar.readInt64List(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    polderVar.readUInt64List(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    polderVar.readInt32List(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    polderVar.readFixed64List(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    polderVar.readFixed32List(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    polderVar.readBoolList(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    polderVar.readUInt32List(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    polderVar.readSFixed32List(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    polderVar.readSFixed64List(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    polderVar.readSInt32List(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    polderVar.readSInt64List(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    polderVar.readEnumList(arrayList);
                    ub = (UB) saran.filterUnknownEnumList(obj, number, arrayList, generatedExtension.descriptor.getEnumType(), ub, starvelingVar);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + generatedExtension.descriptor.getLiteType());
            }
            fieldSet.setField(generatedExtension.descriptor, arrayList);
            return ub;
        }
        if (generatedExtension.getLiteType() != WireFormat.FieldType.ENUM) {
            switch (attabal.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(polderVar.readDouble());
                    break;
                case 2:
                    objValueOf = Float.valueOf(polderVar.readFloat());
                    break;
                case 3:
                    objValueOf = Long.valueOf(polderVar.readInt64());
                    break;
                case 4:
                    objValueOf = Long.valueOf(polderVar.readUInt64());
                    break;
                case 5:
                    objValueOf = Integer.valueOf(polderVar.readInt32());
                    break;
                case 6:
                    objValueOf = Long.valueOf(polderVar.readFixed64());
                    break;
                case 7:
                    objValueOf = Integer.valueOf(polderVar.readFixed32());
                    break;
                case 8:
                    objValueOf = Boolean.valueOf(polderVar.readBool());
                    break;
                case 9:
                    objValueOf = Integer.valueOf(polderVar.readUInt32());
                    break;
                case 10:
                    objValueOf = Integer.valueOf(polderVar.readSFixed32());
                    break;
                case 11:
                    objValueOf = Long.valueOf(polderVar.readSFixed64());
                    break;
                case 12:
                    objValueOf = Integer.valueOf(polderVar.readSInt32());
                    break;
                case 13:
                    objValueOf = Long.valueOf(polderVar.readSInt64());
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    objValueOf = polderVar.readBytes();
                    break;
                case 16:
                    objValueOf = polderVar.readString();
                    break;
                case 17:
                    if (!generatedExtension.isRepeated()) {
                        Object field2 = fieldSet.getField(generatedExtension.descriptor);
                        if (field2 instanceof GeneratedMessageLite) {
                            seminary seminaryVarSchemaFor = supplicat.getInstance().schemaFor(field2);
                            if (!((GeneratedMessageLite) field2).isMutable()) {
                                Object objNewInstance = seminaryVarSchemaFor.newInstance();
                                seminaryVarSchemaFor.mergeFrom(objNewInstance, field2);
                                fieldSet.setField(generatedExtension.descriptor, objNewInstance);
                                field2 = objNewInstance;
                            }
                            polderVar.mergeGroupField(field2, seminaryVarSchemaFor, extensionRegistryLite);
                            return ub;
                        }
                    }
                    objValueOf = polderVar.readGroup(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite);
                    break;
                case 18:
                    if (!generatedExtension.isRepeated()) {
                        Object field3 = fieldSet.getField(generatedExtension.descriptor);
                        if (field3 instanceof GeneratedMessageLite) {
                            seminary seminaryVarSchemaFor2 = supplicat.getInstance().schemaFor(field3);
                            if (!((GeneratedMessageLite) field3).isMutable()) {
                                Object objNewInstance2 = seminaryVarSchemaFor2.newInstance();
                                seminaryVarSchemaFor2.mergeFrom(objNewInstance2, field3);
                                fieldSet.setField(generatedExtension.descriptor, objNewInstance2);
                                field3 = objNewInstance2;
                            }
                            polderVar.mergeMessageField(field3, seminaryVarSchemaFor2, extensionRegistryLite);
                            return ub;
                        }
                    }
                    objValueOf = polderVar.readMessage(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite);
                    break;
                default:
                    objValueOf = null;
                    break;
            }
        } else {
            int int32 = polderVar.readInt32();
            if (generatedExtension.descriptor.getEnumType().findValueByNumber(int32) == null) {
                return (UB) saran.storeUnknownEnum(obj, number, int32, ub, starvelingVar);
            }
            objValueOf = Integer.valueOf(int32);
        }
        if (generatedExtension.isRepeated()) {
            fieldSet.addRepeatedField(generatedExtension.descriptor, objValueOf);
            return ub;
        }
        int i = attabal.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()];
        if ((i == 17 || i == 18) && (field = fieldSet.getField(generatedExtension.descriptor)) != null) {
            objValueOf = Internal.mergeMessage(field, objValueOf);
        }
        fieldSet.setField(generatedExtension.descriptor, objValueOf);
        return ub;
    }

    @Override // com.google.protobuf.cutely
    public void parseLengthPrefixedMessageSetItem(polder polderVar, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet<GeneratedMessageLite.saneness> fieldSet) throws IOException {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        fieldSet.setField(generatedExtension.descriptor, polderVar.readMessage(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite));
    }

    @Override // com.google.protobuf.cutely
    public void parseMessageSetItem(ByteString byteString, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet<GeneratedMessageLite.saneness> fieldSet) throws IOException {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        MessageLite.Builder builderNewBuilderForType = generatedExtension.getMessageDefaultInstance().newBuilderForType();
        CodedInputStream codedInputStreamNewCodedInput = byteString.newCodedInput();
        builderNewBuilderForType.mergeFrom(codedInputStreamNewCodedInput, extensionRegistryLite);
        fieldSet.setField(generatedExtension.descriptor, builderNewBuilderForType.buildPartial());
        codedInputStreamNewCodedInput.checkLastTagWas(0);
    }

    @Override // com.google.protobuf.cutely
    public void serializeExtension(Writer writer, Map.Entry<?, ?> entry) throws IOException {
        GeneratedMessageLite.saneness sanenessVar = (GeneratedMessageLite.saneness) entry.getKey();
        if (!sanenessVar.isRepeated()) {
            switch (attabal.$SwitchMap$com$google$protobuf$WireFormat$FieldType[sanenessVar.getLiteType().ordinal()]) {
                case 1:
                    writer.writeDouble(sanenessVar.getNumber(), ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    writer.writeFloat(sanenessVar.getNumber(), ((Float) entry.getValue()).floatValue());
                    break;
                case 3:
                    writer.writeInt64(sanenessVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    writer.writeUInt64(sanenessVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    writer.writeInt32(sanenessVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    writer.writeFixed64(sanenessVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    writer.writeFixed32(sanenessVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    writer.writeBool(sanenessVar.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    writer.writeUInt32(sanenessVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    writer.writeSFixed32(sanenessVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    writer.writeSFixed64(sanenessVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    writer.writeSInt32(sanenessVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    writer.writeSInt64(sanenessVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    writer.writeInt32(sanenessVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    writer.writeBytes(sanenessVar.getNumber(), (ByteString) entry.getValue());
                    break;
                case 16:
                    writer.writeString(sanenessVar.getNumber(), (String) entry.getValue());
                    break;
                case 17:
                    writer.writeGroup(sanenessVar.getNumber(), entry.getValue(), supplicat.getInstance().schemaFor((Class) entry.getValue().getClass()));
                    break;
                case 18:
                    writer.writeMessage(sanenessVar.getNumber(), entry.getValue(), supplicat.getInstance().schemaFor((Class) entry.getValue().getClass()));
                    break;
            }
        }
        switch (attabal.$SwitchMap$com$google$protobuf$WireFormat$FieldType[sanenessVar.getLiteType().ordinal()]) {
            case 1:
                saran.writeDoubleList(sanenessVar.getNumber(), (List) entry.getValue(), writer, sanenessVar.isPacked());
                break;
            case 2:
                saran.writeFloatList(sanenessVar.getNumber(), (List) entry.getValue(), writer, sanenessVar.isPacked());
                break;
            case 3:
                saran.writeInt64List(sanenessVar.getNumber(), (List) entry.getValue(), writer, sanenessVar.isPacked());
                break;
            case 4:
                saran.writeUInt64List(sanenessVar.getNumber(), (List) entry.getValue(), writer, sanenessVar.isPacked());
                break;
            case 5:
                saran.writeInt32List(sanenessVar.getNumber(), (List) entry.getValue(), writer, sanenessVar.isPacked());
                break;
            case 6:
                saran.writeFixed64List(sanenessVar.getNumber(), (List) entry.getValue(), writer, sanenessVar.isPacked());
                break;
            case 7:
                saran.writeFixed32List(sanenessVar.getNumber(), (List) entry.getValue(), writer, sanenessVar.isPacked());
                break;
            case 8:
                saran.writeBoolList(sanenessVar.getNumber(), (List) entry.getValue(), writer, sanenessVar.isPacked());
                break;
            case 9:
                saran.writeUInt32List(sanenessVar.getNumber(), (List) entry.getValue(), writer, sanenessVar.isPacked());
                break;
            case 10:
                saran.writeSFixed32List(sanenessVar.getNumber(), (List) entry.getValue(), writer, sanenessVar.isPacked());
                break;
            case 11:
                saran.writeSFixed64List(sanenessVar.getNumber(), (List) entry.getValue(), writer, sanenessVar.isPacked());
                break;
            case 12:
                saran.writeSInt32List(sanenessVar.getNumber(), (List) entry.getValue(), writer, sanenessVar.isPacked());
                break;
            case 13:
                saran.writeSInt64List(sanenessVar.getNumber(), (List) entry.getValue(), writer, sanenessVar.isPacked());
                break;
            case 14:
                saran.writeInt32List(sanenessVar.getNumber(), (List) entry.getValue(), writer, sanenessVar.isPacked());
                break;
            case 15:
                saran.writeBytesList(sanenessVar.getNumber(), (List) entry.getValue(), writer);
                break;
            case 16:
                saran.writeStringList(sanenessVar.getNumber(), (List) entry.getValue(), writer);
                break;
            case 17:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    saran.writeGroupList(sanenessVar.getNumber(), (List) entry.getValue(), writer, supplicat.getInstance().schemaFor((Class) list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    saran.writeMessageList(sanenessVar.getNumber(), (List) entry.getValue(), writer, supplicat.getInstance().schemaFor((Class) list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }

    @Override // com.google.protobuf.cutely
    public void setExtensions(Object obj, FieldSet<GeneratedMessageLite.saneness> fieldSet) {
        ((GeneratedMessageLite.ExtendableMessage) obj).extensions = fieldSet;
    }
}
