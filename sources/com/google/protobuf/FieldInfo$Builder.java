package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class FieldInfo$Builder {
    private java.lang.reflect.Field cachedSizeField;
    private boolean enforceUtf8;
    private Internal.EnumVerifier enumVerifier;
    private java.lang.reflect.Field field;
    private int fieldNumber;
    private Object mapDefaultEntry;
    private m3 oneof;
    private Class<?> oneofStoredType;
    private java.lang.reflect.Field presenceField;
    private int presenceMask;
    private boolean required;
    private FieldType type;

    public /* synthetic */ FieldInfo$Builder(r1 r1Var) {
        this();
    }

    public s1 build() {
        Object obj = this.mapDefaultEntry;
        if (obj != null) {
            java.lang.reflect.Field field = this.field;
            int i10 = this.fieldNumber;
            Internal.EnumVerifier enumVerifier = this.enumVerifier;
            Internal.checkNotNull(obj, "mapDefaultEntry");
            s1.a(i10);
            Internal.checkNotNull(field, "field");
            return new s1(field, i10, FieldType.MAP, null, 0, false, true, obj, enumVerifier, null);
        }
        java.lang.reflect.Field field2 = this.presenceField;
        if (field2 != null) {
            if (this.required) {
                java.lang.reflect.Field field3 = this.field;
                int i11 = this.fieldNumber;
                FieldType fieldType = this.type;
                int i12 = this.presenceMask;
                boolean z10 = this.enforceUtf8;
                Internal.EnumVerifier enumVerifier2 = this.enumVerifier;
                s1.a(i11);
                Internal.checkNotNull(field3, "field");
                Internal.checkNotNull(fieldType, "fieldType");
                Internal.checkNotNull(field2, "presenceField");
                if (i12 == 0 || ((i12 - 1) & i12) != 0) {
                    throw new IllegalArgumentException(l1.d.e(i12, "presenceMask must have exactly one bit set: "));
                }
                return new s1(field3, i11, fieldType, field2, i12, true, z10, null, enumVerifier2, null);
            }
            java.lang.reflect.Field field4 = this.field;
            int i13 = this.fieldNumber;
            FieldType fieldType2 = this.type;
            int i14 = this.presenceMask;
            boolean z11 = this.enforceUtf8;
            Internal.EnumVerifier enumVerifier3 = this.enumVerifier;
            s1.a(i13);
            Internal.checkNotNull(field4, "field");
            Internal.checkNotNull(fieldType2, "fieldType");
            Internal.checkNotNull(field2, "presenceField");
            if (i14 == 0 || ((i14 - 1) & i14) != 0) {
                throw new IllegalArgumentException(l1.d.e(i14, "presenceMask must have exactly one bit set: "));
            }
            return new s1(field4, i13, fieldType2, field2, i14, false, z11, null, enumVerifier3, null);
        }
        Internal.EnumVerifier enumVerifier4 = this.enumVerifier;
        if (enumVerifier4 != null) {
            java.lang.reflect.Field field5 = this.cachedSizeField;
            if (field5 == null) {
                java.lang.reflect.Field field6 = this.field;
                int i15 = this.fieldNumber;
                FieldType fieldType3 = this.type;
                s1.a(i15);
                Internal.checkNotNull(field6, "field");
                return new s1(field6, i15, fieldType3, null, 0, false, false, null, enumVerifier4, null);
            }
            java.lang.reflect.Field field7 = this.field;
            int i16 = this.fieldNumber;
            FieldType fieldType4 = this.type;
            s1.a(i16);
            Internal.checkNotNull(field7, "field");
            return new s1(field7, i16, fieldType4, null, 0, false, false, null, enumVerifier4, field5);
        }
        java.lang.reflect.Field field8 = this.cachedSizeField;
        if (field8 != null) {
            java.lang.reflect.Field field9 = this.field;
            int i17 = this.fieldNumber;
            FieldType fieldType5 = this.type;
            s1.a(i17);
            Internal.checkNotNull(field9, "field");
            Internal.checkNotNull(fieldType5, "fieldType");
            if (fieldType5 == FieldType.MESSAGE_LIST || fieldType5 == FieldType.GROUP_LIST) {
                throw new IllegalStateException("Shouldn't be called for repeated message fields.");
            }
            return new s1(field9, i17, fieldType5, null, 0, false, false, null, null, field8);
        }
        java.lang.reflect.Field field10 = this.field;
        int i18 = this.fieldNumber;
        FieldType fieldType6 = this.type;
        boolean z12 = this.enforceUtf8;
        s1.a(i18);
        Internal.checkNotNull(field10, "field");
        Internal.checkNotNull(fieldType6, "fieldType");
        if (fieldType6 == FieldType.MESSAGE_LIST || fieldType6 == FieldType.GROUP_LIST) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new s1(field10, i18, fieldType6, null, 0, false, z12, null, null, null);
    }

    public FieldInfo$Builder withCachedSizeField(java.lang.reflect.Field field) {
        this.cachedSizeField = field;
        return this;
    }

    public FieldInfo$Builder withEnforceUtf8(boolean z10) {
        this.enforceUtf8 = z10;
        return this;
    }

    public FieldInfo$Builder withEnumVerifier(Internal.EnumVerifier enumVerifier) {
        this.enumVerifier = enumVerifier;
        return this;
    }

    public FieldInfo$Builder withField(java.lang.reflect.Field field) {
        this.field = field;
        return this;
    }

    public FieldInfo$Builder withFieldNumber(int i10) {
        this.fieldNumber = i10;
        return this;
    }

    public FieldInfo$Builder withMapDefaultEntry(Object obj) {
        this.mapDefaultEntry = obj;
        return this;
    }

    public FieldInfo$Builder withOneof(m3 m3Var, Class<?> cls) {
        if (this.field != null || this.presenceField != null) {
            throw new IllegalStateException("Cannot set oneof when field or presenceField have been provided");
        }
        this.oneofStoredType = cls;
        return this;
    }

    public FieldInfo$Builder withPresence(java.lang.reflect.Field field, int i10) {
        this.presenceField = (java.lang.reflect.Field) Internal.checkNotNull(field, "presenceField");
        this.presenceMask = i10;
        return this;
    }

    public FieldInfo$Builder withRequired(boolean z10) {
        this.required = z10;
        return this;
    }

    public FieldInfo$Builder withType(FieldType fieldType) {
        this.type = fieldType;
        return this;
    }

    private FieldInfo$Builder() {
    }
}
