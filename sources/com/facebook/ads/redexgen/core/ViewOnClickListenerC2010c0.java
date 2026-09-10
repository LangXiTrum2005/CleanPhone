package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2010c0 implements View.OnClickListener {
    public static byte[] A01;
    public static String[] A02 = {"aUyhDgZzCxx0Fo0aLoCtiuJX5lt1Em7h", "IU9gnqoqDa2n7WEe3wiWby57KruBSWfN", "57fa1VpsBY39tHMgQ3Qgx4ZAKOvpZO", "l1cFWBsWpb1xIqaJVfDZzdeVbcwmQJ4W", "uLRqkE9KSQI", "XsB4rZ8TcHUkKOxnTnbB33RXLsHLV", "pJcUqIp9KWRXB2hM3LzKI8otqYa3cTkH", "iQ2u1wDEylPYZ9kZrZj99NoP6udHs7RH"};
    public final /* synthetic */ KZ A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 51);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-85, -81, -93, -87, -89};
        if (A02[0].charAt(22) == '9') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[6] = "S9ialwmDFK349gex3NgP3vDabM3jB4SC";
        strArr[1] = "CB0B92gOKY82Q5M73UaMoIgaE8byLodA";
        A01 = bArr;
    }

    static {
        A01();
    }

    public ViewOnClickListenerC2010c0(KZ kz) {
        this.A00 = kz;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.getCtaButton().A0E(A00(0, 5, 15));
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
