package androidx.datastore.preferences.protobuf;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
abstract class BinaryReader implements Reader {

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.BinaryReader$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4738a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f4738a = iArr;
            try {
                iArr[WireFormat.FieldType.k0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4738a[WireFormat.FieldType.o0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4738a[WireFormat.FieldType.Z.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4738a[WireFormat.FieldType.q0.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4738a[WireFormat.FieldType.j0.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4738a[WireFormat.FieldType.i0.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4738a[WireFormat.FieldType.e0.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4738a[WireFormat.FieldType.h0.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4738a[WireFormat.FieldType.f0.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4738a[WireFormat.FieldType.n0.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4738a[WireFormat.FieldType.r0.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4738a[WireFormat.FieldType.s0.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f4738a[WireFormat.FieldType.t0.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f4738a[WireFormat.FieldType.u0.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f4738a[WireFormat.FieldType.l0.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f4738a[WireFormat.FieldType.p0.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f4738a[WireFormat.FieldType.g0.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public static final class SafeHeapReader extends BinaryReader {
        public static void i(int i2) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (i2 != 0) {
                throw InvalidProtocolBufferException.i();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void a(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void b(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
            throw InvalidProtocolBufferException.i();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final Object c(Class cls, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
            i(2);
            Protobuf.f4904c.a(cls).newInstance();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final Object d(Class cls, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            i(3);
            Schema schemaA = Protobuf.f4904c.a(cls);
            f(schemaA.newInstance(), schemaA, extensionRegistryLite);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void e(Map map, MapEntryLite.Metadata metadata, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
            i(2);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void f(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            schema.a(obj, this, extensionRegistryLite);
            throw InvalidProtocolBufferException.l();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void g(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
            throw InvalidProtocolBufferException.i();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final int getFieldNumber() {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final int getTag() {
            return 0;
        }

        public final void h(int i2) throws InvalidProtocolBufferException {
            if (i2 < 0) {
                throw InvalidProtocolBufferException.m();
            }
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final boolean readBool() throws InvalidProtocolBufferException.InvalidWireTypeException {
            i(0);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void readBoolList(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (list instanceof BooleanArrayList) {
                readBool();
                throw null;
            }
            readBool();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final ByteString readBytes() throws InvalidProtocolBufferException.InvalidWireTypeException {
            i(2);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void readBytesList(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            throw InvalidProtocolBufferException.i();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final double readDouble() throws InvalidProtocolBufferException {
            i(1);
            h(8);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void readDoubleList(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (!(list instanceof DoubleArrayList)) {
                throw InvalidProtocolBufferException.i();
            }
            throw InvalidProtocolBufferException.i();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final int readEnum() throws InvalidProtocolBufferException.InvalidWireTypeException {
            i(0);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void readEnumList(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (list instanceof IntArrayList) {
                readEnum();
                throw null;
            }
            readEnum();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final int readFixed32() throws InvalidProtocolBufferException {
            i(5);
            h(4);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void readFixed32List(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (!(list instanceof IntArrayList)) {
                throw InvalidProtocolBufferException.i();
            }
            throw InvalidProtocolBufferException.i();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final long readFixed64() throws InvalidProtocolBufferException {
            i(1);
            h(8);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void readFixed64List(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (!(list instanceof LongArrayList)) {
                throw InvalidProtocolBufferException.i();
            }
            throw InvalidProtocolBufferException.i();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final float readFloat() throws InvalidProtocolBufferException {
            i(5);
            h(4);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void readFloatList(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (!(list instanceof FloatArrayList)) {
                throw InvalidProtocolBufferException.i();
            }
            throw InvalidProtocolBufferException.i();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final int readInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
            i(0);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void readInt32List(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (list instanceof IntArrayList) {
                readInt32();
                throw null;
            }
            readInt32();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final long readInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
            i(0);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void readInt64List(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (list instanceof LongArrayList) {
                readInt64();
                throw null;
            }
            readInt64();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final int readSFixed32() throws InvalidProtocolBufferException {
            i(5);
            h(4);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void readSFixed32List(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (!(list instanceof IntArrayList)) {
                throw InvalidProtocolBufferException.i();
            }
            throw InvalidProtocolBufferException.i();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final long readSFixed64() throws InvalidProtocolBufferException {
            i(1);
            h(8);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void readSFixed64List(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (!(list instanceof LongArrayList)) {
                throw InvalidProtocolBufferException.i();
            }
            throw InvalidProtocolBufferException.i();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final int readSInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
            i(0);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void readSInt32List(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (list instanceof IntArrayList) {
                readSInt32();
                throw null;
            }
            readSInt32();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final long readSInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
            i(0);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void readSInt64List(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (list instanceof LongArrayList) {
                readSInt64();
                throw null;
            }
            readSInt64();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final String readString() throws InvalidProtocolBufferException.InvalidWireTypeException {
            i(2);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void readStringList(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            throw InvalidProtocolBufferException.i();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void readStringListRequireUtf8(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            throw InvalidProtocolBufferException.i();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final String readStringRequireUtf8() throws InvalidProtocolBufferException.InvalidWireTypeException {
            i(2);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final int readUInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
            i(0);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void readUInt32List(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (list instanceof IntArrayList) {
                readUInt32();
                throw null;
            }
            readUInt32();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final long readUInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
            i(0);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final void readUInt64List(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (list instanceof LongArrayList) {
                readUInt64();
                throw null;
            }
            readUInt64();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public final boolean skipField() {
            throw null;
        }
    }
}
