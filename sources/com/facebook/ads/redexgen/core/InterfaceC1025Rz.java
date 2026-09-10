package com.facebook.ads.redexgen.core;

import android.media.AudioDeviceInfo;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public interface InterfaceC1025Rz {
    void A4z(ZM zm, int i, int[] iArr) throws C1018Rs;

    void A5p();

    void A6C();

    void A6J();

    long A7V(boolean z);

    C1193Yv A8c();

    boolean A9U(ByteBuffer byteBuffer, long j, int i) throws C1019Rt, C1024Ry;

    void A9X();

    boolean A9e();

    boolean AAE();

    void AG8();

    void AGA() throws C1024Ry;

    void AIM(C1209Zm c1209Zm);

    void AIN(int i);

    void AIO(NY ny);

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "Enable Retry Audio Track")
    void AIW(boolean z);

    void AIb(InterfaceC1021Rv interfaceC1021Rv);

    void AIj(C1193Yv c1193Yv);

    void AIm(RK rk);

    void AIo(AudioDeviceInfo audioDeviceInfo);

    void AIu(boolean z);

    boolean AJS(ZM zm);

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Old API that can be removed when we move to MediaCodecRenderer2")
    boolean AJU(int i, int i2);

    void flush();

    void pause();

    void setVolume(float f);
}
