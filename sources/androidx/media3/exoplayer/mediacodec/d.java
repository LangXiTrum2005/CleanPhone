package androidx.media3.exoplayer.mediacodec;

import androidx.media3.common.util.Util;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements MediaCodecUtil.ScoreProvider, MediaCodecSelector {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6321b;

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.ScoreProvider
    public int a(Object obj) {
        MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) obj;
        switch (this.f6321b) {
            case 0:
                Pattern pattern = MediaCodecUtil.f6305a;
                String str = mediaCodecInfo.f6292a;
                if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
                    return 1;
                }
                return (Util.f5683a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
            default:
                Pattern pattern2 = MediaCodecUtil.f6305a;
                return mediaCodecInfo.f6292a.startsWith("OMX.google") ? 1 : 0;
        }
    }
}
