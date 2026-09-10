package com.google.protobuf;

import androidx.datastore.preferences.protobuf.a;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
final class MessageSchema<T> implements Schema<T> {
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
    private final ExtensionSchema<?> extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final ListFieldSchema listFieldSchema;
    private final boolean lite;
    private final MapFieldSchema mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final NewInstanceSchema newInstanceSchema;
    private final Object[] objects;
    private final int repeatedFieldOffsetStart;
    private final ProtoSyntax syntax;
    private final UnknownFieldSchema<?, ?> unknownFieldSchema;
    private final boolean useCachedSizeField;
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Unsafe UNSAFE = UnsafeUtil.getUnsafe();

    /* JADX INFO: renamed from: com.google.protobuf.MessageSchema$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
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

    private MessageSchema(int[] iArr, Object[] objArr, int i2, int i3, MessageLite messageLite, ProtoSyntax protoSyntax, boolean z2, int[] iArr2, int i4, int i5, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        this.buffer = iArr;
        this.objects = objArr;
        this.minFieldNumber = i2;
        this.maxFieldNumber = i3;
        this.lite = messageLite instanceof GeneratedMessageLite;
        this.syntax = protoSyntax;
        this.hasExtensions = extensionSchema != null && extensionSchema.hasExtensions(messageLite);
        this.useCachedSizeField = z2;
        this.intArray = iArr2;
        this.checkInitializedCount = i4;
        this.repeatedFieldOffsetStart = i5;
        this.newInstanceSchema = newInstanceSchema;
        this.listFieldSchema = listFieldSchema;
        this.unknownFieldSchema = unknownFieldSchema;
        this.extensionSchema = extensionSchema;
        this.defaultInstance = messageLite;
        this.mapFieldSchema = mapFieldSchema;
    }

    private boolean arePresentForEquals(T t, T t2, int i2) {
        return isFieldPresent(t, i2) == isFieldPresent(t2, i2);
    }

    private static <T> boolean booleanAt(T t, long j) {
        return UnsafeUtil.getBoolean(t, j);
    }

    private static void checkMutable(Object obj) {
        if (isMutable(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <K, V> int decodeMapEntry(byte[] bArr, int i2, int i3, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map, ArrayDecoders.Registers registers) throws IOException {
        int iDecodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i2, registers);
        int i4 = registers.int1;
        if (i4 < 0 || i4 > i3 - iDecodeVarint32) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i5 = iDecodeVarint32 + i4;
        Object obj = metadata.defaultKey;
        Object obj2 = metadata.defaultValue;
        while (iDecodeVarint32 < i5) {
            int iDecodeVarint33 = iDecodeVarint32 + 1;
            int i6 = bArr[iDecodeVarint32];
            if (i6 < 0) {
                iDecodeVarint33 = ArrayDecoders.decodeVarint32(i6, bArr, iDecodeVarint33, registers);
                i6 = registers.int1;
            }
            int i7 = iDecodeVarint33;
            int i8 = i6 >>> 3;
            int i9 = i6 & 7;
            if (i8 != 1) {
                if (i8 == 2 && i9 == metadata.valueType.getWireType()) {
                    iDecodeVarint32 = decodeMapEntryValue(bArr, i7, i3, metadata.valueType, metadata.defaultValue.getClass(), registers);
                    obj2 = registers.object1;
                } else {
                    iDecodeVarint32 = ArrayDecoders.skipField(i6, bArr, i7, i3, registers);
                }
            } else if (i9 == metadata.keyType.getWireType()) {
                iDecodeVarint32 = decodeMapEntryValue(bArr, i7, i3, metadata.keyType, null, registers);
                obj = registers.object1;
            } else {
                iDecodeVarint32 = ArrayDecoders.skipField(i6, bArr, i7, i3, registers);
            }
        }
        if (iDecodeVarint32 != i5) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        map.put(obj, obj2);
        return i5;
    }

    private int decodeMapEntryValue(byte[] bArr, int i2, int i3, WireFormat.FieldType fieldType, Class<?> cls, ArrayDecoders.Registers registers) throws IOException {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                int iDecodeVarint64 = ArrayDecoders.decodeVarint64(bArr, i2, registers);
                registers.object1 = Boolean.valueOf(registers.long1 != 0);
                return iDecodeVarint64;
            case 2:
                return ArrayDecoders.decodeBytes(bArr, i2, registers);
            case 3:
                registers.object1 = Double.valueOf(ArrayDecoders.decodeDouble(bArr, i2));
                return i2 + 8;
            case 4:
            case 5:
                registers.object1 = Integer.valueOf(ArrayDecoders.decodeFixed32(bArr, i2));
                return i2 + 4;
            case 6:
            case 7:
                registers.object1 = Long.valueOf(ArrayDecoders.decodeFixed64(bArr, i2));
                return i2 + 8;
            case 8:
                registers.object1 = Float.valueOf(ArrayDecoders.decodeFloat(bArr, i2));
                return i2 + 4;
            case 9:
            case 10:
            case 11:
                int iDecodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i2, registers);
                registers.object1 = Integer.valueOf(registers.int1);
                return iDecodeVarint32;
            case 12:
            case 13:
                int iDecodeVarint65 = ArrayDecoders.decodeVarint64(bArr, i2, registers);
                registers.object1 = Long.valueOf(registers.long1);
                return iDecodeVarint65;
            case 14:
                return ArrayDecoders.decodeMessageField(Protobuf.getInstance().schemaFor((Class) cls), bArr, i2, i3, registers);
            case 15:
                int iDecodeVarint33 = ArrayDecoders.decodeVarint32(bArr, i2, registers);
                registers.object1 = Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1));
                return iDecodeVarint33;
            case 16:
                int iDecodeVarint66 = ArrayDecoders.decodeVarint64(bArr, i2, registers);
                registers.object1 = Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1));
                return iDecodeVarint66;
            case 17:
                return ArrayDecoders.decodeStringRequireUtf8(bArr, i2, registers);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static <T> double doubleAt(T t, long j) {
        return UnsafeUtil.getDouble(t, j);
    }

    private <UT, UB> UB filterMapUnknownEnumValues(Object obj, int i2, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema, Object obj2) {
        Internal.EnumVerifier enumFieldVerifier;
        int iNumberAt = numberAt(i2);
        Object object = UnsafeUtil.getObject(obj, offset(typeAndOffsetAt(i2)));
        return (object == null || (enumFieldVerifier = getEnumFieldVerifier(i2)) == null) ? ub : (UB) filterUnknownEnumMap(i2, iNumberAt, this.mapFieldSchema.forMutableMapData(object), enumFieldVerifier, ub, unknownFieldSchema, obj2);
    }

    private <K, V, UT, UB> UB filterUnknownEnumMap(int i2, int i3, Map<K, V> map, Internal.EnumVerifier enumVerifier, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema, Object obj) {
        MapEntryLite.Metadata<?, ?> metadataForMapMetadata = this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i2));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!enumVerifier.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = unknownFieldSchema.getBuilderFromMessage(obj);
                }
                ByteString.CodedBuilder codedBuilderNewCodedBuilder = ByteString.newCodedBuilder(MapEntryLite.computeSerializedSize(metadataForMapMetadata, next.getKey(), next.getValue()));
                try {
                    MapEntryLite.writeTo(codedBuilderNewCodedBuilder.getCodedOutput(), metadataForMapMetadata, next.getKey(), next.getValue());
                    unknownFieldSchema.addLengthDelimited(ub, i3, codedBuilderNewCodedBuilder.build());
                    it.remove();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return ub;
    }

    private static <T> float floatAt(T t, long j) {
        return UnsafeUtil.getFloat(t, j);
    }

    private Internal.EnumVerifier getEnumFieldVerifier(int i2) {
        return (Internal.EnumVerifier) this.objects[a.a(i2, 3, 2, 1)];
    }

    private Object getMapFieldDefaultEntry(int i2) {
        return this.objects[(i2 / 3) * 2];
    }

    private Schema getMessageFieldSchema(int i2) {
        int i3 = (i2 / 3) * 2;
        Schema schema = (Schema) this.objects[i3];
        if (schema != null) {
            return schema;
        }
        Schema<T> schemaSchemaFor = Protobuf.getInstance().schemaFor((Class) this.objects[i3 + 1]);
        this.objects[i3] = schemaSchemaFor;
        return schemaSchemaFor;
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

    private <UT, UB> int getUnknownFieldsSerializedSize(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t) {
        return unknownFieldSchema.getSerializedSize(unknownFieldSchema.getFromMessage(t));
    }

    private static <T> int intAt(T t, long j) {
        return UnsafeUtil.getInt(t, j);
    }

    private static boolean isEnforceUtf8(int i2) {
        return (i2 & ENFORCE_UTF8_MASK) != 0;
    }

    private boolean isFieldPresent(T t, int i2, int i3, int i4, int i5) {
        if (i3 == 1048575) {
            return isFieldPresent(t, i2);
        }
        return (i4 & i5) != 0;
    }

    private static boolean isLegacyEnumIsClosed(int i2) {
        return (i2 & Integer.MIN_VALUE) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean isListInitialized(Object obj, int i2, int i3) {
        List list = (List) UnsafeUtil.getObject(obj, offset(i2));
        if (list.isEmpty()) {
            return true;
        }
        Schema messageFieldSchema = getMessageFieldSchema(i3);
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (!messageFieldSchema.isInitialized(list.get(i4))) {
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
    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.protobuf.Schema] */
    private boolean isMapInitialized(T t, int i2, int i3) {
        Map<?, ?> mapForMapData = this.mapFieldSchema.forMapData(UnsafeUtil.getObject(t, offset(i2)));
        if (mapForMapData.isEmpty()) {
            return true;
        }
        if (this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i3)).valueType.getJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        ?? SchemaFor = 0;
        for (Object obj : mapForMapData.values()) {
            if (SchemaFor == 0) {
                SchemaFor = SchemaFor;
                SchemaFor = Protobuf.getInstance().schemaFor((Class) obj.getClass());
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

    private boolean isOneofCaseEqual(T t, T t2, int i2) {
        long jPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i2) & 1048575;
        return UnsafeUtil.getInt(t, jPresenceMaskAndOffsetAt) == UnsafeUtil.getInt(t2, jPresenceMaskAndOffsetAt);
    }

    private boolean isOneofPresent(T t, int i2, int i3) {
        return UnsafeUtil.getInt(t, (long) (presenceMaskAndOffsetAt(i3) & 1048575)) == i2;
    }

    private static boolean isRequired(int i2) {
        return (i2 & REQUIRED_MASK) != 0;
    }

    private static <T> long longAt(T t, long j) {
        return UnsafeUtil.getLong(t, j);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 20401. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    private <UT, UB, ET extends com.google.protobuf.FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(com.google.protobuf.UnknownFieldSchema<UT, UB> r18, com.google.protobuf.ExtensionSchema<ET> r19, T r20, com.google.protobuf.Reader r21, com.google.protobuf.ExtensionRegistryLite r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 2040
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.mergeFromHelper(com.google.protobuf.UnknownFieldSchema, com.google.protobuf.ExtensionSchema, java.lang.Object, com.google.protobuf.Reader, com.google.protobuf.ExtensionRegistryLite):void");
    }

    private final <K, V> void mergeMap(Object obj, int i2, Object obj2, ExtensionRegistryLite extensionRegistryLite, Reader reader) throws IOException {
        long jOffset = offset(typeAndOffsetAt(i2));
        Object object = UnsafeUtil.getObject(obj, jOffset);
        if (object == null) {
            object = this.mapFieldSchema.newMapField(obj2);
            UnsafeUtil.putObject(obj, jOffset, object);
        } else if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(obj2);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            UnsafeUtil.putObject(obj, jOffset, objNewMapField);
            object = objNewMapField;
        }
        reader.readMap(this.mapFieldSchema.forMutableMapData(object), this.mapFieldSchema.forMapMetadata(obj2), extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeMessage(T t, T t2, int i2) {
        if (isFieldPresent(t2, i2)) {
            long jOffset = offset(typeAndOffsetAt(i2));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(t2, jOffset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(i2) + " is present but null: " + t2);
            }
            Schema messageFieldSchema = getMessageFieldSchema(i2);
            if (!isFieldPresent(t, i2)) {
                if (isMutable(object)) {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t, jOffset, objNewInstance);
                } else {
                    unsafe.putObject(t, jOffset, object);
                }
                setFieldPresent(t, i2);
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
    private void mergeOneofMessage(T t, T t2, int i2) {
        int iNumberAt = numberAt(i2);
        if (isOneofPresent(t2, iNumberAt, i2)) {
            long jOffset = offset(typeAndOffsetAt(i2));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(t2, jOffset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(i2) + " is present but null: " + t2);
            }
            Schema messageFieldSchema = getMessageFieldSchema(i2);
            if (!isOneofPresent(t, iNumberAt, i2)) {
                if (isMutable(object)) {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t, jOffset, objNewInstance);
                } else {
                    unsafe.putObject(t, jOffset, object);
                }
                setOneofPresent(t, iNumberAt, i2);
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

    private void mergeSingleField(T t, T t2, int i2) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i2);
        long jOffset = offset(iTypeAndOffsetAt);
        int iNumberAt = numberAt(i2);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                if (isFieldPresent(t2, i2)) {
                    UnsafeUtil.putDouble(t, jOffset, UnsafeUtil.getDouble(t2, jOffset));
                    setFieldPresent(t, i2);
                }
                break;
            case 1:
                if (isFieldPresent(t2, i2)) {
                    UnsafeUtil.putFloat(t, jOffset, UnsafeUtil.getFloat(t2, jOffset));
                    setFieldPresent(t, i2);
                }
                break;
            case 2:
                if (isFieldPresent(t2, i2)) {
                    UnsafeUtil.putLong(t, jOffset, UnsafeUtil.getLong(t2, jOffset));
                    setFieldPresent(t, i2);
                }
                break;
            case 3:
                if (isFieldPresent(t2, i2)) {
                    UnsafeUtil.putLong(t, jOffset, UnsafeUtil.getLong(t2, jOffset));
                    setFieldPresent(t, i2);
                }
                break;
            case 4:
                if (isFieldPresent(t2, i2)) {
                    UnsafeUtil.putInt(t, jOffset, UnsafeUtil.getInt(t2, jOffset));
                    setFieldPresent(t, i2);
                }
                break;
            case 5:
                if (isFieldPresent(t2, i2)) {
                    UnsafeUtil.putLong(t, jOffset, UnsafeUtil.getLong(t2, jOffset));
                    setFieldPresent(t, i2);
                }
                break;
            case 6:
                if (isFieldPresent(t2, i2)) {
                    UnsafeUtil.putInt(t, jOffset, UnsafeUtil.getInt(t2, jOffset));
                    setFieldPresent(t, i2);
                }
                break;
            case 7:
                if (isFieldPresent(t2, i2)) {
                    UnsafeUtil.putBoolean(t, jOffset, UnsafeUtil.getBoolean(t2, jOffset));
                    setFieldPresent(t, i2);
                }
                break;
            case 8:
                if (isFieldPresent(t2, i2)) {
                    UnsafeUtil.putObject(t, jOffset, UnsafeUtil.getObject(t2, jOffset));
                    setFieldPresent(t, i2);
                }
                break;
            case 9:
                mergeMessage(t, t2, i2);
                break;
            case 10:
                if (isFieldPresent(t2, i2)) {
                    UnsafeUtil.putObject(t, jOffset, UnsafeUtil.getObject(t2, jOffset));
                    setFieldPresent(t, i2);
                }
                break;
            case 11:
                if (isFieldPresent(t2, i2)) {
                    UnsafeUtil.putInt(t, jOffset, UnsafeUtil.getInt(t2, jOffset));
                    setFieldPresent(t, i2);
                }
                break;
            case 12:
                if (isFieldPresent(t2, i2)) {
                    UnsafeUtil.putInt(t, jOffset, UnsafeUtil.getInt(t2, jOffset));
                    setFieldPresent(t, i2);
                }
                break;
            case 13:
                if (isFieldPresent(t2, i2)) {
                    UnsafeUtil.putInt(t, jOffset, UnsafeUtil.getInt(t2, jOffset));
                    setFieldPresent(t, i2);
                }
                break;
            case 14:
                if (isFieldPresent(t2, i2)) {
                    UnsafeUtil.putLong(t, jOffset, UnsafeUtil.getLong(t2, jOffset));
                    setFieldPresent(t, i2);
                }
                break;
            case 15:
                if (isFieldPresent(t2, i2)) {
                    UnsafeUtil.putInt(t, jOffset, UnsafeUtil.getInt(t2, jOffset));
                    setFieldPresent(t, i2);
                }
                break;
            case 16:
                if (isFieldPresent(t2, i2)) {
                    UnsafeUtil.putLong(t, jOffset, UnsafeUtil.getLong(t2, jOffset));
                    setFieldPresent(t, i2);
                }
                break;
            case 17:
                mergeMessage(t, t2, i2);
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
                SchemaUtil.mergeMap(this.mapFieldSchema, t, t2, jOffset);
                break;
            case 51:
            case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
            case 53:
            case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
            case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
            case 56:
            case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
            case 58:
            case 59:
                if (isOneofPresent(t2, iNumberAt, i2)) {
                    UnsafeUtil.putObject(t, jOffset, UnsafeUtil.getObject(t2, jOffset));
                    setOneofPresent(t, iNumberAt, i2);
                }
                break;
            case 60:
                mergeOneofMessage(t, t2, i2);
                break;
            case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
            case 62:
            case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
            case 64:
            case 65:
            case 66:
            case 67:
                if (isOneofPresent(t2, iNumberAt, i2)) {
                    UnsafeUtil.putObject(t, jOffset, UnsafeUtil.getObject(t2, jOffset));
                    setOneofPresent(t, iNumberAt, i2);
                }
                break;
            case 68:
                mergeOneofMessage(t, t2, i2);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableMessageFieldForMerge(T t, int i2) {
        Schema messageFieldSchema = getMessageFieldSchema(i2);
        long jOffset = offset(typeAndOffsetAt(i2));
        if (!isFieldPresent(t, i2)) {
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
    private Object mutableOneofMessageFieldForMerge(T t, int i2, int i3) {
        Schema messageFieldSchema = getMessageFieldSchema(i3);
        if (!isOneofPresent(t, i2, i3)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(t, offset(typeAndOffsetAt(i3)));
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    public static <T> MessageSchema<T> newSchema(Class<T> cls, MessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        return messageInfo instanceof RawMessageInfo ? newSchemaForRawMessageInfo((RawMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema) : newSchemaForMessageInfo((StructuralMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    public static <T> MessageSchema<T> newSchemaForMessageInfo(StructuralMessageInfo structuralMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
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
        int i2 = 0;
        int i3 = 0;
        for (FieldInfo fieldInfo : fields) {
            if (fieldInfo.getType() == FieldType.MAP) {
                i2++;
            } else if (fieldInfo.getType().id() >= 18 && fieldInfo.getType().id() <= 49) {
                i3++;
            }
        }
        int[] iArr2 = i2 > 0 ? new int[i2] : null;
        int[] iArr3 = i3 > 0 ? new int[i3] : null;
        int[] checkInitialized = structuralMessageInfo.getCheckInitialized();
        if (checkInitialized == null) {
            checkInitialized = EMPTY_INT_ARRAY;
        }
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i4 < fields.length) {
            FieldInfo fieldInfo2 = fields[i4];
            int fieldNumber3 = fieldInfo2.getFieldNumber();
            storeFieldData(fieldInfo2, iArr, i5, objArr);
            if (i6 < checkInitialized.length && checkInitialized[i6] == fieldNumber3) {
                checkInitialized[i6] = i5;
                i6++;
            }
            if (fieldInfo2.getType() == FieldType.MAP) {
                iArr2[i7] = i5;
                i7++;
            } else {
                if (fieldInfo2.getType().id() >= 18 && fieldInfo2.getType().id() <= 49) {
                    iArr3[i8] = (int) UnsafeUtil.objectFieldOffset(fieldInfo2.getField());
                    i8++;
                }
                i4++;
                i5 += 3;
            }
            i4++;
            i5 += 3;
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
        return new MessageSchema<>(iArr, objArr, fieldNumber, fieldNumber2, structuralMessageInfo.getDefaultInstance(), structuralMessageInfo.getSyntax(), true, iArr4, checkInitialized.length, checkInitialized.length + iArr2.length, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    /* JADX WARN: Code duplicated, block: B:167:0x0354  */
    /* JADX WARN: Code duplicated, block: B:183:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:186:0x03ad  */
    public static <T> MessageSchema<T> newSchemaForRawMessageInfo(RawMessageInfo rawMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        int i2;
        int iCharAt;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr;
        int i7;
        int i8;
        int i9;
        char cCharAt;
        int i10;
        char cCharAt2;
        int i11;
        char cCharAt3;
        int i12;
        char cCharAt4;
        int i13;
        char cCharAt5;
        int i14;
        char cCharAt6;
        int i15;
        char cCharAt7;
        int i16;
        char cCharAt8;
        int i17;
        int i18;
        int i19;
        int i20;
        int iObjectFieldOffset;
        char c2;
        int iObjectFieldOffset2;
        int i21;
        int i22;
        int i23;
        int i24;
        java.lang.reflect.Field fieldReflectField;
        char cCharAt9;
        int i25;
        java.lang.reflect.Field fieldReflectField2;
        java.lang.reflect.Field fieldReflectField3;
        int i26;
        char cCharAt10;
        int i27;
        char cCharAt11;
        int i28;
        char cCharAt12;
        int i29;
        char cCharAt13;
        String stringInfo = rawMessageInfo.getStringInfo();
        int length = stringInfo.length();
        char c3 = 55296;
        if (stringInfo.charAt(0) >= 55296) {
            int i30 = 1;
            while (true) {
                i2 = i30 + 1;
                if (stringInfo.charAt(i30) < 55296) {
                    break;
                }
                i30 = i2;
            }
        } else {
            i2 = 1;
        }
        int i31 = i2 + 1;
        int iCharAt2 = stringInfo.charAt(i2);
        if (iCharAt2 >= 55296) {
            int i32 = iCharAt2 & 8191;
            int i33 = 13;
            while (true) {
                i29 = i31 + 1;
                cCharAt13 = stringInfo.charAt(i31);
                if (cCharAt13 < 55296) {
                    break;
                }
                i32 |= (cCharAt13 & 8191) << i33;
                i33 += 13;
                i31 = i29;
            }
            iCharAt2 = i32 | (cCharAt13 << i33);
            i31 = i29;
        }
        if (iCharAt2 == 0) {
            i5 = 0;
            iCharAt = 0;
            i4 = 0;
            i8 = 0;
            i3 = 0;
            i7 = 0;
            iArr = EMPTY_INT_ARRAY;
            i6 = 0;
        } else {
            int i34 = i31 + 1;
            int iCharAt3 = stringInfo.charAt(i31);
            if (iCharAt3 >= 55296) {
                int i35 = iCharAt3 & 8191;
                int i36 = 13;
                while (true) {
                    i16 = i34 + 1;
                    cCharAt8 = stringInfo.charAt(i34);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i35 |= (cCharAt8 & 8191) << i36;
                    i36 += 13;
                    i34 = i16;
                }
                iCharAt3 = i35 | (cCharAt8 << i36);
                i34 = i16;
            }
            int i37 = i34 + 1;
            int iCharAt4 = stringInfo.charAt(i34);
            if (iCharAt4 >= 55296) {
                int i38 = iCharAt4 & 8191;
                int i39 = 13;
                while (true) {
                    i15 = i37 + 1;
                    cCharAt7 = stringInfo.charAt(i37);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i38 |= (cCharAt7 & 8191) << i39;
                    i39 += 13;
                    i37 = i15;
                }
                iCharAt4 = i38 | (cCharAt7 << i39);
                i37 = i15;
            }
            int i40 = i37 + 1;
            int iCharAt5 = stringInfo.charAt(i37);
            if (iCharAt5 >= 55296) {
                int i41 = iCharAt5 & 8191;
                int i42 = 13;
                while (true) {
                    i14 = i40 + 1;
                    cCharAt6 = stringInfo.charAt(i40);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i41 |= (cCharAt6 & 8191) << i42;
                    i42 += 13;
                    i40 = i14;
                }
                iCharAt5 = i41 | (cCharAt6 << i42);
                i40 = i14;
            }
            int i43 = i40 + 1;
            int iCharAt6 = stringInfo.charAt(i40);
            if (iCharAt6 >= 55296) {
                int i44 = iCharAt6 & 8191;
                int i45 = 13;
                while (true) {
                    i13 = i43 + 1;
                    cCharAt5 = stringInfo.charAt(i43);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt5 & 8191) << i45;
                    i45 += 13;
                    i43 = i13;
                }
                iCharAt6 = i44 | (cCharAt5 << i45);
                i43 = i13;
            }
            int i46 = i43 + 1;
            iCharAt = stringInfo.charAt(i43);
            if (iCharAt >= 55296) {
                int i47 = iCharAt & 8191;
                int i48 = 13;
                while (true) {
                    i12 = i46 + 1;
                    cCharAt4 = stringInfo.charAt(i46);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt4 & 8191) << i48;
                    i48 += 13;
                    i46 = i12;
                }
                iCharAt = i47 | (cCharAt4 << i48);
                i46 = i12;
            }
            int i49 = i46 + 1;
            int iCharAt7 = stringInfo.charAt(i46);
            if (iCharAt7 >= 55296) {
                int i50 = iCharAt7 & 8191;
                int i51 = 13;
                while (true) {
                    i11 = i49 + 1;
                    cCharAt3 = stringInfo.charAt(i49);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt3 & 8191) << i51;
                    i51 += 13;
                    i49 = i11;
                }
                iCharAt7 = i50 | (cCharAt3 << i51);
                i49 = i11;
            }
            int i52 = i49 + 1;
            int iCharAt8 = stringInfo.charAt(i49);
            if (iCharAt8 >= 55296) {
                int i53 = iCharAt8 & 8191;
                int i54 = 13;
                while (true) {
                    i10 = i52 + 1;
                    cCharAt2 = stringInfo.charAt(i52);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt2 & 8191) << i54;
                    i54 += 13;
                    i52 = i10;
                }
                iCharAt8 = i53 | (cCharAt2 << i54);
                i52 = i10;
            }
            int i55 = i52 + 1;
            int iCharAt9 = stringInfo.charAt(i52);
            if (iCharAt9 >= 55296) {
                int i56 = iCharAt9 & 8191;
                int i57 = 13;
                while (true) {
                    i9 = i55 + 1;
                    cCharAt = stringInfo.charAt(i55);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i56 |= (cCharAt & 8191) << i57;
                    i57 += 13;
                    i55 = i9;
                }
                iCharAt9 = i56 | (cCharAt << i57);
                i55 = i9;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            i3 = (iCharAt3 * 2) + iCharAt4;
            int i58 = iCharAt7;
            i4 = iCharAt5;
            i5 = i58;
            i6 = iCharAt3;
            iArr = iArr2;
            i7 = iCharAt9;
            i31 = i55;
            i8 = iCharAt6;
        }
        Unsafe unsafe = UNSAFE;
        Object[] objects = rawMessageInfo.getObjects();
        Class<?> cls = rawMessageInfo.getDefaultInstance().getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt * 2];
        int i59 = i7 + i5;
        int i60 = i59;
        int i61 = i7;
        int i62 = 0;
        int i63 = 0;
        while (i31 < length) {
            int i64 = i31 + 1;
            int iCharAt10 = stringInfo.charAt(i31);
            if (iCharAt10 >= c3) {
                int i65 = iCharAt10 & 8191;
                int i66 = i64;
                int i67 = 13;
                while (true) {
                    i28 = i66 + 1;
                    cCharAt12 = stringInfo.charAt(i66);
                    if (cCharAt12 < c3) {
                        break;
                    }
                    i65 |= (cCharAt12 & 8191) << i67;
                    i67 += 13;
                    i66 = i28;
                }
                iCharAt10 = i65 | (cCharAt12 << i67);
                i17 = i28;
            } else {
                i17 = i64;
            }
            int i68 = i17 + 1;
            int iCharAt11 = stringInfo.charAt(i17);
            if (iCharAt11 >= c3) {
                int i69 = iCharAt11 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i27 = i70 + 1;
                    cCharAt11 = stringInfo.charAt(i70);
                    i18 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i69 |= (cCharAt11 & 8191) << i71;
                    i71 += 13;
                    i70 = i27;
                    length = i18;
                }
                iCharAt11 = i69 | (cCharAt11 << i71);
                i19 = i27;
            } else {
                i18 = length;
                i19 = i68;
            }
            int i72 = iCharAt11 & 255;
            int[] iArr4 = iArr3;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i63] = i62;
                i63++;
            }
            int i73 = iCharAt10;
            if (i72 >= 51) {
                int i74 = i19 + 1;
                int iCharAt12 = stringInfo.charAt(i19);
                char c4 = 55296;
                if (iCharAt12 >= 55296) {
                    int i75 = iCharAt12 & 8191;
                    int i76 = 13;
                    while (true) {
                        i26 = i74 + 1;
                        cCharAt10 = stringInfo.charAt(i74);
                        if (cCharAt10 < c4) {
                            break;
                        }
                        i75 |= (cCharAt10 & 8191) << i76;
                        i76 += 13;
                        i74 = i26;
                        c4 = 55296;
                    }
                    iCharAt12 = i75 | (cCharAt10 << i76);
                    i74 = i26;
                }
                int i77 = i72 - 51;
                int i78 = iCharAt12;
                if (i77 == 9 || i77 == 17) {
                    objArr[a.a(i62, 3, 2, 1)] = objects[i3];
                    i3++;
                } else if (i77 == 12 && (rawMessageInfo.getSyntax().equals(ProtoSyntax.PROTO2) || (iCharAt11 & 2048) != 0)) {
                    objArr[a.a(i62, 3, 2, 1)] = objects[i3];
                    i3++;
                }
                int i79 = i78 * 2;
                Object obj = objects[i79];
                if (obj instanceof java.lang.reflect.Field) {
                    fieldReflectField2 = (java.lang.reflect.Field) obj;
                } else {
                    fieldReflectField2 = reflectField(cls, (String) obj);
                    objects[i79] = fieldReflectField2;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldReflectField2);
                int i80 = i79 + 1;
                Object obj2 = objects[i80];
                if (obj2 instanceof java.lang.reflect.Field) {
                    fieldReflectField3 = (java.lang.reflect.Field) obj2;
                } else {
                    fieldReflectField3 = reflectField(cls, (String) obj2);
                    objects[i80] = fieldReflectField3;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldReflectField3);
                i59 = i59;
                i31 = i74;
                i24 = iObjectFieldOffset3;
                c2 = 2;
                i6 = i6;
                iCharAt11 = iCharAt11;
                i23 = i3;
                iObjectFieldOffset2 = iObjectFieldOffset4;
                i22 = 0;
            } else {
                int i81 = i3 + 1;
                java.lang.reflect.Field fieldReflectField4 = reflectField(cls, (String) objects[i3]);
                if (i72 == 9 || i72 == 17) {
                    i6 = i6;
                    objArr[a.a(i62, 3, 2, 1)] = fieldReflectField4.getType();
                } else {
                    if (i72 == 27 || i72 == 49) {
                        i6 = i6;
                        i25 = i3 + 2;
                        objArr[a.a(i62, 3, 2, 1)] = objects[i81];
                    } else if (i72 == 12 || i72 == 30 || i72 == 44) {
                        i6 = i6;
                        if (rawMessageInfo.getSyntax() == ProtoSyntax.PROTO2 || (iCharAt11 & 2048) != 0) {
                            i25 = i3 + 2;
                            objArr[a.a(i62, 3, 2, 1)] = objects[i81];
                        }
                    } else {
                        if (i72 == 50) {
                            int i82 = i61 + 1;
                            iArr[i61] = i62;
                            int i83 = (i62 / 3) * 2;
                            int i84 = i3 + 2;
                            objArr[i83] = objects[i81];
                            i61 = i82;
                            if ((iCharAt11 & 2048) != 0) {
                                i20 = i3 + 3;
                                objArr[i83 + 1] = objects[i84];
                            } else {
                                i20 = i84;
                            }
                        } else {
                            i6 = i6;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField4);
                        if ((iCharAt11 & 4096) != 0 || i72 > 17) {
                            c2 = 2;
                            iObjectFieldOffset2 = 1048575;
                            i21 = i19;
                            i22 = 0;
                        } else {
                            int i85 = i19 + 1;
                            int iCharAt13 = stringInfo.charAt(i19);
                            if (iCharAt13 >= 55296) {
                                int i86 = iCharAt13 & 8191;
                                int i87 = 13;
                                while (true) {
                                    i21 = i85 + 1;
                                    cCharAt9 = stringInfo.charAt(i85);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i86 |= (cCharAt9 & 8191) << i87;
                                    i87 += 13;
                                    i85 = i21;
                                }
                                iCharAt13 = i86 | (cCharAt9 << i87);
                            } else {
                                i21 = i85;
                            }
                            c2 = 2;
                            int i88 = (iCharAt13 / 32) + (i6 * 2);
                            Object obj3 = objects[i88];
                            if (obj3 instanceof java.lang.reflect.Field) {
                                fieldReflectField = (java.lang.reflect.Field) obj3;
                            } else {
                                fieldReflectField = reflectField(cls, (String) obj3);
                                objects[i88] = fieldReflectField;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldReflectField);
                            i22 = iCharAt13 % 32;
                        }
                        if (i72 >= 18 && i72 <= 49) {
                            iArr[i60] = iObjectFieldOffset;
                            i60++;
                        }
                        i23 = i20;
                        i24 = iObjectFieldOffset;
                        i31 = i21;
                    }
                    i20 = i25;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField4);
                    if ((iCharAt11 & 4096) != 0) {
                        c2 = 2;
                        iObjectFieldOffset2 = 1048575;
                        i21 = i19;
                        i22 = 0;
                    } else {
                        c2 = 2;
                        iObjectFieldOffset2 = 1048575;
                        i21 = i19;
                        i22 = 0;
                    }
                    if (i72 >= 18) {
                        iArr[i60] = iObjectFieldOffset;
                        i60++;
                    }
                    i23 = i20;
                    i24 = iObjectFieldOffset;
                    i31 = i21;
                }
                i20 = i81;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField4);
                if ((iCharAt11 & 4096) != 0) {
                    c2 = 2;
                    iObjectFieldOffset2 = 1048575;
                    i21 = i19;
                    i22 = 0;
                } else {
                    c2 = 2;
                    iObjectFieldOffset2 = 1048575;
                    i21 = i19;
                    i22 = 0;
                }
                if (i72 >= 18) {
                    iArr[i60] = iObjectFieldOffset;
                    i60++;
                }
                i23 = i20;
                i24 = iObjectFieldOffset;
                i31 = i21;
            }
            int i89 = i62 + 1;
            iArr4[i62] = i73;
            int i90 = i62 + 2;
            String str = stringInfo;
            iArr4[i89] = ((iCharAt11 & 256) != 0 ? REQUIRED_MASK : 0) | ((iCharAt11 & 512) != 0 ? ENFORCE_UTF8_MASK : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i72 << 20) | i24;
            i62 += 3;
            iArr4[i90] = (i22 << 20) | iObjectFieldOffset2;
            i3 = i23;
            i59 = i59;
            iArr3 = iArr4;
            i6 = i6;
            length = i18;
            stringInfo = str;
            c3 = 55296;
        }
        return new MessageSchema<>(iArr3, objArr, i4, i8, rawMessageInfo.getDefaultInstance(), rawMessageInfo.getSyntax(), false, iArr, i7, i59, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    private int numberAt(int i2) {
        return this.buffer[i2];
    }

    private static long offset(int i2) {
        return i2 & 1048575;
    }

    private static <T> boolean oneofBooleanAt(T t, long j) {
        return ((Boolean) UnsafeUtil.getObject(t, j)).booleanValue();
    }

    private static <T> double oneofDoubleAt(T t, long j) {
        return ((Double) UnsafeUtil.getObject(t, j)).doubleValue();
    }

    private static <T> float oneofFloatAt(T t, long j) {
        return ((Float) UnsafeUtil.getObject(t, j)).floatValue();
    }

    private static <T> int oneofIntAt(T t, long j) {
        return ((Integer) UnsafeUtil.getObject(t, j)).intValue();
    }

    private static <T> long oneofLongAt(T t, long j) {
        return ((Long) UnsafeUtil.getObject(t, j)).longValue();
    }

    private <K, V> int parseMapField(T t, byte[] bArr, int i2, int i3, int i4, long j, ArrayDecoders.Registers registers) throws IOException {
        Unsafe unsafe = UNSAFE;
        Object mapFieldDefaultEntry = getMapFieldDefaultEntry(i4);
        Object object = unsafe.getObject(t, j);
        if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(mapFieldDefaultEntry);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            unsafe.putObject(t, j, objNewMapField);
            object = objNewMapField;
        }
        return decodeMapEntry(bArr, i2, i3, this.mapFieldSchema.forMapMetadata(mapFieldDefaultEntry), this.mapFieldSchema.forMutableMapData(object), registers);
    }

    private int parseOneofField(T t, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, int i9, ArrayDecoders.Registers registers) throws IOException {
        Unsafe unsafe = UNSAFE;
        long j2 = this.buffer[i9 + 2] & 1048575;
        switch (i8) {
            case 51:
                if (i6 != 1) {
                    return i2;
                }
                unsafe.putObject(t, j, Double.valueOf(ArrayDecoders.decodeDouble(bArr, i2)));
                int i10 = i2 + 8;
                unsafe.putInt(t, j2, i5);
                return i10;
            case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                if (i6 != 5) {
                    return i2;
                }
                unsafe.putObject(t, j, Float.valueOf(ArrayDecoders.decodeFloat(bArr, i2)));
                int i11 = i2 + 4;
                unsafe.putInt(t, j2, i5);
                return i11;
            case 53:
            case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
                if (i6 != 0) {
                    return i2;
                }
                int iDecodeVarint64 = ArrayDecoders.decodeVarint64(bArr, i2, registers);
                unsafe.putObject(t, j, Long.valueOf(registers.long1));
                unsafe.putInt(t, j2, i5);
                return iDecodeVarint64;
            case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
            case 62:
                if (i6 != 0) {
                    return i2;
                }
                int iDecodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i2, registers);
                unsafe.putObject(t, j, Integer.valueOf(registers.int1));
                unsafe.putInt(t, j2, i5);
                return iDecodeVarint32;
            case 56:
            case 65:
                if (i6 != 1) {
                    return i2;
                }
                unsafe.putObject(t, j, Long.valueOf(ArrayDecoders.decodeFixed64(bArr, i2)));
                int i12 = i2 + 8;
                unsafe.putInt(t, j2, i5);
                return i12;
            case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
            case 64:
                if (i6 != 5) {
                    return i2;
                }
                unsafe.putObject(t, j, Integer.valueOf(ArrayDecoders.decodeFixed32(bArr, i2)));
                int i13 = i2 + 4;
                unsafe.putInt(t, j2, i5);
                return i13;
            case 58:
                if (i6 != 0) {
                    return i2;
                }
                int iDecodeVarint65 = ArrayDecoders.decodeVarint64(bArr, i2, registers);
                unsafe.putObject(t, j, Boolean.valueOf(registers.long1 != 0));
                unsafe.putInt(t, j2, i5);
                return iDecodeVarint65;
            case 59:
                if (i6 != 2) {
                    return i2;
                }
                int iDecodeVarint33 = ArrayDecoders.decodeVarint32(bArr, i2, registers);
                int i14 = registers.int1;
                if (i14 == 0) {
                    unsafe.putObject(t, j, "");
                } else {
                    if ((i7 & ENFORCE_UTF8_MASK) != 0 && !Utf8.isValidUtf8(bArr, iDecodeVarint33, iDecodeVarint33 + i14)) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    unsafe.putObject(t, j, new String(bArr, iDecodeVarint33, i14, Internal.UTF_8));
                    iDecodeVarint33 += i14;
                }
                unsafe.putInt(t, j2, i5);
                return iDecodeVarint33;
            case 60:
                if (i6 != 2) {
                    return i2;
                }
                Object objMutableOneofMessageFieldForMerge = mutableOneofMessageFieldForMerge(t, i5, i9);
                int iMergeMessageField = ArrayDecoders.mergeMessageField(objMutableOneofMessageFieldForMerge, getMessageFieldSchema(i9), bArr, i2, i3, registers);
                storeOneofMessageField(t, i5, i9, objMutableOneofMessageFieldForMerge);
                return iMergeMessageField;
            case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                if (i6 != 2) {
                    return i2;
                }
                int iDecodeBytes = ArrayDecoders.decodeBytes(bArr, i2, registers);
                unsafe.putObject(t, j, registers.object1);
                unsafe.putInt(t, j2, i5);
                return iDecodeBytes;
            case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                if (i6 != 0) {
                    return i2;
                }
                int iDecodeVarint34 = ArrayDecoders.decodeVarint32(bArr, i2, registers);
                int i15 = registers.int1;
                Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(i9);
                if (enumFieldVerifier != null && !enumFieldVerifier.isInRange(i15)) {
                    getMutableUnknownFields(t).storeField(i4, Long.valueOf(i15));
                    return iDecodeVarint34;
                }
                unsafe.putObject(t, j, Integer.valueOf(i15));
                unsafe.putInt(t, j2, i5);
                return iDecodeVarint34;
            case 66:
                if (i6 != 0) {
                    return i2;
                }
                int iDecodeVarint35 = ArrayDecoders.decodeVarint32(bArr, i2, registers);
                unsafe.putObject(t, j, Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1)));
                unsafe.putInt(t, j2, i5);
                return iDecodeVarint35;
            case 67:
                if (i6 != 0) {
                    return i2;
                }
                int iDecodeVarint66 = ArrayDecoders.decodeVarint64(bArr, i2, registers);
                unsafe.putObject(t, j, Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1)));
                unsafe.putInt(t, j2, i5);
                return iDecodeVarint66;
            case 68:
                if (i6 == 3) {
                    Object objMutableOneofMessageFieldForMerge2 = mutableOneofMessageFieldForMerge(t, i5, i9);
                    int iMergeGroupField = ArrayDecoders.mergeGroupField(objMutableOneofMessageFieldForMerge2, getMessageFieldSchema(i9), bArr, i2, i3, (i4 & (-8)) | 4, registers);
                    storeOneofMessageField(t, i5, i9, objMutableOneofMessageFieldForMerge2);
                    return iMergeGroupField;
                }
                break;
        }
        return i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int parseRepeatedField(T t, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, long j2, ArrayDecoders.Registers registers) throws IOException {
        int iDecodeVarint32List;
        Unsafe unsafe = UNSAFE;
        Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (Internal.ProtobufList) unsafe.getObject(t, j2);
        if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
            int size = protobufListMutableCopyWithCapacity2.size();
            protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            unsafe.putObject(t, j2, protobufListMutableCopyWithCapacity2);
        }
        Internal.ProtobufList protobufList = protobufListMutableCopyWithCapacity2;
        switch (i8) {
            case 18:
            case 35:
                if (i6 == 2) {
                    return ArrayDecoders.decodePackedDoubleList(bArr, i2, protobufList, registers);
                }
                if (i6 == 1) {
                    return ArrayDecoders.decodeDoubleList(i4, bArr, i2, i3, protobufList, registers);
                }
                return i2;
            case 19:
            case 36:
                if (i6 == 2) {
                    return ArrayDecoders.decodePackedFloatList(bArr, i2, protobufList, registers);
                }
                if (i6 == 5) {
                    return ArrayDecoders.decodeFloatList(i4, bArr, i2, i3, protobufList, registers);
                }
                return i2;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i6 == 2) {
                    return ArrayDecoders.decodePackedVarint64List(bArr, i2, protobufList, registers);
                }
                if (i6 == 0) {
                    return ArrayDecoders.decodeVarint64List(i4, bArr, i2, i3, protobufList, registers);
                }
                return i2;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i6 == 2) {
                    return ArrayDecoders.decodePackedVarint32List(bArr, i2, protobufList, registers);
                }
                if (i6 == 0) {
                    return ArrayDecoders.decodeVarint32List(i4, bArr, i2, i3, protobufList, registers);
                }
                return i2;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i6 == 2) {
                    return ArrayDecoders.decodePackedFixed64List(bArr, i2, protobufList, registers);
                }
                if (i6 == 1) {
                    return ArrayDecoders.decodeFixed64List(i4, bArr, i2, i3, protobufList, registers);
                }
                return i2;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i6 == 2) {
                    return ArrayDecoders.decodePackedFixed32List(bArr, i2, protobufList, registers);
                }
                if (i6 == 5) {
                    return ArrayDecoders.decodeFixed32List(i4, bArr, i2, i3, protobufList, registers);
                }
                return i2;
            case 25:
            case 42:
                if (i6 == 2) {
                    return ArrayDecoders.decodePackedBoolList(bArr, i2, protobufList, registers);
                }
                if (i6 == 0) {
                    return ArrayDecoders.decodeBoolList(i4, bArr, i2, i3, protobufList, registers);
                }
                return i2;
            case 26:
                if (i6 == 2) {
                    return (j & 536870912) == 0 ? ArrayDecoders.decodeStringList(i4, bArr, i2, i3, protobufList, registers) : ArrayDecoders.decodeStringListRequireUtf8(i4, bArr, i2, i3, protobufList, registers);
                }
                return i2;
            case 27:
                if (i6 == 2) {
                    return ArrayDecoders.decodeMessageList(getMessageFieldSchema(i7), i4, bArr, i2, i3, protobufList, registers);
                }
                return i2;
            case 28:
                if (i6 == 2) {
                    return ArrayDecoders.decodeBytesList(i4, bArr, i2, i3, protobufList, registers);
                }
                return i2;
            case 30:
            case 44:
                if (i6 != 2) {
                    if (i6 == 0) {
                        iDecodeVarint32List = ArrayDecoders.decodeVarint32List(i4, bArr, i2, i3, protobufList, registers);
                    }
                    return i2;
                }
                iDecodeVarint32List = ArrayDecoders.decodePackedVarint32List(bArr, i2, protobufList, registers);
                SchemaUtil.filterUnknownEnumList((Object) t, i5, (List<Integer>) protobufList, getEnumFieldVerifier(i7), (Object) null, (UnknownFieldSchema<UT, Object>) this.unknownFieldSchema);
                return iDecodeVarint32List;
            case 33:
            case 47:
                if (i6 == 2) {
                    return ArrayDecoders.decodePackedSInt32List(bArr, i2, protobufList, registers);
                }
                if (i6 == 0) {
                    return ArrayDecoders.decodeSInt32List(i4, bArr, i2, i3, protobufList, registers);
                }
                return i2;
            case 34:
            case 48:
                if (i6 == 2) {
                    return ArrayDecoders.decodePackedSInt64List(bArr, i2, protobufList, registers);
                }
                if (i6 == 0) {
                    return ArrayDecoders.decodeSInt64List(i4, bArr, i2, i3, protobufList, registers);
                }
                return i2;
            case 49:
                if (i6 == 3) {
                    return ArrayDecoders.decodeGroupList(getMessageFieldSchema(i7), i4, bArr, i2, i3, protobufList, registers);
                }
                return i2;
            default:
                return i2;
        }
    }

    private int positionForFieldNumber(int i2) {
        if (i2 < this.minFieldNumber || i2 > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i2, 0);
    }

    private int presenceMaskAndOffsetAt(int i2) {
        return this.buffer[i2 + 2];
    }

    private <E> void readGroupList(Object obj, long j, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        reader.readGroupList(this.listFieldSchema.mutableListAt(obj, j), schema, extensionRegistryLite);
    }

    private <E> void readMessageList(Object obj, int i2, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        reader.readMessageList(this.listFieldSchema.mutableListAt(obj, offset(i2)), schema, extensionRegistryLite);
    }

    private void readString(Object obj, int i2, Reader reader) throws IOException {
        if (isEnforceUtf8(i2)) {
            UnsafeUtil.putObject(obj, offset(i2), reader.readStringRequireUtf8());
        } else if (this.lite) {
            UnsafeUtil.putObject(obj, offset(i2), reader.readString());
        } else {
            UnsafeUtil.putObject(obj, offset(i2), reader.readBytes());
        }
    }

    private void readStringList(Object obj, int i2, Reader reader) throws IOException {
        if (isEnforceUtf8(i2)) {
            reader.readStringListRequireUtf8(this.listFieldSchema.mutableListAt(obj, offset(i2)));
        } else {
            reader.readStringList(this.listFieldSchema.mutableListAt(obj, offset(i2)));
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
            StringBuilder sbY = android.support.v4.media.a.y("Field ", str, " for ");
            sbY.append(cls.getName());
            sbY.append(" not found. Known fields are ");
            sbY.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbY.toString());
        }
    }

    private void setFieldPresent(T t, int i2) {
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i2);
        long j = 1048575 & iPresenceMaskAndOffsetAt;
        if (j == 1048575) {
            return;
        }
        UnsafeUtil.putInt(t, j, (1 << (iPresenceMaskAndOffsetAt >>> 20)) | UnsafeUtil.getInt(t, j));
    }

    private void setOneofPresent(T t, int i2, int i3) {
        UnsafeUtil.putInt(t, presenceMaskAndOffsetAt(i3) & 1048575, i2);
    }

    private int slowPositionForFieldNumber(int i2, int i3) {
        int length = (this.buffer.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int iNumberAt = numberAt(i5);
            if (i2 == iNumberAt) {
                return i5;
            }
            if (i2 < iNumberAt) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007a  */
    /* JADX WARN: Code duplicated, block: B:22:0x007d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0084  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:32:0x00af  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    private static void storeFieldData(FieldInfo fieldInfo, int[] iArr, int i2, Object[] objArr) {
        int iObjectFieldOffset;
        int iId;
        long jObjectFieldOffset;
        int iObjectFieldOffset2;
        int iNumberOfTrailingZeros;
        int i3;
        Class<?> messageFieldClass;
        int i4;
        OneofInfo oneof = fieldInfo.getOneof();
        if (oneof == null) {
            FieldType type = fieldInfo.getType();
            iObjectFieldOffset = (int) UnsafeUtil.objectFieldOffset(fieldInfo.getField());
            iId = type.id();
            if (!type.isList() && !type.isMap()) {
                java.lang.reflect.Field presenceField = fieldInfo.getPresenceField();
                iObjectFieldOffset2 = presenceField == null ? 1048575 : (int) UnsafeUtil.objectFieldOffset(presenceField);
                iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(fieldInfo.getPresenceMask());
            } else if (fieldInfo.getCachedSizeField() == null) {
                iObjectFieldOffset2 = 0;
                iNumberOfTrailingZeros = 0;
            } else {
                jObjectFieldOffset = UnsafeUtil.objectFieldOffset(fieldInfo.getCachedSizeField());
            }
            iArr[i2] = fieldInfo.getFieldNumber();
            int i5 = i2 + 1;
            if (fieldInfo.isEnforceUtf8()) {
                i3 = ENFORCE_UTF8_MASK;
            } else {
                i3 = 0;
            }
            iArr[i5] = (fieldInfo.isRequired() ? REQUIRED_MASK : 0) | i3 | (iId << 20) | iObjectFieldOffset;
            iArr[i2 + 2] = iObjectFieldOffset2 | (iNumberOfTrailingZeros << 20);
            messageFieldClass = fieldInfo.getMessageFieldClass();
            if (fieldInfo.getMapDefaultEntry() != null) {
                if (messageFieldClass != null) {
                    objArr[a.a(i2, 3, 2, 1)] = messageFieldClass;
                    return;
                } else {
                    if (fieldInfo.getEnumVerifier() != null) {
                        objArr[a.a(i2, 3, 2, 1)] = fieldInfo.getEnumVerifier();
                        return;
                    }
                    return;
                }
            }
            i4 = (i2 / 3) * 2;
            objArr[i4] = fieldInfo.getMapDefaultEntry();
            if (messageFieldClass != null) {
                objArr[i4 + 1] = messageFieldClass;
            } else if (fieldInfo.getEnumVerifier() != null) {
                objArr[i4 + 1] = fieldInfo.getEnumVerifier();
            }
        }
        iId = fieldInfo.getType().id() + 51;
        iObjectFieldOffset = (int) UnsafeUtil.objectFieldOffset(oneof.getValueField());
        jObjectFieldOffset = UnsafeUtil.objectFieldOffset(oneof.getCaseField());
        iObjectFieldOffset2 = (int) jObjectFieldOffset;
        iNumberOfTrailingZeros = 0;
        iArr[i2] = fieldInfo.getFieldNumber();
        int i6 = i2 + 1;
        if (fieldInfo.isEnforceUtf8()) {
            i3 = ENFORCE_UTF8_MASK;
        } else {
            i3 = 0;
        }
        iArr[i6] = (fieldInfo.isRequired() ? REQUIRED_MASK : 0) | i3 | (iId << 20) | iObjectFieldOffset;
        iArr[i2 + 2] = iObjectFieldOffset2 | (iNumberOfTrailingZeros << 20);
        messageFieldClass = fieldInfo.getMessageFieldClass();
        if (fieldInfo.getMapDefaultEntry() != null) {
            if (messageFieldClass != null) {
                objArr[a.a(i2, 3, 2, 1)] = messageFieldClass;
                return;
            } else {
                if (fieldInfo.getEnumVerifier() != null) {
                    objArr[a.a(i2, 3, 2, 1)] = fieldInfo.getEnumVerifier();
                    return;
                }
                return;
            }
        }
        i4 = (i2 / 3) * 2;
        objArr[i4] = fieldInfo.getMapDefaultEntry();
        if (messageFieldClass != null) {
            objArr[i4 + 1] = messageFieldClass;
        } else if (fieldInfo.getEnumVerifier() != null) {
            objArr[i4 + 1] = fieldInfo.getEnumVerifier();
        }
    }

    private void storeMessageField(T t, int i2, Object obj) {
        UNSAFE.putObject(t, offset(typeAndOffsetAt(i2)), obj);
        setFieldPresent(t, i2);
    }

    private void storeOneofMessageField(T t, int i2, int i3, Object obj) {
        UNSAFE.putObject(t, offset(typeAndOffsetAt(i3)), obj);
        setOneofPresent(t, i2, i3);
    }

    private static int type(int i2) {
        return (i2 & FIELD_TYPE_MASK) >>> 20;
    }

    private int typeAndOffsetAt(int i2) {
        return this.buffer[i2 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    private void writeFieldsInAscendingOrder(T t, Writer writer) throws IOException {
        Map.Entry<?, ?> entry;
        Iterator it;
        boolean z2;
        int i2;
        int i3;
        int i4;
        boolean z3;
        MessageSchema<T> messageSchema = this;
        if (messageSchema.hasExtensions) {
            FieldSet<T> extensions = messageSchema.extensionSchema.getExtensions(t);
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
        int length = messageSchema.buffer.length;
        Unsafe unsafe = UNSAFE;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i6 < length) {
            int iTypeAndOffsetAt = messageSchema.typeAndOffsetAt(i6);
            int iNumberAt = messageSchema.numberAt(i6);
            int iType = type(iTypeAndOffsetAt);
            if (iType <= 17) {
                int i8 = messageSchema.buffer[i6 + 2];
                z2 = true;
                int i9 = i8 & 1048575;
                if (i9 != i5) {
                    i7 = i9 == 1048575 ? 0 : unsafe.getInt(t, i9);
                    i5 = i9;
                }
                i2 = i5;
                i3 = i7;
                i4 = 1 << (i8 >>> 20);
            } else {
                z2 = true;
                i2 = i5;
                i3 = i7;
                i4 = 0;
            }
            while (entry != null && messageSchema.extensionSchema.extensionNumber(entry) <= iNumberAt) {
                messageSchema.extensionSchema.serializeExtension(writer, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long jOffset = offset(iTypeAndOffsetAt);
            switch (iType) {
                case 0:
                    if (messageSchema.isFieldPresent(t, i6, i2, i3, i4)) {
                        writer.writeDouble(iNumberAt, doubleAt(t, jOffset));
                    }
                    break;
                case 1:
                    if (messageSchema.isFieldPresent(t, i6, i2, i3, i4)) {
                        writer.writeFloat(iNumberAt, floatAt(t, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 2:
                    if (messageSchema.isFieldPresent(t, i6, i2, i3, i4)) {
                        writer.writeInt64(iNumberAt, unsafe.getLong(t, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 3:
                    if (messageSchema.isFieldPresent(t, i6, i2, i3, i4)) {
                        writer.writeUInt64(iNumberAt, unsafe.getLong(t, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 4:
                    if (messageSchema.isFieldPresent(t, i6, i2, i3, i4)) {
                        writer.writeInt32(iNumberAt, unsafe.getInt(t, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 5:
                    if (messageSchema.isFieldPresent(t, i6, i2, i3, i4)) {
                        writer.writeFixed64(iNumberAt, unsafe.getLong(t, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 6:
                    if (messageSchema.isFieldPresent(t, i6, i2, i3, i4)) {
                        writer.writeFixed32(iNumberAt, unsafe.getInt(t, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 7:
                    if (messageSchema.isFieldPresent(t, i6, i2, i3, i4)) {
                        writer.writeBool(iNumberAt, booleanAt(t, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 8:
                    if (messageSchema.isFieldPresent(t, i6, i2, i3, i4)) {
                        messageSchema.writeString(iNumberAt, unsafe.getObject(t, jOffset), writer);
                    }
                    break;
                case 9:
                    if (messageSchema.isFieldPresent(t, i6, i2, i3, i4)) {
                        writer.writeMessage(iNumberAt, unsafe.getObject(t, jOffset), messageSchema.getMessageFieldSchema(i6));
                    }
                    break;
                case 10:
                    if (messageSchema.isFieldPresent(t, i6, i2, i3, i4)) {
                        writer.writeBytes(iNumberAt, (ByteString) unsafe.getObject(t, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 11:
                    if (messageSchema.isFieldPresent(t, i6, i2, i3, i4)) {
                        writer.writeUInt32(iNumberAt, unsafe.getInt(t, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 12:
                    if (messageSchema.isFieldPresent(t, i6, i2, i3, i4)) {
                        writer.writeEnum(iNumberAt, unsafe.getInt(t, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 13:
                    if (messageSchema.isFieldPresent(t, i6, i2, i3, i4)) {
                        writer.writeSFixed32(iNumberAt, unsafe.getInt(t, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 14:
                    if (messageSchema.isFieldPresent(t, i6, i2, i3, i4)) {
                        writer.writeSFixed64(iNumberAt, unsafe.getLong(t, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 15:
                    if (messageSchema.isFieldPresent(t, i6, i2, i3, i4)) {
                        writer.writeSInt32(iNumberAt, unsafe.getInt(t, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 16:
                    if (messageSchema.isFieldPresent(t, i6, i2, i3, i4)) {
                        writer.writeSInt64(iNumberAt, unsafe.getLong(t, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 17:
                    if (messageSchema.isFieldPresent(t, i6, i2, i3, i4)) {
                        writer.writeGroup(iNumberAt, unsafe.getObject(t, jOffset), messageSchema.getMessageFieldSchema(i6));
                    }
                    break;
                case 18:
                    SchemaUtil.writeDoubleList(messageSchema.numberAt(i6), (List) unsafe.getObject(t, jOffset), writer, false);
                    break;
                case 19:
                    SchemaUtil.writeFloatList(messageSchema.numberAt(i6), (List) unsafe.getObject(t, jOffset), writer, false);
                    break;
                case 20:
                    SchemaUtil.writeInt64List(messageSchema.numberAt(i6), (List) unsafe.getObject(t, jOffset), writer, false);
                    break;
                case 21:
                    SchemaUtil.writeUInt64List(messageSchema.numberAt(i6), (List) unsafe.getObject(t, jOffset), writer, false);
                    break;
                case 22:
                    SchemaUtil.writeInt32List(messageSchema.numberAt(i6), (List) unsafe.getObject(t, jOffset), writer, false);
                    break;
                case 23:
                    SchemaUtil.writeFixed64List(messageSchema.numberAt(i6), (List) unsafe.getObject(t, jOffset), writer, false);
                    break;
                case 24:
                    SchemaUtil.writeFixed32List(messageSchema.numberAt(i6), (List) unsafe.getObject(t, jOffset), writer, false);
                    break;
                case 25:
                    SchemaUtil.writeBoolList(messageSchema.numberAt(i6), (List) unsafe.getObject(t, jOffset), writer, false);
                    break;
                case 26:
                    SchemaUtil.writeStringList(messageSchema.numberAt(i6), (List) unsafe.getObject(t, jOffset), writer);
                    break;
                case 27:
                    SchemaUtil.writeMessageList(messageSchema.numberAt(i6), (List) unsafe.getObject(t, jOffset), writer, messageSchema.getMessageFieldSchema(i6));
                    break;
                case 28:
                    SchemaUtil.writeBytesList(messageSchema.numberAt(i6), (List) unsafe.getObject(t, jOffset), writer);
                    break;
                case 29:
                    z3 = false;
                    SchemaUtil.writeUInt32List(messageSchema.numberAt(i6), (List) unsafe.getObject(t, jOffset), writer, false);
                    break;
                case 30:
                    z3 = false;
                    SchemaUtil.writeEnumList(messageSchema.numberAt(i6), (List) unsafe.getObject(t, jOffset), writer, false);
                    break;
                case 31:
                    z3 = false;
                    SchemaUtil.writeSFixed32List(messageSchema.numberAt(i6), (List) unsafe.getObject(t, jOffset), writer, false);
                    break;
                case 32:
                    z3 = false;
                    SchemaUtil.writeSFixed64List(messageSchema.numberAt(i6), (List) unsafe.getObject(t, jOffset), writer, false);
                    break;
                case 33:
                    z3 = false;
                    SchemaUtil.writeSInt32List(messageSchema.numberAt(i6), (List) unsafe.getObject(t, jOffset), writer, false);
                    break;
                case 34:
                    z3 = false;
                    SchemaUtil.writeSInt64List(messageSchema.numberAt(i6), (List) unsafe.getObject(t, jOffset), writer, false);
                    break;
                case 35:
                    SchemaUtil.writeDoubleList(messageSchema.numberAt(i6), (List) unsafe.getObject(t, jOffset), writer, z2);
                    break;
                case 36:
                    SchemaUtil.writeFloatList(messageSchema.numberAt(i6), (List) unsafe.getObject(t, jOffset), writer, z2);
                    break;
                case 37:
                    SchemaUtil.writeInt64List(messageSchema.numberAt(i6), (List) unsafe.getObject(t, jOffset), writer, z2);
                    break;
                case 38:
                    SchemaUtil.writeUInt64List(messageSchema.numberAt(i6), (List) unsafe.getObject(t, jOffset), writer, z2);
                    break;
                case 39:
                    SchemaUtil.writeInt32List(messageSchema.numberAt(i6), (List) unsafe.getObject(t, jOffset), writer, z2);
                    break;
                case 40:
                    SchemaUtil.writeFixed64List(messageSchema.numberAt(i6), (List) unsafe.getObject(t, jOffset), writer, z2);
                    break;
                case 41:
                    SchemaUtil.writeFixed32List(messageSchema.numberAt(i6), (List) unsafe.getObject(t, jOffset), writer, z2);
                    break;
                case 42:
                    SchemaUtil.writeBoolList(messageSchema.numberAt(i6), (List) unsafe.getObject(t, jOffset), writer, z2);
                    break;
                case 43:
                    SchemaUtil.writeUInt32List(messageSchema.numberAt(i6), (List) unsafe.getObject(t, jOffset), writer, z2);
                    break;
                case 44:
                    SchemaUtil.writeEnumList(messageSchema.numberAt(i6), (List) unsafe.getObject(t, jOffset), writer, z2);
                    break;
                case 45:
                    SchemaUtil.writeSFixed32List(messageSchema.numberAt(i6), (List) unsafe.getObject(t, jOffset), writer, z2);
                    break;
                case 46:
                    SchemaUtil.writeSFixed64List(messageSchema.numberAt(i6), (List) unsafe.getObject(t, jOffset), writer, z2);
                    break;
                case 47:
                    SchemaUtil.writeSInt32List(messageSchema.numberAt(i6), (List) unsafe.getObject(t, jOffset), writer, z2);
                    break;
                case 48:
                    SchemaUtil.writeSInt64List(messageSchema.numberAt(i6), (List) unsafe.getObject(t, jOffset), writer, z2);
                    break;
                case 49:
                    SchemaUtil.writeGroupList(messageSchema.numberAt(i6), (List) unsafe.getObject(t, jOffset), writer, messageSchema.getMessageFieldSchema(i6));
                    break;
                case 50:
                    messageSchema.writeMapHelper(writer, iNumberAt, unsafe.getObject(t, jOffset), i6);
                    break;
                case 51:
                    if (messageSchema.isOneofPresent(t, iNumberAt, i6)) {
                        writer.writeDouble(iNumberAt, oneofDoubleAt(t, jOffset));
                    }
                    break;
                case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                    if (messageSchema.isOneofPresent(t, iNumberAt, i6)) {
                        writer.writeFloat(iNumberAt, oneofFloatAt(t, jOffset));
                    }
                    break;
                case 53:
                    if (messageSchema.isOneofPresent(t, iNumberAt, i6)) {
                        writer.writeInt64(iNumberAt, oneofLongAt(t, jOffset));
                    }
                    break;
                case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
                    if (messageSchema.isOneofPresent(t, iNumberAt, i6)) {
                        writer.writeUInt64(iNumberAt, oneofLongAt(t, jOffset));
                    }
                    break;
                case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
                    if (messageSchema.isOneofPresent(t, iNumberAt, i6)) {
                        writer.writeInt32(iNumberAt, oneofIntAt(t, jOffset));
                    }
                    break;
                case 56:
                    if (messageSchema.isOneofPresent(t, iNumberAt, i6)) {
                        writer.writeFixed64(iNumberAt, oneofLongAt(t, jOffset));
                    }
                    break;
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    if (messageSchema.isOneofPresent(t, iNumberAt, i6)) {
                        writer.writeFixed32(iNumberAt, oneofIntAt(t, jOffset));
                    }
                    break;
                case 58:
                    if (messageSchema.isOneofPresent(t, iNumberAt, i6)) {
                        writer.writeBool(iNumberAt, oneofBooleanAt(t, jOffset));
                    }
                    break;
                case 59:
                    if (messageSchema.isOneofPresent(t, iNumberAt, i6)) {
                        messageSchema.writeString(iNumberAt, unsafe.getObject(t, jOffset), writer);
                    }
                    break;
                case 60:
                    if (messageSchema.isOneofPresent(t, iNumberAt, i6)) {
                        writer.writeMessage(iNumberAt, unsafe.getObject(t, jOffset), messageSchema.getMessageFieldSchema(i6));
                    }
                    break;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                    if (messageSchema.isOneofPresent(t, iNumberAt, i6)) {
                        writer.writeBytes(iNumberAt, (ByteString) unsafe.getObject(t, jOffset));
                    }
                    break;
                case 62:
                    if (messageSchema.isOneofPresent(t, iNumberAt, i6)) {
                        writer.writeUInt32(iNumberAt, oneofIntAt(t, jOffset));
                    }
                    break;
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                    if (messageSchema.isOneofPresent(t, iNumberAt, i6)) {
                        writer.writeEnum(iNumberAt, oneofIntAt(t, jOffset));
                    }
                    break;
                case 64:
                    if (messageSchema.isOneofPresent(t, iNumberAt, i6)) {
                        writer.writeSFixed32(iNumberAt, oneofIntAt(t, jOffset));
                    }
                    break;
                case 65:
                    if (messageSchema.isOneofPresent(t, iNumberAt, i6)) {
                        writer.writeSFixed64(iNumberAt, oneofLongAt(t, jOffset));
                    }
                    break;
                case 66:
                    if (messageSchema.isOneofPresent(t, iNumberAt, i6)) {
                        writer.writeSInt32(iNumberAt, oneofIntAt(t, jOffset));
                    }
                    break;
                case 67:
                    if (messageSchema.isOneofPresent(t, iNumberAt, i6)) {
                        writer.writeSInt64(iNumberAt, oneofLongAt(t, jOffset));
                    }
                    break;
                case 68:
                    if (messageSchema.isOneofPresent(t, iNumberAt, i6)) {
                        writer.writeGroup(iNumberAt, unsafe.getObject(t, jOffset), messageSchema.getMessageFieldSchema(i6));
                    }
                    break;
                default:
                    break;
            }
            i6 += 3;
            i7 = i3;
            i5 = i2;
            entry = entry;
        }
        while (entry != null) {
            messageSchema.extensionSchema.serializeExtension(writer, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        messageSchema.writeUnknownInMessageTo(messageSchema.unknownFieldSchema, t, writer);
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
                        writeString(iNumberAt, UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer);
                    }
                    break;
                case 9:
                    if (isFieldPresent(t, length)) {
                        writer.writeMessage(iNumberAt, UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
                case 10:
                    if (isFieldPresent(t, length)) {
                        writer.writeBytes(iNumberAt, (ByteString) UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)));
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
                        writer.writeGroup(iNumberAt, UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
                case 18:
                    SchemaUtil.writeDoubleList(numberAt(length), (List) UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 19:
                    SchemaUtil.writeFloatList(numberAt(length), (List) UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 20:
                    SchemaUtil.writeInt64List(numberAt(length), (List) UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 21:
                    SchemaUtil.writeUInt64List(numberAt(length), (List) UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 22:
                    SchemaUtil.writeInt32List(numberAt(length), (List) UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 23:
                    SchemaUtil.writeFixed64List(numberAt(length), (List) UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 24:
                    SchemaUtil.writeFixed32List(numberAt(length), (List) UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 25:
                    SchemaUtil.writeBoolList(numberAt(length), (List) UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 26:
                    SchemaUtil.writeStringList(numberAt(length), (List) UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer);
                    break;
                case 27:
                    SchemaUtil.writeMessageList(numberAt(length), (List) UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, getMessageFieldSchema(length));
                    break;
                case 28:
                    SchemaUtil.writeBytesList(numberAt(length), (List) UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer);
                    break;
                case 29:
                    SchemaUtil.writeUInt32List(numberAt(length), (List) UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 30:
                    SchemaUtil.writeEnumList(numberAt(length), (List) UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 31:
                    SchemaUtil.writeSFixed32List(numberAt(length), (List) UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 32:
                    SchemaUtil.writeSFixed64List(numberAt(length), (List) UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 33:
                    SchemaUtil.writeSInt32List(numberAt(length), (List) UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 34:
                    SchemaUtil.writeSInt64List(numberAt(length), (List) UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 35:
                    SchemaUtil.writeDoubleList(numberAt(length), (List) UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 36:
                    SchemaUtil.writeFloatList(numberAt(length), (List) UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 37:
                    SchemaUtil.writeInt64List(numberAt(length), (List) UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 38:
                    SchemaUtil.writeUInt64List(numberAt(length), (List) UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 39:
                    SchemaUtil.writeInt32List(numberAt(length), (List) UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 40:
                    SchemaUtil.writeFixed64List(numberAt(length), (List) UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 41:
                    SchemaUtil.writeFixed32List(numberAt(length), (List) UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 42:
                    SchemaUtil.writeBoolList(numberAt(length), (List) UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 43:
                    SchemaUtil.writeUInt32List(numberAt(length), (List) UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 44:
                    SchemaUtil.writeEnumList(numberAt(length), (List) UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 45:
                    SchemaUtil.writeSFixed32List(numberAt(length), (List) UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 46:
                    SchemaUtil.writeSFixed64List(numberAt(length), (List) UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 47:
                    SchemaUtil.writeSInt32List(numberAt(length), (List) UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 48:
                    SchemaUtil.writeSInt64List(numberAt(length), (List) UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 49:
                    SchemaUtil.writeGroupList(numberAt(length), (List) UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer, getMessageFieldSchema(length));
                    break;
                case 50:
                    writeMapHelper(writer, iNumberAt, UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), length);
                    break;
                case 51:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeDouble(iNumberAt, oneofDoubleAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeFloat(iNumberAt, oneofFloatAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 53:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeInt64(iNumberAt, oneofLongAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeUInt64(iNumberAt, oneofLongAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeInt32(iNumberAt, oneofIntAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 56:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeFixed64(iNumberAt, oneofLongAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
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
                        writeString(iNumberAt, UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), writer);
                    }
                    break;
                case 60:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeMessage(iNumberAt, UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeBytes(iNumberAt, (ByteString) UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 62:
                    if (isOneofPresent(t, iNumberAt, length)) {
                        writer.writeUInt32(iNumberAt, oneofIntAt(t, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
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
                        writer.writeGroup(iNumberAt, UnsafeUtil.getObject(t, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.extensionSchema.serializeExtension(writer, entry);
            entry = itDescendingIterator.hasNext() ? (Map.Entry) itDescendingIterator.next() : null;
        }
    }

    private <K, V> void writeMapHelper(Writer writer, int i2, Object obj, int i3) throws IOException {
        if (obj != null) {
            writer.writeMap(i2, this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i3)), this.mapFieldSchema.forMapData(obj));
        }
    }

    private void writeString(int i2, Object obj, Writer writer) throws IOException {
        if (obj instanceof String) {
            writer.writeString(i2, (String) obj);
        } else {
            writer.writeBytes(i2, (ByteString) obj);
        }
    }

    private <UT, UB> void writeUnknownInMessageTo(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t, Writer writer) throws IOException {
        unknownFieldSchema.writeTo(unknownFieldSchema.getFromMessage(t), writer);
    }

    @Override // com.google.protobuf.Schema
    public boolean equals(T t, T t2) {
        int length = this.buffer.length;
        for (int i2 = 0; i2 < length; i2 += 3) {
            if (!equals(t, t2, i2)) {
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
    /* JADX WARN: Code duplicated, block: B:251:0x0559 A[PHI: r0 r1
  0x0559: PHI (r0v2 com.google.protobuf.MessageSchema<T>) = 
  (r0v1 com.google.protobuf.MessageSchema<T>)
  (r0v1 com.google.protobuf.MessageSchema<T>)
  (r0v1 com.google.protobuf.MessageSchema<T>)
  (r0v26 com.google.protobuf.MessageSchema<T>)
  (r0v32 com.google.protobuf.MessageSchema<T>)
  (r0v1 com.google.protobuf.MessageSchema<T>)
  (r0v1 com.google.protobuf.MessageSchema<T>)
  (r0v1 com.google.protobuf.MessageSchema<T>)
  (r0v1 com.google.protobuf.MessageSchema<T>)
  (r0v1 com.google.protobuf.MessageSchema<T>)
  (r0v1 com.google.protobuf.MessageSchema<T>)
  (r0v1 com.google.protobuf.MessageSchema<T>)
  (r0v1 com.google.protobuf.MessageSchema<T>)
  (r0v1 com.google.protobuf.MessageSchema<T>)
  (r0v1 com.google.protobuf.MessageSchema<T>)
  (r0v1 com.google.protobuf.MessageSchema<T>)
  (r0v1 com.google.protobuf.MessageSchema<T>)
  (r0v1 com.google.protobuf.MessageSchema<T>)
  (r0v1 com.google.protobuf.MessageSchema<T>)
  (r0v1 com.google.protobuf.MessageSchema<T>)
  (r0v1 com.google.protobuf.MessageSchema<T>)
  (r0v1 com.google.protobuf.MessageSchema<T>)
  (r0v1 com.google.protobuf.MessageSchema<T>)
  (r0v1 com.google.protobuf.MessageSchema<T>)
  (r0v1 com.google.protobuf.MessageSchema<T>)
  (r0v1 com.google.protobuf.MessageSchema<T>)
  (r0v1 com.google.protobuf.MessageSchema<T>)
  (r0v1 com.google.protobuf.MessageSchema<T>)
  (r0v1 com.google.protobuf.MessageSchema<T>)
  (r0v1 com.google.protobuf.MessageSchema<T>)
  (r0v1 com.google.protobuf.MessageSchema<T>)
  (r0v1 com.google.protobuf.MessageSchema<T>)
  (r0v1 com.google.protobuf.MessageSchema<T>)
  (r0v1 com.google.protobuf.MessageSchema<T>)
  (r0v1 com.google.protobuf.MessageSchema<T>)
  (r0v1 com.google.protobuf.MessageSchema<T>)
  (r0v1 com.google.protobuf.MessageSchema<T>)
  (r0v1 com.google.protobuf.MessageSchema<T>)
 binds: [B:22:0x005b, B:249:0x054f, B:218:0x04b0, B:204:0x0467, B:196:0x0440, B:189:0x0419, B:166:0x0330, B:160:0x0312, B:154:0x02f4, B:148:0x02d6, B:142:0x02b8, B:136:0x029a, B:130:0x027c, B:124:0x025e, B:118:0x0240, B:112:0x0223, B:106:0x0206, B:100:0x01e9, B:94:0x01cc, B:87:0x01aa, B:82:0x0176, B:79:0x016a, B:76:0x015a, B:73:0x014a, B:70:0x013a, B:67:0x012e, B:64:0x0122, B:61:0x0115, B:54:0x00f5, B:50:0x00df, B:47:0x00ce, B:44:0x00bf, B:41:0x00b0, B:38:0x00a5, B:35:0x009a, B:32:0x008b, B:29:0x007c, B:25:0x0064] A[DONT_GENERATE, DONT_INLINE]
  0x0559: PHI (r1v4 T) = 
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
 binds: [B:22:0x005b, B:249:0x054f, B:218:0x04b0, B:204:0x0467, B:196:0x0440, B:189:0x0419, B:166:0x0330, B:160:0x0312, B:154:0x02f4, B:148:0x02d6, B:142:0x02b8, B:136:0x029a, B:130:0x027c, B:124:0x025e, B:118:0x0240, B:112:0x0223, B:106:0x0206, B:100:0x01e9, B:94:0x01cc, B:87:0x01aa, B:82:0x0176, B:79:0x016a, B:76:0x015a, B:73:0x014a, B:70:0x013a, B:67:0x012e, B:64:0x0122, B:61:0x0115, B:54:0x00f5, B:50:0x00df, B:47:0x00ce, B:44:0x00bf, B:41:0x00b0, B:38:0x00a5, B:35:0x009a, B:32:0x008b, B:29:0x007c, B:25:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.protobuf.Schema
    public int getSerializedSize(T t) {
        int i2;
        int iComputeDoubleSize;
        int iComputeFloatSize;
        int iComputeInt64Size;
        int iComputeSizeMessage;
        int iComputeSizeFixed64ListNoTag;
        int iComputeTagSize;
        int iComputeUInt32SizeNoTag;
        MessageSchema<T> messageSchema = this;
        T t2 = t;
        Unsafe unsafe = UNSAFE;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int iComputeBytesSize = 0;
        int i6 = 1048575;
        while (i4 < messageSchema.buffer.length) {
            int iTypeAndOffsetAt = messageSchema.typeAndOffsetAt(i4);
            int iType = type(iTypeAndOffsetAt);
            int iNumberAt = messageSchema.numberAt(i4);
            int i7 = messageSchema.buffer[i4 + 2];
            int i8 = i7 & i3;
            if (iType <= 17) {
                if (i8 != i6) {
                    i5 = i8 == i3 ? 0 : unsafe.getInt(t2, i8);
                    i6 = i8;
                }
                i2 = 1 << (i7 >>> 20);
            } else {
                i2 = 0;
            }
            int i9 = iComputeBytesSize;
            long jOffset = offset(iTypeAndOffsetAt);
            if (iType < FieldType.DOUBLE_LIST_PACKED.id() || iType > FieldType.SINT64_LIST_PACKED.id()) {
                i8 = 0;
            }
            switch (iType) {
                case 0:
                    if (!messageSchema.isFieldPresent(t2, i4, i6, i5, i2)) {
                        iComputeBytesSize = i9;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        iComputeBytesSize = iComputeDoubleSize + i9;
                    }
                    break;
                case 1:
                    if (messageSchema.isFieldPresent(t2, i4, i6, i5, i2)) {
                        iComputeFloatSize = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        iComputeBytesSize = iComputeFloatSize + i9;
                        messageSchema = this;
                        t2 = t;
                    }
                    messageSchema = this;
                    t2 = t;
                    iComputeBytesSize = i9;
                    break;
                case 2:
                    if (messageSchema.isFieldPresent(t2, i4, i6, i5, i2)) {
                        iComputeInt64Size = CodedOutputStream.computeInt64Size(iNumberAt, unsafe.getLong(t2, jOffset));
                        iComputeBytesSize = iComputeInt64Size + i9;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    iComputeBytesSize = i9;
                    break;
                case 3:
                    if (messageSchema.isFieldPresent(t2, i4, i6, i5, i2)) {
                        iComputeInt64Size = CodedOutputStream.computeUInt64Size(iNumberAt, unsafe.getLong(t2, jOffset));
                        iComputeBytesSize = iComputeInt64Size + i9;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    iComputeBytesSize = i9;
                    break;
                case 4:
                    if (messageSchema.isFieldPresent(t2, i4, i6, i5, i2)) {
                        iComputeInt64Size = CodedOutputStream.computeInt32Size(iNumberAt, unsafe.getInt(t2, jOffset));
                        iComputeBytesSize = iComputeInt64Size + i9;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    iComputeBytesSize = i9;
                    break;
                case 5:
                    if (messageSchema.isFieldPresent(t2, i4, i6, i5, i2)) {
                        iComputeFloatSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        iComputeBytesSize = iComputeFloatSize + i9;
                        messageSchema = this;
                        t2 = t;
                    }
                    messageSchema = this;
                    t2 = t;
                    iComputeBytesSize = i9;
                    break;
                case 6:
                    if (messageSchema.isFieldPresent(t2, i4, i6, i5, i2)) {
                        iComputeFloatSize = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        iComputeBytesSize = iComputeFloatSize + i9;
                        messageSchema = this;
                        t2 = t;
                    }
                    messageSchema = this;
                    t2 = t;
                    iComputeBytesSize = i9;
                    break;
                case 7:
                    if (messageSchema.isFieldPresent(t2, i4, i6, i5, i2)) {
                        iComputeFloatSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        iComputeBytesSize = iComputeFloatSize + i9;
                        messageSchema = this;
                        t2 = t;
                    }
                    messageSchema = this;
                    t2 = t;
                    iComputeBytesSize = i9;
                    break;
                case 8:
                    if (messageSchema.isFieldPresent(t2, i4, i6, i5, i2)) {
                        Object object = unsafe.getObject(t2, jOffset);
                        iComputeBytesSize = (object instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object) : CodedOutputStream.computeStringSize(iNumberAt, (String) object)) + i9;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    iComputeBytesSize = i9;
                    break;
                case 9:
                    if (!messageSchema.isFieldPresent(t2, i4, i6, i5, i2)) {
                        iComputeBytesSize = i9;
                    } else {
                        iComputeSizeMessage = SchemaUtil.computeSizeMessage(iNumberAt, unsafe.getObject(t2, jOffset), messageSchema.getMessageFieldSchema(i4));
                        iComputeBytesSize = i9 + iComputeSizeMessage;
                    }
                    break;
                case 10:
                    if (messageSchema.isFieldPresent(t2, i4, i6, i5, i2)) {
                        iComputeInt64Size = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) unsafe.getObject(t2, jOffset));
                        iComputeBytesSize = iComputeInt64Size + i9;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    iComputeBytesSize = i9;
                    break;
                case 11:
                    if (messageSchema.isFieldPresent(t2, i4, i6, i5, i2)) {
                        iComputeInt64Size = CodedOutputStream.computeUInt32Size(iNumberAt, unsafe.getInt(t2, jOffset));
                        iComputeBytesSize = iComputeInt64Size + i9;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    iComputeBytesSize = i9;
                    break;
                case 12:
                    if (messageSchema.isFieldPresent(t2, i4, i6, i5, i2)) {
                        iComputeInt64Size = CodedOutputStream.computeEnumSize(iNumberAt, unsafe.getInt(t2, jOffset));
                        iComputeBytesSize = iComputeInt64Size + i9;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    iComputeBytesSize = i9;
                    break;
                case 13:
                    if (messageSchema.isFieldPresent(t2, i4, i6, i5, i2)) {
                        iComputeFloatSize = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        iComputeBytesSize = iComputeFloatSize + i9;
                        messageSchema = this;
                        t2 = t;
                    }
                    messageSchema = this;
                    t2 = t;
                    iComputeBytesSize = i9;
                    break;
                case 14:
                    if (messageSchema.isFieldPresent(t2, i4, i6, i5, i2)) {
                        iComputeFloatSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        iComputeBytesSize = iComputeFloatSize + i9;
                        messageSchema = this;
                        t2 = t;
                    }
                    messageSchema = this;
                    t2 = t;
                    iComputeBytesSize = i9;
                    break;
                case 15:
                    if (messageSchema.isFieldPresent(t2, i4, i6, i5, i2)) {
                        iComputeInt64Size = CodedOutputStream.computeSInt32Size(iNumberAt, unsafe.getInt(t2, jOffset));
                        iComputeBytesSize = iComputeInt64Size + i9;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    iComputeBytesSize = i9;
                    break;
                case 16:
                    if (messageSchema.isFieldPresent(t2, i4, i6, i5, i2)) {
                        iComputeInt64Size = CodedOutputStream.computeSInt64Size(iNumberAt, unsafe.getLong(t2, jOffset));
                        iComputeBytesSize = iComputeInt64Size + i9;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    iComputeBytesSize = i9;
                    break;
                case 17:
                    if (!messageSchema.isFieldPresent(t2, i4, i6, i5, i2)) {
                        iComputeBytesSize = i9;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) unsafe.getObject(t2, jOffset), messageSchema.getMessageFieldSchema(i4));
                        iComputeBytesSize = iComputeDoubleSize + i9;
                    }
                    break;
                case 18:
                    iComputeSizeMessage = SchemaUtil.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t2, jOffset), false);
                    iComputeBytesSize = i9 + iComputeSizeMessage;
                    break;
                case 19:
                    iComputeSizeMessage = SchemaUtil.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t2, jOffset), false);
                    iComputeBytesSize = i9 + iComputeSizeMessage;
                    break;
                case 20:
                    iComputeSizeMessage = SchemaUtil.computeSizeInt64List(iNumberAt, (List) unsafe.getObject(t2, jOffset), false);
                    iComputeBytesSize = i9 + iComputeSizeMessage;
                    break;
                case 21:
                    iComputeSizeMessage = SchemaUtil.computeSizeUInt64List(iNumberAt, (List) unsafe.getObject(t2, jOffset), false);
                    iComputeBytesSize = i9 + iComputeSizeMessage;
                    break;
                case 22:
                    iComputeSizeMessage = SchemaUtil.computeSizeInt32List(iNumberAt, (List) unsafe.getObject(t2, jOffset), false);
                    iComputeBytesSize = i9 + iComputeSizeMessage;
                    break;
                case 23:
                    iComputeSizeMessage = SchemaUtil.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t2, jOffset), false);
                    iComputeBytesSize = i9 + iComputeSizeMessage;
                    break;
                case 24:
                    iComputeSizeMessage = SchemaUtil.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t2, jOffset), false);
                    iComputeBytesSize = i9 + iComputeSizeMessage;
                    break;
                case 25:
                    iComputeSizeMessage = SchemaUtil.computeSizeBoolList(iNumberAt, (List) unsafe.getObject(t2, jOffset), false);
                    iComputeBytesSize = i9 + iComputeSizeMessage;
                    break;
                case 26:
                    iComputeSizeMessage = SchemaUtil.computeSizeStringList(iNumberAt, (List) unsafe.getObject(t2, jOffset));
                    iComputeBytesSize = i9 + iComputeSizeMessage;
                    break;
                case 27:
                    iComputeSizeMessage = SchemaUtil.computeSizeMessageList(iNumberAt, (List) unsafe.getObject(t2, jOffset), messageSchema.getMessageFieldSchema(i4));
                    iComputeBytesSize = i9 + iComputeSizeMessage;
                    break;
                case 28:
                    iComputeSizeMessage = SchemaUtil.computeSizeByteStringList(iNumberAt, (List) unsafe.getObject(t2, jOffset));
                    iComputeBytesSize = i9 + iComputeSizeMessage;
                    break;
                case 29:
                    iComputeSizeMessage = SchemaUtil.computeSizeUInt32List(iNumberAt, (List) unsafe.getObject(t2, jOffset), false);
                    iComputeBytesSize = i9 + iComputeSizeMessage;
                    break;
                case 30:
                    iComputeSizeMessage = SchemaUtil.computeSizeEnumList(iNumberAt, (List) unsafe.getObject(t2, jOffset), false);
                    iComputeBytesSize = i9 + iComputeSizeMessage;
                    break;
                case 31:
                    iComputeSizeMessage = SchemaUtil.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t2, jOffset), false);
                    iComputeBytesSize = i9 + iComputeSizeMessage;
                    break;
                case 32:
                    iComputeSizeMessage = SchemaUtil.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t2, jOffset), false);
                    iComputeBytesSize = i9 + iComputeSizeMessage;
                    break;
                case 33:
                    iComputeSizeMessage = SchemaUtil.computeSizeSInt32List(iNumberAt, (List) unsafe.getObject(t2, jOffset), false);
                    iComputeBytesSize = i9 + iComputeSizeMessage;
                    break;
                case 34:
                    iComputeSizeMessage = SchemaUtil.computeSizeSInt64List(iNumberAt, (List) unsafe.getObject(t2, jOffset), false);
                    iComputeBytesSize = i9 + iComputeSizeMessage;
                    break;
                case 35:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i9;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t2, i8, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i9;
                    }
                    break;
                case 36:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i9;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t2, i8, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i9;
                    }
                    break;
                case 37:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt64ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i9;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t2, i8, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i9;
                    }
                    break;
                case 38:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt64ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i9;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t2, i8, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i9;
                    }
                    break;
                case 39:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt32ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i9;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t2, i8, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i9;
                    }
                    break;
                case 40:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i9;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t2, i8, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i9;
                    }
                    break;
                case 41:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i9;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t2, i8, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i9;
                    }
                    break;
                case 42:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeBoolListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i9;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t2, i8, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i9;
                    }
                    break;
                case 43:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt32ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i9;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t2, i8, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i9;
                    }
                    break;
                case 44:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeEnumListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i9;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t2, i8, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i9;
                    }
                    break;
                case 45:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i9;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t2, i8, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i9;
                    }
                    break;
                case 46:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i9;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t2, i8, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i9;
                    }
                    break;
                case 47:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt32ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i9;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t2, i8, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i9;
                    }
                    break;
                case 48:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt64ListNoTag((List) unsafe.getObject(t2, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i9;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t2, i8, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i9;
                    }
                    break;
                case 49:
                    iComputeSizeMessage = SchemaUtil.computeSizeGroupList(iNumberAt, (List) unsafe.getObject(t2, jOffset), messageSchema.getMessageFieldSchema(i4));
                    iComputeBytesSize = i9 + iComputeSizeMessage;
                    break;
                case 50:
                    iComputeSizeMessage = messageSchema.mapFieldSchema.getSerializedSize(iNumberAt, unsafe.getObject(t2, jOffset), messageSchema.getMapFieldDefaultEntry(i4));
                    iComputeBytesSize = i9 + iComputeSizeMessage;
                    break;
                case 51:
                    if (!messageSchema.isOneofPresent(t2, iNumberAt, i4)) {
                        iComputeBytesSize = i9;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        iComputeBytesSize = iComputeDoubleSize + i9;
                    }
                    break;
                case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                    if (!messageSchema.isOneofPresent(t2, iNumberAt, i4)) {
                        iComputeBytesSize = i9;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        iComputeBytesSize = iComputeDoubleSize + i9;
                    }
                    break;
                case 53:
                    if (!messageSchema.isOneofPresent(t2, iNumberAt, i4)) {
                        iComputeBytesSize = i9;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeInt64Size(iNumberAt, oneofLongAt(t2, jOffset));
                        iComputeBytesSize = iComputeDoubleSize + i9;
                    }
                    break;
                case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
                    if (!messageSchema.isOneofPresent(t2, iNumberAt, i4)) {
                        iComputeBytesSize = i9;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeUInt64Size(iNumberAt, oneofLongAt(t2, jOffset));
                        iComputeBytesSize = iComputeDoubleSize + i9;
                    }
                    break;
                case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
                    if (!messageSchema.isOneofPresent(t2, iNumberAt, i4)) {
                        iComputeBytesSize = i9;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeInt32Size(iNumberAt, oneofIntAt(t2, jOffset));
                        iComputeBytesSize = iComputeDoubleSize + i9;
                    }
                    break;
                case 56:
                    if (!messageSchema.isOneofPresent(t2, iNumberAt, i4)) {
                        iComputeBytesSize = i9;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        iComputeBytesSize = iComputeDoubleSize + i9;
                    }
                    break;
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    if (!messageSchema.isOneofPresent(t2, iNumberAt, i4)) {
                        iComputeBytesSize = i9;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        iComputeBytesSize = iComputeDoubleSize + i9;
                    }
                    break;
                case 58:
                    if (!messageSchema.isOneofPresent(t2, iNumberAt, i4)) {
                        iComputeBytesSize = i9;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        iComputeBytesSize = iComputeDoubleSize + i9;
                    }
                    break;
                case 59:
                    if (!messageSchema.isOneofPresent(t2, iNumberAt, i4)) {
                        iComputeBytesSize = i9;
                    } else {
                        Object object2 = unsafe.getObject(t2, jOffset);
                        iComputeBytesSize = (object2 instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object2) : CodedOutputStream.computeStringSize(iNumberAt, (String) object2)) + i9;
                    }
                    break;
                case 60:
                    if (!messageSchema.isOneofPresent(t2, iNumberAt, i4)) {
                        iComputeBytesSize = i9;
                    } else {
                        iComputeSizeMessage = SchemaUtil.computeSizeMessage(iNumberAt, unsafe.getObject(t2, jOffset), messageSchema.getMessageFieldSchema(i4));
                        iComputeBytesSize = i9 + iComputeSizeMessage;
                    }
                    break;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                    if (!messageSchema.isOneofPresent(t2, iNumberAt, i4)) {
                        iComputeBytesSize = i9;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) unsafe.getObject(t2, jOffset));
                        iComputeBytesSize = iComputeDoubleSize + i9;
                    }
                    break;
                case 62:
                    if (!messageSchema.isOneofPresent(t2, iNumberAt, i4)) {
                        iComputeBytesSize = i9;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeUInt32Size(iNumberAt, oneofIntAt(t2, jOffset));
                        iComputeBytesSize = iComputeDoubleSize + i9;
                    }
                    break;
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                    if (!messageSchema.isOneofPresent(t2, iNumberAt, i4)) {
                        iComputeBytesSize = i9;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeEnumSize(iNumberAt, oneofIntAt(t2, jOffset));
                        iComputeBytesSize = iComputeDoubleSize + i9;
                    }
                    break;
                case 64:
                    if (!messageSchema.isOneofPresent(t2, iNumberAt, i4)) {
                        iComputeBytesSize = i9;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        iComputeBytesSize = iComputeDoubleSize + i9;
                    }
                    break;
                case 65:
                    if (!messageSchema.isOneofPresent(t2, iNumberAt, i4)) {
                        iComputeBytesSize = i9;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        iComputeBytesSize = iComputeDoubleSize + i9;
                    }
                    break;
                case 66:
                    if (!messageSchema.isOneofPresent(t2, iNumberAt, i4)) {
                        iComputeBytesSize = i9;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeSInt32Size(iNumberAt, oneofIntAt(t2, jOffset));
                        iComputeBytesSize = iComputeDoubleSize + i9;
                    }
                    break;
                case 67:
                    if (!messageSchema.isOneofPresent(t2, iNumberAt, i4)) {
                        iComputeBytesSize = i9;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeSInt64Size(iNumberAt, oneofLongAt(t2, jOffset));
                        iComputeBytesSize = iComputeDoubleSize + i9;
                    }
                    break;
                case 68:
                    if (!messageSchema.isOneofPresent(t2, iNumberAt, i4)) {
                        iComputeBytesSize = i9;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) unsafe.getObject(t2, jOffset), messageSchema.getMessageFieldSchema(i4));
                        iComputeBytesSize = iComputeDoubleSize + i9;
                    }
                    break;
                default:
                    iComputeBytesSize = i9;
                    break;
            }
            i4 += 3;
            i3 = 1048575;
        }
        int unknownFieldsSerializedSize = iComputeBytesSize + messageSchema.getUnknownFieldsSerializedSize(messageSchema.unknownFieldSchema, t2);
        return messageSchema.hasExtensions ? unknownFieldsSerializedSize + messageSchema.extensionSchema.getExtensions(t2).getSerializedSize() : unknownFieldsSerializedSize;
    }

    @Override // com.google.protobuf.Schema
    public int hashCode(T t) {
        int i2;
        int iHashLong;
        int i3;
        int iOneofIntAt;
        int length = this.buffer.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5 += 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i5);
            int iNumberAt = numberAt(i5);
            long jOffset = offset(iTypeAndOffsetAt);
            int iHashCode = 37;
            switch (type(iTypeAndOffsetAt)) {
                case 0:
                    i2 = i4 * 53;
                    iHashLong = Internal.hashLong(Double.doubleToLongBits(UnsafeUtil.getDouble(t, jOffset)));
                    i4 = iHashLong + i2;
                    break;
                case 1:
                    i2 = i4 * 53;
                    iHashLong = Float.floatToIntBits(UnsafeUtil.getFloat(t, jOffset));
                    i4 = iHashLong + i2;
                    break;
                case 2:
                    i2 = i4 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t, jOffset));
                    i4 = iHashLong + i2;
                    break;
                case 3:
                    i2 = i4 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t, jOffset));
                    i4 = iHashLong + i2;
                    break;
                case 4:
                    i3 = i4 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t, jOffset);
                    i4 = i3 + iOneofIntAt;
                    break;
                case 5:
                    i2 = i4 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t, jOffset));
                    i4 = iHashLong + i2;
                    break;
                case 6:
                    i3 = i4 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t, jOffset);
                    i4 = i3 + iOneofIntAt;
                    break;
                case 7:
                    i2 = i4 * 53;
                    iHashLong = Internal.hashBoolean(UnsafeUtil.getBoolean(t, jOffset));
                    i4 = iHashLong + i2;
                    break;
                case 8:
                    i2 = i4 * 53;
                    iHashLong = ((String) UnsafeUtil.getObject(t, jOffset)).hashCode();
                    i4 = iHashLong + i2;
                    break;
                case 9:
                    Object object = UnsafeUtil.getObject(t, jOffset);
                    if (object != null) {
                        iHashCode = object.hashCode();
                    }
                    i4 = (i4 * 53) + iHashCode;
                    break;
                case 10:
                    i2 = i4 * 53;
                    iHashLong = UnsafeUtil.getObject(t, jOffset).hashCode();
                    i4 = iHashLong + i2;
                    break;
                case 11:
                    i3 = i4 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t, jOffset);
                    i4 = i3 + iOneofIntAt;
                    break;
                case 12:
                    i3 = i4 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t, jOffset);
                    i4 = i3 + iOneofIntAt;
                    break;
                case 13:
                    i3 = i4 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t, jOffset);
                    i4 = i3 + iOneofIntAt;
                    break;
                case 14:
                    i2 = i4 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t, jOffset));
                    i4 = iHashLong + i2;
                    break;
                case 15:
                    i3 = i4 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t, jOffset);
                    i4 = i3 + iOneofIntAt;
                    break;
                case 16:
                    i2 = i4 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t, jOffset));
                    i4 = iHashLong + i2;
                    break;
                case 17:
                    Object object2 = UnsafeUtil.getObject(t, jOffset);
                    if (object2 != null) {
                        iHashCode = object2.hashCode();
                    }
                    i4 = (i4 * 53) + iHashCode;
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
                    i2 = i4 * 53;
                    iHashLong = UnsafeUtil.getObject(t, jOffset).hashCode();
                    i4 = iHashLong + i2;
                    break;
                case 50:
                    i2 = i4 * 53;
                    iHashLong = UnsafeUtil.getObject(t, jOffset).hashCode();
                    i4 = iHashLong + i2;
                    break;
                case 51:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        i2 = i4 * 53;
                        iHashLong = Internal.hashLong(Double.doubleToLongBits(oneofDoubleAt(t, jOffset)));
                        i4 = iHashLong + i2;
                    }
                    break;
                case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        i2 = i4 * 53;
                        iHashLong = Float.floatToIntBits(oneofFloatAt(t, jOffset));
                        i4 = iHashLong + i2;
                    }
                    break;
                case 53:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        i2 = i4 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t, jOffset));
                        i4 = iHashLong + i2;
                    }
                    break;
                case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        i2 = i4 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t, jOffset));
                        i4 = iHashLong + i2;
                    }
                    break;
                case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        i3 = i4 * 53;
                        iOneofIntAt = oneofIntAt(t, jOffset);
                        i4 = i3 + iOneofIntAt;
                    }
                    break;
                case 56:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        i2 = i4 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t, jOffset));
                        i4 = iHashLong + i2;
                    }
                    break;
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        i3 = i4 * 53;
                        iOneofIntAt = oneofIntAt(t, jOffset);
                        i4 = i3 + iOneofIntAt;
                    }
                    break;
                case 58:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        i2 = i4 * 53;
                        iHashLong = Internal.hashBoolean(oneofBooleanAt(t, jOffset));
                        i4 = iHashLong + i2;
                    }
                    break;
                case 59:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        i2 = i4 * 53;
                        iHashLong = ((String) UnsafeUtil.getObject(t, jOffset)).hashCode();
                        i4 = iHashLong + i2;
                    }
                    break;
                case 60:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        i2 = i4 * 53;
                        iHashLong = UnsafeUtil.getObject(t, jOffset).hashCode();
                        i4 = iHashLong + i2;
                    }
                    break;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        i2 = i4 * 53;
                        iHashLong = UnsafeUtil.getObject(t, jOffset).hashCode();
                        i4 = iHashLong + i2;
                    }
                    break;
                case 62:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        i3 = i4 * 53;
                        iOneofIntAt = oneofIntAt(t, jOffset);
                        i4 = i3 + iOneofIntAt;
                    }
                    break;
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        i3 = i4 * 53;
                        iOneofIntAt = oneofIntAt(t, jOffset);
                        i4 = i3 + iOneofIntAt;
                    }
                    break;
                case 64:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        i3 = i4 * 53;
                        iOneofIntAt = oneofIntAt(t, jOffset);
                        i4 = i3 + iOneofIntAt;
                    }
                    break;
                case 65:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        i2 = i4 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t, jOffset));
                        i4 = iHashLong + i2;
                    }
                    break;
                case 66:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        i3 = i4 * 53;
                        iOneofIntAt = oneofIntAt(t, jOffset);
                        i4 = i3 + iOneofIntAt;
                    }
                    break;
                case 67:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        i2 = i4 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t, jOffset));
                        i4 = iHashLong + i2;
                    }
                    break;
                case 68:
                    if (isOneofPresent(t, iNumberAt, i5)) {
                        i2 = i4 * 53;
                        iHashLong = UnsafeUtil.getObject(t, jOffset).hashCode();
                        i4 = iHashLong + i2;
                    }
                    break;
            }
        }
        int iHashCode2 = this.unknownFieldSchema.getFromMessage(t).hashCode() + (i4 * 53);
        return this.hasExtensions ? (iHashCode2 * 53) + this.extensionSchema.getExtensions(t).hashCode() : iHashCode2;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0094 A[SYNTHETIC] */
    @Override // com.google.protobuf.Schema
    public final boolean isInitialized(T t) {
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i5 < this.checkInitializedCount) {
            int i7 = this.intArray[i5];
            int iNumberAt = numberAt(i7);
            int iTypeAndOffsetAt = typeAndOffsetAt(i7);
            int i8 = this.buffer[i7 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i4) {
                if (i9 != 1048575) {
                    i6 = UNSAFE.getInt(t, i9);
                }
                i3 = i6;
                i2 = i9;
            } else {
                i2 = i4;
                i3 = i6;
            }
            T t2 = t;
            if (isRequired(iTypeAndOffsetAt) && !isFieldPresent(t2, i7, i2, i3, i10)) {
                return false;
            }
            int iType = type(iTypeAndOffsetAt);
            if (iType == 9 || iType == 17) {
                if (isFieldPresent(t2, i7, i2, i3, i10) && !isInitialized(t2, iTypeAndOffsetAt, getMessageFieldSchema(i7))) {
                    return false;
                }
            } else if (iType == 27) {
                if (!isListInitialized(t2, iTypeAndOffsetAt, i7)) {
                    return false;
                }
            } else if (iType == 60 || iType == 68) {
                if (isOneofPresent(t2, iNumberAt, i7) && !isInitialized(t2, iTypeAndOffsetAt, getMessageFieldSchema(i7))) {
                    return false;
                }
            } else if (iType != 49) {
                if (iType == 50 && !isMapInitialized(t2, iTypeAndOffsetAt, i7)) {
                    return false;
                }
            } else if (!isListInitialized(t2, iTypeAndOffsetAt, i7)) {
                return false;
            }
            i5++;
            t = t2;
            i4 = i2;
            i6 = i3;
        }
        return !this.hasExtensions || this.extensionSchema.getExtensions(t).isInitialized();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x007d A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.Schema
    public void makeImmutable(T t) {
        if (isMutable(t)) {
            if (t instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t;
                generatedMessageLite.clearMemoizedSerializedSize();
                generatedMessageLite.clearMemoizedHashCode();
                generatedMessageLite.markImmutable();
            }
            int length = this.buffer.length;
            for (int i2 = 0; i2 < length; i2 += 3) {
                int iTypeAndOffsetAt = typeAndOffsetAt(i2);
                long jOffset = offset(iTypeAndOffsetAt);
                int iType = type(iTypeAndOffsetAt);
                if (iType != 9) {
                    if (iType != 60 && iType != 68) {
                        switch (iType) {
                            case 17:
                                if (isFieldPresent(t, i2)) {
                                    getMessageFieldSchema(i2).makeImmutable(UNSAFE.getObject(t, jOffset));
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
                    } else if (isOneofPresent(t, numberAt(i2), i2)) {
                        getMessageFieldSchema(i2).makeImmutable(UNSAFE.getObject(t, jOffset));
                    }
                } else if (isFieldPresent(t, i2)) {
                    getMessageFieldSchema(i2).makeImmutable(UNSAFE.getObject(t, jOffset));
                }
            }
            this.unknownFieldSchema.makeImmutable(t);
            if (this.hasExtensions) {
                this.extensionSchema.makeImmutable(t);
            }
        }
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t, T t2) {
        checkMutable(t);
        t2.getClass();
        for (int i2 = 0; i2 < this.buffer.length; i2 += 3) {
            mergeSingleField(t, t2, i2);
        }
        SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, t, t2);
        if (this.hasExtensions) {
            SchemaUtil.mergeExtensions(this.extensionSchema, t, t2);
        }
    }

    @Override // com.google.protobuf.Schema
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
    public int parseMessage(T r27, byte[] r28, int r29, int r30, int r31, com.google.protobuf.ArrayDecoders.Registers r32) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.parseMessage(java.lang.Object, byte[], int, int, int, com.google.protobuf.ArrayDecoders$Registers):int");
    }

    @Override // com.google.protobuf.Schema
    public void writeTo(T t, Writer writer) throws IOException {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            writeFieldsInDescendingOrder(t, writer);
        } else {
            writeFieldsInAscendingOrder(t, writer);
        }
    }

    private boolean isFieldPresent(T t, int i2) {
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i2);
        long j = 1048575 & iPresenceMaskAndOffsetAt;
        if (j != 1048575) {
            return (UnsafeUtil.getInt(t, j) & (1 << (iPresenceMaskAndOffsetAt >>> 20))) != 0;
        }
        int iTypeAndOffsetAt = typeAndOffsetAt(i2);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                return Double.doubleToRawLongBits(UnsafeUtil.getDouble(t, jOffset)) != 0;
            case 1:
                return Float.floatToRawIntBits(UnsafeUtil.getFloat(t, jOffset)) != 0;
            case 2:
                return UnsafeUtil.getLong(t, jOffset) != 0;
            case 3:
                return UnsafeUtil.getLong(t, jOffset) != 0;
            case 4:
                return UnsafeUtil.getInt(t, jOffset) != 0;
            case 5:
                return UnsafeUtil.getLong(t, jOffset) != 0;
            case 6:
                return UnsafeUtil.getInt(t, jOffset) != 0;
            case 7:
                return UnsafeUtil.getBoolean(t, jOffset);
            case 8:
                Object object = UnsafeUtil.getObject(t, jOffset);
                if (object instanceof String) {
                    return !((String) object).isEmpty();
                }
                if (object instanceof ByteString) {
                    return !ByteString.EMPTY.equals(object);
                }
                throw new IllegalArgumentException();
            case 9:
                return UnsafeUtil.getObject(t, jOffset) != null;
            case 10:
                return !ByteString.EMPTY.equals(UnsafeUtil.getObject(t, jOffset));
            case 11:
                return UnsafeUtil.getInt(t, jOffset) != 0;
            case 12:
                return UnsafeUtil.getInt(t, jOffset) != 0;
            case 13:
                return UnsafeUtil.getInt(t, jOffset) != 0;
            case 14:
                return UnsafeUtil.getLong(t, jOffset) != 0;
            case 15:
                return UnsafeUtil.getInt(t, jOffset) != 0;
            case 16:
                return UnsafeUtil.getLong(t, jOffset) != 0;
            case 17:
                return UnsafeUtil.getObject(t, jOffset) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private int positionForFieldNumber(int i2, int i3) {
        if (i2 < this.minFieldNumber || i2 > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i2, i3);
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        extensionRegistryLite.getClass();
        checkMutable(t);
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, t, reader, extensionRegistryLite);
    }

    private boolean equals(T t, T t2, int i2) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i2);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                return arePresentForEquals(t, t2, i2) && Double.doubleToLongBits(UnsafeUtil.getDouble(t, jOffset)) == Double.doubleToLongBits(UnsafeUtil.getDouble(t2, jOffset));
            case 1:
                return arePresentForEquals(t, t2, i2) && Float.floatToIntBits(UnsafeUtil.getFloat(t, jOffset)) == Float.floatToIntBits(UnsafeUtil.getFloat(t2, jOffset));
            case 2:
                return arePresentForEquals(t, t2, i2) && UnsafeUtil.getLong(t, jOffset) == UnsafeUtil.getLong(t2, jOffset);
            case 3:
                return arePresentForEquals(t, t2, i2) && UnsafeUtil.getLong(t, jOffset) == UnsafeUtil.getLong(t2, jOffset);
            case 4:
                return arePresentForEquals(t, t2, i2) && UnsafeUtil.getInt(t, jOffset) == UnsafeUtil.getInt(t2, jOffset);
            case 5:
                return arePresentForEquals(t, t2, i2) && UnsafeUtil.getLong(t, jOffset) == UnsafeUtil.getLong(t2, jOffset);
            case 6:
                return arePresentForEquals(t, t2, i2) && UnsafeUtil.getInt(t, jOffset) == UnsafeUtil.getInt(t2, jOffset);
            case 7:
                return arePresentForEquals(t, t2, i2) && UnsafeUtil.getBoolean(t, jOffset) == UnsafeUtil.getBoolean(t2, jOffset);
            case 8:
                return arePresentForEquals(t, t2, i2) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t, jOffset), UnsafeUtil.getObject(t2, jOffset));
            case 9:
                return arePresentForEquals(t, t2, i2) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t, jOffset), UnsafeUtil.getObject(t2, jOffset));
            case 10:
                return arePresentForEquals(t, t2, i2) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t, jOffset), UnsafeUtil.getObject(t2, jOffset));
            case 11:
                return arePresentForEquals(t, t2, i2) && UnsafeUtil.getInt(t, jOffset) == UnsafeUtil.getInt(t2, jOffset);
            case 12:
                return arePresentForEquals(t, t2, i2) && UnsafeUtil.getInt(t, jOffset) == UnsafeUtil.getInt(t2, jOffset);
            case 13:
                return arePresentForEquals(t, t2, i2) && UnsafeUtil.getInt(t, jOffset) == UnsafeUtil.getInt(t2, jOffset);
            case 14:
                return arePresentForEquals(t, t2, i2) && UnsafeUtil.getLong(t, jOffset) == UnsafeUtil.getLong(t2, jOffset);
            case 15:
                return arePresentForEquals(t, t2, i2) && UnsafeUtil.getInt(t, jOffset) == UnsafeUtil.getInt(t2, jOffset);
            case 16:
                return arePresentForEquals(t, t2, i2) && UnsafeUtil.getLong(t, jOffset) == UnsafeUtil.getLong(t2, jOffset);
            case 17:
                return arePresentForEquals(t, t2, i2) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t, jOffset), UnsafeUtil.getObject(t2, jOffset));
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
                return SchemaUtil.safeEquals(UnsafeUtil.getObject(t, jOffset), UnsafeUtil.getObject(t2, jOffset));
            case 50:
                return SchemaUtil.safeEquals(UnsafeUtil.getObject(t, jOffset), UnsafeUtil.getObject(t2, jOffset));
            case 51:
            case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
            case 53:
            case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
            case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
            case 56:
            case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
            case 58:
            case 59:
            case 60:
            case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
            case 62:
            case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return isOneofCaseEqual(t, t2, i2) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t, jOffset), UnsafeUtil.getObject(t2, jOffset));
            default:
                return true;
        }
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t, byte[] bArr, int i2, int i3, ArrayDecoders.Registers registers) throws IOException {
        parseMessage(t, bArr, i2, i3, 0, registers);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isInitialized(Object obj, int i2, Schema schema) {
        return schema.isInitialized(UnsafeUtil.getObject(obj, offset(i2)));
    }
}
