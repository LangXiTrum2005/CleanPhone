package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class ViewOnSystemUiVisibilityChangeListenerC1831Xx implements View.OnSystemUiVisibilityChangeListener {
    public static String[] A05 = {"dzM0rIEz66", "2I5EpQxo3JaAydz5j2evjw", "riIr", "aw8X8aEsXK", "46V10M2ortldVuyFN9G4Mh", "Zv9bhia2uUXHxfPHNrQGPj2Fgj", "UQeU", "fL70pxGMq2jlNC9xIpTd7nvL"};
    public int A00;
    public Window A01;
    public final View A03;
    public EnumC1830Xw A02 = EnumC1830Xw.A02;
    public final Runnable A04 = new QB(this);

    public ViewOnSystemUiVisibilityChangeListenerC1831Xx(View view) {
        this.A03 = view;
        this.A03.setOnSystemUiVisibilityChangeListener(this);
    }

    private void A00(int i2, boolean z2) {
        if (this.A01 == null) {
            return;
        }
        WindowManager.LayoutParams attributes = this.A01.getAttributes();
        if (z2) {
            attributes.flags |= i2;
        } else {
            int i3 = attributes.flags;
            String[] strArr = A05;
            if (strArr[0].length() != strArr[3].length()) {
                A05[5] = "Y2LIVjWWRefqfkQFwWbZLdxa4m";
                attributes.flags = i3 & (~i2);
            } else {
                String[] strArr2 = A05;
                strArr2[0] = "3EQzEkO0gc";
                strArr2[3] = "SinRvB2gIw";
                attributes.flags = i3 & (~i2);
            }
        }
        Window window = this.A01;
        String[] strArr3 = A05;
        if (strArr3[1].length() != strArr3[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr4 = A05;
        strArr4[1] = "fe0FngUkI8h9c1BO2CK76I";
        strArr4[4] = "nmFu9vDS7iLUjXhy5dSdRg";
        window.setAttributes(attributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02(boolean z2) {
        if (EnumC1830Xw.A02.equals(this.A02)) {
            return;
        }
        int i2 = 3840;
        if (!z2) {
            i2 = 3840 | 7;
        }
        Handler handler = this.A03.getHandler();
        if (handler != null && z2) {
            handler.removeCallbacks(this.A04);
            handler.postDelayed(this.A04, 2000L);
        }
        this.A03.setSystemUiVisibility(i2);
    }

    public final void A03() {
        this.A01 = null;
    }

    public final void A04(Window window) {
        this.A01 = window;
    }

    public final void A05(EnumC1830Xw enumC1830Xw) {
        this.A02 = enumC1830Xw;
        switch (this.A02.ordinal()) {
            case 1:
                A00(67108864, true);
                A00(134217728, true);
                A02(false);
                break;
            default:
                A00(67108864, false);
                A00(134217728, false);
                this.A03.setSystemUiVisibility(0);
                break;
        }
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i2) {
        int diff = this.A00 ^ i2;
        this.A00 = i2;
        if ((diff & 2) != 0) {
            int i3 = i2 & 2;
            if (A05[5].length() != 26) {
                throw new RuntimeException();
            }
            A05[5] = "1GVM4GUQqWgiX1iklRLLb2m9Tx";
            if (i3 == 0) {
                if (A05[5].length() != 26) {
                    A02(true);
                    return;
                }
                String[] strArr = A05;
                strArr[0] = "67GBv9MjXI";
                strArr[3] = "0u8xrudpsw";
                A02(true);
            }
        }
    }
}
