package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class gk extends gt {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2183 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2184 = {'c', 'o', 'm', '.', 'i', 'r', 'n', 's', 'u', 'e', 'a', 'd', 'q', 'l', 't', 'y', 'k', 'I', 'S', 'A', 'Q', 'h', 'f', 'g', 'j'};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2185 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2186 = 5;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2249(int i10, String str, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (j.f2647) {
            try {
                char[] cArr2 = f2184;
                char c4 = f2186;
                char[] cArr3 = new char[i10];
                if (i10 % 2 != 0) {
                    i10--;
                    cArr3[i10] = (char) (cArr[i10] - b10);
                }
                if (i10 > 1) {
                    j.f2654 = 0;
                    while (true) {
                        int i11 = j.f2654;
                        if (i11 >= i10) {
                            break;
                        }
                        j.f2653 = cArr[i11];
                        j.f2650 = cArr[j.f2654 + 1];
                        if (j.f2653 == j.f2650) {
                            cArr3[j.f2654] = (char) (j.f2653 - b10);
                            cArr3[j.f2654 + 1] = (char) (j.f2650 - b10);
                        } else {
                            j.f2652 = j.f2653 / c4;
                            j.f2649 = j.f2653 % c4;
                            j.f2651 = j.f2650 / c4;
                            j.f2648 = j.f2650 % c4;
                            if (j.f2649 == j.f2648) {
                                j.f2652 = f2.A(j.f2652, c4, 1, c4);
                                j.f2651 = f2.A(j.f2651, c4, 1, c4);
                                int i12 = (j.f2652 * c4) + j.f2649;
                                int i13 = (j.f2651 * c4) + j.f2648;
                                int i14 = j.f2654;
                                cArr3[i14] = cArr2[i12];
                                cArr3[i14 + 1] = cArr2[i13];
                            } else if (j.f2652 == j.f2651) {
                                j.f2649 = f2.A(j.f2649, c4, 1, c4);
                                j.f2648 = f2.A(j.f2648, c4, 1, c4);
                                int i15 = (j.f2652 * c4) + j.f2649;
                                int i16 = (j.f2651 * c4) + j.f2648;
                                int i17 = j.f2654;
                                cArr3[i17] = cArr2[i15];
                                cArr3[i17 + 1] = cArr2[i16];
                            } else {
                                int i18 = (j.f2652 * c4) + j.f2648;
                                int i19 = (j.f2651 * c4) + j.f2649;
                                int i20 = j.f2654;
                                cArr3[i20] = cArr2[i18];
                                cArr3[i20 + 1] = cArr2[i19];
                            }
                        }
                        j.f2654 += 2;
                    }
                }
                str2 = new String(cArr3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2240() {
        f2185 = (f2183 + 51) % 128;
        String strIntern = m2249(KeyEvent.getDeadChar(0, 0) + 14, "\u000b\f\u0011\f\u0014\u000b\u0006\u0005\r\u0006\u0013\t\f\b", (byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + InterfaceC0435l1.d.b.f29108e)).intern();
        f2185 = (f2183 + 33) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ｋ */
    public final be mo2241() {
        bd bdVar = new bd(mo2240());
        int i10 = f2185 + InterfaceC0435l1.d.b.f29112i;
        f2183 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 24 / 0;
        }
        return bdVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2242() {
        int minimumFlingVelocity;
        int size;
        int i10 = f2183 + 65;
        f2185 = i10 % 128;
        if (i10 % 2 != 0) {
            minimumFlingVelocity = 73 >>> (ViewConfiguration.getMinimumFlingVelocity() - 42);
            size = 28 << View.MeasureSpec.getSize(0);
        } else {
            minimumFlingVelocity = 51 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            size = 7 - View.MeasureSpec.getSize(0);
        }
        return m2249(minimumFlingVelocity, "\u0001\u0002\u0003\u0004\u0000\t\u0006\u000b\u0006\u0002\t\u0006\u0004\u0005\u0000\r\f\r\u0005\r\u000e\u0003\n\u0013\u0006\f\u0012\u0001\u0006\f\u0012\u0001\u000f\u0007\u0006\u000b\u0010\u0003\t\u0006\u0004\u0005\u0010\u000e\u0017\u0005\u000b\u000e\t\u0013\u0080", (byte) size).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo2243() {
        int i10 = (f2185 + 59) % 128;
        f2183 = i10;
        int i11 = i10 + 3;
        f2185 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 84 / 0;
        }
        return IronSourceAdQuality.class;
    }
}
