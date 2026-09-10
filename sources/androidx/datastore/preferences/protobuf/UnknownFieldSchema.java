package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
abstract class UnknownFieldSchema<T, B> {
    public abstract void a(Object obj, int i2, int i3);

    public abstract void b(Object obj, int i2, long j);

    public abstract void c(Object obj, int i2, Object obj2);

    public abstract void d(Object obj, int i2, ByteString byteString);

    public abstract void e(Object obj, int i2, long j);

    public abstract UnknownFieldSetLite f(Object obj);

    public abstract UnknownFieldSetLite g(Object obj);

    public abstract int h(Object obj);

    public abstract int i(Object obj);

    public abstract void j(Object obj);

    public abstract UnknownFieldSetLite k(Object obj, Object obj2);

    public final boolean l(int i2, Reader reader, Object obj) throws InvalidProtocolBufferException {
        int tag = reader.getTag();
        int i3 = tag >>> 3;
        int i4 = tag & 7;
        if (i4 == 0) {
            e(obj, i3, reader.readInt64());
            return true;
        }
        if (i4 == 1) {
            b(obj, i3, reader.readFixed64());
            return true;
        }
        if (i4 == 2) {
            d(obj, i3, reader.readBytes());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw InvalidProtocolBufferException.i();
            }
            a(obj, i3, reader.readFixed32());
            return true;
        }
        UnknownFieldSetLite unknownFieldSetLiteM = m();
        int i5 = (i3 << 3) | 4;
        int i6 = i2 + 1;
        if (i6 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (reader.getFieldNumber() != Integer.MAX_VALUE && l(i6, reader, unknownFieldSetLiteM)) {
        }
        if (i5 != reader.getTag()) {
            throw InvalidProtocolBufferException.d();
        }
        c(obj, i3, p(unknownFieldSetLiteM));
        return true;
    }

    public abstract UnknownFieldSetLite m();

    public abstract void n(Object obj, Object obj2);

    public abstract void o(Object obj, Object obj2);

    public abstract UnknownFieldSetLite p(Object obj);

    public abstract void q(Object obj, Writer writer);

    public abstract void r(Object obj, Writer writer);
}
