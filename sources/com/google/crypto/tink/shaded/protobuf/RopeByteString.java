package com.google.crypto.tink.shaded.protobuf;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes3.dex */
final class RopeByteString extends ByteString {
    static final int[] minLengthByDepth = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, Opcodes.D2F, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1;
    private final ByteString left;
    private final int leftLength;
    private final ByteString right;
    private final int totalLength;
    private final int treeDepth;

    public class attabal extends ByteString.dern {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public ByteString.beachfront f22142arytenoidectomy = saneness();

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final dern f22143kowloon;

        public attabal() {
            this.f22143kowloon = new dern(RopeByteString.this, null);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f22142arytenoidectomy != null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.beachfront
        public byte nextByte() {
            ByteString.beachfront beachfrontVar = this.f22142arytenoidectomy;
            if (beachfrontVar == null) {
                throw new NoSuchElementException();
            }
            byte bNextByte = beachfrontVar.nextByte();
            if (!this.f22142arytenoidectomy.hasNext()) {
                this.f22142arytenoidectomy = saneness();
            }
            return bNextByte;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [com.google.crypto.tink.shaded.protobuf.ByteString$beachfront] */
        public final ByteString.beachfront saneness() {
            if (this.f22143kowloon.hasNext()) {
                return this.f22143kowloon.next().iterator2();
            }
            return null;
        }
    }

    public static final class dern implements Iterator<ByteString.LeafByteString> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public ByteString.LeafByteString f22145arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final ArrayDeque<RopeByteString> f22146kowloon;

        public /* synthetic */ dern(ByteString byteString, attabal attabalVar) {
            this(byteString);
        }

        public final ByteString.LeafByteString attabal(ByteString byteString) {
            while (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                this.f22146kowloon.push(ropeByteString);
                byteString = ropeByteString.left;
            }
            return (ByteString.LeafByteString) byteString;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public ByteString.LeafByteString next() {
            ByteString.LeafByteString leafByteString = this.f22145arytenoidectomy;
            if (leafByteString == null) {
                throw new NoSuchElementException();
            }
            this.f22145arytenoidectomy = saneness();
            return leafByteString;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f22145arytenoidectomy != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public final ByteString.LeafByteString saneness() {
            ByteString.LeafByteString leafByteStringAttabal;
            do {
                ArrayDeque<RopeByteString> arrayDeque = this.f22146kowloon;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                leafByteStringAttabal = attabal(this.f22146kowloon.pop().right);
            } while (leafByteStringAttabal.isEmpty());
            return leafByteStringAttabal;
        }

        public dern(ByteString byteString) {
            if (!(byteString instanceof RopeByteString)) {
                this.f22146kowloon = null;
                this.f22145arytenoidectomy = (ByteString.LeafByteString) byteString;
                return;
            }
            RopeByteString ropeByteString = (RopeByteString) byteString;
            ArrayDeque<RopeByteString> arrayDeque = new ArrayDeque<>(ropeByteString.getTreeDepth());
            this.f22146kowloon = arrayDeque;
            arrayDeque.push(ropeByteString);
            this.f22145arytenoidectomy = attabal(ropeByteString.left);
        }
    }

    public /* synthetic */ RopeByteString(ByteString byteString, ByteString byteString2, attabal attabalVar) {
        this(byteString, byteString2);
    }

    public static ByteString concatenate(ByteString byteString, ByteString byteString2) {
        if (byteString2.size() == 0) {
            return byteString;
        }
        if (byteString.size() == 0) {
            return byteString2;
        }
        int size = byteString.size() + byteString2.size();
        if (size < 128) {
            return impromptu(byteString, byteString2);
        }
        if (byteString instanceof RopeByteString) {
            RopeByteString ropeByteString = (RopeByteString) byteString;
            if (ropeByteString.right.size() + byteString2.size() < 128) {
                return new RopeByteString(ropeByteString.left, impromptu(ropeByteString.right, byteString2));
            }
            if (ropeByteString.left.getTreeDepth() > ropeByteString.right.getTreeDepth() && ropeByteString.getTreeDepth() > byteString2.getTreeDepth()) {
                return new RopeByteString(ropeByteString.left, new RopeByteString(ropeByteString.right, byteString2));
            }
        }
        return size >= minLength(Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1) ? new RopeByteString(byteString, byteString2) : new saneness(null).saneness(byteString, byteString2);
    }

    public static ByteString impromptu(ByteString byteString, ByteString byteString2) {
        int size = byteString.size();
        int size2 = byteString2.size();
        byte[] bArr = new byte[size + size2];
        byteString.copyTo(bArr, 0, 0, size);
        byteString2.copyTo(bArr, 0, size, size2);
        return ByteString.wrap(bArr);
    }

    public static int minLength(int i) {
        int[] iArr = minLengthByDepth;
        if (i >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    public static RopeByteString newInstanceForTest(ByteString byteString, ByteString byteString2) {
        return new RopeByteString(byteString, byteString2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        ArrayList arrayList = new ArrayList();
        dern dernVar = new dern(this, null);
        while (dernVar.hasNext()) {
            arrayList.add(dernVar.next().asReadOnlyByteBuffer());
        }
        return arrayList;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public byte byteAt(int i) {
        ByteString.checkIndex(i, this.totalLength);
        return internalByteAt(i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public void copyTo(ByteBuffer byteBuffer) {
        this.left.copyTo(byteBuffer);
        this.right.copyTo(byteBuffer);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            this.left.copyToInternal(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.right.copyToInternal(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.left.copyToInternal(bArr, i, i2, i6);
            this.right.copyToInternal(bArr, 0, i2 + i6, i3 - i6);
        }
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
        if (this.totalLength != byteString.size()) {
            return false;
        }
        if (this.totalLength == 0) {
            return true;
        }
        int iPeekCachedHashCode = peekCachedHashCode();
        int iPeekCachedHashCode2 = byteString.peekCachedHashCode();
        if (iPeekCachedHashCode == 0 || iPeekCachedHashCode2 == 0 || iPeekCachedHashCode == iPeekCachedHashCode2) {
            return taiyuan(byteString);
        }
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public int getTreeDepth() {
        return this.treeDepth;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public byte internalByteAt(int i) {
        int i2 = this.leftLength;
        return i < i2 ? this.left.internalByteAt(i) : this.right.internalByteAt(i - i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public boolean isBalanced() {
        return this.totalLength >= minLength(this.treeDepth);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public boolean isValidUtf8() {
        int iPartialIsValidUtf8 = this.left.partialIsValidUtf8(0, 0, this.leftLength);
        ByteString byteString = this.right;
        return byteString.partialIsValidUtf8(iPartialIsValidUtf8, 0, byteString.size()) == 0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public taiyuan newCodedInput() {
        return taiyuan.cutely(asReadOnlyByteBufferList(), true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public InputStream newInput() {
        return new wireman();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public int partialHash(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            return this.left.partialHash(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.right.partialHash(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.right.partialHash(this.left.partialHash(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public int partialIsValidUtf8(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            return this.left.partialIsValidUtf8(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.right.partialIsValidUtf8(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.right.partialIsValidUtf8(this.left.partialIsValidUtf8(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public int size() {
        return this.totalLength;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public ByteString substring(int i, int i2) {
        int iCheckRange = ByteString.checkRange(i, i2, this.totalLength);
        if (iCheckRange == 0) {
            return ByteString.EMPTY;
        }
        if (iCheckRange == this.totalLength) {
            return this;
        }
        int i3 = this.leftLength;
        if (i2 <= i3) {
            return this.left.substring(i, i2);
        }
        return i >= i3 ? this.right.substring(i - i3, i2 - i3) : new RopeByteString(this.left.substring(i), this.right.substring(0, i2 - this.leftLength));
    }

    public final boolean taiyuan(ByteString byteString) {
        ByteString.LeafByteString next;
        attabal attabalVar = null;
        dern dernVar = new dern(this, attabalVar);
        ByteString.LeafByteString next2 = dernVar.next();
        dern dernVar2 = new dern(byteString, attabalVar);
        ByteString.LeafByteString next3 = dernVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = next2.size() - i;
            int size2 = next3.size() - i2;
            int iMin = Math.min(size, size2);
            if (!(i == 0 ? next2.equalsRange(next3, i2, iMin) : next3.equalsRange(next2, i, iMin))) {
                return false;
            }
            i3 += iMin;
            int i4 = this.totalLength;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == size) {
                next = dernVar.next();
                i = 0;
            } else {
                i += iMin;
            }
            if (iMin == size2) {
                next2 = next2;
                next2 = next;
                next3 = dernVar2.next();
                i2 = 0;
            } else {
                next2 = next2;
                next2 = next;
                i2 += iMin;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public String toStringInternal(Charset charset) {
        return new String(toByteArray(), charset);
    }

    public Object writeReplace() {
        return ByteString.wrap(toByteArray());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public void writeTo(OutputStream outputStream) throws IOException {
        this.left.writeTo(outputStream);
        this.right.writeTo(outputStream);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
        int i3 = i + i2;
        int i4 = this.leftLength;
        if (i3 <= i4) {
            this.left.writeToInternal(outputStream, i, i2);
        } else {
            if (i >= i4) {
                this.right.writeToInternal(outputStream, i - i4, i2);
                return;
            }
            int i5 = i4 - i;
            this.left.writeToInternal(outputStream, i, i5);
            this.right.writeToInternal(outputStream, 0, i2 - i5);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public void writeToReverse(impromptu impromptuVar) throws IOException {
        this.right.writeToReverse(impromptuVar);
        this.left.writeToReverse(impromptuVar);
    }

    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final ArrayDeque<ByteString> f22147attabal;

        public saneness() {
            this.f22147attabal = new ArrayDeque<>();
        }

        public final void dern(ByteString byteString) {
            if (byteString.isBalanced()) {
                marial(byteString);
                return;
            }
            if (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                dern(ropeByteString.left);
                dern(ropeByteString.right);
            } else {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + byteString.getClass());
            }
        }

        public final void marial(ByteString byteString) {
            attabal attabalVar;
            int iWireman = wireman(byteString.size());
            int iMinLength = RopeByteString.minLength(iWireman + 1);
            if (this.f22147attabal.isEmpty() || this.f22147attabal.peek().size() >= iMinLength) {
                this.f22147attabal.push(byteString);
                return;
            }
            int iMinLength2 = RopeByteString.minLength(iWireman);
            ByteString byteStringPop = this.f22147attabal.pop();
            while (true) {
                attabalVar = null;
                if (this.f22147attabal.isEmpty() || this.f22147attabal.peek().size() >= iMinLength2) {
                    break;
                } else {
                    byteStringPop = new RopeByteString(this.f22147attabal.pop(), byteStringPop, attabalVar);
                }
            }
            RopeByteString ropeByteString = new RopeByteString(byteStringPop, byteString, attabalVar);
            while (!this.f22147attabal.isEmpty()) {
                if (this.f22147attabal.peek().size() >= RopeByteString.minLength(wireman(ropeByteString.size()) + 1)) {
                    break;
                } else {
                    ropeByteString = new RopeByteString(this.f22147attabal.pop(), ropeByteString, attabalVar);
                }
            }
            this.f22147attabal.push(ropeByteString);
        }

        public final ByteString saneness(ByteString byteString, ByteString byteString2) {
            dern(byteString);
            dern(byteString2);
            ByteString byteStringPop = this.f22147attabal.pop();
            while (!this.f22147attabal.isEmpty()) {
                byteStringPop = new RopeByteString(this.f22147attabal.pop(), byteStringPop, null);
            }
            return byteStringPop;
        }

        public final int wireman(int i) {
            int iBinarySearch = Arrays.binarySearch(RopeByteString.minLengthByDepth, i);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }

        public /* synthetic */ saneness(attabal attabalVar) {
            this();
        }
    }

    public RopeByteString(ByteString byteString, ByteString byteString2) {
        this.left = byteString;
        this.right = byteString2;
        int size = byteString.size();
        this.leftLength = size;
        this.totalLength = size + byteString2.size();
        this.treeDepth = Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString, java.lang.Iterable
    /* JADX INFO: renamed from: iterator */
    public Iterator<Byte> iterator2() {
        return new attabal();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public void writeTo(impromptu impromptuVar) throws IOException {
        this.left.writeTo(impromptuVar);
        this.right.writeTo(impromptuVar);
    }

    public class wireman extends InputStream {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public ByteString.LeafByteString f22149arytenoidectomy;

        /* JADX INFO: renamed from: graveside, reason: collision with root package name */
        public int f22150graveside;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public dern f22151kowloon;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public int f22152molybdenite;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public int f22153monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public int f22154polloi;

        public wireman() {
            dern();
        }

        public final void attabal() {
            if (this.f22149arytenoidectomy != null) {
                int i = this.f22154polloi;
                int i2 = this.f22153monoploid;
                if (i == i2) {
                    this.f22152molybdenite += i2;
                    this.f22154polloi = 0;
                    if (!this.f22151kowloon.hasNext()) {
                        this.f22149arytenoidectomy = null;
                        this.f22153monoploid = 0;
                    } else {
                        ByteString.LeafByteString next = this.f22151kowloon.next();
                        this.f22149arytenoidectomy = next;
                        this.f22153monoploid = next.size();
                    }
                }
            }
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return saneness();
        }

        public final void dern() {
            dern dernVar = new dern(RopeByteString.this, null);
            this.f22151kowloon = dernVar;
            ByteString.LeafByteString next = dernVar.next();
            this.f22149arytenoidectomy = next;
            this.f22153monoploid = next.size();
            this.f22154polloi = 0;
            this.f22152molybdenite = 0;
        }

        public final int marial(byte[] bArr, int i, int i2) {
            int i3 = i2;
            while (i3 > 0) {
                attabal();
                if (this.f22149arytenoidectomy == null) {
                    break;
                }
                int iMin = Math.min(this.f22153monoploid - this.f22154polloi, i3);
                if (bArr != null) {
                    this.f22149arytenoidectomy.copyTo(bArr, this.f22154polloi, i, iMin);
                    i += iMin;
                }
                this.f22154polloi += iMin;
                i3 -= iMin;
            }
            return i2 - i3;
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            this.f22150graveside = this.f22152molybdenite + this.f22154polloi;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            bArr.getClass();
            if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
                throw new IndexOutOfBoundsException();
            }
            int iMarial = marial(bArr, i, i2);
            if (iMarial != 0) {
                return iMarial;
            }
            if (i2 > 0 || saneness() == 0) {
                return -1;
            }
            return iMarial;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            dern();
            marial(null, 0, this.f22150graveside);
        }

        public final int saneness() {
            return RopeByteString.this.size() - (this.f22152molybdenite + this.f22154polloi);
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            if (j < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (j > 2147483647L) {
                j = 2147483647L;
            }
            return marial(null, 0, (int) j);
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            attabal();
            ByteString.LeafByteString leafByteString = this.f22149arytenoidectomy;
            if (leafByteString == null) {
                return -1;
            }
            int i = this.f22154polloi;
            this.f22154polloi = i + 1;
            return leafByteString.byteAt(i) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        }
    }
}
