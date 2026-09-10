package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.util.Util;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements MediaCodecUtil.ScoreProvider, MediaCodecSelector {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18195b;

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.ScoreProvider
    public int a(Object obj) {
        MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) obj;
        switch (this.f18195b) {
            case 0:
                Pattern pattern = MediaCodecUtil.f18180a;
                String str = mediaCodecInfo.f18170a;
                if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
                    return 1;
                }
                return (Util.f18979a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
            default:
                Pattern pattern2 = MediaCodecUtil.f18180a;
                return mediaCodecInfo.f18170a.startsWith("OMX.google") ? 1 : 0;
        }
    }
}
