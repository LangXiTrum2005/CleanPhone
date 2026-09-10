package androidx.media3.exoplayer.source;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoInfo;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.upstream.Allocation;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.extractor.TrackOutput;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
class SampleDataQueue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Allocator f6416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ParsableByteArray f6418c;
    public AllocationNode d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AllocationNode f6419e;
    public AllocationNode f;
    public long g;

    public static final class AllocationNode implements Allocator.AllocationNode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f6420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f6421b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Allocation f6422c;
        public AllocationNode d;

        public AllocationNode(long j, int i2) {
            Assertions.e(this.f6422c == null);
            this.f6420a = j;
            this.f6421b = j + ((long) i2);
        }

        @Override // androidx.media3.exoplayer.upstream.Allocator.AllocationNode
        public final Allocation a() {
            Allocation allocation = this.f6422c;
            allocation.getClass();
            return allocation;
        }

        @Override // androidx.media3.exoplayer.upstream.Allocator.AllocationNode
        public final Allocator.AllocationNode next() {
            AllocationNode allocationNode = this.d;
            if (allocationNode == null || allocationNode.f6422c == null) {
                return null;
            }
            return allocationNode;
        }
    }

    public SampleDataQueue(Allocator allocator) {
        this.f6416a = allocator;
        int individualAllocationLength = allocator.getIndividualAllocationLength();
        this.f6417b = individualAllocationLength;
        this.f6418c = new ParsableByteArray(32);
        AllocationNode allocationNode = new AllocationNode(0L, individualAllocationLength);
        this.d = allocationNode;
        this.f6419e = allocationNode;
        this.f = allocationNode;
    }

    public static AllocationNode c(AllocationNode allocationNode, long j, ByteBuffer byteBuffer, int i2) {
        while (j >= allocationNode.f6421b) {
            allocationNode = allocationNode.d;
        }
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (allocationNode.f6421b - j));
            Allocation allocation = allocationNode.f6422c;
            byteBuffer.put(allocation.f6551a, ((int) (j - allocationNode.f6420a)) + allocation.f6552b, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == allocationNode.f6421b) {
                allocationNode = allocationNode.d;
            }
        }
        return allocationNode;
    }

    public static AllocationNode d(AllocationNode allocationNode, long j, byte[] bArr, int i2) {
        while (j >= allocationNode.f6421b) {
            allocationNode = allocationNode.d;
        }
        int i3 = i2;
        while (i3 > 0) {
            int iMin = Math.min(i3, (int) (allocationNode.f6421b - j));
            Allocation allocation = allocationNode.f6422c;
            System.arraycopy(allocation.f6551a, ((int) (j - allocationNode.f6420a)) + allocation.f6552b, bArr, i2 - i3, iMin);
            i3 -= iMin;
            j += (long) iMin;
            if (j == allocationNode.f6421b) {
                allocationNode = allocationNode.d;
            }
        }
        return allocationNode;
    }

    public static AllocationNode e(AllocationNode allocationNode, DecoderInputBuffer decoderInputBuffer, SampleQueue.SampleExtrasHolder sampleExtrasHolder, ParsableByteArray parsableByteArray) {
        AllocationNode allocationNodeD;
        int iA;
        if (decoderInputBuffer.b(1073741824)) {
            long j = sampleExtrasHolder.f6438b;
            parsableByteArray.D(1);
            AllocationNode allocationNodeD2 = d(allocationNode, j, parsableByteArray.f5667a, 1);
            long j2 = j + 1;
            byte b2 = parsableByteArray.f5667a[0];
            boolean z2 = (b2 & 128) != 0;
            int i2 = b2 & AbstractJsonLexerKt.TC_INVALID;
            CryptoInfo cryptoInfo = decoderInputBuffer.Z;
            byte[] bArr = cryptoInfo.f5793a;
            if (bArr == null) {
                cryptoInfo.f5793a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            allocationNodeD = d(allocationNodeD2, j2, cryptoInfo.f5793a, i2);
            long j3 = j2 + ((long) i2);
            if (z2) {
                parsableByteArray.D(2);
                allocationNodeD = d(allocationNodeD, j3, parsableByteArray.f5667a, 2);
                j3 += 2;
                iA = parsableByteArray.A();
            } else {
                iA = 1;
            }
            int[] iArr = cryptoInfo.d;
            if (iArr == null || iArr.length < iA) {
                iArr = new int[iA];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = cryptoInfo.f5796e;
            if (iArr3 == null || iArr3.length < iA) {
                iArr3 = new int[iA];
            }
            int[] iArr4 = iArr3;
            if (z2) {
                int i3 = iA * 6;
                parsableByteArray.D(i3);
                allocationNodeD = d(allocationNodeD, j3, parsableByteArray.f5667a, i3);
                j3 += (long) i3;
                parsableByteArray.G(0);
                for (int i4 = 0; i4 < iA; i4++) {
                    iArr2[i4] = parsableByteArray.A();
                    iArr4[i4] = parsableByteArray.y();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = sampleExtrasHolder.f6437a - ((int) (j3 - sampleExtrasHolder.f6438b));
            }
            TrackOutput.CryptoData cryptoData = sampleExtrasHolder.f6439c;
            int i5 = Util.f5683a;
            cryptoInfo.a(iA, iArr2, iArr4, cryptoData.f6806b, cryptoInfo.f5793a, cryptoData.f6805a, cryptoData.f6807c, cryptoData.d);
            long j4 = sampleExtrasHolder.f6438b;
            int i6 = (int) (j3 - j4);
            sampleExtrasHolder.f6438b = j4 + ((long) i6);
            sampleExtrasHolder.f6437a -= i6;
        } else {
            allocationNodeD = allocationNode;
        }
        if (!decoderInputBuffer.b(268435456)) {
            decoderInputBuffer.g(sampleExtrasHolder.f6437a);
            return c(allocationNodeD, sampleExtrasHolder.f6438b, decoderInputBuffer.e0, sampleExtrasHolder.f6437a);
        }
        parsableByteArray.D(4);
        AllocationNode allocationNodeD3 = d(allocationNodeD, sampleExtrasHolder.f6438b, parsableByteArray.f5667a, 4);
        int iY = parsableByteArray.y();
        sampleExtrasHolder.f6438b += 4;
        sampleExtrasHolder.f6437a -= 4;
        decoderInputBuffer.g(iY);
        AllocationNode allocationNodeC = c(allocationNodeD3, sampleExtrasHolder.f6438b, decoderInputBuffer.e0, iY);
        sampleExtrasHolder.f6438b += (long) iY;
        int i7 = sampleExtrasHolder.f6437a - iY;
        sampleExtrasHolder.f6437a = i7;
        ByteBuffer byteBuffer = decoderInputBuffer.h0;
        if (byteBuffer == null || byteBuffer.capacity() < i7) {
            decoderInputBuffer.h0 = ByteBuffer.allocate(i7);
        } else {
            decoderInputBuffer.h0.clear();
        }
        return c(allocationNodeC, sampleExtrasHolder.f6438b, decoderInputBuffer.h0, sampleExtrasHolder.f6437a);
    }

    public final void a(long j) {
        AllocationNode allocationNode;
        if (j == -1) {
            return;
        }
        while (true) {
            allocationNode = this.d;
            if (j < allocationNode.f6421b) {
                break;
            }
            this.f6416a.b(allocationNode.f6422c);
            AllocationNode allocationNode2 = this.d;
            allocationNode2.f6422c = null;
            AllocationNode allocationNode3 = allocationNode2.d;
            allocationNode2.d = null;
            this.d = allocationNode3;
        }
        if (this.f6419e.f6420a < allocationNode.f6420a) {
            this.f6419e = allocationNode;
        }
    }

    public final int b(int i2) {
        AllocationNode allocationNode = this.f;
        if (allocationNode.f6422c == null) {
            Allocation allocationAllocate = this.f6416a.allocate();
            AllocationNode allocationNode2 = new AllocationNode(this.f.f6421b, this.f6417b);
            allocationNode.f6422c = allocationAllocate;
            allocationNode.d = allocationNode2;
        }
        return Math.min(i2, (int) (this.f.f6421b - this.g));
    }
}
