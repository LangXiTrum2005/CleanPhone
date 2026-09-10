package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class FlacMetadataReader {

    public static final class FlacStreamMetadataHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public FlacStreamMetadata f17534a;
    }

    public static FlacStreamMetadata.SeekTable a(ParsableByteArray parsableByteArray) {
        parsableByteArray.G(1);
        int iW = parsableByteArray.w();
        long j = ((long) parsableByteArray.f18957b) + ((long) iW);
        int i2 = iW / 18;
        long[] jArrCopyOf = new long[i2];
        long[] jArrCopyOf2 = new long[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            long jO = parsableByteArray.o();
            if (jO == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i3);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i3);
                break;
            }
            jArrCopyOf[i3] = jO;
            jArrCopyOf2[i3] = parsableByteArray.o();
            parsableByteArray.G(2);
        }
        parsableByteArray.G((int) (j - ((long) parsableByteArray.f18957b)));
        return new FlacStreamMetadata.SeekTable(jArrCopyOf, jArrCopyOf2);
    }
}
