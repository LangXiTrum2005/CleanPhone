package androidx.datastore.preferences.protobuf;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
final class CodedInputStreamReader implements Reader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CodedInputStream f4771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4773c;
    public int d = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.CodedInputStreamReader$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4774a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f4774a = iArr;
            try {
                iArr[WireFormat.FieldType.k0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4774a[WireFormat.FieldType.o0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4774a[WireFormat.FieldType.Z.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4774a[WireFormat.FieldType.q0.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4774a[WireFormat.FieldType.j0.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4774a[WireFormat.FieldType.i0.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4774a[WireFormat.FieldType.e0.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4774a[WireFormat.FieldType.h0.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4774a[WireFormat.FieldType.f0.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4774a[WireFormat.FieldType.n0.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4774a[WireFormat.FieldType.r0.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4774a[WireFormat.FieldType.s0.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f4774a[WireFormat.FieldType.t0.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f4774a[WireFormat.FieldType.u0.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f4774a[WireFormat.FieldType.l0.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f4774a[WireFormat.FieldType.p0.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f4774a[WireFormat.FieldType.g0.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public CodedInputStreamReader(CodedInputStream codedInputStream) {
        Internal.a(codedInputStream, "input");
        this.f4771a = codedInputStream;
        codedInputStream.f4753b = this;
    }

    public static void n(int i2) throws InvalidProtocolBufferException {
        if ((i2 & 3) != 0) {
            throw InvalidProtocolBufferException.l();
        }
    }

    public static void o(int i2) throws InvalidProtocolBufferException {
        if ((i2 & 7) != 0) {
            throw InvalidProtocolBufferException.l();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void a(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        m(2);
        i(obj, schema, extensionRegistryLite);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void b(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        int iY;
        int i2 = this.f4772b;
        if ((i2 & 7) != 2) {
            throw InvalidProtocolBufferException.i();
        }
        do {
            Object objNewInstance = schema.newInstance();
            i(objNewInstance, schema, extensionRegistryLite);
            schema.makeImmutable(objNewInstance);
            list.add(objNewInstance);
            CodedInputStream codedInputStream = this.f4771a;
            if (codedInputStream.e() || this.d != 0) {
                return;
            } else {
                iY = codedInputStream.y();
            }
        } while (iY == i2);
        this.d = iY;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final Object c(Class cls, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        m(2);
        Schema schemaA = Protobuf.f4904c.a(cls);
        Object objNewInstance = schemaA.newInstance();
        i(objNewInstance, schemaA, extensionRegistryLite);
        schemaA.makeImmutable(objNewInstance);
        return objNewInstance;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final Object d(Class cls, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(3);
        Schema schemaA = Protobuf.f4904c.a(cls);
        Object objNewInstance = schemaA.newInstance();
        h(objNewInstance, schemaA, extensionRegistryLite);
        schemaA.makeImmutable(objNewInstance);
        return objNewInstance;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void e(Map map, MapEntryLite.Metadata metadata, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(2);
        CodedInputStream codedInputStream = this.f4771a;
        int i2 = codedInputStream.i(codedInputStream.z());
        metadata.getClass();
        Object objJ = "";
        GeneratedMessageLite generatedMessageLite = metadata.f4879c;
        Object objJ2 = generatedMessageLite;
        while (true) {
            try {
                int fieldNumber = getFieldNumber();
                if (fieldNumber == Integer.MAX_VALUE || codedInputStream.e()) {
                    break;
                }
                if (fieldNumber == 1) {
                    objJ = j(metadata.f4877a, null, null);
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
                    objJ2 = j(metadata.f4878b, generatedMessageLite.getClass(), extensionRegistryLite);
                }
            } catch (Throwable th) {
                codedInputStream.h(i2);
                throw th;
            }
        }
        map.put(objJ, objJ2);
        codedInputStream.h(i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void f(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(3);
        h(obj, schema, extensionRegistryLite);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void g(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iY;
        int i2 = this.f4772b;
        if ((i2 & 7) != 3) {
            throw InvalidProtocolBufferException.i();
        }
        do {
            Object objNewInstance = schema.newInstance();
            h(objNewInstance, schema, extensionRegistryLite);
            schema.makeImmutable(objNewInstance);
            list.add(objNewInstance);
            CodedInputStream codedInputStream = this.f4771a;
            if (codedInputStream.e() || this.d != 0) {
                return;
            } else {
                iY = codedInputStream.y();
            }
        } while (iY == i2);
        this.d = iY;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final int getFieldNumber() {
        int i2 = this.d;
        if (i2 != 0) {
            this.f4772b = i2;
            this.d = 0;
        } else {
            this.f4772b = this.f4771a.y();
        }
        int i3 = this.f4772b;
        if (i3 == 0 || i3 == this.f4773c) {
            return Integer.MAX_VALUE;
        }
        return i3 >>> 3;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final int getTag() {
        return this.f4772b;
    }

    public final void h(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        int i2 = this.f4773c;
        this.f4773c = ((this.f4772b >>> 3) << 3) | 4;
        try {
            schema.a(obj, this, extensionRegistryLite);
            if (this.f4772b != this.f4773c) {
                throw InvalidProtocolBufferException.l();
            }
            this.f4773c = i2;
        } catch (Throwable th) {
            this.f4773c = i2;
            throw th;
        }
    }

    public final void i(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        CodedInputStream codedInputStream = this.f4771a;
        int iZ = codedInputStream.z();
        if (codedInputStream.f4752a >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i2 = codedInputStream.i(iZ);
        codedInputStream.f4752a++;
        schema.a(obj, this, extensionRegistryLite);
        codedInputStream.a(0);
        codedInputStream.f4752a--;
        codedInputStream.h(i2);
    }

    public final Object j(WireFormat.FieldType fieldType, Class cls, ExtensionRegistryLite extensionRegistryLite) {
        switch (fieldType.ordinal()) {
            case 0:
                return Double.valueOf(readDouble());
            case 1:
                return Float.valueOf(readFloat());
            case 2:
                return Long.valueOf(readInt64());
            case 3:
                return Long.valueOf(readUInt64());
            case 4:
                return Integer.valueOf(readInt32());
            case 5:
                return Long.valueOf(readFixed64());
            case 6:
                return Integer.valueOf(readFixed32());
            case 7:
                return Boolean.valueOf(readBool());
            case 8:
                return readStringRequireUtf8();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                return c(cls, extensionRegistryLite);
            case 11:
                return readBytes();
            case 12:
                return Integer.valueOf(readUInt32());
            case 13:
                return Integer.valueOf(readEnum());
            case 14:
                return Integer.valueOf(readSFixed32());
            case 15:
                return Long.valueOf(readSFixed64());
            case 16:
                return Integer.valueOf(readSInt32());
            case 17:
                return Long.valueOf(readSInt64());
        }
    }

    public final void k(List list, boolean z2) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iY;
        int iY2;
        if ((this.f4772b & 7) != 2) {
            throw InvalidProtocolBufferException.i();
        }
        boolean z3 = list instanceof LazyStringList;
        CodedInputStream codedInputStream = this.f4771a;
        if (!z3 || z2) {
            do {
                list.add(z2 ? readStringRequireUtf8() : readString());
                if (codedInputStream.e()) {
                    return;
                } else {
                    iY = codedInputStream.y();
                }
            } while (iY == this.f4772b);
            this.d = iY;
            return;
        }
        LazyStringList lazyStringList = (LazyStringList) list;
        do {
            lazyStringList.j0(readBytes());
            if (codedInputStream.e()) {
                return;
            } else {
                iY2 = codedInputStream.y();
            }
        } while (iY2 == this.f4772b);
        this.d = iY2;
    }

    public final void l(int i2) throws InvalidProtocolBufferException {
        if (this.f4771a.d() != i2) {
            throw InvalidProtocolBufferException.m();
        }
    }

    public final void m(int i2) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.f4772b & 7) != i2) {
            throw InvalidProtocolBufferException.i();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final boolean readBool() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(0);
        return this.f4771a.j();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readBoolList(List list) throws InvalidProtocolBufferException {
        int iY;
        int iY2;
        boolean z2 = list instanceof BooleanArrayList;
        CodedInputStream codedInputStream = this.f4771a;
        if (!z2) {
            int i2 = this.f4772b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(codedInputStream.j()));
                    if (codedInputStream.e()) {
                        return;
                    } else {
                        iY = codedInputStream.y();
                    }
                } while (iY == this.f4772b);
                this.d = iY;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.i();
            }
            int iD = codedInputStream.d() + codedInputStream.z();
            do {
                list.add(Boolean.valueOf(codedInputStream.j()));
            } while (codedInputStream.d() < iD);
            l(iD);
            return;
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) list;
        int i3 = this.f4772b & 7;
        if (i3 == 0) {
            do {
                booleanArrayList.addBoolean(codedInputStream.j());
                if (codedInputStream.e()) {
                    return;
                } else {
                    iY2 = codedInputStream.y();
                }
            } while (iY2 == this.f4772b);
            this.d = iY2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.i();
        }
        int iD2 = codedInputStream.d() + codedInputStream.z();
        do {
            booleanArrayList.addBoolean(codedInputStream.j());
        } while (codedInputStream.d() < iD2);
        l(iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final ByteString readBytes() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(2);
        return this.f4771a.k();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readBytesList(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iY;
        if ((this.f4772b & 7) != 2) {
            throw InvalidProtocolBufferException.i();
        }
        do {
            list.add(readBytes());
            CodedInputStream codedInputStream = this.f4771a;
            if (codedInputStream.e()) {
                return;
            } else {
                iY = codedInputStream.y();
            }
        } while (iY == this.f4772b);
        this.d = iY;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final double readDouble() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(1);
        return this.f4771a.l();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readDoubleList(List list) throws InvalidProtocolBufferException {
        int iY;
        int iY2;
        boolean z2 = list instanceof DoubleArrayList;
        CodedInputStream codedInputStream = this.f4771a;
        if (!z2) {
            int i2 = this.f4772b & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(codedInputStream.l()));
                    if (codedInputStream.e()) {
                        return;
                    } else {
                        iY = codedInputStream.y();
                    }
                } while (iY == this.f4772b);
                this.d = iY;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.i();
            }
            int iZ = codedInputStream.z();
            o(iZ);
            int iD = codedInputStream.d() + iZ;
            do {
                list.add(Double.valueOf(codedInputStream.l()));
            } while (codedInputStream.d() < iD);
            return;
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) list;
        int i3 = this.f4772b & 7;
        if (i3 == 1) {
            do {
                doubleArrayList.addDouble(codedInputStream.l());
                if (codedInputStream.e()) {
                    return;
                } else {
                    iY2 = codedInputStream.y();
                }
            } while (iY2 == this.f4772b);
            this.d = iY2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.i();
        }
        int iZ2 = codedInputStream.z();
        o(iZ2);
        int iD2 = codedInputStream.d() + iZ2;
        do {
            doubleArrayList.addDouble(codedInputStream.l());
        } while (codedInputStream.d() < iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final int readEnum() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(0);
        return this.f4771a.m();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readEnumList(List list) throws InvalidProtocolBufferException {
        int iY;
        int iY2;
        boolean z2 = list instanceof IntArrayList;
        CodedInputStream codedInputStream = this.f4771a;
        if (!z2) {
            int i2 = this.f4772b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.m()));
                    if (codedInputStream.e()) {
                        return;
                    } else {
                        iY = codedInputStream.y();
                    }
                } while (iY == this.f4772b);
                this.d = iY;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.i();
            }
            int iD = codedInputStream.d() + codedInputStream.z();
            do {
                list.add(Integer.valueOf(codedInputStream.m()));
            } while (codedInputStream.d() < iD);
            l(iD);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i3 = this.f4772b & 7;
        if (i3 == 0) {
            do {
                intArrayList.addInt(codedInputStream.m());
                if (codedInputStream.e()) {
                    return;
                } else {
                    iY2 = codedInputStream.y();
                }
            } while (iY2 == this.f4772b);
            this.d = iY2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.i();
        }
        int iD2 = codedInputStream.d() + codedInputStream.z();
        do {
            intArrayList.addInt(codedInputStream.m());
        } while (codedInputStream.d() < iD2);
        l(iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final int readFixed32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(5);
        return this.f4771a.n();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readFixed32List(List list) throws InvalidProtocolBufferException {
        int iY;
        int iY2;
        boolean z2 = list instanceof IntArrayList;
        CodedInputStream codedInputStream = this.f4771a;
        if (!z2) {
            int i2 = this.f4772b & 7;
            if (i2 == 2) {
                int iZ = codedInputStream.z();
                n(iZ);
                int iD = codedInputStream.d() + iZ;
                do {
                    list.add(Integer.valueOf(codedInputStream.n()));
                } while (codedInputStream.d() < iD);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.i();
            }
            do {
                list.add(Integer.valueOf(codedInputStream.n()));
                if (codedInputStream.e()) {
                    return;
                } else {
                    iY = codedInputStream.y();
                }
            } while (iY == this.f4772b);
            this.d = iY;
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i3 = this.f4772b & 7;
        if (i3 == 2) {
            int iZ2 = codedInputStream.z();
            n(iZ2);
            int iD2 = codedInputStream.d() + iZ2;
            do {
                intArrayList.addInt(codedInputStream.n());
            } while (codedInputStream.d() < iD2);
            return;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.i();
        }
        do {
            intArrayList.addInt(codedInputStream.n());
            if (codedInputStream.e()) {
                return;
            } else {
                iY2 = codedInputStream.y();
            }
        } while (iY2 == this.f4772b);
        this.d = iY2;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final long readFixed64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(1);
        return this.f4771a.o();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readFixed64List(List list) throws InvalidProtocolBufferException {
        int iY;
        int iY2;
        boolean z2 = list instanceof LongArrayList;
        CodedInputStream codedInputStream = this.f4771a;
        if (!z2) {
            int i2 = this.f4772b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(codedInputStream.o()));
                    if (codedInputStream.e()) {
                        return;
                    } else {
                        iY = codedInputStream.y();
                    }
                } while (iY == this.f4772b);
                this.d = iY;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.i();
            }
            int iZ = codedInputStream.z();
            o(iZ);
            int iD = codedInputStream.d() + iZ;
            do {
                list.add(Long.valueOf(codedInputStream.o()));
            } while (codedInputStream.d() < iD);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int i3 = this.f4772b & 7;
        if (i3 == 1) {
            do {
                longArrayList.addLong(codedInputStream.o());
                if (codedInputStream.e()) {
                    return;
                } else {
                    iY2 = codedInputStream.y();
                }
            } while (iY2 == this.f4772b);
            this.d = iY2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.i();
        }
        int iZ2 = codedInputStream.z();
        o(iZ2);
        int iD2 = codedInputStream.d() + iZ2;
        do {
            longArrayList.addLong(codedInputStream.o());
        } while (codedInputStream.d() < iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final float readFloat() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(5);
        return this.f4771a.p();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readFloatList(List list) throws InvalidProtocolBufferException {
        int iY;
        int iY2;
        boolean z2 = list instanceof FloatArrayList;
        CodedInputStream codedInputStream = this.f4771a;
        if (!z2) {
            int i2 = this.f4772b & 7;
            if (i2 == 2) {
                int iZ = codedInputStream.z();
                n(iZ);
                int iD = codedInputStream.d() + iZ;
                do {
                    list.add(Float.valueOf(codedInputStream.p()));
                } while (codedInputStream.d() < iD);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.i();
            }
            do {
                list.add(Float.valueOf(codedInputStream.p()));
                if (codedInputStream.e()) {
                    return;
                } else {
                    iY = codedInputStream.y();
                }
            } while (iY == this.f4772b);
            this.d = iY;
            return;
        }
        FloatArrayList floatArrayList = (FloatArrayList) list;
        int i3 = this.f4772b & 7;
        if (i3 == 2) {
            int iZ2 = codedInputStream.z();
            n(iZ2);
            int iD2 = codedInputStream.d() + iZ2;
            do {
                floatArrayList.addFloat(codedInputStream.p());
            } while (codedInputStream.d() < iD2);
            return;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.i();
        }
        do {
            floatArrayList.addFloat(codedInputStream.p());
            if (codedInputStream.e()) {
                return;
            } else {
                iY2 = codedInputStream.y();
            }
        } while (iY2 == this.f4772b);
        this.d = iY2;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final int readInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(0);
        return this.f4771a.q();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readInt32List(List list) throws InvalidProtocolBufferException {
        int iY;
        int iY2;
        boolean z2 = list instanceof IntArrayList;
        CodedInputStream codedInputStream = this.f4771a;
        if (!z2) {
            int i2 = this.f4772b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.q()));
                    if (codedInputStream.e()) {
                        return;
                    } else {
                        iY = codedInputStream.y();
                    }
                } while (iY == this.f4772b);
                this.d = iY;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.i();
            }
            int iD = codedInputStream.d() + codedInputStream.z();
            do {
                list.add(Integer.valueOf(codedInputStream.q()));
            } while (codedInputStream.d() < iD);
            l(iD);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i3 = this.f4772b & 7;
        if (i3 == 0) {
            do {
                intArrayList.addInt(codedInputStream.q());
                if (codedInputStream.e()) {
                    return;
                } else {
                    iY2 = codedInputStream.y();
                }
            } while (iY2 == this.f4772b);
            this.d = iY2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.i();
        }
        int iD2 = codedInputStream.d() + codedInputStream.z();
        do {
            intArrayList.addInt(codedInputStream.q());
        } while (codedInputStream.d() < iD2);
        l(iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final long readInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(0);
        return this.f4771a.r();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readInt64List(List list) throws InvalidProtocolBufferException {
        int iY;
        int iY2;
        boolean z2 = list instanceof LongArrayList;
        CodedInputStream codedInputStream = this.f4771a;
        if (!z2) {
            int i2 = this.f4772b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(codedInputStream.r()));
                    if (codedInputStream.e()) {
                        return;
                    } else {
                        iY = codedInputStream.y();
                    }
                } while (iY == this.f4772b);
                this.d = iY;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.i();
            }
            int iD = codedInputStream.d() + codedInputStream.z();
            do {
                list.add(Long.valueOf(codedInputStream.r()));
            } while (codedInputStream.d() < iD);
            l(iD);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int i3 = this.f4772b & 7;
        if (i3 == 0) {
            do {
                longArrayList.addLong(codedInputStream.r());
                if (codedInputStream.e()) {
                    return;
                } else {
                    iY2 = codedInputStream.y();
                }
            } while (iY2 == this.f4772b);
            this.d = iY2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.i();
        }
        int iD2 = codedInputStream.d() + codedInputStream.z();
        do {
            longArrayList.addLong(codedInputStream.r());
        } while (codedInputStream.d() < iD2);
        l(iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final int readSFixed32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(5);
        return this.f4771a.s();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readSFixed32List(List list) throws InvalidProtocolBufferException {
        int iY;
        int iY2;
        boolean z2 = list instanceof IntArrayList;
        CodedInputStream codedInputStream = this.f4771a;
        if (!z2) {
            int i2 = this.f4772b & 7;
            if (i2 == 2) {
                int iZ = codedInputStream.z();
                n(iZ);
                int iD = codedInputStream.d() + iZ;
                do {
                    list.add(Integer.valueOf(codedInputStream.s()));
                } while (codedInputStream.d() < iD);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.i();
            }
            do {
                list.add(Integer.valueOf(codedInputStream.s()));
                if (codedInputStream.e()) {
                    return;
                } else {
                    iY = codedInputStream.y();
                }
            } while (iY == this.f4772b);
            this.d = iY;
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i3 = this.f4772b & 7;
        if (i3 == 2) {
            int iZ2 = codedInputStream.z();
            n(iZ2);
            int iD2 = codedInputStream.d() + iZ2;
            do {
                intArrayList.addInt(codedInputStream.s());
            } while (codedInputStream.d() < iD2);
            return;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.i();
        }
        do {
            intArrayList.addInt(codedInputStream.s());
            if (codedInputStream.e()) {
                return;
            } else {
                iY2 = codedInputStream.y();
            }
        } while (iY2 == this.f4772b);
        this.d = iY2;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final long readSFixed64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(1);
        return this.f4771a.t();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readSFixed64List(List list) throws InvalidProtocolBufferException {
        int iY;
        int iY2;
        boolean z2 = list instanceof LongArrayList;
        CodedInputStream codedInputStream = this.f4771a;
        if (!z2) {
            int i2 = this.f4772b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(codedInputStream.t()));
                    if (codedInputStream.e()) {
                        return;
                    } else {
                        iY = codedInputStream.y();
                    }
                } while (iY == this.f4772b);
                this.d = iY;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.i();
            }
            int iZ = codedInputStream.z();
            o(iZ);
            int iD = codedInputStream.d() + iZ;
            do {
                list.add(Long.valueOf(codedInputStream.t()));
            } while (codedInputStream.d() < iD);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int i3 = this.f4772b & 7;
        if (i3 == 1) {
            do {
                longArrayList.addLong(codedInputStream.t());
                if (codedInputStream.e()) {
                    return;
                } else {
                    iY2 = codedInputStream.y();
                }
            } while (iY2 == this.f4772b);
            this.d = iY2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.i();
        }
        int iZ2 = codedInputStream.z();
        o(iZ2);
        int iD2 = codedInputStream.d() + iZ2;
        do {
            longArrayList.addLong(codedInputStream.t());
        } while (codedInputStream.d() < iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final int readSInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(0);
        return this.f4771a.u();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readSInt32List(List list) throws InvalidProtocolBufferException {
        int iY;
        int iY2;
        boolean z2 = list instanceof IntArrayList;
        CodedInputStream codedInputStream = this.f4771a;
        if (!z2) {
            int i2 = this.f4772b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.u()));
                    if (codedInputStream.e()) {
                        return;
                    } else {
                        iY = codedInputStream.y();
                    }
                } while (iY == this.f4772b);
                this.d = iY;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.i();
            }
            int iD = codedInputStream.d() + codedInputStream.z();
            do {
                list.add(Integer.valueOf(codedInputStream.u()));
            } while (codedInputStream.d() < iD);
            l(iD);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i3 = this.f4772b & 7;
        if (i3 == 0) {
            do {
                intArrayList.addInt(codedInputStream.u());
                if (codedInputStream.e()) {
                    return;
                } else {
                    iY2 = codedInputStream.y();
                }
            } while (iY2 == this.f4772b);
            this.d = iY2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.i();
        }
        int iD2 = codedInputStream.d() + codedInputStream.z();
        do {
            intArrayList.addInt(codedInputStream.u());
        } while (codedInputStream.d() < iD2);
        l(iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final long readSInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(0);
        return this.f4771a.v();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readSInt64List(List list) throws InvalidProtocolBufferException {
        int iY;
        int iY2;
        boolean z2 = list instanceof LongArrayList;
        CodedInputStream codedInputStream = this.f4771a;
        if (!z2) {
            int i2 = this.f4772b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(codedInputStream.v()));
                    if (codedInputStream.e()) {
                        return;
                    } else {
                        iY = codedInputStream.y();
                    }
                } while (iY == this.f4772b);
                this.d = iY;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.i();
            }
            int iD = codedInputStream.d() + codedInputStream.z();
            do {
                list.add(Long.valueOf(codedInputStream.v()));
            } while (codedInputStream.d() < iD);
            l(iD);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int i3 = this.f4772b & 7;
        if (i3 == 0) {
            do {
                longArrayList.addLong(codedInputStream.v());
                if (codedInputStream.e()) {
                    return;
                } else {
                    iY2 = codedInputStream.y();
                }
            } while (iY2 == this.f4772b);
            this.d = iY2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.i();
        }
        int iD2 = codedInputStream.d() + codedInputStream.z();
        do {
            longArrayList.addLong(codedInputStream.v());
        } while (codedInputStream.d() < iD2);
        l(iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final String readString() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(2);
        return this.f4771a.w();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readStringList(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        k(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readStringListRequireUtf8(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        k(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final String readStringRequireUtf8() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(2);
        return this.f4771a.x();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final int readUInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(0);
        return this.f4771a.z();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readUInt32List(List list) throws InvalidProtocolBufferException {
        int iY;
        int iY2;
        boolean z2 = list instanceof IntArrayList;
        CodedInputStream codedInputStream = this.f4771a;
        if (!z2) {
            int i2 = this.f4772b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.z()));
                    if (codedInputStream.e()) {
                        return;
                    } else {
                        iY = codedInputStream.y();
                    }
                } while (iY == this.f4772b);
                this.d = iY;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.i();
            }
            int iD = codedInputStream.d() + codedInputStream.z();
            do {
                list.add(Integer.valueOf(codedInputStream.z()));
            } while (codedInputStream.d() < iD);
            l(iD);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i3 = this.f4772b & 7;
        if (i3 == 0) {
            do {
                intArrayList.addInt(codedInputStream.z());
                if (codedInputStream.e()) {
                    return;
                } else {
                    iY2 = codedInputStream.y();
                }
            } while (iY2 == this.f4772b);
            this.d = iY2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.i();
        }
        int iD2 = codedInputStream.d() + codedInputStream.z();
        do {
            intArrayList.addInt(codedInputStream.z());
        } while (codedInputStream.d() < iD2);
        l(iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final long readUInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m(0);
        return this.f4771a.A();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readUInt64List(List list) throws InvalidProtocolBufferException {
        int iY;
        int iY2;
        boolean z2 = list instanceof LongArrayList;
        CodedInputStream codedInputStream = this.f4771a;
        if (!z2) {
            int i2 = this.f4772b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(codedInputStream.A()));
                    if (codedInputStream.e()) {
                        return;
                    } else {
                        iY = codedInputStream.y();
                    }
                } while (iY == this.f4772b);
                this.d = iY;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.i();
            }
            int iD = codedInputStream.d() + codedInputStream.z();
            do {
                list.add(Long.valueOf(codedInputStream.A()));
            } while (codedInputStream.d() < iD);
            l(iD);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int i3 = this.f4772b & 7;
        if (i3 == 0) {
            do {
                longArrayList.addLong(codedInputStream.A());
                if (codedInputStream.e()) {
                    return;
                } else {
                    iY2 = codedInputStream.y();
                }
            } while (iY2 == this.f4772b);
            this.d = iY2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.i();
        }
        int iD2 = codedInputStream.d() + codedInputStream.z();
        do {
            longArrayList.addLong(codedInputStream.A());
        } while (codedInputStream.d() < iD2);
        l(iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final boolean skipField() {
        int i2;
        CodedInputStream codedInputStream = this.f4771a;
        if (codedInputStream.e() || (i2 = this.f4772b) == this.f4773c) {
            return false;
        }
        return codedInputStream.B(i2);
    }
}
