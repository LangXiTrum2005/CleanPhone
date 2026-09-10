package com.google.protobuf;

import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: MessageSchema.java */
/* JADX INFO: loaded from: classes3.dex */
public final class cuirassed<T> implements seminary<T> {
    private static final int CHECK_INITIALIZED_BIT = 1024;
    private static final int ENFORCE_UTF8_MASK = 536870912;
    private static final int FIELD_TYPE_MASK = 267386880;
    private static final int HAS_HAS_BIT = 4096;
    private static final int INTS_PER_FIELD = 3;
    private static final int LEGACY_ENUM_IS_CLOSED_BIT = 2048;
    private static final int LEGACY_ENUM_IS_CLOSED_MASK = Integer.MIN_VALUE;
    private static final int NO_PRESENCE_SENTINEL = 1048575;
    private static final int OFFSET_BITS = 20;
    private static final int OFFSET_MASK = 1048575;
    static final int ONEOF_TYPE_OFFSET = 51;
    private static final int REQUIRED_BIT = 256;
    private static final int REQUIRED_MASK = 268435456;
    private static final int UTF8_CHECK_BIT = 512;
    private final int[] buffer;
    private final int checkInitializedCount;
    private final MessageLite defaultInstance;
    private final cutely<?> extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final polloi listFieldSchema;
    private final boolean lite;
    private final adultoid mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final trm newInstanceSchema;
    private final Object[] objects;
    private final int repeatedFieldOffsetStart;
    private final ProtoSyntax syntax;
    private final starveling<?, ?> unknownFieldSchema;
    private final boolean useCachedSizeField;
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Unsafe UNSAFE = walach.getUnsafe();

