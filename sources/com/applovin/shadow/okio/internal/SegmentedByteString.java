package com.applovin.shadow.okio.internal;

import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.C0231SegmentedByteString;
import com.applovin.shadow.okio.Segment;
import com.ironsource.D1;
import com.ironsource.X3;
import defpackage.e;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import jk.d;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import xj.k;

/* JADX INFO: renamed from: com.applovin.shadow.okio.internal.-SegmentedByteString, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a+\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\t\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\t\u0010\n\u001a7\u0010\u000f\u001a\u00020\r*\u00020\u00072\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\u000bH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aD\u0010\u000f\u001a\u00020\r*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\u000bH\u0082\b¢\u0006\u0004\b\u000f\u0010\u0013\u001a$\u0010\u0015\u001a\u00020\u0014*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001c\u0010\u0018\u001a\u00020\u0017*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0014\u0010\u001a\u001a\u00020\u0001*\u00020\u0007H\u0080\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0014\u0010\u001c\u001a\u00020\f*\u00020\u0007H\u0080\b¢\u0006\u0004\b\u001c\u0010\u001d\u001a,\u0010\"\u001a\u00020\r*\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b\"\u0010#\u001a4\u0010'\u001a\u00020&*\u00020\u00072\u0006\u0010 \u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b'\u0010(\u001a4\u0010'\u001a\u00020&*\u00020\u00072\u0006\u0010 \u001a\u00020\u00012\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b'\u0010)\u001a4\u0010,\u001a\u00020\r*\u00020\u00072\u0006\u0010 \u001a\u00020\u00012\u0006\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b,\u0010-\u001a\u001e\u0010/\u001a\u00020&*\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010.H\u0080\b¢\u0006\u0004\b/\u00100\u001a\u0014\u00101\u001a\u00020\u0001*\u00020\u0007H\u0080\b¢\u0006\u0004\b1\u0010\u001b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00062"}, d2 = {"", "", X3.i.X, "fromIndex", "toIndex", "binarySearch", "([IIII)I", "Lcom/applovin/shadow/okio/SegmentedByteString;", "pos", D1.f25924i, "(Lcom/applovin/shadow/okio/SegmentedByteString;I)I", "Lkotlin/Function3;", "", "Lwj/r;", "action", "forEachSegment", "(Lcom/applovin/shadow/okio/SegmentedByteString;Ljk/d;)V", "beginIndex", "endIndex", "(Lcom/applovin/shadow/okio/SegmentedByteString;IILjk/d;)V", "Lcom/applovin/shadow/okio/ByteString;", "commonSubstring", "(Lcom/applovin/shadow/okio/SegmentedByteString;II)Lcom/applovin/shadow/okio/ByteString;", "", "commonInternalGet", "(Lcom/applovin/shadow/okio/SegmentedByteString;I)B", "commonGetSize", "(Lcom/applovin/shadow/okio/SegmentedByteString;)I", "commonToByteArray", "(Lcom/applovin/shadow/okio/SegmentedByteString;)[B", "Lcom/applovin/shadow/okio/Buffer;", "buffer", "offset", "byteCount", "commonWrite", "(Lcom/applovin/shadow/okio/SegmentedByteString;Lcom/applovin/shadow/okio/Buffer;II)V", "other", "otherOffset", "", "commonRangeEquals", "(Lcom/applovin/shadow/okio/SegmentedByteString;ILcom/applovin/shadow/okio/ByteString;II)Z", "(Lcom/applovin/shadow/okio/SegmentedByteString;I[BII)Z", "target", "targetOffset", "commonCopyInto", "(Lcom/applovin/shadow/okio/SegmentedByteString;I[BII)V", "", "commonEquals", "(Lcom/applovin/shadow/okio/SegmentedByteString;Ljava/lang/Object;)Z", "commonHashCode", "com.applovin.shadow.okio"}, k = 2, mv = {1, 9, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class SegmentedByteString {
    public static final int binarySearch(int[] iArr, int i10, int i11, int i12) {
        n.f(iArr, "<this>");
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i10) {
                i11 = i14 + 1;
            } else {
                if (i15 <= i10) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return (-i11) - 1;
    }

    public static final void commonCopyInto(C0231SegmentedByteString c0231SegmentedByteString, int i10, byte[] target, int i11, int i12) {
        n.f(c0231SegmentedByteString, "<this>");
        n.f(target, "target");
        long j10 = i12;
        com.applovin.shadow.okio.SegmentedByteString.checkOffsetAndCount(c0231SegmentedByteString.size(), i10, j10);
        com.applovin.shadow.okio.SegmentedByteString.checkOffsetAndCount(target.length, i11, j10);
        int i13 = i12 + i10;
        int iSegment = segment(c0231SegmentedByteString, i10);
        while (i10 < i13) {
            int i14 = iSegment == 0 ? 0 : c0231SegmentedByteString.getDirectory()[iSegment - 1];
            int i15 = c0231SegmentedByteString.getDirectory()[iSegment] - i14;
            int i16 = c0231SegmentedByteString.getDirectory()[c0231SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i13, i15 + i14) - i10;
            int i17 = (i10 - i14) + i16;
            k.g0(c0231SegmentedByteString.getSegments()[iSegment], i11, i17, target, i17 + iMin);
            i11 += iMin;
            i10 += iMin;
            iSegment++;
        }
    }

    public static final boolean commonEquals(C0231SegmentedByteString c0231SegmentedByteString, Object obj) {
        n.f(c0231SegmentedByteString, "<this>");
        if (obj == c0231SegmentedByteString) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == c0231SegmentedByteString.size() && c0231SegmentedByteString.rangeEquals(0, byteString, 0, c0231SegmentedByteString.size())) {
                return true;
            }
        }
        return false;
    }

    public static final int commonGetSize(C0231SegmentedByteString c0231SegmentedByteString) {
        n.f(c0231SegmentedByteString, "<this>");
        return c0231SegmentedByteString.getDirectory()[c0231SegmentedByteString.getSegments().length - 1];
    }

    public static final int commonHashCode(C0231SegmentedByteString c0231SegmentedByteString) {
        n.f(c0231SegmentedByteString, "<this>");
        int hashCode = c0231SegmentedByteString.getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int length = c0231SegmentedByteString.getSegments().length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int i13 = c0231SegmentedByteString.getDirectory()[length + i10];
            int i14 = c0231SegmentedByteString.getDirectory()[i10];
            byte[] bArr = c0231SegmentedByteString.getSegments()[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        c0231SegmentedByteString.setHashCode$okio(i11);
        return i11;
    }

    public static final byte commonInternalGet(C0231SegmentedByteString c0231SegmentedByteString, int i10) {
        n.f(c0231SegmentedByteString, "<this>");
        com.applovin.shadow.okio.SegmentedByteString.checkOffsetAndCount(c0231SegmentedByteString.getDirectory()[c0231SegmentedByteString.getSegments().length - 1], i10, 1L);
        int iSegment = segment(c0231SegmentedByteString, i10);
        return c0231SegmentedByteString.getSegments()[iSegment][(i10 - (iSegment == 0 ? 0 : c0231SegmentedByteString.getDirectory()[iSegment - 1])) + c0231SegmentedByteString.getDirectory()[c0231SegmentedByteString.getSegments().length + iSegment]];
    }

    public static final boolean commonRangeEquals(C0231SegmentedByteString c0231SegmentedByteString, int i10, ByteString other, int i11, int i12) {
        n.f(c0231SegmentedByteString, "<this>");
        n.f(other, "other");
        if (i10 < 0 || i10 > c0231SegmentedByteString.size() - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iSegment = segment(c0231SegmentedByteString, i10);
        while (i10 < i13) {
            int i14 = iSegment == 0 ? 0 : c0231SegmentedByteString.getDirectory()[iSegment - 1];
            int i15 = c0231SegmentedByteString.getDirectory()[iSegment] - i14;
            int i16 = c0231SegmentedByteString.getDirectory()[c0231SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!other.rangeEquals(i11, c0231SegmentedByteString.getSegments()[iSegment], (i10 - i14) + i16, iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iSegment++;
        }
        return true;
    }

    public static final ByteString commonSubstring(C0231SegmentedByteString c0231SegmentedByteString, int i10, int i11) {
        n.f(c0231SegmentedByteString, "<this>");
        int iResolveDefaultParameter = com.applovin.shadow.okio.SegmentedByteString.resolveDefaultParameter(c0231SegmentedByteString, i11);
        if (i10 < 0) {
            throw new IllegalArgumentException(e.h(i10, "beginIndex=", " < 0").toString());
        }
        if (iResolveDefaultParameter > c0231SegmentedByteString.size()) {
            StringBuilder sbU = e.u(iResolveDefaultParameter, "endIndex=", " > length(");
            sbU.append(c0231SegmentedByteString.size());
            sbU.append(')');
            throw new IllegalArgumentException(sbU.toString().toString());
        }
        int i12 = iResolveDefaultParameter - i10;
        if (i12 < 0) {
            throw new IllegalArgumentException(e.g(iResolveDefaultParameter, i10, "endIndex=", " < beginIndex=").toString());
        }
        if (i10 == 0 && iResolveDefaultParameter == c0231SegmentedByteString.size()) {
            return c0231SegmentedByteString;
        }
        if (i10 == iResolveDefaultParameter) {
            return ByteString.EMPTY;
        }
        int iSegment = segment(c0231SegmentedByteString, i10);
        int iSegment2 = segment(c0231SegmentedByteString, iResolveDefaultParameter - 1);
        byte[][] bArr = (byte[][]) k.j0(iSegment, iSegment2 + 1, c0231SegmentedByteString.getSegments());
        int[] iArr = new int[bArr.length * 2];
        if (iSegment <= iSegment2) {
            int i13 = iSegment;
            int i14 = 0;
            while (true) {
                iArr[i14] = Math.min(c0231SegmentedByteString.getDirectory()[i13] - i10, i12);
                int i15 = i14 + 1;
                iArr[i14 + bArr.length] = c0231SegmentedByteString.getDirectory()[c0231SegmentedByteString.getSegments().length + i13];
                if (i13 == iSegment2) {
                    break;
                }
                i13++;
                i14 = i15;
            }
        }
        int i16 = iSegment != 0 ? c0231SegmentedByteString.getDirectory()[iSegment - 1] : 0;
        int length = bArr.length;
        iArr[length] = (i10 - i16) + iArr[length];
        return new C0231SegmentedByteString(bArr, iArr);
    }

    public static final byte[] commonToByteArray(C0231SegmentedByteString c0231SegmentedByteString) {
        n.f(c0231SegmentedByteString, "<this>");
        byte[] bArr = new byte[c0231SegmentedByteString.size()];
        int length = c0231SegmentedByteString.getSegments().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = c0231SegmentedByteString.getDirectory()[length + i10];
            int i14 = c0231SegmentedByteString.getDirectory()[i10];
            int i15 = i14 - i11;
            k.g0(c0231SegmentedByteString.getSegments()[i10], i12, i13, bArr, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    public static final void commonWrite(C0231SegmentedByteString c0231SegmentedByteString, Buffer buffer, int i10, int i11) {
        n.f(c0231SegmentedByteString, "<this>");
        n.f(buffer, "buffer");
        int i12 = i10 + i11;
        int iSegment = segment(c0231SegmentedByteString, i10);
        while (i10 < i12) {
            int i13 = iSegment == 0 ? 0 : c0231SegmentedByteString.getDirectory()[iSegment - 1];
            int i14 = c0231SegmentedByteString.getDirectory()[iSegment] - i13;
            int i15 = c0231SegmentedByteString.getDirectory()[c0231SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i12, i14 + i13) - i10;
            int i16 = (i10 - i13) + i15;
            Segment segment = new Segment(c0231SegmentedByteString.getSegments()[iSegment], i16, i16 + iMin, true, false);
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
            i10 += iMin;
            iSegment++;
        }
        buffer.setSize$okio(buffer.size() + ((long) i11));
    }

    public static final void forEachSegment(C0231SegmentedByteString c0231SegmentedByteString, d action) {
        n.f(c0231SegmentedByteString, "<this>");
        n.f(action, "action");
        int length = c0231SegmentedByteString.getSegments().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = c0231SegmentedByteString.getDirectory()[length + i10];
            int i13 = c0231SegmentedByteString.getDirectory()[i10];
            action.invoke(c0231SegmentedByteString.getSegments()[i10], Integer.valueOf(i12), Integer.valueOf(i13 - i11));
            i10++;
            i11 = i13;
        }
    }

    public static final int segment(C0231SegmentedByteString c0231SegmentedByteString, int i10) {
        n.f(c0231SegmentedByteString, "<this>");
        int iBinarySearch = binarySearch(c0231SegmentedByteString.getDirectory(), i10 + 1, 0, c0231SegmentedByteString.getSegments().length);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    private static final void forEachSegment(C0231SegmentedByteString c0231SegmentedByteString, int i10, int i11, d dVar) {
        int iSegment = segment(c0231SegmentedByteString, i10);
        while (i10 < i11) {
            int i12 = iSegment == 0 ? 0 : c0231SegmentedByteString.getDirectory()[iSegment - 1];
            int i13 = c0231SegmentedByteString.getDirectory()[iSegment] - i12;
            int i14 = c0231SegmentedByteString.getDirectory()[c0231SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i11, i13 + i12) - i10;
            dVar.invoke(c0231SegmentedByteString.getSegments()[iSegment], Integer.valueOf((i10 - i12) + i14), Integer.valueOf(iMin));
            i10 += iMin;
            iSegment++;
        }
    }

    public static final boolean commonRangeEquals(C0231SegmentedByteString c0231SegmentedByteString, int i10, byte[] other, int i11, int i12) {
        n.f(c0231SegmentedByteString, "<this>");
        n.f(other, "other");
        if (i10 < 0 || i10 > c0231SegmentedByteString.size() - i12 || i11 < 0 || i11 > other.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iSegment = segment(c0231SegmentedByteString, i10);
        while (i10 < i13) {
            int i14 = iSegment == 0 ? 0 : c0231SegmentedByteString.getDirectory()[iSegment - 1];
            int i15 = c0231SegmentedByteString.getDirectory()[iSegment] - i14;
            int i16 = c0231SegmentedByteString.getDirectory()[c0231SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!com.applovin.shadow.okio.SegmentedByteString.arrayRangeEquals(c0231SegmentedByteString.getSegments()[iSegment], (i10 - i14) + i16, other, i11, iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iSegment++;
        }
        return true;
    }
}
