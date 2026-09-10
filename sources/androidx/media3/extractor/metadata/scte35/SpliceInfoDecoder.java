package androidx.media3.extractor.metadata.scte35;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.extractor.metadata.MetadataInputBuffer;
import androidx.media3.extractor.metadata.SimpleMetadataDecoder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SpliceInfoDecoder extends SimpleMetadataDecoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParsableByteArray f6947a = new ParsableByteArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParsableBitArray f6948b = new ParsableBitArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TimestampAdjuster f6949c;

    /* JADX WARN: Code duplicated, block: B:14:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.extractor.metadata.SimpleMetadataDecoder
    public final Metadata b(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer) {
        int i2;
        Metadata.Entry spliceNullCommand;
        int i3;
        long j;
        int i4;
        long j2;
        long j3;
        boolean z2;
        boolean z3;
        boolean z4;
        int iA;
        int iU;
        int iU2;
        long jW;
        int i5;
        List list;
        long j4;
        long j5;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i6;
        int i7;
        int iU3;
        long j6;
        boolean z9;
        long j7;
        int i8 = 1;
        TimestampAdjuster timestampAdjuster = this.f6949c;
        if (timestampAdjuster != null) {
            long j8 = metadataInputBuffer.j0;
            synchronized (timestampAdjuster) {
                j7 = timestampAdjuster.f5681b;
            }
            if (j8 != j7) {
                TimestampAdjuster timestampAdjuster2 = new TimestampAdjuster(metadataInputBuffer.g0);
                this.f6949c = timestampAdjuster2;
                timestampAdjuster2.a(metadataInputBuffer.g0 - metadataInputBuffer.j0);
            }
        } else {
            TimestampAdjuster timestampAdjuster3 = new TimestampAdjuster(metadataInputBuffer.g0);
            this.f6949c = timestampAdjuster3;
            timestampAdjuster3.a(metadataInputBuffer.g0 - metadataInputBuffer.j0);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        ParsableByteArray parsableByteArray = this.f6947a;
        parsableByteArray.E(bArrArray, iLimit);
        ParsableBitArray parsableBitArray = this.f6948b;
        parsableBitArray.l(bArrArray, iLimit);
        parsableBitArray.o(39);
        long jG = (((long) parsableBitArray.g(1)) << 32) | ((long) parsableBitArray.g(32));
        parsableBitArray.o(20);
        int iG = parsableBitArray.g(12);
        int iG2 = parsableBitArray.g(8);
        parsableByteArray.H(14);
        if (iG2 == 0) {
            i2 = 1;
            spliceNullCommand = new SpliceNullCommand();
        } else if (iG2 != 255) {
            long j9 = 1;
            long jW2 = -9223372036854775807L;
            if (iG2 == 4) {
                int iU4 = parsableByteArray.u();
                ArrayList arrayList = new ArrayList(iU4);
                int i9 = 0;
                while (i9 < iU4) {
                    long jW3 = parsableByteArray.w();
                    boolean z10 = (parsableByteArray.u() & 128) != 0 ? i8 : 0;
                    ArrayList arrayList2 = new ArrayList();
                    if (z10 == 0) {
                        int iU5 = parsableByteArray.u();
                        int i10 = (iU5 & 128) != 0 ? i8 : 0;
                        int i11 = (iU5 & 64) != 0 ? i8 : 0;
                        int i12 = (iU5 & 32) != 0 ? i8 : 0;
                        long jW4 = i11 != 0 ? parsableByteArray.w() : -9223372036854775807L;
                        if (i11 == 0) {
                            int iU6 = parsableByteArray.u();
                            ArrayList arrayList3 = new ArrayList(iU6);
                            int i13 = 0;
                            while (i13 < iU6) {
                                arrayList3.add(new SpliceScheduleCommand.ComponentSplice(parsableByteArray.u(), parsableByteArray.w()));
                                i13++;
                                i9 = i9;
                                j9 = j9;
                                i8 = i8;
                            }
                            arrayList2 = arrayList3;
                        }
                        i3 = i8;
                        j = j9;
                        i4 = i9;
                        if (i12 != 0) {
                            long jU = parsableByteArray.u();
                            i5 = (jU & 128) != 0 ? i3 : 0;
                            jW = ((((jU & j) << 32) | parsableByteArray.w()) * 1000) / 90;
                        } else {
                            jW = -9223372036854775807L;
                            i5 = 0;
                        }
                        z4 = i5;
                        j3 = jW;
                        iA = parsableByteArray.A();
                        z2 = i10;
                        z3 = i11;
                        j2 = jW4;
                        iU = parsableByteArray.u();
                        iU2 = parsableByteArray.u();
                    } else {
                        i3 = i8;
                        j = j9;
                        i4 = i9;
                        j2 = -9223372036854775807L;
                        j3 = -9223372036854775807L;
                        z2 = 0;
                        z3 = 0;
                        z4 = 0;
                        iA = 0;
                        iU = 0;
                        iU2 = 0;
                    }
                    arrayList.add(new SpliceScheduleCommand.Event(jW3, z10, z2, z3, arrayList2, j2, z4, j3, iA, iU, iU2));
                    i9 = i4 + 1;
                    j9 = j;
                    i8 = i3;
                }
                i2 = i8;
                spliceNullCommand = new SpliceScheduleCommand(arrayList);
            } else if (iG2 != 5) {
                if (iG2 != 6) {
                    spliceNullCommand = null;
                } else {
                    TimestampAdjuster timestampAdjuster4 = this.f6949c;
                    long jA = TimeSignalCommand.a(jG, parsableByteArray);
                    spliceNullCommand = new TimeSignalCommand(jA, timestampAdjuster4.b(jA));
                }
                i2 = 1;
            } else {
                TimestampAdjuster timestampAdjuster5 = this.f6949c;
                long jW5 = parsableByteArray.w();
                boolean z11 = (parsableByteArray.u() & 128) != 0;
                List list2 = Collections.EMPTY_LIST;
                if (z11) {
                    list = list2;
                    j4 = -9223372036854775807L;
                    j5 = -9223372036854775807L;
                    z5 = false;
                    z6 = false;
                    z7 = false;
                    z8 = false;
                    i6 = 0;
                    i7 = 0;
                    iU3 = 0;
                } else {
                    int iU7 = parsableByteArray.u();
                    boolean z12 = (iU7 & 128) != 0;
                    boolean z13 = (iU7 & 64) != 0;
                    boolean z14 = (iU7 & 32) != 0;
                    boolean z15 = (iU7 & 16) != 0;
                    long jA2 = (!z13 || z15) ? -9223372036854775807L : TimeSignalCommand.a(jG, parsableByteArray);
                    if (z13) {
                        j6 = 90;
                    } else {
                        int iU8 = parsableByteArray.u();
                        ArrayList arrayList4 = new ArrayList(iU8);
                        j6 = 90;
                        for (int i14 = 0; i14 < iU8; i14++) {
                            int iU9 = parsableByteArray.u();
                            long jA3 = !z15 ? TimeSignalCommand.a(jG, parsableByteArray) : -9223372036854775807L;
                            arrayList4.add(new SpliceInsertCommand.ComponentSplice(iU9, jA3, timestampAdjuster5.b(jA3)));
                        }
                        list2 = arrayList4;
                    }
                    if (z14) {
                        long jU2 = parsableByteArray.u();
                        z9 = (jU2 & 128) != 0;
                        jW2 = ((((jU2 & 1) << 32) | parsableByteArray.w()) * 1000) / j6;
                    } else {
                        z9 = false;
                    }
                    int iA2 = parsableByteArray.A();
                    int iU10 = parsableByteArray.u();
                    z8 = z9;
                    list = list2;
                    iU3 = parsableByteArray.u();
                    i6 = iA2;
                    i7 = iU10;
                    z5 = z12;
                    j5 = jW2;
                    j4 = jA2;
                    z7 = z15;
                    z6 = z13;
                }
                i2 = 1;
                spliceNullCommand = new SpliceInsertCommand(jW5, z11, z5, z6, z7, j4, timestampAdjuster5.b(j4), list, z8, j5, i6, i7, iU3);
            }
        } else {
            i2 = 1;
            long jW6 = parsableByteArray.w();
            int i15 = iG - 4;
            byte[] bArr = new byte[i15];
            parsableByteArray.e(bArr, 0, i15);
            spliceNullCommand = new PrivateCommand(jW6, bArr, jG);
        }
        if (spliceNullCommand == null) {
            return new Metadata(new Metadata.Entry[0]);
        }
        Metadata.Entry[] entryArr = new Metadata.Entry[i2];
        entryArr[0] = spliceNullCommand;
        return new Metadata(entryArr);
    }
}
