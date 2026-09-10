package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Metadata;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class HM {
    public final C11074v A00 = new C11074v(10);

    public final Metadata A00(InterfaceC2651ms interfaceC2651ms, IE ie) throws IOException {
        int tagLength = 0;
        Metadata metadataA0S = null;
        while (true) {
            try {
                interfaceC2651ms.AGt(this.A00.A0l(), 0, 10);
                this.A00.A0f(0);
                if (this.A00.A0K() != 4801587) {
                    break;
                }
                this.A00.A0g(3);
                int iA0H = this.A00.A0H();
                int framesLength = iA0H + 10;
                if (metadataA0S == null) {
                    byte[] bArr = new byte[framesLength];
                    System.arraycopy(this.A00.A0l(), 0, bArr, 0, 10);
                    interfaceC2651ms.AGt(bArr, 10, iA0H);
                    metadataA0S = new C9U(ie).A0S(bArr, framesLength);
                } else {
                    interfaceC2651ms.A47(iA0H);
                }
                tagLength += framesLength;
            } catch (EOFException unused) {
            }
        }
        interfaceC2651ms.AIl();
        interfaceC2651ms.A47(tagLength);
        return metadataA0S;
    }
}
