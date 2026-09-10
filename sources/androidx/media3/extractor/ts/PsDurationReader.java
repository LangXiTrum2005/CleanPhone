package androidx.media3.extractor.ts;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.DefaultExtractorInput;
import com.inmobi.commons.core.configs.AdConfig;

/* JADX INFO: loaded from: classes.dex */
final class PsDurationReader {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7603c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7604e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimestampAdjuster f7601a = new TimestampAdjuster(0);
    public long f = -9223372036854775807L;
    public long g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f7605h = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParsableByteArray f7602b = new ParsableByteArray();

    public static int b(int i2, byte[] bArr) {
        return (bArr[i2 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i2 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }

    public static long c(ParsableByteArray parsableByteArray) {
        int i2 = parsableByteArray.f5668b;
        if (parsableByteArray.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        parsableByteArray.e(bArr, 0, 9);
        parsableByteArray.G(i2);
        byte b2 = bArr[0];
        if ((b2 & 196) == 68) {
            byte b3 = bArr[2];
            if ((b3 & 4) == 4) {
                byte b4 = bArr[4];
                if ((b4 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b2;
                    long j2 = b3;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b4) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(DefaultExtractorInput defaultExtractorInput) {
        byte[] bArr = Util.f;
        ParsableByteArray parsableByteArray = this.f7602b;
        parsableByteArray.getClass();
        parsableByteArray.E(bArr, bArr.length);
        this.f7603c = true;
        defaultExtractorInput.f = 0;
    }
}
