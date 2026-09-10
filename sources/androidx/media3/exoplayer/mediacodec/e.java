package androidx.media3.exoplayer.mediacodec;

import androidx.media3.common.Format;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements MediaCodecUtil.ScoreProvider {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Format f6322b;

    public /* synthetic */ e(Format format) {
        this.f6322b = format;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.ScoreProvider
    public final int a(Object obj) {
        MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) obj;
        Pattern pattern = MediaCodecUtil.f6305a;
        mediaCodecInfo.getClass();
        Format format = this.f6322b;
        String str = format.m;
        String str2 = mediaCodecInfo.f6293b;
        return ((str2.equals(str) || str2.equals(MediaCodecUtil.b(format))) && mediaCodecInfo.c(format, false)) ? 1 : 0;
    }
}
