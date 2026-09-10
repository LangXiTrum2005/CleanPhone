package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
public class MediaCodecDecoderException extends DecoderException {
    public final String X;

    public MediaCodecDecoderException(IllegalStateException illegalStateException, MediaCodecInfo mediaCodecInfo) {
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        String diagnosticInfo = null;
        sb.append(mediaCodecInfo == null ? null : mediaCodecInfo.f18170a);
        super(sb.toString(), illegalStateException);
        if (Util.f18979a >= 21 && (illegalStateException instanceof MediaCodec.CodecException)) {
            diagnosticInfo = ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.X = diagnosticInfo;
    }
}
