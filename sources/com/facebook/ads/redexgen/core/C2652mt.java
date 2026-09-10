package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2652mt implements InterfaceC1407Hd {
    public final byte[] A00 = new byte[4096];

    @Override // com.facebook.ads.redexgen.core.InterfaceC1407Hd
    public final /* synthetic */ int AIp(InterfaceC10402c interfaceC10402c, int i2, boolean z2) {
        return AbstractC1404Ha.A00(this, interfaceC10402c, i2, z2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1407Hd
    public final /* synthetic */ void AIr(C11074v c11074v, int i2) {
        AbstractC1404Ha.A01(this, c11074v, i2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1407Hd
    public final void A6e(C2860qI c2860qI) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1407Hd
    public final int AIq(InterfaceC10402c interfaceC10402c, int i2, boolean z2, int i3) throws IOException {
        int bytesSkipped = interfaceC10402c.read(this.A00, 0, Math.min(this.A00.length, i2));
        if (bytesSkipped == -1) {
            if (z2) {
                return -1;
            }
            throw new EOFException();
        }
        return bytesSkipped;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1407Hd
    public final void AIs(C11074v c11074v, int i2, int i3) {
        c11074v.A0g(i2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1407Hd
    public final void AIu(long j, int i2, int i3, int i4, C1405Hb c1405Hb) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1407Hd
    @MetaExoPlayerCustomization("New API added for Meta")
    public final void AKf(Uri uri) {
    }
}
