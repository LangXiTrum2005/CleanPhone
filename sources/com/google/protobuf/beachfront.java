package com.google.protobuf;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: CodedInputStreamReader.java */
/* JADX INFO: loaded from: classes3.dex */
public final class beachfront implements polder {
    private static final int FIXED32_MULTIPLE_MASK = 3;
    private static final int FIXED64_MULTIPLE_MASK = 7;
    private static final int NEXT_TAG_UNSET = 0;
    private int endGroupTag;
    private final CodedInputStream input;
    private int nextTag = 0;
    private int tag;

    /* JADX INFO: compiled from: CodedInputStreamReader.java */
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
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private beachfront(CodedInputStream codedInputStream) {
        CodedInputStream codedInputStream2 = (CodedInputStream) Internal.checkNotNull(codedInputStream, "input");
        this.input = codedInputStream2;
        codedInputStream2.wrapper = this;
    }

    public static beachfront forCodedInput(CodedInputStream codedInputStream) {
        beachfront beachfrontVar = codedInputStream.wrapper;
        return beachfrontVar != null ? beachfrontVar : new beachfront(codedInputStream);
    }

    private <T> void mergeGroupFieldInternal(T t, seminary<T> seminaryVar, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int i = this.endGroupTag;
        this.endGroupTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(this.tag), 4);
        try {
            seminaryVar.mergeFrom(t, this, extensionRegistryLite);
            if (this.tag != this.endGroupTag) {
                throw InvalidProtocolBufferException.parseFailure();
            }
            this.endGroupTag = i;
        } catch (Throwable th) {
            this.endGroupTag = i;
            throw th;
        }
    }

    private <T> void mergeMessageFieldInternal(T t, seminary<T> seminaryVar, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int uInt32 = this.input.readUInt32();
        CodedInputStream codedInputStream = this.input;
        if (codedInputStream.recursionDepth >= codedInputStream.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iPushLimit = codedInputStream.pushLimit(uInt32);
        this.input.recursionDepth++;
        seminaryVar.mergeFrom(t, this, extensionRegistryLite);
        this.input.checkLastTagWas(0);
        CodedInputStream codedInputStream2 = this.input;
        codedInputStream2.recursionDepth--;
        codedInputStream2.popLimit(iPushLimit);
    }

    private Object readField(WireFormat.FieldType fieldType, Class<?> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        switch (attabal.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                return Boolean.valueOf(readBool());
            case 2:
                return readBytes();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(readEnum());
            case 5:
                return Integer.valueOf(readFixed32());
            case 6:
                return Long.valueOf(readFixed64());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(readInt32());
            case 9:
                return Long.valueOf(readInt64());
            case 10:
                return readMessage(cls, extensionRegistryLite);
            case 11:
                return Integer.valueOf(readSFixed32());
            case 12:
                return Long.valueOf(readSFixed64());
            case 13:
                return Integer.valueOf(readSInt32());
            case 14:
                return Long.valueOf(readSInt64());
            case 15:
                return readStringRequireUtf8();
            case 16:
                return Integer.valueOf(readUInt32());
            case 17:
                return Long.valueOf(readUInt64());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private void requirePosition(int i) throws IOException {
        if (this.input.getTotalBytesRead() != i) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    private void requireWireType(int i) throws IOException {
        if (WireFormat.getTagWireType(this.tag) != i) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    private void verifyPackedFixed32Length(int i) throws IOException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    private void verifyPackedFixed64Length(int i) throws IOException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    @Override // com.google.protobuf.polder
    public int getFieldNumber() throws IOException {
        int i = this.nextTag;
        if (i != 0) {
            this.tag = i;
            this.nextTag = 0;
        } else {
            this.tag = this.input.readTag();
        }
        int i2 = this.tag;
        if (i2 == 0 || i2 == this.endGroupTag) {
            return Integer.MAX_VALUE;
        }
        return WireFormat.getTagFieldNumber(i2);
    }

    @Override // com.google.protobuf.polder
    public int getTag() {
        return this.tag;
    }

    @Override // com.google.protobuf.polder
    public <T> void mergeGroupField(T t, seminary<T> seminaryVar, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        requireWireType(3);
        mergeGroupFieldInternal(t, seminaryVar, extensionRegistryLite);
    }

    @Override // com.google.protobuf.polder
    public <T> void mergeMessageField(T t, seminary<T> seminaryVar, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        requireWireType(2);
        mergeMessageFieldInternal(t, seminaryVar, extensionRegistryLite);
    }

    @Override // com.google.protobuf.polder
    public boolean readBool() throws IOException {
        requireWireType(0);
        return this.input.readBool();
    }

    @Override // com.google.protobuf.polder
    public void readBoolList(List<Boolean> list) throws IOException {
        int tag;
        int tag2;
        if (!(list instanceof wireman)) {
            int tagWireType = WireFormat.getTagWireType(this.tag);
            if (tagWireType == 0) {
                do {
                    list.add(Boolean.valueOf(this.input.readBool()));
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag = this.input.readTag();
                    }
                } while (tag == this.tag);
                this.nextTag = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                list.add(Boolean.valueOf(this.input.readBool()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        wireman wiremanVar = (wireman) list;
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                wiremanVar.addBoolean(this.input.readBool());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.tag);
            this.nextTag = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
        do {
            wiremanVar.addBoolean(this.input.readBool());
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    @Override // com.google.protobuf.polder
    public ByteString readBytes() throws IOException {
        requireWireType(2);
        return this.input.readBytes();
    }

    @Override // com.google.protobuf.polder
    public void readBytesList(List<ByteString> list) throws IOException {
        int tag;
        if (WireFormat.getTagWireType(this.tag) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(readBytes());
            if (this.input.isAtEnd()) {
                return;
            } else {
                tag = this.input.readTag();
            }
        } while (tag == this.tag);
        this.nextTag = tag;
    }

    @Override // com.google.protobuf.polder
    public double readDouble() throws IOException {
        requireWireType(1);
        return this.input.readDouble();
    }

    @Override // com.google.protobuf.polder
    public void readDoubleList(List<Double> list) throws IOException {
        int tag;
        int tag2;
        if (!(list instanceof impromptu)) {
            int tagWireType = WireFormat.getTagWireType(this.tag);
            if (tagWireType == 1) {
                do {
                    list.add(Double.valueOf(this.input.readDouble()));
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag = this.input.readTag();
                    }
                } while (tag == this.tag);
                this.nextTag = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int uInt32 = this.input.readUInt32();
            verifyPackedFixed64Length(uInt32);
            int totalBytesRead = this.input.getTotalBytesRead() + uInt32;
            do {
                list.add(Double.valueOf(this.input.readDouble()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            return;
        }
        impromptu impromptuVar = (impromptu) list;
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 1) {
            do {
                impromptuVar.addDouble(this.input.readDouble());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.tag);
            this.nextTag = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int uInt33 = this.input.readUInt32();
        verifyPackedFixed64Length(uInt33);
        int totalBytesRead2 = this.input.getTotalBytesRead() + uInt33;
        do {
            impromptuVar.addDouble(this.input.readDouble());
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // com.google.protobuf.polder
    public int readEnum() throws IOException {
        requireWireType(0);
        return this.input.readEnum();
    }

    @Override // com.google.protobuf.polder
    public void readEnumList(List<Integer> list) throws IOException {
        int tag;
        int tag2;
        if (!(list instanceof kowloon)) {
            int tagWireType = WireFormat.getTagWireType(this.tag);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(this.input.readEnum()));
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag = this.input.readTag();
                    }
                } while (tag == this.tag);
                this.nextTag = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                list.add(Integer.valueOf(this.input.readEnum()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        kowloon kowloonVar = (kowloon) list;
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                kowloonVar.addInt(this.input.readEnum());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.tag);
            this.nextTag = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
        do {
            kowloonVar.addInt(this.input.readEnum());
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    @Override // com.google.protobuf.polder
    public int readFixed32() throws IOException {
        requireWireType(5);
        return this.input.readFixed32();
    }

    @Override // com.google.protobuf.polder
    public void readFixed32List(List<Integer> list) throws IOException {
        int tag;
        int tag2;
        if (!(list instanceof kowloon)) {
            int tagWireType = WireFormat.getTagWireType(this.tag);
            if (tagWireType == 2) {
                int uInt32 = this.input.readUInt32();
                verifyPackedFixed32Length(uInt32);
                int totalBytesRead = this.input.getTotalBytesRead() + uInt32;
                do {
                    list.add(Integer.valueOf(this.input.readFixed32()));
                } while (this.input.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(this.input.readFixed32()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag = this.input.readTag();
                }
            } while (tag == this.tag);
            this.nextTag = tag;
            return;
        }
        kowloon kowloonVar = (kowloon) list;
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 2) {
            int uInt33 = this.input.readUInt32();
            verifyPackedFixed32Length(uInt33);
            int totalBytesRead2 = this.input.getTotalBytesRead() + uInt33;
            do {
                kowloonVar.addInt(this.input.readFixed32());
            } while (this.input.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            kowloonVar.addInt(this.input.readFixed32());
            if (this.input.isAtEnd()) {
                return;
            } else {
                tag2 = this.input.readTag();
            }
        } while (tag2 == this.tag);
        this.nextTag = tag2;
    }

    @Override // com.google.protobuf.polder
    public long readFixed64() throws IOException {
        requireWireType(1);
        return this.input.readFixed64();
    }

    @Override // com.google.protobuf.polder
    public void readFixed64List(List<Long> list) throws IOException {
        int tag;
        int tag2;
        if (!(list instanceof molybdenite)) {
            int tagWireType = WireFormat.getTagWireType(this.tag);
            if (tagWireType == 1) {
                do {
                    list.add(Long.valueOf(this.input.readFixed64()));
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag = this.input.readTag();
                    }
                } while (tag == this.tag);
                this.nextTag = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int uInt32 = this.input.readUInt32();
            verifyPackedFixed64Length(uInt32);
            int totalBytesRead = this.input.getTotalBytesRead() + uInt32;
            do {
                list.add(Long.valueOf(this.input.readFixed64()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            return;
        }
        molybdenite molybdeniteVar = (molybdenite) list;
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 1) {
            do {
                molybdeniteVar.addLong(this.input.readFixed64());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.tag);
            this.nextTag = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int uInt33 = this.input.readUInt32();
        verifyPackedFixed64Length(uInt33);
        int totalBytesRead2 = this.input.getTotalBytesRead() + uInt33;
        do {
            molybdeniteVar.addLong(this.input.readFixed64());
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // com.google.protobuf.polder
    public float readFloat() throws IOException {
        requireWireType(5);
        return this.input.readFloat();
    }

    @Override // com.google.protobuf.polder
    public void readFloatList(List<Float> list) throws IOException {
        int tag;
        int tag2;
        if (!(list instanceof impassible)) {
            int tagWireType = WireFormat.getTagWireType(this.tag);
            if (tagWireType == 2) {
                int uInt32 = this.input.readUInt32();
                verifyPackedFixed32Length(uInt32);
                int totalBytesRead = this.input.getTotalBytesRead() + uInt32;
                do {
                    list.add(Float.valueOf(this.input.readFloat()));
                } while (this.input.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Float.valueOf(this.input.readFloat()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag = this.input.readTag();
                }
            } while (tag == this.tag);
            this.nextTag = tag;
            return;
        }
        impassible impassibleVar = (impassible) list;
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 2) {
            int uInt33 = this.input.readUInt32();
            verifyPackedFixed32Length(uInt33);
            int totalBytesRead2 = this.input.getTotalBytesRead() + uInt33;
            do {
                impassibleVar.addFloat(this.input.readFloat());
            } while (this.input.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            impassibleVar.addFloat(this.input.readFloat());
            if (this.input.isAtEnd()) {
                return;
            } else {
                tag2 = this.input.readTag();
            }
        } while (tag2 == this.tag);
        this.nextTag = tag2;
    }

    @Override // com.google.protobuf.polder
    @Deprecated
    public <T> T readGroup(Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        requireWireType(3);
        return (T) readGroup(supplicat.getInstance().schemaFor((Class) cls), extensionRegistryLite);
    }

    @Override // com.google.protobuf.polder
    @Deprecated
    public <T> T readGroupBySchemaWithCheck(seminary<T> seminaryVar, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        requireWireType(3);
        return (T) readGroup(seminaryVar, extensionRegistryLite);
    }

    @Override // com.google.protobuf.polder
    @Deprecated
    public <T> void readGroupList(List<T> list, Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        readGroupList(list, supplicat.getInstance().schemaFor((Class) cls), extensionRegistryLite);
    }

    @Override // com.google.protobuf.polder
    public int readInt32() throws IOException {
        requireWireType(0);
        return this.input.readInt32();
    }

    @Override // com.google.protobuf.polder
    public void readInt32List(List<Integer> list) throws IOException {
        int tag;
        int tag2;
        if (!(list instanceof kowloon)) {
            int tagWireType = WireFormat.getTagWireType(this.tag);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(this.input.readInt32()));
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag = this.input.readTag();
                    }
                } while (tag == this.tag);
                this.nextTag = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                list.add(Integer.valueOf(this.input.readInt32()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        kowloon kowloonVar = (kowloon) list;
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                kowloonVar.addInt(this.input.readInt32());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.tag);
            this.nextTag = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
        do {
            kowloonVar.addInt(this.input.readInt32());
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    @Override // com.google.protobuf.polder
    public long readInt64() throws IOException {
        requireWireType(0);
        return this.input.readInt64();
    }

    @Override // com.google.protobuf.polder
    public void readInt64List(List<Long> list) throws IOException {
        int tag;
        int tag2;
        if (!(list instanceof molybdenite)) {
            int tagWireType = WireFormat.getTagWireType(this.tag);
            if (tagWireType == 0) {
                do {
                    list.add(Long.valueOf(this.input.readInt64()));
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag = this.input.readTag();
                    }
                } while (tag == this.tag);
                this.nextTag = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                list.add(Long.valueOf(this.input.readInt64()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        molybdenite molybdeniteVar = (molybdenite) list;
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                molybdeniteVar.addLong(this.input.readInt64());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.tag);
            this.nextTag = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
        do {
            molybdeniteVar.addLong(this.input.readInt64());
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.polder
    public <K, V> void readMap(Map<K, V> map, MapEntryLite.saneness<K, V> sanenessVar, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        requireWireType(2);
        int iPushLimit = this.input.pushLimit(this.input.readUInt32());
        Object field = sanenessVar.defaultKey;
        Object field2 = sanenessVar.defaultValue;
        while (true) {
            try {
                int fieldNumber = getFieldNumber();
                if (fieldNumber == Integer.MAX_VALUE || this.input.isAtEnd()) {
                    break;
                }
                if (fieldNumber == 1) {
                    field = readField(sanenessVar.keyType, null, null);
                } else if (fieldNumber != 2) {
                    try {
                        if (!skipField()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!skipField()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    }
                } else {
                    field2 = readField(sanenessVar.valueType, sanenessVar.defaultValue.getClass(), extensionRegistryLite);
                }
            } catch (Throwable th) {
                this.input.popLimit(iPushLimit);
                throw th;
            }
        }
        map.put(field, field2);
        this.input.popLimit(iPushLimit);
    }

    @Override // com.google.protobuf.polder
    public <T> T readMessage(Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        requireWireType(2);
        return (T) readMessage(supplicat.getInstance().schemaFor((Class) cls), extensionRegistryLite);
    }

    @Override // com.google.protobuf.polder
    public <T> T readMessageBySchemaWithCheck(seminary<T> seminaryVar, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        requireWireType(2);
        return (T) readMessage(seminaryVar, extensionRegistryLite);
    }

    @Override // com.google.protobuf.polder
    public <T> void readMessageList(List<T> list, Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        readMessageList(list, supplicat.getInstance().schemaFor((Class) cls), extensionRegistryLite);
    }

    @Override // com.google.protobuf.polder
    public int readSFixed32() throws IOException {
        requireWireType(5);
        return this.input.readSFixed32();
    }

    @Override // com.google.protobuf.polder
    public void readSFixed32List(List<Integer> list) throws IOException {
        int tag;
        int tag2;
        if (!(list instanceof kowloon)) {
            int tagWireType = WireFormat.getTagWireType(this.tag);
            if (tagWireType == 2) {
                int uInt32 = this.input.readUInt32();
                verifyPackedFixed32Length(uInt32);
                int totalBytesRead = this.input.getTotalBytesRead() + uInt32;
                do {
                    list.add(Integer.valueOf(this.input.readSFixed32()));
                } while (this.input.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(this.input.readSFixed32()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag = this.input.readTag();
                }
            } while (tag == this.tag);
            this.nextTag = tag;
            return;
        }
        kowloon kowloonVar = (kowloon) list;
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 2) {
            int uInt33 = this.input.readUInt32();
            verifyPackedFixed32Length(uInt33);
            int totalBytesRead2 = this.input.getTotalBytesRead() + uInt33;
            do {
                kowloonVar.addInt(this.input.readSFixed32());
            } while (this.input.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            kowloonVar.addInt(this.input.readSFixed32());
            if (this.input.isAtEnd()) {
                return;
            } else {
                tag2 = this.input.readTag();
            }
        } while (tag2 == this.tag);
        this.nextTag = tag2;
    }

    @Override // com.google.protobuf.polder
    public long readSFixed64() throws IOException {
        requireWireType(1);
        return this.input.readSFixed64();
    }

    @Override // com.google.protobuf.polder
    public void readSFixed64List(List<Long> list) throws IOException {
        int tag;
        int tag2;
        if (!(list instanceof molybdenite)) {
            int tagWireType = WireFormat.getTagWireType(this.tag);
            if (tagWireType == 1) {
                do {
                    list.add(Long.valueOf(this.input.readSFixed64()));
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag = this.input.readTag();
                    }
                } while (tag == this.tag);
                this.nextTag = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int uInt32 = this.input.readUInt32();
            verifyPackedFixed64Length(uInt32);
            int totalBytesRead = this.input.getTotalBytesRead() + uInt32;
            do {
                list.add(Long.valueOf(this.input.readSFixed64()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            return;
        }
        molybdenite molybdeniteVar = (molybdenite) list;
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 1) {
            do {
                molybdeniteVar.addLong(this.input.readSFixed64());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.tag);
            this.nextTag = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int uInt33 = this.input.readUInt32();
        verifyPackedFixed64Length(uInt33);
        int totalBytesRead2 = this.input.getTotalBytesRead() + uInt33;
        do {
            molybdeniteVar.addLong(this.input.readSFixed64());
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // com.google.protobuf.polder
    public int readSInt32() throws IOException {
        requireWireType(0);
        return this.input.readSInt32();
    }

    @Override // com.google.protobuf.polder
    public void readSInt32List(List<Integer> list) throws IOException {
        int tag;
        int tag2;
        if (!(list instanceof kowloon)) {
            int tagWireType = WireFormat.getTagWireType(this.tag);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(this.input.readSInt32()));
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag = this.input.readTag();
                    }
                } while (tag == this.tag);
                this.nextTag = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                list.add(Integer.valueOf(this.input.readSInt32()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        kowloon kowloonVar = (kowloon) list;
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                kowloonVar.addInt(this.input.readSInt32());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.tag);
            this.nextTag = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
        do {
            kowloonVar.addInt(this.input.readSInt32());
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    @Override // com.google.protobuf.polder
    public long readSInt64() throws IOException {
        requireWireType(0);
        return this.input.readSInt64();
    }

    @Override // com.google.protobuf.polder
    public void readSInt64List(List<Long> list) throws IOException {
        int tag;
        int tag2;
        if (!(list instanceof molybdenite)) {
            int tagWireType = WireFormat.getTagWireType(this.tag);
            if (tagWireType == 0) {
                do {
                    list.add(Long.valueOf(this.input.readSInt64()));
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag = this.input.readTag();
                    }
                } while (tag == this.tag);
                this.nextTag = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                list.add(Long.valueOf(this.input.readSInt64()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        molybdenite molybdeniteVar = (molybdenite) list;
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                molybdeniteVar.addLong(this.input.readSInt64());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.tag);
            this.nextTag = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
        do {
            molybdeniteVar.addLong(this.input.readSInt64());
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    @Override // com.google.protobuf.polder
    public String readString() throws IOException {
        requireWireType(2);
        return this.input.readString();
    }

    @Override // com.google.protobuf.polder
    public void readStringList(List<String> list) throws IOException {
        readStringListInternal(list, false);
    }

    public void readStringListInternal(List<String> list, boolean z) throws IOException {
        int tag;
        int tag2;
        if (WireFormat.getTagWireType(this.tag) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        if (!(list instanceof LazyStringList) || z) {
            do {
                list.add(z ? readStringRequireUtf8() : readString());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag = this.input.readTag();
                }
            } while (tag == this.tag);
            this.nextTag = tag;
            return;
        }
        LazyStringList lazyStringList = (LazyStringList) list;
        do {
            lazyStringList.add(readBytes());
            if (this.input.isAtEnd()) {
                return;
            } else {
                tag2 = this.input.readTag();
            }
        } while (tag2 == this.tag);
        this.nextTag = tag2;
    }

    @Override // com.google.protobuf.polder
    public void readStringListRequireUtf8(List<String> list) throws IOException {
        readStringListInternal(list, true);
    }

    @Override // com.google.protobuf.polder
    public String readStringRequireUtf8() throws IOException {
        requireWireType(2);
        return this.input.readStringRequireUtf8();
    }

    @Override // com.google.protobuf.polder
    public int readUInt32() throws IOException {
        requireWireType(0);
        return this.input.readUInt32();
    }

    @Override // com.google.protobuf.polder
    public void readUInt32List(List<Integer> list) throws IOException {
        int tag;
        int tag2;
        if (!(list instanceof kowloon)) {
            int tagWireType = WireFormat.getTagWireType(this.tag);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(this.input.readUInt32()));
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag = this.input.readTag();
                    }
                } while (tag == this.tag);
                this.nextTag = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                list.add(Integer.valueOf(this.input.readUInt32()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        kowloon kowloonVar = (kowloon) list;
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                kowloonVar.addInt(this.input.readUInt32());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.tag);
            this.nextTag = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
        do {
            kowloonVar.addInt(this.input.readUInt32());
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    @Override // com.google.protobuf.polder
    public long readUInt64() throws IOException {
        requireWireType(0);
        return this.input.readUInt64();
    }

    @Override // com.google.protobuf.polder
    public void readUInt64List(List<Long> list) throws IOException {
        int tag;
        int tag2;
        if (!(list instanceof molybdenite)) {
            int tagWireType = WireFormat.getTagWireType(this.tag);
            if (tagWireType == 0) {
                do {
                    list.add(Long.valueOf(this.input.readUInt64()));
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag = this.input.readTag();
                    }
                } while (tag == this.tag);
                this.nextTag = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                list.add(Long.valueOf(this.input.readUInt64()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        molybdenite molybdeniteVar = (molybdenite) list;
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                molybdeniteVar.addLong(this.input.readUInt64());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.tag);
            this.nextTag = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
        do {
            molybdeniteVar.addLong(this.input.readUInt64());
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    @Override // com.google.protobuf.polder
    public boolean shouldDiscardUnknownFields() {
        return this.input.shouldDiscardUnknownFields();
    }

    @Override // com.google.protobuf.polder
    public boolean skipField() throws IOException {
        int i;
        if (this.input.isAtEnd() || (i = this.tag) == this.endGroupTag) {
            return false;
        }
        return this.input.skipField(i);
    }

    private <T> T readGroup(seminary<T> seminaryVar, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        T tNewInstance = seminaryVar.newInstance();
        mergeGroupFieldInternal(tNewInstance, seminaryVar, extensionRegistryLite);
        seminaryVar.makeImmutable(tNewInstance);
        return tNewInstance;
    }

    private <T> T readMessage(seminary<T> seminaryVar, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        T tNewInstance = seminaryVar.newInstance();
        mergeMessageFieldInternal(tNewInstance, seminaryVar, extensionRegistryLite);
        seminaryVar.makeImmutable(tNewInstance);
        return tNewInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.polder
    @Deprecated
    public <T> void readGroupList(List<T> list, seminary<T> seminaryVar, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int tag;
        if (WireFormat.getTagWireType(this.tag) == 3) {
            int i = this.tag;
            do {
                list.add(readGroup(seminaryVar, extensionRegistryLite));
                if (this.input.isAtEnd() || this.nextTag != 0) {
                    return;
                } else {
                    tag = this.input.readTag();
                }
            } while (tag == i);
            this.nextTag = tag;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.polder
    public <T> void readMessageList(List<T> list, seminary<T> seminaryVar, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int tag;
        if (WireFormat.getTagWireType(this.tag) == 2) {
            int i = this.tag;
            do {
                list.add(readMessage(seminaryVar, extensionRegistryLite));
                if (this.input.isAtEnd() || this.nextTag != 0) {
                    return;
                } else {
                    tag = this.input.readTag();
                }
            } while (tag == i);
            this.nextTag = tag;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }
}
