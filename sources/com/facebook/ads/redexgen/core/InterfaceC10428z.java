package com.facebook.ads.redexgen.core;

import android.media.AudioDeviceInfo;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC10428z {
    void A59(C2691qI c2691qI, int i, int[] iArr) throws C10378s;

    void A5z();

    void A6M();

    void A6T();

    long A7f(boolean z);

    C2670px A8m();

    boolean A9e(ByteBuffer byteBuffer, long j, int i) throws C10418y, C10388t;

    void A9h();

    boolean A9o();

    boolean AAP();

    void AH0();

    void AH2() throws C10418y;

    void AJG(C2697qQ c2697qQ);

    void AJH(int i);

    void AJI(AnonymousClass21 anonymousClass21);

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "Enable Retry Audio Track")
    void AJQ(boolean z);

    void AJV(InterfaceC10398v interfaceC10398v);

    void AJd(C2670px c2670px);

    void AJg(C8O c8o);

    void AJi(AudioDeviceInfo audioDeviceInfo);

    void AJo(boolean z);

    boolean AKN(C2691qI c2691qI);

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Old API that can be removed when we move to MediaCodecRenderer2")
    boolean AKP(int i, int i2);

    void flush();

    void pause();

    void setVolume(float f);
}
