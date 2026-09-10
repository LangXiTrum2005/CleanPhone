package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultMediaCodecAdapterFactory implements MediaCodecAdapter.Factory {
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Factory
    public final MediaCodecAdapter a(MediaCodecAdapter.Configuration configuration) {
        int i2 = Util.f18979a;
        if (i2 < 23 || i2 < 31) {
            return new SynchronousMediaCodecAdapter.Factory().a(configuration);
        }
        int iF = MimeTypes.f(configuration.f18168c.m0);
        Log.f("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + Util.w(iF));
        return new AsynchronousMediaCodecAdapter.Factory(iF).a(configuration);
    }
}
