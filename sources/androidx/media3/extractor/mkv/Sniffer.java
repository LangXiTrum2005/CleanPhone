package androidx.media3.extractor.mkv;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.DefaultExtractorInput;
import com.inmobi.commons.core.configs.AdConfig;

/* JADX INFO: loaded from: classes.dex */
final class Sniffer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParsableByteArray f7023a = new ParsableByteArray(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7024b;

    public final long a(DefaultExtractorInput defaultExtractorInput) {
        ParsableByteArray parsableByteArray = this.f7023a;
        int i2 = 0;
        defaultExtractorInput.peekFully(parsableByteArray.f5667a, 0, 1, false);
        int i3 = parsableByteArray.f5667a[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (i3 == 0) {
            return Long.MIN_VALUE;
        }
        int i4 = 128;
        int i5 = 0;
        while ((i3 & i4) == 0) {
            i4 >>= 1;
            i5++;
        }
        int i6 = i3 & (~i4);
        defaultExtractorInput.peekFully(parsableByteArray.f5667a, 1, i5, false);
        while (i2 < i5) {
            i2++;
            i6 = (parsableByteArray.f5667a[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) + (i6 << 8);
        }
        this.f7024b = i5 + 1 + this.f7024b;
        return i6;
    }
}
