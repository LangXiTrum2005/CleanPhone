package androidx.media3.extractor.mkv;

import androidx.media3.extractor.DefaultExtractorInput;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
final class VarintReader {
    public static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f7025a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7027c;

    public static long a(byte[] bArr, int i2, boolean z2) {
        long j = ((long) bArr[0]) & 255;
        if (z2) {
            j &= ~d[i2 - 1];
        }
        for (int i3 = 1; i3 < i2; i3++) {
            j = (j << 8) | (((long) bArr[i3]) & 255);
        }
        return j;
    }

    public static int b(int i2) {
        for (int i3 = 0; i3 < 8; i3++) {
            if ((d[i3] & ((long) i2)) != 0) {
                return i3 + 1;
            }
        }
        return -1;
    }

    public final long c(DefaultExtractorInput defaultExtractorInput, boolean z2, boolean z3, int i2) throws EOFException, InterruptedIOException {
        int i3 = this.f7026b;
        byte[] bArr = this.f7025a;
        if (i3 == 0) {
            if (!defaultExtractorInput.readFully(bArr, 0, 1, z2)) {
                return -1L;
            }
            int iB = b(bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            this.f7027c = iB;
            if (iB == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f7026b = 1;
        }
        int i4 = this.f7027c;
        if (i4 > i2) {
            this.f7026b = 0;
            return -2L;
        }
        if (i4 != 1) {
            defaultExtractorInput.readFully(bArr, 1, i4 - 1, false);
        }
        this.f7026b = 0;
        return a(bArr, this.f7027c, z3);
    }
}
