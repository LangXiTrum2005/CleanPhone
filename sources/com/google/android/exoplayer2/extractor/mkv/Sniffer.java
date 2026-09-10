package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.inmobi.commons.core.configs.AdConfig;

/* JADX INFO: loaded from: classes3.dex */
final class Sniffer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParsableByteArray f17725a = new ParsableByteArray(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17726b;

    public final long a(DefaultExtractorInput defaultExtractorInput) {
        ParsableByteArray parsableByteArray = this.f17725a;
        int i2 = 0;
        defaultExtractorInput.peekFully(parsableByteArray.f18956a, 0, 1, false);
        int i3 = parsableByteArray.f18956a[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
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
        defaultExtractorInput.peekFully(parsableByteArray.f18956a, 1, i5, false);
        while (i2 < i5) {
            i2++;
            i6 = (parsableByteArray.f18956a[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) + (i6 << 8);
        }
        this.f17726b = i5 + 1 + this.f17726b;
        return i6;
    }
}
