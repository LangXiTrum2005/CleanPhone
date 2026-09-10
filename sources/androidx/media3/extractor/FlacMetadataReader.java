package androidx.media3.extractor;

import androidx.media3.common.util.ParsableByteArray;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class FlacMetadataReader {

    public static final class FlacStreamMetadataHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public FlacStreamMetadata f6758a;
    }

    public static FlacStreamMetadata.SeekTable a(ParsableByteArray parsableByteArray) {
        parsableByteArray.H(1);
        int iX = parsableByteArray.x();
        long j = ((long) parsableByteArray.f5668b) + ((long) iX);
        int i2 = iX / 18;
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
            parsableByteArray.H(2);
        }
        parsableByteArray.H((int) (j - ((long) parsableByteArray.f5668b)));
        return new FlacStreamMetadata.SeekTable(jArrCopyOf, jArrCopyOf2);
    }
}
