package com.google.protobuf;

import com.badlogic.gdx.Input;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3913kt;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3354ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3603hM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3709ic;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4754uW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4931wX;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DR;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ER;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3515gM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3578h30;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3642hm0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3868kP;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ng0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.QS;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.R5;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.protobuf.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2140s0 implements InterfaceC3578h30 {
    private static final int ENFORCE_UTF8_MASK = 536870912;
    private static final int FIELD_TYPE_MASK = 267386880;
    private static final int INTS_PER_FIELD = 3;
    private static final int NO_PRESENCE_SENTINEL = 1048575;
    private static final int OFFSET_BITS = 20;
    private static final int OFFSET_MASK = 1048575;
    static final int ONEOF_TYPE_OFFSET = 51;
    private static final int REQUIRED_MASK = 268435456;
    private final int[] buffer;
    private final int checkInitializedCount;
    private final MessageLite defaultInstance;
    private final AbstractC3913kt extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final AbstractC2127l0 listFieldSchema;
    private final boolean lite;
    private final InterfaceC3515gM mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final DR newInstanceSchema;
    private final Object[] objects;
    private final boolean proto3;
    private final int repeatedFieldOffsetStart;
    private final O0 unknownFieldSchema;
    private final boolean useCachedSizeField;
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Unsafe UNSAFE = U0.getUnsafe();

    private C2140s0(int[] iArr, Object[] objArr, int i, int i2, MessageLite messageLite, boolean z, boolean z2, int[] iArr2, int i3, int i4, DR dr, AbstractC2127l0 abstractC2127l0, O0 o0, AbstractC3913kt abstractC3913kt, InterfaceC3515gM interfaceC3515gM) {
        this.buffer = iArr;
        this.objects = objArr;
        this.minFieldNumber = i;
        this.maxFieldNumber = i2;
        this.lite = messageLite instanceof GeneratedMessageLite;
        this.proto3 = z;
        this.hasExtensions = abstractC3913kt != null && abstractC3913kt.hasExtensions(messageLite);
        this.useCachedSizeField = z2;
        this.intArray = iArr2;
        this.checkInitializedCount = i3;
        this.repeatedFieldOffsetStart = i4;
        this.newInstanceSchema = dr;
        this.listFieldSchema = abstractC2127l0;
        this.unknownFieldSchema = o0;
        this.extensionSchema = abstractC3913kt;
        this.defaultInstance = messageLite;
        this.mapFieldSchema = interfaceC3515gM;
    }

    private boolean arePresentForEquals(Object obj, Object obj2, int i) {
        return isFieldPresent(obj, i) == isFieldPresent(obj2, i);
    }

    private static <T> boolean booleanAt(T t, long j) {
        return U0.getBoolean(t, j);
    }

    private static void checkMutable(Object obj) {
        if (isMutable(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <K, V> int decodeMapEntry(byte[] bArr, int i, int i2, C2135p0 c2135p0, Map<K, V> map, R5 r5) throws IOException {
        int iDecodeVarint32;
        int iDecodeVarint33 = C2114f.decodeVarint32(bArr, i, r5);
        int i3 = r5.int1;
        if (i3 < 0 || i3 > i2 - iDecodeVarint33) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i4 = iDecodeVarint33 + i3;
        Object obj = c2135p0.defaultKey;
        Object obj2 = c2135p0.defaultValue;
        while (iDecodeVarint33 < i4) {
            int i5 = iDecodeVarint33 + 1;
            int i6 = bArr[iDecodeVarint33];
            if (i6 < 0) {
                iDecodeVarint32 = C2114f.decodeVarint32(i6, bArr, i5, r5);
                i6 = r5.int1;
            } else {
                iDecodeVarint32 = i5;
            }
            int i7 = i6 >>> 3;
            int i8 = i6 & 7;
            if (i7 != 1) {
                if (i7 == 2 && i8 == c2135p0.valueType.getWireType()) {
                    iDecodeVarint33 = decodeMapEntryValue(bArr, iDecodeVarint32, i2, c2135p0.valueType, c2135p0.defaultValue.getClass(), r5);
                    obj2 = r5.object1;
                } else {
                    iDecodeVarint33 = C2114f.skipField(i6, bArr, iDecodeVarint32, i2, r5);
                }
            } else if (i8 == c2135p0.keyType.getWireType()) {
                iDecodeVarint33 = decodeMapEntryValue(bArr, iDecodeVarint32, i2, c2135p0.keyType, null, r5);
                obj = r5.object1;
            } else {
                iDecodeVarint33 = C2114f.skipField(i6, bArr, iDecodeVarint32, i2, r5);
            }
        }
        if (iDecodeVarint33 != i4) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        map.put(obj, obj2);
        return i4;
    }

    private int decodeMapEntryValue(byte[] bArr, int i, int i2, WireFormat.FieldType fieldType, Class<?> cls, R5 r5) throws IOException {
        switch (AbstractC2138r0.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                int iDecodeVarint64 = C2114f.decodeVarint64(bArr, i, r5);
                r5.object1 = Boolean.valueOf(r5.long1 != 0);
                return iDecodeVarint64;
            case 2:
                return C2114f.decodeBytes(bArr, i, r5);
            case 3:
                r5.object1 = Double.valueOf(C2114f.decodeDouble(bArr, i));
                return i + 8;
            case 4:
            case 5:
                r5.object1 = Integer.valueOf(C2114f.decodeFixed32(bArr, i));
                return i + 4;
            case 6:
            case 7:
                r5.object1 = Long.valueOf(C2114f.decodeFixed64(bArr, i));
                return i + 8;
            case 8:
                r5.object1 = Float.valueOf(C2114f.decodeFloat(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int iDecodeVarint32 = C2114f.decodeVarint32(bArr, i, r5);
                r5.object1 = Integer.valueOf(r5.int1);
                return iDecodeVarint32;
            case 12:
            case 13:
                int iDecodeVarint65 = C2114f.decodeVarint64(bArr, i, r5);
                r5.object1 = Long.valueOf(r5.long1);
                return iDecodeVarint65;
            case 14:
                return C2114f.decodeMessageField(C4754uW.getInstance().schemaFor((Class) cls), bArr, i, i2, r5);
            case 15:
                int iDecodeVarint33 = C2114f.decodeVarint32(bArr, i, r5);
                r5.object1 = Integer.valueOf(CodedInputStream.decodeZigZag32(r5.int1));
                return iDecodeVarint33;
            case 16:
                int iDecodeVarint66 = C2114f.decodeVarint64(bArr, i, r5);
                r5.object1 = Long.valueOf(CodedInputStream.decodeZigZag64(r5.long1));
                return iDecodeVarint66;
            case 17:
                return C2114f.decodeStringRequireUtf8(bArr, i, r5);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static <T> double doubleAt(T t, long j) {
        return U0.getDouble(t, j);
    }

    private <UT, UB> UB filterMapUnknownEnumValues(Object obj, int i, UB ub, O0 o0, Object obj2) {
        Internal.EnumVerifier enumFieldVerifier;
        int iNumberAt = numberAt(i);
        Object object = U0.getObject(obj, offset(typeAndOffsetAt(i)));
        return (object == null || (enumFieldVerifier = getEnumFieldVerifier(i)) == null) ? ub : (UB) filterUnknownEnumMap(i, iNumberAt, ((C3603hM) this.mapFieldSchema).forMutableMapData(object), enumFieldVerifier, ub, o0, obj2);
    }

    private <K, V, UT, UB> UB filterUnknownEnumMap(int i, int i2, Map<K, V> map, Internal.EnumVerifier enumVerifier, UB ub, O0 o0, Object obj) {
        C2135p0 c2135p0ForMapMetadata = ((C3603hM) this.mapFieldSchema).forMapMetadata(getMapFieldDefaultEntry(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!enumVerifier.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = (UB) o0.getBuilderFromMessage(obj);
                }
                C3709ic c3709icNewCodedBuilder = ByteString.newCodedBuilder(MapEntryLite.computeSerializedSize(c2135p0ForMapMetadata, next.getKey(), next.getValue()));
                try {
                    MapEntryLite.writeTo(c3709icNewCodedBuilder.getCodedOutput(), c2135p0ForMapMetadata, next.getKey(), next.getValue());
                    o0.addLengthDelimited(ub, i2, c3709icNewCodedBuilder.build());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    private static <T> float floatAt(T t, long j) {
        return U0.getFloat(t, j);
    }

    private Internal.EnumVerifier getEnumFieldVerifier(int i) {
        return (Internal.EnumVerifier) this.objects[((i / 3) * 2) + 1];
    }

    private Object getMapFieldDefaultEntry(int i) {
        return this.objects[(i / 3) * 2];
    }

    private InterfaceC3578h30 getMessageFieldSchema(int i) {
        int i2 = (i / 3) * 2;
        InterfaceC3578h30 interfaceC3578h30 = (InterfaceC3578h30) this.objects[i2];
        if (interfaceC3578h30 != null) {
            return interfaceC3578h30;
        }
        InterfaceC3578h30 interfaceC3578h30SchemaFor = C4754uW.getInstance().schemaFor((Class) this.objects[i2 + 1]);
        this.objects[i2] = interfaceC3578h30SchemaFor;
        return interfaceC3578h30SchemaFor;
    }

    public static UnknownFieldSetLite getMutableUnknownFields(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != UnknownFieldSetLite.getDefaultInstance()) {
            return unknownFieldSetLite;
        }
        UnknownFieldSetLite unknownFieldSetLiteNewInstance = UnknownFieldSetLite.newInstance();
        generatedMessageLite.unknownFields = unknownFieldSetLiteNewInstance;
        return unknownFieldSetLiteNewInstance;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x0079 A[PHI: r6
  0x0079: PHI (r6v4 int) = 
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v7 int)
  (r6v1 int)
  (r6v8 int)
  (r6v1 int)
  (r6v9 int)
  (r6v1 int)
  (r6v10 int)
  (r6v1 int)
  (r6v11 int)
  (r6v1 int)
  (r6v12 int)
  (r6v1 int)
  (r6v13 int)
  (r6v1 int)
  (r6v14 int)
  (r6v1 int)
  (r6v15 int)
  (r6v1 int)
  (r6v16 int)
  (r6v1 int)
  (r6v17 int)
  (r6v1 int)
  (r6v18 int)
  (r6v1 int)
  (r6v19 int)
  (r6v1 int)
  (r6v20 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v21 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v22 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v23 int)
  (r6v1 int)
 binds: [B:20:0x0060, B:223:0x04d2, B:220:0x04c7, B:214:0x04ab, B:211:0x0499, B:208:0x0489, B:205:0x047b, B:202:0x046d, B:199:0x0462, B:196:0x0458, B:193:0x044a, B:190:0x043c, B:187:0x0428, B:164:0x0334, B:168:0x033e, B:158:0x0316, B:162:0x0320, B:152:0x02f8, B:156:0x0302, B:146:0x02da, B:150:0x02e4, B:140:0x02bc, B:144:0x02c6, B:134:0x029e, B:138:0x02a8, B:128:0x0280, B:132:0x028a, B:122:0x0262, B:126:0x026c, B:116:0x0244, B:120:0x024e, B:110:0x0226, B:114:0x0230, B:104:0x0208, B:108:0x0212, B:98:0x01ea, B:102:0x01f4, B:92:0x01cc, B:96:0x01d6, B:86:0x01ae, B:90:0x01b8, B:81:0x0178, B:78:0x016c, B:75:0x015c, B:72:0x014c, B:69:0x013c, B:66:0x0130, B:63:0x0124, B:60:0x0117, B:57:0x0108, B:53:0x00f8, B:50:0x00e5, B:47:0x00d4, B:44:0x00c5, B:41:0x00b6, B:39:0x00b0, B:37:0x00a9, B:34:0x009e, B:31:0x008f, B:28:0x0080, B:25:0x0078, B:23:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    private int getSerializedSizeProto2(Object obj) {
        int i;
        int i2;
        int iComputeDoubleSize;
        int iComputeBoolSize;
        int iComputeBytesSize;
        int iComputeSFixed32Size;
        Unsafe unsafe = UNSAFE;
        int i3 = 1048575;
        int i4 = 0;
        int iK = 0;
        int i5 = 1048575;
        int i6 = 0;
        while (i4 < this.buffer.length) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i4);
            int iNumberAt = numberAt(i4);
            int iType = type(iTypeAndOffsetAt);
            if (iType <= 17) {
                i = this.buffer[i4 + 2];
                int i7 = i & i3;
                i2 = 1 << (i >>> 20);
                if (i7 != i5) {
                    i6 = unsafe.getInt(obj, i7);
                    i5 = i7;
                }
            } else {
                i = (!this.useCachedSizeField || iType < FieldType.DOUBLE_LIST_PACKED.id() || iType > FieldType.SINT64_LIST_PACKED.id()) ? 0 : this.buffer[i4 + 2] & i3;
                i2 = 0;
            }
            long jOffset = offset(iTypeAndOffsetAt);
            switch (iType) {
                case 0:
                    if ((i6 & i2) != 0) {
                        iComputeDoubleSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        iK += iComputeDoubleSize;
                    }
                    break;
                case 1:
                    if ((i6 & i2) != 0) {
                        iComputeDoubleSize = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        iK += iComputeDoubleSize;
                    }
                    break;
                case 2:
                    if ((i6 & i2) != 0) {
                        iComputeDoubleSize = CodedOutputStream.computeInt64Size(iNumberAt, unsafe.getLong(obj, jOffset));
                        iK += iComputeDoubleSize;
                    }
                    break;
                case 3:
                    if ((i6 & i2) != 0) {
                        iComputeDoubleSize = CodedOutputStream.computeUInt64Size(iNumberAt, unsafe.getLong(obj, jOffset));
                        iK += iComputeDoubleSize;
                    }
                    break;
                case 4:
                    if ((i6 & i2) != 0) {
                        iComputeDoubleSize = CodedOutputStream.computeInt32Size(iNumberAt, unsafe.getInt(obj, jOffset));
                        iK += iComputeDoubleSize;
                    }
                    break;
                case 5:
                    if ((i6 & i2) != 0) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        iK += iComputeDoubleSize;
                    }
                    break;
                case 6:
                    if ((i6 & i2) != 0) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        iK += iComputeDoubleSize;
                    }
                    break;
                case 7:
                    if ((i6 & i2) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        iK += iComputeBoolSize;
                    }
                    break;
                case 8:
                    if ((i6 & i2) != 0) {
                        Object object = unsafe.getObject(obj, jOffset);
                        iComputeBytesSize = object instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object) : CodedOutputStream.computeStringSize(iNumberAt, (String) object);
                        iK = iComputeBytesSize + iK;
                    }
                    break;
                case 9:
                    if ((i6 & i2) != 0) {
                        iComputeBoolSize = D0.computeSizeMessage(iNumberAt, unsafe.getObject(obj, jOffset), getMessageFieldSchema(i4));
                        iK += iComputeBoolSize;
                    }
                    break;
                case 10:
                    if ((i6 & i2) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) unsafe.getObject(obj, jOffset));
                        iK += iComputeBoolSize;
                    }
                    break;
                case 11:
                    if ((i6 & i2) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeUInt32Size(iNumberAt, unsafe.getInt(obj, jOffset));
                        iK += iComputeBoolSize;
                    }
                    break;
                case 12:
                    if ((i6 & i2) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeEnumSize(iNumberAt, unsafe.getInt(obj, jOffset));
                        iK += iComputeBoolSize;
                    }
                    break;
                case 13:
                    if ((i6 & i2) != 0) {
                        iComputeSFixed32Size = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        iK += iComputeSFixed32Size;
                    }
                    break;
                case 14:
                    if ((i6 & i2) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        iK += iComputeBoolSize;
                    }
                    break;
                case 15:
                    if ((i6 & i2) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeSInt32Size(iNumberAt, unsafe.getInt(obj, jOffset));
                        iK += iComputeBoolSize;
                    }
                    break;
                case 16:
                    if ((i6 & i2) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeSInt64Size(iNumberAt, unsafe.getLong(obj, jOffset));
                        iK += iComputeBoolSize;
                    }
                    break;
                case 17:
                    if ((i6 & i2) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) unsafe.getObject(obj, jOffset), getMessageFieldSchema(i4));
                        iK += iComputeBoolSize;
                    }
                    break;
                case 18:
                    iComputeBoolSize = D0.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(obj, jOffset), false);
                    iK += iComputeBoolSize;
                    break;
                case 19:
                    iComputeBoolSize = D0.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(obj, jOffset), false);
                    iK += iComputeBoolSize;
                    break;
                case 20:
                    iComputeBoolSize = D0.computeSizeInt64List(iNumberAt, (List) unsafe.getObject(obj, jOffset), false);
                    iK += iComputeBoolSize;
                    break;
                case 21:
                    iComputeBoolSize = D0.computeSizeUInt64List(iNumberAt, (List) unsafe.getObject(obj, jOffset), false);
                    iK += iComputeBoolSize;
                    break;
                case 22:
                    iComputeBoolSize = D0.computeSizeInt32List(iNumberAt, (List) unsafe.getObject(obj, jOffset), false);
                    iK += iComputeBoolSize;
                    break;
                case 23:
                    iComputeBoolSize = D0.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(obj, jOffset), false);
                    iK += iComputeBoolSize;
                    break;
                case 24:
                    iComputeBoolSize = D0.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(obj, jOffset), false);
                    iK += iComputeBoolSize;
                    break;
                case 25:
                    iComputeBoolSize = D0.computeSizeBoolList(iNumberAt, (List) unsafe.getObject(obj, jOffset), false);
                    iK += iComputeBoolSize;
                    break;
                case 26:
                    iComputeBoolSize = D0.computeSizeStringList(iNumberAt, (List) unsafe.getObject(obj, jOffset));
                    iK += iComputeBoolSize;
                    break;
                case 27:
                    iComputeBoolSize = D0.computeSizeMessageList(iNumberAt, (List) unsafe.getObject(obj, jOffset), getMessageFieldSchema(i4));
                    iK += iComputeBoolSize;
                    break;
                case 28:
                    iComputeBoolSize = D0.computeSizeByteStringList(iNumberAt, (List) unsafe.getObject(obj, jOffset));
                    iK += iComputeBoolSize;
                    break;
                case 29:
                    iComputeBoolSize = D0.computeSizeUInt32List(iNumberAt, (List) unsafe.getObject(obj, jOffset), false);
                    iK += iComputeBoolSize;
                    break;
                case 30:
                    iComputeBoolSize = D0.computeSizeEnumList(iNumberAt, (List) unsafe.getObject(obj, jOffset), false);
                    iK += iComputeBoolSize;
                    break;
                case 31:
                    iComputeBoolSize = D0.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(obj, jOffset), false);
                    iK += iComputeBoolSize;
                    break;
                case 32:
                    iComputeBoolSize = D0.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(obj, jOffset), false);
                    iK += iComputeBoolSize;
                    break;
                case 33:
                    iComputeBoolSize = D0.computeSizeSInt32List(iNumberAt, (List) unsafe.getObject(obj, jOffset), false);
                    iK += iComputeBoolSize;
                    break;
                case 34:
                    iComputeBoolSize = D0.computeSizeSInt64List(iNumberAt, (List) unsafe.getObject(obj, jOffset), false);
                    iK += iComputeBoolSize;
                    break;
                case 35:
                    int iComputeSizeFixed64ListNoTag = D0.computeSizeFixed64ListNoTag((List) unsafe.getObject(obj, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, iComputeSizeFixed64ListNoTag);
                        }
                        iK = AbstractC3950lJ.k(iComputeSizeFixed64ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeFixed64ListNoTag, iK);
                    }
                    break;
                case 36:
                    int iComputeSizeFixed32ListNoTag = D0.computeSizeFixed32ListNoTag((List) unsafe.getObject(obj, jOffset));
                    if (iComputeSizeFixed32ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, iComputeSizeFixed32ListNoTag);
                        }
                        iK = AbstractC3950lJ.k(iComputeSizeFixed32ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeFixed32ListNoTag, iK);
                    }
                    break;
                case 37:
                    int iComputeSizeInt64ListNoTag = D0.computeSizeInt64ListNoTag((List) unsafe.getObject(obj, jOffset));
                    if (iComputeSizeInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, iComputeSizeInt64ListNoTag);
                        }
                        iK = AbstractC3950lJ.k(iComputeSizeInt64ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeInt64ListNoTag, iK);
                    }
                    break;
                case 38:
                    int iComputeSizeUInt64ListNoTag = D0.computeSizeUInt64ListNoTag((List) unsafe.getObject(obj, jOffset));
                    if (iComputeSizeUInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, iComputeSizeUInt64ListNoTag);
                        }
                        iK = AbstractC3950lJ.k(iComputeSizeUInt64ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeUInt64ListNoTag, iK);
                    }
                    break;
                case 39:
                    int iComputeSizeInt32ListNoTag = D0.computeSizeInt32ListNoTag((List) unsafe.getObject(obj, jOffset));
                    if (iComputeSizeInt32ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, iComputeSizeInt32ListNoTag);
                        }
                        iK = AbstractC3950lJ.k(iComputeSizeInt32ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeInt32ListNoTag, iK);
                    }
                    break;
                case 40:
                    int iComputeSizeFixed64ListNoTag2 = D0.computeSizeFixed64ListNoTag((List) unsafe.getObject(obj, jOffset));
                    if (iComputeSizeFixed64ListNoTag2 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, iComputeSizeFixed64ListNoTag2);
                        }
                        iK = AbstractC3950lJ.k(iComputeSizeFixed64ListNoTag2, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeFixed64ListNoTag2, iK);
                    }
                    break;
                case 41:
                    int iComputeSizeFixed32ListNoTag2 = D0.computeSizeFixed32ListNoTag((List) unsafe.getObject(obj, jOffset));
                    if (iComputeSizeFixed32ListNoTag2 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, iComputeSizeFixed32ListNoTag2);
                        }
                        iK = AbstractC3950lJ.k(iComputeSizeFixed32ListNoTag2, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeFixed32ListNoTag2, iK);
                    }
                    break;
                case 42:
                    int iComputeSizeBoolListNoTag = D0.computeSizeBoolListNoTag((List) unsafe.getObject(obj, jOffset));
                    if (iComputeSizeBoolListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, iComputeSizeBoolListNoTag);
                        }
                        iK = AbstractC3950lJ.k(iComputeSizeBoolListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeBoolListNoTag, iK);
                    }
                    break;
                case 43:
                    int iComputeSizeUInt32ListNoTag = D0.computeSizeUInt32ListNoTag((List) unsafe.getObject(obj, jOffset));
                    if (iComputeSizeUInt32ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, iComputeSizeUInt32ListNoTag);
                        }
                        iK = AbstractC3950lJ.k(iComputeSizeUInt32ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeUInt32ListNoTag, iK);
                    }
                    break;
                case 44:
                    int iComputeSizeEnumListNoTag = D0.computeSizeEnumListNoTag((List) unsafe.getObject(obj, jOffset));
                    if (iComputeSizeEnumListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, iComputeSizeEnumListNoTag);
                        }
                        iK = AbstractC3950lJ.k(iComputeSizeEnumListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeEnumListNoTag, iK);
                    }
                    break;
                case 45:
                    int iComputeSizeFixed32ListNoTag3 = D0.computeSizeFixed32ListNoTag((List) unsafe.getObject(obj, jOffset));
                    if (iComputeSizeFixed32ListNoTag3 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, iComputeSizeFixed32ListNoTag3);
                        }
                        iK = AbstractC3950lJ.k(iComputeSizeFixed32ListNoTag3, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeFixed32ListNoTag3, iK);
                    }
                    break;
                case 46:
                    int iComputeSizeFixed64ListNoTag3 = D0.computeSizeFixed64ListNoTag((List) unsafe.getObject(obj, jOffset));
                    if (iComputeSizeFixed64ListNoTag3 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, iComputeSizeFixed64ListNoTag3);
                        }
                        iK = AbstractC3950lJ.k(iComputeSizeFixed64ListNoTag3, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeFixed64ListNoTag3, iK);
                    }
                    break;
                case 47:
                    int iComputeSizeSInt32ListNoTag = D0.computeSizeSInt32ListNoTag((List) unsafe.getObject(obj, jOffset));
                    if (iComputeSizeSInt32ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, iComputeSizeSInt32ListNoTag);
                        }
                        iK = AbstractC3950lJ.k(iComputeSizeSInt32ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeSInt32ListNoTag, iK);
                    }
                    break;
                case 48:
                    int iComputeSizeSInt64ListNoTag = D0.computeSizeSInt64ListNoTag((List) unsafe.getObject(obj, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i, iComputeSizeSInt64ListNoTag);
                        }
                        iK = AbstractC3950lJ.k(iComputeSizeSInt64ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeSInt64ListNoTag, iK);
                    }
                    break;
                case 49:
                    iComputeBoolSize = D0.computeSizeGroupList(iNumberAt, (List) unsafe.getObject(obj, jOffset), getMessageFieldSchema(i4));
                    iK += iComputeBoolSize;
                    break;
                case 50:
                    iComputeBoolSize = ((C3603hM) this.mapFieldSchema).getSerializedSize(iNumberAt, unsafe.getObject(obj, jOffset), getMapFieldDefaultEntry(i4));
                    iK += iComputeBoolSize;
                    break;
                case 51:
                    if (isOneofPresent(obj, iNumberAt, i4)) {
                        iComputeBoolSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        iK += iComputeBoolSize;
                    }
                    break;
                case 52:
                    if (isOneofPresent(obj, iNumberAt, i4)) {
                        iComputeBoolSize = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        iK += iComputeBoolSize;
                    }
                    break;
                case 53:
                    if (isOneofPresent(obj, iNumberAt, i4)) {
                        iComputeBoolSize = CodedOutputStream.computeInt64Size(iNumberAt, oneofLongAt(obj, jOffset));
                        iK += iComputeBoolSize;
                    }
                    break;
                case 54:
                    if (isOneofPresent(obj, iNumberAt, i4)) {
                        iComputeBoolSize = CodedOutputStream.computeUInt64Size(iNumberAt, oneofLongAt(obj, jOffset));
                        iK += iComputeBoolSize;
                    }
                    break;
                case 55:
                    if (isOneofPresent(obj, iNumberAt, i4)) {
                        iComputeBoolSize = CodedOutputStream.computeInt32Size(iNumberAt, oneofIntAt(obj, jOffset));
                        iK += iComputeBoolSize;
                    }
                    break;
                case Input.Keys.PERIOD /* 56 */:
                    if (isOneofPresent(obj, iNumberAt, i4)) {
                        iComputeBoolSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        iK += iComputeBoolSize;
                    }
                    break;
                case Input.Keys.ALT_LEFT /* 57 */:
                    if (isOneofPresent(obj, iNumberAt, i4)) {
                        iComputeSFixed32Size = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        iK += iComputeSFixed32Size;
                    }
                    break;
                case Input.Keys.ALT_RIGHT /* 58 */:
                    if (isOneofPresent(obj, iNumberAt, i4)) {
                        iComputeBoolSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        iK += iComputeBoolSize;
                    }
                    break;
                case Input.Keys.SHIFT_LEFT /* 59 */:
                    if (isOneofPresent(obj, iNumberAt, i4)) {
                        Object object2 = unsafe.getObject(obj, jOffset);
                        iComputeBytesSize = object2 instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object2) : CodedOutputStream.computeStringSize(iNumberAt, (String) object2);
                        iK = iComputeBytesSize + iK;
                    }
                    break;
                case 60:
                    if (isOneofPresent(obj, iNumberAt, i4)) {
                        iComputeBoolSize = D0.computeSizeMessage(iNumberAt, unsafe.getObject(obj, jOffset), getMessageFieldSchema(i4));
                        iK += iComputeBoolSize;
                    }
                    break;
                case Input.Keys.TAB /* 61 */:
                    if (isOneofPresent(obj, iNumberAt, i4)) {
                        iComputeBoolSize = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) unsafe.getObject(obj, jOffset));
                        iK += iComputeBoolSize;
                    }
                    break;
                case Input.Keys.SPACE /* 62 */:
                    if (isOneofPresent(obj, iNumberAt, i4)) {
                        iComputeBoolSize = CodedOutputStream.computeUInt32Size(iNumberAt, oneofIntAt(obj, jOffset));
                        iK += iComputeBoolSize;
                    }
                    break;
                case 63:
                    if (isOneofPresent(obj, iNumberAt, i4)) {
                        iComputeBoolSize = CodedOutputStream.computeEnumSize(iNumberAt, oneofIntAt(obj, jOffset));
                        iK += iComputeBoolSize;
                    }
                    break;
                case 64:
                    if (isOneofPresent(obj, iNumberAt, i4)) {
                        iComputeSFixed32Size = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        iK += iComputeSFixed32Size;
                    }
                    break;
                case 65:
                    if (isOneofPresent(obj, iNumberAt, i4)) {
                        iComputeBoolSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        iK += iComputeBoolSize;
                    }
                    break;
                case 66:
                    if (isOneofPresent(obj, iNumberAt, i4)) {
                        iComputeBoolSize = CodedOutputStream.computeSInt32Size(iNumberAt, oneofIntAt(obj, jOffset));
                        iK += iComputeBoolSize;
                    }
                    break;
                case 67:
                    if (isOneofPresent(obj, iNumberAt, i4)) {
                        iComputeBoolSize = CodedOutputStream.computeSInt64Size(iNumberAt, oneofLongAt(obj, jOffset));
                        iK += iComputeBoolSize;
                    }
                    break;
                case Input.Keys.GRAVE /* 68 */:
                    if (isOneofPresent(obj, iNumberAt, i4)) {
                        iComputeBoolSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) unsafe.getObject(obj, jOffset), getMessageFieldSchema(i4));
                        iK += iComputeBoolSize;
                    }
                    break;
                default:
                    break;
            }
            i4 += 3;
            i3 = 1048575;
        }
        int unknownFieldsSerializedSize = iK + getUnknownFieldsSerializedSize(this.unknownFieldSchema, obj);
        return this.hasExtensions ? unknownFieldsSerializedSize + this.extensionSchema.getExtensions(obj).getSerializedSize() : unknownFieldsSerializedSize;
    }

    private int getSerializedSizeProto3(Object obj) {
        int iComputeDoubleSize;
        int iComputeBytesSize;
        Unsafe unsafe = UNSAFE;
        int iK = 0;
        for (int i = 0; i < this.buffer.length; i += 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i);
            int iType = type(iTypeAndOffsetAt);
            int iNumberAt = numberAt(i);
            long jOffset = offset(iTypeAndOffsetAt);
            int i2 = (iType < FieldType.DOUBLE_LIST_PACKED.id() || iType > FieldType.SINT64_LIST_PACKED.id()) ? 0 : this.buffer[i + 2] & 1048575;
            switch (iType) {
                case 0:
                    if (isFieldPresent(obj, i)) {
                        iComputeDoubleSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        iK += iComputeDoubleSize;
                    }
                    break;
                case 1:
                    if (isFieldPresent(obj, i)) {
                        iComputeDoubleSize = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        iK += iComputeDoubleSize;
                    }
                    break;
                case 2:
                    if (isFieldPresent(obj, i)) {
                        iComputeDoubleSize = CodedOutputStream.computeInt64Size(iNumberAt, U0.getLong(obj, jOffset));
                        iK += iComputeDoubleSize;
                    }
                    break;
                case 3:
                    if (isFieldPresent(obj, i)) {
                        iComputeDoubleSize = CodedOutputStream.computeUInt64Size(iNumberAt, U0.getLong(obj, jOffset));
                        iK += iComputeDoubleSize;
                    }
                    break;
                case 4:
                    if (isFieldPresent(obj, i)) {
                        iComputeDoubleSize = CodedOutputStream.computeInt32Size(iNumberAt, U0.getInt(obj, jOffset));
                        iK += iComputeDoubleSize;
                    }
                    break;
                case 5:
                    if (isFieldPresent(obj, i)) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        iK += iComputeDoubleSize;
                    }
                    break;
                case 6:
                    if (isFieldPresent(obj, i)) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        iK += iComputeDoubleSize;
                    }
                    break;
                case 7:
                    if (isFieldPresent(obj, i)) {
                        iComputeDoubleSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        iK += iComputeDoubleSize;
                    }
                    break;
                case 8:
                    if (isFieldPresent(obj, i)) {
                        Object object = U0.getObject(obj, jOffset);
                        iComputeBytesSize = object instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object) : CodedOutputStream.computeStringSize(iNumberAt, (String) object);
                        iK = iComputeBytesSize + iK;
                    }
                    break;
                case 9:
                    if (isFieldPresent(obj, i)) {
                        iComputeDoubleSize = D0.computeSizeMessage(iNumberAt, U0.getObject(obj, jOffset), getMessageFieldSchema(i));
                        iK += iComputeDoubleSize;
                    }
                    break;
                case 10:
                    if (isFieldPresent(obj, i)) {
                        iComputeDoubleSize = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) U0.getObject(obj, jOffset));
                        iK += iComputeDoubleSize;
                    }
                    break;
                case 11:
                    if (isFieldPresent(obj, i)) {
                        iComputeDoubleSize = CodedOutputStream.computeUInt32Size(iNumberAt, U0.getInt(obj, jOffset));
                        iK += iComputeDoubleSize;
                    }
                    break;
                case 12:
                    if (isFieldPresent(obj, i)) {
                        iComputeDoubleSize = CodedOutputStream.computeEnumSize(iNumberAt, U0.getInt(obj, jOffset));
                        iK += iComputeDoubleSize;
                    }
                    break;
                case 13:
                    if (isFieldPresent(obj, i)) {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        iK += iComputeDoubleSize;
                    }
                    break;
                case 14:
                    if (isFieldPresent(obj, i)) {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        iK += iComputeDoubleSize;
                    }
                    break;
                case 15:
                    if (isFieldPresent(obj, i)) {
                        iComputeDoubleSize = CodedOutputStream.computeSInt32Size(iNumberAt, U0.getInt(obj, jOffset));
                        iK += iComputeDoubleSize;
                    }
                    break;
                case 16:
                    if (isFieldPresent(obj, i)) {
                        iComputeDoubleSize = CodedOutputStream.computeSInt64Size(iNumberAt, U0.getLong(obj, jOffset));
                        iK += iComputeDoubleSize;
                    }
                    break;
                case 17:
                    if (isFieldPresent(obj, i)) {
                        iComputeDoubleSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) U0.getObject(obj, jOffset), getMessageFieldSchema(i));
                        iK += iComputeDoubleSize;
                    }
                    break;
                case 18:
                    iComputeDoubleSize = D0.computeSizeFixed64List(iNumberAt, listAt(obj, jOffset), false);
                    iK += iComputeDoubleSize;
                    break;
                case 19:
                    iComputeDoubleSize = D0.computeSizeFixed32List(iNumberAt, listAt(obj, jOffset), false);
                    iK += iComputeDoubleSize;
                    break;
                case 20:
                    iComputeDoubleSize = D0.computeSizeInt64List(iNumberAt, listAt(obj, jOffset), false);
                    iK += iComputeDoubleSize;
                    break;
                case 21:
                    iComputeDoubleSize = D0.computeSizeUInt64List(iNumberAt, listAt(obj, jOffset), false);
                    iK += iComputeDoubleSize;
                    break;
                case 22:
                    iComputeDoubleSize = D0.computeSizeInt32List(iNumberAt, listAt(obj, jOffset), false);
                    iK += iComputeDoubleSize;
                    break;
                case 23:
                    iComputeDoubleSize = D0.computeSizeFixed64List(iNumberAt, listAt(obj, jOffset), false);
                    iK += iComputeDoubleSize;
                    break;
                case 24:
                    iComputeDoubleSize = D0.computeSizeFixed32List(iNumberAt, listAt(obj, jOffset), false);
                    iK += iComputeDoubleSize;
                    break;
                case 25:
                    iComputeDoubleSize = D0.computeSizeBoolList(iNumberAt, listAt(obj, jOffset), false);
                    iK += iComputeDoubleSize;
                    break;
                case 26:
                    iComputeDoubleSize = D0.computeSizeStringList(iNumberAt, listAt(obj, jOffset));
                    iK += iComputeDoubleSize;
                    break;
                case 27:
                    iComputeDoubleSize = D0.computeSizeMessageList(iNumberAt, listAt(obj, jOffset), getMessageFieldSchema(i));
                    iK += iComputeDoubleSize;
                    break;
                case 28:
                    iComputeDoubleSize = D0.computeSizeByteStringList(iNumberAt, listAt(obj, jOffset));
                    iK += iComputeDoubleSize;
                    break;
                case 29:
                    iComputeDoubleSize = D0.computeSizeUInt32List(iNumberAt, listAt(obj, jOffset), false);
                    iK += iComputeDoubleSize;
                    break;
                case 30:
                    iComputeDoubleSize = D0.computeSizeEnumList(iNumberAt, listAt(obj, jOffset), false);
                    iK += iComputeDoubleSize;
                    break;
                case 31:
                    iComputeDoubleSize = D0.computeSizeFixed32List(iNumberAt, listAt(obj, jOffset), false);
                    iK += iComputeDoubleSize;
                    break;
                case 32:
                    iComputeDoubleSize = D0.computeSizeFixed64List(iNumberAt, listAt(obj, jOffset), false);
                    iK += iComputeDoubleSize;
                    break;
                case 33:
                    iComputeDoubleSize = D0.computeSizeSInt32List(iNumberAt, listAt(obj, jOffset), false);
                    iK += iComputeDoubleSize;
                    break;
                case 34:
                    iComputeDoubleSize = D0.computeSizeSInt64List(iNumberAt, listAt(obj, jOffset), false);
                    iK += iComputeDoubleSize;
                    break;
                case 35:
                    int iComputeSizeFixed64ListNoTag = D0.computeSizeFixed64ListNoTag((List) unsafe.getObject(obj, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i2, iComputeSizeFixed64ListNoTag);
                        }
                        iK = AbstractC3950lJ.k(iComputeSizeFixed64ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeFixed64ListNoTag, iK);
                    }
                    break;
                case 36:
                    int iComputeSizeFixed32ListNoTag = D0.computeSizeFixed32ListNoTag((List) unsafe.getObject(obj, jOffset));
                    if (iComputeSizeFixed32ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i2, iComputeSizeFixed32ListNoTag);
                        }
                        iK = AbstractC3950lJ.k(iComputeSizeFixed32ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeFixed32ListNoTag, iK);
                    }
                    break;
                case 37:
                    int iComputeSizeInt64ListNoTag = D0.computeSizeInt64ListNoTag((List) unsafe.getObject(obj, jOffset));
                    if (iComputeSizeInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i2, iComputeSizeInt64ListNoTag);
                        }
                        iK = AbstractC3950lJ.k(iComputeSizeInt64ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeInt64ListNoTag, iK);
                    }
                    break;
                case 38:
                    int iComputeSizeUInt64ListNoTag = D0.computeSizeUInt64ListNoTag((List) unsafe.getObject(obj, jOffset));
                    if (iComputeSizeUInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i2, iComputeSizeUInt64ListNoTag);
                        }
                        iK = AbstractC3950lJ.k(iComputeSizeUInt64ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeUInt64ListNoTag, iK);
                    }
                    break;
                case 39:
                    int iComputeSizeInt32ListNoTag = D0.computeSizeInt32ListNoTag((List) unsafe.getObject(obj, jOffset));
                    if (iComputeSizeInt32ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i2, iComputeSizeInt32ListNoTag);
                        }
                        iK = AbstractC3950lJ.k(iComputeSizeInt32ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeInt32ListNoTag, iK);
                    }
                    break;
                case 40:
                    int iComputeSizeFixed64ListNoTag2 = D0.computeSizeFixed64ListNoTag((List) unsafe.getObject(obj, jOffset));
                    if (iComputeSizeFixed64ListNoTag2 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i2, iComputeSizeFixed64ListNoTag2);
                        }
                        iK = AbstractC3950lJ.k(iComputeSizeFixed64ListNoTag2, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeFixed64ListNoTag2, iK);
                    }
                    break;
                case 41:
                    int iComputeSizeFixed32ListNoTag2 = D0.computeSizeFixed32ListNoTag((List) unsafe.getObject(obj, jOffset));
                    if (iComputeSizeFixed32ListNoTag2 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i2, iComputeSizeFixed32ListNoTag2);
                        }
                        iK = AbstractC3950lJ.k(iComputeSizeFixed32ListNoTag2, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeFixed32ListNoTag2, iK);
                    }
                    break;
                case 42:
                    int iComputeSizeBoolListNoTag = D0.computeSizeBoolListNoTag((List) unsafe.getObject(obj, jOffset));
                    if (iComputeSizeBoolListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i2, iComputeSizeBoolListNoTag);
                        }
                        iK = AbstractC3950lJ.k(iComputeSizeBoolListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeBoolListNoTag, iK);
                    }
                    break;
                case 43:
                    int iComputeSizeUInt32ListNoTag = D0.computeSizeUInt32ListNoTag((List) unsafe.getObject(obj, jOffset));
                    if (iComputeSizeUInt32ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i2, iComputeSizeUInt32ListNoTag);
                        }
                        iK = AbstractC3950lJ.k(iComputeSizeUInt32ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeUInt32ListNoTag, iK);
                    }
                    break;
                case 44:
                    int iComputeSizeEnumListNoTag = D0.computeSizeEnumListNoTag((List) unsafe.getObject(obj, jOffset));
                    if (iComputeSizeEnumListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i2, iComputeSizeEnumListNoTag);
                        }
                        iK = AbstractC3950lJ.k(iComputeSizeEnumListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeEnumListNoTag, iK);
                    }
                    break;
                case 45:
                    int iComputeSizeFixed32ListNoTag3 = D0.computeSizeFixed32ListNoTag((List) unsafe.getObject(obj, jOffset));
                    if (iComputeSizeFixed32ListNoTag3 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i2, iComputeSizeFixed32ListNoTag3);
                        }
                        iK = AbstractC3950lJ.k(iComputeSizeFixed32ListNoTag3, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeFixed32ListNoTag3, iK);
                    }
                    break;
                case 46:
                    int iComputeSizeFixed64ListNoTag3 = D0.computeSizeFixed64ListNoTag((List) unsafe.getObject(obj, jOffset));
                    if (iComputeSizeFixed64ListNoTag3 > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i2, iComputeSizeFixed64ListNoTag3);
                        }
                        iK = AbstractC3950lJ.k(iComputeSizeFixed64ListNoTag3, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeFixed64ListNoTag3, iK);
                    }
                    break;
                case 47:
                    int iComputeSizeSInt32ListNoTag = D0.computeSizeSInt32ListNoTag((List) unsafe.getObject(obj, jOffset));
                    if (iComputeSizeSInt32ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i2, iComputeSizeSInt32ListNoTag);
                        }
                        iK = AbstractC3950lJ.k(iComputeSizeSInt32ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeSInt32ListNoTag, iK);
                    }
                    break;
                case 48:
                    int iComputeSizeSInt64ListNoTag = D0.computeSizeSInt64ListNoTag((List) unsafe.getObject(obj, jOffset));
                    if (iComputeSizeSInt64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(obj, i2, iComputeSizeSInt64ListNoTag);
                        }
                        iK = AbstractC3950lJ.k(iComputeSizeSInt64ListNoTag, CodedOutputStream.computeTagSize(iNumberAt), iComputeSizeSInt64ListNoTag, iK);
                    }
                    break;
                case 49:
                    iComputeDoubleSize = D0.computeSizeGroupList(iNumberAt, listAt(obj, jOffset), getMessageFieldSchema(i));
                    iK += iComputeDoubleSize;
                    break;
                case 50:
                    iComputeDoubleSize = ((C3603hM) this.mapFieldSchema).getSerializedSize(iNumberAt, U0.getObject(obj, jOffset), getMapFieldDefaultEntry(i));
                    iK += iComputeDoubleSize;
                    break;
                case 51:
                    if (isOneofPresent(obj, iNumberAt, i)) {
                        iComputeDoubleSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        iK += iComputeDoubleSize;
                    }
                    break;
                case 52:
                    if (isOneofPresent(obj, iNumberAt, i)) {
                        iComputeDoubleSize = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        iK += iComputeDoubleSize;
                    }
                    break;
                case 53:
                    if (isOneofPresent(obj, iNumberAt, i)) {
                        iComputeDoubleSize = CodedOutputStream.computeInt64Size(iNumberAt, oneofLongAt(obj, jOffset));
                        iK += iComputeDoubleSize;
                    }
                    break;
                case 54:
                    if (isOneofPresent(obj, iNumberAt, i)) {
                        iComputeDoubleSize = CodedOutputStream.computeUInt64Size(iNumberAt, oneofLongAt(obj, jOffset));
                        iK += iComputeDoubleSize;
                    }
                    break;
                case 55:
                    if (isOneofPresent(obj, iNumberAt, i)) {
                        iComputeDoubleSize = CodedOutputStream.computeInt32Size(iNumberAt, oneofIntAt(obj, jOffset));
                        iK += iComputeDoubleSize;
                    }
                    break;
                case Input.Keys.PERIOD /* 56 */:
                    if (isOneofPresent(obj, iNumberAt, i)) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        iK += iComputeDoubleSize;
                    }
                    break;
                case Input.Keys.ALT_LEFT /* 57 */:
                    if (isOneofPresent(obj, iNumberAt, i)) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        iK += iComputeDoubleSize;
                    }
                    break;
                case Input.Keys.ALT_RIGHT /* 58 */:
                    if (isOneofPresent(obj, iNumberAt, i)) {
                        iComputeDoubleSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        iK += iComputeDoubleSize;
                    }
                    break;
                case Input.Keys.SHIFT_LEFT /* 59 */:
                    if (isOneofPresent(obj, iNumberAt, i)) {
                        Object object2 = U0.getObject(obj, jOffset);
                        iComputeBytesSize = object2 instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object2) : CodedOutputStream.computeStringSize(iNumberAt, (String) object2);
                        iK = iComputeBytesSize + iK;
                    }
                    break;
                case 60:
                    if (isOneofPresent(obj, iNumberAt, i)) {
                        iComputeDoubleSize = D0.computeSizeMessage(iNumberAt, U0.getObject(obj, jOffset), getMessageFieldSchema(i));
                        iK += iComputeDoubleSize;
                    }
                    break;
                case Input.Keys.TAB /* 61 */:
                    if (isOneofPresent(obj, iNumberAt, i)) {
                        iComputeDoubleSize = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) U0.getObject(obj, jOffset));
                        iK += iComputeDoubleSize;
                    }
                    break;
                case Input.Keys.SPACE /* 62 */:
                    if (isOneofPresent(obj, iNumberAt, i)) {
                        iComputeDoubleSize = CodedOutputStream.computeUInt32Size(iNumberAt, oneofIntAt(obj, jOffset));
                        iK += iComputeDoubleSize;
                    }
                    break;
                case 63:
                    if (isOneofPresent(obj, iNumberAt, i)) {
                        iComputeDoubleSize = CodedOutputStream.computeEnumSize(iNumberAt, oneofIntAt(obj, jOffset));
                        iK += iComputeDoubleSize;
                    }
                    break;
                case 64:
                    if (isOneofPresent(obj, iNumberAt, i)) {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        iK += iComputeDoubleSize;
                    }
                    break;
                case 65:
                    if (isOneofPresent(obj, iNumberAt, i)) {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        iK += iComputeDoubleSize;
                    }
                    break;
                case 66:
                    if (isOneofPresent(obj, iNumberAt, i)) {
                        iComputeDoubleSize = CodedOutputStream.computeSInt32Size(iNumberAt, oneofIntAt(obj, jOffset));
                        iK += iComputeDoubleSize;
                    }
                    break;
                case 67:
                    if (isOneofPresent(obj, iNumberAt, i)) {
                        iComputeDoubleSize = CodedOutputStream.computeSInt64Size(iNumberAt, oneofLongAt(obj, jOffset));
                        iK += iComputeDoubleSize;
                    }
                    break;
                case Input.Keys.GRAVE /* 68 */:
                    if (isOneofPresent(obj, iNumberAt, i)) {
                        iComputeDoubleSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) U0.getObject(obj, jOffset), getMessageFieldSchema(i));
                        iK += iComputeDoubleSize;
                    }
                    break;
            }
        }
        return iK + getUnknownFieldsSerializedSize(this.unknownFieldSchema, obj);
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(O0 o0, Object obj) {
        return o0.getSerializedSize(o0.getFromMessage(obj));
    }

    private static <T> int intAt(T t, long j) {
        return U0.getInt(t, j);
    }

    private static boolean isEnforceUtf8(int i) {
        return (i & ENFORCE_UTF8_MASK) != 0;
    }

    private boolean isFieldPresent(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return isFieldPresent(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private <N> boolean isListInitialized(Object obj, int i, int i2) {
        List list = (List) U0.getObject(obj, offset(i));
        if (list.isEmpty()) {
            return true;
        }
        InterfaceC3578h30 messageFieldSchema = getMessageFieldSchema(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!messageFieldSchema.isInitialized(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    private boolean isMapInitialized(Object obj, int i, int i2) {
        Map<?, ?> mapForMapData = ((C3603hM) this.mapFieldSchema).forMapData(U0.getObject(obj, offset(i)));
        if (mapForMapData.isEmpty()) {
            return true;
        }
        if (((C3603hM) this.mapFieldSchema).forMapMetadata(getMapFieldDefaultEntry(i2)).valueType.getJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        InterfaceC3578h30 interfaceC3578h30SchemaFor = null;
        for (Object obj2 : mapForMapData.values()) {
            if (interfaceC3578h30SchemaFor == null) {
                interfaceC3578h30SchemaFor = C4754uW.getInstance().schemaFor((Class) obj2.getClass());
            }
            if (!interfaceC3578h30SchemaFor.isInitialized(obj2)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isMutable(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).isMutable();
        }
        return true;
    }

    private boolean isOneofCaseEqual(Object obj, Object obj2, int i) {
        long jPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i) & 1048575;
        return U0.getInt(obj, jPresenceMaskAndOffsetAt) == U0.getInt(obj2, jPresenceMaskAndOffsetAt);
    }

    private boolean isOneofPresent(Object obj, int i, int i2) {
        return U0.getInt(obj, (long) (presenceMaskAndOffsetAt(i2) & 1048575)) == i;
    }

    private static boolean isRequired(int i) {
        return (i & REQUIRED_MASK) != 0;
    }

    private static List<?> listAt(Object obj, long j) {
        return (List) U0.getObject(obj, j);
    }

    private static <T> long longAt(T t, long j) {
        return U0.getLong(t, j);
    }

    /* JADX WARN: Code duplicated, block: B:173:0x0613 A[Catch: all -> 0x0641, TRY_LEAVE, TryCatch #0 {all -> 0x0641, blocks: (B:171:0x060d, B:173:0x0613, B:183:0x063b, B:186:0x0643), top: B:209:0x060d }] */
    /* JADX WARN: Code duplicated, block: B:178:0x0620 A[LOOP:2: B:176:0x061c->B:178:0x0620, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:180:0x0635  */
    /* JADX WARN: Code duplicated, block: B:182:0x0639 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:183:0x063b A[Catch: all -> 0x0641, TRY_ENTER, TryCatch #0 {all -> 0x0641, blocks: (B:171:0x060d, B:173:0x0613, B:183:0x063b, B:186:0x0643), top: B:209:0x060d }] */
    /* JADX WARN: Code duplicated, block: B:191:0x0650 A[LOOP:3: B:189:0x064c->B:191:0x0650, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:193:0x0665  */
    /* JADX WARN: Code duplicated, block: B:203:0x067f A[LOOP:4: B:201:0x067b->B:203:0x067f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:205:0x0694  */
    /* JADX WARN: Code duplicated, block: B:236:0x0619 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x0649 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends FieldSet$FieldDescriptorLite<ET>> void mergeFromHelper(O0 o0, AbstractC3913kt abstractC3913kt, Object obj, AX ax, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
        Object obj2;
        O0 o1;
        Object obj3;
        int i;
        Object objFilterMapUnknownEnumValues;
        Object obj4;
        W mutableExtensions;
        int i2;
        Object objFilterMapUnknownEnumValues2;
        int i3;
        Object objFilterMapUnknownEnumValues3;
        O0 o2 = o0;
        Object obj5 = obj;
        Object builderFromMessage = null;
        W w = null;
        while (true) {
            try {
                C2139s c2139s = (C2139s) ax;
                int fieldNumber = c2139s.getFieldNumber();
                try {
                    int iPositionForFieldNumber = positionForFieldNumber(fieldNumber);
                    if (iPositionForFieldNumber >= 0) {
                        obj3 = obj5;
                        try {
                            int iTypeAndOffsetAt = typeAndOffsetAt(iPositionForFieldNumber);
                            try {
                                switch (type(iTypeAndOffsetAt)) {
                                    case 0:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        U0.putDouble(obj3, offset(iTypeAndOffsetAt), c2139s.readDouble());
                                        setFieldPresent(obj3, iPositionForFieldNumber);
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 1:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        U0.putFloat(obj3, offset(iTypeAndOffsetAt), c2139s.readFloat());
                                        setFieldPresent(obj3, iPositionForFieldNumber);
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 2:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        U0.putLong(obj3, offset(iTypeAndOffsetAt), c2139s.readInt64());
                                        setFieldPresent(obj3, iPositionForFieldNumber);
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 3:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        U0.putLong(obj3, offset(iTypeAndOffsetAt), c2139s.readUInt64());
                                        setFieldPresent(obj3, iPositionForFieldNumber);
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 4:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        U0.putInt(obj3, offset(iTypeAndOffsetAt), c2139s.readInt32());
                                        setFieldPresent(obj3, iPositionForFieldNumber);
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 5:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        U0.putLong(obj3, offset(iTypeAndOffsetAt), c2139s.readFixed64());
                                        setFieldPresent(obj3, iPositionForFieldNumber);
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 6:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        U0.putInt(obj3, offset(iTypeAndOffsetAt), c2139s.readFixed32());
                                        setFieldPresent(obj3, iPositionForFieldNumber);
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 7:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        U0.putBoolean(obj3, offset(iTypeAndOffsetAt), c2139s.readBool());
                                        setFieldPresent(obj3, iPositionForFieldNumber);
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 8:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        readString(obj3, iTypeAndOffsetAt, c2139s);
                                        setFieldPresent(obj3, iPositionForFieldNumber);
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 9:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        MessageLite messageLite = (MessageLite) mutableMessageFieldForMerge(obj3, iPositionForFieldNumber);
                                        c2139s.mergeMessageField(messageLite, getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite);
                                        storeMessageField(obj3, iPositionForFieldNumber, messageLite);
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 10:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        U0.putObject(obj3, offset(iTypeAndOffsetAt), c2139s.readBytes());
                                        setFieldPresent(obj3, iPositionForFieldNumber);
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 11:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        U0.putInt(obj3, offset(iTypeAndOffsetAt), c2139s.readUInt32());
                                        setFieldPresent(obj3, iPositionForFieldNumber);
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 12:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        int i4 = c2139s.readEnum();
                                        Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(iPositionForFieldNumber);
                                        if (enumFieldVerifier == null || enumFieldVerifier.isInRange(i4)) {
                                            U0.putInt(obj3, offset(iTypeAndOffsetAt), i4);
                                            setFieldPresent(obj3, iPositionForFieldNumber);
                                            builderFromMessage = obj2;
                                        } else {
                                            builderFromMessage = D0.storeUnknownEnum(obj3, fieldNumber, i4, obj2, o1);
                                        }
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 13:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        U0.putInt(obj3, offset(iTypeAndOffsetAt), c2139s.readSFixed32());
                                        setFieldPresent(obj3, iPositionForFieldNumber);
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 14:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        U0.putLong(obj3, offset(iTypeAndOffsetAt), c2139s.readSFixed64());
                                        setFieldPresent(obj3, iPositionForFieldNumber);
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 15:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        U0.putInt(obj3, offset(iTypeAndOffsetAt), c2139s.readSInt32());
                                        setFieldPresent(obj3, iPositionForFieldNumber);
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 16:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        U0.putLong(obj3, offset(iTypeAndOffsetAt), c2139s.readSInt64());
                                        setFieldPresent(obj3, iPositionForFieldNumber);
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 17:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        MessageLite messageLite2 = (MessageLite) mutableMessageFieldForMerge(obj3, iPositionForFieldNumber);
                                        c2139s.mergeGroupField(messageLite2, getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite);
                                        storeMessageField(obj3, iPositionForFieldNumber, messageLite2);
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 18:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        c2139s.readDoubleList(this.listFieldSchema.mutableListAt(obj3, offset(iTypeAndOffsetAt)));
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 19:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        c2139s.readFloatList(this.listFieldSchema.mutableListAt(obj3, offset(iTypeAndOffsetAt)));
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 20:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        c2139s.readInt64List(this.listFieldSchema.mutableListAt(obj3, offset(iTypeAndOffsetAt)));
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 21:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        c2139s.readUInt64List(this.listFieldSchema.mutableListAt(obj3, offset(iTypeAndOffsetAt)));
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 22:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        c2139s.readInt32List(this.listFieldSchema.mutableListAt(obj3, offset(iTypeAndOffsetAt)));
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 23:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        c2139s.readFixed64List(this.listFieldSchema.mutableListAt(obj3, offset(iTypeAndOffsetAt)));
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 24:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        c2139s.readFixed32List(this.listFieldSchema.mutableListAt(obj3, offset(iTypeAndOffsetAt)));
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 25:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        c2139s.readBoolList(this.listFieldSchema.mutableListAt(obj3, offset(iTypeAndOffsetAt)));
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 26:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        readStringList(obj3, iTypeAndOffsetAt, c2139s);
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 27:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        readMessageList(obj, iTypeAndOffsetAt, c2139s, getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite);
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 28:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        c2139s.readBytesList(this.listFieldSchema.mutableListAt(obj3, offset(iTypeAndOffsetAt)));
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 29:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        c2139s.readUInt32List(this.listFieldSchema.mutableListAt(obj3, offset(iTypeAndOffsetAt)));
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 30:
                                        o1 = o2;
                                        List<Integer> listMutableListAt = this.listFieldSchema.mutableListAt(obj3, offset(iTypeAndOffsetAt));
                                        c2139s.readEnumList(listMutableListAt);
                                        builderFromMessage = D0.filterUnknownEnumList(obj, fieldNumber, listMutableListAt, getEnumFieldVerifier(iPositionForFieldNumber), builderFromMessage, o0);
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 31:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        c2139s.readSFixed32List(this.listFieldSchema.mutableListAt(obj3, offset(iTypeAndOffsetAt)));
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 32:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        c2139s.readSFixed64List(this.listFieldSchema.mutableListAt(obj3, offset(iTypeAndOffsetAt)));
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 33:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        c2139s.readSInt32List(this.listFieldSchema.mutableListAt(obj3, offset(iTypeAndOffsetAt)));
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 34:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        c2139s.readSInt64List(this.listFieldSchema.mutableListAt(obj3, offset(iTypeAndOffsetAt)));
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 35:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        c2139s.readDoubleList(this.listFieldSchema.mutableListAt(obj3, offset(iTypeAndOffsetAt)));
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 36:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        c2139s.readFloatList(this.listFieldSchema.mutableListAt(obj3, offset(iTypeAndOffsetAt)));
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 37:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        c2139s.readInt64List(this.listFieldSchema.mutableListAt(obj3, offset(iTypeAndOffsetAt)));
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 38:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        c2139s.readUInt64List(this.listFieldSchema.mutableListAt(obj3, offset(iTypeAndOffsetAt)));
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 39:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        c2139s.readInt32List(this.listFieldSchema.mutableListAt(obj3, offset(iTypeAndOffsetAt)));
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 40:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        c2139s.readFixed64List(this.listFieldSchema.mutableListAt(obj3, offset(iTypeAndOffsetAt)));
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 41:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        c2139s.readFixed32List(this.listFieldSchema.mutableListAt(obj3, offset(iTypeAndOffsetAt)));
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 42:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        c2139s.readBoolList(this.listFieldSchema.mutableListAt(obj3, offset(iTypeAndOffsetAt)));
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 43:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        c2139s.readUInt32List(this.listFieldSchema.mutableListAt(obj3, offset(iTypeAndOffsetAt)));
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 44:
                                        o1 = o2;
                                        List<Integer> listMutableListAt2 = this.listFieldSchema.mutableListAt(obj3, offset(iTypeAndOffsetAt));
                                        c2139s.readEnumList(listMutableListAt2);
                                        builderFromMessage = D0.filterUnknownEnumList(obj, fieldNumber, listMutableListAt2, getEnumFieldVerifier(iPositionForFieldNumber), builderFromMessage, o0);
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 45:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        c2139s.readSFixed32List(this.listFieldSchema.mutableListAt(obj3, offset(iTypeAndOffsetAt)));
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 46:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        c2139s.readSFixed64List(this.listFieldSchema.mutableListAt(obj3, offset(iTypeAndOffsetAt)));
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 47:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        c2139s.readSInt32List(this.listFieldSchema.mutableListAt(obj3, offset(iTypeAndOffsetAt)));
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 48:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        c2139s.readSInt64List(this.listFieldSchema.mutableListAt(obj3, offset(iTypeAndOffsetAt)));
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 49:
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        try {
                                            readGroupList(obj, offset(iTypeAndOffsetAt), c2139s, getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite);
                                            builderFromMessage = obj2;
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                            builderFromMessage = obj2;
                                            try {
                                                if (!o1.shouldDiscardUnknownFields(c2139s)) {
                                                    if (builderFromMessage == null) {
                                                        builderFromMessage = o1.getBuilderFromMessage(obj3);
                                                    }
                                                    if (!o1.mergeOneFieldFrom(builderFromMessage, c2139s)) {
                                                        objFilterMapUnknownEnumValues2 = builderFromMessage;
                                                        for (i2 = this.checkInitializedCount; i2 < this.repeatedFieldOffsetStart; i2++) {
                                                            objFilterMapUnknownEnumValues2 = filterMapUnknownEnumValues(obj, this.intArray[i2], objFilterMapUnknownEnumValues2, o0, obj);
                                                        }
                                                        if (objFilterMapUnknownEnumValues2 != null) {
                                                            o1.setBuilderToMessage(obj3, objFilterMapUnknownEnumValues2);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                } else if (!c2139s.skipField()) {
                                                    objFilterMapUnknownEnumValues3 = builderFromMessage;
                                                    for (i3 = this.checkInitializedCount; i3 < this.repeatedFieldOffsetStart; i3++) {
                                                        objFilterMapUnknownEnumValues3 = filterMapUnknownEnumValues(obj, this.intArray[i3], objFilterMapUnknownEnumValues3, o0, obj);
                                                    }
                                                    if (objFilterMapUnknownEnumValues3 != null) {
                                                        o1.setBuilderToMessage(obj3, objFilterMapUnknownEnumValues3);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            builderFromMessage = obj2;
                                            objFilterMapUnknownEnumValues = builderFromMessage;
                                            for (i = this.checkInitializedCount; i < this.repeatedFieldOffsetStart; i++) {
                                                objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(obj, this.intArray[i], objFilterMapUnknownEnumValues, o0, obj);
                                            }
                                            if (objFilterMapUnknownEnumValues != null) {
                                                o1.setBuilderToMessage(obj3, objFilterMapUnknownEnumValues);
                                            }
                                            throw th;
                                        }
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 50:
                                        obj2 = builderFromMessage;
                                        try {
                                            mergeMap(obj, iPositionForFieldNumber, getMapFieldDefaultEntry(iPositionForFieldNumber), extensionRegistryLite, c2139s);
                                            o1 = o2;
                                            builderFromMessage = obj2;
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                            o1 = o2;
                                            builderFromMessage = obj2;
                                            if (!o1.shouldDiscardUnknownFields(c2139s)) {
                                                if (builderFromMessage == null) {
                                                    builderFromMessage = o1.getBuilderFromMessage(obj3);
                                                }
                                                if (!o1.mergeOneFieldFrom(builderFromMessage, c2139s)) {
                                                    objFilterMapUnknownEnumValues2 = builderFromMessage;
                                                    while (i2 < this.repeatedFieldOffsetStart) {
                                                        objFilterMapUnknownEnumValues2 = filterMapUnknownEnumValues(obj, this.intArray[i2], objFilterMapUnknownEnumValues2, o0, obj);
                                                    }
                                                    if (objFilterMapUnknownEnumValues2 != null) {
                                                        o1.setBuilderToMessage(obj3, objFilterMapUnknownEnumValues2);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } else if (!c2139s.skipField()) {
                                                objFilterMapUnknownEnumValues3 = builderFromMessage;
                                                while (i3 < this.repeatedFieldOffsetStart) {
                                                    objFilterMapUnknownEnumValues3 = filterMapUnknownEnumValues(obj, this.intArray[i3], objFilterMapUnknownEnumValues3, o0, obj);
                                                }
                                                if (objFilterMapUnknownEnumValues3 != null) {
                                                    o1.setBuilderToMessage(obj3, objFilterMapUnknownEnumValues3);
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            o1 = o2;
                                            builderFromMessage = obj2;
                                            objFilterMapUnknownEnumValues = builderFromMessage;
                                            while (i < this.repeatedFieldOffsetStart) {
                                                objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(obj, this.intArray[i], objFilterMapUnknownEnumValues, o0, obj);
                                            }
                                            if (objFilterMapUnknownEnumValues != null) {
                                                o1.setBuilderToMessage(obj3, objFilterMapUnknownEnumValues);
                                            }
                                            throw th;
                                        }
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 51:
                                        U0.putObject(obj3, offset(iTypeAndOffsetAt), Double.valueOf(c2139s.readDouble()));
                                        setOneofPresent(obj3, fieldNumber, iPositionForFieldNumber);
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 52:
                                        U0.putObject(obj3, offset(iTypeAndOffsetAt), Float.valueOf(c2139s.readFloat()));
                                        setOneofPresent(obj3, fieldNumber, iPositionForFieldNumber);
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 53:
                                        U0.putObject(obj3, offset(iTypeAndOffsetAt), Long.valueOf(c2139s.readInt64()));
                                        setOneofPresent(obj3, fieldNumber, iPositionForFieldNumber);
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 54:
                                        U0.putObject(obj3, offset(iTypeAndOffsetAt), Long.valueOf(c2139s.readUInt64()));
                                        setOneofPresent(obj3, fieldNumber, iPositionForFieldNumber);
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 55:
                                        U0.putObject(obj3, offset(iTypeAndOffsetAt), Integer.valueOf(c2139s.readInt32()));
                                        setOneofPresent(obj3, fieldNumber, iPositionForFieldNumber);
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case Input.Keys.PERIOD /* 56 */:
                                        U0.putObject(obj3, offset(iTypeAndOffsetAt), Long.valueOf(c2139s.readFixed64()));
                                        setOneofPresent(obj3, fieldNumber, iPositionForFieldNumber);
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case Input.Keys.ALT_LEFT /* 57 */:
                                        U0.putObject(obj3, offset(iTypeAndOffsetAt), Integer.valueOf(c2139s.readFixed32()));
                                        setOneofPresent(obj3, fieldNumber, iPositionForFieldNumber);
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case Input.Keys.ALT_RIGHT /* 58 */:
                                        U0.putObject(obj3, offset(iTypeAndOffsetAt), Boolean.valueOf(c2139s.readBool()));
                                        setOneofPresent(obj3, fieldNumber, iPositionForFieldNumber);
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case Input.Keys.SHIFT_LEFT /* 59 */:
                                        readString(obj3, iTypeAndOffsetAt, c2139s);
                                        setOneofPresent(obj3, fieldNumber, iPositionForFieldNumber);
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 60:
                                        MessageLite messageLite3 = (MessageLite) mutableOneofMessageFieldForMerge(obj3, fieldNumber, iPositionForFieldNumber);
                                        c2139s.mergeMessageField(messageLite3, getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite);
                                        storeOneofMessageField(obj3, fieldNumber, iPositionForFieldNumber, messageLite3);
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case Input.Keys.TAB /* 61 */:
                                        U0.putObject(obj3, offset(iTypeAndOffsetAt), c2139s.readBytes());
                                        setOneofPresent(obj3, fieldNumber, iPositionForFieldNumber);
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case Input.Keys.SPACE /* 62 */:
                                        U0.putObject(obj3, offset(iTypeAndOffsetAt), Integer.valueOf(c2139s.readUInt32()));
                                        setOneofPresent(obj3, fieldNumber, iPositionForFieldNumber);
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 63:
                                        int i5 = c2139s.readEnum();
                                        Internal.EnumVerifier enumFieldVerifier2 = getEnumFieldVerifier(iPositionForFieldNumber);
                                        if (enumFieldVerifier2 != null && !enumFieldVerifier2.isInRange(i5)) {
                                            builderFromMessage = D0.storeUnknownEnum(obj3, fieldNumber, i5, builderFromMessage, o2);
                                            o1 = o2;
                                            obj5 = obj3;
                                            o2 = o1;
                                        }
                                        U0.putObject(obj3, offset(iTypeAndOffsetAt), Integer.valueOf(i5));
                                        setOneofPresent(obj3, fieldNumber, iPositionForFieldNumber);
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 64:
                                        U0.putObject(obj3, offset(iTypeAndOffsetAt), Integer.valueOf(c2139s.readSFixed32()));
                                        setOneofPresent(obj3, fieldNumber, iPositionForFieldNumber);
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 65:
                                        U0.putObject(obj3, offset(iTypeAndOffsetAt), Long.valueOf(c2139s.readSFixed64()));
                                        setOneofPresent(obj3, fieldNumber, iPositionForFieldNumber);
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 66:
                                        U0.putObject(obj3, offset(iTypeAndOffsetAt), Integer.valueOf(c2139s.readSInt32()));
                                        setOneofPresent(obj3, fieldNumber, iPositionForFieldNumber);
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case 67:
                                        U0.putObject(obj3, offset(iTypeAndOffsetAt), Long.valueOf(c2139s.readSInt64()));
                                        setOneofPresent(obj3, fieldNumber, iPositionForFieldNumber);
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    case Input.Keys.GRAVE /* 68 */:
                                        MessageLite messageLite4 = (MessageLite) mutableOneofMessageFieldForMerge(obj3, fieldNumber, iPositionForFieldNumber);
                                        c2139s.mergeGroupField(messageLite4, getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite);
                                        storeOneofMessageField(obj3, fieldNumber, iPositionForFieldNumber, messageLite4);
                                        obj2 = builderFromMessage;
                                        o1 = o2;
                                        builderFromMessage = obj2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                    default:
                                        if (builderFromMessage == null) {
                                            try {
                                                builderFromMessage = o2.getBuilderFromMessage(obj3);
                                                break;
                                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                                o1 = o2;
                                                if (!o1.shouldDiscardUnknownFields(c2139s)) {
                                                    if (builderFromMessage == null) {
                                                        builderFromMessage = o1.getBuilderFromMessage(obj3);
                                                    }
                                                    if (!o1.mergeOneFieldFrom(builderFromMessage, c2139s)) {
                                                        objFilterMapUnknownEnumValues2 = builderFromMessage;
                                                        while (i2 < this.repeatedFieldOffsetStart) {
                                                            objFilterMapUnknownEnumValues2 = filterMapUnknownEnumValues(obj, this.intArray[i2], objFilterMapUnknownEnumValues2, o0, obj);
                                                        }
                                                        if (objFilterMapUnknownEnumValues2 != null) {
                                                            o1.setBuilderToMessage(obj3, objFilterMapUnknownEnumValues2);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                } else if (!c2139s.skipField()) {
                                                    objFilterMapUnknownEnumValues3 = builderFromMessage;
                                                    while (i3 < this.repeatedFieldOffsetStart) {
                                                        objFilterMapUnknownEnumValues3 = filterMapUnknownEnumValues(obj, this.intArray[i3], objFilterMapUnknownEnumValues3, o0, obj);
                                                    }
                                                    if (objFilterMapUnknownEnumValues3 != null) {
                                                        o1.setBuilderToMessage(obj3, objFilterMapUnknownEnumValues3);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                o1 = o2;
                                                objFilterMapUnknownEnumValues = builderFromMessage;
                                                while (i < this.repeatedFieldOffsetStart) {
                                                    objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(obj, this.intArray[i], objFilterMapUnknownEnumValues, o0, obj);
                                                }
                                                if (objFilterMapUnknownEnumValues != null) {
                                                    o1.setBuilderToMessage(obj3, objFilterMapUnknownEnumValues);
                                                }
                                                throw th;
                                            }
                                        }
                                        if (!o2.mergeOneFieldFrom(builderFromMessage, c2139s)) {
                                            Object objFilterMapUnknownEnumValues4 = builderFromMessage;
                                            for (int i6 = this.checkInitializedCount; i6 < this.repeatedFieldOffsetStart; i6++) {
                                                objFilterMapUnknownEnumValues4 = filterMapUnknownEnumValues(obj, this.intArray[i6], objFilterMapUnknownEnumValues4, o0, obj);
                                            }
                                            if (objFilterMapUnknownEnumValues4 != null) {
                                                o2.setBuilderToMessage(obj3, objFilterMapUnknownEnumValues4);
                                                return;
                                            }
                                            return;
                                        }
                                        o1 = o2;
                                        obj5 = obj3;
                                        o2 = o1;
                                        break;
                                }
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused4) {
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    } else {
                        if (fieldNumber == Integer.MAX_VALUE) {
                            Object objFilterMapUnknownEnumValues5 = builderFromMessage;
                            for (int i7 = this.checkInitializedCount; i7 < this.repeatedFieldOffsetStart; i7++) {
                                objFilterMapUnknownEnumValues5 = filterMapUnknownEnumValues(obj, this.intArray[i7], objFilterMapUnknownEnumValues5, o0, obj);
                            }
                            if (objFilterMapUnknownEnumValues5 != null) {
                                o2.setBuilderToMessage(obj5, objFilterMapUnknownEnumValues5);
                                return;
                            }
                            return;
                        }
                        try {
                            Object objFindExtensionByNumber = !this.hasExtensions ? null : abstractC3913kt.findExtensionByNumber(extensionRegistryLite, this.defaultInstance, fieldNumber);
                            if (objFindExtensionByNumber != null) {
                                if (w == null) {
                                    try {
                                        mutableExtensions = abstractC3913kt.getMutableExtensions(obj);
                                    } catch (Throwable th6) {
                                        th = th6;
                                        o1 = o2;
                                        obj3 = obj5;
                                        objFilterMapUnknownEnumValues = builderFromMessage;
                                        while (i < this.repeatedFieldOffsetStart) {
                                            objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(obj, this.intArray[i], objFilterMapUnknownEnumValues, o0, obj);
                                        }
                                        if (objFilterMapUnknownEnumValues != null) {
                                            o1.setBuilderToMessage(obj3, objFilterMapUnknownEnumValues);
                                        }
                                        throw th;
                                    }
                                } else {
                                    mutableExtensions = w;
                                }
                                obj4 = obj5;
                                try {
                                    builderFromMessage = abstractC3913kt.parseExtension(obj, c2139s, objFindExtensionByNumber, extensionRegistryLite, mutableExtensions, builderFromMessage, o0);
                                    w = mutableExtensions;
                                } catch (Throwable th7) {
                                    th = th7;
                                    obj3 = obj4;
                                    o1 = o2;
                                    objFilterMapUnknownEnumValues = builderFromMessage;
                                    while (i < this.repeatedFieldOffsetStart) {
                                        objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(obj, this.intArray[i], objFilterMapUnknownEnumValues, o0, obj);
                                    }
                                    if (objFilterMapUnknownEnumValues != null) {
                                        o1.setBuilderToMessage(obj3, objFilterMapUnknownEnumValues);
                                    }
                                    throw th;
                                }
                            } else {
                                obj4 = obj5;
                                if (!o2.shouldDiscardUnknownFields(c2139s)) {
                                    if (builderFromMessage == null) {
                                        builderFromMessage = o2.getBuilderFromMessage(obj4);
                                    }
                                    if (!o2.mergeOneFieldFrom(builderFromMessage, c2139s)) {
                                    }
                                } else if (!c2139s.skipField()) {
                                }
                            }
                            obj5 = obj4;
                        } catch (Throwable th8) {
                            th = th8;
                            obj3 = obj5;
                        }
                    }
                } catch (Throwable th9) {
                    th = th9;
                }
            } catch (Throwable th10) {
                th = th10;
                obj2 = builderFromMessage;
                o1 = o2;
                obj3 = obj5;
            }
            objFilterMapUnknownEnumValues = builderFromMessage;
            while (i < this.repeatedFieldOffsetStart) {
                objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(obj, this.intArray[i], objFilterMapUnknownEnumValues, o0, obj);
            }
            if (objFilterMapUnknownEnumValues != null) {
                o1.setBuilderToMessage(obj3, objFilterMapUnknownEnumValues);
            }
            throw th;
        }
        int i8 = this.checkInitializedCount;
        while (i8 < this.repeatedFieldOffsetStart) {
            builderFromMessage = filterMapUnknownEnumValues(obj, this.intArray[i8], builderFromMessage, o0, obj);
            i8++;
            obj4 = obj4;
        }
        Object obj6 = obj4;
        if (builderFromMessage != null) {
            o2.setBuilderToMessage(obj6, builderFromMessage);
        }
    }

    private final <K, V> void mergeMap(Object obj, int i, Object obj2, ExtensionRegistryLite extensionRegistryLite, AX ax) throws IOException {
        long jOffset = offset(typeAndOffsetAt(i));
        Object object = U0.getObject(obj, jOffset);
        if (object == null) {
            object = ((C3603hM) this.mapFieldSchema).newMapField(obj2);
            U0.putObject(obj, jOffset, object);
        } else if (((C3603hM) this.mapFieldSchema).isImmutable(object)) {
            Object objNewMapField = ((C3603hM) this.mapFieldSchema).newMapField(obj2);
            ((C3603hM) this.mapFieldSchema).mergeFrom(objNewMapField, object);
            U0.putObject(obj, jOffset, objNewMapField);
            object = objNewMapField;
        }
        ((C2139s) ax).readMap(((C3603hM) this.mapFieldSchema).forMutableMapData(object), ((C3603hM) this.mapFieldSchema).forMapMetadata(obj2), extensionRegistryLite);
    }

    private void mergeMessage(Object obj, Object obj2, int i) {
        if (isFieldPresent(obj2, i)) {
            long jOffset = offset(typeAndOffsetAt(i));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(obj2, jOffset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(i) + " is present but null: " + obj2);
            }
            InterfaceC3578h30 messageFieldSchema = getMessageFieldSchema(i);
            if (!isFieldPresent(obj, i)) {
                if (isMutable(object)) {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(obj, jOffset, objNewInstance);
                } else {
                    unsafe.putObject(obj, jOffset, object);
                }
                setFieldPresent(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(obj, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    private void mergeOneofMessage(Object obj, Object obj2, int i) {
        int iNumberAt = numberAt(i);
        if (isOneofPresent(obj2, iNumberAt, i)) {
            long jOffset = offset(typeAndOffsetAt(i));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(obj2, jOffset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(i) + " is present but null: " + obj2);
            }
            InterfaceC3578h30 messageFieldSchema = getMessageFieldSchema(i);
            if (!isOneofPresent(obj, iNumberAt, i)) {
                if (isMutable(object)) {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(obj, jOffset, objNewInstance);
                } else {
                    unsafe.putObject(obj, jOffset, object);
                }
                setOneofPresent(obj, iNumberAt, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(obj, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    private void mergeSingleField(Object obj, Object obj2, int i) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i);
        long jOffset = offset(iTypeAndOffsetAt);
        int iNumberAt = numberAt(i);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                if (isFieldPresent(obj2, i)) {
                    U0.putDouble(obj, jOffset, U0.getDouble(obj2, jOffset));
                    setFieldPresent(obj, i);
                }
                break;
            case 1:
                if (isFieldPresent(obj2, i)) {
                    U0.putFloat(obj, jOffset, U0.getFloat(obj2, jOffset));
                    setFieldPresent(obj, i);
                }
                break;
            case 2:
                if (isFieldPresent(obj2, i)) {
                    U0.putLong(obj, jOffset, U0.getLong(obj2, jOffset));
                    setFieldPresent(obj, i);
                }
                break;
            case 3:
                if (isFieldPresent(obj2, i)) {
                    U0.putLong(obj, jOffset, U0.getLong(obj2, jOffset));
                    setFieldPresent(obj, i);
                }
                break;
            case 4:
                if (isFieldPresent(obj2, i)) {
                    U0.putInt(obj, jOffset, U0.getInt(obj2, jOffset));
                    setFieldPresent(obj, i);
                }
                break;
            case 5:
                if (isFieldPresent(obj2, i)) {
                    U0.putLong(obj, jOffset, U0.getLong(obj2, jOffset));
                    setFieldPresent(obj, i);
                }
                break;
            case 6:
                if (isFieldPresent(obj2, i)) {
                    U0.putInt(obj, jOffset, U0.getInt(obj2, jOffset));
                    setFieldPresent(obj, i);
                }
                break;
            case 7:
                if (isFieldPresent(obj2, i)) {
                    U0.putBoolean(obj, jOffset, U0.getBoolean(obj2, jOffset));
                    setFieldPresent(obj, i);
                }
                break;
            case 8:
                if (isFieldPresent(obj2, i)) {
                    U0.putObject(obj, jOffset, U0.getObject(obj2, jOffset));
                    setFieldPresent(obj, i);
                }
                break;
            case 9:
                mergeMessage(obj, obj2, i);
                break;
            case 10:
                if (isFieldPresent(obj2, i)) {
                    U0.putObject(obj, jOffset, U0.getObject(obj2, jOffset));
                    setFieldPresent(obj, i);
                }
                break;
            case 11:
                if (isFieldPresent(obj2, i)) {
                    U0.putInt(obj, jOffset, U0.getInt(obj2, jOffset));
                    setFieldPresent(obj, i);
                }
                break;
            case 12:
                if (isFieldPresent(obj2, i)) {
                    U0.putInt(obj, jOffset, U0.getInt(obj2, jOffset));
                    setFieldPresent(obj, i);
                }
                break;
            case 13:
                if (isFieldPresent(obj2, i)) {
                    U0.putInt(obj, jOffset, U0.getInt(obj2, jOffset));
                    setFieldPresent(obj, i);
                }
                break;
            case 14:
                if (isFieldPresent(obj2, i)) {
                    U0.putLong(obj, jOffset, U0.getLong(obj2, jOffset));
                    setFieldPresent(obj, i);
                }
                break;
            case 15:
                if (isFieldPresent(obj2, i)) {
                    U0.putInt(obj, jOffset, U0.getInt(obj2, jOffset));
                    setFieldPresent(obj, i);
                }
                break;
            case 16:
                if (isFieldPresent(obj2, i)) {
                    U0.putLong(obj, jOffset, U0.getLong(obj2, jOffset));
                    setFieldPresent(obj, i);
                }
                break;
            case 17:
                mergeMessage(obj, obj2, i);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.listFieldSchema.mergeListsAt(obj, obj2, jOffset);
                break;
            case 50:
                D0.mergeMap(this.mapFieldSchema, obj, obj2, jOffset);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case Input.Keys.PERIOD /* 56 */:
            case Input.Keys.ALT_LEFT /* 57 */:
            case Input.Keys.ALT_RIGHT /* 58 */:
            case Input.Keys.SHIFT_LEFT /* 59 */:
                if (isOneofPresent(obj2, iNumberAt, i)) {
                    U0.putObject(obj, jOffset, U0.getObject(obj2, jOffset));
                    setOneofPresent(obj, iNumberAt, i);
                }
                break;
            case 60:
                mergeOneofMessage(obj, obj2, i);
                break;
            case Input.Keys.TAB /* 61 */:
            case Input.Keys.SPACE /* 62 */:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (isOneofPresent(obj2, iNumberAt, i)) {
                    U0.putObject(obj, jOffset, U0.getObject(obj2, jOffset));
                    setOneofPresent(obj, iNumberAt, i);
                }
                break;
            case Input.Keys.GRAVE /* 68 */:
                mergeOneofMessage(obj, obj2, i);
                break;
        }
    }

    private Object mutableMessageFieldForMerge(Object obj, int i) {
        InterfaceC3578h30 messageFieldSchema = getMessageFieldSchema(i);
        long jOffset = offset(typeAndOffsetAt(i));
        if (!isFieldPresent(obj, i)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(obj, jOffset);
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    private Object mutableOneofMessageFieldForMerge(Object obj, int i, int i2) {
        InterfaceC3578h30 messageFieldSchema = getMessageFieldSchema(i2);
        if (!isOneofPresent(obj, i, i2)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(obj, offset(typeAndOffsetAt(i2)));
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    public static <T> C2140s0 newSchema(Class<T> cls, InterfaceC3868kP interfaceC3868kP, DR dr, AbstractC2127l0 abstractC2127l0, O0 o0, AbstractC3913kt abstractC3913kt, InterfaceC3515gM interfaceC3515gM) {
        return interfaceC3868kP instanceof C4931wX ? newSchemaForRawMessageInfo((C4931wX) interfaceC3868kP, dr, abstractC2127l0, o0, abstractC3913kt, interfaceC3515gM) : newSchemaForMessageInfo((C3354ea0) interfaceC3868kP, dr, abstractC2127l0, o0, abstractC3913kt, interfaceC3515gM);
    }

    public static <T> C2140s0 newSchemaForMessageInfo(C3354ea0 c3354ea0, DR dr, AbstractC2127l0 abstractC2127l0, O0 o0, AbstractC3913kt abstractC3913kt, InterfaceC3515gM interfaceC3515gM) {
        int fieldNumber;
        int fieldNumber2;
        boolean z = c3354ea0.getSyntax() == ProtoSyntax.PROTO3;
        S[] fields = c3354ea0.getFields();
        if (fields.length == 0) {
            fieldNumber = 0;
            fieldNumber2 = 0;
        } else {
            fieldNumber = fields[0].getFieldNumber();
            fieldNumber2 = fields[fields.length - 1].getFieldNumber();
        }
        int length = fields.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i = 0;
        int i2 = 0;
        for (S s : fields) {
            if (s.getType() == FieldType.MAP) {
                i++;
            } else if (s.getType().id() >= 18 && s.getType().id() <= 49) {
                i2++;
            }
        }
        int[] iArr2 = i > 0 ? new int[i] : null;
        int[] iArr3 = i2 > 0 ? new int[i2] : null;
        int[] checkInitialized = c3354ea0.getCheckInitialized();
        if (checkInitialized == null) {
            checkInitialized = EMPTY_INT_ARRAY;
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i3 < fields.length) {
            S s2 = fields[i3];
            int fieldNumber3 = s2.getFieldNumber();
            storeFieldData(s2, iArr, i4, objArr);
            if (i5 < checkInitialized.length && checkInitialized[i5] == fieldNumber3) {
                checkInitialized[i5] = i4;
                i5++;
            }
            if (s2.getType() == FieldType.MAP) {
                iArr2[i6] = i4;
                i6++;
            } else {
                if (s2.getType().id() >= 18 && s2.getType().id() <= 49) {
                    iArr3[i7] = (int) U0.objectFieldOffset(s2.getField());
                    i7++;
                }
                i3++;
                i4 += 3;
            }
            i3++;
            i4 += 3;
        }
        if (iArr2 == null) {
            iArr2 = EMPTY_INT_ARRAY;
        }
        if (iArr3 == null) {
            iArr3 = EMPTY_INT_ARRAY;
        }
        int[] iArr4 = new int[checkInitialized.length + iArr2.length + iArr3.length];
        System.arraycopy(checkInitialized, 0, iArr4, 0, checkInitialized.length);
        System.arraycopy(iArr2, 0, iArr4, checkInitialized.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, checkInitialized.length + iArr2.length, iArr3.length);
        return new C2140s0(iArr, objArr, fieldNumber, fieldNumber2, c3354ea0.getDefaultInstance(), z, true, iArr4, checkInitialized.length, checkInitialized.length + iArr2.length, dr, abstractC2127l0, o0, abstractC3913kt, interfaceC3515gM);
    }

    /* JADX WARN: Code duplicated, block: B:122:0x024e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0254  */
    /* JADX WARN: Code duplicated, block: B:127:0x026a  */
    /* JADX WARN: Code duplicated, block: B:129:0x026e  */
    /* JADX WARN: Code duplicated, block: B:163:0x031e  */
    /* JADX WARN: Code duplicated, block: B:179:0x036c  */
    /* JADX WARN: Code duplicated, block: B:182:0x0379  */
    public static <T> C2140s0 newSchemaForRawMessageInfo(C4931wX c4931wX, DR dr, AbstractC2127l0 abstractC2127l0, O0 o0, AbstractC3913kt abstractC3913kt, InterfaceC3515gM interfaceC3515gM) {
        int i;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int iCharAt4;
        int iCharAt5;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        char cCharAt;
        int i5;
        char cCharAt2;
        int i6;
        char cCharAt3;
        int i7;
        char cCharAt4;
        int i8;
        char cCharAt5;
        int i9;
        char cCharAt6;
        int i10;
        char cCharAt7;
        int i11;
        char cCharAt8;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i18;
        int i19;
        java.lang.reflect.Field fieldReflectField;
        char cCharAt9;
        int i20;
        int i21;
        int i22;
        Object obj;
        java.lang.reflect.Field fieldReflectField2;
        int i23;
        Object obj2;
        java.lang.reflect.Field fieldReflectField3;
        int i24;
        char cCharAt10;
        int i25;
        char cCharAt11;
        int i26;
        char cCharAt12;
        int i27;
        char cCharAt13;
        boolean z = c4931wX.getSyntax() == ProtoSyntax.PROTO3;
        String stringInfo = c4931wX.getStringInfo();
        int length = stringInfo.length();
        char c = 55296;
        if (stringInfo.charAt(0) >= 55296) {
            int i28 = 1;
            while (true) {
                i = i28 + 1;
                if (stringInfo.charAt(i28) < 55296) {
                    break;
                }
                i28 = i;
            }
        } else {
            i = 1;
        }
        int i29 = i + 1;
        int iCharAt6 = stringInfo.charAt(i);
        if (iCharAt6 >= 55296) {
            int i30 = iCharAt6 & 8191;
            int i31 = 13;
            while (true) {
                i27 = i29 + 1;
                cCharAt13 = stringInfo.charAt(i29);
                if (cCharAt13 < 55296) {
                    break;
                }
                i30 |= (cCharAt13 & 8191) << i31;
                i31 += 13;
                i29 = i27;
            }
            iCharAt6 = i30 | (cCharAt13 << i31);
            i29 = i27;
        }
        if (iCharAt6 == 0) {
            iArr = EMPTY_INT_ARRAY;
            i3 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            iCharAt3 = 0;
            iCharAt4 = 0;
            iCharAt5 = 0;
            i2 = 0;
        } else {
            int i32 = i29 + 1;
            int iCharAt7 = stringInfo.charAt(i29);
            if (iCharAt7 >= 55296) {
                int i33 = iCharAt7 & 8191;
                int i34 = 13;
                while (true) {
                    i11 = i32 + 1;
                    cCharAt8 = stringInfo.charAt(i32);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i33 |= (cCharAt8 & 8191) << i34;
                    i34 += 13;
                    i32 = i11;
                }
                iCharAt7 = i33 | (cCharAt8 << i34);
                i32 = i11;
            }
            int i35 = i32 + 1;
            int iCharAt8 = stringInfo.charAt(i32);
            if (iCharAt8 >= 55296) {
                int i36 = iCharAt8 & 8191;
                int i37 = 13;
                while (true) {
                    i10 = i35 + 1;
                    cCharAt7 = stringInfo.charAt(i35);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i36 |= (cCharAt7 & 8191) << i37;
                    i37 += 13;
                    i35 = i10;
                }
                iCharAt8 = i36 | (cCharAt7 << i37);
                i35 = i10;
            }
            int i38 = i35 + 1;
            iCharAt = stringInfo.charAt(i35);
            if (iCharAt >= 55296) {
                int i39 = iCharAt & 8191;
                int i40 = 13;
                while (true) {
                    i9 = i38 + 1;
                    cCharAt6 = stringInfo.charAt(i38);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i39 |= (cCharAt6 & 8191) << i40;
                    i40 += 13;
                    i38 = i9;
                }
                iCharAt = i39 | (cCharAt6 << i40);
                i38 = i9;
            }
            int i41 = i38 + 1;
            iCharAt2 = stringInfo.charAt(i38);
            if (iCharAt2 >= 55296) {
                int i42 = iCharAt2 & 8191;
                int i43 = 13;
                while (true) {
                    i8 = i41 + 1;
                    cCharAt5 = stringInfo.charAt(i41);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt5 & 8191) << i43;
                    i43 += 13;
                    i41 = i8;
                }
                iCharAt2 = i42 | (cCharAt5 << i43);
                i41 = i8;
            }
            int i44 = i41 + 1;
            iCharAt3 = stringInfo.charAt(i41);
            if (iCharAt3 >= 55296) {
                int i45 = iCharAt3 & 8191;
                int i46 = 13;
                while (true) {
                    i7 = i44 + 1;
                    cCharAt4 = stringInfo.charAt(i44);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt4 & 8191) << i46;
                    i46 += 13;
                    i44 = i7;
                }
                iCharAt3 = i45 | (cCharAt4 << i46);
                i44 = i7;
            }
            int i47 = i44 + 1;
            iCharAt4 = stringInfo.charAt(i44);
            if (iCharAt4 >= 55296) {
                int i48 = iCharAt4 & 8191;
                int i49 = 13;
                while (true) {
                    i6 = i47 + 1;
                    cCharAt3 = stringInfo.charAt(i47);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt3 & 8191) << i49;
                    i49 += 13;
                    i47 = i6;
                }
                iCharAt4 = i48 | (cCharAt3 << i49);
                i47 = i6;
            }
            int i50 = i47 + 1;
            int iCharAt9 = stringInfo.charAt(i47);
            if (iCharAt9 >= 55296) {
                int i51 = iCharAt9 & 8191;
                int i52 = 13;
                while (true) {
                    i5 = i50 + 1;
                    cCharAt2 = stringInfo.charAt(i50);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt2 & 8191) << i52;
                    i52 += 13;
                    i50 = i5;
                }
                iCharAt9 = i51 | (cCharAt2 << i52);
                i50 = i5;
            }
            int i53 = i50 + 1;
            iCharAt5 = stringInfo.charAt(i50);
            if (iCharAt5 >= 55296) {
                int i54 = iCharAt5 & 8191;
                int i55 = 13;
                while (true) {
                    i4 = i53 + 1;
                    cCharAt = stringInfo.charAt(i53);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i54 |= (cCharAt & 8191) << i55;
                    i55 += 13;
                    i53 = i4;
                }
                iCharAt5 = i54 | (cCharAt << i55);
                i53 = i4;
            }
            iArr = new int[iCharAt5 + iCharAt4 + iCharAt9];
            i2 = (iCharAt7 * 2) + iCharAt8;
            i3 = iCharAt7;
            i29 = i53;
        }
        Unsafe unsafe = UNSAFE;
        Object[] objects = c4931wX.getObjects();
        Class<?> cls = c4931wX.getDefaultInstance().getClass();
        int[] iArr2 = new int[iCharAt3 * 3];
        Object[] objArr = new Object[iCharAt3 * 2];
        int i56 = iCharAt5 + iCharAt4;
        int i57 = iCharAt5;
        int i58 = i56;
        int i59 = 0;
        int i60 = 0;
        while (i29 < length) {
            int i61 = i29 + 1;
            int iCharAt10 = stringInfo.charAt(i29);
            if (iCharAt10 >= c) {
                int i62 = iCharAt10 & 8191;
                int i63 = i61;
                int i64 = 13;
                while (true) {
                    i26 = i63 + 1;
                    cCharAt12 = stringInfo.charAt(i63);
                    if (cCharAt12 < c) {
                        break;
                    }
                    i62 |= (cCharAt12 & 8191) << i64;
                    i64 += 13;
                    i63 = i26;
                }
                iCharAt10 = i62 | (cCharAt12 << i64);
                i12 = i26;
            } else {
                i12 = i61;
            }
            int i65 = i12 + 1;
            int iCharAt11 = stringInfo.charAt(i12);
            if (iCharAt11 >= c) {
                int i66 = iCharAt11 & 8191;
                int i67 = i65;
                int i68 = 13;
                while (true) {
                    i25 = i67 + 1;
                    cCharAt11 = stringInfo.charAt(i67);
                    i13 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i66 |= (cCharAt11 & 8191) << i68;
                    i68 += 13;
                    i67 = i25;
                    length = i13;
                }
                iCharAt11 = i66 | (cCharAt11 << i68);
                i14 = i25;
            } else {
                i13 = length;
                i14 = i65;
            }
            int i69 = iCharAt11 & 255;
            int i70 = iCharAt5;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i59] = i60;
                i59++;
            }
            int i71 = i59;
            if (i69 >= 51) {
                int i72 = i14 + 1;
                int iCharAt12 = stringInfo.charAt(i14);
                char c2 = 55296;
                if (iCharAt12 >= 55296) {
                    int i73 = iCharAt12 & 8191;
                    int i74 = 13;
                    while (true) {
                        i24 = i72 + 1;
                        cCharAt10 = stringInfo.charAt(i72);
                        if (cCharAt10 < c2) {
                            break;
                        }
                        i73 |= (cCharAt10 & 8191) << i74;
                        i74 += 13;
                        i72 = i24;
                        c2 = 55296;
                    }
                    iCharAt12 = i73 | (cCharAt10 << i74);
                    i72 = i24;
                }
                int i75 = i69 - 51;
                int i76 = i72;
                if (i75 == 9 || i75 == 17) {
                    i21 = i2 + 1;
                    objArr[((i60 / 3) * 2) + 1] = objects[i2];
                } else {
                    if (i75 == 12 && !z) {
                        i21 = i2 + 1;
                        objArr[((i60 / 3) * 2) + 1] = objects[i2];
                    }
                    i22 = iCharAt12 * 2;
                    obj = objects[i22];
                    if (obj instanceof java.lang.reflect.Field) {
                        fieldReflectField2 = (java.lang.reflect.Field) obj;
                    } else {
                        fieldReflectField2 = reflectField(cls, (String) obj);
                        objects[i22] = fieldReflectField2;
                    }
                    i15 = iCharAt;
                    i16 = iCharAt2;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldReflectField2);
                    i23 = i22 + 1;
                    obj2 = objects[i23];
                    if (obj2 instanceof java.lang.reflect.Field) {
                        fieldReflectField3 = (java.lang.reflect.Field) obj2;
                    } else {
                        fieldReflectField3 = reflectField(cls, (String) obj2);
                        objects[i23] = fieldReflectField3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldReflectField3);
                    z = z;
                    objArr = objArr;
                    i18 = i76;
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i19 = 0;
                }
                i2 = i21;
                i22 = iCharAt12 * 2;
                obj = objects[i22];
                if (obj instanceof java.lang.reflect.Field) {
                    fieldReflectField2 = (java.lang.reflect.Field) obj;
                } else {
                    fieldReflectField2 = reflectField(cls, (String) obj);
                    objects[i22] = fieldReflectField2;
                }
                i15 = iCharAt;
                i16 = iCharAt2;
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldReflectField2);
                i23 = i22 + 1;
                obj2 = objects[i23];
                if (obj2 instanceof java.lang.reflect.Field) {
                    fieldReflectField3 = (java.lang.reflect.Field) obj2;
                } else {
                    fieldReflectField3 = reflectField(cls, (String) obj2);
                    objects[i23] = fieldReflectField3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldReflectField3);
                z = z;
                objArr = objArr;
                i18 = i76;
                iObjectFieldOffset = iObjectFieldOffset4;
                i19 = 0;
            } else {
                i15 = iCharAt;
                i16 = iCharAt2;
                int i77 = i2 + 1;
                java.lang.reflect.Field fieldReflectField4 = reflectField(cls, (String) objects[i2]);
                if (i69 == 9 || i69 == 17) {
                    objArr[((i60 / 3) * 2) + 1] = fieldReflectField4.getType();
                } else {
                    if (i69 == 27 || i69 == 49) {
                        i20 = i2 + 2;
                        objArr[((i60 / 3) * 2) + 1] = objects[i77];
                    } else if (i69 == 12 || i69 == 30 || i69 == 44) {
                        if (!z) {
                            i20 = i2 + 2;
                            objArr[((i60 / 3) * 2) + 1] = objects[i77];
                        }
                    } else if (i69 == 50) {
                        int i78 = i57 + 1;
                        iArr[i57] = i60;
                        int i79 = (i60 / 3) * 2;
                        int i80 = i2 + 2;
                        objArr[i79] = objects[i77];
                        if ((iCharAt11 & 2048) != 0) {
                            i77 = i2 + 3;
                            objArr[i79 + 1] = objects[i80];
                            i57 = i78;
                        } else {
                            i57 = i78;
                            i17 = i80;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField4);
                        i2 = i17;
                        if ((iCharAt11 & 4096) == 4096 || i69 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i18 = i14;
                            i19 = 0;
                        } else {
                            int i81 = i14 + 1;
                            int iCharAt13 = stringInfo.charAt(i14);
                            if (iCharAt13 >= 55296) {
                                int i82 = iCharAt13 & 8191;
                                int i83 = 13;
                                while (true) {
                                    i18 = i81 + 1;
                                    cCharAt9 = stringInfo.charAt(i81);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i82 |= (cCharAt9 & 8191) << i83;
                                    i83 += 13;
                                    i81 = i18;
                                }
                                iCharAt13 = i82 | (cCharAt9 << i83);
                            } else {
                                i18 = i81;
                            }
                            int i84 = (iCharAt13 / 32) + (i3 * 2);
                            Object obj3 = objects[i84];
                            if (obj3 instanceof java.lang.reflect.Field) {
                                fieldReflectField = (java.lang.reflect.Field) obj3;
                            } else {
                                fieldReflectField = reflectField(cls, (String) obj3);
                                objects[i84] = fieldReflectField;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldReflectField);
                            i19 = iCharAt13 % 32;
                        }
                        if (i69 >= 18 && i69 <= 49) {
                            iArr[i58] = iObjectFieldOffset;
                            i58++;
                        }
                    }
                    i17 = i20;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField4);
                    i2 = i17;
                    if ((iCharAt11 & 4096) == 4096) {
                        iObjectFieldOffset2 = 1048575;
                        i18 = i14;
                        i19 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i18 = i14;
                        i19 = 0;
                    }
                    if (i69 >= 18) {
                        iArr[i58] = iObjectFieldOffset;
                        i58++;
                    }
                }
                i17 = i77;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField4);
                i2 = i17;
                if ((iCharAt11 & 4096) == 4096) {
                    iObjectFieldOffset2 = 1048575;
                    i18 = i14;
                    i19 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i18 = i14;
                    i19 = 0;
                }
                if (i69 >= 18) {
                    iArr[i58] = iObjectFieldOffset;
                    i58++;
                }
            }
            int i85 = i60 + 1;
            iArr2[i60] = iCharAt10;
            int i86 = i60 + 2;
            iArr2[i85] = ((iCharAt11 & 256) != 0 ? REQUIRED_MASK : 0) | ((iCharAt11 & 512) != 0 ? ENFORCE_UTF8_MASK : 0) | (i69 << 20) | iObjectFieldOffset;
            i60 += 3;
            iArr2[i86] = (i19 << 20) | iObjectFieldOffset2;
            z = z;
            iCharAt = i15;
            iCharAt5 = i70;
            objArr = objArr;
            i29 = i18;
            length = i13;
            i59 = i71;
            iCharAt2 = i16;
            c = 55296;
        }
        return new C2140s0(iArr2, objArr, iCharAt, iCharAt2, c4931wX.getDefaultInstance(), z, false, iArr, iCharAt5, i56, dr, abstractC2127l0, o0, abstractC3913kt, interfaceC3515gM);
    }

    private int numberAt(int i) {
        return this.buffer[i];
    }

    private static long offset(int i) {
        return i & 1048575;
    }

    private static <T> boolean oneofBooleanAt(T t, long j) {
        return ((Boolean) U0.getObject(t, j)).booleanValue();
    }

    private static <T> double oneofDoubleAt(T t, long j) {
        return ((Double) U0.getObject(t, j)).doubleValue();
    }

    private static <T> float oneofFloatAt(T t, long j) {
        return ((Float) U0.getObject(t, j)).floatValue();
    }

    private static <T> int oneofIntAt(T t, long j) {
        return ((Integer) U0.getObject(t, j)).intValue();
    }

    private static <T> long oneofLongAt(T t, long j) {
        return ((Long) U0.getObject(t, j)).longValue();
    }

    private <K, V> int parseMapField(Object obj, byte[] bArr, int i, int i2, int i3, long j, R5 r5) throws IOException {
        Unsafe unsafe = UNSAFE;
        Object mapFieldDefaultEntry = getMapFieldDefaultEntry(i3);
        Object object = unsafe.getObject(obj, j);
        if (((C3603hM) this.mapFieldSchema).isImmutable(object)) {
            Object objNewMapField = ((C3603hM) this.mapFieldSchema).newMapField(mapFieldDefaultEntry);
            ((C3603hM) this.mapFieldSchema).mergeFrom(objNewMapField, object);
            unsafe.putObject(obj, j, objNewMapField);
            object = objNewMapField;
        }
        return decodeMapEntry(bArr, i, i2, ((C3603hM) this.mapFieldSchema).forMapMetadata(mapFieldDefaultEntry), ((C3603hM) this.mapFieldSchema).forMutableMapData(object), r5);
    }

    private int parseOneofField(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, R5 r5) throws IOException {
        Unsafe unsafe = UNSAFE;
        long j2 = this.buffer[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(C2114f.decodeDouble(bArr, i)));
                int i9 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i9;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(C2114f.decodeFloat(bArr, i)));
                int i10 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i10;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int iDecodeVarint64 = C2114f.decodeVarint64(bArr, i, r5);
                unsafe.putObject(obj, j, Long.valueOf(r5.long1));
                unsafe.putInt(obj, j2, i4);
                return iDecodeVarint64;
            case 55:
            case Input.Keys.SPACE /* 62 */:
                if (i5 != 0) {
                    return i;
                }
                int iDecodeVarint32 = C2114f.decodeVarint32(bArr, i, r5);
                unsafe.putObject(obj, j, Integer.valueOf(r5.int1));
                unsafe.putInt(obj, j2, i4);
                return iDecodeVarint32;
            case Input.Keys.PERIOD /* 56 */:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(C2114f.decodeFixed64(bArr, i)));
                int i11 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i11;
            case Input.Keys.ALT_LEFT /* 57 */:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(C2114f.decodeFixed32(bArr, i)));
                int i12 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i12;
            case Input.Keys.ALT_RIGHT /* 58 */:
                if (i5 != 0) {
                    return i;
                }
                int iDecodeVarint65 = C2114f.decodeVarint64(bArr, i, r5);
                unsafe.putObject(obj, j, Boolean.valueOf(r5.long1 != 0));
                unsafe.putInt(obj, j2, i4);
                return iDecodeVarint65;
            case Input.Keys.SHIFT_LEFT /* 59 */:
                if (i5 != 2) {
                    return i;
                }
                int iDecodeVarint33 = C2114f.decodeVarint32(bArr, i, r5);
                int i13 = r5.int1;
                if (i13 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & ENFORCE_UTF8_MASK) != 0 && !Ng0.isValidUtf8(bArr, iDecodeVarint33, iDecodeVarint33 + i13)) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    unsafe.putObject(obj, j, new String(bArr, iDecodeVarint33, i13, Internal.UTF_8));
                    iDecodeVarint33 += i13;
                }
                unsafe.putInt(obj, j2, i4);
                return iDecodeVarint33;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                Object objMutableOneofMessageFieldForMerge = mutableOneofMessageFieldForMerge(obj, i4, i8);
                int iMergeMessageField = C2114f.mergeMessageField(objMutableOneofMessageFieldForMerge, getMessageFieldSchema(i8), bArr, i, i2, r5);
                storeOneofMessageField(obj, i4, i8, objMutableOneofMessageFieldForMerge);
                return iMergeMessageField;
            case Input.Keys.TAB /* 61 */:
                if (i5 != 2) {
                    return i;
                }
                int iDecodeBytes = C2114f.decodeBytes(bArr, i, r5);
                unsafe.putObject(obj, j, r5.object1);
                unsafe.putInt(obj, j2, i4);
                return iDecodeBytes;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int iDecodeVarint34 = C2114f.decodeVarint32(bArr, i, r5);
                int i14 = r5.int1;
                Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(i8);
                if (enumFieldVerifier == null || enumFieldVerifier.isInRange(i14)) {
                    unsafe.putObject(obj, j, Integer.valueOf(i14));
                    unsafe.putInt(obj, j2, i4);
                } else {
                    getMutableUnknownFields(obj).storeField(i3, Long.valueOf(i14));
                }
                return iDecodeVarint34;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int iDecodeVarint35 = C2114f.decodeVarint32(bArr, i, r5);
                unsafe.putObject(obj, j, Integer.valueOf(CodedInputStream.decodeZigZag32(r5.int1)));
                unsafe.putInt(obj, j2, i4);
                return iDecodeVarint35;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int iDecodeVarint66 = C2114f.decodeVarint64(bArr, i, r5);
                unsafe.putObject(obj, j, Long.valueOf(CodedInputStream.decodeZigZag64(r5.long1)));
                unsafe.putInt(obj, j2, i4);
                return iDecodeVarint66;
            case Input.Keys.GRAVE /* 68 */:
                if (i5 != 3) {
                    return i;
                }
                Object objMutableOneofMessageFieldForMerge2 = mutableOneofMessageFieldForMerge(obj, i4, i8);
                int iMergeGroupField = C2114f.mergeGroupField(objMutableOneofMessageFieldForMerge2, getMessageFieldSchema(i8), bArr, i, i2, (i3 & (-8)) | 4, r5);
                storeOneofMessageField(obj, i4, i8, objMutableOneofMessageFieldForMerge2);
                return iMergeGroupField;
            default:
                return i;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0298 A[PHI: r0 r22 r26 r27 r28
  0x0298: PHI (r0v15 int) = (r0v10 int), (r0v13 int), (r0v17 int) binds: [B:113:0x0303, B:109:0x02e4, B:99:0x0296] A[DONT_GENERATE, DONT_INLINE]
  0x0298: PHI (r22v2 int) = (r22v0 int), (r22v0 int), (r22v3 int) binds: [B:113:0x0303, B:109:0x02e4, B:99:0x0296] A[DONT_GENERATE, DONT_INLINE]
  0x0298: PHI (r26v3 int) = (r26v1 int), (r26v1 int), (r26v4 int) binds: [B:113:0x0303, B:109:0x02e4, B:99:0x0296] A[DONT_GENERATE, DONT_INLINE]
  0x0298: PHI (r27v2 int) = (r27v0 int), (r27v0 int), (r27v3 int) binds: [B:113:0x0303, B:109:0x02e4, B:99:0x0296] A[DONT_GENERATE, DONT_INLINE]
  0x0298: PHI (r28v3 sun.misc.Unsafe) = (r28v1 sun.misc.Unsafe), (r28v1 sun.misc.Unsafe), (r28v4 sun.misc.Unsafe) binds: [B:113:0x0303, B:109:0x02e4, B:99:0x0296] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:102:0x02ae A[PHI: r0 r22 r26 r27 r28
  0x02ae: PHI (r0v14 int) = (r0v10 int), (r0v13 int), (r0v17 int) binds: [B:113:0x0303, B:109:0x02e4, B:99:0x0296] A[DONT_GENERATE, DONT_INLINE]
  0x02ae: PHI (r22v1 int) = (r22v0 int), (r22v0 int), (r22v3 int) binds: [B:113:0x0303, B:109:0x02e4, B:99:0x0296] A[DONT_GENERATE, DONT_INLINE]
  0x02ae: PHI (r26v2 int) = (r26v1 int), (r26v1 int), (r26v4 int) binds: [B:113:0x0303, B:109:0x02e4, B:99:0x0296] A[DONT_GENERATE, DONT_INLINE]
  0x02ae: PHI (r27v1 int) = (r27v0 int), (r27v0 int), (r27v3 int) binds: [B:113:0x0303, B:109:0x02e4, B:99:0x0296] A[DONT_GENERATE, DONT_INLINE]
  0x02ae: PHI (r28v2 sun.misc.Unsafe) = (r28v1 sun.misc.Unsafe), (r28v1 sun.misc.Unsafe), (r28v4 sun.misc.Unsafe) binds: [B:113:0x0303, B:109:0x02e4, B:99:0x0296] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0088. Please report as an issue. */
    private int parseProto3Message(Object obj, byte[] bArr, int i, int i2, R5 r5) throws IOException {
        int i3;
        int iDecodeVarint32;
        int i4;
        int i5;
        int i6;
        int i7;
        Unsafe unsafe;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int iDecodeBytes;
        this = this;
        obj = obj;
        bArr = bArr;
        i2 = i2;
        r5 = r5;
        checkMutable(obj);
        Unsafe unsafe2 = UNSAFE;
        int i13 = -1;
        int oneofField = i;
        int i14 = -1;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1048575;
        while (oneofField < i2) {
            int i18 = oneofField + 1;
            byte b = bArr[oneofField];
            if (b < 0) {
                iDecodeVarint32 = C2114f.decodeVarint32(b, bArr, i18, r5);
                i3 = r5.int1;
            } else {
                i3 = b;
                iDecodeVarint32 = i18;
            }
            int i19 = i3 >>> 3;
            int i20 = i3 & 7;
            int iPositionForFieldNumber = i19 > i14 ? this.positionForFieldNumber(i19, i15 / 3) : this.positionForFieldNumber(i19);
            if (iPositionForFieldNumber == i13) {
                i9 = iDecodeVarint32;
                i4 = i19;
                unsafe = unsafe2;
                i7 = 0;
            } else {
                int i21 = this.buffer[iPositionForFieldNumber + 1];
                int iType = type(i21);
                long jOffset = offset(i21);
                if (iType <= 17) {
                    int i22 = this.buffer[iPositionForFieldNumber + 2];
                    int i23 = 1 << (i22 >>> 20);
                    int i24 = 1048575;
                    int i25 = i22 & 1048575;
                    if (i25 != i17) {
                        if (i17 != 1048575) {
                            unsafe2.putInt(obj, i17, i16);
                            i24 = 1048575;
                        }
                        if (i25 != i24) {
                            i16 = unsafe2.getInt(obj, i25);
                        }
                        i17 = i25;
                    }
                    switch (iType) {
                        case 0:
                            i4 = i19;
                            i10 = iPositionForFieldNumber;
                            i11 = iDecodeVarint32;
                            i12 = i16;
                            if (i20 == 1) {
                                U0.putDouble(obj, jOffset, C2114f.decodeDouble(bArr, i11));
                                oneofField = i11 + 8;
                                i16 = i12 | i23;
                                i15 = i10;
                                i14 = i4;
                            }
                            i16 = i12;
                            i7 = i10;
                            unsafe = unsafe2;
                            i9 = i11;
                            break;
                        case 1:
                            i4 = i19;
                            r5 = r5;
                            i10 = iPositionForFieldNumber;
                            i11 = iDecodeVarint32;
                            i12 = i16;
                            if (i20 == 5) {
                                U0.putFloat(obj, jOffset, C2114f.decodeFloat(bArr, i11));
                                oneofField = i11 + 4;
                                i16 = i12 | i23;
                                i15 = i10;
                                i14 = i4;
                            }
                            i16 = i12;
                            i7 = i10;
                            unsafe = unsafe2;
                            i9 = i11;
                            break;
                        case 2:
                        case 3:
                            i4 = i19;
                            r5 = r5;
                            i10 = iPositionForFieldNumber;
                            i11 = iDecodeVarint32;
                            i12 = i16;
                            if (i20 == 0) {
                                int iDecodeVarint64 = C2114f.decodeVarint64(bArr, i11, r5);
                                unsafe2.putLong(obj, jOffset, r5.long1);
                                i16 = i12 | i23;
                                i15 = i10;
                                oneofField = iDecodeVarint64;
                                i14 = i4;
                            }
                            i16 = i12;
                            i7 = i10;
                            unsafe = unsafe2;
                            i9 = i11;
                            break;
                        case 4:
                        case 11:
                            i4 = i19;
                            r5 = r5;
                            i10 = iPositionForFieldNumber;
                            i11 = iDecodeVarint32;
                            i12 = i16;
                            if (i20 == 0) {
                                oneofField = C2114f.decodeVarint32(bArr, i11, r5);
                                unsafe2.putInt(obj, jOffset, r5.int1);
                                i16 = i12 | i23;
                                i15 = i10;
                                i14 = i4;
                            }
                            i16 = i12;
                            i7 = i10;
                            unsafe = unsafe2;
                            i9 = i11;
                            break;
                        case 5:
                        case 14:
                            i4 = i19;
                            i10 = iPositionForFieldNumber;
                            i12 = i16;
                            if (i20 == 1) {
                                i11 = iDecodeVarint32;
                                unsafe2.putLong(obj, jOffset, C2114f.decodeFixed64(bArr, iDecodeVarint32));
                                oneofField = i11 + 8;
                                i16 = i12 | i23;
                                i15 = i10;
                                i14 = i4;
                            }
                            i11 = iDecodeVarint32;
                            i16 = i12;
                            i7 = i10;
                            unsafe = unsafe2;
                            i9 = i11;
                            break;
                        case 6:
                        case 13:
                            i4 = i19;
                            r5 = r5;
                            i10 = iPositionForFieldNumber;
                            i12 = i16;
                            if (i20 == 5) {
                                unsafe2.putInt(obj, jOffset, C2114f.decodeFixed32(bArr, iDecodeVarint32));
                                oneofField = iDecodeVarint32 + 4;
                                i16 = i12 | i23;
                                i15 = i10;
                                i14 = i4;
                            }
                            i11 = iDecodeVarint32;
                            i16 = i12;
                            i7 = i10;
                            unsafe = unsafe2;
                            i9 = i11;
                            break;
                        case 7:
                            i4 = i19;
                            r5 = r5;
                            i10 = iPositionForFieldNumber;
                            i12 = i16;
                            if (i20 == 0) {
                                int iDecodeVarint65 = C2114f.decodeVarint64(bArr, iDecodeVarint32, r5);
                                U0.putBoolean(obj, jOffset, r5.long1 != 0);
                                i16 = i12 | i23;
                                oneofField = iDecodeVarint65;
                                i15 = i10;
                                i14 = i4;
                            }
                            i11 = iDecodeVarint32;
                            i16 = i12;
                            i7 = i10;
                            unsafe = unsafe2;
                            i9 = i11;
                            break;
                        case 8:
                            i4 = i19;
                            r5 = r5;
                            i10 = iPositionForFieldNumber;
                            i12 = i16;
                            if (i20 == 2) {
                                oneofField = (ENFORCE_UTF8_MASK & i21) == 0 ? C2114f.decodeString(bArr, iDecodeVarint32, r5) : C2114f.decodeStringRequireUtf8(bArr, iDecodeVarint32, r5);
                                unsafe2.putObject(obj, jOffset, r5.object1);
                                i16 = i12 | i23;
                                i15 = i10;
                                i14 = i4;
                            }
                            i11 = iDecodeVarint32;
                            i16 = i12;
                            i7 = i10;
                            unsafe = unsafe2;
                            i9 = i11;
                            break;
                        case 9:
                            i4 = i19;
                            r5 = r5;
                            i10 = iPositionForFieldNumber;
                            if (i20 == 2) {
                                Object objMutableMessageFieldForMerge = this.mutableMessageFieldForMerge(obj, i10);
                                oneofField = C2114f.mergeMessageField(objMutableMessageFieldForMerge, this.getMessageFieldSchema(i10), bArr, iDecodeVarint32, i2, r5);
                                this.storeMessageField(obj, i10, objMutableMessageFieldForMerge);
                                i16 |= i23;
                                i15 = i10;
                                i14 = i4;
                            }
                            i11 = iDecodeVarint32;
                            i12 = i16;
                            i16 = i12;
                            i7 = i10;
                            unsafe = unsafe2;
                            i9 = i11;
                            break;
                        case 10:
                            i4 = i19;
                            r5 = r5;
                            i10 = iPositionForFieldNumber;
                            if (i20 == 2) {
                                iDecodeBytes = C2114f.decodeBytes(bArr, iDecodeVarint32, r5);
                                unsafe2.putObject(obj, jOffset, r5.object1);
                                i16 |= i23;
                                oneofField = iDecodeBytes;
                                i15 = i10;
                                i14 = i4;
                            }
                            i11 = iDecodeVarint32;
                            i12 = i16;
                            i16 = i12;
                            i7 = i10;
                            unsafe = unsafe2;
                            i9 = i11;
                            break;
                        case 12:
                            i4 = i19;
                            r5 = r5;
                            i10 = iPositionForFieldNumber;
                            if (i20 == 0) {
                                iDecodeBytes = C2114f.decodeVarint32(bArr, iDecodeVarint32, r5);
                                unsafe2.putInt(obj, jOffset, r5.int1);
                                i16 |= i23;
                                oneofField = iDecodeBytes;
                                i15 = i10;
                                i14 = i4;
                            }
                            i11 = iDecodeVarint32;
                            i12 = i16;
                            i16 = i12;
                            i7 = i10;
                            unsafe = unsafe2;
                            i9 = i11;
                            break;
                        case 15:
                            i4 = i19;
                            r5 = r5;
                            i10 = iPositionForFieldNumber;
                            if (i20 == 0) {
                                oneofField = C2114f.decodeVarint32(bArr, iDecodeVarint32, r5);
                                unsafe2.putInt(obj, jOffset, CodedInputStream.decodeZigZag32(r5.int1));
                                i16 |= i23;
                                i15 = i10;
                                i14 = i4;
                            }
                            i11 = iDecodeVarint32;
                            i12 = i16;
                            i16 = i12;
                            i7 = i10;
                            unsafe = unsafe2;
                            i9 = i11;
                            break;
                        case 16:
                            if (i20 == 0) {
                                r5 = r5;
                                int iDecodeVarint66 = C2114f.decodeVarint64(bArr, iDecodeVarint32, r5);
                                i4 = i19;
                                unsafe2.putLong(obj, jOffset, CodedInputStream.decodeZigZag64(r5.long1));
                                i16 |= i23;
                                i15 = iPositionForFieldNumber;
                                oneofField = iDecodeVarint66;
                                i14 = i4;
                                break;
                            }
                        default:
                            i4 = i19;
                            i10 = iPositionForFieldNumber;
                            i11 = iDecodeVarint32;
                            i12 = i16;
                            i16 = i12;
                            i7 = i10;
                            unsafe = unsafe2;
                            i9 = i11;
                            break;
                    }
                } else {
                    i4 = i19;
                    int i26 = i16;
                    r5 = r5;
                    int i27 = iDecodeVarint32;
                    if (iType != 27) {
                        if (iType <= 49) {
                            i5 = i26;
                            i7 = iPositionForFieldNumber;
                            unsafe = unsafe2;
                            i6 = i17;
                            oneofField = parseRepeatedField(obj, bArr, i27, i2, i3, i4, i20, iPositionForFieldNumber, i21, iType, jOffset, r5);
                            if (oneofField != i27) {
                                i14 = i4;
                                i17 = i6;
                                i16 = i5;
                            } else {
                                i9 = oneofField;
                                i17 = i6;
                                i16 = i5;
                            }
                        } else {
                            i5 = i26;
                            i6 = i17;
                            i7 = iPositionForFieldNumber;
                            unsafe = unsafe2;
                            i8 = i27;
                            if (iType == 50) {
                                if (i20 == 2) {
                                    oneofField = parseMapField(obj, bArr, i8, i2, i7, jOffset, r5);
                                    if (oneofField != i8) {
                                        i14 = i4;
                                        i17 = i6;
                                        i16 = i5;
                                    } else {
                                        i9 = oneofField;
                                    }
                                }
                                i17 = i6;
                                i16 = i5;
                            } else {
                                oneofField = parseOneofField(obj, bArr, i8, i2, i3, i4, i20, i21, iType, jOffset, i7, r5);
                                if (oneofField != i8) {
                                    i14 = i4;
                                    i17 = i6;
                                    i16 = i5;
                                } else {
                                    i9 = oneofField;
                                    i17 = i6;
                                    i16 = i5;
                                }
                            }
                        }
                        i15 = i7;
                        unsafe2 = unsafe;
                    } else if (i20 == 2) {
                        Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (Internal.ProtobufList) unsafe2.getObject(obj, jOffset);
                        if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
                            int size = protobufListMutableCopyWithCapacity2.size();
                            protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
                            unsafe2.putObject(obj, jOffset, protobufListMutableCopyWithCapacity2);
                        }
                        oneofField = C2114f.decodeMessageList(this.getMessageFieldSchema(iPositionForFieldNumber), i3, bArr, i27, i2, protobufListMutableCopyWithCapacity2, r5);
                        i15 = iPositionForFieldNumber;
                        i16 = i26;
                        i14 = i4;
                    } else {
                        i6 = i17;
                        i7 = iPositionForFieldNumber;
                        unsafe = unsafe2;
                        i8 = i27;
                        i5 = i26;
                    }
                    i9 = i8;
                    i17 = i6;
                    i16 = i5;
                }
                i13 = -1;
            }
            oneofField = C2114f.decodeUnknownField(i3, bArr, i9, i2, getMutableUnknownFields(obj), r5);
            i14 = i4;
            i15 = i7;
            unsafe2 = unsafe;
            i13 = -1;
        }
        int i28 = i16;
        Unsafe unsafe3 = unsafe2;
        if (i17 != 1048575) {
            unsafe3.putInt(obj, i17, i28);
        }
        if (oneofField == i2) {
            return oneofField;
        }
        throw InvalidProtocolBufferException.parseFailure();
    }

    private int parseRepeatedField(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, R5 r5) throws IOException {
        int iDecodeVarint32List;
        Unsafe unsafe = UNSAFE;
        Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (Internal.ProtobufList) unsafe.getObject(obj, j2);
        if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
            int size = protobufListMutableCopyWithCapacity2.size();
            protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j2, protobufListMutableCopyWithCapacity2);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    return C2114f.decodePackedDoubleList(bArr, i, protobufListMutableCopyWithCapacity2, r5);
                }
                return i5 == 1 ? C2114f.decodeDoubleList(i3, bArr, i, i2, protobufListMutableCopyWithCapacity2, r5) : i;
            case 19:
            case 36:
                if (i5 == 2) {
                    return C2114f.decodePackedFloatList(bArr, i, protobufListMutableCopyWithCapacity2, r5);
                }
                return i5 == 5 ? C2114f.decodeFloatList(i3, bArr, i, i2, protobufListMutableCopyWithCapacity2, r5) : i;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    return C2114f.decodePackedVarint64List(bArr, i, protobufListMutableCopyWithCapacity2, r5);
                }
                return i5 == 0 ? C2114f.decodeVarint64List(i3, bArr, i, i2, protobufListMutableCopyWithCapacity2, r5) : i;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return C2114f.decodePackedVarint32List(bArr, i, protobufListMutableCopyWithCapacity2, r5);
                }
                return i5 == 0 ? C2114f.decodeVarint32List(i3, bArr, i, i2, protobufListMutableCopyWithCapacity2, r5) : i;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    return C2114f.decodePackedFixed64List(bArr, i, protobufListMutableCopyWithCapacity2, r5);
                }
                return i5 == 1 ? C2114f.decodeFixed64List(i3, bArr, i, i2, protobufListMutableCopyWithCapacity2, r5) : i;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    return C2114f.decodePackedFixed32List(bArr, i, protobufListMutableCopyWithCapacity2, r5);
                }
                return i5 == 5 ? C2114f.decodeFixed32List(i3, bArr, i, i2, protobufListMutableCopyWithCapacity2, r5) : i;
            case 25:
            case 42:
                if (i5 == 2) {
                    return C2114f.decodePackedBoolList(bArr, i, protobufListMutableCopyWithCapacity2, r5);
                }
                return i5 == 0 ? C2114f.decodeBoolList(i3, bArr, i, i2, protobufListMutableCopyWithCapacity2, r5) : i;
            case 26:
                if (i5 == 2) {
                    return (j & 536870912) == 0 ? C2114f.decodeStringList(i3, bArr, i, i2, protobufListMutableCopyWithCapacity2, r5) : C2114f.decodeStringListRequireUtf8(i3, bArr, i, i2, protobufListMutableCopyWithCapacity2, r5);
                }
                return i;
            case 27:
                return i5 == 2 ? C2114f.decodeMessageList(getMessageFieldSchema(i6), i3, bArr, i, i2, protobufListMutableCopyWithCapacity2, r5) : i;
            case 28:
                return i5 == 2 ? C2114f.decodeBytesList(i3, bArr, i, i2, protobufListMutableCopyWithCapacity2, r5) : i;
            case 30:
            case 44:
                if (i5 == 2) {
                    iDecodeVarint32List = C2114f.decodePackedVarint32List(bArr, i, protobufListMutableCopyWithCapacity2, r5);
                } else {
                    if (i5 != 0) {
                        return i;
                    }
                    iDecodeVarint32List = C2114f.decodeVarint32List(i3, bArr, i, i2, protobufListMutableCopyWithCapacity2, r5);
                }
                D0.filterUnknownEnumList(obj, i4, protobufListMutableCopyWithCapacity2, getEnumFieldVerifier(i6), (Object) null, this.unknownFieldSchema);
                return iDecodeVarint32List;
            case 33:
            case 47:
                if (i5 == 2) {
                    return C2114f.decodePackedSInt32List(bArr, i, protobufListMutableCopyWithCapacity2, r5);
                }
                return i5 == 0 ? C2114f.decodeSInt32List(i3, bArr, i, i2, protobufListMutableCopyWithCapacity2, r5) : i;
            case 34:
            case 48:
                if (i5 == 2) {
                    return C2114f.decodePackedSInt64List(bArr, i, protobufListMutableCopyWithCapacity2, r5);
                }
                return i5 == 0 ? C2114f.decodeSInt64List(i3, bArr, i, i2, protobufListMutableCopyWithCapacity2, r5) : i;
            case 49:
                return i5 == 3 ? C2114f.decodeGroupList(getMessageFieldSchema(i6), i3, bArr, i, i2, protobufListMutableCopyWithCapacity2, r5) : i;
            default:
                return i;
        }
    }

    private int positionForFieldNumber(int i) {
        if (i < this.minFieldNumber || i > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i, 0);
    }

    private int presenceMaskAndOffsetAt(int i) {
        return this.buffer[i + 2];
    }

    private <E> void readGroupList(Object obj, long j, AX ax, InterfaceC3578h30 interfaceC3578h30, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ((C2139s) ax).readGroupList(this.listFieldSchema.mutableListAt(obj, j), interfaceC3578h30, extensionRegistryLite);
    }

    private <E> void readMessageList(Object obj, int i, AX ax, InterfaceC3578h30 interfaceC3578h30, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        C2139s c2139s = (C2139s) ax;
        c2139s.readMessageList(this.listFieldSchema.mutableListAt(obj, offset(i)), interfaceC3578h30, extensionRegistryLite);
    }

    private void readString(Object obj, int i, AX ax) throws IOException {
        if (isEnforceUtf8(i)) {
            U0.putObject(obj, offset(i), ((C2139s) ax).readStringRequireUtf8());
        } else if (this.lite) {
            U0.putObject(obj, offset(i), ((C2139s) ax).readString());
        } else {
            U0.putObject(obj, offset(i), ((C2139s) ax).readBytes());
        }
    }

    private void readStringList(Object obj, int i, AX ax) throws IOException {
        if (isEnforceUtf8(i)) {
            ((C2139s) ax).readStringListRequireUtf8(this.listFieldSchema.mutableListAt(obj, offset(i)));
        } else {
            ((C2139s) ax).readStringList(this.listFieldSchema.mutableListAt(obj, offset(i)));
        }
    }

    private static java.lang.reflect.Field reflectField(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbU = AbstractC3950lJ.u("Field ", str, " for ");
            sbU.append(cls.getName());
            sbU.append(" not found. Known fields are ");
            sbU.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbU.toString());
        }
    }

    private void setFieldPresent(Object obj, int i) {
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i);
        long j = 1048575 & iPresenceMaskAndOffsetAt;
        if (j == 1048575) {
            return;
        }
        U0.putInt(obj, j, (1 << (iPresenceMaskAndOffsetAt >>> 20)) | U0.getInt(obj, j));
    }

    private void setOneofPresent(Object obj, int i, int i2) {
        U0.putInt(obj, presenceMaskAndOffsetAt(i2) & 1048575, i);
    }

    private int slowPositionForFieldNumber(int i, int i2) {
        int length = (this.buffer.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int iNumberAt = numberAt(i4);
            if (i == iNumberAt) {
                return i4;
            }
            if (i < iNumberAt) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0079  */
    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0083  */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    private static void storeFieldData(S s, int[] iArr, int i, Object[] objArr) {
        int iObjectFieldOffset;
        int iId;
        long jObjectFieldOffset;
        int iObjectFieldOffset2;
        int iNumberOfTrailingZeros;
        int i2;
        Class<?> messageFieldClass;
        int i3;
        QS oneof = s.getOneof();
        if (oneof == null) {
            FieldType type = s.getType();
            iObjectFieldOffset = (int) U0.objectFieldOffset(s.getField());
            iId = type.id();
            if (type.isList() || type.isMap()) {
                if (s.getCachedSizeField() == null) {
                    iObjectFieldOffset2 = 0;
                } else {
                    jObjectFieldOffset = U0.objectFieldOffset(s.getCachedSizeField());
                }
                iNumberOfTrailingZeros = 0;
            } else {
                java.lang.reflect.Field presenceField = s.getPresenceField();
                iObjectFieldOffset2 = presenceField == null ? 1048575 : (int) U0.objectFieldOffset(presenceField);
                iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(s.getPresenceMask());
            }
            iArr[i] = s.getFieldNumber();
            int i4 = i + 1;
            if (s.isEnforceUtf8()) {
                i2 = ENFORCE_UTF8_MASK;
            } else {
                i2 = 0;
            }
            iArr[i4] = (s.isRequired() ? REQUIRED_MASK : 0) | i2 | (iId << 20) | iObjectFieldOffset;
            iArr[i + 2] = iObjectFieldOffset2 | (iNumberOfTrailingZeros << 20);
            messageFieldClass = s.getMessageFieldClass();
            if (s.getMapDefaultEntry() != null) {
                if (messageFieldClass != null) {
                    objArr[((i / 3) * 2) + 1] = messageFieldClass;
                    return;
                } else {
                    if (s.getEnumVerifier() != null) {
                        objArr[((i / 3) * 2) + 1] = s.getEnumVerifier();
                        return;
                    }
                    return;
                }
            }
            i3 = (i / 3) * 2;
            objArr[i3] = s.getMapDefaultEntry();
            if (messageFieldClass != null) {
                objArr[i3 + 1] = messageFieldClass;
            } else if (s.getEnumVerifier() != null) {
                objArr[i3 + 1] = s.getEnumVerifier();
            }
        }
        iId = s.getType().id() + 51;
        iObjectFieldOffset = (int) U0.objectFieldOffset(oneof.getValueField());
        jObjectFieldOffset = U0.objectFieldOffset(oneof.getCaseField());
        iObjectFieldOffset2 = (int) jObjectFieldOffset;
        iNumberOfTrailingZeros = 0;
        iArr[i] = s.getFieldNumber();
        int i5 = i + 1;
        if (s.isEnforceUtf8()) {
            i2 = ENFORCE_UTF8_MASK;
        } else {
            i2 = 0;
        }
        iArr[i5] = (s.isRequired() ? REQUIRED_MASK : 0) | i2 | (iId << 20) | iObjectFieldOffset;
        iArr[i + 2] = iObjectFieldOffset2 | (iNumberOfTrailingZeros << 20);
        messageFieldClass = s.getMessageFieldClass();
        if (s.getMapDefaultEntry() != null) {
            if (messageFieldClass != null) {
                objArr[((i / 3) * 2) + 1] = messageFieldClass;
                return;
            } else {
                if (s.getEnumVerifier() != null) {
                    objArr[((i / 3) * 2) + 1] = s.getEnumVerifier();
                    return;
                }
                return;
            }
        }
        i3 = (i / 3) * 2;
        objArr[i3] = s.getMapDefaultEntry();
        if (messageFieldClass != null) {
            objArr[i3 + 1] = messageFieldClass;
        } else if (s.getEnumVerifier() != null) {
            objArr[i3 + 1] = s.getEnumVerifier();
        }
    }

    private void storeMessageField(Object obj, int i, Object obj2) {
        UNSAFE.putObject(obj, offset(typeAndOffsetAt(i)), obj2);
        setFieldPresent(obj, i);
    }

    private void storeOneofMessageField(Object obj, int i, int i2, Object obj2) {
        UNSAFE.putObject(obj, offset(typeAndOffsetAt(i2)), obj2);
        setOneofPresent(obj, i, i2);
    }

    private static int type(int i) {
        return (i & FIELD_TYPE_MASK) >>> 20;
    }

    private int typeAndOffsetAt(int i) {
        return this.buffer[i + 1];
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    private void writeFieldsInAscendingOrderProto2(Object obj, InterfaceC3642hm0 interfaceC3642hm0) throws IOException {
        Iterator<Map.Entry<FieldSet$FieldDescriptorLite<Object>, Object>> it;
        Map.Entry<FieldSet$FieldDescriptorLite<Object>, Object> next;
        int i;
        if (this.hasExtensions) {
            W extensions = this.extensionSchema.getExtensions(obj);
            if (extensions.isEmpty()) {
                it = null;
                next = null;
            } else {
                it = extensions.iterator();
                next = it.next();
            }
        } else {
            it = null;
            next = null;
        }
        int length = this.buffer.length;
        Unsafe unsafe = UNSAFE;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 1048575;
        int i5 = 0;
        while (i3 < length) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i3);
            int iNumberAt = numberAt(i3);
            int iType = type(iTypeAndOffsetAt);
            if (iType <= 17) {
                int i6 = this.buffer[i3 + 2];
                int i7 = i6 & i2;
                if (i7 != i4) {
                    i5 = unsafe.getInt(obj, i7);
                    i4 = i7;
                }
                i = 1 << (i6 >>> 20);
            } else {
                i = 0;
            }
            while (next != null && this.extensionSchema.extensionNumber(next) <= iNumberAt) {
                this.extensionSchema.serializeExtension(interfaceC3642hm0, next);
                next = it.hasNext() ? it.next() : null;
            }
            long jOffset = offset(iTypeAndOffsetAt);
            switch (iType) {
                case 0:
                    if ((i & i5) != 0) {
                        ((A) interfaceC3642hm0).writeDouble(iNumberAt, doubleAt(obj, jOffset));
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 1:
                    if ((i & i5) != 0) {
                        ((A) interfaceC3642hm0).writeFloat(iNumberAt, floatAt(obj, jOffset));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 2:
                    if ((i & i5) != 0) {
                        ((A) interfaceC3642hm0).writeInt64(iNumberAt, unsafe.getLong(obj, jOffset));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 3:
                    if ((i & i5) != 0) {
                        ((A) interfaceC3642hm0).writeUInt64(iNumberAt, unsafe.getLong(obj, jOffset));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 4:
                    if ((i & i5) != 0) {
                        ((A) interfaceC3642hm0).writeInt32(iNumberAt, unsafe.getInt(obj, jOffset));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 5:
                    if ((i & i5) != 0) {
                        ((A) interfaceC3642hm0).writeFixed64(iNumberAt, unsafe.getLong(obj, jOffset));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 6:
                    if ((i & i5) != 0) {
                        ((A) interfaceC3642hm0).writeFixed32(iNumberAt, unsafe.getInt(obj, jOffset));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 7:
                    if ((i & i5) != 0) {
                        ((A) interfaceC3642hm0).writeBool(iNumberAt, booleanAt(obj, jOffset));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 8:
                    if ((i & i5) != 0) {
                        writeString(iNumberAt, unsafe.getObject(obj, jOffset), interfaceC3642hm0);
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 9:
                    if ((i & i5) != 0) {
                        ((A) interfaceC3642hm0).writeMessage(iNumberAt, unsafe.getObject(obj, jOffset), getMessageFieldSchema(i3));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 10:
                    if ((i & i5) != 0) {
                        ((A) interfaceC3642hm0).writeBytes(iNumberAt, (ByteString) unsafe.getObject(obj, jOffset));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 11:
                    if ((i & i5) != 0) {
                        ((A) interfaceC3642hm0).writeUInt32(iNumberAt, unsafe.getInt(obj, jOffset));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 12:
                    if ((i & i5) != 0) {
                        ((A) interfaceC3642hm0).writeEnum(iNumberAt, unsafe.getInt(obj, jOffset));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 13:
                    if ((i & i5) != 0) {
                        ((A) interfaceC3642hm0).writeSFixed32(iNumberAt, unsafe.getInt(obj, jOffset));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 14:
                    if ((i & i5) != 0) {
                        ((A) interfaceC3642hm0).writeSFixed64(iNumberAt, unsafe.getLong(obj, jOffset));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 15:
                    if ((i & i5) != 0) {
                        ((A) interfaceC3642hm0).writeSInt32(iNumberAt, unsafe.getInt(obj, jOffset));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 16:
                    if ((i & i5) != 0) {
                        ((A) interfaceC3642hm0).writeSInt64(iNumberAt, unsafe.getLong(obj, jOffset));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 17:
                    if ((i & i5) != 0) {
                        ((A) interfaceC3642hm0).writeGroup(iNumberAt, unsafe.getObject(obj, jOffset), getMessageFieldSchema(i3));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 18:
                    D0.writeDoubleList(numberAt(i3), (List) unsafe.getObject(obj, jOffset), interfaceC3642hm0, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 19:
                    D0.writeFloatList(numberAt(i3), (List) unsafe.getObject(obj, jOffset), interfaceC3642hm0, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 20:
                    D0.writeInt64List(numberAt(i3), (List) unsafe.getObject(obj, jOffset), interfaceC3642hm0, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 21:
                    D0.writeUInt64List(numberAt(i3), (List) unsafe.getObject(obj, jOffset), interfaceC3642hm0, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 22:
                    D0.writeInt32List(numberAt(i3), (List) unsafe.getObject(obj, jOffset), interfaceC3642hm0, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 23:
                    D0.writeFixed64List(numberAt(i3), (List) unsafe.getObject(obj, jOffset), interfaceC3642hm0, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 24:
                    D0.writeFixed32List(numberAt(i3), (List) unsafe.getObject(obj, jOffset), interfaceC3642hm0, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 25:
                    D0.writeBoolList(numberAt(i3), (List) unsafe.getObject(obj, jOffset), interfaceC3642hm0, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 26:
                    D0.writeStringList(numberAt(i3), (List) unsafe.getObject(obj, jOffset), interfaceC3642hm0);
                    break;
                case 27:
                    D0.writeMessageList(numberAt(i3), (List) unsafe.getObject(obj, jOffset), interfaceC3642hm0, getMessageFieldSchema(i3));
                    break;
                case 28:
                    D0.writeBytesList(numberAt(i3), (List) unsafe.getObject(obj, jOffset), interfaceC3642hm0);
                    break;
                case 29:
                    D0.writeUInt32List(numberAt(i3), (List) unsafe.getObject(obj, jOffset), interfaceC3642hm0, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 30:
                    D0.writeEnumList(numberAt(i3), (List) unsafe.getObject(obj, jOffset), interfaceC3642hm0, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 31:
                    D0.writeSFixed32List(numberAt(i3), (List) unsafe.getObject(obj, jOffset), interfaceC3642hm0, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 32:
                    D0.writeSFixed64List(numberAt(i3), (List) unsafe.getObject(obj, jOffset), interfaceC3642hm0, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 33:
                    D0.writeSInt32List(numberAt(i3), (List) unsafe.getObject(obj, jOffset), interfaceC3642hm0, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 34:
                    D0.writeSInt64List(numberAt(i3), (List) unsafe.getObject(obj, jOffset), interfaceC3642hm0, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 35:
                    D0.writeDoubleList(numberAt(i3), (List) unsafe.getObject(obj, jOffset), interfaceC3642hm0, true);
                    break;
                case 36:
                    D0.writeFloatList(numberAt(i3), (List) unsafe.getObject(obj, jOffset), interfaceC3642hm0, true);
                    break;
                case 37:
                    D0.writeInt64List(numberAt(i3), (List) unsafe.getObject(obj, jOffset), interfaceC3642hm0, true);
                    break;
                case 38:
                    D0.writeUInt64List(numberAt(i3), (List) unsafe.getObject(obj, jOffset), interfaceC3642hm0, true);
                    break;
                case 39:
                    D0.writeInt32List(numberAt(i3), (List) unsafe.getObject(obj, jOffset), interfaceC3642hm0, true);
                    break;
                case 40:
                    D0.writeFixed64List(numberAt(i3), (List) unsafe.getObject(obj, jOffset), interfaceC3642hm0, true);
                    break;
                case 41:
                    D0.writeFixed32List(numberAt(i3), (List) unsafe.getObject(obj, jOffset), interfaceC3642hm0, true);
                    break;
                case 42:
                    D0.writeBoolList(numberAt(i3), (List) unsafe.getObject(obj, jOffset), interfaceC3642hm0, true);
                    break;
                case 43:
                    D0.writeUInt32List(numberAt(i3), (List) unsafe.getObject(obj, jOffset), interfaceC3642hm0, true);
                    break;
                case 44:
                    D0.writeEnumList(numberAt(i3), (List) unsafe.getObject(obj, jOffset), interfaceC3642hm0, true);
                    break;
                case 45:
                    D0.writeSFixed32List(numberAt(i3), (List) unsafe.getObject(obj, jOffset), interfaceC3642hm0, true);
                    break;
                case 46:
                    D0.writeSFixed64List(numberAt(i3), (List) unsafe.getObject(obj, jOffset), interfaceC3642hm0, true);
                    break;
                case 47:
                    D0.writeSInt32List(numberAt(i3), (List) unsafe.getObject(obj, jOffset), interfaceC3642hm0, true);
                    break;
                case 48:
                    D0.writeSInt64List(numberAt(i3), (List) unsafe.getObject(obj, jOffset), interfaceC3642hm0, true);
                    break;
                case 49:
                    D0.writeGroupList(numberAt(i3), (List) unsafe.getObject(obj, jOffset), interfaceC3642hm0, getMessageFieldSchema(i3));
                    break;
                case 50:
                    writeMapHelper(interfaceC3642hm0, iNumberAt, unsafe.getObject(obj, jOffset), i3);
                    break;
                case 51:
                    if (isOneofPresent(obj, iNumberAt, i3)) {
                        ((A) interfaceC3642hm0).writeDouble(iNumberAt, oneofDoubleAt(obj, jOffset));
                    }
                    break;
                case 52:
                    if (isOneofPresent(obj, iNumberAt, i3)) {
                        ((A) interfaceC3642hm0).writeFloat(iNumberAt, oneofFloatAt(obj, jOffset));
                    }
                    break;
                case 53:
                    if (isOneofPresent(obj, iNumberAt, i3)) {
                        ((A) interfaceC3642hm0).writeInt64(iNumberAt, oneofLongAt(obj, jOffset));
                    }
                    break;
                case 54:
                    if (isOneofPresent(obj, iNumberAt, i3)) {
                        ((A) interfaceC3642hm0).writeUInt64(iNumberAt, oneofLongAt(obj, jOffset));
                    }
                    break;
                case 55:
                    if (isOneofPresent(obj, iNumberAt, i3)) {
                        ((A) interfaceC3642hm0).writeInt32(iNumberAt, oneofIntAt(obj, jOffset));
                    }
                    break;
                case Input.Keys.PERIOD /* 56 */:
                    if (isOneofPresent(obj, iNumberAt, i3)) {
                        ((A) interfaceC3642hm0).writeFixed64(iNumberAt, oneofLongAt(obj, jOffset));
                    }
                    break;
                case Input.Keys.ALT_LEFT /* 57 */:
                    if (isOneofPresent(obj, iNumberAt, i3)) {
                        ((A) interfaceC3642hm0).writeFixed32(iNumberAt, oneofIntAt(obj, jOffset));
                    }
                    break;
                case Input.Keys.ALT_RIGHT /* 58 */:
                    if (isOneofPresent(obj, iNumberAt, i3)) {
                        ((A) interfaceC3642hm0).writeBool(iNumberAt, oneofBooleanAt(obj, jOffset));
                    }
                    break;
                case Input.Keys.SHIFT_LEFT /* 59 */:
                    if (isOneofPresent(obj, iNumberAt, i3)) {
                        writeString(iNumberAt, unsafe.getObject(obj, jOffset), interfaceC3642hm0);
                    }
                    break;
                case 60:
                    if (isOneofPresent(obj, iNumberAt, i3)) {
                        ((A) interfaceC3642hm0).writeMessage(iNumberAt, unsafe.getObject(obj, jOffset), getMessageFieldSchema(i3));
                    }
                    break;
                case Input.Keys.TAB /* 61 */:
                    if (isOneofPresent(obj, iNumberAt, i3)) {
                        ((A) interfaceC3642hm0).writeBytes(iNumberAt, (ByteString) unsafe.getObject(obj, jOffset));
                    }
                    break;
                case Input.Keys.SPACE /* 62 */:
                    if (isOneofPresent(obj, iNumberAt, i3)) {
                        ((A) interfaceC3642hm0).writeUInt32(iNumberAt, oneofIntAt(obj, jOffset));
                    }
                    break;
                case 63:
                    if (isOneofPresent(obj, iNumberAt, i3)) {
                        ((A) interfaceC3642hm0).writeEnum(iNumberAt, oneofIntAt(obj, jOffset));
                    }
                    break;
                case 64:
                    if (isOneofPresent(obj, iNumberAt, i3)) {
                        ((A) interfaceC3642hm0).writeSFixed32(iNumberAt, oneofIntAt(obj, jOffset));
                    }
                    break;
                case 65:
                    if (isOneofPresent(obj, iNumberAt, i3)) {
                        ((A) interfaceC3642hm0).writeSFixed64(iNumberAt, oneofLongAt(obj, jOffset));
                    }
                    break;
                case 66:
                    if (isOneofPresent(obj, iNumberAt, i3)) {
                        ((A) interfaceC3642hm0).writeSInt32(iNumberAt, oneofIntAt(obj, jOffset));
                    }
                    break;
                case 67:
                    if (isOneofPresent(obj, iNumberAt, i3)) {
                        ((A) interfaceC3642hm0).writeSInt64(iNumberAt, oneofLongAt(obj, jOffset));
                    }
                    break;
                case Input.Keys.GRAVE /* 68 */:
                    if (isOneofPresent(obj, iNumberAt, i3)) {
                        ((A) interfaceC3642hm0).writeGroup(iNumberAt, unsafe.getObject(obj, jOffset), getMessageFieldSchema(i3));
                    }
                    break;
            }
            i3 += 3;
            i2 = 1048575;
        }
        while (next != null) {
            this.extensionSchema.serializeExtension(interfaceC3642hm0, next);
            next = it.hasNext() ? it.next() : null;
        }
        writeUnknownInMessageTo(this.unknownFieldSchema, obj, interfaceC3642hm0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    private void writeFieldsInAscendingOrderProto3(Object obj, InterfaceC3642hm0 interfaceC3642hm0) throws IOException {
        Iterator<Map.Entry<FieldSet$FieldDescriptorLite<Object>, Object>> it;
        Map.Entry<FieldSet$FieldDescriptorLite<Object>, Object> next;
        if (this.hasExtensions) {
            W extensions = this.extensionSchema.getExtensions(obj);
            if (extensions.isEmpty()) {
                it = null;
                next = null;
            } else {
                it = extensions.iterator();
                next = it.next();
            }
        } else {
            it = null;
            next = null;
        }
        int length = this.buffer.length;
        for (int i = 0; i < length; i += 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i);
            int iNumberAt = numberAt(i);
            while (next != null && this.extensionSchema.extensionNumber(next) <= iNumberAt) {
                this.extensionSchema.serializeExtension(interfaceC3642hm0, next);
                next = it.hasNext() ? it.next() : null;
            }
            switch (type(iTypeAndOffsetAt)) {
                case 0:
                    if (isFieldPresent(obj, i)) {
                        ((A) interfaceC3642hm0).writeDouble(iNumberAt, doubleAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 1:
                    if (isFieldPresent(obj, i)) {
                        ((A) interfaceC3642hm0).writeFloat(iNumberAt, floatAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 2:
                    if (isFieldPresent(obj, i)) {
                        ((A) interfaceC3642hm0).writeInt64(iNumberAt, longAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 3:
                    if (isFieldPresent(obj, i)) {
                        ((A) interfaceC3642hm0).writeUInt64(iNumberAt, longAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 4:
                    if (isFieldPresent(obj, i)) {
                        ((A) interfaceC3642hm0).writeInt32(iNumberAt, intAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 5:
                    if (isFieldPresent(obj, i)) {
                        ((A) interfaceC3642hm0).writeFixed64(iNumberAt, longAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 6:
                    if (isFieldPresent(obj, i)) {
                        ((A) interfaceC3642hm0).writeFixed32(iNumberAt, intAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 7:
                    if (isFieldPresent(obj, i)) {
                        ((A) interfaceC3642hm0).writeBool(iNumberAt, booleanAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 8:
                    if (isFieldPresent(obj, i)) {
                        writeString(iNumberAt, U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0);
                    }
                    break;
                case 9:
                    if (isFieldPresent(obj, i)) {
                        ((A) interfaceC3642hm0).writeMessage(iNumberAt, U0.getObject(obj, offset(iTypeAndOffsetAt)), getMessageFieldSchema(i));
                    }
                    break;
                case 10:
                    if (isFieldPresent(obj, i)) {
                        ((A) interfaceC3642hm0).writeBytes(iNumberAt, (ByteString) U0.getObject(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 11:
                    if (isFieldPresent(obj, i)) {
                        ((A) interfaceC3642hm0).writeUInt32(iNumberAt, intAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 12:
                    if (isFieldPresent(obj, i)) {
                        ((A) interfaceC3642hm0).writeEnum(iNumberAt, intAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 13:
                    if (isFieldPresent(obj, i)) {
                        ((A) interfaceC3642hm0).writeSFixed32(iNumberAt, intAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 14:
                    if (isFieldPresent(obj, i)) {
                        ((A) interfaceC3642hm0).writeSFixed64(iNumberAt, longAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 15:
                    if (isFieldPresent(obj, i)) {
                        ((A) interfaceC3642hm0).writeSInt32(iNumberAt, intAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 16:
                    if (isFieldPresent(obj, i)) {
                        ((A) interfaceC3642hm0).writeSInt64(iNumberAt, longAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 17:
                    if (isFieldPresent(obj, i)) {
                        ((A) interfaceC3642hm0).writeGroup(iNumberAt, U0.getObject(obj, offset(iTypeAndOffsetAt)), getMessageFieldSchema(i));
                    }
                    break;
                case 18:
                    D0.writeDoubleList(numberAt(i), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, false);
                    break;
                case 19:
                    D0.writeFloatList(numberAt(i), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, false);
                    break;
                case 20:
                    D0.writeInt64List(numberAt(i), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, false);
                    break;
                case 21:
                    D0.writeUInt64List(numberAt(i), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, false);
                    break;
                case 22:
                    D0.writeInt32List(numberAt(i), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, false);
                    break;
                case 23:
                    D0.writeFixed64List(numberAt(i), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, false);
                    break;
                case 24:
                    D0.writeFixed32List(numberAt(i), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, false);
                    break;
                case 25:
                    D0.writeBoolList(numberAt(i), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, false);
                    break;
                case 26:
                    D0.writeStringList(numberAt(i), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0);
                    break;
                case 27:
                    D0.writeMessageList(numberAt(i), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, getMessageFieldSchema(i));
                    break;
                case 28:
                    D0.writeBytesList(numberAt(i), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0);
                    break;
                case 29:
                    D0.writeUInt32List(numberAt(i), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, false);
                    break;
                case 30:
                    D0.writeEnumList(numberAt(i), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, false);
                    break;
                case 31:
                    D0.writeSFixed32List(numberAt(i), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, false);
                    break;
                case 32:
                    D0.writeSFixed64List(numberAt(i), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, false);
                    break;
                case 33:
                    D0.writeSInt32List(numberAt(i), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, false);
                    break;
                case 34:
                    D0.writeSInt64List(numberAt(i), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, false);
                    break;
                case 35:
                    D0.writeDoubleList(numberAt(i), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, true);
                    break;
                case 36:
                    D0.writeFloatList(numberAt(i), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, true);
                    break;
                case 37:
                    D0.writeInt64List(numberAt(i), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, true);
                    break;
                case 38:
                    D0.writeUInt64List(numberAt(i), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, true);
                    break;
                case 39:
                    D0.writeInt32List(numberAt(i), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, true);
                    break;
                case 40:
                    D0.writeFixed64List(numberAt(i), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, true);
                    break;
                case 41:
                    D0.writeFixed32List(numberAt(i), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, true);
                    break;
                case 42:
                    D0.writeBoolList(numberAt(i), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, true);
                    break;
                case 43:
                    D0.writeUInt32List(numberAt(i), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, true);
                    break;
                case 44:
                    D0.writeEnumList(numberAt(i), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, true);
                    break;
                case 45:
                    D0.writeSFixed32List(numberAt(i), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, true);
                    break;
                case 46:
                    D0.writeSFixed64List(numberAt(i), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, true);
                    break;
                case 47:
                    D0.writeSInt32List(numberAt(i), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, true);
                    break;
                case 48:
                    D0.writeSInt64List(numberAt(i), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, true);
                    break;
                case 49:
                    D0.writeGroupList(numberAt(i), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, getMessageFieldSchema(i));
                    break;
                case 50:
                    writeMapHelper(interfaceC3642hm0, iNumberAt, U0.getObject(obj, offset(iTypeAndOffsetAt)), i);
                    break;
                case 51:
                    if (isOneofPresent(obj, iNumberAt, i)) {
                        ((A) interfaceC3642hm0).writeDouble(iNumberAt, oneofDoubleAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 52:
                    if (isOneofPresent(obj, iNumberAt, i)) {
                        ((A) interfaceC3642hm0).writeFloat(iNumberAt, oneofFloatAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 53:
                    if (isOneofPresent(obj, iNumberAt, i)) {
                        ((A) interfaceC3642hm0).writeInt64(iNumberAt, oneofLongAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 54:
                    if (isOneofPresent(obj, iNumberAt, i)) {
                        ((A) interfaceC3642hm0).writeUInt64(iNumberAt, oneofLongAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 55:
                    if (isOneofPresent(obj, iNumberAt, i)) {
                        ((A) interfaceC3642hm0).writeInt32(iNumberAt, oneofIntAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case Input.Keys.PERIOD /* 56 */:
                    if (isOneofPresent(obj, iNumberAt, i)) {
                        ((A) interfaceC3642hm0).writeFixed64(iNumberAt, oneofLongAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case Input.Keys.ALT_LEFT /* 57 */:
                    if (isOneofPresent(obj, iNumberAt, i)) {
                        ((A) interfaceC3642hm0).writeFixed32(iNumberAt, oneofIntAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case Input.Keys.ALT_RIGHT /* 58 */:
                    if (isOneofPresent(obj, iNumberAt, i)) {
                        ((A) interfaceC3642hm0).writeBool(iNumberAt, oneofBooleanAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case Input.Keys.SHIFT_LEFT /* 59 */:
                    if (isOneofPresent(obj, iNumberAt, i)) {
                        writeString(iNumberAt, U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0);
                    }
                    break;
                case 60:
                    if (isOneofPresent(obj, iNumberAt, i)) {
                        ((A) interfaceC3642hm0).writeMessage(iNumberAt, U0.getObject(obj, offset(iTypeAndOffsetAt)), getMessageFieldSchema(i));
                    }
                    break;
                case Input.Keys.TAB /* 61 */:
                    if (isOneofPresent(obj, iNumberAt, i)) {
                        ((A) interfaceC3642hm0).writeBytes(iNumberAt, (ByteString) U0.getObject(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case Input.Keys.SPACE /* 62 */:
                    if (isOneofPresent(obj, iNumberAt, i)) {
                        ((A) interfaceC3642hm0).writeUInt32(iNumberAt, oneofIntAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 63:
                    if (isOneofPresent(obj, iNumberAt, i)) {
                        ((A) interfaceC3642hm0).writeEnum(iNumberAt, oneofIntAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 64:
                    if (isOneofPresent(obj, iNumberAt, i)) {
                        ((A) interfaceC3642hm0).writeSFixed32(iNumberAt, oneofIntAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 65:
                    if (isOneofPresent(obj, iNumberAt, i)) {
                        ((A) interfaceC3642hm0).writeSFixed64(iNumberAt, oneofLongAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 66:
                    if (isOneofPresent(obj, iNumberAt, i)) {
                        ((A) interfaceC3642hm0).writeSInt32(iNumberAt, oneofIntAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 67:
                    if (isOneofPresent(obj, iNumberAt, i)) {
                        ((A) interfaceC3642hm0).writeSInt64(iNumberAt, oneofLongAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case Input.Keys.GRAVE /* 68 */:
                    if (isOneofPresent(obj, iNumberAt, i)) {
                        ((A) interfaceC3642hm0).writeGroup(iNumberAt, U0.getObject(obj, offset(iTypeAndOffsetAt)), getMessageFieldSchema(i));
                    }
                    break;
            }
        }
        while (next != null) {
            this.extensionSchema.serializeExtension(interfaceC3642hm0, next);
            next = it.hasNext() ? it.next() : null;
        }
        writeUnknownInMessageTo(this.unknownFieldSchema, obj, interfaceC3642hm0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    private void writeFieldsInDescendingOrder(Object obj, InterfaceC3642hm0 interfaceC3642hm0) throws IOException {
        Iterator<Map.Entry<FieldSet$FieldDescriptorLite<Object>, Object>> itDescendingIterator;
        Map.Entry<FieldSet$FieldDescriptorLite<Object>, Object> next;
        writeUnknownInMessageTo(this.unknownFieldSchema, obj, interfaceC3642hm0);
        if (this.hasExtensions) {
            W extensions = this.extensionSchema.getExtensions(obj);
            if (extensions.isEmpty()) {
                itDescendingIterator = null;
                next = null;
            } else {
                itDescendingIterator = extensions.descendingIterator();
                next = itDescendingIterator.next();
            }
        } else {
            itDescendingIterator = null;
            next = null;
        }
        for (int length = this.buffer.length - 3; length >= 0; length -= 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(length);
            int iNumberAt = numberAt(length);
            while (next != null && this.extensionSchema.extensionNumber(next) > iNumberAt) {
                this.extensionSchema.serializeExtension(interfaceC3642hm0, next);
                next = itDescendingIterator.hasNext() ? itDescendingIterator.next() : null;
            }
            switch (type(iTypeAndOffsetAt)) {
                case 0:
                    if (isFieldPresent(obj, length)) {
                        ((A) interfaceC3642hm0).writeDouble(iNumberAt, doubleAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 1:
                    if (isFieldPresent(obj, length)) {
                        ((A) interfaceC3642hm0).writeFloat(iNumberAt, floatAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 2:
                    if (isFieldPresent(obj, length)) {
                        ((A) interfaceC3642hm0).writeInt64(iNumberAt, longAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 3:
                    if (isFieldPresent(obj, length)) {
                        ((A) interfaceC3642hm0).writeUInt64(iNumberAt, longAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 4:
                    if (isFieldPresent(obj, length)) {
                        ((A) interfaceC3642hm0).writeInt32(iNumberAt, intAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 5:
                    if (isFieldPresent(obj, length)) {
                        ((A) interfaceC3642hm0).writeFixed64(iNumberAt, longAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 6:
                    if (isFieldPresent(obj, length)) {
                        ((A) interfaceC3642hm0).writeFixed32(iNumberAt, intAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 7:
                    if (isFieldPresent(obj, length)) {
                        ((A) interfaceC3642hm0).writeBool(iNumberAt, booleanAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 8:
                    if (isFieldPresent(obj, length)) {
                        writeString(iNumberAt, U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0);
                    }
                    break;
                case 9:
                    if (isFieldPresent(obj, length)) {
                        ((A) interfaceC3642hm0).writeMessage(iNumberAt, U0.getObject(obj, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
                case 10:
                    if (isFieldPresent(obj, length)) {
                        ((A) interfaceC3642hm0).writeBytes(iNumberAt, (ByteString) U0.getObject(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 11:
                    if (isFieldPresent(obj, length)) {
                        ((A) interfaceC3642hm0).writeUInt32(iNumberAt, intAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 12:
                    if (isFieldPresent(obj, length)) {
                        ((A) interfaceC3642hm0).writeEnum(iNumberAt, intAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 13:
                    if (isFieldPresent(obj, length)) {
                        ((A) interfaceC3642hm0).writeSFixed32(iNumberAt, intAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 14:
                    if (isFieldPresent(obj, length)) {
                        ((A) interfaceC3642hm0).writeSFixed64(iNumberAt, longAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 15:
                    if (isFieldPresent(obj, length)) {
                        ((A) interfaceC3642hm0).writeSInt32(iNumberAt, intAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 16:
                    if (isFieldPresent(obj, length)) {
                        ((A) interfaceC3642hm0).writeSInt64(iNumberAt, longAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 17:
                    if (isFieldPresent(obj, length)) {
                        ((A) interfaceC3642hm0).writeGroup(iNumberAt, U0.getObject(obj, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
                case 18:
                    D0.writeDoubleList(numberAt(length), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, false);
                    break;
                case 19:
                    D0.writeFloatList(numberAt(length), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, false);
                    break;
                case 20:
                    D0.writeInt64List(numberAt(length), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, false);
                    break;
                case 21:
                    D0.writeUInt64List(numberAt(length), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, false);
                    break;
                case 22:
                    D0.writeInt32List(numberAt(length), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, false);
                    break;
                case 23:
                    D0.writeFixed64List(numberAt(length), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, false);
                    break;
                case 24:
                    D0.writeFixed32List(numberAt(length), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, false);
                    break;
                case 25:
                    D0.writeBoolList(numberAt(length), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, false);
                    break;
                case 26:
                    D0.writeStringList(numberAt(length), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0);
                    break;
                case 27:
                    D0.writeMessageList(numberAt(length), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, getMessageFieldSchema(length));
                    break;
                case 28:
                    D0.writeBytesList(numberAt(length), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0);
                    break;
                case 29:
                    D0.writeUInt32List(numberAt(length), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, false);
                    break;
                case 30:
                    D0.writeEnumList(numberAt(length), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, false);
                    break;
                case 31:
                    D0.writeSFixed32List(numberAt(length), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, false);
                    break;
                case 32:
                    D0.writeSFixed64List(numberAt(length), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, false);
                    break;
                case 33:
                    D0.writeSInt32List(numberAt(length), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, false);
                    break;
                case 34:
                    D0.writeSInt64List(numberAt(length), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, false);
                    break;
                case 35:
                    D0.writeDoubleList(numberAt(length), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, true);
                    break;
                case 36:
                    D0.writeFloatList(numberAt(length), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, true);
                    break;
                case 37:
                    D0.writeInt64List(numberAt(length), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, true);
                    break;
                case 38:
                    D0.writeUInt64List(numberAt(length), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, true);
                    break;
                case 39:
                    D0.writeInt32List(numberAt(length), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, true);
                    break;
                case 40:
                    D0.writeFixed64List(numberAt(length), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, true);
                    break;
                case 41:
                    D0.writeFixed32List(numberAt(length), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, true);
                    break;
                case 42:
                    D0.writeBoolList(numberAt(length), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, true);
                    break;
                case 43:
                    D0.writeUInt32List(numberAt(length), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, true);
                    break;
                case 44:
                    D0.writeEnumList(numberAt(length), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, true);
                    break;
                case 45:
                    D0.writeSFixed32List(numberAt(length), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, true);
                    break;
                case 46:
                    D0.writeSFixed64List(numberAt(length), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, true);
                    break;
                case 47:
                    D0.writeSInt32List(numberAt(length), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, true);
                    break;
                case 48:
                    D0.writeSInt64List(numberAt(length), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, true);
                    break;
                case 49:
                    D0.writeGroupList(numberAt(length), (List) U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0, getMessageFieldSchema(length));
                    break;
                case 50:
                    writeMapHelper(interfaceC3642hm0, iNumberAt, U0.getObject(obj, offset(iTypeAndOffsetAt)), length);
                    break;
                case 51:
                    if (isOneofPresent(obj, iNumberAt, length)) {
                        ((A) interfaceC3642hm0).writeDouble(iNumberAt, oneofDoubleAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 52:
                    if (isOneofPresent(obj, iNumberAt, length)) {
                        ((A) interfaceC3642hm0).writeFloat(iNumberAt, oneofFloatAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 53:
                    if (isOneofPresent(obj, iNumberAt, length)) {
                        ((A) interfaceC3642hm0).writeInt64(iNumberAt, oneofLongAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 54:
                    if (isOneofPresent(obj, iNumberAt, length)) {
                        ((A) interfaceC3642hm0).writeUInt64(iNumberAt, oneofLongAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 55:
                    if (isOneofPresent(obj, iNumberAt, length)) {
                        ((A) interfaceC3642hm0).writeInt32(iNumberAt, oneofIntAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case Input.Keys.PERIOD /* 56 */:
                    if (isOneofPresent(obj, iNumberAt, length)) {
                        ((A) interfaceC3642hm0).writeFixed64(iNumberAt, oneofLongAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case Input.Keys.ALT_LEFT /* 57 */:
                    if (isOneofPresent(obj, iNumberAt, length)) {
                        ((A) interfaceC3642hm0).writeFixed32(iNumberAt, oneofIntAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case Input.Keys.ALT_RIGHT /* 58 */:
                    if (isOneofPresent(obj, iNumberAt, length)) {
                        ((A) interfaceC3642hm0).writeBool(iNumberAt, oneofBooleanAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case Input.Keys.SHIFT_LEFT /* 59 */:
                    if (isOneofPresent(obj, iNumberAt, length)) {
                        writeString(iNumberAt, U0.getObject(obj, offset(iTypeAndOffsetAt)), interfaceC3642hm0);
                    }
                    break;
                case 60:
                    if (isOneofPresent(obj, iNumberAt, length)) {
                        ((A) interfaceC3642hm0).writeMessage(iNumberAt, U0.getObject(obj, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
                case Input.Keys.TAB /* 61 */:
                    if (isOneofPresent(obj, iNumberAt, length)) {
                        ((A) interfaceC3642hm0).writeBytes(iNumberAt, (ByteString) U0.getObject(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case Input.Keys.SPACE /* 62 */:
                    if (isOneofPresent(obj, iNumberAt, length)) {
                        ((A) interfaceC3642hm0).writeUInt32(iNumberAt, oneofIntAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 63:
                    if (isOneofPresent(obj, iNumberAt, length)) {
                        ((A) interfaceC3642hm0).writeEnum(iNumberAt, oneofIntAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 64:
                    if (isOneofPresent(obj, iNumberAt, length)) {
                        ((A) interfaceC3642hm0).writeSFixed32(iNumberAt, oneofIntAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 65:
                    if (isOneofPresent(obj, iNumberAt, length)) {
                        ((A) interfaceC3642hm0).writeSFixed64(iNumberAt, oneofLongAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 66:
                    if (isOneofPresent(obj, iNumberAt, length)) {
                        ((A) interfaceC3642hm0).writeSInt32(iNumberAt, oneofIntAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 67:
                    if (isOneofPresent(obj, iNumberAt, length)) {
                        ((A) interfaceC3642hm0).writeSInt64(iNumberAt, oneofLongAt(obj, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case Input.Keys.GRAVE /* 68 */:
                    if (isOneofPresent(obj, iNumberAt, length)) {
                        ((A) interfaceC3642hm0).writeGroup(iNumberAt, U0.getObject(obj, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
            }
        }
        while (next != null) {
            this.extensionSchema.serializeExtension(interfaceC3642hm0, next);
            next = itDescendingIterator.hasNext() ? itDescendingIterator.next() : null;
        }
    }

    private <K, V> void writeMapHelper(InterfaceC3642hm0 interfaceC3642hm0, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            A a2 = (A) interfaceC3642hm0;
            a2.writeMap(i, ((C3603hM) this.mapFieldSchema).forMapMetadata(getMapFieldDefaultEntry(i2)), ((C3603hM) this.mapFieldSchema).forMapData(obj));
        }
    }

    private void writeString(int i, Object obj, InterfaceC3642hm0 interfaceC3642hm0) throws IOException {
        if (obj instanceof String) {
            ((A) interfaceC3642hm0).writeString(i, (String) obj);
        } else {
            ((A) interfaceC3642hm0).writeBytes(i, (ByteString) obj);
        }
    }

    private <UT, UB> void writeUnknownInMessageTo(O0 o0, Object obj, InterfaceC3642hm0 interfaceC3642hm0) throws IOException {
        o0.writeTo(o0.getFromMessage(obj), interfaceC3642hm0);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3578h30
    public boolean equals(Object obj, Object obj2) {
        int length = this.buffer.length;
        for (int i = 0; i < length; i += 3) {
            if (!equals(obj, obj2, i)) {
                return false;
            }
        }
        if (!this.unknownFieldSchema.getFromMessage(obj).equals(this.unknownFieldSchema.getFromMessage(obj2))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(obj).equals(this.extensionSchema.getExtensions(obj2));
        }
        return true;
    }

    public int getSchemaSize() {
        return this.buffer.length * 3;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3578h30
    public int getSerializedSize(Object obj) {
        return this.proto3 ? getSerializedSizeProto3(obj) : getSerializedSizeProto2(obj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3578h30
    public int hashCode(Object obj) {
        int i;
        int iHashLong;
        int i2;
        int iOneofIntAt;
        int length = this.buffer.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i4);
            int iNumberAt = numberAt(i4);
            long jOffset = offset(iTypeAndOffsetAt);
            int iHashCode = 37;
            switch (type(iTypeAndOffsetAt)) {
                case 0:
                    i = i3 * 53;
                    iHashLong = Internal.hashLong(Double.doubleToLongBits(U0.getDouble(obj, jOffset)));
                    i3 = iHashLong + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iHashLong = Float.floatToIntBits(U0.getFloat(obj, jOffset));
                    i3 = iHashLong + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iHashLong = Internal.hashLong(U0.getLong(obj, jOffset));
                    i3 = iHashLong + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iHashLong = Internal.hashLong(U0.getLong(obj, jOffset));
                    i3 = iHashLong + i;
                    break;
                case 4:
                    i = i3 * 53;
                    iHashLong = U0.getInt(obj, jOffset);
                    i3 = iHashLong + i;
                    break;
                case 5:
                    i = i3 * 53;
                    iHashLong = Internal.hashLong(U0.getLong(obj, jOffset));
                    i3 = iHashLong + i;
                    break;
                case 6:
                    i = i3 * 53;
                    iHashLong = U0.getInt(obj, jOffset);
                    i3 = iHashLong + i;
                    break;
                case 7:
                    i = i3 * 53;
                    iHashLong = Internal.hashBoolean(U0.getBoolean(obj, jOffset));
                    i3 = iHashLong + i;
                    break;
                case 8:
                    i = i3 * 53;
                    iHashLong = ((String) U0.getObject(obj, jOffset)).hashCode();
                    i3 = iHashLong + i;
                    break;
                case 9:
                    Object object = U0.getObject(obj, jOffset);
                    if (object != null) {
                        iHashCode = object.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iHashLong = U0.getObject(obj, jOffset).hashCode();
                    i3 = iHashLong + i;
                    break;
                case 11:
                    i = i3 * 53;
                    iHashLong = U0.getInt(obj, jOffset);
                    i3 = iHashLong + i;
                    break;
                case 12:
                    i = i3 * 53;
                    iHashLong = U0.getInt(obj, jOffset);
                    i3 = iHashLong + i;
                    break;
                case 13:
                    i = i3 * 53;
                    iHashLong = U0.getInt(obj, jOffset);
                    i3 = iHashLong + i;
                    break;
                case 14:
                    i = i3 * 53;
                    iHashLong = Internal.hashLong(U0.getLong(obj, jOffset));
                    i3 = iHashLong + i;
                    break;
                case 15:
                    i = i3 * 53;
                    iHashLong = U0.getInt(obj, jOffset);
                    i3 = iHashLong + i;
                    break;
                case 16:
                    i = i3 * 53;
                    iHashLong = Internal.hashLong(U0.getLong(obj, jOffset));
                    i3 = iHashLong + i;
                    break;
                case 17:
                    Object object2 = U0.getObject(obj, jOffset);
                    if (object2 != null) {
                        iHashCode = object2.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i3 * 53;
                    iHashLong = U0.getObject(obj, jOffset).hashCode();
                    i3 = iHashLong + i;
                    break;
                case 50:
                    i = i3 * 53;
                    iHashLong = U0.getObject(obj, jOffset).hashCode();
                    i3 = iHashLong + i;
                    break;
                case 51:
                    if (isOneofPresent(obj, iNumberAt, i4)) {
                        i = i3 * 53;
                        iHashLong = Internal.hashLong(Double.doubleToLongBits(oneofDoubleAt(obj, jOffset)));
                        i3 = iHashLong + i;
                    }
                    break;
                case 52:
                    if (isOneofPresent(obj, iNumberAt, i4)) {
                        i = i3 * 53;
                        iHashLong = Float.floatToIntBits(oneofFloatAt(obj, jOffset));
                        i3 = iHashLong + i;
                    }
                    break;
                case 53:
                    if (isOneofPresent(obj, iNumberAt, i4)) {
                        i = i3 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(obj, jOffset));
                        i3 = iHashLong + i;
                    }
                    break;
                case 54:
                    if (isOneofPresent(obj, iNumberAt, i4)) {
                        i = i3 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(obj, jOffset));
                        i3 = iHashLong + i;
                    }
                    break;
                case 55:
                    if (isOneofPresent(obj, iNumberAt, i4)) {
                        i2 = i3 * 53;
                        iOneofIntAt = oneofIntAt(obj, jOffset);
                        i3 = i2 + iOneofIntAt;
                    }
                    break;
                case Input.Keys.PERIOD /* 56 */:
                    if (isOneofPresent(obj, iNumberAt, i4)) {
                        i = i3 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(obj, jOffset));
                        i3 = iHashLong + i;
                    }
                    break;
                case Input.Keys.ALT_LEFT /* 57 */:
                    if (isOneofPresent(obj, iNumberAt, i4)) {
                        i2 = i3 * 53;
                        iOneofIntAt = oneofIntAt(obj, jOffset);
                        i3 = i2 + iOneofIntAt;
                    }
                    break;
                case Input.Keys.ALT_RIGHT /* 58 */:
                    if (isOneofPresent(obj, iNumberAt, i4)) {
                        i = i3 * 53;
                        iHashLong = Internal.hashBoolean(oneofBooleanAt(obj, jOffset));
                        i3 = iHashLong + i;
                    }
                    break;
                case Input.Keys.SHIFT_LEFT /* 59 */:
                    if (isOneofPresent(obj, iNumberAt, i4)) {
                        i = i3 * 53;
                        iHashLong = ((String) U0.getObject(obj, jOffset)).hashCode();
                        i3 = iHashLong + i;
                    }
                    break;
                case 60:
                    if (isOneofPresent(obj, iNumberAt, i4)) {
                        i = i3 * 53;
                        iHashLong = U0.getObject(obj, jOffset).hashCode();
                        i3 = iHashLong + i;
                    }
                    break;
                case Input.Keys.TAB /* 61 */:
                    if (isOneofPresent(obj, iNumberAt, i4)) {
                        i = i3 * 53;
                        iHashLong = U0.getObject(obj, jOffset).hashCode();
                        i3 = iHashLong + i;
                    }
                    break;
                case Input.Keys.SPACE /* 62 */:
                    if (isOneofPresent(obj, iNumberAt, i4)) {
                        i2 = i3 * 53;
                        iOneofIntAt = oneofIntAt(obj, jOffset);
                        i3 = i2 + iOneofIntAt;
                    }
                    break;
                case 63:
                    if (isOneofPresent(obj, iNumberAt, i4)) {
                        i2 = i3 * 53;
                        iOneofIntAt = oneofIntAt(obj, jOffset);
                        i3 = i2 + iOneofIntAt;
                    }
                    break;
                case 64:
                    if (isOneofPresent(obj, iNumberAt, i4)) {
                        i2 = i3 * 53;
                        iOneofIntAt = oneofIntAt(obj, jOffset);
                        i3 = i2 + iOneofIntAt;
                    }
                    break;
                case 65:
                    if (isOneofPresent(obj, iNumberAt, i4)) {
                        i = i3 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(obj, jOffset));
                        i3 = iHashLong + i;
                    }
                    break;
                case 66:
                    if (isOneofPresent(obj, iNumberAt, i4)) {
                        i2 = i3 * 53;
                        iOneofIntAt = oneofIntAt(obj, jOffset);
                        i3 = i2 + iOneofIntAt;
                    }
                    break;
                case 67:
                    if (isOneofPresent(obj, iNumberAt, i4)) {
                        i = i3 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(obj, jOffset));
                        i3 = iHashLong + i;
                    }
                    break;
                case Input.Keys.GRAVE /* 68 */:
                    if (isOneofPresent(obj, iNumberAt, i4)) {
                        i = i3 * 53;
                        iHashLong = U0.getObject(obj, jOffset).hashCode();
                        i3 = iHashLong + i;
                    }
                    break;
            }
        }
        int iHashCode2 = this.unknownFieldSchema.getFromMessage(obj).hashCode() + (i3 * 53);
        return this.hasExtensions ? (iHashCode2 * 53) + this.extensionSchema.getExtensions(obj).hashCode() : iHashCode2;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac A[SYNTHETIC] */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3578h30
    public final boolean isInitialized(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.checkInitializedCount) {
            int i6 = this.intArray[i5];
            int iNumberAt = numberAt(i6);
            int iTypeAndOffsetAt = typeAndOffsetAt(i6);
            int i7 = this.buffer[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i3) {
                if (i8 != 1048575) {
                    i4 = UNSAFE.getInt(obj, i8);
                }
                i2 = i4;
                i = i8;
            } else {
                i = i3;
                i2 = i4;
            }
            if (isRequired(iTypeAndOffsetAt) && !isFieldPresent(obj, i6, i, i2, i9)) {
                return false;
            }
            int iType = type(iTypeAndOffsetAt);
            if (iType == 9 || iType == 17) {
                if (isFieldPresent(obj, i6, i, i2, i9) && !isInitialized(obj, iTypeAndOffsetAt, getMessageFieldSchema(i6))) {
                    return false;
                }
            } else if (iType == 27) {
                if (!isListInitialized(obj, iTypeAndOffsetAt, i6)) {
                    return false;
                }
            } else if (iType == 60 || iType == 68) {
                if (isOneofPresent(obj, iNumberAt, i6) && !isInitialized(obj, iTypeAndOffsetAt, getMessageFieldSchema(i6))) {
                    return false;
                }
            } else if (iType != 49) {
                if (iType == 50 && !isMapInitialized(obj, iTypeAndOffsetAt, i6)) {
                    return false;
                }
            } else if (!isListInitialized(obj, iTypeAndOffsetAt, i6)) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        return !this.hasExtensions || this.extensionSchema.getExtensions(obj).isInitialized();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x005e A[SYNTHETIC] */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3578h30
    public void makeImmutable(Object obj) {
        if (isMutable(obj)) {
            if (obj instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
                generatedMessageLite.clearMemoizedSerializedSize();
                generatedMessageLite.clearMemoizedHashCode();
                generatedMessageLite.markImmutable();
            }
            int length = this.buffer.length;
            for (int i = 0; i < length; i += 3) {
                int iTypeAndOffsetAt = typeAndOffsetAt(i);
                long jOffset = offset(iTypeAndOffsetAt);
                int iType = type(iTypeAndOffsetAt);
                if (iType != 9) {
                    switch (iType) {
                        case 17:
                            if (isFieldPresent(obj, i)) {
                                getMessageFieldSchema(i).makeImmutable(UNSAFE.getObject(obj, jOffset));
                            }
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.listFieldSchema.makeImmutableListAt(obj, jOffset);
                            break;
                        case 50:
                            Unsafe unsafe = UNSAFE;
                            Object object = unsafe.getObject(obj, jOffset);
                            if (object != null) {
                                unsafe.putObject(obj, jOffset, ((C3603hM) this.mapFieldSchema).toImmutable(object));
                            }
                            break;
                    }
                } else if (isFieldPresent(obj, i)) {
                    getMessageFieldSchema(i).makeImmutable(UNSAFE.getObject(obj, jOffset));
                }
            }
            this.unknownFieldSchema.makeImmutable(obj);
            if (this.hasExtensions) {
                this.extensionSchema.makeImmutable(obj);
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3578h30
    public void mergeFrom(Object obj, Object obj2) {
        checkMutable(obj);
        obj2.getClass();
        for (int i = 0; i < this.buffer.length; i += 3) {
            mergeSingleField(obj, obj2, i);
        }
        D0.mergeUnknownFields(this.unknownFieldSchema, obj, obj2);
        if (this.hasExtensions) {
            D0.mergeExtensions(this.extensionSchema, obj, obj2);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3578h30
    public Object newInstance() {
        return ((ER) this.newInstanceSchema).newInstance(this.defaultInstance);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 11481. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public int parseProto2Message(java.lang.Object r27, byte[] r28, int r29, int r30, int r31, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.R5 r32) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1148
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C2140s0.parseProto2Message(java.lang.Object, byte[], int, int, int, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.R5):int");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3578h30
    public void writeTo(Object obj, InterfaceC3642hm0 interfaceC3642hm0) throws IOException {
        A a2 = (A) interfaceC3642hm0;
        if (a2.fieldOrder() == Writer$FieldOrder.DESCENDING) {
            writeFieldsInDescendingOrder(obj, a2);
        } else if (this.proto3) {
            writeFieldsInAscendingOrderProto3(obj, a2);
        } else {
            writeFieldsInAscendingOrderProto2(obj, a2);
        }
    }

    private boolean isFieldPresent(Object obj, int i) {
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i);
        long j = 1048575 & iPresenceMaskAndOffsetAt;
        if (j != 1048575) {
            return (U0.getInt(obj, j) & (1 << (iPresenceMaskAndOffsetAt >>> 20))) != 0;
        }
        int iTypeAndOffsetAt = typeAndOffsetAt(i);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                return Double.doubleToRawLongBits(U0.getDouble(obj, jOffset)) != 0;
            case 1:
                return Float.floatToRawIntBits(U0.getFloat(obj, jOffset)) != 0;
            case 2:
                return U0.getLong(obj, jOffset) != 0;
            case 3:
                return U0.getLong(obj, jOffset) != 0;
            case 4:
                return U0.getInt(obj, jOffset) != 0;
            case 5:
                return U0.getLong(obj, jOffset) != 0;
            case 6:
                return U0.getInt(obj, jOffset) != 0;
            case 7:
                return U0.getBoolean(obj, jOffset);
            case 8:
                Object object = U0.getObject(obj, jOffset);
                if (object instanceof String) {
                    return !((String) object).isEmpty();
                }
                if (object instanceof ByteString) {
                    return !ByteString.EMPTY.equals(object);
                }
                throw new IllegalArgumentException();
            case 9:
                return U0.getObject(obj, jOffset) != null;
            case 10:
                return !ByteString.EMPTY.equals(U0.getObject(obj, jOffset));
            case 11:
                return U0.getInt(obj, jOffset) != 0;
            case 12:
                return U0.getInt(obj, jOffset) != 0;
            case 13:
                return U0.getInt(obj, jOffset) != 0;
            case 14:
                return U0.getLong(obj, jOffset) != 0;
            case 15:
                return U0.getInt(obj, jOffset) != 0;
            case 16:
                return U0.getLong(obj, jOffset) != 0;
            case 17:
                return U0.getObject(obj, jOffset) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private int positionForFieldNumber(int i, int i2) {
        if (i < this.minFieldNumber || i > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i, i2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3578h30
    public void mergeFrom(Object obj, AX ax, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
        extensionRegistryLite.getClass();
        checkMutable(obj);
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, obj, ax, extensionRegistryLite);
    }

    private boolean equals(Object obj, Object obj2, int i) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                return arePresentForEquals(obj, obj2, i) && Double.doubleToLongBits(U0.getDouble(obj, jOffset)) == Double.doubleToLongBits(U0.getDouble(obj2, jOffset));
            case 1:
                return arePresentForEquals(obj, obj2, i) && Float.floatToIntBits(U0.getFloat(obj, jOffset)) == Float.floatToIntBits(U0.getFloat(obj2, jOffset));
            case 2:
                return arePresentForEquals(obj, obj2, i) && U0.getLong(obj, jOffset) == U0.getLong(obj2, jOffset);
            case 3:
                return arePresentForEquals(obj, obj2, i) && U0.getLong(obj, jOffset) == U0.getLong(obj2, jOffset);
            case 4:
                return arePresentForEquals(obj, obj2, i) && U0.getInt(obj, jOffset) == U0.getInt(obj2, jOffset);
            case 5:
                return arePresentForEquals(obj, obj2, i) && U0.getLong(obj, jOffset) == U0.getLong(obj2, jOffset);
            case 6:
                return arePresentForEquals(obj, obj2, i) && U0.getInt(obj, jOffset) == U0.getInt(obj2, jOffset);
            case 7:
                return arePresentForEquals(obj, obj2, i) && U0.getBoolean(obj, jOffset) == U0.getBoolean(obj2, jOffset);
            case 8:
                return arePresentForEquals(obj, obj2, i) && D0.safeEquals(U0.getObject(obj, jOffset), U0.getObject(obj2, jOffset));
            case 9:
                return arePresentForEquals(obj, obj2, i) && D0.safeEquals(U0.getObject(obj, jOffset), U0.getObject(obj2, jOffset));
            case 10:
                return arePresentForEquals(obj, obj2, i) && D0.safeEquals(U0.getObject(obj, jOffset), U0.getObject(obj2, jOffset));
            case 11:
                return arePresentForEquals(obj, obj2, i) && U0.getInt(obj, jOffset) == U0.getInt(obj2, jOffset);
            case 12:
                return arePresentForEquals(obj, obj2, i) && U0.getInt(obj, jOffset) == U0.getInt(obj2, jOffset);
            case 13:
                return arePresentForEquals(obj, obj2, i) && U0.getInt(obj, jOffset) == U0.getInt(obj2, jOffset);
            case 14:
                return arePresentForEquals(obj, obj2, i) && U0.getLong(obj, jOffset) == U0.getLong(obj2, jOffset);
            case 15:
                return arePresentForEquals(obj, obj2, i) && U0.getInt(obj, jOffset) == U0.getInt(obj2, jOffset);
            case 16:
                return arePresentForEquals(obj, obj2, i) && U0.getLong(obj, jOffset) == U0.getLong(obj2, jOffset);
            case 17:
                return arePresentForEquals(obj, obj2, i) && D0.safeEquals(U0.getObject(obj, jOffset), U0.getObject(obj2, jOffset));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return D0.safeEquals(U0.getObject(obj, jOffset), U0.getObject(obj2, jOffset));
            case 50:
                return D0.safeEquals(U0.getObject(obj, jOffset), U0.getObject(obj2, jOffset));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case Input.Keys.PERIOD /* 56 */:
            case Input.Keys.ALT_LEFT /* 57 */:
            case Input.Keys.ALT_RIGHT /* 58 */:
            case Input.Keys.SHIFT_LEFT /* 59 */:
            case 60:
            case Input.Keys.TAB /* 61 */:
            case Input.Keys.SPACE /* 62 */:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case Input.Keys.GRAVE /* 68 */:
                return isOneofCaseEqual(obj, obj2, i) && D0.safeEquals(U0.getObject(obj, jOffset), U0.getObject(obj2, jOffset));
            default:
                return true;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3578h30
    public void mergeFrom(Object obj, byte[] bArr, int i, int i2, R5 r5) throws IOException {
        if (this.proto3) {
            parseProto3Message(obj, bArr, i, i2, r5);
        } else {
            parseProto2Message(obj, bArr, i, i2, 0, r5);
        }
    }

    private static boolean isInitialized(Object obj, int i, InterfaceC3578h30 interfaceC3578h30) {
        return interfaceC3578h30.isInitialized(U0.getObject(obj, offset(i)));
    }
}
