package com.facebook.ads.redexgen.core;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.util.Pair;
import android.view.Surface;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public interface B0 {
    @MetaExoPlayerCustomization("No longer in upstream exo")
    void A58(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i2, Object obj);

    int A5s();

    int A5u(MediaCodec.BufferInfo bufferInfo);

    ByteBuffer A8J(int i2);

    ByteBuffer A8e(int i2);

    MediaFormat A8f();

    @MetaExoPlayerCustomization("Added in D39791066")
    Pair<Long, Integer> A8j();

    @MetaExoPlayerCustomization("Added in D39791066")
    int A9K();

    void AHI(int i2, int i3, int i4, long j, int i5);

    void AHK(int i2, int i3, C11375z c11375z, long j, int i4);

    void AHb();

    void AHh(int i2, long j);

    void AHi(int i2, boolean z2);

    void AJa(InterfaceC1251Az interfaceC1251Az, Handler handler);

    void AJb(Surface surface);

    void AJs(int i2);

    void flush();

    @MetaExoPlayerCustomization("No longer in upstream exo")
    @Deprecated
    void reset();

    @MetaExoPlayerCustomization("No longer in upstream exo")
    void start();

    @MetaExoPlayerCustomization("No longer in upstream exo")
    @Deprecated
    void stop();
}
