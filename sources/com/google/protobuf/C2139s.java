package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4754uW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3578h30;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2139s implements AX {
    private static final int FIXED32_MULTIPLE_MASK = 3;
    private static final int FIXED64_MULTIPLE_MASK = 7;
    private static final int NEXT_TAG_UNSET = 0;
    private int endGroupTag;
    private final CodedInputStream input;
    private int nextTag = 0;
    private int tag;

    private C2139s(CodedInputStream codedInputStream) {
        CodedInputStream codedInputStream2 = (CodedInputStream) Internal.checkNotNull(codedInputStream, "input");
        this.input = codedInputStream2;
        codedInputStream2.wrapper = this;
    }

    public static C2139s forCodedInput(CodedInputStream codedInputStream) {
        C2139s c2139s = codedInputStream.wrapper;
        return c2139s != null ? c2139s : new C2139s(codedInputStream);
    }

    private <T> void mergeGroupFieldInternal(T t, InterfaceC3578h30 interfaceC3578h30, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int i = this.endGroupTag;
        this.endGroupTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(this.tag), 4);
        try {
            interfaceC3578h30.mergeFrom(t, this, extensionRegistryLite);
            if (this.tag != this.endGroupTag) {
                throw InvalidProtocolBufferException.parseFailure();
            }
            this.endGroupTag = i;
        } catch (Throwable th) {
            this.endGroupTag = i;
            throw th;
        }
    }

    private <T> void mergeMessageFieldInternal(T t, InterfaceC3578h30 interfaceC3578h30, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int uInt32 = this.input.readUInt32();
        CodedInputStream codedInputStream = this.input;
        if (codedInputStream.recursionDepth >= codedInputStream.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iPushLimit = codedInputStream.pushLimit(uInt32);
        this.input.recursionDepth++;
        interfaceC3578h30.mergeFrom(t, this, extensionRegistryLite);
        this.input.checkLastTagWas(0);
        CodedInputStream codedInputStream2 = this.input;
        codedInputStream2.recursionDepth--;
        codedInputStream2.popLimit(iPushLimit);
    }

    private Object readField(WireFormat.FieldType fieldType, Class<?> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        switch (r.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
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

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
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

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    public int getTag() {
        return this.tag;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    public <T> void mergeGroupField(T t, InterfaceC3578h30 interfaceC3578h30, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        requireWireType(3);
        mergeGroupFieldInternal(t, interfaceC3578h30, extensionRegistryLite);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    public <T> void mergeMessageField(T t, InterfaceC3578h30 interfaceC3578h30, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        requireWireType(2);
        mergeMessageFieldInternal(t, interfaceC3578h30, extensionRegistryLite);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    public boolean readBool() throws IOException {
        requireWireType(0);
        return this.input.readBool();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    public void readBoolList(List<Boolean> list) throws IOException {
        int tag;
        int tag2;
        if (!(list instanceof C2118h)) {
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
        C2118h c2118h = (C2118h) list;
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                c2118h.addBoolean(this.input.readBool());
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
            c2118h.addBoolean(this.input.readBool());
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    public ByteString readBytes() throws IOException {
        requireWireType(2);
        return this.input.readBytes();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
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

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    public double readDouble() throws IOException {
        requireWireType(1);
        return this.input.readDouble();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    public void readDoubleList(List<Double> list) throws IOException {
        int tag;
        int tag2;
        if (!(list instanceof B)) {
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
        B b = (B) list;
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 1) {
            do {
                b.addDouble(this.input.readDouble());
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
            b.addDouble(this.input.readDouble());
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    public int readEnum() throws IOException {
        requireWireType(0);
        return this.input.readEnum();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    public void readEnumList(List<Integer> list) throws IOException {
        int tag;
        int tag2;
        if (!(list instanceof C2113e0)) {
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
        C2113e0 c2113e0 = (C2113e0) list;
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                c2113e0.addInt(this.input.readEnum());
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
            c2113e0.addInt(this.input.readEnum());
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    public int readFixed32() throws IOException {
        requireWireType(5);
        return this.input.readFixed32();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    public void readFixed32List(List<Integer> list) throws IOException {
        int tag;
        int tag2;
        if (!(list instanceof C2113e0)) {
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
        C2113e0 c2113e0 = (C2113e0) list;
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 2) {
            int uInt33 = this.input.readUInt32();
            verifyPackedFixed32Length(uInt33);
            int totalBytesRead2 = this.input.getTotalBytesRead() + uInt33;
            do {
                c2113e0.addInt(this.input.readFixed32());
            } while (this.input.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            c2113e0.addInt(this.input.readFixed32());
            if (this.input.isAtEnd()) {
                return;
            } else {
                tag2 = this.input.readTag();
            }
        } while (tag2 == this.tag);
        this.nextTag = tag2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    public long readFixed64() throws IOException {
        requireWireType(1);
        return this.input.readFixed64();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    public void readFixed64List(List<Long> list) throws IOException {
        int tag;
        int tag2;
        if (!(list instanceof C2131n0)) {
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
        C2131n0 c2131n0 = (C2131n0) list;
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 1) {
            do {
                c2131n0.addLong(this.input.readFixed64());
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
            c2131n0.addLong(this.input.readFixed64());
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    public float readFloat() throws IOException {
        requireWireType(5);
        return this.input.readFloat();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    public void readFloatList(List<Float> list) throws IOException {
        int tag;
        int tag2;
        if (!(list instanceof Y)) {
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
        Y y = (Y) list;
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 2) {
            int uInt33 = this.input.readUInt32();
            verifyPackedFixed32Length(uInt33);
            int totalBytesRead2 = this.input.getTotalBytesRead() + uInt33;
            do {
                y.addFloat(this.input.readFloat());
            } while (this.input.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            y.addFloat(this.input.readFloat());
            if (this.input.isAtEnd()) {
                return;
            } else {
                tag2 = this.input.readTag();
            }
        } while (tag2 == this.tag);
        this.nextTag = tag2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    @Deprecated
    public <T> T readGroup(Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        requireWireType(3);
        return (T) readGroup(C4754uW.getInstance().schemaFor((Class) cls), extensionRegistryLite);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    @Deprecated
    public <T> T readGroupBySchemaWithCheck(InterfaceC3578h30 interfaceC3578h30, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        requireWireType(3);
        return (T) readGroup(interfaceC3578h30, extensionRegistryLite);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    @Deprecated
    public <T> void readGroupList(List<T> list, Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        readGroupList(list, C4754uW.getInstance().schemaFor((Class) cls), extensionRegistryLite);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    public int readInt32() throws IOException {
        requireWireType(0);
        return this.input.readInt32();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    public void readInt32List(List<Integer> list) throws IOException {
        int tag;
        int tag2;
        if (!(list instanceof C2113e0)) {
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
        C2113e0 c2113e0 = (C2113e0) list;
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                c2113e0.addInt(this.input.readInt32());
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
            c2113e0.addInt(this.input.readInt32());
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    public long readInt64() throws IOException {
        requireWireType(0);
        return this.input.readInt64();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    public void readInt64List(List<Long> list) throws IOException {
        int tag;
        int tag2;
        if (!(list instanceof C2131n0)) {
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
        C2131n0 c2131n0 = (C2131n0) list;
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                c2131n0.addLong(this.input.readInt64());
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
            c2131n0.addLong(this.input.readInt64());
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    public <K, V> void readMap(Map<K, V> map, C2135p0 c2135p0, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        requireWireType(2);
        int iPushLimit = this.input.pushLimit(this.input.readUInt32());
        Object field = c2135p0.defaultKey;
        Object field2 = c2135p0.defaultValue;
        while (true) {
            try {
                int fieldNumber = getFieldNumber();
                if (fieldNumber == Integer.MAX_VALUE || this.input.isAtEnd()) {
                    break;
                }
                if (fieldNumber == 1) {
                    field = readField(c2135p0.keyType, null, null);
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
                    field2 = readField(c2135p0.valueType, c2135p0.defaultValue.getClass(), extensionRegistryLite);
                }
            } catch (Throwable th) {
                this.input.popLimit(iPushLimit);
                throw th;
            }
        }
        map.put(field, field2);
        this.input.popLimit(iPushLimit);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    public <T> T readMessage(Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        requireWireType(2);
        return (T) readMessage(C4754uW.getInstance().schemaFor((Class) cls), extensionRegistryLite);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    public <T> T readMessageBySchemaWithCheck(InterfaceC3578h30 interfaceC3578h30, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        requireWireType(2);
        return (T) readMessage(interfaceC3578h30, extensionRegistryLite);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    public <T> void readMessageList(List<T> list, Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        readMessageList(list, C4754uW.getInstance().schemaFor((Class) cls), extensionRegistryLite);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    public int readSFixed32() throws IOException {
        requireWireType(5);
        return this.input.readSFixed32();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    public void readSFixed32List(List<Integer> list) throws IOException {
        int tag;
        int tag2;
        if (!(list instanceof C2113e0)) {
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
        C2113e0 c2113e0 = (C2113e0) list;
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 2) {
            int uInt33 = this.input.readUInt32();
            verifyPackedFixed32Length(uInt33);
            int totalBytesRead2 = this.input.getTotalBytesRead() + uInt33;
            do {
                c2113e0.addInt(this.input.readSFixed32());
            } while (this.input.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            c2113e0.addInt(this.input.readSFixed32());
            if (this.input.isAtEnd()) {
                return;
            } else {
                tag2 = this.input.readTag();
            }
        } while (tag2 == this.tag);
        this.nextTag = tag2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    public long readSFixed64() throws IOException {
        requireWireType(1);
        return this.input.readSFixed64();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    public void readSFixed64List(List<Long> list) throws IOException {
        int tag;
        int tag2;
        if (!(list instanceof C2131n0)) {
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
        C2131n0 c2131n0 = (C2131n0) list;
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 1) {
            do {
                c2131n0.addLong(this.input.readSFixed64());
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
            c2131n0.addLong(this.input.readSFixed64());
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    public int readSInt32() throws IOException {
        requireWireType(0);
        return this.input.readSInt32();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    public void readSInt32List(List<Integer> list) throws IOException {
        int tag;
        int tag2;
        if (!(list instanceof C2113e0)) {
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
        C2113e0 c2113e0 = (C2113e0) list;
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                c2113e0.addInt(this.input.readSInt32());
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
            c2113e0.addInt(this.input.readSInt32());
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    public long readSInt64() throws IOException {
        requireWireType(0);
        return this.input.readSInt64();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    public void readSInt64List(List<Long> list) throws IOException {
        int tag;
        int tag2;
        if (!(list instanceof C2131n0)) {
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
        C2131n0 c2131n0 = (C2131n0) list;
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                c2131n0.addLong(this.input.readSInt64());
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
            c2131n0.addLong(this.input.readSInt64());
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    public String readString() throws IOException {
        requireWireType(2);
        return this.input.readString();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
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

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    public void readStringListRequireUtf8(List<String> list) throws IOException {
        readStringListInternal(list, true);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    public String readStringRequireUtf8() throws IOException {
        requireWireType(2);
        return this.input.readStringRequireUtf8();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    public int readUInt32() throws IOException {
        requireWireType(0);
        return this.input.readUInt32();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    public void readUInt32List(List<Integer> list) throws IOException {
        int tag;
        int tag2;
        if (!(list instanceof C2113e0)) {
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
        C2113e0 c2113e0 = (C2113e0) list;
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                c2113e0.addInt(this.input.readUInt32());
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
            c2113e0.addInt(this.input.readUInt32());
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    public long readUInt64() throws IOException {
        requireWireType(0);
        return this.input.readUInt64();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    public void readUInt64List(List<Long> list) throws IOException {
        int tag;
        int tag2;
        if (!(list instanceof C2131n0)) {
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
        C2131n0 c2131n0 = (C2131n0) list;
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                c2131n0.addLong(this.input.readUInt64());
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
            c2131n0.addLong(this.input.readUInt64());
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    public boolean shouldDiscardUnknownFields() {
        return this.input.shouldDiscardUnknownFields();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    public boolean skipField() throws IOException {
        int i;
        if (this.input.isAtEnd() || (i = this.tag) == this.endGroupTag) {
            return false;
        }
        return this.input.skipField(i);
    }

    private <T> T readGroup(InterfaceC3578h30 interfaceC3578h30, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        T t = (T) interfaceC3578h30.newInstance();
        mergeGroupFieldInternal(t, interfaceC3578h30, extensionRegistryLite);
        interfaceC3578h30.makeImmutable(t);
        return t;
    }

    private <T> T readMessage(InterfaceC3578h30 interfaceC3578h30, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        T t = (T) interfaceC3578h30.newInstance();
        mergeMessageFieldInternal(t, interfaceC3578h30, extensionRegistryLite);
        interfaceC3578h30.makeImmutable(t);
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    @Deprecated
    public <T> void readGroupList(List<T> list, InterfaceC3578h30 interfaceC3578h30, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int tag;
        if (WireFormat.getTagWireType(this.tag) == 3) {
            int i = this.tag;
            do {
                list.add(readGroup(interfaceC3578h30, extensionRegistryLite));
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
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX
    public <T> void readMessageList(List<T> list, InterfaceC3578h30 interfaceC3578h30, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int tag;
        if (WireFormat.getTagWireType(this.tag) == 2) {
            int i = this.tag;
            do {
                list.add(readMessage(interfaceC3578h30, extensionRegistryLite));
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
