package com.facebook.ads.redexgen.core;

import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1547fN implements InterfaceC0746Gq {
    public static byte[] A01;
    public static String[] A02 = {"j0Llx0J1MSgFmdDCajgZS", "WqPPZqRc0dX4AocYH9RDHKNy8FKfctFv", "x4SSjhhb9i0sKdnf0Wf5s", "xtX3gCAokrJDAeXWoUYA8plxhmXwCeOm", "uRKBJqZuIeGTpbClJ99Pe9ZmQekDyja2", "rD1ESZhEMARN2moY0NiI8P2eIcx2KKt8", "vMF11DxP2anc735da3YXnRmNGLge", "xeUiMncNmqcgkFgn7eafy8FxNu3C"};
    public final /* synthetic */ LI A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A02;
            if (strArr[2].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[6] = "mcgN6rOfJkIrJEn9BPtko0s6E0JP";
            strArr2[7] = "7NujJgKdrQLNFT4Mmbwt8V3uSlrM";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 20);
            i4++;
        }
    }

    public static void A01() {
        A01 = new byte[]{47, 46, 88, 27, 10, 25, 11, cw.n, 29, 28, 28, cw.l, 9, 52, 29, 2, cw.l, 28};
    }

    static {
        A01();
    }

    public C1547fN(LI li) {
        this.A00 = li;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0746Gq
    public final void AEf() {
        C1827k0 context = AnonymousClass84.A00();
        if (context != null) {
            context.A08().AAu(A00(10, 8, EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE), AbstractC05418a.A2g, new C05428b(A00(0, 10, 108)));
        }
    }
}
