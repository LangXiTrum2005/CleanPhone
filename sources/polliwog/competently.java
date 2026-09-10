package polliwog;

import com.inmobi.media.core.config.models.AdConfig;
import cybernatic.monoploid;
import java.io.IOException;

/* JADX INFO: compiled from: VarintReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class competently {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final long[] f35429wireman = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final byte[] f35430attabal = new byte[8];

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f35431dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int f35432saneness;

    public static long attabal(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~f35429wireman[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    public static int dern(int i) {
        int i2 = 0;
        while (true) {
            long[] jArr = f35429wireman;
            if (i2 >= jArr.length) {
                return -1;
            }
            if ((jArr[i2] & ((long) i)) != 0) {
                return i2 + 1;
            }
            i2++;
        }
    }

    public void marial() {
        this.f35432saneness = 0;
        this.f35431dern = 0;
    }

    public int saneness() {
        return this.f35431dern;
    }

    public long wireman(monoploid monoploidVar, boolean z, boolean z2, int i) throws IOException {
        if (this.f35432saneness == 0) {
            if (!monoploidVar.readFully(this.f35430attabal, 0, 1, z)) {
                return -1L;
            }
            int iDern = dern(this.f35430attabal[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            this.f35431dern = iDern;
            if (iDern == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f35432saneness = 1;
        }
        int i2 = this.f35431dern;
        if (i2 > i) {
            this.f35432saneness = 0;
            return -2L;
        }
        if (i2 != 1) {
            monoploidVar.readFully(this.f35430attabal, 1, i2 - 1);
        }
        this.f35432saneness = 0;
        return attabal(this.f35430attabal, this.f35431dern, z2);
    }
}
