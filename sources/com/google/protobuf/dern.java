package com.google.protobuf;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: ArrayDecoders.java */
/* JADX INFO: loaded from: classes3.dex */
public final class dern {
    static final int DEFAULT_RECURSION_LIMIT = 100;
    private static volatile int recursionLimit = 100;

    /* JADX INFO: compiled from: ArrayDecoders.java */
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
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BOOL.ordinal()] = 11;
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

    private dern() {
    }

    private static void checkRecursionLimit(int i) throws InvalidProtocolBufferException {
        if (i >= recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
    }

    public static int decodeBoolList(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, saneness sanenessVar) {
        wireman wiremanVar = (wireman) protobufList;
        int iDecodeVarint64 = decodeVarint64(bArr, i2, sanenessVar);
        wiremanVar.addBoolean(sanenessVar.long1 != 0);
        while (iDecodeVarint64 < i3) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint64, sanenessVar);
            if (i != sanenessVar.int1) {
                break;
            }
            iDecodeVarint64 = decodeVarint64(bArr, iDecodeVarint32, sanenessVar);
            wiremanVar.addBoolean(sanenessVar.long1 != 0);
        }
        return iDecodeVarint64;
    }

    public static int decodeBytes(byte[] bArr, int i, saneness sanenessVar) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i, sanenessVar);
        int i2 = sanenessVar.int1;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 > bArr.length - iDecodeVarint32) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i2 == 0) {
            sanenessVar.object1 = ByteString.EMPTY;
            return iDecodeVarint32;
        }
        sanenessVar.object1 = ByteString.copyFrom(bArr, iDecodeVarint32, i2);
        return iDecodeVarint32 + i2;
    }

    public static int decodeBytesList(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, saneness sanenessVar) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i2, sanenessVar);
        int i4 = sanenessVar.int1;
        if (i4 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i4 > bArr.length - iDecodeVarint32) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i4 == 0) {
            protobufList.add(ByteString.EMPTY);
        } else {
            protobufList.add(ByteString.copyFrom(bArr, iDecodeVarint32, i4));
            iDecodeVarint32 += i4;
        }
        while (iDecodeVarint32 < i3) {
            int iDecodeVarint33 = decodeVarint32(bArr, iDecodeVarint32, sanenessVar);
            if (i != sanenessVar.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint33, sanenessVar);
            int i5 = sanenessVar.int1;
            if (i5 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i5 > bArr.length - iDecodeVarint32) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i5 == 0) {
                protobufList.add(ByteString.EMPTY);
            } else {
                protobufList.add(ByteString.copyFrom(bArr, iDecodeVarint32, i5));
                iDecodeVarint32 += i5;
            }
        }
        return iDecodeVarint32;
    }

    public static double decodeDouble(byte[] bArr, int i) {
        return Double.longBitsToDouble(decodeFixed64(bArr, i));
    }

    public static int decodeDoubleList(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, saneness sanenessVar) {
        impromptu impromptuVar = (impromptu) protobufList;
        impromptuVar.addDouble(decodeDouble(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int iDecodeVarint32 = decodeVarint32(bArr, i4, sanenessVar);
            if (i != sanenessVar.int1) {
                break;
            }
            impromptuVar.addDouble(decodeDouble(bArr, iDecodeVarint32));
            i4 = iDecodeVarint32 + 8;
        }
        return i4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int decodeExtension(int i, byte[] bArr, int i2, int i3, GeneratedMessageLite.ExtendableMessage<?, ?> extendableMessage, GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension, starveling<UnknownFieldSetLite, UnknownFieldSetLite> starvelingVar, saneness sanenessVar) throws IOException {
        int i4;
        int i5;
        FieldSet<GeneratedMessageLite.saneness> fieldSet = extendableMessage.extensions;
        int i6 = i >>> 3;
        if (generatedExtension.descriptor.isRepeated() && generatedExtension.descriptor.isPacked()) {
            switch (attabal.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    impromptu impromptuVar = new impromptu();
                    int iDecodePackedDoubleList = decodePackedDoubleList(bArr, i2, impromptuVar, sanenessVar);
                    fieldSet.setField(generatedExtension.descriptor, impromptuVar);
                    return iDecodePackedDoubleList;
                case 2:
                    impassible impassibleVar = new impassible();
                    int iDecodePackedFloatList = decodePackedFloatList(bArr, i2, impassibleVar, sanenessVar);
                    fieldSet.setField(generatedExtension.descriptor, impassibleVar);
                    return iDecodePackedFloatList;
                case 3:
                case 4:
                    molybdenite molybdeniteVar = new molybdenite();
                    int iDecodePackedVarint64List = decodePackedVarint64List(bArr, i2, molybdeniteVar, sanenessVar);
                    fieldSet.setField(generatedExtension.descriptor, molybdeniteVar);
                    return iDecodePackedVarint64List;
                case 5:
                case 6:
                    kowloon kowloonVar = new kowloon();
                    int iDecodePackedVarint32List = decodePackedVarint32List(bArr, i2, kowloonVar, sanenessVar);
                    fieldSet.setField(generatedExtension.descriptor, kowloonVar);
                    return iDecodePackedVarint32List;
                case 7:
                case 8:
                    molybdenite molybdeniteVar2 = new molybdenite();
                    int iDecodePackedFixed64List = decodePackedFixed64List(bArr, i2, molybdeniteVar2, sanenessVar);
                    fieldSet.setField(generatedExtension.descriptor, molybdeniteVar2);
                    return iDecodePackedFixed64List;
                case 9:
                case 10:
                    kowloon kowloonVar2 = new kowloon();
                    int iDecodePackedFixed32List = decodePackedFixed32List(bArr, i2, kowloonVar2, sanenessVar);
                    fieldSet.setField(generatedExtension.descriptor, kowloonVar2);
                    return iDecodePackedFixed32List;
                case 11:
                    wireman wiremanVar = new wireman();
                    int iDecodePackedBoolList = decodePackedBoolList(bArr, i2, wiremanVar, sanenessVar);
                    fieldSet.setField(generatedExtension.descriptor, wiremanVar);
                    return iDecodePackedBoolList;
                case 12:
                    kowloon kowloonVar3 = new kowloon();
                    int iDecodePackedSInt32List = decodePackedSInt32List(bArr, i2, kowloonVar3, sanenessVar);
                    fieldSet.setField(generatedExtension.descriptor, kowloonVar3);
                    return iDecodePackedSInt32List;
                case 13:
                    molybdenite molybdeniteVar3 = new molybdenite();
                    int iDecodePackedSInt64List = decodePackedSInt64List(bArr, i2, molybdeniteVar3, sanenessVar);
                    fieldSet.setField(generatedExtension.descriptor, molybdeniteVar3);
                    return iDecodePackedSInt64List;
                case 14:
                    kowloon kowloonVar4 = new kowloon();
                    int iDecodePackedVarint32List2 = decodePackedVarint32List(bArr, i2, kowloonVar4, sanenessVar);
                    saran.filterUnknownEnumList((Object) extendableMessage, i6, (List<Integer>) kowloonVar4, generatedExtension.descriptor.getEnumType(), (Object) null, (starveling<UT, Object>) starvelingVar);
                    fieldSet.setField(generatedExtension.descriptor, kowloonVar4);
                    return iDecodePackedVarint32List2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + generatedExtension.descriptor.getLiteType());
            }
        }
        Object objValueOf = null;
        if (generatedExtension.getLiteType() == WireFormat.FieldType.ENUM) {
            i2 = decodeVarint32(bArr, i2, sanenessVar);
            if (generatedExtension.descriptor.getEnumType().findValueByNumber(sanenessVar.int1) == null) {
                saran.storeUnknownEnum(extendableMessage, i6, sanenessVar.int1, null, starvelingVar);
                return i2;
            }
            objValueOf = Integer.valueOf(sanenessVar.int1);
        } else {
            switch (attabal.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    i4 = i2;
                    objValueOf = Double.valueOf(decodeDouble(bArr, i4));
                    i2 = i4 + 8;
                    break;
                case 2:
                    i5 = i2;
                    objValueOf = Float.valueOf(decodeFloat(bArr, i5));
                    i2 = i5 + 4;
                    break;
                case 3:
                case 4:
                    i2 = decodeVarint64(bArr, i2, sanenessVar);
                    objValueOf = Long.valueOf(sanenessVar.long1);
                    break;
                case 5:
                case 6:
                    i2 = decodeVarint32(bArr, i2, sanenessVar);
                    objValueOf = Integer.valueOf(sanenessVar.int1);
                    break;
                case 7:
                case 8:
                    i4 = i2;
                    objValueOf = Long.valueOf(decodeFixed64(bArr, i4));
                    i2 = i4 + 8;
                    break;
                case 9:
                case 10:
                    i5 = i2;
                    objValueOf = Integer.valueOf(decodeFixed32(bArr, i5));
                    i2 = i5 + 4;
                    break;
                case 11:
                    i2 = decodeVarint64(bArr, i2, sanenessVar);
                    objValueOf = Boolean.valueOf(sanenessVar.long1 != 0);
                    break;
                case 12:
                    i2 = decodeVarint32(bArr, i2, sanenessVar);
                    objValueOf = Integer.valueOf(CodedInputStream.decodeZigZag32(sanenessVar.int1));
                    break;
                case 13:
                    i2 = decodeVarint64(bArr, i2, sanenessVar);
                    objValueOf = Long.valueOf(CodedInputStream.decodeZigZag64(sanenessVar.long1));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    i2 = decodeBytes(bArr, i2, sanenessVar);
                    objValueOf = sanenessVar.object1;
                    break;
                case 16:
                    i2 = decodeString(bArr, i2, sanenessVar);
                    objValueOf = sanenessVar.object1;
                    break;
                case 17:
                    int i7 = (i6 << 3) | 4;
                    seminary seminaryVarSchemaFor = supplicat.getInstance().schemaFor((Class) generatedExtension.getMessageDefaultInstance().getClass());
                    if (generatedExtension.isRepeated()) {
                        int iDecodeGroupField = decodeGroupField(seminaryVarSchemaFor, bArr, i2, i3, i7, sanenessVar);
                        fieldSet.addRepeatedField(generatedExtension.descriptor, sanenessVar.object1);
                        return iDecodeGroupField;
                    }
                    Object field = fieldSet.getField(generatedExtension.descriptor);
                    if (field == null) {
                        field = seminaryVarSchemaFor.newInstance();
                        fieldSet.setField(generatedExtension.descriptor, field);
                    }
                    return mergeGroupField(field, seminaryVarSchemaFor, bArr, i2, i3, i7, sanenessVar);
                case 18:
                    seminary seminaryVarSchemaFor2 = supplicat.getInstance().schemaFor((Class) generatedExtension.getMessageDefaultInstance().getClass());
                    if (generatedExtension.isRepeated()) {
                        int iDecodeMessageField = decodeMessageField(seminaryVarSchemaFor2, bArr, i2, i3, sanenessVar);
                        fieldSet.addRepeatedField(generatedExtension.descriptor, sanenessVar.object1);
                        return iDecodeMessageField;
                    }
                    Object field2 = fieldSet.getField(generatedExtension.descriptor);
                    if (field2 == null) {
                        field2 = seminaryVarSchemaFor2.newInstance();
                        fieldSet.setField(generatedExtension.descriptor, field2);
                    }
                    return mergeMessageField(field2, seminaryVarSchemaFor2, bArr, i2, i3, sanenessVar);
            }
        }
        if (generatedExtension.isRepeated()) {
            fieldSet.addRepeatedField(generatedExtension.descriptor, objValueOf);
            return i2;
        }
        fieldSet.setField(generatedExtension.descriptor, objValueOf);
        return i2;
    }

    public static int decodeExtensionOrUnknownField(int i, byte[] bArr, int i2, int i3, Object obj, MessageLite messageLite, starveling<UnknownFieldSetLite, UnknownFieldSetLite> starvelingVar, saneness sanenessVar) throws IOException {
        GeneratedMessageLite.GeneratedExtension generatedExtensionFindLiteExtensionByNumber = sanenessVar.extensionRegistry.findLiteExtensionByNumber(messageLite, i >>> 3);
        if (generatedExtensionFindLiteExtensionByNumber == null) {
            return decodeUnknownField(i, bArr, i2, i3, cuirassed.getMutableUnknownFields(obj), sanenessVar);
        }
        GeneratedMessageLite.ExtendableMessage extendableMessage = (GeneratedMessageLite.ExtendableMessage) obj;
        extendableMessage.ensureExtensionsAreMutable();
        return decodeExtension(i, bArr, i2, i3, extendableMessage, generatedExtensionFindLiteExtensionByNumber, starvelingVar, sanenessVar);
    }

    public static int decodeFixed32(byte[] bArr, int i) {
        return ((bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
    }

    public static int decodeFixed32List(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, saneness sanenessVar) {
        kowloon kowloonVar = (kowloon) protobufList;
        kowloonVar.addInt(decodeFixed32(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int iDecodeVarint32 = decodeVarint32(bArr, i4, sanenessVar);
            if (i != sanenessVar.int1) {
                break;
            }
            kowloonVar.addInt(decodeFixed32(bArr, iDecodeVarint32));
            i4 = iDecodeVarint32 + 4;
        }
        return i4;
    }

    public static long decodeFixed64(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static int decodeFixed64List(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, saneness sanenessVar) {
        molybdenite molybdeniteVar = (molybdenite) protobufList;
        molybdeniteVar.addLong(decodeFixed64(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int iDecodeVarint32 = decodeVarint32(bArr, i4, sanenessVar);
            if (i != sanenessVar.int1) {
                break;
            }
            molybdeniteVar.addLong(decodeFixed64(bArr, iDecodeVarint32));
            i4 = iDecodeVarint32 + 8;
        }
        return i4;
    }

    public static float decodeFloat(byte[] bArr, int i) {
        return Float.intBitsToFloat(decodeFixed32(bArr, i));
    }

    public static int decodeFloatList(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, saneness sanenessVar) {
        impassible impassibleVar = (impassible) protobufList;
        impassibleVar.addFloat(decodeFloat(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int iDecodeVarint32 = decodeVarint32(bArr, i4, sanenessVar);
            if (i != sanenessVar.int1) {
                break;
            }
            impassibleVar.addFloat(decodeFloat(bArr, iDecodeVarint32));
            i4 = iDecodeVarint32 + 4;
        }
        return i4;
    }

    public static int decodeGroupField(seminary seminaryVar, byte[] bArr, int i, int i2, int i3, saneness sanenessVar) throws IOException {
        Object objNewInstance = seminaryVar.newInstance();
        int iMergeGroupField = mergeGroupField(objNewInstance, seminaryVar, bArr, i, i2, i3, sanenessVar);
        seminaryVar.makeImmutable(objNewInstance);
        sanenessVar.object1 = objNewInstance;
        return iMergeGroupField;
    }

    public static int decodeGroupList(seminary seminaryVar, int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, saneness sanenessVar) throws IOException {
        int i4 = (i & (-8)) | 4;
        int iDecodeGroupField = decodeGroupField(seminaryVar, bArr, i2, i3, i4, sanenessVar);
        protobufList.add(sanenessVar.object1);
        while (iDecodeGroupField < i3) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeGroupField, sanenessVar);
            if (i != sanenessVar.int1) {
                break;
            }
            iDecodeGroupField = decodeGroupField(seminaryVar, bArr, iDecodeVarint32, i3, i4, sanenessVar);
            protobufList.add(sanenessVar.object1);
        }
        return iDecodeGroupField;
    }

    public static int decodeMessageField(seminary seminaryVar, byte[] bArr, int i, int i2, saneness sanenessVar) throws IOException {
        Object objNewInstance = seminaryVar.newInstance();
        int iMergeMessageField = mergeMessageField(objNewInstance, seminaryVar, bArr, i, i2, sanenessVar);
        seminaryVar.makeImmutable(objNewInstance);
        sanenessVar.object1 = objNewInstance;
        return iMergeMessageField;
    }

    public static int decodeMessageList(seminary<?> seminaryVar, int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, saneness sanenessVar) throws IOException {
        int iDecodeMessageField = decodeMessageField(seminaryVar, bArr, i2, i3, sanenessVar);
        protobufList.add(sanenessVar.object1);
        while (iDecodeMessageField < i3) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeMessageField, sanenessVar);
            if (i != sanenessVar.int1) {
                break;
            }
            iDecodeMessageField = decodeMessageField(seminaryVar, bArr, iDecodeVarint32, i3, sanenessVar);
            protobufList.add(sanenessVar.object1);
        }
        return iDecodeMessageField;
    }

    public static int decodePackedBoolList(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, saneness sanenessVar) throws IOException {
        wireman wiremanVar = (wireman) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i, sanenessVar);
        int i2 = sanenessVar.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i2) {
            iDecodeVarint32 = decodeVarint64(bArr, iDecodeVarint32, sanenessVar);
            wiremanVar.addBoolean(sanenessVar.long1 != 0);
        }
        if (iDecodeVarint32 == i2) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedDoubleList(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, saneness sanenessVar) throws IOException {
        impromptu impromptuVar = (impromptu) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i, sanenessVar);
        int i2 = sanenessVar.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i2) {
            impromptuVar.addDouble(decodeDouble(bArr, iDecodeVarint32));
            iDecodeVarint32 += 8;
        }
        if (iDecodeVarint32 == i2) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedFixed32List(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, saneness sanenessVar) throws IOException {
        kowloon kowloonVar = (kowloon) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i, sanenessVar);
        int i2 = sanenessVar.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i2) {
            kowloonVar.addInt(decodeFixed32(bArr, iDecodeVarint32));
            iDecodeVarint32 += 4;
        }
        if (iDecodeVarint32 == i2) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedFixed64List(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, saneness sanenessVar) throws IOException {
        molybdenite molybdeniteVar = (molybdenite) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i, sanenessVar);
        int i2 = sanenessVar.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i2) {
            molybdeniteVar.addLong(decodeFixed64(bArr, iDecodeVarint32));
            iDecodeVarint32 += 8;
        }
        if (iDecodeVarint32 == i2) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedFloatList(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, saneness sanenessVar) throws IOException {
        impassible impassibleVar = (impassible) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i, sanenessVar);
        int i2 = sanenessVar.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i2) {
            impassibleVar.addFloat(decodeFloat(bArr, iDecodeVarint32));
            iDecodeVarint32 += 4;
        }
        if (iDecodeVarint32 == i2) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedSInt32List(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, saneness sanenessVar) throws IOException {
        kowloon kowloonVar = (kowloon) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i, sanenessVar);
        int i2 = sanenessVar.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i2) {
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint32, sanenessVar);
            kowloonVar.addInt(CodedInputStream.decodeZigZag32(sanenessVar.int1));
        }
        if (iDecodeVarint32 == i2) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedSInt64List(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, saneness sanenessVar) throws IOException {
        molybdenite molybdeniteVar = (molybdenite) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i, sanenessVar);
        int i2 = sanenessVar.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i2) {
            iDecodeVarint32 = decodeVarint64(bArr, iDecodeVarint32, sanenessVar);
            molybdeniteVar.addLong(CodedInputStream.decodeZigZag64(sanenessVar.long1));
        }
        if (iDecodeVarint32 == i2) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedVarint32List(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, saneness sanenessVar) throws IOException {
        kowloon kowloonVar = (kowloon) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i, sanenessVar);
        int i2 = sanenessVar.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i2) {
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint32, sanenessVar);
            kowloonVar.addInt(sanenessVar.int1);
        }
        if (iDecodeVarint32 == i2) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedVarint64List(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, saneness sanenessVar) throws IOException {
        molybdenite molybdeniteVar = (molybdenite) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i, sanenessVar);
        int i2 = sanenessVar.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i2) {
            iDecodeVarint32 = decodeVarint64(bArr, iDecodeVarint32, sanenessVar);
            molybdeniteVar.addLong(sanenessVar.long1);
        }
        if (iDecodeVarint32 == i2) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodeSInt32List(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, saneness sanenessVar) {
        kowloon kowloonVar = (kowloon) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i2, sanenessVar);
        kowloonVar.addInt(CodedInputStream.decodeZigZag32(sanenessVar.int1));
        while (iDecodeVarint32 < i3) {
            int iDecodeVarint33 = decodeVarint32(bArr, iDecodeVarint32, sanenessVar);
            if (i != sanenessVar.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint33, sanenessVar);
            kowloonVar.addInt(CodedInputStream.decodeZigZag32(sanenessVar.int1));
        }
        return iDecodeVarint32;
    }

    public static int decodeSInt64List(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, saneness sanenessVar) {
        molybdenite molybdeniteVar = (molybdenite) protobufList;
        int iDecodeVarint64 = decodeVarint64(bArr, i2, sanenessVar);
        molybdeniteVar.addLong(CodedInputStream.decodeZigZag64(sanenessVar.long1));
        while (iDecodeVarint64 < i3) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint64, sanenessVar);
            if (i != sanenessVar.int1) {
                break;
            }
            iDecodeVarint64 = decodeVarint64(bArr, iDecodeVarint32, sanenessVar);
            molybdeniteVar.addLong(CodedInputStream.decodeZigZag64(sanenessVar.long1));
        }
        return iDecodeVarint64;
    }

    public static int decodeString(byte[] bArr, int i, saneness sanenessVar) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i, sanenessVar);
        int i2 = sanenessVar.int1;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 == 0) {
            sanenessVar.object1 = "";
            return iDecodeVarint32;
        }
        sanenessVar.object1 = new String(bArr, iDecodeVarint32, i2, Internal.UTF_8);
        return iDecodeVarint32 + i2;
    }

    public static int decodeStringList(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, saneness sanenessVar) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i2, sanenessVar);
        int i4 = sanenessVar.int1;
        if (i4 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i4 == 0) {
            protobufList.add("");
        } else {
            protobufList.add(new String(bArr, iDecodeVarint32, i4, Internal.UTF_8));
            iDecodeVarint32 += i4;
        }
        while (iDecodeVarint32 < i3) {
            int iDecodeVarint33 = decodeVarint32(bArr, iDecodeVarint32, sanenessVar);
            if (i != sanenessVar.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint33, sanenessVar);
            int i5 = sanenessVar.int1;
            if (i5 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i5 == 0) {
                protobufList.add("");
            } else {
                protobufList.add(new String(bArr, iDecodeVarint32, i5, Internal.UTF_8));
                iDecodeVarint32 += i5;
            }
        }
        return iDecodeVarint32;
    }

    public static int decodeStringListRequireUtf8(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, saneness sanenessVar) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i2, sanenessVar);
        int i4 = sanenessVar.int1;
        if (i4 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i4 == 0) {
            protobufList.add("");
        } else {
            int i5 = iDecodeVarint32 + i4;
            if (!Utf8.isValidUtf8(bArr, iDecodeVarint32, i5)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            protobufList.add(new String(bArr, iDecodeVarint32, i4, Internal.UTF_8));
            iDecodeVarint32 = i5;
        }
        while (iDecodeVarint32 < i3) {
            int iDecodeVarint33 = decodeVarint32(bArr, iDecodeVarint32, sanenessVar);
            if (i != sanenessVar.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint33, sanenessVar);
            int i6 = sanenessVar.int1;
            if (i6 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i6 == 0) {
                protobufList.add("");
            } else {
                int i7 = iDecodeVarint32 + i6;
                if (!Utf8.isValidUtf8(bArr, iDecodeVarint32, i7)) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                protobufList.add(new String(bArr, iDecodeVarint32, i6, Internal.UTF_8));
                iDecodeVarint32 = i7;
            }
        }
        return iDecodeVarint32;
    }

    public static int decodeStringRequireUtf8(byte[] bArr, int i, saneness sanenessVar) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i, sanenessVar);
        int i2 = sanenessVar.int1;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 == 0) {
            sanenessVar.object1 = "";
            return iDecodeVarint32;
        }
        sanenessVar.object1 = Utf8.decodeUtf8(bArr, iDecodeVarint32, i2);
        return iDecodeVarint32 + i2;
    }

    public static int decodeUnknownField(int i, byte[] bArr, int i2, int i3, UnknownFieldSetLite unknownFieldSetLite, saneness sanenessVar) throws InvalidProtocolBufferException {
        if (WireFormat.getTagFieldNumber(i) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int tagWireType = WireFormat.getTagWireType(i);
        if (tagWireType == 0) {
            int iDecodeVarint64 = decodeVarint64(bArr, i2, sanenessVar);
            unknownFieldSetLite.storeField(i, Long.valueOf(sanenessVar.long1));
            return iDecodeVarint64;
        }
        if (tagWireType == 1) {
            unknownFieldSetLite.storeField(i, Long.valueOf(decodeFixed64(bArr, i2)));
            return i2 + 8;
        }
        if (tagWireType == 2) {
            int iDecodeVarint32 = decodeVarint32(bArr, i2, sanenessVar);
            int i4 = sanenessVar.int1;
            if (i4 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i4 > bArr.length - iDecodeVarint32) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i4 == 0) {
                unknownFieldSetLite.storeField(i, ByteString.EMPTY);
            } else {
                unknownFieldSetLite.storeField(i, ByteString.copyFrom(bArr, iDecodeVarint32, i4));
            }
            return iDecodeVarint32 + i4;
        }
        if (tagWireType != 3) {
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidTag();
            }
            unknownFieldSetLite.storeField(i, Integer.valueOf(decodeFixed32(bArr, i2)));
            return i2 + 4;
        }
        UnknownFieldSetLite unknownFieldSetLiteNewInstance = UnknownFieldSetLite.newInstance();
        int i5 = (i & (-8)) | 4;
        int i6 = sanenessVar.recursionDepth + 1;
        sanenessVar.recursionDepth = i6;
        checkRecursionLimit(i6);
        int i7 = 0;
        while (i2 < i3) {
            int iDecodeVarint33 = decodeVarint32(bArr, i2, sanenessVar);
            i7 = sanenessVar.int1;
            if (i7 == i5) {
                i2 = iDecodeVarint33;
                break;
            }
            i2 = decodeUnknownField(i7, bArr, iDecodeVarint33, i3, unknownFieldSetLiteNewInstance, sanenessVar);
        }
        sanenessVar.recursionDepth--;
        if (i2 > i3 || i7 != i5) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        unknownFieldSetLite.storeField(i, unknownFieldSetLiteNewInstance);
        return i2;
    }

    public static int decodeVarint32(byte[] bArr, int i, saneness sanenessVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return decodeVarint32(b, bArr, i2, sanenessVar);
        }
        sanenessVar.int1 = b;
        return i2;
    }

    public static int decodeVarint32List(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, saneness sanenessVar) {
        kowloon kowloonVar = (kowloon) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i2, sanenessVar);
        kowloonVar.addInt(sanenessVar.int1);
        while (iDecodeVarint32 < i3) {
            int iDecodeVarint33 = decodeVarint32(bArr, iDecodeVarint32, sanenessVar);
            if (i != sanenessVar.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint33, sanenessVar);
            kowloonVar.addInt(sanenessVar.int1);
        }
        return iDecodeVarint32;
    }

    public static int decodeVarint64(byte[] bArr, int i, saneness sanenessVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j < 0) {
            return decodeVarint64(j, bArr, i2, sanenessVar);
        }
        sanenessVar.long1 = j;
        return i2;
    }

    public static int decodeVarint64List(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, saneness sanenessVar) {
        molybdenite molybdeniteVar = (molybdenite) protobufList;
        int iDecodeVarint64 = decodeVarint64(bArr, i2, sanenessVar);
        molybdeniteVar.addLong(sanenessVar.long1);
        while (iDecodeVarint64 < i3) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint64, sanenessVar);
            if (i != sanenessVar.int1) {
                break;
            }
            iDecodeVarint64 = decodeVarint64(bArr, iDecodeVarint32, sanenessVar);
            molybdeniteVar.addLong(sanenessVar.long1);
        }
        return iDecodeVarint64;
    }

    public static int mergeGroupField(Object obj, seminary seminaryVar, byte[] bArr, int i, int i2, int i3, saneness sanenessVar) throws IOException {
        int i4 = sanenessVar.recursionDepth + 1;
        sanenessVar.recursionDepth = i4;
        checkRecursionLimit(i4);
        int message = ((cuirassed) seminaryVar).parseMessage(obj, bArr, i, i2, i3, sanenessVar);
        sanenessVar.recursionDepth--;
        sanenessVar.object1 = obj;
        return message;
    }

    public static int mergeMessageField(Object obj, seminary seminaryVar, byte[] bArr, int i, int i2, saneness sanenessVar) throws IOException {
        int iDecodeVarint32 = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iDecodeVarint32 = decodeVarint32(i3, bArr, iDecodeVarint32, sanenessVar);
            i3 = sanenessVar.int1;
        }
        int i4 = iDecodeVarint32;
        if (i3 < 0 || i3 > i2 - i4) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i5 = sanenessVar.recursionDepth + 1;
        sanenessVar.recursionDepth = i5;
        checkRecursionLimit(i5);
        int i6 = i4 + i3;
        seminaryVar.mergeFrom(obj, bArr, i4, i6, sanenessVar);
        sanenessVar.recursionDepth--;
        sanenessVar.object1 = obj;
        return i6;
    }

    public static void setRecursionLimit(int i) {
        recursionLimit = i;
    }

    public static int skipField(int i, byte[] bArr, int i2, int i3, saneness sanenessVar) throws InvalidProtocolBufferException {
        if (WireFormat.getTagFieldNumber(i) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int tagWireType = WireFormat.getTagWireType(i);
        if (tagWireType == 0) {
            return decodeVarint64(bArr, i2, sanenessVar);
        }
        if (tagWireType == 1) {
            return i2 + 8;
        }
        if (tagWireType == 2) {
            return decodeVarint32(bArr, i2, sanenessVar) + sanenessVar.int1;
        }
        if (tagWireType != 3) {
            if (tagWireType == 5) {
                return i2 + 4;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }
        int i4 = (i & (-8)) | 4;
        int i5 = 0;
        while (i2 < i3) {
            i2 = decodeVarint32(bArr, i2, sanenessVar);
            i5 = sanenessVar.int1;
            if (i5 == i4) {
                break;
            }
            i2 = skipField(i5, bArr, i2, i3, sanenessVar);
        }
        if (i2 > i3 || i5 != i4) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i2;
    }

    /* JADX INFO: compiled from: ArrayDecoders.java */
    public static final class saneness {
        public final ExtensionRegistryLite extensionRegistry;
        public int int1;
        public long long1;
        public Object object1;
        public int recursionDepth;

        public saneness() {
            this.extensionRegistry = ExtensionRegistryLite.getEmptyRegistry();
        }

        public saneness(ExtensionRegistryLite extensionRegistryLite) {
            extensionRegistryLite.getClass();
            this.extensionRegistry = extensionRegistryLite;
        }
    }

    public static int decodeVarint32(int i, byte[] bArr, int i2, saneness sanenessVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            sanenessVar.int1 = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            sanenessVar.int1 = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            sanenessVar.int1 = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            sanenessVar.int1 = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                sanenessVar.int1 = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int decodeVarint64(long j, byte[] bArr, int i, saneness sanenessVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i3 = 7;
        while (b < 0) {
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            i3 += 7;
            j2 |= ((long) (b2 & 127)) << i3;
            i2 = i4;
            b = b2;
        }
        sanenessVar.long1 = j2;
        return i2;
    }
}
