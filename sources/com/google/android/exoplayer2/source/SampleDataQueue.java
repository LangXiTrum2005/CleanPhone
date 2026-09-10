package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.decoder.CryptoInfo;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.upstream.Allocation;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
class SampleDataQueue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Allocator f18380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ParsableByteArray f18382c;
    public AllocationNode d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AllocationNode f18383e;
    public AllocationNode f;
    public long g;

    public static final class AllocationNode implements Allocator.AllocationNode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f18384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f18385b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Allocation f18386c;
        public AllocationNode d;

        public AllocationNode(long j, int i2) {
            Assertions.d(this.f18386c == null);
            this.f18384a = j;
            this.f18385b = j + ((long) i2);
        }

        @Override // com.google.android.exoplayer2.upstream.Allocator.AllocationNode
        public final Allocation a() {
            Allocation allocation = this.f18386c;
            allocation.getClass();
            return allocation;
        }

        @Override // com.google.android.exoplayer2.upstream.Allocator.AllocationNode
        public final Allocator.AllocationNode next() {
            AllocationNode allocationNode = this.d;
            if (allocationNode == null || allocationNode.f18386c == null) {
                return null;
            }
            return allocationNode;
        }
    }

    public SampleDataQueue(Allocator allocator) {
        this.f18380a = allocator;
        int individualAllocationLength = allocator.getIndividualAllocationLength();
        this.f18381b = individualAllocationLength;
        this.f18382c = new ParsableByteArray(32);
        AllocationNode allocationNode = new AllocationNode(0L, individualAllocationLength);
        this.d = allocationNode;
        this.f18383e = allocationNode;
        this.f = allocationNode;
    }

    public static AllocationNode c(AllocationNode allocationNode, long j, ByteBuffer byteBuffer, int i2) {
        while (j >= allocationNode.f18385b) {
            allocationNode = allocationNode.d;
        }
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (allocationNode.f18385b - j));
            Allocation allocation = allocationNode.f18386c;
            byteBuffer.put(allocation.f18721a, ((int) (j - allocationNode.f18384a)) + allocation.f18722b, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == allocationNode.f18385b) {
                allocationNode = allocationNode.d;
            }
        }
        return allocationNode;
    }

    public static AllocationNode d(AllocationNode allocationNode, long j, byte[] bArr, int i2) {
        while (j >= allocationNode.f18385b) {
            allocationNode = allocationNode.d;
        }
        int i3 = i2;
        while (i3 > 0) {
            int iMin = Math.min(i3, (int) (allocationNode.f18385b - j));
            Allocation allocation = allocationNode.f18386c;
            System.arraycopy(allocation.f18721a, ((int) (j - allocationNode.f18384a)) + allocation.f18722b, bArr, i2 - i3, iMin);
            i3 -= iMin;
            j += (long) iMin;
            if (j == allocationNode.f18385b) {
                allocationNode = allocationNode.d;
            }
        }
        return allocationNode;
    }

    public static AllocationNode e(AllocationNode allocationNode, DecoderInputBuffer decoderInputBuffer, SampleQueue.SampleExtrasHolder sampleExtrasHolder, ParsableByteArray parsableByteArray) {
        AllocationNode allocationNodeD;
        int iZ;
        if (decoderInputBuffer.b(1073741824)) {
            long j = sampleExtrasHolder.f18402b;
            parsableByteArray.C(1);
            AllocationNode allocationNodeD2 = d(allocationNode, j, parsableByteArray.f18956a, 1);
            long j2 = j + 1;
            byte b2 = parsableByteArray.f18956a[0];
            boolean z2 = (b2 & 128) != 0;
            int i2 = b2 & AbstractJsonLexerKt.TC_INVALID;
            CryptoInfo cryptoInfo = decoderInputBuffer.f17433Y;
            byte[] bArr = cryptoInfo.f17418a;
            if (bArr == null) {
                cryptoInfo.f17418a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            allocationNodeD = d(allocationNodeD2, j2, cryptoInfo.f17418a, i2);
            long j3 = j2 + ((long) i2);
            if (z2) {
                parsableByteArray.C(2);
                allocationNodeD = d(allocationNodeD, j3, parsableByteArray.f18956a, 2);
                j3 += 2;
                iZ = parsableByteArray.z();
            } else {
                iZ = 1;
            }
            int[] iArr = cryptoInfo.d;
            if (iArr == null || iArr.length < iZ) {
                iArr = new int[iZ];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = cryptoInfo.f17421e;
            if (iArr3 == null || iArr3.length < iZ) {
                iArr3 = new int[iZ];
            }
            int[] iArr4 = iArr3;
            if (z2) {
                int i3 = iZ * 6;
                parsableByteArray.C(i3);
                allocationNodeD = d(allocationNodeD, j3, parsableByteArray.f18956a, i3);
                j3 += (long) i3;
                parsableByteArray.F(0);
                for (int i4 = 0; i4 < iZ; i4++) {
                    iArr2[i4] = parsableByteArray.z();
                    iArr4[i4] = parsableByteArray.x();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = sampleExtrasHolder.f18401a - ((int) (j3 - sampleExtrasHolder.f18402b));
            }
            TrackOutput.CryptoData cryptoData = sampleExtrasHolder.f18403c;
            int i5 = Util.f18979a;
            cryptoInfo.a(iZ, iArr2, iArr4, cryptoData.f17563b, cryptoInfo.f17418a, cryptoData.f17562a, cryptoData.f17564c, cryptoData.d);
            long j4 = sampleExtrasHolder.f18402b;
            int i6 = (int) (j3 - j4);
            sampleExtrasHolder.f18402b = j4 + ((long) i6);
            sampleExtrasHolder.f18401a -= i6;
        } else {
            allocationNodeD = allocationNode;
        }
        if (!decoderInputBuffer.b(268435456)) {
            decoderInputBuffer.g(sampleExtrasHolder.f18401a);
            return c(allocationNodeD, sampleExtrasHolder.f18402b, decoderInputBuffer.Z, sampleExtrasHolder.f18401a);
        }
        parsableByteArray.C(4);
        AllocationNode allocationNodeD3 = d(allocationNodeD, sampleExtrasHolder.f18402b, parsableByteArray.f18956a, 4);
        int iX = parsableByteArray.x();
        sampleExtrasHolder.f18402b += 4;
        sampleExtrasHolder.f18401a -= 4;
        decoderInputBuffer.g(iX);
        AllocationNode allocationNodeC = c(allocationNodeD3, sampleExtrasHolder.f18402b, decoderInputBuffer.Z, iX);
        sampleExtrasHolder.f18402b += (long) iX;
        int i7 = sampleExtrasHolder.f18401a - iX;
        sampleExtrasHolder.f18401a = i7;
        ByteBuffer byteBuffer = decoderInputBuffer.g0;
        if (byteBuffer == null || byteBuffer.capacity() < i7) {
            decoderInputBuffer.g0 = ByteBuffer.allocate(i7);
        } else {
            decoderInputBuffer.g0.clear();
        }
        return c(allocationNodeC, sampleExtrasHolder.f18402b, decoderInputBuffer.g0, sampleExtrasHolder.f18401a);
    }

    public final void a(long j) {
        AllocationNode allocationNode;
        if (j == -1) {
            return;
        }
        while (true) {
            allocationNode = this.d;
            if (j < allocationNode.f18385b) {
                break;
            }
            this.f18380a.b(allocationNode.f18386c);
            AllocationNode allocationNode2 = this.d;
            allocationNode2.f18386c = null;
            AllocationNode allocationNode3 = allocationNode2.d;
            allocationNode2.d = null;
            this.d = allocationNode3;
        }
        if (this.f18383e.f18384a < allocationNode.f18384a) {
            this.f18383e = allocationNode;
        }
    }

    public final int b(int i2) {
        AllocationNode allocationNode = this.f;
        if (allocationNode.f18386c == null) {
            Allocation allocationAllocate = this.f18380a.allocate();
            AllocationNode allocationNode2 = new AllocationNode(this.f.f18385b, this.f18381b);
            allocationNode.f18386c = allocationAllocate;
            allocationNode.d = allocationNode2;
        }
        return Math.min(i2, (int) (this.f.f18385b - this.g));
    }
}
