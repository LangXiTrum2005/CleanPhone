package com.google.android.gms.internal.ads;

import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zztz implements LoudnessCodecController$OnLoudnessCodecUpdateListener {
    public zztz(zzuc zzucVar) {
        Objects.requireNonNull(zzucVar);
    }

    public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
        return bundle;
    }
}
