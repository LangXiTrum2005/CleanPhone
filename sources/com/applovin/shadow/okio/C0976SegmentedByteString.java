package com.applovin.shadow.okio;

import androidx.datastore.preferences.protobuf.a;
import com.p004ironsource.dc;
import com.p004ironsource.x4;
import com.smartdigimkt.v0.k;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.applovin.shadow.okio.SegmentedByteString, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u0005\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J(\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\u0015\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0010H\u0010¢\u0006\u0002\b\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\r\u0010 \u001a\u00020\u0015H\u0010¢\u0006\u0002\b!J\b\u0010\"\u001a\u00020\u0015H\u0016J\b\u0010#\u001a\u00020\u0010H\u0016J\u001d\u0010$\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u0001H\u0010¢\u0006\u0002\b&J\u0018\u0010'\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0015H\u0016J\r\u0010)\u001a\u00020\u0004H\u0010¢\u0006\u0002\b*J\u0015\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0015H\u0010¢\u0006\u0002\b.J\u0018\u0010/\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0015H\u0016J(\u00100\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J(\u00100\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\u0010\u00102\u001a\u00020\u00102\u0006\u00103\u001a\u000204H\u0016J\u0018\u00105\u001a\u00020\u00012\u0006\u00106\u001a\u00020\u00152\u0006\u00107\u001a\u00020\u0015H\u0016J\b\u00108\u001a\u00020\u0001H\u0016J\b\u00109\u001a\u00020\u0001H\u0016J\b\u0010:\u001a\u00020\u0004H\u0016J\b\u0010;\u001a\u00020\u0001H\u0002J\b\u0010<\u001a\u00020\u0010H\u0016J\u0010\u0010=\u001a\u00020\u00132\u0006\u0010>\u001a\u00020?H\u0016J%\u0010=\u001a\u00020\u00132\u0006\u0010@\u001a\u00020A2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0010¢\u0006\u0002\bBJ\b\u0010C\u001a\u00020DH\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006E"}, d2 = {"Lcom/applovin/shadow/okio/SegmentedByteString;", "Lcom/applovin/shadow/okio/ByteString;", "segments", "", "", "directory", "", "([[B[I)V", "getDirectory$okio", "()[I", "getSegments$okio", "()[[B", "[[B", "asByteBuffer", "Ljava/nio/ByteBuffer;", "base64", "", "base64Url", "copyInto", "", "offset", "", "target", "targetOffset", "byteCount", "digest", "algorithm", "digest$okio", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "getSize", "getSize$okio", "hashCode", "hex", "hmac", "key", "hmac$okio", "indexOf", "fromIndex", "internalArray", "internalArray$okio", "internalGet", "", "pos", "internalGet$okio", "lastIndexOf", "rangeEquals", "otherOffset", k.f38992h, dc.M, "Ljava/nio/charset/Charset;", "substring", "beginIndex", "endIndex", "toAsciiLowercase", "toAsciiUppercase", "toByteArray", "toByteString", "toString", "write", "out", "Ljava/io/OutputStream;", "buffer", "Lcom/applovin/shadow/okio/Buffer;", "write$okio", "writeReplace", "Ljava/lang/Object;", "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class C0976SegmentedByteString extends ByteString {
    private final transient int[] directory;
    private final transient byte[][] segments;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0976SegmentedByteString(byte[][] segments, int[] directory) {
        super(ByteString.EMPTY.getData());
        Intrinsics.f(segments, "segments");
        Intrinsics.f(directory, "directory");
        this.segments = segments;
        this.directory = directory;
    }

    private final ByteString toByteString() {
        return new ByteString(toByteArray());
    }

    private final Object writeReplace() {
        ByteString byteString = toByteString();
        Intrinsics.d(byteString, "null cannot be cast to non-null type java.lang.Object");
        return byteString;
    }

    @Override // com.applovin.shadow.okio.ByteString
    public ByteBuffer asByteBuffer() {
        ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
        Intrinsics.e(byteBufferAsReadOnlyBuffer, "asReadOnlyBuffer(...)");
        return byteBufferAsReadOnlyBuffer;
    }

    @Override // com.applovin.shadow.okio.ByteString
    public String base64() {
        return toByteString().base64();
    }

    @Override // com.applovin.shadow.okio.ByteString
    public String base64Url() {
        return toByteString().base64Url();
    }

    @Override // com.applovin.shadow.okio.ByteString
    public void copyInto(int offset, byte[] target, int targetOffset, int byteCount) {
        Intrinsics.f(target, "target");
        long j = byteCount;
        SegmentedByteString.checkOffsetAndCount(size(), offset, j);
        SegmentedByteString.checkOffsetAndCount(target.length, targetOffset, j);
        int i2 = byteCount + offset;
        int iSegment = com.applovin.shadow.okio.internal.SegmentedByteString.segment(this, offset);
        while (offset < i2) {
            int i3 = iSegment == 0 ? 0 : getDirectory()[iSegment - 1];
            int i4 = getDirectory()[iSegment] - i3;
            int i5 = getDirectory()[getSegments().length + iSegment];
            int iMin = Math.min(i2, i4 + i3) - offset;
            int i6 = (offset - i3) + i5;
            ArraysKt.m(targetOffset, i6, i6 + iMin, getSegments()[iSegment], target);
            targetOffset += iMin;
            offset += iMin;
            iSegment++;
        }
    }

    @Override // com.applovin.shadow.okio.ByteString
    public ByteString digest$okio(String algorithm) throws NoSuchAlgorithmException {
        Intrinsics.f(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = getSegments().length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = getDirectory()[length + i2];
            int i5 = getDirectory()[i2];
            messageDigest.update(getSegments()[i2], i4, i5 - i3);
            i2++;
            i3 = i5;
        }
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.c(bArrDigest);
        return new ByteString(bArrDigest);
    }

    @Override // com.applovin.shadow.okio.ByteString
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof ByteString) {
            ByteString byteString = (ByteString) other;
            if (byteString.size() == size() && rangeEquals(0, byteString, 0, size())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: getDirectory$okio, reason: from getter */
    public final int[] getDirectory() {
        return this.directory;
    }

    /* JADX INFO: renamed from: getSegments$okio, reason: from getter */
    public final byte[][] getSegments() {
        return this.segments;
    }

    @Override // com.applovin.shadow.okio.ByteString
    public int getSize$okio() {
        return getDirectory()[getSegments().length - 1];
    }

    @Override // com.applovin.shadow.okio.ByteString
    public int hashCode() {
        int hashCode = getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int length = getSegments().length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int i5 = getDirectory()[length + i2];
            int i6 = getDirectory()[i2];
            byte[] bArr = getSegments()[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        setHashCode$okio(i3);
        return i3;
    }

    @Override // com.applovin.shadow.okio.ByteString
    public String hex() {
        return toByteString().hex();
    }

    @Override // com.applovin.shadow.okio.ByteString
    public ByteString hmac$okio(String algorithm, ByteString key) throws NoSuchAlgorithmException {
        Intrinsics.f(algorithm, "algorithm");
        Intrinsics.f(key, "key");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            int length = getSegments().length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                int i4 = getDirectory()[length + i2];
                int i5 = getDirectory()[i2];
                mac.update(getSegments()[i2], i4, i5 - i3);
                i2++;
                i3 = i5;
            }
            byte[] bArrDoFinal = mac.doFinal();
            Intrinsics.e(bArrDoFinal, "doFinal(...)");
            return new ByteString(bArrDoFinal);
        } catch (InvalidKeyException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    @Override // com.applovin.shadow.okio.ByteString
    public int indexOf(byte[] other, int fromIndex) {
        Intrinsics.f(other, "other");
        return toByteString().indexOf(other, fromIndex);
    }

    @Override // com.applovin.shadow.okio.ByteString
    public byte[] internalArray$okio() {
        return toByteArray();
    }

    @Override // com.applovin.shadow.okio.ByteString
    public byte internalGet$okio(int pos) {
        SegmentedByteString.checkOffsetAndCount(getDirectory()[getSegments().length - 1], pos, 1L);
        int iSegment = com.applovin.shadow.okio.internal.SegmentedByteString.segment(this, pos);
        return getSegments()[iSegment][(pos - (iSegment == 0 ? 0 : getDirectory()[iSegment - 1])) + getDirectory()[getSegments().length + iSegment]];
    }

    @Override // com.applovin.shadow.okio.ByteString
    public int lastIndexOf(byte[] other, int fromIndex) {
        Intrinsics.f(other, "other");
        return toByteString().lastIndexOf(other, fromIndex);
    }

    @Override // com.applovin.shadow.okio.ByteString
    public boolean rangeEquals(int offset, ByteString other, int otherOffset, int byteCount) {
        Intrinsics.f(other, "other");
        if (offset < 0 || offset > size() - byteCount) {
            return false;
        }
        int i2 = byteCount + offset;
        int iSegment = com.applovin.shadow.okio.internal.SegmentedByteString.segment(this, offset);
        while (offset < i2) {
            int i3 = iSegment == 0 ? 0 : getDirectory()[iSegment - 1];
            int i4 = getDirectory()[iSegment] - i3;
            int i5 = getDirectory()[getSegments().length + iSegment];
            int iMin = Math.min(i2, i4 + i3) - offset;
            if (!other.rangeEquals(otherOffset, getSegments()[iSegment], (offset - i3) + i5, iMin)) {
                return false;
            }
            otherOffset += iMin;
            offset += iMin;
            iSegment++;
        }
        return true;
    }

    @Override // com.applovin.shadow.okio.ByteString
    public String string(Charset charset) {
        Intrinsics.f(charset, "charset");
        return toByteString().string(charset);
    }

    @Override // com.applovin.shadow.okio.ByteString
    public ByteString substring(int beginIndex, int endIndex) {
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(this, endIndex);
        if (beginIndex < 0) {
            throw new IllegalArgumentException(a.k("beginIndex=", beginIndex, " < 0").toString());
        }
        if (iResolveDefaultParameter > size()) {
            StringBuilder sbU = android.support.v4.media.a.u(iResolveDefaultParameter, "endIndex=", " > length(");
            sbU.append(size());
            sbU.append(')');
            throw new IllegalArgumentException(sbU.toString().toString());
        }
        int i2 = iResolveDefaultParameter - beginIndex;
        if (i2 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.g(iResolveDefaultParameter, beginIndex, "endIndex=", " < beginIndex=").toString());
        }
        if (beginIndex == 0 && iResolveDefaultParameter == size()) {
            return this;
        }
        if (beginIndex == iResolveDefaultParameter) {
            return ByteString.EMPTY;
        }
        int iSegment = com.applovin.shadow.okio.internal.SegmentedByteString.segment(this, beginIndex);
        int iSegment2 = com.applovin.shadow.okio.internal.SegmentedByteString.segment(this, iResolveDefaultParameter - 1);
        byte[][] bArr = (byte[][]) ArraysKt.r(getSegments(), iSegment, iSegment2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iSegment <= iSegment2) {
            int i3 = iSegment;
            int i4 = 0;
            while (true) {
                iArr[i4] = Math.min(getDirectory()[i3] - beginIndex, i2);
                int i5 = i4 + 1;
                iArr[i4 + bArr.length] = getDirectory()[getSegments().length + i3];
                if (i3 == iSegment2) {
                    break;
                }
                i3++;
                i4 = i5;
            }
        }
        int i6 = iSegment != 0 ? getDirectory()[iSegment - 1] : 0;
        int length = bArr.length;
        iArr[length] = (beginIndex - i6) + iArr[length];
        return new C0976SegmentedByteString(bArr, iArr);
    }

    @Override // com.applovin.shadow.okio.ByteString
    public ByteString toAsciiLowercase() {
        return toByteString().toAsciiLowercase();
    }

    @Override // com.applovin.shadow.okio.ByteString
    public ByteString toAsciiUppercase() {
        return toByteString().toAsciiUppercase();
    }

    @Override // com.applovin.shadow.okio.ByteString
    public byte[] toByteArray() {
        byte[] bArr = new byte[size()];
        int length = getSegments().length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int i5 = getDirectory()[length + i2];
            int i6 = getDirectory()[i2];
            int i7 = i6 - i3;
            ArraysKt.m(i4, i5, i5 + i7, getSegments()[i2], bArr);
            i4 += i7;
            i2++;
            i3 = i6;
        }
        return bArr;
    }

    @Override // com.applovin.shadow.okio.ByteString
    public String toString() {
        return toByteString().toString();
    }

    @Override // com.applovin.shadow.okio.ByteString
    public void write(OutputStream out) throws IOException {
        Intrinsics.f(out, "out");
        int length = getSegments().length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = getDirectory()[length + i2];
            int i5 = getDirectory()[i2];
            out.write(getSegments()[i2], i4, i5 - i3);
            i2++;
            i3 = i5;
        }
    }

    @Override // com.applovin.shadow.okio.ByteString
    public void write$okio(Buffer buffer, int offset, int byteCount) {
        Intrinsics.f(buffer, "buffer");
        int i2 = offset + byteCount;
        int iSegment = com.applovin.shadow.okio.internal.SegmentedByteString.segment(this, offset);
        while (offset < i2) {
            int i3 = iSegment == 0 ? 0 : getDirectory()[iSegment - 1];
            int i4 = getDirectory()[iSegment] - i3;
            int i5 = getDirectory()[getSegments().length + iSegment];
            int iMin = Math.min(i2, i4 + i3) - offset;
            int i6 = (offset - i3) + i5;
            Segment segment = new Segment(getSegments()[iSegment], i6, i6 + iMin, true, false);
            Segment segment2 = buffer.head;
            if (segment2 == null) {
                segment.prev = segment;
                segment.next = segment;
                buffer.head = segment;
            } else {
                Intrinsics.c(segment2);
                Segment segment3 = segment2.prev;
                Intrinsics.c(segment3);
                segment3.push(segment);
            }
            offset += iMin;
            iSegment++;
        }
        buffer.setSize$okio(buffer.size() + ((long) byteCount));
    }

    @Override // com.applovin.shadow.okio.ByteString
    public boolean rangeEquals(int offset, byte[] other, int otherOffset, int byteCount) {
        Intrinsics.f(other, "other");
        if (offset < 0 || offset > size() - byteCount || otherOffset < 0 || otherOffset > other.length - byteCount) {
            return false;
        }
        int i2 = byteCount + offset;
        int iSegment = com.applovin.shadow.okio.internal.SegmentedByteString.segment(this, offset);
        while (offset < i2) {
            int i3 = iSegment == 0 ? 0 : getDirectory()[iSegment - 1];
            int i4 = getDirectory()[iSegment] - i3;
            int i5 = getDirectory()[getSegments().length + iSegment];
            int iMin = Math.min(i2, i4 + i3) - offset;
            if (!SegmentedByteString.arrayRangeEquals(getSegments()[iSegment], (offset - i3) + i5, other, otherOffset, iMin)) {
                return false;
            }
            otherOffset += iMin;
            offset += iMin;
            iSegment++;
        }
        return true;
    }
}
