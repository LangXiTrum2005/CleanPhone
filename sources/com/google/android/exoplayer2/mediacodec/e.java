package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.Format;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements MediaCodecUtil.ScoreProvider {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Format f18196b;

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.ScoreProvider
    public final int a(Object obj) {
        MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) obj;
        Pattern pattern = MediaCodecUtil.f18180a;
        mediaCodecInfo.getClass();
        Format format = this.f18196b;
        String str = format.m0;
        String str2 = mediaCodecInfo.f18171b;
        return ((str2.equals(str) || str2.equals(MediaCodecUtil.b(format))) && mediaCodecInfo.c(format, false)) ? 1 : 0;
    }
}
