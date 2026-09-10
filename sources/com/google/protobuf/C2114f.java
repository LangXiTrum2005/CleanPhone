package com.google.protobuf;

import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4754uW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3578h30;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ng0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.R5;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.protobuf.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2114f {
    private C2114f() {
    }

    public static int decodeBoolList(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, R5 r5) {
        C2118h c2118h = (C2118h) protobufList;
        int iDecodeVarint64 = decodeVarint64(bArr, i2, r5);
        c2118h.addBoolean(r5.long1 != 0);
        while (iDecodeVarint64 < i3) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint64, r5);
            if (i != r5.int1) {
                break;
            }
            iDecodeVarint64 = decodeVarint64(bArr, iDecodeVarint32, r5);
            c2118h.addBoolean(r5.long1 != 0);
        }
        return iDecodeVarint64;
    }

    public static int decodeBytes(byte[] bArr, int i, R5 r5) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i, r5);
        int i2 = r5.int1;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 > bArr.length - iDecodeVarint32) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i2 == 0) {
            r5.object1 = ByteString.EMPTY;
            return iDecodeVarint32;
        }
        r5.object1 = ByteString.copyFrom(bArr, iDecodeVarint32, i2);
        return iDecodeVarint32 + i2;
    }

    public static int decodeBytesList(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, R5 r5) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i2, r5);
        int i4 = r5.int1;
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
            int iDecodeVarint33 = decodeVarint32(bArr, iDecodeVarint32, r5);
            if (i != r5.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint33, r5);
            int i5 = r5.int1;
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

    public static int decodeDoubleList(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, R5 r5) {
        B b = (B) protobufList;
        b.addDouble(decodeDouble(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int iDecodeVarint32 = decodeVarint32(bArr, i4, r5);
            if (i != r5.int1) {
                break;
            }
            b.addDouble(decodeDouble(bArr, iDecodeVarint32));
            i4 = iDecodeVarint32 + 8;
        }
        return i4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int decodeExtension(int i, byte[] bArr, int i2, int i3, GeneratedMessageLite.ExtendableMessage<?, ?> extendableMessage, GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension, O0 o0, R5 r5) throws IOException {
        W w = extendableMessage.extensions;
        int i4 = i >>> 3;
        if (generatedExtension.descriptor.isRepeated() && generatedExtension.descriptor.isPacked()) {
            switch (AbstractC2112e.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    B b = new B();
                    int iDecodePackedDoubleList = decodePackedDoubleList(bArr, i2, b, r5);
                    w.setField(generatedExtension.descriptor, b);
                    return iDecodePackedDoubleList;
                case 2:
                    Y y = new Y();
                    int iDecodePackedFloatList = decodePackedFloatList(bArr, i2, y, r5);
                    w.setField(generatedExtension.descriptor, y);
                    return iDecodePackedFloatList;
                case 3:
                case 4:
                    C2131n0 c2131n0 = new C2131n0();
                    int iDecodePackedVarint64List = decodePackedVarint64List(bArr, i2, c2131n0, r5);
                    w.setField(generatedExtension.descriptor, c2131n0);
                    return iDecodePackedVarint64List;
                case 5:
                case 6:
                    C2113e0 c2113e0 = new C2113e0();
                    int iDecodePackedVarint32List = decodePackedVarint32List(bArr, i2, c2113e0, r5);
                    w.setField(generatedExtension.descriptor, c2113e0);
                    return iDecodePackedVarint32List;
                case 7:
                case 8:
                    C2131n0 c2131n1 = new C2131n0();
                    int iDecodePackedFixed64List = decodePackedFixed64List(bArr, i2, c2131n1, r5);
                    w.setField(generatedExtension.descriptor, c2131n1);
                    return iDecodePackedFixed64List;
                case 9:
                case 10:
                    C2113e0 c2113e1 = new C2113e0();
                    int iDecodePackedFixed32List = decodePackedFixed32List(bArr, i2, c2113e1, r5);
                    w.setField(generatedExtension.descriptor, c2113e1);
                    return iDecodePackedFixed32List;
                case 11:
                    C2118h c2118h = new C2118h();
                    int iDecodePackedBoolList = decodePackedBoolList(bArr, i2, c2118h, r5);
                    w.setField(generatedExtension.descriptor, c2118h);
                    return iDecodePackedBoolList;
                case 12:
                    C2113e0 c2113e2 = new C2113e0();
                    int iDecodePackedSInt32List = decodePackedSInt32List(bArr, i2, c2113e2, r5);
                    w.setField(generatedExtension.descriptor, c2113e2);
                    return iDecodePackedSInt32List;
                case 13:
                    C2131n0 c2131n2 = new C2131n0();
                    int iDecodePackedSInt64List = decodePackedSInt64List(bArr, i2, c2131n2, r5);
                    w.setField(generatedExtension.descriptor, c2131n2);
                    return iDecodePackedSInt64List;
                case 14:
                    C2113e0 c2113e3 = new C2113e0();
                    int iDecodePackedVarint32List2 = decodePackedVarint32List(bArr, i2, c2113e3, r5);
                    D0.filterUnknownEnumList(extendableMessage, i4, c2113e3, generatedExtension.descriptor.getEnumType(), (Object) null, o0);
                    w.setField(generatedExtension.descriptor, c2113e3);
                    return iDecodePackedVarint32List2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + generatedExtension.descriptor.getLiteType());
            }
        }
        Object objValueOf = null;
        if (generatedExtension.getLiteType() == WireFormat.FieldType.ENUM) {
            i2 = decodeVarint32(bArr, i2, r5);
            if (generatedExtension.descriptor.getEnumType().findValueByNumber(r5.int1) == null) {
                D0.storeUnknownEnum(extendableMessage, i4, r5.int1, null, o0);
                return i2;
            }
            objValueOf = Integer.valueOf(r5.int1);
        } else {
            switch (AbstractC2112e.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(decodeDouble(bArr, i2));
                    i2 += 8;
                    break;
                case 2:
                    objValueOf = Float.valueOf(decodeFloat(bArr, i2));
                    i2 += 4;
                    break;
                case 3:
                case 4:
                    i2 = decodeVarint64(bArr, i2, r5);
                    objValueOf = Long.valueOf(r5.long1);
                    break;
                case 5:
                case 6:
                    i2 = decodeVarint32(bArr, i2, r5);
                    objValueOf = Integer.valueOf(r5.int1);
                    break;
                case 7:
                case 8:
                    objValueOf = Long.valueOf(decodeFixed64(bArr, i2));
                    i2 += 8;
                    break;
                case 9:
                case 10:
                    objValueOf = Integer.valueOf(decodeFixed32(bArr, i2));
                    i2 += 4;
                    break;
                case 11:
                    i2 = decodeVarint64(bArr, i2, r5);
                    objValueOf = Boolean.valueOf(r5.long1 != 0);
                    break;
                case 12:
                    i2 = decodeVarint32(bArr, i2, r5);
                    objValueOf = Integer.valueOf(CodedInputStream.decodeZigZag32(r5.int1));
                    break;
                case 13:
                    i2 = decodeVarint64(bArr, i2, r5);
                    objValueOf = Long.valueOf(CodedInputStream.decodeZigZag64(r5.long1));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    i2 = decodeBytes(bArr, i2, r5);
                    objValueOf = r5.object1;
                    break;
                case 16:
                    i2 = decodeString(bArr, i2, r5);
                    objValueOf = r5.object1;
                    break;
                case 17:
                    int i5 = (i4 << 3) | 4;
                    InterfaceC3578h30 interfaceC3578h30SchemaFor = C4754uW.getInstance().schemaFor((Class) generatedExtension.getMessageDefaultInstance().getClass());
                    if (generatedExtension.isRepeated()) {
                        int iDecodeGroupField = decodeGroupField(interfaceC3578h30SchemaFor, bArr, i2, i3, i5, r5);
                        w.addRepeatedField(generatedExtension.descriptor, r5.object1);
                        return iDecodeGroupField;
                    }
                    Object field = w.getField(generatedExtension.descriptor);
                    if (field == null) {
                        field = interfaceC3578h30SchemaFor.newInstance();
                        w.setField(generatedExtension.descriptor, field);
                    }
                    return mergeGroupField(field, interfaceC3578h30SchemaFor, bArr, i2, i3, i5, r5);
                case 18:
                    InterfaceC3578h30 interfaceC3578h30SchemaFor2 = C4754uW.getInstance().schemaFor((Class) generatedExtension.getMessageDefaultInstance().getClass());
                    if (generatedExtension.isRepeated()) {
                        int iDecodeMessageField = decodeMessageField(interfaceC3578h30SchemaFor2, bArr, i2, i3, r5);
                        w.addRepeatedField(generatedExtension.descriptor, r5.object1);
                        return iDecodeMessageField;
                    }
                    Object field2 = w.getField(generatedExtension.descriptor);
                    if (field2 == null) {
                        field2 = interfaceC3578h30SchemaFor2.newInstance();
                        w.setField(generatedExtension.descriptor, field2);
                    }
                    return mergeMessageField(field2, interfaceC3578h30SchemaFor2, bArr, i2, i3, r5);
            }
        }
        if (generatedExtension.isRepeated()) {
            w.addRepeatedField(generatedExtension.descriptor, objValueOf);
        } else {
            w.setField(generatedExtension.descriptor, objValueOf);
        }
        return i2;
    }

    public static int decodeExtensionOrUnknownField(int i, byte[] bArr, int i2, int i3, Object obj, MessageLite messageLite, O0 o0, R5 r5) throws IOException {
        GeneratedMessageLite.GeneratedExtension generatedExtensionFindLiteExtensionByNumber = r5.extensionRegistry.findLiteExtensionByNumber(messageLite, i >>> 3);
        if (generatedExtensionFindLiteExtensionByNumber == null) {
            return decodeUnknownField(i, bArr, i2, i3, C2140s0.getMutableUnknownFields(obj), r5);
        }
        GeneratedMessageLite.ExtendableMessage extendableMessage = (GeneratedMessageLite.ExtendableMessage) obj;
        extendableMessage.ensureExtensionsAreMutable();
        return decodeExtension(i, bArr, i2, i3, extendableMessage, generatedExtensionFindLiteExtensionByNumber, o0, r5);
    }

    public static int decodeFixed32(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int decodeFixed32List(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, R5 r5) {
        C2113e0 c2113e0 = (C2113e0) protobufList;
        c2113e0.addInt(decodeFixed32(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int iDecodeVarint32 = decodeVarint32(bArr, i4, r5);
            if (i != r5.int1) {
                break;
            }
            c2113e0.addInt(decodeFixed32(bArr, iDecodeVarint32));
            i4 = iDecodeVarint32 + 4;
        }
        return i4;
    }

    public static long decodeFixed64(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static int decodeFixed64List(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, R5 r5) {
        C2131n0 c2131n0 = (C2131n0) protobufList;
        c2131n0.addLong(decodeFixed64(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int iDecodeVarint32 = decodeVarint32(bArr, i4, r5);
            if (i != r5.int1) {
                break;
            }
            c2131n0.addLong(decodeFixed64(bArr, iDecodeVarint32));
            i4 = iDecodeVarint32 + 8;
        }
        return i4;
    }

    public static float decodeFloat(byte[] bArr, int i) {
        return Float.intBitsToFloat(decodeFixed32(bArr, i));
    }

    public static int decodeFloatList(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, R5 r5) {
        Y y = (Y) protobufList;
        y.addFloat(decodeFloat(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int iDecodeVarint32 = decodeVarint32(bArr, i4, r5);
            if (i != r5.int1) {
                break;
            }
            y.addFloat(decodeFloat(bArr, iDecodeVarint32));
            i4 = iDecodeVarint32 + 4;
        }
        return i4;
    }

    public static int decodeGroupField(InterfaceC3578h30 interfaceC3578h30, byte[] bArr, int i, int i2, int i3, R5 r5) throws IOException {
        Object objNewInstance = interfaceC3578h30.newInstance();
        int iMergeGroupField = mergeGroupField(objNewInstance, interfaceC3578h30, bArr, i, i2, i3, r5);
        interfaceC3578h30.makeImmutable(objNewInstance);
        r5.object1 = objNewInstance;
        return iMergeGroupField;
    }

    public static int decodeGroupList(InterfaceC3578h30 interfaceC3578h30, int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, R5 r5) throws IOException {
        int i4 = (i & (-8)) | 4;
        int iDecodeGroupField = decodeGroupField(interfaceC3578h30, bArr, i2, i3, i4, r5);
        protobufList.add(r5.object1);
        while (iDecodeGroupField < i3) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeGroupField, r5);
            if (i != r5.int1) {
                break;
            }
            iDecodeGroupField = decodeGroupField(interfaceC3578h30, bArr, iDecodeVarint32, i3, i4, r5);
            protobufList.add(r5.object1);
        }
        return iDecodeGroupField;
    }

    public static int decodeMessageField(InterfaceC3578h30 interfaceC3578h30, byte[] bArr, int i, int i2, R5 r5) throws IOException {
        Object objNewInstance = interfaceC3578h30.newInstance();
        int iMergeMessageField = mergeMessageField(objNewInstance, interfaceC3578h30, bArr, i, i2, r5);
        interfaceC3578h30.makeImmutable(objNewInstance);
        r5.object1 = objNewInstance;
        return iMergeMessageField;
    }

    public static int decodeMessageList(InterfaceC3578h30 interfaceC3578h30, int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, R5 r5) throws IOException {
        int iDecodeMessageField = decodeMessageField(interfaceC3578h30, bArr, i2, i3, r5);
        protobufList.add(r5.object1);
        while (iDecodeMessageField < i3) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeMessageField, r5);
            if (i != r5.int1) {
                break;
            }
            iDecodeMessageField = decodeMessageField(interfaceC3578h30, bArr, iDecodeVarint32, i3, r5);
            protobufList.add(r5.object1);
        }
        return iDecodeMessageField;
    }

    public static int decodePackedBoolList(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, R5 r5) throws IOException {
        C2118h c2118h = (C2118h) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i, r5);
        int i2 = r5.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i2) {
            iDecodeVarint32 = decodeVarint64(bArr, iDecodeVarint32, r5);
            c2118h.addBoolean(r5.long1 != 0);
        }
        if (iDecodeVarint32 == i2) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedDoubleList(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, R5 r5) throws IOException {
        B b = (B) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i, r5);
        int i2 = r5.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i2) {
            b.addDouble(decodeDouble(bArr, iDecodeVarint32));
            iDecodeVarint32 += 8;
        }
        if (iDecodeVarint32 == i2) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedFixed32List(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, R5 r5) throws IOException {
        C2113e0 c2113e0 = (C2113e0) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i, r5);
        int i2 = r5.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i2) {
            c2113e0.addInt(decodeFixed32(bArr, iDecodeVarint32));
            iDecodeVarint32 += 4;
        }
        if (iDecodeVarint32 == i2) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedFixed64List(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, R5 r5) throws IOException {
        C2131n0 c2131n0 = (C2131n0) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i, r5);
        int i2 = r5.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i2) {
            c2131n0.addLong(decodeFixed64(bArr, iDecodeVarint32));
            iDecodeVarint32 += 8;
        }
        if (iDecodeVarint32 == i2) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedFloatList(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, R5 r5) throws IOException {
        Y y = (Y) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i, r5);
        int i2 = r5.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i2) {
            y.addFloat(decodeFloat(bArr, iDecodeVarint32));
            iDecodeVarint32 += 4;
        }
        if (iDecodeVarint32 == i2) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedSInt32List(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, R5 r5) throws IOException {
        C2113e0 c2113e0 = (C2113e0) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i, r5);
        int i2 = r5.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i2) {
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint32, r5);
            c2113e0.addInt(CodedInputStream.decodeZigZag32(r5.int1));
        }
        if (iDecodeVarint32 == i2) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedSInt64List(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, R5 r5) throws IOException {
        C2131n0 c2131n0 = (C2131n0) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i, r5);
        int i2 = r5.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i2) {
            iDecodeVarint32 = decodeVarint64(bArr, iDecodeVarint32, r5);
            c2131n0.addLong(CodedInputStream.decodeZigZag64(r5.long1));
        }
        if (iDecodeVarint32 == i2) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedVarint32List(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, R5 r5) throws IOException {
        C2113e0 c2113e0 = (C2113e0) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i, r5);
        int i2 = r5.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i2) {
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint32, r5);
            c2113e0.addInt(r5.int1);
        }
        if (iDecodeVarint32 == i2) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedVarint64List(byte[] bArr, int i, Internal.ProtobufList<?> protobufList, R5 r5) throws IOException {
        C2131n0 c2131n0 = (C2131n0) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i, r5);
        int i2 = r5.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i2) {
            iDecodeVarint32 = decodeVarint64(bArr, iDecodeVarint32, r5);
            c2131n0.addLong(r5.long1);
        }
        if (iDecodeVarint32 == i2) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodeSInt32List(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, R5 r5) {
        C2113e0 c2113e0 = (C2113e0) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i2, r5);
        c2113e0.addInt(CodedInputStream.decodeZigZag32(r5.int1));
        while (iDecodeVarint32 < i3) {
            int iDecodeVarint33 = decodeVarint32(bArr, iDecodeVarint32, r5);
            if (i != r5.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint33, r5);
            c2113e0.addInt(CodedInputStream.decodeZigZag32(r5.int1));
        }
        return iDecodeVarint32;
    }

    public static int decodeSInt64List(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, R5 r5) {
        C2131n0 c2131n0 = (C2131n0) protobufList;
        int iDecodeVarint64 = decodeVarint64(bArr, i2, r5);
        c2131n0.addLong(CodedInputStream.decodeZigZag64(r5.long1));
        while (iDecodeVarint64 < i3) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint64, r5);
            if (i != r5.int1) {
                break;
            }
            iDecodeVarint64 = decodeVarint64(bArr, iDecodeVarint32, r5);
            c2131n0.addLong(CodedInputStream.decodeZigZag64(r5.long1));
        }
        return iDecodeVarint64;
    }

    public static int decodeString(byte[] bArr, int i, R5 r5) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i, r5);
        int i2 = r5.int1;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 == 0) {
            r5.object1 = "";
            return iDecodeVarint32;
        }
        r5.object1 = new String(bArr, iDecodeVarint32, i2, Internal.UTF_8);
        return iDecodeVarint32 + i2;
    }

    public static int decodeStringList(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, R5 r5) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i2, r5);
        int i4 = r5.int1;
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
            int iDecodeVarint33 = decodeVarint32(bArr, iDecodeVarint32, r5);
            if (i != r5.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint33, r5);
            int i5 = r5.int1;
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

    public static int decodeStringListRequireUtf8(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, R5 r5) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i2, r5);
        int i4 = r5.int1;
        if (i4 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i4 == 0) {
            protobufList.add("");
        } else {
            int i5 = iDecodeVarint32 + i4;
            if (!Ng0.isValidUtf8(bArr, iDecodeVarint32, i5)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            protobufList.add(new String(bArr, iDecodeVarint32, i4, Internal.UTF_8));
            iDecodeVarint32 = i5;
        }
        while (iDecodeVarint32 < i3) {
            int iDecodeVarint33 = decodeVarint32(bArr, iDecodeVarint32, r5);
            if (i != r5.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint33, r5);
            int i6 = r5.int1;
            if (i6 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i6 == 0) {
                protobufList.add("");
            } else {
                int i7 = iDecodeVarint32 + i6;
                if (!Ng0.isValidUtf8(bArr, iDecodeVarint32, i7)) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                protobufList.add(new String(bArr, iDecodeVarint32, i6, Internal.UTF_8));
                iDecodeVarint32 = i7;
            }
        }
        return iDecodeVarint32;
    }

    public static int decodeStringRequireUtf8(byte[] bArr, int i, R5 r5) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i, r5);
        int i2 = r5.int1;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i2 == 0) {
            r5.object1 = "";
            return iDecodeVarint32;
        }
        r5.object1 = Ng0.decodeUtf8(bArr, iDecodeVarint32, i2);
        return iDecodeVarint32 + i2;
    }

    public static int decodeUnknownField(int i, byte[] bArr, int i2, int i3, UnknownFieldSetLite unknownFieldSetLite, R5 r5) throws InvalidProtocolBufferException {
        if (WireFormat.getTagFieldNumber(i) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int tagWireType = WireFormat.getTagWireType(i);
        if (tagWireType == 0) {
            int iDecodeVarint64 = decodeVarint64(bArr, i2, r5);
            unknownFieldSetLite.storeField(i, Long.valueOf(r5.long1));
            return iDecodeVarint64;
        }
        if (tagWireType == 1) {
            unknownFieldSetLite.storeField(i, Long.valueOf(decodeFixed64(bArr, i2)));
            return i2 + 8;
        }
        if (tagWireType == 2) {
            int iDecodeVarint32 = decodeVarint32(bArr, i2, r5);
            int i4 = r5.int1;
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
        int i6 = 0;
        while (i2 < i3) {
            int iDecodeVarint33 = decodeVarint32(bArr, i2, r5);
            int i7 = r5.int1;
            if (i7 == i5) {
                i6 = i7;
                i2 = iDecodeVarint33;
                break;
            }
            i6 = i7;
            i2 = decodeUnknownField(i7, bArr, iDecodeVarint33, i3, unknownFieldSetLiteNewInstance, r5);
        }
        if (i2 > i3 || i6 != i5) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        unknownFieldSetLite.storeField(i, unknownFieldSetLiteNewInstance);
        return i2;
    }

    public static int decodeVarint32(int i, byte[] bArr, int i2, R5 r5) {
        int i3 = i & EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            r5.int1 = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            r5.int1 = i5 | (b2 << cw.l);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            r5.int1 = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            r5.int1 = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                r5.int1 = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int decodeVarint32List(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, R5 r5) {
        C2113e0 c2113e0 = (C2113e0) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i2, r5);
        c2113e0.addInt(r5.int1);
        while (iDecodeVarint32 < i3) {
            int iDecodeVarint33 = decodeVarint32(bArr, iDecodeVarint32, r5);
            if (i != r5.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint33, r5);
            c2113e0.addInt(r5.int1);
        }
        return iDecodeVarint32;
    }

    public static int decodeVarint64(long j, byte[] bArr, int i, R5 r5) {
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
        r5.long1 = j2;
        return i2;
    }

    public static int decodeVarint64List(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList<?> protobufList, R5 r5) {
        C2131n0 c2131n0 = (C2131n0) protobufList;
        int iDecodeVarint64 = decodeVarint64(bArr, i2, r5);
        c2131n0.addLong(r5.long1);
        while (iDecodeVarint64 < i3) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint64, r5);
            if (i != r5.int1) {
                break;
            }
            iDecodeVarint64 = decodeVarint64(bArr, iDecodeVarint32, r5);
            c2131n0.addLong(r5.long1);
        }
        return iDecodeVarint64;
    }

    public static int mergeGroupField(Object obj, InterfaceC3578h30 interfaceC3578h30, byte[] bArr, int i, int i2, int i3, R5 r5) throws IOException {
        int proto2Message = ((C2140s0) interfaceC3578h30).parseProto2Message(obj, bArr, i, i2, i3, r5);
        r5.object1 = obj;
        return proto2Message;
    }

    public static int mergeMessageField(Object obj, InterfaceC3578h30 interfaceC3578h30, byte[] bArr, int i, int i2, R5 r5) throws IOException {
        int iDecodeVarint32 = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iDecodeVarint32 = decodeVarint32(i3, bArr, iDecodeVarint32, r5);
            i3 = r5.int1;
        }
        int i4 = iDecodeVarint32;
        if (i3 < 0 || i3 > i2 - i4) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i5 = i3 + i4;
        interfaceC3578h30.mergeFrom(obj, bArr, i4, i5, r5);
        r5.object1 = obj;
        return i5;
    }

    public static int skipField(int i, byte[] bArr, int i2, int i3, R5 r5) throws InvalidProtocolBufferException {
        if (WireFormat.getTagFieldNumber(i) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int tagWireType = WireFormat.getTagWireType(i);
        if (tagWireType == 0) {
            return decodeVarint64(bArr, i2, r5);
        }
        if (tagWireType == 1) {
            return i2 + 8;
        }
        if (tagWireType == 2) {
            return decodeVarint32(bArr, i2, r5) + r5.int1;
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
            i2 = decodeVarint32(bArr, i2, r5);
            i5 = r5.int1;
            if (i5 == i4) {
                break;
            }
            i2 = skipField(i5, bArr, i2, i3, r5);
        }
        if (i2 > i3 || i5 != i4) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i2;
    }

    public static int decodeVarint64(byte[] bArr, int i, R5 r5) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            r5.long1 = j;
            return i2;
        }
        return decodeVarint64(j, bArr, i2, r5);
    }

    public static int decodeVarint32(byte[] bArr, int i, R5 r5) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            r5.int1 = b;
            return i2;
        }
        return decodeVarint32(b, bArr, i2, r5);
    }
}
