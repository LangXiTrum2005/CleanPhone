package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
class BoundedByteString extends LiteralByteString {

    public class BoundedByteIterator implements ByteString.ByteIterator {
        public int X;

        public BoundedByteIterator() {
            throw null;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.X < 0;
        }

        @Override // java.util.Iterator
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
        public final byte nextByte() {
            int i2 = this.X;
            if (i2 >= 0) {
                throw new NoSuchElementException();
            }
            byte[] bArr = BoundedByteString.this.f44219Y;
            this.X = i2 + 1;
            return bArr[i2];
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString, kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final void f(byte[] bArr, int i2, int i3, int i4) {
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString, kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
        iterator();
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString, kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* JADX INFO: renamed from: l */
    public final ByteString.ByteIterator iterator() {
        new BoundedByteIterator();
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString, kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int size() {
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString
    public final byte x(int i2) {
        if (i2 >= 0) {
            throw null;
        }
        StringBuilder sb = new StringBuilder(28);
        sb.append("Index too small: ");
        sb.append(i2);
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString
    public final int z() {
        throw null;
    }
}
