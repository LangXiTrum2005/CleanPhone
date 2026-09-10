package com.facebook.ads.redexgen.core;

import android.media.AudioDeviceInfo;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC12118z {
    void A59(C2860qI c2860qI, int i2, int[] iArr) throws C12068s;

    void A5z();

    void A6M();

    void A6T();

    long A7f(boolean z2);

    C2839px A8m();

    boolean A9e(ByteBuffer byteBuffer, long j, int i2) throws C12108y, C12078t;

    void A9h();

    boolean A9o();

    boolean AAP();

    void AH0();

    void AH2() throws C12108y;

    void AJG(C2866qQ c2866qQ);

    void AJH(int i2);

    void AJI(AnonymousClass21 anonymousClass21);

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "Enable Retry Audio Track")
    void AJQ(boolean z2);

    void AJV(InterfaceC12088v interfaceC12088v);

    void AJd(C2839px c2839px);

    void AJg(C8O c8o);

    void AJi(AudioDeviceInfo audioDeviceInfo);

    void AJo(boolean z2);

    boolean AKN(C2860qI c2860qI);

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Old API that can be removed when we move to MediaCodecRenderer2")
    boolean AKP(int i2, int i3);

    void flush();

    void pause();

    void setVolume(float f);
}
