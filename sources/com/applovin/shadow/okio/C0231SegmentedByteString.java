package com.applovin.shadow.okio;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.ironsource.B5;
import com.ironsource.X3;
import defpackage.e;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
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
import kotlin.jvm.internal.n;
import xj.k;

/* JADX INFO: renamed from: com.applovin.shadow.okio.SegmentedByteString, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\nJ\u000f\u0010\u0017\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\nJ\u0017\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0010H\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u0010H\u0016¢\u0006\u0004\b \u0010\u0014J\u001f\u0010$\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010*\u001a\u00020'2\u0006\u0010&\u001a\u00020!H\u0010¢\u0006\u0004\b(\u0010)J\u000f\u0010-\u001a\u00020!H\u0010¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020\u0003H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00106\u001a\u0002052\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b6\u00107J'\u00106\u001a\u0002052\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020!2\u0006\u0010;\u001a\u00020!H\u0010¢\u0006\u0004\b<\u0010=J/\u0010A\u001a\u00020@2\u0006\u0010:\u001a\u00020!2\u0006\u0010>\u001a\u00020\u00012\u0006\u0010?\u001a\u00020!2\u0006\u0010;\u001a\u00020!H\u0016¢\u0006\u0004\bA\u0010BJ/\u0010A\u001a\u00020@2\u0006\u0010:\u001a\u00020!2\u0006\u0010>\u001a\u00020\u00032\u0006\u0010?\u001a\u00020!2\u0006\u0010;\u001a\u00020!H\u0016¢\u0006\u0004\bA\u0010CJ/\u0010F\u001a\u0002052\u0006\u0010:\u001a\u00020!2\u0006\u0010D\u001a\u00020\u00032\u0006\u0010E\u001a\u00020!2\u0006\u0010;\u001a\u00020!H\u0016¢\u0006\u0004\bF\u0010GJ\u001f\u0010I\u001a\u00020!2\u0006\u0010>\u001a\u00020\u00032\u0006\u0010H\u001a\u00020!H\u0016¢\u0006\u0004\bI\u0010JJ\u001f\u0010K\u001a\u00020!2\u0006\u0010>\u001a\u00020\u00032\u0006\u0010H\u001a\u00020!H\u0016¢\u0006\u0004\bK\u0010JJ\u000f\u0010M\u001a\u00020\u0003H\u0010¢\u0006\u0004\bL\u0010/J\u001a\u0010O\u001a\u00020@2\b\u0010>\u001a\u0004\u0018\u00010NH\u0096\u0002¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020!H\u0016¢\u0006\u0004\bQ\u0010,J\u000f\u0010R\u001a\u00020\u0010H\u0016¢\u0006\u0004\bR\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010S\u001a\u0004\bT\u0010UR\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010V\u001a\u0004\bW\u0010X¨\u0006Y"}, d2 = {"Lcom/applovin/shadow/okio/SegmentedByteString;", "Lcom/applovin/shadow/okio/ByteString;", "", "", "segments", "", "directory", "<init>", "([[B[I)V", "toByteString", "()Lcom/applovin/shadow/okio/ByteString;", "Ljava/lang/Object;", "writeReplace", "()Ljava/lang/Object;", "Ljava/nio/charset/Charset;", B5.N, "", "string", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "base64", "()Ljava/lang/String;", "hex", "toAsciiLowercase", "toAsciiUppercase", "algorithm", "digest$okio", "(Ljava/lang/String;)Lcom/applovin/shadow/okio/ByteString;", "digest", X3.i.W, "hmac$okio", "(Ljava/lang/String;Lcom/applovin/shadow/okio/ByteString;)Lcom/applovin/shadow/okio/ByteString;", "hmac", "base64Url", "", "beginIndex", "endIndex", "substring", "(II)Lcom/applovin/shadow/okio/ByteString;", "pos", "", "internalGet$okio", "(I)B", "internalGet", "getSize$okio", "()I", "getSize", "toByteArray", "()[B", "Ljava/nio/ByteBuffer;", "asByteBuffer", "()Ljava/nio/ByteBuffer;", "Ljava/io/OutputStream;", "out", "Lwj/r;", "write", "(Ljava/io/OutputStream;)V", "Lcom/applovin/shadow/okio/Buffer;", "buffer", "offset", "byteCount", "write$okio", "(Lcom/applovin/shadow/okio/Buffer;II)V", "other", "otherOffset", "", "rangeEquals", "(ILcom/applovin/shadow/okio/ByteString;II)Z", "(I[BII)Z", "target", "targetOffset", "copyInto", "(I[BII)V", "fromIndex", "indexOf", "([BI)I", "lastIndexOf", "internalArray$okio", "internalArray", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "[[B", "getSegments$okio", "()[[B", "[I", "getDirectory$okio", "()[I", "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class C0231SegmentedByteString extends ByteString {
    private final transient int[] directory;
    private final transient byte[][] segments;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0231SegmentedByteString(byte[][] segments, int[] directory) {
        super(ByteString.EMPTY.getData());
        n.f(segments, "segments");
        n.f(directory, "directory");
        this.segments = segments;
        this.directory = directory;
    }

    private final ByteString toByteString() {
        return new ByteString(toByteArray());
    }

    private final Object writeReplace() {
        ByteString byteString = toByteString();
        n.d(byteString, "null cannot be cast to non-null type java.lang.Object");
        return byteString;
    }

    @Override // com.applovin.shadow.okio.ByteString
    public ByteBuffer asByteBuffer() {
        ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
        n.e(byteBufferAsReadOnlyBuffer, "asReadOnlyBuffer(...)");
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
        n.f(target, "target");
        long j10 = byteCount;
        SegmentedByteString.checkOffsetAndCount(size(), offset, j10);
        SegmentedByteString.checkOffsetAndCount(target.length, targetOffset, j10);
        int i10 = byteCount + offset;
        int iSegment = com.applovin.shadow.okio.internal.SegmentedByteString.segment(this, offset);
        while (offset < i10) {
            int i11 = iSegment == 0 ? 0 : getDirectory()[iSegment - 1];
            int i12 = getDirectory()[iSegment] - i11;
            int i13 = getDirectory()[getSegments().length + iSegment];
            int iMin = Math.min(i10, i12 + i11) - offset;
            int i14 = (offset - i11) + i13;
            k.g0(getSegments()[iSegment], targetOffset, i14, target, i14 + iMin);
            targetOffset += iMin;
            offset += iMin;
            iSegment++;
        }
    }

    @Override // com.applovin.shadow.okio.ByteString
    public ByteString digest$okio(String algorithm) throws NoSuchAlgorithmException {
        n.f(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = getSegments().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = getDirectory()[length + i10];
            int i13 = getDirectory()[i10];
            messageDigest.update(getSegments()[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] bArrDigest = messageDigest.digest();
        n.c(bArrDigest);
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
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int i13 = getDirectory()[length + i10];
            int i14 = getDirectory()[i10];
            byte[] bArr = getSegments()[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        setHashCode$okio(i11);
        return i11;
    }

    @Override // com.applovin.shadow.okio.ByteString
    public String hex() {
        return toByteString().hex();
    }

    @Override // com.applovin.shadow.okio.ByteString
    public ByteString hmac$okio(String algorithm, ByteString key) throws NoSuchAlgorithmException {
        n.f(algorithm, "algorithm");
        n.f(key, "key");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            int length = getSegments().length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                int i12 = getDirectory()[length + i10];
                int i13 = getDirectory()[i10];
                mac.update(getSegments()[i10], i12, i13 - i11);
                i10++;
                i11 = i13;
            }
            byte[] bArrDoFinal = mac.doFinal();
            n.e(bArrDoFinal, "doFinal(...)");
            return new ByteString(bArrDoFinal);
        } catch (InvalidKeyException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // com.applovin.shadow.okio.ByteString
    public int indexOf(byte[] other, int fromIndex) {
        n.f(other, "other");
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
        n.f(other, "other");
        return toByteString().lastIndexOf(other, fromIndex);
    }

    @Override // com.applovin.shadow.okio.ByteString
    public boolean rangeEquals(int offset, ByteString other, int otherOffset, int byteCount) {
        n.f(other, "other");
        if (offset < 0 || offset > size() - byteCount) {
            return false;
        }
        int i10 = byteCount + offset;
        int iSegment = com.applovin.shadow.okio.internal.SegmentedByteString.segment(this, offset);
        while (offset < i10) {
            int i11 = iSegment == 0 ? 0 : getDirectory()[iSegment - 1];
            int i12 = getDirectory()[iSegment] - i11;
            int i13 = getDirectory()[getSegments().length + iSegment];
            int iMin = Math.min(i10, i12 + i11) - offset;
            if (!other.rangeEquals(otherOffset, getSegments()[iSegment], (offset - i11) + i13, iMin)) {
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
        n.f(charset, "charset");
        return toByteString().string(charset);
    }

    @Override // com.applovin.shadow.okio.ByteString
    public ByteString substring(int beginIndex, int endIndex) {
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(this, endIndex);
        if (beginIndex < 0) {
            throw new IllegalArgumentException(e.h(beginIndex, "beginIndex=", " < 0").toString());
        }
        if (iResolveDefaultParameter > size()) {
            StringBuilder sbU = e.u(iResolveDefaultParameter, "endIndex=", " > length(");
            sbU.append(size());
            sbU.append(')');
            throw new IllegalArgumentException(sbU.toString().toString());
        }
        int i10 = iResolveDefaultParameter - beginIndex;
        if (i10 < 0) {
            throw new IllegalArgumentException(e.g(iResolveDefaultParameter, beginIndex, "endIndex=", " < beginIndex=").toString());
        }
        if (beginIndex == 0 && iResolveDefaultParameter == size()) {
            return this;
        }
        if (beginIndex == iResolveDefaultParameter) {
            return ByteString.EMPTY;
        }
        int iSegment = com.applovin.shadow.okio.internal.SegmentedByteString.segment(this, beginIndex);
        int iSegment2 = com.applovin.shadow.okio.internal.SegmentedByteString.segment(this, iResolveDefaultParameter - 1);
        byte[][] bArr = (byte[][]) k.j0(iSegment, iSegment2 + 1, getSegments());
        int[] iArr = new int[bArr.length * 2];
        if (iSegment <= iSegment2) {
            int i11 = iSegment;
            int i12 = 0;
            while (true) {
                iArr[i12] = Math.min(getDirectory()[i11] - beginIndex, i10);
                int i13 = i12 + 1;
                iArr[i12 + bArr.length] = getDirectory()[getSegments().length + i11];
                if (i11 == iSegment2) {
                    break;
                }
                i11++;
                i12 = i13;
            }
        }
        int i14 = iSegment != 0 ? getDirectory()[iSegment - 1] : 0;
        int length = bArr.length;
        iArr[length] = (beginIndex - i14) + iArr[length];
        return new C0231SegmentedByteString(bArr, iArr);
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
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = getDirectory()[length + i10];
            int i14 = getDirectory()[i10];
            int i15 = i14 - i11;
            k.g0(getSegments()[i10], i12, i13, bArr, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // com.applovin.shadow.okio.ByteString
    public String toString() {
        return toByteString().toString();
    }

    @Override // com.applovin.shadow.okio.ByteString
    public void write(OutputStream out) throws IOException {
        n.f(out, "out");
        int length = getSegments().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = getDirectory()[length + i10];
            int i13 = getDirectory()[i10];
            out.write(getSegments()[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
    }

    @Override // com.applovin.shadow.okio.ByteString
    public void write$okio(Buffer buffer, int offset, int byteCount) {
        n.f(buffer, "buffer");
        int i10 = offset + byteCount;
        int iSegment = com.applovin.shadow.okio.internal.SegmentedByteString.segment(this, offset);
        while (offset < i10) {
            int i11 = iSegment == 0 ? 0 : getDirectory()[iSegment - 1];
            int i12 = getDirectory()[iSegment] - i11;
            int i13 = getDirectory()[getSegments().length + iSegment];
            int iMin = Math.min(i10, i12 + i11) - offset;
            int i14 = (offset - i11) + i13;
            Segment segment = new Segment(getSegments()[iSegment], i14, i14 + iMin, true, false);
            Segment segment2 = buffer.head;
            if (segment2 == null) {
                segment.prev = segment;
                segment.next = segment;
                buffer.head = segment;
            } else {
                n.c(segment2);
                Segment segment3 = segment2.prev;
                n.c(segment3);
                segment3.push(segment);
            }
            offset += iMin;
            iSegment++;
        }
        buffer.setSize$okio(buffer.size() + ((long) byteCount));
    }

    @Override // com.applovin.shadow.okio.ByteString
    public boolean rangeEquals(int offset, byte[] other, int otherOffset, int byteCount) {
        n.f(other, "other");
        if (offset < 0 || offset > size() - byteCount || otherOffset < 0 || otherOffset > other.length - byteCount) {
            return false;
        }
        int i10 = byteCount + offset;
        int iSegment = com.applovin.shadow.okio.internal.SegmentedByteString.segment(this, offset);
        while (offset < i10) {
            int i11 = iSegment == 0 ? 0 : getDirectory()[iSegment - 1];
            int i12 = getDirectory()[iSegment] - i11;
            int i13 = getDirectory()[getSegments().length + iSegment];
            int iMin = Math.min(i10, i12 + i11) - offset;
            if (!SegmentedByteString.arrayRangeEquals(getSegments()[iSegment], (offset - i11) + i13, other, otherOffset, iMin)) {
                return false;
            }
            otherOffset += iMin;
            offset += iMin;
            iSegment++;
        }
        return true;
    }
}
