package androidx.media3.exoplayer.mediacodec;

import android.os.Bundle;
import androidx.media3.decoder.CryptoInfo;

/* JADX INFO: loaded from: classes.dex */
interface MediaCodecBufferEnqueuer {
    void a(Bundle bundle);

    void b(int i2, int i3, int i4, long j);

    void c();

    void d(int i2, CryptoInfo cryptoInfo, long j, int i3);

    void flush();

    void shutdown();

    void start();
}
