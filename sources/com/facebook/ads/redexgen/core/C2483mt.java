package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2483mt implements InterfaceC1238Hd {
    public final byte[] A00 = new byte[4096];

    @Override // com.facebook.ads.redexgen.core.InterfaceC1238Hd
    public final /* synthetic */ int AIp(InterfaceC08712c interfaceC08712c, int i, boolean z) {
        return AbstractC1235Ha.A00(this, interfaceC08712c, i, z);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1238Hd
    public final /* synthetic */ void AIr(C09384v c09384v, int i) {
        AbstractC1235Ha.A01(this, c09384v, i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1238Hd
    public final void A6e(C2691qI c2691qI) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1238Hd
    public final int AIq(InterfaceC08712c interfaceC08712c, int i, boolean z, int i2) throws IOException {
        int bytesSkipped = interfaceC08712c.read(this.A00, 0, Math.min(this.A00.length, i));
        if (bytesSkipped == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return bytesSkipped;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1238Hd
    public final void AIs(C09384v c09384v, int i, int i2) {
        c09384v.A0g(i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1238Hd
    public final void AIu(long j, int i, int i2, int i3, C1236Hb c1236Hb) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1238Hd
    @MetaExoPlayerCustomization("New API added for Meta")
    public final void AKf(Uri uri) {
    }
}
