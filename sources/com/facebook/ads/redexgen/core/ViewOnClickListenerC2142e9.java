package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.e9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2142e9 implements View.OnClickListener {
    public static byte[] A01;
    public static String[] A02 = {"G2UpIRG7nHrOr90n", "kYhtZYHz7C3TU0WVzw0hA6O", "uW0OSEs2O", "98fx3b2TZyak0tYZ", "bs30TCHyJSAD4FU59WYQYpULQNB9Thj8", "Z9AhNL9JKwL2XNGWvK18w1A8N2mtiW", "DrOsL5ff6T5Di1pSQXw1oWhHj1xrfAsq", "4UtMvRkaUwptTB"};
    public final /* synthetic */ C4T A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            byte b2 = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 45);
            if (A02[6].charAt(5) == 'o') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[2] = "wiUvRTIpL";
            strArr[5] = "IscvqafGu8CzUXymljnx6wLgaNtEmJ";
            bArrCopyOfRange[i5] = b2;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{AbstractJsonLexerKt.TC_INVALID, 114, 118, 115, 114, 101};
    }

    static {
        A01();
    }

    public ViewOnClickListenerC2142e9(C4T c4t) {
        this.A00 = c4t;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A02(A00(0, 6, 58));
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
