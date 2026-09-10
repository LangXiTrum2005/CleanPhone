package com.google.crypto.tink.shaded.protobuf;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {
    static final int CONCATENATE_BY_COPY_SIZE = 128;
    public static final ByteString EMPTY = new LiteralByteString(rotuma.f22278wireman);
    static final int MAX_READ_FROM_CHUNK_SIZE = 8192;
    static final int MIN_READ_FROM_CHUNK_SIZE = 256;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static final Comparator<ByteString> f22094arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final marial f22095kowloon;
    private static final long serialVersionUID = 1;
    private int hash = 0;

    public static final class BoundedByteString extends LiteralByteString {
        private static final long serialVersionUID = 1;
        private final int bytesLength;
        private final int bytesOffset;

        public BoundedByteString(byte[] bArr, int i, int i2) {
            super(bArr);
            ByteString.checkRange(i, i + i2, bArr.length);
            this.bytesOffset = i;
            this.bytesLength = i2;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.LiteralByteString, com.google.crypto.tink.shaded.protobuf.ByteString
        public byte byteAt(int i) {
            ByteString.checkIndex(i, size());
            return this.bytes[this.bytesOffset + i];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.LiteralByteString, com.google.crypto.tink.shaded.protobuf.ByteString
        public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.bytes, getOffsetIntoBytes() + i, bArr, i2, i3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.LiteralByteString
        public int getOffsetIntoBytes() {
            return this.bytesOffset;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.LiteralByteString, com.google.crypto.tink.shaded.protobuf.ByteString
        public byte internalByteAt(int i) {
            return this.bytes[this.bytesOffset + i];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.LiteralByteString, com.google.crypto.tink.shaded.protobuf.ByteString
        public int size() {
            return this.bytesLength;
        }

        public Object writeReplace() {
            return ByteString.wrap(toByteArray());
        }
    }

    public static abstract class LeafByteString extends ByteString {
        private static final long serialVersionUID = 1;

        public /* synthetic */ LeafByteString(attabal attabalVar) {
            this();
        }

        public abstract boolean equalsRange(ByteString byteString, int i, int i2);

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final int getTreeDepth() {
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final boolean isBalanced() {
            return true;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator2();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public void writeToReverse(com.google.crypto.tink.shaded.protobuf.impromptu impromptuVar) throws IOException {
            writeTo(impromptuVar);
        }

        private LeafByteString() {
        }
    }

    public static class LiteralByteString extends LeafByteString {
        private static final long serialVersionUID = 1;
        protected final byte[] bytes;

        public LiteralByteString(byte[] bArr) {
            super(null);
            bArr.getClass();
            this.bytes = bArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final ByteBuffer asReadOnlyByteBuffer() {
            return ByteBuffer.wrap(this.bytes, getOffsetIntoBytes(), size()).asReadOnlyBuffer();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final List<ByteBuffer> asReadOnlyByteBufferList() {
            return Collections.singletonList(asReadOnlyByteBuffer());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public byte byteAt(int i) {
            return this.bytes[i];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final void copyTo(ByteBuffer byteBuffer) {
            byteBuffer.put(this.bytes, getOffsetIntoBytes(), size());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.bytes, i, bArr, i2, i3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof LiteralByteString)) {
                return obj.equals(this);
            }
            LiteralByteString literalByteString = (LiteralByteString) obj;
            int iPeekCachedHashCode = peekCachedHashCode();
            int iPeekCachedHashCode2 = literalByteString.peekCachedHashCode();
            if (iPeekCachedHashCode == 0 || iPeekCachedHashCode2 == 0 || iPeekCachedHashCode == iPeekCachedHashCode2) {
                return equalsRange(literalByteString, 0, size());
            }
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.LeafByteString
        public final boolean equalsRange(ByteString byteString, int i, int i2) {
            if (i2 > byteString.size()) {
                throw new IllegalArgumentException("Length too large: " + i2 + size());
            }
            int i3 = i + i2;
            if (i3 > byteString.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + byteString.size());
            }
            if (!(byteString instanceof LiteralByteString)) {
                return byteString.substring(i, i3).equals(substring(0, i2));
            }
            LiteralByteString literalByteString = (LiteralByteString) byteString;
            byte[] bArr = this.bytes;
            byte[] bArr2 = literalByteString.bytes;
            int offsetIntoBytes = getOffsetIntoBytes() + i2;
            int offsetIntoBytes2 = getOffsetIntoBytes();
            int offsetIntoBytes3 = literalByteString.getOffsetIntoBytes() + i;
            while (offsetIntoBytes2 < offsetIntoBytes) {
                if (bArr[offsetIntoBytes2] != bArr2[offsetIntoBytes3]) {
                    return false;
                }
                offsetIntoBytes2++;
                offsetIntoBytes3++;
            }
            return true;
        }

        public int getOffsetIntoBytes() {
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public byte internalByteAt(int i) {
            return this.bytes[i];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final boolean isValidUtf8() {
            int offsetIntoBytes = getOffsetIntoBytes();
            return Utf8.molybdenite(this.bytes, offsetIntoBytes, size() + offsetIntoBytes);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final com.google.crypto.tink.shaded.protobuf.taiyuan newCodedInput() {
            return com.google.crypto.tink.shaded.protobuf.taiyuan.triweekly(this.bytes, getOffsetIntoBytes(), size(), true);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final InputStream newInput() {
            return new ByteArrayInputStream(this.bytes, getOffsetIntoBytes(), size());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final int partialHash(int i, int i2, int i3) {
            return rotuma.impromptu(i, this.bytes, getOffsetIntoBytes() + i2, i3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final int partialIsValidUtf8(int i, int i2, int i3) {
            int offsetIntoBytes = getOffsetIntoBytes() + i2;
            return Utf8.adultoid(i, this.bytes, offsetIntoBytes, i3 + offsetIntoBytes);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public int size() {
            return this.bytes.length;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final ByteString substring(int i, int i2) {
            int iCheckRange = ByteString.checkRange(i, i2, size());
            return iCheckRange == 0 ? ByteString.EMPTY : new BoundedByteString(this.bytes, getOffsetIntoBytes() + i, iCheckRange);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final String toStringInternal(Charset charset) {
            return new String(this.bytes, getOffsetIntoBytes(), size(), charset);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final void writeTo(OutputStream outputStream) throws IOException {
            outputStream.write(toByteArray());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
            outputStream.write(this.bytes, getOffsetIntoBytes() + i, i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final void writeTo(com.google.crypto.tink.shaded.protobuf.impromptu impromptuVar) throws IOException {
            impromptuVar.saneness(this.bytes, getOffsetIntoBytes(), size());
        }
    }

    public static final class NioByteString extends LeafByteString {
        private final ByteBuffer buffer;

        public NioByteString(ByteBuffer byteBuffer) {
            super(null);
            rotuma.saneness(byteBuffer, "buffer");
            this.buffer = byteBuffer.slice().order(ByteOrder.nativeOrder());
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
        }

        private Object writeReplace() {
            return ByteString.copyFrom(this.buffer.slice());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public ByteBuffer asReadOnlyByteBuffer() {
            return this.buffer.asReadOnlyBuffer();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public List<ByteBuffer> asReadOnlyByteBufferList() {
            return Collections.singletonList(asReadOnlyByteBuffer());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public byte byteAt(int i) {
            try {
                return this.buffer.get(i);
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            } catch (IndexOutOfBoundsException e2) {
                throw new ArrayIndexOutOfBoundsException(e2.getMessage());
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public void copyTo(ByteBuffer byteBuffer) {
            byteBuffer.put(this.buffer.slice());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
            ByteBuffer byteBufferSlice = this.buffer.slice();
            cord.dern(byteBufferSlice, i);
            byteBufferSlice.get(bArr, i2, i3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteString)) {
                return false;
            }
            ByteString byteString = (ByteString) obj;
            if (size() != byteString.size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (obj instanceof NioByteString) {
                return this.buffer.equals(((NioByteString) obj).buffer);
            }
            return obj instanceof RopeByteString ? obj.equals(this) : this.buffer.equals(byteString.asReadOnlyByteBuffer());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.LeafByteString
        public boolean equalsRange(ByteString byteString, int i, int i2) {
            return substring(0, i2).equals(byteString.substring(i, i2 + i));
        }

        public final ByteBuffer impromptu(int i, int i2) {
            if (i < this.buffer.position() || i2 > this.buffer.limit() || i > i2) {
                throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i), Integer.valueOf(i2)));
            }
            ByteBuffer byteBufferSlice = this.buffer.slice();
            cord.dern(byteBufferSlice, i - this.buffer.position());
            cord.attabal(byteBufferSlice, i2 - this.buffer.position());
            return byteBufferSlice;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public byte internalByteAt(int i) {
            return byteAt(i);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public boolean isValidUtf8() {
            return Utf8.polloi(this.buffer);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public com.google.crypto.tink.shaded.protobuf.taiyuan newCodedInput() {
            return com.google.crypto.tink.shaded.protobuf.taiyuan.apical(this.buffer, true);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public InputStream newInput() {
            return new attabal();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public int partialHash(int i, int i2, int i3) {
            for (int i4 = i2; i4 < i2 + i3; i4++) {
                i = (i * 31) + this.buffer.get(i4);
            }
            return i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public int partialIsValidUtf8(int i, int i2, int i3) {
            return Utf8.graveside(i, this.buffer, i2, i3 + i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public int size() {
            return this.buffer.remaining();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public ByteString substring(int i, int i2) {
            try {
                return new NioByteString(impromptu(i, i2));
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            } catch (IndexOutOfBoundsException e2) {
                throw new ArrayIndexOutOfBoundsException(e2.getMessage());
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public String toStringInternal(Charset charset) {
            byte[] byteArray;
            int length;
            int iArrayOffset;
            if (this.buffer.hasArray()) {
                byteArray = this.buffer.array();
                iArrayOffset = this.buffer.arrayOffset() + this.buffer.position();
                length = this.buffer.remaining();
            } else {
                byteArray = toByteArray();
                length = byteArray.length;
                iArrayOffset = 0;
            }
            return new String(byteArray, iArrayOffset, length, charset);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public void writeTo(OutputStream outputStream) throws IOException {
            outputStream.write(toByteArray());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
            if (!this.buffer.hasArray()) {
                com.google.crypto.tink.shaded.protobuf.competently.competently(impromptu(i, i2 + i), outputStream);
            } else {
                outputStream.write(this.buffer.array(), this.buffer.arrayOffset() + this.buffer.position() + i, i2);
            }
        }

        public class attabal extends InputStream {

            /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
            public final ByteBuffer f22097kowloon;

            public attabal() {
                this.f22097kowloon = NioByteString.this.buffer.slice();
            }

            @Override // java.io.InputStream
            public int available() throws IOException {
                return this.f22097kowloon.remaining();
            }

            @Override // java.io.InputStream
            public void mark(int i) {
                cord.saneness(this.f22097kowloon);
            }

            @Override // java.io.InputStream
            public boolean markSupported() {
                return true;
            }

            @Override // java.io.InputStream
            public int read() throws IOException {
                if (this.f22097kowloon.hasRemaining()) {
                    return this.f22097kowloon.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                }
                return -1;
            }

            @Override // java.io.InputStream
            public void reset() throws IOException {
                try {
                    cord.wireman(this.f22097kowloon);
                } catch (InvalidMarkException e) {
                    throw new IOException(e);
                }
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i, int i2) throws IOException {
                if (!this.f22097kowloon.hasRemaining()) {
                    return -1;
                }
                int iMin = Math.min(i2, this.f22097kowloon.remaining());
                this.f22097kowloon.get(bArr, i, iMin);
                return iMin;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public void writeTo(com.google.crypto.tink.shaded.protobuf.impromptu impromptuVar) throws IOException {
            impromptuVar.attabal(this.buffer.slice());
        }
    }

    public class attabal extends dern {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final int f22098arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public int f22099kowloon = 0;

        public attabal() {
            this.f22098arytenoidectomy = ByteString.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f22099kowloon < this.f22098arytenoidectomy;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.beachfront
        public byte nextByte() {
            int i = this.f22099kowloon;
            if (i >= this.f22098arytenoidectomy) {
                throw new NoSuchElementException();
            }
            this.f22099kowloon = i + 1;
            return ByteString.this.internalByteAt(i);
        }
    }

    public interface beachfront extends Iterator<Byte> {
        byte nextByte();
    }

    public static final class competently {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final CodedOutputStream f22101attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final byte[] f22102saneness;

        public /* synthetic */ competently(int i, attabal attabalVar) {
            this(i);
        }

        public ByteString attabal() {
            this.f22101attabal.wireman();
            return new LiteralByteString(this.f22102saneness);
        }

        public CodedOutputStream saneness() {
            return this.f22101attabal;
        }

        public competently(int i) {
            byte[] bArr = new byte[i];
            this.f22102saneness = bArr;
            this.f22101attabal = CodedOutputStream.milliradian(bArr);
        }
    }

    public static abstract class dern implements beachfront {
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public interface marial {
        byte[] copyFrom(byte[] bArr, int i, int i2);
    }

    public class saneness implements Comparator<ByteString> {
        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.crypto.tink.shaded.protobuf.ByteString$beachfront, java.util.Iterator] */
        /* JADX WARN: Type inference failed for: r1v0, types: [com.google.crypto.tink.shaded.protobuf.ByteString$beachfront, java.util.Iterator] */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public int compare(ByteString byteString, ByteString byteString2) {
            ?? Iterator2 = byteString.iterator2();
            ?? Iterator3 = byteString2.iterator2();
            while (Iterator2.hasNext() && Iterator3.hasNext()) {
                int iCompare = Integer.compare(ByteString.beachfront(Iterator2.nextByte()), ByteString.beachfront(Iterator3.nextByte()));
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return Integer.compare(byteString.size(), byteString2.size());
        }
    }

    public static final class taiyuan implements marial {
        public taiyuan() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.marial
        public byte[] copyFrom(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }

        public /* synthetic */ taiyuan(attabal attabalVar) {
            this();
        }
    }

    public static final class wireman implements marial {
        public wireman() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.marial
        public byte[] copyFrom(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }

        public /* synthetic */ wireman(attabal attabalVar) {
            this();
        }
    }

    static {
        attabal attabalVar = null;
        f22095kowloon = com.google.crypto.tink.shaded.protobuf.wireman.dern() ? new taiyuan(attabalVar) : new wireman(attabalVar);
        f22094arytenoidectomy = new saneness();
    }

    public static int beachfront(byte b) {
        return b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public static void checkIndex(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
        }
    }

    public static int checkRange(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        }
        throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
    }

    public static ByteString copyFrom(byte[] bArr, int i, int i2) {
        checkRange(i, i + i2, bArr.length);
        return new LiteralByteString(f22095kowloon.copyFrom(bArr, i, i2));
    }

    public static ByteString copyFromUtf8(String str) {
        return new LiteralByteString(str.getBytes(rotuma.f22277saneness));
    }

    public static int dern(String str, int i) {
        int iWireman = wireman(str.charAt(i));
        if (iWireman != -1) {
            return iWireman;
        }
        throw new NumberFormatException("Invalid hexString " + str + " must only contain [0-9a-fA-F] but contained " + str.charAt(i) + " at index " + i);
    }

    public static final ByteString empty() {
        return EMPTY;
    }

    public static ByteString fromHex(String str) {
        if (str.length() % 2 != 0) {
            throw new NumberFormatException("Invalid hexString " + str + " of length " + str.length() + " must be even.");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (dern(str, i2 + 1) | (dern(str, i2) << 4));
        }
        return new LiteralByteString(bArr);
    }

    public static ByteString marial(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 == -1) {
                break;
            }
            i2 += i3;
        }
        if (i2 == 0) {
            return null;
        }
        return copyFrom(bArr, 0, i2);
    }

    public static competently newCodedBuilder(int i) {
        return new competently(i, null);
    }

    public static impromptu newOutput(int i) {
        return new impromptu(i);
    }

    public static ByteString nioByteString(ByteBuffer byteBuffer) {
        return new NioByteString(byteBuffer);
    }

    public static ByteString readFrom(InputStream inputStream) throws IOException {
        return readFrom(inputStream, 256, 8192);
    }

    public static ByteString saneness(Iterator<ByteString> it, int i) {
        if (i < 1) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
        }
        if (i == 1) {
            return it.next();
        }
        int i2 = i >>> 1;
        return saneness(it, i2).concat(saneness(it, i - i2));
    }

    public static Comparator<ByteString> unsignedLexicographicalComparator() {
        return f22094arytenoidectomy;
    }

    public static int wireman(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'A' && c <= 'F') {
            return c - '7';
        }
        if (c < 'a' || c > 'f') {
            return -1;
        }
        return c - 'W';
    }

    public static ByteString wrap(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            return new NioByteString(byteBuffer);
        }
        return wrap(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
    }

    public abstract ByteBuffer asReadOnlyByteBuffer();

    public abstract List<ByteBuffer> asReadOnlyByteBufferList();

    public abstract byte byteAt(int i);

    public final String competently() {
        if (size() <= 50) {
            return coffeecake.attabal(this);
        }
        return coffeecake.attabal(substring(0, 47)) + "...";
    }

    public final ByteString concat(ByteString byteString) {
        if (Integer.MAX_VALUE - size() >= byteString.size()) {
            return RopeByteString.concatenate(this, byteString);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + "+" + byteString.size());
    }

    public abstract void copyTo(ByteBuffer byteBuffer);

    public void copyTo(byte[] bArr, int i) {
        copyTo(bArr, 0, i, size());
    }

    public abstract void copyToInternal(byte[] bArr, int i, int i2, int i3);

    public final boolean endsWith(ByteString byteString) {
        return size() >= byteString.size() && substring(size() - byteString.size()).equals(byteString);
    }

    public abstract boolean equals(Object obj);

    public abstract int getTreeDepth();

    public final int hashCode() {
        int iPartialHash = this.hash;
        if (iPartialHash == 0) {
            int size = size();
            iPartialHash = partialHash(size, 0, size);
            if (iPartialHash == 0) {
                iPartialHash = 1;
            }
            this.hash = iPartialHash;
        }
        return iPartialHash;
    }

    public abstract byte internalByteAt(int i);

    public abstract boolean isBalanced();

    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract boolean isValidUtf8();

    public abstract com.google.crypto.tink.shaded.protobuf.taiyuan newCodedInput();

    public abstract InputStream newInput();

    public abstract int partialHash(int i, int i2, int i3);

    public abstract int partialIsValidUtf8(int i, int i2, int i3);

    public final int peekCachedHashCode() {
        return this.hash;
    }

    public abstract int size();

    public final boolean startsWith(ByteString byteString) {
        return size() >= byteString.size() && substring(0, byteString.size()).equals(byteString);
    }

    public final ByteString substring(int i) {
        return substring(i, size());
    }

    public abstract ByteString substring(int i, int i2);

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return rotuma.f22278wireman;
        }
        byte[] bArr = new byte[size];
        copyToInternal(bArr, 0, 0, size);
        return bArr;
    }

    public final String toString(String str) throws UnsupportedEncodingException {
        try {
            return toString(Charset.forName(str));
        } catch (UnsupportedCharsetException e) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(str);
            unsupportedEncodingException.initCause(e);
            throw unsupportedEncodingException;
        }
    }

    public abstract String toStringInternal(Charset charset);

    public final String toStringUtf8() {
        return toString(rotuma.f22277saneness);
    }

    public abstract void writeTo(com.google.crypto.tink.shaded.protobuf.impromptu impromptuVar) throws IOException;

    public abstract void writeTo(OutputStream outputStream) throws IOException;

    public final void writeTo(OutputStream outputStream, int i, int i2) throws IOException {
        checkRange(i, i + i2, size());
        if (i2 > 0) {
            writeToInternal(outputStream, i, i2);
        }
    }

    public abstract void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException;

    public abstract void writeToReverse(com.google.crypto.tink.shaded.protobuf.impromptu impromptuVar) throws IOException;

    public static impromptu newOutput() {
        return new impromptu(128);
    }

    public static ByteString readFrom(InputStream inputStream, int i) throws IOException {
        return readFrom(inputStream, i, i);
    }

    @Deprecated
    public final void copyTo(byte[] bArr, int i, int i2, int i3) {
        checkRange(i, i + i3, size());
        checkRange(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            copyToInternal(bArr, i, i2, i3);
        }
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: iterator, reason: merged with bridge method [inline-methods] */
    public Iterator<Byte> iterator2() {
        return new attabal();
    }

    public static ByteString copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    public static ByteString readFrom(InputStream inputStream, int i, int i2) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            ByteString byteStringMarial = marial(inputStream, i);
            if (byteStringMarial == null) {
                return copyFrom(arrayList);
            }
            arrayList.add(byteStringMarial);
            i = Math.min(i * 2, i2);
        }
    }

    public static final class impromptu extends OutputStream {

        /* JADX INFO: renamed from: graveside, reason: collision with root package name */
        public static final byte[] f22103graveside = new byte[0];

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final ArrayList<ByteString> f22104arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final int f22105kowloon;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public int f22106molybdenite;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public int f22107monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public byte[] f22108polloi;

        public impromptu(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.f22105kowloon = i;
            this.f22104arytenoidectomy = new ArrayList<>();
            this.f22108polloi = new byte[i];
        }

        public final void attabal(int i) {
            this.f22104arytenoidectomy.add(new LiteralByteString(this.f22108polloi));
            int length = this.f22107monoploid + this.f22108polloi.length;
            this.f22107monoploid = length;
            this.f22108polloi = new byte[Math.max(this.f22105kowloon, Math.max(i, length >>> 1))];
            this.f22106molybdenite = 0;
        }

        public synchronized int saneness() {
            return this.f22107monoploid + this.f22106molybdenite;
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(saneness()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i) {
            try {
                if (this.f22106molybdenite == this.f22108polloi.length) {
                    attabal(1);
                }
                byte[] bArr = this.f22108polloi;
                int i2 = this.f22106molybdenite;
                this.f22106molybdenite = i2 + 1;
                bArr[i2] = (byte) i;
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i, int i2) {
            try {
                byte[] bArr2 = this.f22108polloi;
                int length = bArr2.length;
                int i3 = this.f22106molybdenite;
                if (i2 <= length - i3) {
                    System.arraycopy(bArr, i, bArr2, i3, i2);
                    this.f22106molybdenite += i2;
                } else {
                    int length2 = bArr2.length - i3;
                    System.arraycopy(bArr, i, bArr2, i3, length2);
                    int i4 = i2 - length2;
                    attabal(i4);
                    System.arraycopy(bArr, i + length2, this.f22108polloi, 0, i4);
                    this.f22106molybdenite = i4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer, int i) {
        checkRange(0, i, byteBuffer.remaining());
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return new LiteralByteString(bArr);
    }

    public static ByteString wrap(byte[] bArr) {
        return new LiteralByteString(bArr);
    }

    public final String toString(Charset charset) {
        return size() == 0 ? "" : toStringInternal(charset);
    }

    public static ByteString wrap(byte[] bArr, int i, int i2) {
        return new BoundedByteString(bArr, i, i2);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), competently());
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer) {
        return copyFrom(byteBuffer, byteBuffer.remaining());
    }

    public static ByteString copyFrom(String str, String str2) throws UnsupportedEncodingException {
        return new LiteralByteString(str.getBytes(str2));
    }

    public static ByteString copyFrom(String str, Charset charset) {
        return new LiteralByteString(str.getBytes(charset));
    }

    public static ByteString copyFrom(Iterable<ByteString> iterable) {
        int size;
        if (!(iterable instanceof Collection)) {
            Iterator<ByteString> it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = ((Collection) iterable).size();
        }
        if (size == 0) {
            return EMPTY;
        }
        return saneness(iterable.iterator(), size);
    }
}
