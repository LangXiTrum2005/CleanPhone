package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1986bc implements View.OnClickListener {
    public static byte[] A01;
    public static String[] A02 = {"fjtAB", "bsaRMRqbX1J53zhFSd", "3x", "d1GXs2u7l6dphEhs75uHz8nXS", "xBLq5iNxiropzdSod3RzWHu9Svz5m1J", "bqiGUlPWwNgoqXE8vIE4LDwWoR3rV8W6", "Cst7knLO4cVZP", "zRpbMV9q"};
    public final /* synthetic */ C6M A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 83);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{115, 119, 123, 125, AbstractJsonLexerKt.TC_INVALID};
    }

    static {
        A01();
    }

    public ViewOnClickListenerC1986bc(C6M c6m) {
        this.A00 = c6m;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.getCtaButton().A0E(A00(0, 5, 73));
        } catch (Throwable th) {
            WU.A00(th, this);
            if (A02[2].length() == 17) {
                throw new RuntimeException();
            }
            A02[0] = "IkNABMfZpUuzelGW3VlRw";
        }
    }
}
