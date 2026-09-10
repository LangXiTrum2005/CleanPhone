package com.facebook.ads.redexgen.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class NA extends BroadcastReceiver {
    public static byte[] A04;
    public InterfaceC2496k8 A00;
    public N9 A01;
    public C2300gi A02;
    public String A03;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 17);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{120, 66, 78, 76, 15, 71, 64, 66, 68, 67, 78, 78, 74, 15, 64, 69, 82, 15, 67, 64, 79, 79, 68, 83, 15, 66, 77, 72, 66, 74, 68, 69};
    }

    public NA(C2300gi c2300gi, String str, InterfaceC2496k8 interfaceC2496k8, N9 n9) {
        this.A02 = c2300gi;
        this.A03 = str;
        this.A01 = n9;
        this.A00 = interfaceC2496k8;
    }

    public final void A02() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(A00(1, 31, 48) + A00(0, 1, 83) + this.A03);
        P2.A00(this.A02).A06(this, intentFilter);
    }

    public final void A03() {
        P2.A00(this.A02).A05(this);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        String intentAction = A00(0, 1, 83);
        String[] parts = action.split(intentAction);
        String str = parts[0];
        if (str == null) {
            return;
        }
        String intentAction2 = A00(1, 31, 48);
        if (intentAction2.equals(str)) {
            this.A01.ADC(this.A00);
        }
    }
}
