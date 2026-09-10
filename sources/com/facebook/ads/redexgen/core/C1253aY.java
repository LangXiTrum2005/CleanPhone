package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Handler;
import com.google.android.exoplayer2.scheduler.Requirements;
import com.umeng.analytics.pro.cw;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1253aY {
    public static byte[] A07;
    public static String[] A08 = {"y8awuxZH7V85eGnqmKZy4UMI0amA9OUX", "WmmaIucntF94TrbuZIPt5Z0Mssg2jcDI", "rlAzAFDgytl2jBux6nzB7drJJES9DKtH", "nIgjXkDWnJIqD7e9jqTzTWefF", "yiXiOMzgGydZ", "xfAGS59lgDvx6fVfirMkbNQlhkK4Enx1", "ggohrp7msqZsKEJXPN12owAtUdNAm0", "BpxNKbKcLgAFKY7C3mR1AAHx64CeM2MX"};
    public int A00;
    public C1248aT A01;
    public C1252aX A02;
    public final Context A03;
    public final Handler A04 = AbstractC1600gE.A0Z();
    public final Requirements A05;
    public final InterfaceC1249aU A06;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            int i5 = bArrCopyOfRange[i4] - i3;
            String[] strArr = A08;
            if (strArr[0].charAt(24) == strArr[2].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[7] = "LqIoqSwvFNCw2GbxOUHYxF7uRkPNoYEL";
            strArr2[1] = "veNd9QcIliKEPVUDGu7OgE8bV0WzYJzB";
            bArrCopyOfRange[i4] = (byte) (i5 - 102);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A07 = new byte[]{-24, -11, -21, -7, -10, -16, -21, -75, -16, -11, -5, -20, -11, -5, -75, -24, -22, -5, -16, -10, -11, -75, -56, -54, -37, -48, -42, -43, -26, -41, -42, -34, -52, -39, -26, -54, -42, -43, -43, -52, -54, -37, -52, -53, -14, -1, -11, 3, 0, -6, -11, -65, -6, -1, 5, -10, -1, 5, -65, -14, -12, 5, -6, 0, -1, -65, -46, -44, -27, -38, -32, -33, -16, -31, -32, -24, -42, -29, -16, -43, -38, -28, -44, -32, -33, -33, -42, -44, -27, -42, -43, -57, -44, -54, -40, -43, -49, -54, -108, -49, -44, -38, -53, -44, -38, -108, -57, -55, -38, -49, -43, -44, -108, -86, -85, -68, -81, -87, -85, -59, -71, -70, -75, -72, -89, -83, -85, -59, -78, -75, -67, 37, 50, 40, 54, 51, 45, 40, -14, 45, 50, 56, 41, 50, 56, -14, 37, 39, 56, 45, 51, 50, -14, 8, 9, 26, cw.k, 7, 9, 35, 23, 24, 19, 22, 5, 11, 9, 35, 19, cw.m, 27, 40, 30, 44, 41, 35, 30, -24, 35, 40, 46, 31, 40, 46, -24, 27, 29, 46, 35, 41, 40, -24, cw.k, -3, 12, -1, -1, 8, 25, 9, 0, 0, 0, cw.k, 3, 17, cw.l, 8, 3, -51, 8, cw.k, 19, 4, cw.k, 19, -51, 0, 2, 19, 8, cw.l, cw.k, -51, -14, -30, -15, -28, -28, -19, -2, -18, -19, -9, 4, -6, 8, 5, -1, -6, -60, 4, -5, 10, -60, -7, 5, 4, 4, -60, -39, -27, -28, -28, -37, -39, -22, -33, -20, -33, -22, -17, -11, -39, -34, -41, -28, -35, -37, 52, 65, 55, 69, 66, 60, 55, 1, 66, 70, 1, 52, 54, 71, 60, 66, 65, 1, 23, 24, 41, 28, 22, 24, 50, 28, 23, 31, 24, 50, 32, 34, 23, 24, 50, 22, 27, 20, 33, 26, 24, 23, -7, 5, 4, 4, -5, -7, 10, -1, 12, -1, 10, cw.m};
    }

    static {
        A06();
    }

    public C1253aY(Context context, InterfaceC1249aU interfaceC1249aU, Requirements requirements) {
        this.A03 = context.getApplicationContext();
        this.A06 = interfaceC1249aU;
        this.A05 = requirements;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        int iA07 = this.A05.A07(this.A03);
        int notMetRequirements = this.A00;
        if (notMetRequirements != iA07) {
            this.A00 = iA07;
            this.A06.AEr(this, iA07);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        if ((this.A00 & 3) == 0) {
            return;
        }
        A03();
    }

    private void A05() {
        ConnectivityManager connectivityManager = (ConnectivityManager) AbstractC1517es.A01((ConnectivityManager) this.A03.getSystemService(A02(311, 12, 48)));
        this.A02 = new C1252aX(this);
        connectivityManager.registerDefaultNetworkCallback(this.A02);
    }

    public final int A09() {
        this.A00 = this.A05.A07(this.A03);
        IntentFilter intentFilter = new IntentFilter();
        if (this.A05.A0A()) {
            if (AbstractC1600gE.A02 >= 24) {
                A05();
            } else {
                intentFilter.addAction(A02(233, 36, 48));
            }
        }
        if (this.A05.A08()) {
            String[] strArr = A08;
            if (strArr[6].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[0] = "JabUnNLib9cASGwE1sglXoKROahkggmq";
            strArr2[2] = "D2oTG0W2SzQkebzRZAzHeu5cbPkqKFAN";
            intentFilter.addAction(A02(0, 44, 33));
            intentFilter.addAction(A02(44, 47, 43));
        }
        if (this.A05.A09()) {
            if (AbstractC1600gE.A02 >= 23) {
                intentFilter.addAction(A02(269, 42, 109));
            } else {
                intentFilter.addAction(A02(202, 31, 57));
                intentFilter.addAction(A02(170, 32, 84));
            }
        }
        if (this.A05.A0B()) {
            intentFilter.addAction(A02(91, 40, 0));
            intentFilter.addAction(A02(131, 39, 94));
        }
        this.A01 = new C1248aT(this);
        this.A03.registerReceiver(this.A01, intentFilter, null, this.A04);
        return this.A00;
    }

    public final Requirements A0A() {
        return this.A05;
    }
}
