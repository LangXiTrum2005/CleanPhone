package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC1238Hd {
    void A6e(C2691qI c2691qI);

    int AIp(InterfaceC08712c interfaceC08712c, int i, boolean z) throws IOException;

    int AIq(InterfaceC08712c interfaceC08712c, int i, boolean z, int i2) throws IOException;

    void AIr(C09384v c09384v, int i);

    void AIs(C09384v c09384v, int i, int i2);

    void AIu(long j, int i, int i2, int i3, C1236Hb c1236Hb);

    @MetaExoPlayerCustomization("New Meta API")
    void AKf(Uri uri);
}
