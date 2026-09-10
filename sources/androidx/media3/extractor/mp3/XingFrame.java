package androidx.media3.extractor.mp3;

import androidx.media3.common.util.Util;
import androidx.media3.extractor.MpegAudioUtil;

/* JADX INFO: loaded from: classes.dex */
final class XingFrame {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MpegAudioUtil.Header f7047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7048b;

    public XingFrame(MpegAudioUtil.Header header, long j, long j2, long[] jArr, int i2, int i3) {
        MpegAudioUtil.Header header2 = new MpegAudioUtil.Header();
        header2.f6789a = header.f6789a;
        header2.f6790b = header.f6790b;
        header2.f6791c = header.f6791c;
        header2.d = header.d;
        header2.f6792e = header.f6792e;
        header2.f = header.f;
        header2.g = header.g;
        this.f7047a = header2;
        this.f7048b = j;
    }

    public final long a() {
        long j = this.f7048b;
        if (j == -1 || j == 0) {
            return -9223372036854775807L;
        }
        MpegAudioUtil.Header header = this.f7047a;
        return Util.M(header.d, (j * ((long) header.g)) - 1);
    }
}
