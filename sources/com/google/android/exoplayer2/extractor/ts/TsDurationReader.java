package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
final class TsDurationReader {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18074c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18075e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimestampAdjuster f18072a = new TimestampAdjuster(0);
    public long f = -9223372036854775807L;
    public long g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f18076h = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParsableByteArray f18073b = new ParsableByteArray();

    public final void a(DefaultExtractorInput defaultExtractorInput) {
        byte[] bArr = Util.f;
        ParsableByteArray parsableByteArray = this.f18073b;
        parsableByteArray.getClass();
        parsableByteArray.D(bArr, bArr.length);
        this.f18074c = true;
        defaultExtractorInput.f = 0;
    }
}
