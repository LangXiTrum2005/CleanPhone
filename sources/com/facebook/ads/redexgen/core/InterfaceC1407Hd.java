package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC1407Hd {
    void A6e(C2860qI c2860qI);

    int AIp(InterfaceC10402c interfaceC10402c, int i2, boolean z2) throws IOException;

    int AIq(InterfaceC10402c interfaceC10402c, int i2, boolean z2, int i3) throws IOException;

    void AIr(C11074v c11074v, int i2);

    void AIs(C11074v c11074v, int i2, int i3);

    void AIu(long j, int i2, int i3, int i4, C1405Hb c1405Hb);

    @MetaExoPlayerCustomization("New Meta API")
    void AKf(Uri uri);
}