    /* JADX INFO: compiled from: MessageSchema.java */
    public static /* synthetic */ class attabal {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private cuirassed(int[] iArr, Object[] objArr, int i, int i2, MessageLite messageLite, ProtoSyntax protoSyntax, boolean z, int[] iArr2, int i3, int i4, trm trmVar, polloi polloiVar, starveling<?, ?> starvelingVar, cutely<?> cutelyVar, adultoid adultoidVar) {
        this.buffer = iArr;
        this.objects = objArr;
        this.minFieldNumber = i;
        this.maxFieldNumber = i2;
        this.lite = messageLite instanceof GeneratedMessageLite;
        this.syntax = protoSyntax;
        this.hasExtensions = cutelyVar != null && cutelyVar.hasExtensions(messageLite);
        this.useCachedSizeField = z;
        this.intArray = iArr2;
        this.checkInitializedCount = i3;
        this.repeatedFieldOffsetStart = i4;
        this.newInstanceSchema = trmVar;
        this.listFieldSchema = polloiVar;
        this.unknownFieldSchema = starvelingVar;
        this.extensionSchema = cutelyVar;
        this.defaultInstance = messageLite;
        this.mapFieldSchema = adultoidVar;
    }

    private boolean arePresentForEquals(T t, T t2, int i) {
        return isFieldPresent(t, i) == isFieldPresent(t2, i);
    }

    private static <T> boolean booleanAt(T t, long j) {
        return walach.getBoolean(t, j);
    }

    private static void checkMutable(Object obj) {
        if (isMutable(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <K, V> int decodeMapEntry(byte[] bArr, int i, int i2, MapEntryLite.saneness<K, V> sanenessVar, Map<K, V> map, dern.saneness sanenessVar2) throws IOException {
        int iDecodeVarint32 = dern.decodeVarint32(bArr, i, sanenessVar2);
        int i3 = sanenessVar2.int1;
        if (i3 < 0 || i3 > i2 - iDecodeVarint32) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i4 = iDecodeVarint32 + i3;
        Object obj = sanenessVar.defaultKey;
        Object obj2 = sanenessVar.defaultValue;
        while (iDecodeVarint32 < i4) {
            int iDecodeVarint33 = iDecodeVarint32 + 1;
            int i5 = bArr[iDecodeVarint32];
            if (i5 < 0) {
                iDecodeVarint33 = dern.decodeVarint32(i5, bArr, iDecodeVarint33, sanenessVar2);
                i5 = sanenessVar2.int1;
            }
            int i6 = iDecodeVarint33;
            int i7 = i5 >>> 3;
            int i8 = i5 & 7;
            if (i7 != 1) {
                if (i7 == 2 && i8 == sanenessVar.valueType.getWireType()) {
                    iDecodeVarint32 = decodeMapEntryValue(bArr, i6, i2, sanenessVar.valueType, sanenessVar.defaultValue.getClass(), sanenessVar2);
                    obj2 = sanenessVar2.object1;
                } else {
                    iDecodeVarint32 = dern.skipField(i5, bArr, i6, i2, sanenessVar2);
                }
            } else if (i8 == sanenessVar.keyType.getWireType()) {
                iDecodeVarint32 = decodeMapEntryValue(bArr, i6, i2, sanenessVar.keyType, null, sanenessVar2);
                obj = sanenessVar2.object1;
            } else {
                iDecodeVarint32 = dern.skipField(i5, bArr, i6, i2, sanenessVar2);
            }
        }
        if (iDecodeVarint32 != i4) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        map.put(obj, obj2);
        return i4;
    }

    private int decodeMapEntryValue(byte[] bArr, int i, int i2, WireFormat.FieldType fieldType, Class<?> cls, dern.saneness sanenessVar) throws IOException {
        switch (attabal.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                int iDecodeVarint64 = dern.decodeVarint64(bArr, i, sanenessVar);
                sanenessVar.object1 = Boolean.valueOf(sanenessVar.long1 != 0);
                return iDecodeVarint64;
            case 2:
                return dern.decodeBytes(bArr, i, sanenessVar);
            case 3:
                sanenessVar.object1 = Double.valueOf(dern.decodeDouble(bArr, i));
                return i + 8;
            case 4:
            case 5:
                sanenessVar.object1 = Integer.valueOf(dern.decodeFixed32(bArr, i));
                return i + 4;
            case 6:
            case 7:
                sanenessVar.object1 = Long.valueOf(dern.decodeFixed64(bArr, i));
                return i + 8;
            case 8:
                sanenessVar.object1 = Float.valueOf(dern.decodeFloat(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int iDecodeVarint32 = dern.decodeVarint32(bArr, i, sanenessVar);
                sanenessVar.object1 = Integer.valueOf(sanenessVar.int1);
                return iDecodeVarint32;
            case 12:
            case 13:
                int iDecodeVarint65 = dern.decodeVarint64(bArr, i, sanenessVar);
                sanenessVar.object1 = Long.valueOf(sanenessVar.long1);
                return iDecodeVarint65;
            case 14:
                return dern.decodeMessageField(supplicat.getInstance().schemaFor((Class) cls), bArr, i, i2, sanenessVar);
            case 15:
                int iDecodeVarint33 = dern.decodeVarint32(bArr, i, sanenessVar);
                sanenessVar.object1 = Integer.valueOf(CodedInputStream.decodeZigZag32(sanenessVar.int1));
                return iDecodeVarint33;
            case 16:
                int iDecodeVarint66 = dern.decodeVarint64(bArr, i, sanenessVar);
                sanenessVar.object1 = Long.valueOf(CodedInputStream.decodeZigZag64(sanenessVar.long1));
                return iDecodeVarint66;
            case 17:
                return dern.decodeStringRequireUtf8(bArr, i, sanenessVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static <T> double doubleAt(T t, long j) {
        return walach.getDouble(t, j);
    }

    private <UT, UB> UB filterMapUnknownEnumValues(Object obj, int i, UB ub, starveling<UT, UB> starvelingVar, Object obj2) {
        Internal.EnumVerifier enumFieldVerifier;
        int iNumberAt = numberAt(i);
        Object object = walach.getObject(obj, offset(typeAndOffsetAt(i)));
        return (object == null || (enumFieldVerifier = getEnumFieldVerifier(i)) == null) ? ub : (UB) filterUnknownEnumMap(i, iNumberAt, this.mapFieldSchema.forMutableMapData(object), enumFieldVerifier, ub, starvelingVar, obj2);
    }

    private <K, V, UT, UB> UB filterUnknownEnumMap(int i, int i2, Map<K, V> map, Internal.EnumVerifier enumVerifier, UB ub, starveling<UT, UB> starvelingVar, Object obj) {
        MapEntryLite.saneness<?, ?> sanenessVarForMapMetadata = this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!enumVerifier.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = starvelingVar.getBuilderFromMessage(obj);
                }
                ByteString.beachfront beachfrontVarNewCodedBuilder = ByteString.newCodedBuilder(MapEntryLite.computeSerializedSize(sanenessVarForMapMetadata, next.getKey(), next.getValue()));
                try {
                    MapEntryLite.writeTo(beachfrontVarNewCodedBuilder.getCodedOutput(), sanenessVarForMapMetadata, next.getKey(), next.getValue());
                    starvelingVar.addLengthDelimited(ub, i2, beachfrontVarNewCodedBuilder.build());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    private static <T> float floatAt(T t, long j) {
        return walach.getFloat(t, j);
    }

    private Internal.EnumVerifier getEnumFieldVerifier(int i) {
        return (Internal.EnumVerifier) this.objects[((i / 3) * 2) + 1];
    }

    private Object getMapFieldDefaultEntry(int i) {
        return this.objects[(i / 3) * 2];
    }

    private seminary getMessageFieldSchema(int i) {
        int i2 = (i / 3) * 2;
        seminary seminaryVar = (seminary) this.objects[i2];
        if (seminaryVar != null) {
            return seminaryVar;
        }
        seminary<T> seminaryVarSchemaFor = supplicat.getInstance().schemaFor((Class) this.objects[i2 + 1]);
        this.objects[i2] = seminaryVarSchemaFor;
        return seminaryVarSchemaFor;
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

    private <UT, UB> int getUnknownFieldsSerializedSize(starveling<UT, UB> starvelingVar, T t) {
        return starvelingVar.getSerializedSize(starvelingVar.getFromMessage(t));
    }

    private static <T> int intAt(T t, long j) {
        return walach.getInt(t, j);
    }

    private static boolean isEnforceUtf8(int i) {
        return (i & ENFORCE_UTF8_MASK) != 0;
    }

    private boolean isFieldPresent(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return isFieldPresent(t, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean isLegacyEnumIsClosed(int i) {
        return (i & Integer.MIN_VALUE) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean isListInitialized(Object obj, int i, int i2) {
        List list = (List) walach.getObject(obj, offset(i));
        if (list.isEmpty()) {
            return true;
        }
        seminary messageFieldSchema = getMessageFieldSchema(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!messageFieldSchema.isInitialized(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.protobuf.seminary] */
    private boolean isMapInitialized(T t, int i, int i2) {
        Map<?, ?> mapForMapData = this.mapFieldSchema.forMapData(walach.getObject(t, offset(i)));
        if (mapForMapData.isEmpty()) {
            return true;
        }
        if (this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i2)).valueType.getJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        ?? SchemaFor = 0;
        for (Object obj : mapForMapData.values()) {
            if (SchemaFor == 0) {
                SchemaFor = SchemaFor;
                SchemaFor = supplicat.getInstance().schemaFor((Class) obj.getClass());
            }
            SchemaFor = SchemaFor;
            if (!SchemaFor.isInitialized(obj)) {
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

    private boolean isOneofCaseEqual(T t, T t2, int i) {
        long jPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i) & 1048575;
        return walach.getInt(t, jPresenceMaskAndOffsetAt) == walach.getInt(t2, jPresenceMaskAndOffsetAt);
    }

    private boolean isOneofPresent(T t, int i, int i2) {
        return walach.getInt(t, (long) (presenceMaskAndOffsetAt(i2) & 1048575)) == i;
    }

    private static boolean isRequired(int i) {
        return (i & REQUIRED_MASK) != 0;
    }

    private static <T> long longAt(T t, long j) {
        return walach.getLong(t, j);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 20401. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    private <UT, UB, ET extends com.google.protobuf.FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(com.google.protobuf.starveling<UT, UB> r18, com.google.protobuf.cutely<ET> r19, T r20, com.google.protobuf.polder r21, com.google.protobuf.ExtensionRegistryLite r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 2040
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.cuirassed.mergeFromHelper(com.google.protobuf.starveling, com.google.protobuf.cutely, java.lang.Object, com.google.protobuf.polder, com.google.protobuf.ExtensionRegistryLite):void");
    }

    private final <K, V> void mergeMap(Object obj, int i, Object obj2, ExtensionRegistryLite extensionRegistryLite, polder polderVar) throws IOException {
        long jOffset = offset(typeAndOffsetAt(i));
        Object object = walach.getObject(obj, jOffset);
        if (object == null) {
            object = this.mapFieldSchema.newMapField(obj2);
            walach.putObject(obj, jOffset, object);
        } else if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(obj2);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            walach.putObject(obj, jOffset, objNewMapField);
            object = objNewMapField;
        }
        polderVar.readMap(this.mapFieldSchema.forMutableMapData(object), this.mapFieldSchema.forMapMetadata(obj2), extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeMessage(T t, T t2, int i) {
        if (isFieldPresent(t2, i)) {
            long jOffset = offset(typeAndOffsetAt(i));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(t2, jOffset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(i) + " is present but null: " + t2);
            }
            seminary messageFieldSchema = getMessageFieldSchema(i);
            if (!isFieldPresent(t, i)) {
                if (isMutable(object)) {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t, jOffset, objNewInstance);
                } else {
                    unsafe.putObject(t, jOffset, object);
                }
                setFieldPresent(t, i);
                return;
            }
            Object object2 = unsafe.getObject(t, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeOneofMessage(T t, T t2, int i) {
        int iNumberAt = numberAt(i);
        if (isOneofPresent(t2, iNumberAt, i)) {
            long jOffset = offset(typeAndOffsetAt(i));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(t2, jOffset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(i) + " is present but null: " + t2);
            }
            seminary messageFieldSchema = getMessageFieldSchema(i);
            if (!isOneofPresent(t, iNumberAt, i)) {
                if (isMutable(object)) {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t, jOffset, objNewInstance);
                } else {
                    unsafe.putObject(t, jOffset, object);
                }
                setOneofPresent(t, iNumberAt, i);
                return;
            }
            Object object2 = unsafe.getObject(t, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    private void mergeSingleField(T t, T t2, int i) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i);
        long jOffset = offset(iTypeAndOffsetAt);
        int iNumberAt = numberAt(i);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                if (isFieldPresent(t2, i)) {
                    walach.putDouble(t, jOffset, walach.getDouble(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 1:
                if (isFieldPresent(t2, i)) {
                    walach.putFloat(t, jOffset, walach.getFloat(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 2:
                if (isFieldPresent(t2, i)) {
                    walach.putLong(t, jOffset, walach.getLong(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 3:
                if (isFieldPresent(t2, i)) {
                    walach.putLong(t, jOffset, walach.getLong(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 4:
                if (isFieldPresent(t2, i)) {
                    walach.putInt(t, jOffset, walach.getInt(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 5:
                if (isFieldPresent(t2, i)) {
                    walach.putLong(t, jOffset, walach.getLong(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 6:
                if (isFieldPresent(t2, i)) {
                    walach.putInt(t, jOffset, walach.getInt(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 7:
                if (isFieldPresent(t2, i)) {
                    walach.putBoolean(t, jOffset, walach.getBoolean(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 8:
                if (isFieldPresent(t2, i)) {
                    walach.putObject(t, jOffset, walach.getObject(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 9:
                mergeMessage(t, t2, i);
                break;
            case 10:
                if (isFieldPresent(t2, i)) {
                    walach.putObject(t, jOffset, walach.getObject(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 11:
                if (isFieldPresent(t2, i)) {
                    walach.putInt(t, jOffset, walach.getInt(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 12:
                if (isFieldPresent(t2, i)) {
                    walach.putInt(t, jOffset, walach.getInt(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 13:
                if (isFieldPresent(t2, i)) {
                    walach.putInt(t, jOffset, walach.getInt(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 14:
                if (isFieldPresent(t2, i)) {
                    walach.putLong(t, jOffset, walach.getLong(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 15:
                if (isFieldPresent(t2, i)) {
                    walach.putInt(t, jOffset, walach.getInt(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 16:
                if (isFieldPresent(t2, i)) {
                    walach.putLong(t, jOffset, walach.getLong(t2, jOffset));
                    setFieldPresent(t, i);
                }
                break;
            case 17:
                mergeMessage(t, t2, i);
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
                this.listFieldSchema.mergeListsAt(t, t2, jOffset);
                break;
            case 50:
                saran.mergeMap(this.mapFieldSchema, t, t2, jOffset);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (isOneofPresent(t2, iNumberAt, i)) {
                    walach.putObject(t, jOffset, walach.getObject(t2, jOffset));
                    setOneofPresent(t, iNumberAt, i);
                }
                break;
            case 60:
                mergeOneofMessage(t, t2, i);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (isOneofPresent(t2, iNumberAt, i)) {
                    walach.putObject(t, jOffset, walach.getObject(t2, jOffset));
                    setOneofPresent(t, iNumberAt, i);
                }
                break;
            case 68:
                mergeOneofMessage(t, t2, i);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableMessageFieldForMerge(T t, int i) {
        seminary messageFieldSchema = getMessageFieldSchema(i);
        long jOffset = offset(typeAndOffsetAt(i));
        if (!isFieldPresent(t, i)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(t, jOffset);
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableOneofMessageFieldForMerge(T t, int i, int i2) {
        seminary messageFieldSchema = getMessageFieldSchema(i2);
        if (!isOneofPresent(t, i, i2)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(t, offset(typeAndOffsetAt(i2)));
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    public static <T> cuirassed<T> newSchema(Class<T> cls, rotuma rotumaVar, trm trmVar, polloi polloiVar, starveling<?, ?> starvelingVar, cutely<?> cutelyVar, adultoid adultoidVar) {
        return rotumaVar instanceof merc ? newSchemaForRawMessageInfo((merc) rotumaVar, trmVar, polloiVar, starvelingVar, cutelyVar, adultoidVar) : newSchemaForMessageInfo((StructuralMessageInfo) rotumaVar, trmVar, polloiVar, starvelingVar, cutelyVar, adultoidVar);
    }

    public static <T> cuirassed<T> newSchemaForMessageInfo(StructuralMessageInfo structuralMessageInfo, trm trmVar, polloi polloiVar, starveling<?, ?> starvelingVar, cutely<?> cutelyVar, adultoid adultoidVar) {
        int fieldNumber;
        int fieldNumber2;
        FieldInfo[] fields = structuralMessageInfo.getFields();
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
        for (FieldInfo fieldInfo : fields) {
            if (fieldInfo.getType() == FieldType.MAP) {
                i++;
            } else if (fieldInfo.getType().id() >= 18 && fieldInfo.getType().id() <= 49) {
                i2++;
            }
        }
        int[] iArr2 = i > 0 ? new int[i] : null;
        int[] iArr3 = i2 > 0 ? new int[i2] : null;
        int[] checkInitialized = structuralMessageInfo.getCheckInitialized();
        if (checkInitialized == null) {
            checkInitialized = EMPTY_INT_ARRAY;
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i3 < fields.length) {
            FieldInfo fieldInfo2 = fields[i3];
            int fieldNumber3 = fieldInfo2.getFieldNumber();
            storeFieldData(fieldInfo2, iArr, i4, objArr);
            if (i5 < checkInitialized.length && checkInitialized[i5] == fieldNumber3) {
                checkInitialized[i5] = i4;
                i5++;
            }
            if (fieldInfo2.getType() == FieldType.MAP) {
                iArr2[i6] = i4;
                i6++;
            } else {
                if (fieldInfo2.getType().id() >= 18 && fieldInfo2.getType().id() <= 49) {
                    iArr3[i7] = (int) walach.objectFieldOffset(fieldInfo2.getField());
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
        return new cuirassed<>(iArr, objArr, fieldNumber, fieldNumber2, structuralMessageInfo.getDefaultInstance(), structuralMessageInfo.getSyntax(), true, iArr4, checkInitialized.length, checkInitialized.length + iArr2.length, trmVar, polloiVar, starvelingVar, cutelyVar, adultoidVar);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0251  */
    /* JADX WARN: Code duplicated, block: B:122:0x0254  */
    /* JADX WARN: Code duplicated, block: B:125:0x026b  */
    /* JADX WARN: Code duplicated, block: B:126:0x026e  */
    /* JADX WARN: Code duplicated, block: B:163:0x0326  */
    /* JADX WARN: Code duplicated, block: B:180:0x0375  */
    /* JADX WARN: Code duplicated, block: B:183:0x0383  */
    public static <T> cuirassed<T> newSchemaForRawMessageInfo(merc mercVar, trm trmVar, polloi polloiVar, starveling<?, ?> starvelingVar, cutely<?> cutelyVar, adultoid adultoidVar) {
        int i;
        int iCharAt;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        int i8;
        char cCharAt;
        int i9;
        char cCharAt2;
        int i10;
        char cCharAt3;
        int i11;
        char cCharAt4;
        int i12;
        char cCharAt5;
        int i13;
        char cCharAt6;
        int i14;
        char cCharAt7;
        int i15;
        char cCharAt8;
        int i16;
        int i17;
        int i18;
        int i19;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i20;
        int i21;
        int iObjectFieldOffset3;
        int i22;
        java.lang.reflect.Field fieldReflectField;
        char cCharAt9;
        int i23;
        int i24;
        int i25;
        Object obj;
        java.lang.reflect.Field fieldReflectField2;
        int i26;
        Object obj2;
        java.lang.reflect.Field fieldReflectField3;
        int i27;
        char cCharAt10;
        int i28;
        char cCharAt11;
        int i29;
        char cCharAt12;
        int i30;
        char cCharAt13;
        String stringInfo = mercVar.getStringInfo();
        int length = stringInfo.length();
        char c = 55296;
        if (stringInfo.charAt(0) >= 55296) {
            int i31 = 1;
            while (true) {
                i = i31 + 1;
                if (stringInfo.charAt(i31) < 55296) {
                    break;
                }
                i31 = i;
            }
        } else {
            i = 1;
        }
        int i32 = i + 1;
        int iCharAt2 = stringInfo.charAt(i);
        if (iCharAt2 >= 55296) {
            int i33 = iCharAt2 & 8191;
            int i34 = 13;
            while (true) {
                i30 = i32 + 1;
                cCharAt13 = stringInfo.charAt(i32);
                if (cCharAt13 < 55296) {
                    break;
                }
                i33 |= (cCharAt13 & 8191) << i34;
                i34 += 13;
                i32 = i30;
            }
            iCharAt2 = i33 | (cCharAt13 << i34);
            i32 = i30;
        }
        if (iCharAt2 == 0) {
            i4 = 0;
            iCharAt = 0;
            i3 = 0;
            i7 = 0;
            i2 = 0;
            i6 = 0;
            iArr = EMPTY_INT_ARRAY;
            i5 = 0;
        } else {
            int i35 = i32 + 1;
            int iCharAt3 = stringInfo.charAt(i32);
            if (iCharAt3 >= 55296) {
                int i36 = iCharAt3 & 8191;
                int i37 = 13;
                while (true) {
                    i15 = i35 + 1;
                    cCharAt8 = stringInfo.charAt(i35);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i36 |= (cCharAt8 & 8191) << i37;
                    i37 += 13;
                    i35 = i15;
                }
                iCharAt3 = i36 | (cCharAt8 << i37);
                i35 = i15;
            }
            int i38 = i35 + 1;
            int iCharAt4 = stringInfo.charAt(i35);
            if (iCharAt4 >= 55296) {
                int i39 = iCharAt4 & 8191;
                int i40 = 13;
                while (true) {
                    i14 = i38 + 1;
                    cCharAt7 = stringInfo.charAt(i38);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i39 |= (cCharAt7 & 8191) << i40;
                    i40 += 13;
                    i38 = i14;
                }
                iCharAt4 = i39 | (cCharAt7 << i40);
                i38 = i14;
            }
            int i41 = i38 + 1;
            int iCharAt5 = stringInfo.charAt(i38);
            if (iCharAt5 >= 55296) {
                int i42 = iCharAt5 & 8191;
                int i43 = 13;
                while (true) {
                    i13 = i41 + 1;
                    cCharAt6 = stringInfo.charAt(i41);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt6 & 8191) << i43;
                    i43 += 13;
                    i41 = i13;
                }
                iCharAt5 = i42 | (cCharAt6 << i43);
                i41 = i13;
            }
            int i44 = i41 + 1;
            int iCharAt6 = stringInfo.charAt(i41);
            if (iCharAt6 >= 55296) {
                int i45 = iCharAt6 & 8191;
                int i46 = 13;
                while (true) {
                    i12 = i44 + 1;
                    cCharAt5 = stringInfo.charAt(i44);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt5 & 8191) << i46;
                    i46 += 13;
                    i44 = i12;
                }
                iCharAt6 = i45 | (cCharAt5 << i46);
                i44 = i12;
            }
            int i47 = i44 + 1;
            iCharAt = stringInfo.charAt(i44);
            if (iCharAt >= 55296) {
                int i48 = iCharAt & 8191;
                int i49 = 13;
                while (true) {
                    i11 = i47 + 1;
                    cCharAt4 = stringInfo.charAt(i47);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt4 & 8191) << i49;
                    i49 += 13;
                    i47 = i11;
                }
                iCharAt = i48 | (cCharAt4 << i49);
                i47 = i11;
            }
            int i50 = i47 + 1;
            int iCharAt7 = stringInfo.charAt(i47);
            if (iCharAt7 >= 55296) {
                int i51 = iCharAt7 & 8191;
                int i52 = 13;
                while (true) {
                    i10 = i50 + 1;
                    cCharAt3 = stringInfo.charAt(i50);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt3 & 8191) << i52;
                    i52 += 13;
                    i50 = i10;
                }
                iCharAt7 = i51 | (cCharAt3 << i52);
                i50 = i10;
            }
            int i53 = i50 + 1;
            int iCharAt8 = stringInfo.charAt(i50);
            if (iCharAt8 >= 55296) {
                int i54 = iCharAt8 & 8191;
                int i55 = 13;
                while (true) {
                    i9 = i53 + 1;
                    cCharAt2 = stringInfo.charAt(i53);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt2 & 8191) << i55;
                    i55 += 13;
                    i53 = i9;
                }
                iCharAt8 = i54 | (cCharAt2 << i55);
                i53 = i9;
            }
            int i56 = i53 + 1;
            int iCharAt9 = stringInfo.charAt(i53);
            if (iCharAt9 >= 55296) {
                int i57 = iCharAt9 & 8191;
                int i58 = 13;
                while (true) {
                    i8 = i56 + 1;
                    cCharAt = stringInfo.charAt(i56);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i57 |= (cCharAt & 8191) << i58;
                    i58 += 13;
                    i56 = i8;
                }
                iCharAt9 = i57 | (cCharAt << i58);
                i56 = i8;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            i2 = (iCharAt3 * 2) + iCharAt4;
            int i59 = iCharAt7;
            i3 = iCharAt5;
            i4 = i59;
            i5 = iCharAt3;
            iArr = iArr2;
            i6 = iCharAt9;
            i32 = i56;
            i7 = iCharAt6;
        }
        Unsafe unsafe = UNSAFE;
        Object[] objects = mercVar.getObjects();
        Class<?> cls = mercVar.getDefaultInstance().getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt * 2];
        int i60 = i6 + i4;
        int i61 = i60;
        int i62 = i6;
        int i63 = 0;
        int i64 = 0;
        while (i32 < length) {
            int i65 = i32 + 1;
            int iCharAt10 = stringInfo.charAt(i32);
            if (iCharAt10 >= c) {
                int i66 = iCharAt10 & 8191;
                int i67 = i65;
                int i68 = 13;
                while (true) {
                    i29 = i67 + 1;
                    cCharAt12 = stringInfo.charAt(i67);
                    if (cCharAt12 < c) {
                        break;
                    }
                    i66 |= (cCharAt12 & 8191) << i68;
                    i68 += 13;
                    i67 = i29;
                }
                iCharAt10 = i66 | (cCharAt12 << i68);
                i16 = i29;
            } else {
                i16 = i65;
            }
            int i69 = i16 + 1;
            int iCharAt11 = stringInfo.charAt(i16);
            if (iCharAt11 >= c) {
                int i70 = iCharAt11 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i28 = i71 + 1;
                    cCharAt11 = stringInfo.charAt(i71);
                    if (cCharAt11 < c) {
                        break;
                    }
                    i70 |= (cCharAt11 & 8191) << i72;
                    i72 += 13;
                    i71 = i28;
                }
                iCharAt11 = i70 | (cCharAt11 << i72);
                i17 = i28;
            } else {
                i17 = i69;
            }
            int i73 = iCharAt11 & 255;
            int i74 = length;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i63] = i64;
                i63++;
            }
            int[] iArr4 = iArr3;
            if (i73 >= 51) {
                int i75 = i17 + 1;
                int iCharAt12 = stringInfo.charAt(i17);
                char c2 = 55296;
                if (iCharAt12 >= 55296) {
                    int i76 = iCharAt12 & 8191;
                    int i77 = 13;
                    while (true) {
                        i27 = i75 + 1;
                        cCharAt10 = stringInfo.charAt(i75);
                        if (cCharAt10 < c2) {
                            break;
                        }
                        i76 |= (cCharAt10 & 8191) << i77;
                        i77 += 13;
                        i75 = i27;
                        c2 = 55296;
                    }
                    iCharAt12 = i76 | (cCharAt10 << i77);
                    i75 = i27;
                }
                int i78 = i73 - 51;
                int i79 = i75;
                if (i78 == 9 || i78 == 17) {
                    i24 = i2 + 1;
                    objArr[((i64 / 3) * 2) + 1] = objects[i2];
                } else {
                    if (i78 == 12 && (mercVar.getSyntax().equals(ProtoSyntax.PROTO2) || (iCharAt11 & 2048) != 0)) {
                        i24 = i2 + 1;
                        objArr[((i64 / 3) * 2) + 1] = objects[i2];
                    }
                    i25 = iCharAt12 * 2;
                    obj = objects[i25];
                    if (obj instanceof java.lang.reflect.Field) {
                        fieldReflectField2 = (java.lang.reflect.Field) obj;
                    } else {
                        fieldReflectField2 = reflectField(cls, (String) obj);
                        objects[i25] = fieldReflectField2;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldReflectField2);
                    i26 = i25 + 1;
                    obj2 = objects[i26];
                    if (obj2 instanceof java.lang.reflect.Field) {
                        fieldReflectField3 = (java.lang.reflect.Field) obj2;
                    } else {
                        fieldReflectField3 = reflectField(cls, (String) obj2);
                        objects[i26] = fieldReflectField3;
                    }
                    stringInfo = stringInfo;
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldReflectField3);
                    i22 = iObjectFieldOffset4;
                    i21 = 0;
                    i18 = iCharAt10;
                    i32 = i79;
                }
                i2 = i24;
                i25 = iCharAt12 * 2;
                obj = objects[i25];
                if (obj instanceof java.lang.reflect.Field) {
                    fieldReflectField2 = (java.lang.reflect.Field) obj;
                } else {
                    fieldReflectField2 = reflectField(cls, (String) obj);
                    objects[i25] = fieldReflectField2;
                }
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldReflectField2);
                i26 = i25 + 1;
                obj2 = objects[i26];
                if (obj2 instanceof java.lang.reflect.Field) {
                    fieldReflectField3 = (java.lang.reflect.Field) obj2;
                } else {
                    fieldReflectField3 = reflectField(cls, (String) obj2);
                    objects[i26] = fieldReflectField3;
                }
                stringInfo = stringInfo;
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldReflectField3);
                i22 = iObjectFieldOffset5;
                i21 = 0;
                i18 = iCharAt10;
                i32 = i79;
            } else {
                int i80 = i2 + 1;
                java.lang.reflect.Field fieldReflectField4 = reflectField(cls, (String) objects[i2]);
                if (i73 == 9 || i73 == 17) {
                    i18 = iCharAt10;
                    objArr[((i64 / 3) * 2) + 1] = fieldReflectField4.getType();
                } else {
                    if (i73 == 27 || i73 == 49) {
                        i18 = iCharAt10;
                        i23 = i2 + 2;
                        objArr[((i64 / 3) * 2) + 1] = objects[i80];
                    } else if (i73 == 12 || i73 == 30 || i73 == 44) {
                        i18 = iCharAt10;
                        if (mercVar.getSyntax() == ProtoSyntax.PROTO2 || (iCharAt11 & 2048) != 0) {
                            i23 = i2 + 2;
                            objArr[((i64 / 3) * 2) + 1] = objects[i80];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField4);
                        if ((iCharAt11 & 4096) != 0 || i73 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i20 = i17;
                            i21 = 0;
                        } else {
                            int i81 = i17 + 1;
                            int iCharAt13 = stringInfo.charAt(i17);
                            if (iCharAt13 >= 55296) {
                                int i82 = iCharAt13 & 8191;
                                int i83 = 13;
                                while (true) {
                                    i20 = i81 + 1;
                                    cCharAt9 = stringInfo.charAt(i81);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i82 |= (cCharAt9 & 8191) << i83;
                                    i83 += 13;
                                    i81 = i20;
                                }
                                iCharAt13 = i82 | (cCharAt9 << i83);
                            } else {
                                i20 = i81;
                            }
                            int i84 = (i5 * 2) + (iCharAt13 / 32);
                            Object obj3 = objects[i84];
                            if (obj3 instanceof java.lang.reflect.Field) {
                                fieldReflectField = (java.lang.reflect.Field) obj3;
                            } else {
                                fieldReflectField = reflectField(cls, (String) obj3);
                                objects[i84] = fieldReflectField;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldReflectField);
                            i21 = iCharAt13 % 32;
                        }
                        int i85 = iObjectFieldOffset2;
                        if (i73 >= 18 && i73 <= 49) {
                            iArr[i61] = iObjectFieldOffset;
                            i61++;
                        }
                        iObjectFieldOffset3 = i85;
                        i22 = iObjectFieldOffset;
                        i2 = i19;
                        i32 = i20;
                    } else {
                        if (i73 == 50) {
                            int i86 = i62 + 1;
                            iArr[i62] = i64;
                            int i87 = (i64 / 3) * 2;
                            int i88 = i2 + 2;
                            objArr[i87] = objects[i80];
                            if ((iCharAt11 & 2048) != 0) {
                                i19 = i2 + 3;
                                objArr[i87 + 1] = objects[i88];
                                i18 = iCharAt10;
                                i62 = i86;
                            } else {
                                i19 = i88;
                                i62 = i86;
                                i18 = iCharAt10;
                            }
                        } else {
                            i18 = iCharAt10;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField4);
                        if ((iCharAt11 & 4096) != 0) {
                            iObjectFieldOffset2 = 1048575;
                            i20 = i17;
                            i21 = 0;
                        } else {
                            iObjectFieldOffset2 = 1048575;
                            i20 = i17;
                            i21 = 0;
                        }
                        int i89 = iObjectFieldOffset2;
                        if (i73 >= 18) {
                            iArr[i61] = iObjectFieldOffset;
                            i61++;
                        }
                        iObjectFieldOffset3 = i89;
                        i22 = iObjectFieldOffset;
                        i2 = i19;
                        i32 = i20;
                    }
                    i19 = i23;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField4);
                    if ((iCharAt11 & 4096) != 0) {
                        iObjectFieldOffset2 = 1048575;
                        i20 = i17;
                        i21 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i20 = i17;
                        i21 = 0;
                    }
                    int i810 = iObjectFieldOffset2;
                    if (i73 >= 18) {
                        iArr[i61] = iObjectFieldOffset;
                        i61++;
                    }
                    iObjectFieldOffset3 = i810;
                    i22 = iObjectFieldOffset;
                    i2 = i19;
                    i32 = i20;
                }
                i19 = i80;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField4);
                if ((iCharAt11 & 4096) != 0) {
                    iObjectFieldOffset2 = 1048575;
                    i20 = i17;
                    i21 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i20 = i17;
                    i21 = 0;
                }
                int i811 = iObjectFieldOffset2;
                if (i73 >= 18) {
                    iArr[i61] = iObjectFieldOffset;
                    i61++;
                }
                iObjectFieldOffset3 = i811;
                i22 = iObjectFieldOffset;
                i2 = i19;
                i32 = i20;
            }
            int i90 = i64 + 1;
            iArr4[i64] = i18;
            int i91 = i64 + 2;
            int i92 = iObjectFieldOffset3;
            iArr4[i90] = ((iCharAt11 & 512) != 0 ? ENFORCE_UTF8_MASK : 0) | ((iCharAt11 & 256) != 0 ? REQUIRED_MASK : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i73 << 20) | i22;
            i64 += 3;
            iArr4[i91] = (i21 << 20) | i92;
            length = i74;
            iArr3 = iArr4;
            stringInfo = stringInfo;
            c = 55296;
        }
        return new cuirassed<>(iArr3, objArr, i3, i7, mercVar.getDefaultInstance(), mercVar.getSyntax(), false, iArr, i6, i60, trmVar, polloiVar, starvelingVar, cutelyVar, adultoidVar);
    }

    private int numberAt(int i) {
        return this.buffer[i];
    }

    private static long offset(int i) {
        return i & 1048575;
    }

    private static <T> boolean oneofBooleanAt(T t, long j) {
        return ((Boolean) walach.getObject(t, j)).booleanValue();
    }

    private static <T> double oneofDoubleAt(T t, long j) {
        return ((Double) walach.getObject(t, j)).doubleValue();
    }

    private static <T> float oneofFloatAt(T t, long j) {
        return ((Float) walach.getObject(t, j)).floatValue();
    }

    private static <T> int oneofIntAt(T t, long j) {
        return ((Integer) walach.getObject(t, j)).intValue();
    }

    private static <T> long oneofLongAt(T t, long j) {
        return ((Long) walach.getObject(t, j)).longValue();
    }

    private <K, V> int parseMapField(T t, byte[] bArr, int i, int i2, int i3, long j, dern.saneness sanenessVar) throws IOException {
        Unsafe unsafe = UNSAFE;
        Object mapFieldDefaultEntry = getMapFieldDefaultEntry(i3);
        Object object = unsafe.getObject(t, j);
        if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(mapFieldDefaultEntry);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            unsafe.putObject(t, j, objNewMapField);
            object = objNewMapField;
        }
        return decodeMapEntry(bArr, i, i2, this.mapFieldSchema.forMapMetadata(mapFieldDefaultEntry), this.mapFieldSchema.forMutableMapData(object), sanenessVar);
    }

    private int parseOneofField(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, dern.saneness sanenessVar) throws IOException {
        Unsafe unsafe = UNSAFE;
        long j2 = this.buffer[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(t, j, Double.valueOf(dern.decodeDouble(bArr, i)));
                int i9 = i + 8;
                unsafe.putInt(t, j2, i4);
                return i9;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(t, j, Float.valueOf(dern.decodeFloat(bArr, i)));
                int i10 = i + 4;
                unsafe.putInt(t, j2, i4);
                return i10;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int iDecodeVarint64 = dern.decodeVarint64(bArr, i, sanenessVar);
                unsafe.putObject(t, j, Long.valueOf(sanenessVar.long1));
                unsafe.putInt(t, j2, i4);
                return iDecodeVarint64;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int iDecodeVarint32 = dern.decodeVarint32(bArr, i, sanenessVar);
                unsafe.putObject(t, j, Integer.valueOf(sanenessVar.int1));
                unsafe.putInt(t, j2, i4);
                return iDecodeVarint32;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(t, j, Long.valueOf(dern.decodeFixed64(bArr, i)));
                int i11 = i + 8;
                unsafe.putInt(t, j2, i4);
                return i11;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(t, j, Integer.valueOf(dern.decodeFixed32(bArr, i)));
                int i12 = i + 4;
                unsafe.putInt(t, j2, i4);
                return i12;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int iDecodeVarint65 = dern.decodeVarint64(bArr, i, sanenessVar);
                unsafe.putObject(t, j, Boolean.valueOf(sanenessVar.long1 != 0));
                unsafe.putInt(t, j2, i4);
                return iDecodeVarint65;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int iDecodeVarint33 = dern.decodeVarint32(bArr, i, sanenessVar);
                int i13 = sanenessVar.int1;
                if (i13 == 0) {
                    unsafe.putObject(t, j, "");
                } else {
                    if ((i6 & ENFORCE_UTF8_MASK) != 0 && !Utf8.isValidUtf8(bArr, iDecodeVarint33, iDecodeVarint33 + i13)) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    unsafe.putObject(t, j, new String(bArr, iDecodeVarint33, i13, Internal.UTF_8));
                    iDecodeVarint33 += i13;
                }
                unsafe.putInt(t, j2, i4);
                return iDecodeVarint33;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                Object objMutableOneofMessageFieldForMerge = mutableOneofMessageFieldForMerge(t, i4, i8);
                int iMergeMessageField = dern.mergeMessageField(objMutableOneofMessageFieldForMerge, getMessageFieldSchema(i8), bArr, i, i2, sanenessVar);
                storeOneofMessageField(t, i4, i8, objMutableOneofMessageFieldForMerge);
                return iMergeMessageField;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                int iDecodeBytes = dern.decodeBytes(bArr, i, sanenessVar);
                unsafe.putObject(t, j, sanenessVar.object1);
                unsafe.putInt(t, j2, i4);
                return iDecodeBytes;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int iDecodeVarint34 = dern.decodeVarint32(bArr, i, sanenessVar);
                int i14 = sanenessVar.int1;
                Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(i8);
                if (enumFieldVerifier != null && !enumFieldVerifier.isInRange(i14)) {
                    getMutableUnknownFields(t).storeField(i3, Long.valueOf(i14));
                    return iDecodeVarint34;
                }
                unsafe.putObject(t, j, Integer.valueOf(i14));
                unsafe.putInt(t, j2, i4);
                return iDecodeVarint34;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int iDecodeVarint35 = dern.decodeVarint32(bArr, i, sanenessVar);
                unsafe.putObject(t, j, Integer.valueOf(CodedInputStream.decodeZigZag32(sanenessVar.int1)));
                unsafe.putInt(t, j2, i4);
                return iDecodeVarint35;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int iDecodeVarint66 = dern.decodeVarint64(bArr, i, sanenessVar);
                unsafe.putObject(t, j, Long.valueOf(CodedInputStream.decodeZigZag64(sanenessVar.long1)));
                unsafe.putInt(t, j2, i4);
                return iDecodeVarint66;
            case 68:
                if (i5 == 3) {
                    Object objMutableOneofMessageFieldForMerge2 = mutableOneofMessageFieldForMerge(t, i4, i8);
                    int iMergeGroupField = dern.mergeGroupField(objMutableOneofMessageFieldForMerge2, getMessageFieldSchema(i8), bArr, i, i2, (i3 & (-8)) | 4, sanenessVar);
                    storeOneofMessageField(t, i4, i8, objMutableOneofMessageFieldForMerge2);
                    return iMergeGroupField;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int parseRepeatedField(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, dern.saneness sanenessVar) throws IOException {
        int iDecodeVarint32List;
        Unsafe unsafe = UNSAFE;
        Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (Internal.ProtobufList) unsafe.getObject(t, j2);
        if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
            int size = protobufListMutableCopyWithCapacity2.size();
            protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            unsafe.putObject(t, j2, protobufListMutableCopyWithCapacity2);
        }
        Internal.ProtobufList protobufList = protobufListMutableCopyWithCapacity2;
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    return dern.decodePackedDoubleList(bArr, i, protobufList, sanenessVar);
                }
                if (i5 == 1) {
                    return dern.decodeDoubleList(i3, bArr, i, i2, protobufList, sanenessVar);
                }
                return i;
            case 19:
            case 36:
                if (i5 == 2) {
                    return dern.decodePackedFloatList(bArr, i, protobufList, sanenessVar);
                }
                if (i5 == 5) {
                    return dern.decodeFloatList(i3, bArr, i, i2, protobufList, sanenessVar);
                }
                return i;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    return dern.decodePackedVarint64List(bArr, i, protobufList, sanenessVar);
                }
                if (i5 == 0) {
                    return dern.decodeVarint64List(i3, bArr, i, i2, protobufList, sanenessVar);
                }
                return i;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return dern.decodePackedVarint32List(bArr, i, protobufList, sanenessVar);
                }
                if (i5 == 0) {
                    return dern.decodeVarint32List(i3, bArr, i, i2, protobufList, sanenessVar);
                }
                return i;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    return dern.decodePackedFixed64List(bArr, i, protobufList, sanenessVar);
                }
                if (i5 == 1) {
                    return dern.decodeFixed64List(i3, bArr, i, i2, protobufList, sanenessVar);
                }
                return i;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    return dern.decodePackedFixed32List(bArr, i, protobufList, sanenessVar);
                }
                if (i5 == 5) {
                    return dern.decodeFixed32List(i3, bArr, i, i2, protobufList, sanenessVar);
                }
                return i;
            case 25:
            case 42:
                if (i5 == 2) {
                    return dern.decodePackedBoolList(bArr, i, protobufList, sanenessVar);
                }
                if (i5 == 0) {
                    return dern.decodeBoolList(i3, bArr, i, i2, protobufList, sanenessVar);
                }
                return i;
            case 26:
                if (i5 == 2) {
                    return (j & 536870912) == 0 ? dern.decodeStringList(i3, bArr, i, i2, protobufList, sanenessVar) : dern.decodeStringListRequireUtf8(i3, bArr, i, i2, protobufList, sanenessVar);
                }
                return i;
            case 27:
                if (i5 == 2) {
                    return dern.decodeMessageList(getMessageFieldSchema(i6), i3, bArr, i, i2, protobufList, sanenessVar);
                }
                return i;
            case 28:
                if (i5 == 2) {
                    return dern.decodeBytesList(i3, bArr, i, i2, protobufList, sanenessVar);
                }
                return i;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        iDecodeVarint32List = dern.decodeVarint32List(i3, bArr, i, i2, protobufList, sanenessVar);
                    }
                    return i;
                }
                iDecodeVarint32List = dern.decodePackedVarint32List(bArr, i, protobufList, sanenessVar);
                saran.filterUnknownEnumList((Object) t, i4, (List<Integer>) protobufList, getEnumFieldVerifier(i6), (Object) null, (starveling<UT, Object>) this.unknownFieldSchema);
                return iDecodeVarint32List;
            case 33:
            case 47:
                if (i5 == 2) {
                    return dern.decodePackedSInt32List(bArr, i, protobufList, sanenessVar);
                }
                if (i5 == 0) {
                    return dern.decodeSInt32List(i3, bArr, i, i2, protobufList, sanenessVar);
                }
                return i;
            case 34:
            case 48:
                if (i5 == 2) {
                    return dern.decodePackedSInt64List(bArr, i, protobufList, sanenessVar);
                }
                if (i5 == 0) {
                    return dern.decodeSInt64List(i3, bArr, i, i2, protobufList, sanenessVar);
                }
                return i;
            case 49:
                if (i5 == 3) {
                    return dern.decodeGroupList(getMessageFieldSchema(i6), i3, bArr, i, i2, protobufList, sanenessVar);
                }
                return i;
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

    private <E> void readGroupList(Object obj, long j, polder polderVar, seminary<E> seminaryVar, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        polderVar.readGroupList(this.listFieldSchema.mutableListAt(obj, j), seminaryVar, extensionRegistryLite);
    }

    private <E> void readMessageList(Object obj, int i, polder polderVar, seminary<E> seminaryVar, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        polderVar.readMessageList(this.listFieldSchema.mutableListAt(obj, offset(i)), seminaryVar, extensionRegistryLite);
    }

    private void readString(Object obj, int i, polder polderVar) throws IOException {
        if (isEnforceUtf8(i)) {
            walach.putObject(obj, offset(i), polderVar.readStringRequireUtf8());
        } else if (this.lite) {
            walach.putObject(obj, offset(i), polderVar.readString());
        } else {
            walach.putObject(obj, offset(i), polderVar.readBytes());
        }
    }

    private void readStringList(Object obj, int i, polder polderVar) throws IOException {
        if (isEnforceUtf8(i)) {
            polderVar.readStringListRequireUtf8(this.listFieldSchema.mutableListAt(obj, offset(i)));
        } else {
            polderVar.readStringList(this.listFieldSchema.mutableListAt(obj, offset(i)));
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
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private void setFieldPresent(T t, int i) {
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i);
        long j = 1048575 & iPresenceMaskAndOffsetAt;
        if (j == 1048575) {
            return;
        }
        walach.putInt(t, j, (1 << (iPresenceMaskAndOffsetAt >>> 20)) | walach.getInt(t, j));
    }

    private void setOneofPresent(T t, int i, int i2) {
        walach.putInt(t, presenceMaskAndOffsetAt(i2) & 1048575, i);
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

    /* JADX WARN: Code duplicated, block: B:21:0x007a  */
    /* JADX WARN: Code duplicated, block: B:22:0x007d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0084  */
    /* JADX WARN: Code duplicated, block: B:28:0x009e  */
    /* JADX WARN: Code duplicated, block: B:30:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:32:0x00af  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    private static void storeFieldData(FieldInfo fieldInfo, int[] iArr, int i, Object[] objArr) {
        int iObjectFieldOffset;
        int iId;
        long jObjectFieldOffset;
        int iObjectFieldOffset2;
        int iNumberOfTrailingZeros;
        int i2;
        Class<?> messageFieldClass;
        int i3;
        sealless oneof = fieldInfo.getOneof();
        if (oneof == null) {
            FieldType type = fieldInfo.getType();
            iObjectFieldOffset = (int) walach.objectFieldOffset(fieldInfo.getField());
            iId = type.id();
            if (!type.isList() && !type.isMap()) {
                java.lang.reflect.Field presenceField = fieldInfo.getPresenceField();
                iObjectFieldOffset2 = presenceField == null ? 1048575 : (int) walach.objectFieldOffset(presenceField);
                iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(fieldInfo.getPresenceMask());
            } else if (fieldInfo.getCachedSizeField() == null) {
                iObjectFieldOffset2 = 0;
                iNumberOfTrailingZeros = 0;
            } else {
                jObjectFieldOffset = walach.objectFieldOffset(fieldInfo.getCachedSizeField());
            }
            iArr[i] = fieldInfo.getFieldNumber();
            int i4 = i + 1;
            if (fieldInfo.isEnforceUtf8()) {
                i2 = ENFORCE_UTF8_MASK;
            } else {
                i2 = 0;
            }
            iArr[i4] = (fieldInfo.isRequired() ? REQUIRED_MASK : 0) | i2 | (iId << 20) | iObjectFieldOffset;
            iArr[i + 2] = iObjectFieldOffset2 | (iNumberOfTrailingZeros << 20);
            messageFieldClass = fieldInfo.getMessageFieldClass();
            if (fieldInfo.getMapDefaultEntry() != null) {
                if (messageFieldClass != null) {
                    objArr[((i / 3) * 2) + 1] = messageFieldClass;
                    return;
                } else {
                    if (fieldInfo.getEnumVerifier() != null) {
                        objArr[((i / 3) * 2) + 1] = fieldInfo.getEnumVerifier();
                        return;
                    }
                    return;
                }
            }
            i3 = (i / 3) * 2;
            objArr[i3] = fieldInfo.getMapDefaultEntry();
            if (messageFieldClass != null) {
                objArr[i3 + 1] = messageFieldClass;
            } else if (fieldInfo.getEnumVerifier() != null) {
                objArr[i3 + 1] = fieldInfo.getEnumVerifier();
            }
        }
        iId = fieldInfo.getType().id() + 51;
        iObjectFieldOffset = (int) walach.objectFieldOffset(oneof.getValueField());
        jObjectFieldOffset = walach.objectFieldOffset(oneof.getCaseField());
        iObjectFieldOffset2 = (int) jObjectFieldOffset;
        iNumberOfTrailingZeros = 0;
        iArr[i] = fieldInfo.getFieldNumber();
        int i5 = i + 1;
        if (fieldInfo.isEnforceUtf8()) {
            i2 = ENFORCE_UTF8_MASK;
        } else {
            i2 = 0;
        }
        iArr[i5] = (fieldInfo.isRequired() ? REQUIRED_MASK : 0) | i2 | (iId << 20) | iObjectFieldOffset;
        iArr[i + 2] = iObjectFieldOffset2 | (iNumberOfTrailingZeros << 20);
        messageFieldClass = fieldInfo.getMessageFieldClass();
        if (fieldInfo.getMapDefaultEntry() != null) {
            if (messageFieldClass != null) {
                objArr[((i / 3) * 2) + 1] = messageFieldClass;
                return;
            } else {
                if (fieldInfo.getEnumVerifier() != null) {
                    objArr[((i / 3) * 2) + 1] = fieldInfo.getEnumVerifier();
                    return;
                }
                return;
            }
        }
        i3 = (i / 3) * 2;
        objArr[i3] = fieldInfo.getMapDefaultEntry();
        if (messageFieldClass != null) {
            objArr[i3 + 1] = messageFieldClass;
        } else if (fieldInfo.getEnumVerifier() != null) {
            objArr[i3 + 1] = fieldInfo.getEnumVerifier();
        }
    }

    private void storeMessageField(T t, int i, Object obj) {
        UNSAFE.putObject(t, offset(typeAndOffsetAt(i)), obj);
        setFieldPresent(t, i);
    }

    private void storeOneofMessageField(T t, int i, int i2, Object obj) {
        UNSAFE.putObject(t, offset(typeAndOffsetAt(i2)), obj);
        setOneofPresent(t, i, i2);
    }

    private static int type(int i) {
        return (i & FIELD_TYPE_MASK) >>> 20;
    }

    private int typeAndOffsetAt(int i) {
        return this.buffer[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    private void writeFieldsInAscendingOrder(T t, Writer writer) throws IOException {
        Map.Entry<?, ?> entry;
        Iterator it;
        boolean z;
        int i;
        int i2;
        int i3;
        boolean z2;
        cuirassed<T> cuirassedVar = this;
        if (cuirassedVar.hasExtensions) {
            FieldSet<T> extensions = cuirassedVar.extensionSchema.getExtensions(t);
            if (extensions.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator it2 = extensions.iterator();
                entry = (Map.Entry) it2.next();
                it = it2;
            }
        } else {
            entry = null;
            it = null;
        }
        int length = cuirassedVar.buffer.length;
        Unsafe unsafe = UNSAFE;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int iTypeAndOffsetAt = cuirassedVar.typeAndOffsetAt(i5);
            int iNumberAt = cuirassedVar.numberAt(i5);
            int iType = type(iTypeAndOffsetAt);
            if (iType <= 17) {
                int i7 = cuirassedVar.buffer[i5 + 2];
                z = true;
                int i8 = i7 & 1048575;
                if (i8 != i4) {
                    i6 = i8 == 1048575 ? 0 : unsafe.getInt(t, i8);
                    i4 = i8;
                }
                i = i4;
                i2 = i6;
                i3 = 1 << (i7 >>> 20);
            } else {
                z = true;
                i = i4;
                i2 = i6;
                i3 = 0;
            }
            while (entry != null && cuirassedVar.extensionSchema.extensionNumber(entry) <= iNumberAt) {
                cuirassedVar.extensionSchema.serializeExtension(writer, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long jOffset = offset(iTypeAndOffsetAt);
            switch (iType) {
                case 0:
                    if (cuirassedVar.isFieldPresent(t, i5, i, i2, i3)) {
                        writer.writeDouble(iNumberAt, doubleAt(t, jOffset));
                    }
                    break;
                case 1:
                    if (cuirassedVar.isFieldPresent(t, i5, i, i2, i3)) {
                        writer.writeFloat(iNumberAt, floatAt(t, jOffset));
                    }
                    cuirassedVar = this;
                    break;
                case 2:
                    if (cuirassedVar.isFieldPresent(t, i5, i, i2, i3)) {
                        writer.writeInt64(iNumberAt, unsafe.getLong(t, jOffset));
                    }
                    cuirassedVar = this;
                    break;
                case 3:
                    if (cuirassedVar.isFieldPresent(t, i5, i, i2, i3)) {
                        writer.writeUInt64(iNumberAt, unsafe.getLong(t, jOffset));
                    }
                    cuirassedVar = this;
                    break;
                case 4:
                    if (cuirassedVar.isFieldPresent(t, i5, i, i2, i3)) {
                        writer.writeInt32(iNumberAt, unsafe.getInt(t, jOffset));
                    }
                    cuirassedVar = this;
                    break;
                case 5:
                    if (cuirassedVar.isFieldPresent(t, i5, i, i2, i3)) {
                        writer.writeFixed64(iNumberAt, unsafe.getLong(t, jOffset));
                    }
                    cuirassedVar = this;
                    break;
                case 6:
                    if (cuirassedVar.isFieldPresent(t, i5, i, i2, i3)) {
                        writer.writeFixed32(iNumberAt, unsafe.getInt(t, jOffset));
                    }
                    cuirassedVar = this;
                    break;
                case 7:
                    if (cuirassedVar.isFieldPresent(t, i5, i, i2, i3)) {
                        writer.writeBool(iNumberAt, booleanAt(t, jOffset));
                    }
                    cuirassedVar = this;
                    break;
                case 8:
                    if (cuirassedVar.isFieldPresent(t, i5, i, i2, i3)) {
                        cuirassedVar.writeString(iNumberAt, unsafe.getObject(t, jOffset), writer);
                    }
                    break;
                case 9:
                    if (cuirassedVar.isFieldPresent(t, i5, i, i2, i3)) {
                        writer.writeMessage(iNumberAt, unsafe.getObject(t, jOffset), cuirassedVar.getMessageFieldSchema(i5));
                    }
                    break;
                case 10:
                    if (cuirassedVar.isFieldPresent(t, i5, i, i2, i3)) {
                        writer.writeBytes(iNumberAt, (ByteString) unsafe.getObject(t, jOffset));
                    }
                    cuirassedVar = this;
                    break;
                case 11:
                    if (cuirassedVar.isFieldPresent(t, i5, i, i2, i3)) {
                        writer.writeUInt32(iNumberAt, unsafe.getInt(t, jOffset));
                    }
                    cuirassedVar = this;
                    break;
                case 12:
                    if (cuirassedVar.isFieldPresent(t, i5, i, i2, i3)) {
                        writer.writeEnum(iNumberAt, unsafe.getInt(t, jOffset));
                    }
                    cuirassedVar = this;
                    break;
                case 13:
                    if (cuirassedVar.isFieldPresent(t, i5, i, i2, i3)) {
                        writer.writeSFixed32(iNumberAt, unsafe.getInt(t, jOffset));
                    }
                    cuirassedVar = this;
                    break;
                case 14:
                    if (cuirassedVar.isFieldPresent(t, i5, i, i2, i3)) {
                        writer.writeSFixed64(iNumberAt, unsafe.getLong(t, jOffset));
                    }
                    cuirassedVar = this;
                    break;
                case 15:
                    if (cuirassedVar.isFieldPresent(t, i5, i, i2, i3)) {
                        writer.writeSInt32(iNumberAt, unsafe.getInt(t, jOffset));
                    }
                    cuirassedVar = this;
                    break;
                case 16:
                    if (cuirassedVar.isFieldPresent(t, i5, i, i2, i3)) {
                        writer.writeSInt64(iNumberAt, unsafe.getLong(t, jOffset));
                    }
                    cuirassedVar = this;
                    break;
                case 17:
                    if (cuirassedVar.isFieldPresent(t, i5, i, i2, i3)) {
                        writer.writeGroup(iNumberAt, unsafe.getObject(t, jOffset), cuirassedVar.getMessageFieldSchema(i5));
                    }
                    break;
                case 18:
                    saran.writeDoubleList(cuirassedVar.numberAt(i5), (List) unsafe.getObject(t, jOffset), writer, false);
                    break;
                case 19:
                    saran.writeFloatList(cuirassedVar.numberAt(i5), (List) unsafe.getObject(t, jOffset), writer, false);
                    break;
                case 20:
                    saran.writeInt64List(cuirassedVar.numberAt(i5), (List) unsafe.getObject(t, jOffset), writer, false);
                    break;
                case 21:
                    saran.writeUInt64List(cuirassedVar.numberAt(i5), (List) unsafe.getObject(t, jOffset), writer, false);
                    break;
                case 22:
                    saran.writeInt32List(cuirassedVar.numberAt(i5), (List) unsafe.getObject(t, jOffset), writer, false);
                    break;
                case 23:
                    saran.writeFixed64List(cuirassedVar.numberAt(i5), (List) unsafe.getObject(t, jOffset), writer, false);
                    break;
                case 24:
                    saran.writeFixed32List(cuirassedVar.numberAt(i5), (List) unsafe.getObject(t, jOffset), writer, false);
                    break;
                case 25:
                    saran.writeBoolList(cuirassedVar.numberAt(i5), (List) unsafe.getObject(t, jOffset), writer, false);
                    break;
                case 26:
                    saran.writeStringList(cuirassedVar.numberAt(i5), (List) unsafe.getObject(t, jOffset), writer);
                    break;
                case 27:
                    saran.writeMessageList(cuirassedVar.numberAt(i5), (List) unsafe.getObject(t, jOffset), writer, cuirassedVar.getMessageFieldSchema(i5));
                    break;
                case 28:
                    saran.writeBytesList(cuirassedVar.numberAt(i5), (List) unsafe.getObject(t, jOffset), writer);
                    break;
                case 29:
                    z2 = false;
                    saran.writeUInt32List(cuirassedVar.numberAt(i5), (List) unsafe.getObject(t, jOffset), writer, false);
                    break;
                case 30:
                    z2 = false;
                    saran.writeEnumList(cuirassedVar.numberAt(i5), (List) unsafe.getObject(t, jOffset), writer, false);
                    break;
                case 31:
                    z2 = false;
                    saran.writeSFixed32List(cuirassedVar.numberAt(i5), (List) unsafe.getObject(t, jOffset), writer, false);
                    break;
                case 32:
                    z2 = false;
                    saran.writeSFixed64List(cuirassedVar.numberAt(i5), (List) unsafe.getObject(t, jOffset), writer, false);
                    break;
                case 33:
                    z2 = false;
                    saran.writeSInt32List(cuirassedVar.numberAt(i5), (List) unsafe.getObject(t, jOffset), writer, false);
                    break;
                case 34:
                    z2 = false;
                    saran.writeSInt64List(cuirassedVar.numberAt(i5), (List) unsafe.getObject(t, jOffset), writer, false);
                    break;
                case 35:
                    saran.writeDoubleList(cuirassedVar.numberAt(i5), (List) unsafe.getObject(t, jOffset), writer, z);
                    break;
                case 36:
                    saran.writeFloatList(cuirassedVar.numberAt(i5), (List) unsafe.getObject(t, jOffset), writer, z);
                    break;
                case 37:
                    saran.writeInt64List(cuirassedVar.numberAt(i5), (List) unsafe.getObject(t, jOffset), writer, z);
                    break;
                case 38:
                    saran.writeUInt64List(cuirassedVar.numberAt(i5), (List) unsafe.getObject(t, jOffset), writer, z);
                    break;
                case 39:
                    saran.writeInt32List(cuirassedVar.numberAt(i5), (List) unsafe.getObject(t, jOffset), writer, z);
                    break;
                case 40:
                    saran.writeFixed64List(cuirassedVar.numberAt(i5), (List) unsafe.getObject(t, jOffset), writer, z);
                    break;
                case 41:
                    saran.writeFixed32List(cuirassedVar.numberAt(i5), (List) unsafe.getObject(t, jOffset), writer, z);
                    break;
                case 42:
                    saran.writeBoolList(cuirassedVar.numberAt(i5), (List) unsafe.getObject(t, jOffset), writer, z);
                    break;
                case 43:
                    saran.writeUInt32List(cuirassedVar.numberAt(i5), (List) unsafe.getObject(t, jOffset), writer, z);
                    break;
                case 44:
                    saran.writeEnumList(cuirassedVar.numberAt(i5), (List) unsafe.getObject(t, jOffset), writer, z);
                    break;
                case 45:
                    saran.writeSFixed32List(cuirassedVar.numberAt(i5), (List) unsafe.getObject(t, jOffset), writer, z);
                    break;
                case 46:
                    saran.writeSFixed64List(cuirassedVar.numberAt(i5), (List) unsafe.getObject(t, jOffset), writer, z);
                    break;
                case 47:
                    saran.writeSInt32List(cuirassedVar.numberAt(i5), (List) unsafe.getObject(t, jOffset), writer, z);
                    break;
                case 48:
                    saran.writeSInt64List(cuirassedVar.numberAt(i5), (List) unsafe.getObject(t, jOffset), writer, z);
                    break;
                case 49:
                    saran.writeGroupList(cuirassedVar.numberAt(i5), (List) unsafe.getObject(t, jOffset), writer, cuirassedVar.getMessageFieldSchema(i5));
                    break;
                case 50:
                    cuirassedVar.writeMapHelper(writer, iNumberAt, unsafe.getObject(t, jOffset), i5);
                    break;
                case 51:
                    if (cuirassedVar.isOneofPresent(t, iNumberAt, i5)) {
                        writer.writeDouble(iNumberAt, oneofDoubleAt(t, jOffset));
                    }
                    break;
                case 52:
                    if (cuirassedVar.isOneofPresent(t, iNumberAt, i5)) {
                        writer.writeFloat(iNumberAt, oneofFloatAt(t, jOffset));
                    }
                    break;
                case 53:
                    if (cuirassedVar.isOneofPresent(t, iNumberAt, i5)) {
                        writer.writeInt64(iNumberAt, oneofLongAt(t, jOffset));
                    }
                    break;
                case 54:
                    if (cuirassedVar.isOneofPresent(t, iNumberAt, i5)) {
                        writer.writeUInt64(iNumberAt, oneofLongAt(t, jOffset));
                    }
                    break;
                case 55:
                    if (cuirassedVar.isOneofPresent(t, iNumberAt, i5)) {
                        writer.writeInt32(iNumberAt, oneofIntAt(t, jOffset));
                    }
                    break;
                case 56:
                    if (cuirassedVar.isOneofPresent(t, iNumberAt, i5)) {
                        writer.writeFixed64(iNumberAt, oneofLongAt(t, jOffset));
                    }
                    break;
                case 57:
                    if (cuirassedVar.isOneofPresent(t, iNumberAt, i5)) {
                        writer.writeFixed32(iNumberAt, oneofIntAt(t, jOffset));
                    }
                    break;
                case 58:
                    if (cuirassedVar.isOneofPresent(t, iNumberAt, i5)) {
                        writer.writeBool(iNumberAt, oneofBooleanAt(t, jOffset));
                    }
                    break;
                case 59:
                    if (cuirassedVar.isOneofPresent(t, iNumberAt, i5)) {
                        cuirassedVar.writeString(iNumberAt, unsafe.getObject(t, jOffset), writer);
                    }
                    break;
                case 60:
                    if (cuirassedVar.isOneofPresent(t, iNumberAt, i5)) {
                        writer.writeMessage(iNumberAt, unsafe.getObject(t, jOffset), cuirassedVar.getMessageFieldSchema(i5));
                    }
                    break;
                case 61:
                    if (cuirassedVar.isOneofPresent(t, iNumberAt, i5)) {
                        writer.writeBytes(iNumberAt, (ByteString) unsafe.getObject(t, jOffset));
                    }
                    break;
                case 62:
                    if (cuirassedVar.isOneofPresent(t, iNumberAt, i5)) {
                        writer.writeUInt32(iNumberAt, oneofIntAt(t, jOffset));
                    }
                    break;
                case 63:
                    if (cuirassedVar.isOneofPresent(t, iNumberAt, i5)) {
                        writer.writeEnum(iNumberAt, oneofIntAt(t, jOffset));
                    }
                    break;
                case 64:
                    if (cuirassedVar.isOneofPresent(t, iNumberAt, i5)) {
                        writer.writeSFixed32(iNumberAt, oneofIntAt(t, jOffset));
                    }
                    break;
                case 65:
                    if (cuirassedVar.isOneofPresent(t, iNumberAt, i5)) {
                        writer.writeSFixed64(iNumberAt, oneofLongAt(t, jOffset));
                    }
                    break;
                case 66:
                    if (cuirassedVar.isOneofPresent(t, iNumberAt, i5)) {
                        writer.writeSInt32(iNumberAt, oneofIntAt(t, jOffset));
                    }
                    break;
                case 67:
                    if (cuirassedVar.isOneofPresent(t, iNumberAt, i5)) {
                        writer.writeSInt64(iNumberAt, oneofLongAt(t, jOffset));
                    }
                    break;
                case 68:
                    if (cuirassedVar.isOneofPresent(t, iNumberAt, i5)) {
                        writer.writeGroup(iNumberAt, unsafe.getObject(t, jOffset), cuirassedVar.getMessageFieldSchema(i5));
                    }
                    break;
                default:
                    break;
            }
            i5 += 3;
            i6 = i2;
            i4 = i;
            entry = entry;
        }
        while (entry != null) {
            cuirassedVar.extensionSchema.serializeExtension(writer, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        cuirassedVar.writeUnknownInMessageTo(cuirassedVar.unknownFieldSchema, t, writer);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    private void writeFieldsInDescendingOrder(T t, Writer writer) throws IOException {
        Iterator itDescendingIterator;
        Map.Entry<?, ?> entry;
        writeUnknownInMessageTo(this.unknownFieldSchema, t, writer);
        if (this.hasExtensions) {
            FieldSet<T> extensions = this.extensionSchema.getExtensions(t);
            if (extensions.isEmpty()) {
                itDescendingIterator = null;
                entry = null;
            } else {
                itDescendingIterator = extensions.descendingIterator();
                entry = (Map.Entry) itDescendingIterator.next();
            }
        } else {
            itDescendingIterator = null;
            entry = null;
        }
        for (int length = this.buffer.length - 3; length >= 0; length -= 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(length);
            int iNumberAt = numberAt(length);
            while (entry != null && this.extensionSchema.extensionNumber(entry) > iNumberAt) {
                this.extensionSchema.serializeExtension(writer, entry);
                entry = itDescendingIterator.hasNext() ? (Map.Entry) itDescendingIterator.next() : null;
            }
            switch (type(iTypeAndOffsetAt)) {
                case 0:
                    if (isFieldPresent(t, length)) {
                        writer.writeDouble(iNumberAt, doubleAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 1:
                    if (isFieldPresent(t, length)) {
                        writer.writeFloat(iNumberAt, floatAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 2:
                    if (isFieldPresent(t, length)) {
                        writer.writeInt64(iNumberAt, longAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 3:
                    if (isFieldPresent(t, length)) {
                        writer.writeUInt64(iNumberAt, longAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 4:
                    if (isFieldPresent(t, length)) {
                        writer.writeInt32(iNumberAt, intAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 5:
                    if (isFieldPresent(t, length)) {
                        writer.writeFixed64(iNumberAt, longAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 6:
                    if (isFieldPresent(t, length)) {
                        writer.writeFixed32(iNumberAt, intAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 7:
                    if (isFieldPresent(t, length)) {
                        writer.writeBool(iNumberAt, booleanAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 8:
                    if (isFieldPresent(t, length)) {
                        writeString(iNumberAt, walach.getObject(t, offset(iTypeAndOffsetAt)), writer);
                    }
                    break;
                case 9:
                    if (isFieldPresent(t, length)) {
                        writer.writeMessage(iNumberAt, walach.getObject(t, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
                case 10:
                    if (isFieldPresent(t, length)) {
                        writer.writeBytes(iNumberAt, (ByteString) walach.getObject(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 11:
                    if (isFieldPresent(t, length)) {
                        writer.writeUInt32(iNumberAt, intAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 12:
                    if (isFieldPresent(t, length)) {
                        writer.writeEnum(iNumberAt, intAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 13:
                    if (isFieldPresent(t, length)) {
                        writer.writeSFixed32(iNumberAt, intAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 14:
                    if (isFieldPresent(t, length)) {
                        writer.writeSFixed64(iNumberAt, longAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 15:
                    if (isFieldPresent(t, length)) {
                        writer.writeSInt32(iNumberAt, intAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 16:
                    if (isFieldPresent(t, length)) {
                        writer.writeSInt64(iNumberAt, longAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 17:
                    if (isFieldPresent(t, length)) {
                        writer.writeGroup(iNumberAt, walach.getObject(t, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
                case 18:
                    saran.writeDoubleList(numberAt(length), (List) walach.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 19:
                    saran.writeFloatList(numberAt(length), (List) walach.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 20:
                    saran.writeInt64List(numberAt(length), (List) walach.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 21:
                    saran.writeUInt64List(numberAt(length), (List) walach.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 22:
                    saran.writeInt32List(numberAt(length), (List) walach.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 23:
                    saran.writeFixed64List(numberAt(length), (List) walach.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 24:
                    saran.writeFixed32List(numberAt(length), (List) walach.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 25:
                    saran.writeBoolList(numberAt(length), (List) walach.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 26:
                    saran.writeStringList(numberAt(length), (List) walach.getObject(t, offset(iTypeAndOffsetAt)), writer);
                    break;
                case 27:
                    saran.writeMessageList(numberAt(length), (List) walach.getObject(t, offset(iTypeAndOffsetAt)), writer, getMessageFieldSchema(length));
                    break;
                case 28:
                    saran.writeBytesList(numberAt(length), (List) walach.getObject(t, offset(iTypeAndOffsetAt)), writer);
                    break;
                case 29:
                    saran.writeUInt32List(numberAt(length), (List) walach.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 30:
                    saran.writeEnumList(numberAt(length), (List) walach.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 31:
                    saran.writeSFixed32List(numberAt(length), (List) walach.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 32:
                    saran.writeSFixed64List(numberAt(length), (List) walach.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 33:
                    saran.writeSInt32List(numberAt(length), (List) walach.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 34:
                    saran.writeSInt64List(numberAt(length), (List) walach.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 35:
                    saran.writeDoubleList(numberAt(length), (List) walach.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 36:
                    saran.writeFloatList(numberAt(length), (List) walach.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 37:
                    saran.writeInt64List(numberAt(length), (List) walach.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 38:
                    saran.writeUInt64List(numberAt(length), (List) walach.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 39:
                    saran.writeInt32List(numberAt(length), (List) walach.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 40:
                    saran.writeFixed64List(numberAt(length), (List) walach.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 41:
                    saran.writeFixed32List(numberAt(length), (List) walach.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 42:
                    saran.writeBoolList(numberAt(length), (List) walach.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 43:
                    saran.writeUInt32List(numberAt(length), (List) walach.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 44:
                    saran.writeEnumList(numberAt(length), (List) walach.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 45:
                    saran.writeSFixed32List(numberAt(length), (List) walach.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 46:
                    saran.writeSFixed64List(numberAt(length), (List) walach.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 47:
                    saran.writeSInt32List(numberAt(length), (List) walach.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 48:
                    saran.writeSInt64List(numberAt(length), (List) walach.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 49:
                    saran.writeGroupList(numberAt(length), (List) walach.getObject(t, offset(iTypeAndOffsetAt)), writer, getMessageFieldSchema(length));
                    break;
                case 50:
                    writeMapHelper(writer, iNumberAt, walach.getObject(t, offset(iTypeAndOffsetAt)), length);
                    break;
                case 51:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeDouble(iNumberAt, oneofDoubleAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 52:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeFloat(iNumberAt, oneofFloatAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 53:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeInt64(iNumberAt, oneofLongAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 54:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeUInt64(iNumberAt, oneofLongAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 55:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeInt32(iNumberAt, oneofIntAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 56:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeFixed64(iNumberAt, oneofLongAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 57:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeFixed32(iNumberAt, oneofIntAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 58:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeBool(iNumberAt, oneofBooleanAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 59:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writeString(iNumberAt, walach.getObject(t, offset(iTypeAndOffsetAt)), writer);
                    }
                    break;
                case 60:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeMessage(iNumberAt, walach.getObject(t, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
                case 61:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeBytes(iNumberAt, (ByteString) walach.getObject(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 62:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeUInt32(iNumberAt, oneofIntAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 63:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeEnum(iNumberAt, oneofIntAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 64:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeSFixed32(iNumberAt, oneofIntAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 65:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeSFixed64(iNumberAt, oneofLongAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 66:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeSInt32(iNumberAt, oneofIntAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 67:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeSInt64(iNumberAt, oneofLongAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 68:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeGroup(iNumberAt, walach.getObject(t, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.extensionSchema.serializeExtension(writer, entry);
            entry = itDescendingIterator.hasNext() ? (Map.Entry) itDescendingIterator.next() : null;
        }
    }

    private <K, V> void writeMapHelper(Writer writer, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            writer.writeMap(i, this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i2)), this.mapFieldSchema.forMapData(obj));
        }
    }

    private void writeString(int i, Object obj, Writer writer) throws IOException {
        if (obj instanceof String) {
            writer.writeString(i, (String) obj);
        } else {
            writer.writeBytes(i, (ByteString) obj);
        }
    }

    private <UT, UB> void writeUnknownInMessageTo(starveling<UT, UB> starvelingVar, T t, Writer writer) throws IOException {
        starvelingVar.writeTo(starvelingVar.getFromMessage(t), writer);
    }

    @Override // com.google.protobuf.seminary
    public boolean equals(T t, T t2) {
        int length = this.buffer.length;
        for (int i = 0; i < length; i += 3) {
            if (!equals(t, t2, i)) {
                return false;
            }
        }
        if (!this.unknownFieldSchema.getFromMessage(t).equals(this.unknownFieldSchema.getFromMessage(t2))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(t).equals(this.extensionSchema.getExtensions(t2));
        }
        return true;
    }

    public int getSchemaSize() {
        return this.buffer.length * 3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:247:0x0552 A[PHI: r0 r1
  0x0552: PHI (r0v2 com.google.protobuf.cuirassed<T>) = 
  (r0v1 com.google.protobuf.cuirassed<T>)
  (r0v1 com.google.protobuf.cuirassed<T>)
  (r0v1 com.google.protobuf.cuirassed<T>)
  (r0v24 com.google.protobuf.cuirassed<T>)
  (r0v30 com.google.protobuf.cuirassed<T>)
  (r0v1 com.google.protobuf.cuirassed<T>)
  (r0v1 com.google.protobuf.cuirassed<T>)
  (r0v1 com.google.protobuf.cuirassed<T>)
  (r0v1 com.google.protobuf.cuirassed<T>)
  (r0v1 com.google.protobuf.cuirassed<T>)
  (r0v1 com.google.protobuf.cuirassed<T>)
  (r0v1 com.google.protobuf.cuirassed<T>)
  (r0v1 com.google.protobuf.cuirassed<T>)
  (r0v1 com.google.protobuf.cuirassed<T>)
  (r0v1 com.google.protobuf.cuirassed<T>)
  (r0v1 com.google.protobuf.cuirassed<T>)
  (r0v1 com.google.protobuf.cuirassed<T>)
  (r0v1 com.google.protobuf.cuirassed<T>)
  (r0v1 com.google.protobuf.cuirassed<T>)
  (r0v1 com.google.protobuf.cuirassed<T>)
  (r0v1 com.google.protobuf.cuirassed<T>)
  (r0v1 com.google.protobuf.cuirassed<T>)
  (r0v1 com.google.protobuf.cuirassed<T>)
  (r0v1 com.google.protobuf.cuirassed<T>)
  (r0v1 com.google.protobuf.cuirassed<T>)
  (r0v1 com.google.protobuf.cuirassed<T>)
  (r0v1 com.google.protobuf.cuirassed<T>)
  (r0v1 com.google.protobuf.cuirassed<T>)
  (r0v1 com.google.protobuf.cuirassed<T>)
  (r0v1 com.google.protobuf.cuirassed<T>)
  (r0v1 com.google.protobuf.cuirassed<T>)
  (r0v1 com.google.protobuf.cuirassed<T>)
  (r0v1 com.google.protobuf.cuirassed<T>)
  (r0v1 com.google.protobuf.cuirassed<T>)
  (r0v1 com.google.protobuf.cuirassed<T>)
  (r0v1 com.google.protobuf.cuirassed<T>)
  (r0v1 com.google.protobuf.cuirassed<T>)
  (r0v1 com.google.protobuf.cuirassed<T>)
 binds: [B:22:0x005b, B:245:0x0548, B:215:0x04ab, B:201:0x0462, B:193:0x043b, B:187:0x0414, B:164:0x032b, B:158:0x030d, B:152:0x02ef, B:146:0x02d1, B:140:0x02b3, B:134:0x0295, B:128:0x0277, B:122:0x0259, B:116:0x023b, B:110:0x021e, B:104:0x0201, B:98:0x01e4, B:92:0x01c7, B:85:0x01a5, B:80:0x0171, B:77:0x0165, B:74:0x0155, B:71:0x0145, B:68:0x0135, B:65:0x0129, B:62:0x011d, B:59:0x0110, B:53:0x00f2, B:50:0x00df, B:47:0x00ce, B:44:0x00bf, B:41:0x00b0, B:38:0x00a5, B:35:0x009a, B:32:0x008b, B:29:0x007c, B:25:0x0064] A[DONT_GENERATE, DONT_INLINE]
  0x0552: PHI (r1v4 T) = 
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v5 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
  (r1v1 T)
 binds: [B:22:0x005b, B:245:0x0548, B:215:0x04ab, B:201:0x0462, B:193:0x043b, B:187:0x0414, B:164:0x032b, B:158:0x030d, B:152:0x02ef, B:146:0x02d1, B:140:0x02b3, B:134:0x0295, B:128:0x0277, B:122:0x0259, B:116:0x023b, B:110:0x021e, B:104:0x0201, B:98:0x01e4, B:92:0x01c7, B:85:0x01a5, B:80:0x0171, B:77:0x0165, B:74:0x0155, B:71:0x0145, B:68:0x0135, B:65:0x0129, B:62:0x011d, B:59:0x0110, B:53:0x00f2, B:50:0x00df, B:47:0x00ce, B:44:0x00bf, B:41:0x00b0, B:38:0x00a5, B:35:0x009a, B:32:0x008b, B:29:0x007c, B:25:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.protobuf.seminary
    public int getSerializedSize(T t) {
        int i;
        int iComputeDoubleSize;
        int iComputeFloatSize;
        int iComputeInt64Size;
        int iComputeSizeFixed64ListNoTag;
        int iComputeTagSize;
        int iComputeUInt32SizeNoTag;
        cuirassed<T> cuirassedVar = this;
        T t2 = t;
        Unsafe unsafe = UNSAFE;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i3 < cuirassedVar.buffer.length) {
            int iTypeAndOffsetAt = cuirassedVar.typeAndOffsetAt(i3);
            int iType = type(iTypeAndOffsetAt);
            int iNumberAt = cuirassedVar.numberAt(i3);
            int i7 = cuirassedVar.buffer[i3 + 2];
            int i8 = i7 & i2;
            if (iType <= 17) {
                if (i8 != i6) {
                    i4 = i8 == i2 ? 0 : unsafe.getInt(t2, i8);
                    i6 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            int i9 = i5;
            long jOffset = offset(iTypeAndOffsetAt);
            if (iType < FieldType.DOUBLE_LIST_PACKED.id() || iType > FieldType.SINT64_LIST_PACKED.id()) {
                i8 = 0;
            }
            switch (iType) {
                case 0:
                    if (!cuirassedVar.isFieldPresent(t2, i3, i6, i4, i)) {
                        i5 = i9;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        i5 = i9 + iComputeDoubleSize;
                    }
                    break;
                case 1:
                    if (cuirassedVar.isFieldPresent(t2, i3, i6, i4, i)) {
                        iComputeFloatSize = CodedOutputStream.computeFloatSize(iNumberAt, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        i5 = i9 + iComputeFloatSize;
                        cuirassedVar = this;
                        t2 = t;
                    }
                    cuirassedVar = this;
                    t2 = t;
                    i5 = i9;
                    break;
                case 2:
                    if (cuirassedVar.isFieldPresent(t2, i3, i6, i4, i)) {
                        iComputeInt64Size = CodedOutputStream.computeInt64Size(iNumberAt, unsafe.getLong(t2, jOffset));
                        i5 = i9 + iComputeInt64Size;
                        cuirassedVar = this;
                    }
                    cuirassedVar = this;
                    i5 = i9;
                    break;
                case 3:
                    if (cuirassedVar.isFieldPresent(t2, i3, i6, i4, i)) {
                        iComputeInt64Size = CodedOutputStream.computeUInt64Size(iNumberAt, unsafe.getLong(t2, jOffset));
                        i5 = i9 + iComputeInt64Size;
                        cuirassedVar = this;
                    }
                    cuirassedVar = this;
                    i5 = i9;
                    break;
                case 4:
                    if (cuirassedVar.isFieldPresent(t2, i3, i6, i4, i)) {
                        iComputeInt64Size = CodedOutputStream.computeInt32Size(iNumberAt, unsafe.getInt(t2, jOffset));
                        i5 = i9 + iComputeInt64Size;
                        cuirassedVar = this;
                    }
                    cuirassedVar = this;
                    i5 = i9;
                    break;
                case 5:
                    if (cuirassedVar.isFieldPresent(t2, i3, i6, i4, i)) {
                        iComputeFloatSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        i5 = i9 + iComputeFloatSize;
                        cuirassedVar = this;
                        t2 = t;
                    }
                    cuirassedVar = this;
                    t2 = t;
                    i5 = i9;
                    break;
                case 6:
                    if (cuirassedVar.isFieldPresent(t2, i3, i6, i4, i)) {
                        iComputeFloatSize = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        i5 = i9 + iComputeFloatSize;
                        cuirassedVar = this;
                        t2 = t;
                    }
                    cuirassedVar = this;
                    t2 = t;
                    i5 = i9;
                    break;
                case 7:
                    if (cuirassedVar.isFieldPresent(t2, i3, i6, i4, i)) {
                        iComputeFloatSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        i5 = i9 + iComputeFloatSize;
                        cuirassedVar = this;
                        t2 = t;
                    }
                    cuirassedVar = this;
                    t2 = t;
                    i5 = i9;
                    break;
                case 8:
                    if (cuirassedVar.isFieldPresent(t2, i3, i6, i4, i)) {
                        Object object = unsafe.getObject(t2, jOffset);
                        iComputeInt64Size = object instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object) : CodedOutputStream.computeStringSize(iNumberAt, (String) object);
                        i5 = i9 + iComputeInt64Size;
                        cuirassedVar = this;
                    }
                    cuirassedVar = this;
                    i5 = i9;
                    break;
                case 9:
                    if (!cuirassedVar.isFieldPresent(t2, i3, i6, i4, i)) {
                        i5 = i9;
                    } else {
                        iComputeDoubleSize = saran.computeSizeMessage(iNumberAt, unsafe.getObject(t2, jOffset), cuirassedVar.getMessageFieldSchema(i3));
                        i5 = i9 + iComputeDoubleSize;
                    }
                    break;
                case 10:
                    if (cuirassedVar.isFieldPresent(t2, i3, i6, i4, i)) {
                        iComputeInt64Size = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) unsafe.getObject(t2, jOffset));
                        i5 = i9 + iComputeInt64Size;
                        cuirassedVar = this;
                    }
                    cuirassedVar = this;
                    i5 = i9;
                    break;
                case 11:
                    if (cuirassedVar.isFieldPresent(t2, i3, i6, i4, i)) {
                        iComputeInt64Size = CodedOutputStream.computeUInt32Size(iNumberAt, unsafe.getInt(t2, jOffset));
                        i5 = i9 + iComputeInt64Size;
                        cuirassedVar = this;
                    }
                    cuirassedVar = this;
                    i5 = i9;
                    break;
                case 12:
                    if (cuirassedVar.isFieldPresent(t2, i3, i6, i4, i)) {
                        iComputeInt64Size = CodedOutputStream.computeEnumSize(iNumberAt, unsafe.getInt(t2, jOffset));
                        i5 = i9 + iComputeInt64Size;
                        cuirassedVar = this;
                    }
                    cuirassedVar = this;
                    i5 = i9;
                    break;
                case 13:
                    if (cuirassedVar.isFieldPresent(t2, i3, i6, i4, i)) {
                        iComputeFloatSize = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        i5 = i9 + iComputeFloatSize;
                        cuirassedVar = this;
                        t2 = t;
                    }
                    cuirassedVar = this;
                    t2 = t;
                    i5 = i9;
                    break;
                case 14:
                    if (cuirassedVar.isFieldPresent(t2, i3, i6, i4, i)) {
                        iComputeFloatSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        i5 = i9 + iComputeFloatSize;
                        cuirassedVar = this;
                        t2 = t;
                    }
                    cuirassedVar = this;
                    t2 = t;
                    i5 = i9;
                    break;
                case 15:
                    if (cuirassedVar.isFieldPresent(t2, i3, i6, i4, i)) {
                        iComputeInt64Size = CodedOutputStream.computeSInt32Size(iNumberAt, unsafe.getInt(t2, jOffset));
                        i5 = i9 + iComputeInt64Size;
                        cuirassedVar = this;
                    }
                    cuirassedVar = this;
                    i5 = i9;
                    break;
                case 16:
                    if (cuirassedVar.isFieldPresent(t2, i3, i6, i4, i)) {
                        iComputeInt64Size = CodedOutputStream.computeSInt64Size(iNumberAt, unsafe.getLong(t2, jOffset));
                        i5 = i9 + iComputeInt64Size;
                        cuirassedVar = this;
                    }
                    cuirassedVar = this;
                    i5 = i9;
                    break;
                case 17:
                    if (!cuirassedVar.isFieldPresent(t2, i3, i6, i4, i)) {
                        i5 = i9;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) unsafe.getObject(t2, jOffset), cuirassedVar.getMessageFieldSchema(i3));
                        i5 = i9 + iComputeDoubleSize;
                    }
                    break;
                case 18:
                    iComputeDoubleSize = saran.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t2, jOffset), false);
                    i5 = i9 + iComputeDoubleSize;
                    break;
                case 19:
                    iComputeDoubleSize = saran.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t2, jOffset), false);
                    i5 = i9 + iComputeDoubleSize;
                    break;
                case 20:
                    iComputeDoubleSize = saran.computeSizeInt64List(iNumberAt, (List) unsafe.getObject(t2, jOffset), false);
                    i5 = i9 + iComputeDoubleSize;
                    break;
                case 21:
                    iComputeDoubleSize = saran.computeSizeUInt64List(iNumberAt, (List) unsafe.getObject(t2, jOffset), false);
                    i5 = i9 + iComputeDoubleSize;
                    break;
                case 22:
                    iComputeDoubleSize = saran.computeSizeInt32List(iNumberAt, (List) unsafe.getObject(t2, jOffset), false);
                    i5 = i9 + iComputeDoubleSize;
                    break;
                case 23:
                    iComputeDoubleSize = saran.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t2, jOffset), false);
                    i5 = i9 + iComputeDoubleSize;
                    break;
                case 24:
                    iComputeDoubleSize = saran.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t2, jOffset), false);
                    i5 = i9 + iComputeDoubleSize;
                    break;
                case 25:
                    iComputeDoubleSize = saran.computeSizeBoolList(iNumberAt, (List) unsafe.getObject(t2, jOffset), false);
                    i5 = i9 + iComputeDoubleSize;
                    break;
                case 26:
                    iComputeDoubleSize = saran.computeSizeStringList(iNumberAt, (List) unsafe.getObject(t2, jOffset));
                    i5 = i9 + iComputeDoubleSize;
                    break;
                case 27:
                    iComputeDoubleSize = saran.computeSizeMessageList(iNumberAt, (List) unsafe.getObject(t2, jOffset), cuirassedVar.getMessageFieldSchema(i3));
                    i5 = i9 + iComputeDoubleSize;
                    break;
                case 28:
                    iComputeDoubleSize = saran.computeSizeByteStringList(iNumberAt, (List) unsafe.getObject(t2, jOffset));
                    i5 = i9 + iComputeDoubleSize;
                    break;
                case 29:
                    iComputeDoubleSize = saran.computeSizeUInt32List(iNumberAt, (List) unsafe.getObject(t2, jOffset), false);
                    i5 = i9 + iComputeDoubleSize;
                    break;
                case 30:
                    iComputeDoubleSize = saran.computeSizeEnumList(iNumberAt, (List) unsafe.getObject(t2, jOffset), false);
                    i5 = i9 + iComputeDoubleSize;
                    break;
                case 31:
                    iComputeDoubleSize = saran.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t2, jOffset), false);
                    i5 = i9 + iComputeDoubleSize;
                    break;
                case 32:
                    iComputeDoubleSize = saran.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t2, jOffset), false);
                    i5 = i9 + iComputeDoubleSize;
                    break;
                case 33:
                    iComputeDoubleSize = saran.computeSizeSInt32List(iNumberAt, (List) unsafe.getObject(t2, jOffset), false);
                    i5 = i9 + iComputeDoubleSize;
                    break;
                case 34:
                    iComputeDoubleSize = saran.computeSizeSInt64List(iNumberAt, (List) unsafe.getObject(t2, jOffset), false);
                    i5 = i9 + iComputeDoubleSize;
                    break;
                case 35:
                    iComputeSizeFixed64ListNoTag = saran.computeSizeFixed64ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        i5 = i9;
                    } else {
                        if (cuirassedVar.useCachedSizeField) {
                            unsafe.putInt(t2, i8, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i5 = i9 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                    }
                    break;
                case 36:
                    iComputeSizeFixed64ListNoTag = saran.computeSizeFixed32ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        i5 = i9;
                    } else {
                        if (cuirassedVar.useCachedSizeField) {
                            unsafe.putInt(t2, i8, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i5 = i9 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                    }
                    break;
                case 37:
                    iComputeSizeFixed64ListNoTag = saran.computeSizeInt64ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        i5 = i9;
                    } else {
                        if (cuirassedVar.useCachedSizeField) {
                            unsafe.putInt(t2, i8, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i5 = i9 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                    }
                    break;
                case 38:
                    iComputeSizeFixed64ListNoTag = saran.computeSizeUInt64ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        i5 = i9;
                    } else {
                        if (cuirassedVar.useCachedSizeField) {
                            unsafe.putInt(t2, i8, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i5 = i9 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                    }
                    break;
                case 39:
                    iComputeSizeFixed64ListNoTag = saran.computeSizeInt32ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        i5 = i9;
                    } else {
                        if (cuirassedVar.useCachedSizeField) {
                            unsafe.putInt(t2, i8, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i5 = i9 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                    }
                    break;
                case 40:
                    iComputeSizeFixed64ListNoTag = saran.computeSizeFixed64ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        i5 = i9;
                    } else {
                        if (cuirassedVar.useCachedSizeField) {
                            unsafe.putInt(t2, i8, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i5 = i9 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                    }
                    break;
                case 41:
                    iComputeSizeFixed64ListNoTag = saran.computeSizeFixed32ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        i5 = i9;
                    } else {
                        if (cuirassedVar.useCachedSizeField) {
                            unsafe.putInt(t2, i8, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i5 = i9 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                    }
                    break;
                case 42:
                    iComputeSizeFixed64ListNoTag = saran.computeSizeBoolListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        i5 = i9;
                    } else {
                        if (cuirassedVar.useCachedSizeField) {
                            unsafe.putInt(t2, i8, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i5 = i9 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                    }
                    break;
                case 43:
                    iComputeSizeFixed64ListNoTag = saran.computeSizeUInt32ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        i5 = i9;
                    } else {
                        if (cuirassedVar.useCachedSizeField) {
                            unsafe.putInt(t2, i8, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i5 = i9 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                    }
                    break;
                case 44:
                    iComputeSizeFixed64ListNoTag = saran.computeSizeEnumListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        i5 = i9;
                    } else {
                        if (cuirassedVar.useCachedSizeField) {
                            unsafe.putInt(t2, i8, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i5 = i9 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                    }
                    break;
                case 45:
                    iComputeSizeFixed64ListNoTag = saran.computeSizeFixed32ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        i5 = i9;
                    } else {
                        if (cuirassedVar.useCachedSizeField) {
                            unsafe.putInt(t2, i8, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i5 = i9 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                    }
                    break;
                case 46:
                    iComputeSizeFixed64ListNoTag = saran.computeSizeFixed64ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        i5 = i9;
                    } else {
                        if (cuirassedVar.useCachedSizeField) {
                            unsafe.putInt(t2, i8, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i5 = i9 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                    }
                    break;
                case 47:
                    iComputeSizeFixed64ListNoTag = saran.computeSizeSInt32ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        i5 = i9;
                    } else {
                        if (cuirassedVar.useCachedSizeField) {
                            unsafe.putInt(t2, i8, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i5 = i9 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                    }
                    break;
                case 48:
                    iComputeSizeFixed64ListNoTag = saran.computeSizeSInt64ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        i5 = i9;
                    } else {
                        if (cuirassedVar.useCachedSizeField) {
                            unsafe.putInt(t2, i8, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        i5 = i9 + iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                    }
                    break;
                case 49:
                    iComputeDoubleSize = saran.computeSizeGroupList(iNumberAt, (List) unsafe.getObject(t2, jOffset), cuirassedVar.getMessageFieldSchema(i3));
                    i5 = i9 + iComputeDoubleSize;
                    break;
                case 50:
                    iComputeDoubleSize = cuirassedVar.mapFieldSchema.getSerializedSize(iNumberAt, unsafe.getObject(t2, jOffset), cuirassedVar.getMapFieldDefaultEntry(i3));
                    i5 = i9 + iComputeDoubleSize;
                    break;
                case 51:
                    if (!cuirassedVar.isOneofPresent(t2, iNumberAt, i3)) {
                        i5 = i9;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        i5 = i9 + iComputeDoubleSize;
                    }
                    break;
                case 52:
                    if (!cuirassedVar.isOneofPresent(t2, iNumberAt, i3)) {
                        i5 = i9;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeFloatSize(iNumberAt, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        i5 = i9 + iComputeDoubleSize;
                    }
                    break;
                case 53:
                    if (!cuirassedVar.isOneofPresent(t2, iNumberAt, i3)) {
                        i5 = i9;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeInt64Size(iNumberAt, oneofLongAt(t2, jOffset));
                        i5 = i9 + iComputeDoubleSize;
                    }
                    break;
                case 54:
                    if (!cuirassedVar.isOneofPresent(t2, iNumberAt, i3)) {
                        i5 = i9;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeUInt64Size(iNumberAt, oneofLongAt(t2, jOffset));
                        i5 = i9 + iComputeDoubleSize;
                    }
                    break;
                case 55:
                    if (!cuirassedVar.isOneofPresent(t2, iNumberAt, i3)) {
                        i5 = i9;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeInt32Size(iNumberAt, oneofIntAt(t2, jOffset));
                        i5 = i9 + iComputeDoubleSize;
                    }
                    break;
                case 56:
                    if (!cuirassedVar.isOneofPresent(t2, iNumberAt, i3)) {
                        i5 = i9;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        i5 = i9 + iComputeDoubleSize;
                    }
                    break;
                case 57:
                    if (!cuirassedVar.isOneofPresent(t2, iNumberAt, i3)) {
                        i5 = i9;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        i5 = i9 + iComputeDoubleSize;
                    }
                    break;
                case 58:
                    if (!cuirassedVar.isOneofPresent(t2, iNumberAt, i3)) {
                        i5 = i9;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        i5 = i9 + iComputeDoubleSize;
                    }
                    break;
                case 59:
                    if (!cuirassedVar.isOneofPresent(t2, iNumberAt, i3)) {
                        i5 = i9;
                    } else {
                        Object object2 = unsafe.getObject(t2, jOffset);
                        iComputeDoubleSize = object2 instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object2) : CodedOutputStream.computeStringSize(iNumberAt, (String) object2);
                        i5 = i9 + iComputeDoubleSize;
                    }
                    break;
                case 60:
                    if (!cuirassedVar.isOneofPresent(t2, iNumberAt, i3)) {
                        i5 = i9;
                    } else {
                        iComputeDoubleSize = saran.computeSizeMessage(iNumberAt, unsafe.getObject(t2, jOffset), cuirassedVar.getMessageFieldSchema(i3));
                        i5 = i9 + iComputeDoubleSize;
                    }
                    break;
                case 61:
                    if (!cuirassedVar.isOneofPresent(t2, iNumberAt, i3)) {
                        i5 = i9;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) unsafe.getObject(t2, jOffset));
                        i5 = i9 + iComputeDoubleSize;
                    }
                    break;
                case 62:
                    if (!cuirassedVar.isOneofPresent(t2, iNumberAt, i3)) {
                        i5 = i9;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeUInt32Size(iNumberAt, oneofIntAt(t2, jOffset));
                        i5 = i9 + iComputeDoubleSize;
                    }
                    break;
                case 63:
                    if (!cuirassedVar.isOneofPresent(t2, iNumberAt, i3)) {
                        i5 = i9;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeEnumSize(iNumberAt, oneofIntAt(t2, jOffset));
                        i5 = i9 + iComputeDoubleSize;
                    }
                    break;
                case 64:
                    if (!cuirassedVar.isOneofPresent(t2, iNumberAt, i3)) {
                        i5 = i9;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        i5 = i9 + iComputeDoubleSize;
                    }
                    break;
                case 65:
                    if (!cuirassedVar.isOneofPresent(t2, iNumberAt, i3)) {
                        i5 = i9;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        i5 = i9 + iComputeDoubleSize;
                    }
                    break;
                case 66:
                    if (!cuirassedVar.isOneofPresent(t2, iNumberAt, i3)) {
                        i5 = i9;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeSInt32Size(iNumberAt, oneofIntAt(t2, jOffset));
                        i5 = i9 + iComputeDoubleSize;
                    }
                    break;
                case 67:
                    if (!cuirassedVar.isOneofPresent(t2, iNumberAt, i3)) {
                        i5 = i9;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeSInt64Size(iNumberAt, oneofLongAt(t2, jOffset));
                        i5 = i9 + iComputeDoubleSize;
                    }
                    break;
                case 68:
                    if (!cuirassedVar.isOneofPresent(t2, iNumberAt, i3)) {
                        i5 = i9;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) unsafe.getObject(t2, jOffset), cuirassedVar.getMessageFieldSchema(i3));
                        i5 = i9 + iComputeDoubleSize;
                    }
                    break;
                default:
                    i5 = i9;
                    break;
            }
            i3 += 3;
            i2 = 1048575;
        }
        int unknownFieldsSerializedSize = i5 + cuirassedVar.getUnknownFieldsSerializedSize(cuirassedVar.unknownFieldSchema, t2);
        return cuirassedVar.hasExtensions ? unknownFieldsSerializedSize + cuirassedVar.extensionSchema.getExtensions(t2).getSerializedSize() : unknownFieldsSerializedSize;
    }

    @Override // com.google.protobuf.seminary
    public int hashCode(T t) {
        int i;
        int iHashLong;
        int length = this.buffer.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i3);
            int iNumberAt = numberAt(i3);
            long jOffset = offset(iTypeAndOffsetAt);
            int iHashCode = 37;
            switch (type(iTypeAndOffsetAt)) {
                case 0:
                    i = i2 * 53;
                    iHashLong = Internal.hashLong(Double.doubleToLongBits(walach.getDouble(t, jOffset)));
                    i2 = i + iHashLong;
                    break;
                case 1:
                    i = i2 * 53;
                    iHashLong = Float.floatToIntBits(walach.getFloat(t, jOffset));
                    i2 = i + iHashLong;
                    break;
                case 2:
                    i = i2 * 53;
                    iHashLong = Internal.hashLong(walach.getLong(t, jOffset));
                    i2 = i + iHashLong;
                    break;
                case 3:
                    i = i2 * 53;
                    iHashLong = Internal.hashLong(walach.getLong(t, jOffset));
                    i2 = i + iHashLong;
                    break;
                case 4:
                    i = i2 * 53;
                    iHashLong = walach.getInt(t, jOffset);
                    i2 = i + iHashLong;
                    break;
                case 5:
                    i = i2 * 53;
                    iHashLong = Internal.hashLong(walach.getLong(t, jOffset));
                    i2 = i + iHashLong;
                    break;
                case 6:
                    i = i2 * 53;
                    iHashLong = walach.getInt(t, jOffset);
                    i2 = i + iHashLong;
                    break;
                case 7:
                    i = i2 * 53;
                    iHashLong = Internal.hashBoolean(walach.getBoolean(t, jOffset));
                    i2 = i + iHashLong;
                    break;
                case 8:
                    i = i2 * 53;
                    iHashLong = ((String) walach.getObject(t, jOffset)).hashCode();
                    i2 = i + iHashLong;
                    break;
                case 9:
                    Object object = walach.getObject(t, jOffset);
                    if (object != null) {
                        iHashCode = object.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 10:
                    i = i2 * 53;
                    iHashLong = walach.getObject(t, jOffset).hashCode();
                    i2 = i + iHashLong;
                    break;
                case 11:
                    i = i2 * 53;
                    iHashLong = walach.getInt(t, jOffset);
                    i2 = i + iHashLong;
                    break;
                case 12:
                    i = i2 * 53;
                    iHashLong = walach.getInt(t, jOffset);
                    i2 = i + iHashLong;
                    break;
                case 13:
                    i = i2 * 53;
                    iHashLong = walach.getInt(t, jOffset);
                    i2 = i + iHashLong;
                    break;
                case 14:
                    i = i2 * 53;
                    iHashLong = Internal.hashLong(walach.getLong(t, jOffset));
                    i2 = i + iHashLong;
                    break;
                case 15:
                    i = i2 * 53;
                    iHashLong = walach.getInt(t, jOffset);
                    i2 = i + iHashLong;
                    break;
                case 16:
                    i = i2 * 53;
                    iHashLong = Internal.hashLong(walach.getLong(t, jOffset));
                    i2 = i + iHashLong;
                    break;
                case 17:
                    Object object2 = walach.getObject(t, jOffset);
                    if (object2 != null) {
                        iHashCode = object2.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
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
                    i = i2 * 53;
                    iHashLong = walach.getObject(t, jOffset).hashCode();
                    i2 = i + iHashLong;
                    break;
                case 50:
                    i = i2 * 53;
                    iHashLong = walach.getObject(t, jOffset).hashCode();
                    i2 = i + iHashLong;
                    break;
                case 51:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = Internal.hashLong(Double.doubleToLongBits(oneofDoubleAt(t, jOffset)));
                        i2 = i + iHashLong;
                    }
                    break;
                case 52:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = Float.floatToIntBits(oneofFloatAt(t, jOffset));
                        i2 = i + iHashLong;
                    }
                    break;
                case 53:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t, jOffset));
                        i2 = i + iHashLong;
                    }
                    break;
                case 54:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t, jOffset));
                        i2 = i + iHashLong;
                    }
                    break;
                case 55:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = oneofIntAt(t, jOffset);
                        i2 = i + iHashLong;
                    }
                    break;
                case 56:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t, jOffset));
                        i2 = i + iHashLong;
                    }
                    break;
                case 57:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = oneofIntAt(t, jOffset);
                        i2 = i + iHashLong;
                    }
                    break;
                case 58:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = Internal.hashBoolean(oneofBooleanAt(t, jOffset));
                        i2 = i + iHashLong;
                    }
                    break;
                case 59:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = ((String) walach.getObject(t, jOffset)).hashCode();
                        i2 = i + iHashLong;
                    }
                    break;
                case 60:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = walach.getObject(t, jOffset).hashCode();
                        i2 = i + iHashLong;
                    }
                    break;
                case 61:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = walach.getObject(t, jOffset).hashCode();
                        i2 = i + iHashLong;
                    }
                    break;
                case 62:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = oneofIntAt(t, jOffset);
                        i2 = i + iHashLong;
                    }
                    break;
                case 63:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = oneofIntAt(t, jOffset);
                        i2 = i + iHashLong;
                    }
                    break;
                case 64:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = oneofIntAt(t, jOffset);
                        i2 = i + iHashLong;
                    }
                    break;
                case 65:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t, jOffset));
                        i2 = i + iHashLong;
                    }
                    break;
                case 66:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = oneofIntAt(t, jOffset);
                        i2 = i + iHashLong;
                    }
                    break;
                case 67:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t, jOffset));
                        i2 = i + iHashLong;
                    }
                    break;
                case 68:
                    if (isOneofPresent(t, iNumberAt, i3)) {
                        i = i2 * 53;
                        iHashLong = walach.getObject(t, jOffset).hashCode();
                        i2 = i + iHashLong;
                    }
                    break;
            }
        }
        int iHashCode2 = (i2 * 53) + this.unknownFieldSchema.getFromMessage(t).hashCode();
        return this.hasExtensions ? (iHashCode2 * 53) + this.extensionSchema.getExtensions(t).hashCode() : iHashCode2;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0094 A[SYNTHETIC] */
    @Override // com.google.protobuf.seminary
    public final boolean isInitialized(T t) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < this.checkInitializedCount) {
            int i6 = this.intArray[i4];
            int iNumberAt = numberAt(i6);
            int iTypeAndOffsetAt = typeAndOffsetAt(i6);
            int i7 = this.buffer[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i3) {
                if (i8 != 1048575) {
                    i5 = UNSAFE.getInt(t, i8);
                }
                i2 = i5;
                i = i8;
            } else {
                i = i3;
                i2 = i5;
            }
            T t2 = t;
            if (isRequired(iTypeAndOffsetAt) && !isFieldPresent(t2, i6, i, i2, i9)) {
                return false;
            }
            int iType = type(iTypeAndOffsetAt);
            if (iType == 9 || iType == 17) {
                if (isFieldPresent(t2, i6, i, i2, i9) && !isInitialized(t2, iTypeAndOffsetAt, getMessageFieldSchema(i6))) {
                    return false;
                }
            } else if (iType == 27) {
                if (!isListInitialized(t2, iTypeAndOffsetAt, i6)) {
                    return false;
                }
            } else if (iType == 60 || iType == 68) {
                if (isOneofPresent(t2, iNumberAt, i6) && !isInitialized(t2, iTypeAndOffsetAt, getMessageFieldSchema(i6))) {
                    return false;
                }
            } else if (iType != 49) {
                if (iType == 50 && !isMapInitialized(t2, iTypeAndOffsetAt, i6)) {
                    return false;
                }
            } else if (!isListInitialized(t2, iTypeAndOffsetAt, i6)) {
                return false;
            }
            i4++;
            t = t2;
            i3 = i;
            i5 = i2;
        }
        return !this.hasExtensions || this.extensionSchema.getExtensions(t).isInitialized();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x007d A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.seminary
    public void makeImmutable(T t) {
        if (isMutable(t)) {
            if (t instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t;
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
                    if (iType != 60 && iType != 68) {
                        switch (iType) {
                            case 17:
                                if (isFieldPresent(t, i)) {
                                    getMessageFieldSchema(i).makeImmutable(UNSAFE.getObject(t, jOffset));
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
                                this.listFieldSchema.makeImmutableListAt(t, jOffset);
                                break;
                            case 50:
                                Unsafe unsafe = UNSAFE;
                                Object object = unsafe.getObject(t, jOffset);
                                if (object != null) {
                                    unsafe.putObject(t, jOffset, this.mapFieldSchema.toImmutable(object));
                                }
                                break;
                        }
                    } else if (isOneofPresent(t, numberAt(i), i)) {
                        getMessageFieldSchema(i).makeImmutable(UNSAFE.getObject(t, jOffset));
                    }
                } else if (isFieldPresent(t, i)) {
                    getMessageFieldSchema(i).makeImmutable(UNSAFE.getObject(t, jOffset));
                }
            }
            this.unknownFieldSchema.makeImmutable(t);
            if (this.hasExtensions) {
                this.extensionSchema.makeImmutable(t);
            }
        }
    }

    @Override // com.google.protobuf.seminary
    public void mergeFrom(T t, T t2) {
        checkMutable(t);
        t2.getClass();
        for (int i = 0; i < this.buffer.length; i += 3) {
            mergeSingleField(t, t2, i);
        }
        saran.mergeUnknownFields(this.unknownFieldSchema, t, t2);
        if (this.hasExtensions) {
            saran.mergeExtensions(this.extensionSchema, t, t2);
        }
    }

    @Override // com.google.protobuf.seminary
    public T newInstance() {
        return (T) this.newInstanceSchema.newInstance(this.defaultInstance);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12321. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public int parseMessage(T r27, byte[] r28, int r29, int r30, int r31, com.google.protobuf.dern.saneness r32) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.cuirassed.parseMessage(java.lang.Object, byte[], int, int, int, com.google.protobuf.dern$saneness):int");
    }

    @Override // com.google.protobuf.seminary
    public void writeTo(T t, Writer writer) throws IOException {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            writeFieldsInDescendingOrder(t, writer);
        } else {
            writeFieldsInAscendingOrder(t, writer);
        }
    }

    private boolean isFieldPresent(T t, int i) {
        boolean zEquals;
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i);
        long j = 1048575 & iPresenceMaskAndOffsetAt;
        if (j != 1048575) {
            return (walach.getInt(t, j) & (1 << (iPresenceMaskAndOffsetAt >>> 20))) != 0;
        }
        int iTypeAndOffsetAt = typeAndOffsetAt(i);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                return Double.doubleToRawLongBits(walach.getDouble(t, jOffset)) != 0;
            case 1:
                return Float.floatToRawIntBits(walach.getFloat(t, jOffset)) != 0;
            case 2:
                return walach.getLong(t, jOffset) != 0;
            case 3:
                return walach.getLong(t, jOffset) != 0;
            case 4:
                return walach.getInt(t, jOffset) != 0;
            case 5:
                return walach.getLong(t, jOffset) != 0;
            case 6:
                return walach.getInt(t, jOffset) != 0;
            case 7:
                return walach.getBoolean(t, jOffset);
            case 8:
                Object object = walach.getObject(t, jOffset);
                if (object instanceof String) {
                    zEquals = ((String) object).isEmpty();
                } else {
                    if (!(object instanceof ByteString)) {
                        throw new IllegalArgumentException();
                    }
                    zEquals = ByteString.EMPTY.equals(object);
                }
                break;
            case 9:
                return walach.getObject(t, jOffset) != null;
            case 10:
                zEquals = ByteString.EMPTY.equals(walach.getObject(t, jOffset));
                break;
            case 11:
                return walach.getInt(t, jOffset) != 0;
            case 12:
                return walach.getInt(t, jOffset) != 0;
            case 13:
                return walach.getInt(t, jOffset) != 0;
            case 14:
                return walach.getLong(t, jOffset) != 0;
            case 15:
                return walach.getInt(t, jOffset) != 0;
            case 16:
                return walach.getLong(t, jOffset) != 0;
            case 17:
                return walach.getObject(t, jOffset) != null;
            default:
                throw new IllegalArgumentException();
        }
        return !zEquals;
    }

    private int positionForFieldNumber(int i, int i2) {
        if (i < this.minFieldNumber || i > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i, i2);
    }

    @Override // com.google.protobuf.seminary
    public void mergeFrom(T t, polder polderVar, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        extensionRegistryLite.getClass();
        checkMutable(t);
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, t, polderVar, extensionRegistryLite);
    }

    private boolean equals(T t, T t2, int i) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                return arePresentForEquals(t, t2, i) && Double.doubleToLongBits(walach.getDouble(t, jOffset)) == Double.doubleToLongBits(walach.getDouble(t2, jOffset));
            case 1:
                return arePresentForEquals(t, t2, i) && Float.floatToIntBits(walach.getFloat(t, jOffset)) == Float.floatToIntBits(walach.getFloat(t2, jOffset));
            case 2:
                return arePresentForEquals(t, t2, i) && walach.getLong(t, jOffset) == walach.getLong(t2, jOffset);
            case 3:
                return arePresentForEquals(t, t2, i) && walach.getLong(t, jOffset) == walach.getLong(t2, jOffset);
            case 4:
                return arePresentForEquals(t, t2, i) && walach.getInt(t, jOffset) == walach.getInt(t2, jOffset);
            case 5:
                return arePresentForEquals(t, t2, i) && walach.getLong(t, jOffset) == walach.getLong(t2, jOffset);
            case 6:
                return arePresentForEquals(t, t2, i) && walach.getInt(t, jOffset) == walach.getInt(t2, jOffset);
            case 7:
                return arePresentForEquals(t, t2, i) && walach.getBoolean(t, jOffset) == walach.getBoolean(t2, jOffset);
            case 8:
                return arePresentForEquals(t, t2, i) && saran.safeEquals(walach.getObject(t, jOffset), walach.getObject(t2, jOffset));
            case 9:
                return arePresentForEquals(t, t2, i) && saran.safeEquals(walach.getObject(t, jOffset), walach.getObject(t2, jOffset));
            case 10:
                return arePresentForEquals(t, t2, i) && saran.safeEquals(walach.getObject(t, jOffset), walach.getObject(t2, jOffset));
            case 11:
                return arePresentForEquals(t, t2, i) && walach.getInt(t, jOffset) == walach.getInt(t2, jOffset);
            case 12:
                return arePresentForEquals(t, t2, i) && walach.getInt(t, jOffset) == walach.getInt(t2, jOffset);
            case 13:
                return arePresentForEquals(t, t2, i) && walach.getInt(t, jOffset) == walach.getInt(t2, jOffset);
            case 14:
                return arePresentForEquals(t, t2, i) && walach.getLong(t, jOffset) == walach.getLong(t2, jOffset);
            case 15:
                return arePresentForEquals(t, t2, i) && walach.getInt(t, jOffset) == walach.getInt(t2, jOffset);
            case 16:
                return arePresentForEquals(t, t2, i) && walach.getLong(t, jOffset) == walach.getLong(t2, jOffset);
            case 17:
                return arePresentForEquals(t, t2, i) && saran.safeEquals(walach.getObject(t, jOffset), walach.getObject(t2, jOffset));
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
                return saran.safeEquals(walach.getObject(t, jOffset), walach.getObject(t2, jOffset));
            case 50:
                return saran.safeEquals(walach.getObject(t, jOffset), walach.getObject(t2, jOffset));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return isOneofCaseEqual(t, t2, i) && saran.safeEquals(walach.getObject(t, jOffset), walach.getObject(t2, jOffset));
            default:
                return true;
        }
    }

    @Override // com.google.protobuf.seminary
    public void mergeFrom(T t, byte[] bArr, int i, int i2, dern.saneness sanenessVar) throws IOException {
        parseMessage(t, bArr, i, i2, 0, sanenessVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isInitialized(Object obj, int i, seminary seminaryVar) {
        return seminaryVar.isInitialized(walach.getObject(obj, offset(i)));
    }
}
