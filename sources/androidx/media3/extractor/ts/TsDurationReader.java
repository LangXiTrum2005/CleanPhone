package androidx.media3.extractor.ts;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.DefaultExtractorInput;

/* JADX INFO: loaded from: classes.dex */
final class TsDurationReader {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7627c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7628e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimestampAdjuster f7625a = new TimestampAdjuster(0);
    public long f = -9223372036854775807L;
    public long g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f7629h = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParsableByteArray f7626b = new ParsableByteArray();

    public final void a(DefaultExtractorInput defaultExtractorInput) {
        byte[] bArr = Util.f;
        ParsableByteArray parsableByteArray = this.f7626b;
        parsableByteArray.getClass();
        parsableByteArray.E(bArr, bArr.length);
        this.f7627c = true;
        defaultExtractorInput.f = 0;
    }
}
